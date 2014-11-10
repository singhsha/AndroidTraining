package com.example.tipcalculator;

import android.R.integer;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.TextureView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
	
	public EditText etAmount;
	public TextView tvAmount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        etAmount=(EditText) findViewById(R.id.editText1);
        tvAmount= (TextView) findViewById(R.id.textView2);
        
        Button button_ten= (Button) findViewById(R.id.button1);
        
        button_ten.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tvAmount.setText("$" + calculateTip(Integer.parseInt(etAmount.getText().toString()),10));				
			}
		});
        
        Button button_fifteen=(Button) findViewById(R.id.button2);
        
        button_fifteen.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tvAmount.setText("$" + calculateTip(Integer.parseInt(etAmount.getText().toString()),15));
				
			}
		});
        
        Button button_twenty=(Button) findViewById(R.id.button3);
        
        button_twenty.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				tvAmount.setText("$" + calculateTip(Integer.parseInt(etAmount.getText().toString()),20));
				
			}
		});
       
    } 
    
	private int calculateTip(int transactionAmount, int percentage) {
		// TODO Auto-generated method stub
		return (transactionAmount * percentage)/100;
	}
    
}



