package com.example.recycleview.Category;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;
import com.example.recycleview.dog.Item;
import com.example.recycleview.dog.RecyclerDataAdapter;

import java.util.List;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryViewHolder> {
    private List<Category> categoryList;
    private Context context;

    public CategoryAdapter(Context context) {
        this.context = context;
    }
    public void setData(List<Category> list){
        this.categoryList=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public CategoryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_name_category, parent, false);
        return  new CategoryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryViewHolder holder, int position) {
        Category category=categoryList.get(position);
        if (category == null) {
            return;
        }
        holder.Tv_Category.setText(category.getNameCategory());

        LinearLayoutManager linearLayoutManager= new LinearLayoutManager(context,RecyclerView.HORIZONTAL,false);
        holder.rcv_Dog.setLayoutManager(linearLayoutManager);

        RecyclerDataAdapter recyclerDataAdapter = new RecyclerDataAdapter();
        recyclerDataAdapter.setData(category.getItemList());
        holder.rcv_Dog.setAdapter(recyclerDataAdapter);
    }

    @Override
    public int getItemCount() {
        if (categoryList!=null){
            return categoryList.size();
        }
        return 0;
    }

    public class CategoryViewHolder extends RecyclerView.ViewHolder{
        private TextView Tv_Category;
        private RecyclerView rcv_Dog;
        public CategoryViewHolder(@NonNull View itemView){
            super(itemView);
            Tv_Category= itemView.findViewById(R.id.tv_name_Category);
            rcv_Dog = itemView.findViewById(R.id.rcv_dog);
        }
    }
}
