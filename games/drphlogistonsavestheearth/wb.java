/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb {
    static he[] field_a;
    static he[] field_b;
    static java.security.SecureRandom field_c;

    final static void a(java.applet.Applet param0, int param1, int param2, int param3, String[] param4, int param5) {
        String var6 = null;
        RuntimeException var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              dc.field_f = param0.getParameter("overxgames");
              if (null != dc.field_f) {
                break L1;
              } else {
                dc.field_f = "0";
                break L1;
              }
            }
            L2: {
              fl.field_d = param0.getParameter("overxachievements");
              if (null == fl.field_d) {
                fl.field_d = "0";
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              L4: {
                var6 = param0.getParameter("currency");
                if (var6 == null) {
                  break L4;
                } else {
                  if (jf.a((CharSequence) (Object) var6, 7552)) {
                    gd.field_a = hh.a(10, (CharSequence) (Object) var6);
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              gd.field_a = 2;
              break L3;
            }
            em.field_d = 150;
            rh.field_e = 15488514;
            qf.field_d = 1052688;
            bh.field_c = new nh[param4.length];
            var7 = 0;
            L5: while (true) {
              if (var7 >= param4.length) {
                bc.field_b = param4;
                break L0;
              } else {
                bh.field_c[var7] = new nh(317, 34);
                var7++;
                continue L5;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6_ref;
            stackOut_16_1 = new StringBuilder().append("wb.B(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          L7: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(2).append(',').append(1052688).append(',').append(150).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L7;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + 15488514 + ')');
        }
    }

    final static void a(int param0) {
        hl.field_d = false;
        r.field_d = 8;
    }

    public static void b(int param0) {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(boolean param0, int param1, je param2) {
        aa.field_e.a((gi) (Object) param2, 255);
        try {
            hl.a(param2, 126, 4);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "wb.D(" + true + ',' + 4 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new he[1];
    }
}
