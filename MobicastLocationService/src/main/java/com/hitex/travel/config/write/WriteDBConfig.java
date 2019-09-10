package com.hitex.travel.config.write;

import com.hitex.travel.config.DatabaseConfig;
import com.jolbox.bonecp.BoneCPDataSource;
import javax.persistence.EntityManagerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

/**
 *
 * @author MaiPH
 */
@Configuration
@ComponentScan
public class WriteDBConfig {

    @Autowired
    DatabaseConfig config;

    @Bean("write_data_source_travel_service")
    public BoneCPDataSource boneCPDataSource() {

        String username = config.getWriteUsername();
        String password = config.getWritePassword();
        BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
        boneCPDataSource.setDriverClass(config.getDriverName());
        boneCPDataSource.setJdbcUrl(config.getWriteUri());
        boneCPDataSource.setUsername(config.getWriteUsername());
        boneCPDataSource.setPassword(config.getWritePassword());
        boneCPDataSource.setIdleConnectionTestPeriodInMinutes(config.getWriteIdleConnectionTestPeriodInMinutes());
        boneCPDataSource.setIdleMaxAgeInMinutes(config.getWriteIdleConnectionTestPeriodInMinutes());
        boneCPDataSource.setPoolAvailabilityThreshold(config.getWritePoolAvailabilityThreshold());
        boneCPDataSource.setMaxConnectionsPerPartition(config.getWriteMaxConnectionsPerPartition());
        boneCPDataSource.setMinConnectionsPerPartition(config.getWriteMinConnectionsPerPartition());
        boneCPDataSource.setPartitionCount(config.getWritePartitionCount());
        boneCPDataSource.setAcquireIncrement(config.getWriteAcquireIncrement());
        boneCPDataSource.setStatementsCacheSize(config.getWriteStatementsCacheSize());
        boneCPDataSource.setReleaseHelperThreads(config.getWriteReleaseHelperThreads());
        boneCPDataSource.setConnectionTestStatement(config.getWriteConnectionTestStatement());
        return boneCPDataSource;
    }

    @Bean("entityManagerFactoryW")
    public EntityManagerFactory entityManagerFactory(@Qualifier("write_data_source_travel_service") BoneCPDataSource BoneCPDataSource) {
        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(false);
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.hitex.travel.domain");
        factory.setDataSource(BoneCPDataSource);
        factory.afterPropertiesSet();
        return factory.getObject();
    }

    @Bean("transactionManagerW")
    public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactoryW") EntityManagerFactory EntityManagerFactory) {

        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(EntityManagerFactory);
        return txManager;
    }
}
