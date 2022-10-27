package com.vickysingh.dashboard.repository;

import org.springframework.data.repository.CrudRepository;
import com.vickysingh.dashboard.entity.Visitor;

public interface VisitorRepository extends CrudRepository<Visitor, Long> {

}

