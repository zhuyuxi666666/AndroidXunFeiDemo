package demo.fei.xun.example.com.androidxunfeidemo.yuyinhecheng;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import demo.fei.xun.example.com.androidxunfeidemo.R;
import demo.fei.xun.example.com.androidxunfeidemo.utils.IflytekUtil;

/**
 * Created by lenovo on 2017/12/20.
 */

public class IatDemoTools extends Activity{
    private EditText mResultText;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.iatdemo);
        mResultText = ((EditText) findViewById(R.id.iat_text));
        Button btn=findViewById(R.id.iat_recognize);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IflytekUtil iflytekUtil = new IflytekUtil(IatDemoTools.this, mResultText);
                iflytekUtil.showIatDialog();
            }
        });
    }
}
