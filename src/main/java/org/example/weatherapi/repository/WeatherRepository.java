package org.example.weatherapi.repository;

import org.example.weatherapi.model.Weather;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface WeatherRepository extends JpaRepository<Weather, Long> {
    List<Weather> findBySehirIgnoreCase(String sehir);
}
