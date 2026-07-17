/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class he {
    static Random field_e;
    static int field_d;
    static int field_b;
    static long field_a;
    static ej field_c;
    static ra[] field_f;

    final static void a(int param0, int param1, int param2, int param3) {
        j.field_a = param3;
        sl.field_n = param0;
        db.field_db = param2;
    }

    public static void a() {
        field_e = null;
        field_f = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new Random();
        field_b = 0;
        field_f = new ra[17];
    }
}
