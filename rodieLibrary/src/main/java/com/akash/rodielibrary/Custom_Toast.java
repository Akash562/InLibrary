package com.akash.rodielibrary;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Handler;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

public class Custom_Toast {

    TextView t_msg;
    ImageView t_icon;


    // success Toast
    public void Toast_Success(Context context1, String msg, int m_size){

        // Creates dialog and set its settings
        Dialog dialog = new Dialog(context1);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.success_toast);

        t_msg = dialog.findViewById(R.id.pirate_text);

        // Set window configurations
        Window window = dialog.getWindow();
        WindowManager.LayoutParams wl = window.getAttributes();
        wl.gravity = Gravity.BOTTOM;
        wl.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        window.setAttributes(wl);

        startAnimation();

        t_msg.setText(msg);
        t_msg.setTextSize(m_size);

        dialog.show();

        //Set duration
        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            if (dialog.isShowing())
                dialog.dismiss();
        }, 3000);

    }

    // Error Toast
    public void Toast_Error(Context context1,String msg,int m_size){

        // Creates dialog and set its settings
        Dialog dialog = new Dialog(context1);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.error_toast);

        t_msg = dialog.findViewById(R.id.pirate_text);

        // Set window configurations
        Window window = dialog.getWindow();
        WindowManager.LayoutParams wl = window.getAttributes();
        wl.gravity = Gravity.BOTTOM;
        wl.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        window.setAttributes(wl);

        startAnimation();

        t_msg.setText(msg);
        t_msg.setTextSize(m_size);

        dialog.show();

        //Set duration
        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            if (dialog.isShowing())
                dialog.dismiss();
        }, 3000);

    }

    // warning toast
    public void Toast_Warning(Context context1,String msg,int m_size){

        // Creates dialog and set its settings
        Dialog dialog = new Dialog(context1);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setCancelable(false);
        dialog.setContentView(R.layout.warning_toast);

        t_icon = dialog.findViewById(R.id.pirate_icon);
        t_msg = dialog.findViewById(R.id.pirate_text);

        // Set window configurations
        Window window = dialog.getWindow();
        WindowManager.LayoutParams wl = window.getAttributes();
        wl.gravity = Gravity.BOTTOM;
        wl.flags = WindowManager.LayoutParams.FLAG_DIM_BEHIND;
        window.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
        window.setAttributes(wl);

        startAnimation();

        t_msg.setText(msg);
        t_msg.setTextSize(m_size);

        dialog.show();

        //Set duration
        final Handler handler = new Handler();
        handler.postDelayed(() -> {
            if (dialog.isShowing())
                dialog.dismiss();
        }, 3000);

    }


    private void startAnimation() {
        ObjectAnimator scaleDown = ObjectAnimator.ofPropertyValuesHolder(t_icon,
                PropertyValuesHolder.ofFloat("scaleX", 1.1f),
                PropertyValuesHolder.ofFloat("scaleY", 1.1f));
        scaleDown.setDuration(500);
        scaleDown.setRepeatCount(ObjectAnimator.INFINITE);
        scaleDown.setRepeatMode(ObjectAnimator.REVERSE);
        scaleDown.start();
    }

}
