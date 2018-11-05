package com.cg.tms.ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.Scanner;
import com.cg.tms.dto.TicketBean;
import com.cg.tms.dto.TicketCategory;
import com.cg.tms.exception.TicketException;
import com.cg.tms.service.TicketService;
import com.cg.tms.service.TicketServiceImpl;

public class MainUI {
	public static void main(String[] args) {
		TicketService service=new TicketServiceImpl();
		TicketBean ticketBean=new TicketBean();
		TicketCategory ticketCategoryBean=new TicketCategory();
		int choosingMenu;
		
		
		try{
		do{
			Scanner scanner=new Scanner(System.in);
			
			System.out.println("Welcome to ITIMD Help Desk");
			System.out.println("1.Raise a Ticket");
			System.out.println("2.Exit from the system");
			 choosingMenu=scanner.nextInt();
		
		switch(choosingMenu){
		
		case 1:
		
		Map<String, String> ticketCategory =service.getTicketCategoryEntries();
		System.out.println("Select Ticket Category form below List");
		int category=1;
		for (Map.Entry<String, String>  entrySet:ticketCategory.entrySet()) {
			System.out.println(category+". "+entrySet.getValue());
			category++;
		}
		System.out.println("Enter option");
	
		int choice=scanner.nextInt();
		int count1=1;
		for (Map.Entry<String, String>  entrySet:ticketCategory.entrySet()) {
			if(choice==count1){
				ticketCategoryBean.setTicketCategoryId(entrySet.getKey());
			}
			count1++;
		}
		int ticketCategoryId=(int) (Math.random()*10000);
		ticketBean.setTicketCategoryId(ticketCategoryId);
		System.out.println("Enter Description related to issue");
		String ticketDescription=scanner.next();
		ticketBean.setTicketDescription(ticketDescription);
		System.out.println("Enter Priority(1.low 2.medium 3.high)");
		int priortyChoice=scanner.nextInt();
		if(priortyChoice==1){
			ticketBean.setTicketDescription("low");
		}
		if(priortyChoice==2){
			ticketBean.setTicketDescription("medium");
		}if(priortyChoice==3){
			ticketBean.setTicketDescription("high");
		}
		service.raiseNewTicket(ticketBean);
		LocalDateTime ldt=LocalDateTime.now();
		DateTimeFormatter f=DateTimeFormatter.ofPattern("d MMMM yyyy hh:mm a");
		System.out.println("Ticket Number "+ticketCategoryId+ " logged successfully at" +ldt.format(f));
		break;
		case 2: 
			System.exit(0);
	}
		}while(choosingMenu!=2);
		}catch(TicketException ticketException){
		System.out.println("Error in choosing choice please choose correctly");
	}
		}
}
