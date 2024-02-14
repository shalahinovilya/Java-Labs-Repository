package LR_4.controller;

import LR_4.model.Human;

public interface Creator<T> {
    T create(String name, Human head);
}
