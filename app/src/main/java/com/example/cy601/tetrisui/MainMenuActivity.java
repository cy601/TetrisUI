package com.example.cy601.tetrisui;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class MainMenuActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 实现全屏显示，要放在这里
        // 请求不显示TitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 请求设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_menu);

        Button startBtn = (Button) findViewById(R.id.startBtn);
        Button battleBtn = (Button) findViewById(R.id.battleBtn);
        Button starsBtn = (Button) findViewById(R.id.starsBtn);
        Button optionBtn = (Button) findViewById(R.id.optionBtn);
        Button quitBtn = (Button) findViewById(R.id.quitBtn);

//        // 设置我们按钮使用第三方字体
        Typeface tp = Typeface.createFromAsset(this.getAssets(),
                "SFSlapstickComicShaded.ttf");
//
//        // 设置字体
        startBtn.setTypeface(tp);
        // 设置字体的大小
        startBtn.setTextSize(26);

        // 设置字体
        battleBtn.setTypeface(tp);
        // 设置字体的大小
        battleBtn.setTextSize(26);
        // 设置字体
        starsBtn.setTypeface(tp);
        // 设置字体的大小
        starsBtn.setTextSize(26);
        // 设置字体
        optionBtn.setTypeface(tp);
        // 设置字体的大小
        optionBtn.setTextSize(26);
        // 设置字体
        quitBtn.setTypeface(tp);
        // 设置字体的大小
        quitBtn.setTextSize(26);
    }

    public void onStart(View v) {
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        Util.clikeAudioNormal(this);
        Log.d("MyTAG", "onStart");
    }

    public void onBattle(View v) {
        // 从资源文件中创建媒体文件，第一参数是哪个页面中使用这音频文件，第二个是那个音频文件
        // MediaPlayer mp = MediaPlayer.create(this, R.raw.audio_click);
        // mp.start();
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        // 页面跳转说明怎么跳转
        Intent intent = new Intent(MainMenuActivity.this,
                BattleMenuActivity.class);
        // 才是真正的跳转
        startActivity(intent);
        Util.clikeAudioNormal(this);

        Log.d("MyTAG", "onBattle");
    }

    public void onStars(View v) {
        Log.d("MyTAG", "onStars");
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        Util.clikeAudioNormal(this);
    }

    public void onOptions(View v) {
        Log.d("MyTAG", "onOptions");
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        Util.clikeAudioNormal(this);
    }

    public void onQuit(View v) {
        Log.d("MyTAG", "onQuit");
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        MediaPlayer mp = MediaPlayer.create(this, R.raw.audio_quit);
        mp.start();
        this.finish();
    }

}
