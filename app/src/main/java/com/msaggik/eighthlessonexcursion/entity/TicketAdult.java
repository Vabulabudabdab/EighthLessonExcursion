package com.msaggik.eighthlessonexcursion.entity;

public class TicketAdult extends Ticket {
    // поля
    private float ticketDiscount; // скидка на билет

    // конструкторы
    public TicketAdult() {
    }

    public TicketAdult(int id, float ticketPrice, int numberOfTickets, float ticketDiscount) {
        super(id, ticketPrice, numberOfTickets);
        this.ticketDiscount = ticketDiscount;
    }

    // геттеры и сеттеры
    public float getTicketDiscount() {
        return ticketDiscount;
    }

    public void setTicketDiscount(float ticketDiscount) {
        this.ticketDiscount = ticketDiscount;
    }

    // метод подсчёта стоимости детских билетов
    public float ticketPriceAll() {
        return getTicketPrice() * getNumberOfTickets() * (100 - ticketDiscount)/100;
    }
}
