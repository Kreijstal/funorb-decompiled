/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp extends ak {
    final void b(int param0) {
        super.b(param0);
    }

    public lp() {
        super(11);
    }

    final void a(int param0, ha param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            wo.a(up.field_c, 360, -5, -16777216, 3, param1, 650, 50, 1, true);
            be.field_t.a(tt.field_k, param0 << 24 | 5023231, -1, 105, 320, 0);
            hc.field_e.a(tt.field_k, -1, -1, 105, 320, 0);
            int discarded$2 = qv.field_k.a(100, 5023231 | param0 << 24, 0, 200, 220, (int[]) null, (hr[]) null, 90, -1, 0, 0, -8787, ps.field_b.toUpperCase() + " " + in.field_z + "<br>" + tj.field_l.toUpperCase() + " " + dp.b(jk.field_a, -23620), (aa) null, 1, 1);
            int discarded$3 = uq.field_a.a(100, -1, 0, 200, 220, (int[]) null, (hr[]) null, 90, -1, 0, 0, -8787, ps.field_b.toUpperCase() + " " + in.field_z + "<br>" + tj.field_l.toUpperCase() + " " + dp.b(jk.field_a, param2 + -21265), (aa) null, 1, 1);
            super.a(param0, param1, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("lp.B(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qo.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ')');
        }
    }

    final static void a(boolean param0) {
        if (jt.field_u <= 0) {
          if (0 == jt.field_u) {
            pd.field_p = un.field_a[0];
            nv.field_a = 0;
            return;
          } else {
            return;
          }
        } else {
          jt.field_u = jt.field_u - 1;
          if (0 != jt.field_u) {
            return;
          } else {
            pd.field_p = un.field_a[0];
            nv.field_a = 0;
            return;
          }
        }
    }

    static {
    }
}
