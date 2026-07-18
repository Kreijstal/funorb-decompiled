/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vg extends IOException {
    static String field_e;
    static wk[] field_h;
    static String field_d;
    static gh field_g;
    static int field_c;
    static int field_f;
    static String field_b;
    static boolean field_a;

    vg(String param0) {
        super(param0);
    }

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        field_d = null;
        field_b = null;
        field_e = null;
        if (param0 >= -27) {
            vg.a(-125);
        }
    }

    final static void a(int param0, byte param1) {
        ud.field_v = 20000000L;
        int var2 = -15;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "ENERGY";
        field_d = "To server list";
        field_a = true;
        field_b = "The following settings need to be changed:  ";
    }
}
