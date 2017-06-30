package br.com.livroandroid.exemplogaleryactivity;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

public class PlanetaAdapter extends BaseAdapter{
    private Context ctx;
    private final int[] planetas;

    public PlanetaAdapter(Context ctx, int[] planetas) {
        this.ctx = ctx;
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas.length;
    }

    @Override
    public Object getItem(int position) {
        return planetas[position];
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = LayoutInflater.from(ctx).inflate(R.layout.adapter_galery,parent,false);
        ImageView g = (ImageView) v.findViewById(R.id.adgalery);
        g.setImageResource(planetas[position]);
        return v;
    }
}
