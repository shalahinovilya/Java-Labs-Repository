package controller;

import model.Human;

public interface Creator<T> {
    T create(String name, Human head);
}
