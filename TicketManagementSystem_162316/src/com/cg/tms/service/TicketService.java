package com.cg.tms.service;

import java.util.List;
import java.util.Map;

import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.exception.TicketException;

public interface TicketService {

	Map<String, String> getTicketCategoryEntries() throws TicketException;
	List<TicketCategory> listTicketCategory();
	boolean raiseNewTicket(TicketBean ticketBean) throws TicketException ;
	
}
