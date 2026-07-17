/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ea {
    int field_a;
    static Random field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_b = null;
    }

    ea(int param0) {
        ((ea) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Random();
    }
}
