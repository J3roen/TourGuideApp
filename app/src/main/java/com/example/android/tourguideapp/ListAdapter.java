package com.example.android.tourguideapp;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.ViewHolder> {
    private ArrayList<ListItem> mDataset = new ArrayList<>();

    /** Provide a reference to the views for each data item
     Complex data items may need more than one view per item, and
     you provide access to all the views for a data item in a view holder */
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public ImageView img;
        public TextView name, location;

        public ViewHolder(View v) {
            super(v);
            img = v.findViewById(R.id.listItem_img);
            name = v.findViewById(R.id.listItem_title);
            location = v.findViewById(R.id.listItem_location);
        }
    }

    /** Provide a suitable constructor (depends on the kind of dataset) */
    public ListAdapter(ArrayList<ListItem> myDataset) {
        mDataset = myDataset;
    }

    /** Create new views (invoked by the layout manager)*/
    @Override
    public ListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        /** create a new view*/
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new ViewHolder(itemView);
    }

    /** Replace the contents of a view (invoked by the layout manager)*/
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        /** - get element from your dataset at this position
        / - replace the contents of the view with that element*/
        ListItem item = mDataset.get(position);
        holder.img.setImageDrawable(Resources.getSystem().getDrawable(item.getImgId()));
        holder.name.setText(item.getName());
        holder.location.setText(item.getLocation());
    }

    /** Return the size of the dataset (invoked by the layout manager)*/
    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}