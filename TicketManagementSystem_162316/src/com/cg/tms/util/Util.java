package com.cg.tms.util;

import java.util.HashMap;
import java.util.List;
import java.util.Map;



import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.exception.TicketException;

public class Util {
	
	private static Map<String, String> ticketCategory=new HashMap<String, String>();
	private static Map<Integer,TicketBean > raiseTicket=new HashMap<>();
	
	public static Map<String, String> getTicketCategoryEntries(){
		ticketCategory.put("tc001", "software installation");
		ticketCategory.put("tc002", "mailbox creation");
		ticketCategory.put("tc003", "mailbox issues");
		return ticketCategory;
	}
	/*public static void addTicketDetails(TicketBean ticketBean) {
		// TODO Auto-generated method stub
		addTicketDetails(ticketBean);
	}*/
	public static List<TicketCategory>listTicketCatgory() {
		return listTicketCatgory(); 
	}
	public static boolean raiseNewTicket(TicketBean ticketBean)throws TicketException{
		
		raiseTicket.put(ticketBean.getTicketCategoryId(),ticketBean);
		return true;
	}

}
