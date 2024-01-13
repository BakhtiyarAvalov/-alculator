package Java.my_new_java_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn7, btn8, btn9, btn6, btn5, btn4, btn3, btn2, btn1, btn0;
    Button btn_c, btn_pl_min;
    TextView tvSan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn9 = findViewById(R.id.btn9);
        btn8 = findViewById(R.id.btn8);
        btn7 = findViewById(R.id.btn7);
        btn6 = findViewById(R.id.btn6);
        btn5 = findViewById(R.id.btn5);
        btn4 = findViewById(R.id.btn4);
        btn3 = findViewById(R.id.btn3);
        btn2 = findViewById(R.id.btn2);
        btn1 = findViewById(R.id.btn1);
        btn0 = findViewById(R.id.btn0);

        btn_c = findViewById(R.id.btn_c);
        btn_pl_min = findViewById(R.id.btn_pl_min);

        tvSan = findViewById(R.id.tv_san);

        View.OnClickListener buttonNumber = new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String prevNum = tvSan.getText().toString();
                    String presDigit = "";
                    String finalNum = "";
                    switch (view.getId()){
                        case R.id.btn7:
                            presDigit = "7";
                            break;
                    }
                    switch (view.getId()){
                        case R.id.btn8:
                            presDigit = "8";
                            break;
                    }
                    switch (view.getId()){
                        case R.id.btn9:
                            presDigit = "9";
                            break;
                    }
                    switch (view.getId()){
                        case R.id.btn6:
                            presDigit = "6";
                            break;
                    }
                    switch (view.getId()){
                        case R.id.btn5:
                            presDigit = "5";
                            break;
                    }
                    switch (view.getId()){
                        case R.id.btn4:
                            presDigit = "4";
                            break;
                    }
                    switch (view.getId()){
                        case R.id.btn3:
                            presDigit = "3";
                            break;
                    }
                    switch (view.getId()){
                        case R.id.btn2:
                            presDigit = "2";
                            break;
                    }
                    switch (view.getId()){
                        case R.id.btn1:
                            presDigit = "1";
                            break;
                    }
                    switch (view.getId()){
                        case R.id.btn0:
                            presDigit = "0";
                            break;
                    }

                    if(!prevNum.equals("0")) finalNum = prevNum + presDigit;
                    else finalNum = prevNum;
                    tvSan.setText(finalNum);
                }
            };

        btn7.setOnClickListener(buttonNumber);
        btn8.setOnClickListener(buttonNumber);
        btn9.setOnClickListener(buttonNumber);
        btn6.setOnClickListener(buttonNumber);
        btn5.setOnClickListener(buttonNumber);
        btn4.setOnClickListener(buttonNumber);
        btn3.setOnClickListener(buttonNumber);
        btn2.setOnClickListener(buttonNumber);
        btn1.setOnClickListener(buttonNumber);
        btn0.setOnClickListener(buttonNumber);

        View.OnClickListener buttonClear_plMin = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_c:
                        tvSan.setText("0");
                        break;
                    case R.id.btn_pl_min:
                        String numText = tvSan.getText().toString();
                        int num = Integer.parseInt(numText);
                        if(num>0) tvSan.setText("-"+numText);
                        else{
                            num = num *(-1);
                            tvSan.setText(""+num);
                        }
                        break;
                }
            }
        };

    }
}