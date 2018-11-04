/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   main.c
 * Author: sriir
 *
 * Created on November 2, 2018, 10:30 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include<jni.h>
#include "passingheader.h"
/*
 * 
 */
JNIEXPORT void JNICALL Java_iptex2_Iptex2_change
  (JNIEnv *env, jobject jThis, jobject obj){
    jclass cls;
    jfieldID fid;
    jmethodID mid;
    int value;
    cls= (*env)->GetObjectClass(env,obj);
    fid=(*env)->GetFieldID(env,cls,"count","I");
    mid=(*env)->GetMethodID(env,cls,"INCREMENT","()V");
    value=(*env)->GetIntField(env,obj,fid);
(*env)->SetIntField(env,obj,fid,10);
(*env)->CallVoidMethod(env,obj,mid);
value=(*env)->GetIntField(env,obj,fid);
}

