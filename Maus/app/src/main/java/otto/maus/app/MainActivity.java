package otto.maus.app;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity extends Activity {
    private double delay_in_seconds = 1.5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash2);
        TextView splashText = (TextView) findViewById(R.id.textView);

                Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/blake2.ttf");
         splashText.setTypeface(tf);


        Handler handler=new Handler();
        Runnable r = new Runnable(){
            public void run() {

                Intent i = new Intent(MainActivity.this, AcellerometerMouseActivity.class);
                startActivity(i);
                finish();

              }
        };
        handler.postDelayed(r, (long) (delay_in_seconds * 1000));




    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
