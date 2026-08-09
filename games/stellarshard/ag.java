/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static int field_a;
    static int field_c;
    static int[][] field_b;

    public static void a(byte param0) {
        if (param0 <= 108) {
            field_c = 38;
        }
        field_b = (int[][]) null;
    }

    final static wb a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wb stackIn_3_0 = null;
        wb stackIn_7_0 = null;
        wb stackIn_17_0 = null;
        wb stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = stellarshard.field_B;
        try {
          L0: {
            var2_int = param1.length();
            if (param0 != (var2_int ^ -1)) {
              if (var2_int > 63) {
                stackIn_7_0 = bg.field_a;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L1: while (true) {
                  if (var3 < var2_int) {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 == 45) {
                        L3: {
                          if (0 == var3) {
                            break L3;
                          } else {
                            if (var3 == -1 + var2_int) {
                              break L3;
                            } else {
                              break L2;
                            }
                          }
                        }
                        stackIn_17_0 = h.field_a;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (0 == (lc.field_m.indexOf(var4) ^ -1)) {
                          stackIn_21_0 = h.field_a;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_3_0 = uj.field_d;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("ag.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_21_0;
            }
          }
        }
    }

    static {
        field_b = new int[][]{new int[]{64, 4032, 4032, 64, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, 4032, 64, 64, 4032}, new int[]{4032, 64, -1, -1, 4032, 64, -1, -1}, new int[]{-1, 4032, 64, -1, -1, 4032, 64, -1}, new int[]{-1, -1, 4032, 64, -1, -1, 4032, 64}, new int[]{64, -1, -1, 4032, 64, -1, -1, 4032}};
    }
}
