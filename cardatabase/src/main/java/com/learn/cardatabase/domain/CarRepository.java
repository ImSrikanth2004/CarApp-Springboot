package com.learn.cardatabase.domain;
//import java.util.List;

//import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
//import org.springframework.data.repository.PagingAndSortingRepository;

@RepositoryRestResource(path="cars")
public interface CarRepository extends CrudRepository<Car, Long> { }

//public interface CarRepository extends PagingAndSortingRepository<Car, Long>{
//	//Fetch Cars by brand
//	@Query("select c from Car c where c.brand=?1")
//	List<Car> findByBrand(String brand);
//	
//	//Fetch Cars by brand using SQL
//	@Query("select c from Car c where c.brand like %?1")
//	List<Car> findByBrandEndsWith(String brand);
//	
//	//Fetch cars by color
//	List<Car> findByColor(String brand);
//	
//	//Fetch Cars by model Year
//	List<Car> findByModelYear(String brand);
//	
//	//Fetch Cars by brand and model
//	List<Car> findByBrandAndModel(String brand, String model);
//	
//	//Fetch Cars by brand or color
//	List<Car> findByBrandOrColor(String brand, String color);
//	
//	//Fetch Cars by brand and sort by year
//	List<Car> findByBrandOrderByModelYearAsc(String brand);
//}
