package com.yorke.lifecycleplugindemo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


/**
 * @ClassName: MainActivity
 * @Description:
 * @Author: Yorke
 * @CreateDate: 2020/11/25 5:41 PM
 */
public class MainActivity  extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }
}
