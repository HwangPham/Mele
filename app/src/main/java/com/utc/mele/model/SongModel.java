package com.utc.mele.model;

public class SongModel {
    private int idSong;
    private String nameSong, imageSong, nameSinger, linkSong;

    public SongModel(int idSong, String nameSong, String imageSong, String nameSinger, String linkSong) {
        this.idSong = idSong;
        this.nameSong = nameSong;
        this.imageSong = imageSong;
        this.nameSinger = nameSinger;
        this.linkSong = linkSong;
    }

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getNameSong() {
        return nameSong;
    }

    public void setNameSong(String nameSong) {
        this.nameSong = nameSong;
    }

    public String getImageSong() {
        return imageSong;
    }

    public void setImageSong(String imageSong) {
        this.imageSong = imageSong;
    }

    public String getNameSinger() {
        return nameSinger;
    }

    public void setNameSinger(String nameSinger) {
        this.nameSinger = nameSinger;
    }

    public String getLinkSong() {
        return linkSong;
    }

    public void setLinkSong(String linkSong) {
        this.linkSong = linkSong;
    }
}
