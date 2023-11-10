package com.example.routeBook.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.routeBook.entity.Route;

public interface RouteRepository extends JpaRepository<Route,Integer> {

}
