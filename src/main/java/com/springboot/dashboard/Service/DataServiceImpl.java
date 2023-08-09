package com.springboot.dashboard.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.springboot.dashboard.Entity.DataEntity;
import com.springboot.dashboard.Repository.DataRepository;

import jakarta.annotation.PostConstruct;

@Service
public class DataServiceImpl implements DataService{
	
	@Autowired
	private DataRepository dataRepository;
	
	private List<DataEntity> entityList;
	
	
	// Fetch all data from the database and store in entityList
	@PostConstruct
	public void init() {
		getAll();
	}

	public void getAll(){
		entityList = dataRepository.findAll();
	}
	
	// -------------------------------------- CRUD OPERATIONS -------------------------------
	
	@Override
	public List<DataEntity> getAllData() {
		return dataRepository.findAll();
	}
	
	@Override
	public DataEntity getSingleData(int id) {
		Optional<DataEntity> data = dataRepository.findById(id);
		DataEntity entity = null;
		if(data.isPresent()){
			entity = data.get();
		}
		return entity;
	}
	
	@Override
	public DataEntity addData(DataEntity entity) {
		return dataRepository.save(entity);
	}
	
	@Override
	public DataEntity updateData(DataEntity entity) {
		return dataRepository.save(entity);
	}
	
	@Override
	public void deleteData(int id) {
		Optional<DataEntity> data = dataRepository.findById(id);
		DataEntity entity = null;
		if(data.isPresent()) {
			entity = data.get();
		}
		dataRepository.delete(entity);
	}
	
	
	
	
	// -------------------- FILTER OPERATIONS ------------------------
	
	
	// end-year filter
	@Override
	public List<DataEntity> getDataByEndYear(int id) {
		entityList.clear();
		getAll();
		List<DataEntity> list = new ArrayList<>();
		for (DataEntity dataEntity : entityList) {
			if(dataEntity.getEnd_year().equals(id)) {
				list.add(dataEntity);
			}
		}
		return list;
	}
	
	// start year filter
	@Override
	public List<DataEntity> getDataByStartYear(int id) {
		entityList.clear();;
		getAll();
		List<DataEntity> list = new ArrayList<>();
		for (DataEntity dataEntity : entityList) {
			if(dataEntity.getStart_year().equals(id)) {
				list.add(dataEntity);
			}
		}
		return list;
	}
	
	// topics filter
	@Override
	public List<DataEntity> getDataByTopics(String topic) {
		entityList.clear();
		getAll();
		List<DataEntity> list = new ArrayList<>();
		for (DataEntity dataEntity : entityList) {
			if(dataEntity.getTopic().equals(topic)) {
				list.add(dataEntity);
			}
		}
		return list;
	}

	
	
	
	
	
	// sector filter
	@Override
	public List<DataEntity> getDataBySector(String sector) {
		entityList.clear();
		getAll();
		List<DataEntity> list = new ArrayList<>();
		for (DataEntity dataEntity : entityList) {
			if(dataEntity.getSector().equals(sector)) {
				list.add(dataEntity);
			}
		}
		return list;
	}

	
	// region filter
	@Override
	public List<DataEntity> getDataByRegion(String region) {
		entityList.clear();
		getAll();
		List<DataEntity> list = new ArrayList<>();
		for (DataEntity dataEntity : entityList) {
			if(dataEntity.getRegion().equals(region)) {
				list.add(dataEntity);
			}
		}
		return list;
	}

	
	// pestle filter
	@Override
	public List<DataEntity> getDataByPestle(String pestle) {
		entityList.clear();
		getAll();
		List<DataEntity> list = new ArrayList<>();
		for (DataEntity dataEntity : entityList) {
			if(dataEntity.getPestle().equals(pestle)) {
				list.add(dataEntity);
			}
		}
		return list;
	}

	
	// source filter
	@Override
	public List<DataEntity> getDataBySource(String source) {
		entityList.clear();
		getAll();
		List<DataEntity> list = new ArrayList<>();
		for (DataEntity dataEntity : entityList) {
			if(dataEntity.getSource().equals(source)) {
				list.add(dataEntity);
			}
		}
		return list;
	}

	
	// swot filter
	@Override
	public List<DataEntity> getDataBySwot(String swot) {
		entityList.clear();
		getAll();
		List<DataEntity> list = new ArrayList<>();
		for (DataEntity dataEntity : entityList) {
			if(dataEntity.getSwot().equals(swot)) {
				list.add(dataEntity);
			}
		}
		return list;
	}

	
	// country filter
	@Override
	public List<DataEntity> getDataByCountry(String country) {
		entityList.clear();
		getAll();
		List<DataEntity> list = new ArrayList<>();
		for (DataEntity dataEntity : entityList) {
			if(dataEntity.getCountry().equals(country)) {
				list.add(dataEntity);
			}
		}
		return list;
	}

	
	// city filter
	
	// using native sql query
	
	@Override
	public List<DataEntity> getDataCity(String city) {
		return dataRepository.getDataCity(city);
	}
	
	
	
	// ------------- this is general method for filteration -------------------
	
//	@Override
//	public List<DataEntity> getDataByCity(String city) {
//		entityList.clear();
//		getAll();
//		List<DataEntity> list = new ArrayList<>();
//		for (DataEntity dataEntity : entityList) {
//			if(dataEntity.getCity().equals(city)) {
//				list.add(dataEntity);
//			}
//		}
//		return list;
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}






































