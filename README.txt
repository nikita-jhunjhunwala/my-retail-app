The project "Test" has two modules - "my-retail-common-models" which consists of all POJOs for external apis,
and "my-retail-application" which has all functionality.

Assuming maven is installed in the testing system, run the following commands:
1) mvn clean install -> to build the project
2) mvn exec:java <>/Test/my-retail-application/src/main/java/com/target/assessment/MyRetailApplication.java

