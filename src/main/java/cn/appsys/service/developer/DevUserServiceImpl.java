package cn.appsys.service.developer;

import cn.appsys.dao.devuser.DevUserMapper;
import cn.appsys.pojo.DevUser;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DevUserServiceImpl implements  DevUserService {
    @Resource
    private DevUserMapper mapper;
    @Override
    public DevUser login(String devCode, String devPassword) throws Exception {

        DevUser user = null;
        user = mapper.getLoginUser(devCode);
        //匹配密码
        if(null != user){
            if(!user.getDevPassword().equals(devPassword))
                user = null;
        }
        return user;
    }
}
