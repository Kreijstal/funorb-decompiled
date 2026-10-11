/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class w implements hc {
    static String field_d;
    static int[] field_a;
    static String field_h;
    static ot[] field_f;
    static vg field_b;
    static String[] field_g;
    static String field_c;
    static hd field_e;

    final static ag a(vm param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        ag var3 = null;
        Object stackIn_2_0 = null;
        ag stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == qd.field_c) {
            stackIn_2_0 = null;
            return (ag) (stackIn_2_0);
          }
          var2_int = 119 / ((72 - param1) / 33);
          var3 = new ag(param0, param0);
          qd.field_c.a(var3, 3);
          vg.field_Bb.a(param0);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("w.D(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(int param0) {
        int var2 = 8 / ((50 - param0) / 45);
        if (null != su.field_c) {
          su.field_c.b(false);
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var18_int = 0;
        int var22_int = 0;
        hd dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        np stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        qb stackIn_10_0;
        hd stackIn_10_1;
        hd stackIn_10_2;
        long stackIn_10_3;
        hd stackIn_11_1 = null;
        hd stackIn_11_2 = null;
        hd stackIn_11_4 = null;
        qb stackIn_31_0;
        hd stackIn_31_1;
        hd stackIn_31_2;
        long stackIn_31_3;
        hd stackIn_32_1;
        hd stackIn_32_2;
        hd stackIn_32_4;
        int stackIn_36_0 = 0;
        hd stackIn_64_0 = null;
        boolean stackIn_65_1 = false;
        int stackIn_75_0 = 0;
        int stackIn_85_0 = 0;
        ut[] stackIn_87_0 = null;
        int stackIn_88_1 = 0;
        hd stackIn_90_0 = null;
        boolean stackIn_91_1 = false;
        ut[] stackIn_98_0 = null;
        int stackIn_99_1 = 0;
        hd stackIn_101_0 = null;
        boolean stackIn_102_1 = false;
        String stackIn_168_0 = null;
        String stackIn_176_0 = null;
        String stackIn_181_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        tf var8 = null;
        long var9 = 0L;
        Object var11 = null;
        qb var12 = null;
        int var13 = 0;
        int var14 = 0;
        hd var18 = null;
        hd var19 = null;
        hd var20 = null;
        hd var21 = null;
        hd var22 = null;
        hd var23 = null;
        hd var24 = null;
        hd var25 = null;
        hd var26 = null;
        hd var27 = null;
        hd var28 = null;
        hd var29 = null;
        hd var30 = null;
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
        ut var42 = null;
        hd var43 = null;
        hd var44 = null;
        hd var45 = null;
        hd var46 = null;
        hd var47 = null;
        hd var48 = null;
        hd var49 = null;
        Object var50 = null;
        ut var50_ref = null;
        Object var51 = null;
        ut var51_ref = null;
        Object var52 = null;
        ut var52_ref = null;
        Object var53 = null;
        ut var53_ref = null;
        ut var54 = null;
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
        var41 = Kickabout.field_G;
        try {
          stackIn_3_0 = sp.field_Jb;
          stackIn_3_1 = param5 * (sh.field_c * 4 + 8);
          stackIn_4_2 = (ig.field_f == sp.field_Jb);
          var7_int = ((np) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2, param0, 2, param1, (2 + sh.field_c) * 2) ? 1 : 0;
          var8 = sp.field_Jb.field_Ab.field_jb;
          var9 = nj.a(97);
          var11 = null;
          var12 = (qb) (var8.g(24009));
          while (var12 != null) {
            var13 = 0;
            if (var12.field_jb == null) {
              var12.field_Ib = new hd(0L, pw.field_J);
              stackIn_8_0 = param3;
              stackIn_8_1 = param6;
              var14 = stackIn_8_0 | stackIn_8_1;
              var12.a((byte) -104, var12.field_Ib);
              var12.field_Ib.field_A = 1;
              var12.field_Jb = new hd(0L, mp.field_f);
              var12.a((byte) -116, var12.field_Jb);
              var12.field_kc = new hd(0L, pw.field_J);
              var12.a((byte) -109, var12.field_kc);
              var12.field_kc.field_kb = 0;
              var12.field_jc = new hd(0L, pw.field_J);
              var12.a((byte) -110, var12.field_jc);
              var12.field_jc.field_kb = 0;
              var12.field_Hb = new hd(0L, mp.field_f);
              var12.a((byte) -121, var12.field_Hb);
              var12.field_Hb.field_A = 2;
              stackIn_10_0 = var12;
              stackIn_10_1 = null;
              stackIn_10_2 = null;
              stackIn_10_3 = 0L;
              if (ui.field_t) {
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_4 = pw.field_J;
              } else {
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_4 = mp.field_f;
              }
              stackIn_10_0.field_zb = new hd(stackIn_10_3, stackIn_11_4);
              var12.a((byte) -120, var12.field_zb);
              var12.field_Sb = new hd[ss.field_j];
              var12.field_Pb = new hd(0L, (hd) null);
              if ((var14 & 1 << wb.field_u) != 0) {
                var12.field_zb.a((byte) -119, var12.field_Pb);
              }
              var12.field_Rb = new hd(0L, (hd) null);
              if (0 != (1 << wr.field_j & var14)) {
                var12.field_zb.a((byte) -126, var12.field_Rb);
              }
              var12.field_Gb = new hd(0L, (hd) null);
              if ((var14 & 1 << hk.field_F) != 0) {
                var12.field_zb.a((byte) -111, var12.field_Gb);
              }
              var12.field_cc = new hd(0L, (hd) null);
              if ((1 << mv.field_b & var14) != 0) {
                var12.field_zb.a((byte) -119, var12.field_cc);
              }
              var45 = var12.field_Pb;
              var44 = var12.field_cc;
              var43 = var12.field_Rb;
              var12.field_Gb.field_p = 1;
              var43.field_p = 1;
              var44.field_p = 1;
              var45.field_p = 1;
              for (var18_int = 0; ss.field_j > var18_int; var18_int++) {
                var12.field_Sb[var18_int] = new hd(0L, (hd) null);
                if ((var14 & 1 << var18_int + sj.field_h) != 0) {
                  var12.field_zb.a((byte) -122, var12.field_Sb[var18_int]);
                }
                var12.field_Sb[var18_int].field_p = 1;
              }
              stackIn_31_0 = var12;
              stackIn_31_1 = null;
              stackIn_31_2 = null;
              stackIn_31_3 = 0L;
              if (ui.field_t) {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = mp.field_f;
              } else {
                stackIn_32_1 = null;
                stackIn_32_2 = null;
                stackIn_32_4 = pw.field_J;
              }
              stackIn_31_0.field_Zb = new hd(stackIn_31_3, stackIn_32_4);
              var12.a((byte) -104, var12.field_Zb);
              var12.field_Zb.field_A = 2;
              var12.field_fc = new hd(0L, mp.field_f);
              var12.a((byte) -112, var12.field_fc);
              var12.field_dc = new hd(0L, ul.field_c);
              var12.a((byte) -127, var12.field_dc);
              var12.field_Yb = new hd(0L, ul.field_c);
              var12.a((byte) -121, var12.field_Yb);
              var12.field_Bb = new hd(0L, dw.field_e);
              var12.a((byte) -128, var12.field_Bb);
              var12.b(param1);
              var12.field_Lb = new hd(0L, jc.field_r);
              var13 = 1;
              var12.a((byte) -128, var12.field_Lb);
            }
            stackIn_36_0 = (var12.field_Cb) ? param6 : param3;
            var14Lifetime1 = stackIn_36_0;
            var12.field_Ib.field_E = null;
            var12.field_Ib.field_mb = 0;
            var46 = var12.field_Ib;
            var12.field_Lb.field_E = null;
            var46.field_q = 0;
            var12.field_Lb.field_mb = 0;
            var47 = var12.field_Lb;
            var47.field_q = 0;
            var12.field_Jb.field_E = null;
            var12.field_Jb.field_mb = 0;
            var48 = var12.field_Jb;
            var12.field_kc.field_E = null;
            var48.field_q = 0;
            var12.field_kc.field_mb = 0;
            var18 = var12.field_kc;
            var12.field_jc.field_E = null;
            var18.field_q = 0;
            var12.field_jc.field_mb = 0;
            var19 = var12.field_jc;
            var12.field_Hb.field_E = null;
            var19.field_q = 0;
            var20 = var12.field_Hb;
            var12.field_Hb.field_mb = 0;
            var12.field_zb.field_E = null;
            var20.field_q = 0;
            var21 = var12.field_zb;
            var12.field_zb.field_mb = 0;
            var21.field_q = 0;
            for (var22_int = 0; var22_int < ss.field_j; var22_int++) {
              var12.field_Sb[var22_int].field_N = null;
              var23 = var12.field_Sb[var22_int];
              var12.field_Sb[var22_int].field_mb = 0;
              var23.field_q = 0;
            }
            var12.field_Pb.field_N = null;
            var12.field_Pb.field_mb = 0;
            var22 = var12.field_Pb;
            var22.field_q = 0;
            var12.field_cc.field_N = null;
            var12.field_cc.field_mb = 0;
            var49 = var12.field_cc;
            var49.field_q = 0;
            var12.field_Rb.field_N = null;
            var24 = var12.field_Rb;
            var12.field_Rb.field_mb = 0;
            var12.field_Gb.field_N = null;
            var24.field_q = 0;
            var12.field_Gb.field_mb = 0;
            var25 = var12.field_Gb;
            var12.field_Zb.field_E = null;
            var25.field_q = 0;
            var12.field_Zb.field_mb = 0;
            var26 = var12.field_Zb;
            var12.field_fc.field_E = null;
            var26.field_q = 0;
            var12.field_fc.field_mb = 0;
            var27 = var12.field_fc;
            var12.field_dc.field_E = null;
            var27.field_q = 0;
            var28 = var12.field_dc;
            var12.field_dc.field_mb = 0;
            var12.field_Yb.field_E = null;
            var28.field_q = 0;
            var29 = var12.field_Yb;
            var12.field_Yb.field_mb = 0;
            var29.field_q = 0;
            var12.field_Bb.field_E = null;
            var12.field_Bb.field_mb = 0;
            var30 = var12.field_Bb;
            var30.field_q = 0;
            var12.field_q = sp.field_Jb.field_Ab.field_q;
            var31 = 0;
            var32 = var12.field_ec;
            if (!var12.b(-7)) {
              boolean decompiledFrameRemainder1 = true;
              if (!var12.field_Cb) {
                if (!var12.field_Xb &&
                  !var12.field_hc) {
                  if (var12.field_yb) {
                    var12.field_Ib.field_E = oj.field_R;
                  } else {
                    var12.field_Ib.field_E = dh.field_m;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_Lb.field_E = hh.field_e;
                }
              } else {
                if (var12.field_ac >= 0) {
                  var12.field_Ib.field_E = cr.field_f;
                } else {
                  if (var12.field_ic && (var12.field_Xb ||
                    var12.field_hc)) {
                    var12.field_Lb.field_E = hh.field_e;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (2 != var12.field_Mb) {
                      var12.field_Ib.field_E = ph.field_d;
                    } else {
                      var12.field_Lb.field_E = rb.field_Hb;
                    }
                  }
                }
              }
              if (null != var12.field_Lb.field_E) {
                var12.field_Lb.a(true, 68, 0, var31, sh.field_c);
              } else {
                var12.field_Ib.a(true, 68, 0, var31, sh.field_c);
              }
              var12.field_Jb.field_E = hu.a(var12.field_Jb.field_X, var32, 78);
              stackIn_64_0 = var12.field_Jb;
              stackIn_65_1 = !(param1);
              ((hd) (Object) stackIn_64_0).a(stackIn_65_1, 78, 70, var31, sh.field_c);
              if (var12.field_Jb.field_gb &&
                !var12.field_Jb.field_E.equals(var32)) {
                sn.field_e = var32;
              }
              var12.field_kc.field_E = Integer.toString(var12.field_gc);
              if (!var12.field_ic) {
                var12.field_kc.field_A = 1;
                var12.field_kc.a(true, 48, 150, var31, sh.field_c);
              } else {
                var12.field_kc.field_A = 2;
                var12.field_jc.field_E = "/" + var12.field_bc;
                var33_int = (-var12.field_jc.field_X.a("/") + 348) / 2;
                var12.field_kc.a(true, var33_int - 150, 150, var31, sh.field_c);
                var12.field_jc.a(true, -var33_int + 198, var33_int, var31, sh.field_c);
              }
              var12.field_Hb.field_E = Integer.toString(var12.field_Ob);
              var12.field_Hb.a(true, 48, 200, var31, sh.field_c);
              stackIn_75_0 = (ui.field_t) ? 250 : 200;
              var33_intLifetime1 = stackIn_75_0;
              var12.field_zb.a(true, -var33_intLifetime1 + 365 - 2, var33_intLifetime1, var31, sh.field_c);
              var34_int = mj.field_b;
              if ((var14Lifetime1 & 1 << wb.field_u) != 0) {
                var50_ref = jd.field_d[var12.field_Wb];
                var12.field_Pb.field_N = var50_ref;
                var12.field_Pb.a(true, var50_ref.field_o, var34_int, 0, var12.field_zb.field_mb);
                var34_int = var34_int + (var50_ref.field_o + mj.field_b);
              }
              if ((1 << wr.field_j & var14Lifetime1) != 0) {
                if (!var12.field_Xb) {
                  stackIn_85_0 = (var12.field_hc) ? 1 : 0;
                } else {
                  stackIn_85_0 = 1;
                }
                var36 = stackIn_85_0;
                stackIn_87_0 = nv.field_L;
                if (var36 == 0) {
                  stackIn_88_1 = 0;
                } else {
                  stackIn_88_1 = 1;
                }
                var51_ref = stackIn_87_0[stackIn_88_1];
                var12.field_Rb.field_N = var51_ref;
                stackIn_90_0 = var12.field_Rb;
                stackIn_91_1 = !(param1);
                ((hd) (Object) stackIn_90_0).a(stackIn_91_1, var51_ref.field_o, var34_int, 0, var12.field_zb.field_mb);
                var34_int = var34_int + (var51_ref.field_o + mj.field_b);
              }
              if ((1 << hk.field_F & var14Lifetime1) != 0) {
                var52_ref = i.field_E[var12.field_Mb - 1];
                var12.field_Gb.field_N = var52_ref;
                var12.field_Gb.a(true, var52_ref.field_o, var34_int, 0, var12.field_zb.field_mb);
                var34_int = var34_int + (mj.field_b + var52_ref.field_o);
              }
              if ((1 << mv.field_b & var14Lifetime1) != 0) {
                stackIn_98_0 = wm.field_m;
                if (var12.field_Ub) {
                  stackIn_99_1 = 1;
                } else {
                  stackIn_99_1 = 0;
                }
                var53_ref = stackIn_98_0[stackIn_99_1];
                var12.field_cc.field_N = var53_ref;
                stackIn_101_0 = var12.field_cc;
                stackIn_102_1 = !(param1);
                ((hd) (Object) stackIn_101_0).a(stackIn_102_1, var53_ref.field_o, var34_int, 0, var12.field_zb.field_mb);
                var34_int = var34_int + (var53_ref.field_o + mj.field_b);
              }
              if (fh.field_a != null) {
                for (var36Lifetime1 = 0; ss.field_j > var36Lifetime1; var36Lifetime1++) {
                  if (fh.field_a[var36Lifetime1] != null &&
                    (1 << var36Lifetime1 + sj.field_h & var14Lifetime1) != 0) {
                    var42 = fh.field_a[var36Lifetime1][255 & var12.field_Eb[var36Lifetime1]];
                    var54 = var42;
                    var12.field_Sb[var36Lifetime1].field_N = var42;
                    var12.field_Sb[var36Lifetime1].a(true, var54.field_o, var34_int, 0, var12.field_zb.field_mb);
                    var34_int = var34_int + (var54.field_o + mj.field_b);
                  }
                }
              }
              var36Lifetime2 = (-var34_int + var12.field_zb.field_q) / 2;
              if (var36Lifetime2 > 0) {
                var12.field_Pb.field_s = var12.field_Pb.field_s + var36Lifetime2;
                var12.field_Rb.field_s = var12.field_Rb.field_s + var36Lifetime2;
                var12.field_Gb.field_s = var12.field_Gb.field_s + var36Lifetime2;
                var12.field_cc.field_s = var12.field_cc.field_s + var36Lifetime2;
                for (var37_int = 0; var37_int < ss.field_j; var37_int++) {
                  dupTemp$0 = var12.field_Sb[var37_int];
                  dupTemp$0.field_s = dupTemp$0.field_s + var36Lifetime2;
                }
              }
              if (var12.field_Cb) {
                var37_intLifetime1 = var12.field_ac;
                if (0 > var37_intLifetime1) {
                  var37_intLifetime1 = (int)(var9 - var12.field_Fb);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (60 > var39) {
                  var12.field_Zb.field_E = var39 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Zb.field_E = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Zb.a(true, -365 + var12.field_q, 365, var31, sh.field_c);
              var31 = var31 + sh.field_c;
              if (var12.field_Kb != null) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(np.field_Eb);
                discarded$2 = var37.append(var12.field_Kb[0]);
                for (var38_intLifetime1 = 1; var38_intLifetime1 < var12.field_gc; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_Kb[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_fc.field_E = var38;
                var39Lifetime1 = var12.field_fc.field_X.b(var38, -(var12.field_fc.field_kb * 2) + var12.field_q);
                var12.field_fc.a(true, var12.field_q, 0, var31, sh.field_c * var39Lifetime1);
                var31 = var31 + sh.field_c * var39Lifetime1;
              }
              if (var12.field_hc) {
                var12.field_dc.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(-18, wi.field_x, new String[]{var32});
                var12.field_dc.a(true, -(2 * eb.field_b) + var12.field_q, eb.field_b, var31, sh.field_c);
                var31 = var31 + sh.field_c;
              }
              if (var12.field_Tb) {
                var12.field_Yb.field_E = vo.$cfr$intArgs$a$53ce4ab4c593(-18, uj.field_C, new String[]{var32});
                var12.field_Yb.a(true, var12.field_q - 2 * eb.field_b, eb.field_b, var31, sh.field_c);
                var31 = var31 + sh.field_c;
              }
            }
            var33 = cq.a(var12.field_Ab, var32, (byte) 112);
            var34 = var33;
            var34Lifetime1 = var33;
            if (var33 != null) {
              var34_intLifetime1 = var12.field_Bb.field_X.b(var33, var12.field_q - (eb.field_b + eb.field_b));
              var12.field_Bb.field_E = var33;
              var12.field_Bb.field_U = 256 * var12.field_Db / mg.field_c;
              var12.field_Bb.a(true, -(eb.field_b * 2) + var12.field_q, eb.field_b, var31, var34_intLifetime1 * sh.field_c);
              var31 = var31 + sh.field_c * var34_intLifetime1;
            }
            if (var7_int == 0) {
              var12.field_L = var31 - var12.field_mb;
            }
            if (var13 != 0) {
              sp.field_Jb.field_Ab.a(true, 2, var12, (hd) (var11));
            }
            for (var34_intLifetime2 = 0; ss.field_j > var34_intLifetime2; var34_intLifetime2++) {
              if (var12.field_Sb[var34_intLifetime2].field_gb) {
                if (null != ca.field_g) {
                  if (null != ca.field_g[var34_intLifetime2]) {
                    var35 = ca.field_g[var34_intLifetime2][255 & var12.field_Eb[var34_intLifetime2]];
                  } else {
                    var35 = null;
                  }
                } else {
                  var35 = null;
                }
                if (var35 != null) {
                  sn.field_e = ok.field_b[var34_intLifetime2] + " - " + (String) (var35);
                } else {
                  sn.field_e = ok.field_b[var34_intLifetime2];
                }
              }
            }
            if (var12.field_Pb.field_gb) {
              if (1 != var12.field_Wb) {
                var34Lifetime2 = wj.field_w[var12.field_Wb];
              } else {
                var34Lifetime2 = vj.field_f;
              }
              sn.field_e = dr.field_e + " - " + var34Lifetime2;
            }
            if (var12.field_cc.field_gb) {
              if (var12.field_Ub) {
                stackIn_168_0 = qn.field_d;
              } else {
                stackIn_168_0 = gf.field_i;
              }
              sn.field_e = stackIn_168_0;
            }
            if (var12.field_Rb.field_gb) {
              if (!var12.field_Xb &&
                !var12.field_hc) {
                if (var12.field_ic) {
                  stackIn_176_0 = gf.field_f;
                } else {
                  stackIn_176_0 = dj.field_B;
                }
              } else {
                stackIn_176_0 = ar.field_f;
              }
              sn.field_e = stackIn_176_0;
            }
            if (var12.field_Gb.field_gb) {
              if (var12.field_Mb == 2) {
                stackIn_181_0 = ga.field_U;
              } else {
                stackIn_181_0 = pq.field_G;
              }
              sn.field_e = stackIn_181_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (0 != var12.field_sb &&
              !var12.b(-7)) {
              if (var12.field_Lb.field_sb == 0) {
                kd.a(15, var12, param4, var32);
              } else {
                if (var12.field_Cb && (!var12.field_ic ||
                  !var12.field_Xb &&
                  !var12.field_hc)) {
                  tu.b(15848, param2, var12.h((byte) 92));
                  decompiledFrameRemainder0 = false;
                }
                else {
                  wf.b(var12.h((byte) -87), param2, (byte) -59);
                }
              }
            }
            var12 = (qb) (var8.c(33));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var7), "w.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static lk[] a(String param0, byte param1) {
        int incrementValue$1 = 0;
        tf var2 = null;
        RuntimeException var2_ref = null;
        lk[] var3 = null;
        int var4 = 0;
        lk var5 = null;
        int var6 = 0;
        lk[] stackIn_3_0 = null;
        lk[] stackIn_6_0 = null;
        lk[] stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Kickabout.field_G;
        try {
          if (param0.equals(ck.field_e)) {
            stackIn_3_0 = sr.field_a;
            return stackIn_3_0;
          }
          var2 = fj.a(false, param0);
          var3 = new lk[var2.a(false)];
          if (param1 > -8) {
            stackIn_6_0 = (lk[]) null;
            return stackIn_6_0;
          }
          var4 = 0;
          var5 = (lk) (var2.g(24009));
          while (var5 != null) {
            incrementValue$1 = var4;
            var4++;
            var3[incrementValue$1] = var5;
            var5 = (lk) (var2.c(33));
          }
          ck.field_e = param0;
          sr.field_a = var3;
          stackIn_11_0 = var3;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_14_0 = var2_ref;
          stackIn_14_1 = new StringBuilder().append("w.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_d = null;
        field_e = null;
        field_f = null;
        field_h = null;
        field_g = null;
        if (param0 < 18) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    public final void a(int param0, boolean param1) {
        jb var3;
        int var4;
        boolean stackIn_22_0 = false;
        vm var5;
        var4 = Kickabout.field_G;
        if (dg.field_e ||
          ds.field_g) {
          var3 = (jb) (np.field_Jb.g(param0 ^ -24018));
          while (var3 != null) {
            if (var3 instanceof hk ||
              var3 instanceof pw ||
              var3 instanceof pq) {
              var3.e(19910);
            }
            var3 = (jb) (np.field_Jb.c(33));
          }
          if (su.field_c != null && (su.field_c instanceof hk ||
            su.field_c instanceof pw ||
            su.field_c instanceof pq)) {
            su.field_c.e(19910);
          }
        }
        if (su.field_c == null) {
          stackIn_22_0 = param1;
          if (stackIn_22_0 &&
            vd.a((byte) 82)) {
            su.field_c = (jb) (np.field_Jb.b((byte) 125));
          }
        } else {
          su.field_c.b(param0 - 16511, param1);
          if (su.field_c.a(-31268)) {
            su.field_c = null;
          }
        }
        if (param0 != -25) {
          var5 = (vm) null;
          w.a((vm) null, -103);
        }
    }

    public final boolean a(int param0, int param1, char param2) {
        if (null != su.field_c) {
          return su.field_c.a(param1, (byte) -21, param2);
        }
        if (param0 != 11516) {
          w.a(true, true, 2, -89, false, 39, -5);
        }
        return false;
    }

    public final boolean a(byte param0) {
        if (param0 <= 63) {
          field_e = (hd) null;
        }
        return null != su.field_c ? true : false;
    }

    static {
        field_d = "scheduled";
        field_h = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_f = new ot[6];
        field_g = new String[]{"Attach", "Zoom", "Move"};
        field_c = "This game option is not available in rated games.";
    }
}
