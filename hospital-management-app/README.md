# Create the Spring boot application using :
```
https://start.spring.io/
```
# Build the project :
```
mvn clean install
```
# Run the app
```
docker-compose -f docker-compose-mongo.yml up -d
mvn spring-boot:run
docker-compose -f docker-compose-mongo.yml down

```
# Doctor Controller

# POST
```
curl --location --request POST 'localhost:8080/doctor/save' \
--header 'Authorization: Basic ZG9jdG9yMTIzOnBhc3N3b3Jk' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=F6832B9D3A11E8D39082DDAE727F6776' \
--data-raw '{
        "appointmentId": "103",
        "patientName": "Mona",
        "doctorName": "doc3",
        "date": "12th feb",
        "prescription": {
            "prescriptionId": "pres1",
            "appointmentId": "103",
            "description": "Asthama ",
            "patientName": "Mona",
            "doctorName": "doc3"
        }
        
}'
```
# GET
```
curl --location --request GET 'localhost:8080/doctor/doctorappointment?doctorName=doc3' \
--header 'Authorization: Basic ZG9jdG9yMTIzOnBhc3N3b3Jk' \
--header 'Cookie: JSESSIONID=E0C20391B3682DC2A74B4D15B5F3A525'

```
# Patient Controller

# POST
```
curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic cGF0aWVudDEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=FE87604839E9AD19D5F96A5EEEF77949' \
--data-raw '{
    "appointmentId": "106",
    "patientName": "Priyanka",
    "doctorName": "doc4",
    "date": "15th feb",
    "prescription": {
        "prescriptionId": "pres5",
        "appointmentId": "106",
        "description": "Asthama ",
        "patientName": "Priyanka",
        "doctorName": "doc4"
    }
}'
```
# GET
```
curl --location --request GET 'localhost:8080/patient/myappointment?patientName=Priyanka' \
--header 'Authorization: Basic cGF0aWVudDEyMzpwYXNzd29yZA==' \
--header 'Cookie: JSESSIONID=D9164D784EA5870FE2B13D75A60519FF'

```
# Prescription Controller

# POST
```
curl --location --request POST 'localhost:8080/prescription/saveprescription' \
--header 'Authorization: Basic ZG9jdG9yMTIzOnBhc3N3b3Jk' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=0A5325C466D0CB8BA7914C704E0F72E9' \
--data-raw '{
        "prescriptionId": "pres10",
        "appointmentId": "106",
        "description": "Fever",
        "patientName": "Raj",
        "doctorName": "doc10"
    }'
```
# GET
```
curl --location --request GET 'localhost:8080/prescription/viewprescription' \
--header 'Authorization: Basic ZG9jdG9yMTIzOnBhc3N3b3Jk' \
--header 'Cookie: JSESSIONID=0A5325C466D0CB8BA7914C704E0F72E9'
```
# Security
```
            .antMatchers(HttpMethod.GET,"/doctor/doctorappointmentr").hasAnyRole("DOCTOR")
            .antMatchers(HttpMethod.POST,"/doctor/save").hasAnyRole("DOCTOR")
            .antMatchers(HttpMethod.GET,"/patient/myappointment").hasAnyRole("PATIENT")
            .antMatchers(HttpMethod.POST,"/patient/save").hasAnyRole("PATIENT")
            .antMatchers(HttpMethod.GET,"/prescription/viewprescription").hasAnyRole("PATIENT","DOCTOR")
            .antMatchers(HttpMethod.GET,"/prescription/saveprescription").hasAnyRole("PATIENT","DOCTOR")
            .and().csrf().disable().headers().frameOptions().disable();
            
```
# Show Data
```
docker exec -it hospital-management-app-mongo-1 bash

mongo

show dbs

```
# Swagger :
```
http://localhost:8080/swagger-ui/index.html
```
