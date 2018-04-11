package com.aspros.customclock;

import android.content.Context;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class ClockView extends View {
    public ClockView(Context context) {
        this(context, null);
    }

    public ClockView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public ClockView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
    }


}
