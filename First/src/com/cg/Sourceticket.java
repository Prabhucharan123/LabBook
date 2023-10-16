package com.cg;

import java.util.Scanner;

public class Sourceticket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter no of bookings:");
		int bookings = scan.nextInt();

 

        System.out.println("Enter the available tickets:");
        int availableTickets = scan.nextInt();

 

 

       Ticket ticket = new Ticket();
       ticket.setAvailableTickets(availableTickets);

 

       for (int i = 0; i < bookings; ++i) {
           System.out.println("Enter the ticketid:");
           int ticketId = scan.nextInt();

 

           System.out.println("Enter the price:");
           int price = scan.nextInt();

 

           System.out.println("Enter the no of tickets:");
           int tickets = scan.nextInt();

           ticket.setTicketid(ticketId);
           ticket.setPrice(price);

 

           System.out.println("Available tickets: " + ticket.getAvailableTickets());

 

           int cost = ticket.calculateTicketCost(tickets);
           System.out.println("Total amount:" + cost);
           System.out.println("Available ticket after booking:" + ticket.getAvailableTickets());
       }
	}
}

