/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static int field_d;
    static String field_f;
    static int field_a;
    static String field_c;
    static so field_e;
    static di field_g;
    static boolean[] field_b;

    final static void a(int param0, String[] param1) {
        try {
            if (lh.field_c != null) {
                lh.field_c.field_P.a(false, param1);
            }
            if (null != tg.field_a) {
                tg.field_a.field_S.a(false, param1);
            }
            int var2_int = 25 % ((param0 - -8) / 53);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "gf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(qp param0, int param1) {
        try {
            if (param1 != 0) {
                Object var3 = null;
                gf.a((qp) null, 80);
            }
            e.field_a.a(param1 ^ -99, (vh) (Object) param0);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "gf.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a() {
        field_g = null;
        field_e = null;
        field_b = null;
        field_f = null;
        field_c = null;
    }

    final static eo a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        eo var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_6_0 = null;
        Object stackIn_9_0 = null;
        eo stackIn_16_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        eo stackOut_15_0 = null;
        Object stackOut_8_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        try {
          if (df.field_b != null) {
            if (param1 != null) {
              if (0 != param1.length()) {
                var3 = 53 / ((-16 - param0) / 62);
                var6 = (CharSequence) (Object) param1;
                var2 = hq.a(83, var6);
                if (var2 != null) {
                  var4 = (eo) (Object) df.field_b.a((long)var2.hashCode(), false);
                  L0: while (true) {
                    if (var4 != null) {
                      var7 = (CharSequence) (Object) var4.field_Zb;
                      var5 = hq.a(84, var7);
                      if (var5.equals((Object) (Object) var2)) {
                        stackOut_15_0 = (eo) var4;
                        stackIn_16_0 = stackOut_15_0;
                        return stackIn_16_0;
                      } else {
                        var4 = (eo) (Object) df.field_b.a(-127);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_8_0 = null;
                  stackIn_9_0 = stackOut_8_0;
                  return (eo) (Object) stackIn_9_0;
                }
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (eo) (Object) stackIn_6_0;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var2_ref;
            stackOut_19_1 = new StringBuilder().append("gf.B(").append(param0).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L1;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Please remove <%0> from your friend list first.";
        field_c = "Accept <%0> into this game";
    }
}
