/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    int field_a;
    int field_d;
    int[] field_h;
    String field_c;
    static String field_b;
    private String field_f;
    int field_i;
    private boolean field_g;
    static int[] field_m;
    static pc field_l;
    private long field_j;
    static int field_e;
    private int field_k;

    final int a(int param0) {
        int var2 = 0;
        if (!((oc) this).field_g) {
          if (((oc) this).field_a == 2) {
            if (((oc) this).field_k <= 0) {
              if (((oc) this).field_j == he.field_e) {
                return 1;
              } else {
                if (rk.field_d == 2) {
                  if (!bj.a(true, ((oc) this).field_f)) {
                    var2 = -28 % ((9 - param0) / 60);
                    return 0;
                  } else {
                    return 1;
                  }
                } else {
                  var2 = -28 % ((9 - param0) / 60);
                  return 0;
                }
              }
            } else {
              return 2;
            }
          } else {
            if (((oc) this).field_j == he.field_e) {
              return 1;
            } else {
              if (rk.field_d == 2) {
                if (!bj.a(true, ((oc) this).field_f)) {
                  var2 = -28 % ((9 - param0) / 60);
                  return 0;
                } else {
                  return 1;
                }
              } else {
                var2 = -28 % ((9 - param0) / 60);
                return 0;
              }
            }
          }
        } else {
          return 2;
        }
    }

    final static int b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_21_0 = 0;
        var2 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            boolean discarded$12 = vg.field_Z.a(true, true, ih.field_b, jf.field_k);
            vg.field_Z.i((byte) 70);
            L1: while (true) {
              if (!nm.e((byte) -96)) {
                if (qn.field_n != -1) {
                  var1_int = qn.field_n;
                  vf.a((byte) -115, -1);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (s.field_K) {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    if (wh.field_fb == na.field_S) {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      if (!fb.field_a.c(17237)) {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        if (wh.field_fb != oe.field_Q) {
                          stackOut_23_0 = -1;
                          stackIn_24_0 = stackOut_23_0;
                          break L0;
                        } else {
                          stackOut_21_0 = 2;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0;
                        }
                      }
                    }
                  }
                }
              } else {
                boolean discarded$13 = vg.field_Z.a((byte) 101, ad.field_h, gk.field_r);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "oc.B(" + 1 + 41);
        }
        return stackIn_24_0;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int[] var10_array = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var16 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: while (true) {
              param8--;
              if (param8 < 0) {
                var10_int = -119 / ((param2 - 2) / 51);
                break L0;
              } else {
                var17 = param1;
                var10_array = var17;
                var11 = param0;
                var12 = param3;
                var13 = param4;
                var14 = param5;
                var15 = (16711422 & var17[var11]) >> 1;
                var10_array[var11] = var15 - -(va.a(var12, 33423360) >> 1) - -va.a(var13 >> 9, 65280) - -(va.a(33487527, var14) >> 17);
                param4 = param4 + param9;
                param3 = param3 + param7;
                param5 = param5 + param6;
                param0++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var10 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var10;
            stackOut_5_1 = new StringBuilder().append("oc.C(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 44 + param9 + 41);
        }
    }

    public static void c(int param0) {
        field_l = null;
        field_b = null;
        int var1 = 0;
        field_m = null;
    }

    oc(boolean param0) {
        ((oc) this).field_i = qd.field_d;
        ((oc) this).field_j = rl.field_x;
        if (!param0) {
            ((oc) this).field_h = null;
        } else {
            ((oc) this).field_h = lk.field_b;
        }
        ((oc) this).field_f = ej.field_d;
        ((oc) this).field_g = im.field_c;
        ((oc) this).field_c = q.field_j;
        ((oc) this).field_a = cc.field_m;
        ((oc) this).field_d = ha.field_e;
        ((oc) this).field_k = ve.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Create a free account to start using this feature";
        field_e = 67;
    }
}
