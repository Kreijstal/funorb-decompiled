/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class bg {
    static String field_b;
    int field_a;
    String field_c;
    static int field_d;

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 5101) {
          ((bg) this).field_a = 29;
          return new java.net.Socket(((bg) this).field_c, ((bg) this).field_a);
        } else {
          return new java.net.Socket(((bg) this).field_c, ((bg) this).field_a);
        }
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    public static void a(int param0) {
        if (param0 != 16857) {
            field_d = 93;
            field_b = null;
            return;
        }
        field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "This option cannot be combined with the current settings for:  ";
    }
}
