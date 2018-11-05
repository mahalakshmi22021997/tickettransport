package com.cg.tms.dto;

public class TicketBean {

	private String ticketNo;
	private int ticketCategoryId;
	private String ticketDescription;
	private String ticketPriority;
	private String ticketStatus="new";
	private String itimdComments;
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	public int getTicketCategoryId() {
		return ticketCategoryId;
	}
	public void setTicketCategoryId(int ticketCategoryId2) {
		this.ticketCategoryId = ticketCategoryId2;
	}
	public String getTicketDescription() {
		return ticketDescription;
	}
	public void setTicketDescription(String ticketDescription) {
		this.ticketDescription = ticketDescription;
	}
	public String getTicketPriority() {
		return ticketPriority;
	}
	public void setTicketPriority(String ticketPriority) {
		this.ticketPriority = ticketPriority;
	}
	public String getTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(String ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	public String getItimdComments() {
		return itimdComments;
	}
	public void setItimdComments(String itimdComments) {
		this.itimdComments = itimdComments;
	}
	@Override
	public String toString() {
		return "TicketBean [ticketNo=" + ticketNo + ", ticketCategoryId="
				+ ticketCategoryId + ", ticketDescription=" + ticketDescription
				+ ", ticketPriority=" + ticketPriority + ", ticketStatus="
				+ ticketStatus + ", itimdComments=" + itimdComments + "]";
	}
	public TicketBean(String ticketDescription, String ticketPriority) {
		super();
		this.ticketDescription = ticketDescription;
		this.ticketPriority = ticketPriority;
	}
	public TicketBean(){
		super();
	}
	
}
