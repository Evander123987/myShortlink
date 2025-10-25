package com.nageoffer.shortlink.admin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.nageoffer.shortlink.admin.dao.entity.UserDO;
import com.nageoffer.shortlink.admin.dto.req.UserLoginReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserRegisterReqDTO;
import com.nageoffer.shortlink.admin.dto.req.UserUpdateReqDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserLoginRespDTO;
import com.nageoffer.shortlink.admin.dto.resp.UserRespDTO;

/**
 * 用户接口层
 */
public interface UserService extends IService<UserDO> {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    UserRespDTO getUserByUserName(String username);

    /**
     * 查询用户名是否已存在
     * @param username
     * @return
     */
    Boolean hasUsername(String username);

    /**
     * 注册用户
     * @param requestParm
     */
    void register(UserRegisterReqDTO requestParm);

    /**
     * 根据用户名修改用户
     * @param requestParm
     */
    void update(UserUpdateReqDTO requestParm);

    /**
     * 登录
     * @param requestParm
     * @return
     */
    public UserLoginRespDTO login(UserLoginReqDTO requestParm);

    /**
     * 检查用户是否登录
     * @param token 用户登录Token
     * @return 用户是否登录标识
     */
    Boolean checkLogin(String username, String token);
}
