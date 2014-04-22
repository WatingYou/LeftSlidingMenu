package com.example.demodemomenu;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Toast;
/**
 * 主要控制左边按钮点击事件
 * @author Administrator
 *
 */
public class LeftSlidingMenuFragment extends Fragment implements OnClickListener{
	
	private View circleBtnLayout;
	private View groupBtnLayout;
	@Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	
    }
     
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
    	 View view = inflater.inflate(R.layout.main_left_fragment, container,false);
   	  circleBtnLayout = view.findViewById(R.id.circleBtnLayout);
   	  circleBtnLayout.setOnClickListener(this);
   	  groupBtnLayout = view.findViewById(R.id.groupBtnLayout);
   	  groupBtnLayout.setOnClickListener(this);
		System.out.println();
    	return view;
    }

	@Override
	public void onClick(View v) {
		Fragment newContent = null;
		switch (v.getId()) {
		case R.id.circleBtnLayout:
			newContent = new FragmentFriend();
			circleBtnLayout.setSelected(true);
			groupBtnLayout.setSelected(false);
			break;
		case R.id.groupBtnLayout:
			newContent = new FragmentGroup();
			groupBtnLayout.setSelected(true);
			circleBtnLayout.setSelected(false);
		    break;
		case R.id.headImageView:
			Toast.makeText(getActivity(), "点击头像", Toast.LENGTH_SHORT).show();
			/*Intent intent = new Intent(getActivity(),AboutActivity.class);
			startActivity(intent);*/
			break;
		default:
			break;
		}
		
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
