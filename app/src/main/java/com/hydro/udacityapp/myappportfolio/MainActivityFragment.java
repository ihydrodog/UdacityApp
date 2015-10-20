package com.hydro.udacityapp.myappportfolio;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Context context = getActivity();

            Log.d("listener", "listener");

            TextView textView = (TextView) v;

            String text = String.format( "This button will launch my [%s]", textView.getText());
            Toast toast = Toast.makeText(context, text, Toast.LENGTH_SHORT);
            toast.show();
        }
    };

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        Button button;

        button = (Button)view.findViewById(R.id.build);
        button.setOnClickListener( listener);
        button = (Button)view.findViewById(R.id.capstone);
        button.setOnClickListener( listener);
        button = (Button)view.findViewById(R.id.scores);
        button.setOnClickListener( listener);
        button = (Button)view.findViewById(R.id.spotify);
        button.setOnClickListener( listener);
        button = (Button)view.findViewById(R.id.library);
        button.setOnClickListener( listener);

        button = (Button)view.findViewById(R.id.xyz);
        button.setOnClickListener( listener);

        return view;
    }
}
