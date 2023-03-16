package com.example.myunitconverter;
import com.example.myunitconverter.ConverterActivity;
import com.example.myunitconverter.R;
import com.example.myunitconverter.Unit;
import java.util.ArrayList;
import java.util.List;

public class TimeActivity extends ConverterActivity {
    @Override
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Time";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.time;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("sec","Second","1.0"));
        unitList.add(new Unit("min","Minutes","60.0"));
        unitList.add(new Unit("hr","Hours","3600.0"));
        unitList.add(new Unit("day","Days","86400.0"));
        return unitList;
    }
}

