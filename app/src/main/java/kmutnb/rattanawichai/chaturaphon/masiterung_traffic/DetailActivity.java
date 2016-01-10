package kmutnb.rattanawichai.chaturaphon.masiterung_traffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.Scroller;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private TextView titleTextView, detailTextView;
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Bind Widget
        bindWidget();

        //Show View
        ShowView();

    }//Main Method

    private void ShowView() {

        //Show Title
        String srtTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(srtTitle);

        //Show Image
        int intIcon = getIntent().getIntExtra("Image",R.drawable.traffic_01);
        trafficImageView.setImageResource(intIcon);

        //Show Detail
        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.detail_long);
        detailTextView.setText(detailStrings[intIndex]);

    } //ShowView

    private void bindWidget() {
        titleTextView = (TextView) findViewById(R.id.txtShowTitle);
        trafficImageView = (ImageView) findViewById(R.id.imvShowImage);
        detailTextView = (TextView) findViewById(R.id.txtShowDetail);
    }

} //Main Class
