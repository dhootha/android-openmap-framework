package com.jwetherell.openmap.data;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.view.Gravity;
import android.widget.Toast;

public abstract class MessageUtilities {
    
    public static enum ConfirmationResult {YES,NO};
    
    public static void confirmUser( Context context, String msg,
                                    DialogInterface.OnClickListener yesClick, 
                                    DialogInterface.OnClickListener noClick){
        Builder alert = new AlertDialog.Builder(context);
        alert.setIcon(android.R.drawable.ic_dialog_alert)
             .setTitle("Confirmation")
             .setMessage(msg)
             .setPositiveButton(    "Yes", yesClick)
             .setNegativeButton("No", noClick)
             .show();
    }
    
    public static void helpUser(Context context, String msg) {
        Toast t = Toast.makeText(context, msg, Toast.LENGTH_LONG);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }
    
    public static void alertUser(Context context, String msg) {
        Toast t = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        t.setGravity(Gravity.CENTER, 0, 0);
        t.show();
    }

    public static void alertUserTop(Context context, String msg) {
        Toast t = Toast.makeText(context, msg, Toast.LENGTH_SHORT);
        t.setGravity(Gravity.TOP, 0, 0);
        t.show();
    }
}
