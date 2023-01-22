# Create Project

```
https://start.spring.io/
```
# Build the project

```
mvn clean install
```
# Run the application

```
mvn spring-boot:run
```

# Testing the application 
Save Data:

curl --location --request POST 'localhost:8080/patient/save' \
--header 'Authorization: Basic dXNlcjEyMzpwYXNzd29yZA==' \
--header 'Content-Type: application/json' \
--header 'Cookie: JSESSIONID=704DC82CF8816E611F0BB44432C633DB' \
--data-raw '{
"id":"123",
"name":"pat123",
"age":"25",
"gender":"male",
"disease":"cold"
}'

curl --location --request PUT 'localhost:8080/patient/update?disease=fever&age=12' 