package com.example.customarrayadapter2;

public class Song {

    private String mSongName;
    private String mSinger;

    public Song(String mSongName, String mSinger) {
        this.mSongName = mSongName;
        this.mSinger = mSinger;
    }

    public void setmSongName(String mSongName) {
        this.mSongName = mSongName;
    }

    public void setmSinger(String mSinger) {
        this.mSinger = mSinger;
    }

    public String getmSongName() {
        return mSongName;
    }

    public String getmSinger() {
        return mSinger;
    }
}
