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
        boolean discarded$3 = false;
        int fieldTemp$4 = 0;
        ma discarded$5 = null;
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
        uf stackIn_90_0 = null;
        uf stackIn_90_1 = null;
        int stackIn_90_2 = 0;
        int stackIn_90_3 = 0;
        int stackIn_90_4 = 0;
        int stackIn_90_5 = 0;
        int stackIn_90_6 = 0;
        uf stackIn_91_0 = null;
        uf stackIn_91_1 = null;
        int stackIn_91_2 = 0;
        int stackIn_91_3 = 0;
        int stackIn_91_4 = 0;
        int stackIn_91_5 = 0;
        int stackIn_91_6 = 0;
        uf stackIn_92_0 = null;
        uf stackIn_92_1 = null;
        int stackIn_92_2 = 0;
        int stackIn_92_3 = 0;
        int stackIn_92_4 = 0;
        int stackIn_92_5 = 0;
        int stackIn_92_6 = 0;
        int stackIn_92_7 = 0;
        int stackIn_95_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_97_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        uf stackIn_104_0 = null;
        uf stackIn_104_1 = null;
        int stackIn_104_2 = 0;
        int stackIn_104_3 = 0;
        int stackIn_104_4 = 0;
        int stackIn_104_5 = 0;
        int stackIn_104_6 = 0;
        uf stackIn_105_0 = null;
        uf stackIn_105_1 = null;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        int stackIn_105_4 = 0;
        int stackIn_105_5 = 0;
        int stackIn_105_6 = 0;
        uf stackIn_106_0 = null;
        uf stackIn_106_1 = null;
        int stackIn_106_2 = 0;
        int stackIn_106_3 = 0;
        int stackIn_106_4 = 0;
        int stackIn_106_5 = 0;
        int stackIn_106_6 = 0;
        int stackIn_106_7 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        int stackIn_117_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        uf stackIn_126_0 = null;
        uf stackIn_126_1 = null;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        int stackIn_126_4 = 0;
        int stackIn_126_5 = 0;
        int stackIn_126_6 = 0;
        uf stackIn_127_0 = null;
        uf stackIn_127_1 = null;
        int stackIn_127_2 = 0;
        int stackIn_127_3 = 0;
        int stackIn_127_4 = 0;
        int stackIn_127_5 = 0;
        int stackIn_127_6 = 0;
        uf stackIn_128_0 = null;
        uf stackIn_128_1 = null;
        int stackIn_128_2 = 0;
        int stackIn_128_3 = 0;
        int stackIn_128_4 = 0;
        int stackIn_128_5 = 0;
        int stackIn_128_6 = 0;
        int stackIn_128_7 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_133_0 = 0;
        int stackIn_133_1 = 0;
        int stackIn_134_0 = 0;
        int stackIn_134_1 = 0;
        int stackIn_134_2 = 0;
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
        uf stackOut_89_0 = null;
        uf stackOut_89_1 = null;
        int stackOut_89_2 = 0;
        int stackOut_89_3 = 0;
        int stackOut_89_4 = 0;
        int stackOut_89_5 = 0;
        int stackOut_89_6 = 0;
        uf stackOut_91_0 = null;
        uf stackOut_91_1 = null;
        int stackOut_91_2 = 0;
        int stackOut_91_3 = 0;
        int stackOut_91_4 = 0;
        int stackOut_91_5 = 0;
        int stackOut_91_6 = 0;
        int stackOut_91_7 = 0;
        uf stackOut_90_0 = null;
        uf stackOut_90_1 = null;
        int stackOut_90_2 = 0;
        int stackOut_90_3 = 0;
        int stackOut_90_4 = 0;
        int stackOut_90_5 = 0;
        int stackOut_90_6 = 0;
        int stackOut_90_7 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int stackOut_96_0 = 0;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        uf stackOut_103_0 = null;
        uf stackOut_103_1 = null;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        int stackOut_103_4 = 0;
        int stackOut_103_5 = 0;
        int stackOut_103_6 = 0;
        uf stackOut_105_0 = null;
        uf stackOut_105_1 = null;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        int stackOut_105_4 = 0;
        int stackOut_105_5 = 0;
        int stackOut_105_6 = 0;
        int stackOut_105_7 = 0;
        uf stackOut_104_0 = null;
        uf stackOut_104_1 = null;
        int stackOut_104_2 = 0;
        int stackOut_104_3 = 0;
        int stackOut_104_4 = 0;
        int stackOut_104_5 = 0;
        int stackOut_104_6 = 0;
        int stackOut_104_7 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        int stackOut_107_2 = 0;
        int stackOut_116_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        uf stackOut_125_0 = null;
        uf stackOut_125_1 = null;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        int stackOut_125_4 = 0;
        int stackOut_125_5 = 0;
        int stackOut_125_6 = 0;
        uf stackOut_127_0 = null;
        uf stackOut_127_1 = null;
        int stackOut_127_2 = 0;
        int stackOut_127_3 = 0;
        int stackOut_127_4 = 0;
        int stackOut_127_5 = 0;
        int stackOut_127_6 = 0;
        int stackOut_127_7 = 0;
        uf stackOut_126_0 = null;
        uf stackOut_126_1 = null;
        int stackOut_126_2 = 0;
        int stackOut_126_3 = 0;
        int stackOut_126_4 = 0;
        int stackOut_126_5 = 0;
        int stackOut_126_6 = 0;
        int stackOut_126_7 = 0;
        int stackOut_130_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        int stackOut_132_0 = 0;
        int stackOut_132_1 = 0;
        int stackOut_132_2 = 0;
        L0: {
          var6 = field_O;
          if (me.field_o != me.field_s) {
            if (th.field_b == me.field_s) {
              uk.field_m = uk.field_m + 1;
              if (-17 == (uk.field_m ^ -1)) {
                L1: {
                  if (nm.field_c) {
                    ab.a(param1 + 0);
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
                if (!hk.b(param1 + 16)) {
                  L2: {
                    if (null == ti.field_d) {
                      break L2;
                    } else {
                      ml.a(25756, ti.field_d, 3);
                      break L2;
                    }
                  }
                  L3: {
                    ra.a((byte) -108);
                    sq.field_b = eo.field_Ub;
                    if (!nm.field_c) {
                      break L3;
                    } else {
                      nm.field_c = false;
                      qr.a(-28038, false);
                      break L3;
                    }
                  }
                  L4: {
                    if (bl.field_x) {
                      fq.a(-3405, -4, sq.field_b, false);
                      bl.field_x = false;
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  if (dn.a(true, sq.field_b)) {
                    al.l(41);
                    me.field_s = aa.field_d;
                    break L0;
                  } else {
                    me.field_s = aa.field_d;
                    break L0;
                  }
                } else {
                  me.field_s = aa.field_d;
                  break L0;
                }
              }
            }
          } else {
            L5: {
              var3_int = 0;
              var4 = 0;
              if (!param0) {
                if (sq.field_b != ne.field_w) {
                  sg.field_P = sg.field_P + 1;
                  ih.a((byte) 46);
                  if (sg.field_P == 32) {
                    al.l(param1 + -128);
                    break L5;
                  } else {
                    break L5;
                  }
                } else {
                  if (ne.field_w != -1) {
                    if (1 == (ne.field_w ^ -1)) {
                      var3_int = 1;
                      break L5;
                    } else {
                      if (!dn.a(true, ne.field_w)) {
                        break L5;
                      } else {
                        s.field_c[ne.field_w].d(-1);
                        break L5;
                      }
                    }
                  } else {
                    if (td.field_d) {
                      var4 = 1;
                      var3_int = 1;
                      break L5;
                    } else {
                      ba.field_ub.a(false, true, (byte) -9);
                      L6: while (true) {
                        if (!n.h(127)) {
                          break L5;
                        } else {
                          ba.field_ub.p((byte) 101);
                          continue L6;
                        }
                      }
                    }
                  }
                }
              } else {
                break L5;
              }
            }
            L7: {
              if (!td.field_d) {
                break L7;
              } else {
                if (ub.field_p) {
                  break L7;
                } else {
                  if (br.field_H) {
                    break L7;
                  } else {
                    L8: {
                      if (!ib.field_v) {
                        break L8;
                      } else {
                        if (!rg.field_p) {
                          break L8;
                        } else {
                          var3_int = 0;
                          break L8;
                        }
                      }
                    }
                    L9: {
                      i.a(10, var3_int != 0);
                      if (!mj.field_e) {
                        break L9;
                      } else {
                        L10: {
                          stackOut_24_0 = am.field_e;
                          stackIn_26_0 = stackOut_24_0;
                          stackIn_25_0 = stackOut_24_0;
                          if (0 == fl.field_q.field_R) {
                            stackOut_26_0 = (uf) ((Object) stackIn_26_0);
                            stackOut_26_1 = 0;
                            stackIn_27_0 = stackOut_26_0;
                            stackIn_27_1 = stackOut_26_1;
                            break L10;
                          } else {
                            stackOut_25_0 = (uf) ((Object) stackIn_25_0);
                            stackOut_25_1 = 1;
                            stackIn_27_0 = stackOut_25_0;
                            stackIn_27_1 = stackOut_25_1;
                            break L10;
                          }
                        }
                        ((uf) (Object) stackIn_27_0).a(stackIn_27_1 != 0, var4 != 0, (byte) -118);
                        break L9;
                      }
                    }
                    L11: {
                      if (ib.field_v) {
                        L12: {
                          ie.a(180, var4 != 0, param1 + -17156, 320);
                          stackOut_30_0 = ba.field_ub;
                          stackIn_32_0 = stackOut_30_0;
                          stackIn_31_0 = stackOut_30_0;
                          if (-1 == (fl.field_q.field_R ^ -1)) {
                            stackOut_32_0 = (uf) ((Object) stackIn_32_0);
                            stackOut_32_1 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            stackIn_33_1 = stackOut_32_1;
                            break L12;
                          } else {
                            stackOut_31_0 = (uf) ((Object) stackIn_31_0);
                            stackOut_31_1 = 1;
                            stackIn_33_0 = stackOut_31_0;
                            stackIn_33_1 = stackOut_31_1;
                            break L12;
                          }
                        }
                        ((uf) (Object) stackIn_33_0).a(stackIn_33_1 != 0, var4 != 0, (byte) -108);
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                    L13: while (true) {
                      if (!n.h(127)) {
                        break L7;
                      } else {
                        L14: {
                          if (!un.field_b) {
                            break L14;
                          } else {
                            if (ib.field_v) {
                              if (!rj.a(15, 12, -1, 13)) {
                                break L14;
                              } else {
                                continue L13;
                              }
                            } else {
                              discarded$3 = pa.a(false, 15, 13, 12);
                              break L14;
                            }
                          }
                        }
                        L15: {
                          if (mj.field_e) {
                            am.field_e.p((byte) 94);
                            break L15;
                          } else {
                            break L15;
                          }
                        }
                        if (ib.field_v) {
                          ba.field_ub.p((byte) 81);
                          continue L13;
                        } else {
                          continue L13;
                        }
                      }
                    }
                  }
                }
              }
            }
            L16: {
              if (!td.field_d) {
                mj.a(true);
                break L16;
              } else {
                break L16;
              }
            }
            L17: {
              if (!un.field_b) {
                if ((eq.field_U ^ -1) < -1) {
                  eq.field_U = eq.field_U - 1;
                  break L17;
                } else {
                  break L17;
                }
              } else {
                if (ir.field_h > eq.field_U) {
                  eq.field_U = eq.field_U + 1;
                  break L17;
                } else {
                  break L17;
                }
              }
            }
            fn.b(5938, eq.field_U);
            if (null == ui.field_U.c((byte) 99)) {
              break L0;
            } else {
              fieldTemp$4 = aa.field_h + 1;
              aa.field_h = aa.field_h + 1;
              if (-336 != (fieldTemp$4 ^ -1)) {
                break L0;
              } else {
                aa.field_h = 0;
                discarded$5 = ui.field_U.e((byte) -41);
                break L0;
              }
            }
          }
        }
        L18: {
          if (-3 == sq.field_b) {
            ti.field_d = null;
            var7 = new String[fr.field_n];
            var9 = var7;
            var4 = 0;
            L19: while (true) {
              if (var4 >= fr.field_n) {
                L20: {
                  stackOut_89_0 = null;
                  stackOut_89_1 = null;
                  stackOut_89_2 = oj.field_m;
                  stackOut_89_3 = la.field_a;
                  stackOut_89_4 = er.field_W;
                  stackOut_89_5 = re.field_f;
                  stackOut_89_6 = re.field_f;
                  stackIn_91_0 = stackOut_89_0;
                  stackIn_91_1 = stackOut_89_1;
                  stackIn_91_2 = stackOut_89_2;
                  stackIn_91_3 = stackOut_89_3;
                  stackIn_91_4 = stackOut_89_4;
                  stackIn_91_5 = stackOut_89_5;
                  stackIn_91_6 = stackOut_89_6;
                  stackIn_90_0 = stackOut_89_0;
                  stackIn_90_1 = stackOut_89_1;
                  stackIn_90_2 = stackOut_89_2;
                  stackIn_90_3 = stackOut_89_3;
                  stackIn_90_4 = stackOut_89_4;
                  stackIn_90_5 = stackOut_89_5;
                  stackIn_90_6 = stackOut_89_6;
                  if (un.field_e != 0) {
                    stackOut_91_0 = null;
                    stackOut_91_1 = null;
                    stackOut_91_2 = stackIn_91_2;
                    stackOut_91_3 = stackIn_91_3;
                    stackOut_91_4 = stackIn_91_4;
                    stackOut_91_5 = stackIn_91_5;
                    stackOut_91_6 = stackIn_91_6;
                    stackOut_91_7 = 0;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    stackIn_92_2 = stackOut_91_2;
                    stackIn_92_3 = stackOut_91_3;
                    stackIn_92_4 = stackOut_91_4;
                    stackIn_92_5 = stackOut_91_5;
                    stackIn_92_6 = stackOut_91_6;
                    stackIn_92_7 = stackOut_91_7;
                    break L20;
                  } else {
                    stackOut_90_0 = null;
                    stackOut_90_1 = null;
                    stackOut_90_2 = stackIn_90_2;
                    stackOut_90_3 = stackIn_90_3;
                    stackOut_90_4 = stackIn_90_4;
                    stackOut_90_5 = stackIn_90_5;
                    stackOut_90_6 = stackIn_90_6;
                    stackOut_90_7 = 1;
                    stackIn_92_0 = stackOut_90_0;
                    stackIn_92_1 = stackOut_90_1;
                    stackIn_92_2 = stackOut_90_2;
                    stackIn_92_3 = stackOut_90_3;
                    stackIn_92_4 = stackOut_90_4;
                    stackIn_92_5 = stackOut_90_5;
                    stackIn_92_6 = stackOut_90_6;
                    stackIn_92_7 = stackOut_90_7;
                    break L20;
                  }
                }
                L21: {
                  ba.field_ub = new uf(stackIn_92_2, stackIn_92_3, stackIn_92_4, stackIn_92_5, stackIn_92_6, stackIn_92_7 != 0, var9, 0, false);
                  if (!jd.field_a) {
                    stackOut_94_0 = 0;
                    stackIn_95_0 = stackOut_94_0;
                    break L21;
                  } else {
                    stackOut_93_0 = 1;
                    stackIn_95_0 = stackOut_93_0;
                    break L21;
                  }
                }
                L22: {
                  var4 = stackIn_95_0;
                  stackOut_95_0 = param1 + -3405;
                  stackOut_95_1 = -1;
                  stackIn_97_0 = stackOut_95_0;
                  stackIn_97_1 = stackOut_95_1;
                  stackIn_96_0 = stackOut_95_0;
                  stackIn_96_1 = stackOut_95_1;
                  if (mg.a(true)) {
                    stackOut_97_0 = stackIn_97_0;
                    stackOut_97_1 = stackIn_97_1;
                    stackOut_97_2 = 21;
                    stackIn_98_0 = stackOut_97_0;
                    stackIn_98_1 = stackOut_97_1;
                    stackIn_98_2 = stackOut_97_2;
                    break L22;
                  } else {
                    stackOut_96_0 = stackIn_96_0;
                    stackOut_96_1 = stackIn_96_1;
                    stackOut_96_2 = 0;
                    stackIn_98_0 = stackOut_96_0;
                    stackIn_98_1 = stackOut_96_1;
                    stackIn_98_2 = stackOut_96_2;
                    break L22;
                  }
                }
                fq.a(stackIn_98_0, stackIn_98_1, stackIn_98_2, var4 != 0);
                jc.field_c = true;
                break L18;
              } else {
                var7[var4] = jo.field_I[var4];
                var4++;
                continue L19;
              }
            }
          } else {
            break L18;
          }
        }
        L23: {
          if ((sq.field_b ^ -1) != 6) {
            break L23;
          } else {
            ti.field_d = null;
            var8 = new String[fr.field_n];
            var10 = var8;
            var4 = 0;
            L24: while (true) {
              if (var4 >= fr.field_n) {
                L25: {
                  stackOut_103_0 = null;
                  stackOut_103_1 = null;
                  stackOut_103_2 = oj.field_m;
                  stackOut_103_3 = la.field_a;
                  stackOut_103_4 = er.field_W;
                  stackOut_103_5 = re.field_f;
                  stackOut_103_6 = re.field_f;
                  stackIn_105_0 = stackOut_103_0;
                  stackIn_105_1 = stackOut_103_1;
                  stackIn_105_2 = stackOut_103_2;
                  stackIn_105_3 = stackOut_103_3;
                  stackIn_105_4 = stackOut_103_4;
                  stackIn_105_5 = stackOut_103_5;
                  stackIn_105_6 = stackOut_103_6;
                  stackIn_104_0 = stackOut_103_0;
                  stackIn_104_1 = stackOut_103_1;
                  stackIn_104_2 = stackOut_103_2;
                  stackIn_104_3 = stackOut_103_3;
                  stackIn_104_4 = stackOut_103_4;
                  stackIn_104_5 = stackOut_103_5;
                  stackIn_104_6 = stackOut_103_6;
                  if (-1 != (un.field_e ^ -1)) {
                    stackOut_105_0 = null;
                    stackOut_105_1 = null;
                    stackOut_105_2 = stackIn_105_2;
                    stackOut_105_3 = stackIn_105_3;
                    stackOut_105_4 = stackIn_105_4;
                    stackOut_105_5 = stackIn_105_5;
                    stackOut_105_6 = stackIn_105_6;
                    stackOut_105_7 = 0;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    stackIn_106_2 = stackOut_105_2;
                    stackIn_106_3 = stackOut_105_3;
                    stackIn_106_4 = stackOut_105_4;
                    stackIn_106_5 = stackOut_105_5;
                    stackIn_106_6 = stackOut_105_6;
                    stackIn_106_7 = stackOut_105_7;
                    break L25;
                  } else {
                    stackOut_104_0 = null;
                    stackOut_104_1 = null;
                    stackOut_104_2 = stackIn_104_2;
                    stackOut_104_3 = stackIn_104_3;
                    stackOut_104_4 = stackIn_104_4;
                    stackOut_104_5 = stackIn_104_5;
                    stackOut_104_6 = stackIn_104_6;
                    stackOut_104_7 = 1;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_106_1 = stackOut_104_1;
                    stackIn_106_2 = stackOut_104_2;
                    stackIn_106_3 = stackOut_104_3;
                    stackIn_106_4 = stackOut_104_4;
                    stackIn_106_5 = stackOut_104_5;
                    stackIn_106_6 = stackOut_104_6;
                    stackIn_106_7 = stackOut_104_7;
                    break L25;
                  }
                }
                L26: {
                  var4_ref_uf = new uf(stackIn_106_2, stackIn_106_3, stackIn_106_4, stackIn_106_5, stackIn_106_6, stackIn_106_7 != 0, var10, 0, false);
                  var4_ref_uf.field_I.a(ga.a(512, true, ea.field_r), -1, 0, (ba.field_ub.field_I.field_A - -1) % fr.field_n, param1 ^ 19063);
                  ba.field_ub = var4_ref_uf;
                  var5 = jd.field_a ? 1 : 0;
                  stackOut_106_0 = -3405;
                  stackOut_106_1 = -1;
                  stackIn_108_0 = stackOut_106_0;
                  stackIn_108_1 = stackOut_106_1;
                  stackIn_107_0 = stackOut_106_0;
                  stackIn_107_1 = stackOut_106_1;
                  if (mg.a(true)) {
                    stackOut_108_0 = stackIn_108_0;
                    stackOut_108_1 = stackIn_108_1;
                    stackOut_108_2 = 21;
                    stackIn_109_0 = stackOut_108_0;
                    stackIn_109_1 = stackOut_108_1;
                    stackIn_109_2 = stackOut_108_2;
                    break L26;
                  } else {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = stackIn_107_1;
                    stackOut_107_2 = 0;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_109_1 = stackOut_107_1;
                    stackIn_109_2 = stackOut_107_2;
                    break L26;
                  }
                }
                fq.a(stackIn_109_0, stackIn_109_1, stackIn_109_2, var5 != 0);
                jc.field_c = true;
                break L23;
              } else {
                var8[var4] = jo.field_I[var4];
                var4++;
                continue L24;
              }
            }
          }
        }
        L27: {
          if (sq.field_b == -6) {
            L28: {
              ti.field_d = null;
              var3 = di.field_j;
              if (var3 != null) {
                break L28;
              } else {
                var3 = vq.field_Zb;
                break L28;
              }
            }
            L29: {
              ba.field_ub = new uf(vh.field_Ab, new String[]{var3});
              if (!jd.field_a) {
                stackOut_116_0 = 0;
                stackIn_117_0 = stackOut_116_0;
                break L29;
              } else {
                stackOut_115_0 = 1;
                stackIn_117_0 = stackOut_115_0;
                break L29;
              }
            }
            L30: {
              var4 = stackIn_117_0;
              stackOut_117_0 = param1 + -3405;
              stackOut_117_1 = -1;
              stackIn_119_0 = stackOut_117_0;
              stackIn_119_1 = stackOut_117_1;
              stackIn_118_0 = stackOut_117_0;
              stackIn_118_1 = stackOut_117_1;
              if (mg.a(true)) {
                stackOut_119_0 = stackIn_119_0;
                stackOut_119_1 = stackIn_119_1;
                stackOut_119_2 = 21;
                stackIn_120_0 = stackOut_119_0;
                stackIn_120_1 = stackOut_119_1;
                stackIn_120_2 = stackOut_119_2;
                break L30;
              } else {
                stackOut_118_0 = stackIn_118_0;
                stackOut_118_1 = stackIn_118_1;
                stackOut_118_2 = 0;
                stackIn_120_0 = stackOut_118_0;
                stackIn_120_1 = stackOut_118_1;
                stackIn_120_2 = stackOut_118_2;
                break L30;
              }
            }
            fq.a(stackIn_120_0, stackIn_120_1, stackIn_120_2, var4 != 0);
            jc.field_c = true;
            break L27;
          } else {
            break L27;
          }
        }
        L31: {
          if (7 != (sq.field_b ^ -1)) {
            break L31;
          } else {
            L32: {
              ti.field_d = null;
              var3 = di.field_j;
              if (var3 == null) {
                var3 = vq.field_Zb;
                break L32;
              } else {
                break L32;
              }
            }
            L33: {
              stackOut_125_0 = null;
              stackOut_125_1 = null;
              stackOut_125_2 = f.field_f;
              stackOut_125_3 = -1;
              stackOut_125_4 = 4;
              stackOut_125_5 = 0;
              stackOut_125_6 = 0;
              stackIn_127_0 = stackOut_125_0;
              stackIn_127_1 = stackOut_125_1;
              stackIn_127_2 = stackOut_125_2;
              stackIn_127_3 = stackOut_125_3;
              stackIn_127_4 = stackOut_125_4;
              stackIn_127_5 = stackOut_125_5;
              stackIn_127_6 = stackOut_125_6;
              stackIn_126_0 = stackOut_125_0;
              stackIn_126_1 = stackOut_125_1;
              stackIn_126_2 = stackOut_125_2;
              stackIn_126_3 = stackOut_125_3;
              stackIn_126_4 = stackOut_125_4;
              stackIn_126_5 = stackOut_125_5;
              stackIn_126_6 = stackOut_125_6;
              if (un.field_e != 0) {
                stackOut_127_0 = null;
                stackOut_127_1 = null;
                stackOut_127_2 = stackIn_127_2;
                stackOut_127_3 = stackIn_127_3;
                stackOut_127_4 = stackIn_127_4;
                stackOut_127_5 = stackIn_127_5;
                stackOut_127_6 = stackIn_127_6;
                stackOut_127_7 = 0;
                stackIn_128_0 = stackOut_127_0;
                stackIn_128_1 = stackOut_127_1;
                stackIn_128_2 = stackOut_127_2;
                stackIn_128_3 = stackOut_127_3;
                stackIn_128_4 = stackOut_127_4;
                stackIn_128_5 = stackOut_127_5;
                stackIn_128_6 = stackOut_127_6;
                stackIn_128_7 = stackOut_127_7;
                break L33;
              } else {
                stackOut_126_0 = null;
                stackOut_126_1 = null;
                stackOut_126_2 = stackIn_126_2;
                stackOut_126_3 = stackIn_126_3;
                stackOut_126_4 = stackIn_126_4;
                stackOut_126_5 = stackIn_126_5;
                stackOut_126_6 = stackIn_126_6;
                stackOut_126_7 = 1;
                stackIn_128_0 = stackOut_126_0;
                stackIn_128_1 = stackOut_126_1;
                stackIn_128_2 = stackOut_126_2;
                stackIn_128_3 = stackOut_126_3;
                stackIn_128_4 = stackOut_126_4;
                stackIn_128_5 = stackOut_126_5;
                stackIn_128_6 = stackOut_126_6;
                stackIn_128_7 = stackOut_126_7;
                break L33;
              }
            }
            L34: {
              ba.field_ub = new uf(stackIn_128_2, stackIn_128_3, stackIn_128_4, stackIn_128_5, stackIn_128_6, stackIn_128_7 != 0, new String[]{var3}, 0, false);
              if (!jd.field_a) {
                stackOut_130_0 = 0;
                stackIn_131_0 = stackOut_130_0;
                break L34;
              } else {
                stackOut_129_0 = 1;
                stackIn_131_0 = stackOut_129_0;
                break L34;
              }
            }
            L35: {
              var4 = stackIn_131_0;
              stackOut_131_0 = -3405;
              stackOut_131_1 = -1;
              stackIn_133_0 = stackOut_131_0;
              stackIn_133_1 = stackOut_131_1;
              stackIn_132_0 = stackOut_131_0;
              stackIn_132_1 = stackOut_131_1;
              if (!mg.a(true)) {
                stackOut_133_0 = stackIn_133_0;
                stackOut_133_1 = stackIn_133_1;
                stackOut_133_2 = 0;
                stackIn_134_0 = stackOut_133_0;
                stackIn_134_1 = stackOut_133_1;
                stackIn_134_2 = stackOut_133_2;
                break L35;
              } else {
                stackOut_132_0 = stackIn_132_0;
                stackOut_132_1 = stackIn_132_1;
                stackOut_132_2 = 21;
                stackIn_134_0 = stackOut_132_0;
                stackIn_134_1 = stackOut_132_1;
                stackIn_134_2 = stackOut_132_2;
                break L35;
              }
            }
            fq.a(stackIn_134_0, stackIn_134_1, stackIn_134_2, var4 != 0);
            jc.field_c = true;
            break L31;
          }
        }
        L36: {
          if ((sq.field_b ^ -1) == 3) {
            ej.field_j.b(false, 9);
            ub.field_p = true;
            sq.field_b = ne.field_w;
            eq.field_U = ir.field_h;
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          if (sq.field_b != -5) {
            break L37;
          } else {
            nf.a(em.field_L.g(20872), true, 11);
            sq.field_b = ne.field_w;
            br.field_H = true;
            break L37;
          }
        }
        L38: {
          if (param1 == 0) {
            break L38;
          } else {
            field_Q = -123L;
            break L38;
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
            field_K = (String) null;
        }
        field_M = null;
    }

    final void a(byte param0) {
        int discarded$1 = 0;
        int var3_int = 0;
        bq var3 = null;
        int var4_int = 0;
        long var4 = 0L;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        java.awt.Canvas var11 = null;
        int stackIn_48_0 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_50_1 = 0;
        int stackOut_47_0 = 0;
        int stackOut_49_0 = 0;
        boolean stackOut_49_1 = false;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        var10 = field_O;
        var11 = vj.a((byte) -126);
        if (ue.a((byte) -123)) {
          fo.a((byte) -55, fq.m(0), var11);
          return;
        } else {
          if (rm.field_d) {
            if (param0 == 120) {
              if (!uf.d(false)) {
                fo.a(cf.field_c, 100.0f, false);
                vc.a(true, var11);
                return;
              } else {
                L0: {
                  L1: {
                    if (de.field_g) {
                      break L1;
                    } else {
                      if (ne.field_w != sq.field_b) {
                        if (1 != (ne.field_w ^ -1)) {
                          if (-2 == sq.field_b) {
                            vl.a(ne.field_w, -21972, false, nk.field_d);
                            pn.field_l.a(0, 0, (sg.field_P << 1591241736) / 32);
                            break L0;
                          } else {
                            var3_int = dp.a(sg.field_P, 32, 108);
                            qh.c(0, 0, var3_int, qh.field_f);
                            fb.a();
                            fb.b(320, 240);
                            vl.a(sq.field_b, -21972, false, jc.field_c);
                            qh.c(var3_int, 0, qh.field_l, qh.field_f);
                            fb.a();
                            fb.b(320, 240);
                            vl.a(ne.field_w, -21972, false, nk.field_d);
                            qh.c();
                            fb.a();
                            nn.a(true, 32, sg.field_P);
                            break L0;
                          }
                        } else {
                          vl.a(sq.field_b, -21972, false, jc.field_c);
                          var3_int = 32 - sg.field_P;
                          pn.field_l.a(0, 0, (var3_int << -1062299512) / 32);
                          break L0;
                        }
                      } else {
                        break L1;
                      }
                    }
                  }
                  vl.a(ne.field_w, -21972, true, nk.field_d);
                  break L0;
                }
                L2: {
                  L3: {
                    if (!nk.field_d) {
                      break L3;
                    } else {
                      if (jc.field_c) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    if (sq.field_b != ne.field_w) {
                      break L4;
                    } else {
                      if ((ne.field_w ^ -1) == 1) {
                        pn.field_l.a(0, 0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  hr.a(cp.a((byte) 79), (byte) 50);
                  break L2;
                }
                L5: {
                  if (!de.field_g) {
                    break L5;
                  } else {
                    L6: {
                      if ((ne.field_w ^ -1) > -1) {
                        qh.d();
                        break L6;
                      } else {
                        s.field_c[ne.field_w].c(87);
                        qh.g(0, 0, qh.field_l, qh.field_f);
                        break L6;
                      }
                    }
                    var3_int = qh.field_l + -400 >> -2098633567;
                    var4_int = qh.field_f - 140 >> 962112353;
                    nj.a(rm.field_g, (byte) 14, 400, var3_int, var4_int, 140);
                    discarded$1 = mc.field_e.a(kh.field_gc.field_l, 20 + var3_int, 20 + var4_int, 360, 64, 1, -1, 1, 1, 0);
                    qh.f(20 + var3_int, -20 + (140 + (var4_int + -20)), 360, 20, 0);
                    qh.f(20 + (var3_int + 2), -20 + (140 + var4_int) + -18, kh.field_gc.field_H * 356 / (kh.field_gc.field_G + -1), 16, 16615680);
                    break L5;
                  }
                }
                L7: {
                  var3 = (bq) ((Object) ui.field_U.c((byte) -102));
                  if (var3 == null) {
                    break L7;
                  } else {
                    L8: {
                      var5 = aa.field_h;
                      if (-81 < (var5 ^ -1)) {
                        var4_int = -32 + var5 / 2;
                        break L8;
                      } else {
                        if (var5 >= 230) {
                          var4_int = 123 - var5 / 2;
                          break L8;
                        } else {
                          var4_int = 8;
                          break L8;
                        }
                      }
                    }
                    li.field_f[var3.field_l].c(8, var4_int, 32, 32);
                    mc.field_e.d(md.field_a[var3.field_l], 48, var4_int + mc.field_e.field_C, 4, 1);
                    break L7;
                  }
                }
                L9: {
                  if (bj.c(1)) {
                    qh.g(0, 0, qh.field_l, qh.field_f);
                    hq.h(-29322);
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (ue.a(param0 + -109)) {
                    L11: {
                      stackOut_47_0 = -82;
                      stackIn_49_0 = stackOut_47_0;
                      stackIn_48_0 = stackOut_47_0;
                      if (null == ne.field_u) {
                        stackOut_49_0 = stackIn_49_0;
                        stackOut_49_1 = um.field_e;
                        stackIn_50_0 = stackOut_49_0;
                        stackIn_50_1 = stackOut_49_1 ? 1 : 0;
                        break L11;
                      } else {
                        stackOut_48_0 = stackIn_48_0;
                        stackOut_48_1 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        stackIn_50_1 = stackOut_48_1;
                        break L11;
                      }
                    }
                    ok.a(stackIn_50_0, stackIn_50_1 != 0);
                    break L10;
                  } else {
                    if (!md.a((byte) -84)) {
                      break L10;
                    } else {
                      if (!bj.c(1)) {
                        qh.g(0, 0, qh.field_l, qh.field_f);
                        hk.c(1527590113);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                L12: {
                  if (me.field_o != me.field_s) {
                    var4_int = uk.field_m * 256 / 16;
                    if (-1 > (var4_int ^ -1)) {
                      qh.c(0, 0, qh.field_l, qh.field_f, 0, var4_int);
                      break L12;
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (-1L != (32L & pd.field_i ^ -1L)) {
                    sa.field_h.d(Integer.toString(un.field_g), 640 - sa.field_h.field_C * 2, 475 - sa.field_h.field_w, 16777215, 1);
                    break L13;
                  } else {
                    break L13;
                  }
                }
                L14: {
                  if ((pd.field_i & 64L ^ -1L) != -1L) {
                    var4 = Runtime.getRuntime().totalMemory();
                    var6 = Runtime.getRuntime().freeMemory();
                    var8 = (int)(var4 + -var6) / 1024;
                    var9 = (int)(var4 / 1024L);
                    sa.field_h.d(var8 + "/" + var9, -((sa.field_h.field_C - -sa.field_h.field_w) * 4) + (640 - 2 * sa.field_h.field_C), -((sa.field_h.field_w + sa.field_h.field_C) * 3 / 2) + -5 + 480 - sa.field_h.field_w, 16777215, 1);
                    break L14;
                  } else {
                    break L14;
                  }
                }
                fe.a(0, 0, (byte) 85, var11);
                return;
              }
            } else {
              return;
            }
          } else {
            vc.a(true, var11);
            return;
          }
        }
    }

    final void h(byte param0) {
        L0: {
          Pool.c(false);
          fb.b();
          dp.c(param0 ^ -3723);
          bq.c((byte) -101);
          ko.d(-102);
          ab.b(-75);
          il.a(param0 ^ 41);
          l.a(19545);
          o.e(116);
          md.a(true);
          hp.a((byte) -71);
          tm.d(-22799);
          jk.b((byte) -93);
          ag.a(0);
          oo.l(-15631);
          cj.m(112);
          vf.e((byte) 76);
          ob.d((byte) 107);
          pj.b(false);
          fo.a(-1);
          ra.a(false);
          ta.b(24470);
          pk.a((byte) 101);
          ep.a(true);
          oa.a(param0 ^ -28);
          kq.g((byte) -77);
          ej.a(true);
          ql.a((byte) -109);
          id.a((byte) 35);
          qh.a();
          di.e(0);
          ge.e(4109);
          rl.a(-125);
          lf.a((byte) 112);
          wb.a((byte) 118);
          kc.a((byte) 123);
          dq.a((byte) 80);
          a.a(0);
          bi.a(0);
          hn.b(param0 + 39);
          m.a((byte) -69);
          pn.a(param0 ^ -28);
          ol.a(param0 ^ -1430775244);
          sb.a((byte) 124);
          kb.a((byte) 111);
          iq.a(-26830);
          rb.a((byte) 126);
          od.a(255);
          hr.c(-44);
          no.b(117);
          rn.b(10);
          qd.a((byte) 84);
          ir.a((byte) -42);
          vb.a(true);
          s.a(-1);
          d.a((byte) -110);
          ek.a((byte) -107);
          fc.a((byte) -43);
          vh.e((byte) 8);
          hh.a(28882);
          hg.b(false);
          c.a(-13679);
          eg.f();
          lr.a();
          cf.a(param0 + 28774);
          uf.c(true);
          nk.d(param0 + 28);
          ma.b((byte) 115);
          vk.c(-819201);
          bm.a((byte) 91);
          gq.g();
          ib.d(-1);
          bp.c();
          rq.c((byte) 75);
          cb.a(param0 + 28583);
          ic.a(-512);
          kh.g((byte) -124);
          tk.b((byte) -109);
          im.f((byte) -48);
          ae.a((byte) -26);
          tc.a(false);
          aa.a((byte) -5);
          de.b(-1);
          th.a(15059);
          cl.a((byte) -76);
          uc.b((byte) 112);
          aq.a(false);
          pl.a(param0 + -23306);
          qe.d((byte) 114);
          ul.a((byte) -27);
          gf.a(true);
          lk.a(-24061);
          gp.a(63);
          hq.i(5);
          al.b(10);
          kj.b(param0 ^ 9401);
          oq.c(true);
          mm.c(-13569);
          or.a(false);
          li.a(param0 ^ 81);
          pq.b((byte) -66);
          bf.c((byte) 77);
          dl.b(false);
          sq.d(13);
          jq.a(false);
          ia.g(80);
          ad.a(20592);
          oh.a((byte) -92);
          lh.a((byte) -41);
          je.a((byte) -125);
          lq.g((byte) -47);
          fq.l(param0 + 33);
          wa.n(7585);
          ba.k(-124);
          qq.n((byte) -86);
          nf.h((byte) 4);
          nr.a(20868);
          ui.a(-31360);
          jp.a(false);
          ke.a(false);
          mj.a((byte) -83);
          ii.a(127);
          nc.e();
          p.b(75);
          ec.a((byte) 116);
          mk.a(0);
          hm.a(param0 + 144);
          vc.d((byte) 117);
          so.c(param0 ^ -9943);
          qo.c((byte) 11);
          rg.c(-3604);
          jc.a(param0 ^ -28);
          bh.a(false);
          wg.f(-1);
          db.h((byte) 118);
          vq.f(126);
          ao.d(true);
          kn.c((byte) -116);
          of.f(param0 + 28);
          wm.f((byte) -93);
          vi.b(-115);
          da.b((byte) 108);
          uo.f((byte) -102);
          vn.a(true);
          fh.a((byte) 62);
          td.a((byte) 86);
          rk.a(false);
          jh.a(21546);
          tp.a(0);
          bb.a((byte) -118);
          nm.a(false);
          gd.a(-2182);
          w.a(62);
          ue.b(false);
          wn.a(true);
          jj.i(100);
          uj.a((byte) 33);
          fn.g(56);
          ll.a(-69);
          gn.a(1);
          jl.a((byte) 43);
          tf.a(param0 ^ -91);
          re.a(param0 ^ 17031);
          wd.f(-1);
          aj.c(false);
          ij.a(param0 + -273542787);
          en.a(param0 ^ -8380);
          v.a((byte) 126);
          ho.a(true);
          ff.a((byte) 87);
          dr.a(11468);
          t.c(param0 ^ 88);
          mq.a(false);
          fj.b(false);
          um.a(116);
          ef.b(1);
          ah.a(false);
          un.a((byte) -101);
          ni.e((byte) 71);
          fk.m(param0 + -100);
          gh.e((byte) -116);
          mf.i(1);
          nn.a(param0 + 16034);
          vl.i(120);
          jr.i(10860);
          to.i(param0 ^ -20);
          ac.i(85);
          pi.b();
          be.f((byte) -89);
          pa.g(param0 + -73);
          jo.f(8);
          lb.g(-79);
          em.g(-126);
          tl.g(0);
          b.f((byte) -90);
          el.b(false);
          br.b(false);
          hd.b(true);
          cm.g((byte) 74);
          sg.f(param0 ^ -506724219);
          og.f((byte) -103);
          ug.h(param0 ^ 80);
          wo.a(true);
          np.a(true);
          dg.c((byte) -80);
          up.a(true);
          pp.a((byte) -25);
          gr.f(-121);
          f.a((byte) 105);
          gk.i((byte) -82);
          am.a((byte) 119);
          gm.a();
          oc.c(-47);
          bc.a((byte) -8);
          bo.b((byte) 45);
          wf.a(25131);
          mg.a((byte) -44);
          cq.a((byte) -90);
          cn.b((byte) 38);
          qg.a(0);
          wi.b(-30521);
          mb.c(4);
          rh.a();
          uq.a(-8090);
          ja.a(726237729);
          qk.a(param0 ^ 32);
          hl.a(false);
          lg.a(true);
          vd.a(-1);
          nd.a((byte) -108);
          if (param0 == -28) {
            break L0;
          } else {
            field_P = (vh) null;
            break L0;
          }
        }
        op.b(0);
        ei.c((byte) 80);
        fe.f((byte) 72);
        ud.a(param0 ^ -80);
        tj.h((byte) -16);
        oe.h(-1);
        ch.f(2);
        rp.a((byte) 13);
        mr.a();
        cp.b(true);
        hf.a(0);
        wp.a(0);
        la.a(param0 ^ -115);
        qp.h(param0 ^ 99);
        ee.a((byte) -70);
        wh.a((byte) -62);
        sf.e(param0 + -89);
        ap.c((byte) -111);
        fg.a((byte) 0);
        bg.a(param0 + 16885);
        lo.c(param0 + 149);
        hk.c((byte) 122);
        jf.c(2);
        pc.a(-24420);
        dj.a(true);
        ld.c(8);
        pb.a();
        te.c((byte) 127);
        e.a(true);
        q.a(101);
        ci.a((byte) 8);
        ti.a(param0 ^ 20983);
        af.h((byte) -75);
        rj.d((byte) -104);
        g.a(5893);
        kp.a(104);
        mc.d((byte) -105);
        vp.p(-9);
        sn.a((byte) -119);
        co.a(true);
        fm.g(16);
        rf.a(false);
        n.g((byte) -85);
        sl.i((byte) 23);
        ok.i((byte) -45);
        gj.a(true);
        mp.a(160);
        lc.g((byte) -69);
        ck.a(-110);
        ri.a(param0 + 117);
        ig.a((byte) 122);
        rm.a((byte) -20);
        sd.a(122);
        er.g((byte) 121);
        va.a(2);
        rc.a(true);
        eq.i(-12253);
        ih.a(param0 + 133);
        ve.c(-13268);
        hi.f(125);
        wj.h(-34);
        k.h(120);
        uk.a(param0 + -69);
        qi.b(14676);
        kk.f(1);
        hj.a((byte) -103);
        fd.i(param0 ^ -28);
        kr.c(15296);
        on.a();
        sk.a(param0 ^ -27);
        hb.a(0);
        mn.a(19000);
        eh.a(param0 + 136);
        oj.a(-19382);
        tg.a(-10562);
        ea.d((byte) 124);
        kf.a(-1);
        vm.a(false);
        bj.a(param0 + -4275);
        ng.d(-1);
        pd.a(true);
        om.c((byte) -37);
        sm.c(2);
        j.a(16);
        sh.g((byte) 118);
        eo.f((byte) -105);
        we.a((byte) -110);
        gi.a(true);
        tq.a(param0 ^ -28);
        i.c((byte) 73);
        qr.a((byte) 83);
        nl.a(-54);
        fr.c((byte) 69);
        cr.c((byte) 90);
        dn.a(param0 + -2020);
        ro.a(240);
        bk.a(-5917);
        df.b((byte) 115);
        ph.a(false);
        wc.a(72);
        wk.h(-124);
        ar.a(10);
        pm.c(0);
        tn.c((byte) 5);
        ml.a(-26458);
        se.b(param0 + -1431655738);
        ub.a(true);
        ca.b(17518);
        dk.a((byte) 113);
        ji.a(false);
        jd.a((byte) 79);
        bl.a(127);
        qf.a(true);
        he.a(param0 ^ 23);
        fl.a(59);
        oi.c((byte) -124);
        ln.a(param0 ^ -27827);
        kg.d((byte) -103);
        pf.a((byte) 8);
        vj.b(param0 ^ 27721);
        sa.a(param0 + -13237);
        na.a((byte) 43);
        gg.e(-1);
        ua.h(-110);
        uh.b(true);
        r.b((byte) 113);
        me.b(true);
        ka.b(true);
        ne.b((byte) 15);
        cd.a(param0 ^ -94);
        qa.c((byte) 33);
        ie.a((byte) -13);
        this.field_t = null;
    }

    final void d(byte param0) {
        vk var3 = null;
        L0: {
          this.a(5, 19, 0, 2, 1, false, 61, 1);
          var3 = new vk();
          sg.a((java.awt.Component) ((Object) pa.field_K), var3, 22050, lg.field_s, 10282, true);
          this.a(param0 ^ 45, false, true, true, true, false, true);
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
            this.init();
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
            qk.a(kq.field_m, -8);
            kq.field_m = null;
            fm.a(0);
        }
        if (param0 > -103) {
            this.d((byte) -93);
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
        int[] var23 = null;
        int[] var24 = null;
        int stackIn_47_0 = 0;
        int stackIn_50_0 = 0;
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
        uf stackIn_56_0 = null;
        uf stackIn_56_1 = null;
        int stackIn_56_2 = 0;
        int stackIn_56_3 = 0;
        int stackIn_56_4 = 0;
        int stackIn_56_5 = 0;
        int stackIn_56_6 = 0;
        int stackIn_56_7 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_100_0 = 0;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        int stackOut_99_0 = 0;
        int stackOut_99_1 = 0;
        int stackOut_99_2 = 0;
        int stackOut_98_0 = 0;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        uf stackOut_53_0 = null;
        uf stackOut_53_1 = null;
        int stackOut_53_2 = 0;
        int stackOut_53_3 = 0;
        int stackOut_53_4 = 0;
        int stackOut_53_5 = 0;
        int stackOut_53_6 = 0;
        uf stackOut_55_0 = null;
        uf stackOut_55_1 = null;
        int stackOut_55_2 = 0;
        int stackOut_55_3 = 0;
        int stackOut_55_4 = 0;
        int stackOut_55_5 = 0;
        int stackOut_55_6 = 0;
        int stackOut_55_7 = 0;
        uf stackOut_54_0 = null;
        uf stackOut_54_1 = null;
        int stackOut_54_2 = 0;
        int stackOut_54_3 = 0;
        int stackOut_54_4 = 0;
        int stackOut_54_5 = 0;
        int stackOut_54_6 = 0;
        int stackOut_54_7 = 0;
        int[] var13_array = null;
        int[] var15_array = null;
        int[] var18_array = null;
        int[] var19_array = null;
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
              if ((uq.field_c ^ -1) == -15) {
                al.l(-124);
                mk.a(hh.a((byte) 1), 1024, nf.g((byte) 103), 150, te.field_p, te.a(-17931, 8), te.a(-17931, 2000), gh.f(true), 4, 13162);
                rp.a(im.f(0), db.f((byte) 13), -36);
                ub.field_p = false;
                un.field_b = true;
                td.field_d = true;
                sq.field_b = -2;
                ib.field_r = 0;
                continue L1;
              } else {
                if (15 != uq.field_c) {
                  L2: {
                    if ((uq.field_c ^ -1) != -11) {
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
                  if (-75 != (uq.field_c ^ -1)) {
                    L3: {
                      if (-66 == (uq.field_c ^ -1)) {
                        break L3;
                      } else {
                        if (uq.field_c != 64) {
                          if (-67 == (uq.field_c ^ -1)) {
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
                                  var2 = am.field_e;
                                  break L7;
                                }
                              } else {
                                var2 = ba.field_ub;
                                break L7;
                              }
                            }
                            L8: {
                              if (var2 != null) {
                                if ((uq.field_c ^ -1) != -80) {
                                  if ((uq.field_c ^ -1) == -68) {
                                    ((uf) (var2)).b(kn.field_e, false);
                                    continue L1;
                                  } else {
                                    if ((uq.field_c ^ -1) != -69) {
                                      if (uq.field_c != 76) {
                                        if ((uq.field_c ^ -1) != -79) {
                                          if (-76 != (uq.field_c ^ -1)) {
                                            if (-78 != (uq.field_c ^ -1)) {
                                              if ((uq.field_c ^ -1) != -70) {
                                                if (uq.field_c != 70) {
                                                  if ((uq.field_c ^ -1) == -72) {
                                                    ((uf) (var2)).field_I.field_p = kn.field_e.g(param0 + -63);
                                                    ((uf) (var2)).field_I.field_x = ((uf) (var2)).field_I.field_x & (((uf) (var2)).field_I.field_p ^ -1);
                                                    continue L1;
                                                  } else {
                                                    if (uq.field_c == 72) {
                                                      ((uf) (var2)).field_I.field_b = kn.field_e.g(param0 + -119);
                                                      if (ba.field_ub == null) {
                                                        continue L1;
                                                      } else {
                                                        ni.f((byte) -119);
                                                        continue L1;
                                                      }
                                                    } else {
                                                      if (73 != uq.field_c) {
                                                        break L8;
                                                      } else {
                                                        ((uf) (var2)).field_cb = kn.field_e.g(-105);
                                                        ((uf) (var2)).field_I.field_b = ((uf) (var2)).field_I.field_b & (((uf) (var2)).field_cb ^ -1);
                                                        if (null != ba.field_ub) {
                                                          ni.f((byte) -119);
                                                          continue L1;
                                                        } else {
                                                          continue L1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  ((uf) (var2)).field_I.field_x = kn.field_e.g(param0 ^ -92);
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
                                                  ((uf) (var2)).field_I.c(param0 + -14289, var3);
                                                  if (((uf) (var2)).field_db == var3) {
                                                    kh.field_gc.a(17, 256, (byte) -121, 128);
                                                    break L9;
                                                  } else {
                                                    kh.field_gc.a(18, 256, (byte) -114, 128);
                                                    break L9;
                                                  }
                                                }
                                                L10: {
                                                  var20 = var2;
                                                  stackOut_97_0 = -3405;
                                                  stackOut_97_1 = -1;
                                                  stackIn_99_0 = stackOut_97_0;
                                                  stackIn_99_1 = stackOut_97_1;
                                                  stackIn_98_0 = stackOut_97_0;
                                                  stackIn_98_1 = stackOut_97_1;
                                                  if (mg.a(true)) {
                                                    stackOut_99_0 = stackIn_99_0;
                                                    stackOut_99_1 = stackIn_99_1;
                                                    stackOut_99_2 = 21;
                                                    stackIn_100_0 = stackOut_99_0;
                                                    stackIn_100_1 = stackOut_99_1;
                                                    stackIn_100_2 = stackOut_99_2;
                                                    break L10;
                                                  } else {
                                                    stackOut_98_0 = stackIn_98_0;
                                                    stackOut_98_1 = stackIn_98_1;
                                                    stackOut_98_2 = 0;
                                                    stackIn_100_0 = stackOut_98_0;
                                                    stackIn_100_1 = stackOut_98_1;
                                                    stackIn_100_2 = stackOut_98_2;
                                                    break L10;
                                                  }
                                                }
                                                fq.a(stackIn_100_0, stackIn_100_1, stackIn_100_2, false);
                                                ((uf) (var20)).a(-23095);
                                                if ((f.field_f & ((uf) (var20)).field_L) == 0) {
                                                  continue L1;
                                                } else {
                                                  ne.field_w = 23;
                                                  sq.field_b = 23;
                                                  continue L1;
                                                }
                                              }
                                            } else {
                                              ((uf) (var2)).d(4096, kn.field_e);
                                              continue L1;
                                            }
                                          } else {
                                            ((uf) (var2)).a(96, kn.field_e);
                                            continue L1;
                                          }
                                        } else {
                                          ((uf) (var2)).b(69, kn.field_e);
                                          continue L1;
                                        }
                                      } else {
                                        ((uf) (var2)).a(kn.field_e, false);
                                        continue L1;
                                      }
                                    } else {
                                      ((uf) (var2)).a(kn.field_e, 0);
                                      continue L1;
                                    }
                                  }
                                } else {
                                  ((uf) (var2)).g(true);
                                  continue L1;
                                }
                              } else {
                                break L8;
                              }
                            }
                            this.f(15000);
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
                      if ((var2_int ^ -1) != -16) {
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
                        stackOut_46_0 = 0;
                        stackIn_47_0 = stackOut_46_0;
                        break L12;
                      } else {
                        stackOut_45_0 = 1;
                        stackIn_47_0 = stackOut_45_0;
                        break L12;
                      }
                    }
                    L13: {
                      var4 = stackIn_47_0;
                      if ((kn.field_e.e(1, 111) ^ -1) != -2) {
                        stackOut_49_0 = 0;
                        stackIn_50_0 = stackOut_49_0;
                        break L13;
                      } else {
                        stackOut_48_0 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        break L13;
                      }
                    }
                    var5 = stackIn_50_0;
                    kn.field_e.o(8);
                    var6 = new String[kn.field_e.g(param0 ^ -70)];
                    var7_int = 0;
                    L14: while (true) {
                      if (var7_int >= var6.length) {
                        L15: {
                          ti.field_d = null;
                          stackOut_53_0 = null;
                          stackOut_53_1 = null;
                          stackOut_53_2 = hq.field_c;
                          stackOut_53_3 = la.field_a;
                          stackOut_53_4 = er.field_W;
                          stackOut_53_5 = re.field_f;
                          stackOut_53_6 = var3;
                          stackIn_55_0 = stackOut_53_0;
                          stackIn_55_1 = stackOut_53_1;
                          stackIn_55_2 = stackOut_53_2;
                          stackIn_55_3 = stackOut_53_3;
                          stackIn_55_4 = stackOut_53_4;
                          stackIn_55_5 = stackOut_53_5;
                          stackIn_55_6 = stackOut_53_6;
                          stackIn_54_0 = stackOut_53_0;
                          stackIn_54_1 = stackOut_53_1;
                          stackIn_54_2 = stackOut_53_2;
                          stackIn_54_3 = stackOut_53_3;
                          stackIn_54_4 = stackOut_53_4;
                          stackIn_54_5 = stackOut_53_5;
                          stackIn_54_6 = stackOut_53_6;
                          if (un.field_e != 0) {
                            stackOut_55_0 = null;
                            stackOut_55_1 = null;
                            stackOut_55_2 = stackIn_55_2;
                            stackOut_55_3 = stackIn_55_3;
                            stackOut_55_4 = stackIn_55_4;
                            stackOut_55_5 = stackIn_55_5;
                            stackOut_55_6 = stackIn_55_6;
                            stackOut_55_7 = 0;
                            stackIn_56_0 = stackOut_55_0;
                            stackIn_56_1 = stackOut_55_1;
                            stackIn_56_2 = stackOut_55_2;
                            stackIn_56_3 = stackOut_55_3;
                            stackIn_56_4 = stackOut_55_4;
                            stackIn_56_5 = stackOut_55_5;
                            stackIn_56_6 = stackOut_55_6;
                            stackIn_56_7 = stackOut_55_7;
                            break L15;
                          } else {
                            stackOut_54_0 = null;
                            stackOut_54_1 = null;
                            stackOut_54_2 = stackIn_54_2;
                            stackOut_54_3 = stackIn_54_3;
                            stackOut_54_4 = stackIn_54_4;
                            stackOut_54_5 = stackIn_54_5;
                            stackOut_54_6 = stackIn_54_6;
                            stackOut_54_7 = 1;
                            stackIn_56_0 = stackOut_54_0;
                            stackIn_56_1 = stackOut_54_1;
                            stackIn_56_2 = stackOut_54_2;
                            stackIn_56_3 = stackOut_54_3;
                            stackIn_56_4 = stackOut_54_4;
                            stackIn_56_5 = stackOut_54_5;
                            stackIn_56_6 = stackOut_54_6;
                            stackIn_56_7 = stackOut_54_7;
                            break L15;
                          }
                        }
                        L16: {
                          var7 = new uf(stackIn_56_2, stackIn_56_3, stackIn_56_4, stackIn_56_5, stackIn_56_6, stackIn_56_7 != 0, var6, var2_int, var4 != 0);
                          var7.c(16915, kn.field_e);
                          if (65 != uq.field_c) {
                            mj.field_e = true;
                            am.field_e = var7;
                            break L16;
                          } else {
                            ib.field_v = true;
                            ba.field_ub = var7;
                            bm.a(false);
                            ni.f((byte) -119);
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
                    var22 = ek.a(-8);
                    var17 = var22;
                    var2 = var17;
                    var9 = (int[]) (var2);
                    var4_ref_oq = kn.field_e;
                    var5 = ((ge) ((Object) var4_ref_oq)).g(-100);
                    var6_int = 0;
                    L18: while (true) {
                      if (var6_int >= var5) {
                        var10 = (int[]) (var2);
                        var21 = oa.field_g;
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
                                  if (var3 >= md.field_a.length) {
                                    break L20;
                                  } else {
                                    if (fe.a(var22, param0 ^ -13670, var3)) {
                                      ui.field_U.b((byte) -3, new bq(var3));
                                      var3++;
                                      continue L21;
                                    } else {
                                      var3++;
                                      continue L21;
                                    }
                                  }
                                }
                              } else {
                                break L20;
                              }
                            }
                            var12 = oa.field_g;
                            var23 = (int[]) (var2);
                            var18_array = var23;
                            var13_array = var18_array;
                            var4_ref_int__ = var13_array;
                            var5 = 0;
                            L22: while (true) {
                              if (8 <= var5) {
                                var14 = hp.field_c;
                                var24 = (int[]) (var2);
                                var19_array = var24;
                                var15_array = var19_array;
                                var4_ref_int__ = var15_array;
                                var5 = 0;
                                L23: while (true) {
                                  if (-9 >= (var5 ^ -1)) {
                                    continue L1;
                                  } else {
                                    var14[var5] = md.a(var14[var5], var24[var5]);
                                    var5++;
                                    continue L23;
                                  }
                                }
                              } else {
                                var12[var5] = md.a(var12[var5], var23[var5]);
                                var5++;
                                continue L22;
                              }
                            }
                          } else {
                            var10[var5] = rb.b(var10[var5], var21[var5] ^ -1);
                            var5++;
                            continue L19;
                          }
                        }
                      } else {
                        var9[var6_int] = ((ge) ((Object) var4_ref_oq)).b(true);
                        var6_int++;
                        continue L18;
                      }
                    }
                  }
                } else {
                  L24: {
                    if (td.field_d) {
                      al.l(param0 + -127);
                      lq.a(true);
                      ko.g((byte) 74);
                      sq.field_b = 0;
                      mj.field_e = false;
                      vq.field_Sb = true;
                      td.field_d = false;
                      jc.field_c = false;
                      ib.field_v = false;
                      l.field_a = true;
                      am.b(120);
                      break L24;
                    } else {
                      break L24;
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
        boolean discarded$0 = false;
        if (!(!ea.field_z)) {
            return sg.field_J.a(-81, qi.field_a, ml.field_b);
        }
        if (fm.field_H) {
            return tf.a(15585, param2, param1);
        }
        if (!(!oj.a(param1, param2, -10))) {
            return true;
        }
        if (param3 != -80) {
            discarded$0 = Pool.a(122, -100, -91, -77);
        }
        if (!(!hr.field_y)) {
            return false;
        }
        return th.a(param1, param3 + 174, param0);
    }

    final void e(byte param0) {
        int discarded$2 = 0;
        boolean discarded$3 = false;
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
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_70_0 = 0;
        int stackIn_70_1 = 0;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_74_0 = 0;
        int stackIn_74_1 = 0;
        int stackIn_75_0 = 0;
        int stackIn_75_1 = 0;
        int stackIn_76_0 = 0;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int stackOut_73_0 = 0;
        int stackOut_73_1 = 0;
        int stackOut_75_0 = 0;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_74_0 = 0;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int stackOut_69_0 = 0;
        int stackOut_69_1 = 0;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        L0: {
          var5 = field_O;
          discarded$2 = nj.a(-21055);
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
          this.c(stackIn_6_1, stackIn_6_2 != 0);
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
            this.l((byte) -75);
            if (!ue.a((byte) -111)) {
              break L3;
            } else {
              if (!gg.a(true)) {
                return;
              } else {
                discarded$3 = this.d(95, false);
                return;
              }
            }
          }
        }
        L4: {
          if (!rm.field_d) {
            ln.a(0, wp.field_d);
            if (!this.d(82, true)) {
              break L4;
            } else {
              rm.field_d = true;
              break L4;
            }
          } else {
            if (!uf.d(false)) {
              ro.b(-26);
              break L4;
            } else {
              if (!bj.c(1)) {
                if (!ue.a(11)) {
                  if (!md.a((byte) -122)) {
                    if (!de.field_g) {
                      this.a(false, 0);
                      break L4;
                    } else {
                      kh.field_gc.j(2);
                      fm.a(0);
                      if (kh.field_gc.field_G != kh.field_gc.field_H) {
                        break L4;
                      } else {
                        kh.field_gc.d(16);
                        de.field_g = false;
                        break L4;
                      }
                    }
                  } else {
                    if (me.field_s != me.field_o) {
                      this.a(false, 0);
                      break L4;
                    } else {
                      L5: {
                        var3 = tl.h(8);
                        if (var3 == 1) {
                          bl.field_x = true;
                          nk.a(pl.field_d, 0, (byte) 88);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.a(true, 0);
                      break L4;
                    }
                  }
                } else {
                  L6: {
                    stackOut_26_0 = this;
                    stackIn_28_0 = stackOut_26_0;
                    stackIn_27_0 = stackOut_26_0;
                    if (null == ne.field_u) {
                      stackOut_28_0 = this;
                      stackOut_28_1 = 0;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      break L6;
                    } else {
                      stackOut_27_0 = this;
                      stackOut_27_1 = 1;
                      stackIn_29_0 = stackOut_27_0;
                      stackIn_29_1 = stackOut_27_1;
                      break L6;
                    }
                  }
                  L7: {
                    var3 = this.a(stackIn_29_1 != 0, false);
                    if (1 == var3) {
                      break L7;
                    } else {
                      if ((var3 ^ -1) == -3) {
                        break L7;
                      } else {
                        this.a(true, 0);
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (ne.field_u != null) {
                      tq.d((byte) -101);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  if ((var3 ^ -1) != -3) {
                    this.a(true, 0);
                    break L4;
                  } else {
                    tk.a(-1, hk.d(72));
                    this.a(true, 0);
                    break L4;
                  }
                }
              } else {
                if (me.field_s == me.field_o) {
                  var3 = gh.n(-1);
                  if (2 != var3) {
                    if (var3 != 3) {
                      L9: {
                        if (var3 == 4) {
                          nm.field_c = true;
                          nk.a(jc.field_d, 0, (byte) 78);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      this.a(true, 0);
                      break L4;
                    } else {
                      nm.field_c = false;
                      qr.a(-28038, true);
                      this.a(true, 0);
                      break L4;
                    }
                  } else {
                    tq.d((byte) -104);
                    this.a(true, 0);
                    break L4;
                  }
                } else {
                  this.a(false, 0);
                  break L4;
                }
              }
            }
          }
        }
        L10: {
          if (hk.b(-119)) {
            break L10;
          } else {
            L11: while (true) {
              var6 = (i) ((Object) ad.field_l.e((byte) -41));
              if (var6 == null) {
                break L10;
              } else {
                aa.a(false, var6, 4);
                continue L11;
              }
            }
          }
        }
        L12: {
          this.k(3);
          if (un.field_b) {
            ib.field_r = 0;
            break L12;
          } else {
            break L12;
          }
        }
        L13: {
          if (pk.b((byte) 109)) {
            L14: {
              L15: {
                var3 = this.k((byte) -125);
                if (var3 == 0) {
                  break L15;
                } else {
                  if (-2 == (var3 ^ -1)) {
                    break L15;
                  } else {
                    break L14;
                  }
                }
              }
              rq.c(946);
              if (var3 != 1) {
                L16: {
                  if (!td.field_d) {
                    break L16;
                  } else {
                    L17: {
                      vq.field_Sb = true;
                      l.field_a = true;
                      jc.field_c = false;
                      if (!ib.field_v) {
                        L18: {
                          stackOut_73_0 = -3405;
                          stackOut_73_1 = 0;
                          stackIn_75_0 = stackOut_73_0;
                          stackIn_75_1 = stackOut_73_1;
                          stackIn_74_0 = stackOut_73_0;
                          stackIn_74_1 = stackOut_73_1;
                          if (!mg.a(true)) {
                            stackOut_75_0 = stackIn_75_0;
                            stackOut_75_1 = stackIn_75_1;
                            stackOut_75_2 = 0;
                            stackIn_76_0 = stackOut_75_0;
                            stackIn_76_1 = stackOut_75_1;
                            stackIn_76_2 = stackOut_75_2;
                            break L18;
                          } else {
                            stackOut_74_0 = stackIn_74_0;
                            stackOut_74_1 = stackIn_74_1;
                            stackOut_74_2 = 21;
                            stackIn_76_0 = stackOut_74_0;
                            stackIn_76_1 = stackOut_74_1;
                            stackIn_76_2 = stackOut_74_2;
                            break L18;
                          }
                        }
                        fq.a(stackIn_76_0, stackIn_76_1, stackIn_76_2, false);
                        break L17;
                      } else {
                        L19: {
                          ng.field_B = ui.field_Z;
                          stackOut_69_0 = -3405;
                          stackOut_69_1 = 20;
                          stackIn_71_0 = stackOut_69_0;
                          stackIn_71_1 = stackOut_69_1;
                          stackIn_70_0 = stackOut_69_0;
                          stackIn_70_1 = stackOut_69_1;
                          if (!mg.a(true)) {
                            stackOut_71_0 = stackIn_71_0;
                            stackOut_71_1 = stackIn_71_1;
                            stackOut_71_2 = 0;
                            stackIn_72_0 = stackOut_71_0;
                            stackIn_72_1 = stackOut_71_1;
                            stackIn_72_2 = stackOut_71_2;
                            break L19;
                          } else {
                            stackOut_70_0 = stackIn_70_0;
                            stackOut_70_1 = stackIn_70_1;
                            stackOut_70_2 = 21;
                            stackIn_72_0 = stackOut_70_0;
                            stackIn_72_1 = stackOut_70_1;
                            stackIn_72_2 = stackOut_70_2;
                            break L19;
                          }
                        }
                        fq.a(stackIn_72_0, stackIn_72_1, stackIn_72_2, false);
                        break L17;
                      }
                    }
                    al.l(-127);
                    s.field_c[ne.field_w].a(0, 0, false);
                    td.field_d = false;
                    ib.field_v = false;
                    mj.field_e = false;
                    am.b(116);
                    break L16;
                  }
                }
                br.field_H = false;
                ub.field_p = false;
                break L14;
              } else {
                br.field_H = true;
                ub.field_p = true;
                break L14;
              }
            }
            L20: {
              var4 = 0;
              if (var3 != 2) {
                break L20;
              } else {
                var4 = 1;
                break L20;
              }
            }
            L21: {
              L22: {
                if (td.field_d) {
                  break L22;
                } else {
                  if (ub.field_p) {
                    break L22;
                  } else {
                    if (!br.field_H) {
                      break L21;
                    } else {
                      break L22;
                    }
                  }
                }
              }
              var4 = 1;
              break L21;
            }
            L23: {
              if (!pk.b((byte) 109)) {
                var4 = 0;
                break L23;
              } else {
                break L23;
              }
            }
            if (var4 == 0) {
              break L13;
            } else {
              de.c(11);
              break L13;
            }
          } else {
            break L13;
          }
        }
    }

    public final void init() {
        this.a(640, "pool", 480, 0, 20);
    }

    final void c(byte param0) {
        eq.j((byte) -78);
        if (param0 != -39) {
            this.a((byte) -29);
        }
        if (!(null == ne.field_u)) {
            tq.d((byte) -116);
        }
        cd.a((byte) 60);
    }

    private final boolean d(int param0, boolean param1) {
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        int var3 = 0;
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
        String var64 = null;
        Object var65 = null;
        cj var65_ref = null;
        String var66 = null;
        String var67 = null;
        String var68 = null;
        String var69 = null;
        String var70 = null;
        var65 = null;
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
                                                                                                                        fo.a(hp.a(var61, var62, -641, var63), (float)(w.field_i[18] + (w.field_i[19] + -w.field_i[18]) * var61.b(0) / 100), false);
                                                                                                                        return false;
                                                                                                                      } else {
                                                                                                                        ue.a(true);
                                                                                                                        var64 = cq.field_e;
                                                                                                                        fo.a(var64, (float)w.field_i[19], false);
                                                                                                                        this.a((byte) 120);
                                                                                                                        wi.a(true);
                                                                                                                        qg.field_g = new cf(fg.field_d, he.field_b);
                                                                                                                        il.field_c[0] = qg.field_g.a("interface_mouseover_menuitems", true, "");
                                                                                                                        il.field_c[1] = qg.field_g.a("interface_music_level_change", true, "");
                                                                                                                        il.field_c[2] = qg.field_g.a("interface_SFX_level_change_chalk", true, "");
                                                                                                                        il.field_c[3] = qg.field_g.a("interface_select_ballroll_transition", true, "");
                                                                                                                        var3 = 0;
                                                                                                                        L18: while (true) {
                                                                                                                          if (var3 >= nn.field_b.length) {
                                                                                                                            L19: {
                                                                                                                              if (2 < nn.field_b.length) {
                                                                                                                                var65_ref = (cj) ((Object) nn.field_b[2]);
                                                                                                                                var4 = (vf) ((Object) nn.field_b[3]);
                                                                                                                                var4.field_X = var65_ref.field_mb;
                                                                                                                                var4.field_bb = var65_ref.field_bb;
                                                                                                                                var4.field_hb = var65_ref.field_S;
                                                                                                                                var4.field_Y = var65_ref.field_rb;
                                                                                                                                break L19;
                                                                                                                              } else {
                                                                                                                                break L19;
                                                                                                                              }
                                                                                                                            }
                                                                                                                            fg.field_d = null;
                                                                                                                            fm.a(0);
                                                                                                                            return false;
                                                                                                                          } else {
                                                                                                                            nn.field_b[var3].a(qg.field_g, 124);
                                                                                                                            var3++;
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
                                                                                                                fo.a(hp.a(var58, var59, -641, var60), (float)(w.field_i[18] - -((-w.field_i[18] + w.field_i[19]) * var58.b(0) / 100)), false);
                                                                                                                return false;
                                                                                                              } else {
                                                                                                                break L16;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          var55 = s.field_a;
                                                                                                          var56 = de.field_e;
                                                                                                          var57 = cf.field_c;
                                                                                                          fo.a(hp.a(var55, var56, -641, var57), (float)(w.field_i[17] + (w.field_i[18] + -w.field_i[17]) * var55.b(0) / 100), false);
                                                                                                          return false;
                                                                                                        } else {
                                                                                                          break L15;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    var52 = cp.field_a;
                                                                                                    var53 = de.field_e;
                                                                                                    var54 = cf.field_c;
                                                                                                    fo.a(hp.a(var52, var53, -641, var54), (float)(w.field_i[16] - -((-w.field_i[16] + w.field_i[17]) * var52.b(0) / 100)), false);
                                                                                                    return false;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              var49 = fh.field_b;
                                                                                              var50 = de.field_e;
                                                                                              var51 = cf.field_c;
                                                                                              fo.a(hp.a(var49, var50, -641, var51), (float)(w.field_i[15] + (w.field_i[16] - w.field_i[15]) * var49.b(0) / 100), false);
                                                                                              return false;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var46 = pq.field_z;
                                                                                        var48 = gh.field_Q;
                                                                                        var47 = kb.field_a;
                                                                                        fo.a(dk.a((byte) -21, "", var46, var47, var48), (float)(w.field_i[14] + (w.field_i[15] - w.field_i[14]) * var46.a(100, "") / 100), false);
                                                                                        return false;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  var43 = rl.field_h;
                                                                                  var45 = rp.field_c;
                                                                                  var44 = oj.field_t;
                                                                                  fo.a(dk.a((byte) -1, "", var43, var44, var45), (float)(w.field_i[13] - -((w.field_i[14] - w.field_i[13]) * var43.a(100, "") / 100)), false);
                                                                                  return false;
                                                                                } else {
                                                                                  break L11;
                                                                                }
                                                                              }
                                                                            }
                                                                            var40 = hr.field_q;
                                                                            var42 = rp.field_c;
                                                                            var41 = oj.field_t;
                                                                            fo.a(dk.a((byte) 119, "", var40, var41, var42), (float)(w.field_i[12] - -((w.field_i[13] + -w.field_i[12]) * var40.a(100, "") / 100)), false);
                                                                            return false;
                                                                          }
                                                                        }
                                                                      }
                                                                      var37 = jc.field_a;
                                                                      var38 = aj.field_Sb;
                                                                      var39 = mm.field_o;
                                                                      fo.a(hp.a(var37, var38, -641, var39), (float)(w.field_i[11] + (w.field_i[12] - w.field_i[11]) * var37.b(0) / 100), false);
                                                                      return false;
                                                                    } else {
                                                                      break L9;
                                                                    }
                                                                  }
                                                                }
                                                                var34 = gf.field_g;
                                                                var35 = aj.field_Sb;
                                                                var36 = mm.field_o;
                                                                fo.a(hp.a(var34, var35, -641, var36), (float)(w.field_i[10] - -((-w.field_i[10] + w.field_i[11]) * var34.b(0) / 100)), false);
                                                                return false;
                                                              }
                                                            }
                                                          }
                                                          var31 = he.field_b;
                                                          var32 = rk.field_h;
                                                          var33 = mq.field_g;
                                                          fo.a(hp.a(var31, var32, -641, var33), (float)(w.field_i[9] - -((-w.field_i[9] + w.field_i[10]) * var31.b(0) / 100)), false);
                                                          return false;
                                                        }
                                                      }
                                                    }
                                                    var28 = fg.field_d;
                                                    var29 = rk.field_h;
                                                    var30 = mq.field_g;
                                                    fo.a(hp.a(var28, var29, -641, var30), (float)(w.field_i[8] - -((w.field_i[9] + -w.field_i[8]) * var28.b(0) / 100)), false);
                                                    return false;
                                                  }
                                                }
                                              }
                                              var25 = qp.field_Zb;
                                              var27 = gh.field_Q;
                                              var26 = kb.field_a;
                                              fo.a(dk.a((byte) 118, "lobby", var25, var26, var27), (float)(w.field_i[7] + (-w.field_i[7] + w.field_i[8]) * var25.a(100, "lobby") / 100), false);
                                              return false;
                                            } else {
                                              break L5;
                                            }
                                          }
                                        }
                                        var22 = sd.field_R;
                                        var24 = rp.field_c;
                                        var23 = oj.field_t;
                                        fo.a(dk.a((byte) 122, "lobby", var22, var23, var24), (float)(w.field_i[6] - -((-w.field_i[6] + w.field_i[7]) * var22.a(100, "lobby") / 100)), false);
                                        return false;
                                      }
                                    }
                                  }
                                  var19 = sd.field_R;
                                  var21 = rp.field_c;
                                  var20 = oj.field_t;
                                  fo.a(dk.a((byte) 101, "basic", var19, var20, var21), (float)(w.field_i[5] + (w.field_i[6] + -w.field_i[5]) * var19.a(100, "basic") / 100), false);
                                  return false;
                                }
                              }
                            }
                            var16 = qp.field_Zb;
                            var18 = gh.field_Q;
                            var17 = kb.field_a;
                            fo.a(dk.a((byte) -116, "arialish12", var16, var17, var18), (float)(w.field_i[4] - -((-w.field_i[4] + w.field_i[5]) * var16.a(100, "arialish12") / 100)), false);
                            return false;
                          } else {
                            break L2;
                          }
                        }
                      }
                      var13 = qp.field_Zb;
                      var15 = gh.field_Q;
                      var14 = kb.field_a;
                      fo.a(dk.a((byte) -61, "arialbold14", var13, var14, var15), (float)(w.field_i[3] + (-w.field_i[3] + w.field_i[4]) * var13.a(100, "arialbold14") / 100), false);
                      return false;
                    } else {
                      break L1;
                    }
                  }
                }
                var10 = sd.field_R;
                var12 = rp.field_c;
                var11 = oj.field_t;
                fo.a(dk.a((byte) -17, "arialish12", var10, var11, var12), (float)(w.field_i[2] + (-w.field_i[2] + w.field_i[3]) * var10.a(100, "arialish12") / 100), false);
                return false;
              }
            }
          }
          var7 = sd.field_R;
          var9 = rp.field_c;
          var8 = oj.field_t;
          fo.a(dk.a((byte) -22, "arialbold14", var7, var8, var9), (float)(w.field_i[1] - -((w.field_i[2] - w.field_i[1]) * var7.a(100, "arialbold14") / 100)), false);
          return false;
        } else {
          if (he.field_b == null) {
            if (jc.field_a == null) {
              if (null == gf.field_g) {
                if (qp.field_Zb != null) {
                  var69 = fj.field_e;
                  fo.a(var69, (float)w.field_i[23], false);
                  this.a((byte) 120);
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
                  ig.a(ua.field_r, (byte) -12);
                  ig.a(om.field_u, (byte) -12);
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
                  wj.a(200, -77);
                  ec.a(0, 0, 37, vd.field_l, (java.applet.Applet) (this), 16777215);
                  qp.field_Zb = null;
                  pq.field_z = null;
                  fm.a(0);
                  return false;
                } else {
                  L20: {
                    if (param0 >= 56) {
                      break L20;
                    } else {
                      this.h((byte) 13);
                      break L20;
                    }
                  }
                  if (fh.field_b == null) {
                    if (null != s.field_a) {
                      var70 = lc.field_R;
                      fo.a(var70, (float)w.field_i[24], false);
                      this.a((byte) 120);
                      hr.a(s.field_a, 0);
                      s.field_a = null;
                      fm.a(0);
                      return false;
                    } else {
                      md.a(32);
                      eq.i((byte) 124);
                      ne.field_w = 0;
                      sq.field_b = 0;
                      cq.a(4313);
                      ee.a(50, -74);
                      tl.field_N.a((byte) -125, -1, 256);
                      ij.field_u = ul.field_m;
                      tl.field_N.a(ul.field_m, 8821, true);
                      uk.a(mc.field_e.field_L, 8, sa.field_h.field_w + sa.field_h.field_L, 240, mc.field_e.field_L + mc.field_e.field_w, 2, vk.field_y[0].field_z + 5, 5 + vk.field_y[0].field_A, 8, 480, 3, rm.field_g, -23994, sa.field_h, 4, 13421772, sa.field_h.field_L, 320, vk.field_y, rm.field_g, mc.field_e);
                      vl.a(240, vk.field_y[0].field_A - -5, rm.field_g, 8, rm.field_g, 4, 8, mc.field_e, 5 + vk.field_y[0].field_z, 2, vk.field_y, -1373633266, 2, 3, 320);
                      fm.a(0);
                      return true;
                    }
                  } else {
                    kp.a(new rk(fh.field_b.a(false, "huffman", "")), (byte) -92);
                    fh.field_b = null;
                    fm.a(0);
                    return false;
                  }
                }
              } else {
                var68 = ac.field_q;
                fo.a(var68, (float)w.field_i[22], false);
                this.a((byte) 120);
                discarded$2 = tl.field_N.a(qg.field_g, gf.field_g, ul.field_m, 75, 0);
                discarded$3 = tl.field_N.a(qg.field_g, gf.field_g, jh.field_d, 95, 0);
                var3 = 0;
                L21: while (true) {
                  if (var3 >= nn.field_b.length) {
                    tl.field_N.a(true);
                    gf.field_g = null;
                    qg.field_g = null;
                    fm.a(0);
                    return false;
                  } else {
                    nn.field_b[var3].a(3, qg.field_g, gf.field_g);
                    var3++;
                    continue L21;
                  }
                }
              }
            } else {
              var67 = ac.field_q;
              fo.a(var67, (float)w.field_i[21], false);
              this.a((byte) 120);
              ul.field_m = cg.a(jc.field_a, "", "title");
              jh.field_d = cg.a(jc.field_a, "", "title_next_door");
              var3 = 0;
              L22: while (true) {
                if (var3 >= nn.field_b.length) {
                  jc.field_a = null;
                  fm.a(0);
                  return false;
                } else {
                  nn.field_b[var3].a(1, jc.field_a);
                  var3++;
                  continue L22;
                }
              }
            }
          } else {
            var66 = cq.field_e;
            fo.a(var66, (float)w.field_i[20], false);
            this.a((byte) 120);
            he.field_b = null;
            fm.a(0);
            return false;
          }
        }
    }

    static {
        field_N = new kf[2];
        field_M = "Pot the balls in any order and finish on the black.";
        field_K = "Hide lobby chat";
        field_L = new int[4];
    }
}
