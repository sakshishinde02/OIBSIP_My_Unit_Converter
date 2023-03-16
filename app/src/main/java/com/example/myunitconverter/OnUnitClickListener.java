package com.example.myunitconverter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;

import java.util.ArrayList;
import java.util.List;

public class OnUnitClickListener implements View.OnClickListener {
    private Context context;
    private String title;
    private List<Unit> units;
    private TextView tv;
    private TextView tvHidden;

    public OnUnitClickListener(Context context, String title, List<Unit> units, TextView tv, TextView tvHidden) {
        this.context = context;
        this.title = title;
        this.units = units;
        this.tv = tv;
        this.tvHidden = tvHidden;
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder alertBuilder = new AlertDialog.Builder(context);
        alertBuilder.setTitle(title);

        List<String> options = new ArrayList<>();
        for(Unit unit:units){
            options.add(unit.toString());
        }

        alertBuilder.setSingleChoiceItems(
                options.toArray(new String[0]),        //Items list
                -1,             //Index of checked item (-1 = no selection)
                new DialogInterface.OnClickListener() //Item click listener
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Unit unit = units.get(which);
                        tv.setText(unit.getSymbol());
                        tvHidden.setText(unit.getValue().toString());
                    }
                }
        );

        alertBuilder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //dismiss the alert dialog after selection
                dialog.dismiss();
            }
        });

        AlertDialog dialog = alertBuilder.create();
        //display the alert dialog
        dialog.show();
    }
}
