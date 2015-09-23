package biz.tekeye.lights;

import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class main extends Activity {
	  AnimationDrawable lightsAnimation;
	  @Override
	  public void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.main);
	    ImageView lights = (ImageView) findViewById(R.id.imageView1);
	    lightsAnimation=(AnimationDrawable) lights.getDrawable();
	  }
	  @Override
	  public void onWindowFocusChanged(boolean hasFocus) {
	    super.onWindowFocusChanged(hasFocus);
	    lightsAnimation.start();
	  }
	}