package com.hitex.travel.repository.writeonly;

import com.hitex.travel.domain.Bank;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author MaiPH
 */
@ComponentScan(basePackages = {"com.hitex.travel.config.write"})
public interface WBankRepository extends CrudRepository<Bank, String>, QuerydslPredicateExecutor<Bank> {
    
}
