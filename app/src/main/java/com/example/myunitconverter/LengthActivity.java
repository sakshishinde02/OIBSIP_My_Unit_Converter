package com.example.myunitconverter;

import com.example.myunitconverter.ConverterActivity;
import com.example.myunitconverter.R;
import com.example.myunitconverter.Unit;
import java.util.ArrayList;
import java.util.List;

public class LengthActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Length";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.length;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("m","Meter","1.0"));
        unitList.add(new Unit("cm","Centimeter","0.01"));
        unitList.add(new Unit("mm","Millimetre","0.001"));
        unitList.add(new Unit("ft","Foot","3.281"));
        unitList.add(new Unit("in","Inch","39.37"));
        return unitList;
    }
}
