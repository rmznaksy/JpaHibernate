package com.example.Business;

import java.util.List;

import com.example.entities.City;

public interface ICityService {

	List<City> getAll();

	void add(City city);

	void update(City city);

	void delete(City city);
	
	City getById(int id);

}
