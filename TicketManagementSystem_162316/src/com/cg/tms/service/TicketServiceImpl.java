package com.cg.tms.service;

import java.util.List;
import java.util.Map;

import com.cg.tms.dao.TicketDAO;
import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.exception.TicketException;
import com.cg.tms.util.Util;

public class TicketServiceImpl implements TicketService {
	TicketDAO dao=new TicketDAOImpl();
	

	@Override
	public Map<String, String> getTicketCategoryEntries() throws  TicketException{
		// TODO Auto-generated method stub
		return dao.getTicketCategoryEntries();
	}

	
	@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		return dao.listTicketCategory();
	}

	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) throws TicketException  {
		// TODO Auto-generated method stub
		 dao.raiseNewTicket(ticketBean);
		 return true;
	}

	
}
