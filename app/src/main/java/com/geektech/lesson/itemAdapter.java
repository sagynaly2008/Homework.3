package com.geektech.lesson;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.homework3.Model;
import com.example.homework3.R;

import java.util.ArrayList;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.PersonViewHolder> {
    private ArrayList<Model> names = new ArrayList<>();

    public itemAdapter(ArrayList<Model> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new PersonViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_holder, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
        holder.onBind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class PersonViewHolder extends RecyclerView.ViewHolder {
        private ImageView image;
        private TextView textView;
        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            textView = itemView.findViewById(R.id.textView);
        }

        public void onBind(Model model) {
            image.setImageResource(model.getPhoto());
            textView.setText(model.getText());
        }
    }
}