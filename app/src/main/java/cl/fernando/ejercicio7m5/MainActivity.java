package cl.fernando.ejercicio7m5;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Toast;

import cl.fernando.ejercicio7m5.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements VistaPresentador{

    private Presentador presentador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        // Vista  -- construir el modelo y el presentador

        presentador = new Presentador(this);

        binding.textInputEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            presentador.evaluarContrasena(s.toString());
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }
    @Override
    public void mostrarDebil() {
        Toast.makeText(this, "Contraseña Debil", Toast.LENGTH_SHORT).show();
        //binding.tvColor.setBackgroundColor(Color.GREEN);
    }

    @Override
    public void mostrarMedio() {
        Toast.makeText(this, "Contraseña Media", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarFuerte() {
        Toast.makeText(this, "Contraseña Fuerte", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void mostrarError() {
        Toast.makeText(this, "Ocurrio un error", Toast.LENGTH_SHORT).show();
    }
}