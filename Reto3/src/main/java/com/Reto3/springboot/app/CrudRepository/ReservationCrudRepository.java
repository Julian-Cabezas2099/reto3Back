package com.Reto3.springboot.app.CrudRepository;

import org.springframework.data.repository.CrudRepository;

import com.Reto3.springboot.app.Models.entities.Reservation;

public interface ReservationCrudRepository extends CrudRepository<Reservation, Integer>{

	/*@Query("Select count(status) as 'completed' from reservation where status='completed' Group by status UNION select count(status) as 'cancelled' from reservation where status='cancelled' group by status;")
	public List<Reservation> findCountS();*/
	
	public List<Reservation> findByStartDateBetween(Date startDate, Date devolutionDate);

}
