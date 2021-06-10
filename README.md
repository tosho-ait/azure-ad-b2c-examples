# This is an example of integrating a JS SPA and Spring Boot BE Application with Azure AD B2C.

Scribbled together from the Microsoft Azure samples and from Stack Overflow :-)


## "b2c-javascript-spa-msal" - Example JS FE Module

The Example JS FE Module uses the Microsoft MSAL library to integrate with Azure AD B2C.
It shows how to do a user log-in and access the API provided by the Spring Boot after that.

to run the example do:
```
cd b2c-javascript-spa-msal
npm install
npm start
```


## "b2c-react-spa-msal" - Example JS FE Module

The Example JS FE Module uses the Microsoft MSAL React library to integrate with Azure AD B2C.
It shows how to do a user log-in and access the API provided by the Spring Boot after that.

to run the example do:
```
cd b2c-react-spa-msal
npm install
npm start
```


## "b2c-spring-boot-api-oauth2" - Example Spring Boot API

The Example Spring Boot API uses the generic "spring-security-oauth2-resource-server" library to integrate with Azure AD.
P.S. The libraries provided by Microsoft for Spring seem to be buggy and badly documented.

to run the example:
```
cd b2c-spring-boot-api-oauth2
mvn package spring-boot:run
```


## "b2c-nodejs-api" - Example NodeJS API

The Example NodeJS API shows how to integrate a NodeJS BE with Azure AD B2C. We do not care about this for now.

to run the example do:
```
cd b2c-nodejs-api
npm install
npm start
```


### Note! All examples are pre-configured to run with the existing "viamedisdev" Azure AD B2C tenant. You can use the "viauser1@viamedis.net/viauser1" to log in.

