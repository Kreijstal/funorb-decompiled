/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class kb {
    static int field_e;
    static volatile int field_f;
    int field_b;
    static String field_g;
    static int field_d;
    static ed field_c;
    String field_a;

    public static void a(boolean param0) {
        field_g = null;
        field_c = null;
        if (!param0) {
            field_e = -18;
        }
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final java.net.Socket b(boolean param0) throws IOException {
        if (param0) {
            return null;
        }
        return new java.net.Socket(((kb) this).field_a, ((kb) this).field_b);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_g = "Resume Game";
    }
}
