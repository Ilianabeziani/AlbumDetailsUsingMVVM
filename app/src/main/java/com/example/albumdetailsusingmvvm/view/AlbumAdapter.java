package com.example.albumdetailsusingmvvm.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.albumdetailsusingmvvm.R;
import com.example.albumdetailsusingmvvm.model.Album;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumViewHolder> {

    List<Album> albumList = new ArrayList<>();

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_view_item, parent, false);
        return new AlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder holder, int position) {
        Album result = albumList.get(position);
        holder.bind(result);

    }

    @Override
    public int getItemCount() {
        return albumList.size();
    }

    public void setAlbumList(List<Album> albums){
        if (!albumList.isEmpty()) {
            albumList.clear();
        }else{
            albumList.addAll(albums);
            notifyDataSetChanged();
        }
    }
}
