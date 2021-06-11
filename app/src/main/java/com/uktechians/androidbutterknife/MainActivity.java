package com.uktechians.androidbutterknife;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.uktechians.androidbutterknife.demo.DemoActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.ed_username)
    EditText username;
    @BindView(R.id.ed_pass)
    EditText password;
    @BindView(R.id.btn_save)
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_save)
    public void save(View view){
       if (username.getText().length()>0 && password.getText().length()>0){
           Toast.makeText(this, "Save Data", Toast.LENGTH_SHORT).show();
           startActivity(new Intent(this, DemoActivity.class));
       }
       else {
           Toast.makeText(this, "Failed to Save Data", Toast.LENGTH_SHORT).show();
       }
    }
}