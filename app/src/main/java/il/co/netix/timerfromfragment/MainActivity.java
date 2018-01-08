package il.co.netix.timerfromfragment;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import il.co.netix.timerfromfragment.Fragments.BottomFragment;
import il.co.netix.timerfromfragment.Fragments.TopFragment;

public class MainActivity extends AppCompatActivity implements TopFragment.OnFragmentInteractionListener {

    private static final int topfragmentContainer=R.id.topFragmentContainer;
    private static final int bottomfragmentContainer=R.id.bottomFragmentContainer;
    BottomFragment bottomFragment=BottomFragment.newInstance("","");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager()
                .beginTransaction()
                .add(topfragmentContainer,TopFragment.newInstance("",""))
                .add(bottomfragmentContainer,bottomFragment )
                .commit();
    }

    @Override
    public void onTimeChange(int i) {

        bottomFragment.setBottomTextView(i);
    }
}
