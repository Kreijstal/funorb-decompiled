/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class lg {
    int field_b;
    String field_a;
    static db field_c;

    final java.net.Socket a(int param0) throws IOException {
        if (param0 > -83) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_a, this.field_b);
    }

    abstract java.net.Socket b(int param0) throws IOException;

    public static void c(int param0) {
        field_c = null;
        if (param0 != 21745) {
            lg.c(-29);
        }
    }

    static {
    }
}
