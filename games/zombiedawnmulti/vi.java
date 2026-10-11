/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi {
    static int[] field_b;
    static String[] field_a;

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 <= 68) {
          field_a = (String[]) null;
        }
    }

    final static void a(int param0, int param1, byte param2, tq param3, boolean param4) {
        int var27_int = 0;
        tq stackIn_48_0;
        int stackIn_48_1;
        boolean stackIn_48_2;
        int stackIn_48_3;
        boolean stackIn_49_4 = false;
        int stackIn_52_0 = 0;
        int stackIn_66_0 = 0;
        cj stackIn_103_0;
        int stackIn_103_1;
        int stackIn_103_2;
        int stackIn_103_3;
        int stackIn_103_4;
        int stackIn_104_5 = 0;
        RuntimeException stackIn_226_0 = null;
        StringBuilder stackIn_226_1 = null;
        String stackIn_227_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        th var10 = null;
        int var11_int = 0;
        Object var11 = null;
        dm var12 = null;
        int var13 = 0;
        cj var14 = null;
        cj var15 = null;
        cj var16 = null;
        cj var17 = null;
        cj var18 = null;
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
        Object var30 = null;
        String var30_ref = null;
        int var30_int = 0;
        int var31 = 0;
        tq var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        Object var24Lifetime1;
        Object var24Lifetime2;
        Object var30Lifetime1;
        String var30_refLifetime1;
        String var30_refLifetime2;
        Object var30Lifetime1Lifetime1;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var24_intLifetime1;
        int var26Lifetime1;
        int var30_intLifetime1;
        int var26Lifetime2;
        var31 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null != mh.field_c && (null != ch.field_g ||
            sd.field_G != null ||
            r.field_c != null ||
            null != na.field_J)) {
            for (var9 = 0; var9 < kj.field_h; var9++) {
              var10_int = mh.field_c.field_Zb[var9] & 255;
              if (null != ch.field_g &&
                ch.field_g[var9] != null &&
                ch.field_g[var9][var10_int]) {
                var5_int = 1;
              }
              if (sd.field_G != null &&
                null != sd.field_G[var9]) {
                var11_int = sd.field_G[var9][var10_int];
                if (var11_int != 0 &&
                  !bo.field_e) {
                  var5_int = 1;
                }
                if (var11_int > var6) {
                  var6 = var11_int;
                }
              }
              boolean decompiledFrameRemainder0 = true;
              if (null != r.field_c) {
                if (r.field_c[var9] == null) {
                  if (((null != na.field_J)) &&
                    ((null != na.field_J[var9]))) {
                    var8 = var8 | na.field_J[var9][var10_int];
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var11_intLifetime1 = r.field_c[var9][var10_int];
                  if (var11_intLifetime1 > var7) {
                    var7 = var11_intLifetime1;
                  }
                  if (var11_intLifetime1 != 0 &&
                    !bo.field_e) {
                    var5_int = 1;
                  }
                }
              }
              if ((decompiledFrameRemainder0) && (null != na.field_J &&
                null != na.field_J[var9])) {
                var8 = var8 | na.field_J[var9][var10_int];
              }
            }
          }
          stackIn_48_0 = (tq) (param3);
          stackIn_48_1 = 2;
          stackIn_48_2 = param4;
          stackIn_48_3 = (2 + jk.field_f) * 2;
          stackIn_49_4 = (vc.field_d == param3);
          stackIn_52_0 = (!((tq) (Object) stackIn_48_0).a(stackIn_48_1, stackIn_48_2, stackIn_48_3, stackIn_49_4, 4 * (2 + jk.field_f) * param0, param2 ^ -126)) ? 0 : 1;
          var9Lifetime1 = stackIn_52_0;
          var10 = param3.field_Gb.field_Cb;
          var11 = null;
          var12 = (dm) (var10.c(124));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_Cb == null) {
              var12.field_Ub = new cj(0L, m.field_x);
              var12.a((byte) 50, var12.field_Ub);
              var12.field_Gb = new cj(0L, wc.field_H);
              if (tb.field_u) {
                var12.a((byte) 50, var12.field_Gb);
              }
              var12.field_Gb.field_R = 2;
              var12.field_Hb = new cj(0L, vo.field_m);
              var12.a((byte) 50, var12.field_Hb);
              var12.f(-128);
              var12.field_Tb = new cj(0L, fd.field_O);
              var12.a((byte) 50, var12.field_Tb);
              var12.field_cc = new cj(0L, de.field_f);
              var12.a((byte) 50, var12.field_cc);
              var13 = 1;
            }
            var12.field_Ub.field_wb = null;
            var14 = var12.field_Ub;
            var12.field_Ub.field_z = 0;
            var12.field_Gb.field_wb = null;
            var14.field_zb = 0;
            var15 = var12.field_Gb;
            var12.field_Gb.field_z = 0;
            var12.field_Tb.field_wb = null;
            var15.field_zb = 0;
            var12.field_Tb.field_z = 0;
            var16 = var12.field_Tb;
            var16.field_zb = 0;
            var12.field_cc.field_wb = null;
            var17 = var12.field_cc;
            var12.field_cc.field_z = 0;
            var17.field_zb = 0;
            var12.field_Hb.field_wb = null;
            var18 = var12.field_Hb;
            var12.field_Hb.field_z = 0;
            var18.field_zb = 0;
            var12.field_zb = param3.field_Gb.field_zb;
            var19 = 0;
            var33 = var12.field_Lb;
            var20 = var33;
            var20 = var33;
            var21 = 72;
            if (param3 == hf.field_e) {
              var21 += 42;
            }
            var34 = fm.a(var12.field_Ub.field_yb, var33, var21);
            var20 = var34;
            var20 = var34;
            var20 = var34;
            stackIn_66_0 = (var34.equals(var12.field_Lb)) ? 0 : 1;
            var22 = stackIn_66_0;
            if (var12.field_Yb < 4) {
              if (var12.field_Yb > 0) {
                var20 = "<img=" + (var12.field_Yb - 1) + ">" + var34;
              }
            } else {
              var20 = "<img=" + (-4 + (var12.field_Yb + hg.field_ub)) + ">" + var34;
            }
            var12.field_Ub.field_wb = var20;
            if (!var12.c((byte) 15)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Nb ||
                (!(var6 <= var12.field_Mb) ||
                !(var12.field_Sb >= var7) ||
                !((~var12.field_Vb & var8) <= 0))) {
                var23_int = 8414771;
                var24_int = 8421504;
              }
              var12.field_Tb.field_M = var23_int;
              var12.field_Gb.field_M = var23_int;
              var12.field_Ub.field_M = var23_int;
              var12.field_Ub.field_Db = var24_int;
              var12.field_Ub.field_xb = var24_int;
              var12.field_Ub.field_ob = var24_int;
              var12.field_Gb.field_Db = var24_int;
              var12.field_Gb.field_xb = var24_int;
              var12.field_Gb.field_ob = var24_int;
              var12.field_Tb.field_Db = var24_int;
              var12.field_Tb.field_xb = var24_int;
              var12.field_Tb.field_ob = var24_int;
              if (param3 == bf.field_n) {
                if (!mh.field_c.field_Fb) {
                  var12.field_cc.field_wb = me.field_d;
                }
              } else {
                if (var12.field_Pb) {
                  var12.field_Ub.field_wb = vl.a(ke.field_a, new String[]{var20}, 2);
                  var12.field_cc.field_wb = gk.field_a;
                } else {
                  if (var12.field_Ob) {
                    var12.field_Ub.field_wb = vl.a(oi.field_b, new String[]{var20}, 2);
                    var12.field_Tb.field_wb = df.field_J;
                    var12.field_cc.field_wb = bn.field_a;
                  } else {
                    var12.field_Tb.field_wb = nn.field_a;
                  }
                }
              }
              var25_int = 0;
              if (null != mh.field_c &&
                hl.b(param2 ^ 45) &&
                ~ie.field_sb != ~var12.field_ec) {
                if (null != var12.field_Tb.field_wb) {
                  var26 = var12.field_Tb.e(param2 - 45) + 2 * nj.field_h;
                  var12.field_Tb.a(jk.field_f, var19, var26, var25_int, -3344);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_cc.field_wb) {
                  if (bf.field_n == param3) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_cc.e(0) + 2 * nj.field_h;
                  }
                  var12.field_cc.a(jk.field_f, var19, var26Lifetime2, var25_int, -3344);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_103_0 = var12.field_Ub;
              stackIn_103_1 = jk.field_f;
              stackIn_103_2 = var19;
              stackIn_103_3 = -var25_int;
              stackIn_103_4 = var12.field_zb;
              if (!tb.field_u) {
                stackIn_104_5 = 0;
              } else {
                stackIn_104_5 = 42;
              }
              ((cj) (Object) stackIn_103_0).a(stackIn_103_1, stackIn_103_2, stackIn_103_3 + (stackIn_103_4 - stackIn_104_5), var25_int, -3344);
              var12.field_Gb.field_wb = Integer.toString(var12.field_Mb);
              var12.field_Gb.a(jk.field_f, var19, 40, var12.field_zb - 40, -3344);
              if (var12.field_Ub.field_L &&
                var22 != 0) {
                ui.field_j = var12.field_Lb;
                if (null != rl.field_h &&
                  null != rl.field_h[var12.field_Yb]) {
                  ui.field_j = ui.field_j + " - " + rl.field_h[var12.field_Yb];
                }
              } else {
                if (var12.field_Ub.field_L &&
                  rl.field_h != null &&
                  null != rl.field_h[var12.field_Yb]) {
                  ui.field_j = rl.field_h[var12.field_Yb];
                }
              }
              var19 = var19 + jk.field_f;
            }
            var23 = ua.a((byte) -61, var12.field_Fb, var20);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_Hb.field_yb.b(var23, -nj.field_h + (var12.field_zb - nj.field_h));
              var12.field_Hb.field_wb = var23;
              var12.field_Hb.field_Y = 256 * var12.field_bc / so.field_r;
              var12.field_Hb.a(jk.field_f * var24_intLifetime1, var19, -(2 * nj.field_h) + var12.field_zb, nj.field_h, -3344);
              var19 = var19 + jk.field_f * var24_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var12.field_I = -var12.field_z + var19;
            }
            if (var13 != 0) {
              param3.field_Gb.a(2, var12, 1300, (cj) (var11));
            }
            if (var12.field_T != 0 &&
              !var12.c((byte) 15)) {
              if (var12.field_Tb.field_T != 0) {
                so.a(-21148, var12.field_ec, param1);
              } else {
                if (var12.field_cc.field_T == 0) {
                  wl.a(ka.field_t, param3, 0, 0, (byte) 81, vb.field_f, var12);
                } else {
                  cg.a(param1, -27404, var12.field_ec);
                }
              }
            }
            if (var12.field_pb &&
              !var12.c((byte) 15)) {
              var24Lifetime2 = null;
              if (~var12.field_ec == ~ie.field_sb) {
                if (var5_int != 0 &&
                  !var12.field_Nb) {
                  var24Lifetime2 = lj.field_s;
                } else {
                  if (var7 > var12.field_Sb) {
                    var25_int = -var12.field_Sb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = jk.field_a;
                    }
                    var24Lifetime2 = vl.a(ij.field_f, new String[]{null, Integer.toString(var25_int)}, 2);
                    var30Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1;
                    var24Lifetime2 = var25;
                    var30Lifetime1Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1Lifetime1;
                  } else {
                    if (var12.field_Mb < var6) {
                      var24Lifetime2 = vl.a(oi.field_a, new String[]{null, Integer.toString(var6)}, 2);
                    } else {
                      if ((~var12.field_Vb & var8) != 0) {
                        var25_int = vl.a(var8 & ~var12.field_Vb, (byte) -103);
                        var24Lifetime2 = af.field_c;
                        if (0 < var25_int &&
                          ki.field_o != null &&
                          ki.field_o.length >= var25_int &&
                          ki.field_o[var25_int - 1] != null) {
                          var24Lifetime2 = ki.field_o[-1 + var25_int][1];
                        }
                      }
                    }
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Nb) {
                  var24Lifetime2 = vl.a(op.field_n, new String[]{var20}, 2);
                } else {
                  if (var12.field_Sb < var7) {
                    var25_int = var7 - var12.field_Sb;
                    if (var25_int == 1) {
                      var24Lifetime2 = vl.a(ce.field_o, new String[]{var20}, 2);
                    }
                    var24Lifetime2 = vl.a(bg.field_m, new String[]{var20, Integer.toString(var25_int)}, 2);
                  } else {
                    if (var6 <= var12.field_Mb) {
                      if (0 != (~var12.field_Vb & var8)) {
                        var25_int = vl.a(var8 & ~var12.field_Vb, (byte) -103);
                        var24Lifetime2 = vl.a(ap.field_r, new String[]{var20}, 2);
                        if (var25_int > 0 &&
                          null != ki.field_o &&
                          var25_int <= ki.field_o.length &&
                          null != ki.field_o[var25_int - 1]) {
                          var24Lifetime2 = vl.a(ki.field_o[var25_int - 1][2], new String[]{var20}, param2 - 43);
                        }
                      }
                    } else {
                      var24Lifetime2 = vl.a(ek.field_y, new String[]{var20, Integer.toString(var6)}, 2);
                    }
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var35 = "<col=A00000>" + (String) (var24Lifetime2);
                var30_ref = var35;
                var25 = var30_ref;
                var24Lifetime2 = var25;
                var30_refLifetime1 = var35;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; var27_int < kj.field_h; var27_int++) {
                  var28 = mh.field_c.field_Zb[var27_int] & 255;
                  var29 = 0;
                  if (ch.field_g != null &&
                    ch.field_g[var27_int] != null &&
                    ch.field_g[var27_int][var28] &&
                    !var12.field_Nb) {
                    var29 = 1;
                  }
                  if (sd.field_G != null &&
                    sd.field_G[var27_int] != null) {
                    var30_int = sd.field_G[var27_int][var28];
                    if (var30_int != 0 &&
                      !bo.field_e &&
                      !var12.field_Nb) {
                      var29 = 1;
                    }
                    if (var12.field_Mb < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (null != r.field_c &&
                    r.field_c[var27_int] != null) {
                    var30_intLifetime1 = r.field_c[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !bo.field_e &&
                      !var12.field_Nb) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Sb) {
                      var29 = 1;
                    }
                  }
                  if (na.field_J != null &&
                    na.field_J[var27_int] != null &&
                    (na.field_J[var27_int][var28] & ~var12.field_Vb) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + cf.field_f[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 == null) {
                      var25 = var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                    } else {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var26Lifetime1 = 1;
                    }
                  }
                }
                if (bf.field_n == param3 &&
                  hl.b(0)) {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var35 + "<br>" + mc.field_b + (String) (var25);
                  } else {
                    var24Lifetime2 = var35 + "<br>" + vl.a(od.field_Cb, new String[]{(String) (var25)}, 2);
                  }
                } else {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var35 + "<br>" + mb.field_u + (String) (var25);
                  } else {
                    var24Lifetime2 = var35 + "<br>" + vl.a(dg.field_L, new String[]{(String) (var25)}, 2);
                  }
                }
                if (bf.field_n == param3 &&
                  !hl.b(0)) {
                  var27 = mh.field_c.field_Nb;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + vl.a(mj.field_Ob, new String[]{var27}, param2 - 43);
                }
                ui.field_j = (String) (var24Lifetime2);
              }
            }
            var11 = var12;
            var12 = (dm) (var10.b(6));
          }
          if (param2 != 45) {
            var32 = (tq) null;
            vi.a(80, -48, (byte) -35, (tq) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_226_0 = var5;
          stackIn_226_1 = new StringBuilder().append("vi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_227_2 = "null";
          } else {
            stackIn_227_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_226_0), ((StringBuilder) (Object) stackIn_226_1).append(stackIn_227_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, vg param1, byte param2) {
        ga var3 = ma.field_a;
        if (param2 > -120) {
          return;
        }
        try {
          var3.b((byte) -35, param0);
          var3.a(119, param1.field_i);
          var3.a(-21, param1.field_p);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "vi.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_a = new String[]{"Tutorial Tips: On", "Tutorial Tips: Off"};
        field_b = new int[8192];
    }
}
