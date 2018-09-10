package com.androidtutz.anushka.memberapp;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by K. A. ANUSHKA MADUSANKA on 1/25/2018.
 */
@Module
public class MemberDataModule {



    @Provides
    @Singleton
    MemberDataManager provideMemberDataManager(){

        return new MemberDataManager();


    }

}
