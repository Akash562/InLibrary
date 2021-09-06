package com.akash.rodielibrary;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Single_Alert {

    private static AlertDialog alertDialog;

    TextView title,content;
    ImageView img,btn_one;
    Context context;

    ConstraintLayout Content_back;

    public void Single_Alert( Context context1){

        View view = LayoutInflater.from(context1).inflate(R.layout.activity_single_button_alert, null);
        AlertDialog.Builder builder = new AlertDialog.Builder(context1);
        builder.setView(view);
        builder.setCancelable(true);

        alertDialog = builder.create();
        alertDialog.setCancelable(false);

        title = view.findViewById(R.id.textTitle);
        Content_back = view.findViewById(R.id.layoutTitle);

        content = view.findViewById(R.id.textMessage);
        btn_one = view.findViewById(R.id.buttonOk);
        img = view.findViewById(R.id.imageIcon);

    }

    public interface OnClickListener {
        void onPositiveButtonClick();
    }

    public void show(final OnClickListener clickListener) {
        btn_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickListener.onPositiveButtonClick();
            }
        });

        if (alertDialog.getWindow() != null){
            alertDialog.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        }
        alertDialog.show();
    }


    // Pirate Title   [message,background,color,size]
    public Single_Alert setTitle(String txt_title) {
        title.setText(txt_title);
        return this;
    }
    public Single_Alert setTitleSize(int title_size){
        title.setTextSize(title_size);
        return this;
    }

//    @RequiresApi(api = Build.VERSION_CODES.M)
//    public Pirate_Single_Alert setTitleColor(int title_color){
//        title.setTextColor(title_color);
//        return this;
//    }
//    @RequiresApi(api = Build.VERSION_CODES.M)
//    public Pirate_Single_Alert setTitleBg(int title_bg){
//        title.setBackgroundResource(title_bg);
//        return this;
//    }

    // Pirate Content   [message,background,color,size]
    public Single_Alert setContent(String message) {
        content.setText(message);
        return this;
    }
    public Single_Alert setContentSize(int content_size){
        content.setTextSize(content_size);
        return this;
    }

//    public Pirate_Single_Alert setContenteBg(int content_bg){
//        Content_back.setBackgroundResource(content_bg);
//        return this;
//    }
//    public Pirate_Single_Alert setContentColor(int content_color){
//        content.setTextColor(content_color);
//        return this;
//    }

    // set Icon
    public Single_Alert setIcon(int aicon){
        img.setImageResource(aicon);
        return this;
    }

    // Pirate Button   [Name,background,color,size]
//    public Pirate_Single_Alert setButton(String btnText){
//        btn_one.setText(btnText);
//        return this;
//    }
//    public Pirate_Single_Alert setBtnSize(int btnSize){
//        btn_one.setTextSize(btnSize);
//        return this;
//    }

//    public Pirate_Single_Alert setButtonBg(int btnBg){
//        btn_one.setBackgroundResource(btnBg);
//        return this;
//    }
//    public Pirate_Single_Alert setButtonColor(int btnColor){
//        btn_one.setTextColor(btnColor);
//        return this;
//    }

    public Single_Alert dismiss() {
        alertDialog.dismiss();
        return this;
    }


}
