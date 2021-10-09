# JavaPFTemplate

## Technology:
* Java EE
* CDI
* PrimeFacess
* Payara 

# IntellJ Configuration
[... soon example IntelliJ configuration... ]

## Remote debugging for Docker

1. Set up Dockerfile with Payara image
    * enable debug mode with flag `ENV PAYARA_ARGS --debug` in Dockerfile
    * bind port `9009:9009` in configuration
2. Add run configuration in IntelliJ for **Dockerfile**
3. Add run configuration for `Remote JVM Debug`
    * set up port `9009`
    * in `Before launch` section add `Launch Docker before debug`
 
