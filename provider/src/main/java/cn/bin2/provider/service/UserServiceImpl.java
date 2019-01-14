package cn.bin2.provider.service;

import cn.bin2.service.UserService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

/**
 * @Author: bingshuai.lu
 * @Description:
 * @Date: Created in 14:01 2019/1/14
 * @Modified By:
 */
@Service(version = "${user.service.version}")
public class UserServiceImpl implements UserService {

    @Value("${dubbo.protocol.port}")
    private String port;
    @Override
    public String sayHi() {
        return "hello dubbo,i am "+ port;
    }
}
