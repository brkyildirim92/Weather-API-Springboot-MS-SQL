<img width="1827" height="923" alt="PostmanAPIClientSS" src="https://github.com/user-attachments/assets/d986c6a0-afd8-4a05-8258-f470c494086f" />


\# 🌦️ Weather API

Spring Boot ve MS SQL kullanılarak geliştirilmiş basit bir \*\*REST API\*\* projesi.  

Amaç: Şehir bazlı hava durumu verilerini veritabanında tutmak ve CRUD (Create, Read, Update, Delete) işlemleri yapmak.

---

\## 🚀 Özellikler

\- Java 8 + Spring Boot (v2.7.18)

\- MSSQL veritabanı bağlantısı (Hibernate + JPA)

\- RESTful CRUD endpointleri

\- Postman collection hazır (istekleri test etmek için)

\- Katmanlı mimari (Controller, Repository, Model)

---

\## ⚙️ Kurulum

\- Java 8  

\- Maven  

\- MS SQL Server  


\### Çalıştırma

```bash
git clone https://github.com/kullaniciadi/weather-api-springboot-mssql.git
cd weather-api-springboot-mssql

\# Maven ile build et
mvn clean install

\# Spring Boot uygulamasını başlat
mvn spring-boot:run

NOT: Uygulama varsayılan olarak http://localhost:8080 üzerinde çalışır.

\#API EndPointleri
| HTTP Metodu | Endpoint              | Açıklama                            |

| ----------- | --------------------- | ----------------------------------- |

| GET         | /api/weather        | Tüm hava durumu kayıtlarını getirir |

| GET         | /api/weather/{city} | Şehre göre filtreleme yapar         |

| POST        | /api/weather        | Yeni kayıt ekler                    |

| PUT         | /api/weather/{id}   | ID’ye göre kaydı günceller          |

| DELETE      | /api/weather/{id}   | ID’ye göre kaydı siler              |


\#👨‍💻 Geliştirici
Burak \[github.com/brkyildirim92]

Spring Boot öğrenme sürecinde geliştirilmiş bir portföy projesidir.
