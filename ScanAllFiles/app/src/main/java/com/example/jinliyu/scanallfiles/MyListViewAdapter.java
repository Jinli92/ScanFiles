package com.example.jinliyu.scanallfiles;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jinliyu on 4/8/18.
 */

public class MyListViewAdapter extends BaseAdapter{
private List<FileInfo> dataList;
private Context context;
private LayoutInflater mInflater;

    public MyListViewAdapter(Context mContext, List<FileInfo> dataList)
    {
      this.context = mContext;
      if(dataList.size() > 10){
          this.dataList = new ArrayList<>();
          for(int i = 0; i <10; i ++)
          {
              this.dataList.add(dataList.get(i));
          }
      }else
      {
          this.dataList = dataList;
      }
      mInflater = LayoutInflater.from(context);

    }

    @Override
    public int getCount() {
        return dataList.size();
    }

    @Override
    public Object getItem(int position) {
        return dataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            holder = new ViewHolder();
            convertView = mInflater.inflate(R.layout.item_listview, parent, false);
            holder.nameTv = convertView.findViewById(R.id.file_name_tv);
            holder.sizeTv = convertView.findViewById(R.id.file_size_tv);
            convertView.setTag(holder);

        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        holder.nameTv.setText(dataList.get(position).getFileName());
        String formatTextSize = dataList.get(position).getFileSize() + "KB";
        holder.sizeTv.setText(formatTextSize);

        return convertView;
    }


    public final class ViewHolder {
        TextView nameTv;
        TextView sizeTv;
    }

}
