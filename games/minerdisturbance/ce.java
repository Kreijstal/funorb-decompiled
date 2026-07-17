/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce {
    static vm field_d;
    static int field_b;
    static ta field_a;
    static String[] field_c;

    final static void a(int param0, boolean param1, boolean param2, boolean param3) {
        RuntimeException var4 = null;
        int[] var4_array = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var14 = 0;
        int[] var15 = null;
        int[] stackIn_4_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_3_0 = null;
        int[] stackOut_2_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var14 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              param0 = 0 - param0;
              if (!param3) {
                stackOut_3_0 = sj.field_d;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = di.field_x;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            var15 = stackIn_4_0;
            var4_array = var15;
            if (var15 != null) {
              var5 = 0;
              var6 = 0;
              var7 = 33;
              L2: while (true) {
                if (var7 < 0) {
                  var7 = var6 / 9;
                  var8 = param0 + 145;
                  break L0;
                } else {
                  L3: {
                    int discarded$1 = -827843803;
                    if (!nm.a(var7, var15)) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 1;
                      stackIn_11_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                  L4: {
                    var8 = stackIn_11_0;
                    if (param3) {
                      stackOut_20_0 = 0;
                      stackIn_21_0 = stackOut_20_0;
                      break L4;
                    } else {
                      if (!pi.field_k[var7]) {
                        if (pi.field_e[var7]) {
                          if (0 < pj.field_a) {
                            stackOut_18_0 = 1;
                            stackIn_21_0 = stackOut_18_0;
                            break L4;
                          } else {
                            stackOut_17_0 = 0;
                            stackIn_21_0 = stackOut_17_0;
                            break L4;
                          }
                        } else {
                          stackOut_15_0 = 1;
                          stackIn_21_0 = stackOut_15_0;
                          break L4;
                        }
                      } else {
                        stackOut_13_0 = 0;
                        stackIn_21_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                  }
                  L5: {
                    L6: {
                      var9 = stackIn_21_0;
                      if (var8 != 0) {
                        break L6;
                      } else {
                        if (var9 != 0) {
                          break L6;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var6++;
                    break L5;
                  }
                  var7--;
                  continue L2;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw lj.a((Throwable) (Object) var4, "ce.C(" + param0 + 44 + 0 + 44 + 0 + 44 + param3 + 41);
        }
    }

    final static void a() {
        int[] var2 = new int[]{14, 1, 5, 6, 12, 2, 3, 4};
        int[] var1 = var2;
        nb.field_i[4] = new ml(4, var1, 10, 200, kb.field_c == 2 ? 350 : 320, 270, 270 / var2.length, true, 1);
        int[] var3 = new int[]{13, 1, 19, 5, 6, 12, 3, 17};
        var1 = var3;
        nb.field_i[0] = new ml(0, var1, 10, 180, 320, 280, 280 / var3.length, true, 1);
        int[] var4 = new int[]{21, 20, 0};
        var1 = var4;
        nb.field_i[9] = new ml(9, var1, 10, 356, 390, 340, 110 / var4.length, true, 1);
        int[] var5 = new int[]{7, 8, 9, 0, 25};
        var1 = var5;
        nb.field_i[2] = new ml(2, var1, 320, 372, 640, 320, 600 / (var5.length + -2), false, 1);
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = param1 >> 16;
        if (param0 != 4316) {
            int discarded$0 = ce.a(32, 8, 19);
        }
        int var4 = param1 & 65535;
        int var5 = param2 >> 16;
        int var6 = param2 & 65535;
        return var5 * var4 + (var3 * param2 + (var4 * var6 >> 16));
    }

    public static void b() {
        field_c = null;
        field_d = null;
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new ta();
    }
}
