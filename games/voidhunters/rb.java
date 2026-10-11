/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rb {
    static ij field_c;
    int field_b;
    String field_a;

    final static boolean a(int param0, int param1, int param2) {
        if (param0 == -6070) {
          return 0 != (2048 & param2) ? true : false;
        }
        rb.a(-47, -38, 120);
        return 0 != (2048 & param2) ? true : false;
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (!param0) {
          return new java.net.Socket(this.field_a, this.field_b);
        }
        this.field_b = 48;
        return new java.net.Socket(this.field_a, this.field_b);
    }

    public static void a(byte param0) {
        if (param0 >= -71) {
          rb.a(-112, -32, -122);
          field_c = null;
          return;
        }
        field_c = null;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    static {
    }
}
