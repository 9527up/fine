package com.example.bigproject.ui.home.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.bigproject.R;
import com.example.bigproject.ui.home.Bean.dataBean2;

import java.util.List;

public class myAdapter2 extends ArrayAdapter {

    //private List<dataBean2> myBeanList = new ArrayList<>();//用来存放数据的数组
    private final int ImageId;

    public myAdapter2(Context context, int headImage, List<dataBean2> obj) {
        super(context, headImage, obj);
        ImageId = headImage;//这个是传入我们自己定义的界面
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull final ViewGroup parent) {
        dataBean2 myBean = (dataBean2) getItem(position);
        View view = LayoutInflater.from(getContext()).inflate(ImageId, parent, false);//这个是实例化一个我们自己写的界面Item

        LinearLayout linearLayout = view.findViewById(R.id.ll_view);
        TextView headText = view.findViewById(R.id.headtext);
        TextView content = view.findViewById(R.id.content);

        headText.setText(myBean.getTitle());
        content.setText(myBean.getContext());

        return view;
    }

}