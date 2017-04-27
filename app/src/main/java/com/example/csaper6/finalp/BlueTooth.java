package com.example.csaper6.finalp;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;

/**
 * Created by csaper6 on 4/27/17.
 */
public class BlueTooth {
    //from here on out, I have no clue exatly what I am doing HAHAHAHAH

    public void Check(){
        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(!mBluetoothAdapter.isEnabled()){
            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);

        }
//
// if (!mBluetoothAdapter.isEnabled()) {
//            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//
//        }
    }

}
