The project "Test" has two modules - "my-retail-common-models" which consists of all POJOs for external apis,
and "my-retail-application" which has all functionality.

Assuming maven is installed in the testing system, run the following commands:
1) git clone git@github.com:nikita-jhunjhunwala/my-retail-app.git
2) cd my-retail-app
3) mvn clean install
4) cd my-retail-application
3) mvn exec:java

