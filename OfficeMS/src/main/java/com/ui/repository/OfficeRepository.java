package com.ui.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.ui.entity.Office;

@Repository
public interface OfficeRepository extends CrudRepository<Office, Integer>,PagingAndSortingRepository<Office, Integer>{

}
