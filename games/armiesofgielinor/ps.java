/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ps extends lk {
    static kl field_u;
    static int field_E;
    static wk[] field_w;
    static String field_x;
    private ru[] field_B;
    static int[] field_D;
    static pf field_y;
    static String field_A;
    static boolean field_v;
    static String field_z;
    static int[] field_C;

    final static va b(byte param0) {
        int var1 = 0;
        int var2_int = 0;
        IllegalArgumentException var2 = null;
        va var3 = null;
        int var4 = 0;
        va stackIn_4_0 = null;
        Throwable decompiledCaughtException = null;
        va stackOut_3_0 = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = -18;
        try {
          var2_int = 0;
          L0: while (true) {
            var3 = mp.field_Sb.a(var2_int, true);
            if (!var3.field_H) {
              var2_int++;
              continue L0;
            } else {
              stackOut_3_0 = (va) var3;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    public static void c(boolean param0) {
        field_y = null;
        field_w = null;
        field_A = null;
        field_x = null;
        field_z = null;
        field_u = null;
        field_C = null;
        field_D = null;
    }

    public final void a(kb param0, int param1, int param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ru var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_8_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            L1: {
              qn.b(param0.field_B + param1, param4 + param0.field_p, param0.field_l, param0.field_w, 10197915);
              if (param2 <= -79) {
                break L1;
              } else {
                field_A = null;
                break L1;
              }
            }
            L2: {
              if (param3) {
                if (((fw) (Object) param0).field_K) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 0;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (param3) {
                if (param0.a(false)) {
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_14_0 = stackOut_11_0;
                  break L3;
                }
              } else {
                stackOut_9_0 = 0;
                stackIn_14_0 = stackOut_9_0;
                break L3;
              }
            }
            L4: {
              var7 = stackIn_14_0;
              var8 = 0;
              if (var7 == 0) {
                break L4;
              } else {
                var8 = var8 | 2;
                break L4;
              }
            }
            L5: {
              if (var6_int == 0) {
                stackOut_18_0 = 16777215;
                stackIn_19_0 = stackOut_18_0;
                break L5;
              } else {
                stackOut_17_0 = 2394342;
                stackIn_19_0 = stackOut_17_0;
                break L5;
              }
            }
            L6: {
              var9 = stackIn_19_0;
              if (var6_int != 0) {
                var8 = var8 | 1;
                break L6;
              } else {
                break L6;
              }
            }
            var10 = ((ps) this).field_B[var8];
            var11 = param1 + param0.field_B - -((-var10.field_e + param0.field_l) / 2);
            var12 = (-var10.field_h + param0.field_w) / 2 + param4 - -param0.field_p;
            var13 = param0.field_B + (param1 + param0.field_l / 2);
            var10.a(var11, var12);
            ((ps) this).field_q.c(((ps) this).d(0, param0), var13, param4, var9, -1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) var6;
            stackOut_24_1 = new StringBuilder().append("ps.C(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          sh.field_l = param0;
          if (sj.field_d != mj.field_c) {
            var2 = mj.field_c * mj.field_c;
            var3 = var2 - sj.field_d * sj.field_d;
            param0 = param0 + var3 * (gb.field_y - param0) / var2;
            break L0;
          } else {
            break L0;
          }
        }
        ag.field_I.a(120, -20500, 640, param0, va.field_u);
        hm.a(-1, mi.field_l, 0, io.field_n, 5, gb.field_y - 24, 640);
        if (!param1) {
          field_z = null;
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, kl param1, kl param2) {
        try {
            if (param0 < 30) {
                ps.c(false);
            }
            iw.field_p = param2;
            bh.field_H = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ps.E(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    ps(ru[] param0) {
        try {
            ((ps) this).field_B = param0;
            ((ps) this).field_q = ArmiesOfGielinor.field_J;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ps.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new wk[3];
        field_D = new int[]{100, 100, 200, 100, 100, 100, 200, 200, 200, 200, 300, 200, 200, 200, 300, 500, 100, 100, 100, 200, 300, 300, 100, 100, 100, 100, 100, 100, 100, 100, 200, 200, 200, 200, 200, 200, 200, 200, 200, 300, 500, 300, 300, 500, 200, 300, 500, 300, 300, 500, 200, 300, 500, 200, 300, 500};
        field_E = 250;
        field_x = "This ground produces no Mana";
        field_y = new pf("usename");
        field_A = "You are on <%0>";
        field_z = "Click or press F10 to open Quick Chat";
        field_C = new int[]{2, 2, 2, 2, 2};
    }
}
