package osama.example.com.assignment123;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {
	
	Button dbutton;
	Button alertdfragbutton;
	FragmentManager fm = getSupportFragmentManager();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Get the view from activity_main.xml
		setContentView(R.layout.activity_main);

		// Locate the button in activity_main.xml
		dbutton = (Button) findViewById(R.id.dbutton);
		alertdfragbutton = (Button) findViewById(R.id.alertdfragbutton);
		
		// Capture button clicks
		dbutton.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				
				
				new AlertDialog.Builder(MainActivity.this)
			    .setTitle("Close App")
			    .setMessage("Are you sure you want to close app?")
			    .setPositiveButton("YES", new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int which) { 
			            // continue with delete
			        	finish();
			        }
			     })

			    .setNegativeButton("NO", new DialogInterface.OnClickListener() {
			        public void onClick(DialogInterface dialog, int which) { 
			            // do nothing
			          	Toast.makeText(getApplicationContext(), "NO", Toast.LENGTH_SHORT).show();
                        dialog.dismiss();//hide the dialog UI
			        }
			     })
                 .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {
                         dialog.cancel();//destroy dialog UI

                     }
                 })
			    .setIcon(R.mipmap.ic_launcher)
			    .show();
				
			}
		});
		
		// Capture button clicks
		alertdfragbutton.setOnClickListener(new OnClickListener() {
			public void onClick(View arg0) {
				AlertDFragment alertdFragment = new AlertDFragment();
				// Show Alert DialogFragment
				alertdFragment.show(fm, "Alert Dialog Fragment");
			}
		});
	}
}