/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class rn {
    String field_d;
    static int field_e;
    static String field_a;
    static String field_f;
    int field_b;
    static String field_g;
    static int field_c;

    final java.net.Socket a(boolean param0) throws IOException {
        if (param0) {
          field_a = null;
          return new java.net.Socket(((rn) this).field_d, ((rn) this).field_b);
        } else {
          return new java.net.Socket(((rn) this).field_d, ((rn) this).field_b);
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != -38) {
            rn.a((byte) 51);
            field_a = null;
            field_g = null;
            return;
        }
        field_a = null;
        field_g = null;
    }

    final static void a() {
        if (!(!ac.field_e)) {
            df.g(df.field_i, df.field_g, df.field_k + -df.field_i, -df.field_g + df.field_h);
            cm.field_h.a(false, 24960);
        }
    }

    abstract java.net.Socket b(int param0) throws IOException;

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Type your email address again to make sure it's correct";
        field_a = "You need to play <%0> more rated games to unlock this option.";
        field_g = "Reload game";
    }
}
