package cn.zustcs.example.base.dto.login;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 * 功能描述: 用户个人登录信息
 * @Author: zxc
 * @Date: 2021/7/19 0:13
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Component
public class UserLoginDTO {
    private Long userId;
    private String studentId;
    private String name;
    private String gender;
    private LocalDate birthday;
    private String faculty;
    private String discipline;
    private String clazz;
}
