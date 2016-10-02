# microprofile-demo
Microprofile demo

A microprofile sample using [Tomee](http://tomee.apache.org/) implementation.

Basically this microservice capture an simple answer, with yes or no, given a simple question.

To run:

* `mvn clean package tomee:exec -DskipTests`
* `java -jar target/microprofile-demo-1.0-SNAPSHOT-exec.jar`

### The available resources:

* **GET** http://localhost:8080/microprofile-demo/resource/votes/
* **GET** http://localhost:8080/microprofile-demo/resource/votes/question
* **POST** http://localhost:8080/microprofile-demo/resource/votes/{opinion}

## More information

* http://microprofile.io/
