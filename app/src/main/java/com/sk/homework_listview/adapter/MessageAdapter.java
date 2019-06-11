package com.sk.homework_listview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.sk.homework_listview.R;
import com.sk.homework_listview.model.Message;

import java.util.List;

public class MessageAdapter extends BaseAdapter {
    List<Message> messages;

    Context context;

    public MessageAdapter(Context context,List<Message> message)
    {
        this.context=context;
        this.messages = message;
    }
//  //  public MessageAdapter(List<Message> message) {
//        this.messages = message;
//    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if(convertView!=null)
            view=convertView;
        else{
            view= LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.message_item_layout,parent,false);
        }
        // pass data to layout

        TextView contact_number=view.findViewById(R.id.contact_naumber);
        TextView message_content=view.findViewById(R.id.message_content);
        Message message=messages.get(position);
        contact_number.setText(message.getNumber());
        message_content.setText(message.getMessage_content());
        return view;
    }

    @Override
    public int getCount() {
        return messages.size();
    }

    @Override
    public Object getItem(int position) {
        return messages.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

}
