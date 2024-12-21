FROM openjdk:17-jdk

WORKDIR /app

COPY . /app

RUN javac hello.java

CMD ["java", "hello"]