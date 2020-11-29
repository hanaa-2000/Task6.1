package com.example.task61;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listuser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listuser=findViewById(R.id.Listview);
        ArrayList<User> values=new ArrayList<>();
        values.add(new User("User1","Last1",768883));
        values.add(new User("User2","Last2",876332));
        values.add(new User("User3","Last3",229854));
        values.add(new User("User4","Last4",856564));
        values.add(new User("User5","Last5",388840));
        UserAdapter adapter=new UserAdapter(this,values,R.layout.item_user);
        listuser.setAdapter(adapter);
    }
}