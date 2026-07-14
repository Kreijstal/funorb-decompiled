/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_b;
    static float field_c;
    static String field_a;

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        int var1 = -95 / ((param0 - 66) / 45);
    }

    final static void a(eh param0, eh param1, int param2, eh param3) {
        int var8 = 0;
        int var9 = 0;
        rm[] var14 = null;
        int var11_int = 0;
        int var13 = Virogrid.field_F ? 1 : 0;
        if (param2 < 51) {
            cf.a(105);
        }
        qm.field_Kb = ke.a(32, param0, "commonui", "frame_top");
        qg.field_j = ke.a(32, param0, "commonui", "frame_bottom");
        ed.field_d = sn.a(param0, "jagex_logo_grey", "commonui", false);
        td.field_g = ke.a(32, param0, "commonui", "button");
        bf.field_p = jj.a("commonui", param0, false, "validation");
        dk.field_j = (e) (Object) pc.a(param0, -1, "commonui", "arezzo12", param3);
        dj.field_h = (e) (Object) pc.a(param0, -1, "commonui", "arezzo14", param3);
        on.field_b = (e) (Object) pc.a(param0, -1, "commonui", "arezzo14bold", param3);
        mg var17 = new mg(param1.a("button.gif", 100, ""), (java.awt.Component) (Object) fi.field_v);
        rm discarded$0 = vc.a(param0, "dropdown", "commonui", (byte) 39);
        rm[] var5 = ke.a("screen_options", "commonui", param0, 32370);
        dk.field_q = new rm[4];
        hj.field_g = new rm[4];
        jc.field_h = new rm[4];
        rm[][] var6 = new rm[][]{hj.field_g, jc.field_h, dk.field_q};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_m;
        for (var8 = 1; var21.length > var8; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_n[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; (var9 ^ -1) > -4; var9++) {
            var14 = var6[var9];
            rm[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = fe.a(var5[var9], var21[var11_int], (byte) -107);
            }
        }
        var9 = var17.field_p;
        lm.a(0);
        var17.b();
        df.e(0, 0, df.field_e, df.field_f);
        mg var15 = new mg(var9, var9);
        mg var18 = var15;
        var18.b();
        var17.b(0, 0);
        mg var11 = new mg(var9, var9);
        var11.b();
        var17.b(var9 + -var17.field_w, 0);
        mg var12 = new mg(var17.field_w - var9 * 2, var9);
        var12.b();
        var17.b(-var9, 0);
        ai.a(true);
        td.field_g = new mg[]{var15, var12, var11};
    }

    final static void a(byte param0, boolean param1) {
        if (!(ij.field_j == null)) {
            df.g(df.field_i, df.field_g, -df.field_i + df.field_k, df.field_h + -df.field_g);
            ij.field_j.a(param1, 24960);
        }
        if (param0 > -94) {
            ck discarded$0 = cf.a((byte) 1);
        }
    }

    final static ck a(byte param0) {
        if (param0 >= -19) {
            Object var2 = null;
            cf.a((cj) null, (byte) 82);
        }
        if (!(pa.field_l != kh.field_e)) {
            throw new IllegalStateException();
        }
        if (pa.field_l != rg.field_d) {
            return null;
        }
        pa.field_l = kh.field_e;
        return vb.field_c;
    }

    final static int[] b(int param0) {
        if (param0 != -30481) {
            return null;
        }
        return new int[8];
    }

    final static void a(cj param0, byte param1) {
        int var2 = 0;
        cj var3 = null;
        int var4 = 0;
        var4 = Virogrid.field_F ? 1 : 0;
        if (null == param0.field_h) {
          return;
        } else {
          L0: {
            if (param1 >= 6) {
              break L0;
            } else {
              field_c = 1.6972997188568115f;
              break L0;
            }
          }
          L1: {
            L2: {
              if (param0.field_m != 0) {
                break L2;
              } else {
                if (param0.field_a == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            var2 = 0;
            L3: while (true) {
              if (qh.field_K <= var2) {
                break L1;
              } else {
                var3 = el.field_s[var2];
                if (-3 == (var3.field_n ^ -1)) {
                  if (param0.field_m == var3.field_m) {
                    if (param0.field_a == var3.field_a) {
                      return;
                    } else {
                      var2++;
                      continue L3;
                    }
                  } else {
                    var2++;
                    continue L3;
                  }
                } else {
                  var2++;
                  continue L3;
                }
              }
            }
          }
          L4: {
            if (param0.field_g != null) {
              i.field_F = param0.field_n;
              ca.field_O = param0.field_i;
              an.field_a = param0.field_p;
              sh.field_ub = param0.field_g;
              break L4;
            } else {
              break L4;
            }
          }
          ln.a(param0, 107);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Offer draw";
    }
}
