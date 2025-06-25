package util;

import org.jetbrains.annotations.Nullable;

public class JavaPerson {
    private final String name;
    private int age;

    public JavaPerson(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int nextYearAge() {
        return this.age + 1;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
