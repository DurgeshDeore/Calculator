package com.example.demo001;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    int value = 0;
    int answer=0;
    String str;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //buttons
        Button one = findViewById(R.id.one);
        Button two =findViewById(R.id.two);
        Button three=findViewById(R.id.three);
        Button four=findViewById(R.id.four);
        Button five=findViewById(R.id.five);
        Button six=findViewById(R.id.six);
        Button seven=findViewById(R.id.seven);
        Button eight=findViewById(R.id.eight);
        Button nine=findViewById(R.id.nine);
        Button zero =findViewById(R.id.zero);
        Button div=findViewById(R.id.divide);
        Button mul =findViewById(R.id.multiply);
        Button add=findViewById(R.id.add);
        Button sub=findViewById(R.id.substract);
        Button clear=findViewById(R.id.clear);
        Button ans=findViewById(R.id.answer);

        //text views
        TextView tvMain=findViewById(R.id.textviewMain);
        TextView tvAns=findViewById(R.id.textviewAns);

        //variables

        //set onclick listeners to the buttons
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"1";
                tvMain.setText(str);
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"2";
                tvMain.setText(str);
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"3";
                tvMain.setText(str);
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"4";
                tvMain.setText(str);
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"5";
                tvMain.setText(str);
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"6";
                tvMain.setText(str);
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"7";
                tvMain.setText(str);
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"8";
                tvMain.setText(str);
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"9";
                tvMain.setText(str);
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String str=tvMain.getText()+"0";
                tvMain.setText(str);
            }
        });

        //operators
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            tvAns.setText(tvMain.getText());
            tvMain.setText("");
            value=1;
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAns.setText(tvMain.getText());
                tvMain.setText("");
                value=2;
            }
        });
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAns.setText(tvMain.getText());
                tvMain.setText("");
                value =3;
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvAns.setText(tvMain.getText());
                tvMain.setText("");
                value=4;
            }
        });
        //clear button
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvMain.setText("");
            }
        });

        //answer
        ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int n1=Integer.parseInt(tvAns.getText().toString());
                int n2=Integer.parseInt(tvMain.getText().toString());
                tvAns.setText("");
                switch (value){
                    case 0:tvMain.setText("Invalid operation");
                        break;
                    case 1:answer=n1/n2;
                        str=Integer.toString(answer);
                        tvMain.setText(str);
                        break;
                    case 2:answer=n1*n2;
                        str=Integer.toString(answer);
                        tvMain.setText(str);
                        break;
                    case 3:answer=n1+n2;
                        str=Integer.toString(answer);
                        tvMain.setText(str);
                        break;
                    case 4:answer=n1-n2;
                        str=Integer.toString(answer);
                        tvMain.setText(str);
                        break;
                }
            }
        });

    }
}