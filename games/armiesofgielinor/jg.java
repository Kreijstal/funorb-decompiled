/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.lang.String;

final class jg extends tc {
    int field_l;
    static wk field_m;
    static String field_n;
    static int field_k;

    public static void a(int param0) {
        field_n = null;
        int var1 = 0;
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5 = 0;
        int var6 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_13_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          if (param2 == 512) {
            break L0;
          } else {
            jg.a((byte) 13);
            break L0;
          }
        }
        L1: {
          var5 = kd.field_Z[param4][param3];
          if (var5 <= -1) {
            break L1;
          } else {
            var6 = ns.a(false, td.field_d[var5].length, li.field_n);
            if (td.field_d[var5][var6] == null) {
              break L1;
            } else {
              if (-1 == td.field_d[var5][var6].field_o.length) {
                break L1;
              } else {
                L2: {
                  param0 = 512 - (param0 - 800);
                  stackOut_5_0 = 512;
                  stackIn_9_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (param1 > 512) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = 512;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_6_0 = stackIn_6_0;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (511 <= param1) {
                      stackOut_8_0 = stackIn_8_0;
                      stackOut_8_1 = param1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L2;
                    } else {
                      stackOut_7_0 = stackIn_7_0;
                      stackOut_7_1 = -512;
                      stackIn_10_0 = stackOut_7_0;
                      stackIn_10_1 = stackOut_7_1;
                      break L2;
                    }
                  }
                }
                L3: {
                  param1 = stackIn_10_0 + stackIn_10_1 >> 2;
                  if (param0 > 512) {
                    stackOut_12_0 = 512;
                    stackIn_13_0 = stackOut_12_0;
                    break L3;
                  } else {
                    stackOut_11_0 = param0;
                    stackIn_13_0 = stackOut_11_0;
                    break L3;
                  }
                }
                param0 = (stackIn_13_0 >> 2) - -120;
                te discarded$1 = jv.a(td.field_d[var5][var6], param1, param0, (byte) 87);
                break L1;
              }
            }
          }
        }
    }

    final static void a(byte param0) {
        if (iu.field_h) {
            qn.d(qn.field_j, qn.field_a, qn.field_e - qn.field_j, qn.field_f - qn.field_a);
            as.field_E.b(false, 20);
        }
        if (param0 != 102) {
            jg.a(-122, true, false, -112, 41, -27, 39);
        }
    }

    jg(int param0) {
        ((jg) this).field_l = param0;
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var7_int = 0;
        at var8 = null;
        long var9 = 0L;
        Object var11 = null;
        au var12 = null;
        int var13 = 0;
        int var14 = 0;
        je var18 = null;
        int var18_int = 0;
        je var19 = null;
        je var20 = null;
        je var21 = null;
        int var22_int = 0;
        je var22 = null;
        je var23 = null;
        je var24 = null;
        je var25 = null;
        je var26 = null;
        je var27 = null;
        je var28 = null;
        je var29 = null;
        je var30 = null;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        int var33_int = 0;
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
        je var43 = null;
        je var44 = null;
        je var45 = null;
        je var46 = null;
        je var47 = null;
        je var48 = null;
        je var49 = null;
        Object var50 = null;
        wk var50_ref = null;
        Object var51 = null;
        wk var51_ref = null;
        Object var52 = null;
        wk var52_ref = null;
        Object var53 = null;
        wk var53_ref = null;
        dn stackIn_1_0 = null;
        boolean stackIn_1_1 = false;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        dn stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        dn stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        au stackIn_8_0 = null;
        je stackIn_8_1 = null;
        je stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        au stackIn_9_0 = null;
        je stackIn_9_1 = null;
        je stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        au stackIn_10_0 = null;
        je stackIn_10_1 = null;
        je stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        je stackIn_10_4 = null;
        au stackIn_29_0 = null;
        je stackIn_29_1 = null;
        je stackIn_29_2 = null;
        long stackIn_29_3 = 0L;
        au stackIn_30_0 = null;
        je stackIn_30_1 = null;
        je stackIn_30_2 = null;
        long stackIn_30_3 = 0L;
        au stackIn_31_0 = null;
        je stackIn_31_1 = null;
        je stackIn_31_2 = null;
        long stackIn_31_3 = 0L;
        je stackIn_31_4 = null;
        int stackIn_35_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_81_0 = 0;
        wk[] stackIn_82_0 = null;
        wk[] stackIn_83_0 = null;
        wk[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        wk[] stackIn_90_0 = null;
        wk[] stackIn_91_0 = null;
        wk[] stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        String stackIn_149_0 = null;
        String stackIn_159_0 = null;
        String stackIn_164_0 = null;
        dn stackOut_0_0 = null;
        boolean stackOut_0_1 = false;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        dn stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        dn stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        au stackOut_7_0 = null;
        je stackOut_7_1 = null;
        je stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        au stackOut_9_0 = null;
        je stackOut_9_1 = null;
        je stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        je stackOut_9_4 = null;
        au stackOut_8_0 = null;
        je stackOut_8_1 = null;
        je stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        je stackOut_8_4 = null;
        au stackOut_28_0 = null;
        je stackOut_28_1 = null;
        je stackOut_28_2 = null;
        long stackOut_28_3 = 0L;
        au stackOut_30_0 = null;
        je stackOut_30_1 = null;
        je stackOut_30_2 = null;
        long stackOut_30_3 = 0L;
        je stackOut_30_4 = null;
        au stackOut_29_0 = null;
        je stackOut_29_1 = null;
        je stackOut_29_2 = null;
        long stackOut_29_3 = 0L;
        je stackOut_29_4 = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_77_0 = 0;
        wk[] stackOut_81_0 = null;
        wk[] stackOut_83_0 = null;
        int stackOut_83_1 = 0;
        wk[] stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        wk[] stackOut_89_0 = null;
        wk[] stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        wk[] stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        String stackOut_148_0 = null;
        String stackOut_147_0 = null;
        String stackOut_158_0 = null;
        String stackOut_157_0 = null;
        String stackOut_155_0 = null;
        String stackOut_163_0 = null;
        String stackOut_162_0 = null;
        L0: {
          var50 = null;
          var51 = null;
          var52 = null;
          var53 = null;
          var41 = ArmiesOfGielinor.field_M ? 1 : 0;
          stackOut_0_0 = bv.field_x;
          stackOut_0_1 = param1;
          stackOut_0_2 = param3 * (8 + 4 * jn.field_d);
          stackOut_0_3 = jn.field_d * 2 - -4;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (bv.field_x != pq.field_b) {
            stackOut_2_0 = (dn) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = (dn) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        var7_int = ((dn) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, param0, 2) ? 1 : 0;
        var8 = bv.field_x.field_Jb.field_fb;
        var9 = vi.b(-118);
        var11 = null;
        var12 = (au) (Object) var8.e((byte) 120);
        L1: while (true) {
          if (var12 == null) {
            return;
          } else {
            L2: {
              var13 = 0;
              if (null == var12.field_fb) {
                L3: {
                  var12.field_Xb = new je(0L, ws.field_P);
                  var14 = param4 | param5;
                  var12.a(var12.field_Xb, param0 + 107);
                  var12.field_Xb.field_Eb = 1;
                  var12.field_lc = new je(0L, ga.field_i);
                  var12.a(var12.field_lc, 102);
                  var12.field_cc = new je(0L, ws.field_P);
                  var12.a(var12.field_cc, 59);
                  var12.field_cc.field_O = 0;
                  var12.field_hc = new je(0L, ws.field_P);
                  var12.a(var12.field_hc, 61);
                  var12.field_hc.field_O = 0;
                  var12.field_Zb = new je(0L, ga.field_i);
                  var12.a(var12.field_Zb, 78);
                  var12.field_Zb.field_Eb = 2;
                  stackOut_7_0 = (au) var12;
                  stackOut_7_1 = null;
                  stackOut_7_2 = null;
                  stackOut_7_3 = 0L;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  stackIn_9_3 = stackOut_7_3;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  stackIn_8_2 = stackOut_7_2;
                  stackIn_8_3 = stackOut_7_3;
                  if (!fh.field_c) {
                    stackOut_9_0 = (au) (Object) stackIn_9_0;
                    stackOut_9_1 = null;
                    stackOut_9_2 = null;
                    stackOut_9_3 = stackIn_9_3;
                    stackOut_9_4 = ga.field_i;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    stackIn_10_2 = stackOut_9_2;
                    stackIn_10_3 = stackOut_9_3;
                    stackIn_10_4 = stackOut_9_4;
                    break L3;
                  } else {
                    stackOut_8_0 = (au) (Object) stackIn_8_0;
                    stackOut_8_1 = null;
                    stackOut_8_2 = null;
                    stackOut_8_3 = stackIn_8_3;
                    stackOut_8_4 = ws.field_P;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackIn_10_2 = stackOut_8_2;
                    stackIn_10_3 = stackOut_8_3;
                    stackIn_10_4 = stackOut_8_4;
                    break L3;
                  }
                }
                L4: {
                  stackIn_10_0.field_oc = new je(stackIn_10_3, stackIn_10_4);
                  var12.a(var12.field_oc, param0 ^ 63);
                  var12.field_Qb = new je[tq.field_b];
                  var12.field_ic = new je(0L, (je) null);
                  if (0 != (var14 & 1 << ev.field_c)) {
                    var12.field_oc.a(var12.field_ic, param0 + 62);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var12.field_ec = new je(0L, (je) null);
                  if ((1 << ai.field_M & var14) != 0) {
                    var12.field_oc.a(var12.field_ec, param0 + 59);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var12.field_fc = new je(0L, (je) null);
                  if ((var14 & 1 << gg.field_I) != 0) {
                    var12.field_oc.a(var12.field_fc, param0 + 121);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var12.field_Vb = new je(0L, (je) null);
                  if ((var14 & 1 << uj.field_j) != 0) {
                    var12.field_oc.a(var12.field_Vb, 86);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var45 = var12.field_ic;
                var44 = var12.field_Vb;
                var43 = var12.field_ec;
                var12.field_fc.field_Fb = 1;
                var43.field_Fb = 1;
                var44.field_Fb = 1;
                var45.field_Fb = 1;
                var18_int = 0;
                L8: while (true) {
                  if (tq.field_b <= var18_int) {
                    L9: {
                      stackOut_28_0 = (au) var12;
                      stackOut_28_1 = null;
                      stackOut_28_2 = null;
                      stackOut_28_3 = 0L;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackIn_30_2 = stackOut_28_2;
                      stackIn_30_3 = stackOut_28_3;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      stackIn_29_2 = stackOut_28_2;
                      stackIn_29_3 = stackOut_28_3;
                      if (fh.field_c) {
                        stackOut_30_0 = (au) (Object) stackIn_30_0;
                        stackOut_30_1 = null;
                        stackOut_30_2 = null;
                        stackOut_30_3 = stackIn_30_3;
                        stackOut_30_4 = ga.field_i;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        stackIn_31_3 = stackOut_30_3;
                        stackIn_31_4 = stackOut_30_4;
                        break L9;
                      } else {
                        stackOut_29_0 = (au) (Object) stackIn_29_0;
                        stackOut_29_1 = null;
                        stackOut_29_2 = null;
                        stackOut_29_3 = stackIn_29_3;
                        stackOut_29_4 = ws.field_P;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        stackIn_31_3 = stackOut_29_3;
                        stackIn_31_4 = stackOut_29_4;
                        break L9;
                      }
                    }
                    stackIn_31_0.field_Rb = new je(stackIn_31_3, stackIn_31_4);
                    var12.a(var12.field_Rb, 39);
                    var12.field_Rb.field_Eb = 2;
                    var12.field_Pb = new je(0L, ga.field_i);
                    var12.a(var12.field_Pb, 85);
                    var12.field_Ib = new je(0L, ms.field_k);
                    var12.a(var12.field_Ib, 78);
                    var12.field_sc = new je(0L, ms.field_k);
                    var12.a(var12.field_sc, param0 ^ 47);
                    var12.field_Wb = new je(0L, eq.field_h);
                    var12.a(var12.field_Wb, 51);
                    var12.i(param0 ^ -10027);
                    var12.field_Yb = new je(0L, rf.field_d);
                    var12.a(var12.field_Yb, 89);
                    var13 = 1;
                    break L2;
                  } else {
                    L10: {
                      var12.field_Qb[var18_int] = new je(0L, (je) null);
                      if ((var14 & 1 << var18_int + na.field_E) != 0) {
                        var12.field_oc.a(var12.field_Qb[var18_int], 39);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    var12.field_Qb[var18_int].field_Fb = 1;
                    var18_int++;
                    continue L8;
                  }
                }
              } else {
                break L2;
              }
            }
            L11: {
              var12.field_Xb.field_X = null;
              if (var12.field_kc) {
                stackOut_34_0 = param5;
                stackIn_35_0 = stackOut_34_0;
                break L11;
              } else {
                stackOut_33_0 = param4;
                stackIn_35_0 = stackOut_33_0;
                break L11;
              }
            }
            var14 = stackIn_35_0;
            var46 = var12.field_Xb;
            var12.field_Xb.field_ob = 0;
            var12.field_Yb.field_X = null;
            var46.field_gb = 0;
            var12.field_Yb.field_ob = 0;
            var47 = var12.field_Yb;
            var12.field_lc.field_X = null;
            var47.field_gb = 0;
            var48 = var12.field_lc;
            var12.field_lc.field_ob = 0;
            var12.field_cc.field_X = null;
            var48.field_gb = 0;
            var12.field_cc.field_ob = 0;
            var18 = var12.field_cc;
            var12.field_hc.field_X = null;
            var18.field_gb = 0;
            var19 = var12.field_hc;
            var12.field_hc.field_ob = 0;
            var19.field_gb = 0;
            var12.field_Zb.field_X = null;
            var20 = var12.field_Zb;
            var12.field_Zb.field_ob = 0;
            var20.field_gb = 0;
            var12.field_oc.field_X = null;
            var12.field_oc.field_ob = 0;
            var21 = var12.field_oc;
            var21.field_gb = 0;
            var22_int = 0;
            L12: while (true) {
              if (var22_int >= tq.field_b) {
                L13: {
                  var12.field_ic.field_cb = null;
                  var12.field_ic.field_ob = 0;
                  var22 = var12.field_ic;
                  var22.field_gb = 0;
                  var12.field_Vb.field_cb = null;
                  var49 = var12.field_Vb;
                  var12.field_Vb.field_ob = 0;
                  var49.field_gb = 0;
                  var12.field_ec.field_cb = null;
                  var24 = var12.field_ec;
                  var12.field_ec.field_ob = 0;
                  var24.field_gb = 0;
                  var12.field_fc.field_cb = null;
                  var25 = var12.field_fc;
                  var12.field_fc.field_ob = 0;
                  var25.field_gb = 0;
                  var12.field_Rb.field_X = null;
                  var26 = var12.field_Rb;
                  var12.field_Rb.field_ob = 0;
                  var12.field_Pb.field_X = null;
                  var26.field_gb = 0;
                  var12.field_Pb.field_ob = 0;
                  var27 = var12.field_Pb;
                  var27.field_gb = 0;
                  var12.field_Ib.field_X = null;
                  var28 = var12.field_Ib;
                  var12.field_Ib.field_ob = 0;
                  var12.field_sc.field_X = null;
                  var28.field_gb = 0;
                  var29 = var12.field_sc;
                  var12.field_sc.field_ob = 0;
                  var12.field_Wb.field_X = null;
                  var29.field_gb = 0;
                  var30 = var12.field_Wb;
                  var12.field_Wb.field_ob = 0;
                  var30.field_gb = 0;
                  var12.field_gb = bv.field_x.field_Jb.field_gb;
                  var31 = 0;
                  var32 = var12.field_rc;
                  if (!var12.k(param0 ^ -7)) {
                    L14: {
                      if (var12.field_kc) {
                        if (var12.field_bc < 0) {
                          L15: {
                            if (!var12.field_tc) {
                              break L15;
                            } else {
                              L16: {
                                if (var12.field_Sb) {
                                  break L16;
                                } else {
                                  if (var12.field_Nb) {
                                    break L16;
                                  } else {
                                    break L15;
                                  }
                                }
                              }
                              var12.field_Yb.field_X = fl.field_l;
                              break L14;
                            }
                          }
                          if (var12.field_ac != 2) {
                            var12.field_Xb.field_X = bi.field_d;
                            break L14;
                          } else {
                            var12.field_Yb.field_X = re.field_E;
                            break L14;
                          }
                        } else {
                          var12.field_Xb.field_X = kw.field_Q;
                          break L14;
                        }
                      } else {
                        L17: {
                          if (var12.field_Sb) {
                            break L17;
                          } else {
                            if (!var12.field_Nb) {
                              if (var12.field_uc) {
                                var12.field_Xb.field_X = wp.field_I;
                                break L14;
                              } else {
                                var12.field_Xb.field_X = je.field_zb;
                                break L14;
                              }
                            } else {
                              break L17;
                            }
                          }
                        }
                        var12.field_Yb.field_X = fl.field_l;
                        break L14;
                      }
                    }
                    L18: {
                      if (var12.field_Yb.field_X == null) {
                        var12.field_Xb.a(jn.field_d, -20500, 68, var31, 0);
                        break L18;
                      } else {
                        var12.field_Yb.a(jn.field_d, -20500, 68, var31, 0);
                        break L18;
                      }
                    }
                    L19: {
                      var12.field_lc.field_X = ka.a(var12.field_lc.field_Z, var32, 78);
                      var12.field_lc.a(jn.field_d, -20500, 78, var31, 70);
                      if (!var12.field_lc.field_eb) {
                        break L19;
                      } else {
                        if (!var12.field_lc.field_X.equals((Object) (Object) var32)) {
                          ad.field_I = var32;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      var12.field_cc.field_X = Integer.toString(var12.field_Ub);
                      if (!var12.field_tc) {
                        var12.field_cc.field_Eb = 1;
                        var12.field_cc.a(jn.field_d, -20500, 48, var31, 150);
                        break L20;
                      } else {
                        var12.field_cc.field_Eb = 2;
                        var12.field_hc.field_X = "/" + var12.field_nc;
                        var33_int = (-var12.field_hc.field_Z.a("/") + 348) / 2;
                        var12.field_cc.a(jn.field_d, -20500, -150 + var33_int, var31, 150);
                        var12.field_hc.a(jn.field_d, -20500, 198 + -var33_int, var31, var33_int);
                        break L20;
                      }
                    }
                    L21: {
                      var12.field_Zb.field_X = Integer.toString(var12.field_qc);
                      var12.field_Zb.a(jn.field_d, param0 + -20500, 48, var31, 200);
                      if (!fh.field_c) {
                        stackOut_70_0 = 200;
                        stackIn_71_0 = stackOut_70_0;
                        break L21;
                      } else {
                        stackOut_69_0 = 250;
                        stackIn_71_0 = stackOut_69_0;
                        break L21;
                      }
                    }
                    L22: {
                      var33_int = stackIn_71_0;
                      var12.field_oc.a(jn.field_d, param0 ^ -20500, 365 - var33_int + -2, var31, var33_int);
                      var34_int = io.field_n;
                      if ((1 << ev.field_c & var14) != 0) {
                        var50_ref = rs.field_p[var12.field_Tb];
                        var12.field_ic.field_cb = var50_ref;
                        var12.field_ic.a(var12.field_oc.field_ob, param0 ^ -20500, var50_ref.field_A, 0, var34_int);
                        var34_int = var34_int + (var50_ref.field_A - -io.field_n);
                        break L22;
                      } else {
                        break L22;
                      }
                    }
                    L23: {
                      if ((1 << ai.field_M & var14) != 0) {
                        L24: {
                          if (!var12.field_Sb) {
                            if (var12.field_Nb) {
                              stackOut_80_0 = 1;
                              stackIn_81_0 = stackOut_80_0;
                              break L24;
                            } else {
                              stackOut_79_0 = 0;
                              stackIn_81_0 = stackOut_79_0;
                              break L24;
                            }
                          } else {
                            stackOut_77_0 = 1;
                            stackIn_81_0 = stackOut_77_0;
                            break L24;
                          }
                        }
                        L25: {
                          var36 = stackIn_81_0;
                          stackOut_81_0 = mo.field_g;
                          stackIn_83_0 = stackOut_81_0;
                          stackIn_82_0 = stackOut_81_0;
                          if (var36 == 0) {
                            stackOut_83_0 = (wk[]) (Object) stackIn_83_0;
                            stackOut_83_1 = 0;
                            stackIn_84_0 = stackOut_83_0;
                            stackIn_84_1 = stackOut_83_1;
                            break L25;
                          } else {
                            stackOut_82_0 = (wk[]) (Object) stackIn_82_0;
                            stackOut_82_1 = 1;
                            stackIn_84_0 = stackOut_82_0;
                            stackIn_84_1 = stackOut_82_1;
                            break L25;
                          }
                        }
                        var51_ref = stackIn_84_0[stackIn_84_1];
                        var12.field_ec.field_cb = var51_ref;
                        var12.field_ec.a(var12.field_oc.field_ob, param0 ^ -20500, var51_ref.field_A, 0, var34_int);
                        var34_int = var34_int + (var51_ref.field_A + io.field_n);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L26: {
                      if ((1 << gg.field_I & var14) == 0) {
                        break L26;
                      } else {
                        var52_ref = lm.field_h[var12.field_ac + -1];
                        var12.field_fc.field_cb = var52_ref;
                        var12.field_fc.a(var12.field_oc.field_ob, -20500, var52_ref.field_A, 0, var34_int);
                        var34_int = var34_int + (var52_ref.field_A - -io.field_n);
                        break L26;
                      }
                    }
                    L27: {
                      if ((1 << uj.field_j & var14) != 0) {
                        L28: {
                          stackOut_89_0 = bp.field_d;
                          stackIn_91_0 = stackOut_89_0;
                          stackIn_90_0 = stackOut_89_0;
                          if (!var12.field_vc) {
                            stackOut_91_0 = (wk[]) (Object) stackIn_91_0;
                            stackOut_91_1 = 0;
                            stackIn_92_0 = stackOut_91_0;
                            stackIn_92_1 = stackOut_91_1;
                            break L28;
                          } else {
                            stackOut_90_0 = (wk[]) (Object) stackIn_90_0;
                            stackOut_90_1 = 1;
                            stackIn_92_0 = stackOut_90_0;
                            stackIn_92_1 = stackOut_90_1;
                            break L28;
                          }
                        }
                        var53_ref = stackIn_92_0[stackIn_92_1];
                        var12.field_Vb.field_cb = var53_ref;
                        var12.field_Vb.a(var12.field_oc.field_ob, -20500, var53_ref.field_A, 0, var34_int);
                        var34_int = var34_int + (io.field_n + var53_ref.field_A);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L29: {
                      if (ju.field_a != null) {
                        var36 = 0;
                        L30: while (true) {
                          if (var36 >= tq.field_b) {
                            break L29;
                          } else {
                            L31: {
                              if (ju.field_a[var36] == null) {
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                            var36++;
                            continue L30;
                          }
                        }
                      } else {
                        break L29;
                      }
                    }
                    L32: {
                      var36 = (var12.field_oc.field_gb + -var34_int) / 2;
                      if (0 >= var36) {
                        break L32;
                      } else {
                        var12.field_ic.field_S = var12.field_ic.field_S + var36;
                        var12.field_ec.field_S = var12.field_ec.field_S + var36;
                        var12.field_fc.field_S = var12.field_fc.field_S + var36;
                        var12.field_Vb.field_S = var12.field_Vb.field_S + var36;
                        var37_int = 0;
                        L33: while (true) {
                          if (var37_int >= tq.field_b) {
                            break L32;
                          } else {
                            var12.field_Qb[var37_int].field_S = var12.field_Qb[var37_int].field_S + var36;
                            var37_int++;
                            continue L33;
                          }
                        }
                      }
                    }
                    L34: {
                      if (!var12.field_kc) {
                        break L34;
                      } else {
                        L35: {
                          var37_int = var12.field_bc;
                          if (var37_int >= 0) {
                            break L35;
                          } else {
                            var37_int = (int)(-var12.field_Mb + var9);
                            break L35;
                          }
                        }
                        var38_int = var37_int / 1000;
                        var39 = var38_int / 60;
                        var38_int = var38_int % 60;
                        if (var39 >= 60) {
                          var40 = var39 / 60;
                          var39 = var39 % 60;
                          var12.field_Rb.field_X = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                          break L34;
                        } else {
                          var12.field_Rb.field_X = var39 + ":" + var38_int / 10 + var38_int % 10;
                          break L34;
                        }
                      }
                    }
                    L36: {
                      var12.field_Rb.a(jn.field_d, -20500, -365 + var12.field_gb, var31, 365);
                      var31 = var31 + jn.field_d;
                      if (var12.field_jc == null) {
                        break L36;
                      } else {
                        var31 += 2;
                        var37 = new StringBuilder(64);
                        StringBuilder discarded$4 = var37.append(dh.field_i);
                        StringBuilder discarded$5 = var37.append(var12.field_jc[0]);
                        var38_int = 1;
                        L37: while (true) {
                          if (var12.field_Ub <= var38_int) {
                            var38 = var37.toString();
                            var12.field_Pb.field_X = var38;
                            var39 = var12.field_Pb.field_Z.c(var38, var12.field_gb - var12.field_Pb.field_O * 2);
                            var12.field_Pb.a(var39 * jn.field_d, -20500, var12.field_gb, var31, 0);
                            var31 = var31 + jn.field_d * var39;
                            break L36;
                          } else {
                            StringBuilder discarded$6 = var37.append(", ");
                            StringBuilder discarded$7 = var37.append(var12.field_jc[var38_int]);
                            var38_int++;
                            continue L37;
                          }
                        }
                      }
                    }
                    L38: {
                      if (var12.field_Nb) {
                        var12.field_Ib.field_X = fo.a(4800, sq.field_n, new String[1]);
                        var12.field_Ib.a(jn.field_d, -20500, -(2 * mi.field_l) + var12.field_gb, var31, mi.field_l);
                        var31 = var31 + jn.field_d;
                        break L38;
                      } else {
                        break L38;
                      }
                    }
                    if (!var12.field_gc) {
                      break L13;
                    } else {
                      var12.field_sc.field_X = fo.a(4800, ic.field_A, new String[1]);
                      var12.field_sc.a(jn.field_d, -20500, var12.field_gb - 2 * mi.field_l, var31, mi.field_l);
                      var31 = var31 + jn.field_d;
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                L39: {
                  var33 = gm.a(var12.field_mc, 6, var32);
                  if (var33 != null) {
                    var34_int = var12.field_Wb.field_Z.c(var33, var12.field_gb + -mi.field_l + -mi.field_l);
                    var12.field_Wb.field_X = var33;
                    var12.field_Wb.field_C = var12.field_Lb * 256 / qd.field_K;
                    var12.field_Wb.a(jn.field_d * var34_int, -20500, var12.field_gb - mi.field_l * 2, var31, mi.field_l);
                    var31 = var31 + var34_int * jn.field_d;
                    break L39;
                  } else {
                    break L39;
                  }
                }
                L40: {
                  if (var7_int != 0) {
                    break L40;
                  } else {
                    var12.field_nb = var31 - var12.field_ob;
                    break L40;
                  }
                }
                L41: {
                  if (var13 != 0) {
                    bv.field_x.field_Jb.a((je) (Object) var12, true, 2, (je) var11);
                    break L41;
                  } else {
                    break L41;
                  }
                }
                var34_int = 0;
                L42: while (true) {
                  if (var34_int >= tq.field_b) {
                    L43: {
                      if (!var12.field_ic.field_eb) {
                        break L43;
                      } else {
                        L44: {
                          if (1 == var12.field_Tb) {
                            var34 = ir.field_j;
                            break L44;
                          } else {
                            var34 = ks.field_u[var12.field_Tb];
                            break L44;
                          }
                        }
                        ad.field_I = vu.field_P + " - " + var34;
                        break L43;
                      }
                    }
                    L45: {
                      if (var12.field_Vb.field_eb) {
                        L46: {
                          if (var12.field_vc) {
                            stackOut_148_0 = uu.field_a;
                            stackIn_149_0 = stackOut_148_0;
                            break L46;
                          } else {
                            stackOut_147_0 = cm.field_c;
                            stackIn_149_0 = stackOut_147_0;
                            break L46;
                          }
                        }
                        ad.field_I = stackIn_149_0;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L47: {
                      if (var12.field_ec.field_eb) {
                        L48: {
                          L49: {
                            if (var12.field_Sb) {
                              break L49;
                            } else {
                              if (!var12.field_Nb) {
                                if (var12.field_tc) {
                                  stackOut_158_0 = mv.field_e;
                                  stackIn_159_0 = stackOut_158_0;
                                  break L48;
                                } else {
                                  stackOut_157_0 = hw.field_y;
                                  stackIn_159_0 = stackOut_157_0;
                                  break L48;
                                }
                              } else {
                                break L49;
                              }
                            }
                          }
                          stackOut_155_0 = ns.field_K;
                          stackIn_159_0 = stackOut_155_0;
                          break L48;
                        }
                        ad.field_I = stackIn_159_0;
                        break L47;
                      } else {
                        break L47;
                      }
                    }
                    L50: {
                      if (!var12.field_fc.field_eb) {
                        break L50;
                      } else {
                        L51: {
                          if (var12.field_ac != 2) {
                            stackOut_163_0 = jj.field_d;
                            stackIn_164_0 = stackOut_163_0;
                            break L51;
                          } else {
                            stackOut_162_0 = ak.field_e;
                            stackIn_164_0 = stackOut_162_0;
                            break L51;
                          }
                        }
                        ad.field_I = stackIn_164_0;
                        break L50;
                      }
                    }
                    L52: {
                      if (var12.field_yb == 0) {
                        break L52;
                      } else {
                        if (!var12.k(param0 ^ -7)) {
                          if (var12.field_Yb.field_yb == 0) {
                            ml.a(-114, var12, param2, var32);
                            break L52;
                          } else {
                            L53: {
                              if (!var12.field_kc) {
                                break L53;
                              } else {
                                L54: {
                                  if (!var12.field_tc) {
                                    break L54;
                                  } else {
                                    if (var12.field_Sb) {
                                      break L53;
                                    } else {
                                      if (var12.field_Nb) {
                                        break L53;
                                      } else {
                                        break L54;
                                      }
                                    }
                                  }
                                }
                                ov.a(param6, param0 + 3, var12.d((byte) 119));
                                break L52;
                              }
                            }
                            ag.a(param6, -99, var12.d((byte) -97));
                            break L52;
                          }
                        } else {
                          var12 = (au) (Object) var8.a((byte) 123);
                          continue L1;
                        }
                      }
                    }
                    var12 = (au) (Object) var8.a((byte) 123);
                    continue L1;
                  } else {
                    L55: {
                      if (!var12.field_Qb[var34_int].field_eb) {
                        break L55;
                      } else {
                        L56: {
                          if (wb.field_a == null) {
                            var35 = null;
                            break L56;
                          } else {
                            if (wb.field_a[var34_int] != null) {
                              var35 = (Object) (Object) wb.field_a[var34_int][255 & var12.field_pc[var34_int]];
                              break L56;
                            } else {
                              var35 = null;
                              break L56;
                            }
                          }
                        }
                        if (var35 != null) {
                          ad.field_I = ob.field_M[var34_int] + " - " + var35;
                          break L55;
                        } else {
                          ad.field_I = ob.field_M[var34_int];
                          break L55;
                        }
                      }
                    }
                    var34_int++;
                    continue L42;
                  }
                }
              } else {
                var12.field_Qb[var22_int].field_cb = null;
                var23 = var12.field_Qb[var22_int];
                var12.field_Qb[var22_int].field_ob = 0;
                var23.field_gb = 0;
                var22_int++;
                continue L12;
              }
            }
          }
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        int[] var3 = null;
        int[] var4 = null;
        bv var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        iw var11 = null;
        b var12 = null;
        bv var13 = null;
        b var14 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = mg.field_e;
              var2 = var13.k(0);
              if (var2 == 0) {
                var10 = ce.a(-80);
                var3 = var10;
                var9 = var10;
                var4 = var9;
                var5 = var13;
                var6 = ((vh) (Object) var5).k(0);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var12 = (b) (Object) ta.field_O.e((byte) 98);
                    if (var12 != null) {
                      var12.field_m = true;
                      var12.field_l = var3;
                      var12.d(65);
                      break L1;
                    } else {
                      dj.a((byte) -127);
                      return;
                    }
                  } else {
                    var9[var7] = ((vh) (Object) var5).i(1);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                if (var2 == 1) {
                  var11 = (iw) (Object) cg.field_c.e((byte) 104);
                  if (var11 == null) {
                    dj.a((byte) -126);
                    return;
                  } else {
                    var11.d(41);
                    break L1;
                  }
                } else {
                  if (var2 == 2) {
                    var14 = (b) (Object) ta.field_O.e((byte) 125);
                    if (var14 != null) {
                      var14.field_l = ce.a(-120);
                      var14.field_m = true;
                      var14.d(35);
                      break L1;
                    } else {
                      dj.a((byte) -125);
                      return;
                    }
                  } else {
                    af.a((Throwable) null, 78, "A1: " + cm.b(false));
                    dj.a((byte) -127);
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) (Object) var1, "jg.A(" + 0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Please enter your age in years";
    }
}
