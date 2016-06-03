package com.weihuagu.timer;
import java.util.ArrayList;
import java.util.List;

import com.weihuagu.view.PieChartView;

import com.weihuagu.timer.R;
import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		this.initUiResouces();

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
	public void initUiResouces(){
		 PieChartView pieChartView = (PieChartView) findViewById(R.id.pie_chart);

	        List<PieChartView.PieceDataHolder> pieceDataHolders = new ArrayList<>();

	        pieceDataHolders.add(new PieChartView.PieceDataHolder(100,0xFF77CCAA, "今天，１"));
	        pieceDataHolders.add(new PieChartView.PieceDataHolder(1000, 0xFF11AA33, "明天，２"));
	        pieceDataHolders.add(new PieChartView.PieceDataHolder(1200, Color.GRAY, "就是风，３"));
	        pieceDataHolders.add(new PieChartView.PieceDataHolder(5000, Color.YELLOW, "呵呵，４"));
	        pieceDataHolders.add(new PieChartView.PieceDataHolder(10000, Color.RED, "小京，５"));
	        pieceDataHolders.add(new PieChartView.PieceDataHolder(13000, Color.BLUE, "花花，６"));
	        pieChartView.setData(pieceDataHolders);
	}
	
}
