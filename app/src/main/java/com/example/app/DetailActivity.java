package com.example.app;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private TextView cityName;
    private TextView regionName;
    private TextView address;
    private TextView deptNm;
    private TextView branchNm;
    private TextView latitude;
    private TextView longitude;
    private TextView direct;
    private TextView limit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        cityName = findViewById(R.id.cityName);
        regionName = findViewById(R.id.regionName);
        address = findViewById(R.id.address);
        deptNm = findViewById(R.id.deptNm);
        branchNm = findViewById(R.id.branchNm);
        latitude = findViewById(R.id.latitude);
        longitude = findViewById(R.id.longitude);
        direct = findViewById(R.id.direct);
        limit = findViewById(R.id.limit);

        SpeedEnforcementLocation location = (SpeedEnforcementLocation) getIntent().getSerializableExtra("location");

        if (location != null) {
            cityName.setText(location.getCityName());
            regionName.setText(location.getRegionName());
            address.setText(location.getAddress());
            deptNm.setText(location.getDeptNm());
            branchNm.setText(location.getBranchNm());
            latitude.setText(String.valueOf(location.getLatitude()));
            longitude.setText(String.valueOf(location.getLongitude()));
            direct.setText(location.getDirect());
            limit.setText(String.valueOf(location.getLimit()));
        }
    }
}
