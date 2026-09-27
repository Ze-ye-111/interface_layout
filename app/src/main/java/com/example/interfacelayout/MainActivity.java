package com.example.interfacelayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2.Table表格布局
        Button btnTable = findViewById(R.id.btnTable);
        btnTable.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TableActivity.class)));

        //3.约束布局1 计算器
        Button btnCalc = findViewById(R.id.btnCalc);
        btnCalc.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ConstraintCalcActivity.class)));

        //4.约束布局2 太空页面
        Button btnSpace = findViewById(R.id.btnSpace);
        btnSpace.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, ConstraintSpaceActivity.class)));

        //5.Compose任务清单
        Button btnCompose = findViewById(R.id.btnCompose);
        btnCompose.setOnClickListener(v -> startActivity(new Intent(MainActivity.this, TodoComposeActivity.class)));
    }
}
