package com.cg.tms.dao;

import java.util.List;
import java.util.Map;

import com.cg.tms.exception.TicketException;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;

public interface TicketDAO {

	Map<String, String> getTicketCategoryEntries() throws TicketException;
	List<TicketCategory> listTicketCategory();
	boolean raiseNewTicket(TicketBean ticketBean) throws TicketException ;


}
