package com.example.myunitconverter;
import com.example.myunitconverter.ConverterActivity;
import com.example.myunitconverter.R;
import com.example.myunitconverter.Unit;
import java.util.ArrayList;
import java.util.List;

public class ForceActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Force";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.force;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("N","Newton","1.0"));
        unitList.add(new Unit("kN","Kilonewton","1000.0"));
        unitList.add(new Unit("kgf","Kilogram-force","9.80665"));
        unitList.add(new Unit("hN","Hectonewton","100.0"));
        unitList.add(new Unit("daN","Dekanewton","10.0"));
        unitList.add(new Unit("dN","Decinewton","0.1"));
        unitList.add(new Unit("cN","Centinewton","0.01"));
        unitList.add(new Unit("mN","Millinewton","0.001"));
        unitList.add(new Unit("lbf","Pound-force","4.4482216153"));
        unitList.add(new Unit("ozf","Ounce-force","0.278013851"));
        return unitList;
    }
}
