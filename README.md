# Introduction
A simple demo for using spring security, use BCryptPasswordEncoder as PasswordEncoder.

# Test and run
- Start the project
    ```shell script
    mvn spring-boot:run
    ```
- Test the '/hello2'
    ```shell script
    curl -H "Authorization:Basic dXNlcjphZG1pbjEyMzQ1" -X GET localhost:18889/hello2/yumingtao2
    ```
    
    test result:
    ```shell script
    Hello, yumingtao2
    ```
- Test the '/hello'
    ```shell script
    curl -H "Authorization:Basic dXNlcjphZG1pbjEyMzQ1" -d name=yumingtao -X POST localhost:18889/hello
    ```
    
    test result:
    ```shell script
    Hello, yumingtao 
    ```
  
# References
  - https://www.javadevjournal.com/spring/password-encoding-in-spring-security/
  - https://www.devglan.com/online-tools/bcrypt-hash-generator
    