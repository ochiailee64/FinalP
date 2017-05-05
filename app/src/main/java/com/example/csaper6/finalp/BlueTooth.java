package com.example.csaper6.finalp;

import android.bluetooth.BluetoothAdapter;

/**
 * Created by csaper6 on 4/27/17.
 */
public class BlueTooth {
    //from here on out, I have no clue what I am doing HAHAHAHAH

    public boolean Check(){
        BluetoothAdapter mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        if(!mBluetoothAdapter.isEnabled()){
            return false;
        }
        return true;

// if (!mBluetoothAdapter.isEnabled()) {
//            Intent enableBtIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
//
//        }
    }

}
