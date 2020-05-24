package com.apjp.backend.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apjp.backend.Entity.TimeMasterEntity;

@Repository
public interface TimeRepository extends CrudRepository<TimeMasterEntity,Long>  {

}
