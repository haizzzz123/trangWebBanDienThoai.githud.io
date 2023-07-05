package com.laptrinhjavaweb.dao.impl;


import com.laptrinhjavaweb.model.accModel;

public interface IRegistDAO extends GenericDAO<accModel> {
	String insert(accModel acc);
	
	
}
