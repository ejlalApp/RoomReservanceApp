package com.example.roomreservationhotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class ReadRoomStatus extends AppCompatActivity {
    TextView t1, t2, t3,t4,t5,t6,t7,t8,t9,t10;
    private FirebaseDatabase firebaseDatabase;
    DatabaseReference ref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_read_room_status);


        t1= (TextView) findViewById(R.id.rt1);
        t2= (TextView) findViewById(R.id.rt2);
        t3= (TextView) findViewById(R.id.rt3);
        t4= (TextView) findViewById(R.id.rt4);
        t5= (TextView) findViewById(R.id.rt5);
        t6= (TextView) findViewById(R.id.rt6);
        t7= (TextView) findViewById(R.id.rt7);
        t8= (TextView) findViewById(R.id.rt8);
        t9= (TextView) findViewById(R.id.rt9);
        t10= (TextView) findViewById(R.id.rt10);

        firebaseDatabase= FirebaseDatabase.getInstance();
        ref = FirebaseDatabase.getInstance().getReference("roomStatus");
        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Rooms rooms=dataSnapshot.getValue(Rooms.class);
                t1.setText("Room 1: "+rooms.getRoom1());
                t2.setText("Room 2: "+rooms.getRoom2());
                t3.setText("Room 3: "+rooms.getRoom3());
                t4.setText("Room 4: "+rooms.getRoom4());
                t5.setText("Room 5: "+rooms.getRoom5());
                t6.setText("Room 6: "+rooms.getRoom6());
                t7.setText("Room 7: "+rooms.getRoom7());
                t8.setText("Room 8: "+rooms.getRoom8());
                t9.setText("Room 9: "+rooms.getRoom9());
                t10.setText("Room 10: "+rooms.getRoom10());
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {
                Toast.makeText(ReadRoomStatus.this, databaseError.getCode(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onBackPressed() {
        //Display alert message when back button has been pressed
        startActivity(new Intent(ReadRoomStatus.this, MenuOptions.class));
        finish();
    }
}