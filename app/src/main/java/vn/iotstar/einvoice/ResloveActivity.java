package vn.iotstar.einvoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResloveActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reslove);

        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("data");

        int result = bundle.getInt("eIndex");

        TextView tv = findViewById(R.id.tvResult);

        tv.setText("Số điện tiêu thụ trong tháng là: "+ result);
    }
}