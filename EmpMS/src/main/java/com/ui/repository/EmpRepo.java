package com.ui.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ui.entity.Empolyee;

@Repository
public interface EmpRepo extends CrudRepository<Empolyee, Integer>{

}
