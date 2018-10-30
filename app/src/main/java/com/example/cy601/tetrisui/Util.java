package com.example.cy601.tetrisui;

import android.content.Context;
import android.media.MediaPlayer;

public class Util {
    private static MediaPlayer mp = null;

    public static void clikeAudioNormal(Context context) {
        // 首先需要一个MediaPlayer，所以这边声明了
        // 获得，需要判断，没有的话才去相应的获得
        if (mp == null) {
            mp = MediaPlayer.create(context, R.raw.audio_click);
        }
        mp.start();
    }

}