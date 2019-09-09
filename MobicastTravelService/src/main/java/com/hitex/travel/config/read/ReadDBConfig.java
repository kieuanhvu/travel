package com.hitex.travel.config.read;

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

@Configuration
@ComponentScan
public class ReadDBConfig {

    @Autowired
    DatabaseConfig config;
    
    // 
    @Bean("read_data_source_travel_service")
    public BoneCPDataSource boneCPDataSource() {

        String username = config.getReadUsername();
        String password = config.getReadPassword();
        BoneCPDataSource boneCPDataSource = new BoneCPDataSource();
        boneCPDataSource.setDriverClass(config.getDriverName());
        boneCPDataSource.setJdbcUrl(config.getReadUri());
        boneCPDataSource.setUsername(config.getReadUsername());
        boneCPDataSource.setPassword(config.getReadPassword());
        boneCPDataSource.setIdleConnectionTestPeriodInMinutes(config.getReadIdleConnectionTestPeriodInMinutes());
        boneCPDataSource.setIdleMaxAgeInMinutes(config.getReadIdleConnectionTestPeriodInMinutes());
        boneCPDataSource.setPoolAvailabilityThreshold(config.getReadPoolAvailabilityThreshold());
        boneCPDataSource.setMaxConnectionsPerPartition(config.getReadMaxConnectionsPerPartition());
        boneCPDataSource.setMinConnectionsPerPartition(config.getReadMinConnectionsPerPartition());
        boneCPDataSource.setPartitionCount(config.getReadPartitionCount());
        boneCPDataSource.setAcquireIncrement(config.getReadAcquireIncrement());
        boneCPDataSource.setStatementsCacheSize(config.getReadStatementsCacheSize());
        boneCPDataSource.setReleaseHelperThreads(config.getReadReleaseHelperThreads());
        boneCPDataSource.setConnectionTestStatement(config.getReadConnectionTestStatement());
        return boneCPDataSource;

    }

    @Bean("entityManagerFactory")
    public EntityManagerFactory entityManagerFactory(@Qualifier("read_data_source_travel_service") BoneCPDataSource BoneCPDataSource) {

        HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
        vendorAdapter.setGenerateDdl(false);

        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        factory.setJpaVendorAdapter(vendorAdapter);
        factory.setPackagesToScan("com.hitex.travel.domain");
        factory.setDataSource(BoneCPDataSource);
        factory.afterPropertiesSet();

        return factory.getObject();
    }

    @Bean("transactionManager")
    public PlatformTransactionManager transactionManager(@Qualifier("entityManagerFactory") EntityManagerFactory EntityManagerFactory) {

        JpaTransactionManager txManager = new JpaTransactionManager();
        txManager.setEntityManagerFactory(EntityManagerFactory);
        return txManager;
    }
}
