/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends ek {
    static String field_M;
    static String field_T;
    static boolean field_N;
    boolean field_Q;
    static String field_P;
    int field_R;
    int field_O;
    static String field_S;

    final static void h(byte param0) {
        dl.field_h.b((byte) 106);
        if (param0 < 109) {
          og.b(26, 121);
        }
    }

    final void h(int param0) {
        int fieldTemp$0 = this.field_R - 1;
        this.field_R = this.field_R - 1;
        if (fieldTemp$0 <= 0) {
          this.a(true);
          this.a(-4564);
          return;
        }
        if (param0 < 30) {
          field_T = (String) null;
        }
    }

    final static void b(int param0, int param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param0);
        int var3 = -1 / ((param1 - 57) / 55);
        var2.field_j = var2.field_j + 1;
        int var4 = var2.field_j;
        var2.a(122, 5);
        var2.a(122, mh.field_c.field_mc);
        int var5 = mh.field_c.field_Pb + (mh.field_c.field_fc << 6);
        var2.a(-101, var5);
        var2.a(mh.field_c.field_Zb, mh.field_c.field_Zb.length, 0, 114);
        var2.e(91, -var4 + var2.field_j);
    }

    public static void g(byte param0) {
        field_T = null;
        if (param0 >= -76) {
          return;
        }
        field_P = null;
        field_S = null;
        field_M = null;
    }

    final static boolean a(char param0, byte param1) {
        if (param0 >= 32 &&
          param0 <= 126) {
          return true;
        }
        if (param0 >= 160 &&
          param0 <= 255) {
          return true;
        }
        if (param1 <= 98) {
          og.b(64, 2);
        }
        if (8364 != param0 &&
          338 != param0 &&
          param0 != 8212 &&
          param0 != 339) {
          if (376 != param0) {
            return false;
          }
          return true;
        }
        return true;
    }

    final void a(int param0, rl param1) {
        try {
          super.a(param0 ^ 0, param1);
          if (param0 != -9019) {
            og.b(-123, -15);
          }
          this.field_R = this.field_A.field_m.a((byte) 32, this.field_O, 3000);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "og.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    og(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        this.field_O = param3;
        this.field_R = 3000;
    }

    final static void a(boolean param0, byte param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var18_int = 0;
        int var22_int = 0;
        cj dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        tq stackIn_3_0;
        int stackIn_3_1;
        boolean stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4;
        jh stackIn_9_0;
        cj stackIn_9_1;
        cj stackIn_9_2;
        long stackIn_9_3;
        cj stackIn_10_1 = null;
        cj stackIn_10_2 = null;
        cj stackIn_10_4 = null;
        jh stackIn_29_0;
        cj stackIn_29_1;
        cj stackIn_29_2;
        long stackIn_29_3;
        cj stackIn_30_1;
        cj stackIn_30_2;
        cj stackIn_30_4;
        int stackIn_34_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        ja[] stackIn_80_0 = null;
        int stackIn_81_1 = 0;
        ja[] stackIn_89_0 = null;
        int stackIn_90_1 = 0;
        String stackIn_153_0 = null;
        String stackIn_162_0 = null;
        String stackIn_167_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        th var8 = null;
        long var9 = 0L;
        Object var11 = null;
        jh var12 = null;
        int var13 = 0;
        int var14 = 0;
        cj var18 = null;
        cj var19 = null;
        cj var20 = null;
        cj var21 = null;
        cj var22 = null;
        cj var23 = null;
        cj var24 = null;
        cj var25 = null;
        cj var26 = null;
        cj var27 = null;
        cj var28 = null;
        cj var29 = null;
        cj var30 = null;
        int var31 = 0;
        String var32 = null;
        int var33_int = 0;
        String var33 = null;
        int var34_int = 0;
        String var34 = null;
        Object var35 = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        ja var42 = null;
        cj var43 = null;
        cj var44 = null;
        cj var45 = null;
        cj var46 = null;
        cj var47 = null;
        cj var48 = null;
        cj var49 = null;
        Object var50 = null;
        ja var50_ref = null;
        Object var51 = null;
        ja var51_ref = null;
        Object var52 = null;
        ja var52_ref = null;
        Object var53 = null;
        ja var53_ref = null;
        ja var54 = null;
        String var34Lifetime1;
        String var34Lifetime2;
        int var14Lifetime1;
        int var33_intLifetime1;
        int var34_intLifetime1;
        int var34_intLifetime2;
        int var36Lifetime1;
        int var36Lifetime2;
        int var37_intLifetime1;
        int var38_intLifetime1;
        int var39Lifetime1;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          stackIn_3_0 = ek.field_H;
          stackIn_3_1 = 2;
          stackIn_3_2 = param5;
          stackIn_3_3 = 2 * (jk.field_f + 2);
          stackIn_4_4 = (vc.field_d == ek.field_H);
          var7_int = ((tq) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, (4 * jk.field_f + 8) * param6, -108) ? 1 : 0;
          var8 = ek.field_H.field_Gb.field_Cb;
          var9 = bl.a((byte) 99);
          var11 = null;
          var12 = (jh) (var8.c(105));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.field_Cb) {
              var14 = param4 | param2;
              var12.field_Kb = new cj(0L, wc.field_H);
              var12.a((byte) 50, var12.field_Kb);
              var12.field_Kb.field_R = 1;
              var12.field_Gb = new cj(0L, m.field_x);
              var12.a((byte) 50, var12.field_Gb);
              var12.field_Ib = new cj(0L, wc.field_H);
              var12.a((byte) 50, var12.field_Ib);
              var12.field_Ib.field_V = 0;
              var12.field_gc = new cj(0L, wc.field_H);
              var12.a((byte) 50, var12.field_gc);
              var12.field_gc.field_V = 0;
              var12.field_Lb = new cj(0L, m.field_x);
              var12.a((byte) 50, var12.field_Lb);
              var12.field_Lb.field_R = 2;
              stackIn_9_0 = var12;
              stackIn_9_1 = null;
              stackIn_9_2 = null;
              stackIn_9_3 = 0L;
              if (tb.field_u) {
                stackIn_10_1 = null;
                stackIn_10_2 = null;
                stackIn_10_4 = wc.field_H;
              } else {
                stackIn_10_1 = null;
                stackIn_10_2 = null;
                stackIn_10_4 = m.field_x;
              }
              stackIn_9_0.field_jc = new cj(stackIn_9_3, stackIn_10_4);
              var12.a((byte) 50, var12.field_jc);
              var12.field_Qb = new cj[kj.field_h];
              var12.field_Xb = new cj(0L, (cj) null);
              if ((var14 & 1 << jq.field_f) != 0) {
                var12.field_jc.a((byte) 50, var12.field_Xb);
              }
              var12.field_kc = new cj(0L, (cj) null);
              if (0 != (1 << ho.field_l & var14)) {
                var12.field_jc.a((byte) 50, var12.field_kc);
              }
              var12.field_Tb = new cj(0L, (cj) null);
              if ((1 << el.field_M & var14) != 0) {
                var12.field_jc.a((byte) 50, var12.field_Tb);
              }
              var12.field_ec = new cj(0L, (cj) null);
              if ((1 << ti.field_J & var14) != 0) {
                var12.field_jc.a((byte) 50, var12.field_ec);
              }
              var45 = var12.field_Xb;
              var44 = var12.field_ec;
              var43 = var12.field_kc;
              var12.field_Tb.field_lb = 1;
              var43.field_lb = 1;
              var44.field_lb = 1;
              var45.field_lb = 1;
              for (var18_int = 0; kj.field_h > var18_int; var18_int++) {
                var12.field_Qb[var18_int] = new cj(0L, (cj) null);
                if (0 != (1 << var18_int + vm.field_ib & var14)) {
                  var12.field_jc.a((byte) 50, var12.field_Qb[var18_int]);
                }
                var12.field_Qb[var18_int].field_lb = 1;
              }
              stackIn_29_0 = var12;
              stackIn_29_1 = null;
              stackIn_29_2 = null;
              stackIn_29_3 = 0L;
              if (tb.field_u) {
                stackIn_30_1 = null;
                stackIn_30_2 = null;
                stackIn_30_4 = m.field_x;
              } else {
                stackIn_30_1 = null;
                stackIn_30_2 = null;
                stackIn_30_4 = wc.field_H;
              }
              stackIn_29_0.field_Yb = new cj(stackIn_29_3, stackIn_30_4);
              var12.a((byte) 50, var12.field_Yb);
              var12.field_Yb.field_R = 2;
              var12.field_ac = new cj(0L, m.field_x);
              var12.a((byte) 50, var12.field_ac);
              var12.field_hc = new cj(0L, cm.field_b);
              var12.a((byte) 50, var12.field_hc);
              var12.field_pc = new cj(0L, cm.field_b);
              var12.a((byte) 50, var12.field_pc);
              var12.field_Rb = new cj(0L, vo.field_m);
              var12.a((byte) 50, var12.field_Rb);
              var12.f(-128);
              var12.field_oc = new cj(0L, fd.field_O);
              var12.a((byte) 50, var12.field_oc);
              var13 = 1;
            }
            var12.field_Kb.field_wb = null;
            stackIn_34_0 = (var12.field_Fb) ? param2 : param4;
            var14Lifetime1 = stackIn_34_0;
            var46 = var12.field_Kb;
            var12.field_Kb.field_z = 0;
            var46.field_zb = 0;
            var12.field_oc.field_wb = null;
            var12.field_oc.field_z = 0;
            var47 = var12.field_oc;
            var47.field_zb = 0;
            var12.field_Gb.field_wb = null;
            var48 = var12.field_Gb;
            var12.field_Gb.field_z = 0;
            var48.field_zb = 0;
            var12.field_Ib.field_wb = null;
            var18 = var12.field_Ib;
            var12.field_Ib.field_z = 0;
            var12.field_gc.field_wb = null;
            var18.field_zb = 0;
            var19 = var12.field_gc;
            var12.field_gc.field_z = 0;
            var19.field_zb = 0;
            var12.field_Lb.field_wb = null;
            var20 = var12.field_Lb;
            var12.field_Lb.field_z = 0;
            var12.field_jc.field_wb = null;
            var20.field_zb = 0;
            var12.field_jc.field_z = 0;
            var21 = var12.field_jc;
            var21.field_zb = 0;
            for (var22_int = 0; var22_int < kj.field_h; var22_int++) {
              var12.field_Qb[var22_int].field_rb = null;
              var23 = var12.field_Qb[var22_int];
              var12.field_Qb[var22_int].field_z = 0;
              var23.field_zb = 0;
            }
            var12.field_Xb.field_rb = null;
            var12.field_Xb.field_z = 0;
            var22 = var12.field_Xb;
            var12.field_ec.field_rb = null;
            var22.field_zb = 0;
            var12.field_ec.field_z = 0;
            var49 = var12.field_ec;
            var12.field_kc.field_rb = null;
            var49.field_zb = 0;
            var24 = var12.field_kc;
            var12.field_kc.field_z = 0;
            var24.field_zb = 0;
            var12.field_Tb.field_rb = null;
            var12.field_Tb.field_z = 0;
            var25 = var12.field_Tb;
            var12.field_Yb.field_wb = null;
            var25.field_zb = 0;
            var12.field_Yb.field_z = 0;
            var26 = var12.field_Yb;
            var26.field_zb = 0;
            var12.field_ac.field_wb = null;
            var27 = var12.field_ac;
            var12.field_ac.field_z = 0;
            var12.field_hc.field_wb = null;
            var27.field_zb = 0;
            var28 = var12.field_hc;
            var12.field_hc.field_z = 0;
            var28.field_zb = 0;
            var12.field_pc.field_wb = null;
            var29 = var12.field_pc;
            var12.field_pc.field_z = 0;
            var29.field_zb = 0;
            var12.field_Rb.field_wb = null;
            var12.field_Rb.field_z = 0;
            var30 = var12.field_Rb;
            var30.field_zb = 0;
            var12.field_zb = ek.field_H.field_Gb.field_zb;
            var31 = 0;
            var32 = var12.field_Nb;
            if (!var12.j(2)) {
              boolean decompiledFrameRemainder1 = true;
              if (var12.field_Fb) {
                if (var12.field_Sb >= 0) {
                  var12.field_Kb.field_wb = ke.field_c;
                } else {
                  if (var12.field_Wb && (var12.field_Ob ||
                    var12.field_lc)) {
                    var12.field_oc.field_wb = ak.field_c;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (2 != var12.field_fc) {
                      var12.field_Kb.field_wb = jb.field_a;
                    } else {
                      var12.field_oc.field_wb = ap.field_u;
                    }
                  }
                }
              } else {
                if (!var12.field_Ob &&
                  !var12.field_lc) {
                  if (!var12.field_Mb) {
                    var12.field_Kb.field_wb = kn.field_c;
                  } else {
                    var12.field_Kb.field_wb = bf.field_j;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_oc.field_wb = ak.field_c;
                }
              }
              if (var12.field_oc.field_wb != null) {
                var12.field_oc.a(jk.field_f, var31, 68, 0, -3344);
              } else {
                var12.field_Kb.a(jk.field_f, var31, 68, 0, -3344);
              }
              var12.field_Gb.field_wb = fm.a(var12.field_Gb.field_yb, var32, 78);
              var12.field_Gb.a(jk.field_f, var31, 78, 70, -3344);
              if (var12.field_Gb.field_L &&
                !var12.field_Gb.field_wb.equals(var32)) {
                ui.field_j = var32;
              }
              var12.field_Ib.field_wb = Integer.toString(var12.field_cc);
              if (var12.field_Wb) {
                var12.field_Ib.field_R = 2;
                var12.field_gc.field_wb = "/" + var12.field_mc;
                var33_int = (348 - var12.field_gc.field_yb.a("/")) / 2;
                var12.field_Ib.a(jk.field_f, var31, -150 + var33_int, 150, -3344);
                var12.field_gc.a(jk.field_f, var31, 198 - var33_int, var33_int, -3344);
              } else {
                var12.field_Ib.field_R = 1;
                var12.field_Ib.a(jk.field_f, var31, 48, 150, -3344);
              }
              var12.field_Lb.field_wb = Integer.toString(var12.field_Ub);
              var12.field_Lb.a(jk.field_f, var31, 48, 200, -3344);
              stackIn_69_0 = (tb.field_u) ? 250 : 200;
              var33_intLifetime1 = stackIn_69_0;
              var12.field_jc.a(jk.field_f, var31, -var33_intLifetime1 + 365 - 2, var33_intLifetime1, -3344);
              var34_int = ed.field_c;
              if ((var14Lifetime1 & 1 << jq.field_f) != 0) {
                var50_ref = qp.field_u[var12.field_Pb];
                var12.field_Xb.field_rb = var50_ref;
                var12.field_Xb.a(var12.field_jc.field_z, 0, var50_ref.field_z, var34_int, -3344);
                var34_int = var34_int + (ed.field_c + var50_ref.field_z);
              }
              if (0 != (var14Lifetime1 & 1 << ho.field_l)) {
                if (!var12.field_Ob) {
                  stackIn_78_0 = (var12.field_lc) ? 1 : 0;
                } else {
                  stackIn_78_0 = 1;
                }
                var36 = stackIn_78_0;
                stackIn_80_0 = na.field_G;
                if (var36 == 0) {
                  stackIn_81_1 = 0;
                } else {
                  stackIn_81_1 = 1;
                }
                var51_ref = stackIn_80_0[stackIn_81_1];
                var12.field_kc.field_rb = var51_ref;
                var12.field_kc.a(var12.field_jc.field_z, 0, var51_ref.field_z, var34_int, -3344);
                var34_int = var34_int + (ed.field_c + var51_ref.field_z);
              }
              if (0 != (1 << el.field_M & var14Lifetime1)) {
                var52_ref = we.field_j[var12.field_fc - 1];
                var12.field_Tb.field_rb = var52_ref;
                var12.field_Tb.a(var12.field_jc.field_z, 0, var52_ref.field_z, var34_int, -3344);
                var34_int = var34_int + (ed.field_c + var52_ref.field_z);
              }
              if ((1 << ti.field_J & var14Lifetime1) != 0) {
                stackIn_89_0 = ke.field_i;
                if (!var12.field_dc) {
                  stackIn_90_1 = 0;
                } else {
                  stackIn_90_1 = 1;
                }
                var53_ref = stackIn_89_0[stackIn_90_1];
                var12.field_ec.field_rb = var53_ref;
                var12.field_ec.a(var12.field_jc.field_z, 0, var53_ref.field_z, var34_int, -3344);
                var34_int = var34_int + (var53_ref.field_z + ed.field_c);
              }
              if (null != um.field_g) {
                for (var36Lifetime1 = 0; kj.field_h > var36Lifetime1; var36Lifetime1++) {
                  if (null != um.field_g[var36Lifetime1] &&
                    0 != (var14Lifetime1 & 1 << vm.field_ib + var36Lifetime1)) {
                    var42 = um.field_g[var36Lifetime1][255 & var12.field_Zb[var36Lifetime1]];
                    var54 = var42;
                    var12.field_Qb[var36Lifetime1].field_rb = var42;
                    var12.field_Qb[var36Lifetime1].a(var12.field_jc.field_z, 0, var54.field_z, var34_int, -3344);
                    var34_int = var34_int + (ed.field_c + var54.field_z);
                  }
                }
              }
              var36Lifetime2 = (var12.field_jc.field_zb - var34_int) / 2;
              if (var36Lifetime2 > 0) {
                var12.field_Xb.field_x = var12.field_Xb.field_x + var36Lifetime2;
                var12.field_kc.field_x = var12.field_kc.field_x + var36Lifetime2;
                var12.field_Tb.field_x = var12.field_Tb.field_x + var36Lifetime2;
                var12.field_ec.field_x = var12.field_ec.field_x + var36Lifetime2;
                for (var37_int = 0; kj.field_h > var37_int; var37_int++) {
                  dupTemp$0 = var12.field_Qb[var37_int];
                  dupTemp$0.field_x = dupTemp$0.field_x + var36Lifetime2;
                }
              }
              if (var12.field_Fb) {
                var37_intLifetime1 = var12.field_Sb;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(var9 - var12.field_qc);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (60 > var39) {
                  var12.field_Yb.field_wb = var39 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Yb.field_wb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Yb.a(jk.field_f, var31, var12.field_zb - 365, 365, -3344);
              var31 = var31 + jk.field_f;
              if (null != var12.field_bc) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(ko.field_k);
                discarded$2 = var37.append(var12.field_bc[0]);
                for (var38_intLifetime1 = 1; var12.field_cc > var38_intLifetime1; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_bc[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_ac.field_wb = var38;
                var39Lifetime1 = var12.field_ac.field_yb.b(var38, -(2 * var12.field_ac.field_V) + var12.field_zb);
                var12.field_ac.a(var39Lifetime1 * jk.field_f, var31, var12.field_zb, 0, -3344);
                var31 = var31 + jk.field_f * var39Lifetime1;
              }
              if (var12.field_lc) {
                var12.field_hc.field_wb = vl.a(hj.field_b, new String[]{var32}, 2);
                var12.field_hc.a(jk.field_f, var31, var12.field_zb - 2 * nj.field_h, nj.field_h, -3344);
                var31 = var31 + jk.field_f;
              }
              if (var12.field_rc) {
                var12.field_pc.field_wb = vl.a(be.field_k, new String[]{var32}, 2);
                var12.field_pc.a(jk.field_f, var31, var12.field_zb - nj.field_h * 2, nj.field_h, -3344);
                var31 = var31 + jk.field_f;
              }
            }
            var33 = hd.a(var12.field_Vb, var32, -9);
            var34 = var33;
            var34Lifetime1 = var33;
            if (var33 != null) {
              var34_intLifetime1 = var12.field_Rb.field_yb.b(var33, -nj.field_h + (var12.field_zb - nj.field_h));
              var12.field_Rb.field_Y = var12.field_Jb * 256 / so.field_r;
              var12.field_Rb.field_wb = var33;
              var12.field_Rb.a(var34_intLifetime1 * jk.field_f, var31, var12.field_zb - nj.field_h * 2, nj.field_h, -3344);
              var31 = var31 + var34_intLifetime1 * jk.field_f;
            }
            if (var7_int == 0) {
              var12.field_I = var31 - var12.field_z;
            }
            if (var13 != 0) {
              ek.field_H.field_Gb.a(2, var12, 1300, (cj) (var11));
            }
            for (var34_intLifetime2 = 0; kj.field_h > var34_intLifetime2; var34_intLifetime2++) {
              if (var12.field_Qb[var34_intLifetime2].field_L) {
                if (kp.field_n == null) {
                  var35 = null;
                } else {
                  if (kp.field_n[var34_intLifetime2] != null) {
                    var35 = kp.field_n[var34_intLifetime2][var12.field_Zb[var34_intLifetime2] & 255];
                  } else {
                    var35 = null;
                  }
                }
                if (var35 == null) {
                  ui.field_j = cf.field_f[var34_intLifetime2];
                } else {
                  ui.field_j = cf.field_f[var34_intLifetime2] + " - " + (String) (var35);
                }
              }
            }
            if (var12.field_Xb.field_L) {
              if (var12.field_Pb != 1) {
                var34Lifetime2 = t.field_c[var12.field_Pb];
              } else {
                var34Lifetime2 = cb.field_g;
              }
              ui.field_j = vc.field_h + " - " + var34Lifetime2;
            }
            if (var12.field_ec.field_L) {
              if (!var12.field_dc) {
                stackIn_153_0 = hp.field_m;
              } else {
                stackIn_153_0 = mk.field_l;
              }
              ui.field_j = stackIn_153_0;
            }
            if (var12.field_kc.field_L) {
              if (!var12.field_Ob &&
                !var12.field_lc) {
                if (var12.field_Wb) {
                  stackIn_162_0 = hp.field_i;
                } else {
                  stackIn_162_0 = lb.field_b;
                }
              } else {
                stackIn_162_0 = bk.field_j;
              }
              ui.field_j = stackIn_162_0;
            }
            if (var12.field_Tb.field_L) {
              if (var12.field_fc == 2) {
                stackIn_167_0 = oe.field_a;
              } else {
                stackIn_167_0 = qd.field_E;
              }
              ui.field_j = stackIn_167_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (0 != var12.field_T) {
              if (var12.j(2)) {
                var12 = (jh) (var8.b(6));
                continue;
              }
              if (0 != var12.field_oc.field_T) {
                if (var12.field_Fb && (!var12.field_Wb ||
                  !var12.field_Ob &&
                  !var12.field_lc)) {
                  kk.a(-108, var12.i(6), param3);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  pl.a(param3, (byte) 92, var12.i(6));
                }
              } else {
                qm.a(var12, param0, var32, -123);
              }
            }
            var12 = (jh) (var8.b(6));
          }
          if (param1 < 111) {
            field_M = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var7), "og.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != 200) {
            og.b(-87, 110);
          }
          var3_int = 1;
          while (1 < param2) {
            if ((param2 & 1) != 0) {
              var3_int = var3_int * param0;
            }
            param0 = param0 * param0;
            param2 = param2 >> 1;
          }
          if (param2 != 1) {
            stackIn_13_0 = var3_int;
            return stackIn_13_0;
          }
          stackIn_11_0 = param0 * var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "og.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4;
        int var5;
        boolean stackIn_8_0 = false;
        if (param2 > -114) {
          og.a(96, -108, -22);
        }
        var4 = this.field_G >> 16;
        var5 = this.field_E >> 16;
        stackIn_8_0 = (param1 < 24 + (var4 - 7)) && (7 + (var4 - 24) < param1) && (param0 > 5 + (-48 + var5)) && (var5 + 2 > param0);
        return stackIn_8_0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        hk.field_a = true;
        if (param0 != 0) {
          return;
        }
        try {
          var2 = "tuhstatbut";
          var3 = "rvnadlm";
          var4 = -1L;
          dc.a(var4, param1, var2, -100, var3);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "og.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_T = "Return to game";
        field_M = "Creating your account";
        field_P = "You could learn more about humans.";
        field_S = "Fast";
        field_N = true;
    }
}
