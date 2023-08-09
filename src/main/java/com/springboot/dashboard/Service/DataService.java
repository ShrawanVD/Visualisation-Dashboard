package com.springboot.dashboard.Service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.springboot.dashboard.Entity.DataEntity;


public interface DataService {
	
	// CRUD operation
	public List<DataEntity> getAllData();
	public DataEntity getSingleData(int id);
	public DataEntity addData(DataEntity entity);
	public DataEntity updateData(DataEntity entity);
	public void deleteData(int id);
	
	// filter
	public List<DataEntity> getDataByEndYear(int id);
	public List<DataEntity> getDataByStartYear(int id);
	public List<DataEntity> getDataByTopics(String topic);
	public List<DataEntity> getDataBySector(String sector);
	public List<DataEntity> getDataByRegion(String region);
	public List<DataEntity> getDataByPestle(String pestle);
	public List<DataEntity> getDataBySource(String source);
	public List<DataEntity> getDataBySwot(String swot);
	public List<DataEntity> getDataByCountry(String country);
//	public List<DataEntity> getDataByCity(String city);
	
	// filter using @Query annotation - native query
	public List<DataEntity> getDataCity(String city);
	
}
	