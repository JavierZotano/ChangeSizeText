package com.example.changesizetext.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.R;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.databinding.ActivityViewMessageBinding;

/**
 * Esta clase visualiza un mensaje que se ha inicializado en ChangeSizeActivity. Se configura el
 * componente TextView con un texto y un tamaño de fuente.
 * @author javier
 * @version 1.0
 */
public class ViewMessageActivity extends AppCompatActivity {
    private static final String TAG = "ChangeSizeText";
    ActivityViewMessageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityViewMessageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // 1. Recoger Intent.
        Intent intent=getIntent();

        // 2. Recoger el mensaje.
        Message message= (Message) intent.getExtras().getSerializable("message");

        // 3. Actualizamos la vista.
        binding.tvMessage.setText(message.getMessage());
        binding.tvMessage.setTextSize(message.getSize());

        /*
        Todas las Activity tienen accesp a la información de la clase Application desde el método
        GetApplication. Se debe utilizar un casting explícito.
         */
        Log.d(TAG,((ChangeSizeApplication)getApplication()).getUser().toString());
    }
}