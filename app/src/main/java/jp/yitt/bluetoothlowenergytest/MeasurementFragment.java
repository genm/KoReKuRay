package jp.yitt.bluetoothlowenergytest;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import jp.yitt.bluetoothlowenergytest.databinding.FragmentMeasurementBinding;
import jp.yitt.bluetoothlowenergytest.model.LengthData;
import jp.yitt.bluetoothlowenergytest.viewmodel.LengthDataViewModel;

/**
 * Created by genm1023 on 8/31/16.
 */
public class MeasurementFragment extends Fragment{
    public static final String TAG = MeasurementFragment.class.getSimpleName();
    FragmentMeasurementBinding binding;
    LengthDataViewModel lengthDataViewModel;
    public static MeasurementFragment newInstance(){
        return new MeasurementFragment();
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        Log.d(TAG,"onCreateView");

        return inflater.inflate(R.layout.fragment_measurement, container, false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState){
        super.onActivityCreated(savedInstanceState);
        binding = FragmentMeasurementBinding.bind(getView());
        lengthDataViewModel = new LengthDataViewModel(new LengthData());
        binding.setViewmodel(lengthDataViewModel);

    }
    @Override
    public void onAttach(Context context){
        super.onAttach(context);
        Log.d(TAG, "onAttach");
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(TAG, "onStart");

        lengthDataViewModel.setLength("ほげ");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }
}
