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

    public static void b(int param0) {
        field_l = null;
        if (param0 != 64) {
          field_k = -111;
          field_m = null;
          field_f = null;
          field_h = null;
          field_g = null;
          field_j = null;
          return;
        } else {
          field_m = null;
          field_f = null;
          field_h = null;
          field_g = null;
          field_j = null;
          return;
        }
    }

    uh(long param0, String param1) {
        ((uh) this).field_n = param0;
        ((uh) this).field_e = param1;
    }

    final void a(vi param0, int param1) {
        if (param1 >= -94) {
          field_g = null;
          param0.b(9201, ((uh) this).field_n);
          param0.a((byte) -36, ((uh) this).field_e);
          return;
        } else {
          param0.b(9201, ((uh) this).field_n);
          param0.a((byte) -36, ((uh) this).field_e);
          return;
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
