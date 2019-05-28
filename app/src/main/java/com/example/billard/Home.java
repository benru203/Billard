package com.example.billard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class Home  extends AppCompatActivity {

    private RecyclerView listPool;
    private ArrayList<Pool> pools;
    private PoolAdapter adapter;
    private LinearLayoutManager llm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        listPool = (RecyclerView) findViewById(R.id.listPool);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("pools");
        pools = new ArrayList<>();

        pools.add(new Pool(1,true));
        adapter = new PoolAdapter(Home.this,pools);
        llm = new LinearLayoutManager(Home.this);
        listPool.setLayoutManager(llm);
        listPool.setAdapter(adapter);
        myRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                /*
                pools = new ArrayList<>();
                for(DataSnapshot objSnapShot : dataSnapshot.getChildren()){
                    Pool pool = objSnapShot.getValue(Pool.class);
                    System.out.println(objSnapShot.getValue().toString());
                    pools.add(pool);
                }
                adapter = new PoolAdapter(Home.this,pools);
                llm = new LinearLayoutManager(Home.this);
                listPool.setLayoutManager(llm);
                listPool.setAdapter(adapter);
                */
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
            }
        });
    }
}
