package com.hitex.travel.repository.readonly;

import com.hitex.travel.domain.Tour;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RTourRepository extends CrudRepository<Tour, String>, QuerydslPredicateExecutor<Tour> {
    @Query("SELECT tour FROM Tour tour")
    List<Tour> getListTour();
}