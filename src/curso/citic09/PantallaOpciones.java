package curso.citic09;

import curso.citic09.R;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class PantallaOpciones extends PreferenceActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.opciones);
    }
}
