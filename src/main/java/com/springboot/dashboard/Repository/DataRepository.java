package com.springboot.dashboard.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.springboot.dashboard.Entity.DataEntity;

public interface DataRepository extends JpaRepository<DataEntity, Integer>{

	// using native query language to perfom custom queries (different that the traditonal approached)
	@Query(value = "select * from excelsheetdata where city = ?1", nativeQuery = true)
	public List<DataEntity> getDataCity(String city);
	
}
