package com.example.rafaj.fragmentapp;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by rafaj on 8/4/2018.
 */

public class FragmentViewer extends Fragment {
    TextView text;
    TextView text1;
    TextView text2;

    ImageView img;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.viewer_fragment, container, false);

        text = view.findViewById(R.id.textId);
        text1 = view.findViewById(R.id.textId1);
        text2 = view.findViewById(R.id.textId2);


        img = view.findViewById(R.id.imgGame);

        Bundle bundle = this.getArguments();


        if(bundle != null){
            Games game = (Games)bundle.getSerializable("game");
            Toast.makeText(getActivity(), "Item: " + bundle.getString("KEY"), Toast.LENGTH_SHORT).show();
            text.setText(game.getName());
            text1.setText(game.getYear());
            text2.setText(game.getType());

            img.setImageResource(game.getImg());
        }
        return view;
    }
}
