package com.cg.tms.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cg.tms.dao.TicketDAOImpl;
import com.cg.tms.dto.TicketBean;

public class TicketDAOImplTest {

	static TicketDAOImplTest dao=null;
	
	@BeforeClass
	public static void createInstance(){
		dao=new TicketDAOImplTest();
	}
	@Test
	public void testraiseNewTicket(){
		TicketBean bean=new TicketBean();
		bean.setItimdComments("ghsahgsa");
		bean.setTicketDescription("helloooo");
		bean.setTicketPriority("2");
		equals(bean);
		
		
	}
}
