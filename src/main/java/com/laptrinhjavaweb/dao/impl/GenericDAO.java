package com.laptrinhjavaweb.dao.impl;

import java.util.List;

import com.laptrinhjavaweb.mapper.RowMapper;

public interface GenericDAO<T> {
	<T> List<T> query(String sql, RowMapper<T> rowMapper, Object... parameters);
	void update (String sql, Object... parameters);
	String insert (String sql, Object... parameters);
	
	int count(String sql, Object... parameters);
}
