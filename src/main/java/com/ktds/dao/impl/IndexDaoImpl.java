package com.ktds.dao.impl;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.ktds.dao.IndexDao;

public class IndexDaoImpl extends SqlSessionDaoSupport implements IndexDao {

	public String getNowDateTime() {
		return getSqlSession().selectOne("IndexDao.getNowDateTime");
	}
}
