/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd {
    static String field_a;
    static boolean field_e;
    static ie field_d;
    static int field_b;
    static java.awt.Frame field_f;
    static String[][] field_c;

    final static boolean a(int param0, int param1) {
        if (sn.field_b[param0] != null) {
          if (sn.field_b[param0].field_t) {
            if (null != sn.field_b[param0].field_p) {
              if (null == sn.field_b[param0].field_p[1][0]) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          return false;
        }
    }

    final static pe a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        pe var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        pe stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_16_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (ae.field_a != null) {
            if (param1 != null) {
              if (param1.length() != 0) {
                var6 = (CharSequence) (Object) param1;
                var2 = cl.a(-95, var6);
                if (var2 != null) {
                  var3 = (pe) (Object) ae.field_a.a(-7895, (long)var2.hashCode());
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_ob;
                      var4 = cl.a(-95, var7);
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_16_0 = (pe) var3;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var3 = (pe) (Object) ae.field_a.c(1);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  return null;
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (pe) (Object) stackIn_7_0;
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
            stackOut_20_0 = (RuntimeException) var2_ref;
            stackOut_20_1 = new StringBuilder().append("nd.A(").append(1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Munched and Crunched";
        field_d = new ie();
        field_b = 0;
        field_c = new String[][]{new String[1]};
    }
}
