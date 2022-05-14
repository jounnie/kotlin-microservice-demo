# Kotlin microservice demo

small project to build up a microservice with the following technologies

- kotlin
- gradle w/ kotlin dsl
- spring boot / cloud stream / data jpa / mvc
- kafka / redpanda

## TODOs

 - [ ] produce an event to message broker
   - [x] add redpanda docker compose config
   - [ ] kafka connection and topic creation config
   - [ ] publish event to topic
   - [ ] add unit test / integration test
 - [ ] consume event from message broker
 - [ ] persist event data to db
