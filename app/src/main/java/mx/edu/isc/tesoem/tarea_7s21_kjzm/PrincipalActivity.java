package mx.edu.isc.tesoem.tarea_7s21_kjzm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.bumptech.glide.Glide;

public class PrincipalActivity extends AppCompatActivity {

    Spinner splista;
    ImageView ivimagen;

    List<String> MiLista = new ArrayList<>(Arrays.asList("SELECCIONE EL ESTADO", "Coahuila", "Colima", "Jalisco", "Morelos", "Puebla", "Sonora", "Veracruz"));

    ArrayAdapter<String> adaptador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        splista = findViewById(R.id.splista);
        MiLista.add("Estado de México");

        ivimagen = findViewById(R.id.ivimagen);
        adaptador = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, MiLista);
        splista.setAdapter(adaptador);

        splista.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String valor = adapterView.getItemAtPosition(i).toString();

                if (i == 1){
                    Toast.makeText(PrincipalActivity.this, "SE SELECCIONO EL ESTADO DE COAHUILA" + valor, Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Qx0fv3ZySigDO3b1GRaiYwv4jUhiM6x2").into(ivimagen);

                } else if (i == 2) {
                    Toast.makeText(PrincipalActivity.this, "SE SELLECIONO EL ESTADO DE COLIMA", Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1_p7_YX330769GhxV-fEhjQHCCdinHaqO").into(ivimagen);
                }else if (i == 3) {
                    Toast.makeText(PrincipalActivity.this, "SE SELECCIONO EL ESTADO DE JALISCO", Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1K2UUTMloX1ePLX9v_73-LxyepEOVjtCD").into(ivimagen);
                } else if (i == 4) {
                    Toast.makeText(PrincipalActivity.this, "SE SELECCIONO EL ESTADO DE MORELOS", Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=14bFqt_4GupfPfWyjoRsoRV_st7km7RgP").into(ivimagen);

                } else if (i == 5) {
                    Toast.makeText(PrincipalActivity.this, "SE SELLECCIONO EL ESTADO DE PUEBLA", Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1IUb68c1gihcoKyARGhsGeeUkd3STtDxp").into(ivimagen);
                    
                } else if (i == 6) {
                    Toast.makeText(PrincipalActivity.this, "SE SELECCIONO EL ESTADO DE SONORA", Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1Tya9lt5_A6bUtttPm_NutEnlhrjXMtY-").into(ivimagen);

                } else if (i == 7) {
                    Toast.makeText(PrincipalActivity.this, "SE SELECCIONO EL ESTADO DE VERAZCRUZ", Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=1riXeCczVwI076ZT7rM28JQjTXvz1pK2z").into(ivimagen);

                }else if (i == 8) {
                    Toast.makeText(PrincipalActivity.this, "SE SELECCIONO EL ESTADO DE MÉXICO", Toast.LENGTH_SHORT).show();
                    Glide.with(ivimagen).load("https://drive.google.com/uc?export=download&id=15_Hs-ExpWOJjpIE5q2KFZrMF6KR3SOGS").into(ivimagen);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }
}