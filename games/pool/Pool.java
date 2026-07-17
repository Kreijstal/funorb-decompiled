/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public final class Pool extends ep {
    static kf[] field_N;
    static long field_Q;
    static nm field_I;
    static String field_M;
    static int[] field_L;
    static vh field_P;
    static String field_K;
    static rk field_J;
    public static int field_O;

    private final void a(boolean param0, int param1) {
        int var3_int = 0;
        String var3 = null;
        int var4 = 0;
        uf var4_ref_uf = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        String[] var10 = null;
        uf stackIn_25_0 = null;
        uf stackIn_26_0 = null;
        uf stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        uf stackIn_31_0 = null;
        uf stackIn_32_0 = null;
        uf stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        uf stackIn_80_0 = null;
        uf stackIn_80_1 = null;
        int stackIn_80_2 = 0;
        int stackIn_80_3 = 0;
        int stackIn_80_4 = 0;
        int stackIn_80_5 = 0;
        int stackIn_80_6 = 0;
        uf stackIn_81_0 = null;
        uf stackIn_81_1 = null;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        int stackIn_81_4 = 0;
        int stackIn_81_5 = 0;
        int stackIn_81_6 = 0;
        uf stackIn_82_0 = null;
        uf stackIn_82_1 = null;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        int stackIn_82_4 = 0;
        int stackIn_82_5 = 0;
        int stackIn_82_6 = 0;
        int stackIn_82_7 = 0;
        int stackIn_85_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_86_1 = 0;
        int stackIn_87_0 = 0;
        int stackIn_87_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        uf stackIn_94_0 = null;
        uf stackIn_94_1 = null;
        int stackIn_94_2 = 0;
        int stackIn_94_3 = 0;
        int stackIn_94_4 = 0;
        int stackIn_94_5 = 0;
        int stackIn_94_6 = 0;
        uf stackIn_95_0 = null;
        uf stackIn_95_1 = null;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackIn_95_4 = 0;
        int stackIn_95_5 = 0;
        int stackIn_95_6 = 0;
        uf stackIn_96_0 = null;
        uf stackIn_96_1 = null;
        int stackIn_96_2 = 0;
        int stackIn_96_3 = 0;
        int stackIn_96_4 = 0;
        int stackIn_96_5 = 0;
        int stackIn_96_6 = 0;
        int stackIn_96_7 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        uf stackIn_116_0 = null;
        uf stackIn_116_1 = null;
        int stackIn_116_2 = 0;
        int stackIn_116_3 = 0;
        int stackIn_116_4 = 0;
        int stackIn_116_5 = 0;
        int stackIn_116_6 = 0;
        uf stackIn_117_0 = null;
        uf stackIn_117_1 = null;
        int stackIn_117_2 = 0;
        int stackIn_117_3 = 0;
        int stackIn_117_4 = 0;
        int stackIn_117_5 = 0;
        int stackIn_117_6 = 0;
        uf stackIn_118_0 = null;
        uf stackIn_118_1 = null;
        int stackIn_118_2 = 0;
        int stackIn_118_3 = 0;
        int stackIn_118_4 = 0;
        int stackIn_118_5 = 0;
        int stackIn_118_6 = 0;
        int stackIn_118_7 = 0;
        int stackIn_121_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_124_2 = 0;
        uf stackOut_24_0 = null;
        uf stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        uf stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        uf stackOut_30_0 = null;
        uf stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        uf stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        uf stackOut_79_0 = null;
        uf stackOut_79_1 = null;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        int stackOut_79_4 = 0;
        int stackOut_79_5 = 0;
        int stackOut_79_6 = 0;
        uf stackOut_81_0 = null;
        uf stackOut_81_1 = null;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        int stackOut_81_4 = 0;
        int stackOut_81_5 = 0;
        int stackOut_81_6 = 0;
        int stackOut_81_7 = 0;
        uf stackOut_80_0 = null;
        uf stackOut_80_1 = null;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        int stackOut_80_4 = 0;
        int stackOut_80_5 = 0;
        int stackOut_80_6 = 0;
        int stackOut_80_7 = 0;
        int stackOut_84_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_85_1 = 0;
        int stackOut_87_0 = 0;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        uf stackOut_93_0 = null;
        uf stackOut_93_1 = null;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        int stackOut_93_4 = 0;
        int stackOut_93_5 = 0;
        int stackOut_93_6 = 0;
        uf stackOut_95_0 = null;
        uf stackOut_95_1 = null;
        int stackOut_95_2 = 0;
        int stackOut_95_3 = 0;
        int stackOut_95_4 = 0;
        int stackOut_95_5 = 0;
        int stackOut_95_6 = 0;
        int stackOut_95_7 = 0;
        uf stackOut_94_0 = null;
        uf stackOut_94_1 = null;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        int stackOut_94_4 = 0;
        int stackOut_94_5 = 0;
        int stackOut_94_6 = 0;
        int stackOut_94_7 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_109_0 = 0;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        uf stackOut_115_0 = null;
        uf stackOut_115_1 = null;
        int stackOut_115_2 = 0;
        int stackOut_115_3 = 0;
        int stackOut_115_4 = 0;
        int stackOut_115_5 = 0;
        int stackOut_115_6 = 0;
        uf stackOut_117_0 = null;
        uf stackOut_117_1 = null;
        int stackOut_117_2 = 0;
        int stackOut_117_3 = 0;
        int stackOut_117_4 = 0;
        int stackOut_117_5 = 0;
        int stackOut_117_6 = 0;
        int stackOut_117_7 = 0;
        uf stackOut_116_0 = null;
        uf stackOut_116_1 = null;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        int stackOut_116_4 = 0;
        int stackOut_116_5 = 0;
        int stackOut_116_6 = 0;
        int stackOut_116_7 = 0;
        int stackOut_120_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_123_0 = 0;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        L0: {
          var6 = field_O;
          if (me.field_o != me.field_s) {
            if (th.field_b == me.field_s) {
              uk.field_m = uk.field_m + 1;
              if (uk.field_m == 16) {
                L1: {
                  if (nm.field_c) {
                    ab.a(param1);
                    break L1;
                  } else {
                    o.c((byte) 60);
                    break L1;
                  }
                }
                me.field_s = fk.field_V;
                break L0;
              } else {
                break L0;
              }
            } else {
              if (fk.field_V != me.field_s) {
                uk.field_m = uk.field_m - 1;
                if (uk.field_m == 0) {
                  me.field_s = me.field_o;
                  break L0;
                } else {
                  break L0;
                }
              } else {
                L2: {
                  if (hk.b(param1 + 16)) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                me.field_s = aa.field_d;
                break L0;
              }
            }
          } else {
            L3: {
              var3_int = 0;
              var4 = 0;
              if (!param0) {
                if (sq.field_b != ne.field_w) {
                  sg.field_P = sg.field_P + 1;
                  int discarded$5 = 46;
                  ih.a();
                  if (sg.field_P == 32) {
                    al.l(param1 + -128);
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (ne.field_w != -1) {
                    if (ne.field_w == -2) {
                      var3_int = 1;
                      break L3;
                    } else {
                      if (!dn.a(true, ne.field_w)) {
                        break L3;
                      } else {
                        s.field_c[ne.field_w].d(-1);
                        break L3;
                      }
                    }
                  } else {
                    if (td.field_d) {
                      var4 = 1;
                      var3_int = 1;
                      break L3;
                    } else {
                      ba.field_ub.a(false, true, (byte) -9);
                      L4: while (true) {
                        if (!n.h(127)) {
                          break L3;
                        } else {
                          ba.field_ub.p((byte) 101);
                          continue L4;
                        }
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (!td.field_d) {
                break L5;
              } else {
                if (ub.field_p) {
                  break L5;
                } else {
                  if (br.field_H) {
                    break L5;
                  } else {
                    L6: {
                      if (!ib.field_v) {
                        break L6;
                      } else {
                        if (!rg.field_p) {
                          break L6;
                        } else {
                          var3_int = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      i.a(10, var3_int != 0);
                      if (!mj.field_e) {
                        break L7;
                      } else {
                        L8: {
                          stackOut_24_0 = am.field_e;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (0 == fl.field_q.field_R) {
                            stackOut_26_0 = (uf) (Object) stackIn_26_0;
                            stackOut_26_1 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            break L8;
                          } else {
                            stackOut_25_0 = (uf) (Object) stackIn_25_0;
                            stackOut_25_1 = 1;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            break L8;
                          }
                        }
                        ((uf) (Object) stackIn_27_0).a(stackIn_27_1 != 0, var4 != 0, (byte) -118);
                        break L7;
                      }
                    }
                    L9: {
                      if (ib.field_v) {
                        L10: {
                          int discarded$6 = 320;
                          ie.a(180, var4 != 0, param1 + -17156);
                          stackOut_30_0 = ba.field_ub;
                          stackIn_32_0 = stackOut_30_0;
                          stackIn_31_0 = stackOut_30_0;
                          if (fl.field_q.field_R == 0) {
                            stackOut_32_0 = (uf) (Object) stackIn_32_0;
                            stackOut_32_1 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            stackIn_33_1 = stackOut_32_1;
                            break L10;
                          } else {
                            stackOut_31_0 = (uf) (Object) stackIn_31_0;
                            stackOut_31_1 = 1;
                            stackIn_33_0 = stackOut_31_0;
                            stackIn_33_1 = stackOut_31_1;
                            break L10;
                          }
                        }
                        ((uf) (Object) stackIn_33_0).a(stackIn_33_1 != 0, var4 != 0, (byte) -108);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L11: while (true) {
                      if (!n.h(127)) {
                        break L5;
                      } else {
                        L12: {
                          if (!un.field_b) {
                            break L12;
                          } else {
                            if (ib.field_v) {
                              if (!rj.a(15, 12, -1, 13)) {
                                break L12;
                              } else {
                                continue L11;
                              }
                            } else {
                              boolean discarded$7 = pa.a(false, 15, 13, 12);
                              break L12;
                            }
                          }
                        }
                        L13: {
                          if (mj.field_e) {
                            am.field_e.p((byte) 94);
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        if (ib.field_v) {
                          ba.field_ub.p((byte) 81);
                          continue L11;
                        } else {
                          continue L11;
                        }
                      }
                    }
                  }
                }
              }
            }
            L14: {
              if (!td.field_d) {
                mj.a(true);
                break L14;
              } else {
                break L14;
              }
            }
            L15: {
              if (!un.field_b) {
                if (eq.field_U > 0) {
                  eq.field_U = eq.field_U - 1;
                  break L15;
                } else {
                  break L15;
                }
              } else {
                if (ir.field_h > eq.field_U) {
                  eq.field_U = eq.field_U + 1;
                  break L15;
                } else {
                  break L15;
                }
              }
            }
            fn.b(5938, eq.field_U);
            if (null == ui.field_U.c((byte) 99)) {
              break L0;
            } else {
              int fieldTemp$8 = aa.field_h + 1;
              aa.field_h = aa.field_h + 1;
              if (fieldTemp$8 != 335) {
                break L0;
              } else {
                aa.field_h = 0;
                ma discarded$9 = ui.field_U.e((byte) -41);
                break L0;
              }
            }
          }
        }
        L16: {
          if (-3 == sq.field_b) {
            ti.field_d = null;
            var7 = new String[fr.field_n];
            var9 = var7;
            var4 = 0;
            L17: while (true) {
              if (var4 >= fr.field_n) {
                L18: {
                  stackOut_79_0 = null;
                  stackOut_79_1 = null;
                  stackOut_79_2 = oj.field_m;
                  stackOut_79_3 = la.field_a;
                  stackOut_79_4 = er.field_W;
                  stackOut_79_5 = re.field_f;
                  stackOut_79_6 = re.field_f;
                  stackIn_81_0 = stackOut_79_0;
                  stackIn_81_1 = stackOut_79_1;
                  stackIn_81_2 = stackOut_79_2;
                  stackIn_81_3 = stackOut_79_3;
                  stackIn_81_4 = stackOut_79_4;
                  stackIn_81_5 = stackOut_79_5;
                  stackIn_81_6 = stackOut_79_6;
                  stackIn_80_0 = stackOut_79_0;
                  stackIn_80_1 = stackOut_79_1;
                  stackIn_80_2 = stackOut_79_2;
                  stackIn_80_3 = stackOut_79_3;
                  stackIn_80_4 = stackOut_79_4;
                  stackIn_80_5 = stackOut_79_5;
                  stackIn_80_6 = stackOut_79_6;
                  if (un.field_e != 0) {
                    stackOut_81_0 = null;
                    stackOut_81_1 = null;
                    stackOut_81_2 = stackIn_81_2;
                    stackOut_81_3 = stackIn_81_3;
                    stackOut_81_4 = stackIn_81_4;
                    stackOut_81_5 = stackIn_81_5;
                    stackOut_81_6 = stackIn_81_6;
                    stackOut_81_7 = 0;
                    stackIn_82_0 = stackOut_81_0;
                    stackIn_82_1 = stackOut_81_1;
                    stackIn_82_2 = stackOut_81_2;
                    stackIn_82_3 = stackOut_81_3;
                    stackIn_82_4 = stackOut_81_4;
                    stackIn_82_5 = stackOut_81_5;
                    stackIn_82_6 = stackOut_81_6;
                    stackIn_82_7 = stackOut_81_7;
                    break L18;
                  } else {
                    stackOut_80_0 = null;
                    stackOut_80_1 = null;
                    stackOut_80_2 = stackIn_80_2;
                    stackOut_80_3 = stackIn_80_3;
                    stackOut_80_4 = stackIn_80_4;
                    stackOut_80_5 = stackIn_80_5;
                    stackOut_80_6 = stackIn_80_6;
                    stackOut_80_7 = 1;
                    stackIn_82_0 = stackOut_80_0;
                    stackIn_82_1 = stackOut_80_1;
                    stackIn_82_2 = stackOut_80_2;
                    stackIn_82_3 = stackOut_80_3;
                    stackIn_82_4 = stackOut_80_4;
                    stackIn_82_5 = stackOut_80_5;
                    stackIn_82_6 = stackOut_80_6;
                    stackIn_82_7 = stackOut_80_7;
                    break L18;
                  }
                }
                L19: {
                  ba.field_ub = new uf(stackIn_82_2, stackIn_82_3, stackIn_82_4, stackIn_82_5, stackIn_82_6, stackIn_82_7 != 0, var9, 0, false);
                  if (!jd.field_a) {
                    stackOut_84_0 = 0;
                    stackIn_85_0 = stackOut_84_0;
                    break L19;
                  } else {
                    stackOut_83_0 = 1;
                    stackIn_85_0 = stackOut_83_0;
                    break L19;
                  }
                }
                L20: {
                  var4 = stackIn_85_0;
                  stackOut_85_0 = param1 + -3405;
                  stackOut_85_1 = -1;
                  stackIn_87_0 = stackOut_85_0;
                  stackIn_87_1 = stackOut_85_1;
                  stackIn_86_0 = stackOut_85_0;
                  stackIn_86_1 = stackOut_85_1;
                  if (mg.a(true)) {
                    stackOut_87_0 = stackIn_87_0;
                    stackOut_87_1 = stackIn_87_1;
                    stackOut_87_2 = 21;
                    stackIn_88_0 = stackOut_87_0;
                    stackIn_88_1 = stackOut_87_1;
                    stackIn_88_2 = stackOut_87_2;
                    break L20;
                  } else {
                    stackOut_86_0 = stackIn_86_0;
                    stackOut_86_1 = stackIn_86_1;
                    stackOut_86_2 = 0;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    stackIn_88_2 = stackOut_86_2;
                    break L20;
                  }
                }
                fq.a(stackIn_88_0, stackIn_88_1, stackIn_88_2, var4 != 0);
                jc.field_c = true;
                break L16;
              } else {
                var7[var4] = jo.field_I[var4];
                var4++;
                continue L17;
              }
            }
          } else {
            break L16;
          }
        }
        L21: {
          if (sq.field_b != -7) {
            break L21;
          } else {
            ti.field_d = null;
            var8 = new String[fr.field_n];
            var10 = var8;
            var4 = 0;
            L22: while (true) {
              if (var4 >= fr.field_n) {
                L23: {
                  stackOut_93_0 = null;
                  stackOut_93_1 = null;
                  stackOut_93_2 = oj.field_m;
                  stackOut_93_3 = la.field_a;
                  stackOut_93_4 = er.field_W;
                  stackOut_93_5 = re.field_f;
                  stackOut_93_6 = re.field_f;
                  stackIn_95_0 = stackOut_93_0;
                  stackIn_95_1 = stackOut_93_1;
                  stackIn_95_2 = stackOut_93_2;
                  stackIn_95_3 = stackOut_93_3;
                  stackIn_95_4 = stackOut_93_4;
                  stackIn_95_5 = stackOut_93_5;
                  stackIn_95_6 = stackOut_93_6;
                  stackIn_94_0 = stackOut_93_0;
                  stackIn_94_1 = stackOut_93_1;
                  stackIn_94_2 = stackOut_93_2;
                  stackIn_94_3 = stackOut_93_3;
                  stackIn_94_4 = stackOut_93_4;
                  stackIn_94_5 = stackOut_93_5;
                  stackIn_94_6 = stackOut_93_6;
                  if (un.field_e != 0) {
                    stackOut_95_0 = null;
                    stackOut_95_1 = null;
                    stackOut_95_2 = stackIn_95_2;
                    stackOut_95_3 = stackIn_95_3;
                    stackOut_95_4 = stackIn_95_4;
                    stackOut_95_5 = stackIn_95_5;
                    stackOut_95_6 = stackIn_95_6;
                    stackOut_95_7 = 0;
                    stackIn_96_0 = stackOut_95_0;
                    stackIn_96_1 = stackOut_95_1;
                    stackIn_96_2 = stackOut_95_2;
                    stackIn_96_3 = stackOut_95_3;
                    stackIn_96_4 = stackOut_95_4;
                    stackIn_96_5 = stackOut_95_5;
                    stackIn_96_6 = stackOut_95_6;
                    stackIn_96_7 = stackOut_95_7;
                    break L23;
                  } else {
                    stackOut_94_0 = null;
                    stackOut_94_1 = null;
                    stackOut_94_2 = stackIn_94_2;
                    stackOut_94_3 = stackIn_94_3;
                    stackOut_94_4 = stackIn_94_4;
                    stackOut_94_5 = stackIn_94_5;
                    stackOut_94_6 = stackIn_94_6;
                    stackOut_94_7 = 1;
                    stackIn_96_0 = stackOut_94_0;
                    stackIn_96_1 = stackOut_94_1;
                    stackIn_96_2 = stackOut_94_2;
                    stackIn_96_3 = stackOut_94_3;
                    stackIn_96_4 = stackOut_94_4;
                    stackIn_96_5 = stackOut_94_5;
                    stackIn_96_6 = stackOut_94_6;
                    stackIn_96_7 = stackOut_94_7;
                    break L23;
                  }
                }
                L24: {
                  var4_ref_uf = new uf(stackIn_96_2, stackIn_96_3, stackIn_96_4, stackIn_96_5, stackIn_96_6, stackIn_96_7 != 0, var10, 0, false);
                  var4_ref_uf.field_I.a(ga.a(512, true, ea.field_r), -1, 0, (ba.field_ub.field_I.field_A - -1) % fr.field_n, param1 ^ 19063);
                  ba.field_ub = var4_ref_uf;
                  var5 = jd.field_a ? 1 : 0;
                  stackOut_96_0 = -3405;
                  stackOut_96_1 = -1;
                  stackIn_98_0 = stackOut_96_0;
                  stackIn_98_1 = stackOut_96_1;
                  stackIn_97_0 = stackOut_96_0;
                  stackIn_97_1 = stackOut_96_1;
                  if (mg.a(true)) {
                    stackOut_98_0 = stackIn_98_0;
                    stackOut_98_1 = stackIn_98_1;
                    stackOut_98_2 = 21;
                    stackIn_99_0 = stackOut_98_0;
                    stackIn_99_1 = stackOut_98_1;
                    stackIn_99_2 = stackOut_98_2;
                    break L24;
                  } else {
                    stackOut_97_0 = stackIn_97_0;
                    stackOut_97_1 = stackIn_97_1;
                    stackOut_97_2 = 0;
                    stackIn_99_0 = stackOut_97_0;
                    stackIn_99_1 = stackOut_97_1;
                    stackIn_99_2 = stackOut_97_2;
                    break L24;
                  }
                }
                fq.a(stackIn_99_0, stackIn_99_1, stackIn_99_2, var5 != 0);
                jc.field_c = true;
                break L21;
              } else {
                var8[var4] = jo.field_I[var4];
                var4++;
                continue L22;
              }
            }
          }
        }
        L25: {
          if (sq.field_b == -6) {
            L26: {
              ti.field_d = null;
              var3 = di.field_j;
              if (var3 != null) {
                break L26;
              } else {
                var3 = vq.field_Zb;
                break L26;
              }
            }
            L27: {
              ba.field_ub = new uf(vh.field_Ab, new String[1]);
              if (!jd.field_a) {
                stackOut_106_0 = 0;
                stackIn_107_0 = stackOut_106_0;
                break L27;
              } else {
                stackOut_105_0 = 1;
                stackIn_107_0 = stackOut_105_0;
                break L27;
              }
            }
            L28: {
              var4 = stackIn_107_0;
              stackOut_107_0 = param1 + -3405;
              stackOut_107_1 = -1;
              stackIn_109_0 = stackOut_107_0;
              stackIn_109_1 = stackOut_107_1;
              stackIn_108_0 = stackOut_107_0;
              stackIn_108_1 = stackOut_107_1;
              if (mg.a(true)) {
                stackOut_109_0 = stackIn_109_0;
                stackOut_109_1 = stackIn_109_1;
                stackOut_109_2 = 21;
                stackIn_110_0 = stackOut_109_0;
                stackIn_110_1 = stackOut_109_1;
                stackIn_110_2 = stackOut_109_2;
                break L28;
              } else {
                stackOut_108_0 = stackIn_108_0;
                stackOut_108_1 = stackIn_108_1;
                stackOut_108_2 = 0;
                stackIn_110_0 = stackOut_108_0;
                stackIn_110_1 = stackOut_108_1;
                stackIn_110_2 = stackOut_108_2;
                break L28;
              }
            }
            fq.a(stackIn_110_0, stackIn_110_1, stackIn_110_2, var4 != 0);
            jc.field_c = true;
            break L25;
          } else {
            break L25;
          }
        }
        L29: {
          if (sq.field_b != -8) {
            break L29;
          } else {
            L30: {
              ti.field_d = null;
              var3 = di.field_j;
              if (var3 == null) {
                var3 = vq.field_Zb;
                break L30;
              } else {
                break L30;
              }
            }
            L31: {
              stackOut_115_0 = null;
              stackOut_115_1 = null;
              stackOut_115_2 = f.field_f;
              stackOut_115_3 = -1;
              stackOut_115_4 = 4;
              stackOut_115_5 = 0;
              stackOut_115_6 = 0;
              stackIn_117_0 = stackOut_115_0;
              stackIn_117_1 = stackOut_115_1;
              stackIn_117_2 = stackOut_115_2;
              stackIn_117_3 = stackOut_115_3;
              stackIn_117_4 = stackOut_115_4;
              stackIn_117_5 = stackOut_115_5;
              stackIn_117_6 = stackOut_115_6;
              stackIn_116_0 = stackOut_115_0;
              stackIn_116_1 = stackOut_115_1;
              stackIn_116_2 = stackOut_115_2;
              stackIn_116_3 = stackOut_115_3;
              stackIn_116_4 = stackOut_115_4;
              stackIn_116_5 = stackOut_115_5;
              stackIn_116_6 = stackOut_115_6;
              if (un.field_e != 0) {
                stackOut_117_0 = null;
                stackOut_117_1 = null;
                stackOut_117_2 = stackIn_117_2;
                stackOut_117_3 = stackIn_117_3;
                stackOut_117_4 = stackIn_117_4;
                stackOut_117_5 = stackIn_117_5;
                stackOut_117_6 = stackIn_117_6;
                stackOut_117_7 = 0;
                stackIn_118_0 = stackOut_117_0;
                stackIn_118_1 = stackOut_117_1;
                stackIn_118_2 = stackOut_117_2;
                stackIn_118_3 = stackOut_117_3;
                stackIn_118_4 = stackOut_117_4;
                stackIn_118_5 = stackOut_117_5;
                stackIn_118_6 = stackOut_117_6;
                stackIn_118_7 = stackOut_117_7;
                break L31;
              } else {
                stackOut_116_0 = null;
                stackOut_116_1 = null;
                stackOut_116_2 = stackIn_116_2;
                stackOut_116_3 = stackIn_116_3;
                stackOut_116_4 = stackIn_116_4;
                stackOut_116_5 = stackIn_116_5;
                stackOut_116_6 = stackIn_116_6;
                stackOut_116_7 = 1;
                stackIn_118_0 = stackOut_116_0;
                stackIn_118_1 = stackOut_116_1;
                stackIn_118_2 = stackOut_116_2;
                stackIn_118_3 = stackOut_116_3;
                stackIn_118_4 = stackOut_116_4;
                stackIn_118_5 = stackOut_116_5;
                stackIn_118_6 = stackOut_116_6;
                stackIn_118_7 = stackOut_116_7;
                break L31;
              }
            }
            L32: {
              ba.field_ub = new uf(stackIn_118_2, stackIn_118_3, stackIn_118_4, stackIn_118_5, stackIn_118_6, stackIn_118_7 != 0, new String[1], 0, false);
              if (!jd.field_a) {
                stackOut_120_0 = 0;
                stackIn_121_0 = stackOut_120_0;
                break L32;
              } else {
                stackOut_119_0 = 1;
                stackIn_121_0 = stackOut_119_0;
                break L32;
              }
            }
            L33: {
              var4 = stackIn_121_0;
              stackOut_121_0 = -3405;
              stackOut_121_1 = -1;
              stackIn_123_0 = stackOut_121_0;
              stackIn_123_1 = stackOut_121_1;
              stackIn_122_0 = stackOut_121_0;
              stackIn_122_1 = stackOut_121_1;
              if (!mg.a(true)) {
                stackOut_123_0 = stackIn_123_0;
                stackOut_123_1 = stackIn_123_1;
                stackOut_123_2 = 0;
                stackIn_124_0 = stackOut_123_0;
                stackIn_124_1 = stackOut_123_1;
                stackIn_124_2 = stackOut_123_2;
                break L33;
              } else {
                stackOut_122_0 = stackIn_122_0;
                stackOut_122_1 = stackIn_122_1;
                stackOut_122_2 = 21;
                stackIn_124_0 = stackOut_122_0;
                stackIn_124_1 = stackOut_122_1;
                stackIn_124_2 = stackOut_122_2;
                break L33;
              }
            }
            fq.a(stackIn_124_0, stackIn_124_1, stackIn_124_2, var4 != 0);
            jc.field_c = true;
            break L29;
          }
        }
        L34: {
          if (sq.field_b == -4) {
            ej.field_j.b(false, 9);
            ub.field_p = true;
            sq.field_b = ne.field_w;
            eq.field_U = ir.field_h;
            break L34;
          } else {
            break L34;
          }
        }
        L35: {
          if (sq.field_b != -5) {
            break L35;
          } else {
            nf.a(em.field_L.g(20872), true, 11);
            sq.field_b = ne.field_w;
            br.field_H = true;
            break L35;
          }
        }
        L36: {
          if (param1 == 0) {
            break L36;
          } else {
            field_Q = -123L;
            break L36;
          }
        }
    }

    public static void c(boolean param0) {
        field_L = null;
        field_P = null;
        field_K = null;
        field_J = null;
        field_N = null;
        field_I = null;
        if (param0) {
            field_K = null;
        }
        field_M = null;
    }

    final void a(byte param0) {
        java.awt.Canvas var2 = null;
        int var10 = 0;
        java.awt.Canvas var11 = null;
        var10 = field_O;
        var11 = vj.a((byte) -126);
        var2 = var11;
        if (ue.a((byte) -123)) {
          fo.a((byte) -55, fq.m(0), var11);
          return;
        } else {
          vc.a(true, var11);
          return;
        }
    }

    final void h(byte param0) {
        L0: {
          Pool.c(false);
          fb.b();
          dp.c(param0 ^ -3723);
          int discarded$209 = -101;
          bq.c();
          int discarded$210 = -102;
          ko.d();
          int discarded$211 = -75;
          ab.b();
          il.a(param0 ^ 41);
          int discarded$212 = 19545;
          l.a();
          o.e(116);
          md.a(true);
          int discarded$213 = -71;
          hp.a();
          int discarded$214 = -22799;
          tm.d();
          int discarded$215 = -93;
          jk.b();
          int discarded$216 = 0;
          ag.a();
          oo.l(-15631);
          int discarded$217 = 112;
          cj.m();
          int discarded$218 = 76;
          vf.e();
          ob.d((byte) 107);
          int discarded$219 = 0;
          pj.b();
          int discarded$220 = -1;
          fo.a();
          int discarded$221 = 0;
          ra.a();
          int discarded$222 = 24470;
          ta.b();
          int discarded$223 = 101;
          pk.a();
          ep.a(true);
          oa.a(param0 ^ -28);
          kq.g((byte) -77);
          int discarded$224 = 1;
          ej.a();
          int discarded$225 = -109;
          ql.a();
          int discarded$226 = 35;
          id.a();
          qh.a();
          int discarded$227 = 0;
          di.e();
          int discarded$228 = 4109;
          ge.e();
          int discarded$229 = -125;
          rl.a();
          int discarded$230 = 112;
          lf.a();
          int discarded$231 = 118;
          wb.a();
          int discarded$232 = 123;
          kc.a();
          int discarded$233 = 80;
          dq.a();
          int discarded$234 = 0;
          a.a();
          bi.a(0);
          hn.b(param0 + 39);
          m.a((byte) -69);
          pn.a(param0 ^ -28);
          ol.a(param0 ^ -1430775244);
          int discarded$235 = 124;
          sb.a();
          kb.a((byte) 111);
          int discarded$236 = -26830;
          iq.a();
          rb.a((byte) 126);
          int discarded$237 = 255;
          od.a();
          int discarded$238 = -44;
          hr.c();
          int discarded$239 = 117;
          no.b();
          int discarded$240 = 10;
          rn.b();
          int discarded$241 = 84;
          qd.a();
          ir.a((byte) -42);
          vb.a(true);
          int discarded$242 = -1;
          s.a();
          int discarded$243 = -110;
          d.a();
          int discarded$244 = -107;
          ek.a();
          int discarded$245 = -43;
          fc.a();
          int discarded$246 = 8;
          vh.e();
          hh.a(28882);
          int discarded$247 = 0;
          hg.b();
          int discarded$248 = -13679;
          c.a();
          eg.f();
          lr.a();
          cf.a(param0 + 28774);
          uf.c(true);
          nk.d(param0 + 28);
          ma.b((byte) 115);
          vk.c(-819201);
          int discarded$249 = 91;
          bm.a();
          gq.g();
          ib.d(-1);
          bp.c();
          rq.c((byte) 75);
          cb.a(param0 + 28583);
          ic.a(-512);
          int discarded$250 = -124;
          kh.g();
          int discarded$251 = -109;
          tk.b();
          int discarded$252 = -48;
          im.f();
          ae.a((byte) -26);
          int discarded$253 = 0;
          tc.a();
          int discarded$254 = -5;
          aa.a();
          de.b(-1);
          int discarded$255 = 15059;
          th.a();
          int discarded$256 = -76;
          cl.a();
          int discarded$257 = 112;
          uc.b();
          aq.a(false);
          pl.a(param0 + -23306);
          int discarded$258 = 114;
          qe.d();
          ul.a((byte) -27);
          int discarded$259 = 1;
          gf.a();
          int discarded$260 = -24061;
          lk.a();
          int discarded$261 = 63;
          gp.a();
          int discarded$262 = 5;
          hq.i();
          int discarded$263 = 10;
          al.b();
          kj.b(param0 ^ 9401);
          int discarded$264 = 1;
          oq.c();
          mm.c(-13569);
          or.a(false);
          li.a(param0 ^ 81);
          pq.b((byte) -66);
          bf.c((byte) 77);
          int discarded$265 = 0;
          dl.b();
          sq.d(13);
          int discarded$266 = 0;
          jq.a();
          ia.g(80);
          int discarded$267 = 20592;
          ad.a();
          oh.a((byte) -92);
          lh.a((byte) -41);
          int discarded$268 = -125;
          je.a();
          int discarded$269 = -47;
          lq.g();
          fq.l(param0 + 33);
          int discarded$270 = 7585;
          wa.n();
          int discarded$271 = -124;
          ba.k();
          int discarded$272 = -86;
          qq.n();
          int discarded$273 = 4;
          nf.h();
          int discarded$274 = 20868;
          nr.a();
          int discarded$275 = -31360;
          ui.a();
          int discarded$276 = 0;
          jp.a();
          ke.a(false);
          int discarded$277 = -83;
          mj.a();
          int discarded$278 = 127;
          ii.a();
          nc.e();
          int discarded$279 = 75;
          p.b();
          int discarded$280 = 116;
          ec.a();
          int discarded$281 = 0;
          mk.a();
          hm.a(param0 + 144);
          int discarded$282 = 117;
          vc.d();
          so.c(param0 ^ -9943);
          qo.c((byte) 11);
          rg.c(-3604);
          jc.a(param0 ^ -28);
          bh.a(false);
          wg.f(-1);
          int discarded$283 = 118;
          db.h();
          int discarded$284 = 126;
          vq.f();
          int discarded$285 = 1;
          ao.d();
          kn.c((byte) -116);
          of.f(param0 + 28);
          wm.f((byte) -93);
          vi.b(-115);
          int discarded$286 = 108;
          da.b();
          uo.f((byte) -102);
          int discarded$287 = 1;
          vn.a();
          fh.a((byte) 62);
          int discarded$288 = 86;
          td.a();
          int discarded$289 = 0;
          rk.a();
          int discarded$290 = 21546;
          jh.a();
          int discarded$291 = 0;
          tp.a();
          bb.a((byte) -118);
          nm.a(false);
          int discarded$292 = -2182;
          gd.a();
          int discarded$293 = 62;
          w.a();
          int discarded$294 = 0;
          ue.b();
          int discarded$295 = 1;
          wn.a();
          jj.i(100);
          uj.a((byte) 33);
          int discarded$296 = 56;
          fn.g();
          int discarded$297 = -69;
          ll.a();
          int discarded$298 = 1;
          gn.a();
          int discarded$299 = 43;
          jl.a();
          tf.a(param0 ^ -91);
          re.a(param0 ^ 17031);
          int discarded$300 = -1;
          wd.f();
          int discarded$301 = 0;
          aj.c();
          ij.a(param0 + -273542787);
          en.a(param0 ^ -8380);
          v.a((byte) 126);
          int discarded$302 = 1;
          ho.a();
          int discarded$303 = 87;
          ff.a();
          int discarded$304 = 11468;
          dr.a();
          t.c(param0 ^ 88);
          int discarded$305 = 0;
          mq.a();
          int discarded$306 = 0;
          fj.b();
          um.a(116);
          int discarded$307 = 1;
          ef.b();
          int discarded$308 = 0;
          ah.a();
          int discarded$309 = -101;
          un.a();
          int discarded$310 = 71;
          ni.e();
          fk.m(param0 + -100);
          int discarded$311 = -116;
          gh.e();
          int discarded$312 = 1;
          mf.i();
          nn.a(param0 + 16034);
          int discarded$313 = 120;
          vl.i();
          jr.i(10860);
          to.i(param0 ^ -20);
          ac.i(85);
          pi.b();
          int discarded$314 = -89;
          be.f();
          pa.g(param0 + -73);
          jo.f(8);
          int discarded$315 = -79;
          lb.g();
          int discarded$316 = -126;
          em.g();
          int discarded$317 = 0;
          tl.g();
          int discarded$318 = -90;
          b.f();
          int discarded$319 = 0;
          el.b();
          int discarded$320 = 0;
          br.b();
          hd.b(true);
          int discarded$321 = 74;
          cm.g();
          sg.f(param0 ^ -506724219);
          og.f((byte) -103);
          ug.h(param0 ^ 80);
          int discarded$322 = 1;
          wo.a();
          int discarded$323 = 1;
          np.a();
          int discarded$324 = -80;
          dg.c();
          up.a(true);
          int discarded$325 = -25;
          pp.a();
          gr.f(-121);
          int discarded$326 = 105;
          f.a();
          gk.i((byte) -82);
          am.a((byte) 119);
          gm.a();
          int discarded$327 = -47;
          oc.c();
          int discarded$328 = -8;
          bc.a();
          int discarded$329 = 45;
          bo.b();
          wf.a(25131);
          int discarded$330 = -44;
          mg.a();
          int discarded$331 = -90;
          cq.a();
          int discarded$332 = 38;
          cn.b();
          int discarded$333 = 0;
          qg.a();
          int discarded$334 = -30521;
          wi.b();
          int discarded$335 = 4;
          mb.c();
          rh.a();
          int discarded$336 = -8090;
          uq.a();
          int discarded$337 = 726237729;
          ja.a();
          qk.a(param0 ^ 32);
          hl.a(false);
          int discarded$338 = 1;
          lg.a();
          int discarded$339 = -1;
          vd.a();
          int discarded$340 = -108;
          nd.a();
          if (param0 == -28) {
            break L0;
          } else {
            field_P = null;
            break L0;
          }
        }
        int discarded$341 = 0;
        op.b();
        ei.c((byte) 80);
        int discarded$342 = 72;
        fe.f();
        ud.a(param0 ^ -80);
        tj.h((byte) -16);
        int discarded$343 = -1;
        oe.h();
        int discarded$344 = 2;
        ch.f();
        int discarded$345 = 13;
        rp.a();
        mr.a();
        int discarded$346 = 1;
        cp.b();
        int discarded$347 = 0;
        hf.a();
        int discarded$348 = 0;
        wp.a();
        la.a(param0 ^ -115);
        qp.h(param0 ^ 99);
        int discarded$349 = -70;
        ee.a();
        int discarded$350 = -62;
        wh.a();
        sf.e(param0 + -89);
        int discarded$351 = -111;
        ap.c();
        int discarded$352 = 0;
        fg.a();
        bg.a(param0 + 16885);
        lo.c(param0 + 149);
        hk.c((byte) 122);
        jf.c(2);
        int discarded$353 = -24420;
        pc.a();
        int discarded$354 = 1;
        dj.a();
        int discarded$355 = 8;
        ld.c();
        pb.a();
        int discarded$356 = 127;
        te.c();
        e.a(true);
        int discarded$357 = 101;
        q.a();
        int discarded$358 = 8;
        ci.a();
        ti.a(param0 ^ 20983);
        int discarded$359 = -75;
        af.h();
        int discarded$360 = -104;
        rj.d();
        g.a(5893);
        int discarded$361 = 104;
        kp.a();
        int discarded$362 = -105;
        mc.d();
        int discarded$363 = -9;
        vp.p();
        sn.a((byte) -119);
        int discarded$364 = 1;
        co.a();
        int discarded$365 = 16;
        fm.g();
        rf.a(false);
        int discarded$366 = -85;
        n.g();
        int discarded$367 = 23;
        sl.i();
        int discarded$368 = -45;
        ok.i();
        gj.a(true);
        mp.a(160);
        int discarded$369 = -69;
        lc.g();
        int discarded$370 = -110;
        ck.a();
        ri.a(param0 + 117);
        int discarded$371 = 122;
        ig.a();
        rm.a((byte) -20);
        int discarded$372 = 122;
        sd.a();
        int discarded$373 = 121;
        er.g();
        int discarded$374 = 2;
        va.a();
        int discarded$375 = 1;
        rc.a();
        eq.i(-12253);
        ih.a(param0 + 133);
        int discarded$376 = -13268;
        ve.c();
        int discarded$377 = 125;
        hi.f();
        int discarded$378 = -34;
        wj.h();
        int discarded$379 = 120;
        k.h();
        uk.a(param0 + -69);
        int discarded$380 = 14676;
        qi.b();
        kk.f(1);
        int discarded$381 = -103;
        hj.a();
        fd.i(param0 ^ -28);
        int discarded$382 = 15296;
        kr.c();
        on.a();
        sk.a(param0 ^ -27);
        hb.a(0);
        mn.a(19000);
        eh.a(param0 + 136);
        int discarded$383 = -19382;
        oj.a();
        int discarded$384 = -10562;
        tg.a();
        int discarded$385 = 124;
        ea.d();
        int discarded$386 = -1;
        kf.a();
        int discarded$387 = 0;
        vm.a();
        bj.a(param0 + -4275);
        int discarded$388 = -1;
        ng.d();
        pd.a(true);
        int discarded$389 = -37;
        om.c();
        sm.c(2);
        int discarded$390 = 16;
        j.a();
        int discarded$391 = 118;
        sh.g();
        int discarded$392 = -105;
        eo.f();
        we.a((byte) -110);
        gi.a(true);
        tq.a(param0 ^ -28);
        int discarded$393 = 73;
        i.c();
        int discarded$394 = 83;
        qr.a();
        int discarded$395 = -54;
        nl.a();
        fr.c((byte) 69);
        int discarded$396 = 90;
        cr.c();
        dn.a(param0 + -2020);
        int discarded$397 = 240;
        ro.a();
        bk.a(-5917);
        int discarded$398 = 115;
        df.b();
        int discarded$399 = 0;
        ph.a();
        int discarded$400 = 72;
        wc.a();
        int discarded$401 = -124;
        wk.h();
        ar.a(10);
        int discarded$402 = 0;
        pm.c();
        int discarded$403 = 5;
        tn.c();
        int discarded$404 = -26458;
        ml.a();
        se.b(param0 + -1431655738);
        ub.a(true);
        ca.b(17518);
        int discarded$405 = 113;
        dk.a();
        int discarded$406 = 0;
        ji.a();
        int discarded$407 = 79;
        jd.a();
        int discarded$408 = 127;
        bl.a();
        int discarded$409 = 1;
        qf.a();
        he.a(param0 ^ 23);
        fl.a(59);
        oi.c((byte) -124);
        ln.a(param0 ^ -27827);
        int discarded$410 = -103;
        kg.d();
        int discarded$411 = 8;
        pf.a();
        vj.b(param0 ^ 27721);
        sa.a(param0 + -13237);
        na.a((byte) 43);
        gg.e(-1);
        int discarded$412 = -110;
        ua.h();
        int discarded$413 = 1;
        uh.b();
        int discarded$414 = 113;
        r.b();
        me.b(true);
        ka.b(true);
        int discarded$415 = 15;
        ne.b();
        cd.a(param0 ^ -94);
        int discarded$416 = 33;
        qa.c();
        int discarded$417 = -13;
        ie.a();
        ((Pool) this).field_t = null;
    }

    final void d(byte param0) {
        vk var3 = null;
        L0: {
          ((Pool) this).a(5, 19, 0, 2, 1, false, 61, 1);
          var3 = new vk();
          sg.a((java.awt.Component) (Object) pa.field_K, var3, 22050, lg.field_s, 10282, true);
          ((Pool) this).a(param0 ^ 45, false, true, true, true, false, true);
          r.field_m[78] = 8;
          re.field_f = of.field_Lb[2];
          la.field_a = of.field_Lb[0];
          r.field_m[73] = 1;
          r.field_m[75] = 5;
          r.field_m[77] = 1;
          r.field_m[79] = 0;
          r.field_m[74] = -1;
          r.field_m[64] = -2;
          r.field_m[67] = 7;
          r.field_m[65] = -2;
          r.field_m[69] = 1;
          fr.field_n = 2;
          if (param0 == -46) {
            break L0;
          } else {
            ((Pool) this).init();
            break L0;
          }
        }
        r.field_m[76] = 8;
        r.field_m[68] = 9;
        un.field_e = of.field_Lb[3];
        r.field_m[71] = 1;
        r.field_m[10] = -1;
        r.field_m[70] = 1;
        r.field_m[72] = 1;
        er.field_W = of.field_Lb[1];
        r.field_m[9] = -1;
        oa.field_g = ek.a(-95);
        hp.field_c = ek.a(5);
    }

    private final void m(byte param0) {
        if (kq.field_m != null) {
            int discarded$0 = -8;
            qk.a(kq.field_m);
            kq.field_m = null;
            int discarded$1 = 0;
            fm.a();
        }
        if (param0 > -103) {
            ((Pool) this).d((byte) -93);
        }
        fh.field_b = fh.a(3, (byte) 103);
        cp.field_a = fh.a(4, (byte) 103);
        hr.field_q = fh.a(6, (byte) 103);
        pq.field_z = fh.a(7, (byte) 103);
        fg.field_d = fh.a(8, (byte) 103);
        he.field_b = fh.a(9, (byte) 103);
        gf.field_g = fh.a(10, (byte) 103);
        jc.field_a = fh.a(11, (byte) 103);
        s.field_a = fh.a(12, (byte) 103);
        ep.field_F = fh.a(13, (byte) 103);
        rl.field_h = fh.a(18, (byte) 103);
        sh.a(sd.field_R, (byte) -32, qp.field_Zb);
    }

    private final void k(int param0) {
        int[] var10_array = null;
        int[] var13_array = null;
        int[] var15_array = null;
        int[] var18_array = null;
        int[] var19_array = null;
        int[] var23_array = null;
        int[] var24_array = null;
        int[] var25_array = null;
        int[] var29_array = null;
        int[] var31_array = null;
        Object var2 = null;
        int var2_int = 0;
        int var3 = 0;
        oq var4_ref_oq = null;
        int[] var4_ref_int__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[] var6 = null;
        int var7_int = 0;
        uf var7 = null;
        int var8 = 0;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        Object var13 = null;
        int[] var14 = null;
        Object var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        Object var18 = null;
        Object var19 = null;
        Object var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        Object var23 = null;
        Object var24 = null;
        Object var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        Object var29 = null;
        int[] var30 = null;
        Object var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int stackIn_46_0 = 0;
        int stackIn_49_0 = 0;
        uf stackIn_53_0 = null;
        uf stackIn_53_1 = null;
        int stackIn_53_2 = 0;
        int stackIn_53_3 = 0;
        int stackIn_53_4 = 0;
        int stackIn_53_5 = 0;
        int stackIn_53_6 = 0;
        uf stackIn_54_0 = null;
        uf stackIn_54_1 = null;
        int stackIn_54_2 = 0;
        int stackIn_54_3 = 0;
        int stackIn_54_4 = 0;
        int stackIn_54_5 = 0;
        int stackIn_54_6 = 0;
        uf stackIn_55_0 = null;
        uf stackIn_55_1 = null;
        int stackIn_55_2 = 0;
        int stackIn_55_3 = 0;
        int stackIn_55_4 = 0;
        int stackIn_55_5 = 0;
        int stackIn_55_6 = 0;
        int stackIn_55_7 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        uf stackOut_52_0 = null;
        uf stackOut_52_1 = null;
        int stackOut_52_2 = 0;
        int stackOut_52_3 = 0;
        int stackOut_52_4 = 0;
        int stackOut_52_5 = 0;
        int stackOut_52_6 = 0;
        uf stackOut_54_0 = null;
        uf stackOut_54_1 = null;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        int stackOut_54_5 = 0;
        int stackOut_54_6 = 0;
        int stackOut_54_7 = 0;
        uf stackOut_53_0 = null;
        uf stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_53_5 = 0;
        int stackOut_53_6 = 0;
        int stackOut_53_7 = 0;
        var10_array = null;
        var13_array = null;
        var15_array = null;
        var18_array = null;
        var19_array = null;
        var23_array = null;
        var24_array = null;
        var25_array = null;
        var29_array = null;
        var31_array = null;
        L0: {
          var8 = field_O;
          if (param0 == 3) {
            break L0;
          } else {
            field_Q = -116L;
            break L0;
          }
        }
        L1: while (true) {
          if (!rk.a(0, r.field_m)) {
            rq.a((byte) -20, 0);
            return;
          } else {
            if (uq.field_c == 9) {
              al.l(-124);
              ub.field_p = false;
              sq.field_b = 20;
              ng.field_B = kn.field_e.j(-49);
              continue L1;
            } else {
              if (uq.field_c == 14) {
                al.l(-124);
                int discarded$12 = 1;
                int discarded$13 = 103;
                int discarded$14 = 1;
                int discarded$15 = 13162;
                int discarded$16 = 4;
                mk.a(hh.a(), 1024, nf.g(), 150, te.field_p, te.a(-17931, 8), te.a(-17931, 2000), gh.f());
                int discarded$17 = 13;
                int discarded$18 = -36;
                rp.a(im.f(0), db.f());
                ub.field_p = false;
                un.field_b = true;
                td.field_d = true;
                sq.field_b = -2;
                ib.field_r = 0;
                continue L1;
              } else {
                if (15 != uq.field_c) {
                  L2: {
                    if (uq.field_c != 10) {
                      break L2;
                    } else {
                      if (td.field_d) {
                        rl.b(param0 ^ 70);
                        continue L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (uq.field_c != 74) {
                    L3: {
                      if (uq.field_c == 65) {
                        break L3;
                      } else {
                        if (uq.field_c != 64) {
                          if (uq.field_c == 66) {
                            L4: {
                              L5: {
                                if (ib.field_v) {
                                  break L5;
                                } else {
                                  if (!mj.field_e) {
                                    break L4;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                              L6: {
                                al.l(param0 + 108);
                                if (!ib.field_v) {
                                  break L6;
                                } else {
                                  ba.field_ub.c(param0 ^ 259, false);
                                  break L6;
                                }
                              }
                              mj.field_e = false;
                              sq.field_b = -2;
                              ib.field_r = 0;
                              jc.field_c = false;
                              ib.field_v = false;
                              vq.field_Sb = true;
                              un.field_b = true;
                              am.b(116);
                              break L4;
                            }
                            br.field_H = false;
                            continue L1;
                          } else {
                            L7: {
                              var2 = null;
                              if (!ib.field_v) {
                                if (!mj.field_e) {
                                  break L7;
                                } else {
                                  var2 = (Object) (Object) am.field_e;
                                  break L7;
                                }
                              } else {
                                var2 = (Object) (Object) ba.field_ub;
                                break L7;
                              }
                            }
                            L8: {
                              if (var2 != null) {
                                if (uq.field_c != 79) {
                                  if (uq.field_c == 67) {
                                    ((uf) var2).b((ge) (Object) kn.field_e, false);
                                    continue L1;
                                  } else {
                                    if (uq.field_c != 68) {
                                      if (uq.field_c != 76) {
                                        if (uq.field_c != 78) {
                                          if (uq.field_c != 75) {
                                            if (uq.field_c != 77) {
                                              if (uq.field_c != 69) {
                                                if (uq.field_c != 70) {
                                                  if (uq.field_c == 71) {
                                                    ((uf) var2).field_I.field_p = kn.field_e.g(param0 + -63);
                                                    ((uf) var2).field_I.field_x = ((uf) var2).field_I.field_x & ~((uf) var2).field_I.field_p;
                                                    continue L1;
                                                  } else {
                                                    if (uq.field_c == 72) {
                                                      ((uf) var2).field_I.field_b = kn.field_e.g(param0 + -119);
                                                      if (ba.field_ub == null) {
                                                        continue L1;
                                                      } else {
                                                        int discarded$19 = -119;
                                                        ni.f();
                                                        continue L1;
                                                      }
                                                    } else {
                                                      if (73 != uq.field_c) {
                                                        break L8;
                                                      } else {
                                                        ((uf) var2).field_cb = kn.field_e.g(-105);
                                                        ((uf) var2).field_I.field_b = ((uf) var2).field_I.field_b & ~((uf) var2).field_cb;
                                                        if (null != ba.field_ub) {
                                                          int discarded$20 = -119;
                                                          ni.f();
                                                          continue L1;
                                                        } else {
                                                          continue L1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  ((uf) var2).field_I.field_x = kn.field_e.g(param0 ^ -92);
                                                  if (ba.field_ub == null) {
                                                    continue L1;
                                                  } else {
                                                    bm.a(false);
                                                    continue L1;
                                                  }
                                                }
                                              } else {
                                                L9: {
                                                  var3 = kn.field_e.e((byte) 105);
                                                  ((uf) var2).field_I.c(param0 + -14289, var3);
                                                  if (((uf) var2).field_db == var3) {
                                                    kh.field_gc.a(17, 256, (byte) -121, 128);
                                                    break L9;
                                                  } else {
                                                    kh.field_gc.a(18, 256, (byte) -114, 128);
                                                    break L9;
                                                  }
                                                }
                                                L10: {
                                                  var20 = var2;
                                                  stackOut_96_0 = -3405;
                                                  stackOut_96_1 = -1;
                                                  stackIn_98_0 = stackOut_96_0;
                                                  stackIn_98_1 = stackOut_96_1;
                                                  stackIn_97_0 = stackOut_96_0;
                                                  stackIn_97_1 = stackOut_96_1;
                                                  if (mg.a(true)) {
                                                    stackOut_98_0 = stackIn_98_0;
                                                    stackOut_98_1 = stackIn_98_1;
                                                    stackOut_98_2 = 21;
                                                    stackIn_99_0 = stackOut_98_0;
                                                    stackIn_99_1 = stackOut_98_1;
                                                    stackIn_99_2 = stackOut_98_2;
                                                    break L10;
                                                  } else {
                                                    stackOut_97_0 = stackIn_97_0;
                                                    stackOut_97_1 = stackIn_97_1;
                                                    stackOut_97_2 = 0;
                                                    stackIn_99_0 = stackOut_97_0;
                                                    stackIn_99_1 = stackOut_97_1;
                                                    stackIn_99_2 = stackOut_97_2;
                                                    break L10;
                                                  }
                                                }
                                                fq.a(stackIn_99_0, stackIn_99_1, stackIn_99_2, false);
                                                ((uf) var20).a(-23095);
                                                if ((f.field_f & ((uf) var20).field_L) == 0) {
                                                  continue L1;
                                                } else {
                                                  ne.field_w = 23;
                                                  sq.field_b = 23;
                                                  continue L1;
                                                }
                                              }
                                            } else {
                                              ((uf) var2).d(4096, (ge) (Object) kn.field_e);
                                              continue L1;
                                            }
                                          } else {
                                            ((uf) var2).a(96, (ge) (Object) kn.field_e);
                                            continue L1;
                                          }
                                        } else {
                                          ((uf) var2).b(69, (ge) (Object) kn.field_e);
                                          continue L1;
                                        }
                                      } else {
                                        ((uf) var2).a((ge) (Object) kn.field_e, false);
                                        continue L1;
                                      }
                                    } else {
                                      ((uf) var2).a((ge) (Object) kn.field_e, 0);
                                      continue L1;
                                    }
                                  }
                                } else {
                                  ((uf) var2).g(true);
                                  continue L1;
                                }
                              } else {
                                break L8;
                              }
                            }
                            ((Pool) this).f(15000);
                            continue L1;
                          }
                        } else {
                          break L3;
                        }
                      }
                    }
                    L11: {
                      al.l(param0 ^ -126);
                      kn.field_e.p(8);
                      var2_int = kn.field_e.e(4, 52);
                      if (var2_int != 15) {
                        break L11;
                      } else {
                        var2_int = -2;
                        break L11;
                      }
                    }
                    L12: {
                      la.field_a = kn.field_e.e(3, param0 ^ 38);
                      er.field_W = kn.field_e.e(2, 104);
                      re.field_f = kn.field_e.e(3, 66);
                      var3 = kn.field_e.e(3, 78);
                      un.field_e = kn.field_e.e(1, 70);
                      if (kn.field_e.e(1, 21) != 1) {
                        stackOut_45_0 = 0;
                        stackIn_46_0 = stackOut_45_0;
                        break L12;
                      } else {
                        stackOut_44_0 = 1;
                        stackIn_46_0 = stackOut_44_0;
                        break L12;
                      }
                    }
                    L13: {
                      var4 = stackIn_46_0;
                      if (kn.field_e.e(1, 111) != 1) {
                        stackOut_48_0 = 0;
                        stackIn_49_0 = stackOut_48_0;
                        break L13;
                      } else {
                        stackOut_47_0 = 1;
                        stackIn_49_0 = stackOut_47_0;
                        break L13;
                      }
                    }
                    var5 = stackIn_49_0;
                    kn.field_e.o(8);
                    var6 = new String[kn.field_e.g(param0 ^ -70)];
                    var7_int = 0;
                    L14: while (true) {
                      if (var7_int >= var6.length) {
                        L15: {
                          ti.field_d = null;
                          stackOut_52_0 = null;
                          stackOut_52_1 = null;
                          stackOut_52_2 = hq.field_c;
                          stackOut_52_3 = la.field_a;
                          stackOut_52_4 = er.field_W;
                          stackOut_52_5 = re.field_f;
                          stackOut_52_6 = var3;
                          stackIn_54_0 = stackOut_52_0;
                          stackIn_54_1 = stackOut_52_1;
                          stackIn_54_2 = stackOut_52_2;
                          stackIn_54_3 = stackOut_52_3;
                          stackIn_54_4 = stackOut_52_4;
                          stackIn_54_5 = stackOut_52_5;
                          stackIn_54_6 = stackOut_52_6;
                          stackIn_53_0 = stackOut_52_0;
                          stackIn_53_1 = stackOut_52_1;
                          stackIn_53_2 = stackOut_52_2;
                          stackIn_53_3 = stackOut_52_3;
                          stackIn_53_4 = stackOut_52_4;
                          stackIn_53_5 = stackOut_52_5;
                          stackIn_53_6 = stackOut_52_6;
                          if (un.field_e != 0) {
                            stackOut_54_0 = null;
                            stackOut_54_1 = null;
                            stackOut_54_2 = stackIn_54_2;
                            stackOut_54_3 = stackIn_54_3;
                            stackOut_54_4 = stackIn_54_4;
                            stackOut_54_5 = stackIn_54_5;
                            stackOut_54_6 = stackIn_54_6;
                            stackOut_54_7 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            stackIn_55_1 = stackOut_54_1;
                            stackIn_55_2 = stackOut_54_2;
                            stackIn_55_3 = stackOut_54_3;
                            stackIn_55_4 = stackOut_54_4;
                            stackIn_55_5 = stackOut_54_5;
                            stackIn_55_6 = stackOut_54_6;
                            stackIn_55_7 = stackOut_54_7;
                            break L15;
                          } else {
                            stackOut_53_0 = null;
                            stackOut_53_1 = null;
                            stackOut_53_2 = stackIn_53_2;
                            stackOut_53_3 = stackIn_53_3;
                            stackOut_53_4 = stackIn_53_4;
                            stackOut_53_5 = stackIn_53_5;
                            stackOut_53_6 = stackIn_53_6;
                            stackOut_53_7 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            stackIn_55_1 = stackOut_53_1;
                            stackIn_55_2 = stackOut_53_2;
                            stackIn_55_3 = stackOut_53_3;
                            stackIn_55_4 = stackOut_53_4;
                            stackIn_55_5 = stackOut_53_5;
                            stackIn_55_6 = stackOut_53_6;
                            stackIn_55_7 = stackOut_53_7;
                            break L15;
                          }
                        }
                        L16: {
                          var7 = new uf(stackIn_55_2, stackIn_55_3, stackIn_55_4, stackIn_55_5, stackIn_55_6, stackIn_55_7 != 0, var6, var2_int, var4 != 0);
                          var7.c(16915, (ge) (Object) kn.field_e);
                          if (65 != uq.field_c) {
                            mj.field_e = true;
                            am.field_e = var7;
                            break L16;
                          } else {
                            ib.field_v = true;
                            ba.field_ub = var7;
                            bm.a(false);
                            int discarded$21 = -119;
                            ni.f();
                            kj.a((byte) -109);
                            break L16;
                          }
                        }
                        L17: {
                          br.field_H = false;
                          if (var5 != 0) {
                            var7.field_S = -1;
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        jc.field_c = true;
                        sq.field_b = -1;
                        continue L1;
                      } else {
                        var6[var7_int] = kn.field_e.a(cq.a(param0, 10761));
                        var7_int++;
                        continue L14;
                      }
                    }
                  } else {
                    var34 = ek.a(-8);
                    var27 = var34;
                    var22 = var27;
                    var17 = var22;
                    var2 = (Object) (Object) var17;
                    var9 = (int[]) var2;
                    var4_ref_oq = kn.field_e;
                    var5 = ((ge) (Object) var4_ref_oq).g(-100);
                    var6_int = 0;
                    L18: while (true) {
                      if (~var6_int <= ~var5) {
                        var32 = (int[]) var2;
                        var25_array = var32;
                        var10_array = var25_array;
                        var33 = oa.field_g;
                        var26 = var33;
                        var21 = var26;
                        var16 = var21;
                        var11 = var16;
                        var4_ref_int__ = var11;
                        var5 = 0;
                        L19: while (true) {
                          if (var5 >= 8) {
                            L20: {
                              if (em.field_K) {
                                var3 = 0;
                                L21: while (true) {
                                  if (~var3 <= ~md.field_a.length) {
                                    break L20;
                                  } else {
                                    L22: {
                                      if (!fe.a(var34, param0 ^ -13670, var3)) {
                                        break L22;
                                      } else {
                                        ui.field_U.b((byte) -3, (ma) (Object) new bq(var3));
                                        break L22;
                                      }
                                    }
                                    var3++;
                                    continue L21;
                                  }
                                }
                              } else {
                                break L20;
                              }
                            }
                            var35 = oa.field_g;
                            var28 = var35;
                            var12 = var28;
                            var36 = (int[]) var2;
                            var29_array = var36;
                            var23_array = var29_array;
                            var18_array = var23_array;
                            var13_array = var18_array;
                            var4_ref_int__ = var13_array;
                            var5 = 0;
                            L23: while (true) {
                              if (8 <= var5) {
                                var37 = hp.field_c;
                                var30 = var37;
                                var14 = var30;
                                var38 = (int[]) var2;
                                var31_array = var38;
                                var24_array = var31_array;
                                var19_array = var24_array;
                                var15_array = var19_array;
                                var4_ref_int__ = var15_array;
                                var5 = 0;
                                L24: while (true) {
                                  if (var5 >= 8) {
                                    continue L1;
                                  } else {
                                    var14[var5] = md.a(var37[var5], var38[var5]);
                                    var5++;
                                    continue L24;
                                  }
                                }
                              } else {
                                var12[var5] = md.a(var35[var5], var36[var5]);
                                var5++;
                                continue L23;
                              }
                            }
                          } else {
                            var10_array[var5] = rb.b(var32[var5], ~var33[var5]);
                            var5++;
                            continue L19;
                          }
                        }
                      } else {
                        var9[var6_int] = ((ge) (Object) var4_ref_oq).b(true);
                        var6_int++;
                        continue L18;
                      }
                    }
                  }
                } else {
                  L25: {
                    if (td.field_d) {
                      al.l(param0 + -127);
                      int discarded$22 = 1;
                      lq.a();
                      int discarded$23 = 74;
                      ko.g();
                      sq.field_b = 0;
                      mj.field_e = false;
                      vq.field_Sb = true;
                      td.field_d = false;
                      jc.field_c = false;
                      ib.field_v = false;
                      l.field_a = true;
                      am.b(120);
                      break L25;
                    } else {
                      break L25;
                    }
                  }
                  ub.field_p = false;
                  br.field_H = false;
                  continue L1;
                }
              }
            }
          }
        }
    }

    public Pool() {
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (!(!ea.field_z)) {
            return sg.field_J.a(-81, qi.field_a, ml.field_b);
        }
        if (fm.field_H) {
            return tf.a(15585, param2, param1);
        }
        int discarded$8 = -10;
        if (!(!oj.a(param1, param2))) {
            return true;
        }
        if (param3 != -80) {
            boolean discarded$9 = Pool.a(122, -100, -91, -77);
        }
        if (!(!hr.field_y)) {
            return false;
        }
        return th.a(param1, param3 + 174, param0);
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        i var6 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackIn_32_2 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_35_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int stackOut_34_0 = 0;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_31_2 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        L0: {
          var5 = field_O;
          int discarded$2 = nj.a(-21055);
          wk.field_P = sk.a((byte) 64);
          uq.a((byte) -92);
          if (ne.field_u == null) {
            break L0;
          } else {
            if (!ne.field_u.field_e) {
              break L0;
            } else {
              tq.d((byte) -127);
              k.g((byte) 96);
              break L0;
            }
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackOut_3_1 = -4;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          if (null == ne.field_u) {
            stackOut_5_0 = this;
            stackOut_5_1 = stackIn_5_1;
            stackOut_5_2 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            break L1;
          }
        }
        L2: {
          ((Pool) this).c(stackIn_6_1, stackIn_6_2 != 0);
          if (!od.field_c) {
            break L2;
          } else {
            this.m((byte) -125);
            od.field_c = false;
            break L2;
          }
        }
        L3: {
          eo.field_Tb = eo.field_Tb + 1;
          var2 = 56 / ((param0 - 29) / 60);
          if (!ue.a((byte) -84)) {
            break L3;
          } else {
            ((Pool) this).l((byte) -75);
            if (!ue.a((byte) -111)) {
              break L3;
            } else {
              if (!gg.a(true)) {
                return;
              } else {
                boolean discarded$3 = this.d(95, false);
                return;
              }
            }
          }
        }
        L4: {
          ln.a(0, wp.field_d);
          if (!this.d(82, true)) {
            break L4;
          } else {
            rm.field_d = true;
            break L4;
          }
        }
        L5: {
          if (hk.b(-119)) {
            break L5;
          } else {
            L6: while (true) {
              var6 = (i) (Object) ad.field_l.e((byte) -41);
              if (var6 == null) {
                break L5;
              } else {
                aa.a(false, var6, 4);
                continue L6;
              }
            }
          }
        }
        L7: {
          this.k(3);
          if (un.field_b) {
            ib.field_r = 0;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (pk.b((byte) 109)) {
            L9: {
              L10: {
                var3 = ((Pool) this).k((byte) -125);
                if (var3 == 0) {
                  break L10;
                } else {
                  if (var3 == 1) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              rq.c(946);
              if (var3 != 1) {
                L11: {
                  if (!td.field_d) {
                    break L11;
                  } else {
                    L12: {
                      vq.field_Sb = true;
                      l.field_a = true;
                      jc.field_c = false;
                      if (!ib.field_v) {
                        L13: {
                          stackOut_33_0 = -3405;
                          stackOut_33_1 = 0;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          if (!mg.a(true)) {
                            stackOut_35_0 = stackIn_35_0;
                            stackOut_35_1 = stackIn_35_1;
                            stackOut_35_2 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            stackIn_36_2 = stackOut_35_2;
                            break L13;
                          } else {
                            stackOut_34_0 = stackIn_34_0;
                            stackOut_34_1 = stackIn_34_1;
                            stackOut_34_2 = 21;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_36_1 = stackOut_34_1;
                            stackIn_36_2 = stackOut_34_2;
                            break L13;
                          }
                        }
                        fq.a(stackIn_36_0, stackIn_36_1, stackIn_36_2, false);
                        break L12;
                      } else {
                        L14: {
                          ng.field_B = ui.field_Z;
                          stackOut_29_0 = -3405;
                          stackOut_29_1 = 20;
                          stackIn_31_0 = stackOut_29_0;
                          stackIn_31_1 = stackOut_29_1;
                          stackIn_30_0 = stackOut_29_0;
                          stackIn_30_1 = stackOut_29_1;
                          if (!mg.a(true)) {
                            stackOut_31_0 = stackIn_31_0;
                            stackOut_31_1 = stackIn_31_1;
                            stackOut_31_2 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            stackIn_32_2 = stackOut_31_2;
                            break L14;
                          } else {
                            stackOut_30_0 = stackIn_30_0;
                            stackOut_30_1 = stackIn_30_1;
                            stackOut_30_2 = 21;
                            stackIn_32_0 = stackOut_30_0;
                            stackIn_32_1 = stackOut_30_1;
                            stackIn_32_2 = stackOut_30_2;
                            break L14;
                          }
                        }
                        fq.a(stackIn_32_0, stackIn_32_1, stackIn_32_2, false);
                        break L12;
                      }
                    }
                    al.l(-127);
                    s.field_c[ne.field_w].a(0, 0, false);
                    td.field_d = false;
                    ib.field_v = false;
                    mj.field_e = false;
                    am.b(116);
                    break L11;
                  }
                }
                br.field_H = false;
                ub.field_p = false;
                break L9;
              } else {
                br.field_H = true;
                ub.field_p = true;
                break L9;
              }
            }
            L15: {
              var4 = 0;
              if (var3 != 2) {
                break L15;
              } else {
                var4 = 1;
                break L15;
              }
            }
            L16: {
              L17: {
                if (td.field_d) {
                  break L17;
                } else {
                  if (ub.field_p) {
                    break L17;
                  } else {
                    if (!br.field_H) {
                      break L16;
                    } else {
                      break L17;
                    }
                  }
                }
              }
              var4 = 1;
              break L16;
            }
            L18: {
              if (!pk.b((byte) 109)) {
                var4 = 0;
                break L18;
              } else {
                break L18;
              }
            }
            if (var4 == 0) {
              break L8;
            } else {
              de.c(11);
              break L8;
            }
          } else {
            break L8;
          }
        }
    }

    public final void init() {
        ((Pool) this).a(640, "pool", 480, 0, 20);
    }

    final void c(byte param0) {
        int discarded$3 = -78;
        eq.j();
        if (param0 != -39) {
            ((Pool) this).a((byte) -29);
        }
        if (!(null == ne.field_u)) {
            tq.d((byte) -116);
        }
        int discarded$4 = 60;
        cd.a();
    }

    private final boolean d(int param0, boolean param1) {
        String var3 = null;
        int var3_int = 0;
        vf var4 = null;
        int var6 = 0;
        di var7 = null;
        String var8 = null;
        String var9 = null;
        di var10 = null;
        String var11 = null;
        String var12 = null;
        di var13 = null;
        String var14 = null;
        String var15 = null;
        di var16 = null;
        String var17 = null;
        String var18 = null;
        di var19 = null;
        String var20 = null;
        String var21 = null;
        di var22 = null;
        String var23 = null;
        String var24 = null;
        di var25 = null;
        String var26 = null;
        String var27 = null;
        di var28 = null;
        String var29 = null;
        String var30 = null;
        di var31 = null;
        String var32 = null;
        String var33 = null;
        di var34 = null;
        String var35 = null;
        String var36 = null;
        di var37 = null;
        String var38 = null;
        String var39 = null;
        di var40 = null;
        String var41 = null;
        String var42 = null;
        di var43 = null;
        String var44 = null;
        String var45 = null;
        di var46 = null;
        String var47 = null;
        String var48 = null;
        di var49 = null;
        String var50 = null;
        String var51 = null;
        di var52 = null;
        String var53 = null;
        String var54 = null;
        di var55 = null;
        String var56 = null;
        String var57 = null;
        di var58 = null;
        String var59 = null;
        String var60 = null;
        di var61 = null;
        String var62 = null;
        String var63 = null;
        Object var64 = null;
        cj var64_ref = null;
        var64 = null;
        var6 = field_O;
        da.a(-99);
        if (fg.field_d != null) {
          L0: {
            if (!sd.field_R.d(-62)) {
              break L0;
            } else {
              if (!sd.field_R.a("arialbold14", 0)) {
                break L0;
              } else {
                L1: {
                  if (!sd.field_R.d(-64)) {
                    break L1;
                  } else {
                    if (sd.field_R.a("arialish12", 0)) {
                      L2: {
                        if (!qp.field_Zb.d(48)) {
                          break L2;
                        } else {
                          if (qp.field_Zb.a("arialbold14", 0)) {
                            L3: {
                              if (!qp.field_Zb.d(123)) {
                                break L3;
                              } else {
                                if (!qp.field_Zb.a("arialish12", 0)) {
                                  break L3;
                                } else {
                                  L4: {
                                    if (!sd.field_R.d(107)) {
                                      break L4;
                                    } else {
                                      if (!sd.field_R.a("basic", 0)) {
                                        break L4;
                                      } else {
                                        L5: {
                                          if (!sd.field_R.d(-43)) {
                                            break L5;
                                          } else {
                                            if (sd.field_R.a("lobby", 0)) {
                                              L6: {
                                                if (!qp.field_Zb.d(-47)) {
                                                  break L6;
                                                } else {
                                                  if (!qp.field_Zb.a("lobby", 0)) {
                                                    break L6;
                                                  } else {
                                                    L7: {
                                                      if (!fg.field_d.d(79)) {
                                                        break L7;
                                                      } else {
                                                        if (!fg.field_d.c(-63)) {
                                                          break L7;
                                                        } else {
                                                          L8: {
                                                            if (!he.field_b.d(105)) {
                                                              break L8;
                                                            } else {
                                                              if (!he.field_b.c(-63)) {
                                                                break L8;
                                                              } else {
                                                                L9: {
                                                                  if (!gf.field_g.d(-50)) {
                                                                    break L9;
                                                                  } else {
                                                                    if (gf.field_g.c(-63)) {
                                                                      L10: {
                                                                        if (!jc.field_a.d(-114)) {
                                                                          break L10;
                                                                        } else {
                                                                          if (!jc.field_a.c(-63)) {
                                                                            break L10;
                                                                          } else {
                                                                            L11: {
                                                                              if (!hr.field_q.d(-43)) {
                                                                                break L11;
                                                                              } else {
                                                                                if (hr.field_q.a("", 0)) {
                                                                                  L12: {
                                                                                    if (!rl.field_h.d(-90)) {
                                                                                      break L12;
                                                                                    } else {
                                                                                      if (!rl.field_h.a("", 0)) {
                                                                                        break L12;
                                                                                      } else {
                                                                                        L13: {
                                                                                          if (!pq.field_z.d(120)) {
                                                                                            break L13;
                                                                                          } else {
                                                                                            if (!pq.field_z.a("", 0)) {
                                                                                              break L13;
                                                                                            } else {
                                                                                              L14: {
                                                                                                if (!fh.field_b.d(-76)) {
                                                                                                  break L14;
                                                                                                } else {
                                                                                                  if (!fh.field_b.c(-63)) {
                                                                                                    break L14;
                                                                                                  } else {
                                                                                                    L15: {
                                                                                                      if (!cp.field_a.d(-90)) {
                                                                                                        break L15;
                                                                                                      } else {
                                                                                                        if (cp.field_a.c(-63)) {
                                                                                                          L16: {
                                                                                                            if (!s.field_a.d(-116)) {
                                                                                                              break L16;
                                                                                                            } else {
                                                                                                              if (s.field_a.c(-63)) {
                                                                                                                L17: {
                                                                                                                  if (!ep.field_F.d(-118)) {
                                                                                                                    break L17;
                                                                                                                  } else {
                                                                                                                    if (ep.field_F.c(-63)) {
                                                                                                                      if (!param1) {
                                                                                                                        var61 = ep.field_F;
                                                                                                                        var62 = de.field_e;
                                                                                                                        var63 = cf.field_c;
                                                                                                                        int discarded$47 = 0;
                                                                                                                        fo.a(hp.a(var61, var62, -641, var63), (float)(w.field_i[18] + (w.field_i[19] + -w.field_i[18]) * var61.b(0) / 100));
                                                                                                                        return false;
                                                                                                                      } else {
                                                                                                                        ue.a(true);
                                                                                                                        var3 = cq.field_e;
                                                                                                                        int discarded$48 = 0;
                                                                                                                        fo.a(var3, (float)w.field_i[19]);
                                                                                                                        ((Pool) this).a((byte) 120);
                                                                                                                        wi.a(true);
                                                                                                                        qg.field_g = new cf(fg.field_d, he.field_b);
                                                                                                                        il.field_c[0] = qg.field_g.a("interface_mouseover_menuitems", true, "");
                                                                                                                        il.field_c[1] = qg.field_g.a("interface_music_level_change", true, "");
                                                                                                                        il.field_c[2] = qg.field_g.a("interface_SFX_level_change_chalk", true, "");
                                                                                                                        il.field_c[3] = qg.field_g.a("interface_select_ballroll_transition", true, "");
                                                                                                                        var3_int = 0;
                                                                                                                        L18: while (true) {
                                                                                                                          if (var3_int >= nn.field_b.length) {
                                                                                                                            L19: {
                                                                                                                              if (2 < nn.field_b.length) {
                                                                                                                                var64_ref = (cj) (Object) nn.field_b[2];
                                                                                                                                var4 = (vf) (Object) nn.field_b[3];
                                                                                                                                var4.field_X = var64_ref.field_mb;
                                                                                                                                var4.field_bb = var64_ref.field_bb;
                                                                                                                                var4.field_hb = var64_ref.field_S;
                                                                                                                                var4.field_Y = var64_ref.field_rb;
                                                                                                                                break L19;
                                                                                                                              } else {
                                                                                                                                break L19;
                                                                                                                              }
                                                                                                                            }
                                                                                                                            fg.field_d = null;
                                                                                                                            int discarded$49 = 0;
                                                                                                                            fm.a();
                                                                                                                            return false;
                                                                                                                          } else {
                                                                                                                            nn.field_b[var3_int].a(qg.field_g, 124);
                                                                                                                            var3_int++;
                                                                                                                            continue L18;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                    } else {
                                                                                                                      break L17;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                var58 = ep.field_F;
                                                                                                                var59 = de.field_e;
                                                                                                                var60 = cf.field_c;
                                                                                                                int discarded$50 = 0;
                                                                                                                fo.a(hp.a(var58, var59, -641, var60), (float)(w.field_i[18] - -((-w.field_i[18] + w.field_i[19]) * var58.b(0) / 100)));
                                                                                                                return false;
                                                                                                              } else {
                                                                                                                break L16;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          var55 = s.field_a;
                                                                                                          var56 = de.field_e;
                                                                                                          var57 = cf.field_c;
                                                                                                          int discarded$51 = 0;
                                                                                                          fo.a(hp.a(var55, var56, -641, var57), (float)(w.field_i[17] + (w.field_i[18] + -w.field_i[17]) * var55.b(0) / 100));
                                                                                                          return false;
                                                                                                        } else {
                                                                                                          break L15;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    var52 = cp.field_a;
                                                                                                    var53 = de.field_e;
                                                                                                    var54 = cf.field_c;
                                                                                                    int discarded$52 = 0;
                                                                                                    fo.a(hp.a(var52, var53, -641, var54), (float)(w.field_i[16] - -((-w.field_i[16] + w.field_i[17]) * var52.b(0) / 100)));
                                                                                                    return false;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              var49 = fh.field_b;
                                                                                              var50 = de.field_e;
                                                                                              var51 = cf.field_c;
                                                                                              int discarded$53 = 0;
                                                                                              fo.a(hp.a(var49, var50, -641, var51), (float)(w.field_i[15] + (w.field_i[16] - w.field_i[15]) * var49.b(0) / 100));
                                                                                              return false;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var46 = pq.field_z;
                                                                                        var48 = gh.field_Q;
                                                                                        var47 = kb.field_a;
                                                                                        int discarded$54 = 0;
                                                                                        fo.a(dk.a((byte) -21, "", var46, var47, var48), (float)(w.field_i[14] + (w.field_i[15] - w.field_i[14]) * var46.a(100, "") / 100));
                                                                                        return false;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  var43 = rl.field_h;
                                                                                  var45 = rp.field_c;
                                                                                  var44 = oj.field_t;
                                                                                  int discarded$55 = 0;
                                                                                  fo.a(dk.a((byte) -1, "", var43, var44, var45), (float)(w.field_i[13] - -((w.field_i[14] - w.field_i[13]) * var43.a(100, "") / 100)));
                                                                                  return false;
                                                                                } else {
                                                                                  break L11;
                                                                                }
                                                                              }
                                                                            }
                                                                            var40 = hr.field_q;
                                                                            var42 = rp.field_c;
                                                                            var41 = oj.field_t;
                                                                            int discarded$56 = 0;
                                                                            fo.a(dk.a((byte) 119, "", var40, var41, var42), (float)(w.field_i[12] - -((w.field_i[13] + -w.field_i[12]) * var40.a(100, "") / 100)));
                                                                            return false;
                                                                          }
                                                                        }
                                                                      }
                                                                      var37 = jc.field_a;
                                                                      var38 = aj.field_Sb;
                                                                      var39 = mm.field_o;
                                                                      int discarded$57 = 0;
                                                                      fo.a(hp.a(var37, var38, -641, var39), (float)(w.field_i[11] + (w.field_i[12] - w.field_i[11]) * var37.b(0) / 100));
                                                                      return false;
                                                                    } else {
                                                                      break L9;
                                                                    }
                                                                  }
                                                                }
                                                                var34 = gf.field_g;
                                                                var35 = aj.field_Sb;
                                                                var36 = mm.field_o;
                                                                int discarded$58 = 0;
                                                                fo.a(hp.a(var34, var35, -641, var36), (float)(w.field_i[10] - -((-w.field_i[10] + w.field_i[11]) * var34.b(0) / 100)));
                                                                return false;
                                                              }
                                                            }
                                                          }
                                                          var31 = he.field_b;
                                                          var32 = rk.field_h;
                                                          var33 = mq.field_g;
                                                          int discarded$59 = 0;
                                                          fo.a(hp.a(var31, var32, -641, var33), (float)(w.field_i[9] - -((-w.field_i[9] + w.field_i[10]) * var31.b(0) / 100)));
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    var28 = fg.field_d;
                                                    var29 = rk.field_h;
                                                    var30 = mq.field_g;
                                                    int discarded$60 = 0;
                                                    fo.a(hp.a(var28, var29, -641, var30), (float)(w.field_i[8] - -((w.field_i[9] + -w.field_i[8]) * var28.b(0) / 100)));
                                                    return false;
                                                  }
                                                }
                                              }
                                              var25 = qp.field_Zb;
                                              var27 = gh.field_Q;
                                              var26 = kb.field_a;
                                              int discarded$61 = 0;
                                              fo.a(dk.a((byte) 118, "lobby", var25, var26, var27), (float)(w.field_i[7] + (-w.field_i[7] + w.field_i[8]) * var25.a(100, "lobby") / 100));
                                              return false;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        var22 = sd.field_R;
                                        var24 = rp.field_c;
                                        var23 = oj.field_t;
                                        int discarded$62 = 0;
                                        fo.a(dk.a((byte) 122, "lobby", var22, var23, var24), (float)(w.field_i[6] - -((-w.field_i[6] + w.field_i[7]) * var22.a(100, "lobby") / 100)));
                                        return false;
                                      }
                                    }
                                  }
                                  var19 = sd.field_R;
                                  var21 = rp.field_c;
                                  var20 = oj.field_t;
                                  int discarded$63 = 0;
                                  fo.a(dk.a((byte) 101, "basic", var19, var20, var21), (float)(w.field_i[5] + (w.field_i[6] + -w.field_i[5]) * var19.a(100, "basic") / 100));
                                  return false;
                                }
                              }
                            }
                            var16 = qp.field_Zb;
                            var18 = gh.field_Q;
                            var17 = kb.field_a;
                            int discarded$64 = 0;
                            fo.a(dk.a((byte) -116, "arialish12", var16, var17, var18), (float)(w.field_i[4] - -((-w.field_i[4] + w.field_i[5]) * var16.a(100, "arialish12") / 100)));
                            return false;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var13 = qp.field_Zb;
                      var15 = gh.field_Q;
                      var14 = kb.field_a;
                      int discarded$65 = 0;
                      fo.a(dk.a((byte) -61, "arialbold14", var13, var14, var15), (float)(w.field_i[3] + (-w.field_i[3] + w.field_i[4]) * var13.a(100, "arialbold14") / 100));
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                var10 = sd.field_R;
                var12 = rp.field_c;
                var11 = oj.field_t;
                int discarded$66 = 0;
                fo.a(dk.a((byte) -17, "arialish12", var10, var11, var12), (float)(w.field_i[2] + (-w.field_i[2] + w.field_i[3]) * var10.a(100, "arialish12") / 100));
                return false;
              }
            }
          }
          var7 = sd.field_R;
          var9 = rp.field_c;
          var8 = oj.field_t;
          int discarded$67 = 0;
          fo.a(dk.a((byte) -22, "arialbold14", var7, var8, var9), (float)(w.field_i[1] - -((w.field_i[2] - w.field_i[1]) * var7.a(100, "arialbold14") / 100)));
          return false;
        } else {
          if (he.field_b == null) {
            if (jc.field_a == null) {
              if (null == gf.field_g) {
                if (qp.field_Zb != null) {
                  var3 = fj.field_e;
                  int discarded$68 = 0;
                  fo.a(var3, (float)w.field_i[23]);
                  ((Pool) this).a((byte) 120);
                  mc.field_e = sk.a(pq.field_z, 32362, "", "font", hr.field_q);
                  sa.field_h = he.a(sd.field_R, "", 0, qp.field_Zb, "arialish12");
                  ni.field_Z = he.a(sd.field_R, "", 0, qp.field_Zb, "arialbold14");
                  id.field_c = new jk();
                  id.field_c.a(2);
                  cf.a(0, hr.field_q);
                  of.a((byte) 27, rl.field_h);
                  mm.field_j = pf.a("basic", (byte) 83, "locked", sd.field_R);
                  ua.field_r = pf.a("basic", (byte) 122, "unachieved", sd.field_R);
                  om.field_u = pf.a("basic", (byte) 60, "orbcoin", sd.field_R);
                  int discarded$69 = -12;
                  ig.a(ua.field_r);
                  int discarded$70 = -12;
                  ig.a(om.field_u);
                  dq.field_k = new dd(32, 32);
                  dq.field_k.e();
                  om.field_u.a(0, 0, 32, 32);
                  sh.field_P.b(15100);
                  om.field_u = null;
                  qo.a((byte) -72, true, of.field_Lb, sd.field_R, cp.field_a, 2, qk.field_c, 4, qp.field_Zb, s.field_d, nn.field_a, ve.field_q, r.field_n, te.field_p, ff.field_f);
                  ac.field_n = pf.a("", (byte) 121, "lobby_game_logo", hr.field_q);
                  we.field_m = ml.field_h;
                  rg.field_s = true;
                  dl.field_j = to.field_m;
                  int discarded$71 = -77;
                  int discarded$72 = 200;
                  wj.a();
                  int discarded$73 = 16777215;
                  ec.a(0, 0, 37, vd.field_l, (java.applet.Applet) this);
                  qp.field_Zb = null;
                  pq.field_z = null;
                  int discarded$74 = 0;
                  fm.a();
                  return false;
                } else {
                  L20: {
                    if (param0 >= 56) {
                      break L20;
                    } else {
                      ((Pool) this).h((byte) 13);
                      break L20;
                    }
                  }
                  if (fh.field_b == null) {
                    if (null != s.field_a) {
                      var3 = lc.field_R;
                      int discarded$75 = 0;
                      fo.a(var3, (float)w.field_i[24]);
                      ((Pool) this).a((byte) 120);
                      int discarded$76 = 0;
                      hr.a(s.field_a);
                      s.field_a = null;
                      int discarded$77 = 0;
                      fm.a();
                      return false;
                    } else {
                      md.a(32);
                      int discarded$78 = 124;
                      eq.i();
                      ne.field_w = 0;
                      sq.field_b = 0;
                      cq.a(4313);
                      ee.a(50, -74);
                      tl.field_N.a((byte) -125, -1, 256);
                      ij.field_u = ul.field_m;
                      tl.field_N.a(ul.field_m, 8821, true);
                      uk.a(mc.field_e.field_L, 8, sa.field_h.field_w + sa.field_h.field_L, 240, mc.field_e.field_L + mc.field_e.field_w, 2, vk.field_y[0].field_z + 5, 5 + vk.field_y[0].field_A, 8, 480, 3, rm.field_g, -23994, (lr) (Object) sa.field_h, 4, 13421772, sa.field_h.field_L, 320, vk.field_y, rm.field_g, (lr) (Object) mc.field_e);
                      int discarded$79 = 320;
                      int discarded$80 = 3;
                      int discarded$81 = 2;
                      int discarded$82 = -1373633266;
                      vl.a(240, vk.field_y[0].field_A - -5, rm.field_g, 8, rm.field_g, 4, 8, (lr) (Object) mc.field_e, 5 + vk.field_y[0].field_z, 2, vk.field_y);
                      int discarded$83 = 0;
                      fm.a();
                      return true;
                    }
                  } else {
                    int discarded$84 = -92;
                    kp.a(new rk(fh.field_b.a(false, "huffman", "")));
                    fh.field_b = null;
                    int discarded$85 = 0;
                    fm.a();
                    return false;
                  }
                }
              } else {
                var3 = ac.field_q;
                int discarded$86 = 0;
                fo.a(var3, (float)w.field_i[22]);
                ((Pool) this).a((byte) 120);
                boolean discarded$87 = tl.field_N.a(qg.field_g, gf.field_g, ul.field_m, 75, 0);
                boolean discarded$88 = tl.field_N.a(qg.field_g, gf.field_g, jh.field_d, 95, 0);
                var3_int = 0;
                L21: while (true) {
                  if (var3_int >= nn.field_b.length) {
                    tl.field_N.a(true);
                    gf.field_g = null;
                    qg.field_g = null;
                    int discarded$89 = 0;
                    fm.a();
                    return false;
                  } else {
                    nn.field_b[var3_int].a(3, qg.field_g, gf.field_g);
                    var3_int++;
                    continue L21;
                  }
                }
              }
            } else {
              var3 = ac.field_q;
              int discarded$90 = 0;
              fo.a(var3, (float)w.field_i[21]);
              ((Pool) this).a((byte) 120);
              ul.field_m = cg.a(jc.field_a, "", "title");
              jh.field_d = cg.a(jc.field_a, "", "title_next_door");
              var3_int = 0;
              L22: while (true) {
                if (var3_int >= nn.field_b.length) {
                  jc.field_a = null;
                  int discarded$91 = 0;
                  fm.a();
                  return false;
                } else {
                  nn.field_b[var3_int].a(1, jc.field_a);
                  var3_int++;
                  continue L22;
                }
              }
            }
          } else {
            var3 = cq.field_e;
            int discarded$92 = 0;
            fo.a(var3, (float)w.field_i[20]);
            ((Pool) this).a((byte) 120);
            he.field_b = null;
            int discarded$93 = 0;
            fm.a();
            return false;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_N = new kf[2];
        field_M = "Pot the balls in any order and finish on the black.";
        field_K = "Hide lobby chat";
        field_L = new int[4];
    }
}
