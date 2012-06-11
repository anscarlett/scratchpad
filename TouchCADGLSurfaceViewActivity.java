
package com.rda.android.touchcadglsurfaceview;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RelativeLayout;


public class TouchCADGLSurfaceViewActivity extends Activity {

    private RelativeLayout mLayout;
    private RelativeLayout.LayoutParams mLayoutParams;
    private TouchCADGLSurfaceView mSurfaceView;
	private ScrollView mSideBar;
    private Button mButton1;
    private Button mButton2;
    private Button mButton3;
    private Button mButton4;
    private Button mButton5;

    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);

        mLayout = new RelativeLayout(this);
        mLayoutParams = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);
        mSurfaceView = new TouchCADGLSurfaceView(getApplication());
		mSideBar = new ScrollView(this);
        mButton1 = new Button(this);
        mButton2 = new Button(this);
        mButton3 = new Button(this);
        mButton4 = new Button(this);
        mButton5 = new Button(this);

        mLayoutParams = new RelativeLayout.LayoutParams(50,50);
        mLayoutParams.addRule(RelativeLayout.ALIGN_RIGHT);
        
        mSideBar.addView(mButton1);
        mSideBar.addView(mButton2);
        mSideBar.addView(mButton3);
        mSideBar.addView(mButton4);
        mSideBar.addView(mButton5);
        mSideBar.setVisibility(RelativeLayout.VISIBLE);

        setContentView(mLayout);
    }

    @Override
    protected void onPause() {
        super.onPause();
        mView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mView.onResume();
    }
}
