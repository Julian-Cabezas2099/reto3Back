package com.Reto3.springboot.app.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Reto3.springboot.app.CrudRepository.ReservationCrudRepository;
import com.Reto3.springboot.app.Models.entities.Reservation;

@Repository
public class ReservationRepository {

	 @Autowired
	    private ReservationCrudRepository reservationR;

	    public List<Reservation> getAll(){
	        return (List<Reservation>) reservationR.findAll();
	    }
	    public Optional<Reservation> getReservation(int id){
	        return reservationR.findById(id);
	    }
	    public Reservation save(Reservation reservation){
	        return reservationR.save(reservation);
	    }
	    public void delete(Reservation reservation){
	    	reservationR.delete(reservation);
	    }
  //Implementacion de consulta Between
	    public List<Reservation> reporteFechas(Date date1, Date date2){
	    	  return (List<Reservation>) reservationR.findByStartDateBetween(date1, date2);
	    }
	    //implementacion contador de completed y cancelled
	    public List<Reservation> counStatus(){
	    	return (List<Reservation>) reservationR.findCountS();
	    }
}
