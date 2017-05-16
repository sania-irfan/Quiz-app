import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.edgeon.top5admin.R;

/**
 * Created by sania on 17/09/2016.
 */
public class ItemDetails extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.itemdetails);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
