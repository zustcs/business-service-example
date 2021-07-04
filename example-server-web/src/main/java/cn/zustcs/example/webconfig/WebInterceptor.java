package cn.zustcs.example.webconfig;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 功能描述: 服务请求拦截配置
 * @Author: zxc
 * @Date: 2021/7/5 0:12
 */
@Slf4j
@Configuration
public class WebInterceptor implements HandlerInterceptor {

    /**
     * 请求调用之前进行拦截
     */
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        // 做校验
        return false;
    }

    /**
     * 请求处理之后进行操作
     */
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    /**
     * 在请求结束之后进行调用
     */
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
