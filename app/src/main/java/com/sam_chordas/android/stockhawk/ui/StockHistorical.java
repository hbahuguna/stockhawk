package com.sam_chordas.android.stockhawk.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;

import com.sam_chordas.android.stockhawk.R;
import com.sam_chordas.android.stockhawk.data.QuoteColumns;
import com.squareup.picasso.Picasso;

/**
 * Created by himanshu on 3/6/16.
 */
public class StockHistorical extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stock_historical);
        Intent intent = getIntent();
        String symbol = intent.getStringExtra(QuoteColumns.SYMBOL);
        ImageView stockHistoricalView = (ImageView) findViewById(R.id.stock_historical);
        Uri imageUri = Uri.parse("http://chart.finance.yahoo.com/z?").buildUpon()
                .appendQueryParameter("s", symbol)
                .appendQueryParameter("t","1y")
                .appendQueryParameter("z","l")
                .appendQueryParameter("q","l")
                .appendQueryParameter("l","on")
                .appendQueryParameter("p","m50,m200")
                .build();

        Picasso.with(this).load(imageUri)
                .placeholder(R.drawable.loading)
                .into(stockHistoricalView);
    }

}
