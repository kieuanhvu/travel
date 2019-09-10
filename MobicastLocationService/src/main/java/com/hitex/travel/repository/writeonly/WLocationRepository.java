package com.hitex.travel.repository.writeonly;

import com.hitex.travel.domain.Location;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

@ComponentScan(basePackages = {"com.hitex.travel.config.write"})
public interface WLocationRepository extends CrudRepository<Location, String>, QuerydslPredicateExecutor<Location> {
}
