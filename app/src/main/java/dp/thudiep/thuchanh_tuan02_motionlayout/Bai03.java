package dp.thudiep.thuchanh_tuan02_motionlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Bai03 extends AppCompatActivity {

    private ImageView img_taylor;
    private ImageView img_music;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai03);
        img_taylor = findViewById(R.id.imageView8);
        img_music = findViewById(R.id.imageView9);
        Animation animation =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.anirotate);

        Animation animation1 =
                AnimationUtils.loadAnimation(getApplicationContext(),
                        R.anim.aniblink);

        img_taylor.startAnimation(animation);
        img_music.startAnimation(animation1);

    }
}