package model.impl;

import java.time.LocalDateTime;

import model.Loggable;

public class ConsoleLogger implements Loggable {
    @Override
    public void log(String message) {
        System.err.println(LocalDateTime.now() + " <--- : ---> " + message);
    }
}
