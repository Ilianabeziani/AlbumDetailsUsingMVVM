package com.example.albumdetailsusingmvvm.model;

import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class AlbumState extends Album {

    private List<Album> albumList = new ArrayList<>();

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    public void addAll(List<Album> albums){
        albumList.addAll(albums);
    }
}
