package com.example.daryaapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.daryaapp.adapter.CategoryItemSeeMoreRecyclerAdapter;
import com.example.daryaapp.adapter.MainRecyclerAdapter;
import com.example.daryaapp.model.AllCategory;
import com.example.daryaapp.model.CategoryItem;

import java.util.ArrayList;
import java.util.List;

public class SeeMoreActivity extends AppCompatActivity {


    RecyclerView mainCategoryRecycler;
    RecyclerView seeMoreRecycler;
    MainRecyclerAdapter mainRecyclerAdapter;
    CategoryItemSeeMoreRecyclerAdapter categoryItemSeeMoreRecyclerAdapter;

    CategoryItem categoryItemList;
    int page;
  //  List<CategoryItem> categoryItemList ;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_see_more);

        //categoryItemList= new ArrayList<>();
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            String see = bundle.getString("seeMore");
            String id = bundle.getString("itemId");
            String image = bundle.getString("imageUrl");
            seeMoreRecycler = findViewById(R.id.seeMoreRecycler);

            textView.setText(see);

            fetchdata();
        }

    }

    private void fetchdata() {

        // added in first category

        List<CategoryItem> categoryItemList = new ArrayList<>();
        categoryItemList.add(new CategoryItem(1, R.drawable.taf_one,"Begana TextViewTextViewTextView1"));
        categoryItemList.add(new CategoryItem(1, R.drawable.taf_two,"Mard Hara Qawol astTextViewTextViewTextView2"));
        categoryItemList.add(new CategoryItem(1, R.drawable.taf_three,"Khakester TextViewTextViewTextView3"));
        categoryItemList.add(new CategoryItem(1, R.drawable.taf_four,"Hamasaye Ishq TextViewTextViewTextView4"));
        categoryItemList.add(new CategoryItem(1, R.drawable.taf_five,"Mujasema ha mekhandad TextViewTextViewTextView5"));
        categoryItemList.add(new CategoryItem(1, R.drawable.taf_six,"khakester 2 TextViewTextViewTextView6"));

        // added in second category
        List<CategoryItem> categoryItemList2 = new ArrayList<>();
        categoryItemList2.add(new CategoryItem(1, R.drawable.d_one,"Dunaye Asrar TextViewTextViewTextView11"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.d_two,"Zulaykha TextViewTextViewTextView12"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.d_three,"Bepanaa TextViewTextViewTextView13"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.d_four,"Zaman TextViewTextViewTextView14"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.d_five,"Wadi Gurg ha TextViewTextViewTextView15"));
        categoryItemList2.add(new CategoryItem(1, R.drawable.d_six,"Nehan TextViewTextViewTextView16"));

        // added in 3rd category
        List<CategoryItem> categoryItemList3 = new ArrayList<>();
        categoryItemList3.add(new CategoryItem(1, R.drawable.tur_one,"TextViewTextViewTextView111"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.tur_two,"TextViewTextViewTextView122"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.tur_three,"TextViewTextViewTextView133"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.tur_four,"TextViewTextViewTextView144"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.tur_five,"TextViewTextViewTextView155"));
        categoryItemList3.add(new CategoryItem(1, R.drawable.tur_six,"TextViewTextViewTextView166"));

        // added in 4th category
        List<CategoryItem> categoryItemList4 = new ArrayList<>();
        categoryItemList4.add(new CategoryItem(1, R.drawable.i_one,"TextViewTextViewTextView1111"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.i_two,"TextViewTextViewTextView1222"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.i_three,"TextViewTextViewTextView1333"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.i_four,"TextViewTextViewTextView1444"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.i_five,"TextViewTextViewTextView1555"));
        categoryItemList4.add(new CategoryItem(1, R.drawable.i_six,"TextViewTextViewTextView1666"));


        // added in 5th category
        List<CategoryItem> categoryItemList5 = new ArrayList<>();
        categoryItemList5.add(new CategoryItem(1, R.drawable.op_one,"TextViewTextViewTextView11111"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.op_two,"TextViewTextViewTextView12222"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.op_three,"TextViewTextViewTextView13333"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.op_four,"TextViewTextViewTextView14444"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.op_five,"TextViewTextViewTextView15555"));
        categoryItemList5.add(new CategoryItem(1, R.drawable.op_six,"TextViewTextViewTextView16666"));

        List<AllCategory> allCategoryList = new ArrayList<>();
        allCategoryList.add(new AllCategory("Treasures of Afghan Film","See All 1", categoryItemList));
        allCategoryList.add(new AllCategory("Dramas", "See All 2" , categoryItemList2));
        allCategoryList.add(new AllCategory("Turkish", "See All 3" , categoryItemList3));
        allCategoryList.add(new AllCategory("Indian", "See All 4" ,categoryItemList4));
        allCategoryList.add(new AllCategory("Original Production", "See All 5"  ,categoryItemList5));


        seeMoreRecycler = findViewById(R.id.seeMoreRecycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        seeMoreRecycler.setLayoutManager(layoutManager);
        categoryItemSeeMoreRecyclerAdapter = new CategoryItemSeeMoreRecyclerAdapter(this, categoryItemList);
        mainCategoryRecycler.setAdapter(categoryItemSeeMoreRecyclerAdapter);
    }

}