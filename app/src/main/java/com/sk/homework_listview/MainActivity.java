package com.sk.homework_listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.sk.homework_listview.adapter.MessageAdapter;
import com.sk.homework_listview.model.Message;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    MessageAdapter messageAdapter;
    List<Message> messagess=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  setContentView(R.layout.activity_song);
        messagess.add(new Message("012 666 777","Message01"));
        messagess.add(new Message("012 555 777","Message02"));
        messagess.add(new Message("012 566 777","Message03"));
        messagess.add(new Message("012 455 777","Message04"));
        messagess.add(new Message("012 666 777","Message03"));
        messagess.add(new Message("012 555 777","Message05"));
        messagess.add(new Message("012 566 777","Message06"));
        messagess.add(new Message("012 455 777","Message07"));

        listView=findViewById(R.id.list_view1);
        messageAdapter=new MessageAdapter(this,messagess);
        listView.setAdapter(messageAdapter);
    }


}
