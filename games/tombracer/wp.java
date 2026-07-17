/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp {
    static String field_a;
    static int field_b;
    static int[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
    }

    final static mu a(int param0, String param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        mu var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_10_0 = null;
        Object stackIn_13_0 = null;
        mu stackIn_19_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        mu stackOut_18_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (hia.field_s != null) {
            if (param1 != null) {
              if (param1.length() != 0) {
                var6 = (CharSequence) (Object) param1;
                var2 = jd.a(1, var6);
                if (var2 != null) {
                  if (param0 > 85) {
                    var3 = (mu) (Object) hia.field_s.a(-128, (long)var2.hashCode());
                    L0: while (true) {
                      if (var3 != null) {
                        var7 = (CharSequence) (Object) var3.field_tb;
                        var4 = jd.a(1, var7);
                        if (!var4.equals((Object) (Object) var2)) {
                          var3 = (mu) (Object) hia.field_s.b((byte) 47);
                          continue L0;
                        } else {
                          stackOut_18_0 = (mu) var3;
                          stackIn_19_0 = stackOut_18_0;
                          return stackIn_19_0;
                        }
                      } else {
                        return null;
                      }
                    }
                  } else {
                    stackOut_12_0 = null;
                    stackIn_13_0 = stackOut_12_0;
                    return (mu) (Object) stackIn_13_0;
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (mu) (Object) stackIn_10_0;
                }
              } else {
                return null;
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
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("wp.C(").append(param0).append(44);
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
              break L1;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        L0: {
          if (null == hka.field_b) {
            break L0;
          } else {
            if (null != hka.field_b.field_h) {
              hka.field_b.field_h.field_cb = false;
              break L0;
            } else {
              lu.field_b = null;
              if (param0 == -1) {
                hka.field_b = null;
                return;
              } else {
                var2 = null;
                mu discarded$4 = wp.a(-23, (String) null);
                hka.field_b = null;
                return;
              }
            }
          }
        }
        lu.field_b = null;
        if (param0 != -1) {
          var2 = null;
          mu discarded$5 = wp.a(-23, (String) null);
          hka.field_b = null;
          return;
        } else {
          hka.field_b = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[8192];
    }
}
