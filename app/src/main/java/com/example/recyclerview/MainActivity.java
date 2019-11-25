package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView=findViewById(R.id.recyclerview);

        //create list od contacts to display in recycleview
        List<Contacts> contactsList=new ArrayList<>();
        contactsList.add(new Contacts("Kitty","9875682255",R.drawable.kitty));
        contactsList.add(new Contacts("Sheep","9836974455",R.drawable.sheep));
        contactsList.add(new Contacts("Rat","9876245784",R.drawable.rat));

        ContactsAdapter contactsAdapter=new ContactsAdapter(this,contactsList);
        recyclerView.setAdapter(contactsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
