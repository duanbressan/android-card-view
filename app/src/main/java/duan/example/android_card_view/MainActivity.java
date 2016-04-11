package duan.example.android_card_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import duan.example.android_card_view.adapters.RecyclerViewAdapter;
import duan.example.android_card_view.models.Person;

public class MainActivity extends AppCompatActivity {

    private List<Person> persons;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView)findViewById(R.id.rv);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(llm);
        recyclerView.setHasFixedSize(true);

        initializeData();
        initializeAdapter();
    }

    private void initializeData(){
        persons = new ArrayList<>();
        persons.add(new Person("Duan Bressan", "https://github.com/duanbressan", R.drawable.duan));
        persons.add(new Person("Bruno da Luz", "https://github.com/brunov0id", R.drawable.bruno));
    }

    private void initializeAdapter(){
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(persons);
        recyclerView.setAdapter(adapter);
    }
}
