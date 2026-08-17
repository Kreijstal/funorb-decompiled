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
        cj dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        tq stackIn_3_0;
        int stackIn_3_1;
        boolean stackIn_3_2;
        int stackIn_3_3;
        tq stackIn_4_0;
        int stackIn_4_1;
        boolean stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        jh stackIn_9_0;
        cj stackIn_9_1;
        cj stackIn_9_2;
        long stackIn_9_3;
        jh stackIn_10_0 = null;
        cj stackIn_10_1 = null;
        cj stackIn_10_2 = null;
        long stackIn_10_3 = 0L;
        cj stackIn_10_4 = null;
        jh stackIn_29_0;
        cj stackIn_29_1;
        cj stackIn_29_2;
        long stackIn_29_3;
        jh stackIn_30_0;
        cj stackIn_30_1;
        cj stackIn_30_2;
        long stackIn_30_3;
        cj stackIn_30_4;
        int stackIn_34_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_78_0 = 0;
        ja[] stackIn_80_0 = null;
        ja[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        ja[] stackIn_89_0 = null;
        ja[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        String stackIn_153_0 = null;
        String stackIn_162_0 = null;
        String stackIn_167_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        th var8 = null;
        long var9 = 0L;
        Object var11 = null;
        jh var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var18_int = 0;
        cj var18 = null;
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
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = ek.field_H;

              stackIn_3_1 = 2;

              stackIn_3_2 = param5;

              stackIn_3_3 = 2 * (jk.field_f + 2);

              if (vc.field_d != ek.field_H) {
                stackIn_4_0 = (tq) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = 0;
                break L1;
              } else {
                stackIn_4_0 = (tq) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = 1;
                break L1;
              }
            }
            var7_int = ((tq) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, (4 * jk.field_f - -8) * param6, -108) ? 1 : 0;
            var8 = ek.field_H.field_Gb.field_Cb;
            var9 = bl.a((byte) 99);
            var11 = null;
            var12 = (jh) ((Object) var8.c(105));
            L2: while (true) {
              if (var12 == null) {
                L3: {
                  if (param1 >= 111) {
                    break L3;
                  } else {
                    field_M = (String) null;
                    break L3;
                  }
                }
                break L0;
              } else {
                L4: {
                  var13 = 0;
                  if (null != var12.field_Cb) {
                    break L4;
                  } else {
                    L5: {
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
                      stackIn_9_0 = (jh) (var12);

                      stackIn_9_1 = null;

                      stackIn_9_2 = null;

                      stackIn_9_3 = 0L;

                      if (tb.field_u) {
                        stackIn_10_0 = (jh) ((Object) stackIn_9_0);
                        stackIn_10_1 = null;
                        stackIn_10_2 = null;
                        stackIn_10_3 = stackIn_9_3;
                        stackIn_10_4 = wc.field_H;
                        break L5;
                      } else {
                        stackIn_10_0 = (jh) ((Object) stackIn_9_0);
                        stackIn_10_1 = null;
                        stackIn_10_2 = null;
                        stackIn_10_3 = stackIn_9_3;
                        stackIn_10_4 = m.field_x;
                        break L5;
                      }
                    }
                    L6: {
                      stackIn_10_0.field_jc = new cj(stackIn_10_3, stackIn_10_4);
                      var12.a((byte) 50, var12.field_jc);
                      var12.field_Qb = new cj[kj.field_h];
                      var12.field_Xb = new cj(0L, (cj) null);
                      if ((var14 & 1 << jq.field_f) != 0) {
                        var12.field_jc.a((byte) 50, var12.field_Xb);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var12.field_kc = new cj(0L, (cj) null);
                      if (0 != (1 << ho.field_l & var14)) {
                        var12.field_jc.a((byte) 50, var12.field_kc);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var12.field_Tb = new cj(0L, (cj) null);
                      if ((1 << el.field_M & var14) != 0) {
                        var12.field_jc.a((byte) 50, var12.field_Tb);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      var12.field_ec = new cj(0L, (cj) null);
                      if ((1 << ti.field_J & var14) != 0) {
                        var12.field_jc.a((byte) 50, var12.field_ec);
                        break L9;
                      } else {
                        break L9;
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
                    L10: while (true) {
                      if (kj.field_h <= var18_int) {
                        L11: {
                          stackIn_29_0 = (jh) (var12);

                          stackIn_29_1 = null;

                          stackIn_29_2 = null;

                          stackIn_29_3 = 0L;

                          if (tb.field_u) {
                            stackIn_30_0 = (jh) ((Object) stackIn_29_0);
                            stackIn_30_1 = null;
                            stackIn_30_2 = null;
                            stackIn_30_3 = stackIn_29_3;
                            stackIn_30_4 = m.field_x;
                            break L11;
                          } else {
                            stackIn_30_0 = (jh) ((Object) stackIn_29_0);
                            stackIn_30_1 = null;
                            stackIn_30_2 = null;
                            stackIn_30_3 = stackIn_29_3;
                            stackIn_30_4 = wc.field_H;
                            break L11;
                          }
                        }
                        stackIn_30_0.field_Yb = new cj(stackIn_30_3, stackIn_30_4);
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
                        break L4;
                      } else {
                        L12: {
                          var12.field_Qb[var18_int] = new cj(0L, (cj) null);
                          if (0 == (1 << var18_int + vm.field_ib & var14)) {
                            break L12;
                          } else {
                            var12.field_jc.a((byte) 50, var12.field_Qb[var18_int]);
                            break L12;
                          }
                        }
                        var12.field_Qb[var18_int].field_lb = 1;
                        var18_int++;
                        continue L10;
                      }
                    }
                  }
                }
                L13: {
                  var12.field_Kb.field_wb = null;
                  if (var12.field_Fb) {
                    stackIn_34_0 = param2;
                    break L13;
                  } else {
                    stackIn_34_0 = param4;
                    break L13;
                  }
                }
                var14 = stackIn_34_0;
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
                L14: while (true) {
                  if (var22_int >= kj.field_h) {
                    L15: {
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
                        break L15;
                      } else {
                        L16: {
                          if (var12.field_Fb) {
                            if (var12.field_Sb >= 0) {
                              var12.field_Kb.field_wb = ke.field_c;
                              break L16;
                            } else {
                              L17: {
                                if (!var12.field_Wb) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (var12.field_Ob) {
                                      break L18;
                                    } else {
                                      if (!var12.field_lc) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  var12.field_oc.field_wb = ak.field_c;
                                  break L16;
                                }
                              }
                              if (2 != var12.field_fc) {
                                var12.field_Kb.field_wb = jb.field_a;
                                break L16;
                              } else {
                                var12.field_oc.field_wb = ap.field_u;
                                break L16;
                              }
                            }
                          } else {
                            L19: {
                              if (var12.field_Ob) {
                                break L19;
                              } else {
                                if (!var12.field_lc) {
                                  if (!var12.field_Mb) {
                                    var12.field_Kb.field_wb = kn.field_c;
                                    break L16;
                                  } else {
                                    var12.field_Kb.field_wb = bf.field_j;
                                    break L16;
                                  }
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var12.field_oc.field_wb = ak.field_c;
                            break L16;
                          }
                        }
                        L20: {
                          if (var12.field_oc.field_wb != null) {
                            var12.field_oc.a(jk.field_f, var31, 68, 0, -3344);
                            break L20;
                          } else {
                            var12.field_Kb.a(jk.field_f, var31, 68, 0, -3344);
                            break L20;
                          }
                        }
                        L21: {
                          var12.field_Gb.field_wb = fm.a(var12.field_Gb.field_yb, var32, 78);
                          var12.field_Gb.a(jk.field_f, var31, 78, 70, -3344);
                          if (!var12.field_Gb.field_L) {
                            break L21;
                          } else {
                            if (!var12.field_Gb.field_wb.equals(var32)) {
                              ui.field_j = var32;
                              break L21;
                            } else {
                              break L21;
                            }
                          }
                        }
                        L22: {
                          var12.field_Ib.field_wb = Integer.toString(var12.field_cc);
                          if (var12.field_Wb) {
                            var12.field_Ib.field_R = 2;
                            var12.field_gc.field_wb = "/" + var12.field_mc;
                            var33_int = (348 - var12.field_gc.field_yb.a("/")) / 2;
                            var12.field_Ib.a(jk.field_f, var31, -150 + var33_int, 150, -3344);
                            var12.field_gc.a(jk.field_f, var31, 198 - var33_int, var33_int, -3344);
                            break L22;
                          } else {
                            var12.field_Ib.field_R = 1;
                            var12.field_Ib.a(jk.field_f, var31, 48, 150, -3344);
                            break L22;
                          }
                        }
                        L23: {
                          var12.field_Lb.field_wb = Integer.toString(var12.field_Ub);
                          var12.field_Lb.a(jk.field_f, var31, 48, 200, -3344);
                          if (tb.field_u) {
                            stackIn_69_0 = 250;
                            break L23;
                          } else {
                            stackIn_69_0 = 200;
                            break L23;
                          }
                        }
                        L24: {
                          var33_int = stackIn_69_0;
                          var12.field_jc.a(jk.field_f, var31, -var33_int + 365 + -2, var33_int, -3344);
                          var34_int = ed.field_c;
                          if ((var14 & 1 << jq.field_f) == 0) {
                            break L24;
                          } else {
                            var50_ref = qp.field_u[var12.field_Pb];
                            var12.field_Xb.field_rb = var50_ref;
                            var12.field_Xb.a(var12.field_jc.field_z, 0, var50_ref.field_z, var34_int, -3344);
                            var34_int = var34_int + (ed.field_c + var50_ref.field_z);
                            break L24;
                          }
                        }
                        L25: {
                          if (0 == (var14 & 1 << ho.field_l)) {
                            break L25;
                          } else {
                            L26: {
                              if (!var12.field_Ob) {
                                if (var12.field_lc) {
                                  stackIn_78_0 = 1;
                                  break L26;
                                } else {
                                  stackIn_78_0 = 0;
                                  break L26;
                                }
                              } else {
                                stackIn_78_0 = 1;
                                break L26;
                              }
                            }
                            L27: {
                              var36 = stackIn_78_0;
                              stackIn_80_0 = na.field_G;

                              if (var36 == 0) {
                                stackIn_81_0 = (ja[]) ((Object) stackIn_80_0);
                                stackIn_81_1 = 0;
                                break L27;
                              } else {
                                stackIn_81_0 = (ja[]) ((Object) stackIn_80_0);
                                stackIn_81_1 = 1;
                                break L27;
                              }
                            }
                            var51_ref = stackIn_81_0[stackIn_81_1];
                            var12.field_kc.field_rb = var51_ref;
                            var12.field_kc.a(var12.field_jc.field_z, 0, var51_ref.field_z, var34_int, -3344);
                            var34_int = var34_int + (ed.field_c + var51_ref.field_z);
                            break L25;
                          }
                        }
                        L28: {
                          if (0 != (1 << el.field_M & var14)) {
                            var52_ref = we.field_j[var12.field_fc + -1];
                            var12.field_Tb.field_rb = var52_ref;
                            var12.field_Tb.a(var12.field_jc.field_z, 0, var52_ref.field_z, var34_int, -3344);
                            var34_int = var34_int + (ed.field_c + var52_ref.field_z);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L29: {
                          if (-1 != (1 << ti.field_J & var14 ^ -1)) {
                            L30: {
                              stackIn_89_0 = ke.field_i;

                              if (!var12.field_dc) {
                                stackIn_90_0 = (ja[]) ((Object) stackIn_89_0);
                                stackIn_90_1 = 0;
                                break L30;
                              } else {
                                stackIn_90_0 = (ja[]) ((Object) stackIn_89_0);
                                stackIn_90_1 = 1;
                                break L30;
                              }
                            }
                            var53_ref = stackIn_90_0[stackIn_90_1];
                            var12.field_ec.field_rb = var53_ref;
                            var12.field_ec.a(var12.field_jc.field_z, 0, var53_ref.field_z, var34_int, -3344);
                            var34_int = var34_int + (var53_ref.field_z - -ed.field_c);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L31: {
                          if (null != um.field_g) {
                            var36 = 0;
                            L32: while (true) {
                              if (kj.field_h <= var36) {
                                break L31;
                              } else {
                                L33: {
                                  if (null != um.field_g[var36]) {
                                    if (0 != (var14 & 1 << vm.field_ib - -var36)) {
                                      var42 = um.field_g[var36][255 & var12.field_Zb[var36]];
                                      var54 = var42;
                                      var12.field_Qb[var36].field_rb = var42;
                                      var12.field_Qb[var36].a(var12.field_jc.field_z, 0, var54.field_z, var34_int, -3344);
                                      var34_int = var34_int + (ed.field_c + var54.field_z);
                                      break L33;
                                    } else {
                                      break L33;
                                    }
                                  } else {
                                    break L33;
                                  }
                                }
                                var36++;
                                continue L32;
                              }
                            }
                          } else {
                            break L31;
                          }
                        }
                        L34: {
                          var36 = (var12.field_jc.field_zb - var34_int) / 2;
                          if (var36 <= 0) {
                            break L34;
                          } else {
                            var12.field_Xb.field_x = var12.field_Xb.field_x + var36;
                            var12.field_kc.field_x = var12.field_kc.field_x + var36;
                            var12.field_Tb.field_x = var12.field_Tb.field_x + var36;
                            var12.field_ec.field_x = var12.field_ec.field_x + var36;
                            var37_int = 0;
                            L35: while (true) {
                              if (kj.field_h <= var37_int) {
                                break L34;
                              } else {
                                dupTemp$0 = var12.field_Qb[var37_int];
                                dupTemp$0.field_x = dupTemp$0.field_x + var36;
                                var37_int++;
                                continue L35;
                              }
                            }
                          }
                        }
                        L36: {
                          if (var12.field_Fb) {
                            L37: {
                              var37_int = var12.field_Sb;
                              if (var37_int < 0) {
                                var37_int = (int)(var9 + -var12.field_qc);
                                break L37;
                              } else {
                                break L37;
                              }
                            }
                            var38_int = var37_int / 1000;
                            var39 = var38_int / 60;
                            var38_int = var38_int % 60;
                            if (60 > var39) {
                              var12.field_Yb.field_wb = var39 + ":" + var38_int / 10 + var38_int % 10;
                              break L36;
                            } else {
                              var40 = var39 / 60;
                              var39 = var39 % 60;
                              var12.field_Yb.field_wb = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                              break L36;
                            }
                          } else {
                            break L36;
                          }
                        }
                        L38: {
                          var12.field_Yb.a(jk.field_f, var31, var12.field_zb - 365, 365, -3344);
                          var31 = var31 + jk.field_f;
                          if (null != var12.field_bc) {
                            var31 += 2;
                            var37 = new StringBuilder(64);
                            discarded$1 = var37.append(ko.field_k);
                            discarded$2 = var37.append(var12.field_bc[0]);
                            var38_int = 1;
                            L39: while (true) {
                              if (var12.field_cc <= var38_int) {
                                var38 = var37.toString();
                                var12.field_ac.field_wb = var38;
                                var39 = var12.field_ac.field_yb.b(var38, -(2 * var12.field_ac.field_V) + var12.field_zb);
                                var12.field_ac.a(var39 * jk.field_f, var31, var12.field_zb, 0, -3344);
                                var31 = var31 + jk.field_f * var39;
                                break L38;
                              } else {
                                discarded$3 = var37.append(", ");
                                discarded$4 = var37.append(var12.field_bc[var38_int]);
                                var38_int++;
                                continue L39;
                              }
                            }
                          } else {
                            break L38;
                          }
                        }
                        L40: {
                          if (!var12.field_lc) {
                            break L40;
                          } else {
                            var12.field_hc.field_wb = vl.a(hj.field_b, new String[]{var32}, 2);
                            var12.field_hc.a(jk.field_f, var31, var12.field_zb - 2 * nj.field_h, nj.field_h, -3344);
                            var31 = var31 + jk.field_f;
                            break L40;
                          }
                        }
                        if (var12.field_rc) {
                          var12.field_pc.field_wb = vl.a(be.field_k, new String[]{var32}, 2);
                          var12.field_pc.a(jk.field_f, var31, var12.field_zb + -(nj.field_h * 2), nj.field_h, -3344);
                          var31 = var31 + jk.field_f;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                    }
                    L41: {
                      var33 = hd.a(var12.field_Vb, var32, -9);
                      var34 = var33;
                      var34 = var33;
                      if (var33 == null) {
                        break L41;
                      } else {
                        var34_int = var12.field_Rb.field_yb.b(var33, -nj.field_h + (var12.field_zb - nj.field_h));
                        var12.field_Rb.field_Y = var12.field_Jb * 256 / so.field_r;
                        var12.field_Rb.field_wb = var33;
                        var12.field_Rb.a(var34_int * jk.field_f, var31, var12.field_zb - nj.field_h * 2, nj.field_h, -3344);
                        var31 = var31 + var34_int * jk.field_f;
                        break L41;
                      }
                    }
                    L42: {
                      if (var7_int != 0) {
                        break L42;
                      } else {
                        var12.field_I = var31 + -var12.field_z;
                        break L42;
                      }
                    }
                    L43: {
                      if (var13 == 0) {
                        break L43;
                      } else {
                        ek.field_H.field_Gb.a(2, var12, 1300, (cj) (var11));
                        break L43;
                      }
                    }
                    var34_int = 0;
                    L44: while (true) {
                      if (kj.field_h <= var34_int) {
                        L45: {
                          if (!var12.field_Xb.field_L) {
                            break L45;
                          } else {
                            L46: {
                              if (-2 != (var12.field_Pb ^ -1)) {
                                var34 = t.field_c[var12.field_Pb];
                                break L46;
                              } else {
                                var34 = cb.field_g;
                                break L46;
                              }
                            }
                            ui.field_j = vc.field_h + " - " + var34;
                            break L45;
                          }
                        }
                        L47: {
                          if (var12.field_ec.field_L) {
                            L48: {
                              if (!var12.field_dc) {
                                stackIn_153_0 = hp.field_m;
                                break L48;
                              } else {
                                stackIn_153_0 = mk.field_l;
                                break L48;
                              }
                            }
                            ui.field_j = stackIn_153_0;
                            break L47;
                          } else {
                            break L47;
                          }
                        }
                        L49: {
                          if (!var12.field_kc.field_L) {
                            break L49;
                          } else {
                            L50: {
                              L51: {
                                if (var12.field_Ob) {
                                  break L51;
                                } else {
                                  if (!var12.field_lc) {
                                    if (var12.field_Wb) {
                                      stackIn_162_0 = hp.field_i;
                                      break L50;
                                    } else {
                                      stackIn_162_0 = lb.field_b;
                                      break L50;
                                    }
                                  } else {
                                    break L51;
                                  }
                                }
                              }
                              stackIn_162_0 = bk.field_j;
                              break L50;
                            }
                            ui.field_j = stackIn_162_0;
                            break L49;
                          }
                        }
                        L52: {
                          if (!var12.field_Tb.field_L) {
                            break L52;
                          } else {
                            L53: {
                              if (var12.field_fc == 2) {
                                stackIn_167_0 = oe.field_a;
                                break L53;
                              } else {
                                stackIn_167_0 = qd.field_E;
                                break L53;
                              }
                            }
                            ui.field_j = stackIn_167_0;
                            break L52;
                          }
                        }
                        L54: {
                          if (0 == var12.field_T) {
                            break L54;
                          } else {
                            if (!var12.j(2)) {
                              if (0 != var12.field_oc.field_T) {
                                L55: {
                                  if (!var12.field_Fb) {
                                    break L55;
                                  } else {
                                    L56: {
                                      if (!var12.field_Wb) {
                                        break L56;
                                      } else {
                                        if (var12.field_Ob) {
                                          break L55;
                                        } else {
                                          if (!var12.field_lc) {
                                            break L56;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                    kk.a(-108, var12.i(6), param3);
                                    break L54;
                                  }
                                }
                                pl.a(param3, (byte) 92, var12.i(6));
                                break L54;
                              } else {
                                qm.a(var12, param0, var32, -123);
                                break L54;
                              }
                            } else {
                              var12 = (jh) ((Object) var8.b(6));
                              continue L2;
                            }
                          }
                        }
                        var12 = (jh) ((Object) var8.b(6));
                        continue L2;
                      } else {
                        L57: {
                          if (var12.field_Qb[var34_int].field_L) {
                            L58: {
                              if (kp.field_n == null) {
                                var35 = null;
                                break L58;
                              } else {
                                if (kp.field_n[var34_int] != null) {
                                  var35 = kp.field_n[var34_int][var12.field_Zb[var34_int] & 255];
                                  break L58;
                                } else {
                                  var35 = null;
                                  break L58;
                                }
                              }
                            }
                            if (var35 == null) {
                              ui.field_j = cf.field_f[var34_int];
                              break L57;
                            } else {
                              ui.field_j = cf.field_f[var34_int] + " - " + (String) (var35);
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
                    var12.field_Qb[var22_int].field_rb = null;
                    var23 = var12.field_Qb[var22_int];
                    var12.field_Qb[var22_int].field_z = 0;
                    var23.field_zb = 0;
                    var22_int++;
                    continue L14;
                  }
                }
              }
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
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
                  stackIn_13_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_11_0 = param0 * var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if ((param2 & 1 ^ -1) != -1) {
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
          throw fa.a((Throwable) ((Object) var3), "og.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_11_0;
        } else {
          return stackIn_13_0;
        }
    }

    final boolean b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int stackIn_8_0 = 0;
        L0: {
          if (param2 <= -114) {
            break L0;
          } else {
            og.a(96, -108, -22);
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
                if (param0 <= 5 + (-48 + var5)) {
                  break L2;
                } else {
                  if (var5 + 2 <= param0) {
                    break L2;
                  } else {
                    stackIn_8_0 = 1;
                    break L1;
                  }
                }
              }
            }
          }
          stackIn_8_0 = 0;
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
