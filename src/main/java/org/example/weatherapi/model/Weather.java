package org.example.weatherapi.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "HavaDurumu")
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    // DB'de kolon adı Türkçe: "şehir"
    @Column(name = "Şehir")
    private String sehir;

    // "sıcaklık"
    @Column(name = "Sıcaklık")
    private Double sicaklik;

    // "nem"
    @Column(name = "Nem")
    private Integer nem;

    // "havadurumu"
    @Column(name = "HavaDurumu")
    private String havadurumu;

    // "tarih" (date veya datetime olabilir)
    @Column(name = "Tarih")
    private LocalDate tarih;

    // --- Getter/Setter ---

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSehir() { return sehir; }
    public void setSehir(String sehir) { this.sehir = sehir; }

    public Double getSicaklik() { return sicaklik; }
    public void setSicaklik(Double sicaklik) { this.sicaklik = sicaklik; }

    public Integer getNem() { return nem; }
    public void setNem(Integer nem) { this.nem = nem; }

    public String getHavadurumu() { return havadurumu; }
    public void setHavadurumu(String havadurumu) { this.havadurumu = havadurumu; }

    public LocalDate getTarih() { return tarih; }
    public void setTarih(LocalDate tarih) { this.tarih = tarih; }
}
