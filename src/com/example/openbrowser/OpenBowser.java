package com.example.openbrowser;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class OpenBowser extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle icicle) {
		super.onCreate(icicle);
		setContentView(R.layout.activity_open_bowser);

		final Button button = (Button) findViewById(R.id.btnOk);
		button.setOnClickListener(this);

	}

	public void onClick(View view) {

		EditText addrUrl = (EditText) findViewById(R.id.edtUrl);

		String addUrl = addrUrl.getText().toString();

		Uri uri = Uri.parse(addUrl);

		Intent intent = new Intent(Intent.ACTION_VIEW, uri);

		startActivity(intent);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.open_bowser, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
