package com.example.app;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class SpeedEnforcementAdapter extends RecyclerView.Adapter<SpeedEnforcementAdapter.ViewHolder> {
    private List<SpeedEnforcementLocation> locations;

    public SpeedEnforcementAdapter(List<SpeedEnforcementLocation> locations) {
        this.locations = locations;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_location, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SpeedEnforcementLocation location = locations.get(position);
        holder.bind(location);
    }

    @Override
    public int getItemCount() {
        return locations.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView address;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            address = itemView.findViewById(R.id.address);
            itemView.setOnClickListener(this);
        }

        public void bind(SpeedEnforcementLocation location) {
            address.setText(location.getAddress());
        }

        @Override
        public void onClick(View v) {
            int position = getAdapterPosition();
            SpeedEnforcementLocation location = locations.get(position);
            Intent intent = new Intent(v.getContext(), DetailActivity.class);
            intent.putExtra("location", location);
            v.getContext().startActivity(intent);
        }
    }
}
