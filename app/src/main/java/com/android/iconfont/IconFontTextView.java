package com.android.iconfont;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.Html;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * 自定义矢量字体view，可以在layout直接配置矢量字体编码，也可以在代码中显示指定。
 * Created by juefei on 15-10-01.
 */
public final class IconFontTextView extends TextView {

    private static Typeface iconfont = null;

    public IconFontTextView(Context context) {
        this(context, null);
    }

    public IconFontTextView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public IconFontTextView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);

        try {
            if(iconfont == null) {
                iconfont = Typeface.createFromAsset(getResources().getAssets(),
                        "font/iconfont.ttf");
            }

            setTypeface(iconfont);

        } catch (Exception e) {
            iconfont = null;
        }

        setIncludeFontPadding(false);

        TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.IconFontTextView);
        String text = a.getString(R.styleable.IconFontTextView_android_text);
        if(!TextUtils.isEmpty(text)) {
            setText(Html.fromHtml(text));
        }
        a.recycle();

    }

}
