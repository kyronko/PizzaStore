package com.tjedit.pizzastore;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Adapter;

import com.tjedit.pizzastore.adapters.PizzaAdapter;
import com.tjedit.pizzastore.databinding.ActivityMainBinding;
import com.tjedit.pizzastore.datas.PizzaData;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity{

    ActivityMainBinding act;
    List<PizzaData> pizzaData = new ArrayList<>();
    PizzaAdapter pizzaAdapter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        act = DataBindingUtil.setContentView(this,R.layout.activity_main);
        super.onCreate(savedInstanceState);

        pizzaAdapter = new PizzaAdapter(MainActivity.this, pizzaData);
        act.pizzaList.setAdapter(pizzaAdapter);

        fill();

    }
    void fill(){
        pizzaData.add(new PizzaData("도미넛피자","09:00~21:00"));
        pizzaData.add(new PizzaData("피자헛피자","09:00~21:00"));
        pizzaData.add(new PizzaData("맥시코피자","09:00~21:00"));
        pizzaData.add(new PizzaData("한국피자","09:00~21:00"));

    }
}
