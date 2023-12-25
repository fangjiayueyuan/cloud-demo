package cn.itcast.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@MapperScan("cn.itcast.order.mapper")
@SpringBootApplication
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }
    /**
     * @param :
     * @return RestTemplate
     * @author jiayueyuanfang
     * @description 创建RestTemplate实例，并注入Spring容器
     * @date 2023/12/25 23:27
     */

    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

}