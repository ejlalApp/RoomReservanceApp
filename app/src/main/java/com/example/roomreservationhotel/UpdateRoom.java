package com.example.roomreservationhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class UpdateRoom extends AppCompatActivity {
    TextView m1, m2, m3, m4, m5, m6, m7, m8, m9, m10;
    private FirebaseDatabase firebaseDatabase;
    DatabaseReference ref;
    String a1, a2, a3, a4, a5, a6, a7, a8, a9, a10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_room);

        m1= (TextView) findViewById(R.id.t1);
        m2= (TextView) findViewById(R.id.t2);
        m3= (TextView) findViewById(R.id.t3);
        m4= (TextView) findViewById(R.id.t4);
        m5= (TextView) findViewById(R.id.t5);
        m6= (TextView) findViewById(R.id.t6);
        m7= (TextView) findViewById(R.id.t7);
        m8= (TextView) findViewById(R.id.t8);
        m9= (TextView) findViewById(R.id.t9);
        m10= (TextView) findViewById(R.id.t10);
        firebaseDatabase= FirebaseDatabase.getInstance();
        ref = FirebaseDatabase.getInstance().getReference("roomStatus");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Rooms rooms=dataSnapshot.getValue(Rooms.class);
                a1= rooms.getRoom1();
                a2= rooms.getRoom2();
                a3= rooms.getRoom3();
                a4= rooms.getRoom4();
                a5= rooms.getRoom5();
                a6= rooms.getRoom6();
                a7= rooms.getRoom7();
                a8= rooms.getRoom8();
                a9= rooms.getRoom9();
                a10= rooms.getRoom10();
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(UpdateRoom.this, databaseError.getCode(), Toast.LENGTH_SHORT).show();
            }
        });


        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a1.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(r1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room1 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(r1, a2, a3, a4, a5, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room1 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        m2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a2.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(a1, r1, a3, a4, a5, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room2 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(a1, r1, a3, a4, a5, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room2 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }

            }
        });
        m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a3.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(a1, a2, r1, a4, a5, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room3 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(a1, a2, r1, a4, a5, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room3 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a4.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, r1, a5, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room4 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, r1, a5, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room4 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        m5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a5.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, r1, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room5 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, r1, a6, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room5 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        m6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a6.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, r1, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room6 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, r1, a7, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room6 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        m7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a7.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, a6, r1, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room7 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, a6, r1, a8, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room7 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        m8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a8.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, a6, a7, r1, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room8 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, a6, a7, r1, a9, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room8 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        m9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a9.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, a6, a7, a8, r1, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room9 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, a6, a7, a8, r1, a10);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room9 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });
        m10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a10.equals("reserve")) {
                    String r1 = "not-reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, a6, a7, a8, a9, r1);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room10 Status is changed to not-Reserved", Toast.LENGTH_SHORT).show();
                }
                else {
                    String r1 = "reserve";
                    Rooms userRooms = new Rooms(a1, a2, a3, a4, a5, a6, a7, a8, a9, r1);
                    ref.setValue(userRooms);
                    Toast.makeText(UpdateRoom.this, "Room10 Status is changed to Reserved", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    @Override
    public void onBackPressed() {
        //Display alert message when back button has been pressed
        startActivity(new Intent(UpdateRoom.this, MenuOptions.class));
        finish();
    }
}