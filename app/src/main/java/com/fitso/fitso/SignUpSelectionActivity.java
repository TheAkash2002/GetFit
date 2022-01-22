package com.fitso.fitso;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class SignUpSelectionActivity extends Activity {

	ImageButton facebookSignUpButton;
	ImageButton googlePlusSignUpButton;
	ImageButton getfitSignUpButton;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_up_selection);
		facebookSignUpButton = (ImageButton)findViewById(R.id.facebookSignUpButton);
		googlePlusSignUpButton = (ImageButton)findViewById(R.id.googlePlusSignUpButton);
		getfitSignUpButton = (ImageButton)findViewById(R.id.getfitSignUpButton);
	}

	public void facebookSignUpButtonClicked(View view) {
		Toast.makeText(this, "FB is currently unsupported!", Toast.LENGTH_LONG).show();
	}

	public void googlePlusSignUpButtonClicked(View view) {
		Toast.makeText(this, "Google is currently unsupported!", Toast.LENGTH_LONG).show();
	}

	public void getfitSignUpButtonClicked(View view) {
		Intent intent = new Intent(this, SignUpActivity.class);
		startActivity(intent);
	}

}
