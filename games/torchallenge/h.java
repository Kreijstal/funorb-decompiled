/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static byte[][] field_a;
    static int[][][] field_b;
    private ka[] field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 9) {
            h.a(66);
        }
        field_a = null;
    }

    final static void a(int param0, int param1, int[] param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param2[0] = param3;
              param2[31] = param1;
              if (param3 >= param1) {
                var6 = -1;
                var5_int = -param1 + param3;
                break L1;
              } else {
                var6 = 1;
                var5_int = -param3 + param1;
                break L1;
              }
            }
            var7 = 32;
            if (2 != var7) {
              L2: {
                if (var7 != 1) {
                  break L2;
                } else {
                  param2[0] = param1 + param3 >> 1;
                  break L2;
                }
              }
              if (0 != var7) {
                var8 = 0;
                var9 = 1;
                L3: while (true) {
                  if (var9 >= var7 - 1) {
                    break L0;
                  } else {
                    L4: {
                      param2[var9] = param2[0];
                      var8 = var9 * var5_int;
                      param2[var9] = param2[var9] + var6 * var8 / (var7 - 1);
                      if ((var7 - 1) / 2 <= var8 * var6 % (var7 + -1)) {
                        param2[var9] = param2[var9] + 1;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var9++;
                    continue L3;
                  }
                }
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var5;
            stackOut_19_1 = new StringBuilder().append("h.B(").append(0).append(44).append(param1).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param3 + 44 + 32 + 41);
        }
    }

    final static void a(int param0, int param1) {
        if (param1 != 4) {
            return;
        }
        fe var2 = cg.field_a[param0];
        int var3 = hb.field_b[param0];
        e discarded$0 = ol.a(-127, var2, var3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        hd.a(((h) this).field_c, param0, param4, (byte) -66, param1, param3);
        if (param2 != -1) {
            ((h) this).field_c = null;
        }
    }

    h(ka[] param0) {
        try {
            ((h) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "h.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[][][]{new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][], new int[8][]};
    }
}
