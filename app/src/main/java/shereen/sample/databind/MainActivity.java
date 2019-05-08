package shereen.sample.databind;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import shereen.sample.databind.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
     ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);

        binding =  DataBindingUtil.setContentView(this, R.layout.activity_main);
        Magic magi = new Magic(this);
        binding.setBuns(magi);
    }
}
