package com.example.springproject;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


class main extends AppCompatActivity implements View.OnClickListener {
    // Button
    Button join_btn;
    Button login_btn;

    // EditText
    EditText id_edit;
    EditText pw_edit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // setOnClickListener
        join_btn = (Button) findViewById(R.id.join_btn);
        login_btn = (Button) findViewById(R.id.login_btn);

        join_btn.setOnClickListener(this);
        login_btn.setOnClickListener(this);

        id_edit = (EditText) findViewById(R.id.id_edit);
        pw_edit = (EditText) findViewById(R.id.pw_edit);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.join_btn:     // 회원가입 버튼을 눌렀을 때
                Intent intent = new Intent(main.this, JoinActivity.class);
                startActivity(intent);  // 새 액티비티를 열어준다.
                finish();               // 현재의 액티비티는 끝내준다.
                break;
            case R.id.login_btn:    // 로그인 버튼을 눌렀을 때
                Intent intent2 = new Intent(main.this, LoginActivity.class);
                startActivity(intent2);
                finish();
                break;
        }
    }
}
