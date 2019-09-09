/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hitex.mobicastutil.util;

/**
 *
 * @author MSI
 */
public class Validators {

    public static boolean hasNull(Object ...objs){
        for (Object obj : objs) {
            if (obj == null) {
                return true;
            }
        }
        return false;
    }
}
