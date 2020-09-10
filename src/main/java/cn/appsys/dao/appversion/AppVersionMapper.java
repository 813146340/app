package cn.appsys.dao.appversion;

import cn.appsys.pojo.AppVersion;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AppVersionMapper {

     List<AppVersion> getAppVersionList(@Param("appId")Integer appId) throws Exception;

     int add(AppVersion appVersion)throws Exception;

     int getVersionCountByAppId(@Param("appId")Integer appId)throws Exception;

     int deleteVersionByAppId(@Param("appId")Integer appId)throws Exception;

     AppVersion getAppVersionById(@Param("id")Integer id)throws Exception;

     int modify(AppVersion appVersion)throws Exception;

     int deleteApkFile(@Param("id")Integer id)throws Exception;
}
