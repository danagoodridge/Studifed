package com.example.studygroupfind;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;


// For each row, inflate the layout
public class GroupAdapter extends RecyclerView.Adapter<GroupAdapter.Viewholder>{

    // Pass in the context and list of tweets
    Context context;

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }

    //Bind values based on the position of the element
    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    // Define a viewholder

    public class Viewholder extends RecyclerView.ViewHolder {

        ImageView ivGroupProfileimage;
        EditText etGroupName;
        TextView tvGroupName;
        EditText etGroupSubject;
        TextView tvGroupSubject;

        public Viewholder(@NonNull View itemView) {
            super(itemView);
            ivGroupProfileimage = itemView.findViewById(R.id.ivGroupProfileimage);
            etGroupName = itemView.findViewById(R.id.etGroupName);
            tvGroupName = itemView.findViewById(R.id.tvGroupName);
            etGroupSubject = itemView.findViewById(R.id.etGroupSubject);
            tvGroupSubject = itemView.findViewById(R.id.tvGroupSubject);
        }
    }
}
