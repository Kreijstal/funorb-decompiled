/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends rqa {
    final static asb a(byte param0, int param1) {
        int var2 = 0;
        var2 = 59 / ((7 - param0) / 45);
        if (lwa.field_xb == null) {
          if (-1 == param1) {
            return lwa.field_xb;
          } else {
            return mla.a(true, false, -65, true, param1, 1);
          }
        } else {
          return lwa.field_xb;
        }
    }

    pj(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(ha param0, sw param1, da param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (param3 >= -123) {
            return;
        }
        try {
            Object var11 = null;
            es.a(param4, param9, param1, param8, param2, param7, param0, param6, -115, (no) null, param5);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "pj.B(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              si.a(218, 62, param0[0].a(109));
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = null;
                pj.a((ha) null, (sw) null, (da) null, 34, 113, 21, -90, -26, 89, -84);
                break L1;
              }
            }
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("pj.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    static {
    }
}
