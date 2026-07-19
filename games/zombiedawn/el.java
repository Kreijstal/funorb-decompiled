/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class el implements io {
    static int field_d;
    private int field_l;
    static String field_h;
    private int field_e;
    private rb field_j;
    static int field_n;
    private int field_a;
    static String field_m;
    private int field_f;
    static int field_k;
    private int field_b;
    static int field_g;
    private int field_c;
    static String field_i;

    public static void a(int param0) {
        Object discarded$2 = null;
        byte[] var2 = null;
        field_m = null;
        if (param0 != -1) {
          var2 = (byte[]) null;
          discarded$2 = el.a((byte) 20, false, (byte[]) null);
          field_i = null;
          field_h = null;
          return;
        } else {
          field_i = null;
          field_h = null;
          return;
        }
    }

    final static Object a(byte param0, boolean param1, byte[] param2) {
        kp var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        kp stackIn_5_0 = null;
        Object stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_12_0 = null;
        byte[] stackOut_10_0 = null;
        Object stackOut_7_0 = null;
        kp stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            if (param2 != null) {
              if (param2.length <= 136) {
                if (param0 == 94) {
                  if (!param1) {
                    stackOut_12_0 = (byte[]) (param2);
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    stackOut_10_0 = jl.a(param2, (byte) 45);
                    stackIn_11_0 = stackOut_10_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  stackOut_7_0 = (Object) null;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                var3 = new kp();
                ((rf) ((Object) var3)).a(4, param2);
                stackOut_4_0 = (kp) (var3);
                stackIn_5_0 = stackOut_4_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var3_ref);
            stackOut_14_1 = new StringBuilder().append("el.B(").append(param0).append(',').append(param1).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L1;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L1;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_11_0;
              } else {
                return stackIn_13_0;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_8_0 = 0;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if ((param0 ^ -1) >= -2) {
                if (param1 == 28913) {
                  if (param0 == 1) {
                    stackOut_12_0 = var3_int * param2;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return var3_int;
                  }
                } else {
                  stackOut_8_0 = 91;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  if (0 != (1 & param0)) {
                    var3_int = var3_int * param2;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param2 = param2 * param2;
                param0 = param0 >> 1;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var3), "el.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_13_0;
        }
    }

    public final void a(int param0, boolean param1, int param2, ga param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        hf var12 = null;
        ga stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        ga stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              if (param3 instanceof hf) {
                stackOut_3_0 = (ga) (param3);
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (ga) ((Object) stackOut_2_0);
                break L1;
              }
            }
            L2: {
              var12 = (hf) ((Object) stackIn_4_0);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              bi.b(param4 + param3.field_k, param3.field_j + param2, param3.field_i, param3.field_n, this.field_b);
              if (param0 == 16777215) {
                break L3;
              } else {
                el.a(-79);
                break L3;
              }
            }
            var7 = -(var12.field_K * 2) + param3.field_i;
            var8 = param3.field_k + (param4 - -var12.field_K);
            var9 = var12.field_G + (param2 - -param3.field_j);
            bi.e(var8, var9, var8 - -var7, var9, this.field_l);
            var10 = var12.a(-85) + -1;
            L4: while (true) {
              if (-1 < (var10 ^ -1)) {
                if (null == this.field_j) {
                  break L0;
                } else {
                  this.field_j.a(var12.field_o, var8 + var7 / 2, this.field_j.field_C + (var9 - -var12.field_G), this.field_a, this.field_c);
                  return;
                }
              } else {
                bi.g(var8 + var12.a((byte) 58, var10) * var7 / var12.b(false), var9, this.field_e, this.field_f);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var6);
            stackOut_13_1 = new StringBuilder().append("el.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw sh.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param4 + ')');
        }
    }

    el(rb param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            this.field_c = param2;
            this.field_e = param5;
            this.field_j = param0;
            this.field_l = param3;
            this.field_f = param6;
            this.field_a = param1;
            this.field_b = param4;
        } catch (RuntimeException runtimeException) {
            throw sh.a((Throwable) ((Object) runtimeException), "el.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_h = "Large screen sizes and high resolutions may cause the game to run slowly. If so, try using lower resolutions or screen sizes.";
        field_m = "Loading graphics";
        field_i = "Retry";
    }
}
