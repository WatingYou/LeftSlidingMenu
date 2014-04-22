package com.example.demodemomenu;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

/**
 * 主要控制右边按钮点击事件
 * @author Administrator
 *
 */
public class RightSlidingMenuFragment extends Fragment implements OnClickListener{
	@Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
    	 View view = inflater.inflate(R.layout.main_rigth_fragment, container,false);
    	  
    	return view;
    }
	@Override
	public void onClick(View v) {
		Fragment newContent = null;
		
		if (newContent != null)
			switchFragment(newContent);		
	}
	
	
	private void switchFragment(Fragment fragment) {
		if (getActivity() == null)
			return;
			MainActivity ra = (MainActivity) getActivity();
			ra.switchContent(fragment);
	}
}
