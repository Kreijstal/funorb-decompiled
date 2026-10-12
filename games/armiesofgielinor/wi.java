/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wi {
    int field_d;
    static String field_a;
    static int field_c;
    static String field_h;
    int field_e;
    static lk field_f;
    int field_b;
    int field_g;

    final static void a(int param0, int param1, boolean param2, int param3, dn param4) {
        int var27_int = 0;
        dn stackIn_40_0;
        boolean stackIn_40_1;
        int stackIn_40_2;
        int stackIn_40_3;
        boolean stackIn_41_4 = false;
        int stackIn_44_0 = 0;
        int stackIn_60_0 = 0;
        je stackIn_96_0;
        int stackIn_96_1;
        int stackIn_96_2;
        int stackIn_96_3;
        int stackIn_97_4 = 0;
        RuntimeException stackIn_221_0 = null;
        StringBuilder stackIn_221_1 = null;
        String stackIn_222_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        at var10 = null;
        int var11_int = 0;
        Object var11 = null;
        of var12 = null;
        int var13 = 0;
        je var14 = null;
        je var15 = null;
        je var16 = null;
        je var17 = null;
        je var18 = null;
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
        var31 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (vu.field_M != null && (null != ep.field_p ||
            iv.field_e != null ||
            jv.field_d != null ||
            sk.field_j != null)) {
            for (var9 = 0; var9 < tq.field_b; var9++) {
              var10_int = vu.field_M.field_pc[var9] & 255;
              if (null != ep.field_p &&
                null != ep.field_p[var9] &&
                ep.field_p[var9][var10_int]) {
                var5_int = 1;
              }
              if (null != iv.field_e &&
                null != iv.field_e[var9]) {
                var11_int = iv.field_e[var9][var10_int];
                if (var11_int > var6) {
                  var6 = var11_int;
                }
                if (var11_int != 0 &&
                  !bj.field_k) {
                  var5_int = 1;
                }
              }
              if (jv.field_d != null &&
                jv.field_d[var9] != null) {
                var11_intLifetime1 = jv.field_d[var9][var10_int];
                if (var11_intLifetime1 != 0 &&
                  !bj.field_k) {
                  var5_int = 1;
                }
                if (var11_intLifetime1 > var7) {
                  var7 = var11_intLifetime1;
                }
              }
              if (null != sk.field_j &&
                null != sk.field_j[var9]) {
                var8 = var8 | sk.field_j[var9][var10_int];
              }
            }
          }
          stackIn_40_0 = (dn) (param4);
          stackIn_40_1 = param2;
          stackIn_40_2 = param0 * (8 + jn.field_d * 4);
          stackIn_40_3 = jn.field_d * 2 + 4;
          stackIn_41_4 = (param4 == pq.field_b);
          stackIn_44_0 = (!((dn) (Object) stackIn_40_0).a(stackIn_40_1, stackIn_40_2, stackIn_40_3, stackIn_41_4, 0, 2)) ? 0 : 1;
          var9Lifetime1 = stackIn_44_0;
          var10 = param4.field_Jb.field_fb;
          var11 = null;
          if (param1 != 255) {
            return;
          }
          var12 = (of) (var10.e((byte) 124));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_fb == null) {
              var12.field_ac = new je(0L, ga.field_i);
              var12.a(var12.field_ac, 106);
              var12.field_Tb = new je(0L, ws.field_P);
              if (fh.field_c) {
                var12.a(var12.field_Tb, param1 ^ 157);
              }
              var12.field_Tb.field_Eb = 2;
              var12.field_fc = new je(0L, eq.field_h);
              var12.a(var12.field_fc, 62);
              var12.i(-10027);
              var12.field_dc = new je(0L, rf.field_d);
              var12.a(var12.field_dc, param1 - 194);
              var12.field_ec = new je(0L, pt.field_X);
              var12.a(var12.field_ec, 90);
              var13 = 1;
            }
            var12.field_ac.field_X = null;
            var14 = var12.field_ac;
            var12.field_ac.field_ob = 0;
            var12.field_Tb.field_X = null;
            var14.field_gb = 0;
            var12.field_Tb.field_ob = 0;
            var15 = var12.field_Tb;
            var15.field_gb = 0;
            var12.field_dc.field_X = null;
            var12.field_dc.field_ob = 0;
            var16 = var12.field_dc;
            var16.field_gb = 0;
            var12.field_ec.field_X = null;
            var12.field_ec.field_ob = 0;
            var17 = var12.field_ec;
            var17.field_gb = 0;
            var12.field_fc.field_X = null;
            var12.field_fc.field_ob = 0;
            var18 = var12.field_fc;
            var18.field_gb = 0;
            var12.field_gb = param4.field_Jb.field_gb;
            var19 = 0;
            var32 = var12.field_Yb;
            var21 = 72;
            if (ne.field_f == param4) {
              var21 += 42;
            }
            var33 = ka.a(var12.field_ac.field_Z, var32, var21);
            var20 = var33;
            stackIn_60_0 = (var33.equals(var12.field_Yb)) ? 0 : 1;
            var22 = stackIn_60_0;
            if (var12.field_Qb < 4) {
              if (var12.field_Qb > 0) {
                var20 = "<img=" + (-1 + var12.field_Qb) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (var12.field_Qb - (4 - vh.field_n)) + ">" + var33;
            }
            var12.field_ac.field_X = var20;
            if (!var12.k(0)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Zb ||
                (!(var6 <= var12.field_Sb) ||
                !(var7 <= var12.field_Xb) ||
                !((var8 & ~var12.field_Ob) <= 0))) {
                var23_int = 8414771;
                var24_int = 8421504;
              }
              var12.field_ac.field_wb = var24_int;
              var12.field_ac.field_T = var24_int;
              var12.field_ac.field_W = var24_int;
              var12.field_dc.field_N = var23_int;
              var12.field_Tb.field_N = var23_int;
              var12.field_ac.field_N = var23_int;
              var12.field_Tb.field_wb = var24_int;
              var12.field_Tb.field_T = var24_int;
              var12.field_Tb.field_W = var24_int;
              var12.field_dc.field_wb = var24_int;
              var12.field_dc.field_T = var24_int;
              var12.field_dc.field_W = var24_int;
              if (bu.field_a != param4) {
                if (var12.field_Wb) {
                  var12.field_ac.field_X = fo.a(param1 ^ 4671, sm.field_g, new String[]{var20});
                  var12.field_ec.field_X = ac.field_s;
                } else {
                  if (var12.field_Ub) {
                    var12.field_ac.field_X = fo.a(param1 + 4545, tr.field_G, new String[]{var20});
                    var12.field_dc.field_X = gm.field_g;
                    var12.field_ec.field_X = uf.field_l;
                  } else {
                    var12.field_dc.field_X = bq.field_b;
                  }
                }
              } else {
                if (!vu.field_M.field_kc) {
                  var12.field_ec.field_X = bq.field_a;
                }
              }
              var25_int = 0;
              if (null != vu.field_M &&
                vu.b(false) &&
                oh.field_H != var12.field_Pb) {
                if (null != var12.field_dc.field_X) {
                  var26 = var12.field_dc.j(104) + mi.field_l * 2;
                  var12.field_dc.a(jn.field_d, -20500, var26, var19, var25_int);
                  var25_int = var25_int + var26;
                }
                if (var12.field_ec.field_X != null) {
                  if (bu.field_a != param4) {
                    var26Lifetime2 = var12.field_ec.j(param1 - 328) + mi.field_l * 2;
                  } else {
                    var26Lifetime2 = 40;
                  }
                  var12.field_ec.a(jn.field_d, param1 - 20755, var26Lifetime2, var19, var25_int);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_96_0 = var12.field_ac;
              stackIn_96_1 = jn.field_d;
              stackIn_96_2 = -20500;
              stackIn_96_3 = -var25_int + var12.field_gb;
              if (fh.field_c) {
                stackIn_97_4 = 42;
              } else {
                stackIn_97_4 = 0;
              }
              ((je) (Object) stackIn_96_0).a(stackIn_96_1, stackIn_96_2, stackIn_96_3 - stackIn_97_4, var19, var25_int);
              var12.field_Tb.field_X = Integer.toString(var12.field_Sb);
              var12.field_Tb.a(jn.field_d, -20500, 40, var19, var12.field_gb - 40);
              if (var12.field_ac.field_eb &&
                var22 != 0) {
                ad.field_I = var12.field_Yb;
                if (jc.field_v != null &&
                  jc.field_v[var12.field_Qb] != null) {
                  ad.field_I = ad.field_I + " - " + jc.field_v[var12.field_Qb];
                }
              } else {
                if (var12.field_ac.field_eb &&
                  jc.field_v != null &&
                  null != jc.field_v[var12.field_Qb]) {
                  ad.field_I = jc.field_v[var12.field_Qb];
                }
              }
              var19 = var19 + jn.field_d;
            }
            var23 = s.a(false, var20, var12.field_Kb);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_fc.field_Z.c(var23, -mi.field_l + (var12.field_gb - mi.field_l));
              var12.field_fc.field_C = var12.field_Rb * 256 / qd.field_K;
              var12.field_fc.field_X = var23;
              var12.field_fc.a(var24_intLifetime1 * jn.field_d, -20500, var12.field_gb - 2 * mi.field_l, var19, mi.field_l);
              var19 = var19 + jn.field_d * var24_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var12.field_nb = var19 - var12.field_ob;
            }
            if (var13 != 0) {
              param4.field_Jb.a(var12, true, 2, (je) (var11));
            }
            if (var12.field_yb != 0 &&
              !var12.k(0)) {
              if (var12.field_dc.field_yb != 0) {
                ra.a(var12.field_Pb, param3, 6);
              } else {
                if (0 == var12.field_ec.field_yb) {
                  bk.a(false, 0, iu.field_t, 0, var12, param4, ur.field_z);
                } else {
                  te.a(param3, var12.field_Pb, (byte) 97);
                }
              }
            }
            var11 = var12;
            if (var12.field_jb) {
              if (var12.k(0)) {
                var12 = (of) (var10.a((byte) 123));
                continue;
              }
              var24Lifetime2 = null;
              if (oh.field_H != var12.field_Pb) {
                if (var5_int != 0 &&
                  !var12.field_Zb) {
                  var24Lifetime2 = fo.a(param1 + 4545, em.field_b, new String[]{var20});
                  var30Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1;
                  var24Lifetime2 = var25;
                  var30Lifetime1Lifetime1 = var24Lifetime2;
                  var25 = var30Lifetime1Lifetime1;
                } else {
                  if (var7 <= var12.field_Xb) {
                    if (var6 <= var12.field_Sb) {
                      if ((~var12.field_Ob & var8) != 0) {
                        var25_int = fd.a(true, ~var12.field_Ob & var8);
                        var24Lifetime2 = fo.a(4800, h.field_f, new String[]{var20});
                        if (0 < var25_int &&
                          jl.field_c != null &&
                          jl.field_c.length >= var25_int &&
                          jl.field_c[var25_int - 1] != null) {
                          var24Lifetime2 = fo.a(4800, jl.field_c[-1 + var25_int][2], new String[]{var20});
                        }
                      }
                    } else {
                      var24Lifetime2 = fo.a(4800, bk.field_g, new String[]{var20, Integer.toString(var6)});
                    }
                  } else {
                    var25_int = -var12.field_Xb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = fo.a(4800, co.field_r, new String[]{var20});
                    }
                    var24Lifetime2 = fo.a(4800, oc.field_Ib, new String[]{var20, Integer.toString(var25_int)});
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Zb) {
                  var24Lifetime2 = is.field_a;
                } else {
                  if (var7 > var12.field_Xb) {
                    var25_int = -var12.field_Xb + var7;
                    if (var25_int == 1) {
                      var24Lifetime2 = tn.field_Y;
                    }
                    var24Lifetime2 = fo.a(4800, al.field_j, new String[]{null, Integer.toString(var25_int)});
                  } else {
                    if (var6 <= var12.field_Sb) {
                      if (0 != (var8 & ~var12.field_Ob)) {
                        var25_int = fd.a(true, ~var12.field_Ob & var8);
                        var24Lifetime2 = vb.field_l;
                        if (var25_int > 0 &&
                          null != jl.field_c &&
                          jl.field_c.length >= var25_int &&
                          jl.field_c[var25_int - 1] != null) {
                          var24Lifetime2 = jl.field_c[-1 + var25_int][1];
                        }
                      }
                    } else {
                      var24Lifetime2 = fo.a(4800, vi.field_b, new String[]{null, Integer.toString(var6)});
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
                for (var27_int = 0; var27_int < tq.field_b; var27_int++) {
                  var28 = vu.field_M.field_pc[var27_int] & 255;
                  var29 = 0;
                  if (ep.field_p != null &&
                    ep.field_p[var27_int] != null &&
                    ep.field_p[var27_int][var28] &&
                    !var12.field_Zb) {
                    var29 = 1;
                  }
                  if (null != iv.field_e &&
                    null != iv.field_e[var27_int]) {
                    var30_int = iv.field_e[var27_int][var28];
                    if (var30_int != 0 &&
                      !bj.field_k &&
                      !var12.field_Zb) {
                      var29 = 1;
                    }
                    if (var12.field_Sb < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (jv.field_d != null &&
                    null != jv.field_d[var27_int]) {
                    var30_intLifetime1 = jv.field_d[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !bj.field_k &&
                      !var12.field_Zb) {
                      var29 = 1;
                    }
                    if (var12.field_Xb < var30_intLifetime1) {
                      var29 = 1;
                    }
                  }
                  if (sk.field_j != null &&
                    null != sk.field_j[var27_int] &&
                    (~var12.field_Ob & sk.field_j[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + ob.field_M[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 != null) {
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                      var26Lifetime1 = 1;
                    } else {
                      var25 = var30_refLifetime2;
                    }
                  }
                }
                if (param4 == bu.field_a &&
                  vu.b(false)) {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + wg.field_d + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + fo.a(4800, tp.field_c, new String[]{(String) (var25)});
                  }
                } else {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + fo.a(4800, ue.field_e, new String[]{(String) (var25)});
                  } else {
                    var24Lifetime2 = var34 + "<br>" + nm.field_u + (String) (var25);
                  }
                }
                if (param4 == bu.field_a &&
                  !vu.b(false)) {
                  var27 = vu.field_M.field_rc;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + fo.a(param1 ^ 4671, cj.field_l, new String[]{var27});
                }
                ad.field_I = (String) (var24Lifetime2);
              }
            }
            var12 = (of) (var10.a((byte) 123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_221_0 = var5;
          stackIn_221_1 = new StringBuilder().append("wi.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_222_2 = "null";
          } else {
            stackIn_222_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_221_0), ((StringBuilder) (Object) stackIn_221_1).append(stackIn_222_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        if (param0 != -14691) {
          return;
        }
        field_f = null;
    }

    static {
        field_a = "Gielinor! A new world, rich in powerful magic. The gods seek to dominate this new realm, but only you can determine its fate.";
        field_h = "Equip";
    }
}
