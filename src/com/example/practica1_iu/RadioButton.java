package com.example.practica1_iu;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class RadioButton extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_radio_button);
		
/*	radioSexGroup = (RadioGroup) findViewById(R.id.radioSex);
	btnDisplay = (Button) findViewById(R.id.btnDisplay);
 
	btnDisplay.setOnClickListener(new OnClickListener() {
 
		@Override
		public void onClick(View v) {
 
		        // get selected radio button from radioGroup
			int selectedId = radioSexGroup.getCheckedRadioButtonId();
 
			// find the radiobutton by returned id
		        radioSexButton = (RadioButton) findViewById(selectedId);
 
			Toast.makeText(MyAndroidAppActivity.this,
				radioSexButton.getText(), Toast.LENGTH_SHORT).show();
 
		}
 
	});
		 * */
	}
}