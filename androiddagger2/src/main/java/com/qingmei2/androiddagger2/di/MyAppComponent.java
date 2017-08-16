package com.qingmei2.androiddagger2.di;


import com.qingmei2.androiddagger2.base.MyApplication;
import com.qingmei2.androiddagger2.di.module.AllActivitysModule;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by QingMei on 2017/7/28.
 * desc:
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AndroidSupportInjectionModule.class,
        AllActivitysModule.class
//        MainActivityModule.class,
//        SecondActivityModule.class
})
public interface MyAppComponent {

    void inject(MyApplication application);
}