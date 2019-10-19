package org.fruitsalad.ui.home;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.mikhaellopez.circularimageview.CircularImageView;

import org.fruitsalad.R;

import ir.alirezaiyan.progressbar.LevelProgressBar;

public class HomeFragment extends Fragment {


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_home, container, false);

        return root;
    }
    @Override
    public void onResume() {
        super.onResume();
        ((AppCompatActivity)getActivity()).getSupportActionBar().hide();
        LevelProgressBar levelProgressBar = getActivity().findViewById(R.id.p1);
        levelProgressBar.setProgressWithAnimation(5F);
        CircularImageView circularImageView  = getActivity().findViewById(R.id.circularImageView);
        Bitmap largeIcon = BitmapFactory.decodeResource(getResources(), R.drawable.vector_abhijit_1);
        circularImageView.setImageBitmap(largeIcon);
    }
    @Override
    public void onStop() {
        super.onStop();
        ((AppCompatActivity)getActivity()).getSupportActionBar().show();
    }
}