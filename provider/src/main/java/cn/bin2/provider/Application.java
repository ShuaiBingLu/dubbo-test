package cn.bin2.provider;

import com.alibaba.dubbo.container.Main;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: bingshuai.lu
 * @Description:
 * @Date: Created in 13:58 2019/1/14
 * @Modified By:
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
        Main.main(args);
    }
}
