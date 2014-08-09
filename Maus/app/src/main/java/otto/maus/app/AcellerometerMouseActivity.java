package otto.maus.app;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/**
 * Created by study on 8/8/14.
 */
public class AcellerometerMouseActivity extends Activity {
        private Vibrator mVibrator;
    @Override public void onCreate(Bundle a)
    {
        super.onCreate(a);
        setContentView(R.layout.maus_2_layout);

        mVibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);

        Button right = (Button) findViewById(R.id.right);
        Button left = (Button) findViewById(R.id.left); 
//
//        ImageView right = (ImageView) findViewById(R.id.right);
//        ImageView left = (ImageView) findViewById(R.id.left);

//
//        LinearLayout right = (LinearLayout) findViewById(R.id.right);
//        LinearLayout left = (LinearLayout) findViewById(R.id.left);

//
//        right.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                vibrate();
//            }
//        });
        right.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                vibrate();
                return false;
            }
        });


        left.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                vibrate();
                return false;
            }
        });


    }
    public void vibrate()
    {
        mVibrator.vibrate(50);
    }


}
