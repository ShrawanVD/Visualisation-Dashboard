package com.springboot.dashboard.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.dashboard.Entity.DataEntity;
import com.springboot.dashboard.Repository.DataRepository;
import com.springboot.dashboard.Service.DataService;
import com.springboot.dashboard.Service.DataServiceImpl;

@RestController
public class DataController {

	@Autowired
	private DataService dataService;

	@GetMapping("/get")
	public ResponseEntity<List<DataEntity>> getAllData() {
		try {
			List<DataEntity> dataList = this.dataService.getAllData();
			return new ResponseEntity<>(dataList, HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@GetMapping("/get/{id}")
	public DataEntity getSingleData(@PathVariable String id) {
		return dataService.getSingleData(Integer.parseInt(id));
	}

	@PostMapping("/add")
	public ResponseEntity<DataEntity> addData(@RequestBody DataEntity entity) {
		try {
			this.dataService.addData(entity);
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@PutMapping("/update")
	public ResponseEntity<DataEntity> updateData(@RequestBody DataEntity entity) {
		try {
			this.dataService.updateData(entity);
			return new ResponseEntity<>(HttpStatus.OK);

		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<DataEntity> deleteData(@PathVariable String id) {
		try {
			int dataId = Integer.parseInt(id);
			this.dataService.deleteData(dataId);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}

	// -------------------- filter operations -----------------------------

	// end year filter
	@GetMapping("/getByEndyear/{endYear}")
	public List<DataEntity> getByEndYear(@PathVariable String endYear) {
		int year = Integer.parseInt(endYear);
		return dataService.getDataByEndYear(year);
	}

	// start year filter
	@GetMapping("/getByStartyear/{startYear}")
	public List<DataEntity> getByStartYear(@PathVariable String startYear) {
		int year = Integer.parseInt(startYear);
		return dataService.getDataByStartYear(year);
	}

	// topics filter
	@GetMapping("/getDataByTopic/{topicName}")
	public List<DataEntity> getByTopic(@PathVariable String topicName) {
		return dataService.getDataByTopics(topicName);
	}

	// sector filter
	@GetMapping("/getDataBySector/{sectorName}")
	public List<DataEntity> getBySector(@PathVariable String sectorName) {
		return dataService.getDataBySector(sectorName);
	}

	// region filter
	@GetMapping("/getDataByRegion/{regionName}")
	public List<DataEntity> getByRegion(@PathVariable String regionName) {
		return dataService.getDataByRegion(regionName);
	}

	// pestle filter
	@GetMapping("/getDataByPestle/{pestleName}")
	public List<DataEntity> getByPestle(@PathVariable String pestleName) {
		return dataService.getDataByPestle(pestleName);
	}

	// source filter
	@GetMapping("/getDataBySource/{sourceName}")
	public List<DataEntity> getBySource(@PathVariable String sourceName) {
		return dataService.getDataBySource(sourceName);
	}

	// swot filter
	@GetMapping("/getDataBySwot/{swotName}")
	public List<DataEntity> getBySwot(@PathVariable String swotName) {
		return dataService.getDataBySwot(swotName);
	}

	// country filter
	@GetMapping("/getDataByCountry/{countryName}")
	public List<DataEntity> getByCountry(@PathVariable String countryName) {
		return dataService.getDataByCountry(countryName);
	}

	// city filter
	
	// using native query method
	@RequestMapping("/getDataUsingNativeQuery/{cityName}")
	public List<DataEntity> getCity(@PathVariable String cityName){
		return dataService.getDataCity(cityName);
	}
	
//	@GetMapping("/getDataByCity/{cityName}")
//	public List<DataEntity> getByCity(@PathVariable String cityName) {
//		return dataService.getDataByCity(cityName);
//	}

}
