package com.example.changesizetext.ui;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.example.changesizetext.ChangeSizeApplication;
import com.example.changesizetext.data.model.Message;
import com.example.changesizetext.databinding.ActivityChangeSizeTextBinding;

/**
 * Clase que pide al usuario un texto yun tamaño mediante el componente SeekBar. Después se
 * inicializa un TextView @see {@link ViewMessageActivity#onCreate(Bundle)}.
 */
public class ChangeSizeTextActivity extends AppCompatActivity {
    private static final String TAG = "ChangeSizeText";
    ActivityChangeSizeTextBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChangeSizeTextBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.btSend.setOnClickListener(view -> {
            // 1. Crear objeto Bundle
            Bundle bundle = new Bundle();

            // 2. Añadir mensaje al Bundle
            Message message=new Message(((ChangeSizeApplication)getApplication()).getUser(),
                    binding.edMessage.getText().toString(), binding.skSize.getProgress());
            bundle.putSerializable("message", message);

            // 3. Enviar Intent con el Bundle.
            Intent intent =new Intent(this, ViewMessageActivity.class);
            intent.putExtras(bundle);
            startActivity(intent);
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG,"ChangeSizeText -> onStart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG,"ChangeSizeText -> onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG,"ChangeSizeText -> onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG,"ChangeSizeText -> onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG,"ChangeSizeText -> OnDestroy()");
    }
}