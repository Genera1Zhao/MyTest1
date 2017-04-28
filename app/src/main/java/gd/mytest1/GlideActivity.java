package gd.mytest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class GlideActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);
        imageView = (ImageView) findViewById(R.id.image_view);
    }

    public void loadImage(View view) {

        //        String url = "http://cn.bing.com/az/hprichbg/rb/Dongdaemun_ZH-CN10736487148_1920x1080.jpg";
        String url = "http://p1.pstatp.com/large/166200019850062839d3";
        Glide.with(this).load(url).placeholder(R.mipmap.ic_launcher).diskCacheStrategy(DiskCacheStrategy.NONE).into(imageView);
    }
}
