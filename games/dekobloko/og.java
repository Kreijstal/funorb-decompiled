/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends rk implements jl {
    static boolean field_ib;
    static String field_gb;
    static int field_eb;
    private nb field_fb;
    static String field_hb;
    private int field_db;

    final String c(byte param0) {
        if (((og) this).field_q) {
          if (((og) this).field_B != null) {
            kl.a(11024, bh.field_g - (((og) this).field_db + -((og) this).field_t), pm.field_f);
            if (param0 != 113) {
              field_gb = null;
              return ((og) this).field_B;
            } else {
              return ((og) this).field_B;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void l(int param0) {
        super.l(param0);
        if (!(((og) this).field_fb == null)) {
            ((og) this).field_fb.c((byte) -51);
        }
    }

    og(String param0, kg param1, int param2) {
        super(param0, param1, param2);
    }

    public final nb a(int param0) {
        if (param0 > -86) {
            field_gb = null;
            return ((og) this).field_fb;
        }
        return ((og) this).field_fb;
    }

    final void a(nb param0, int param1) {
        if (param1 != -5362) {
            return;
        }
        try {
            ((og) this).field_fb = param0;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "og.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0, int param1, boolean param2) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (!param0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        im.field_f = stackIn_3_0 != 0;
        if (!param2) {
          og.a(false, -59, false);
          gb.field_Ob = ve.field_nc;
          fe.field_b = param1;
          return;
        } else {
          gb.field_Ob = ve.field_nc;
          fe.field_b = param1;
          return;
        }
    }

    public static void i() {
        field_gb = null;
        field_hb = null;
    }

    final void a(ce param0, int param1, int param2, int param3) {
        super.a(param0, 50, param2, param3);
        if (param1 < 38) {
            return;
        }
        try {
            ((og) this).field_db = bh.field_g - ((og) this).field_u + -param3;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "og.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_gb = "Close";
        field_ib = true;
        field_hb = "Next";
    }
}
