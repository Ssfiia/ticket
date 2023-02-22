package com.example.tiket.model;


public class Tiсket {
    private String departurePoint;//место отправления
    private String arrivalPoint;//место прибытия
    private String departureDate;//дато отправления
    private String arrivalDate;//дата прибытия
    private String departureTime;//время отправления
    private String travelTime;//время пути
    private int distance;//растояние
    private float ticketPrice;//цена взрослого билета
    private int numberOfTickets;//количество билетов


    public Tiсket (float ticketPrice, int numberOfTickets){
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    public Tiсket() {

    }

    public float ticketPriceAll(){
        return ticketPrice * numberOfTickets;
    }
    public float getTicketPrice(){
        return ticketPrice;
    }
    public void setTicketPrice(float ticketPrice){
        this.ticketPrice = ticketPrice;
    }
    public int getNumberOfTickets(){
        return numberOfTickets;
    }
    public void setNumberOfTickets(int numberOfTickets){this.numberOfTickets = numberOfTickets;}


}
