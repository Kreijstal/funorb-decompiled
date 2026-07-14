/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class dl {
    static int field_f;
    static int[] field_d;
    int field_c;
    static int field_b;
    String field_a;
    static String field_e;

    abstract java.net.Socket a(int param0) throws IOException;

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        if (param0 != -9125) {
            field_b = 15;
        }
    }

    final java.net.Socket a(byte param0) throws IOException {
        if (param0 != -76) {
          dl.b(53);
          return new java.net.Socket(((dl) this).field_a, ((dl) this).field_c);
        } else {
          return new java.net.Socket(((dl) this).field_a, ((dl) this).field_c);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
    }
}
