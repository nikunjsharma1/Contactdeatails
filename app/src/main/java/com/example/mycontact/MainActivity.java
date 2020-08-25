package com.example.mycontact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView contactRecView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contactRecView=findViewById(R.id.contactRecView);
        ArrayList<contact> contacts=new ArrayList<>();
        contacts.add(new contact("nikunj","nikunj@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wonderslist.com%2Ftop-10-awesome-celebs%2F&psig=AOvVaw3u9Gy8iaRlzMnGdG_h4rma&ust=1598419696883000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPC6wdfPtesCFQAAAAAdAAAAABAJ.jpg"));
        contacts.add(new contact("scscss","abcd@gmail","https://www.wonderslist.com/wp-content/uploads/2014/09/Keanu-Reeves.jpg"));
        contacts.add(new contact("ahbcbad","uchjd@gmail","https://cdn.shopify.com/s/files/1/0182/8937/files/Brad_Pitt_1024x1024.jpg?v=1482503727.jpg"));
        contacts.add(new contact("nikunj","nikunj@gmail.com","https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wonderslist.com%2Ftop-10-awesome-celebs%2F&psig=AOvVaw3u9Gy8iaRlzMnGdG_h4rma&ust=1598419696883000&source=images&cd=vfe&ved=0CAIQjRxqFwoTCPC6wdfPtesCFQAAAAAdAAAAABAJ.jpg"));
        contacts.add(new contact("scscss","abcd@gmail","https://www.wonderslist.com/wp-content/uploads/2014/09/Keanu-Reeves.jpg"));
        contacts.add(new contact("ahbcbad","uchjd@gmail","https://cdn.shopify.com/s/files/1/0182/8937/files/Brad_Pitt_1024x1024.jpg?v=1482503727.jpg"));
        contacts.add(new contact("scscss","abcd@gmail","https://www.wonderslist.com/wp-content/uploads/2014/09/Keanu-Reeves.jpg"));
        contacts.add(new contact("ahbcbad","uchjd@gmail","https://cdn.shopify.com/s/files/1/0182/8937/files/Brad_Pitt_1024x1024.jpg?v=1482503727.jpg"));
        adapterContact adapter=new adapterContact(this);
        adapter.setContacts(contacts);
        contactRecView.setAdapter(adapter);
        contactRecView.setLayoutManager(new LinearLayoutManager(this));
    }

    }
