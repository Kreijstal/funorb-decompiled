/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class du {
    String field_a;
    int field_c;
    static me field_e;
    static wm field_d;
    static boolean field_h;
    static String field_f;
    static String[] field_b;
    static String[] field_g;

    final static boolean c() {
        return true;
    }

    public static void b() {
        field_d = null;
        field_e = null;
        field_b = null;
        field_g = null;
        field_f = null;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final java.net.Socket a(byte param0) throws IOException {
        if (param0 != 15) {
            return null;
        }
        return new java.net.Socket(((du) this).field_a, ((du) this).field_c);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new me(10, 2, 2, 0);
        field_d = new wm();
        field_f = "No special attribute";
        field_b = new String[16];
    }
}
