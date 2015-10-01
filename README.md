# IconFont介绍

&emsp;&emsp;IconFont 意在基于矢量字体技术，绘制客户端中常用的图标icon。它抛弃了传统的方式：设计师切出多个分辨率的位图，工程师引入项目中使用。
字体图标除了图像清晰度之外，比位图还有以下几点优势：

* 适用性：一个图标字体比一系列的图像（特别是在Retina屏中使用双倍大小的图像）要小。一旦图标字体加载了，你的图标就会马上渲染出来，不需要下载一个图像。
TextView替代ImageView，规避使用bitmap，内存上也大大降低了。
* 可扩展性：图标字体可以用过font-size属性设置其任何大小。这使您能够随时输出不同大小的图标，然而，使用位图，你必须得为每个不同大小的图像输出一个不同文件。
* 灵活性：文字效果可以很容易地应用到你的图标上，包括颜色，阴影和翻转等效果。他们还可以在任何背景下显示。
* 兼容性：图标字体支持Android平台和Ios平台，以及所有浏览器。

目前图标字体技术已在部分客户端app中大量使用。

# 如何使用IconFont
    
* 准备iconfont字体文件ttf，放置于工程assets目录下
* 使用系统原生TextView方式：    
        Typeface myTypeface = Typeface.createFromAsset(getAssets(), "font/iconfont.ttf");     
        TextView tvIcon1 = (TextView)findViewById(R.id.action_icon1);   
        tvIcon1.setTypeface(myTypeface);   
        tvIcon1.setText(Html.fromHtml("\&#x3626;"));  // iconfont编码，参照assets/iconfont.ttf文件
        
* 使用扩展控件IconFontTextView方式(分为两种):  

    1.代码：     
        &emsp;&emsp;IconFontTextView tvIcon9 = (IconFontTextView)findViewById(R.id.action_icon9);     
        &emsp;&emsp;tvIcon9.setText(Html.fromHtml("&#x3579;"));     
        
    2.配置：         
    &lt;com.tmall.iconfont.IconFontTextView    
        &emsp;&emsp;android:layout_marginTop="10dp"     
        &emsp;&emsp;android:id="@+id/action_icon9"      
        &emsp;&emsp;android:layout_width="wrap_content"      
        &emsp;&emsp;android:layout_height="wrap_content"     
        &emsp;&emsp;android:textSize="30sp"     
        &emsp;&emsp;android:textColor="#999999"      
        &emsp;&emsp;android:text="\&#x3579;" /&gt;