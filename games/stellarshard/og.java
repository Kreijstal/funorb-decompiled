/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og {
    static fe field_c;
    static int[] field_b;
    static int field_a;
    static int[][] field_d;

    public static void a(byte param0) {
        if (param0 < 60) {
          field_d = (int[][]) null;
          field_d = (int[][]) null;
          field_c = null;
          field_b = null;
          return;
        } else {
          field_d = (int[][]) null;
          field_c = null;
          field_b = null;
          return;
        }
    }

    final static nl a(byte param0, String param1, int param2) {
        bc var3 = null;
        RuntimeException var3_ref = null;
        bc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        bc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var3 = new bc();
              if (param0 < -119) {
                break L1;
              } else {
                field_c = (fe) null;
                break L1;
              }
            }
            ((nl) ((Object) var3)).field_g = param2;
            ((nl) ((Object) var3)).field_c = param1;
            stackOut_2_0 = (bc) (var3);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3_ref);
            stackOut_4_1 = new StringBuilder().append("og.B(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return (nl) ((Object) stackIn_3_0);
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
        int decompiledRegionSelector0 = 0;
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
            if (param1 == 105) {
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
                    var12 = var10 + (1 + -var8) >> -1576356607;
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
                    var12 = -var7 + 1 - -var9 >> 1801245729;
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
                    var12 = var10 + 1 - var8 >> -1895664767;
                    L10: while (true) {
                      var12--;
                      if ((var12 ^ -1) > -1) {
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
                    var12 = var9 + (1 + -var7) >> -176056575;
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
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var5), "og.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_b = new int[4];
        field_d = new int[][]{new int[]{64, 64, 4032, 4032, -1, -1, -1, -1}, new int[]{-1, -1, -1, -1, 64, 64, 4032, 4032}, new int[]{64, 64, -1, -1, 4032, 4032, -1, -1}, new int[]{-1, 64, 64, -1, -1, 4032, 4032, -1}, new int[]{-1, -1, 64, 64, -1, -1, 4032, 4032}, new int[]{64, -1, -1, 64, 4032, -1, -1, 4032}};
    }
}
