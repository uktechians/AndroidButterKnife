package com.uktechians.androidbutterknife.demo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.uktechians.androidbutterknife.R;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CustomAdapter extends BaseAdapter {

    View view;
    ViewHolder holder;
    List<ModelUser> users = new ArrayList<>();
    Context context;

    public CustomAdapter(List<ModelUser> users, Context context) {
        this.users = users;
        this.context = context;
    }

    @Override
    public int getCount() {
        return users.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.custom_item, parent, false);
        holder = new ViewHolder(view);

        holder.tv_name.setText(users.get(position).getName());
        holder.tv_phone_no.setText(users.get(position).getPhone());

        return view;
    }

    public static class ViewHolder {
        @BindView(R.id.tv_name)
        TextView tv_name;
        @BindView(R.id.tv_phone_no)
        TextView tv_phone_no;

        public ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }

}
