package com.example.components.impl;

import org.springframework.stereotype.Component;

import com.example.annotations.Cold;
import com.example.annotations.Fruity;
import com.example.components.Dessert;


@Component
@Cold
@Fruity
public class Cake implements Dessert {

}
