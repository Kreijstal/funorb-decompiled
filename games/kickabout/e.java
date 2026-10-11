/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends js {
    static String field_o;
    static mc field_k;
    private int field_l;
    private int field_h;
    static v[] field_n;
    static vq field_m;
    static int field_j;
    private boolean field_g;
    static eb field_i;

    final void a(int param0, boolean param1, int param2, js param3) {
        this.field_h = param0;
        this.field_g = param1 ? true : false;
        if (param2 > -28) {
          return;
        }
        try {
          if (!this.field_g) {
            this.field_h = 256 - this.field_h;
          }
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "e.F(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(np param0, int param1, boolean param2, int param3, int param4) {
        int var27_int = 0;
        np stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        boolean stackIn_45_2 = false;
        int stackIn_48_0 = 0;
        int stackIn_62_0 = 0;
        hd stackIn_98_0 = null;
        boolean stackIn_98_1 = false;
        int stackIn_98_2 = 0;
        int stackIn_99_3 = 0;
        RuntimeException stackIn_217_0 = null;
        StringBuilder stackIn_217_1 = null;
        String stackIn_218_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        tf var10 = null;
        int var11_int = 0;
        Object var11 = null;
        he var12 = null;
        int var13 = 0;
        hd var14 = null;
        hd var15 = null;
        hd var16 = null;
        hd var17 = null;
        hd var18 = null;
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
        String var32 = null;
        String var33 = null;
        String var34 = null;
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
        var31 = Kickabout.field_G;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (null != uv.field_i && (null != ds.field_h ||
            lh.field_E != null ||
            null != so.field_f ||
            hm.field_D != null)) {
            for (var9 = 0; var9 < ss.field_j; var9++) {
              var10_int = uv.field_i.field_Eb[var9] & 255;
              if (ds.field_h != null &&
                null != ds.field_h[var9] &&
                ds.field_h[var9][var10_int]) {
                var5_int = 1;
              }
              if (lh.field_E != null &&
                null != lh.field_E[var9]) {
                var11_int = lh.field_E[var9][var10_int];
                if (0 != var11_int &&
                  !fv.field_d) {
                  var5_int = 1;
                }
                if (var11_int > var6) {
                  var6 = var11_int;
                }
              }
              if (null != hm.field_D &&
                null != hm.field_D[var9]) {
                var8 = var8 | hm.field_D[var9][var10_int];
              }
              if (null != so.field_f &&
                null != so.field_f[var9]) {
                var11_intLifetime1 = so.field_f[var9][var10_int];
                if (0 != var11_intLifetime1 &&
                  !fv.field_d) {
                  var5_int = 1;
                }
                if (var11_intLifetime1 > var7) {
                  var7 = var11_intLifetime1;
                }
              }
            }
          }
          stackIn_44_0 = (np) (param0);
          stackIn_44_1 = param1 * (4 * sh.field_c + 8);
          stackIn_45_2 = (ig.field_f == param0);
          stackIn_48_0 = (!((np) (Object) stackIn_44_0).a(stackIn_44_1, stackIn_45_2, param2, 2, false, (sh.field_c + 2) * 2)) ? 0 : 1;
          var9Lifetime1 = stackIn_48_0;
          var10 = param0.field_Ab.field_jb;
          if (param4 < 0) {
            e.a(112);
          }
          var11 = null;
          var12 = (he) (var10.g(24009));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_jb == null) {
              var12.field_Lb = new hd(0L, mp.field_f);
              var12.a((byte) -120, var12.field_Lb);
              var12.field_Ob = new hd(0L, pw.field_J);
              if (ui.field_t) {
                var12.a((byte) -127, var12.field_Ob);
              }
              var12.field_Ob.field_A = 2;
              var12.field_zb = new hd(0L, dw.field_e);
              var12.a((byte) -112, var12.field_zb);
              var12.b(false);
              var12.field_Tb = new hd(0L, jc.field_r);
              var12.a((byte) -115, var12.field_Tb);
              var12.field_Hb = new hd(0L, mb.field_F);
              var13 = 1;
              var12.a((byte) -121, var12.field_Hb);
            }
            var12.field_Lb.field_E = null;
            var14 = var12.field_Lb;
            var12.field_Lb.field_mb = 0;
            var14.field_q = 0;
            var12.field_Ob.field_E = null;
            var12.field_Ob.field_mb = 0;
            var15 = var12.field_Ob;
            var15.field_q = 0;
            var12.field_Tb.field_E = null;
            var16 = var12.field_Tb;
            var12.field_Tb.field_mb = 0;
            var12.field_Hb.field_E = null;
            var16.field_q = 0;
            var12.field_Hb.field_mb = 0;
            var17 = var12.field_Hb;
            var17.field_q = 0;
            var12.field_zb.field_E = null;
            var12.field_zb.field_mb = 0;
            var18 = var12.field_zb;
            var18.field_q = 0;
            var12.field_q = param0.field_Ab.field_q;
            var19 = 0;
            var32 = var12.field_Nb;
            var21 = 72;
            if (bf.field_u == param0) {
              var21 += 42;
            }
            var33 = hu.a(var12.field_Lb.field_X, var32, var21);
            var20 = var33;
            stackIn_62_0 = (var33.equals(var12.field_Nb)) ? 0 : 1;
            var22 = stackIn_62_0;
            if (var12.field_Sb < 4) {
              if (0 < var12.field_Sb) {
                var20 = "<img=" + (var12.field_Sb - 1) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (bk.field_e + var12.field_Sb - 4) + ">" + var33;
            }
            boolean decompiledFrameRemainder0 = true;
            var12.field_Lb.field_E = var20;
            if (!var12.h(-13356)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Cb ||
                (!(var12.field_Qb >= var6) ||
                !(var7 <= var12.field_Db) ||
                !((~var12.field_Pb & var8) <= 0))) {
                var24_int = 8421504;
                var23_int = 8414771;
              }
              var12.field_Tb.field_y = var23_int;
              var12.field_Ob.field_y = var23_int;
              var12.field_Lb.field_y = var23_int;
              var12.field_Lb.field_H = var24_int;
              var12.field_Lb.field_ab = var24_int;
              var12.field_Lb.field_ub = var24_int;
              var12.field_Ob.field_H = var24_int;
              var12.field_Ob.field_ab = var24_int;
              var12.field_Ob.field_ub = var24_int;
              var12.field_Tb.field_H = var24_int;
              var12.field_Tb.field_ab = var24_int;
              var12.field_Tb.field_ub = var24_int;
              if (param0 == bs.field_c) {
                if (!uv.field_i.field_Cb) {
                  var12.field_Hb.field_E = wk.field_a;
                }
              } else {
                if (!var12.field_Gb) {
                  if (var12.field_Fb) {
                    var12.field_Lb.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ni.field_p, new String[]{var20});
                    var12.field_Tb.field_E = kw.field_a;
                    var12.field_Hb.field_E = jo.field_A;
                  } else {
                    var12.field_Tb.field_E = nc.field_c;
                  }
                } else {
                  var12.field_Lb.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ug.field_d, new String[]{var20});
                  var12.field_Hb.field_E = vt.field_a;
                }
              }
              var25_int = 0;
              if (null != uv.field_i &&
                np.a(38) &&
                ~var12.field_Ab != ~dd.field_c) {
                if (null != var12.field_Tb.field_E) {
                  var26 = var12.field_Tb.g((byte) 122) + eb.field_b * 2;
                  var12.field_Tb.a(true, var26, var25_int, var19, sh.field_c);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Hb.field_E) {
                  if (param0 != bs.field_c) {
                    var26Lifetime2 = var12.field_Hb.g((byte) 113) + eb.field_b * 2;
                  } else {
                    var26Lifetime2 = 40;
                  }
                  var12.field_Hb.a(true, var26Lifetime2, var25_int, var19, sh.field_c);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_98_0 = var12.field_Lb;
              stackIn_98_1 = true;
              stackIn_98_2 = -var25_int;
              if (ui.field_t) {
                stackIn_99_3 = 42;
              } else {
                stackIn_99_3 = 0;
              }
              ((hd) (Object) stackIn_98_0).a(stackIn_98_1, stackIn_98_2 - stackIn_99_3 + var12.field_q, var25_int, var19, sh.field_c);
              var12.field_Ob.field_E = Integer.toString(var12.field_Qb);
              var12.field_Ob.a(true, 40, -40 + var12.field_q, var19, sh.field_c);
              var19 = var19 + sh.field_c;
              if (var12.field_Lb.field_gb &&
                var22 != 0) {
                sn.field_e = var12.field_Nb;
                if (((wm.field_o != null)) &&
                  ((null != wm.field_o[var12.field_Sb]))) {
                  sn.field_e = sn.field_e + " - " + wm.field_o[var12.field_Sb];
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var12.field_Lb.field_gb &&
                  null != wm.field_o &&
                  null != wm.field_o[var12.field_Sb]) {
                  sn.field_e = wm.field_o[var12.field_Sb];
                }
              }
            }
            var23 = kr.a(var20, var12.field_Mb, (byte) 73);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_zb.field_X.b(var23, -eb.field_b + var12.field_q - eb.field_b);
              var12.field_zb.field_E = var23;
              var12.field_zb.field_U = var12.field_Jb * 256 / mg.field_c;
              var12.field_zb.a(true, -(2 * eb.field_b) + var12.field_q, eb.field_b, var19, sh.field_c * var24_intLifetime1);
              var19 = var19 + var24_intLifetime1 * sh.field_c;
            }
            if (var9Lifetime1 == 0) {
              var12.field_L = var19 - var12.field_mb;
            }
            if (var13 != 0) {
              param0.field_Ab.a(true, 2, var12, (hd) (var11));
            }
            if (var12.field_sb != 0 &&
              !var12.h(-13356)) {
              if (var12.field_Tb.field_sb == 0) {
                if (var12.field_Hb.field_sb == 0) {
                  bv.a(vc.field_y, sm.field_q, 0, 95, 0, var12, param0);
                } else {
                  ko.a(64, param3, var12.field_Ab);
                }
              } else {
                uc.a(var12.field_Ab, param3, 122);
              }
            }
            var11 = var12;
            if (var12.field_Q) {
              if (var12.h(-13356)) {
                var12 = (he) (var10.c(33));
                continue;
              }
              var24Lifetime2 = null;
              if (~dd.field_c != ~var12.field_Ab) {
                if (var5_int != 0 &&
                  !var12.field_Cb) {
                  var24Lifetime2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, wh.field_v, new String[]{var20});
                } else {
                  if (var12.field_Db >= var7) {
                    if (var12.field_Qb < var6) {
                      var24Lifetime2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, nu.field_D, new String[]{var20, Integer.toString(var6)});
                      var30Lifetime1 = var24Lifetime2;
                      var25 = var30Lifetime1;
                      var24Lifetime2 = var25;
                      var30Lifetime1Lifetime1 = var24Lifetime2;
                      var25 = var30Lifetime1Lifetime1;
                    } else {
                      if ((~var12.field_Pb & var8) != 0) {
                        var25_int = ps.a((byte) -86, ~var12.field_Pb & var8);
                        var24Lifetime2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, il.field_e, new String[]{var20});
                        if (var25_int > 0 &&
                          null != um.field_a &&
                          var25_int <= um.field_a.length &&
                          um.field_a[-1 + var25_int] != null) {
                          var24Lifetime2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, um.field_a[var25_int - 1][2], new String[]{var20});
                        }
                      }
                    }
                  } else {
                    var25_int = -var12.field_Db + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, qr.field_d, new String[]{var20});
                    }
                    var24Lifetime2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, rr.field_e, new String[]{var20, Integer.toString(var25_int)});
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Cb) {
                  var24Lifetime2 = ob.field_F;
                } else {
                  if (var12.field_Db < var7) {
                    var25_int = -var12.field_Db + var7;
                    if (1 == var25_int) {
                      var24Lifetime2 = kt.field_k;
                    }
                    var24Lifetime2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, rn.field_h, new String[]{null, Integer.toString(var25_int)});
                  } else {
                    if (var12.field_Qb >= var6) {
                      if ((var8 & ~var12.field_Pb) != 0) {
                        var25_int = ps.a((byte) -63, ~var12.field_Pb & var8);
                        var24Lifetime2 = ca.field_e;
                        if (var25_int > 0 &&
                          null != um.field_a &&
                          var25_int <= um.field_a.length &&
                          um.field_a[-1 + var25_int] != null) {
                          var24Lifetime2 = um.field_a[-1 + var25_int][1];
                        }
                      }
                    } else {
                      var24Lifetime2 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ic.field_c, new String[]{null, Integer.toString(var6)});
                    }
                  }
                }
              }
              if (var24Lifetime2 != null) {
                var34 = "<col=A00000>" + (String) (var24Lifetime2);
                var30_ref = var34;
                var25 = var30_ref;
                var24Lifetime2 = var25;
                var30_refLifetime1 = var34;
                var25 = var30_refLifetime1;
                var25 = null;
                var26Lifetime1 = 0;
                for (var27_int = 0; var27_int < ss.field_j; var27_int++) {
                  var28 = uv.field_i.field_Eb[var27_int] & 255;
                  var29 = 0;
                  if (ds.field_h != null &&
                    null != ds.field_h[var27_int] &&
                    ds.field_h[var27_int][var28] &&
                    !var12.field_Cb) {
                    var29 = 1;
                  }
                  if (null != lh.field_E &&
                    lh.field_E[var27_int] != null) {
                    var30_int = lh.field_E[var27_int][var28];
                    if (var30_int != 0 &&
                      !fv.field_d &&
                      !var12.field_Cb) {
                      var29 = 1;
                    }
                    if (var30_int > var12.field_Qb) {
                      var29 = 1;
                    }
                  }
                  if (null != so.field_f &&
                    null != so.field_f[var27_int]) {
                    var30_intLifetime1 = so.field_f[var27_int][var28];
                    if (0 != var30_intLifetime1 &&
                      !fv.field_d &&
                      !var12.field_Cb) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Db) {
                      var29 = 1;
                    }
                  }
                  if (null != hm.field_D &&
                    hm.field_D[var27_int] != null &&
                    (~var12.field_Pb & hm.field_D[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + ok.field_b[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 == null) {
                      var25 = var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                    } else {
                      var26Lifetime1 = 1;
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                    }
                  }
                }
                if (param0 == bs.field_c &&
                  np.a(47)) {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + vo.$cfr$intArgs$a$53ce4ab4c593(-18, oj.field_V, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + vg.field_Cb + (String) (var25);
                  }
                } else {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + vo.$cfr$intArgs$a$53ce4ab4c593(-18, ak.field_l, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + po.field_c + (String) (var25);
                  }
                }
                if (bs.field_c == param0 &&
                  !np.a(111)) {
                  var27 = uv.field_i.field_ec;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + vo.$cfr$intArgs$a$53ce4ab4c593(-18, qq.field_F, new String[]{var27});
                }
                sn.field_e = (String) (var24Lifetime2);
              }
            }
            var12 = (he) (var10.c(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_217_0 = var5;
          stackIn_217_1 = new StringBuilder().append("e.E(");
          if (param0 == null) {
            stackIn_218_2 = "null";
          } else {
            stackIn_218_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_217_0), ((StringBuilder) (Object) stackIn_217_1).append(stackIn_218_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        js var4;
        if (this.field_h != 256) {
          iu.field_k.b(0, 0, this.field_h);
        } else {
          iu.field_k.d(0, 0);
        }
        if (param0 != -5) {
          var4 = (js) null;
          this.a(-86, true, 42, (js) null);
        }
    }

    private final void b(int param0) {
        if (this.field_g &&
          this.field_h < 256) {
          return;
        }
        this.field_l = 0;
        if (param0 != -257) {
          js var3 = (js) null;
          this.a(-112, true, 15, (js) null);
        }
        mg.a((byte) -25);
        mv.$cfr$intArgs$a$6121ff5511c4(122);
        jm.a(0, false, param0 + 255);
    }

    e() {
        super(-5);
        this.field_l = 40;
        this.field_h = 0;
        this.field_g = true;
    }

    final boolean a(int param0, int param1, char param2) {
        if (!wh.field_q &&
          this.field_l > 0) {
          this.b(-257);
        }
        if (param1 >= -5) {
          this.a(-30, -24, '2');
          return true;
        }
        return true;
    }

    public static void a(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != -1) {
          field_j = 46;
        }
        field_n = null;
        field_o = null;
        field_m = null;
    }

    final void a(byte param0, boolean param1) {
        int fieldTemp$1 = 0;
        int var3;
        var3 = -43 / ((38 - param0) / 60);
        if (!wh.field_q &&
          param1) {
          fieldTemp$1 = this.field_l - 1;
          this.field_l = this.field_l - 1;
          if (fieldTemp$1 <= 0 ||
            ip.field_a != 0) {
            this.b(-257);
          }
        }
    }

    static {
        field_o = "Select the pitch you'd like to play on.";
    }
}
