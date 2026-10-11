/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca extends ck {
    bj[] field_u;
    sk[] field_x;
    static int[] field_r;
    byte[] field_q;
    byte[] field_v;
    short[] field_p;
    private int[] field_s;
    byte[] field_o;
    static String field_w;
    int field_t;

    final boolean a(byte[] param0, int param1, ub param2, int[] param3) {
        int var8 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var9 = 0;
        int var10 = 0;
        var10 = SteelSentinels.field_G;
        try {
          if (param1 != -12422) {
            this.field_p = (short[]) null;
          }
          var5_int = 1;
          var6 = 0;
          var7 = null;
          for (var8 = 0; var8 < 128; var8++) {
            if (param0 == null ||
              param0[var8] != 0) {
              var9 = this.field_s[var8];
              if (0 != var9) {
                if (var6 != var9) {
                  var6 = var9;
                  var9--;
                  if ((1 & var9) != 0) {
                    var7 = param2.a((byte) -35, param3, var9 >> 2);
                  } else {
                    var7 = param2.a(param3, var9 >> 2, -6923);
                  }
                  if (var7 == null) {
                    var5_int = 0;
                  }
                }
                if (var7 != null) {
                  this.field_x[var8] = (sk) (var7);
                  this.field_s[var8] = 0;
                }
              }
            }
          }
          stackIn_20_0 = var5_int;
          return stackIn_20_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("ca.A(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void d(int param0) {
        t.field_l = -1;
        eh.field_a = -1;
        rc.field_b = null;
        pg.field_A = false;
        if (param0 != -30603) {
          return;
        }
        si.field_m = 0;
    }

    public static void c(byte param0) {
        if (param0 != -73) {
          ca.d(-109);
        }
        field_w = null;
        field_r = null;
    }

    final void a(byte param0) {
        this.field_s = null;
        if (param0 < 100) {
          this.field_x = (sk[]) null;
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, boolean param5, int param6) {
        int var18_int = 0;
        int var22_int = 0;
        gh dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        kg stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        boolean stackIn_4_4 = false;
        hk stackIn_12_0;
        gh stackIn_12_1;
        gh stackIn_12_2;
        long stackIn_12_3;
        gh stackIn_13_1 = null;
        gh stackIn_13_2 = null;
        gh stackIn_13_4 = null;
        hk stackIn_30_0;
        gh stackIn_30_1;
        gh stackIn_30_2;
        long stackIn_30_3;
        gh stackIn_31_1;
        gh stackIn_31_2;
        gh stackIn_31_4;
        int stackIn_35_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_80_0 = 0;
        wk[] stackIn_82_0 = null;
        int stackIn_83_1 = 0;
        wk[] stackIn_90_0 = null;
        int stackIn_91_1 = 0;
        String stackIn_155_0 = null;
        String stackIn_164_0 = null;
        String stackIn_170_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        ul var8 = null;
        long var9 = 0L;
        Object var11 = null;
        hk var12 = null;
        int var13 = 0;
        int var14 = 0;
        gh var18 = null;
        gh var19 = null;
        gh var20 = null;
        gh var21 = null;
        gh var22 = null;
        gh var23 = null;
        gh var24 = null;
        gh var25 = null;
        gh var26 = null;
        gh var27 = null;
        gh var28 = null;
        gh var29 = null;
        gh var30 = null;
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
        wk var42 = null;
        gh var43 = null;
        gh var44 = null;
        gh var45 = null;
        gh var46 = null;
        gh var47 = null;
        gh var48 = null;
        gh var49 = null;
        Object var50 = null;
        wk var50_ref = null;
        Object var51 = null;
        wk var51_ref = null;
        Object var52 = null;
        wk var52_ref = null;
        Object var53 = null;
        wk var53_ref = null;
        wk var54 = null;
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
        var41 = SteelSentinels.field_G;
        try {
          stackIn_3_0 = rn.field_y;
          stackIn_3_1 = 2;
          stackIn_3_2 = 2 * (2 + db.field_b);
          stackIn_3_3 = param3 * (4 * (db.field_b + 2));
          stackIn_4_4 = (la.field_c == rn.field_y);
          var7_int = ((kg) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_4_4, param2, (byte) -41) ? 1 : 0;
          if (param1 != 1) {
            return;
          }
          var8 = rn.field_y.field_Ub.field_M;
          var9 = mm.a(param1 - 114);
          var11 = null;
          var12 = (hk) (var8.e(13058));
          while (var12 != null) {
            var13 = 0;
            if (null == var12.field_M) {
              var14 = param0 | param4;
              var12.field_kc = new gh(0L, SteelSentinels.field_J);
              var12.a(var12.field_kc, 125);
              var12.field_kc.field_Kb = 1;
              var12.field_Cc = new gh(0L, bb.field_W);
              var12.a(var12.field_Cc, 127);
              var12.field_qc = new gh(0L, SteelSentinels.field_J);
              var12.a(var12.field_qc, 123);
              var12.field_qc.field_ub = 0;
              var12.field_zc = new gh(0L, SteelSentinels.field_J);
              var12.a(var12.field_zc, 123);
              var12.field_zc.field_ub = 0;
              var12.field_Ic = new gh(0L, bb.field_W);
              var12.a(var12.field_Ic, 118);
              var12.field_Ic.field_Kb = 2;
              stackIn_12_0 = var12;
              stackIn_12_1 = null;
              stackIn_12_2 = null;
              stackIn_12_3 = 0L;
              if (rm.field_p) {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = SteelSentinels.field_J;
              } else {
                stackIn_13_1 = null;
                stackIn_13_2 = null;
                stackIn_13_4 = bb.field_W;
              }
              stackIn_12_0.field_uc = new gh(stackIn_12_3, stackIn_13_4);
              var12.a(var12.field_uc, 118);
              var12.field_Gc = new gh[be.field_a];
              var12.field_Fc = new gh(0L, (gh) null);
              if ((1 << ol.field_dc & var14) != 0) {
                var12.field_uc.a(var12.field_Fc, 125);
              }
              var12.field_Wb = new gh(0L, (gh) null);
              if ((var14 & 1 << sn.field_b) != 0) {
                var12.field_uc.a(var12.field_Wb, 124);
              }
              var12.field_ac = new gh(0L, (gh) null);
              if ((var14 & 1 << jf.field_Z) != 0) {
                var12.field_uc.a(var12.field_ac, 126);
              }
              var12.field_tc = new gh(0L, (gh) null);
              if ((1 << ja.field_f & var14) != 0) {
                var12.field_uc.a(var12.field_tc, 122);
              }
              var45 = var12.field_Fc;
              var44 = var12.field_tc;
              var12.field_ac.field_Fb = 1;
              var43 = var12.field_Wb;
              var43.field_Fb = 1;
              var44.field_Fb = 1;
              var45.field_Fb = 1;
              for (var18_int = 0; var18_int < be.field_a; var18_int++) {
                var12.field_Gc[var18_int] = new gh(0L, (gh) null);
                if ((1 << var18_int + ch.field_L & var14) != 0) {
                  var12.field_uc.a(var12.field_Gc[var18_int], param1 ^ 127);
                }
                var12.field_Gc[var18_int].field_Fb = 1;
              }
              stackIn_30_0 = var12;
              stackIn_30_1 = null;
              stackIn_30_2 = null;
              stackIn_30_3 = 0L;
              if (!rm.field_p) {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = SteelSentinels.field_J;
              } else {
                stackIn_31_1 = null;
                stackIn_31_2 = null;
                stackIn_31_4 = bb.field_W;
              }
              stackIn_30_0.field_Lc = new gh(stackIn_30_3, stackIn_31_4);
              var12.a(var12.field_Lc, 119);
              var12.field_Lc.field_Kb = 2;
              var12.field_Bc = new gh(0L, bb.field_W);
              var12.a(var12.field_Bc, 119);
              var12.field_Dc = new gh(0L, qb.field_K);
              var12.a(var12.field_Dc, 121);
              var12.field_lc = new gh(0L, qb.field_K);
              var12.a(var12.field_lc, 124);
              var12.field_xc = new gh(0L, bd.field_f);
              var12.a(var12.field_xc, 121);
              var12.h(param1 ^ -104);
              var12.field_gc = new gh(0L, fa.field_f);
              var13 = 1;
              var12.a(var12.field_gc, 120);
            }
            var12.field_kc.field_S = null;
            stackIn_35_0 = (var12.field_rc) ? param4 : param0;
            var14Lifetime1 = stackIn_35_0;
            var46 = var12.field_kc;
            var12.field_kc.field_Lb = 0;
            var46.field_zb = 0;
            var12.field_gc.field_S = null;
            var47 = var12.field_gc;
            var12.field_gc.field_Lb = 0;
            var12.field_Cc.field_S = null;
            var47.field_zb = 0;
            var48 = var12.field_Cc;
            var12.field_Cc.field_Lb = 0;
            var48.field_zb = 0;
            var12.field_qc.field_S = null;
            var18 = var12.field_qc;
            var12.field_qc.field_Lb = 0;
            var18.field_zb = 0;
            var12.field_zc.field_S = null;
            var12.field_zc.field_Lb = 0;
            var19 = var12.field_zc;
            var19.field_zb = 0;
            var12.field_Ic.field_S = null;
            var20 = var12.field_Ic;
            var12.field_Ic.field_Lb = 0;
            var20.field_zb = 0;
            var12.field_uc.field_S = null;
            var12.field_uc.field_Lb = 0;
            var21 = var12.field_uc;
            var21.field_zb = 0;
            for (var22_int = 0; be.field_a > var22_int; var22_int++) {
              var12.field_Gc[var22_int].field_Pb = null;
              var23 = var12.field_Gc[var22_int];
              var12.field_Gc[var22_int].field_Lb = 0;
              var23.field_zb = 0;
            }
            var12.field_Fc.field_Pb = null;
            var22 = var12.field_Fc;
            var12.field_Fc.field_Lb = 0;
            var12.field_tc.field_Pb = null;
            var22.field_zb = 0;
            var12.field_tc.field_Lb = 0;
            var49 = var12.field_tc;
            var12.field_Wb.field_Pb = null;
            var49.field_zb = 0;
            var24 = var12.field_Wb;
            var12.field_Wb.field_Lb = 0;
            var24.field_zb = 0;
            var12.field_ac.field_Pb = null;
            var12.field_ac.field_Lb = 0;
            var25 = var12.field_ac;
            var12.field_Lc.field_S = null;
            var25.field_zb = 0;
            var12.field_Lc.field_Lb = 0;
            var26 = var12.field_Lc;
            var26.field_zb = 0;
            var12.field_Bc.field_S = null;
            var27 = var12.field_Bc;
            var12.field_Bc.field_Lb = 0;
            var12.field_Dc.field_S = null;
            var27.field_zb = 0;
            var28 = var12.field_Dc;
            var12.field_Dc.field_Lb = 0;
            var12.field_lc.field_S = null;
            var28.field_zb = 0;
            var29 = var12.field_lc;
            var12.field_lc.field_Lb = 0;
            var29.field_zb = 0;
            var12.field_xc.field_S = null;
            var30 = var12.field_xc;
            var12.field_xc.field_Lb = 0;
            var30.field_zb = 0;
            var12.field_zb = rn.field_y.field_Ub.field_zb;
            var31 = 0;
            var32 = var12.field_Xb;
            if (!var12.k(4219)) {
              boolean decompiledFrameRemainder1 = true;
              if (!var12.field_rc) {
                if (!var12.field_cc &&
                  !var12.field_vc) {
                  if (var12.field_nc) {
                    var12.field_kc.field_S = ua.field_L;
                  } else {
                    var12.field_kc.field_S = mj.field_ac;
                  }
                  decompiledFrameRemainder1 = false;
                }
                else {
                  var12.field_gc.field_S = rn.field_A;
                }
              } else {
                if (var12.field_Mc < 0) {
                  if (var12.field_dc && (var12.field_cc ||
                    var12.field_vc)) {
                    var12.field_gc.field_S = rn.field_A;
                    decompiledFrameRemainder1 = false;
                  }
                  else {
                    if (var12.field_sc == 2) {
                      var12.field_gc.field_S = cl.field_e;
                    } else {
                      var12.field_kc.field_S = nn.field_e;
                    }
                  }
                } else {
                  var12.field_kc.field_S = bd.field_e;
                }
              }
              if (var12.field_gc.field_S == null) {
                var12.field_kc.a(0, var31, db.field_b, 0, 68);
              } else {
                var12.field_gc.a(0, var31, db.field_b, 0, 68);
              }
              var12.field_Cc.field_S = mi.a(var12.field_Cc.field_L, var32, 78);
              var12.field_Cc.a(param1 ^ 1, var31, db.field_b, 70, 78);
              if (var12.field_Cc.field_kb &&
                !var12.field_Cc.field_S.equals(var32)) {
                ll.field_i = var32;
              }
              var12.field_qc.field_S = Integer.toString(var12.field_wc);
              if (!var12.field_dc) {
                var12.field_qc.field_Kb = 1;
                var12.field_qc.a(0, var31, db.field_b, 150, 48);
              } else {
                var12.field_qc.field_Kb = 2;
                var12.field_zc.field_S = "/" + var12.field_Ub;
                var33_int = (-var12.field_zc.field_L.c("/") + 348) / 2;
                var12.field_qc.a(param1 ^ 1, var31, db.field_b, 150, var33_int - 150);
                var12.field_zc.a(0, var31, db.field_b, var33_int, -var33_int + 198);
              }
              var12.field_Ic.field_S = Integer.toString(var12.field_yc);
              var12.field_Ic.a(0, var31, db.field_b, 200, 48);
              stackIn_70_0 = (rm.field_p) ? 250 : 200;
              var33_intLifetime1 = stackIn_70_0;
              var12.field_uc.a(0, var31, db.field_b, var33_intLifetime1, 365 + (-var33_intLifetime1 - 2));
              var34_int = va.field_e;
              if ((1 << ol.field_dc & var14Lifetime1) != 0) {
                var50_ref = hg.field_i[var12.field_Nc];
                var12.field_Fc.field_Pb = var50_ref;
                var12.field_Fc.a(0, 0, var12.field_uc.field_Lb, var34_int, var50_ref.field_z);
                var34_int = var34_int + (va.field_e + var50_ref.field_z);
              }
              if ((1 << sn.field_b & var14Lifetime1) != 0) {
                if (!var12.field_cc) {
                  stackIn_80_0 = (var12.field_vc) ? 1 : 0;
                } else {
                  stackIn_80_0 = 1;
                }
                var36 = stackIn_80_0;
                stackIn_82_0 = jn.field_d;
                if (var36 != 0) {
                  stackIn_83_1 = 1;
                } else {
                  stackIn_83_1 = 0;
                }
                var51_ref = stackIn_82_0[stackIn_83_1];
                var12.field_Wb.field_Pb = var51_ref;
                var12.field_Wb.a(0, 0, var12.field_uc.field_Lb, var34_int, var51_ref.field_z);
                var34_int = var34_int + (va.field_e + var51_ref.field_z);
              }
              if ((1 << jf.field_Z & var14Lifetime1) != 0) {
                var52_ref = bm.field_Z[-1 + var12.field_sc];
                var12.field_ac.field_Pb = var52_ref;
                var12.field_ac.a(0, 0, var12.field_uc.field_Lb, var34_int, var52_ref.field_z);
                var34_int = var34_int + (va.field_e + var52_ref.field_z);
              }
              if ((1 << ja.field_f & var14Lifetime1) != 0) {
                stackIn_90_0 = ha.field_Q;
                if (var12.field_ec) {
                  stackIn_91_1 = 1;
                } else {
                  stackIn_91_1 = 0;
                }
                var53_ref = stackIn_90_0[stackIn_91_1];
                var12.field_tc.field_Pb = var53_ref;
                var12.field_tc.a(0, 0, var12.field_uc.field_Lb, var34_int, var53_ref.field_z);
                var34_int = var34_int + (var53_ref.field_z + va.field_e);
              }
              if (li.field_D != null) {
                for (var36Lifetime1 = 0; var36Lifetime1 < be.field_a; var36Lifetime1++) {
                  if (null != li.field_D[var36Lifetime1] &&
                    (1 << var36Lifetime1 + ch.field_L & var14Lifetime1) != 0) {
                    var42 = li.field_D[var36Lifetime1][var12.field_Sb[var36Lifetime1] & 255];
                    var54 = var42;
                    var12.field_Gc[var36Lifetime1].field_Pb = var42;
                    var12.field_Gc[var36Lifetime1].a(param1 ^ 1, 0, var12.field_uc.field_Lb, var34_int, var54.field_z);
                    var34_int = var34_int + (var54.field_z + va.field_e);
                  }
                }
              }
              var36Lifetime2 = (-var34_int + var12.field_uc.field_zb) / 2;
              if (var36Lifetime2 > 0) {
                var12.field_Fc.field_Y = var12.field_Fc.field_Y + var36Lifetime2;
                var12.field_Wb.field_Y = var12.field_Wb.field_Y + var36Lifetime2;
                var12.field_ac.field_Y = var12.field_ac.field_Y + var36Lifetime2;
                var12.field_tc.field_Y = var12.field_tc.field_Y + var36Lifetime2;
                for (var37_int = 0; be.field_a > var37_int; var37_int++) {
                  dupTemp$0 = var12.field_Gc[var37_int];
                  dupTemp$0.field_Y = dupTemp$0.field_Y + var36Lifetime2;
                }
              }
              if (var12.field_rc) {
                var37_intLifetime1 = var12.field_Mc;
                if (var37_intLifetime1 < 0) {
                  var37_intLifetime1 = (int)(-var12.field_Hc + var9);
                }
                var38_int = var37_intLifetime1 / 1000;
                var39 = var38_int / 60;
                var38_int = var38_int % 60;
                if (var39 < 60) {
                  var12.field_Lc.field_S = var39 + ":" + var38_int / 10 + var38_int % 10;
                } else {
                  var40 = var39 / 60;
                  var39 = var39 % 60;
                  var12.field_Lc.field_S = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                }
              }
              var12.field_Lc.a(param1 ^ 1, var31, db.field_b, 365, -365 + var12.field_zb);
              var31 = var31 + db.field_b;
              if (null != var12.field_hc) {
                var31 += 2;
                var37 = new StringBuilder(64);
                discarded$1 = var37.append(ph.field_a);
                discarded$2 = var37.append(var12.field_hc[0]);
                for (var38_intLifetime1 = 1; var38_intLifetime1 < var12.field_wc; var38_intLifetime1++) {
                  discarded$3 = var37.append(", ");
                  discarded$4 = var37.append(var12.field_hc[var38_intLifetime1]);
                }
                var38 = var37.toString();
                var12.field_Bc.field_S = var38;
                var39Lifetime1 = var12.field_Bc.field_L.b(var38, -(2 * var12.field_Bc.field_ub) + var12.field_zb);
                var12.field_Bc.a(param1 ^ 1, var31, db.field_b * var39Lifetime1, 0, var12.field_zb);
                var31 = var31 + db.field_b * var39Lifetime1;
              }
              if (var12.field_vc) {
                var12.field_Dc.field_S = db.a(de.field_a, -121, new String[]{var32});
                var12.field_Dc.a(0, var31, db.field_b, da.field_g, var12.field_zb - da.field_g * 2);
                var31 = var31 + db.field_b;
              }
              if (var12.field_bc) {
                var12.field_lc.field_S = db.a(ej.field_x, -33, new String[]{var32});
                var12.field_lc.a(param1 ^ 1, var31, db.field_b, da.field_g, -(da.field_g * 2) + var12.field_zb);
                var31 = var31 + db.field_b;
              }
            }
            var33 = dh.a(var32, (byte) 112, var12.field_Ac);
            if (var33 != null) {
              var34_intLifetime1 = var12.field_xc.field_L.b(var33, -da.field_g - da.field_g + var12.field_zb);
              var12.field_xc.field_S = var33;
              var12.field_xc.field_V = var12.field_mc * 256 / ta.field_l;
              var12.field_xc.a(0, var31, db.field_b * var34_intLifetime1, da.field_g, -(2 * da.field_g) + var12.field_zb);
              var31 = var31 + var34_intLifetime1 * db.field_b;
            }
            if (var7_int == 0) {
              var12.field_lb = var31 - var12.field_Lb;
            }
            if (var13 != 0) {
              rn.field_y.field_Ub.a(2, (byte) 111, (gh) (var11), var12);
            }
            for (var34_intLifetime2 = 0; var34_intLifetime2 < be.field_a; var34_intLifetime2++) {
              if (var12.field_Gc[var34_intLifetime2].field_kb) {
                if (fj.field_b == null) {
                  var35 = null;
                } else {
                  if (null != fj.field_b[var34_intLifetime2]) {
                    var35 = fj.field_b[var34_intLifetime2][255 & var12.field_Sb[var34_intLifetime2]];
                  } else {
                    var35 = null;
                  }
                }
                if (var35 == null) {
                  ll.field_i = al.field_a[var34_intLifetime2];
                } else {
                  ll.field_i = al.field_a[var34_intLifetime2] + " - " + (String) (var35);
                }
              }
            }
            if (var12.field_Fc.field_kb) {
              if (1 == var12.field_Nc) {
                var34 = na.field_r;
              } else {
                var34 = m.field_j[var12.field_Nc];
              }
              ll.field_i = bc.field_xb + " - " + var34;
            }
            if (var12.field_tc.field_kb) {
              if (var12.field_ec) {
                stackIn_155_0 = he.field_g;
              } else {
                stackIn_155_0 = i.field_b;
              }
              ll.field_i = stackIn_155_0;
            }
            if (var12.field_Wb.field_kb) {
              if (!var12.field_cc &&
                !var12.field_vc) {
                if (var12.field_dc) {
                  stackIn_164_0 = fb.field_p;
                } else {
                  stackIn_164_0 = jh.field_e;
                }
              } else {
                stackIn_164_0 = ij.field_V;
              }
              ll.field_i = stackIn_164_0;
            }
            if (var12.field_ac.field_kb) {
              if (2 == var12.field_sc) {
                stackIn_170_0 = jf.field_db;
              } else {
                stackIn_170_0 = hk.field_Yb;
              }
              ll.field_i = stackIn_170_0;
            }
            boolean decompiledFrameRemainder0 = true;
            if (var12.field_Eb != 0) {
              if (var12.k(4219)) {
                var12 = (hk) (var8.a((byte) -123));
                continue;
              }
              if (0 != var12.field_gc.field_Eb) {
                if (var12.field_rc && (!var12.field_dc ||
                  !var12.field_cc &&
                  !var12.field_vc)) {
                  ei.a(var12.j(param1 - 34), (byte) -23, param6);
                  decompiledFrameRemainder0 = false;
                }
                else {
                  jg.a(var12.j(param1 - 41), (byte) -74, param6);
                }
              } else {
                qa.a(var32, param5, var12, 88);
              }
            }
            var12 = (hk) (var8.a((byte) -123));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var7), "ca.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    ca(byte[] param0) {
        int var11_int = 0;
        int incrementValue$0 = 0;
        bj dupTemp$8 = null;
        int incrementValue$6 = 0;
        int var25_int = 0;
        int incrementValue$3 = 0;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_208_0 = null;
        StringBuilder stackIn_208_1 = null;
        String stackIn_209_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        bj[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        bj var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        gi var38 = null;
        byte[] var39 = null;
        bj var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        bj var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        bj var48 = null;
        bj var49 = null;
        bj var50 = null;
        bj var51 = null;
        bj var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        int var5Lifetime1;
        int var8Lifetime1;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var19Lifetime4;
        int var19Lifetime5;
        int var19Lifetime6;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        int var20Lifetime5;
        int var20Lifetime6;
        int var21Lifetime1;
        int var21Lifetime2;
        int var21Lifetime3;
        int var21Lifetime4;
        int var23Lifetime1;
        int var24Lifetime1;
        int var26Lifetime1;
        int var27Lifetime1;
        int var27Lifetime2;
        int var27Lifetime3;
        int var27Lifetime4;
        int var27Lifetime5;
        int var27Lifetime6;
        int var27Lifetime7;
        int var27Lifetime8;
        int var27Lifetime9;
        int var27Lifetime10;
        int var27Lifetime11;
        int var28Lifetime1;
        int var29Lifetime1;
        int var29Lifetime2;
        int var29Lifetime3;
        int var29Lifetime4;
        int var30Lifetime1;
        int var31Lifetime1;
        int var32Lifetime1;
        int var33Lifetime1;
        int var34Lifetime1;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        int var16_intLifetime1;
        int var29Lifetime5;
        int var30Lifetime2;
        int var27Lifetime6Lifetime1;
        int var29Lifetime3Lifetime1;
        int var29Lifetime4Lifetime1;
        int var30Lifetime1Lifetime1;
        int var30Lifetime1Lifetime2;
        int var31Lifetime1Lifetime1;
        try {
          this.field_p = new short[128];
          this.field_q = new byte[128];
          this.field_u = new bj[128];
          this.field_v = new byte[128];
          this.field_o = new byte[128];
          this.field_s = new int[128];
          this.field_x = new sk[128];
          var38 = new gi(param0);
          for (var3 = 0; var38.field_t[var38.field_p + var3] != 0; var3++) {
          }
          var55 = new byte[var3];
          var42 = var55;
          var4 = var42;
          for (var5 = 0; var3 > var5; var5++) {
            var4[var5] = var38.d((byte) -2);
          }
          var38.field_p = var38.field_p + 1;
          var3++;
          var5Lifetime1 = var38.field_p;
          var38.field_p = var38.field_p + var3;
          for (var6 = 0; 0 != var38.field_t[var6 + var38.field_p]; var6++) {
          }
          var56 = new byte[var6];
          var43 = var56;
          var7 = var43;
          for (var8 = 0; var6 > var8; var8++) {
            var7[var8] = var38.d((byte) -2);
          }
          var38.field_p = var38.field_p + 1;
          var6++;
          var8Lifetime1 = var38.field_p;
          var38.field_p = var38.field_p + var6;
          for (var9 = 0; var38.field_t[var38.field_p + var9] != 0; var9++) {
          }
          var57 = new byte[var9];
          var44 = var57;
          var10 = var44;
          for (var11_int = 0; var9 > var11_int; var11_int++) {
            var10[var11_int] = var38.d((byte) -2);
          }
          var38.field_p = var38.field_p + 1;
          var9++;
          var53 = new byte[var9];
          var39 = var53;
          var11 = var39;
          if (var9 > 1) {
            var53[1] = (byte) 1;
            var12 = 2;
            var13_int = 1;
            for (var14 = 2; var9 > var14; var14++) {
              var15_int = var38.f((byte) -106);
              if (var15_int != 0) {
                if (var15_int <= var13_int) {
                  var15_int--;
                }
                var13_int = var15_int;
              } else {
                incrementValue$0 = var12;
                var12++;
                var13_int = incrementValue$0;
              }
              var11[var14] = (byte)var13_int;
            }
          } else {
            var12 = var9;
          }
          var13 = new bj[var12];
          for (var14Lifetime1 = 0; var14Lifetime1 < var13.length; var14Lifetime1++) {
            dupTemp$8 = new bj();
            var13[var14Lifetime1] = dupTemp$8;
            var40 = dupTemp$8;
            var15_ref = var40;
            var16_int = var38.f((byte) -120);
            if (var16_int > 0) {
              var15_ref.field_m = new byte[var16_int * 2];
            }
            var16_intLifetime1 = var38.f((byte) -55);
            if (0 < var16_intLifetime1) {
              var15_ref.field_p = new byte[2 + var16_intLifetime1 * 2];
              var40.field_p[1] = (byte)64;
            }
          }
          var14Lifetime2 = var38.f((byte) -63);
          if (var14Lifetime2 > 0) {
            stackIn_39_0 = new byte[var14Lifetime2 * 2];
          } else {
            stackIn_39_0 = null;
          }
          var58 = stackIn_39_0;
          var46 = var58;
          var15 = var46;
          var14Lifetime3 = var38.f((byte) -60);
          if (0 >= var14Lifetime3) {
            stackIn_42_0 = null;
          } else {
            stackIn_42_0 = new byte[2 * var14Lifetime3];
          }
          var47 = stackIn_42_0;
          var16 = var47;
          for (var17 = 0; var38.field_t[var38.field_p + var17] != 0; var17++) {
          }
          var54 = new byte[var17];
          var41 = var54;
          var18 = var41;
          for (var19 = 0; var17 > var19; var19++) {
            var18[var19] = var38.d((byte) -2);
          }
          var38.field_p = var38.field_p + 1;
          var17++;
          var19Lifetime1 = 0;
          for (var20 = 0; var20 < 128; var20++) {
            var19Lifetime1 = var19Lifetime1 + var38.f((byte) -88);
            this.field_p[var20] = (short)var19Lifetime1;
          }
          var19Lifetime2 = 0;
          for (var20Lifetime1 = 0; var20Lifetime1 < 128; var20Lifetime1++) {
            var19Lifetime2 = var19Lifetime2 + var38.f((byte) -111);
            this.field_p[var20Lifetime1] = (short)(this.field_p[var20Lifetime1] + (var19Lifetime2 << 8));
          }
          var20Lifetime2 = 0;
          var21 = 0;
          var22 = 0;
          for (var23 = 0; var23 < 128; var23++) {
            if (0 == var20Lifetime2) {
              if (var21 < var54.length) {
                var20Lifetime2 = var18[var21++];
              } else {
                var20Lifetime2 = -1;
              }
              var22 = var38.e(82);
            }
            this.field_p[var23] = (short)(this.field_p[var23] + ec.a(32768, -1 + var22 << 14));
            this.field_s[var23] = var22;
            var20Lifetime2--;
          }
          var20Lifetime3 = 0;
          var21Lifetime1 = 0;
          var23Lifetime1 = 0;
          for (var24 = 0; var24 < 128; var24++) {
            if (this.field_s[var24] != 0) {
              if (var20Lifetime3 == 0) {
                if (var21Lifetime1 >= var55.length) {
                  var20Lifetime3 = -1;
                } else {
                  var20Lifetime3 = var4[var21Lifetime1++];
                }
                incrementValue$6 = var5Lifetime1;
                var5Lifetime1++;
                var23Lifetime1 = var38.field_t[incrementValue$6] - 1;
              }
              var20Lifetime3--;
              this.field_v[var24] = (byte)var23Lifetime1;
            }
          }
          var21Lifetime2 = 0;
          var20Lifetime4 = 0;
          var24Lifetime1 = 0;
          for (var25_int = 0; 128 > var25_int; var25_int++) {
            if (this.field_s[var25_int] != 0) {
              if (var20Lifetime4 == 0) {
                incrementValue$3 = var8Lifetime1;
                var8Lifetime1++;
                var24Lifetime1 = 16 + var38.field_t[incrementValue$3] << 2;
                if (var21Lifetime2 >= var56.length) {
                  var20Lifetime4 = -1;
                } else {
                  var20Lifetime4 = var7[var21Lifetime2++];
                }
              }
              var20Lifetime4--;
              this.field_o[var25_int] = (byte)var24Lifetime1;
            }
          }
          var20Lifetime5 = 0;
          var21Lifetime3 = 0;
          var25 = null;
          for (var26 = 0; var26 < 128; var26++) {
            if (0 != this.field_s[var26]) {
              if (var20Lifetime5 == 0) {
                var25 = var13[var53[var21Lifetime3]];
                if (var21Lifetime3 < var57.length) {
                  var20Lifetime5 = var10[var21Lifetime3++];
                } else {
                  var20Lifetime5 = -1;
                }
              }
              var20Lifetime5--;
              this.field_u[var26] = (bj) (var25);
            }
          }
          var21Lifetime4 = 0;
          var20Lifetime6 = 0;
          var26Lifetime1 = 0;
          for (var27 = 0; var27 < 128; var27++) {
            if (var20Lifetime6 == 0) {
              if (var21Lifetime4 >= var54.length) {
                var20Lifetime6 = -1;
              } else {
                var20Lifetime6 = var18[var21Lifetime4++];
              }
              if (this.field_s[var27] > 0) {
                var26Lifetime1 = var38.f((byte) -74) + 1;
              }
            }
            this.field_q[var27] = (byte)var26Lifetime1;
            var20Lifetime6--;
          }
          this.field_t = var38.f((byte) -69) + 1;
          for (var27Lifetime1 = 0; var27Lifetime1 < var12; var27Lifetime1++) {
            var45 = var13[var27Lifetime1];
            if (null != var45.field_m) {
              for (var29 = 1; var29 < var45.field_m.length; var29 += 2) {
                var45.field_m[var29] = var38.d((byte) -2);
              }
            }
            if (null != var45.field_p) {
              for (var29Lifetime5 = 3; var29Lifetime5 < -2 + var45.field_p.length; var29Lifetime5 += 2) {
                var45.field_p[var29Lifetime5] = var38.d((byte) -2);
              }
            }
          }
          if (null != var15) {
            for (var27Lifetime2 = 1; var27Lifetime2 < var58.length; var27Lifetime2 += 2) {
              var15[var27Lifetime2] = var38.d((byte) -2);
            }
          }
          if (var16 != null) {
            for (var27Lifetime3 = 1; var47.length > var27Lifetime3; var27Lifetime3 += 2) {
              var16[var27Lifetime3] = var38.d((byte) -2);
            }
          }
          for (var27Lifetime4 = 0; var12 > var27Lifetime4; var27Lifetime4++) {
            var48 = var13[var27Lifetime4];
            if (null != var48.field_p) {
              var19Lifetime3 = 0;
              for (var29Lifetime1 = 2; var29Lifetime1 < var48.field_p.length; var29Lifetime1 += 2) {
                var19Lifetime3 = 1 + (var19Lifetime3 + var38.f((byte) -90));
                var48.field_p[var29Lifetime1] = (byte)var19Lifetime3;
              }
            }
          }
          for (var27Lifetime5 = 0; var12 > var27Lifetime5; var27Lifetime5++) {
            var49 = var13[var27Lifetime5];
            if (null != var49.field_m) {
              var19Lifetime4 = 0;
              for (var29Lifetime2 = 2; var29Lifetime2 < var49.field_m.length; var29Lifetime2 += 2) {
                var19Lifetime4 = var19Lifetime4 - (-1 - var38.f((byte) -61));
                var49.field_m[var29Lifetime2] = (byte)var19Lifetime4;
              }
            }
          }
          if (null != var15) {
            var19Lifetime5 = var38.f((byte) -90);
            var15[0] = (byte)var19Lifetime5;
            for (var27Lifetime6 = 2; var58.length > var27Lifetime6; var27Lifetime6 += 2) {
              var19Lifetime5 = var38.f((byte) -55) + (1 + var19Lifetime5);
              var15[var27Lifetime6] = (byte)var19Lifetime5;
            }
            var27Lifetime6Lifetime1 = var58[0];
            var28 = var58[1];
            for (var29Lifetime3 = 0; var29Lifetime3 < var27Lifetime6Lifetime1; var29Lifetime3++) {
              this.field_q[var29Lifetime3] = (byte)(32 + this.field_q[var29Lifetime3] * var28 >> 6);
            }
            var29Lifetime3Lifetime1 = 2;
            while (var29Lifetime3Lifetime1 < var58.length) {
              var30 = var58[var29Lifetime3Lifetime1];
              var31 = var15[1 + var29Lifetime3Lifetime1];
              var32 = (-var27Lifetime6Lifetime1 + var30) / 2 + (-var27Lifetime6Lifetime1 + var30) * var28;
              for (var33 = var27Lifetime6Lifetime1; var30 > var33; var33++) {
                var34 = ad.a(110, var32, -var27Lifetime6Lifetime1 + var30);
                this.field_q[var33] = (byte)(32 + var34 * this.field_q[var33] >> 6);
                var32 = var32 + (var31 - var28);
              }
              var27Lifetime6Lifetime1 = var30;
              var29Lifetime3Lifetime1 += 2;
              var28 = var31;
            }
            for (var30Lifetime2 = var27Lifetime6Lifetime1; var30Lifetime2 < 128; var30Lifetime2++) {
              this.field_q[var30Lifetime2] = (byte)(32 + var28 * this.field_q[var30Lifetime2] >> 6);
            }
            var15 = null;
          }
          if (var16 == null) {
            for (var27Lifetime7 = 0; var27Lifetime7 < var12; var27Lifetime7++) {
              var13[var27Lifetime7].field_i = var38.f((byte) -126);
            }
          } else {
            var19Lifetime6 = var38.f((byte) -114);
            var16[0] = (byte)var19Lifetime6;
            for (var27Lifetime7 = 2; var47.length > var27Lifetime7; var27Lifetime7 += 2) {
              var19Lifetime6 = var38.f((byte) -127) + (1 + var19Lifetime6);
              var16[var27Lifetime7] = (byte)var19Lifetime6;
            }
            var27Lifetime7 = var47[0];
            var28Lifetime1 = var47[1] << 1;
            for (var29Lifetime4 = 0; var29Lifetime4 < var27Lifetime7; var29Lifetime4++) {
              var30Lifetime1 = var28Lifetime1 + (255 & this.field_o[var29Lifetime4]);
              if (var30Lifetime1 < 0) {
                var30Lifetime1 = 0;
              }
              if (var30Lifetime1 > 128) {
                var30Lifetime1 = 128;
              }
              this.field_o[var29Lifetime4] = (byte)var30Lifetime1;
            }
            var29Lifetime4Lifetime1 = 2;
            while (var47.length > var29Lifetime4Lifetime1) {
              var30Lifetime1Lifetime1 = var47[var29Lifetime4Lifetime1];
              var31Lifetime1 = var16[1 + var29Lifetime4Lifetime1] << 1;
              var32Lifetime1 = (var30Lifetime1Lifetime1 - var27Lifetime7) / 2 + (var30Lifetime1Lifetime1 - var27Lifetime7) * var28Lifetime1;
              var37 = var27Lifetime7;
              var33Lifetime1 = var37;
              while (var37 < var30Lifetime1Lifetime1) {
                var34Lifetime1 = ad.a(121, var32Lifetime1, var30Lifetime1Lifetime1 - var27Lifetime7);
                var35 = (255 & this.field_o[var37]) + var34Lifetime1;
                if (var35 < 0) {
                  var35 = 0;
                }
                if (var35 > 128) {
                  var35 = 128;
                }
                this.field_o[var37] = (byte)var35;
                var32Lifetime1 = var32Lifetime1 + (-var28Lifetime1 + var31Lifetime1);
                var37++;
              }
              var29Lifetime4Lifetime1 += 2;
              var27Lifetime7 = var30Lifetime1Lifetime1;
              var28Lifetime1 = var31Lifetime1;
            }
            var16 = null;
            for (var30Lifetime1Lifetime2 = var27Lifetime7; 128 > var30Lifetime1Lifetime2; var30Lifetime1Lifetime2++) {
              var31Lifetime1Lifetime1 = (255 & this.field_o[var30Lifetime1Lifetime2]) + var28Lifetime1;
              if (0 > var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 0;
              }
              if (128 < var31Lifetime1Lifetime1) {
                var31Lifetime1Lifetime1 = 128;
              }
              this.field_o[var30Lifetime1Lifetime2] = (byte)var31Lifetime1Lifetime1;
            }
            for (var27Lifetime7 = 0; var27Lifetime7 < var12; var27Lifetime7++) {
              var13[var27Lifetime7].field_i = var38.f((byte) -126);
            }
          }
          for (var27Lifetime8 = 0; var27Lifetime8 < var12; var27Lifetime8++) {
            var50 = var13[var27Lifetime8];
            if (null != var50.field_m) {
              var50.field_k = var38.f((byte) -96);
            }
            if (null != var50.field_p) {
              var50.field_g = var38.f((byte) -99);
            }
            if (var50.field_i > 0) {
              var50.field_e = var38.f((byte) -76);
            }
          }
          for (var27Lifetime9 = 0; var12 > var27Lifetime9; var27Lifetime9++) {
            var13[var27Lifetime9].field_q = var38.f((byte) -58);
          }
          for (var27Lifetime10 = 0; var12 > var27Lifetime10; var27Lifetime10++) {
            var51 = var13[var27Lifetime10];
            if (0 < var51.field_q) {
              var51.field_o = var38.f((byte) -81);
            }
          }
          for (var27Lifetime11 = 0; var27Lifetime11 < var12; var27Lifetime11++) {
            var52 = var13[var27Lifetime11];
            if (var52.field_o > 0) {
              var52.field_n = var38.f((byte) -61);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_208_0 = var2;
          stackIn_208_1 = new StringBuilder().append("ca.<init>(");
          if (param0 == null) {
            stackIn_209_2 = "null";
          } else {
            stackIn_209_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_208_0), ((StringBuilder) (Object) stackIn_208_1).append(stackIn_209_2).append(')').toString());
        }
    }

    static {
        field_w = "You have not yet unlocked this option for use.";
    }
}
