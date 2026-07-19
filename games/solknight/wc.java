/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static da field_b;
    static kb field_f;
    static int field_e;
    static int field_a;
    static String field_d;
    static int field_c;

    public static void a(boolean param0) {
        field_f = null;
        field_b = null;
        field_d = null;
        if (param0) {
            field_b = (da) null;
        }
    }

    final static o a(o param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        o var6 = null;
        o stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        o stackOut_10_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var6 = new o(param0.field_t, param0.field_p);
            var6.field_q = param0.field_r;
            var6.field_s = param0.field_q + -param0.field_p - param0.field_n;
            var6.field_r = param0.field_q;
            var6.field_n = param0.field_s;
            var3 = param1;
            L1: while (true) {
              L2: {
                if (var3 >= var6.field_t) {
                  break L2;
                } else {
                  var4 = 0;
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var4 >= var6.field_p) {
                          break L5;
                        } else {
                          var6.field_v[var6.field_p * var3 + var4] = param0.field_v[var3 + (param0.field_t + -1 - var4) * param0.field_p];
                          var4++;
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (var5 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var3++;
                      break L4;
                    }
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_10_0 = (o) (var6);
              stackIn_11_0 = stackOut_10_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var2);
            stackOut_12_1 = new StringBuilder().append("wc.B(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L6;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L6;
            }
          }
          throw fc.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    static {
        field_f = new kb();
        field_e = 480;
        field_a = 256;
        field_d = "More suggestions";
    }
}
