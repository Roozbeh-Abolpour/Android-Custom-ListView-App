package com.example.listviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public ListView listView;
    public myAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        User user=new User("person 1","9999","A@B.com",R.drawable.pic1);
        ArrayList<User> users=new ArrayList<User>();
        users.add(user);
        user=new User("person 2","9998","C@B.com",R.drawable.pic2);
        users.add(user);
        user=new User("person 3","9498","D@B.com",R.drawable.pic3);
        users.add(user);
        user=new User("person 4","9938","E@B.com",R.drawable.pic4);
        users.add(user);
        user=new User("person 5","1998","F@B.com",R.drawable.pic5);
        users.add(user);
        user=new User("person 6","9398","G@B.com",R.drawable.pic6);
        users.add(user);

        adapter=new myAdapter(getApplicationContext(),0,users);
        listView=(ListView)findViewById(R.id.lv);
        listView.setAdapter(adapter);
    }
}
