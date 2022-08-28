package com.example.imagedecode;

import static android.graphics.Paint.Style.FILL;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;


public class MyView extends View {
   private Path path1=new Path();
    private LinearGradient mShader=new LinearGradient(0f,0f,40f,60f,new int[]{Color.RED,Color.GREEN,Color.BLUE,Color.YELLOW},null, Shader.TileMode.REPEAT);
    private RectF rect=new RectF();
    private Paint paint=new Paint();

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(Color.WHITE);
        paint.setAntiAlias(true);
        paint.setColor(Color.BLUE);
        int width = this.getWidth();
        canvas.drawCircle(width/10+10,width/10+10,width/10,paint);

    }
    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }
}
