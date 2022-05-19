package com.wayne.testsdk;

import com.innovation.animal.breedfunctionsdk.SDK;
import com.jess.arms.base.BaseApplication;

/**
 * Description:
 * <p>
 * CreateTime：2021/03/17  18:20
 */
public class MyApp extends BaseApplication {
    @Override
    public void onCreate() {
        super.onCreate();
        SDK.init(this);
    }
}