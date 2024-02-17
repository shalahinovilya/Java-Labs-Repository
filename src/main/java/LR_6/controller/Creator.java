package LR_6.controller;

import LR_6.model.Human;

public interface Creator<T> {
    T create(String name, Human head);
}
