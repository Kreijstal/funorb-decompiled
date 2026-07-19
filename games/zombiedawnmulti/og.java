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
        if ((fieldTemp$0 ^ -1) >= -1) {
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
        int var5 = mh.field_c.field_Pb + (mh.field_c.field_fc << -910194394);
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
          if (param1 > 98) {
            break L2;
          } else {
            og.b(64, 2);
            break L2;
          }
        }
        L3: {
          if (8364 == param0) {
            break L3;
          } else {
            if (338 == param0) {
              break L3;
            } else {
              if (param0 == 8212) {
                break L3;
              } else {
                if (param0 == 339) {
                  break L3;
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
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        RuntimeException var7 = null;
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
        tq stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        boolean stackIn_2_2 = false;
        int stackIn_2_3 = 0;
        tq stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        boolean stackIn_3_2 = false;
        int stackIn_3_3 = 0;
        tq stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        boolean stackIn_4_2 = false;
        int stackIn_4_3 = 0;
        int stackIn_4_4 = 0;
        Object stackIn_7_0 = null;
        jh stackIn_9_0 = null;
        cj stackIn_9_1 = null;
        cj stackIn_9_2 = null;
        long stackIn_9_3 = 0L;
        jh stackIn_10_0 = null;
        cj stackIn_10_1 = null;
        cj stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        jh stackIn_11_0 = null;
        cj stackIn_11_1 = null;
        cj stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        cj stackIn_11_4 = null;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        jh stackIn_30_0 = null;
        cj stackIn_30_1 = null;
        cj stackIn_30_2 = null;
        long stackIn_30_3 = 0L;
        jh stackIn_31_0 = null;
        cj stackIn_31_1 = null;
        cj stackIn_31_2 = null;
        long stackIn_31_3 = 0L;
        jh stackIn_32_0 = null;
        cj stackIn_32_1 = null;
        cj stackIn_32_2 = null;
        long stackIn_32_3 = 0L;
        cj stackIn_32_4 = null;
        int stackIn_36_0 = 0;
        int stackIn_82_0 = 0;
        int stackIn_90_0 = 0;
        ja[] stackIn_91_0 = null;
        ja[] stackIn_92_0 = null;
        ja[] stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        ja[] stackIn_100_0 = null;
        ja[] stackIn_101_0 = null;
        ja[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        Object stackIn_104_0 = null;
        ja[][] stackIn_104_1 = null;
        Object stackIn_109_0 = null;
        ja[][] stackIn_109_1 = null;
        boolean stackIn_154_0 = false;
        boolean stackIn_167_0 = false;
        String stackIn_177_0 = null;
        String stackIn_186_0 = null;
        String stackIn_191_0 = null;
        int stackIn_208_0 = 0;
        int stackIn_208_1 = 0;
        Object stackIn_210_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        tq stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        boolean stackOut_1_2 = false;
        int stackOut_1_3 = 0;
        tq stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        boolean stackOut_3_2 = false;
        int stackOut_3_3 = 0;
        int stackOut_3_4 = 0;
        tq stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        boolean stackOut_2_2 = false;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        Object stackOut_6_0 = null;
        jh stackOut_8_0 = null;
        cj stackOut_8_1 = null;
        cj stackOut_8_2 = null;
        long stackOut_8_3 = 0L;
        jh stackOut_10_0 = null;
        cj stackOut_10_1 = null;
        cj stackOut_10_2 = null;
        long stackOut_10_3 = 0L;
        cj stackOut_10_4 = null;
        jh stackOut_9_0 = null;
        cj stackOut_9_1 = null;
        cj stackOut_9_2 = null;
        long stackOut_9_3 = 0L;
        cj stackOut_9_4 = null;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        jh stackOut_29_0 = null;
        cj stackOut_29_1 = null;
        cj stackOut_29_2 = null;
        long stackOut_29_3 = 0L;
        jh stackOut_31_0 = null;
        cj stackOut_31_1 = null;
        cj stackOut_31_2 = null;
        long stackOut_31_3 = 0L;
        cj stackOut_31_4 = null;
        jh stackOut_30_0 = null;
        cj stackOut_30_1 = null;
        cj stackOut_30_2 = null;
        long stackOut_30_3 = 0L;
        cj stackOut_30_4 = null;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        ja[] stackOut_90_0 = null;
        ja[] stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        ja[] stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        ja[] stackOut_99_0 = null;
        ja[] stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        ja[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        Object stackOut_103_0 = null;
        ja[][] stackOut_103_1 = null;
        Object stackOut_108_0 = null;
        ja[][] stackOut_108_1 = null;
        boolean stackOut_153_0 = false;
        boolean stackOut_166_0 = false;
        String stackOut_176_0 = null;
        String stackOut_175_0 = null;
        String stackOut_185_0 = null;
        String stackOut_184_0 = null;
        String stackOut_182_0 = null;
        String stackOut_190_0 = null;
        String stackOut_189_0 = null;
        byte stackOut_207_0 = 0;
        int stackOut_207_1 = 0;
        Object stackOut_209_0 = null;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              stackOut_1_0 = ek.field_H;
              stackOut_1_1 = 2;
              stackOut_1_2 = param5;
              stackOut_1_3 = 2 * (jk.field_f + 2);
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              if (vc.field_d != ek.field_H) {
                stackOut_3_0 = (tq) ((Object) stackIn_3_0);
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
                stackOut_2_0 = (tq) ((Object) stackIn_2_0);
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
            var7_int = ((tq) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, (4 * jk.field_f - -8) * param6, -108) ? 1 : 0;
            var8 = ek.field_H.field_Gb.field_Cb;
            var9 = bl.a((byte) 99);
            var11 = null;
            var12 = (jh) ((Object) var8.c(105));
            L2: while (true) {
              L3: {
                L4: {
                  L5: {
                    L6: {
                      if (var12 == null) {
                        break L6;
                      } else {
                        var13 = 0;
                        stackOut_6_0 = null;
                        stackIn_210_0 = stackOut_6_0;
                        stackIn_7_0 = stackOut_6_0;
                        if (var41 != 0) {
                          break L4;
                        } else {
                          L7: {
                            if (stackIn_7_0 != var12.field_Cb) {
                              break L7;
                            } else {
                              L8: {
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
                                stackOut_8_0 = (jh) (var12);
                                stackOut_8_1 = null;
                                stackOut_8_2 = null;
                                stackOut_8_3 = 0L;
                                stackIn_10_0 = stackOut_8_0;
                                stackIn_10_1 = stackOut_8_1;
                                stackIn_10_2 = stackOut_8_2;
                                stackIn_10_3 = stackOut_8_3;
                                stackIn_9_0 = stackOut_8_0;
                                stackIn_9_1 = stackOut_8_1;
                                stackIn_9_2 = stackOut_8_2;
                                stackIn_9_3 = stackOut_8_3;
                                if (tb.field_u) {
                                  stackOut_10_0 = (jh) ((Object) stackIn_10_0);
                                  stackOut_10_1 = null;
                                  stackOut_10_2 = null;
                                  stackOut_10_3 = stackIn_10_3;
                                  stackOut_10_4 = wc.field_H;
                                  stackIn_11_0 = stackOut_10_0;
                                  stackIn_11_1 = stackOut_10_1;
                                  stackIn_11_2 = stackOut_10_2;
                                  stackIn_11_3 = stackOut_10_3;
                                  stackIn_11_4 = stackOut_10_4;
                                  break L8;
                                } else {
                                  stackOut_9_0 = (jh) ((Object) stackIn_9_0);
                                  stackOut_9_1 = null;
                                  stackOut_9_2 = null;
                                  stackOut_9_3 = stackIn_9_3;
                                  stackOut_9_4 = m.field_x;
                                  stackIn_11_0 = stackOut_9_0;
                                  stackIn_11_1 = stackOut_9_1;
                                  stackIn_11_2 = stackOut_9_2;
                                  stackIn_11_3 = stackOut_9_3;
                                  stackIn_11_4 = stackOut_9_4;
                                  break L8;
                                }
                              }
                              L9: {
                                stackIn_11_0.field_jc = new cj(stackIn_11_3, stackIn_11_4);
                                var12.a((byte) 50, var12.field_jc);
                                var12.field_Qb = new cj[kj.field_h];
                                var12.field_Xb = new cj(0L, (cj) null);
                                if ((var14 & 1 << jq.field_f) != 0) {
                                  var12.field_jc.a((byte) 50, var12.field_Xb);
                                  break L9;
                                } else {
                                  break L9;
                                }
                              }
                              L10: {
                                var12.field_kc = new cj(0L, (cj) null);
                                if (0 != (1 << ho.field_l & var14)) {
                                  var12.field_jc.a((byte) 50, var12.field_kc);
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                              L11: {
                                var12.field_Tb = new cj(0L, (cj) null);
                                if ((1 << el.field_M & var14) != 0) {
                                  var12.field_jc.a((byte) 50, var12.field_Tb);
                                  break L11;
                                } else {
                                  break L11;
                                }
                              }
                              L12: {
                                var12.field_ec = new cj(0L, (cj) null);
                                if ((1 << ti.field_J & var14 ^ -1) != -1) {
                                  var12.field_jc.a((byte) 50, var12.field_ec);
                                  break L12;
                                } else {
                                  break L12;
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
                              L13: while (true) {
                                L14: {
                                  if ((kj.field_h ^ -1) >= (var18_int ^ -1)) {
                                    break L14;
                                  } else {
                                    var12.field_Qb[var18_int] = new cj(0L, (cj) null);
                                    stackOut_25_0 = 0;
                                    stackOut_25_1 = 1 << var18_int + vm.field_ib & var14;
                                    stackIn_208_0 = stackOut_25_0;
                                    stackIn_208_1 = stackOut_25_1;
                                    stackIn_26_0 = stackOut_25_0;
                                    stackIn_26_1 = stackOut_25_1;
                                    if (var41 != 0) {
                                      break L5;
                                    } else {
                                      L15: {
                                        if (stackIn_26_0 == stackIn_26_1) {
                                          break L15;
                                        } else {
                                          var12.field_jc.a((byte) 50, var12.field_Qb[var18_int]);
                                          break L15;
                                        }
                                      }
                                      var12.field_Qb[var18_int].field_lb = 1;
                                      var18_int++;
                                      if (var41 == 0) {
                                        continue L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                }
                                L16: {
                                  stackOut_29_0 = (jh) (var12);
                                  stackOut_29_1 = null;
                                  stackOut_29_2 = null;
                                  stackOut_29_3 = 0L;
                                  stackIn_31_0 = stackOut_29_0;
                                  stackIn_31_1 = stackOut_29_1;
                                  stackIn_31_2 = stackOut_29_2;
                                  stackIn_31_3 = stackOut_29_3;
                                  stackIn_30_0 = stackOut_29_0;
                                  stackIn_30_1 = stackOut_29_1;
                                  stackIn_30_2 = stackOut_29_2;
                                  stackIn_30_3 = stackOut_29_3;
                                  if (tb.field_u) {
                                    stackOut_31_0 = (jh) ((Object) stackIn_31_0);
                                    stackOut_31_1 = null;
                                    stackOut_31_2 = null;
                                    stackOut_31_3 = stackIn_31_3;
                                    stackOut_31_4 = m.field_x;
                                    stackIn_32_0 = stackOut_31_0;
                                    stackIn_32_1 = stackOut_31_1;
                                    stackIn_32_2 = stackOut_31_2;
                                    stackIn_32_3 = stackOut_31_3;
                                    stackIn_32_4 = stackOut_31_4;
                                    break L16;
                                  } else {
                                    stackOut_30_0 = (jh) ((Object) stackIn_30_0);
                                    stackOut_30_1 = null;
                                    stackOut_30_2 = null;
                                    stackOut_30_3 = stackIn_30_3;
                                    stackOut_30_4 = wc.field_H;
                                    stackIn_32_0 = stackOut_30_0;
                                    stackIn_32_1 = stackOut_30_1;
                                    stackIn_32_2 = stackOut_30_2;
                                    stackIn_32_3 = stackOut_30_3;
                                    stackIn_32_4 = stackOut_30_4;
                                    break L16;
                                  }
                                }
                                stackIn_32_0.field_Yb = new cj(stackIn_32_3, stackIn_32_4);
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
                                break L7;
                              }
                            }
                          }
                          L17: {
                            var12.field_Kb.field_wb = null;
                            if (var12.field_Fb) {
                              stackOut_35_0 = param2;
                              stackIn_36_0 = stackOut_35_0;
                              break L17;
                            } else {
                              stackOut_34_0 = param4;
                              stackIn_36_0 = stackOut_34_0;
                              break L17;
                            }
                          }
                          var14 = stackIn_36_0;
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
                          L18: while (true) {
                            L19: {
                              L20: {
                                if (var22_int >= kj.field_h) {
                                  break L20;
                                } else {
                                  var12.field_Qb[var22_int].field_rb = null;
                                  var23 = var12.field_Qb[var22_int];
                                  var12.field_Qb[var22_int].field_z = 0;
                                  var23.field_zb = 0;
                                  var22_int++;
                                  if (var41 != 0) {
                                    break L19;
                                  } else {
                                    if (var41 == 0) {
                                      continue L18;
                                    } else {
                                      break L20;
                                    }
                                  }
                                }
                              }
                              var12.field_Xb.field_rb = null;
                              var12.field_Xb.field_z = 0;
                              break L19;
                            }
                            L21: {
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
                                break L21;
                              } else {
                                L22: {
                                  L23: {
                                    if (var12.field_Fb) {
                                      break L23;
                                    } else {
                                      L24: {
                                        L25: {
                                          if (var12.field_Ob) {
                                            break L25;
                                          } else {
                                            if (!var12.field_lc) {
                                              break L24;
                                            } else {
                                              break L25;
                                            }
                                          }
                                        }
                                        var12.field_oc.field_wb = ak.field_c;
                                        if (var41 == 0) {
                                          break L22;
                                        } else {
                                          break L24;
                                        }
                                      }
                                      L26: {
                                        if (!var12.field_Mb) {
                                          break L26;
                                        } else {
                                          var12.field_Kb.field_wb = bf.field_j;
                                          if (var41 == 0) {
                                            break L22;
                                          } else {
                                            break L26;
                                          }
                                        }
                                      }
                                      var12.field_Kb.field_wb = kn.field_c;
                                      if (var41 == 0) {
                                        break L22;
                                      } else {
                                        break L23;
                                      }
                                    }
                                  }
                                  L27: {
                                    if (var12.field_Sb >= 0) {
                                      break L27;
                                    } else {
                                      L28: {
                                        if (!var12.field_Wb) {
                                          break L28;
                                        } else {
                                          L29: {
                                            if (var12.field_Ob) {
                                              break L29;
                                            } else {
                                              if (!var12.field_lc) {
                                                break L28;
                                              } else {
                                                break L29;
                                              }
                                            }
                                          }
                                          var12.field_oc.field_wb = ak.field_c;
                                          if (var41 == 0) {
                                            break L22;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                      L30: {
                                        if (2 != var12.field_fc) {
                                          break L30;
                                        } else {
                                          var12.field_oc.field_wb = ap.field_u;
                                          if (var41 == 0) {
                                            break L22;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                      var12.field_Kb.field_wb = jb.field_a;
                                      if (var41 == 0) {
                                        break L22;
                                      } else {
                                        break L27;
                                      }
                                    }
                                  }
                                  var12.field_Kb.field_wb = ke.field_c;
                                  break L22;
                                }
                                L31: {
                                  L32: {
                                    if (var12.field_oc.field_wb != null) {
                                      break L32;
                                    } else {
                                      var12.field_Kb.a(jk.field_f, var31, 68, 0, -3344);
                                      if (var41 == 0) {
                                        break L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  var12.field_oc.a(jk.field_f, var31, 68, 0, -3344);
                                  break L31;
                                }
                                L33: {
                                  var12.field_Gb.field_wb = fm.a(var12.field_Gb.field_yb, var32, 78);
                                  var12.field_Gb.a(jk.field_f, var31, 78, 70, -3344);
                                  if (!var12.field_Gb.field_L) {
                                    break L33;
                                  } else {
                                    if (!var12.field_Gb.field_wb.equals(var32)) {
                                      ui.field_j = var32;
                                      break L33;
                                    } else {
                                      break L33;
                                    }
                                  }
                                }
                                L34: {
                                  L35: {
                                    var12.field_Ib.field_wb = Integer.toString(var12.field_cc);
                                    if (var12.field_Wb) {
                                      break L35;
                                    } else {
                                      var12.field_Ib.field_R = 1;
                                      var12.field_Ib.a(jk.field_f, var31, 48, 150, -3344);
                                      if (var41 == 0) {
                                        break L34;
                                      } else {
                                        break L35;
                                      }
                                    }
                                  }
                                  var12.field_Ib.field_R = 2;
                                  var12.field_gc.field_wb = "/" + var12.field_mc;
                                  var33_int = (348 - var12.field_gc.field_yb.a("/")) / 2;
                                  var12.field_Ib.a(jk.field_f, var31, -150 + var33_int, 150, -3344);
                                  var12.field_gc.a(jk.field_f, var31, 198 - var33_int, var33_int, -3344);
                                  break L34;
                                }
                                L36: {
                                  var12.field_Lb.field_wb = Integer.toString(var12.field_Ub);
                                  var12.field_Lb.a(jk.field_f, var31, 48, 200, -3344);
                                  if (tb.field_u) {
                                    stackOut_81_0 = 250;
                                    stackIn_82_0 = stackOut_81_0;
                                    break L36;
                                  } else {
                                    stackOut_80_0 = 200;
                                    stackIn_82_0 = stackOut_80_0;
                                    break L36;
                                  }
                                }
                                L37: {
                                  var33_int = stackIn_82_0;
                                  var12.field_jc.a(jk.field_f, var31, -var33_int + 365 + -2, var33_int, -3344);
                                  var34_int = ed.field_c;
                                  if ((var14 & 1 << jq.field_f) == 0) {
                                    break L37;
                                  } else {
                                    var50_ref = qp.field_u[var12.field_Pb];
                                    var12.field_Xb.field_rb = var50_ref;
                                    var12.field_Xb.a(var12.field_jc.field_z, 0, var50_ref.field_z, var34_int, -3344);
                                    var34_int = var34_int + (ed.field_c + var50_ref.field_z);
                                    break L37;
                                  }
                                }
                                L38: {
                                  if (0 == (var14 & 1 << ho.field_l)) {
                                    break L38;
                                  } else {
                                    L39: {
                                      L40: {
                                        if (var12.field_Ob) {
                                          break L40;
                                        } else {
                                          if (!var12.field_lc) {
                                            stackOut_89_0 = 0;
                                            stackIn_90_0 = stackOut_89_0;
                                            break L39;
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                      stackOut_88_0 = 1;
                                      stackIn_90_0 = stackOut_88_0;
                                      break L39;
                                    }
                                    L41: {
                                      var36 = stackIn_90_0;
                                      stackOut_90_0 = na.field_G;
                                      stackIn_92_0 = stackOut_90_0;
                                      stackIn_91_0 = stackOut_90_0;
                                      if (var36 == 0) {
                                        stackOut_92_0 = (ja[]) ((Object) stackIn_92_0);
                                        stackOut_92_1 = 0;
                                        stackIn_93_0 = stackOut_92_0;
                                        stackIn_93_1 = stackOut_92_1;
                                        break L41;
                                      } else {
                                        stackOut_91_0 = (ja[]) ((Object) stackIn_91_0);
                                        stackOut_91_1 = 1;
                                        stackIn_93_0 = stackOut_91_0;
                                        stackIn_93_1 = stackOut_91_1;
                                        break L41;
                                      }
                                    }
                                    var51_ref = stackIn_93_0[stackIn_93_1];
                                    var12.field_kc.field_rb = var51_ref;
                                    var12.field_kc.a(var12.field_jc.field_z, 0, var51_ref.field_z, var34_int, -3344);
                                    var34_int = var34_int + (ed.field_c + var51_ref.field_z);
                                    break L38;
                                  }
                                }
                                L42: {
                                  if (0 != (1 << el.field_M & var14)) {
                                    var52_ref = we.field_j[var12.field_fc + -1];
                                    var12.field_Tb.field_rb = var52_ref;
                                    var12.field_Tb.a(var12.field_jc.field_z, 0, var52_ref.field_z, var34_int, -3344);
                                    var34_int = var34_int + (ed.field_c + var52_ref.field_z);
                                    break L42;
                                  } else {
                                    break L42;
                                  }
                                }
                                L43: {
                                  if (-1 != (1 << ti.field_J & var14 ^ -1)) {
                                    L44: {
                                      stackOut_99_0 = ke.field_i;
                                      stackIn_101_0 = stackOut_99_0;
                                      stackIn_100_0 = stackOut_99_0;
                                      if (!var12.field_dc) {
                                        stackOut_101_0 = (ja[]) ((Object) stackIn_101_0);
                                        stackOut_101_1 = 0;
                                        stackIn_102_0 = stackOut_101_0;
                                        stackIn_102_1 = stackOut_101_1;
                                        break L44;
                                      } else {
                                        stackOut_100_0 = (ja[]) ((Object) stackIn_100_0);
                                        stackOut_100_1 = 1;
                                        stackIn_102_0 = stackOut_100_0;
                                        stackIn_102_1 = stackOut_100_1;
                                        break L44;
                                      }
                                    }
                                    var53_ref = stackIn_102_0[stackIn_102_1];
                                    var12.field_ec.field_rb = var53_ref;
                                    var12.field_ec.a(var12.field_jc.field_z, 0, var53_ref.field_z, var34_int, -3344);
                                    var34_int = var34_int + (var53_ref.field_z - -ed.field_c);
                                    break L43;
                                  } else {
                                    break L43;
                                  }
                                }
                                stackOut_103_0 = null;
                                stackOut_103_1 = um.field_g;
                                stackIn_104_0 = stackOut_103_0;
                                stackIn_104_1 = stackOut_103_1;
                                L45: while (true) {
                                  L46: {
                                    if (stackIn_104_0 != stackIn_104_1) {
                                      var36 = 0;
                                      L47: while (true) {
                                        if (kj.field_h <= var36) {
                                          break L46;
                                        } else {
                                          stackOut_108_0 = null;
                                          stackOut_108_1 = um.field_g;
                                          stackIn_104_0 = stackOut_108_0;
                                          stackIn_104_1 = stackOut_108_1;
                                          stackIn_109_0 = stackOut_108_0;
                                          stackIn_109_1 = stackOut_108_1;
                                          if (var41 != 0) {
                                            continue L45;
                                          } else {
                                            L48: {
                                              L49: {
                                                if (stackIn_109_0 != stackIn_109_1[var36]) {
                                                  break L49;
                                                } else {
                                                  if (var41 == 0) {
                                                    break L48;
                                                  } else {
                                                    break L49;
                                                  }
                                                }
                                              }
                                              L50: {
                                                if (0 != (var14 & 1 << vm.field_ib - -var36)) {
                                                  break L50;
                                                } else {
                                                  if (var41 == 0) {
                                                    break L48;
                                                  } else {
                                                    break L50;
                                                  }
                                                }
                                              }
                                              var42 = um.field_g[var36][255 & var12.field_Zb[var36]];
                                              var54 = var42;
                                              var12.field_Qb[var36].field_rb = var42;
                                              var12.field_Qb[var36].a(var12.field_jc.field_z, 0, var54.field_z, var34_int, -3344);
                                              var34_int = var34_int + (ed.field_c + var54.field_z);
                                              break L48;
                                            }
                                            var36++;
                                            if (var41 == 0) {
                                              continue L47;
                                            } else {
                                              break L46;
                                            }
                                          }
                                        }
                                      }
                                    } else {
                                      break L46;
                                    }
                                  }
                                  L51: {
                                    L52: {
                                      L53: {
                                        var36 = (var12.field_jc.field_zb - var34_int) / 2;
                                        if (var36 <= 0) {
                                          break L53;
                                        } else {
                                          var12.field_Xb.field_x = var12.field_Xb.field_x + var36;
                                          var12.field_kc.field_x = var12.field_kc.field_x + var36;
                                          var12.field_Tb.field_x = var12.field_Tb.field_x + var36;
                                          var12.field_ec.field_x = var12.field_ec.field_x + var36;
                                          var37_int = 0;
                                          L54: while (true) {
                                            if (kj.field_h <= var37_int) {
                                              break L53;
                                            } else {
                                              var12.field_Qb[var37_int].field_x = var12.field_Qb[var37_int].field_x + var36;
                                              var37_int++;
                                              if (var41 != 0) {
                                                break L52;
                                              } else {
                                                if (var41 == 0) {
                                                  continue L54;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var12.field_Fb) {
                                        var37_int = var12.field_Sb;
                                        break L52;
                                      } else {
                                        break L51;
                                      }
                                    }
                                    L55: {
                                      if (var37_int < 0) {
                                        var37_int = (int)(var9 + -var12.field_qc);
                                        break L55;
                                      } else {
                                        break L55;
                                      }
                                    }
                                    L56: {
                                      var38_int = var37_int / 1000;
                                      var39 = var38_int / 60;
                                      var38_int = var38_int % 60;
                                      if (60 > var39) {
                                        break L56;
                                      } else {
                                        var40 = var39 / 60;
                                        var39 = var39 % 60;
                                        var12.field_Yb.field_wb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                                        if (var41 == 0) {
                                          break L51;
                                        } else {
                                          break L56;
                                        }
                                      }
                                    }
                                    var12.field_Yb.field_wb = var39 + ":" + var38_int / 10 + var38_int % 10;
                                    break L51;
                                  }
                                  L57: {
                                    var12.field_Yb.a(jk.field_f, var31, var12.field_zb - 365, 365, -3344);
                                    var31 = var31 + jk.field_f;
                                    if (null != var12.field_bc) {
                                      var31 += 2;
                                      var37 = new StringBuilder(64);
                                      discarded$4 = var37.append(ko.field_k);
                                      discarded$5 = var37.append(var12.field_bc[0]);
                                      var38_int = 1;
                                      L58: while (true) {
                                        L59: {
                                          if (var12.field_cc <= var38_int) {
                                            break L59;
                                          } else {
                                            discarded$6 = var37.append(", ");
                                            discarded$7 = var37.append(var12.field_bc[var38_int]);
                                            var38_int++;
                                            if (var41 != 0) {
                                              break L57;
                                            } else {
                                              if (var41 == 0) {
                                                continue L58;
                                              } else {
                                                break L59;
                                              }
                                            }
                                          }
                                        }
                                        var38 = var37.toString();
                                        var12.field_ac.field_wb = var38;
                                        var39 = var12.field_ac.field_yb.b(var38, -(2 * var12.field_ac.field_V) + var12.field_zb);
                                        var12.field_ac.a(var39 * jk.field_f, var31, var12.field_zb, 0, -3344);
                                        var31 = var31 + jk.field_f * var39;
                                        break L57;
                                      }
                                    } else {
                                      break L57;
                                    }
                                  }
                                  L60: {
                                    if (!var12.field_lc) {
                                      break L60;
                                    } else {
                                      var12.field_hc.field_wb = vl.a(hj.field_b, new String[]{var32}, 2);
                                      var12.field_hc.a(jk.field_f, var31, var12.field_zb - 2 * nj.field_h, nj.field_h, -3344);
                                      var31 = var31 + jk.field_f;
                                      break L60;
                                    }
                                  }
                                  if (var12.field_rc) {
                                    var12.field_pc.field_wb = vl.a(be.field_k, new String[]{var32}, 2);
                                    var12.field_pc.a(jk.field_f, var31, var12.field_zb + -(nj.field_h * 2), nj.field_h, -3344);
                                    var31 = var31 + jk.field_f;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                              }
                            }
                            L61: {
                              var33 = hd.a(var12.field_Vb, var32, -9);
                              var34 = var33;
                              var34 = var33;
                              if (var33 == null) {
                                break L61;
                              } else {
                                var34_int = var12.field_Rb.field_yb.b(var33, -nj.field_h + (var12.field_zb - nj.field_h));
                                var12.field_Rb.field_Y = var12.field_Jb * 256 / so.field_r;
                                var12.field_Rb.field_wb = var33;
                                var12.field_Rb.a(var34_int * jk.field_f, var31, var12.field_zb - nj.field_h * 2, nj.field_h, -3344);
                                var31 = var31 + var34_int * jk.field_f;
                                break L61;
                              }
                            }
                            L62: {
                              if (var7_int != 0) {
                                break L62;
                              } else {
                                var12.field_I = var31 + -var12.field_z;
                                break L62;
                              }
                            }
                            L63: {
                              if (var13 == 0) {
                                break L63;
                              } else {
                                ek.field_H.field_Gb.a(2, var12, 1300, (cj) (var11));
                                break L63;
                              }
                            }
                            var34_int = 0;
                            L64: while (true) {
                              L65: {
                                L66: {
                                  if ((kj.field_h ^ -1) >= (var34_int ^ -1)) {
                                    break L66;
                                  } else {
                                    stackOut_153_0 = var12.field_Qb[var34_int].field_L;
                                    stackIn_167_0 = stackOut_153_0;
                                    stackIn_154_0 = stackOut_153_0;
                                    if (var41 != 0) {
                                      break L65;
                                    } else {
                                      L67: {
                                        if (stackIn_154_0) {
                                          L68: {
                                            if (kp.field_n == null) {
                                              var35 = null;
                                              break L68;
                                            } else {
                                              if (kp.field_n[var34_int] != null) {
                                                var35 = kp.field_n[var34_int][var12.field_Zb[var34_int] & 255];
                                                break L68;
                                              } else {
                                                var35 = null;
                                                break L68;
                                              }
                                            }
                                          }
                                          L69: {
                                            if (var35 == null) {
                                              break L69;
                                            } else {
                                              ui.field_j = cf.field_f[var34_int] + " - " + (String) (var35);
                                              if (var41 == 0) {
                                                break L67;
                                              } else {
                                                break L69;
                                              }
                                            }
                                          }
                                          ui.field_j = cf.field_f[var34_int];
                                          break L67;
                                        } else {
                                          break L67;
                                        }
                                      }
                                      var34_int++;
                                      if (var41 == 0) {
                                        continue L64;
                                      } else {
                                        break L66;
                                      }
                                    }
                                  }
                                }
                                stackOut_166_0 = var12.field_Xb.field_L;
                                stackIn_167_0 = stackOut_166_0;
                                break L65;
                              }
                              L70: {
                                if (!stackIn_167_0) {
                                  break L70;
                                } else {
                                  L71: {
                                    if (-2 != (var12.field_Pb ^ -1)) {
                                      var34 = t.field_c[var12.field_Pb];
                                      break L71;
                                    } else {
                                      var34 = cb.field_g;
                                      break L71;
                                    }
                                  }
                                  ui.field_j = vc.field_h + " - " + var34;
                                  break L70;
                                }
                              }
                              L72: {
                                if (var12.field_ec.field_L) {
                                  L73: {
                                    if (!var12.field_dc) {
                                      stackOut_176_0 = hp.field_m;
                                      stackIn_177_0 = stackOut_176_0;
                                      break L73;
                                    } else {
                                      stackOut_175_0 = mk.field_l;
                                      stackIn_177_0 = stackOut_175_0;
                                      break L73;
                                    }
                                  }
                                  ui.field_j = stackIn_177_0;
                                  break L72;
                                } else {
                                  break L72;
                                }
                              }
                              L74: {
                                if (!var12.field_kc.field_L) {
                                  break L74;
                                } else {
                                  L75: {
                                    L76: {
                                      if (var12.field_Ob) {
                                        break L76;
                                      } else {
                                        if (!var12.field_lc) {
                                          if (var12.field_Wb) {
                                            stackOut_185_0 = hp.field_i;
                                            stackIn_186_0 = stackOut_185_0;
                                            break L75;
                                          } else {
                                            stackOut_184_0 = lb.field_b;
                                            stackIn_186_0 = stackOut_184_0;
                                            break L75;
                                          }
                                        } else {
                                          break L76;
                                        }
                                      }
                                    }
                                    stackOut_182_0 = bk.field_j;
                                    stackIn_186_0 = stackOut_182_0;
                                    break L75;
                                  }
                                  ui.field_j = stackIn_186_0;
                                  break L74;
                                }
                              }
                              L77: {
                                if (!var12.field_Tb.field_L) {
                                  break L77;
                                } else {
                                  L78: {
                                    if (var12.field_fc == 2) {
                                      stackOut_190_0 = oe.field_a;
                                      stackIn_191_0 = stackOut_190_0;
                                      break L78;
                                    } else {
                                      stackOut_189_0 = qd.field_E;
                                      stackIn_191_0 = stackOut_189_0;
                                      break L78;
                                    }
                                  }
                                  ui.field_j = stackIn_191_0;
                                  break L77;
                                }
                              }
                              L79: {
                                if (0 == var12.field_T) {
                                  break L79;
                                } else {
                                  if (!var12.j(2)) {
                                    L80: {
                                      if (0 != var12.field_oc.field_T) {
                                        break L80;
                                      } else {
                                        qm.a(var12, param0, var32, -123);
                                        if (var41 == 0) {
                                          break L79;
                                        } else {
                                          break L80;
                                        }
                                      }
                                    }
                                    L81: {
                                      L82: {
                                        if (!var12.field_Fb) {
                                          break L82;
                                        } else {
                                          if (!var12.field_Wb) {
                                            break L81;
                                          } else {
                                            if (var12.field_Ob) {
                                              break L82;
                                            } else {
                                              if (!var12.field_lc) {
                                                break L81;
                                              } else {
                                                break L82;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      pl.a(param3, (byte) 92, var12.i(6));
                                      if (var41 == 0) {
                                        break L79;
                                      } else {
                                        break L81;
                                      }
                                    }
                                    kk.a(-108, var12.i(6), param3);
                                    break L79;
                                  } else {
                                    break L79;
                                  }
                                }
                              }
                              var12 = (jh) ((Object) var8.b(6));
                              if (var41 == 0) {
                                continue L2;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                    }
                    stackOut_207_0 = param1;
                    stackOut_207_1 = 111;
                    stackIn_208_0 = stackOut_207_0;
                    stackIn_208_1 = stackOut_207_1;
                    break L5;
                  }
                  if (stackIn_208_0 >= stackIn_208_1) {
                    break L3;
                  } else {
                    stackOut_209_0 = null;
                    stackIn_210_0 = stackOut_209_0;
                    break L4;
                  }
                }
                field_M = (String) ((Object) stackIn_210_0);
                break L3;
              }
              break L0;
            }
          }
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
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackIn_13_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
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
              L3: {
                L4: {
                  if (1 >= param2) {
                    break L4;
                  } else {
                    stackOut_5_0 = param2 & 1 ^ -1;
                    stackOut_5_1 = -1;
                    stackIn_11_0 = stackOut_5_0;
                    stackIn_11_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (var4 != 0) {
                      break L3;
                    } else {
                      L5: {
                        if (stackIn_6_0 != stackIn_6_1) {
                          var3_int = var3_int * param0;
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      param0 = param0 * param0;
                      param2 = param2 >> 1;
                      if (var4 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = param2;
                stackOut_10_1 = 1;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L3;
              }
              if (stackIn_11_0 != stackIn_11_1) {
                stackOut_14_0 = var3_int;
                stackIn_15_0 = stackOut_14_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackOut_12_0 = param0 * var3_int;
                stackIn_13_0 = stackOut_12_0;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3), "og.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_13_0;
        } else {
          return stackIn_15_0;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int discarded$2 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          if (param2 <= -114) {
            break L0;
          } else {
            discarded$2 = og.a(96, -108, -22);
            break L0;
          }
        }
        L1: {
          L2: {
            var4 = this.field_G >> 690195632;
            var5 = this.field_E >> 445340176;
            if (param1 >= 24 + (var4 + -7)) {
              break L2;
            } else {
              if (7 + (var4 + -24) >= param1) {
                break L2;
              } else {
                if ((param0 ^ -1) >= (5 + (-48 + var5) ^ -1)) {
                  break L2;
                } else {
                  if ((var5 + 2 ^ -1) >= (param0 ^ -1)) {
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
