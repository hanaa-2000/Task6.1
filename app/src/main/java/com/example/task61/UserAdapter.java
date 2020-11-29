package com.example.task61;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class UserAdapter extends BaseAdapter {
Context context;
ArrayList<User> data;
int recourse;
public UserAdapter(Context c,ArrayList<User> data,int recourse){
    this.context=c;
    this.data=data;
    this.recourse=recourse;
}

    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("SetTextI18n")
    @Override
    public View getView(int position, View view, ViewGroup parent) {
    View v=view;
    if(v==null) {
        v = LayoutInflater.from(context).inflate(recourse, parent, false);

    }
        TextView tvName=v.findViewById(R.id.tvName);
        TextView tvPhone=v.findViewById(R.id.tvPhone);

        User currentUser=data.get(position);
        tvName.setText(currentUser.getFirstName()+" "+currentUser.getLastName());
        tvPhone.setText( ""+currentUser.getPhone());
        return v;

    }
}
