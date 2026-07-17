/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static fe field_c;
    static int[] field_b;
    static int field_a;
    static int[][] field_d;

    public static void a() {
        field_d = null;
        field_c = null;
        field_b = null;
    }

    final static nl a(byte param0, String param1, int param2) {
        bc var3 = null;
        RuntimeException var3_ref = null;
        bc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        bc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3 = new bc();
            ((nl) (Object) var3).field_g = param2;
            ((nl) (Object) var3).field_c = param1;
            stackOut_0_0 = (bc) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("og.B(").append(-122).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 41);
        }
        return (nl) (Object) stackIn_1_0;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        var13 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              var5_int = param2 + param0;
              var6 = param4 + param3;
              if (ti.field_e >= param0) {
                stackOut_5_0 = ti.field_e;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = param0;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_6_0;
              if (param4 > ti.field_f) {
                stackOut_8_0 = param4;
                stackIn_9_0 = stackOut_8_0;
                break L2;
              } else {
                stackOut_7_0 = ti.field_f;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_9_0;
              if (var5_int >= ti.field_c) {
                stackOut_11_0 = ti.field_c;
                stackIn_12_0 = stackOut_11_0;
                break L3;
              } else {
                stackOut_10_0 = var5_int;
                stackIn_12_0 = stackOut_10_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_12_0;
              if (ti.field_l > var6) {
                stackOut_14_0 = var6;
                stackIn_15_0 = stackOut_14_0;
                break L4;
              } else {
                stackOut_13_0 = ti.field_l;
                stackIn_15_0 = stackOut_13_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_15_0;
              if (ti.field_e > param0) {
                break L5;
              } else {
                if (param0 < ti.field_c) {
                  var11 = param0 + var8 * ti.field_i;
                  var12 = var10 + (1 + -var8) >> 1;
                  L6: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L5;
                    } else {
                      ti.field_a[var11] = 16777215;
                      var11 = var11 + 2 * ti.field_i;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (ti.field_f > param4) {
                break L7;
              } else {
                if (ti.field_l <= var6) {
                  break L7;
                } else {
                  var11 = param4 * ti.field_i - -var7;
                  var12 = -var7 + 1 - -var9 >> 1;
                  L8: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L7;
                    } else {
                      ti.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                }
              }
            }
            L9: {
              if (ti.field_e > var5_int) {
                break L9;
              } else {
                if (ti.field_c > var5_int) {
                  var11 = var5_int + ti.field_i * (var8 + (1 & var5_int + -param0));
                  var12 = var10 + 1 - var8 >> 1;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      ti.field_a[var11] = 16777215;
                      var11 = var11 + 2 * ti.field_i;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (param4 < ti.field_f) {
                break L11;
              } else {
                if (var6 < ti.field_l) {
                  var11 = var7 + (var6 * ti.field_i + (1 & -param4 + var6));
                  var12 = var9 + (1 + -var7) >> 1;
                  L12: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L11;
                    } else {
                      ti.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var5, "og.A(" + param0 + 44 + 105 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[4];
        field_d = new int[][]{new int[8], new int[8], new int[8], new int[8], new int[8], new int[8]};
    }
}
