/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends rqa {
    static float field_p;
    static String field_q;
    static String field_r;
    static int field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 < -119) {
              si.a(166, 62, param0[0].a(113));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("jj.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    jj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, byte param1, int param2, float param3, int param4, int param5) {
        if (param1 == 7) {
          if (li.field_i) {
            if (lfa.field_j) {
              og.field_r.a(param0 | param4 << -821705192, Math.max(1, (int)param3), param5, param2, (byte) -113);
              return;
            } else {
              return;
            }
          } else {
            dma.e(param5, param2, (int)param3, param0, param4);
            return;
          }
        } else {
          jj.a(-51, (byte) -126, 78, -1.8534518480300903f, -88, 102);
          if (li.field_i) {
            if (!lfa.field_j) {
              return;
            } else {
              og.field_r.a(param0 | param4 << -821705192, Math.max(1, (int)param3), param5, param2, (byte) -113);
              return;
            }
          } else {
            dma.e(param5, param2, (int)param3, param0, param4);
            return;
          }
        }
    }

    public static void a(int param0) {
        int var1 = -32 / ((param0 - 39) / 32);
        field_q = null;
        field_r = null;
    }

    static {
        field_p = 1.0f;
        field_q = "Add friend";
        field_r = null;
        field_o = 192;
    }
}
