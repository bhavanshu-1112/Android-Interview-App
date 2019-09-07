package com.example.androidinterview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

	Button sq;
	Button tq;
	Button see;
	Button rate;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		sq = (Button)findViewById(R.id.bsq);
		tq = (Button)findViewById(R.id.btq);
		see = (Button)findViewById(R.id.bsa);
		rate = (Button)findViewById(R.id.brate);
	}

}
