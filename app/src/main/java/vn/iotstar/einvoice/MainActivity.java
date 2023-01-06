package vn.iotstar.einvoice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText etStarIndex, etEndIndex;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etEndIndex = findViewById(R.id.editTextEndIndex);
        etStarIndex=findViewById(R.id.editTextStarIndex);
    }
    public void btnCaculator_onClick(View view) {
        int start = Integer.parseInt(etStarIndex.getText().toString());
        int end = Integer.parseInt(etEndIndex.getText().toString());
        int eindex = end - start;

        Intent intent = new Intent(this, ResloveActivity.class);
        Bundle bundle = new Bundle();
        bundle.putInt("eIndex", eindex);
        intent.putExtra("data", bundle);

        startActivity(intent);
//        Toast.makeText(this, "Số chữ điện trong tháng là : "+ eindex, Toast.LENGTH_LONG).show();
    }
}