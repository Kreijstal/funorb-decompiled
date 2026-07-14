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

    final static boolean a(byte param0) {
        Object var2 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 57) {
            break L0;
          } else {
            var2 = null;
            fc.a((ue) null, (ue) null, (byte) 66, (ue) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == m.field_b) {
              break L2;
            } else {
              if (r.field_c != pb.field_a) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    public static void a(int param0) {
        field_a = null;
        field_d = null;
        if (param0 != 20811) {
            field_c = -128;
        }
    }

    final static void a(ue param0, ue param1, byte param2, ue param3) {
        int var8 = 0;
        int var9 = 0;
        id[] var15 = null;
        int var11_int = 0;
        int var14 = StarCannon.field_A;
        ed.field_o = ob.a("frame_top", 112, "commonui", param3);
        ti.field_e = ob.a("frame_bottom", 122, "commonui", param3);
        jk.field_g = vk.a("commonui", 63, "jagex_logo_grey", param3);
        t.field_r = ob.a("button", 94, "commonui", param3);
        fi.field_g = hb.a(-990, "commonui", param3, "validation");
        nb.field_b = (qe) (Object) ai.a(param3, "commonui", true, "arezzo12", param1);
        nb.field_c = (qe) (Object) ai.a(param3, "commonui", true, "arezzo14", param1);
        tk.field_a = (qe) (Object) ai.a(param3, "commonui", true, "arezzo14bold", param1);
        hl var18 = new hl(param0.a("button.gif", (byte) -95, ""), (java.awt.Component) (Object) kj.field_E);
        id discarded$0 = o.a(param3, "commonui", "dropdown", false);
        id[] var5 = fg.a(param3, "screen_options", "commonui", false);
        il.field_e = new id[4];
        w.field_u = new id[4];
        rj.field_i = new id[4];
        id[][] var6 = new id[][]{il.field_e, rj.field_i, w.field_u};
        int[][] var22 = new int[4][];
        int[][] var21 = var22;
        int[][] var20 = var21;
        int[][] var17 = var20;
        int[][] var7 = var17;
        var7[0] = var5[0].field_m;
        for (var8 = 1; var8 < var22.length; var8++) {
            var7[var8] = (int[]) var22[0].clone();
        }
        var8 = var5[0].field_n[0];
        var22[2][var8] = 16777215;
        var22[1][var8] = 2394342;
        var22[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var15 = var6[var9];
            id[] var10 = var15;
            for (var11_int = 0; var11_int < var15.length; var11_int++) {
                var15[var11_int] = nc.a((byte) -106, var5[var9], var22[var11_int]);
            }
        }
        var9 = var18.field_v;
        wj.b(true);
        var18.e();
        ki.a(0, 0, ki.field_j, ki.field_f);
        hl var16 = new hl(var9, var9);
        hl var19 = var16;
        var19.e();
        var18.d(0, 0);
        hl var11 = new hl(var9, var9);
        var11.e();
        var18.d(-var18.field_u + var9, 0);
        int var13 = 50 % ((15 - param2) / 52);
        hl var12 = new hl(var18.field_u + -(var9 * 2), var9);
        var12.e();
        var18.d(-var9, 0);
        wf.a(-80);
        t.field_r = new hl[]{var16, var12, var11};
    }

    final static void a(rb param0, rb param1, java.math.BigInteger param2, java.math.BigInteger param3, int param4) {
        vj.a(param0.field_f, param4, param2, param1, param0.field_g, (byte) 99, param3);
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
