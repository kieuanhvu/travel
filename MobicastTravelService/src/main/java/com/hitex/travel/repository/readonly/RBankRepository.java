package com.hitex.travel.repository.readonly;

import com.hitex.travel.domain.Bank;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 *
 * @author MaiPH
 */
@ComponentScan(basePackages = {"com.hitex.travel.config.read"})
public interface RBankRepository extends CrudRepository<Bank, String>, QuerydslPredicateExecutor<Bank>{
    @Query("SELECT bank FROM Bank bank")
    List<Bank> getListBank();
}
