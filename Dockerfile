FROM balidea/liberty-base:v01.00.0000

ADD ./config/server.xml /config/server.xml
ADD ./config/ojdbc7.jar /config/JDBCDrivers/ojdbc7.jar
VOLUME ./target/demo-maven-docker-0.0.1-SNAPSHOT.war:/config/dropins/demo.war
