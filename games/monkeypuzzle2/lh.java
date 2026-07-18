/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    static String field_a;
    static am field_c;
    static int field_b;
    static boolean field_e;
    static String[] field_d;

    final static void a(ad param0, ad param1, ad param2, int param3) {
        RuntimeException var4 = null;
        ai[] var5 = null;
        ai[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        ai[] var10 = null;
        le var11 = null;
        int var11_int = 0;
        int var12 = 0;
        le var13 = null;
        int var14 = 0;
        ai[] var15 = null;
        le var16 = null;
        int[][] var17 = null;
        le var18 = null;
        le var19 = null;
        int[][] var20 = null;
        int[][] var21 = null;
        int[][] var22 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            pe.field_a = lb.a(false, "commonui", param1, "frame_top");
            ra.field_Z = lb.a(false, "commonui", param1, "frame_bottom");
            af.field_e = ma.a(param1, "jagex_logo_grey", 16711680, "commonui");
            qj.field_C = lb.a(false, "commonui", param1, "button");
            hk.field_i = rd.a("validation", param1, 0, "commonui");
            pf.field_c = (ta) (Object) cb.a("commonui", param0, -103, param1, "arezzo12");
            t.field_z = (ta) (Object) cb.a("commonui", param0, -99, param1, "arezzo14");
            pj.field_c = (ta) (Object) cb.a("commonui", param0, -75, param1, "arezzo14bold");
            var18 = new le(param2.a("", "button.gif", -128), (java.awt.Component) (Object) ie.field_e);
            ai discarded$1 = df.a("commonui", param1, (byte) 118, "dropdown");
            var5 = uj.a("commonui", "screen_options", param1, false);
            vj.field_d = new ai[4];
            oa.field_D = new ai[4];
            tf.field_a = new ai[4];
            var6 = new ai[][]{vj.field_d, tf.field_a, oa.field_D};
            var22 = new int[4][];
            var21 = var22;
            var20 = var21;
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].field_m;
            var8 = 1;
            L1: while (true) {
              if (var8 >= var22.length) {
                var8 = var5[0].field_n[0];
                var22[2][var8] = 16777215;
                var22[1][var8] = 2394342;
                var22[3][var8] = 4767999;
                var9 = 0;
                L2: while (true) {
                  if (3 <= var9) {
                    var9 = var18.field_j;
                    vf.a((byte) 34);
                    var18.e();
                    ge.g(0, 0, ge.field_h, ge.field_g);
                    var16 = new le(var9, var9);
                    var19 = var16;
                    var19.e();
                    var18.a(0, 0);
                    var12 = 16 % ((param3 - 39) / 53);
                    var11 = new le(var9, var9);
                    var11.e();
                    var18.a(-var18.field_k + var9, 0);
                    var13 = new le(-(var9 * 2) + var18.field_k, var9);
                    var13.e();
                    var18.a(-var9, 0);
                    tj.b(653);
                    qj.field_C = new le[]{var16, var13, var11};
                    break L0;
                  } else {
                    var15 = var6[var9];
                    var10 = var15;
                    var11_int = 0;
                    L3: while (true) {
                      if (var11_int >= var15.length) {
                        var9++;
                        continue L2;
                      } else {
                        var15[var11_int] = ri.a(var5[var9], true, var22[var11_int]);
                        var11_int++;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                var7[var8] = (int[]) var22[0].clone();
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("lh.D(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw la.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param3 + ')');
        }
    }

    final static cj a(boolean param0, String param1, int param2) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        cj stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        cj stackOut_0_0 = null;
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
            var3 = new cj(false);
            var3.field_i = param2;
            var3.field_h = param1;
            stackOut_0_0 = (cj) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var3_ref;
            stackOut_2_1 = new StringBuilder().append("lh.C(").append(true).append(',');
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
          throw la.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(byte param0) {
        return MonkeyPuzzle2.field_D.f(-1);
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        field_d = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Discard";
        field_c = new am();
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
