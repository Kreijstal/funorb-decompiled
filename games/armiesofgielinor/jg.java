/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jg extends tc {
    int field_l;
    static wk field_m;
    static String field_n;
    static int field_k;

    public static void a(int param0) {
        field_n = null;
        int var1 = 48 % ((param0 - 27) / 32);
        field_m = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        te discarded$0 = null;
        if (param2 != 512) {
            jg.a((byte) 13);
        }
        int var5 = kd.field_Z[param4][param3];
        if (0 > (var5 ^ -1)) {
            var6 = ns.a(false, td.field_d[var5].length, li.field_n);
            if (td.field_d[var5][var6] != null) {
                if (-1 != (td.field_d[var5][var6].field_o.length ^ -1)) {
                    param0 = 512 - (param0 - 800);
                    param1 = 512 + (param1 <= 512 ? 511 < (param1 ^ -1) ? -512 : param1 : 512) >> -1632290814;
                    param0 = ((-513 <= (param0 ^ -1) ? param0 : 512) >> 2062856674) - -120;
                    discarded$0 = jv.a(td.field_d[var5][var6], param1, param0, (byte) 87);
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
        this.field_l = param0;
    }

    final static void a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6) {
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var7 = null;
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
        wk var42 = null;
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
        wk var54 = null;
        dn stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        dn stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        dn stackIn_4_0 = null;
        boolean stackIn_4_1 = false;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        au stackIn_11_0 = null;
        je stackIn_11_1 = null;
        je stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        au stackIn_12_0 = null;
        je stackIn_12_1 = null;
        je stackIn_12_2 = null;
        long stackIn_12_3 = 0L;
        au stackIn_13_0 = null;
        je stackIn_13_1 = null;
        je stackIn_13_2 = null;
        long stackIn_13_3 = 0L;
        je stackIn_13_4 = null;
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        au stackIn_33_0 = null;
        je stackIn_33_1 = null;
        je stackIn_33_2 = null;
        long stackIn_33_3 = 0L;
        au stackIn_34_0 = null;
        je stackIn_34_1 = null;
        je stackIn_34_2 = null;
        long stackIn_34_3 = 0L;
        au stackIn_35_0 = null;
        je stackIn_35_1 = null;
        je stackIn_35_2 = null;
        long stackIn_35_3 = 0L;
        je stackIn_35_4 = null;
        int stackIn_39_0 = 0;
        int stackIn_85_0 = 0;
        wk[] stackIn_88_0 = null;
        int stackIn_97_0 = 0;
        wk[] stackIn_98_0 = null;
        wk[] stackIn_99_0 = null;
        wk[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        wk[] stackIn_106_0 = null;
        wk[] stackIn_107_0 = null;
        wk[] stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        wk[] stackIn_114_0 = null;
        boolean stackIn_157_0 = false;
        boolean stackIn_169_0 = false;
        String stackIn_179_0 = null;
        String stackIn_189_0 = null;
        String stackIn_194_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        dn stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        dn stackOut_3_0 = null;
        boolean stackOut_3_1 = false;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        dn stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        au stackOut_10_0 = null;
        je stackOut_10_1 = null;
        je stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        au stackOut_12_0 = null;
        je stackOut_12_1 = null;
        je stackOut_12_2 = null;
        long stackOut_12_3 = 0L;
        je stackOut_12_4 = null;
        au stackOut_11_0 = null;
        je stackOut_11_1 = null;
        je stackOut_11_2 = null;
        long stackOut_11_3 = 0L;
        je stackOut_11_4 = null;
        int stackOut_27_0 = 0;
        int stackOut_27_1 = 0;
        au stackOut_32_0 = null;
        je stackOut_32_1 = null;
        je stackOut_32_2 = null;
        long stackOut_32_3 = 0L;
        au stackOut_34_0 = null;
        je stackOut_34_1 = null;
        je stackOut_34_2 = null;
        long stackOut_34_3 = 0L;
        je stackOut_34_4 = null;
        au stackOut_33_0 = null;
        je stackOut_33_1 = null;
        je stackOut_33_2 = null;
        long stackOut_33_3 = 0L;
        je stackOut_33_4 = null;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        wk[] stackOut_87_0 = null;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_92_0 = 0;
        wk[] stackOut_97_0 = null;
        wk[] stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        wk[] stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        wk[] stackOut_105_0 = null;
        wk[] stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        wk[] stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        wk[] stackOut_113_0 = null;
        boolean stackOut_156_0 = false;
        boolean stackOut_168_0 = false;
        String stackOut_178_0 = null;
        String stackOut_177_0 = null;
        String stackOut_188_0 = null;
        String stackOut_187_0 = null;
        String stackOut_185_0 = null;
        String stackOut_193_0 = null;
        String stackOut_192_0 = null;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = bv.field_x;
              stackOut_1_1 = param1;
              stackOut_1_2 = param3 * (8 + 4 * jn.field_d);
              stackOut_1_3 = jn.field_d * 2 - -4;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (bv.field_x != pq.field_b) {
                stackOut_3_0 = (dn) ((Object) stackIn_3_0);
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = stackIn_3_3;
                stackOut_3_4 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                stackIn_4_4 = stackOut_3_4;
                break L1;
              } else {
                stackOut_2_0 = (dn) ((Object) stackIn_2_0);
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = stackIn_2_2;
                stackOut_2_3 = stackIn_2_3;
                stackOut_2_4 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                break L1;
              }
            }
            var7_int = ((dn) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, param0, 2) ? 1 : 0;
            var8 = bv.field_x.field_Jb.field_fb;
            var9 = vi.b(-118);
            var11 = null;
            var12 = (au) ((Object) var8.e((byte) 120));
            L2: while (true) {
              L3: {
                if (var12 == null) {
                  break L3;
                } else {
                  var13 = 0;
                  if (var41 != 0) {
                    break L3;
                  } else {
                    L4: {
                      if (null == var12.field_fb) {
                        var12.field_Xb = new je(0L, ws.field_P);
                        stackOut_9_0 = param4;
                        stackOut_9_1 = param5;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        L5: while (true) {
                          L6: {
                            var14 = stackIn_10_0 | stackIn_10_1;
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
                            stackOut_10_0 = (au) (var12);
                            stackOut_10_1 = null;
                            stackOut_10_2 = null;
                            stackOut_10_3 = 0L;
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_12_3 = stackOut_10_3;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            stackIn_11_3 = stackOut_10_3;
                            if (!fh.field_c) {
                              stackOut_12_0 = (au) ((Object) stackIn_12_0);
                              stackOut_12_1 = null;
                              stackOut_12_2 = null;
                              stackOut_12_3 = stackIn_12_3;
                              stackOut_12_4 = ga.field_i;
                              stackIn_13_0 = stackOut_12_0;
                              stackIn_13_1 = stackOut_12_1;
                              stackIn_13_2 = stackOut_12_2;
                              stackIn_13_3 = stackOut_12_3;
                              stackIn_13_4 = stackOut_12_4;
                              break L6;
                            } else {
                              stackOut_11_0 = (au) ((Object) stackIn_11_0);
                              stackOut_11_1 = null;
                              stackOut_11_2 = null;
                              stackOut_11_3 = stackIn_11_3;
                              stackOut_11_4 = ws.field_P;
                              stackIn_13_0 = stackOut_11_0;
                              stackIn_13_1 = stackOut_11_1;
                              stackIn_13_2 = stackOut_11_2;
                              stackIn_13_3 = stackOut_11_3;
                              stackIn_13_4 = stackOut_11_4;
                              break L6;
                            }
                          }
                          L7: {
                            stackIn_13_0.field_oc = new je(stackIn_13_3, stackIn_13_4);
                            var12.a(var12.field_oc, param0 ^ 63);
                            var12.field_Qb = new je[tq.field_b];
                            var12.field_ic = new je(0L, (je) null);
                            if (0 != (var14 & 1 << ev.field_c)) {
                              var12.field_oc.a(var12.field_ic, param0 + 62);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          L8: {
                            var12.field_ec = new je(0L, (je) null);
                            if ((1 << ai.field_M & var14) != 0) {
                              var12.field_oc.a(var12.field_ec, param0 + 59);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          L9: {
                            var12.field_fc = new je(0L, (je) null);
                            if ((var14 & 1 << gg.field_I) != 0) {
                              var12.field_oc.a(var12.field_fc, param0 + 121);
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                          L10: {
                            var12.field_Vb = new je(0L, (je) null);
                            if ((var14 & 1 << uj.field_j) != 0) {
                              var12.field_oc.a(var12.field_Vb, 86);
                              break L10;
                            } else {
                              break L10;
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
                          L11: while (true) {
                            L12: {
                              if (tq.field_b <= var18_int) {
                                break L12;
                              } else {
                                var12.field_Qb[var18_int] = new je(0L, (je) null);
                                stackOut_27_0 = -1;
                                stackOut_27_1 = var14 & 1 << var18_int + na.field_E ^ -1;
                                stackIn_10_0 = stackOut_27_0;
                                stackIn_10_1 = stackOut_27_1;
                                stackIn_28_0 = stackOut_27_0;
                                stackIn_28_1 = stackOut_27_1;
                                if (var41 != 0) {
                                  continue L5;
                                } else {
                                  L13: {
                                    if (stackIn_28_0 != stackIn_28_1) {
                                      var12.field_oc.a(var12.field_Qb[var18_int], 39);
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  var12.field_Qb[var18_int].field_Fb = 1;
                                  var18_int++;
                                  if (var41 == 0) {
                                    continue L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                            }
                            L14: {
                              stackOut_32_0 = (au) (var12);
                              stackOut_32_1 = null;
                              stackOut_32_2 = null;
                              stackOut_32_3 = 0L;
                              stackIn_34_0 = stackOut_32_0;
                              stackIn_34_1 = stackOut_32_1;
                              stackIn_34_2 = stackOut_32_2;
                              stackIn_34_3 = stackOut_32_3;
                              stackIn_33_0 = stackOut_32_0;
                              stackIn_33_1 = stackOut_32_1;
                              stackIn_33_2 = stackOut_32_2;
                              stackIn_33_3 = stackOut_32_3;
                              if (fh.field_c) {
                                stackOut_34_0 = (au) ((Object) stackIn_34_0);
                                stackOut_34_1 = null;
                                stackOut_34_2 = null;
                                stackOut_34_3 = stackIn_34_3;
                                stackOut_34_4 = ga.field_i;
                                stackIn_35_0 = stackOut_34_0;
                                stackIn_35_1 = stackOut_34_1;
                                stackIn_35_2 = stackOut_34_2;
                                stackIn_35_3 = stackOut_34_3;
                                stackIn_35_4 = stackOut_34_4;
                                break L14;
                              } else {
                                stackOut_33_0 = (au) ((Object) stackIn_33_0);
                                stackOut_33_1 = null;
                                stackOut_33_2 = null;
                                stackOut_33_3 = stackIn_33_3;
                                stackOut_33_4 = ws.field_P;
                                stackIn_35_0 = stackOut_33_0;
                                stackIn_35_1 = stackOut_33_1;
                                stackIn_35_2 = stackOut_33_2;
                                stackIn_35_3 = stackOut_33_3;
                                stackIn_35_4 = stackOut_33_4;
                                break L14;
                              }
                            }
                            stackIn_35_0.field_Rb = new je(stackIn_35_3, stackIn_35_4);
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
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L15: {
                      var12.field_Xb.field_X = null;
                      if (var12.field_kc) {
                        stackOut_38_0 = param5;
                        stackIn_39_0 = stackOut_38_0;
                        break L15;
                      } else {
                        stackOut_37_0 = param4;
                        stackIn_39_0 = stackOut_37_0;
                        break L15;
                      }
                    }
                    var14 = stackIn_39_0;
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
                    L16: while (true) {
                      L17: {
                        L18: {
                          if (var22_int >= tq.field_b) {
                            break L18;
                          } else {
                            var12.field_Qb[var22_int].field_cb = null;
                            var23 = var12.field_Qb[var22_int];
                            var12.field_Qb[var22_int].field_ob = 0;
                            var23.field_gb = 0;
                            var22_int++;
                            if (var41 != 0) {
                              break L17;
                            } else {
                              if (var41 == 0) {
                                continue L16;
                              } else {
                                break L18;
                              }
                            }
                          }
                        }
                        var12.field_ic.field_cb = null;
                        var12.field_ic.field_ob = 0;
                        break L17;
                      }
                      L19: {
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
                          L20: {
                            L21: {
                              if (var12.field_kc) {
                                break L21;
                              } else {
                                L22: {
                                  L23: {
                                    if (var12.field_Sb) {
                                      break L23;
                                    } else {
                                      if (!var12.field_Nb) {
                                        break L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  var12.field_Yb.field_X = fl.field_l;
                                  if (var41 == 0) {
                                    break L20;
                                  } else {
                                    break L22;
                                  }
                                }
                                L24: {
                                  if (var12.field_uc) {
                                    break L24;
                                  } else {
                                    var12.field_Xb.field_X = je.field_zb;
                                    if (var41 == 0) {
                                      break L20;
                                    } else {
                                      break L24;
                                    }
                                  }
                                }
                                var12.field_Xb.field_X = wp.field_I;
                                if (var41 == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            L25: {
                              if (var12.field_bc < 0) {
                                break L25;
                              } else {
                                var12.field_Xb.field_X = kw.field_Q;
                                if (var41 == 0) {
                                  break L20;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            L26: {
                              L27: {
                                if (!var12.field_tc) {
                                  break L27;
                                } else {
                                  if (var12.field_Sb) {
                                    break L26;
                                  } else {
                                    if (var12.field_Nb) {
                                      break L26;
                                    } else {
                                      break L27;
                                    }
                                  }
                                }
                              }
                              L28: {
                                if (var12.field_ac != 2) {
                                  break L28;
                                } else {
                                  var12.field_Yb.field_X = re.field_E;
                                  if (var41 == 0) {
                                    break L20;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              var12.field_Xb.field_X = bi.field_d;
                              if (var41 == 0) {
                                break L20;
                              } else {
                                break L26;
                              }
                            }
                            var12.field_Yb.field_X = fl.field_l;
                            break L20;
                          }
                          L29: {
                            L30: {
                              if (var12.field_Yb.field_X == null) {
                                break L30;
                              } else {
                                var12.field_Yb.a(jn.field_d, -20500, 68, var31, 0);
                                if (var41 == 0) {
                                  break L29;
                                } else {
                                  break L30;
                                }
                              }
                            }
                            var12.field_Xb.a(jn.field_d, -20500, 68, var31, 0);
                            break L29;
                          }
                          L31: {
                            var12.field_lc.field_X = ka.a(var12.field_lc.field_Z, var32, 78);
                            var12.field_lc.a(jn.field_d, -20500, 78, var31, 70);
                            if (!var12.field_lc.field_eb) {
                              break L31;
                            } else {
                              if (!var12.field_lc.field_X.equals(var32)) {
                                ad.field_I = var32;
                                break L31;
                              } else {
                                break L31;
                              }
                            }
                          }
                          L32: {
                            L33: {
                              var12.field_cc.field_X = Integer.toString(var12.field_Ub);
                              if (!var12.field_tc) {
                                break L33;
                              } else {
                                var12.field_cc.field_Eb = 2;
                                var12.field_hc.field_X = "/" + var12.field_nc;
                                var33_int = (-var12.field_hc.field_Z.a("/") + 348) / 2;
                                var12.field_cc.a(jn.field_d, -20500, -150 + var33_int, var31, 150);
                                var12.field_hc.a(jn.field_d, -20500, 198 + -var33_int, var31, var33_int);
                                if (var41 == 0) {
                                  break L32;
                                } else {
                                  break L33;
                                }
                              }
                            }
                            var12.field_cc.field_Eb = 1;
                            var12.field_cc.a(jn.field_d, -20500, 48, var31, 150);
                            break L32;
                          }
                          L34: {
                            var12.field_Zb.field_X = Integer.toString(var12.field_qc);
                            var12.field_Zb.a(jn.field_d, param0 + -20500, 48, var31, 200);
                            if (!fh.field_c) {
                              stackOut_84_0 = 200;
                              stackIn_85_0 = stackOut_84_0;
                              break L34;
                            } else {
                              stackOut_83_0 = 250;
                              stackIn_85_0 = stackOut_83_0;
                              break L34;
                            }
                          }
                          L35: {
                            var33_int = stackIn_85_0;
                            var12.field_oc.a(jn.field_d, param0 ^ -20500, 365 - var33_int + -2, var31, var33_int);
                            var34_int = io.field_n;
                            if ((1 << ev.field_c & var14) != 0) {
                              stackOut_87_0 = rs.field_p;
                              stackIn_88_0 = stackOut_87_0;
                              var50_ref = stackIn_88_0[var12.field_Tb];
                              var12.field_ic.field_cb = var50_ref;
                              var12.field_ic.a(var12.field_oc.field_ob, param0 ^ -20500, var50_ref.field_A, 0, var34_int);
                              var34_int = var34_int + (var50_ref.field_A - -io.field_n);
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          L36: while (true) {
                            L37: {
                              if (-1 != (1 << ai.field_M & var14 ^ -1)) {
                                L38: {
                                  if (!var12.field_Sb) {
                                    if (var12.field_Nb) {
                                      stackOut_95_0 = 1;
                                      stackIn_97_0 = stackOut_95_0;
                                      break L38;
                                    } else {
                                      stackOut_94_0 = 0;
                                      stackIn_97_0 = stackOut_94_0;
                                      break L38;
                                    }
                                  } else {
                                    stackOut_92_0 = 1;
                                    stackIn_97_0 = stackOut_92_0;
                                    break L38;
                                  }
                                }
                                L39: {
                                  var36 = stackIn_97_0;
                                  stackOut_97_0 = mo.field_g;
                                  stackIn_99_0 = stackOut_97_0;
                                  stackIn_98_0 = stackOut_97_0;
                                  if (var36 == 0) {
                                    stackOut_99_0 = (wk[]) ((Object) stackIn_99_0);
                                    stackOut_99_1 = 0;
                                    stackIn_100_0 = stackOut_99_0;
                                    stackIn_100_1 = stackOut_99_1;
                                    break L39;
                                  } else {
                                    stackOut_98_0 = (wk[]) ((Object) stackIn_98_0);
                                    stackOut_98_1 = 1;
                                    stackIn_100_0 = stackOut_98_0;
                                    stackIn_100_1 = stackOut_98_1;
                                    break L39;
                                  }
                                }
                                var51_ref = stackIn_100_0[stackIn_100_1];
                                var12.field_ec.field_cb = var51_ref;
                                var12.field_ec.a(var12.field_oc.field_ob, param0 ^ -20500, var51_ref.field_A, 0, var34_int);
                                var34_int = var34_int + (var51_ref.field_A + io.field_n);
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            L40: {
                              if ((1 << gg.field_I & var14) == 0) {
                                break L40;
                              } else {
                                var52_ref = lm.field_h[var12.field_ac + -1];
                                var12.field_fc.field_cb = var52_ref;
                                var12.field_fc.a(var12.field_oc.field_ob, -20500, var52_ref.field_A, 0, var34_int);
                                var34_int = var34_int + (var52_ref.field_A - -io.field_n);
                                break L40;
                              }
                            }
                            L41: {
                              if ((1 << uj.field_j & var14) != 0) {
                                L42: {
                                  stackOut_105_0 = bp.field_d;
                                  stackIn_107_0 = stackOut_105_0;
                                  stackIn_106_0 = stackOut_105_0;
                                  if (!var12.field_vc) {
                                    stackOut_107_0 = (wk[]) ((Object) stackIn_107_0);
                                    stackOut_107_1 = 0;
                                    stackIn_108_0 = stackOut_107_0;
                                    stackIn_108_1 = stackOut_107_1;
                                    break L42;
                                  } else {
                                    stackOut_106_0 = (wk[]) ((Object) stackIn_106_0);
                                    stackOut_106_1 = 1;
                                    stackIn_108_0 = stackOut_106_0;
                                    stackIn_108_1 = stackOut_106_1;
                                    break L42;
                                  }
                                }
                                var53_ref = stackIn_108_0[stackIn_108_1];
                                var12.field_Vb.field_cb = var53_ref;
                                var12.field_Vb.a(var12.field_oc.field_ob, -20500, var53_ref.field_A, 0, var34_int);
                                var34_int = var34_int + (io.field_n + var53_ref.field_A);
                                break L41;
                              } else {
                                break L41;
                              }
                            }
                            L43: {
                              if (ju.field_a != null) {
                                var36 = 0;
                                L44: while (true) {
                                  if (var36 >= tq.field_b) {
                                    break L43;
                                  } else {
                                    stackOut_113_0 = ju.field_a[var36];
                                    stackIn_88_0 = stackOut_113_0;
                                    stackIn_114_0 = stackOut_113_0;
                                    if (var41 != 0) {
                                      var50_ref = stackIn_88_0[var12.field_Tb];
                                      var12.field_ic.field_cb = var50_ref;
                                      var12.field_ic.a(var12.field_oc.field_ob, param0 ^ -20500, var50_ref.field_A, 0, var34_int);
                                      var34_int = var34_int + (var50_ref.field_A - -io.field_n);
                                      continue L36;
                                    } else {
                                      L45: {
                                        if (stackIn_114_0 == null) {
                                          break L45;
                                        } else {
                                          L46: {
                                            if ((1 << var36 + na.field_E & var14) != 0) {
                                              break L46;
                                            } else {
                                              if (var41 == 0) {
                                                break L45;
                                              } else {
                                                break L46;
                                              }
                                            }
                                          }
                                          var42 = ju.field_a[var36][var12.field_pc[var36] & 255];
                                          var54 = var42;
                                          var12.field_Qb[var36].field_cb = var42;
                                          var12.field_Qb[var36].a(var12.field_oc.field_ob, -20500, var54.field_A, 0, var34_int);
                                          var34_int = var34_int + (var54.field_A + io.field_n);
                                          break L45;
                                        }
                                      }
                                      var36++;
                                      if (var41 == 0) {
                                        continue L44;
                                      } else {
                                        break L43;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L43;
                              }
                            }
                            L47: {
                              L48: {
                                var36 = (var12.field_oc.field_gb + -var34_int) / 2;
                                if (0 >= var36) {
                                  break L48;
                                } else {
                                  var12.field_ic.field_S = var12.field_ic.field_S + var36;
                                  var12.field_ec.field_S = var12.field_ec.field_S + var36;
                                  var12.field_fc.field_S = var12.field_fc.field_S + var36;
                                  var12.field_Vb.field_S = var12.field_Vb.field_S + var36;
                                  var37_int = 0;
                                  L49: while (true) {
                                    if (var37_int >= tq.field_b) {
                                      break L48;
                                    } else {
                                      var12.field_Qb[var37_int].field_S = var12.field_Qb[var37_int].field_S + var36;
                                      var37_int++;
                                      if (var41 != 0) {
                                        break L47;
                                      } else {
                                        if (var41 == 0) {
                                          continue L49;
                                        } else {
                                          break L48;
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              L50: {
                                if (!var12.field_kc) {
                                  break L50;
                                } else {
                                  L51: {
                                    var37_int = var12.field_bc;
                                    if (-1 >= (var37_int ^ -1)) {
                                      break L51;
                                    } else {
                                      var37_int = (int)(-var12.field_Mb + var9);
                                      break L51;
                                    }
                                  }
                                  L52: {
                                    var38_int = var37_int / 1000;
                                    var39 = var38_int / 60;
                                    var38_int = var38_int % 60;
                                    if (var39 >= 60) {
                                      break L52;
                                    } else {
                                      var12.field_Rb.field_X = var39 + ":" + var38_int / 10 + var38_int % 10;
                                      if (var41 == 0) {
                                        break L50;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                  var40 = var39 / 60;
                                  var39 = var39 % 60;
                                  var12.field_Rb.field_X = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                                  break L50;
                                }
                              }
                              var12.field_Rb.a(jn.field_d, -20500, -365 + var12.field_gb, var31, 365);
                              var31 = var31 + jn.field_d;
                              break L47;
                            }
                            L53: {
                              if (var12.field_jc == null) {
                                break L53;
                              } else {
                                var31 += 2;
                                var37 = new StringBuilder(64);
                                discarded$4 = var37.append(dh.field_i);
                                discarded$5 = var37.append(var12.field_jc[0]);
                                var38_int = 1;
                                L54: while (true) {
                                  L55: {
                                    if (var12.field_Ub <= var38_int) {
                                      break L55;
                                    } else {
                                      discarded$6 = var37.append(", ");
                                      discarded$7 = var37.append(var12.field_jc[var38_int]);
                                      var38_int++;
                                      if (var41 != 0) {
                                        break L53;
                                      } else {
                                        if (var41 == 0) {
                                          continue L54;
                                        } else {
                                          break L55;
                                        }
                                      }
                                    }
                                  }
                                  var38 = var37.toString();
                                  var12.field_Pb.field_X = var38;
                                  var39 = var12.field_Pb.field_Z.c(var38, var12.field_gb - var12.field_Pb.field_O * 2);
                                  var12.field_Pb.a(var39 * jn.field_d, -20500, var12.field_gb, var31, 0);
                                  var31 = var31 + jn.field_d * var39;
                                  break L53;
                                }
                              }
                            }
                            L56: {
                              if (var12.field_Nb) {
                                var12.field_Ib.field_X = fo.a(4800, sq.field_n, new String[]{var32});
                                var12.field_Ib.a(jn.field_d, -20500, -(2 * mi.field_l) + var12.field_gb, var31, mi.field_l);
                                var31 = var31 + jn.field_d;
                                break L56;
                              } else {
                                break L56;
                              }
                            }
                            if (!var12.field_gc) {
                              break L19;
                            } else {
                              var12.field_sc.field_X = fo.a(4800, ic.field_A, new String[]{var32});
                              var12.field_sc.a(jn.field_d, -20500, var12.field_gb - 2 * mi.field_l, var31, mi.field_l);
                              var31 = var31 + jn.field_d;
                              break L19;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                      L57: {
                        var33 = gm.a(var12.field_mc, 6, var32);
                        if (var33 != null) {
                          var34_int = var12.field_Wb.field_Z.c(var33, var12.field_gb + -mi.field_l + -mi.field_l);
                          var12.field_Wb.field_X = var33;
                          var12.field_Wb.field_C = var12.field_Lb * 256 / qd.field_K;
                          var12.field_Wb.a(jn.field_d * var34_int, -20500, var12.field_gb - mi.field_l * 2, var31, mi.field_l);
                          var31 = var31 + var34_int * jn.field_d;
                          break L57;
                        } else {
                          break L57;
                        }
                      }
                      L58: {
                        if (var7_int != 0) {
                          break L58;
                        } else {
                          var12.field_nb = var31 - var12.field_ob;
                          break L58;
                        }
                      }
                      L59: {
                        if (var13 != 0) {
                          bv.field_x.field_Jb.a(var12, true, 2, (je) (var11));
                          break L59;
                        } else {
                          break L59;
                        }
                      }
                      var34_int = 0;
                      L60: while (true) {
                        L61: {
                          L62: {
                            if (var34_int >= tq.field_b) {
                              break L62;
                            } else {
                              stackOut_156_0 = var12.field_Qb[var34_int].field_eb;
                              stackIn_169_0 = stackOut_156_0;
                              stackIn_157_0 = stackOut_156_0;
                              if (var41 != 0) {
                                break L61;
                              } else {
                                L63: {
                                  if (!stackIn_157_0) {
                                    break L63;
                                  } else {
                                    L64: {
                                      if (wb.field_a == null) {
                                        var35 = null;
                                        break L64;
                                      } else {
                                        if (wb.field_a[var34_int] != null) {
                                          var35 = wb.field_a[var34_int][255 & var12.field_pc[var34_int]];
                                          break L64;
                                        } else {
                                          var35 = null;
                                          break L64;
                                        }
                                      }
                                    }
                                    L65: {
                                      if (var35 != null) {
                                        break L65;
                                      } else {
                                        ad.field_I = ob.field_M[var34_int];
                                        if (var41 == 0) {
                                          break L63;
                                        } else {
                                          break L65;
                                        }
                                      }
                                    }
                                    ad.field_I = ob.field_M[var34_int] + " - " + (String) (var35);
                                    break L63;
                                  }
                                }
                                var34_int++;
                                if (var41 == 0) {
                                  continue L60;
                                } else {
                                  break L62;
                                }
                              }
                            }
                          }
                          stackOut_168_0 = var12.field_ic.field_eb;
                          stackIn_169_0 = stackOut_168_0;
                          break L61;
                        }
                        L66: {
                          if (!stackIn_169_0) {
                            break L66;
                          } else {
                            L67: {
                              if (1 == var12.field_Tb) {
                                var34 = ir.field_j;
                                break L67;
                              } else {
                                var34 = ks.field_u[var12.field_Tb];
                                break L67;
                              }
                            }
                            ad.field_I = vu.field_P + " - " + var34;
                            break L66;
                          }
                        }
                        L68: {
                          if (var12.field_Vb.field_eb) {
                            L69: {
                              if (var12.field_vc) {
                                stackOut_178_0 = uu.field_a;
                                stackIn_179_0 = stackOut_178_0;
                                break L69;
                              } else {
                                stackOut_177_0 = cm.field_c;
                                stackIn_179_0 = stackOut_177_0;
                                break L69;
                              }
                            }
                            ad.field_I = stackIn_179_0;
                            break L68;
                          } else {
                            break L68;
                          }
                        }
                        L70: {
                          if (var12.field_ec.field_eb) {
                            L71: {
                              L72: {
                                if (var12.field_Sb) {
                                  break L72;
                                } else {
                                  if (!var12.field_Nb) {
                                    if (var12.field_tc) {
                                      stackOut_188_0 = mv.field_e;
                                      stackIn_189_0 = stackOut_188_0;
                                      break L71;
                                    } else {
                                      stackOut_187_0 = hw.field_y;
                                      stackIn_189_0 = stackOut_187_0;
                                      break L71;
                                    }
                                  } else {
                                    break L72;
                                  }
                                }
                              }
                              stackOut_185_0 = ns.field_K;
                              stackIn_189_0 = stackOut_185_0;
                              break L71;
                            }
                            ad.field_I = stackIn_189_0;
                            break L70;
                          } else {
                            break L70;
                          }
                        }
                        L73: {
                          if (!var12.field_fc.field_eb) {
                            break L73;
                          } else {
                            L74: {
                              if (var12.field_ac != 2) {
                                stackOut_193_0 = jj.field_d;
                                stackIn_194_0 = stackOut_193_0;
                                break L74;
                              } else {
                                stackOut_192_0 = ak.field_e;
                                stackIn_194_0 = stackOut_192_0;
                                break L74;
                              }
                            }
                            ad.field_I = stackIn_194_0;
                            break L73;
                          }
                        }
                        L75: {
                          if (var12.field_yb == 0) {
                            break L75;
                          } else {
                            if (!var12.k(param0 ^ -7)) {
                              L76: {
                                if (-1 == (var12.field_Yb.field_yb ^ -1)) {
                                  break L76;
                                } else {
                                  L77: {
                                    if (!var12.field_kc) {
                                      break L77;
                                    } else {
                                      L78: {
                                        if (!var12.field_tc) {
                                          break L78;
                                        } else {
                                          if (var12.field_Sb) {
                                            break L77;
                                          } else {
                                            if (var12.field_Nb) {
                                              break L77;
                                            } else {
                                              break L78;
                                            }
                                          }
                                        }
                                      }
                                      ov.a(param6, param0 + 3, var12.d((byte) 119));
                                      if (var41 == 0) {
                                        break L75;
                                      } else {
                                        break L77;
                                      }
                                    }
                                  }
                                  ag.a(param6, -99, var12.d((byte) -97));
                                  if (var41 == 0) {
                                    break L75;
                                  } else {
                                    break L76;
                                  }
                                }
                              }
                              ml.a(-114, var12, param2, var32);
                              break L75;
                            } else {
                              break L75;
                            }
                          }
                        }
                        var12 = (au) ((Object) var8.a((byte) 123));
                        if (var41 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var7), "jg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void e(int param0) {
        RuntimeException var1 = null;
        int var2 = 0;
        b var3 = null;
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var13 = mg.field_e;
                var2 = var13.k(param0);
                if (-1 == (var2 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    if ((var2 ^ -1) == -2) {
                      break L3;
                    } else {
                      L4: {
                        if (var2 == 2) {
                          break L4;
                        } else {
                          af.a((Throwable) null, 78, "A1: " + cm.b(false));
                          dj.a((byte) -127);
                          if (var8 == 0) {
                            break L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var3 = (b) ((Object) ta.field_O.e((byte) 125));
                      if (var3 != null) {
                        var3.field_l = ce.a(-120);
                        var3.field_m = true;
                        var3.d(param0 ^ 35);
                        if (var8 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      } else {
                        dj.a((byte) -125);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var11 = (iw) ((Object) cg.field_c.e((byte) 104));
                  if (var11 == null) {
                    dj.a((byte) -126);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var11.d(41);
                    if (var8 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var10 = ce.a(-80);
              var9 = var10;
              var4 = var9;
              var5 = var13;
              var6 = ((vh) ((Object) var5)).k(0);
              var7 = 0;
              L5: while (true) {
                if (var7 >= var6) {
                  var12 = (b) ((Object) ta.field_O.e((byte) 98));
                  if (var12 != null) {
                    var12.field_m = true;
                    var12.field_l = var10;
                    var12.d(param0 + 65);
                    break L1;
                  } else {
                    dj.a((byte) -127);
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                } else {
                  var9[var7] = ((vh) ((Object) var5)).i(1);
                  var7++;
                  if (var8 != 0) {
                    break L1;
                  } else {
                    continue L5;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "jg.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_n = "Please enter your age in years";
    }
}
