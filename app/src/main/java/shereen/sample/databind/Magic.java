package shereen.sample.databind;

import android.content.Context;
import android.widget.Toast;

public class Magic {
Context con;

    public Magic(Context var) {
        con = var;

    }

    public void doSomeThing(){
        Toast.makeText(con,"this works!",Toast.LENGTH_SHORT).show();
    }
}
