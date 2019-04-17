package activitydemo.mer.com.android_launch_mode;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class A_Activity extends Activity implements View.OnClickListener {

    Button btn1, btn2, btn3, btn4;
    public static final String TAG = "APPFLOW";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate: A");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        initilize();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Utils.getActivityInfo(this);
    }

    public void initilize() {
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                startActivity(new Intent(this, A_Activity.class));
                break;
            case R.id.btn2:
                startActivity(new Intent(this, B_Activity.class));
                break;
            case R.id.btn3:
                startActivity(new Intent(this, C_Activity.class));
                break;
            case R.id.btn4:
                startActivity(new Intent(this, D_Activity.class));
                break;
        }
    }

    @Override
    protected void onNewIntent(Intent intent) {
        Log.d(TAG, "onNewIntent: A");
        super.onNewIntent(intent);
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy: A");
        super.onDestroy();
    }
}