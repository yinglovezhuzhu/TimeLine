package com.opensource.timeline;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;

import com.opensource.timeline.widget.TimeLineItemView;

public class MainActivity extends Activity {
	
	private ListView mListView = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		mListView = (ListView) findViewById(R.id.list);
		mListView.setAdapter(new TestAdapter());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	
	private class TestAdapter extends BaseAdapter {

		@Override
		public int getCount() {
			// TODO Auto-generated method stub
			return 20;
		}

		@Override
		public Object getItem(int position) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public long getItemId(int position) {
			// TODO Auto-generated method stub
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			TimeLineItemView itemView = null;
			if(convertView == null) {
				itemView = new TimeLineItemView(MainActivity.this);
				convertView = itemView;
			} else {
				itemView = (TimeLineItemView) convertView;
			}
			if(position % 2 == 0) {
				itemView.setImageResource(R.drawable.pic1);
				itemView.setTime("2013年11月08日 13：00");
				itemView.setButton3BackgroundResource(R.drawable.btn_blue_selector);
			} else {
				itemView.setImageResource(R.drawable.pic2);
				itemView.setButton3BackgroundResource(R.drawable.btn_red_selector);
			}
			return convertView;
		}
		
	}

}
