package osama.example.com.assignment123;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;

public class AlertDFragment extends DialogFragment {
	@Override
	public Dialog onCreateDialog(Bundle savedInstanceState) {
		return new AlertDialog.Builder(getActivity())
				// Set Dialog Icon
				.setIcon(R.mipmap.ic_launcher)
				// Set Dialog Title
				.setTitle(getTag())
				// Set Dialog Message
				.setMessage("Alert DialogFragment Demo")
				
				// Positive button
				.setPositiveButton("OK", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog, int which) {
						// Do something else
					  	Toast.makeText(getActivity().getApplicationContext(), "OK", Toast.LENGTH_SHORT).show();
					}
				})
				
				// Negative Button
				.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
					public void onClick(DialogInterface dialog,	int which) {
						// Do something else
					  	Toast.makeText(getActivity().getApplicationContext(), "Cancel", Toast.LENGTH_SHORT).show();
					}
				}).create();
	}
}