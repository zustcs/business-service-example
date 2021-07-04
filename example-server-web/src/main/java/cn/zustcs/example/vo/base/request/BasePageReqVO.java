package cn.zustcs.example.vo.base.request;

/**
 * 功能描述: 基础请求分页类
 *
 * @Author: zxc
 * @Date: 2021/7/5 0:21
 */
public abstract class BasePageReqVO extends BaseReqVO {
    private static final long serialVersionUID = 9100604292708720130L;
    private Integer page;
    private Integer limit;
}
