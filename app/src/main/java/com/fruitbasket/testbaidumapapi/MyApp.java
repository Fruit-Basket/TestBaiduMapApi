package com.fruitbasket.testbaidumapapi;

import android.app.Application;

import com.baidu.mapapi.CoordType;
import com.baidu.mapapi.SDKInitializer;

/**
 * Created by FruitBasket on 2017/5/12.
 */

public class MyApp extends Application {

    @Override
    public void onCreate(){
        super.onCreate();
        SDKInitializer.initialize(getApplicationContext());
        SDKInitializer.setCoordType(CoordType.BD09LL);
    }
}
