package com.example.loan.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.loan.R;
import com.example.loan.databinding.FragmentHomeBinding;
import com.github.hamzaahmedkhan.counteranimationtextview.CountAnimationTextView;
import com.shuhart.stepview.StepView;

public class HomeFragment extends Fragment {

    private FragmentHomeBinding binding;
    CountAnimationTextView counter;
    StepView stepView;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        HomeViewModel homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        counter= root.findViewById(R.id.user_counter);
        stepView= root.findViewById(R.id.step_view);

        counter.setAnimationDuration(5000).countAnimation(0, 567996599);
        stepView.go(2,true);


        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}