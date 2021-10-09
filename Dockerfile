FROM payara/server-full:5.2021.7-jdk11
ENV PAYARA_ARGS --debug
ADD templ_web/target/templ_web-1.0.war /opt/payara/deployments/java_pf_templ.war