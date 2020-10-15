package com.sist.dao;
import java.io.*;
import java.util.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class ComputerDAO {
	private static SqlSessionFactory ssf;
	{ 
		try
		{
			Reader reader=Resources.getResourceAsReader("Config.xml");
			ssf=new SqlSessionFactoryBuilder().build(reader);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static List<ComputerVO> computerListData(Map map)
	{
		List<ComputerVO> list=new ArrayList<ComputerVO>();
		SqlSession session=ssf.openSession();
		list=session.selectList("computerListData", map);
		session.close();
		return list;
	}
}
