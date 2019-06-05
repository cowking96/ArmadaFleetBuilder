package com.Cowking.ArmadaFleetBuilder.dao;

import com.Cowking.ArmadaFleetBuilder.Model.Card;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CardRepository extends CrudRepository<Card,Long>, QuerydslPredicateExecutor<Card> {
}
