package wky.ikl.dogaegulyutmo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {
    String[] Yut;
    int[] imgYut;
    int[] arrayOfInt = new int[2];

    private TextView mMessage;
    private ImageView mImage1;
    private ImageView mImage2;
    private ImageView mImage3;
    private ImageView mImage4;

    View.OnClickListener myButtonClick = new OnClickListener() {
        @Override
        public void onClick(View view) {
            Random localRandom = new Random();
            int i = 1 - localRandom.nextInt(10) / 6;
            int j = 1 - localRandom.nextInt(10) / 6;
            int k = 1 - localRandom.nextInt(10) / 6;
            int m = 1 - localRandom.nextInt(10) / 6;
            int n = m + (k + (i + j));

            mMessage.setText(MainActivity.this.Yut[n]);
            mImage1.setImageResource(MainActivity.this.imgYut[i]);
            mImage2.setImageResource(MainActivity.this.imgYut[j]);
            mImage3.setImageResource(MainActivity.this.imgYut[k]);
            mImage4.setImageResource(MainActivity.this.imgYut[m]);

        }
    };

    public void onCreate(Bundle paramBundle) {
        super.onCreate(paramBundle);
        setContentView(R.layout.main);

        arrayOfInt[0] = R.drawable.sixstick0;
        arrayOfInt[1] = R.drawable.sixstick1;
        this.imgYut = arrayOfInt;
        String[] arrayOfString = new String[5];

        arrayOfString[0] = "윷";
        arrayOfString[1] = "도";
        arrayOfString[2] = "개";
        arrayOfString[3] = "걸";
        arrayOfString[4] = "모";
        this.Yut = arrayOfString;


        mImage1 = (ImageView) findViewById(R.id.ImageView01);
        mImage2 = (ImageView) findViewById(R.id.ImageView02);
        mImage3 = (ImageView) findViewById(R.id.ImageView03);
        mImage4 = (ImageView) findViewById(R.id.ImageView04);

        mMessage = ((TextView) findViewById(R.id.TextView05));

        findViewById(R.id.Button01).setOnClickListener(myButtonClick);
    }
}
