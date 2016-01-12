package userInfo.dao.oracle;

import userInfo.UserInfo;
import userInfo.dao.IUserInfoDao;

public class UserInfoDaoOracle implements IUserInfoDao {
	
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("InsertUserInfo Oracle userId = " +userInfo.getUserId());
	}
	
	public void deleteUserInfo(UserInfo userInfo) {
		System.out.println("DeletetUserInfo Oracle userId = " +userInfo.getUserId());
	}
	
	public void updateUserInfo(UserInfo userInfo) {
		System.out.println("UpdatetUserInfo Oracle userId = " +userInfo.getUserId());
	}
}
