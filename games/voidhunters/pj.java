/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pj extends rqa {
    final static asb a(byte param0, int param1) {
        int var2;
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
            no var11 = (no) null;
            es.a(param4, param9, param1, param8, param2, param7, param0, param6, -115, (no) null, param5);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "pj.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        da var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              si.a(218, 62, param0[0].a(109));
              if (param1 <= -119) {
                break L1;
              } else {
                var4 = (da) null;
                pj.a((ha) null, (sw) null, (da) null, 34, 113, 21, -90, -26, 89, -84);
                break L1;
              }
            }
            stackIn_3_0 = new nc("void");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("pj.A(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
    }
}
