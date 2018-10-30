package com.example.cy601.tetrisui;

import android.app.Activity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.util.Log;
import android.view.HapticFeedbackConstants;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class BattleMenuActivity extends Activity{
    private Button campaignBtn,marathonBtn,quitBtn;

    public BattleMenuActivity() {
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // 实现全屏显示，要放在这里
        // 请求不显示TitleBar
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        // 请求设置全屏
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        // 给我这个页面设置布局显示内容，指定的是刚才我们修改的那个布局文件
        setContentView(R.layout.battle_activity);
        campaignBtn=findViewById(R.id.campaignBtn);
        marathonBtn=findViewById(R.id.marathonBtn);
        quitBtn=findViewById(R.id.quitBtn);
        setFont();

    }

    void setFont() {


        //        // 设置我们按钮使用第三方字体
        Typeface tp = Typeface.createFromAsset(this.getAssets(),
                "SFSlapstickComicShaded.ttf");
        //设置字体
        campaignBtn.setTypeface(tp);
        // 设置字体的大小
        campaignBtn.setTextSize(26);
        marathonBtn.setTypeface(tp);
        marathonBtn.setTextSize(26);
        quitBtn.setTypeface(tp);
        quitBtn.setTextSize(26);



    }
    public void onCampaign(View v) {
        Util.clikeAudioNormal(this);
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        Log.d("TAG", "onCampaign");
    }

    public void onMarathon(View v) {
        Util.clikeAudioNormal(this);
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        Log.d("TAG", "onMarathon");
    }

    public void onQuit(View v) {
        Util.clikeAudioNormal(this);
        v.performHapticFeedback(HapticFeedbackConstants.LONG_PRESS);
        Log.d("TAG", "onQuit");
        // 当前页面的退出
        this.finish();
    }

}
