package com.android.iconfontdemo;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Typeface;
import android.text.Html;
import android.view.Menu;
import android.widget.TextView;

import com.android.iconfont.IconFontTextView;
import com.android.iconfont.R;

/**
 * a demo for icontont
 * Created by juefei on 15-10-01.
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "font/iconfont.ttf");
        TextView tvIcon1 = (TextView)findViewById(R.id.action_icon1);
        tvIcon1.setTypeface(myTypeface);
        tvIcon1.setText(Html.fromHtml("&#x3626;"));
        TextView tvdesc1 = (TextView)findViewById(R.id.desc_icon1);
        tvdesc1.setText(String.format("text=%s size=%spx color=%s", "&#x3626;", tvIcon1.getTextSize(),
                Integer.toHexString(tvIcon1.getCurrentTextColor())));

        TextView tvIcon2 = (TextView)findViewById(R.id.action_icon2);
        tvIcon2.setTypeface(myTypeface);
        tvIcon2.setText(Html.fromHtml("&#x344b;"));
        TextView tvdesc2 = (TextView)findViewById(R.id.desc_icon2);
        tvdesc2.setText(String.format("text=%s size=%spx color=%s", "&#x344b;", tvIcon2.getTextSize(),
                Integer.toHexString(tvIcon2.getCurrentTextColor())));

        TextView tvIcon3 = (TextView)findViewById(R.id.action_icon3);
        tvIcon3.setTypeface(myTypeface);
        tvIcon3.setText(Html.fromHtml("&#x3576;"));
        TextView tvdesc3 = (TextView)findViewById(R.id.desc_icon3);
        tvdesc3.setText(String.format("text=%s size=%spx color=%s", "&#x3576;", tvIcon3.getTextSize(),
                Integer.toHexString(tvIcon3.getCurrentTextColor())));

        TextView tvIcon4 = (TextView)findViewById(R.id.action_icon4);
        tvIcon4.setTypeface(myTypeface);
        tvIcon4.setText(Html.fromHtml("&#x351a;"));
        TextView tvdesc4 = (TextView)findViewById(R.id.desc_icon4);
        tvdesc4.setText(String.format("text=%s size=%spx color=%s", "&#x351a;", tvIcon4.getTextSize(),
                Integer.toHexString(tvIcon4.getCurrentTextColor())));

        TextView tvIcon5 = (TextView)findViewById(R.id.action_icon5);
        tvIcon5.setTypeface(myTypeface);
        tvIcon5.setText(Html.fromHtml("&#x356f;"));
        TextView tvdesc5 = (TextView)findViewById(R.id.desc_icon5);
        tvdesc5.setText(String.format("text=%s size=%spx color=%s", "&#x356f;", tvIcon5.getTextSize(),
                Integer.toHexString(tvIcon5.getCurrentTextColor())));

        TextView tvIcon6 = (TextView)findViewById(R.id.action_icon6);
        tvIcon6.setTypeface(myTypeface);
        TextView tvdesc6 = (TextView)findViewById(R.id.desc_icon6);
        tvIcon6.setText(Html.fromHtml("&#x359e;"));
        tvdesc6.setText(String.format("text=%s size=%spx color=%s", "&#x359e;", tvIcon6.getTextSize(),
                Integer.toHexString(tvIcon6.getCurrentTextColor())));

        IconFontTextView tvIcon9 = (IconFontTextView)findViewById(R.id.action_icon9);
//        tvIcon9.setText(Html.fromHtml("&#x3579;"));
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
