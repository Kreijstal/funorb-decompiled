/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie extends l {
    static int field_y;
    private int field_z;
    static ec field_v;
    static String field_C;
    private int field_w;
    private int field_A;
    static boolean field_B;
    static he[] field_x;
    private nh[] field_t;
    static boolean[] field_u;

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var16 = 0;
        int var17 = 0;
        var17 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 < param13) {
          if (param13 >= param14) {
            if (param14 > param1) {
              r.a(param2, param6, param9, param3, param5, wj.field_l, param12, param7, param14, param8, param10, param13, param15, param11, param0, (byte) -66, param1);
              var16 = 116 / ((53 - param4) / 62);
              return;
            } else {
              r.a(param5, param6, param8, param15, param2, wj.field_l, param12, param10, param1, param9, param7, param13, param3, param11, param0, (byte) -65, param14);
              var16 = 116 / ((53 - param4) / 62);
              return;
            }
          } else {
            r.a(param11, param9, param6, param3, param5, wj.field_l, param10, param7, param13, param8, param12, param14, param0, param2, param15, (byte) -60, param1);
            var16 = 116 / ((53 - param4) / 62);
            return;
          }
        } else {
          if (param1 >= param14) {
            if (param13 < param14) {
              r.a(param2, param8, param9, param0, param11, wj.field_l, param7, param12, param14, param6, param10, param1, param15, param5, param3, (byte) -67, param13);
              var16 = 116 / ((53 - param4) / 62);
              return;
            } else {
              r.a(param11, param8, param6, param15, param2, wj.field_l, param7, param10, param13, param9, param12, param1, param0, param5, param3, (byte) -88, param14);
              var16 = 116 / ((53 - param4) / 62);
              return;
            }
          } else {
            r.a(param5, param9, param8, param0, param11, wj.field_l, param10, param12, param1, param6, param7, param14, param3, param2, param15, (byte) -112, param13);
            var16 = 116 / ((53 - param4) / 62);
            return;
          }
        }
    }

    public final void a(boolean param0, int param1, vg param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
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
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
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
              if (param1 > 94) {
                break L1;
              } else {
                ((ie) this).field_t = null;
                break L1;
              }
            }
            L2: {
              if (!param2.field_n) {
                if (param2.a(true)) {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                } else {
                  stackOut_5_0 = 0;
                  stackIn_8_0 = stackOut_5_0;
                  break L2;
                }
              } else {
                stackOut_3_0 = 1;
                stackIn_8_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (!(param2 instanceof hf)) {
                break L3;
              } else {
                param0 = param0 & ((hf) (Object) param2).field_E;
                break L3;
              }
            }
            L4: {
              if (param0) {
                if (var6_int != 0) {
                  stackOut_14_0 = ((ie) this).field_z;
                  stackIn_15_0 = stackOut_14_0;
                  break L4;
                } else {
                  stackOut_13_0 = ((ie) this).field_A;
                  stackIn_15_0 = stackOut_13_0;
                  break L4;
                }
              } else {
                stackOut_11_0 = ((ie) this).field_w;
                stackIn_15_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var7 = stackIn_15_0;
              if (!param0) {
                stackOut_17_0 = 7105644;
                stackIn_18_0 = stackOut_17_0;
                break L5;
              } else {
                stackOut_16_0 = 16777215;
                stackIn_18_0 = stackOut_16_0;
                break L5;
              }
            }
            var8 = stackIn_18_0;
            lh.a(((ie) this).field_t, (byte) 121, param2.field_w, var7, param4 - -param2.field_o, param3 + param2.field_m + (param2.field_k + -((ie) this).field_t[0].field_C >> 1));
            int discarded$1 = ((ie) this).field_g.a(param2.field_p, param2.field_o + param4, param2.field_m + (param3 + -2), param2.field_w, param2.field_k, var8, -1, 1, 1, ((ie) this).field_g.field_x);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("ie.J(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    public ie() {
        this(2188450, 2591221, 9543);
    }

    final static int a(boolean param0) {
        return -si.field_B + li.field_k;
    }

    public static void c(int param0) {
        field_C = null;
        field_v = null;
        field_x = null;
        field_u = null;
    }

    final static gl a(Throwable param0, String param1) {
        gl var2 = null;
        if (!(param0 instanceof gl)) {
            var2 = new gl(param0, param1);
        } else {
            var2 = (gl) (Object) param0;
            var2.field_d = var2.field_d + 32 + param1;
        }
        return var2;
    }

    private ie(int param0, int param1, int param2) {
        ((ie) this).field_w = param2;
        ((ie) this).field_g = wi.field_e;
        ((ie) this).field_z = param1;
        ((ie) this).field_A = param0;
        ((ie) this).field_t = rk.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = -1;
        field_C = null;
        field_x = new he[1];
        field_B = true;
        field_u = new boolean[]{true, true, false, false, true, true, true, true, true, true, true, false, false, true, false};
    }
}
