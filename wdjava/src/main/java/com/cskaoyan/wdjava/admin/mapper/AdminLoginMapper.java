package com.cskaoyan.wdjava.admin.mapper;

import com.cskaoyan.wdjava.admin.bean.AdminLogin;
import com.cskaoyan.wdjava.admin.bean.ChangePwd;

public interface AdminLoginMapper {

    AdminLogin selectMsgByAccount(String email);

    void deleteUser(Integer id);

    ChangePwd selectAdminByTokenName(String adminToken);

    void updatePwd(ChangePwd changePwd);

    void deleteAdmins(Integer id);

    void addAdminss(AdminLogin adminLogin);

    void updateAdminss(AdminLogin adminLogin);

    Integer accountaccount(String email);

    void deleteOrderByUserId(Integer id);

    void deleteMessageByUserId(Integer id);

    void deleteReMessageByUserid(Integer id);

    Integer namemane(String nickname);
}
