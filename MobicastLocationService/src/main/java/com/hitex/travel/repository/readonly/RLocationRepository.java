package com.hitex.travel.repository.readonly;

import com.hitex.travel.domain.Location;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@ComponentScan(basePackages = {"com.hitex.travel.config.read"})
public interface RLocationRepository extends CrudRepository<Location, String>, QuerydslPredicateExecutor<Location> {
    @Query("SELECT loc FROM Location loc")
    List<Location> getListLocation();
}
