/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fn {
    static String[] field_c;
    static String[] field_g;
    static String field_a;
    static String field_h;
    static kc field_e;
    static String field_i;
    static String field_f;
    static qb[] field_b;
    static String field_d;

    final static void a(int param0, String param1, int param2, int param3, byte param4, int param5, int param6, int param7, int param8) {
        int var11 = 0;
        int var12 = 0;
        bi.field_U.field_rb = param1;
        if (nj.field_c == 2) {
          ih.field_d.field_rb = dk.field_b;
        } else {
          ih.field_d.field_rb = um.field_e;
        }
        int var9_int = 495;
        int var10 = 5;
        ck.field_d.a(-10 + var9_int, 5, var10, param2, (byte) -120);
        wn.field_D.a(-sa.field_Cb.field_x + ck.field_d.field_x, 0, 0, param2, (byte) -120);
        if (param4 != -104) {
          return;
        }
        try {
          var10 = var10 + (param6 + param2);
          sa.field_Cb.a(sa.field_Cb.field_x, wn.field_D.field_x, 0, param2, (byte) -120);
          hf.field_f.a(hf.field_f.c(-25921), 5, var10, param3, (byte) -120);
          var11 = ih.field_d.c(-25921);
          ih.field_d.a(var11, -5 + (var9_int - var11), var10, param3, (byte) -120);
          bi.field_U.a(var9_int, 0, 0, param0, (byte) -120);
          var12 = var10 + param3 + 5;
          in.field_Jb.a(var9_int, 0, param0, var12, (byte) -120);
          in.field_Jb.field_v = of.a(3, in.field_Jb.field_I, 1, 2105376, 11579568, 8421504);
          var12 = var12 + param0;
          tm.field_d.a(var9_int, -(var9_int / 2) + param7, param8 - var12 / 2, var12, (byte) -120);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fn.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(int param0, byte param1) {
        gb.field_f = 0;
        if (param1 >= -98) {
          return;
        }
        bm.field_d = new int[3];
        hj.field_b = param0;
        g.field_d = new jg[param0 * 15];
    }

    final static int a(boolean param0, byte param1, CharSequence param2, int param3) {
        int var8 = 0;
        int stackIn_7_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (2 <= param3 &&
            param3 <= 36) {
            var4_int = 0;
            var5 = 0;
            var6 = 0;
            if (param1 != -40) {
              stackIn_7_0 = -17;
              return stackIn_7_0;
            }
            var7 = param2.length();
            for (var8 = 0; var7 > var8; var8++) {
              boolean decompiledFrameRemainder0 = true;
              var9 = param2.charAt(var8);
              if ((var8 == 0) &&
                (var9 == 45)) {
                var4_int = 1;
                decompiledFrameRemainder0 = false;
              }
              if ((decompiledFrameRemainder0) && (var8 != 0 || (var9 != 43 ||
                !param0))) {
                if (var9 >= 48 &&
                  var9 <= 57) {
                  var9 -= 48;
                } else if (var9 >= 65 &&
                  var9 <= 90) {
                  var9 -= 55;
                } else if (var9 >= 97 &&
                  var9 <= 122) {
                  var9 -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (param3 <= var9) {
                  throw new NumberFormatException();
                }
                if (var4_int != 0) {
                  var9 = -var9;
                }
                var10 = var9 + param3 * var6;
                if (var10 / param3 != var6) {
                  throw new NumberFormatException();
                }
                var6 = var10;
                var5 = 1;
              }
            }
            if (var5 == 0) {
              throw new NumberFormatException();
            }
            stackIn_46_0 = var6;
            return stackIn_46_0;
          }
          throw new IllegalArgumentException("" + param3);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_49_0 = var4;
          stackIn_49_1 = new StringBuilder().append("fn.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(boolean param0, boolean param1, int param2, boolean param3, int param4, int param5, boolean param6, int param7, boolean param8, int param9) {
        int var10;
        int var11;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        if (!param3 && (fh.field_g != de.field_e ||
          ri.field_a != de.field_j) && (de.field_j == ce.field_m.field_m &&
          de.field_e == ce.field_m.field_e)) {
          if (wi.field_f != null) {
            io.a(124, false);
          } else {
            if (null == om.field_x) {
              ao.a((byte) -124);
            } else {
              io.a(13, true);
            }
          }
        }
        if (!param3) {
          sa.field_Hb = (fh.field_g - 640) / 2;
        } else {
          sa.field_Hb = bd.field_a;
        }
        gl.a(param3, 0);
        if (ce.field_h > 0) {
          eh.a(param1, param3, 4, param7);
        }
        jf.field_d.field_X = 1;
        jf.field_d.field_t = j.field_f.field_t;
        if (sm.field_a > 0) {
          ng.a(param3, param7, param1, 118);
        }
        if (oo.field_y > 0) {
          c.a(param7, param3, param0, 2, param1);
        }
        if (so.field_j &&
          wi.field_f.field_Rb >= wi.field_f.field_dc) {
          mj.field_s.field_ub = false;
          nj.field_m.field_Hb.field_rb = ck.field_f;
          fc.a((byte) -103, nj.field_m.field_Cb);
        } else {
          nj.field_m.field_Hb.field_rb = null;
          mj.field_s.field_ub = true;
          fn.a(param2, nj.field_m, param6, param7, true);
        }
        var10 = -105 / ((-23 - param9) / 50);
        pe.a(param7, param2, param5, 0, param4, param8, param6);
        fn.a(param2, lf.field_b, param6, param7, true);
        sb.field_e = sb.field_e + 1;
    }

    final static cg a(long param0, int param1) {
        if (param1 < 109) {
          return (cg) null;
        }
        return (cg) (bc.field_c.a(param0, (byte) -63));
    }

    private final static void a(int param0, dn param1, boolean param2, int param3, boolean param4) {
        int var27_int = 0;
        dn stackIn_43_0 = null;
        boolean stackIn_44_1 = false;
        int stackIn_47_0 = 0;
        int stackIn_61_0 = 0;
        kc stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_99_2 = 0;
        RuntimeException stackIn_216_0 = null;
        StringBuilder stackIn_216_1 = null;
        String stackIn_217_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        vn var10 = null;
        int var11_int = 0;
        Object var11 = null;
        cg var12 = null;
        int var13 = 0;
        kc var14 = null;
        kc var15 = null;
        kc var16 = null;
        kc var17 = null;
        kc var18 = null;
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
        var31 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          if (!param4) {
            fn.a((byte) -126);
          }
          var8 = 0;
          if (wi.field_f != null && (dh.field_Hb != null ||
            pe.field_Fb != null ||
            dk.field_a != null ||
            null != ue.field_b)) {
            for (var9 = 0; var9 < vf.field_l; var9++) {
              var10_int = 255 & wi.field_f.field_Wb[var9];
              if (null != dh.field_Hb &&
                null != dh.field_Hb[var9] &&
                dh.field_Hb[var9][var10_int]) {
                var5_int = 1;
              }
              if (pe.field_Fb != null &&
                pe.field_Fb[var9] != null) {
                var11_int = pe.field_Fb[var9][var10_int];
                if (var11_int != 0 &&
                  !gm.field_c) {
                  var5_int = 1;
                }
                if (var11_int > var6) {
                  var6 = var11_int;
                }
              }
              if (null != dk.field_a &&
                dk.field_a[var9] != null) {
                var11_intLifetime1 = dk.field_a[var9][var10_int];
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
                if (0 != var11_intLifetime1 &&
                  !gm.field_c) {
                  var5_int = 1;
                }
              }
              if (null != ue.field_b &&
                ue.field_b[var9] != null) {
                var8 = var8 | ue.field_b[var9][var10_int];
              }
            }
          }
          stackIn_43_0 = (dn) (param1);
          stackIn_44_1 = (dd.field_h == param1);
          stackIn_47_0 = (!((dn) (Object) stackIn_43_0).a(stackIn_44_1, (byte) 98, 2 * (ga.field_r + 2), 2, (8 + 4 * ga.field_r) * param0, param2)) ? 0 : 1;
          var9Lifetime1 = stackIn_47_0;
          var10 = param1.field_Cb.field_G;
          var11 = null;
          var12 = (cg) (var10.b(12623));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_G == null) {
              var12.field_Fb = new kc(0L, qa.field_j);
              var12.a(var12.field_Fb, 114);
              var12.field_Gb = new kc(0L, le.field_E);
              if (fc.field_a) {
                var12.a(var12.field_Gb, 17);
              }
              var12.field_Gb.field_X = 2;
              var12.field_Cb = new kc(0L, pg.field_c);
              var12.a(var12.field_Cb, 109);
              var12.e((byte) 20);
              var12.field_Hb = new kc(0L, ml.field_V);
              var12.a(var12.field_Hb, 43);
              var12.field_Ub = new kc(0L, sl.field_S);
              var12.a(var12.field_Ub, 107);
              var13 = 1;
            }
            var12.field_Fb.field_rb = null;
            var12.field_Fb.field_I = 0;
            var14 = var12.field_Fb;
            var12.field_Gb.field_rb = null;
            var14.field_x = 0;
            var15 = var12.field_Gb;
            var12.field_Gb.field_I = 0;
            var12.field_Hb.field_rb = null;
            var15.field_x = 0;
            var12.field_Hb.field_I = 0;
            var16 = var12.field_Hb;
            var12.field_Ub.field_rb = null;
            var16.field_x = 0;
            var17 = var12.field_Ub;
            var12.field_Ub.field_I = 0;
            var17.field_x = 0;
            var12.field_Cb.field_rb = null;
            var12.field_Cb.field_I = 0;
            var18 = var12.field_Cb;
            var18.field_x = 0;
            var12.field_x = param1.field_Cb.field_x;
            var19 = 0;
            var32 = var12.field_Qb;
            var20 = var32;
            var20 = var32;
            var21 = 72;
            if (param1 == nj.field_m) {
              var21 += 42;
            }
            var33 = dj.a(var12.field_Fb.field_Z, var32, var21);
            var20 = var33;
            var20 = var33;
            var20 = var33;
            stackIn_61_0 = (var33.equals(var12.field_Qb)) ? 0 : 1;
            var22 = stackIn_61_0;
            if (var12.field_Mb < 4) {
              if (var12.field_Mb > 0) {
                var20 = "<img=" + (-1 + var12.field_Mb) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (var12.field_Mb - 4 + dg.field_u) + ">" + var33;
            }
            boolean decompiledFrameRemainder0 = true;
            var12.field_Fb.field_rb = var20;
            if (!var12.e(183874081)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Jb ||
                (!(var6 <= var12.field_Pb) ||
                !(var7 <= var12.field_Vb) ||
                !((~var12.field_Bb & var8) <= 0))) {
                var24_int = 8421504;
                var23_int = 8414771;
              }
              var12.field_Hb.field_ob = var23_int;
              var12.field_Gb.field_ob = var23_int;
              var12.field_Fb.field_ob = var23_int;
              var12.field_Fb.field_zb = var24_int;
              var12.field_Fb.field_J = var24_int;
              var12.field_Fb.field_eb = var24_int;
              var12.field_Gb.field_zb = var24_int;
              var12.field_Gb.field_J = var24_int;
              var12.field_Gb.field_eb = var24_int;
              var12.field_Hb.field_zb = var24_int;
              var12.field_Hb.field_J = var24_int;
              var12.field_Hb.field_eb = var24_int;
              if (lf.field_b == param1) {
                if (!wi.field_f.field_Lb) {
                  var12.field_Ub.field_rb = ej.field_L;
                }
              } else {
                if (!var12.field_Db) {
                  if (!var12.field_Kb) {
                    var12.field_Hb.field_rb = ah.field_a;
                  } else {
                    var12.field_Fb.field_rb = tj.a(-37, new String[]{var20}, rl.field_n);
                    var12.field_Hb.field_rb = dh.field_Nb;
                    var12.field_Ub.field_rb = qc.field_f;
                  }
                } else {
                  var12.field_Fb.field_rb = tj.a(-123, new String[]{var20}, mf.field_h);
                  var12.field_Ub.field_rb = sa.field_Eb;
                }
              }
              var25_int = 0;
              if (null != wi.field_f &&
                qk.k((byte) 110) &&
                ~qf.field_a != ~var12.field_Nb) {
                if (var12.field_Hb.field_rb != null) {
                  var26 = var12.field_Hb.c(-25921) + dh.field_Gb * 2;
                  var12.field_Hb.a(var26, var25_int, var19, ga.field_r, (byte) -120);
                  var25_int = var25_int + var26;
                }
                if (null != var12.field_Ub.field_rb) {
                  if (param1 == lf.field_b) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Ub.c(-25921) + dh.field_Gb * 2;
                  }
                  var12.field_Ub.a(var26Lifetime2, var25_int, var19, ga.field_r, (byte) -120);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_98_0 = var12.field_Fb;
              stackIn_98_1 = -var25_int + var12.field_x;
              if (fc.field_a) {
                stackIn_99_2 = 42;
              } else {
                stackIn_99_2 = 0;
              }
              ((kc) (Object) stackIn_98_0).a(stackIn_98_1 - stackIn_99_2, var25_int, var19, ga.field_r, (byte) -120);
              var12.field_Gb.field_rb = Integer.toString(var12.field_Pb);
              var12.field_Gb.a(40, -40 + var12.field_x, var19, ga.field_r, (byte) -120);
              var19 = var19 + ga.field_r;
              if (var12.field_Fb.field_C &&
                var22 != 0) {
                kh.field_c = var12.field_Qb;
                if (((null != rf.field_p)) &&
                  ((rf.field_p[var12.field_Mb] != null))) {
                  kh.field_c = kh.field_c + " - " + rf.field_p[var12.field_Mb];
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var12.field_Fb.field_C &&
                  rf.field_p != null &&
                  null != rf.field_p[var12.field_Mb]) {
                  kh.field_c = rf.field_p[var12.field_Mb];
                }
              }
            }
            var23 = u.a((byte) -128, var12.field_Sb, var20);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_Cb.field_Z.a(var23, var12.field_x - (dh.field_Gb + dh.field_Gb));
              var12.field_Cb.field_rb = var23;
              var12.field_Cb.field_u = var12.field_Eb * 256 / vd.field_i;
              var12.field_Cb.a(-(dh.field_Gb * 2) + var12.field_x, dh.field_Gb, var19, ga.field_r * var24_intLifetime1, (byte) -120);
              var19 = var19 + var24_intLifetime1 * ga.field_r;
            }
            if (var9Lifetime1 == 0) {
              var12.field_B = -var12.field_I + var19;
            }
            if (var13 != 0) {
              param1.field_Cb.a((byte) 119, (kc) (var11), var12, 2);
            }
            if (var12.field_U != 0 &&
              !var12.e(183874081)) {
              if (var12.field_Hb.field_U != 0) {
                qo.a(param3, (byte) -85, var12.field_Nb);
              } else {
                if (var12.field_Ub.field_U == 0) {
                  mj.a(0, var12, 3, pb.field_h, param1, 0, ja.field_s);
                } else {
                  na.a(var12.field_Nb, -89, param3);
                }
              }
            }
            var11 = var12;
            if (var12.field_A &&
              !var12.e(183874081)) {
              var24Lifetime2 = null;
              if (~var12.field_Nb == ~qf.field_a) {
                if (var5_int != 0 &&
                  !var12.field_Jb) {
                  var24Lifetime2 = wl.field_P;
                } else {
                  if (var7 > var12.field_Vb) {
                    var25_int = var7 - var12.field_Vb;
                    if (var25_int == 1) {
                      var24Lifetime2 = kj.field_a;
                    }
                    var24Lifetime2 = tj.a(117, new String[]{null, Integer.toString(var25_int)}, df.field_A);
                    var30Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1;
                    var24Lifetime2 = var25;
                    var30Lifetime1Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1Lifetime1;
                  } else {
                    if (var6 > var12.field_Pb) {
                      var24Lifetime2 = tj.a(-24, new String[]{null, Integer.toString(var6)}, to.field_n);
                    } else {
                      if ((var8 & ~var12.field_Bb) != 0) {
                        var25_int = bj.a(~var12.field_Bb & var8, (byte) 108);
                        var24Lifetime2 = cg.field_Rb;
                        if (var25_int > 0 &&
                          null != ma.field_P &&
                          var25_int <= ma.field_P.length &&
                          ma.field_P[var25_int - 1] != null) {
                          var24Lifetime2 = ma.field_P[-1 + var25_int][1];
                        }
                      }
                    }
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Jb) {
                  var24Lifetime2 = tj.a(-39, new String[]{var20}, qm.field_p);
                } else {
                  if (var7 > var12.field_Vb) {
                    var25_int = var7 - var12.field_Vb;
                    if (var25_int == 1) {
                      var24Lifetime2 = tj.a(-115, new String[]{var20}, nm.field_g);
                    }
                    var24Lifetime2 = tj.a(127, new String[]{var20, Integer.toString(var25_int)}, s.field_b);
                  } else {
                    if (var12.field_Pb < var6) {
                      var24Lifetime2 = tj.a(126, new String[]{var20, Integer.toString(var6)}, um.field_c);
                    } else {
                      if ((var8 & ~var12.field_Bb) != 0) {
                        var25_int = bj.a(~var12.field_Bb & var8, (byte) 96);
                        var24Lifetime2 = tj.a(116, new String[]{var20}, nm.field_a);
                        if (var25_int > 0 &&
                          null != ma.field_P &&
                          ma.field_P.length >= var25_int &&
                          null != ma.field_P[var25_int - 1]) {
                          var24Lifetime2 = tj.a(-80, new String[]{var20}, ma.field_P[var25_int - 1][2]);
                        }
                      }
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
                for (var27_int = 0; var27_int < vf.field_l; var27_int++) {
                  var28 = wi.field_f.field_Wb[var27_int] & 255;
                  var29 = 0;
                  if (null != dh.field_Hb &&
                    null != dh.field_Hb[var27_int] &&
                    dh.field_Hb[var27_int][var28] &&
                    !var12.field_Jb) {
                    var29 = 1;
                  }
                  if (pe.field_Fb != null &&
                    pe.field_Fb[var27_int] != null) {
                    var30_int = pe.field_Fb[var27_int][var28];
                    if (var30_int != 0 &&
                      !gm.field_c &&
                      !var12.field_Jb) {
                      var29 = 1;
                    }
                    if (var30_int > var12.field_Pb) {
                      var29 = 1;
                    }
                  }
                  if (null != dk.field_a &&
                    null != dk.field_a[var27_int]) {
                    var30_intLifetime1 = dk.field_a[var27_int][var28];
                    if (var30_intLifetime1 != 0 &&
                      !gm.field_c &&
                      !var12.field_Jb) {
                      var29 = 1;
                    }
                    if (var30_intLifetime1 > var12.field_Vb) {
                      var29 = 1;
                    }
                  }
                  if (ue.field_b != null &&
                    ue.field_b[var27_int] != null &&
                    (ue.field_b[var27_int][var28] & ~var12.field_Bb) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + ob.field_bb[var27_int] + "</col>";
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
                if (lf.field_b == param1 &&
                  qk.k((byte) 101)) {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + tj.a(119, new String[]{(String) (var25)}, vg.field_t);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + ie.field_Ub + (String) (var25);
                  }
                } else {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + bd.field_d + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + tj.a(-18, new String[]{(String) (var25)}, wl.field_I);
                  }
                }
                if (lf.field_b == param1 &&
                  !qk.k((byte) 72)) {
                  var27 = wi.field_f.field_ic;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + tj.a(126, new String[]{var27}, tl.field_c);
                }
                kh.field_c = (String) (var24Lifetime2);
              }
            }
            var12 = (cg) (var10.a(0));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_216_0 = var5;
          stackIn_216_1 = new StringBuilder().append("fn.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_217_2 = "null";
          } else {
            stackIn_217_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_216_0), ((StringBuilder) (Object) stackIn_216_1).append(stackIn_217_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, String param2, long param3, int param4, int param5) {
        int var7_int = 0;
        try {
          he.field_e.b((byte) -48, param5);
          he.field_e.field_g = he.field_e.field_g + 1;
          var7_int = he.field_e.field_g;
          he.field_e.a(param3, (byte) 85);
          he.field_e.a(param2, 23333);
          he.field_e.f(param4, (byte) -84);
          he.field_e.f(!param1 ? 0 : 1, (byte) -52);
          int var8 = 106 % ((param0 - 32) / 56);
          he.field_e.b(-var7_int + he.field_e.field_g, (byte) 43);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fn.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_i = null;
        field_h = null;
        field_d = null;
        if (param0 != -60) {
          field_c = (String[]) null;
        }
        field_f = null;
        field_b = null;
        field_c = null;
        field_a = null;
        field_g = null;
    }

    static {
        field_a = "Waiting for sound effects";
        field_c = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
        field_g = new String[]{null, "F1", "F2", "F3", "F4", "F5", "F6", "F7", "F8", "F9", "F10", "F11", "F12", "Esc", null, null, "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "-", "=", "`", null, null, null, "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P", "[", "]", null, null, null, null, "A", "S", "D", "F", "G", "H", "J", "K", "L", ";", "'", "#", null, null, null, null, "Z", "X", "C", "V", "B", "N", "M", "<", ">", "/", "\\", null, null, null, null, null, "Tab", "Shift", "Ctrl", "Space", "Enter", "Backspace", "Alt", "Keypad +", "Keypad -", "Keypad *", "Keypad /", "Keypad 5", null, null, null, null, "Left Arrow", "Right Arrow", "Up Arrow", "Down Arrow", "Insert", "Delete", "Home", "End", "Page Up", "Page Down", null, null, null, null, null, null};
        field_h = "Invalid name";
        field_d = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_i = "Public chat is unavailable while setting up a rated game.";
    }
}
