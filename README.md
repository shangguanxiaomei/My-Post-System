<p align="center">
 <img width="100px" src="https://github.com/shangguanxiaomei/Imageshare/raw/master/20200804%20Project/pngtree-internet-web-site-with-approved-mark-vector-icon-png-image_1804267.jpg" align="center" alt="My Post System" />
 <h1 align="center">My Post System</h1>
 <p align="center">A post web service with RESTful API using Angular & Microservices</p>
</p>

## Demo

<img width="1000px" align="center" src="https://github.com/shangguanxiaomei/Imageshare/raw/master/20200804%20Project/Annotation 2020-08-04 103738.png" align="center" alt="GitHub Readme Stats" />
<img width="1000px" align="center" src="https://github.com/shangguanxiaomei/Imageshare/raw/master/20200804%20Project/Annotation 2020-08-04 103859.png" align="center" alt="GitHub Readme Stats" />

## Features
- Interactive web pages built with angular.
- Using Asynchronous call to load the content from firebase.
- 4 Spring Cloud Netflix microservices.
- 100% test coverage for both frontend and backend.


## Structures
1. The Angular folder contains the angular project source code.
2. The project-server folder contains eureka server microservice source code.
3. The project-gateway older contains gateway microservice source code.
3. The project-data older contains data microservice source code, which read&write data on firebase.
3. The project-client-service older contains user service microservice source code, which provides RESTful API call and
 use OpenFeign to call data microservice internally.
