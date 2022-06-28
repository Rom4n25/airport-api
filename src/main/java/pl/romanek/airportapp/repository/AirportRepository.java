package pl.romanek.airportapp.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.romanek.airportapp.dto.Airport;

@Repository
public interface AirportRepository extends JpaRepository<Airport, String> {

    List<Airport> findAllByCity(String city);
}
