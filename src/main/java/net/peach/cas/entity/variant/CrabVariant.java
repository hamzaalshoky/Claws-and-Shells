package net.peach.cas.entity.variant;

import java.util.Arrays;
import java.util.Comparator;

public enum CrabVariant {
    RED(0),
    GREEN(1),
    PURPLE(2),
    GOLDEN(3);

    private static final CrabVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(CrabVariant::getId)).toArray(CrabVariant[]::new);
    private final int id;

    CrabVariant(int p_30984_) {
        this.id = p_30984_;
    }

    public int getId() {
        return this.id;
    }

    public static CrabVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
