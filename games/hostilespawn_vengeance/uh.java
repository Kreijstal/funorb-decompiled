/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class uh extends ca {
    static String[] field_j;
    private long field_n;
    private String field_e;
    static gb field_m;
    static Calendar field_h;
    static w field_l;
    static boolean field_o;
    static int field_k;
    static bd field_f;
    static int field_i;
    static String field_g;

    bl a(boolean param0) {
        if (param0) {
            ((uh) this).field_e = null;
            return ln.field_l;
        }
        return ln.field_l;
    }

    public static void b() {
        field_l = null;
        field_m = null;
        field_f = null;
        field_h = null;
        field_g = null;
        field_j = null;
    }

    uh(long param0, String param1) {
        try {
            ((uh) this).field_n = param0;
            ((uh) this).field_e = param1;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "uh.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(vi param0, int param1) {
        try {
            if (param1 >= -94) {
                field_g = null;
            }
            param0.b(9201, ((uh) this).field_n);
            param0.a((byte) -36, ((uh) this).field_e);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "uh.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_i = 64;
    }
}
