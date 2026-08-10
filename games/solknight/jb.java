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
        try {
            param1.b(-1955895016, this.field_b);
            param1.a(64, this.field_c);
            if (param0 != -12518) {
                jb.b(57);
            }
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "jb.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final wb a(int param0) {
        if (param0 < 30) {
            return (wb) null;
        }
        return dc.field_k;
    }

    public static void b(int param0) {
        field_a = null;
        field_g = null;
        field_d = null;
        if (param0 != 22174) {
            field_d = (o[]) null;
        }
    }

    jb(String param0, String param1) {
        try {
            this.field_c = param1;
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw fc.a((Throwable) ((Object) runtimeException), "jb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = 0;
        field_a = new int[10];
        field_g = new Random();
        field_e = 500;
    }
}
