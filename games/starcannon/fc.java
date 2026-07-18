/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static double field_b;
    static int[] field_d;
    static o field_a;
    static int field_c;
    static int field_e;

    final static void a(int param0, byte param1, int param2) {
        th.field_c = param2;
        int var3 = -34 % ((-3 - param1) / 60);
        ee.field_b = param0;
    }

    final static boolean a() {
        return null != m.field_b && r.field_c == pb.field_a;
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
    }

    final static void a(ue param0, ue param1, byte param2, ue param3) {
        RuntimeException var4 = null;
        id[] var5 = null;
        id[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        id[] var10 = null;
        hl var11 = null;
        int var11_int = 0;
        hl var12 = null;
        int var13 = 0;
        int var14 = 0;
        id[] var15 = null;
        hl var16 = null;
        int[][] var17 = null;
        hl var18 = null;
        hl var19 = null;
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
        var14 = StarCannon.field_A;
        try {
          L0: {
            ed.field_o = ob.a("frame_top", 112, "commonui", param3);
            ti.field_e = ob.a("frame_bottom", 122, "commonui", param3);
            jk.field_g = vk.a("commonui", 63, "jagex_logo_grey", param3);
            t.field_r = ob.a("button", 94, "commonui", param3);
            fi.field_g = hb.a(-990, "commonui", param3, "validation");
            nb.field_b = (qe) (Object) ai.a(param3, "commonui", true, "arezzo12", param1);
            nb.field_c = (qe) (Object) ai.a(param3, "commonui", true, "arezzo14", param1);
            tk.field_a = (qe) (Object) ai.a(param3, "commonui", true, "arezzo14bold", param1);
            var18 = new hl(param0.a("button.gif", (byte) -95, ""), (java.awt.Component) (Object) kj.field_E);
            int discarded$4 = 0;
            id discarded$5 = o.a(param3, "commonui", "dropdown");
            int discarded$6 = 0;
            var5 = fg.a(param3, "screen_options", "commonui");
            il.field_e = new id[4];
            w.field_u = new id[4];
            rj.field_i = new id[4];
            var6 = new id[][]{il.field_e, rj.field_i, w.field_u};
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
                  if (var9 >= 3) {
                    var9 = var18.field_v;
                    int discarded$7 = 1;
                    wj.b();
                    var18.e();
                    ki.a(0, 0, ki.field_j, ki.field_f);
                    var16 = new hl(var9, var9);
                    var19 = var16;
                    var19.e();
                    var18.d(0, 0);
                    var11 = new hl(var9, var9);
                    var11.e();
                    var18.d(-var18.field_u + var9, 0);
                    var13 = 0;
                    var12 = new hl(var18.field_u + -(var9 * 2), var9);
                    var12.e();
                    var18.d(-var9, 0);
                    wf.a(-80);
                    t.field_r = new hl[]{var16, var12, var11};
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
                        var15[var11_int] = nc.a((byte) -106, var5[var9], var22[var11_int]);
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
            stackOut_12_1 = new StringBuilder().append("fc.D(");
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
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(95).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
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
          throw sd.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
    }

    final static void a(rb param0, rb param1, java.math.BigInteger param2, java.math.BigInteger param3) {
        try {
            vj.a(param0.field_f, 0, param2, param1, param0.field_g, (byte) 99, param3);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "fc.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + 0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0.0;
        field_a = new o(13, 0, 1, 0);
        field_e = -2115970;
    }
}
