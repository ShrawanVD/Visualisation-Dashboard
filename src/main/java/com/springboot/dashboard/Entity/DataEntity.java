package com.springboot.dashboard.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "excelsheetdata")
public class DataEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "SrNO")
	private Integer srNo;
	
	@Column(name = "end_year")
	private Integer end_year;
	
	@Column(name = "citylng")
	private Double citylng;
	
	@Column(name = "citylat")
	private Double citylat;	
	
	@Column(name = "intensity")
	private Integer intensity;	
	
	@Column(name = "sector")
	private String sector;	
	
	@Column(name = "topic")
	private String topic;	
	
	@Column(name = "insight")
	private String insight;	
	
	@Column(name = "swot")
	private String swot;	
	
	@Column(name = "url")
	private String url;	
	
	@Column(name = "region")
	private String region;	
	
	@Column(name = "start_year")
	private Integer start_year;	
	
	@Column(name = "impact")
	private Integer impact;	
	
	@Column(name = "added")
	private String added;	
	
	@Column(name = "published")
	private String published;	
	
	@Column(name = "city")
	private String city;	
	
	@Column(name = "country")
	private String country;	
	
	@Column(name = "relevance")
	private Integer relevance;	
	
	@Column(name = "pestle")
	private String pestle;	
	
	@Column(name = "source")
	private String source;	
	
	@Column(name = "title")
	private String title;	
	
	@Column(name = "likelihood")
	private Integer likelihood;
	
	
public DataEntity() {
		
	}
	
	
	
	public Integer getSrNo() {
		return srNo;
	}



	public void setSrNo(Integer srNo) {
		this.srNo = srNo;
	}



	public Integer getEnd_year() {
		return end_year;
	}



	public void setEnd_year(Integer end_year) {
		this.end_year = end_year;
	}



	public Double getCitylng() {
		return citylng;
	}



	public void setCitylng(Double citylng) {
		this.citylng = citylng;
	}



	public Double getCitylat() {
		return citylat;
	}



	public void setCitylat(Double citylat) {
		this.citylat = citylat;
	}



	public Integer getIntensity() {
		return intensity;
	}



	public void setIntensity(Integer intensity) {
		this.intensity = intensity;
	}



	public String getSector() {
		return sector;
	}



	public void setSector(String sector) {
		this.sector = sector;
	}



	public String getTopic() {
		return topic;
	}



	public void setTopic(String topic) {
		this.topic = topic;
	}



	public String getInsight() {
		return insight;
	}



	public void setInsight(String insight) {
		this.insight = insight;
	}



	public String getSwot() {
		return swot;
	}



	public void setSwot(String swot) {
		this.swot = swot;
	}



	public String getUrl() {
		return url;
	}



	public void setUrl(String url) {
		this.url = url;
	}



	public String getRegion() {
		return region;
	}



	public void setRegion(String region) {
		this.region = region;
	}



	public Integer getStart_year() {
		return start_year;
	}



	public void setStart_year(Integer start_year) {
		this.start_year = start_year;
	}



	public Integer getImpact() {
		return impact;
	}



	public void setImpact(Integer impact) {
		this.impact = impact;
	}



	public String getAdded() {
		return added;
	}



	public void setAdded(String added) {
		this.added = added;
	}



	public String getPublished() {
		return published;
	}



	public void setPublished(String published) {
		this.published = published;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getCountry() {
		return country;
	}



	public void setCountry(String country) {
		this.country = country;
	}



	public Integer getRelevance() {
		return relevance;
	}



	public void setRelevance(Integer relevance) {
		this.relevance = relevance;
	}



	public String getPestle() {
		return pestle;
	}



	public void setPestle(String pestle) {
		this.pestle = pestle;
	}



	public String getSource() {
		return source;
	}



	public void setSource(String source) {
		this.source = source;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public Integer getLikelihood() {
		return likelihood;
	}



	public void setLikelihood(Integer likelihood) {
		this.likelihood = likelihood;
	}



	public DataEntity(Integer srNo, Integer end_year, Double citylng, Double citylat, Integer intensity,
			String sector, String topic, String insight, String swot, String url, String region, Integer start_year,
			Integer impact, String added, String published, String city, String country, Integer relevance,
			String pestle, String source, String title, Integer likelihood) {
		super();
		this.srNo = srNo;
		this.end_year = end_year;
		this.citylng = citylng;
		this.citylat = citylat;
		this.intensity = intensity;
		this.sector = sector;
		this.topic = topic;
		this.insight = insight;
		this.swot = swot;
		this.url = url;
		this.region = region;
		this.start_year = start_year;
		this.impact = impact;
		this.added = added;
		this.published = published;
		this.city = city;
		this.country = country;
		this.relevance = relevance;
		this.pestle = pestle;
		this.source = source;
		this.title = title;
		this.likelihood = likelihood;
	}

}
