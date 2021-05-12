package org.example;

import org.example.spi.base.IBase;

import java.util.ServiceLoader;

/**
 * Hello world!
 *
 * @author izgnod
 */
public class App {
    public static void main(String[] args) {
        ServiceLoader<IBase> load = ServiceLoader.load(IBase.class);
        for (IBase i : load) {
            i.sayHello("test");
        }
    }
}
