package com.example.a0_android_hello_world;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//note it is best practice to keep your strings in values->strings

		//Random Tip: Customers like birds.

		//Remember, we are separating the appearance from what's under-the-hood
	  	  //from the above, one way to coordinate:
	  	  //1 team-mate forking on the layout, and one of the logic
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
