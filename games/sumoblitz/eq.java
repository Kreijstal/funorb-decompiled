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
        this.field_t = param4;
        this.field_s = (double)param0;
        this.field_u = param5 ? true : false;
    }

    final void a(ha param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -121) {
              break L0;
            } else {
              eq.e(-79);
              break L0;
            }
          }
          if (this.field_u) {
            am.field_j[this.field_t].a((float)this.field_k, (float)this.field_o, -200 + (2048 + -(int)(2048.0 * ((this.field_s - (double)this.field_p) / this.field_s))), 0, 3, 3 * this.field_p << -360268552, 1);
            return;
          } else {
            uc.field_a.a((float)this.field_k, (float)this.field_o, -200 + -(int)(((double)(-this.field_p) + this.field_s) / this.field_s * 2048.0) + 2048, 0, 3, this.field_p * 2 << 1379490168, 1);
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("eq.C(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L1;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L1;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    static {
        field_v = new int[8192];
        field_w = "To Customer Support";
    }
}
