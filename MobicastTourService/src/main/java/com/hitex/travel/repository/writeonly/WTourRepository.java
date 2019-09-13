package com.hitex.travel.repository.writeonly;

import com.hitex.travel.domain.Tour;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface WTourRepository extends CrudRepository<Tour, String>, QuerydslPredicateExecutor<Tour> {
}
