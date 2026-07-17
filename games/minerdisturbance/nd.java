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
        if (param1 == 1) {
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
        pe stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_18_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (ae.field_a != null) {
            if (param1 != null) {
              if (param1.length() != 0) {
                var6 = (CharSequence) (Object) param1;
                var2 = cl.a(-95, var6);
                if (var2 != null) {
                  L0: {
                    if (param0 == 1) {
                      break L0;
                    } else {
                      field_a = null;
                      break L0;
                    }
                  }
                  var3 = (pe) (Object) ae.field_a.a(-7895, (long)var2.hashCode());
                  L1: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_ob;
                      var4 = cl.a(-95, var7);
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_18_0 = (pe) var3;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        var3 = (pe) (Object) ae.field_a.c(1);
                        continue L1;
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
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("nd.A(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L2;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L2;
            }
          }
          throw lj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
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
