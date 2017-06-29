package com.zmm.customcircleview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

/**
 * Description:
 * Author:zhangmengmeng
 * Date:2017/6/29
 * Time:下午3:37
 */

public class CustomView extends View {

    private final String TAG = CustomView.class.getSimpleName();
    private Paint mPaint;
    private Paint mPaint2;
    private float mAngleOne = 0f;


    public CustomView(Context context) {
        this(context,null);
    }
    public CustomView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }
    public CustomView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView();
    }
    private void initView() {
        mPaint = new Paint();
        mPaint2 = new Paint();
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Log.d(TAG,"width="+measuredWidth+"   height="+measuredHeight);

        mPaint.setColor(Color.BLUE);
        mPaint2.setColor(Color.GREEN);

//        canvas.drawArc(new RectF(0,0,300,300),0,300,true,mPaint);
        canvas.drawArc(new RectF(0,0,300,300),0,mAngleOne,true,mPaint);
        canvas.drawArc(new RectF(0,0,300,300),mAngleOne,360-mAngleOne,true,mPaint2);

    }
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    public void setAngleOne(float angleOne) {
        mAngleOne = angleOne;
    }
}
