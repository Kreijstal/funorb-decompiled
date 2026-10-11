/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dg extends RuntimeException {
    Throwable field_a;
    static String field_c;
    String field_e;
    static String field_d;
    static int[] field_f;
    static String field_b;

    final static void a(int param0, int param1, boolean param2, boolean param3) {
        cr stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        boolean stackIn_10_2 = false;
        cr stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        boolean stackIn_17_2 = false;
        cr stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        boolean stackIn_22_2 = false;
        km.i(202);
        if (rp.field_a >= 0) {
          bf.field_c.field_S = Vertigo2.a(new String[]{Integer.toString(rp.field_a)}, li.field_b, 126);
        } else {
          bf.field_c.field_S = null;
        }
        stackIn_9_0 = ca.field_h;
        stackIn_9_1 = param0 ^ 0;
        stackIn_10_2 = (param3) && (!param2) && (!ce.field_c) && (null == gd.field_j) && (sj.field_d == null);
        ((cr) (Object) stackIn_9_0).a(stackIn_9_1, stackIn_10_2);
        stackIn_16_0 = ud.field_A;
        stackIn_16_1 = 0;
        stackIn_17_2 = (param3) && (!param2) && (!ce.field_c) && (gd.field_j == null) && (null == sj.field_d);
        ((cr) (Object) stackIn_16_0).a(stackIn_16_1, stackIn_17_2);
        stackIn_21_0 = oc.field_v;
        stackIn_21_1 = 0;
        stackIn_22_2 = (param3) && (!param2) && (ce.field_c);
        ((cr) (Object) stackIn_21_0).a(stackIn_21_1, stackIn_22_2);
        qo.field_D.field_b.k(0);
        if (0 != vb.field_j.field_tb) {
          cn.field_v = true;
        }
        if (0 != b.field_h.field_tb && (vb.field_g ||
          !(q.field_y <= 0) ||
          !(fn.field_z < 2) &&
          cr.field_eb[12])) {
          ah.a((byte) -50, param1);
        }
        if (la.field_f.field_tb != 0) {
          if (rc.field_a.length == 1 &&
            w.field_z != rc.field_a[0]) {
            w.field_z = rc.field_a[0];
          }
          wc.a(fi.field_c, w.field_z, param1, param0 - 101, true, 0);
        }
        if (param0 != gb.field_c.field_tb) {
          ce.field_c = false;
        }
    }

    dg(Throwable param0, String param1) {
        this.field_e = param1;
        this.field_a = param0;
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_b = (String) null;
        }
        field_f = null;
        field_b = null;
        field_d = null;
        field_c = null;
    }

    final static void a(byte param0, od param1, boolean param2, int param3, int param4) {
        int var28_int = 0;
        od stackIn_42_0;
        int stackIn_42_1;
        int stackIn_42_2;
        boolean stackIn_42_3;
        boolean stackIn_43_4 = false;
        int stackIn_46_0 = 0;
        int stackIn_57_0 = 0;
        cr stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_94_2 = 0;
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
        nj var10 = null;
        int var11_int = 0;
        Object var11 = null;
        int var12 = 0;
        bs var13 = null;
        int var14 = 0;
        cr var15 = null;
        cr var16 = null;
        cr var17 = null;
        cr var18 = null;
        cr var19 = null;
        int var20 = 0;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24_int = 0;
        String var24 = null;
        int var25_int = 0;
        Object var25 = null;
        int var26_int = 0;
        Object var26 = null;
        int var27 = 0;
        String var28 = null;
        int var29 = 0;
        int var30 = 0;
        Object var31 = null;
        String var31_ref = null;
        int var31_int = 0;
        int var32 = 0;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        Object var25Lifetime1;
        Object var25Lifetime2;
        Object var31Lifetime1;
        String var31_refLifetime1;
        String var31_refLifetime2;
        Object var31Lifetime1Lifetime1;
        int var9Lifetime1;
        int var11_intLifetime1;
        int var25_intLifetime1;
        int var27Lifetime1;
        int var31_intLifetime1;
        int var27Lifetime2;
        var32 = Vertigo2.field_L ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = 0;
          var8 = 0;
          if (gd.field_j != null && (null != sf.field_f ||
            te.field_D != null ||
            null != qh.field_e ||
            il.field_b != null)) {
            for (var9 = 0; ol.field_A > var9; var9++) {
              var10_int = gd.field_j.field_fc[var9] & 255;
              if (sf.field_f != null &&
                sf.field_f[var9] != null &&
                sf.field_f[var9][var10_int]) {
                var5_int = 1;
              }
              if (te.field_D != null &&
                null != te.field_D[var9]) {
                var11_int = te.field_D[var9][var10_int];
                if (var6 < var11_int) {
                  var6 = var11_int;
                }
                if (var11_int != 0 &&
                  !vb.field_g) {
                  var5_int = 1;
                }
              }
              if (null != qh.field_e &&
                null != qh.field_e[var9]) {
                var11_intLifetime1 = qh.field_e[var9][var10_int];
                if (var7 < var11_intLifetime1) {
                  var7 = var11_intLifetime1;
                }
                if (0 != var11_intLifetime1 &&
                  !vb.field_g) {
                  var5_int = 1;
                }
              }
              if (null != il.field_b &&
                il.field_b[var9] != null) {
                var8 = var8 | il.field_b[var9][var10_int];
              }
            }
          }
          stackIn_42_0 = (od) (param1);
          stackIn_42_1 = param3 * (r.field_f + 2) * 4;
          stackIn_42_2 = 2;
          stackIn_42_3 = param2;
          stackIn_43_4 = (wq.field_M == param1);
          stackIn_46_0 = (!((od) (Object) stackIn_42_0).a(stackIn_42_1, stackIn_42_2, stackIn_42_3, stackIn_43_4, -55, r.field_f * 2 + 4)) ? 0 : 1;
          var9Lifetime1 = stackIn_46_0;
          var12 = 58 % ((param0 + 19) / 46);
          var10 = param1.field_Nb.field_M;
          var11 = null;
          var13 = (bs) (var10.a((byte) 100));
          while (var13 != null) {
            var14 = 0;
            if (null == var13.field_M) {
              var13.field_Sb = new cr(0L, el.field_b);
              var13.b(var13.field_Sb, 125);
              var13.field_Nb = new cr(0L, tm.field_b);
              if (db.field_S) {
                var13.b(var13.field_Nb, 120);
              }
              var13.field_Nb.field_O = 2;
              var13.field_Qb = new cr(0L, ee.field_b);
              var13.b(var13.field_Qb, 122);
              var13.i(-2147483648);
              var13.field_Tb = new cr(0L, sc.field_c);
              var13.b(var13.field_Tb, 123);
              var13.field_Lb = new cr(0L, gh.field_b);
              var13.b(var13.field_Lb, 122);
              var14 = 1;
            }
            var13.field_Sb.field_S = null;
            var15 = var13.field_Sb;
            var13.field_Sb.field_db = 0;
            var15.field_Fb = 0;
            var13.field_Nb.field_S = null;
            var13.field_Nb.field_db = 0;
            var16 = var13.field_Nb;
            var13.field_Tb.field_S = null;
            var16.field_Fb = 0;
            var17 = var13.field_Tb;
            var13.field_Tb.field_db = 0;
            var17.field_Fb = 0;
            var13.field_Lb.field_S = null;
            var18 = var13.field_Lb;
            var13.field_Lb.field_db = 0;
            var18.field_Fb = 0;
            var13.field_Qb.field_S = null;
            var19 = var13.field_Qb;
            var13.field_Qb.field_db = 0;
            var19.field_Fb = 0;
            var13.field_Fb = param1.field_Nb.field_Fb;
            var20 = 0;
            var33 = var13.field_Wb;
            var22 = 72;
            if (ja.field_f == param1) {
              var22 += 42;
            }
            var34 = cc.a(var13.field_Sb.field_z, var33, var22);
            var21 = var34;
            stackIn_57_0 = (var34.equals(var13.field_Wb)) ? 0 : 1;
            var23 = stackIn_57_0;
            if (var13.field_Ib >= 4) {
              var21 = "<img=" + (-4 + (var13.field_Ib + eh.field_e)) + ">" + var34;
            } else {
              if (var13.field_Ib > 0) {
                var21 = "<img=" + (-1 + var13.field_Ib) + ">" + var34;
              }
            }
            boolean decompiledFrameRemainder0 = true;
            var13.field_Sb.field_S = var21;
            if (!var13.k(15)) {
              var24_int = 16764006;
              var25_int = 16777215;
              if (var5_int != 0 &&
                !var13.field_Zb ||
                (!(var6 <= var13.field_Rb) ||
                !(var7 <= var13.field_Mb) ||
                !(0 >= (var8 & ~var13.field_Kb)))) {
                var24_int = 8414771;
                var25_int = 8421504;
              }
              var13.field_Tb.field_A = var24_int;
              var13.field_Nb.field_A = var24_int;
              var13.field_Sb.field_A = var24_int;
              var13.field_Sb.field_K = var25_int;
              var13.field_Sb.field_H = var25_int;
              var13.field_Sb.field_B = var25_int;
              var13.field_Nb.field_K = var25_int;
              var13.field_Nb.field_H = var25_int;
              var13.field_Nb.field_B = var25_int;
              var13.field_Tb.field_K = var25_int;
              var13.field_Tb.field_H = var25_int;
              var13.field_Tb.field_B = var25_int;
              if (vd.field_d == param1) {
                if (!gd.field_j.field_kc) {
                  var13.field_Lb.field_S = bh.field_F;
                }
              } else {
                if (!var13.field_Yb) {
                  if (var13.field_Ob) {
                    var13.field_Sb.field_S = Vertigo2.a(new String[]{var21}, we.field_N, -114);
                    var13.field_Tb.field_S = ma.field_k;
                    var13.field_Lb.field_S = bs.field_ac;
                  } else {
                    var13.field_Tb.field_S = ti.field_a;
                  }
                } else {
                  var13.field_Sb.field_S = Vertigo2.a(new String[]{var21}, gk.field_b, 112);
                  var13.field_Lb.field_S = mp.field_c;
                }
              }
              var26_int = 0;
              if (gd.field_j != null &&
                cn.b(false) &&
                ao.field_N != var13.field_Pb) {
                if (var13.field_Tb.field_S != null) {
                  var27 = var13.field_Tb.j(-21391) + ia.field_G * 2;
                  var13.field_Tb.a(113, var27, r.field_f, var20, var26_int);
                  var26_int = var26_int + var27;
                }
                if (var13.field_Lb.field_S != null) {
                  if (param1 != vd.field_d) {
                    var27Lifetime2 = var13.field_Lb.j(-21391) + ia.field_G * 2;
                  } else {
                    var27Lifetime2 = 40;
                  }
                  var13.field_Lb.a(106, var27Lifetime2, r.field_f, var20, var26_int);
                  var26_int = var26_int + var27Lifetime2;
                }
              }
              stackIn_93_0 = var13.field_Sb;
              stackIn_93_1 = 110;
              if (!db.field_S) {
                stackIn_94_2 = 0;
              } else {
                stackIn_94_2 = 42;
              }
              ((cr) (Object) stackIn_93_0).a(stackIn_93_1, -stackIn_94_2 + var13.field_Fb - var26_int, r.field_f, var20, var26_int);
              var13.field_Nb.field_S = Integer.toString(var13.field_Rb);
              var13.field_Nb.a(91, 40, r.field_f, var20, -40 + var13.field_Fb);
              var20 = var20 + r.field_f;
              if (var13.field_Sb.field_pb &&
                var23 != 0) {
                ko.field_S = var13.field_Wb;
                if (((mb.field_t != null)) &&
                  ((mb.field_t[var13.field_Ib] != null))) {
                  ko.field_S = ko.field_S + " - " + mb.field_t[var13.field_Ib];
                }
                decompiledFrameRemainder0 = false;
              }
              else {
                if (var13.field_Sb.field_pb &&
                  null != mb.field_t &&
                  mb.field_t[var13.field_Ib] != null) {
                  ko.field_S = mb.field_t[var13.field_Ib];
                }
              }
            }
            var24 = an.a((byte) -1, var21, var13.field_Hb);
            var25 = var24;
            var31 = var25;
            var26 = var31;
            var25Lifetime1 = var24;
            if (var24 != null) {
              var25_intLifetime1 = var13.field_Qb.field_z.b(var24, var13.field_Fb + (-ia.field_G - ia.field_G));
              var13.field_Qb.field_U = var13.field_Ub * 256 / lp.field_D;
              var13.field_Qb.field_S = var24;
              var13.field_Qb.a(125, -(ia.field_G * 2) + var13.field_Fb, r.field_f * var25_intLifetime1, var20, ia.field_G);
              var20 = var20 + r.field_f * var25_intLifetime1;
            }
            if (var9Lifetime1 == 0) {
              var13.field_kb = -var13.field_db + var20;
            }
            if (var14 != 0) {
              param1.field_Nb.a((byte) 8, (cr) (var11), var13, 2);
            }
            if (0 != var13.field_tb &&
              !var13.k(15)) {
              if (var13.field_Tb.field_tb == 0) {
                if (var13.field_Lb.field_tb != 0) {
                  ed.a(var13.field_Pb, param4, (byte) -128);
                } else {
                  tj.a(sd.field_N, 0, param1, var13, false, 0, no.field_e);
                }
              } else {
                ui.a(var13.field_Pb, param4, (byte) 99);
              }
            }
            var11 = var13;
            if (var13.field_G) {
              if (var13.k(15)) {
                var13 = (bs) (var10.b(84));
                continue;
              }
              var25Lifetime2 = null;
              if (var13.field_Pb != ao.field_N) {
                if (var5_int != 0 &&
                  !var13.field_Zb) {
                  var25Lifetime2 = Vertigo2.a(new String[]{var21}, rp.field_b, 49);
                  var31Lifetime1 = var25Lifetime2;
                  var26 = var31Lifetime1;
                  var25Lifetime2 = var26;
                  var31Lifetime1Lifetime1 = var25Lifetime2;
                  var26 = var31Lifetime1Lifetime1;
                } else {
                  if (var7 <= var13.field_Mb) {
                    if (var6 > var13.field_Rb) {
                      var25Lifetime2 = Vertigo2.a(new String[]{var21, Integer.toString(var6)}, ud.field_t, 62);
                    } else {
                      if (0 != (~var13.field_Kb & var8)) {
                        var26_int = ib.a(var8 & ~var13.field_Kb, (byte) 79);
                        var25Lifetime2 = Vertigo2.a(new String[]{var21}, qn.field_o, -22);
                        if (0 < var26_int &&
                          ck.field_H != null &&
                          ck.field_H.length >= var26_int &&
                          null != ck.field_H[var26_int - 1]) {
                          var25Lifetime2 = Vertigo2.a(new String[]{var21}, ck.field_H[-1 + var26_int][2], 49);
                        }
                      }
                    }
                  } else {
                    var26_int = -var13.field_Mb + var7;
                    if (var26_int == 1) {
                      var25Lifetime2 = Vertigo2.a(new String[]{var21}, jc.field_c, 4);
                    }
                    var25Lifetime2 = Vertigo2.a(new String[]{var21, Integer.toString(var26_int)}, fa.field_p, -15);
                  }
                }
              } else {
                if (var5_int != 0 &&
                  !var13.field_Zb) {
                  var25Lifetime2 = ed.field_r;
                } else {
                  if (var13.field_Mb < var7) {
                    var26_int = var7 - var13.field_Mb;
                    if (1 == var26_int) {
                      var25Lifetime2 = ak.field_c;
                    }
                    var25Lifetime2 = Vertigo2.a(new String[]{null, Integer.toString(var26_int)}, tg.field_d, -116);
                  } else {
                    if (var6 <= var13.field_Rb) {
                      if (0 != (var8 & ~var13.field_Kb)) {
                        var26_int = ib.a(~var13.field_Kb & var8, (byte) 79);
                        var25Lifetime2 = fm.field_f;
                        if (var26_int > 0 &&
                          null != ck.field_H &&
                          ck.field_H.length >= var26_int &&
                          ck.field_H[var26_int - 1] != null) {
                          var25Lifetime2 = ck.field_H[var26_int - 1][1];
                        }
                      }
                    } else {
                      var25Lifetime2 = Vertigo2.a(new String[]{null, Integer.toString(var6)}, uq.field_c, -126);
                    }
                  }
                }
              }
              if (var25Lifetime2 != null) {
                var35 = "<col=A00000>" + (String) (var25Lifetime2);
                var31_ref = var35;
                var26 = var31_ref;
                var25Lifetime2 = var26;
                var31_refLifetime1 = var35;
                var26 = var31_refLifetime1;
                var26 = null;
                var27Lifetime1 = 0;
                for (var28_int = 0; ol.field_A > var28_int; var28_int++) {
                  var29 = gd.field_j.field_fc[var28_int] & 255;
                  var30 = 0;
                  if (sf.field_f != null &&
                    sf.field_f[var28_int] != null &&
                    sf.field_f[var28_int][var29] &&
                    !var13.field_Zb) {
                    var30 = 1;
                  }
                  if (te.field_D != null &&
                    te.field_D[var28_int] != null) {
                    var31_int = te.field_D[var28_int][var29];
                    if (var31_int != 0 &&
                      !vb.field_g &&
                      !var13.field_Zb) {
                      var30 = 1;
                    }
                    if (var13.field_Rb < var31_int) {
                      var30 = 1;
                    }
                  }
                  if (qh.field_e != null &&
                    null != qh.field_e[var28_int]) {
                    var31_intLifetime1 = qh.field_e[var28_int][var29];
                    if (var31_intLifetime1 != 0 &&
                      !vb.field_g &&
                      !var13.field_Zb) {
                      var30 = 1;
                    }
                    if (var31_intLifetime1 > var13.field_Mb) {
                      var30 = 1;
                    }
                  }
                  if (null != il.field_b &&
                    null != il.field_b[var28_int] &&
                    (~var13.field_Kb & il.field_b[var28_int][var29]) != 0) {
                    var30 = 1;
                  }
                  if (var30 != 0) {
                    var31_refLifetime2 = "<col=A00000>" + md.field_C[var28_int] + "</col>";
                    var26 = var31_refLifetime2;
                    var25Lifetime2 = var26;
                    var26 = var31_refLifetime2;
                    if (var26 == null) {
                      var26 = var31_refLifetime2;
                      var25Lifetime2 = var26;
                      var25Lifetime2 = var26;
                    } else {
                      var26 = (String) (var26) + ", " + var31_refLifetime2;
                      var27Lifetime1 = 1;
                    }
                  }
                }
                if (vd.field_d == param1 &&
                  cn.b(false)) {
                  if (var27Lifetime1 == 0) {
                    var25Lifetime2 = var35 + "<br>" + Vertigo2.a(new String[]{(String) (var26)}, mq.field_u, 38);
                  } else {
                    var25Lifetime2 = var35 + "<br>" + lb.field_f + (String) (var26);
                  }
                } else {
                  if (var27Lifetime1 != 0) {
                    var25Lifetime2 = var35 + "<br>" + mg.field_G + (String) (var26);
                  } else {
                    var25Lifetime2 = var35 + "<br>" + Vertigo2.a(new String[]{(String) (var26)}, in.field_d, -114);
                  }
                }
                if (vd.field_d == param1 &&
                  !cn.b(false)) {
                  var28 = gd.field_j.field_Nb;
                  var25Lifetime2 = (String) (var25Lifetime2) + "<br>" + Vertigo2.a(new String[]{var28}, ac.field_J, -119);
                }
                ko.field_S = (String) (var25Lifetime2);
              }
            }
            var13 = (bs) (var10.b(84));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_218_0 = var5;
          stackIn_218_1 = new StringBuilder().append("dg.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_219_2 = "null";
          } else {
            stackIn_219_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_218_0), ((StringBuilder) (Object) stackIn_218_1).append(stackIn_219_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_c = "Highscores";
        field_b = "Time Attack Level <%0>";
    }
}
