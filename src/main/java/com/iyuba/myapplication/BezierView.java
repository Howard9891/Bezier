package com.iyuba.myapplication;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
/**
 * 作者：mingyu on 16-6-25 11:30
 * <p/>
 * 邮箱：Howard9891@163.com
 */
public class BezierView extends View {
    private Paint paint;
    public BezierView(Context context) {
        this(context,null);
        Log.e("BezierView","1");
    }
    public BezierView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
        Log.e("BezierView","2");
    }
    public BezierView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        Log.e("BezierView","3");
        init();
    }
    private void init() {
        paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStrokeWidth(2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        Log.e("BezierView","init");
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Log.e("BezierView","draw");
        Path path = new Path();
        path.reset();
        path.moveTo(0,0);
        path.quadTo(getWidth()/3,getHeight()/6,getWidth()/2,getHeight()/2);
        Log.e("BezierView","path>>>"+path.toString());
        canvas.drawPath(path,paint);
        canvas.drawCircle(getWidth()/2,getHeight()/2,20,paint);
    }
}
