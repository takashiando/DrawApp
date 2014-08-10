package com.example.drawapp;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;


public class SampleView extends View {
	
	private Paint paint=new Paint();
	
	public SampleView(Context context){
		super(context);
		setBackgroundColor(Color.WHITE);
		
	}
	
	@Override
public void onDraw(Canvas canvas){
		paint.setColor(Color.RED);
		canvas.drawCircle(100,100,5,paint);
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
