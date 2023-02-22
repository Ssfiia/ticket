package com.example.tiket.model;

import com.example.tiket.model.Tiсket;

public class ChildTicket extends Tiсket{

    private float ticketDiscount; //Скиидка

    public ChildTicket(float ticketPrice, int numberOfTickets,float ticketDiscount) {
        super(ticketPrice, numberOfTickets);
        this.ticketDiscount=ticketDiscount;
    }

    public float ticketPriceAll() {
        return (getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount)/100);
    }
}
