package com.transpacific.simpleanimation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Animation.AnimationListener;
import android.widget.Button;

public class SimpleanimationActivity extends Activity implements AnimationListener {
    /** Called when the activity is first created. */
	View v;
	Boolean STOP=false;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        Animation animation=AnimationUtils.loadAnimation(this,R.anim.left_to_right);
        Animation animation2=AnimationUtils.loadAnimation(this, R.anim.right_to_left);
    	animation.setAnimationListener(this);
    	animation2.setAnimationListener(this);
    	Button b1=(Button) findViewById(R.id.Button01);
    	Button b2=(Button) findViewById(R.id.Button02);
    	b1.startAnimation(animation);
    	b2.startAnimation(animation2);
    	
        
    }
    
	@Override
	public void onAnimationEnd(Animation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAnimationRepeat(Animation arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onAnimationStart(Animation arg0) {
		// TODO Auto-generated method stub
		
	}
}