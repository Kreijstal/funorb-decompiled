/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl implements qk {
    static String field_g;
    private int field_i;
    static String field_o;
    static gh field_c;
    static rf field_k;
    private int field_n;
    static String[][] field_h;
    private mi field_l;
    static wk[] field_d;
    static boolean field_a;
    static String field_j;
    static gk[] field_p;
    static String field_b;
    static int[] field_e;
    static String field_f;
    static int[] field_m;

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6, int param7, boolean param8, int param9, boolean param10, boolean param11) {
        int var12 = -29;
        oh.a(16777215, 11, param2, 15, param3, (byte) -125, 0, param1, true, param6, param10, param8, 14, 16777215);
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param2 == -30) {
                break L1;
              } else {
                var12 = null;
                bl.a(113, (String) null, (byte) 12);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param1.field_C) {
                  break L3;
                } else {
                  if (param1.d(0)) {
                    break L3;
                  } else {
                    stackOut_5_0 = 2188450;
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
              }
              stackOut_6_0 = 3249872;
              stackIn_7_0 = stackOut_6_0;
              break L2;
            }
            var6_int = stackIn_7_0;
            int discarded$1 = ((bl) this).field_l.a("<u=" + Integer.toString(var6_int, 16) + ">" + param1.field_y + "</u>", param0 - -param1.field_o, param4 - -param1.field_z, param1.field_x, param1.field_E, var6_int, -1, ((bl) this).field_n, ((bl) this).field_i, ((bl) this).field_l.field_G - -((bl) this).field_l.field_F);
            if (param1.d(0)) {
              L4: {
                var7 = ((bl) this).field_l.c(param1.field_y);
                var8 = ((bl) this).field_l.field_G + ((bl) this).field_l.field_F;
                var9 = param1.field_o + param0;
                var10 = param1.field_z + param4;
                if (((bl) this).field_n == 2) {
                  var9 = var9 + (param1.field_x + -var7);
                  break L4;
                } else {
                  if (((bl) this).field_n == 1) {
                    var9 = var9 + (param1.field_x + -var7 >> 1);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (((bl) this).field_i != 2) {
                  if (((bl) this).field_i != 1) {
                    break L5;
                  } else {
                    var10 = var10 + (-var8 + param1.field_E >> 1);
                    break L5;
                  }
                } else {
                  var10 = var10 + (-var8 + param1.field_E);
                  break L5;
                }
              }
              ha.a(var9 - 2, 4 + var7, var8, 0, var10 + 2);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("bl.A(").append(param0).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
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
          throw ci.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, int param1, gh param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dd var9 = null;
        wk var10 = null;
        String var11 = null;
        dd var12 = null;
        wk var13 = null;
        String var14 = null;
        dd var15 = null;
        wk var16 = null;
        String var17 = null;
        dd var18 = null;
        wk var19 = null;
        String var20 = null;
        dd var21 = null;
        wk var22 = null;
        String var23 = null;
        dd var24 = null;
        wk var25 = null;
        String var26 = null;
        dd var27 = null;
        wk var28 = null;
        String var29 = null;
        dd var30 = null;
        wk var31 = null;
        String var32 = null;
        dd var33 = null;
        wk var34 = null;
        String var35 = null;
        dd var36 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            kk.a(param2, -1, param1, (int[]) null, (String) null, (String) null, 1073741824, 0L, (kg) null);
            L1: {
              if (param1 != 0) {
                break L1;
              } else {
                var9 = an.field_i;
                var10 = dh.field_y[0];
                var19 = var10;
                var19 = var10;
                var11 = ac.field_ab;
                var9.field_j.a(11, var10, var11, -47);
                var12 = an.field_i;
                var13 = dh.field_y[1];
                var19 = var13;
                var19 = var13;
                var14 = bi.field_a;
                var12.field_j.a(12, var13, var14, -105);
                var15 = an.field_i;
                var16 = dh.field_y[2];
                var19 = var16;
                var19 = var16;
                var17 = lk.field_V;
                var15.field_j.a(13, var16, var17, -45);
                break L1;
              }
            }
            L2: {
              if (1 == param1) {
                var18 = an.field_i;
                var19 = dh.field_y[0];
                var20 = kc.field_t;
                var18.field_j.a(11, var19, var20, -102);
                var21 = an.field_i;
                var22 = dh.field_y[1];
                var23 = cj.field_f;
                var21.field_j.a(12, var22, var23, -91);
                var24 = an.field_i;
                var25 = dh.field_y[2];
                var26 = og.field_a;
                var24.field_j.a(13, var25, var26, -64);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 != 2) {
                break L3;
              } else {
                var27 = an.field_i;
                var28 = dh.field_y[0];
                var29 = mg.field_gc;
                var27.field_j.a(11, var28, var29, -125);
                var30 = an.field_i;
                var31 = dh.field_y[1];
                var32 = qm.field_g;
                var30.field_j.a(12, var31, var32, -87);
                var33 = an.field_i;
                var34 = dh.field_y[2];
                var35 = he.field_f;
                var33.field_j.a(13, var34, var35, -62);
                break L3;
              }
            }
            var36 = an.field_i;
            var4 = param2.field_Rb;
            var5 = param2.field_cb;
            var6 = param2.field_zb;
            var7 = param2.field_Lb;
            var36.field_j.a(var7, var6, var5, (byte) -91, var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var3;
            stackOut_11_1 = new StringBuilder().append("bl.E(").append(12).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_j = null;
        field_b = null;
        field_o = null;
        field_f = null;
        field_d = null;
        field_k = null;
        field_c = null;
        field_p = null;
        field_h = null;
        field_e = null;
        field_m = null;
    }

    final static void a(int param0, String param1, byte param2) {
        int var3_int = 0;
        int var4 = SteelSentinels.field_G;
        try {
            for (var3_int = 5; var3_int > 0; var3_int--) {
                ke.field_b[var3_int] = ke.field_b[-1 + var3_int];
                hh.field_c[var3_int] = hh.field_c[-1 + var3_int];
                fi.field_g[var3_int] = fi.field_g[var3_int - 1];
            }
            ke.field_b[0] = ke.a(42, param1);
            hh.field_c[0] = 750;
            fi.field_g[0] = param0;
            var3_int = 18 % ((param2 - 86) / 34);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "bl.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public bl() {
        ((bl) this).field_n = 1;
        ((bl) this).field_l = tj.field_e;
        ((bl) this).field_i = 1;
    }

    bl(mi param0, int param1, int param2) {
        try {
            ((bl) this).field_i = param2;
            ((bl) this).field_n = param1;
            ((bl) this).field_l = param0;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "bl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "EDD";
        field_g = "Quick Chat game";
        field_c = null;
        field_k = new rf();
        field_b = "Player Name: ";
        field_j = "You need a rating of <%1> to play with the current options.";
    }
}
