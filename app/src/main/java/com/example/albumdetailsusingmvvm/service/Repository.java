package com.example.albumdetailsusingmvvm.service;

import com.example.albumdetailsusingmvvm.model.Album;
import com.example.albumdetailsusingmvvm.service.remoteService.AlbumDataSource;

import java.util.List;

import io.reactivex.Single;

public class Repository {

    AlbumDataSource albumDataSource;

    public Repository() {
        albumDataSource = new AlbumDataSource();
    }

    public Single<List<Album>> getAlbums(){
        return albumDataSource.getAlbums();
    }
}
