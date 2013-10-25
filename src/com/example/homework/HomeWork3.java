package com.example.homework;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

/**
 * Created with IntelliJ IDEA.
 * User: forester
 * Date: 24.10.13
 * Time: 17:24
 * To change this template use File | Settings | File Templates.
 */
public class HomeWork3 extends Fragment {

     private String [] mTestItemsList;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.multipanelayout, container, false);
        ListView mListView = (ListView) v.findViewById(R.id.listView);
        String[] listTitles = getResources().getStringArray(R.array.testitems);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(v.getContext(), android.R.layout.simple_list_item_1, listTitles);
        mListView.setAdapter(adapter);
        return v;
    }
}
