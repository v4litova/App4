package com.example.app4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Fragment3 extends Fragment {

    public Fragment3() {
        super(R.layout.fragment_3);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            int myInt = bundle.getInt("some_int", 0);
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_3, container, false);
        RecyclerView itemsList = view.findViewById(R.id.recycleView);
        MyRecycleAdapter adapter = new MyRecycleAdapter(getContext(), generateItemListRecycle());
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        itemsList.setLayoutManager(layoutManager);
        itemsList.setAdapter(adapter);

        adapter.setOnItemClickListener(new MyRecycleAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(Item item) {
                Toast.makeText(getContext(), "Выбран элемент",Toast.LENGTH_SHORT).show();
                Log.d("Fragment3", "Выбран элемент");
            }
        });


        return view;
    }

    private List<Item> generateItemListRecycle() {
        List<Item> items = new ArrayList<>();

        items.add(new Item("Война и мир"));
        items.add(new Item("Преступление и наказание"));
        items.add(new Item("Мастер и Маргарита"));
        items.add(new Item("1984"));
        items.add(new Item("Улисс"));
        items.add(new Item("Анна Каренина"));
        items.add(new Item("Гарри Поттер и философский камень"));
        items.add(new Item("Мёртвые души"));
        items.add(new Item("Властелин колец"));
        items.add(new Item("Три товарища"));
        items.add(new Item("Алиса в стране чудес"));
        items.add(new Item("Маленький принц"));
        items.add(new Item("Атлант расправил плечи"));
        items.add(new Item("Тень горы"));
        items.add(new Item("Дюна"));
        items.add(new Item("Милый друг"));
        items.add(new Item("Шантарам"));
        items.add(new Item("Триумфальная арка"));
        items.add(new Item("Зеленая миля"));
        items.add(new Item("Фауст"));
        items.add(new Item("Архипелаг ГУЛАГ"));
        items.add(new Item("Гарри Поттер и узник Азкабана"));
        items.add(new Item("Дон Кихот"));
        items.add(new Item("Гарри Поттер и Дары смерти"));
        items.add(new Item("Идиот"));
        items.add(new Item("Гарри Поттер и Кубок огня"));
        items.add(new Item("Автостопом по галактике"));
        items.add(new Item("Герой нашего времени"));
        items.add(new Item("Горе от ума"));
        items.add(new Item("Милый друг"));
        items.add(new Item("Атлант расправил плечи"));
        items.add(new Item("Тень горы"));
        items.add(new Item("Дюна"));
        items.add(new Item("Милый друг"));
        items.add(new Item("Шантарам"));
        items.add(new Item("Триумфальная арка"));
        items.add(new Item("Зеленая миля"));
        items.add(new Item("Фауст"));
        items.add(new Item("Архипелаг ГУЛАГ"));
        items.add(new Item("Гарри Поттер и узник Азкабана"));
        items.add(new Item("Дон Кихот"));
        items.add(new Item("Гарри Поттер и Дары смерти"));
        items.add(new Item("Идиот"));
        items.add(new Item("Гарри Поттер и Кубок огня"));
        items.add(new Item("Автостопом по галактике"));
        items.add(new Item("Герой нашего времени"));
        items.add(new Item("Горе от ума"));
        items.add(new Item("Милый друг"));
        items.add(new Item("Моби Дик"));
        items.add(new Item("Великий Гэтсби"));
        items.add(new Item("Три товарища"));
        items.add(new Item("Атлант расправил плечи"));
        items.add(new Item("1984"));
        items.add(new Item("Мастер и Маргарита"));
        items.add(new Item("Преступление и наказание"));
        items.add(new Item("Маленький принц"));
        items.add(new Item("Алиса в стране чудес"));
        items.add(new Item("Война и мир"));
        items.add(new Item("Автостопом по галактике"));

        return items;
    }

}