package com.example.myunitconverter;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.math.BigDecimal;
import java.util.List;

public abstract class ConverterActivity extends AppCompatActivity {
    EditText et_fromUnit;
    EditText et_toUnit;
    TextView tv_fromUnit;
    TextView tv_toUnit;
    RelativeLayout rl_fromUnit;
    RelativeLayout rl_toUnit;
    RelativeLayout rl_convert;
    TextView tv_fromValue;
    TextView tv_toValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView();
        //Set title and icon
        ((TextView)findViewById(R.id.tv_title)).setText(getLayoutTitle());
        ((ImageView)findViewById(R.id.iv_icon)).setImageResource(getLayoutIcon());

        //Initialize views
        et_fromUnit = findViewById(R.id.et_fromUnit);
        et_toUnit = findViewById(R.id.et_toUnit);
        tv_fromUnit = findViewById(R.id.tv_fromUnit);
        tv_toUnit = findViewById(R.id.tv_toUnit);
        rl_fromUnit = findViewById(R.id.rl_fromUnit);
        rl_toUnit = findViewById(R.id.rl_toUnit);
        rl_convert = findViewById(R.id.rl_convert);
        tv_fromValue = findViewById(R.id.tv_fromValue);
        tv_toValue = findViewById(R.id.tv_toValue);

        //Set on click listener
        rl_fromUnit.setOnClickListener(new OnUnitClickListener(this,"Select From Unit", getUnitList(), tv_fromUnit, tv_fromValue));
        rl_toUnit.setOnClickListener(new OnUnitClickListener(this,"Select To Unit", getUnitList(), tv_toUnit, tv_toValue));
        rl_convert.setOnClickListener(v -> {
            String fromInput_raw = et_fromUnit.getText().toString();
            String fromValue_raw = tv_fromValue.getText().toString();
            String toValue_raw = tv_toValue.getText().toString();
            if(!(fromInput_raw.isEmpty()||fromValue_raw.equals("")||toValue_raw.equals(""))) {
                BigDecimal fromInput = new BigDecimal(fromInput_raw);
                BigDecimal fromValue = new BigDecimal(fromValue_raw);
                BigDecimal toValue = new BigDecimal(toValue_raw);
                et_toUnit.setText(Util.convert(fromInput,fromValue,toValue).toString());
            }
        });
    }

    public abstract void setContentView();
    public abstract String getLayoutTitle();
    public abstract int getLayoutIcon();
    public abstract List<Unit> getUnitList();
}