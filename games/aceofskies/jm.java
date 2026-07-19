/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class jm {
    static pa[] field_a;
    int field_f;
    static String field_b;
    static String field_c;
    String field_e;
    static int field_d;

    public static void a(int param0) {
        if (param0 < 21) {
          jm.a(-62);
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    final java.net.Socket b(byte param0) throws IOException {
        int var2 = -124 / ((param0 - -69) / 34);
        return new java.net.Socket(this.field_e, this.field_f);
    }

    static {
        field_b = "Not yet achieved";
        field_d = 5;
        field_c = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
