package com.example.tiket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.tiket.model.ChildTicket;
import com.example.tiket.model.RetireeTicket;
import com.example.tiket.model.Tiсket;

public class MainActivity extends AppCompatActivity {

    Tiсket tiсket = new Tiсket(70, 9);
    Tiсket childTicket = new ChildTicket(70,11, 50 );
    Tiсket retireeTicket = new RetireeTicket(70, 5, 30);

    private TextView railwayTicketOut;
    private TextView railwayChildTicketOut;
    private TextView railwayRetireeTicketOut;
    private TextView railwayTicketTotalOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        railwayTicketOut = findViewById(R.id.railwayTicketOut);
        railwayChildTicketOut = findViewById(R.id.railwayChildTicketOut);
        railwayRetireeTicketOut = findViewById(R.id.railwayRetireeTicketOut);
        railwayTicketTotalOut = findViewById(R.id.railwayTicketTotalOut);

        float overallPrice = tiсket.ticketPriceAll();
        float overallChildPrice = childTicket.ticketPriceAll();
        float overallRetireePrice = retireeTicket.ticketPriceAll();

        railwayTicketOut.setText(overallPrice + " монет");
        railwayChildTicketOut.setText(overallChildPrice + " монет");
        railwayRetireeTicketOut.setText(overallRetireePrice + " монет");
        railwayTicketTotalOut.setText((overallPrice + overallChildPrice + overallRetireePrice) + " монет");

    }
}