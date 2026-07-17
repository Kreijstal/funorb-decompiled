/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

abstract class md extends gb {
    int field_t;
    static float field_v;
    int field_E;
    int field_D;
    int field_x;
    static int field_A;
    static String field_I;
    int field_u;
    int field_F;
    static int field_G;
    static String field_y;
    static String field_z;
    static String field_H;
    static oh[] field_B;
    static String field_w;

    final static void a(int param0, int param1, boolean param2, int param3, byte param4, int param5, boolean param6) {
        int var7_int = 0;
        je var8 = null;
        long var9 = 0L;
        Object var11 = null;
        el var12 = null;
        int var13 = 0;
        int var14 = 0;
        hl var18 = null;
        int var18_int = 0;
        hl var19 = null;
        hl var20 = null;
        hl var21 = null;
        int var22_int = 0;
        hl var22 = null;
        hl var23 = null;
        hl var24 = null;
        hl var25 = null;
        hl var26 = null;
        hl var27 = null;
        hl var28 = null;
        hl var29 = null;
        hl var30 = null;
        int var31 = 0;
        String var32 = null;
        String var33 = null;
        int var33_int = 0;
        String var34 = null;
        int var34_int = 0;
        Object var35 = null;
        String var35_ref = null;
        int var36 = 0;
        int var37_int = 0;
        StringBuilder var37 = null;
        int var38_int = 0;
        String var38 = null;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        oh var42 = null;
        hl var43 = null;
        hl var44 = null;
        hl var45 = null;
        hl var46 = null;
        hl var47 = null;
        hl var48 = null;
        hl var49 = null;
        Object var50 = null;
        oh var50_ref = null;
        Object var51 = null;
        oh var51_ref = null;
        Object var52 = null;
        oh var52_ref = null;
        Object var53 = null;
        oh var53_ref = null;
        oh var54 = null;
        rb stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        boolean stackIn_1_4 = false;
        rb stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        boolean stackIn_2_4 = false;
        rb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        boolean stackIn_3_4 = false;
        int stackIn_3_5 = 0;
        el stackIn_10_0 = null;
        hl stackIn_10_1 = null;
        hl stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        el stackIn_11_0 = null;
        hl stackIn_11_1 = null;
        hl stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        el stackIn_12_0 = null;
        hl stackIn_12_1 = null;
        hl stackIn_12_2 = null;
        long stackIn_12_3 = 0L;
        hl stackIn_12_4 = null;
        el stackIn_29_0 = null;
        hl stackIn_29_1 = null;
        hl stackIn_29_2 = null;
        long stackIn_29_3 = 0L;
        el stackIn_30_0 = null;
        hl stackIn_30_1 = null;
        hl stackIn_30_2 = null;
        long stackIn_30_3 = 0L;
        el stackIn_31_0 = null;
        hl stackIn_31_1 = null;
        hl stackIn_31_2 = null;
        long stackIn_31_3 = 0L;
        hl stackIn_31_4 = null;
        int stackIn_35_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_79_0 = 0;
        oh[] stackIn_80_0 = null;
        oh[] stackIn_81_0 = null;
        oh[] stackIn_82_0 = null;
        int stackIn_82_1 = 0;
        oh[] stackIn_88_0 = null;
        oh[] stackIn_89_0 = null;
        oh[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        String stackIn_148_0 = null;
        String stackIn_158_0 = null;
        String stackIn_163_0 = null;
        rb stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        boolean stackOut_0_4 = false;
        rb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        boolean stackOut_2_4 = false;
        int stackOut_2_5 = 0;
        rb stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        boolean stackOut_1_4 = false;
        int stackOut_1_5 = 0;
        el stackOut_9_0 = null;
        hl stackOut_9_1 = null;
        hl stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        el stackOut_11_0 = null;
        hl stackOut_11_1 = null;
        hl stackOut_11_2 = null;
        long stackOut_11_3 = 0L;
        hl stackOut_11_4 = null;
        el stackOut_10_0 = null;
        hl stackOut_10_1 = null;
        hl stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        hl stackOut_10_4 = null;
        el stackOut_28_0 = null;
        hl stackOut_28_1 = null;
        hl stackOut_28_2 = null;
        long stackOut_28_3 = 0L;
        el stackOut_30_0 = null;
        hl stackOut_30_1 = null;
        hl stackOut_30_2 = null;
        long stackOut_30_3 = 0L;
        hl stackOut_30_4 = null;
        el stackOut_29_0 = null;
        hl stackOut_29_1 = null;
        hl stackOut_29_2 = null;
        long stackOut_29_3 = 0L;
        hl stackOut_29_4 = null;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        oh[] stackOut_79_0 = null;
        oh[] stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        oh[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        oh[] stackOut_87_0 = null;
        oh[] stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        oh[] stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        String stackOut_147_0 = null;
        String stackOut_146_0 = null;
        String stackOut_157_0 = null;
        String stackOut_156_0 = null;
        String stackOut_154_0 = null;
        String stackOut_162_0 = null;
        String stackOut_161_0 = null;
        L0: {
          var50 = null;
          var51 = null;
          var52 = null;
          var53 = null;
          var41 = TetraLink.field_J;
          stackOut_0_0 = ph.field_t;
          stackOut_0_1 = 2;
          stackOut_0_2 = (2 + qe.field_d) * 2;
          stackOut_0_3 = -118;
          stackOut_0_4 = param2;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_2_4 = stackOut_0_4;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          stackIn_1_4 = stackOut_0_4;
          if (bi.field_d != ph.field_t) {
            stackOut_2_0 = (rb) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = stackIn_2_4;
            stackOut_2_5 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            stackIn_3_5 = stackOut_2_5;
            break L0;
          } else {
            stackOut_1_0 = (rb) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = stackIn_1_4;
            stackOut_1_5 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            stackIn_3_5 = stackOut_1_5;
            break L0;
          }
        }
        L1: {
          var7_int = ((rb) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5 != 0, param3 * (8 + 4 * qe.field_d)) ? 1 : 0;
          var8 = ph.field_t.field_Pb.field_fb;
          var9 = k.a(0);
          var11 = null;
          if (param4 == -73) {
            break L1;
          } else {
            md.f(64);
            break L1;
          }
        }
        var12 = (el) (Object) var8.c(false);
        L2: while (true) {
          if (var12 == null) {
            return;
          } else {
            L3: {
              var13 = 0;
              if (var12.field_fb == null) {
                L4: {
                  var14 = param5 | param1;
                  var12.field_nc = new hl(0L, ga.field_c);
                  var12.a((byte) -108, var12.field_nc);
                  var12.field_nc.field_xb = 1;
                  var12.field_pc = new hl(0L, sk.field_h);
                  var12.a((byte) -96, var12.field_pc);
                  var12.field_Bc = new hl(0L, ga.field_c);
                  var12.a((byte) 127, var12.field_Bc);
                  var12.field_Bc.field_V = 0;
                  var12.field_yc = new hl(0L, ga.field_c);
                  var12.a((byte) -112, var12.field_yc);
                  var12.field_yc.field_V = 0;
                  var12.field_Xb = new hl(0L, sk.field_h);
                  var12.a((byte) -93, var12.field_Xb);
                  var12.field_Xb.field_xb = 2;
                  stackOut_9_0 = (el) var12;
                  stackOut_9_1 = null;
                  stackOut_9_2 = null;
                  stackOut_9_3 = 0L;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  stackIn_11_3 = stackOut_9_3;
                  stackIn_10_0 = stackOut_9_0;
                  stackIn_10_1 = stackOut_9_1;
                  stackIn_10_2 = stackOut_9_2;
                  stackIn_10_3 = stackOut_9_3;
                  if (kj.field_b) {
                    stackOut_11_0 = (el) (Object) stackIn_11_0;
                    stackOut_11_1 = null;
                    stackOut_11_2 = null;
                    stackOut_11_3 = stackIn_11_3;
                    stackOut_11_4 = ga.field_c;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    stackIn_12_2 = stackOut_11_2;
                    stackIn_12_3 = stackOut_11_3;
                    stackIn_12_4 = stackOut_11_4;
                    break L4;
                  } else {
                    stackOut_10_0 = (el) (Object) stackIn_10_0;
                    stackOut_10_1 = null;
                    stackOut_10_2 = null;
                    stackOut_10_3 = stackIn_10_3;
                    stackOut_10_4 = sk.field_h;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    stackIn_12_2 = stackOut_10_2;
                    stackIn_12_3 = stackOut_10_3;
                    stackIn_12_4 = stackOut_10_4;
                    break L4;
                  }
                }
                L5: {
                  stackIn_12_0.field_Yb = new hl(stackIn_12_3, stackIn_12_4);
                  var12.a((byte) -100, var12.field_Yb);
                  var12.field_Lb = new hl[hg.field_k];
                  var12.field_lc = new hl(0L, (hl) null);
                  if ((1 << t.field_t & var14) == 0) {
                    break L5;
                  } else {
                    var12.field_Yb.a((byte) 24, var12.field_lc);
                    break L5;
                  }
                }
                L6: {
                  var12.field_ac = new hl(0L, (hl) null);
                  if ((var14 & 1 << g.field_s) != 0) {
                    var12.field_Yb.a((byte) 21, var12.field_ac);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var12.field_zc = new hl(0L, (hl) null);
                  if ((1 << bl.field_Kb & var14) == 0) {
                    break L7;
                  } else {
                    var12.field_Yb.a((byte) -105, var12.field_zc);
                    break L7;
                  }
                }
                L8: {
                  var12.field_Rb = new hl(0L, (hl) null);
                  if ((var14 & 1 << in.field_d) != 0) {
                    var12.field_Yb.a((byte) -126, var12.field_Rb);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var45 = var12.field_lc;
                var44 = var12.field_Rb;
                var43 = var12.field_ac;
                var12.field_zc.field_J = 1;
                var43.field_J = 1;
                var44.field_J = 1;
                var45.field_J = 1;
                var18_int = 0;
                L9: while (true) {
                  if (hg.field_k <= var18_int) {
                    L10: {
                      stackOut_28_0 = (el) var12;
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
                      if (!kj.field_b) {
                        stackOut_30_0 = (el) (Object) stackIn_30_0;
                        stackOut_30_1 = null;
                        stackOut_30_2 = null;
                        stackOut_30_3 = stackIn_30_3;
                        stackOut_30_4 = ga.field_c;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        stackIn_31_3 = stackOut_30_3;
                        stackIn_31_4 = stackOut_30_4;
                        break L10;
                      } else {
                        stackOut_29_0 = (el) (Object) stackIn_29_0;
                        stackOut_29_1 = null;
                        stackOut_29_2 = null;
                        stackOut_29_3 = stackIn_29_3;
                        stackOut_29_4 = sk.field_h;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        stackIn_31_3 = stackOut_29_3;
                        stackIn_31_4 = stackOut_29_4;
                        break L10;
                      }
                    }
                    stackIn_31_0.field_wc = new hl(stackIn_31_3, stackIn_31_4);
                    var12.a((byte) 55, var12.field_wc);
                    var12.field_wc.field_xb = 2;
                    var12.field_Mb = new hl(0L, sk.field_h);
                    var12.a((byte) 86, var12.field_Mb);
                    var12.field_vc = new hl(0L, ek.field_n);
                    var12.a((byte) -88, var12.field_vc);
                    var12.field_Pb = new hl(0L, ek.field_n);
                    var12.a((byte) -116, var12.field_Pb);
                    var12.field_Tb = new hl(0L, bk.field_i);
                    var12.a((byte) -85, var12.field_Tb);
                    var12.c((byte) -114);
                    var12.field_hc = new hl(0L, eo.field_c);
                    var13 = 1;
                    var12.a((byte) 68, var12.field_hc);
                    break L3;
                  } else {
                    L11: {
                      var12.field_Lb[var18_int] = new hl(0L, (hl) null);
                      if ((var14 & 1 << var18_int + wg.field_h) != 0) {
                        var12.field_Yb.a((byte) 73, var12.field_Lb[var18_int]);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    var12.field_Lb[var18_int].field_J = 1;
                    var18_int++;
                    continue L9;
                  }
                }
              } else {
                break L3;
              }
            }
            L12: {
              if (!var12.field_Kb) {
                stackOut_34_0 = param5;
                stackIn_35_0 = stackOut_34_0;
                break L12;
              } else {
                stackOut_33_0 = param1;
                stackIn_35_0 = stackOut_33_0;
                break L12;
              }
            }
            var14 = stackIn_35_0;
            var12.field_nc.field_jb = null;
            var12.field_nc.field_R = 0;
            var46 = var12.field_nc;
            var12.field_hc.field_jb = null;
            var46.field_Hb = 0;
            var47 = var12.field_hc;
            var12.field_hc.field_R = 0;
            var47.field_Hb = 0;
            var12.field_pc.field_jb = null;
            var12.field_pc.field_R = 0;
            var48 = var12.field_pc;
            var48.field_Hb = 0;
            var12.field_Bc.field_jb = null;
            var12.field_Bc.field_R = 0;
            var18 = var12.field_Bc;
            var18.field_Hb = 0;
            var12.field_yc.field_jb = null;
            var12.field_yc.field_R = 0;
            var19 = var12.field_yc;
            var19.field_Hb = 0;
            var12.field_Xb.field_jb = null;
            var20 = var12.field_Xb;
            var12.field_Xb.field_R = 0;
            var12.field_Yb.field_jb = null;
            var20.field_Hb = 0;
            var12.field_Yb.field_R = 0;
            var21 = var12.field_Yb;
            var21.field_Hb = 0;
            var22_int = 0;
            L13: while (true) {
              if (~hg.field_k >= ~var22_int) {
                L14: {
                  var12.field_lc.field_vb = null;
                  var22 = var12.field_lc;
                  var12.field_lc.field_R = 0;
                  var22.field_Hb = 0;
                  var12.field_Rb.field_vb = null;
                  var12.field_Rb.field_R = 0;
                  var49 = var12.field_Rb;
                  var12.field_ac.field_vb = null;
                  var49.field_Hb = 0;
                  var12.field_ac.field_R = 0;
                  var24 = var12.field_ac;
                  var12.field_zc.field_vb = null;
                  var24.field_Hb = 0;
                  var12.field_zc.field_R = 0;
                  var25 = var12.field_zc;
                  var12.field_wc.field_jb = null;
                  var25.field_Hb = 0;
                  var26 = var12.field_wc;
                  var12.field_wc.field_R = 0;
                  var26.field_Hb = 0;
                  var12.field_Mb.field_jb = null;
                  var12.field_Mb.field_R = 0;
                  var27 = var12.field_Mb;
                  var12.field_vc.field_jb = null;
                  var27.field_Hb = 0;
                  var28 = var12.field_vc;
                  var12.field_vc.field_R = 0;
                  var12.field_Pb.field_jb = null;
                  var28.field_Hb = 0;
                  var12.field_Pb.field_R = 0;
                  var29 = var12.field_Pb;
                  var29.field_Hb = 0;
                  var12.field_Tb.field_jb = null;
                  var30 = var12.field_Tb;
                  var12.field_Tb.field_R = 0;
                  var30.field_Hb = 0;
                  var12.field_Hb = ph.field_t.field_Pb.field_Hb;
                  var31 = 0;
                  var32 = var12.field_ec;
                  if (var12.h(-597)) {
                    break L14;
                  } else {
                    L15: {
                      if (var12.field_Kb) {
                        if (var12.field_bc >= 0) {
                          var12.field_nc.field_jb = ud.field_Pb;
                          break L15;
                        } else {
                          L16: {
                            if (!var12.field_kc) {
                              break L16;
                            } else {
                              L17: {
                                if (var12.field_xc) {
                                  break L17;
                                } else {
                                  if (var12.field_Vb) {
                                    break L17;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              var12.field_hc.field_jb = el.field_Sb;
                              break L15;
                            }
                          }
                          if (var12.field_Zb != 2) {
                            var12.field_nc.field_jb = lg.field_V;
                            break L15;
                          } else {
                            var12.field_hc.field_jb = kd.field_m;
                            break L15;
                          }
                        }
                      } else {
                        L18: {
                          if (var12.field_xc) {
                            break L18;
                          } else {
                            if (var12.field_Vb) {
                              break L18;
                            } else {
                              if (!var12.field_uc) {
                                var12.field_nc.field_jb = nh.field_Kb;
                                break L15;
                              } else {
                                var12.field_nc.field_jb = le.field_Vb;
                                break L15;
                              }
                            }
                          }
                        }
                        var12.field_hc.field_jb = el.field_Sb;
                        break L15;
                      }
                    }
                    L19: {
                      if (var12.field_hc.field_jb == null) {
                        var12.field_nc.a((byte) -119, 68, var31, qe.field_d, 0);
                        break L19;
                      } else {
                        var12.field_hc.a((byte) -118, 68, var31, qe.field_d, 0);
                        break L19;
                      }
                    }
                    L20: {
                      var12.field_pc.field_jb = jb.a(var12.field_pc.field_Ib, var32, 78);
                      var12.field_pc.a((byte) -102, 78, var31, qe.field_d, 70);
                      if (!var12.field_pc.field_Y) {
                        break L20;
                      } else {
                        if (!var12.field_pc.field_jb.equals((Object) (Object) var32)) {
                          re.field_P = var32;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                    }
                    L21: {
                      var12.field_Bc.field_jb = Integer.toString(var12.field_jc);
                      if (var12.field_kc) {
                        var12.field_yc.field_jb = "/" + var12.field_rc;
                        var12.field_Bc.field_xb = 2;
                        var33_int = (-var12.field_yc.field_Ib.b("/") + 348) / 2;
                        var12.field_Bc.a((byte) -104, -150 + var33_int, var31, qe.field_d, 150);
                        var12.field_yc.a((byte) -102, -var33_int + 198, var31, qe.field_d, var33_int);
                        break L21;
                      } else {
                        var12.field_Bc.field_xb = 1;
                        var12.field_Bc.a((byte) -125, 48, var31, qe.field_d, 150);
                        break L21;
                      }
                    }
                    L22: {
                      var12.field_Xb.field_jb = Integer.toString(var12.field_Qb);
                      var12.field_Xb.a((byte) -106, 48, var31, qe.field_d, 200);
                      if (kj.field_b) {
                        stackOut_68_0 = 250;
                        stackIn_69_0 = stackOut_68_0;
                        break L22;
                      } else {
                        stackOut_67_0 = 200;
                        stackIn_69_0 = stackOut_67_0;
                        break L22;
                      }
                    }
                    L23: {
                      var33_int = stackIn_69_0;
                      var12.field_Yb.a((byte) -109, -var33_int + 363, var31, qe.field_d, var33_int);
                      var34_int = eh.field_w;
                      if ((var14 & 1 << t.field_t) != 0) {
                        var50_ref = rm.field_b[var12.field_ic];
                        var12.field_lc.field_vb = var50_ref;
                        var12.field_lc.a((byte) -89, var50_ref.field_t, 0, var12.field_Yb.field_R, var34_int);
                        var34_int = var34_int + (eh.field_w + var50_ref.field_t);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    L24: {
                      if ((var14 & 1 << g.field_s) != 0) {
                        L25: {
                          L26: {
                            if (var12.field_xc) {
                              break L26;
                            } else {
                              if (!var12.field_Vb) {
                                stackOut_78_0 = 0;
                                stackIn_79_0 = stackOut_78_0;
                                break L25;
                              } else {
                                break L26;
                              }
                            }
                          }
                          stackOut_77_0 = 1;
                          stackIn_79_0 = stackOut_77_0;
                          break L25;
                        }
                        L27: {
                          var36 = stackIn_79_0;
                          stackOut_79_0 = ll.field_u;
                          stackIn_81_0 = stackOut_79_0;
                          stackIn_80_0 = stackOut_79_0;
                          if (var36 != 0) {
                            stackOut_81_0 = (oh[]) (Object) stackIn_81_0;
                            stackOut_81_1 = 1;
                            stackIn_82_0 = stackOut_81_0;
                            stackIn_82_1 = stackOut_81_1;
                            break L27;
                          } else {
                            stackOut_80_0 = (oh[]) (Object) stackIn_80_0;
                            stackOut_80_1 = 0;
                            stackIn_82_0 = stackOut_80_0;
                            stackIn_82_1 = stackOut_80_1;
                            break L27;
                          }
                        }
                        var51_ref = stackIn_82_0[stackIn_82_1];
                        var12.field_ac.field_vb = var51_ref;
                        var12.field_ac.a((byte) -92, var51_ref.field_t, 0, var12.field_Yb.field_R, var34_int);
                        var34_int = var34_int + (eh.field_w + var51_ref.field_t);
                        break L24;
                      } else {
                        break L24;
                      }
                    }
                    L28: {
                      if ((var14 & 1 << bl.field_Kb) == 0) {
                        break L28;
                      } else {
                        var52_ref = field_B[-1 + var12.field_Zb];
                        var12.field_zc.field_vb = var52_ref;
                        var12.field_zc.a((byte) -94, var52_ref.field_t, 0, var12.field_Yb.field_R, var34_int);
                        var34_int = var34_int + (var52_ref.field_t + eh.field_w);
                        break L28;
                      }
                    }
                    L29: {
                      if ((1 << in.field_d & var14) != 0) {
                        L30: {
                          stackOut_87_0 = s.field_e;
                          stackIn_89_0 = stackOut_87_0;
                          stackIn_88_0 = stackOut_87_0;
                          if (var12.field_mc) {
                            stackOut_89_0 = (oh[]) (Object) stackIn_89_0;
                            stackOut_89_1 = 1;
                            stackIn_90_0 = stackOut_89_0;
                            stackIn_90_1 = stackOut_89_1;
                            break L30;
                          } else {
                            stackOut_88_0 = (oh[]) (Object) stackIn_88_0;
                            stackOut_88_1 = 0;
                            stackIn_90_0 = stackOut_88_0;
                            stackIn_90_1 = stackOut_88_1;
                            break L30;
                          }
                        }
                        var53_ref = stackIn_90_0[stackIn_90_1];
                        var12.field_Rb.field_vb = var53_ref;
                        var12.field_Rb.a((byte) -121, var53_ref.field_t, 0, var12.field_Yb.field_R, var34_int);
                        var34_int = var34_int + (eh.field_w + var53_ref.field_t);
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    L31: {
                      if (null == rl.field_b) {
                        break L31;
                      } else {
                        var36 = 0;
                        L32: while (true) {
                          if (var36 >= hg.field_k) {
                            break L31;
                          } else {
                            L33: {
                              if (null == rl.field_b[var36]) {
                                break L33;
                              } else {
                                if ((1 << var36 + wg.field_h & var14) == 0) {
                                  break L33;
                                } else {
                                  var42 = rl.field_b[var36][var12.field_sc[var36] & 255];
                                  var54 = var42;
                                  var12.field_Lb[var36].field_vb = var42;
                                  var12.field_Lb[var36].a((byte) -123, var54.field_t, 0, var12.field_Yb.field_R, var34_int);
                                  var34_int = var34_int + (var54.field_t + eh.field_w);
                                  break L33;
                                }
                              }
                            }
                            var36++;
                            continue L32;
                          }
                        }
                      }
                    }
                    L34: {
                      var36 = (-var34_int + var12.field_Yb.field_Hb) / 2;
                      if (var36 > 0) {
                        var12.field_lc.field_M = var12.field_lc.field_M + var36;
                        var12.field_ac.field_M = var12.field_ac.field_M + var36;
                        var12.field_zc.field_M = var12.field_zc.field_M + var36;
                        var12.field_Rb.field_M = var12.field_Rb.field_M + var36;
                        var37_int = 0;
                        L35: while (true) {
                          if (~hg.field_k >= ~var37_int) {
                            break L34;
                          } else {
                            var12.field_Lb[var37_int].field_M = var12.field_Lb[var37_int].field_M + var36;
                            var37_int++;
                            continue L35;
                          }
                        }
                      } else {
                        break L34;
                      }
                    }
                    L36: {
                      if (!var12.field_Kb) {
                        break L36;
                      } else {
                        L37: {
                          var37_int = var12.field_bc;
                          if (var37_int >= 0) {
                            break L37;
                          } else {
                            var37_int = (int)(var9 - var12.field_Ac);
                            break L37;
                          }
                        }
                        var38_int = var37_int / 1000;
                        var39 = var38_int / 60;
                        var38_int = var38_int % 60;
                        if (var39 < 60) {
                          var12.field_wc.field_jb = var39 + ":" + var38_int / 10 + var38_int % 10;
                          break L36;
                        } else {
                          var40 = var39 / 60;
                          var39 = var39 % 60;
                          var12.field_wc.field_jb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                          break L36;
                        }
                      }
                    }
                    L38: {
                      var12.field_wc.a((byte) -101, var12.field_Hb + -365, var31, qe.field_d, 365);
                      var31 = var31 + qe.field_d;
                      if (var12.field_fc == null) {
                        break L38;
                      } else {
                        var31 += 2;
                        var37 = new StringBuilder(64);
                        StringBuilder discarded$4 = var37.append(cc.field_e);
                        StringBuilder discarded$5 = var37.append(var12.field_fc[0]);
                        var38_int = 1;
                        L39: while (true) {
                          if (~var12.field_jc >= ~var38_int) {
                            var38 = var37.toString();
                            var12.field_Mb.field_jb = var38;
                            var39 = var12.field_Mb.field_Ib.c(var38, -(2 * var12.field_Mb.field_V) + var12.field_Hb);
                            var12.field_Mb.a((byte) -96, var12.field_Hb, var31, var39 * qe.field_d, 0);
                            var31 = var31 + qe.field_d * var39;
                            break L38;
                          } else {
                            StringBuilder discarded$6 = var37.append(", ");
                            StringBuilder discarded$7 = var37.append(var12.field_fc[var38_int]);
                            var38_int++;
                            continue L39;
                          }
                        }
                      }
                    }
                    L40: {
                      if (!var12.field_Vb) {
                        break L40;
                      } else {
                        var12.field_vc.field_jb = sk.a(new String[1], s.field_b, 127);
                        var12.field_vc.a((byte) -106, -(2 * fn.field_Q) + var12.field_Hb, var31, qe.field_d, fn.field_Q);
                        var31 = var31 + qe.field_d;
                        break L40;
                      }
                    }
                    if (!var12.field_Wb) {
                      break L14;
                    } else {
                      var12.field_Pb.field_jb = sk.a(new String[1], d.field_g, 121);
                      var12.field_Pb.a((byte) -96, -(2 * fn.field_Q) + var12.field_Hb, var31, qe.field_d, fn.field_Q);
                      var31 = var31 + qe.field_d;
                      break L14;
                    }
                  }
                }
                L41: {
                  var33 = ef.a((byte) 63, var32, var12.field_gc);
                  var34 = var33;
                  var34 = var33;
                  if (var33 == null) {
                    break L41;
                  } else {
                    var34_int = var12.field_Tb.field_Ib.c(var33, -fn.field_Q + (var12.field_Hb - fn.field_Q));
                    var12.field_Tb.field_jb = var33;
                    var12.field_Tb.field_K = 256 * var12.field_Ub / u.field_a;
                    var12.field_Tb.a((byte) -112, var12.field_Hb - 2 * fn.field_Q, var31, var34_int * qe.field_d, fn.field_Q);
                    var31 = var31 + qe.field_d * var34_int;
                    break L41;
                  }
                }
                L42: {
                  if (var7_int != 0) {
                    break L42;
                  } else {
                    var12.field_mb = -var12.field_R + var31;
                    break L42;
                  }
                }
                L43: {
                  if (var13 != 0) {
                    ph.field_t.field_Pb.a((hl) var11, true, (hl) (Object) var12, 2);
                    break L43;
                  } else {
                    break L43;
                  }
                }
                var34_int = 0;
                L44: while (true) {
                  if (~hg.field_k >= ~var34_int) {
                    L45: {
                      if (var12.field_lc.field_Y) {
                        L46: {
                          if (var12.field_ic != 1) {
                            var34 = wa.field_b[var12.field_ic];
                            break L46;
                          } else {
                            var34 = ng.field_y;
                            break L46;
                          }
                        }
                        re.field_P = nj.field_c + " - " + var34;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L47: {
                      if (!var12.field_Rb.field_Y) {
                        break L47;
                      } else {
                        L48: {
                          if (!var12.field_mc) {
                            stackOut_147_0 = of.field_h;
                            stackIn_148_0 = stackOut_147_0;
                            break L48;
                          } else {
                            stackOut_146_0 = lh.field_u;
                            stackIn_148_0 = stackOut_146_0;
                            break L48;
                          }
                        }
                        re.field_P = stackIn_148_0;
                        break L47;
                      }
                    }
                    L49: {
                      if (var12.field_ac.field_Y) {
                        L50: {
                          L51: {
                            if (var12.field_xc) {
                              break L51;
                            } else {
                              if (!var12.field_Vb) {
                                if (var12.field_kc) {
                                  stackOut_157_0 = ga.field_d;
                                  stackIn_158_0 = stackOut_157_0;
                                  break L50;
                                } else {
                                  stackOut_156_0 = lh.field_x;
                                  stackIn_158_0 = stackOut_156_0;
                                  break L50;
                                }
                              } else {
                                break L51;
                              }
                            }
                          }
                          stackOut_154_0 = pj.field_c;
                          stackIn_158_0 = stackOut_154_0;
                          break L50;
                        }
                        re.field_P = stackIn_158_0;
                        break L49;
                      } else {
                        break L49;
                      }
                    }
                    L52: {
                      if (!var12.field_zc.field_Y) {
                        break L52;
                      } else {
                        L53: {
                          if (2 != var12.field_Zb) {
                            stackOut_162_0 = nh.field_Pb;
                            stackIn_163_0 = stackOut_162_0;
                            break L53;
                          } else {
                            stackOut_161_0 = vc.field_d;
                            stackIn_163_0 = stackOut_161_0;
                            break L53;
                          }
                        }
                        re.field_P = stackIn_163_0;
                        break L52;
                      }
                    }
                    L54: {
                      if (var12.field_F == 0) {
                        break L54;
                      } else {
                        if (var12.h(-597)) {
                          break L54;
                        } else {
                          if (var12.field_hc.field_F != 0) {
                            L55: {
                              if (!var12.field_Kb) {
                                break L55;
                              } else {
                                L56: {
                                  if (!var12.field_kc) {
                                    break L56;
                                  } else {
                                    if (var12.field_xc) {
                                      break L55;
                                    } else {
                                      if (!var12.field_Vb) {
                                        break L56;
                                      } else {
                                        break L55;
                                      }
                                    }
                                  }
                                }
                                mi.a(param4 + 76, var12.j(-80), param0);
                                break L54;
                              }
                            }
                            uf.a(param0, (byte) 108, var12.j(-98));
                            break L54;
                          } else {
                            oj.a(var12, (byte) 110, param6, var32);
                            break L54;
                          }
                        }
                      }
                    }
                    var12 = (el) (Object) var8.a((byte) -70);
                    continue L2;
                  } else {
                    L57: {
                      if (var12.field_Lb[var34_int].field_Y) {
                        L58: {
                          if (wl.field_c != null) {
                            if (wl.field_c[var34_int] != null) {
                              var35_ref = wl.field_c[var34_int][var12.field_sc[var34_int] & 255];
                              break L58;
                            } else {
                              var35_ref = null;
                              break L58;
                            }
                          } else {
                            var35_ref = null;
                            break L58;
                          }
                        }
                        if (var35_ref != null) {
                          re.field_P = ll.field_y[var34_int] + " - " + var35_ref;
                          break L57;
                        } else {
                          re.field_P = ll.field_y[var34_int];
                          break L57;
                        }
                      } else {
                        break L57;
                      }
                    }
                    var34_int++;
                    continue L44;
                  }
                }
              } else {
                var12.field_Lb[var22_int].field_vb = null;
                var23 = var12.field_Lb[var22_int];
                var12.field_Lb[var22_int].field_R = 0;
                var23.field_Hb = 0;
                var22_int++;
                continue L13;
              }
            }
          }
        }
    }

    public static void f(int param0) {
        field_B = null;
        field_z = null;
        field_y = null;
        field_H = null;
        field_I = null;
        field_w = null;
        if (param0 <= 1) {
            field_v = -0.4149215519428253f;
        }
    }

    md() {
    }

    final static void a(byte param0, bc param1) {
        try {
            RuntimeException var2 = null;
            int var3 = 0;
            int var4 = 0;
            int var5 = 0;
            ClassNotFoundException var6 = null;
            InvalidClassException var6_ref = null;
            StreamCorruptedException var6_ref2 = null;
            OptionalDataException var6_ref3 = null;
            IllegalAccessException var6_ref4 = null;
            IllegalArgumentException var6_ref5 = null;
            java.lang.reflect.InvocationTargetException var6_ref6 = null;
            SecurityException var6_ref7 = null;
            IOException var6_ref8 = null;
            NullPointerException var6_ref9 = null;
            Exception var6_ref10 = null;
            Throwable var6_ref11 = null;
            int var6_int = 0;
            int var8 = 0;
            Object[] var9 = null;
            int var10_int = 0;
            Object var10 = null;
            ObjectInputStream var11 = null;
            int var12 = 0;
            nm var13 = null;
            java.lang.reflect.Field var15 = null;
            Object var16 = null;
            java.lang.reflect.Field var16_ref = null;
            nm var17 = null;
            Object var18 = null;
            java.lang.reflect.Field var19 = null;
            Object var20 = null;
            Object var22 = null;
            byte[][] var25 = null;
            java.lang.reflect.Field var26 = null;
            java.lang.reflect.Method var27 = null;
            java.lang.reflect.Method var28 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_69_0 = null;
            StringBuilder stackIn_69_1 = null;
            String stackIn_69_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_66_0 = null;
            StringBuilder stackOut_66_1 = null;
            RuntimeException stackOut_68_0 = null;
            StringBuilder stackOut_68_1 = null;
            String stackOut_68_2 = null;
            RuntimeException stackOut_67_0 = null;
            StringBuilder stackOut_67_1 = null;
            String stackOut_67_2 = null;
            var18 = null;
            var16 = null;
            var20 = null;
            var22 = null;
            var12 = TetraLink.field_J;
            try {
              L0: {
                var13 = (nm) (Object) bo.field_C.c(false);
                var17 = var13;
                if (var17 != null) {
                  var3 = 0;
                  var4 = 0;
                  if (param0 == -93) {
                    L1: while (true) {
                      if (var4 >= var17.field_r) {
                        if (var3 == 0) {
                          var4 = param1.field_t;
                          param1.d(var17.field_s, (byte) -124);
                          var5 = 0;
                          L2: while (true) {
                            if (var5 >= var17.field_r) {
                              int discarded$1 = param1.c(var4, param0 + -17);
                              var17.b(false);
                              break L0;
                            } else {
                              L3: {
                                if (var17.field_w[var5] != 0) {
                                  param1.a(var17.field_w[var5], false);
                                  break L3;
                                } else {
                                  try {
                                    L4: {
                                      L5: {
                                        var6_int = var17.field_z[var5];
                                        if (var6_int == 0) {
                                          var15 = (java.lang.reflect.Field) var17.field_x[var5].field_f;
                                          var8 = var15.getInt((Object) null);
                                          param1.a(0, false);
                                          param1.d(var8, (byte) -124);
                                          break L5;
                                        } else {
                                          if (1 == var6_int) {
                                            var16_ref = (java.lang.reflect.Field) var17.field_x[var5].field_f;
                                            var19 = var16_ref;
                                            var19.setInt((Object) null, var17.field_q[var5]);
                                            param1.a(0, false);
                                            break L5;
                                          } else {
                                            if (var6_int == 2) {
                                              var26 = (java.lang.reflect.Field) var17.field_x[var5].field_f;
                                              var8 = var26.getModifiers();
                                              param1.a(0, false);
                                              param1.d(var8, (byte) -124);
                                              break L5;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                      }
                                      L6: {
                                        if (var6_int == 3) {
                                          var28 = (java.lang.reflect.Method) var17.field_u[var5].field_f;
                                          var25 = var17.field_t[var5];
                                          var9 = new Object[var25.length];
                                          var10_int = 0;
                                          L7: while (true) {
                                            if (var25.length <= var10_int) {
                                              var10 = var28.invoke((Object) null, var9);
                                              if (var10 == null) {
                                                param1.a(0, false);
                                                break L6;
                                              } else {
                                                if (var10 instanceof Number) {
                                                  param1.a(1, false);
                                                  param1.a(-1, ((Number) var10).longValue());
                                                  break L6;
                                                } else {
                                                  if (var10 instanceof String) {
                                                    param1.a(2, false);
                                                    param1.a((String) var10, 0);
                                                    break L6;
                                                  } else {
                                                    param1.a(4, false);
                                                    break L6;
                                                  }
                                                }
                                              }
                                            } else {
                                              var11 = new ObjectInputStream((InputStream) (Object) new ByteArrayInputStream(var25[var10_int]));
                                              var9[var10_int] = var11.readObject();
                                              var10_int++;
                                              continue L7;
                                            }
                                          }
                                        } else {
                                          if (4 != var6_int) {
                                            break L6;
                                          } else {
                                            var27 = (java.lang.reflect.Method) var17.field_u[var5].field_f;
                                            var8 = var27.getModifiers();
                                            param1.a(0, false);
                                            param1.d(var8, (byte) -124);
                                            break L6;
                                          }
                                        }
                                      }
                                      break L4;
                                    }
                                  } catch (java.lang.IllegalAccessException decompiledCaughtParameter4) {
                                    decompiledCaughtException = decompiledCaughtParameter4;
                                    L12: {
                                      var6_ref4 = (IllegalAccessException) (Object) decompiledCaughtException;
                                      param1.a(-14, false);
                                      break L12;
                                    }
                                  } catch (java.lang.IllegalArgumentException decompiledCaughtParameter5) {
                                    decompiledCaughtException = decompiledCaughtParameter5;
                                    L13: {
                                      var6_ref5 = (IllegalArgumentException) (Object) decompiledCaughtException;
                                      param1.a(-15, false);
                                      break L13;
                                    }
                                  } catch (java.lang.reflect.InvocationTargetException decompiledCaughtParameter6) {
                                    decompiledCaughtException = decompiledCaughtParameter6;
                                    L14: {
                                      var6_ref6 = (java.lang.reflect.InvocationTargetException) (Object) decompiledCaughtException;
                                      param1.a(-16, false);
                                      break L14;
                                    }
                                  } catch (java.io.IOException decompiledCaughtParameter8) {
                                    decompiledCaughtException = decompiledCaughtParameter8;
                                    L16: {
                                      var6_ref8 = (IOException) (Object) decompiledCaughtException;
                                      param1.a(-18, false);
                                      break L16;
                                    }
                                  } catch (java.lang.NullPointerException decompiledCaughtParameter9) {
                                    decompiledCaughtException = decompiledCaughtParameter9;
                                    L17: {
                                      var6_ref9 = (NullPointerException) (Object) decompiledCaughtException;
                                      param1.a(-19, false);
                                      break L17;
                                    }
                                  } catch (java.lang.Exception decompiledCaughtParameter10) {
                                    decompiledCaughtException = decompiledCaughtParameter10;
                                    L18: {
                                      var6_ref10 = (Exception) (Object) decompiledCaughtException;
                                      param1.a(-20, false);
                                      break L18;
                                    }
                                  } catch (java.lang.Throwable decompiledCaughtParameter11) {
                                    decompiledCaughtException = decompiledCaughtParameter11;
                                    L19: {
                                      var6_ref11 = decompiledCaughtException;
                                      param1.a(-21, false);
                                      break L19;
                                    }
                                  }
                                  break L3;
                                }
                              }
                              var5++;
                              continue L2;
                            }
                          }
                        } else {
                          return;
                        }
                      } else {
                        L20: {
                          if (var13.field_x[var4] != null) {
                            L21: {
                              if (var13.field_x[var4].field_d == 2) {
                                var13.field_w[var4] = -5;
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            if (var13.field_x[var4].field_d == 0) {
                              var3 = 1;
                              break L20;
                            } else {
                              break L20;
                            }
                          } else {
                            break L20;
                          }
                        }
                        L22: {
                          if (null != var13.field_u[var4]) {
                            L23: {
                              if (2 == var13.field_u[var4].field_d) {
                                var13.field_w[var4] = -6;
                                break L23;
                              } else {
                                break L23;
                              }
                            }
                            if (var13.field_u[var4].field_d == 0) {
                              var3 = 1;
                              break L22;
                            } else {
                              break L22;
                            }
                          } else {
                            break L22;
                          }
                        }
                        var4++;
                        continue L1;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter12) {
              decompiledCaughtException = decompiledCaughtParameter12;
              L24: {
                var2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_66_0 = (RuntimeException) var2;
                stackOut_66_1 = new StringBuilder().append("md.Q(").append(param0).append(44);
                stackIn_68_0 = stackOut_66_0;
                stackIn_68_1 = stackOut_66_1;
                stackIn_67_0 = stackOut_66_0;
                stackIn_67_1 = stackOut_66_1;
                if (param1 == null) {
                  stackOut_68_0 = (RuntimeException) (Object) stackIn_68_0;
                  stackOut_68_1 = (StringBuilder) (Object) stackIn_68_1;
                  stackOut_68_2 = "null";
                  stackIn_69_0 = stackOut_68_0;
                  stackIn_69_1 = stackOut_68_1;
                  stackIn_69_2 = stackOut_68_2;
                  break L24;
                } else {
                  stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                  stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                  stackOut_67_2 = "{...}";
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_69_1 = stackOut_67_1;
                  stackIn_69_2 = stackOut_67_2;
                  break L24;
                }
              }
              throw oi.a((Throwable) (Object) stackIn_69_0, stackIn_69_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = "Searching for opponents";
        field_A = -1;
        field_H = "Hide game chat";
        field_z = "Detail: ";
        field_y = "Spectate <%0>'s game";
        field_w = "Rating";
    }
}
