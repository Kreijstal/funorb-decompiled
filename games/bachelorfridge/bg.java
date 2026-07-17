/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends jm {
    static String field_m;

    public bg() {
        ((bg) this).field_j = 5;
    }

    final void a(boolean param0, op param1) {
        try {
            param1.field_K = 0;
            param1.field_x = param0 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bg.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    bg(lu param0) {
        try {
            ((bg) this).field_j = 5;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "bg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void b(int param0) {
        field_m = null;
        if (param0 != 5) {
            bg.b(92);
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        aja.field_p = null;
        qc.field_b = null;
        lna.field_q = true;
        qq.field_k = null;
        bi.field_h = null;
        var1 = -34 / ((-5 - param0) / 54);
        if (lna.field_C != null) {
          ts.field_r = qk.field_q;
          jba.field_A = lna.field_C;
          jba.field_A.field_ab = -1;
          jba.field_A.field_G = -1;
          qk.field_q = null;
          lna.field_C = null;
          ub.field_k = null;
          return;
        } else {
          ub.field_k = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Find opponents";
    }
}
