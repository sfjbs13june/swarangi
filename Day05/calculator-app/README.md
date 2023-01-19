## Create the project using :

https://start.spring.io/

## Build application

``` 
mvn clean install
```

## Run application

``` 
mvn spring-boot:run
```

## Test Application
```
curl --location --request GET 'localhost:8080/add?a=4.0&b=5.0'

curl --location --request POST 'localhost:8080/sub?a=10.0&b=3.0'

curl --location --request PUT 'localhost:8080/multi?a=5.0&b=4.0'

curl --location --request DELETE 'localhost:8080/div?a=15.0&b=3.0'

