package nira.minance_assignment.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import nira.minance_assignment.R;
import nira.minance_assignment.activity.UserSettingActivity;

/**
 * Created by Suvesh on 22/08/2017 AD.
 */

public class UserListAdapter extends RecyclerView.Adapter<UserListAdapter.UserListHolder> {

    private  Context context;
    public  UserListAdapter(Context context){
        this.context=context;
    }

    @Override
    public UserListHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_user, parent, false);
        return new UserListHolder(itemView);
    }

    @Override
    public void onBindViewHolder(UserListHolder holder, int position) {
     holder.parentview.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(context, UserSettingActivity.class);
             context.startActivity(intent);
         }
     });
    }

    @Override
    public int getItemCount() {
        return 10;
    }

    public  class UserListHolder extends  RecyclerView.ViewHolder{

        private CardView parentview;
        public UserListHolder(View itemView) {
            super(itemView);
            parentview=(CardView)itemView.findViewById(R.id.parentview);
        }
    }
}
