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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param3.a(param2, (byte) 8);
            var6 = -84 / ((param0 - 64) / 43);
            var5 = param3.a(var4_int, param1, true);
            stackIn_1_0 = ji.a(param3, -1, var4_int, var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("vm.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final static boolean c(int param0) {
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        dj var5 = null;
        int[] var6 = null;
        int[] var8 = null;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var17 = null;
        int[] var18 = null;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
              var13 = dj.field_i;
              var11 = var13;
              var6 = var11;
              var1 = var6;
              var17 = hg.field_b.field_k;
              var3 = 0;
              L2: while (true) {
                if ((var3 ^ -1) <= -9) {
                  var14 = kg.field_g;
                  var12 = var14;
                  var8 = var12;
                  var1 = var8;
                  var18 = hg.field_b.field_k;
                  var10 = 0;
                  var3 = var10;
                  L3: while (true) {
                    if (8 <= var10) {
                      hg.field_b = null;
                      stackIn_13_0 = 1;
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var8[var10] = eg.a(var14[var10], var18[var10] ^ -1);
                      var10++;
                      continue L3;
                    }
                  }
                } else {
                  var6[var3] = hi.a(var13[var3], var17[var3]);
                  var3++;
                  continue L2;
                }
              }
            } else {
              if (param0 == 1) {
                stackIn_17_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5 = (dj) null;
                vm.a((byte) 126, (String) null, (String) null, (dj) null);
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "vm.C(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0 != 0;
        } else {
          return stackIn_17_0 != 0;
        }
    }

    public vm() {
        this(2188450, 2591221, 9543);
    }

    public static void a(boolean param0) {
        field_u = (int[][]) null;
        if (!param0) {
            field_w = -51;
        }
    }

    private vm(int param0, int param1, int param2) {
        this.field_s = ia.field_d;
        this.field_r = param1;
        this.field_m = rk.field_b;
        this.field_v = param0;
        this.field_t = param2;
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        int stackIn_6_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (!param3.field_l) {
                if (param3.e(-17741)) {
                  stackIn_6_0 = 1;
                  break L1;
                } else {
                  stackIn_6_0 = 0;
                  break L1;
                }
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
            var6_int = stackIn_6_0;
            if (param0 == 16777215) {
              L2: {
                if (!(param3 instanceof an)) {
                  break L2;
                } else {
                  param1 = param1 & ((an) ((Object) param3)).field_C;
                  break L2;
                }
              }
              L3: {
                if (!param1) {
                  stackIn_15_0 = this.field_t;
                  break L3;
                } else {
                  if (var6_int == 0) {
                    stackIn_15_0 = this.field_v;
                    break L3;
                  } else {
                    stackIn_15_0 = this.field_r;
                    break L3;
                  }
                }
              }
              L4: {
                var7 = stackIn_15_0;
                tm.a(param3.field_k + param4, 32421, (param3.field_n - this.field_s[0].field_q >> -1436022879) + (param2 + param3.field_j), this.field_s, var7, param3.field_i);
                if (param1) {
                  stackIn_18_0 = 16777215;
                  break L4;
                } else {
                  stackIn_18_0 = 7105644;
                  break L4;
                }
              }
              var8 = stackIn_18_0;
              this.field_m.a(param3.field_o, param3.field_k + param4, param3.field_j + (param2 + -2), param3.field_i, param3.field_n, var8, -1, 1, 1, this.field_m.field_I);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var6);

            stackIn_22_1 = new StringBuilder().append("vm.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L5;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_w = 0;
    }
}
