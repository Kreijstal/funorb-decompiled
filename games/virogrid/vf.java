/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf {
    static String field_d;
    static on field_b;
    static aj field_f;
    static String field_a;
    static km field_e;
    static int field_c;

    final static void a(int param0) {
        gk.field_g.g(62, 8);
        gk.field_g.a(123, 117);
    }

    public static void a(boolean param0) {
        field_d = null;
        field_b = null;
        field_f = null;
        if (param0) {
          field_d = null;
          field_e = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_a = null;
          return;
        }
    }

    final static hh a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        hh stackIn_4_0 = null;
        hh stackIn_8_0 = null;
        hh stackIn_17_0 = null;
        hh stackIn_20_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        hh stackOut_3_0 = null;
        hh stackOut_7_0 = null;
        hh stackOut_19_0 = null;
        hh stackOut_16_0 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = Virogrid.field_F ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackOut_3_0 = a.field_H;
            stackIn_4_0 = stackOut_3_0;
            return stackIn_4_0;
          } else {
            if (var2_int > 63) {
              stackOut_7_0 = cb.field_a;
              stackIn_8_0 = stackOut_7_0;
              return stackIn_8_0;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var2_int > var3) {
                  L1: {
                    var4 = param0.charAt(var3);
                    if (var4 != 45) {
                      if (ae.field_f.indexOf(var4) != -1) {
                        break L1;
                      } else {
                        stackOut_19_0 = jj.field_f;
                        stackIn_20_0 = stackOut_19_0;
                        return stackIn_20_0;
                      }
                    } else {
                      L2: {
                        if (var3 == 0) {
                          break L2;
                        } else {
                          if (var3 != -1 + var2_int) {
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      stackOut_16_0 = jj.field_f;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("vf.A(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + 8286 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Both players have the same number of pieces";
        field_b = new on();
        field_a = "Try again";
        field_c = 360;
    }
}
