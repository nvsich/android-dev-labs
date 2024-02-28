package com.example.task5.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.task5.R;

import java.util.ArrayList;

public class TweetAdapter extends RecyclerView.Adapter<TweetAdapter.ViewHolder> {
    private Context context;
    private ArrayList<String> tweetTexts;
    private ArrayList<Integer> tweetImages;

    public TweetAdapter(Context context, ArrayList<String> tweetTexts, ArrayList<Integer> tweetImages) {
        this.context = context;
        this.tweetTexts = tweetTexts;
        this.tweetImages = tweetImages;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView.setText(tweetTexts.get(position));
        holder.imageView.setImageResource(tweetImages.get(position));
    }

    @Override
    public int getItemCount() {
        return tweetTexts.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView textView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.imageinfo);
        }
    }
}
