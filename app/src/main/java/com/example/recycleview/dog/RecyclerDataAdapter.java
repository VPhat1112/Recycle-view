package com.example.recycleview.dog;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview.R;

import java.util.List;

public class RecyclerDataAdapter extends RecyclerView.Adapter<RecyclerDataAdapter.DataViewHolder> {

    private List<Item> itemList;
    private Context context;

    public void setData(List<Item> list){
        this.itemList=list;
        notifyDataSetChanged();
    }



    @Override
    public int getItemCount() {
        return itemList == null ? 0 : itemList.size();
    }

    @Override
    public RecyclerDataAdapter.DataViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView;
        itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_names, parent, false);

        return new DataViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(RecyclerDataAdapter.DataViewHolder holder, int position) {
        Item item = itemList.get(position);
        if (itemList==null){
            return;
        }
        holder.tvName.setText(item.getItemName());
        holder.tvinfo.setText(item.getItemInfo());
        holder.tvimages.setImageResource(item.getImages_pet());

    }

    /**
     * Data ViewHolder class.
     */
    public static class DataViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName,tvinfo;
        private ImageView tvimages;

        public DataViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.textView_itemName);
            tvinfo = (TextView) itemView.findViewById(R.id.textView_info);
            tvimages = (ImageView) itemView.findViewById(R.id.imageView_dinner);
        }
    }
}
