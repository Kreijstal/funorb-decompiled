/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci extends mf {
    static int[] field_y;
    static String field_C;
    static int field_z;
    static String field_A;
    static int field_x;
    static String field_D;
    static int field_B;

    final static void a(int param0, rb param1, boolean param2, int param3, int param4) {
        int var27_int = 0;
        rb stackIn_41_0;
        int stackIn_41_1;
        int stackIn_41_2;
        int stackIn_41_3;
        boolean stackIn_41_4;
        boolean stackIn_42_5 = false;
        int stackIn_45_0 = 0;
        int stackIn_58_0 = 0;
        hl stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        int stackIn_95_3 = 0;
        RuntimeException stackIn_214_0 = null;
        StringBuilder stackIn_214_1 = null;
        String stackIn_215_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10_int = 0;
        je var10 = null;
        int var11_int = 0;
        Object var11 = null;
        gd var12 = null;
        int var13 = 0;
        hl var14 = null;
        hl var15 = null;
        hl var16 = null;
        hl var17 = null;
        hl var18 = null;
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
        var31 = TetraLink.field_J;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (qb.field_N != null && (ba.field_S != null ||
            null != a.field_g ||
            null != bi.field_e ||
            null != ti.field_f)) {
            for (var9 = 0; var9 < hg.field_k; var9++) {
              var10_int = 255 & qb.field_N.field_sc[var9];
              if (ba.field_S != null &&
                null != ba.field_S[var9] &&
                ba.field_S[var9][var10_int]) {
                var5_int = 1;
              }
              if (null != a.field_g &&
                null != a.field_g[var9]) {
                var11_int = a.field_g[var9][var10_int];
                if (var11_int != 0 &&
                  !oa.field_r) {
                  var5_int = 1;
                }
                if (var6 < var11_int) {
                  var6 = var11_int;
                }
              }
              if (null != bi.field_e &&
                null != bi.field_e[var9]) {
                var11_intLifetime1 = bi.field_e[var9][var10_int];
                if (var11_intLifetime1 != 0 &&
                  !oa.field_r) {
                  var5_int = 1;
                }
                if (var11_intLifetime1 > var7) {
                  var7 = var11_intLifetime1;
                }
              }
              if (null != ti.field_f &&
                null != ti.field_f[var9]) {
                var8 = var8 | ti.field_f[var9][var10_int];
              }
            }
          }
          stackIn_41_0 = (rb) (param1);
          stackIn_41_1 = 2;
          stackIn_41_2 = (qe.field_d + 2) * 2;
          stackIn_41_3 = -120;
          stackIn_41_4 = param2;
          stackIn_42_5 = (bi.field_d == param1);
          stackIn_45_0 = (!((rb) (Object) stackIn_41_0).a(stackIn_41_1, stackIn_41_2, stackIn_41_3, stackIn_41_4, stackIn_42_5, param0 * (4 * qe.field_d + 8))) ? 0 : 1;
          var9Lifetime1 = stackIn_45_0;
          var10 = param1.field_Pb.field_fb;
          var11 = null;
          if (param3 != -1) {
            field_y = (int[]) null;
          }
          var12 = (gd) (var10.c(false));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.field_fb) {
              var12.field_Wb = new hl(0L, sk.field_h);
              var12.a((byte) -121, var12.field_Wb);
              var12.field_Lb = new hl(0L, ga.field_c);
              if (kj.field_b) {
                var12.a((byte) 14, var12.field_Lb);
              }
              var12.field_Lb.field_xb = 2;
              var12.field_Ob = new hl(0L, bk.field_i);
              var12.a((byte) 103, var12.field_Ob);
              var12.c((byte) 108);
              var12.field_ac = new hl(0L, eo.field_c);
              var12.a((byte) -112, var12.field_ac);
              var12.field_Vb = new hl(0L, wh.field_l);
              var12.a((byte) 44, var12.field_Vb);
              var13 = 1;
            }
            var12.field_Wb.field_jb = null;
            var14 = var12.field_Wb;
            var12.field_Wb.field_R = 0;
            var12.field_Lb.field_jb = null;
            var14.field_Hb = 0;
            var12.field_Lb.field_R = 0;
            var15 = var12.field_Lb;
            var15.field_Hb = 0;
            var12.field_ac.field_jb = null;
            var16 = var12.field_ac;
            var12.field_ac.field_R = 0;
            var12.field_Vb.field_jb = null;
            var16.field_Hb = 0;
            var17 = var12.field_Vb;
            var12.field_Vb.field_R = 0;
            var12.field_Ob.field_jb = null;
            var17.field_Hb = 0;
            var12.field_Ob.field_R = 0;
            var18 = var12.field_Ob;
            var18.field_Hb = 0;
            var12.field_Hb = param1.field_Pb.field_Hb;
            var19 = 0;
            var32 = var12.field_Yb;
            var20 = var32;
            var20 = var32;
            var21 = 72;
            if (param1 == hn.field_Q) {
              var21 += 42;
            }
            var33 = jb.a(var12.field_Wb.field_Ib, var32, var21);
            var20 = var33;
            var20 = var33;
            var20 = var33;
            stackIn_58_0 = (var33.equals(var12.field_Yb)) ? 0 : 1;
            var22 = stackIn_58_0;
            if (var12.field_dc < 4) {
              if (var12.field_dc > 0) {
                var20 = "<img=" + (-1 + var12.field_dc) + ">" + var33;
              }
            } else {
              var20 = "<img=" + (fh.field_h + var12.field_dc - 4) + ">" + var33;
            }
            boolean decompiledFrameRemainder0 = true;
            var12.field_Wb.field_jb = var20;
            if (!var12.d((byte) -1)) {
              var23_int = 16764006;
              var24_int = 16777215;
              if (var5_int != 0 &&
                !var12.field_Tb ||
                (!(var12.field_Pb >= var6) ||
                !(var7 <= var12.field_Qb) ||
                !((~var12.field_Ub & var8) <= 0))) {
                var23_int = 8414771;
                var24_int = 8421504;
              }
              var12.field_ac.field_N = var23_int;
              var12.field_Lb.field_N = var23_int;
              var12.field_Wb.field_N = var23_int;
              var12.field_Wb.field_nb = var24_int;
              var12.field_Wb.field_ib = var24_int;
              var12.field_Wb.field_L = var24_int;
              var12.field_Lb.field_nb = var24_int;
              var12.field_Lb.field_ib = var24_int;
              var12.field_Lb.field_L = var24_int;
              var12.field_ac.field_nb = var24_int;
              var12.field_ac.field_ib = var24_int;
              var12.field_ac.field_L = var24_int;
              if (param1 != v.field_x) {
                if (var12.field_cc) {
                  var12.field_Wb.field_jb = sk.a(new String[]{var20}, bj.field_a, param3 ^ -127);
                  var12.field_Vb.field_jb = rj.field_c;
                } else {
                  if (!var12.field_Kb) {
                    var12.field_ac.field_jb = go.field_e;
                  } else {
                    var12.field_Wb.field_jb = sk.a(new String[]{var20}, qh.field_l, 125);
                    var12.field_ac.field_jb = nm.field_A;
                    var12.field_Vb.field_jb = af.field_d;
                  }
                }
              } else {
                if (!qb.field_N.field_Kb) {
                  var12.field_Vb.field_jb = rm.field_e;
                }
              }
              var25_int = 0;
              if (null != qb.field_N &&
                s.b(63) &&
                ~oj.field_c != ~var12.field_Nb) {
                if (null != var12.field_ac.field_jb) {
                  var26 = var12.field_ac.f(-19) + fn.field_Q * 2;
                  var12.field_ac.a((byte) -104, var26, var19, qe.field_d, var25_int);
                  var25_int = var25_int + var26;
                }
                if (var12.field_Vb.field_jb != null) {
                  if (v.field_x == param1) {
                    var26Lifetime2 = 40;
                  } else {
                    var26Lifetime2 = var12.field_Vb.f(param3 ^ 63) + 2 * fn.field_Q;
                  }
                  var12.field_Vb.a((byte) -90, var26Lifetime2, var19, qe.field_d, var25_int);
                  var25_int = var25_int + var26Lifetime2;
                }
              }
              stackIn_94_0 = var12.field_Wb;
              stackIn_94_1 = -108;
              stackIn_94_2 = -var25_int;
              if (kj.field_b) {
                stackIn_95_3 = 42;
              } else {
                stackIn_95_3 = 0;
              }
              ((hl) (Object) stackIn_94_0).a((byte) stackIn_94_1, stackIn_94_2 - stackIn_95_3 + var12.field_Hb, var19, qe.field_d, var25_int);
              var12.field_Lb.field_jb = Integer.toString(var12.field_Pb);
              var12.field_Lb.a((byte) -123, 40, var19, qe.field_d, -40 + var12.field_Hb);
              var19 = var19 + qe.field_d;
              if (var12.field_Wb.field_Y &&
                var22 != 0) {
                re.field_P = var12.field_Yb;
                if (((null != cb.field_v)) &&
                  ((cb.field_v[var12.field_dc] != null))) {
                  re.field_P = re.field_P + " - " + cb.field_v[var12.field_dc];
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var12.field_Wb.field_Y &&
                  cb.field_v != null &&
                  cb.field_v[var12.field_dc] != null) {
                  re.field_P = cb.field_v[var12.field_dc];
                }
              }
            }
            var23 = af.a((byte) 126, var12.field_Xb, var20);
            var24 = var23;
            var30 = var24;
            var25 = var30;
            var24Lifetime1 = var23;
            if (var23 != null) {
              var24_intLifetime1 = var12.field_Ob.field_Ib.c(var23, -fn.field_Q - fn.field_Q + var12.field_Hb);
              var12.field_Ob.field_K = var12.field_Sb * 256 / u.field_a;
              var12.field_Ob.field_jb = var23;
              var12.field_Ob.a((byte) -80, var12.field_Hb - fn.field_Q * 2, var19, var24_intLifetime1 * qe.field_d, fn.field_Q);
              var19 = var19 + var24_intLifetime1 * qe.field_d;
            }
            if (var9Lifetime1 == 0) {
              var12.field_mb = -var12.field_R + var19;
            }
            if (var13 != 0) {
              param1.field_Pb.a((hl) (var11), true, var12, 2);
            }
            if (var12.field_F != 0 &&
              !var12.d((byte) -1)) {
              if (var12.field_ac.field_F == 0) {
                if (var12.field_Vb.field_F != 0) {
                  qe.a(-122, param4, var12.field_Nb);
                } else {
                  qh.a(var12, field_B, 0, -66, li.field_o, 0, param1);
                }
              } else {
                q.a(param4, (byte) -118, var12.field_Nb);
              }
            }
            var11 = var12;
            if (var12.field_rb) {
              if (var12.d((byte) -1)) {
                var12 = (gd) (var10.a((byte) -70));
                continue;
              }
              var24Lifetime2 = null;
              if (var12.field_Nb != oj.field_c) {
                if (var5_int != 0 &&
                  !var12.field_Tb) {
                  var24Lifetime2 = sk.a(new String[]{var20}, lh.field_w, 124);
                } else {
                  if (var7 > var12.field_Qb) {
                    var25_int = var7 - var12.field_Qb;
                    if (var25_int == 1) {
                      var24Lifetime2 = sk.a(new String[]{var20}, k.field_b, 121);
                    }
                    var24Lifetime2 = sk.a(new String[]{var20, Integer.toString(var25_int)}, field_C, 123);
                    var30Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1;
                    var24Lifetime2 = var25;
                    var30Lifetime1Lifetime1 = var24Lifetime2;
                    var25 = var30Lifetime1Lifetime1;
                  } else {
                    if (var6 <= var12.field_Pb) {
                      if ((~var12.field_Ub & var8) != 0) {
                        var25_int = fa.a(var8 & ~var12.field_Ub, -24338);
                        var24Lifetime2 = sk.a(new String[]{var20}, o.field_o, param3 + 123);
                        if (0 < var25_int &&
                          null != pd.field_t &&
                          pd.field_t.length >= var25_int &&
                          null != pd.field_t[-1 + var25_int]) {
                          var24Lifetime2 = sk.a(new String[]{var20}, pd.field_t[var25_int - 1][2], param3 + 127);
                        }
                      }
                    } else {
                      var24Lifetime2 = sk.a(new String[]{var20, Integer.toString(var6)}, tl.field_Y, 121);
                    }
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var12.field_Tb) {
                  var24Lifetime2 = pi.field_b;
                } else {
                  if (var12.field_Qb < var7) {
                    var25_int = var7 - var12.field_Qb;
                    if (1 == var25_int) {
                      var24Lifetime2 = sn.field_d;
                    }
                    var24Lifetime2 = sk.a(new String[]{null, Integer.toString(var25_int)}, tk.field_d, 124);
                  } else {
                    if (var12.field_Pb >= var6) {
                      if ((var8 & ~var12.field_Ub) != 0) {
                        var25_int = fa.a(~var12.field_Ub & var8, param3 ^ 24337);
                        var24Lifetime2 = jo.field_b;
                        if (var25_int > 0 &&
                          null != pd.field_t &&
                          pd.field_t.length >= var25_int &&
                          null != pd.field_t[-1 + var25_int]) {
                          var24Lifetime2 = pd.field_t[var25_int - 1][1];
                        }
                      }
                    } else {
                      var24Lifetime2 = sk.a(new String[]{null, Integer.toString(var6)}, ae.field_M, 121);
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
                for (var27_int = 0; var27_int < hg.field_k; var27_int++) {
                  var28 = 255 & qb.field_N.field_sc[var27_int];
                  var29 = 0;
                  if (ba.field_S != null &&
                    ba.field_S[var27_int] != null &&
                    ba.field_S[var27_int][var28] &&
                    !var12.field_Tb) {
                    var29 = 1;
                  }
                  if (null != a.field_g &&
                    null != a.field_g[var27_int]) {
                    var30_int = a.field_g[var27_int][var28];
                    if (var30_int != 0 &&
                      !oa.field_r &&
                      !var12.field_Tb) {
                      var29 = 1;
                    }
                    if (var12.field_Pb < var30_int) {
                      var29 = 1;
                    }
                  }
                  if (null != bi.field_e &&
                    null != bi.field_e[var27_int]) {
                    var30_intLifetime1 = bi.field_e[var27_int][var28];
                    if (0 != var30_intLifetime1 &&
                      !oa.field_r &&
                      !var12.field_Tb) {
                      var29 = 1;
                    }
                    if (var12.field_Qb < var30_intLifetime1) {
                      var29 = 1;
                    }
                  }
                  if (null != ti.field_f &&
                    null != ti.field_f[var27_int] &&
                    (~var12.field_Ub & ti.field_f[var27_int][var28]) != 0) {
                    var29 = 1;
                  }
                  if (var29 != 0) {
                    var30_refLifetime2 = "<col=A00000>" + ll.field_y[var27_int] + "</col>";
                    var25 = var30_refLifetime2;
                    var24Lifetime2 = var25;
                    var25 = var30_refLifetime2;
                    if (var25 != null) {
                      var26Lifetime1 = 1;
                      var25 = (String) (var25) + ", " + var30_refLifetime2;
                      var24Lifetime2 = var25;
                      var24Lifetime2 = var25;
                    } else {
                      var25 = var30_refLifetime2;
                    }
                  }
                }
                if (param1 == v.field_x &&
                  s.b(63)) {
                  if (var26Lifetime1 == 0) {
                    var24Lifetime2 = var34 + "<br>" + sk.a(new String[]{(String) (var25)}, tl.field_O, 123);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + t.field_p + (String) (var25);
                  }
                } else {
                  if (var26Lifetime1 != 0) {
                    var24Lifetime2 = var34 + "<br>" + ve.field_f + (String) (var25);
                  } else {
                    var24Lifetime2 = var34 + "<br>" + sk.a(new String[]{(String) (var25)}, qk.field_c, 126);
                  }
                }
                if (param1 == v.field_x &&
                  !s.b(63)) {
                  var27 = qb.field_N.field_ec;
                  var24Lifetime2 = (String) (var24Lifetime2) + "<br>" + sk.a(new String[]{var27}, vd.field_i, 126);
                }
                re.field_P = (String) (var24Lifetime2);
              }
            }
            var12 = (gd) (var10.a((byte) -70));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_214_0 = var5;
          stackIn_214_1 = new StringBuilder().append("ci.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_215_2 = "null";
          } else {
            stackIn_215_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_214_0), ((StringBuilder) (Object) stackIn_214_1).append(stackIn_215_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private ci(jb param0, int param1) {
        super(param0, param1);
    }

    final static void a(String param0, int param1) {
        try {
          if (param1 != -14710) {
            field_C = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "ci.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void c(int param0) {
        int var2;
        var2 = TetraLink.field_J;
        if ((aa.field_bc.field_a.field_h & 1 << aa.field_bc.field_i) != 0) {
          cd.field_c[10] = mh.field_f;
        } else {
          if (0 == aa.field_bc.field_a.field_h) {
            cd.field_c[10] = la.field_f;
          } else {
            cd.field_c[10] = lg.field_O;
          }
        }
        if (param0 <= 1) {
          field_y = (int[]) null;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, oh[] param4, int param5) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var12 = null;
        var11 = TetraLink.field_J;
        try {
          if (param5 >= -115) {
            var12 = (String) null;
            ci.a((String) null, -70);
          }
          if (param4 != null &&
            param2 > 0) {
            var6_int = param4[0].field_t;
            var7 = param4[2].field_t;
            var8 = param4[1].field_t;
            param4[0].e(param3, param1, param0);
            param4[2].e(-var7 + param2 + param3, param1, param0);
            ra.a(lj.field_a);
            ra.b(param3 + var6_int, param1, param3 + param2 - var7, param1 + param4[1].field_F);
            var9 = param3 + var6_int;
            var10 = param3 + (param2 - var7);
            for (param3 = var9; var10 > param3; param3 = param3 + var8) {
              param4[1].e(param3, param1, param0);
            }
            ra.b(lj.field_a);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_14_0 = var6;
          stackIn_14_1 = new StringBuilder().append("ci.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(')').toString());
        }
    }

    final String c(na param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 4373) {
            ci.c(-69);
          }
          stackIn_3_0 = nl.a((byte) 52, '*', param0.field_A.length());
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ci.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    ci(int param0) {
        this(od.field_S, param0);
    }

    public static void c(boolean param0) {
        field_A = null;
        field_D = null;
        if (!param0) {
          field_y = (int[]) null;
        }
        field_C = null;
        field_y = null;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 80) {
          return;
        }
        lg.a(param1, param0 - 79, true);
    }

    final static oh[] d(int param0) {
        int var2 = 0;
        int var6 = 0;
        int var7 = 0;
        oh[] var1;
        int var3;
        byte[] var5;
        int[] var6_ref_int__;
        int var8;
        byte[] var9;
        int[] var10;
        byte[] var11;
        int[] var13;
        byte[] var15;
        int[] var17;
        byte[] var21;
        int[] var22;
        var8 = TetraLink.field_J;
        var1 = new oh[vj.field_n];
        for (var2 = 0; var2 < vj.field_n; var2++) {
          var3 = sn.field_e[var2] * je.field_h[var2];
          var21 = ga.field_a[var2];
          if (!gm.field_g[var2]) {
            var10 = new int[var3];
            var22 = var10;
            for (var6 = 0; var3 > var6; var6++) {
              var10[var6] = ti.field_c[pl.a((int) var21[var6], 255)];
            }
            var1[var2] = new oh(wm.field_l, mm.field_w, qa.field_x[var2], i.field_t[var2], je.field_h[var2], sn.field_e[var2], var22);
          } else {
            var15 = jg.field_i[var2];
            var11 = var15;
            var9 = var11;
            var5 = var9;
            var17 = new int[var3];
            var13 = var17;
            var6_ref_int__ = var13;
            for (var7 = 0; var7 < var3; var7++) {
              var6_ref_int__[var7] = mc.a(pl.a(-16777216, var15[var7] << 24), ti.field_c[pl.a(255, (int) var21[var7])]);
            }
            var1[var2] = (oh) ((Object) new ue(wm.field_l, mm.field_w, qa.field_x[var2], i.field_t[var2], je.field_h[var2], sn.field_e[var2], var17));
          }
        }
        if (param0 != -1) {
          field_x = -33;
        }
        an.b(-128);
        return var1;
    }

    static {
        field_y = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_A = "Back";
        field_B = 0;
        field_C = "<%0> must play <%1> more rated games before playing with the current options.";
        field_D = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
