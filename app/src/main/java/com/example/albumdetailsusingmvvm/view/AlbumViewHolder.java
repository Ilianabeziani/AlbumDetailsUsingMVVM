package com.example.albumdetailsusingmvvm.view;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.albumdetailsusingmvvm.R;
import com.example.albumdetailsusingmvvm.model.Album;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;

public class AlbumViewHolder extends RecyclerView.ViewHolder {


    @BindView(R.id.title)
    TextView title;

    private Context context;

    public AlbumViewHolder(@NonNull View itemView) {
        super(itemView);
        context = itemView.getContext();
        ButterKnife.bind(this, itemView);
    }

    public void bind(Album album){
        title.setText(album.getTitle());
    }

}
