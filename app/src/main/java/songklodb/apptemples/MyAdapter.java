package songklodb.apptemples;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Admin on 11-Feb-17.
 */

public class MyAdapter extends BaseAdapter{

    // Explicit
    private Context context;
    private int[] iconInts;
    private String[]nameStrings, detialStrings;

    public MyAdapter(Context context,
                     int[] iconInts,
                     String[] nameStrings,
                     String[] detialStrings) {
        this.context = context;
        this.iconInts = iconInts;
        this.nameStrings = nameStrings;
        this.detialStrings = detialStrings;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view1 = layoutInflater.inflate(R.layout.my_listview, parent, false);
        //bine widget
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        TextView nameTextView = (TextView) view1.findViewById(R.id.textView3);
        TextView detailTextView = (TextView) view1.findViewById(R.id.textView4);

        iconImageView.setImageResource(iconInts[position]);
        nameTextView.setText(nameStrings[position]);
        detailTextView.setText(detialStrings[position]);


        return view1;
    }
} //Main Class
