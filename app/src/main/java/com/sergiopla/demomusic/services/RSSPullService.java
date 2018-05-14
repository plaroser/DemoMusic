package com.sergiopla.demomusic.services;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;

public class RSSPullService extends IntentService  {
    public RSSPullService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {

    }
/*
    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    protected void onHandleIntent(Intent workIntent) {
        // Gets data from the incoming Intent
        String dataString = workIntent.getDataString();
        // Do work here, based on the contents of dataString
    }

    @Override
    public void release() {

    }

    @Override
    public void cueVideo(String s) {

    }

    @Override
    public void cueVideo(String s, int i) {

    }

    @Override
    public void loadVideo(String s) {

    }

    @Override
    public void loadVideo(String s, int i) {

    }

    @Override
    public void cuePlaylist(String s) {

    }

    @Override
    public void cuePlaylist(String s, int i, int i1) {

    }

    @Override
    public void loadPlaylist(String s) {

    }

    @Override
    public void loadPlaylist(String s, int i, int i1) {

    }

    @Override
    public void cueVideos(List<String> list) {

    }

    @Override
    public void cueVideos(List<String> list, int i, int i1) {

    }

    @Override
    public void loadVideos(List<String> list) {

    }

    @Override
    public void loadVideos(List<String> list, int i, int i1) {

    }

    @Override
    public void play() {

    }

    @Override
    public void pause() {

    }

    @Override
    public boolean isPlaying() {
        return false;
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    @Override
    public void next() {

    }

    @Override
    public void previous() {

    }

    @Override
    public int getCurrentTimeMillis() {
        return 0;
    }

    @Override
    public int getDurationMillis() {
        return 0;
    }

    @Override
    public void seekToMillis(int i) {

    }

    @Override
    public void seekRelativeMillis(int i) {

    }

    @Override
    public void setFullscreen(boolean b) {

    }

    @Override
    public void setOnFullscreenListener(OnFullscreenListener onFullscreenListener) {

    }

    @Override
    public void setFullscreenControlFlags(int i) {

    }

    @Override
    public int getFullscreenControlFlags() {
        return 0;
    }

    @Override
    public void addFullscreenControlFlag(int i) {

    }

    @Override
    public void setPlayerStyle(PlayerStyle playerStyle) {

    }

    @Override
    public void setShowFullscreenButton(boolean b) {

    }

    @Override
    public void setManageAudioFocus(boolean b) {

    }

    @Override
    public void setPlaylistEventListener(PlaylistEventListener playlistEventListener) {

    }

    @Override
    public void setPlayerStateChangeListener(PlayerStateChangeListener playerStateChangeListener) {

    }

    @Override
    public void setPlaybackEventListener(PlaybackEventListener playbackEventListener) {

    }
    */
}
