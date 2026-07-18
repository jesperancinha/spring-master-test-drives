# Spring Master Test Drives - Furniture Shop 🪑

## Introduction

This is a furniture shop. Here we will use Kotlin as the language to investigate Spring

## How to run

There are a few profiles available.

## Curl

```bash
curl -i -X POST http://localhost:8081/chairs -H 'Content-type: application/json' --data '{ "id": "1", "designation":"TABLE123", "weight":"100"}'
```
```bash
curl -i -X GET http://localhost:8081/hello
```

### Profile `broken`

This profile is a broken application profile. The profile creates and uses a `ChairDelegatingFilterProxy`, which overrides the entry point of the application in `doFilter`.	With `@Component`, we are allowing Spring to manage our `DelegatingFilterProxy` as a bean instead of leaving that to Tomcat. Since we do not invoke the filter chain, we cannot and won't reach any of the controllers available.

### Endpoints

1.  http://localhost:8081 - The start of the application
2.  http://127.0.0.1:8081/actuator/metrics - Metrics
3.  http://127.0.0.1:8081/actuator/metrics/process.cpu.usage - Metrics - CPU Usage
4.  http://127.0.0.1:8081/actuator/metrics/http.server.requests - Metrics Http Server Requests

## 1 - Container, Dependency and IoC

1.  https://springframework.guru/best-practices-for-dependency-injection-with-spring/
2.  https://dzone.com/articles/spring-bean-lifecycle
3.  https://stackoverflow.com/questions/39890849/what-exactly-is-field-injection-and-how-to-avoid-it
4.  https://howtodoinjava.com/spring-core/spring-bean-life-cycle/
5.  https://docs.spring.io/spring-framework/docs/3.0.x/reference/expressions.html
6.  https://docs.spring.io/spring-integration/docs/current/reference/html/spel.html#spel
7.  https://www.dev2qa.com/spring-expression-language-example-vs/
8.  https://dzone.com/articles/beginners-guide-to-spring-expression-language-with
9.  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/core/annotation/Order.html
10. https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Lazy.html
11. https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Import.html
12. https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/DependsOn.html
13. https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.application.failure-analyzer
14. https://docs.spring.io/spring-boot/docs/current/reference/html/howto.html#howto.application.customize-the-environment-or-application-context
15. https://zetcode.com/springboot/applicationcontext/
16. https://zetcode.com/springboot/profile/
17. https://docs.spring.io/spring-boot/docs/1.2.0.M1/reference/html/boot-features-profiles.html
18. https://www.amitph.com/how-to-use-spring-profiles/
19. https://springframework.guru/spring-profiles/
20. https://devs4j.com/2017/10/30/support-multiple-profiles-with-spring-boot/
21. https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.profiles
22. https://sookocheff.com/post/java/understanding-springs-environment-abstraction/

## 2 - AOP

1.  https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#beans-factory-scopes-other-injection-proxies
2.  https://docs.spring.io/spring-framework/docs/current/reference/html/core.html#aop-proxying
3.  https://stackoverflow.com/questions/22861587/why-protected-methods-are-not-intercepted-by-spring-aop#:~:text=Due%20to%20the%20proxy%2Dbased,not%20recommendable%20for%20AOP%20purposes).
4.  https://stackoverflow.com/questions/51795511/when-is-cglib-proxy-used-by-spring-aop
5.  https://howtodoinjava.com/spring-aop/aspectj-pointcut-expressions/

## 3 - Transactions

1.  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Transactional.html
2.  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/annotation/Propagation.html
3.  https://docs.spring.io/spring-framework/docs/4.2.x/spring-framework-reference/html/transaction.html
4.  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/transaction/support/TransactionTemplate.html

In a transaction, the `readOnly`, only means possible performance improvements.

Calling private methods withing a class TODO:

## 4 - JPA

1.  https://reflectoring.io/spring-boot-data-jpa-test/
2.  https://zetcode.com/springboot/datajpatest/
3.  https://www.arhohuttunen.com/spring-boot-datajpatest/
4.  https://bezkoder.com/spring-boot-unit-test-jpa-repo-datajpatest/
5.  https://howtodoinjava.com/spring-boot2/testing/datajpatest-annotation/
6.  https://www.javaguides.net/2018/09/spring-data-jpa-repository-testing-using-spring-boot-datajpatest.html
7.  https://howtodoinjava.com/spring-boot2/datasource-configuration/
8.  https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query
			
## 5 - MVC Basics

1.  https://docs.spring.io/spring-framework/docs/current/reference/html/web.html#mvc-ann-arguments

## 6 - MVC REST

1.  https://spring.io/guides/gs/serving-web-content/

## 7 - Security

1.  https://dzone.com/articles/what-does-spring-delegatingfilterproxy-do
2.  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/web/filter/DelegatingFilterProxy.html
3.  https://stackoverflow.com/questions/6725234/whats-the-point-of-spring-mvcs-delegatingfilterproxy
4.  https://springbootdev.com/2017/09/09/spring-security-delegatingfilterproxy/
5.  https://www.youtube.com/watch?v=lxmBJmUhqss
6.  https://www.youtube.com/watch?v=xEnvAAhMGu4
7.  https://github.com/jzheaux/springone2019
8.  https://github.com/jzheaux/springone2020
9.  https://www.youtube.com/watch?v=TDuVY8PFU3Q
10. https://docs.spring.io/spring-security/site/docs/4.2.20.RELEASE/apidocs/org/springframework/security/core/context/SecurityContextHolder.html
11. https://programmersought.com/article/63182958726/
12. https://javarevisited.blogspot.com/2018/02/what-is-securitycontext-and-SecurityContextHolder-Spring-security.html#axzz6w2sHEiVK
13. https://docs.spring.io/spring-security/site/docs/3.0.x/reference/technical-overview.html
14. https://www.mfvitale.me/blog/2021/02/24/security.context.and.concurrency.html
15. https://dzone.com/articles/how-to-get-current-logged-in-username-in-spring-se
16. https://dzone.com/articles/what-does-spring-delegatingfilterproxy-do
17. https://dzone.com/articles/how-to-get-current-logged-in-username-in-spring-se#:~:text=The%20SecurityContext%20is%20used%20to,access%20to%20the%20security%20context.
				
## 8 - Testing

1.  https://docs.spring.io/spring-framework/docs/4.3.12.RELEASE/spring-framework-reference/html/unit-testing.html
2.  https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html
3.  https://www.concretepage.com/spring-5/webappconfiguration-example-spring-test
4.  https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html
5.  https://docs.spring.io/spring-boot/docs/current/reference/html/features.html#features.testing
6.  https://examples.javacodegeeks.com/enterprise-java/spring/using-mockrestserviceserver-test-rest-client/
7.  https://stackoverflow.com/questions/43653655/what-is-difference-between-importautoconfiguration-and-import
8.  https://www.concretepage.com/spring-5/dirtiescontext-example-spring-test
9.  https://docs.spring.io/spring-framework/docs/current/reference/html/testing.html#integration-testing-annotations-spring
10. https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/test/context/ContextConfiguration.html
## 9 - Spring Boot Basics

1.  https://springframework.guru/spring-external-configuration-data/
2.  https://mkyong.com/spring/spring-propertysources-example/
3.  http://www.dailycodebuffer.com/shutdown-a-spring-boot-application/#:~:text=Close%20ApplicationContext,method%20to%20close%20ApplicationContext%20programmatically.

## 10 - Spring Boot Auto-Configuration

1.  https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#features.developing-auto-configuration
2.  https://docs.spring.io/spring-boot/docs/2.3.4.RELEASE/reference/htmlsingle/#boot-features-external-config
3.  https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#boot-features-spring-mvc-auto-configuration

## 11 - Spring Boot Actuator

1.  https://dzone.com/articles/maven-git-commit-id-plugin
2.  https://codeboje.de/spring-boot-info-actuator/
3.  https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#actuator.endpoints.exposing
4.  https://www.logicbig.com/tutorials/spring-framework/spring-boot/accessing-jmx-actuator-endpoints.html
5.  https://docs.spring.io/spring-boot/docs/current/reference/html/actuator.html#actuator.jmx

## 12 - Spring Boot Testing

1.  https://howtodoinjava.com/spring-boot2/testing/springboot-test-configuration/
2.  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/context/annotation/Lazy.html
3.  https://docs.spring.io/spring-framework/docs/current/javadoc-api/org/springframework/jdbc/datasource/embedded/EmbeddedDatabaseBuilder.html

---
