/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class df {
    static String field_c;
    static String field_a;
    static String field_b;
    int field_d;

    final static int a(boolean param0) {
        return new Date().getYear() - -1900;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    df(int param0) {
        ((df) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Checking";
        field_b = "Hide lobby chat";
        field_c = "Status";
    }
}
