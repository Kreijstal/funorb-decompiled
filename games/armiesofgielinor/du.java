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

    final static boolean c(int param0) {
        if (param0 != 10) {
            field_h = true;
            return true;
        }
        return true;
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != 16) {
            return;
        }
        field_b = null;
        field_g = null;
        field_f = null;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final java.net.Socket a(byte param0) throws IOException {
        if (param0 != 15) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_a, this.field_c);
    }

    static {
        field_e = new me(10, 2, 2, 0);
        field_d = new wm();
        field_f = "No special attribute";
        field_b = new String[16];
    }
}
