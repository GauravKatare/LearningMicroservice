# MovieMicroservice

This is small microservice in which api moviecatalog calls movie-info and rating-info in order to give the list of movies watched by user.

1) api movie-info -> description of movie 
2) rating-info  -> rating given by user to a particular movie.
 
All three api are build using spring boot.This project is also deployed in AWS using EC2 & S3.
Circuit Breaking is implemented in project using Hystrix and service discovery protocol is implemented using Eureka server.
