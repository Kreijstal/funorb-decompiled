/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private kd field_d;
    static String field_b;
    static int[] field_c;
    static hm field_a;
    private kd field_e;
    static rm field_f;

    final kd a(boolean param0) {
        kd var2 = null;
        var2 = ((ra) this).field_e;
        if (((ra) this).field_d == var2) {
          ((ra) this).field_e = null;
          return null;
        } else {
          ((ra) this).field_e = var2.field_o;
          if (param0) {
            ra.b((byte) 121);
            return var2;
          } else {
            return var2;
          }
        }
    }

    final kd b(int param0) {
        kd var2 = ((ra) this).field_d.field_o;
        if (param0 != 22) {
            kd discarded$9 = ((ra) this).b(118);
            if (!(var2 != ((ra) this).field_d)) {
                ((ra) this).field_e = null;
                return null;
            }
            ((ra) this).field_e = var2.field_o;
            return var2;
        }
        if (!(var2 != ((ra) this).field_d)) {
            ((ra) this).field_e = null;
            return null;
        }
        ((ra) this).field_e = var2.field_o;
        return var2;
    }

    final void a(int param0) {
        kd var2 = null;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        L0: while (true) {
          var2 = ((ra) this).field_d.field_o;
          if (var2 == ((ra) this).field_d) {
            if (param0 != 8150) {
              int discarded$2 = ((ra) this).a((byte) -114);
              ((ra) this).field_e = null;
              return;
            } else {
              ((ra) this).field_e = null;
              return;
            }
          } else {
            var2.e(480);
            continue L0;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, byte param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              pb.g(param3, param0, 1 + param1, 10000536);
              pb.g(param3, param2 + param0, 1 + param1, 12105912);
              var5_int = 1;
              if (pb.field_l <= param0 + var5_int) {
                break L1;
              } else {
                var5_int = pb.field_l - param0;
                break L1;
              }
            }
            L2: {
              var6 = param2;
              if (pb.field_d >= var6 + param0) {
                break L2;
              } else {
                var6 = pb.field_d - param0;
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var6 <= var7) {
                if (param4 > 93) {
                  break L0;
                } else {
                  field_b = null;
                  return;
                }
              } else {
                var8 = 152 - -(48 * var7 / param2);
                var9 = var8 << 16 | var8 << 8 | var8;
                pb.field_g[pb.field_c * (param0 - -var7) + param3] = var9;
                pb.field_g[param1 + (param3 + pb.field_c * (param0 + var7))] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var5, "ra.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        int var1 = -107 % ((-33 - param0) / 46);
        field_b = null;
        field_f = null;
        field_c = null;
    }

    final kd c(int param0) {
        kd var2 = null;
        int var3 = 0;
        var2 = ((ra) this).field_d.field_o;
        var3 = -86 % ((param0 - -32) / 35);
        if (var2 == ((ra) this).field_d) {
          return null;
        } else {
          var2.e(480);
          return var2;
        }
    }

    final static void a(int param0, int param1, mi param2, int param3, int param4, byte param5, String param6) {
        wk[] var8 = null;
        RuntimeException var8_ref = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          var8 = pl.field_T;
          jm.a(2, 28, var8, 1, param3, param4);
          if (param6 != null) {
            param2.a(param6, param4 / 2 + param3, param2.field_U / 2 + 16, param0, -1);
            return;
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var8_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8_ref;
            stackOut_4_1 = new StringBuilder().append("ra.A(").append(param0).append(44).append(2).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param2 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          L1: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44).append(param3).append(44).append(param4).append(44).append(68).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + 28 + 41);
        }
    }

    final void a(byte param0, kd param1) {
        RuntimeException var3 = null;
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
        try {
          L0: {
            L1: {
              if (null == param1.field_v) {
                break L1;
              } else {
                param1.e(480);
                break L1;
              }
            }
            param1.field_o = ((ra) this).field_d;
            param1.field_v = ((ra) this).field_d.field_v;
            param1.field_v.field_o = param1;
            param1.field_o.field_v = param1;
            if (param0 > 34) {
              break L0;
            } else {
              ((ra) this).field_e = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ra.F(").append(param0).append(44);
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
          throw ci.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        kd var3 = null;
        int var4 = 0;
        var4 = SteelSentinels.field_G;
        var2 = 0;
        var3 = ((ra) this).field_d.field_o;
        if (param0 < -81) {
          L0: while (true) {
            if (((ra) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_o;
              var2++;
              continue L0;
            }
          }
        } else {
          kd discarded$1 = ((ra) this).a(false);
          L1: while (true) {
            if (((ra) this).field_d == var3) {
              return var2;
            } else {
              var3 = var3.field_o;
              var2++;
              continue L1;
            }
          }
        }
    }

    public ra() {
        ((ra) this).field_d = new kd();
        ((ra) this).field_d.field_v = ((ra) this).field_d;
        ((ra) this).field_d.field_o = ((ra) this).field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have completed the training missions. Log in or create a free account to play multiplayer games or to begin the single player campaign.";
        field_c = new int[]{0, 1, 28, 5, 35, 4, 3, 22, 19};
        field_a = new hm();
        field_f = new rm(1);
    }
}
