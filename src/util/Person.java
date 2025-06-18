package util;

import org.jetbrains.annotations.Nullable;

public class Person {
    private final String name;
    private final String nullableName;

    public Person(String name) {
        this.name = name;
        this.nullableName = name;
    }

    public String getName() {
        return name;
    }

    @Nullable
    public String getNullableName() {
        return nullableName;
    }
}
