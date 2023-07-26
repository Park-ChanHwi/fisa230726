package com.fisa.model.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.fisa.model.domain.entity.Day;

@Repository
public interface DayRepository extends CrudRepository<Day, Integer> {

}
