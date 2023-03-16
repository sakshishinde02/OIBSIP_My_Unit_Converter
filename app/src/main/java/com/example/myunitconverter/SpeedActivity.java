package com.example.myunitconverter;
import com.example.myunitconverter.ConverterActivity;
import com.example.myunitconverter.R;
import com.example.myunitconverter.Unit;
import java.util.ArrayList;
import java.util.List;

public class SpeedActivity extends ConverterActivity {
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
        unitList.add(new Unit("km/hr","Kilometer per hour","1.0"));
        unitList.add(new Unit("n","Node","0.539957"));
        return unitList;
    }
}

