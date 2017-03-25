package com.teamx.smartbuddy;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.teamx.smartbuddy.task.TaskContent;

import java.util.List;

public class MyTaskRecyclerViewAdapter extends RecyclerView.Adapter<MyTaskRecyclerViewAdapter.ViewHolder> {

    private final List<TaskContent.TaskItem> mValues;

    public MyTaskRecyclerViewAdapter(List<TaskContent.TaskItem> items) {
        mValues = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item_task, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);
        holder.mTaskView.setText(mValues.get(position).task);
        holder.mTimeView.setText(mValues.get(position).time);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mTaskView;
        public final TextView mTimeView;
        public TaskContent.TaskItem mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mTaskView = (TextView) view.findViewById(R.id.task);
            mTimeView = (TextView) view.findViewById(R.id.time);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mTaskView.getText() + "'";
        }
    }
}
