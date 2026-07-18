/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        int fieldTemp$0 = ((og) this).field_R - 1;
        ((og) this).field_R = ((og) this).field_R - 1;
        if (fieldTemp$0 <= 0) {
            ((og) this).a(true);
            ((og) this).a(-4564);
            return;
        }
        if (param0 < 30) {
            field_T = null;
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
        field_P = null;
        field_S = null;
        field_M = null;
    }

    final static boolean a(char param0, byte param1) {
        L0: {
          if (param0 < 32) {
            break L0;
          } else {
            if (param0 > 126) {
              break L0;
            } else {
              return true;
            }
          }
        }
        L1: {
          if (param0 < 160) {
            break L1;
          } else {
            if (param0 > 255) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          if (8364 == param0) {
            break L2;
          } else {
            if (338 == param0) {
              break L2;
            } else {
              if (param0 == 8212) {
                break L2;
              } else {
                if (param0 == 339) {
                  break L2;
                } else {
                  if (376 != param0) {
                    return false;
                  } else {
                    return true;
                  }
                }
              }
            }
          }
        }
        return true;
    }

    final void a(int param0, rl param1) {
        try {
            super.a(param0, param1);
            if (param0 != -9019) {
                og.b(-123, -15);
            }
            ((og) this).field_R = ((og) this).field_A.field_m.a((byte) 32, ((og) this).field_O, 3000);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "og.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    og(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2);
        ((og) this).field_O = param3;
        ((og) this).field_R = 3000;
    }

    final static void a(boolean param0, byte param1, int param2, int param3, int param4, boolean param5, int param6) {
        int var7_int = 0;
        th var8 = null;
        long var9 = 0L;
        Object var11 = null;
        jh var12 = null;
        int var13 = 0;
        int var14 = 0;
        cj var18 = null;
        int var18_int = 0;
        cj var19 = null;
        cj var20 = null;
        cj var21 = null;
        int var22_int = 0;
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
        String var33 = null;
        int var33_int = 0;
        String var34 = null;
        int var34_int = 0;
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
        tq stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        boolean stackIn_1_2 = false;
        int stackIn_1_3 = 0;
        tq stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_2_2 = false;
        int stackIn_2_3 = 0;
        tq stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_3_2 = false;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        jh stackIn_7_0 = null;
        cj stackIn_7_1 = null;
        cj stackIn_7_2 = null;
        long stackIn_7_3 = 0L;
        jh stackIn_8_0 = null;
        cj stackIn_8_1 = null;
        cj stackIn_8_2 = null;
        long stackIn_8_3 = 0L;
        jh stackIn_9_0 = null;
        cj stackIn_9_1 = null;
        cj stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        cj stackIn_9_4 = null;
        jh stackIn_27_0 = null;
        cj stackIn_27_1 = null;
        cj stackIn_27_2 = null;
        long stackIn_27_3 = 0L;
        jh stackIn_28_0 = null;
        cj stackIn_28_1 = null;
        cj stackIn_28_2 = null;
        long stackIn_28_3 = 0L;
        jh stackIn_29_0 = null;
        cj stackIn_29_1 = null;
        cj stackIn_29_2 = null;
        long stackIn_29_3 = 0L;
        cj stackIn_29_4 = null;
        int stackIn_67_0 = 0;
        int stackIn_75_0 = 0;
        ja[] stackIn_76_0 = null;
        ja[] stackIn_77_0 = null;
        ja[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        ja[] stackIn_85_0 = null;
        ja[] stackIn_86_0 = null;
        ja[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        String stackIn_150_0 = null;
        String stackIn_159_0 = null;
        String stackIn_164_0 = null;
        tq stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        boolean stackOut_0_2 = false;
        int stackOut_0_3 = 0;
        tq stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        boolean stackOut_2_2 = false;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        tq stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        boolean stackOut_1_2 = false;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        jh stackOut_6_0 = null;
        cj stackOut_6_1 = null;
        cj stackOut_6_2 = null;
        long stackOut_6_3 = 0L;
        jh stackOut_8_0 = null;
        cj stackOut_8_1 = null;
        cj stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        cj stackOut_8_4 = null;
        jh stackOut_7_0 = null;
        cj stackOut_7_1 = null;
        cj stackOut_7_2 = null;
        long stackOut_7_3 = 0L;
        cj stackOut_7_4 = null;
        jh stackOut_26_0 = null;
        cj stackOut_26_1 = null;
        cj stackOut_26_2 = null;
        long stackOut_26_3 = 0L;
        jh stackOut_28_0 = null;
        cj stackOut_28_1 = null;
        cj stackOut_28_2 = null;
        long stackOut_28_3 = 0L;
        cj stackOut_28_4 = null;
        jh stackOut_27_0 = null;
        cj stackOut_27_1 = null;
        cj stackOut_27_2 = null;
        long stackOut_27_3 = 0L;
        cj stackOut_27_4 = null;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        ja[] stackOut_75_0 = null;
        ja[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        ja[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        ja[] stackOut_84_0 = null;
        ja[] stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        ja[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        String stackOut_149_0 = null;
        String stackOut_148_0 = null;
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
          var41 = ZombieDawnMulti.field_E ? 1 : 0;
          stackOut_0_0 = ek.field_H;
          stackOut_0_1 = 2;
          stackOut_0_2 = param5;
          stackOut_0_3 = 2 * (jk.field_f + 2);
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if (vc.field_d != ek.field_H) {
            stackOut_2_0 = (tq) (Object) stackIn_2_0;
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
            stackOut_1_0 = (tq) (Object) stackIn_1_0;
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
        var7_int = ((tq) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4 != 0, (4 * jk.field_f - -8) * param6, -108) ? 1 : 0;
        var8 = ek.field_H.field_Gb.field_Cb;
        var9 = bl.a((byte) 99);
        var11 = null;
        var12 = (jh) (Object) var8.c(105);
        L1: while (true) {
          if (var12 == null) {
            return;
          } else {
            L2: {
              var13 = 0;
              if (null != var12.field_Cb) {
                break L2;
              } else {
                L3: {
                  var14 = 16777215;
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
                  stackOut_6_0 = (jh) var12;
                  stackOut_6_1 = null;
                  stackOut_6_2 = null;
                  stackOut_6_3 = 0L;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  stackIn_8_2 = stackOut_6_2;
                  stackIn_8_3 = stackOut_6_3;
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  stackIn_7_3 = stackOut_6_3;
                  if (tb.field_u) {
                    stackOut_8_0 = (jh) (Object) stackIn_8_0;
                    stackOut_8_1 = null;
                    stackOut_8_2 = null;
                    stackOut_8_3 = stackIn_8_3;
                    stackOut_8_4 = wc.field_H;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    stackIn_9_2 = stackOut_8_2;
                    stackIn_9_3 = stackOut_8_3;
                    stackIn_9_4 = stackOut_8_4;
                    break L3;
                  } else {
                    stackOut_7_0 = (jh) (Object) stackIn_7_0;
                    stackOut_7_1 = null;
                    stackOut_7_2 = null;
                    stackOut_7_3 = stackIn_7_3;
                    stackOut_7_4 = m.field_x;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    stackIn_9_2 = stackOut_7_2;
                    stackIn_9_3 = stackOut_7_3;
                    stackIn_9_4 = stackOut_7_4;
                    break L3;
                  }
                }
                L4: {
                  stackIn_9_0.field_jc = new cj(stackIn_9_3, stackIn_9_4);
                  var12.a((byte) 50, var12.field_jc);
                  var12.field_Qb = new cj[kj.field_h];
                  var12.field_Xb = new cj(0L, (cj) null);
                  if ((var14 & 1 << jq.field_f) != 0) {
                    var12.field_jc.a((byte) 50, var12.field_Xb);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  var12.field_kc = new cj(0L, (cj) null);
                  if (0 != (1 << ho.field_l & var14)) {
                    var12.field_jc.a((byte) 50, var12.field_kc);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var12.field_Tb = new cj(0L, (cj) null);
                  if ((1 << el.field_M & var14) != 0) {
                    var12.field_jc.a((byte) 50, var12.field_Tb);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var12.field_ec = new cj(0L, (cj) null);
                  if ((1 << ti.field_J & var14) != 0) {
                    var12.field_jc.a((byte) 50, var12.field_ec);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var45 = var12.field_Xb;
                var44 = var12.field_ec;
                var43 = var12.field_kc;
                var12.field_Tb.field_lb = 1;
                var43.field_lb = 1;
                var44.field_lb = 1;
                var45.field_lb = 1;
                var18_int = 0;
                L8: while (true) {
                  if (kj.field_h <= var18_int) {
                    L9: {
                      stackOut_26_0 = (jh) var12;
                      stackOut_26_1 = null;
                      stackOut_26_2 = null;
                      stackOut_26_3 = 0L;
                      stackIn_28_0 = stackOut_26_0;
                      stackIn_28_1 = stackOut_26_1;
                      stackIn_28_2 = stackOut_26_2;
                      stackIn_28_3 = stackOut_26_3;
                      stackIn_27_0 = stackOut_26_0;
                      stackIn_27_1 = stackOut_26_1;
                      stackIn_27_2 = stackOut_26_2;
                      stackIn_27_3 = stackOut_26_3;
                      if (tb.field_u) {
                        stackOut_28_0 = (jh) (Object) stackIn_28_0;
                        stackOut_28_1 = null;
                        stackOut_28_2 = null;
                        stackOut_28_3 = stackIn_28_3;
                        stackOut_28_4 = m.field_x;
                        stackIn_29_0 = stackOut_28_0;
                        stackIn_29_1 = stackOut_28_1;
                        stackIn_29_2 = stackOut_28_2;
                        stackIn_29_3 = stackOut_28_3;
                        stackIn_29_4 = stackOut_28_4;
                        break L9;
                      } else {
                        stackOut_27_0 = (jh) (Object) stackIn_27_0;
                        stackOut_27_1 = null;
                        stackOut_27_2 = null;
                        stackOut_27_3 = stackIn_27_3;
                        stackOut_27_4 = wc.field_H;
                        stackIn_29_0 = stackOut_27_0;
                        stackIn_29_1 = stackOut_27_1;
                        stackIn_29_2 = stackOut_27_2;
                        stackIn_29_3 = stackOut_27_3;
                        stackIn_29_4 = stackOut_27_4;
                        break L9;
                      }
                    }
                    stackIn_29_0.field_Yb = new cj(stackIn_29_3, stackIn_29_4);
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
                    break L2;
                  } else {
                    L10: {
                      var12.field_Qb[var18_int] = new cj(0L, (cj) null);
                      if (0 == (1 << var18_int + vm.field_ib & var14)) {
                        break L10;
                      } else {
                        var12.field_jc.a((byte) 50, var12.field_Qb[var18_int]);
                        break L10;
                      }
                    }
                    var12.field_Qb[var18_int].field_lb = 1;
                    var18_int++;
                    continue L8;
                  }
                }
              }
            }
            L11: {
              var12.field_Kb.field_wb = null;
              if (var12.field_Fb) {
                break L11;
              } else {
                break L11;
              }
            }
            var14 = 16777215;
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
            var22_int = 0;
            L12: while (true) {
              if (var22_int >= kj.field_h) {
                L13: {
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
                  if (var12.j(2)) {
                    break L13;
                  } else {
                    L14: {
                      if (var12.field_Fb) {
                        if (var12.field_Sb >= 0) {
                          var12.field_Kb.field_wb = ke.field_c;
                          break L14;
                        } else {
                          L15: {
                            if (!var12.field_Wb) {
                              break L15;
                            } else {
                              L16: {
                                if (var12.field_Ob) {
                                  break L16;
                                } else {
                                  if (!var12.field_lc) {
                                    break L15;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              var12.field_oc.field_wb = ak.field_c;
                              break L14;
                            }
                          }
                          if (2 != var12.field_fc) {
                            var12.field_Kb.field_wb = jb.field_a;
                            break L14;
                          } else {
                            var12.field_oc.field_wb = ap.field_u;
                            break L14;
                          }
                        }
                      } else {
                        L17: {
                          if (var12.field_Ob) {
                            break L17;
                          } else {
                            if (!var12.field_lc) {
                              if (!var12.field_Mb) {
                                var12.field_Kb.field_wb = kn.field_c;
                                break L14;
                              } else {
                                var12.field_Kb.field_wb = bf.field_j;
                                break L14;
                              }
                            } else {
                              break L17;
                            }
                          }
                        }
                        var12.field_oc.field_wb = ak.field_c;
                        break L14;
                      }
                    }
                    L18: {
                      if (var12.field_oc.field_wb != null) {
                        var12.field_oc.a(jk.field_f, var31, 68, 0, -3344);
                        break L18;
                      } else {
                        var12.field_Kb.a(jk.field_f, var31, 68, 0, -3344);
                        break L18;
                      }
                    }
                    L19: {
                      var12.field_Gb.field_wb = fm.a(var12.field_Gb.field_yb, var32, 78);
                      var12.field_Gb.a(jk.field_f, var31, 78, 70, -3344);
                      if (!var12.field_Gb.field_L) {
                        break L19;
                      } else {
                        if (!var12.field_Gb.field_wb.equals((Object) (Object) var32)) {
                          ui.field_j = var32;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                    }
                    L20: {
                      var12.field_Ib.field_wb = Integer.toString(var12.field_cc);
                      if (var12.field_Wb) {
                        var12.field_Ib.field_R = 2;
                        var12.field_gc.field_wb = "/" + var12.field_mc;
                        var33_int = (348 - var12.field_gc.field_yb.a("/")) / 2;
                        var12.field_Ib.a(jk.field_f, var31, -150 + var33_int, 150, -3344);
                        var12.field_gc.a(jk.field_f, var31, 198 - var33_int, var33_int, -3344);
                        break L20;
                      } else {
                        var12.field_Ib.field_R = 1;
                        var12.field_Ib.a(jk.field_f, var31, 48, 150, -3344);
                        break L20;
                      }
                    }
                    L21: {
                      var12.field_Lb.field_wb = Integer.toString(var12.field_Ub);
                      var12.field_Lb.a(jk.field_f, var31, 48, 200, -3344);
                      if (tb.field_u) {
                        stackOut_66_0 = 250;
                        stackIn_67_0 = stackOut_66_0;
                        break L21;
                      } else {
                        stackOut_65_0 = 200;
                        stackIn_67_0 = stackOut_65_0;
                        break L21;
                      }
                    }
                    L22: {
                      var33_int = stackIn_67_0;
                      var12.field_jc.a(jk.field_f, var31, -var33_int + 363, var33_int, -3344);
                      var34_int = ed.field_c;
                      if ((var14 & 1 << jq.field_f) == 0) {
                        break L22;
                      } else {
                        var50_ref = qp.field_u[var12.field_Pb];
                        var12.field_Xb.field_rb = var50_ref;
                        var12.field_Xb.a(var12.field_jc.field_z, 0, var50_ref.field_z, var34_int, -3344);
                        var34_int = var34_int + (ed.field_c + var50_ref.field_z);
                        break L22;
                      }
                    }
                    L23: {
                      if (0 == (var14 & 1 << ho.field_l)) {
                        break L23;
                      } else {
                        L24: {
                          if (!var12.field_Ob) {
                            if (var12.field_lc) {
                              stackOut_74_0 = 1;
                              stackIn_75_0 = stackOut_74_0;
                              break L24;
                            } else {
                              stackOut_73_0 = 0;
                              stackIn_75_0 = stackOut_73_0;
                              break L24;
                            }
                          } else {
                            stackOut_71_0 = 1;
                            stackIn_75_0 = stackOut_71_0;
                            break L24;
                          }
                        }
                        L25: {
                          var36 = stackIn_75_0;
                          stackOut_75_0 = na.field_G;
                          stackIn_77_0 = stackOut_75_0;
                          stackIn_76_0 = stackOut_75_0;
                          if (var36 == 0) {
                            stackOut_77_0 = (ja[]) (Object) stackIn_77_0;
                            stackOut_77_1 = 0;
                            stackIn_78_0 = stackOut_77_0;
                            stackIn_78_1 = stackOut_77_1;
                            break L25;
                          } else {
                            stackOut_76_0 = (ja[]) (Object) stackIn_76_0;
                            stackOut_76_1 = 1;
                            stackIn_78_0 = stackOut_76_0;
                            stackIn_78_1 = stackOut_76_1;
                            break L25;
                          }
                        }
                        var51_ref = stackIn_78_0[stackIn_78_1];
                        var12.field_kc.field_rb = var51_ref;
                        var12.field_kc.a(var12.field_jc.field_z, 0, var51_ref.field_z, var34_int, -3344);
                        var34_int = var34_int + (ed.field_c + var51_ref.field_z);
                        break L23;
                      }
                    }
                    L26: {
                      if (0 != (1 << el.field_M & var14)) {
                        var52_ref = we.field_j[var12.field_fc + -1];
                        var12.field_Tb.field_rb = var52_ref;
                        var12.field_Tb.a(var12.field_jc.field_z, 0, var52_ref.field_z, var34_int, -3344);
                        var34_int = var34_int + (ed.field_c + var52_ref.field_z);
                        break L26;
                      } else {
                        break L26;
                      }
                    }
                    L27: {
                      if ((1 << ti.field_J & var14) != 0) {
                        L28: {
                          stackOut_84_0 = ke.field_i;
                          stackIn_86_0 = stackOut_84_0;
                          stackIn_85_0 = stackOut_84_0;
                          if (!var12.field_dc) {
                            stackOut_86_0 = (ja[]) (Object) stackIn_86_0;
                            stackOut_86_1 = 0;
                            stackIn_87_0 = stackOut_86_0;
                            stackIn_87_1 = stackOut_86_1;
                            break L28;
                          } else {
                            stackOut_85_0 = (ja[]) (Object) stackIn_85_0;
                            stackOut_85_1 = 1;
                            stackIn_87_0 = stackOut_85_0;
                            stackIn_87_1 = stackOut_85_1;
                            break L28;
                          }
                        }
                        var53_ref = stackIn_87_0[stackIn_87_1];
                        var12.field_ec.field_rb = var53_ref;
                        var12.field_ec.a(var12.field_jc.field_z, 0, var53_ref.field_z, var34_int, -3344);
                        var34_int = var34_int + (var53_ref.field_z - -ed.field_c);
                        break L27;
                      } else {
                        break L27;
                      }
                    }
                    L29: {
                      if (null != um.field_g) {
                        var36 = 0;
                        L30: while (true) {
                          if (kj.field_h <= var36) {
                            break L29;
                          } else {
                            L31: {
                              if (null != um.field_g[var36]) {
                                if (0 != (var14 & 1 << vm.field_ib - -var36)) {
                                  var42 = um.field_g[var36][255 & var12.field_Zb[var36]];
                                  var54 = var42;
                                  var12.field_Qb[var36].field_rb = var42;
                                  var12.field_Qb[var36].a(var12.field_jc.field_z, 0, var54.field_z, var34_int, -3344);
                                  var34_int = var34_int + (ed.field_c + var54.field_z);
                                  break L31;
                                } else {
                                  break L31;
                                }
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
                      var36 = (var12.field_jc.field_zb - var34_int) / 2;
                      if (var36 <= 0) {
                        break L32;
                      } else {
                        var12.field_Xb.field_x = var12.field_Xb.field_x + var36;
                        var12.field_kc.field_x = var12.field_kc.field_x + var36;
                        var12.field_Tb.field_x = var12.field_Tb.field_x + var36;
                        var12.field_ec.field_x = var12.field_ec.field_x + var36;
                        var37_int = 0;
                        L33: while (true) {
                          if (kj.field_h <= var37_int) {
                            break L32;
                          } else {
                            var12.field_Qb[var37_int].field_x = var12.field_Qb[var37_int].field_x + var36;
                            var37_int++;
                            continue L33;
                          }
                        }
                      }
                    }
                    L34: {
                      if (var12.field_Fb) {
                        L35: {
                          var37_int = var12.field_Sb;
                          if (var37_int < 0) {
                            var37_int = (int)(var9 + -var12.field_qc);
                            break L35;
                          } else {
                            break L35;
                          }
                        }
                        var38_int = var37_int / 1000;
                        var39 = var38_int / 60;
                        var38_int = var38_int % 60;
                        if (60 > var39) {
                          var12.field_Yb.field_wb = var39 + ":" + var38_int / 10 + var38_int % 10;
                          break L34;
                        } else {
                          var40 = var39 / 60;
                          var39 = var39 % 60;
                          var12.field_Yb.field_wb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                          break L34;
                        }
                      } else {
                        break L34;
                      }
                    }
                    L36: {
                      var12.field_Yb.a(jk.field_f, var31, var12.field_zb - 365, 365, -3344);
                      var31 = var31 + jk.field_f;
                      if (null != var12.field_bc) {
                        var31 += 2;
                        var37 = new StringBuilder(64);
                        StringBuilder discarded$4 = var37.append(ko.field_k);
                        StringBuilder discarded$5 = var37.append(var12.field_bc[0]);
                        var38_int = 1;
                        L37: while (true) {
                          if (var12.field_cc <= var38_int) {
                            var38 = var37.toString();
                            var12.field_ac.field_wb = var38;
                            var39 = var12.field_ac.field_yb.b(var38, -(2 * var12.field_ac.field_V) + var12.field_zb);
                            var12.field_ac.a(var39 * jk.field_f, var31, var12.field_zb, 0, -3344);
                            var31 = var31 + jk.field_f * var39;
                            break L36;
                          } else {
                            StringBuilder discarded$6 = var37.append(", ");
                            StringBuilder discarded$7 = var37.append(var12.field_bc[var38_int]);
                            var38_int++;
                            continue L37;
                          }
                        }
                      } else {
                        break L36;
                      }
                    }
                    L38: {
                      if (!var12.field_lc) {
                        break L38;
                      } else {
                        var12.field_hc.field_wb = vl.a(hj.field_b, new String[1], 2);
                        var12.field_hc.a(jk.field_f, var31, var12.field_zb - 2 * nj.field_h, nj.field_h, -3344);
                        var31 = var31 + jk.field_f;
                        break L38;
                      }
                    }
                    if (var12.field_rc) {
                      var12.field_pc.field_wb = vl.a(be.field_k, new String[1], 2);
                      var12.field_pc.a(jk.field_f, var31, var12.field_zb + -(nj.field_h * 2), nj.field_h, -3344);
                      var31 = var31 + jk.field_f;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                }
                L39: {
                  var33 = hd.a(var12.field_Vb, var32, -9);
                  var34 = var33;
                  var34 = var33;
                  if (var33 == null) {
                    break L39;
                  } else {
                    var34_int = var12.field_Rb.field_yb.b(var33, -nj.field_h + (var12.field_zb - nj.field_h));
                    var12.field_Rb.field_Y = var12.field_Jb * 256 / so.field_r;
                    var12.field_Rb.field_wb = var33;
                    var12.field_Rb.a(var34_int * jk.field_f, var31, var12.field_zb - nj.field_h * 2, nj.field_h, -3344);
                    var31 = var31 + var34_int * jk.field_f;
                    break L39;
                  }
                }
                L40: {
                  if (var7_int != 0) {
                    break L40;
                  } else {
                    var12.field_I = var31 + -var12.field_z;
                    break L40;
                  }
                }
                L41: {
                  if (var13 == 0) {
                    break L41;
                  } else {
                    ek.field_H.field_Gb.a(2, (cj) (Object) var12, 1300, (cj) var11);
                    break L41;
                  }
                }
                var34_int = 0;
                L42: while (true) {
                  if (kj.field_h <= var34_int) {
                    L43: {
                      if (!var12.field_Xb.field_L) {
                        break L43;
                      } else {
                        L44: {
                          if (var12.field_Pb != 1) {
                            var34 = t.field_c[var12.field_Pb];
                            break L44;
                          } else {
                            var34 = cb.field_g;
                            break L44;
                          }
                        }
                        ui.field_j = vc.field_h + " - " + var34;
                        break L43;
                      }
                    }
                    L45: {
                      if (var12.field_ec.field_L) {
                        L46: {
                          if (!var12.field_dc) {
                            stackOut_149_0 = hp.field_m;
                            stackIn_150_0 = stackOut_149_0;
                            break L46;
                          } else {
                            stackOut_148_0 = mk.field_l;
                            stackIn_150_0 = stackOut_148_0;
                            break L46;
                          }
                        }
                        ui.field_j = stackIn_150_0;
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                    L47: {
                      if (!var12.field_kc.field_L) {
                        break L47;
                      } else {
                        L48: {
                          L49: {
                            if (var12.field_Ob) {
                              break L49;
                            } else {
                              if (!var12.field_lc) {
                                if (var12.field_Wb) {
                                  stackOut_158_0 = hp.field_i;
                                  stackIn_159_0 = stackOut_158_0;
                                  break L48;
                                } else {
                                  stackOut_157_0 = lb.field_b;
                                  stackIn_159_0 = stackOut_157_0;
                                  break L48;
                                }
                              } else {
                                break L49;
                              }
                            }
                          }
                          stackOut_155_0 = bk.field_j;
                          stackIn_159_0 = stackOut_155_0;
                          break L48;
                        }
                        ui.field_j = stackIn_159_0;
                        break L47;
                      }
                    }
                    L50: {
                      if (!var12.field_Tb.field_L) {
                        break L50;
                      } else {
                        L51: {
                          if (var12.field_fc == 2) {
                            stackOut_163_0 = oe.field_a;
                            stackIn_164_0 = stackOut_163_0;
                            break L51;
                          } else {
                            stackOut_162_0 = qd.field_E;
                            stackIn_164_0 = stackOut_162_0;
                            break L51;
                          }
                        }
                        ui.field_j = stackIn_164_0;
                        break L50;
                      }
                    }
                    L52: {
                      if (0 == var12.field_T) {
                        break L52;
                      } else {
                        if (!var12.j(2)) {
                          if (0 != var12.field_oc.field_T) {
                            L53: {
                              if (!var12.field_Fb) {
                                break L53;
                              } else {
                                L54: {
                                  if (!var12.field_Wb) {
                                    break L54;
                                  } else {
                                    if (var12.field_Ob) {
                                      break L53;
                                    } else {
                                      if (!var12.field_lc) {
                                        break L54;
                                      } else {
                                        break L53;
                                      }
                                    }
                                  }
                                }
                                kk.a(-108, var12.i(6), 11);
                                break L52;
                              }
                            }
                            pl.a(11, (byte) 92, var12.i(6));
                            break L52;
                          } else {
                            qm.a(var12, true, var32, -123);
                            break L52;
                          }
                        } else {
                          var12 = (jh) (Object) var8.b(6);
                          continue L1;
                        }
                      }
                    }
                    var12 = (jh) (Object) var8.b(6);
                    continue L1;
                  } else {
                    L55: {
                      if (var12.field_Qb[var34_int].field_L) {
                        L56: {
                          if (kp.field_n == null) {
                            var35 = null;
                            break L56;
                          } else {
                            if (kp.field_n[var34_int] != null) {
                              var35 = (Object) (Object) kp.field_n[var34_int][var12.field_Zb[var34_int] & 255];
                              break L56;
                            } else {
                              var35 = null;
                              break L56;
                            }
                          }
                        }
                        if (var35 == null) {
                          ui.field_j = cf.field_f[var34_int];
                          break L55;
                        } else {
                          ui.field_j = cf.field_f[var34_int] + " - " + (String) var35;
                          break L55;
                        }
                      } else {
                        break L55;
                      }
                    }
                    var34_int++;
                    continue L42;
                  }
                }
              } else {
                var12.field_Qb[var22_int].field_rb = null;
                var23 = var12.field_Qb[var22_int];
                var12.field_Qb[var22_int].field_z = 0;
                var23.field_zb = 0;
                var22_int++;
                continue L12;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 200) {
                break L1;
              } else {
                og.b(-87, 110);
                break L1;
              }
            }
            var3_int = 1;
            L2: while (true) {
              if (1 >= param2) {
                if (param2 != 1) {
                  stackOut_12_0 = var3_int;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = param0 * var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                L3: {
                  if ((param2 & 1) != 0) {
                    var3_int = var3_int * param0;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                param0 = param0 * param0;
                param2 = param2 >> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) (Object) var3, "og.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_13_0;
    }

    final boolean b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param2 <= -114) {
            break L0;
          } else {
            int discarded$2 = og.a(96, -108, -22);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = ((og) this).field_G >> 16;
            var5 = ((og) this).field_E >> 16;
            if (param1 >= 24 + (var4 + -7)) {
              break L2;
            } else {
              if (7 + (var4 + -24) >= param1) {
                break L2;
              } else {
                if (param0 <= 5 + (-48 + var5)) {
                  break L2;
                } else {
                  if (var5 + 2 <= param0) {
                    break L2;
                  } else {
                    stackOut_6_0 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    break L1;
                  }
                }
              }
            }
          }
          stackOut_7_0 = 0;
          stackIn_8_0 = stackOut_7_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        hk.field_a = true;
        try {
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            var4 = -1L;
            dc.a(var4, param1, var2, -100, var3);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "og.V(" + 0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_T = "Return to game";
        field_M = "Creating your account";
        field_P = "You could learn more about humans.";
        field_S = "Fast";
        field_N = true;
    }
}
