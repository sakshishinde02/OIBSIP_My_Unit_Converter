package com.example.myunitconverter;
import com.example.myunitconverter.ConverterActivity;
import java.util.ArrayList;
import java.util.List;

public class WeightActivity extends ConverterActivity{
    public void setContentView() {
        setContentView(R.layout.activity_converter);
    }

    @Override
    public String getLayoutTitle() {
        return "Weight";
    }

    @Override
    public int getLayoutIcon() {
        return R.drawable.weight;
    }

    @Override
    public List<Unit> getUnitList() {
        List<Unit> unitList = new ArrayList<>();
        unitList.add(new Unit("pound","Pound","1.0"));
        unitList.add(new Unit("ton","Ton","2000.0"));
        unitList.add(new Unit("kg","Kilogram","2.205"));
        unitList.add(new Unit("gm","Gram","453.6"));

        return unitList;
    }
}


