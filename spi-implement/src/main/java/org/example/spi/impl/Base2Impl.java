package org.example.spi.impl;

import org.example.spi.base.IBase;

/**
 * @author izgnod
 */
public class Base2Impl implements IBase {

    @Override
    public void sayHello(String text) {
        System.out.println("Base2Impl sayHello:" + text);
    }
}
