/**
 * 
 */
package com.opensource.timeline.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.opensource.timeline.R;

/**
 * @author zhangyy@yuninfo.com
 *
 */
public class TimeLineItemView extends LinearLayout {
	
	private ImageView mIvIcon = null;
	private View mLineView1 = null;
	private View mTopView = null;
	private TextView mTvTime = null;
	private ImageView mIvImage = null;
	private TextView mTvDesc = null;
	private TextView mTvTag = null;
	private ImageView mIvTag = null;
	private ImageButton mIbtn1 = null;
	private ImageButton mIbtn2 = null;
	private ImageButton mIbtn3 = null;
	private View mBottomView = null;

	public TimeLineItemView(Context context, AttributeSet attrs) {
		super(context, attrs);
		
		initView(context);
	}

	public TimeLineItemView(Context context) {
		super(context);
		
		initView(context);
	}
	
	private void initView(Context context) {
		View.inflate(context, R.layout.item_time_line, this);
		
		mIvIcon = (ImageView) findViewById(R.id.iv_item_time_line_icon);
		mLineView1 = findViewById(R.id.view_item_time_line_bottom_line1);
		mTopView = findViewById(R.id.ll_item_time_line_top);
		mTvTime = (TextView) findViewById(R.id.tv_item_time_line_time);
		mIvImage = (ImageView) findViewById(R.id.iv_item_time_line_center);
		mTvDesc = (TextView) findViewById(R.id.tv_item_time_line_desc);
		mTvTag = (TextView) findViewById(R.id.tv_item_time_line_tag_name);
		mIvTag = (ImageView) findViewById(R.id.iv_item_time_line_tag_icon);
		mIbtn1 = (ImageButton) findViewById(R.id.ibtn_item_time_line_btn1);
		mIbtn2 = (ImageButton) findViewById(R.id.ibtn_item_time_line_btn2);
		mIbtn3 = (ImageButton) findViewById(R.id.ibtn_item_time_line_btn3);
		mBottomView = findViewById(R.id.view_item_time_line_bottom);
		
		mTopView.setVisibility(View.GONE);
		mIvIcon.setVisibility(View.GONE);
	}

	/**
	 * Set time.
	 * @param time
	 */
	public void setTime(String time) {
		mTvTime.setText(time);
		mTopView.setVisibility(View.VISIBLE);
		mIvIcon.setVisibility(View.VISIBLE);
		mLineView1.setVisibility(View.GONE);
		mBottomView.setVisibility(View.GONE);
	}
	
	/**
	 * Get the ImageView widget to display image.
	 * @return
	 */
	public ImageView getImageView() {
		return mIvImage;
	}
	
	/**
	 * Set image resource.
	 * @param resId
	 */
	public void setImageResource(int resId) {
		mIvImage.setImageResource(resId);
	}
	
	/**
	 * Set button1 listener.
	 * @param l
	 */
	public void setButton1Listener(View.OnClickListener l) {
		mIbtn1.setOnClickListener(l);
	}
	
	/**
	 * Set button2 listener.
	 * @param l
	 */
	public void setButton2Listener(View.OnClickListener l) {
		mIbtn2.setOnClickListener(l);
	}
	
	/**
	 * Set button3 listener.
	 * @param l
	 */
	public void setButton3Listener(View.OnClickListener l) {
		mIbtn3.setOnClickListener(l);
	}
	
	/**
	 * Set button1 background resource.
	 * @param resid
	 */
	public void setButton1BackgroundResource(int resid) {
		mIbtn1.setBackgroundResource(resid);
	}
	
	/**
	 * Set button2 background resource.
	 * @param resid
	 */
	public void setButton2BackgroundResource(int resid) {
		mIbtn2.setBackgroundResource(resid);
	}
	
	/**
	 * Set button3 background resource.
	 * @param resid
	 */
	public void setButton3BackgroundResource(int resid) {
		mIbtn3.setBackgroundResource(resid);
	}
	
	/**
	 * Set description.
	 * @param desc
	 */
	public void setDescription(CharSequence desc) {
		mTvDesc.setText(desc);
	}
	
	/**
	 * Set tag name text.(Use to custom tag.)
	 * @param tag
	 */
	public void setTagName(CharSequence tag) {
		mTvTag.setText(tag);
		mTvTag.setVisibility(View.VISIBLE);
		mIvTag.setVisibility(View.INVISIBLE);
	}
	
	/**
	 * Set tag icon.
	 * @param tag
	 */
	public void setTagIcon(int resId) {
		mIvTag.setImageResource(resId);
		mIvTag.setVisibility(View.VISIBLE);
		mTvTag.setVisibility(View.INVISIBLE);
	}
}
