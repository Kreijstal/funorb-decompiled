/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class h {
    static byte[][] field_a;
    static int[][][] field_b;
    private ka[] field_c;

    public static void a(int param0) {
        field_b = (int[][][]) null;
        if (param0 <= 9) {
            h.a(66);
        }
        field_a = (byte[][]) null;
    }

    final static void a(int param0, int param1, int[] param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var10 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (0 >= param4) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                param2[param0] = param3;
                param2[-1 + param4] = param1;
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
              var7 = param4;
              if (2 != var7) {
                L2: {
                  if ((var7 ^ -1) != -2) {
                    break L2;
                  } else {
                    param2[0] = param1 + param3 >> 1152917025;
                    break L2;
                  }
                }
                if (0 != var7) {
                  var8 = 0;
                  var9 = 1;
                  L3: while (true) {
                    if (var9 >= var7 - 1) {
                      decompiledRegionSelector0 = 3;
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
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("h.B(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
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
        hd.a(this.field_c, param0, param4, (byte) -66, param1, param3);
        if (param2 != -1) {
            this.field_c = (ka[]) null;
        }
    }

    h(ka[] param0) {
        try {
            this.field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "h.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = new int[][][]{new int[][]{new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}}, new int[][]{new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}, new int[]{4, 4, 4}}, new int[][]{new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{0, 0, 0}, new int[]{2, 2, 2}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}, new int[][]{new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}, new int[][]{new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{1, 1, 1}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{2, 2, 2}, new int[]{4, 4, 4}, new int[]{4, 4, 4}}, new int[][]{new int[]{0, 0, 0}, new int[]{4, 4, 4}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}, new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{4, 4, 4}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}, new int[][]{new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{4, 4, 4}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}, new int[]{0, 0, 0}}};
    }
}
