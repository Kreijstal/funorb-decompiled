/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ll {
    static boolean field_a;

    final static void a(int param0, int param1) {
        if (!(ej.field_o != ob.field_b[param0])) {
            ej.field_o = null;
        }
        if (tm.field_h == kd.field_Fb[param0]) {
            tm.field_h = null;
        }
        if (param1 != 4767999) {
            return;
        }
        vn[][] var4 = ob.field_b;
        vn[][] var2 = var4;
        kd.field_Fb[param0] = null;
        int var3 = param0;
        var4[var3] = null;
    }

    final static void a(dj param0, dj param1, dj param2, int param3) {
        int var8 = 0;
        int var9 = 0;
        v[] var14 = null;
        int var11_int = 0;
        int var13 = ZombieDawn.field_J;
        ad.field_f = vm.a((byte) 117, "frame_top", "commonui", param1);
        dp.field_b = vm.a((byte) -44, "frame_bottom", "commonui", param1);
        we.field_Tb = gf.a(param1, "jagex_logo_grey", 8, "commonui");
        ia.field_d = vm.a((byte) -83, "button", "commonui", param1);
        dj.field_k = df.a((byte) 24, "commonui", "validation", param1);
        ii.field_a = (rb) (Object) ra.a(param0, "commonui", "arezzo12", param3 + 19041, param1);
        ia.field_e = (rb) (Object) ra.a(param0, "commonui", "arezzo14", param3 + 19041, param1);
        rk.field_b = (rb) (Object) ra.a(param0, "commonui", "arezzo14bold", 0, param1);
        vn var17 = new vn(param2.a("", param3 ^ 19000, "button.gif"), (java.awt.Component) (Object) cj.field_d);
        v discarded$0 = vj.a(param1, "dropdown", "commonui", 4424743);
        v[] var5 = dd.a("commonui", "screen_options", -1864, param1);
        af.field_c = new v[4];
        ti.field_e = new v[4];
        li.field_h = new v[4];
        v[][] var6 = new v[][]{ti.field_e, li.field_h, af.field_c};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_l;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_k[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
            var14 = var6[var9];
            v[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
                var14[var11_int] = ud.a(var5[var9], var21[var11_int], -27837);
            }
        }
        var9 = var17.field_t;
        hk.i(1584);
        var17.a();
        bi.a(0, 0, bi.field_f, bi.field_a);
        vn var15 = new vn(var9, var9);
        vn var18 = var15;
        var18.a();
        var17.e(0, 0);
        vn var11 = new vn(var9, var9);
        var11.a();
        var17.e(var9 - var17.field_w, 0);
        vn var12 = new vn(var17.field_w + -(2 * var9), var9);
        var12.a();
        var17.e(-var9, 0);
        pa.a(-21189);
        ia.field_d = new vn[]{var15, var12, var11};
        if (param3 != -19041) {
            ll.a(110, -88);
        }
    }

    abstract void a(boolean param0, de param1);

    abstract nk a(byte param0);

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        mf var9 = null;
        int var10 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        mf stackIn_16_0 = null;
        int stackOut_9_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        mf stackOut_15_0 = null;
        mf stackOut_14_0 = null;
        var10 = ZombieDawn.field_J;
        var1 = eb.field_a - eb.field_c;
        eb.field_c = -(var1 >> 430307329) + im.field_d;
        eb.field_a = eb.field_c + var1;
        el.field_k = sc.field_b - (qk.field_Mb >> -281704831);
        var2 = el.field_k;
        if (param0 <= -45) {
          var3 = 0;
          L0: while (true) {
            if (n.field_r.length <= var3) {
              return;
            } else {
              L1: {
                var4 = la.field_b[var3];
                if (var4 >= 0) {
                  if (var4 == kk.field_m.field_d) {
                    var5 = ej.field_s;
                    break L1;
                  } else {
                    var5 = qi.field_E;
                    break L1;
                  }
                } else {
                  var5 = qg.field_f;
                  break L1;
                }
              }
              L2: {
                var6 = n.field_r[var3];
                stackOut_9_0 = 32564;
                stackIn_11_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (0 > var4) {
                  stackOut_11_0 = stackIn_11_0;
                  stackOut_11_1 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  stackIn_12_1 = stackOut_11_1;
                  break L2;
                } else {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 1;
                  stackIn_12_0 = stackOut_10_0;
                  stackIn_12_1 = stackOut_10_1;
                  break L2;
                }
              }
              L3: {
                var7 = sm.a(stackIn_12_0, stackIn_12_1 != 0, var6);
                var8 = -(var7 >> -608388767) + im.field_d;
                if (-1 < (var4 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (kk.field_m.field_d != var4) {
                      stackOut_15_0 = dd.field_b;
                      stackIn_16_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = qi.field_G;
                      stackIn_16_0 = stackOut_14_0;
                      break L4;
                    }
                  }
                  L5: {
                    var9 = stackIn_16_0;
                    var2 = var2 + qb.field_i;
                    if (var9 == null) {
                      break L5;
                    } else {
                      var9.a((nb.field_m << -314391583) + var7, var2, -nb.field_m + var8, (byte) -118, ma.field_k + (lb.field_Y << -1287776511));
                      break L5;
                    }
                  }
                  var2 = var2 + lb.field_Y;
                  break L3;
                }
              }
              if (-1 >= (var4 ^ -1)) {
                wb.field_m.c(var6, var8, pf.field_g + var2, var5, -1);
                var2 = var2 + (ma.field_k + lb.field_Y + qb.field_i);
                var3++;
                continue L0;
              } else {
                re.field_g.c(var6, var8, fa.field_p + var2, var5, -1);
                var2 = var2 + mh.field_G;
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
