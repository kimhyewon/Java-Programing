package web;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import userInfo.UserInfo;
import userInfo.dao.IUserInfoDao;
import userInfo.dao.mysql.UserInfoDaoMySQL;
import userInfo.dao.oracle.UserInfoDaoOracle;

public class UserInfoTest {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("db.properties");
		Properties prop = new Properties(); 
		prop.load(fis); //파일을 읽어오는 기능 
		
		String dbType = prop.getProperty("DBTYPE");
		IUserInfoDao dao = null;
		
		if(dbType.equals("ORACLE"))
			dao = new UserInfoDaoOracle();
		else if(dbType.equals("MYSQL"))
			dao = new UserInfoDaoMySQL();
		
		UserInfo userInfo = new UserInfo(1234, "강동원", "서울");
		
		dao.insertUserInfo(userInfo);
		dao.deleteUserInfo(userInfo);
		dao.updateUserInfo(userInfo);
	}
}
