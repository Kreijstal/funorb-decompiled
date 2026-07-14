/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static int[] field_g;
    static vh field_d;
    static String field_a;
    static volatile long field_b;
    static dd field_f;
    static int field_e;
    static String field_c;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(byte param0) {
        int var2 = 0;
        int var3 = Pool.field_O;
        int var1 = -124 / ((param0 - 38) / 54);
        boolean discarded$8 = wd.field_Ub.a(-120, qr.field_b, true, sm.field_D);
        wd.field_Ub.h((byte) 126);
        while (n.h(127)) {
            boolean discarded$9 = wd.field_Ub.a(-81, qi.field_a, ml.field_b);
        }
        if (0 != (jd.field_b ^ -1)) {
            var2 = jd.field_b;
            lf.a(-1, (byte) 92);
            return var2;
        }
        if (ep.field_z) {
            return 3;
        }
        if (!(pa.field_I != ra.field_e)) {
            return 1;
        }
        if (!ig.field_j.a(112)) {
            return 1;
        }
        if (!(ra.field_e != wd.field_Lb)) {
            return 2;
        }
        return -1;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_a = null;
        field_c = null;
        field_d = null;
        if (param0) {
          field_a = null;
          field_f = null;
          return;
        } else {
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Remove <%0> from ignore list";
        field_b = 0L;
        field_a = "You would have lost!";
    }
}
