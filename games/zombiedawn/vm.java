/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vm extends vf {
    private int field_r;
    private int field_v;
    private vn[] field_s;
    static int field_w;
    private int field_t;
    static int[][] field_u;

    final static vn[] a(byte param0, String param1, String param2, dj param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        vn[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        vn[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var4_int = param3.a(param2, (byte) 8);
            var6 = -84 / ((param0 - 64) / 43);
            var5 = param3.a(var4_int, param1, true);
            stackOut_0_0 = ji.a(param3, -1, var4_int, var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("vm.E(").append(param0).append(44);
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
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_1_0;
    }

    final static boolean c(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (hg.field_b == null) {
                hg.field_b = l.b(67, 4);
                break L1;
              } else {
                break L1;
              }
            }
            if (hg.field_b.field_o) {
              var5 = dj.field_i;
              var1 = var5;
              var6 = hg.field_b.field_k;
              var3 = 0;
              L2: while (true) {
                if (var3 >= 8) {
                  var7 = kg.field_g;
                  var1 = var7;
                  var8 = hg.field_b.field_k;
                  var9 = 0;
                  var3 = var9;
                  L3: while (true) {
                    if (8 <= var9) {
                      hg.field_b = null;
                      stackOut_12_0 = 1;
                      stackIn_13_0 = stackOut_12_0;
                      break L0;
                    } else {
                      var7[var9] = eg.a(var7[var9], ~var8[var9]);
                      var9++;
                      continue L3;
                    }
                  }
                } else {
                  var5[var3] = hi.a(var5[var3], var6[var3]);
                  var3++;
                  continue L2;
                }
              }
            } else {
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) (Object) var1_ref, "vm.C(" + 1 + 41);
        }
        return stackIn_13_0 != 0;
    }

    public vm() {
        this(2188450, 2591221, 9543);
    }

    public static void a(boolean param0) {
        field_u = null;
        field_w = -51;
    }

    private vm(int param0, int param1, int param2) {
        ((vm) this).field_s = ia.field_d;
        ((vm) this).field_r = param1;
        ((vm) this).field_m = rk.field_b;
        ((vm) this).field_v = param0;
        ((vm) this).field_t = param2;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if (!param3.field_l) {
                if (param3.e(-17741)) {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L1;
                } else {
                  stackOut_3_0 = 0;
                  stackIn_6_0 = stackOut_3_0;
                  break L1;
                }
              } else {
                stackOut_1_0 = 1;
                stackIn_6_0 = stackOut_1_0;
                break L1;
              }
            }
            var6_int = stackIn_6_0;
            if (param0 == 16777215) {
              L2: {
                if (!(param3 instanceof an)) {
                  break L2;
                } else {
                  param1 = param1 & ((an) (Object) param3).field_C;
                  break L2;
                }
              }
              L3: {
                if (!param1) {
                  stackOut_14_0 = ((vm) this).field_t;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  if (var6_int == 0) {
                    stackOut_13_0 = ((vm) this).field_v;
                    stackIn_15_0 = stackOut_13_0;
                    break L3;
                  } else {
                    stackOut_12_0 = ((vm) this).field_r;
                    stackIn_15_0 = stackOut_12_0;
                    break L3;
                  }
                }
              }
              L4: {
                var7 = stackIn_15_0;
                tm.a(param3.field_k + param4, 32421, (param3.field_n - ((vm) this).field_s[0].field_q >> 1) + (param2 + param3.field_j), ((vm) this).field_s, var7, param3.field_i);
                if (param1) {
                  stackOut_17_0 = 16777215;
                  stackIn_18_0 = stackOut_17_0;
                  break L4;
                } else {
                  stackOut_16_0 = 7105644;
                  stackIn_18_0 = stackOut_16_0;
                  break L4;
                }
              }
              var8 = stackIn_18_0;
              int discarded$1 = ((vm) this).field_m.a(param3.field_o, param3.field_k + param4, param3.field_j + (param2 + -2), param3.field_i, param3.field_n, var8, -1, 1, 1, ((vm) this).field_m.field_I);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("vm.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L5;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0;
    }
}
