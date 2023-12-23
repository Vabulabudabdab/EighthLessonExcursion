package com.msaggik.eighthlessonexcursion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.msaggik.eighthlessonexcursion.entity.Ticket;
import com.msaggik.eighthlessonexcursion.entity.TicketAdult;
import com.msaggik.eighthlessonexcursion.entity.TicketChild;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    // создание полей
     private Ticket ticket, ticketChild, tickedAdult; // поля сущностей билетов

    // создание дополнительных полей для вывода на экран полученных значений
    private TextView infoApp; // поле вывода информации анализа строки

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // создание объектов сущностей билетов
        ticket = new Ticket(1, 35, 12);
        ticketChild = new TicketChild(2, 35, 14, 50f);
        tickedAdult = new TicketAdult(3, 35, 10, 45f);

//        Группа состоит из 12 молодых взрослых 10 пенсионеров и 14 детей
//        Автобус отправляется в 10.00 7 сентября
//        Стоимость взрослого билета 35 монет, детский билет с 50% скидкой,
//                пенсионерский билет с 45% скидкой

        // привязка поля к разметке по id
        infoApp = findViewById(R.id.infoApp);

        // расчёт стоимости билетов
        float ticketPrice = ticket.ticketPriceAll();
        float ticketPriceChild = ticketChild.ticketPriceAll();
        float ticketPriceAll = ticketPrice + ticketPriceChild;
        float ticketdPriceAdult = tickedAdult.ticketPriceAll();

        // вывод информации на экран смартфона
        infoApp.setText("Стоимость всех билетов " + ticketPriceAll + " монет\n"
                + "Из которых детские билеты стоят " + ticketPriceChild + " монет,"
                + "\n" + "взрослые " + ticketPrice + " монет" + "\n"
                + "билеты для пенсионеров:" + ticketdPriceAdult + " монет" + "\n"
                + "Автобус отправляется в 10.00 7 сентября!" + "\n" + "Не опаздывайте!");
    }
}