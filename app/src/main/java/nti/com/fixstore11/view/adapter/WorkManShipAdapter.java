package nti.com.fixstore11.view.adapter;

/**
 * Created by Taha on 14/05/2018.
 */

import android.content.Context;
import android.database.Cursor;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CursorAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import nti.com.fixstore11.R;
import nti.com.fixstore11.model.entities.Order;

public class WorkManShipAdapter extends BaseAdapter {
    private Context mContext;

    // Constructor
    public WorkManShipAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView == null) {
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8, 8, 8, 8);
        } else {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(mThumbIds[position]);
        return imageView;
    }

    // Keep all Images in array
    public Integer[] mThumbIds = {
            R.drawable.electrician_icon,
            R.drawable.electrician_icon,
            R.drawable.electrician_icon,
            R.drawable.electrician_icon,
            R.drawable.electrician_icon,
            R.drawable.electrician_icon,
            R.drawable.electrician_icon,
            R.drawable.electrician_icon,
            R.drawable.electrician_icon,
            R.drawable.electrician_icon,
            R.drawable.electrician_icon

    };
}


