/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i extends vn {
    static int[] field_j;
    static vi[] field_k;
    static int[] field_l;
    static java.awt.Image field_i;
    static kf field_m;

    final static void a(boolean param0, gn param1, gn param2, gn param3) {
        int var8 = 0;
        int var9 = 0;
        bm[] var14 = null;
        int var11_int = 0;
        int var13 = HoldTheLine.field_D;
        ja.field_Db = si.a(param3, 33, "commonui", "frame_top");
        te.field_b = si.a(param3, 33, "commonui", "frame_bottom");
        di.field_t = dl.a(param3, "commonui", false, "jagex_logo_grey");
        vm.field_Ab = si.a(param3, 33, "commonui", "button");
        ef.field_i = ce.a("validation", 17870, "commonui", param3);
        mo.field_w = (qi) (Object) ga.a("commonui", "arezzo12", param1, (byte) 35, param3);
        hl.field_g = (qi) (Object) ga.a("commonui", "arezzo14", param1, (byte) 35, param3);
        de.field_I = (qi) (Object) ga.a("commonui", "arezzo14bold", param1, (byte) 35, param3);
        hj var17 = new hj(param2.a("", !param0 ? true : false, "button.gif"), (java.awt.Component) (Object) kd.field_b);
        bm discarded$0 = hc.a("dropdown", param3, -120, "commonui");
        bm[] var5 = oc.a("screen_options", param3, (byte) 32, "commonui");
        ef.field_g = new bm[4];
        ef.field_d = new bm[4];
        ug.field_d = new bm[4];
        bm[][] var6 = new bm[][]{ef.field_d, ef.field_g, ug.field_d};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_n;
        for (var8 = 1; var21.length > var8; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_m[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; (var9 ^ -1) > -4; var9++) {
            var14 = var6[var9];
            bm[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = rl.a(var21[var11_int], -116, var5[var9]);
            }
        }
        var9 = var17.field_y;
        lj.a((byte) -124);
        var17.f();
        tc.g(0, 0, tc.field_j, tc.field_c);
        hj var15 = new hj(var9, var9);
        hj var18 = var15;
        var18.f();
        if (!param0) {
            return;
        }
        var17.b(0, 0);
        hj var11 = new hj(var9, var9);
        var11.f();
        var17.b(-var17.field_s + var9, 0);
        hj var12 = new hj(var17.field_s + -(2 * var9), var9);
        var12.f();
        var17.b(-var9, 0);
        dm.b((byte) -10);
        vm.field_Ab = new hj[]{var15, var12, var11};
    }

    final static int a(gj param0, gj param1, int param2) {
        int var4 = 0;
        float var5 = 0.0f;
        in var6 = null;
        in var7 = null;
        float var8 = 0.0f;
        float var9 = 0.0f;
        float var10 = 0.0f;
        qm var11 = null;
        qm var12 = null;
        int var13 = 0;
        wb var14 = null;
        L0: {
          var14 = new wb(param1.field_t, param0.field_t);
          var4 = var14.a(-113);
          var5 = (float)Math.sqrt((double)var4);
          var6 = var14.a(var5, (byte) 121);
          if (param2 == -6218) {
            break L0;
          } else {
            i.a((byte) -15, true);
            break L0;
          }
        }
        var7 = var6.a((byte) -41);
        var8 = (float)(-(param0.field_u * param0.field_u) + (var4 - -(param1.field_u * param1.field_u)));
        var8 = var8 / (var5 * 2.0f);
        var9 = -(var8 * var8) + (float)(param1.field_u * param1.field_u);
        if (0.0f > var9) {
          return 0;
        } else {
          var10 = (float)Math.sqrt((double)var9);
          var6.a(var8, param2 ^ 6217);
          var7.a(var10, -1);
          var11 = new qm(param1.field_t);
          var11.a(var6, (byte) 109);
          if (0.0010000000474974513f > var9) {
            L1: {
              mm.field_d = ha.a(param1.field_t, var11, false);
              lk.field_b = ha.a(param0.field_t, var11, false);
              if (!param1.a(mm.field_d, param2 ^ -10910)) {
                break L1;
              } else {
                if (!param0.a(lk.field_b, param2 ^ -10910)) {
                  break L1;
                } else {
                  return 1;
                }
              }
            }
            return 0;
          } else {
            L2: {
              var12 = new qm(var11);
              var11.a(var7, (byte) 122);
              var12.a(var7, -13201);
              mm.field_d = ha.a(param1.field_t, var11, false);
              var13 = 0;
              lk.field_b = ha.a(param0.field_t, var11, false);
              if (!param1.a(mm.field_d, 13012)) {
                break L2;
              } else {
                if (!param0.a(lk.field_b, 13012)) {
                  break L2;
                } else {
                  var13++;
                  break L2;
                }
              }
            }
            L3: {
              rb.field_g = ha.a(param1.field_t, var12, false);
              cj.field_G = ha.a(param0.field_t, var12, false);
              if (!param1.a(rb.field_g, param2 + 19230)) {
                break L3;
              } else {
                if (!param0.a(cj.field_G, 13012)) {
                  break L3;
                } else {
                  var13++;
                  if ((var13 ^ -1) != -2) {
                    break L3;
                  } else {
                    mm.field_d = rb.field_g;
                    lk.field_b = cj.field_G;
                    break L3;
                  }
                }
              }
            }
            return var13;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        ej.field_b = dg.field_c;
        if (param0 <= 43) {
            Object var3 = null;
            tk discarded$0 = i.a(100, -42, -85, (String) null, -48);
        }
        if (-14 == dg.field_c) {
            ((ec) (Object) l.field_a[dg.field_c]).d((byte) -120);
        } else {
            if (0 != dg.field_c) {
                ((ti) (Object) l.field_a[dg.field_c]).i(105);
            }
        }
        gg.field_L = param1;
        vg.field_G = 1;
    }

    final static tk a(int param0, int param1, int param2, String param3, int param4) {
        String var5 = param3 + "_accelerate+loop";
        if (param0 >= -104) {
            field_i = null;
        }
        String var6 = param3 + "_decelerate";
        oa var7 = new oa(var5, param2);
        oa var8 = new oa(var6, param4);
        var7.field_m = oh.a((el) (Object) var7, param1, 89);
        var7.field_l = var7.field_n.length;
        return new tk(var7, var8);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        cg.a(param4, param0, param3, (byte) 41, param1);
        if (param2 != -51) {
            Object var7 = null;
            i.a(true, (gn) null, (gn) null, (gn) null);
        }
    }

    public static void a(byte param0) {
        field_m = null;
        if (param0 != -3) {
            i.a((byte) -104, true);
        }
        field_j = null;
        field_i = null;
        field_k = null;
        field_l = null;
    }

    i() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = fc.a(-45, 5, 36);
        field_l = new int[]{4, 4, 4};
    }
}
