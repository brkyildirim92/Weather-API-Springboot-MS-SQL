package org.example.weatherapi.controller;

import org.example.weatherapi.model.Weather;
import org.example.weatherapi.repository.WeatherRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/weather")
public class WeatherController {

    private final WeatherRepository repo;

    public WeatherController(WeatherRepository repo) {
        this.repo = repo;
    }

    // Tüm kayıtlar
    @GetMapping
    public List<Weather> getAll() {
        return repo.findAll();
    }

    // Şehre göre (örn: /api/weather/Istanbul)
    @GetMapping("/{city}")
    public List<Weather> getByCity(@PathVariable("city") String city) {
        return repo.findBySehirIgnoreCase(city);
    }

    // Ekle
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Weather add(@RequestBody Weather weather) {
        return repo.save(weather);
    }

    // Güncelle
    @PutMapping("/{id}")
    public Weather update(@PathVariable Long id, @RequestBody Weather newWeather) {
        return repo.findById(id).map(w -> {
            w.setSehir(newWeather.getSehir());
            w.setSicaklik(newWeather.getSicaklik());
            w.setNem(newWeather.getNem());
            w.setHavadurumu(newWeather.getHavadurumu());
            w.setTarih(newWeather.getTarih());
            return repo.save(w);
        }).orElseThrow(() -> new RuntimeException("Kayıt bulunamadı: " + id));
    }

    // Sil
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        repo.deleteById(id);
    }
}
