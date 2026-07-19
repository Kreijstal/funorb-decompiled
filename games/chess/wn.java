/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class wn {
    static int[] field_d;
    static String field_g;
    static boolean field_f;
    String field_a;
    static tg field_b;
    int field_c;
    static boolean field_e;

    public static void b(boolean param0) {
        field_d = null;
        field_b = null;
        if (param0) {
            field_d = (int[]) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    final java.net.Socket a(boolean param0) throws IOException {
        if (!param0) {
          field_g = (String) null;
          return new java.net.Socket(this.field_a, this.field_c);
        } else {
          return new java.net.Socket(this.field_a, this.field_c);
        }
    }

    abstract java.net.Socket a(byte param0) throws IOException;

    static {
        field_f = true;
        field_g = "Loading extra data";
    }
}
