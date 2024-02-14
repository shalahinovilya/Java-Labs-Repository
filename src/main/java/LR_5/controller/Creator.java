package LR_5.controller;

import LR_5.model.Human;

public interface Creator<T> {
    T create(String name, Human head);
}
