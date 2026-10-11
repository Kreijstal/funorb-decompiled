/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl extends bh {
    static w field_n;
    static ke field_B;
    int field_q;
    int field_z;
    int field_t;
    int[][] field_u;
    static w field_C;
    int field_w;
    String[][] field_x;
    boolean field_A;
    static gk field_r;
    static String field_s;
    static ql field_v;
    int field_p;
    static ji field_y;
    int field_o;

    final static void a(int param0, int param1, int param2, nm param3, boolean param4) {
        int var27_int = 0;
        nm stackIn_43_0;
        int stackIn_43_1;
        int stackIn_43_2;
        int stackIn_43_3;
        boolean stackIn_44_4 = false;
        int stackIn_47_0 = 0;
        int stackIn_59_0 = 0;
        w stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_96_2 = 0;
        RuntimeException stackIn_218_0 = null;
        StringBuilder stackIn_218_1 = null;
        String stackIn_219_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        vj var10 = null;
        int var11_int = 0;
        Object var11 = null;
        tj var12 = null;
        int var13 = 0;
        w var14 = null;
        w var15 = null;
        w var16 = null;
        w var17 = null;
        w var18 = null;
        int var19 = 0;
        String var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var23_int = 0;
        String var23 = null;
        int var24_int = 0;
        Object var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        String var27 = null;
        int var28 = 0;
        int var29 = 0;
        String var30 = null;
        int var30_int = 0;
        int var31 = 0;
        hl var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        Object var24Lifetime1;
        Object var24Lifetime2;
        String var30Lifetime1;
        String var30Lifetime2;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = client.field_A ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          if (param1 != -17339) {
            var32 = (hl) null;
            cl.a((hl) null, true);
          }
          var7 = 0;
          var8 = 0;
          if (cd.field_m != null && (cb.field_e != null ||
            mg.field_Ob != null ||
            ik.field_h != null ||
            null != af.field_b)) {
            for (var9 = 0; j.field_b > var9; var9++) {
              var10_int = 255 & cd.field_m.field_kc[var9];
              if (cb.field_e != null &&
                cb.field_e[var9] != null &&
                cb.field_e[var9][var10_int]) {
                var5_int = 1;
              }
              if (mg.field_Ob != null &&
                null != mg.field_Ob[var9]) {
                var11_int = mg.field_Ob[var9][var10_int];
                if (var11_int != 0 &&
                  !uc.field_a) {
                  var5_int = 1;
                }
                if (var11_int > var6) {
                  var6 = var11_int;
                }
              }
              if (af.field_b != null &&
                null != af.field_b[var9]) {
                var8 = var8 | af.field_b[var9][var10_int];
              }
              if (ik.field_h != null &&
                null != ik.field_h[var9]) {
                var11_intLifetime1 = ik.field_h[var9][var10_int];
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
                if (var11_intLifetime1 != 0 &&
                  !uc.field_a) {
                  var5_int = 1;
                }
              }
            }
          }
          stackIn_43_0 = (nm) (param3);
          stackIn_43_1 = kf.field_O * 2 + 4;
          stackIn_43_2 = param0 * (8 + kf.field_O * 4);
          stackIn_43_3 = param1 + 2109;
          stackIn_44_4 = (param3 == ki.field_w);
          stackIn_47_0 = (!((nm) (Object) stackIn_43_0).a(stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_44_4, 2, param4)) ? 0 : 1;
          var9Lifetime1 = stackIn_47_0;
          var10 = param3.field_Ob.field_M;
          var11 = null;
          var12 = (tj) (var10.c((byte) 25));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_M == null) {
              var12.field_Zb = new w(0L, gg.field_G);
              var12.a(var12.field_Zb, -16834);
              var12.field_Tb = new w(0L, fc.field_f);
              if (pd.field_a) {
                var12.a(var12.field_Tb, -16834);
              }
              var12.field_Tb.field_X = 2;
              var12.field_gc = new w(0L, ua.field_H);
              var12.a(var12.field_gc, -16834);
              var12.d(-117);
              var12.field_Wb = new w(0L, lj.field_c);
              var12.a(var12.field_Wb, param1 + 505);
              var12.field_Ob = new w(0L, gk.field_Hb);
              var12.a(var12.field_Ob, -16834);
              var13 = 1;
            }
            var12.field_Zb.field_Y = null;
            var14 = var12.field_Zb;
            var12.field_Zb.field_N = 0;
            var14.field_mb = 0;
            var12.field_Tb.field_Y = null;
            var15 = var12.field_Tb;
            var12.field_Tb.field_N = 0;
            var15.field_mb = 0;
            var12.field_Wb.field_Y = null;
            var12.field_Wb.field_N = 0;
            var16 = var12.field_Wb;
            var16.field_mb = 0;
            var12.field_Ob.field_Y = null;
            var12.field_Ob.field_N = 0;
            var17 = var12.field_Ob;
            var12.field_gc.field_Y = null;
            var17.field_mb = 0;
            var18 = var12.field_gc;
            var12.field_gc.field_N = 0;
            var18.field_mb = 0;
            var12.field_mb = param3.field_Ob.field_mb;
            var19 = 0;
            var33 = var12.field_Yb;
            var21 = 72;
            if (ec.field_k == param3) {
              var21 += 42;
            }
            var34 = mm.a(var12.field_Zb.field_J, var33, var21);
            var20 = var34;
            stackIn_59_0 = (var34.equals(var12.field_Yb)) ? 0 : 1;
            var22 = stackIn_59_0;
            if (var12.field_dc >= 4) {
              var20 = "<img=" + (n.field_c - 4 + var12.field_dc) + ">" + var34;
            } else {
              if (var12.field_dc > 0) {
                var20 = "<img=" + (var12.field_dc - 1) + ">" + var34;
              }
            }
            var12.field_Zb.field_Y = var20;
            if (!var12.g((byte) 101)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_ec ||
                (!(var12.field_Ub >= var6) ||
                !(var12.field_Xb >= var7) ||
                !((~var12.field_Sb & var8) <= 0))) {
                var24_int = 8421504;
                var23_int = 8414771;
              }
              var12.field_Zb.field_rb = var24_int;
              var12.field_Zb.field_fb = var24_int;
              var12.field_Zb.field_Bb = var24_int;
              var12.field_Wb.field_G = var23_int;
              var12.field_Tb.field_G = var23_int;
              var12.field_Zb.field_G = var23_int;
              var12.field_Tb.field_rb = var24_int;
              var12.field_Tb.field_fb = var24_int;
              var12.field_Tb.field_Bb = var24_int;
              var12.field_Wb.field_rb = var24_int;
              var12.field_Wb.field_fb = var24_int;
              var12.field_Wb.field_Bb = var24_int;
              if (param3 == tb.field_b) {
                if (!cd.field_m.field_lc) {
                  var12.field_Ob.field_Y = bn.field_a;
                }
              } else {
                if (var12.field_bc) {
                  var12.field_Zb.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(116, lb.field_i, new String[]{var20});
                  var12.field_Ob.field_Y = fc.field_g;
                } else {
                  if (!var12.field_fc) {
                    var12.field_Wb.field_Y = a.field_l;
                  } else {
                    var12.field_Zb.field_Y = cm.$cfr$intArgs$a$53ce4ab4c593(91, ad.field_A, new String[]{var20});
                    var12.field_Wb.field_Y = uc.field_f;
                    var12.field_Ob.field_Y = ql.field_f;
                  }
                }
              }
              var25_int = 0;
              if (cd.field_m != null &&
                ig.b(true) &&
                ~var12.field_cc != ~uc.field_g) {
                if (null != var12.field_Wb.field_Y) {
                  var26 = var12.field_Wb.a(true) + nk.field_b * 2;
                  var12.field_Wb.a(var26, 0, var19, kf.field_O, var25_int);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Ob.field_Y) {
                  if (param3 != tb.field_b) {
                    var26Lifetime2 = var12.field_Ob.a(true) + 2 * nk.field_b;
                  } else {
                    var26Lifetime2 = 40;
                  }
                  var12.field_Ob.a(var26Lifetime2, param1 + 17339, var19, kf.field_O, var25_int);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_95_0 = var12.field_Zb;
              stackIn_95_1 = var12.field_mb;
              if (pd.field_a) {
                stackIn_96_2 = 42;
              } else {
                stackIn_96_2 = 0;
              }
              ((w) (Object) stackIn_95_0).a(stackIn_95_1 - stackIn_96_2 - var25_int, 0, var19, kf.field_O, var25_int);
              var12.field_Tb.field_Y = Integer.toString(var12.field_Ub);
              var12.field_Tb.a(40, param1 + 17339, var19, kf.field_O, var12.field_mb - 40);
              if (var12.field_Zb.field_jb &&
                var22 != 0) {
                sl.field_g = var12.field_Yb;
                if (null != vj.field_e &&
                  null != vj.field_e[var12.field_dc]) {
                  sl.field_g = sl.field_g + " - " + vj.field_e[var12.field_dc];
                }
              } else {
                if (var12.field_Zb.field_jb &&
                  vj.field_e != null &&
                  null != vj.field_e[var12.field_dc]) {
                  sl.field_g = vj.field_e[var12.field_dc];
                }
              }
              var19 = var19 + kf.field_O;
            }
            var23 = je.a(var20, var12.field_hc, (byte) -128);
            var24 = var23;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_gc.field_J.a(var23, -nk.field_b + var12.field_mb - nk.field_b);
              var12.field_gc.field_wb = 256 * var12.field_Qb / oa.field_a;
              var12.field_gc.field_Y = var23;
              var12.field_gc.a(var12.field_mb - nk.field_b * 2, 0, var19, kf.field_O * var24_intLifetime1, nk.field_b);
              var19 = var19 + var24_intLifetime1 * kf.field_O;
            }
            if (var9Lifetime1 == 0) {
              var12.field_F = -var12.field_N + var19;
            }
            if (var13 != 0) {
              param3.field_Ob.a((w) (var11), var12, 2, 0);
            }
            if (var12.field_ob != 0 &&
              !var12.g((byte) 101)) {
              if (0 == var12.field_Wb.field_ob) {
                if (0 != var12.field_Ob.field_ob) {
                  mn.a(true, var12.field_cc, param2);
                } else {
                  fl.a(0, var12, param3, he.field_S, 0, param1 ^ 17358, nf.field_h);
                }
              } else {
                bn.a(var12.field_cc, param2, (byte) -84);
              }
            }
            var11 = var12;
            if (var12.field_Kb &&
              !var12.g((byte) 111)) {
              var24Lifetime2 = null;
              if (~uc.field_g == ~var12.field_cc) {
                if (var5_int != 0 &&
                  !var12.field_ec) {
                  var24Lifetime2 = rn.field_a;
                } else {
                  if (var12.field_Xb >= var7) {
                    if (var12.field_Ub >= var6) {
                      if ((var8 & ~var12.field_Sb) != 0) {
                        var25_int = wb.b((byte) -94, var8 & ~var12.field_Sb);
                        var24Lifetime2 = tm.field_e;
                        if (var25_int > 0 &&
                          lc.field_e != null &&
                          var25_int <= lc.field_e.length &&
                          lc.field_e[-1 + var25_int] != null) {
                          var24Lifetime2 = lc.field_e[var25_int - 1][1];
                        }
                      }
                    } else {
                      var24Lifetime2 = cm.$cfr$intArgs$a$53ce4ab4c593(90, gd.field_a, new String[]{null, Integer.toString(var6)});
                    }
                  } else {
                    var25_int = -var12.field_Xb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = oa.field_d;
                    }
                    var24Lifetime2 = cm.$cfr$intArgs$a$53ce4ab4c593(118, lb.field_a, new String[]{null, Integer.toString(var25_int)});
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_ec) {
                  var24Lifetime2 = cm.$cfr$intArgs$a$53ce4ab4c593(92, in.field_s, new String[]{var20});
                } else {
                  if (var12.field_Xb >= var7) {
                    if (var12.field_Ub >= var6) {
                      if (0 != (~var12.field_Sb & var8)) {
                        var25_int = wb.b((byte) -120, var8 & ~var12.field_Sb);
                        var24Lifetime2 = cm.$cfr$intArgs$a$53ce4ab4c593(91, ci.field_f, new String[]{var20});
                        if (var25_int > 0 &&
                          lc.field_e != null &&
                          lc.field_e.length >= var25_int &&
                          lc.field_e[var25_int - 1] != null) {
                          var24Lifetime2 = cm.$cfr$intArgs$a$53ce4ab4c593(93, lc.field_e[-1 + var25_int][2], new String[]{var20});
                        }
                      }
                    } else {
                      var24Lifetime2 = cm.$cfr$intArgs$a$53ce4ab4c593(98, wm.field_i, new String[]{var20, Integer.toString(var6)});
                    }
                  } else {
                    var25_int = -var12.field_Xb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = cm.$cfr$intArgs$a$53ce4ab4c593(93, qf.field_m, new String[]{var20});
                    }
                    var24Lifetime2 = cm.$cfr$intArgs$a$53ce4ab4c593(99, kn.field_n, new String[]{var20, Integer.toString(var25_int)});
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var35 = "<col=A00000>" + (String) (var24Lifetime2);
                var30 = var35;
                var25 = var30;
                var24Lifetime2 = var25;
                var30Lifetime1 = var35;
                var25 = var30Lifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; var27_int < j.field_b; var27_int++) {
                  var28 = cd.field_m.field_kc[var27_int] & 255;
                  var29 = 0;
                  if (cb.field_e != null &&
                    null != cb.field_e[var27_int] &&
                    cb.field_e[var27_int][var28] &&
                    !var12.field_ec) {
                    var29 = 1;
                  }
                  if (null != mg.field_Ob &&
                    mg.field_Ob[var27_int] != null) {
                    var30_int = mg.field_Ob[var27_int][var28];
                    if (var30_int != 0 &&
                      !uc.field_a &&
                      !var12.field_ec) {
                      var29 = 1;
                    }
                    if (var30_int > var12.field_Ub) {
                      var29 = 1;
                    }
                  }
                  if (ik.field_h != null &&
                    ik.field_h[var27_int] != null) {
                    var30_intLifetime1 = ik.field_h[var27_int][var28];
                    if (0 != var30_intLifetime1 &&
                      !uc.field_a &&
                      !var12.field_ec) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Xb) {
                      var29 = 1;
                    }
                  }
                  if (null != af.field_b &&
                    af.field_b[var27_int] != null &&
                    (~var12.field_Sb & af.field_b[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30Lifetime2 = "<col=A00000>" + pa.field_db[var27_int] + "</col>";
                    var25 = var30Lifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30Lifetime2;
                    if (var25 != null) {
                      var26Lifetime1 = 1;
                      var25 = (String) (var25) + ", " + var30Lifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                    } else {
                      var25 = var30Lifetime2;
                    }
                  }
                }
                if (param3 == tb.field_b &&
                  ig.b(true)) {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var35 + "<br>" + pb.field_k + (String) (var25);
                  } else {
                    var24Lifetime2 = var35 + "<br>" + cm.$cfr$intArgs$a$53ce4ab4c593(111, ci.field_b, new String[]{(String) (var25)});
                  }
                } else {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var35 + "<br>" + am.field_b + (String) (var25);
                  } else {
                    var24Lifetime2 = var35 + "<br>" + cm.$cfr$intArgs$a$53ce4ab4c593(101, fj.field_i, new String[]{(String) (var25)});
                  }
                }
                if (tb.field_b == param3 &&
                  !ig.b(true)) {
                  var27 = cd.field_m.field_Vb;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + cm.$cfr$intArgs$a$53ce4ab4c593(116, jf.field_b, new String[]{var27});
                }
                sl.field_g = (String) (var24Lifetime2);
              }
            }
            var12 = (tj) (var10.d(true));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_218_0 = var5;
          stackIn_218_1 = new StringBuilder().append("cl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_219_2 = "null";
          } else {
            stackIn_219_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_218_0), ((StringBuilder) (Object) stackIn_218_1).append(stackIn_219_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(String param0, int param1, int param2, String param3, int param4) {
        wj.field_Mb.field_G = param2;
        wj.field_Mb.field_T = param0;
        wj.field_Mb.field_mb = wj.field_Mb.field_mb + jb.field_f.field_mb;
        wj.field_Mb.field_Y = param3;
        jb.field_f.field_vb = jb.field_f.field_vb + jb.field_f.field_mb;
        if (param4 != -24503) {
          return;
        }
        try {
          jb.field_f.field_mb = param1;
          wj.field_Mb.field_mb = wj.field_Mb.field_mb - jb.field_f.field_mb;
          jb.field_f.field_vb = jb.field_f.field_vb - jb.field_f.field_mb;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "cl.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void c(byte param0) {
        field_y = null;
        field_v = null;
        field_B = null;
        field_r = null;
        if (param0 != -39) {
          return;
        }
        field_C = null;
        field_n = null;
        field_s = null;
    }

    final static void a(boolean param0) {
        int stackIn_19_0 = 0;
        String stackIn_24_0 = null;
        int stackIn_28_0 = 0;
        String stackIn_33_0 = null;
        boolean stackIn_39_0 = false;
        String stackIn_39_1 = null;
        boolean stackIn_40_2 = false;
        cc stackIn_45_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        cc var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = client.field_A ? 1 : 0;
        try {
          var1_int = fc.field_a;
          var2 = 0;
          if (bc.field_B == 2) {
            var3_long = ik.a(4) - di.field_F;
            var2 = (int)((10999L - var3_long) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          var3 = 0;
          if (!param0) {
            field_B = (ke) null;
          }
          while (var3 < rk.field_P.length) {
            var4 = k.field_g[var3];
            if (0 > var4) {
              var5 = wm.field_l;
            } else {
              if (var4 != k.field_f.field_h) {
                var5 = wa.field_c;
              } else {
                var5 = gn.field_a;
              }
            }
            var6 = rk.field_P[var3];
            if (bc.field_B == 2 &&
              var2 == 1) {
              if (vb.field_U.length <= tg.field_g.length) {
                stackIn_19_0 = tg.field_g.length;
              } else {
                stackIn_19_0 = vb.field_U.length;
              }
              var7 = stackIn_19_0;
              if (var3 >= 6 &&
                var7 + 6 > var3) {
                if (-var7 + var3 - (6 - tg.field_g.length) < 0) {
                  stackIn_24_0 = "";
                } else {
                  stackIn_24_0 = tg.field_g[-6 + (var3 + tg.field_g.length - var7)];
                }
                var6 = stackIn_24_0;
              }
              if (wb.field_Qb.length <= dh.field_b.length) {
                stackIn_28_0 = dh.field_b.length;
              } else {
                stackIn_28_0 = wb.field_Qb.length;
              }
              var8 = stackIn_28_0;
              if (var7 + 7 <= var3 &&
                var8 + 7 + var7 > var3) {
                if (-7 + (var3 - var7) >= dh.field_b.length) {
                  stackIn_33_0 = "";
                } else {
                  stackIn_33_0 = dh.field_b[-7 + var3 - var7];
                }
                var6 = stackIn_33_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_39_0 = false;
            stackIn_39_1 = var6;
            stackIn_40_2 = !(var4 < 0);
            var7Lifetime1 = si.a(stackIn_39_0, stackIn_39_1, stackIn_40_2);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + qk.field_d;
            if (var4 >= 0) {
              var1_int = var1_int + qk.field_m;
              if (k.field_f.field_h != var4) {
                stackIn_45_0 = da.field_c;
              } else {
                stackIn_45_0 = nf.field_g;
              }
              var9 = stackIn_45_0;
              if (var9 != null) {
                var9.a(var7Lifetime1 + (mb.field_c << 1), 102, var8Lifetime1 - mb.field_c, var1_int, (pa.field_Y << 1) + cc.field_a);
              }
              var1_int = var1_int + pa.field_Y;
            }
            if (0 <= var4) {
              bg.field_g.a(var6, var8Lifetime1, a.field_k + var1_int, var5, -1);
              var1_int = var1_int + (pa.field_Y - (-qk.field_m - cc.field_a));
            } else {
              rk.field_R.a(var6, var8Lifetime1, nd.field_b + var1_int, var5, -1);
              var1_int = var1_int + ke.field_d;
            }
            var3++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "cl.D(" + param0 + ')');
        }
    }

    final static void a(hl param0, boolean param1) {
        int var2_int = 0;
        hl var3 = null;
        int var4 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = client.field_A ? 1 : 0;
        try {
          if (param0.field_h == null) {
            return;
          }
          if (!param1) {
            cl.c((byte) -122);
          }
          if (param0.field_i != 0 ||
            param0.field_n != 0) {
            for (var2_int = 0; var2_int < ic.field_c; var2_int++) {
              var3 = pd.field_g[var2_int];
              if (var3.field_m == 2 &&
                var3.field_i == param0.field_i &&
                var3.field_n == param0.field_n) {
                return;
              }
            }
          }
          if (param0.field_q != null) {
            wf.field_o = param0.field_q;
            he.field_Y = param0.field_o;
            uh.field_d = param0.field_m;
            ng.field_a = param0.field_r;
          }
          rb.a(param0, -3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("cl.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    cl() {
    }

    static {
        field_s = "Rated game";
    }
}
