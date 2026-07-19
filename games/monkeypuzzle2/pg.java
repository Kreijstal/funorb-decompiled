/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pg extends IOException {
    static hl[] field_e;
    static id field_a;
    static String field_c;
    static kk[] field_d;
    static d field_b;
    private static String field_z;

    public static void a(byte param0) {
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0 <= 40) {
          pg.a((byte) -128);
          field_e = null;
          field_b = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          return;
        }
    }

    pg(String param0) {
        super(param0);
    }

    static {
        field_z = "pg.A(";
        field_c = "Player";
        field_d = new kk[11];
        field_b = null;
    }
}
