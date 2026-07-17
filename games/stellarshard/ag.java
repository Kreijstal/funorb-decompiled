/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static int field_a;
    static int field_c;
    static int[][] field_b;

    public static void a() {
        field_b = null;
    }

    final static wb a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wb stackIn_3_0 = null;
        wb stackIn_7_0 = null;
        wb stackIn_17_0 = null;
        wb stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        wb stackOut_6_0 = null;
        wb stackOut_16_0 = null;
        wb stackOut_20_0 = null;
        wb stackOut_2_0 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        var5 = stellarshard.field_B;
        try {
          var2_int = param1.length();
          if (var2_int != 0) {
            if (var2_int > 63) {
              stackOut_6_0 = bg.field_a;
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var3 < var2_int) {
                  L1: {
                    var4 = param1.charAt(var3);
                    if (var4 == 45) {
                      L2: {
                        if (0 == var3) {
                          break L2;
                        } else {
                          if (var3 == -1 + var2_int) {
                            break L2;
                          } else {
                            break L1;
                          }
                        }
                      }
                      stackOut_16_0 = h.field_a;
                      stackIn_17_0 = stackOut_16_0;
                      return stackIn_17_0;
                    } else {
                      if (lc.field_m.indexOf(var4) == -1) {
                        stackOut_20_0 = h.field_a;
                        stackIn_21_0 = stackOut_20_0;
                        return stackIn_21_0;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var3++;
                  continue L0;
                } else {
                  return null;
                }
              }
            }
          } else {
            stackOut_2_0 = uj.field_d;
            stackIn_3_0 = stackOut_2_0;
            return stackIn_3_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var2;
            stackOut_24_1 = new StringBuilder().append("ag.B(").append(-1).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L3;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[][]{new int[8], new int[8], new int[8], new int[8], new int[8], new int[8]};
    }
}
