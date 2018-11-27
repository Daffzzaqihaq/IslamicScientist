package com.daffzzaqihaq.penemuislam;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Recycle extends AppCompatActivity {

    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    String[] namaHeroes, detailHeroes;
    int[] gambarHeroes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);


        namaHeroes = getResources().getStringArray(R.array.name);
        detailHeroes = getResources().getStringArray(R.array.detail);
        gambarHeroes = new int[]{R.drawable.ibnusina, R.drawable.khawarizmi, R.drawable.jabirlbhayyan, R.drawable.ibnualnafis, R.drawable.ibnukhaldun, R.drawable.alzahrawi, R.drawable.ibnuhaitham, R.drawable.omarkhayyam};

        Adapter adapter = new Adapter(Recycle.this, gambarHeroes, namaHeroes, detailHeroes);

        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(Recycle.this));
        myRecyclerView.setAdapter(adapter);
    }
}

