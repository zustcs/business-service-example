package cn.zustcs.example.serviceApi;


import cn.zustcs.example.base.dto.login.UserLoginDTO;
import cn.zustcs.zroot.web.util.Results;

/**
 * 功能描述: 样例接口
 * @Author: zxc
 * @Date: 2021/7/18 23:33
 */
public interface ExampleService {

    /**
     * 获取用户信息
     *
     * @param id Zuser.id
     * @return 用户信息
     */
    Results getUserInfo(long id);
}
