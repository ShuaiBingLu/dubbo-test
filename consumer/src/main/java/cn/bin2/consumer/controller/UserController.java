package cn.bin2.consumer.controller;

import cn.bin2.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: bingshuai.lu
 * @Description:
 * @Date: Created in 14:17 2019/1/14
 * @Modified By:
 */
@RestController
@RequestMapping(value = "/")
public class UserController {

    @Reference(version = "${user.service.version}")
    private UserService userService;
    @RequestMapping(value = "say")
    public String sayHello(){
       return userService.sayHi();
    }
}
