package userInfo.dao.mysql;

import userInfo.UserInfo;
import userInfo.dao.IUserInfoDao;

public class UserInfoDaoMySQL implements IUserInfoDao {
	
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("InsertUserInfo MySql userId = " +userInfo.getUserId());
	}
	
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("DeletetUserInfo MySql userId = " +userInfo.getUserId());
	}
	
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("UpdatetUserInfo MySql userId = " +userInfo.getUserId());
	}
}
