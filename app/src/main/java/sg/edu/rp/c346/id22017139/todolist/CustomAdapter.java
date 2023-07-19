package sg.edu.rp.c346.id22017139.todolist;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<ToDoList> itemList;

    public CustomAdapter(@NonNull Context context, int resource, ArrayList<ToDoList> objects) {
        super(context, resource, objects);

        parent_context = context;
        layout_id = resource;
        itemList = objects;
    }
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService((Context.LAYOUT_INFLATER_SERVICE));

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvName = rowView.findViewById(R.id.textViewName);
        TextView tvDesc = rowView.findViewById(R.id.textViewDesc);

        ToDoList currentItem = itemList.get(position);

        tvName.setText(currentItem.getTitle());
        tvDesc.setText(currentItem.toString());

        return rowView;
    }
}
