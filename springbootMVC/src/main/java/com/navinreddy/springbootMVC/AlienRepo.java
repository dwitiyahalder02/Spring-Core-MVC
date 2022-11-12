package com.navinreddy.springbootMVC;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.navinreddy.springbootMVC.Model.Alien;

public interface AlienRepo extends JpaRepository<Alien,Integer> {

	List<Alien> findByAname(String aname);//query dsl

	
}
