package com.example.albumdetailsusingmvvm.service.remoteService;

import com.example.albumdetailsusingmvvm.common.Constants;
import com.example.albumdetailsusingmvvm.model.Album;

import java.util.List;

import io.reactivex.Single;

public class AlbumDataSource {

    AlbumService albumService;

    public AlbumDataSource() {
        albumService = ServiceProvider.getInstance().getAlbumService();
    }

    public Single<List<Album>> getAlbums(){
        return albumService.getAlbums();
    }
}
