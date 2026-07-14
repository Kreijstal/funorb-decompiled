/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eq extends nt {
    private int field_t;
    private double field_s;
    static int[] field_v;
    private boolean field_u;
    static String field_w;

    public static void e(int param0) {
        if (param0 != 3190) {
            return;
        }
        field_w = null;
        field_v = null;
    }

    eq(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        super(param0, param1, param2, param3);
        ((eq) this).field_t = param4;
        ((eq) this).field_s = (double)param0;
        ((eq) this).field_u = param5 ? true : false;
    }

    final void a(ha param0, int param1) {
        L0: {
          if (param1 < -121) {
            break L0;
          } else {
            eq.e(-79);
            break L0;
          }
        }
        if (!((eq) this).field_u) {
          uc.field_a.a((float)((eq) this).field_k, (float)((eq) this).field_o, -200 + -(int)(((double)(-((eq) this).field_p) + ((eq) this).field_s) / ((eq) this).field_s * 2048.0) + 2048, 0, 3, ((eq) this).field_p * 2 << 1379490168, 1);
          return;
        } else {
          am.field_j[((eq) this).field_t].a((float)((eq) this).field_k, (float)((eq) this).field_o, -200 + (2048 + -(int)(2048.0 * ((((eq) this).field_s - (double)((eq) this).field_p) / ((eq) this).field_s))), 0, 3, 3 * ((eq) this).field_p << -360268552, 1);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new int[8192];
        field_w = "To Customer Support";
    }
}
