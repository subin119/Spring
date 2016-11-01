package com.ktds.biz.impl;

import com.ktds.biz.IndexBiz;
import com.ktds.dao.IndexDao;

public class IndexBizImpl implements IndexBiz{
	
	private IndexDao indexDao;

	public void setIndexDao(IndexDao indexDao) {
		this.indexDao = indexDao;
	}
	
}
