package com.utc.mele.model;

import android.net.Uri;

public class PlaylistModel {
    private String title, artist, duration;
    private boolean isPlaying;
    private Uri musicFile;

    public PlaylistModel(String title, String artist, String duration, boolean isPlaying, Uri musicFile) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.isPlaying = isPlaying;
        this.musicFile = musicFile;
    }

    public Uri getMusicFile() {
        return musicFile;
    }

    public void setMusicFile(Uri musicFile) {
        this.musicFile = musicFile;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }
}
