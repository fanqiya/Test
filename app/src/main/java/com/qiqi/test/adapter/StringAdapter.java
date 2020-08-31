package com.qiqi.test.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.qiqi.test.R;
import com.qiqi.test.activity.MainActivity;

import java.util.List;
import java.util.zip.Inflater;

public class StringAdapter extends BaseAdapter {
    private LayoutInflater layoutInflater;//得到一个LayoutInfalter对象用来导入布局
    private List<String> list;
    private Context context;

    public StringAdapter(Context context, List<String> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            //绑定Item布局
            convertView = LayoutInflater.from(context).inflate(R.layout.item_list, null, false);
            //自定义内部类，对象holder用来存储文字和图片控件
            viewHolder = new ViewHolder();
            viewHolder.imageView = convertView.findViewById(R.id.image);
            viewHolder.textView = convertView.findViewById(R.id.text);
            viewHolder.textView.setText(list.get(position));
            //将holder放入当前视图中
            convertView.setTag(viewHolder);
        } else {
            //复用holder
            viewHolder = (ViewHolder) convertView.getTag();
            viewHolder.textView.setText(list.get(position));
        }
        return convertView;
    }


    //内部类
    private final class ViewHolder {
        TextView textView;
        ImageView imageView;

    }
}
