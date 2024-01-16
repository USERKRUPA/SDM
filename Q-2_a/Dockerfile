#use openjdk image
FROM openjdk:latest

#copy current directory data to /usr/src/myapp
COPY . /usr/src/myapp

#make container's current working directory as /usr/src/myapp
WORKDIR /usr/src/myapp

#compile the java file
RUN javac Reverse.java

#execute java class file
CMD ["java", "Reverse"]