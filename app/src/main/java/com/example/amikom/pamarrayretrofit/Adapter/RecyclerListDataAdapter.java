package com.example.amikom.pamarrayretrofit.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.amikom.pamarrayretrofit.Model.ModelListData;
import com.example.amikom.pamarrayretrofit.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by amikom on 26/12/2018.
 */

@SuppressWarnings("unused")
public class RecyclerListDataAdapter extends RecyclerView.Adapter<RecyclerListDataAdapter.MyviewHolder> {
    @NonNull
    Context context;
    List<ModelListData> modelListData;

    //Constructor
    public RecyclerListDataAdapter(@NonNull Context context, List<ModelListData> modelListData) {
        this.context = context;
        this.modelListData = modelListData;
    }

    //Setter


    public void setModelListData(List<ModelListData> modelListData) {
        this.modelListData = modelListData;
        notifyDataSetChanged();
    }

    @Override
    public MyviewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.listdata, parent, false);
        return new MyviewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerListDataAdapter.MyviewHolder myviewHolder, int position) {
        myviewHolder.listnama.setText("" + modelListData.get(position).getNama());
        myviewHolder.listPosisi.setText("" + modelListData.get(position).getPosisi());
        myviewHolder.listNegara.setText("" + modelListData.get(position).getNegara());

        Picasso.with(context).load(modelListData.get(position).getIkon()).into(myviewHolder.listikon);
        Picasso.with(context).load(modelListData.get(position).getGambar()).into(myviewHolder.listgambar);

    }

    @Override
    public int getItemCount() {
        if (modelListData != null){
            return modelListData.size();
        }
        return 0;
    }

    public class MyviewHolder extends RecyclerView.ViewHolder {
        TextView listnama, listPosisi, listNegara ;
        ImageView listikon, listgambar;

        public MyviewHolder(@NonNull View itemView) {
            super(itemView);

            listnama = (TextView) itemView.findViewById(R.id.txtNama);
            listPosisi = (TextView) itemView.findViewById(R.id.txtPosisi);
            listNegara = (TextView) itemView.findViewById(R.id.txtNegara);
            listikon = (ImageView) itemView.findViewById(R.id.imgIkon);
            listgambar = (ImageView) itemView.findViewById(R.id.imgThumb);


        }
    }

}
