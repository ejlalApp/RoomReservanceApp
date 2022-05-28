package com.example.roomreservationhotel;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class ResearveRoom extends AppCompatActivity {
    private static final String TAG = "Rooms";
    ListView li_v;

    String roomTitle[]= {"Room 1", "Room 2", "Room 3", "Room 4", "Room 5", "Room 6", "Room 7", "Room 8",
            "Room 9", "Room 10"};
    int roomPic[]= {R.drawable.room, R.drawable.room, R.drawable.room, R.drawable.room, R.drawable.room,
            R.drawable.room, R.drawable.room, R.drawable.room, R.drawable.room, R.drawable.room};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_researve_room);

        li_v= findViewById(R.id.list_v);

        Myadapter myadapter= new Myadapter(this, roomTitle, roomPic);
        li_v.setAdapter(myadapter);

        li_v.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i==0){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
                if (i==1){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
                if (i==2){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
                if (i==3){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
                if (i==4){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
                if (i==5){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
                if (i==6){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
                if (i==7){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
                if (i==8){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
                if (i==9){
                    startActivity(new Intent(ResearveRoom.this, PaymentCalculations.class));
                    finish();
                }
            }
        });
    }

    class Myadapter extends ArrayAdapter<String> {
        Context context;
        String rTitle[];
        int rImages[];

        Myadapter(Context c, String title[], int imgs[]){
            super(c, R.layout.room_list, R.id.textView1, title);
            this.context=c;
            this.rTitle=title;
            this.rImages= imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater= (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row= layoutInflater.inflate(R.layout.room_list, parent, false);
            ImageView images= row.findViewById(R.id.image);
            TextView myTitle= row.findViewById(R.id.textView1);
            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            return row;
        }
    }


    @Override
    public void onBackPressed() {
        startActivity(new Intent(ResearveRoom.this, MenuOptions.class));
        finish();
    }
}