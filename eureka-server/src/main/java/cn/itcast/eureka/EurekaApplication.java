package cn.itcast.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @projectName: cloud-demo
 * @package: cn.itcast.eureka
 * @className: EurekaApplication
 * @author: fangjiayueyuan
 * @description: TODO
 * @date: 2024/1/3 23:30
 * @version: 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }
}
