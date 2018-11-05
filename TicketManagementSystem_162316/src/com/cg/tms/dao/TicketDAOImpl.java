package com.cg.tms.dao;

import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

import com.cg.tms.exception.TicketException;
import com.cg.tms.util.Util;

public class TicketDAOImpl implements TicketDAO {

	@Override
	public Map<String, String> getTicketCategoryEntries() throws TicketException {
		// TODO Auto-generated method stub
		return Util.getTicketCategoryEntries();
	}

	

	@Override
	public List<TicketCategory> listTicketCategory() {
		// TODO Auto-generated method stub
		
		return listTicketCategory();
	}



	@Override
	public boolean raiseNewTicket(TicketBean ticketBean) throws TicketException {
		// TODO Auto-generated method stub
		/*boolean isValid=false;
		if(!(ticketBean.getTicketPriority().length()>4)){
			throw new TicketException(ExceptionMessage.ERROR1);
		}
		*/
		Util.raiseNewTicket(ticketBean);
		
			return true;
	}

	

	
}
