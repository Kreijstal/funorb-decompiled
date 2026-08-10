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
        le var18 = null;
        ai[] var5 = null;
        ai[][] var6 = null;
        int[][] var20 = null;
        int[][] var17 = null;
        int[][] var7 = null;
        ai[] var15 = null;
        int var11_int = 0;
        le var16 = null;
        le var19 = null;
        le var11 = null;
        le var13 = null;
        int var8 = 0;
        int var9 = 0;
        int var14 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            pe.field_a = lb.a(false, "commonui", param1, "frame_top");
            ra.field_Z = lb.a(false, "commonui", param1, "frame_bottom");
            af.field_e = ma.a(param1, "jagex_logo_grey", 16711680, "commonui");
            qj.field_C = lb.a(false, "commonui", param1, "button");
            hk.field_i = rd.a("validation", param1, 0, "commonui");
            pf.field_c = (ta) ((Object) cb.a("commonui", param0, -103, param1, "arezzo12"));
            t.field_z = (ta) ((Object) cb.a("commonui", param0, -99, param1, "arezzo14"));
            pj.field_c = (ta) ((Object) cb.a("commonui", param0, -75, param1, "arezzo14bold"));
            var18 = new le(param2.a("", "button.gif", -128), (java.awt.Component) ((Object) ie.field_e));
            df.a("commonui", param1, (byte) 118, "dropdown");
            var5 = uj.a("commonui", "screen_options", param1, false);
            vj.field_d = new ai[4];
            oa.field_D = new ai[4];
            tf.field_a = new ai[4];
            var6 = new ai[][]{vj.field_d, tf.field_a, oa.field_D};
            var20 = new int[4][];
            var17 = var20;
            var7 = var17;
            var7[0] = var5[0].field_m;
            for (var8 = 1; var8 < var20.length; var8++) {
                var7[var8] = (int[]) ((Object) var20[0].clone());
            }
            var8 = var5[0].field_n[0];
            var20[2][var8] = 16777215;
            var20[1][var8] = 2394342;
            var20[3][var8] = 4767999;
            for (var9 = 0; 3 > var9; var9++) {
                var15 = var6[var9];
                ai[] var10 = var15;
                for (var11_int = 0; var11_int < var15.length; var11_int++) {
                    var15[var11_int] = ri.a(var5[var9], true, var20[var11_int]);
                }
            }
            var9 = var18.field_j;
            vf.a((byte) 34);
            var18.e();
            ge.g(0, 0, ge.field_h, ge.field_g);
            var16 = new le(var9, var9);
            var19 = var16;
            var19.e();
            var18.a(0, 0);
            int var12 = 16 % ((param3 - 39) / 53);
            var11 = new le(var9, var9);
            var11.e();
            var18.a(-var18.field_k + var9, 0);
            var13 = new le(-(var9 * 2) + var18.field_k, var9);
            var13.e();
            var18.a(-var9, 0);
            tj.b(653);
            qj.field_C = new le[]{var16, var13, var11};
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "lh.D(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static cj a(boolean param0, String param1, int param2) {
        cj var3 = null;
        RuntimeException var3_ref = null;
        cj stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = new cj(false);
              var3.field_i = param2;
              var3.field_h = param1;
              if (param0) {
                break L1;
              } else {
                field_e = false;
                break L1;
              }
            }
            stackIn_3_0 = (cj) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("lh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(byte param0) {
        if (param0 > -93) {
            field_b = 46;
        }
        return MonkeyPuzzle2.field_D.f(-1);
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_c = (am) null;
        }
        field_c = null;
        field_a = null;
        field_d = null;
    }

    static {
        field_a = "Discard";
        field_c = new am();
        field_d = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
