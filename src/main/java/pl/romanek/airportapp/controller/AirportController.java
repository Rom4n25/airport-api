package pl.romanek.airportapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import pl.romanek.airportapp.dto.Airport;
import pl.romanek.airportapp.service.AirportService;

@RestController
public class AirportController {
    
    AirportService airportService;
    
    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }
 
    @CrossOrigin
    @GetMapping("/name/{city}")
    public List<Airport> getByCityName(@PathVariable("city") String city){

        return airportService.getByCityName(city);
    }




}
