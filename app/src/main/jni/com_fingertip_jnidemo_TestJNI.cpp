//
// Created by sweet on 2016/11/29.
//

#include <stdio.h>
#include <stdlib.h>
#include "com_fingertip_jnidemo_TestJNI.h"
JNIEXPORT jstring JNICALL Java_com_fingertip_jnidemo_TestJNI_getHolleWord
        (JNIEnv *env, jobject, jstring content) {
    return content;
}