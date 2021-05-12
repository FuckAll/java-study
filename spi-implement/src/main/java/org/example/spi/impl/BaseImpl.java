package org.example.spi.impl;

import org.example.spi.base.IBase;

/**
 * @author izgnod
 */
public class BaseImpl implements IBase {

    @Override
    public void sayHello(String text) {
        System.out.println("BaseImpl sayHello:" + text);
    }
}
