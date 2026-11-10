package com.algaworks.algasensors.temperature.processing;

import com.fasterxml.uuid.Generators;
import com.fasterxml.uuid.impl.TimeBasedEpochGenerator;

import java.util.UUID;

public class IdGenerator {

    private static final TimeBasedEpochGenerator timeBasedEpochRandomGenerator = Generators.timeBasedEpochGenerator();

    private IdGenerator() {

    }

    public static UUID generateTimeBasedUUID() {
        return timeBasedEpochRandomGenerator.generate();
    }
}
