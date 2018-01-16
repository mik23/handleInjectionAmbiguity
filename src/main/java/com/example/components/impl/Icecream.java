package com.example.components.impl;

import org.springframework.stereotype.Component;

import com.example.annotations.Cold;
import com.example.annotations.Cream;
import com.example.components.Dessert;


@Component
@Cold
@Cream
public class Icecream implements Dessert{

}
