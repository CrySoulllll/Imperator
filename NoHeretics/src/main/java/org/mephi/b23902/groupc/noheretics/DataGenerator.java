package org.mephi.b23902.groupc.noheretics;

import com.github.javafaker.Faker;

public class DataGenerator {
    private static final Faker faker = new Faker();

    public static Heretic generateHeretic() {
        String name = faker.name().fullName();
        String crimes = faker.lorem().sentence();
        String lastSeen = faker.address().city();
        String id = faker.idNumber().valid();
        String[] threatLevels = {"Низкий", "Средний", "Высокий", "Критический"};
        String threatLevel = threatLevels[faker.random().nextInt(threatLevels.length)];

        return new Heretic(name, crimes, lastSeen, id, threatLevel);
    }
}

