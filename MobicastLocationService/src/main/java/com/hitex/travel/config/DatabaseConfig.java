package com.hitex.travel.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 *
 * @author MaiPH
 */
@Configuration
@Getter
public class DatabaseConfig {
     
    @Value("${application.database.driverName}")
    private String driverName;
    
    @Value("${application.database.read.url}")
    private String readUri;
    
    @Value("${application.database.read.username}")
    private String readUsername;
    
    @Value("${application.database.read.password}")
    private String readPassword;
    
    @Value("${application.database.read.IdleConnectionTestPeriodInMinutes}")
    private int readIdleConnectionTestPeriodInMinutes;
    
    @Value("${application.database.read.PoolAvailabilityThreshold}")
    private int readPoolAvailabilityThreshold;
    
    @Value("${application.database.read.MaxConnectionsPerPartition}")
    private int readMaxConnectionsPerPartition;
    
    @Value("${application.database.read.MinConnectionsPerPartition}")
    private int readMinConnectionsPerPartition;
    
    @Value("${application.database.read.PartitionCount}")
    private int readPartitionCount;
    
    @Value("${application.database.read.AcquireIncrement}")
    private int readAcquireIncrement;
    
    @Value("${application.database.read.StatementsCacheSize}")
    private int readStatementsCacheSize;
    
    @Value("${application.database.read.ReleaseHelperThreads}")
    private int readReleaseHelperThreads;
    
    @Value("${application.database.read.ConnectionTestStatement}")
    private String readConnectionTestStatement;
    
    // write
    @Value("${application.database.write.url}")
    private String writeUri;
    
    @Value("${application.database.write.username}")
    private String writeUsername;
    
    @Value("${application.database.write.password}")
    private String writePassword;
    
    @Value("${application.database.write.IdleConnectionTestPeriodInMinutes}")
    private int writeIdleConnectionTestPeriodInMinutes;
    
    @Value("${application.database.write.PoolAvailabilityThreshold}")
    private int writePoolAvailabilityThreshold;
    
    @Value("${application.database.write.MaxConnectionsPerPartition}")
    private int writeMaxConnectionsPerPartition;
    
    @Value("${application.database.write.MinConnectionsPerPartition}")
    private int writeMinConnectionsPerPartition;
    
    @Value("${application.database.write.PartitionCount}")
    private int writePartitionCount;
    
    @Value("${application.database.write.AcquireIncrement}")
    private int writeAcquireIncrement;
    
    @Value("${application.database.write.StatementsCacheSize}")
    private int writeStatementsCacheSize;
    
    @Value("${application.database.write.ReleaseHelperThreads}")
    private int writeReleaseHelperThreads;
    
    @Value("${application.database.write.ConnectionTestStatement}")
    private String writeConnectionTestStatement;
}
