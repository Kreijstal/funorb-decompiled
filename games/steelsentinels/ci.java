/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci {
    static String field_d;
    static int field_g;
    static bf field_a;
    static int[] field_c;
    static String field_h;
    static ul field_e;
    static String field_f;
    static String[] field_b;

    final static String a(byte param0) {
        int var2 = 0;
        String var7 = null;
        int var3 = 0;
        int var4 = 0;
        String var8 = null;
        int var5 = SteelSentinels.field_G;
        String var6 = "(" + di.field_d + " " + ma.field_W + " " + aj.field_u + ") " + ch.field_N;
        String var1 = var6;
        if (param0 != 94) {
            return (String) null;
        }
        if ((jg.field_f ^ -1) >= -1) {
        } else {
            var1 = var6 + ":";
            for (var2 = 0; var2 < jg.field_f; var2++) {
                var7 = var1 + ' ';
                var3 = rf.field_d.field_t[var2] & 255;
                var4 = var3 >> 1155482372;
                var3 = var3 & 15;
                if (10 <= var4) {
                    var4 += 55;
                } else {
                    var4 += 48;
                }
                var8 = var7 + (char)var4;
                if (-11 < (var3 ^ -1)) {
                    var3 += 48;
                } else {
                    var3 += 55;
                }
                var1 = var8 + (char)var3;
            }
        }
        return var1;
    }

    public static void a(boolean param0) {
        if (param0) {
            ci.a((byte) -76);
        }
        field_f = null;
        field_d = null;
        field_c = null;
        field_e = null;
        field_h = null;
        field_a = null;
        field_b = null;
    }

    final static void a(cm param0, byte param1, cm param2, cm param3) {
        wk var17 = null;
        gk[] var5 = null;
        gk[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        gk[] var14 = null;
        int var11_int = 0;
        wk var15 = null;
        wk var18 = null;
        wk var11 = null;
        wk var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = SteelSentinels.field_G;
        try {
            jj.field_k = cf.a("frame_top", "commonui", (byte) -95, param0);
            jb.field_J = cf.a("frame_bottom", "commonui", (byte) -94, param0);
            jb.field_L = rl.a(param0, "commonui", "jagex_logo_grey", false);
            un.field_m = cf.a("button", "commonui", (byte) -54, param0);
            t.field_i = ec.a((byte) -62, "validation", param0, "commonui");
            rc.field_m = (mi) ((Object) be.a(param0, param2, (byte) -48, "arezzo12", "commonui"));
            tj.field_e = (mi) ((Object) be.a(param0, param2, (byte) -62, "arezzo14", "commonui"));
            gf.field_d = (mi) ((Object) be.a(param0, param2, (byte) -57, "arezzo14bold", "commonui"));
            var17 = new wk(param3.a("", -742, "button.gif"), (java.awt.Component) ((Object) sl.field_n));
            if (param1 < 63) {
                ci.a(true);
            }
            gl.a(param0, (byte) 85, "commonui", "dropdown");
            var5 = cj.a(45, "commonui", param0, "screen_options");
            lh.field_q = new gk[4];
            ce.field_q = new gk[4];
            vm.field_r = new gk[4];
            var6 = new gk[][]{lh.field_q, ce.field_q, vm.field_r};
            var19 = new int[4][];
            var16 = var19;
            var7 = var16;
            var7[0] = var5[0].field_o;
            for (var8 = 1; var19.length > var8; var8++) {
                var7[var8] = (int[]) ((Object) var19[0].clone());
            }
            var8 = var5[0].field_p[0];
            var19[2][var8] = 16777215;
            var19[1][var8] = 2394342;
            var19[3][var8] = 4767999;
            for (var9 = 0; (var9 ^ -1) > -4; var9++) {
                var14 = var6[var9];
                gk[] var10 = var14;
                for (var11_int = 0; var14.length > var11_int; var11_int++) {
                    var14[var11_int] = uh.a(var5[var9], var19[var11_int], false);
                }
            }
            var9 = var17.field_F;
            jl.a(false);
            var17.d();
            pb.b(0, 0, pb.field_c, pb.field_j);
            var15 = new wk(var9, var9);
            var18 = var15;
            var18.d();
            var17.f(0, 0);
            var11 = new wk(var9, var9);
            var11.d();
            var17.f(var9 + -var17.field_A, 0);
            var12 = new wk(var17.field_A - var9 * 2, var9);
            var12.d();
            var17.f(-var9, 0);
            tk.f((byte) 122);
            un.field_m = new wk[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "ci.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static String a(cm param0, byte param1, String param2, String param3, String param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0.a(true)) {
              L1: {
                if (param1 >= 86) {
                  break L1;
                } else {
                  field_g = -116;
                  break L1;
                }
              }
              stackIn_6_0 = param3 + " - " + param0.a((byte) 94, param2) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (String) (param4);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("ci.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param4 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L5;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L5;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_10_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_6_0;
        }
    }

    final static od a(Throwable param0, String param1) {
        od var2 = null;
        if (param0 instanceof od) {
            var2 = (od) ((Object) param0);
            var2.field_a = var2.field_a + ' ' + param1;
        } else {
            var2 = new od(param0, param1);
        }
        return var2;
    }

    final static void a(boolean param0, byte param1) {
        if (!(null == ll.field_i)) {
            jg.a(ll.field_i, 1);
        }
        if (null != an.field_i) {
            an.field_i.b(param0, (byte) -114);
        }
        bh.a((byte) -115, param0);
        int var2 = 40 % ((param1 - 49) / 45);
        if (n.field_x != null) {
            n.field_x.a(param0, (byte) 127);
        }
        tf.a(0, param0);
    }

    static {
        field_d = "Show chat";
        field_h = "Players: <%0>/<%1>";
        field_c = new int[8192];
        field_f = "Enemy wave - ";
        field_b = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
    }
}
