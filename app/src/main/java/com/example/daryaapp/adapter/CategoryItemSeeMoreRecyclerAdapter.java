package com.example.daryaapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.daryaapp.ItemActivity;
import com.example.daryaapp.R;
import com.example.daryaapp.model.CategoryItem;

import java.util.List;

public class CategoryItemSeeMoreRecyclerAdapter extends RecyclerView.Adapter<CategoryItemSeeMoreRecyclerAdapter.CategoryItemViewHolder> {

    private Context context;
    private List<CategoryItem> categoryItemList;

    public CategoryItemSeeMoreRecyclerAdapter(Context context, List<CategoryItem> categoryItemList) {
        this.context = context;
        this.categoryItemList = categoryItemList;
    }

    @NonNull
    @Override
    public CategoryItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CategoryItemViewHolder(LayoutInflater.from(context).inflate(R.layout.see_more_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryItemViewHolder holder, final int position) {

            holder.itemImage.setImageResource(categoryItemList.get(position).getImageUrl());
//            holder.textView.setText(categoryItemList.get(position).getDesc());

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(context, ItemActivity.class);
                    intent.putExtra("imageOne",categoryItemList.get(position).getImageUrl());
                    intent.putExtra("desc",categoryItemList.get(position).getDesc());
                    context.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return categoryItemList.size();
    }

    public static final class CategoryItemViewHolder extends RecyclerView.ViewHolder{

        ImageView itemImage;
       // TextView textView;

        public CategoryItemViewHolder(@NonNull View itemView) {
            super(itemView);
          //  textView = itemView.findViewById(R.id.descOne);
            itemImage = itemView.findViewById(R.id.item_image);

        }
    }

}
