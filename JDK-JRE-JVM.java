//https://www.geeksforgeeks.org/differences-jdk-jre-jvm/

#JDK - development environment
applet extended to swing, java fx

JRE(installation package diff for diff OS) 
JRE = JVM + libs 

JRE - only for running (class files)
JDK - development + running 

JVM -> spec + implementation

Integration libs - 
1. JDBC & Java Persistence API (ORM is wrapper like MyBatis)
2. JNDI - Map id with bean and store in container(in server) at startup,
          at runtime get the instance by id
3. RMI -  Object serialized (to bytecode file) and sent over n/w to another JVM
       -  RMI is middle-tier 
       -  Microservices is REST tier
       -  (EJB is wrapper)

Lang & utilities -rt.jar  

//Q1 - JIT in Java vs JS ?
//Q2 - Can we use RMI for microservices ? No
//Q3 - Is Java Only WORA, or any other language ?
