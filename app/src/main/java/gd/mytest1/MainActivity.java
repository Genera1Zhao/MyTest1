package gd.mytest1;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.print("git1");
        System.out.print("git2");
        System.out.print("git3");
        System.out.print("git4");
        System.out.print("git5");
    }

    public void toGlide(View view) {
        startActivity(new Intent(this, GlideActivity.class));
    }

    public void toConstraintLayout(View view) {
        startActivity(new Intent(this, ConstraintLayoutActivity.class));
    }
}
