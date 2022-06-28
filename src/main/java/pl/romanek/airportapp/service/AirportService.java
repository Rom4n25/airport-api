package pl.romanek.airportapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pl.romanek.airportapp.dto.Airport;
import pl.romanek.airportapp.repository.AirportRepository;

@Service
public class AirportService {

AirportRepository airportRepository;
    
    @Autowired
    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public List<Airport> getByCityName (String city){
        return airportRepository.findAllByCity(city);
    }
}
