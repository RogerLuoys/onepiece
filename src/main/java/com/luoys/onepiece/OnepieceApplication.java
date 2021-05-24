package com.luoys.onepiece;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.clo
// pringframework.cloud.netflix.eureka.EnableEurekaClient;

//@EnableEurekaClient
@SpringBootApplication
public class OnepieceApplication {
    //    怎么打jar包: mvn clean package
//    怎么执行: java -jar **.jar或直接 run jar

    public static void main(String[] args) {

        SpringApplication.run(OnepieceApplication.class, args);
    }

}
