/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jb extends aa {
    static int field_f;
    static o[] field_d;
    static Random field_g;
    private String field_b;
    private String field_c;
    static int[] field_a;
    static int field_e;

    final void a(int param0, gb param1) {
        param1.b(-1955895016, ((jb) this).field_b);
        param1.a(64, ((jb) this).field_c);
        if (param0 != -12518) {
            jb.b(57);
        }
    }

    final wb a(int param0) {
        if (param0 < 30) {
            return null;
        }
        return dc.field_k;
    }

    public static void b(int param0) {
        field_a = null;
        field_g = null;
        field_d = null;
        if (param0 != 22174) {
            field_d = null;
        }
    }

    jb(String param0, String param1) {
        ((jb) this).field_c = param1;
        ((jb) this).field_b = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_a = new int[10];
        field_g = new Random();
        field_e = 500;
    }
}
