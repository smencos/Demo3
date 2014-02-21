package com.example.demo1s3.data;


import android.R.array;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.demo1s3.R;

public class ImageAdapter extends BaseAdapter {
	int[] arrayFlags = new int[] {R.drawable.android,
			R.drawable.apple,
			R.drawable.calzado,
			R.drawable.camisas,
			R.drawable.lego};
	
	String [] arrayCountries = new String []{"android", "apple", "calzado", "camisas", "lego"};
	
	private Resources resources;
	private LayoutInflater inflater;
	
	public ImageAdapter(Context context) {
		this.resources = context.getResources();
		this.inflater = LayoutInflater.from(context);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return arrayFlags.length;
		
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		if (convertView == null){
			convertView = inflater.inflate(R.layout.grid_image, null);
			TextView txtName = (TextView)convertView.findViewById(R.id.txtName);
			ImageView imgFlag = (ImageView)convertView.findViewById(R.id.imageFlag);
			txtName.setText(arrayCountries[position]);
			imgFlag.setImageResource(arrayFlags[position]);
		}
		return convertView;
	}
	
	public static Bitmap decodeSampleBitmapFromResources(Resources res, int resId, int reqWith, int reqHeight){
		final BitmapFactory.Options
		
		
	}
	
	public static int calculateInSampleSize(
	            BitmapFactory.Options options, int reqWidth, int reqHeight) {
	    // Raw height and width of image
	    final int height = options.outHeight;
	    final int width = options.outWidth;
	    int inSampleSize = 1;
	
	    if (height > reqHeight || width > reqWidth) {
	
	        final int halfHeight = Math.round((float) height / (float) reqHeight);
	        final int halfWidth = Math.round ((float) width / (float) reqWidth);
	
	        inSampleSize = halfHeight < halfWidth ? halfHeight : halfWidth;
	        
	    }
	
	    return inSampleSize;
}

}
