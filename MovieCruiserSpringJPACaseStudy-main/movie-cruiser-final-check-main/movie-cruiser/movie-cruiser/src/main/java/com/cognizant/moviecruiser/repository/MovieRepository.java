package com.cognizant.moviecruiser.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cognizant.moviecruiser.model.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {


	public List<Movie> findByActiveAndDateOfLaunchBefore(boolean active, Date date);

}
