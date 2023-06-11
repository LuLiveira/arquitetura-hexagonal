package com.lucas.hexagonal;

import org.jmolecules.ddd.annotation.Entity;

import java.time.Year;
import java.util.Objects;
import java.util.stream.IntStream;

@Entity
public class Car {

    public String plate;
    public String model;
    public Year year;
}
