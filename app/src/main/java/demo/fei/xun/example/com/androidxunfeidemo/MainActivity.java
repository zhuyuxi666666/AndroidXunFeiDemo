package demo.fei.xun.example.com.androidxunfeidemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import demo.fei.xun.example.com.androidxunfeidemo.yuyinhecheng.IatDemo;
import demo.fei.xun.example.com.androidxunfeidemo.yuyinhecheng.IatDemoTools;
import demo.fei.xun.example.com.androidxunfeidemo.yuyinhecheng.TtsDemo;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
private Button btn_yuyinhecheng;
    private Button btn_gongjulei,btn_hecheng;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_yuyinhecheng= (Button) findViewById(R.id.btn_yuyinhecheng);
        btn_yuyinhecheng.setOnClickListener(this);
        btn_gongjulei= (Button) findViewById(R.id.btn_gongjulei);
        btn_gongjulei.setOnClickListener(this);
        btn_hecheng= (Button) findViewById(R.id.btn_hecheng);
        btn_hecheng.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_yuyinhecheng:
                // 语音识别
                Intent intent = new Intent(MainActivity.this, IatDemo.class);
                startActivity(intent);
                break;
            case R.id.btn_gongjulei:
                // 语音识别工具类
                Intent intent2 = new Intent(MainActivity.this, IatDemoTools.class);
                startActivity(intent2);
                break;
            case R.id.btn_hecheng:
                //语音合成
                Intent intent3 = new Intent(MainActivity.this, TtsDemo.class);
                startActivity(intent3);
                break;
        }
    }
}
