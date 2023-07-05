package com.laptrinhjavaweb.service.imlp;



import javax.inject.Inject;

import com.laptrinhjavaweb.dao.impl.IRegistDAO;
import com.laptrinhjavaweb.model.accModel;
import com.laptrinhjavaweb.service.IRegistService;

public class registService implements IRegistService{
	
	@Inject
	private IRegistDAO registDAO;
	
	@Override
	public String insert(accModel newAcc) {
		// TODO Auto-generated method stub
		return registDAO.insert(newAcc);
	}

}
