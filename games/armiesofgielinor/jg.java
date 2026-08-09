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
        if (param2 != 512) {
            jg.a((byte) 13);
        }
        int var5 = kd.field_Z[param4][param3];
        if (0 > (var5 ^ -1)) {
            var6 = ns.a(false, td.field_d[var5].length, li.field_n);
            if (td.field_d[var5][var6] != null && -1 != (td.field_d[var5][var6].field_o.length ^ -1)) {
                param0 = 512 - (param0 - 800);
                param1 = 512 + (param1 <= 512 ? 511 < (param1 ^ -1) ? -512 : param1 : 512) >> -1632290814;
                param0 = ((-513 <= (param0 ^ -1) ? param0 : 512) >> 2062856674) - -120;
                jv.a(td.field_d[var5][var6], param1, param0, (byte) 87);
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
        je dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        dn stackIn_3_0;
        boolean stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        dn stackIn_4_0;
        boolean stackIn_4_1;
        int stackIn_4_2;
        int stackIn_4_3;
        int stackIn_4_4;
        au stackIn_10_0;
        je stackIn_10_1;
        je stackIn_10_2;
        long stackIn_10_3;
        au stackIn_11_0 = null;
        je stackIn_11_1 = null;
        je stackIn_11_2 = null;
        long stackIn_11_3 = 0L;
        je stackIn_11_4 = null;
        au stackIn_31_0;
        je stackIn_31_1;
        je stackIn_31_2;
        long stackIn_31_3;
        au stackIn_32_0;
        je stackIn_32_1;
        je stackIn_32_2;
        long stackIn_32_3;
        je stackIn_32_4;
        int stackIn_36_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_83_0 = 0;
        wk[] stackIn_85_0 = null;
        wk[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        wk[] stackIn_93_0 = null;
        wk[] stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        String stackIn_155_0 = null;
        String stackIn_165_0 = null;
        String stackIn_170_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        at var8 = null;
        long var9 = 0L;
        Object var11 = null;
        au var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var18_int = 0;
        je var18 = null;
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
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = bv.field_x;

              stackIn_3_1 = param1;

              stackIn_3_2 = param3 * (8 + 4 * jn.field_d);

              stackIn_3_3 = jn.field_d * 2 - -4;

              if (bv.field_x != pq.field_b) {
                stackIn_4_0 = (dn) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = 0;
                break L1;
              } else {
                stackIn_4_0 = (dn) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = 1;
                break L1;
              }
            }
            var7_int = ((dn) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, param0, 2) ? 1 : 0;
            var8 = bv.field_x.field_Jb.field_fb;
            var9 = vi.b(-118);
            var11 = null;
            var12 = (au) ((Object) var8.e((byte) 120));
            L2: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L3: {
                  var13 = 0;
                  if (null == var12.field_fb) {
                    L4: {
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
                      stackIn_10_0 = (au) (var12);

                      stackIn_10_1 = null;

                      stackIn_10_2 = null;

                      stackIn_10_3 = 0L;

                      if (!fh.field_c) {
                        stackIn_11_0 = (au) ((Object) stackIn_10_0);
                        stackIn_11_1 = null;
                        stackIn_11_2 = null;
                        stackIn_11_3 = stackIn_10_3;
                        stackIn_11_4 = ga.field_i;
                        break L4;
                      } else {
                        stackIn_11_0 = (au) ((Object) stackIn_10_0);
                        stackIn_11_1 = null;
                        stackIn_11_2 = null;
                        stackIn_11_3 = stackIn_10_3;
                        stackIn_11_4 = ws.field_P;
                        break L4;
                      }
                    }
                    L5: {
                      stackIn_11_0.field_oc = new je(stackIn_11_3, stackIn_11_4);
                      var12.a(var12.field_oc, param0 ^ 63);
                      var12.field_Qb = new je[tq.field_b];
                      var12.field_ic = new je(0L, (je) null);
                      if (0 != (var14 & 1 << ev.field_c)) {
                        var12.field_oc.a(var12.field_ic, param0 + 62);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      var12.field_ec = new je(0L, (je) null);
                      if ((1 << ai.field_M & var14) != 0) {
                        var12.field_oc.a(var12.field_ec, param0 + 59);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var12.field_fc = new je(0L, (je) null);
                      if ((var14 & 1 << gg.field_I) != 0) {
                        var12.field_oc.a(var12.field_fc, param0 + 121);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var12.field_Vb = new je(0L, (je) null);
                      if ((var14 & 1 << uj.field_j) != 0) {
                        var12.field_oc.a(var12.field_Vb, 86);
                        break L8;
                      } else {
                        break L8;
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
                    L9: while (true) {
                      if (tq.field_b <= var18_int) {
                        L10: {
                          stackIn_31_0 = (au) (var12);

                          stackIn_31_1 = null;

                          stackIn_31_2 = null;

                          stackIn_31_3 = 0L;

                          if (fh.field_c) {
                            stackIn_32_0 = (au) ((Object) stackIn_31_0);
                            stackIn_32_1 = null;
                            stackIn_32_2 = null;
                            stackIn_32_3 = stackIn_31_3;
                            stackIn_32_4 = ga.field_i;
                            break L10;
                          } else {
                            stackIn_32_0 = (au) ((Object) stackIn_31_0);
                            stackIn_32_1 = null;
                            stackIn_32_2 = null;
                            stackIn_32_3 = stackIn_31_3;
                            stackIn_32_4 = ws.field_P;
                            break L10;
                          }
                        }
                        stackIn_32_0.field_Rb = new je(stackIn_32_3, stackIn_32_4);
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
                        break L3;
                      } else {
                        L11: {
                          var12.field_Qb[var18_int] = new je(0L, (je) null);
                          if (-1 != (var14 & 1 << var18_int + na.field_E ^ -1)) {
                            var12.field_oc.a(var12.field_Qb[var18_int], 39);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        var12.field_Qb[var18_int].field_Fb = 1;
                        var18_int++;
                        continue L9;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L12: {
                  var12.field_Xb.field_X = null;
                  if (var12.field_kc) {
                    stackIn_36_0 = param5;
                    break L12;
                  } else {
                    stackIn_36_0 = param4;
                    break L12;
                  }
                }
                var14 = stackIn_36_0;
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
                L13: while (true) {
                  if (var22_int >= tq.field_b) {
                    L14: {
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
                        L15: {
                          if (var12.field_kc) {
                            if (var12.field_bc < 0) {
                              L16: {
                                if (!var12.field_tc) {
                                  break L16;
                                } else {
                                  L17: {
                                    if (var12.field_Sb) {
                                      break L17;
                                    } else {
                                      if (var12.field_Nb) {
                                        break L17;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  var12.field_Yb.field_X = fl.field_l;
                                  break L15;
                                }
                              }
                              if (var12.field_ac != 2) {
                                var12.field_Xb.field_X = bi.field_d;
                                break L15;
                              } else {
                                var12.field_Yb.field_X = re.field_E;
                                break L15;
                              }
                            } else {
                              var12.field_Xb.field_X = kw.field_Q;
                              break L15;
                            }
                          } else {
                            L18: {
                              if (var12.field_Sb) {
                                break L18;
                              } else {
                                if (!var12.field_Nb) {
                                  if (var12.field_uc) {
                                    var12.field_Xb.field_X = wp.field_I;
                                    break L15;
                                  } else {
                                    var12.field_Xb.field_X = je.field_zb;
                                    break L15;
                                  }
                                } else {
                                  break L18;
                                }
                              }
                            }
                            var12.field_Yb.field_X = fl.field_l;
                            break L15;
                          }
                        }
                        L19: {
                          if (var12.field_Yb.field_X == null) {
                            var12.field_Xb.a(jn.field_d, -20500, 68, var31, 0);
                            break L19;
                          } else {
                            var12.field_Yb.a(jn.field_d, -20500, 68, var31, 0);
                            break L19;
                          }
                        }
                        L20: {
                          var12.field_lc.field_X = ka.a(var12.field_lc.field_Z, var32, 78);
                          var12.field_lc.a(jn.field_d, -20500, 78, var31, 70);
                          if (!var12.field_lc.field_eb) {
                            break L20;
                          } else {
                            if (!var12.field_lc.field_X.equals(var32)) {
                              ad.field_I = var32;
                              break L20;
                            } else {
                              break L20;
                            }
                          }
                        }
                        L21: {
                          var12.field_cc.field_X = Integer.toString(var12.field_Ub);
                          if (!var12.field_tc) {
                            var12.field_cc.field_Eb = 1;
                            var12.field_cc.a(jn.field_d, -20500, 48, var31, 150);
                            break L21;
                          } else {
                            var12.field_cc.field_Eb = 2;
                            var12.field_hc.field_X = "/" + var12.field_nc;
                            var33_int = (-var12.field_hc.field_Z.a("/") + 348) / 2;
                            var12.field_cc.a(jn.field_d, -20500, -150 + var33_int, var31, 150);
                            var12.field_hc.a(jn.field_d, -20500, 198 + -var33_int, var31, var33_int);
                            break L21;
                          }
                        }
                        L22: {
                          var12.field_Zb.field_X = Integer.toString(var12.field_qc);
                          var12.field_Zb.a(jn.field_d, param0 + -20500, 48, var31, 200);
                          if (!fh.field_c) {
                            stackIn_72_0 = 200;
                            break L22;
                          } else {
                            stackIn_72_0 = 250;
                            break L22;
                          }
                        }
                        L23: {
                          var33_int = stackIn_72_0;
                          var12.field_oc.a(jn.field_d, param0 ^ -20500, 365 - var33_int + -2, var31, var33_int);
                          var34_int = io.field_n;
                          if ((1 << ev.field_c & var14) != 0) {
                            var50_ref = rs.field_p[var12.field_Tb];
                            var12.field_ic.field_cb = var50_ref;
                            var12.field_ic.a(var12.field_oc.field_ob, param0 ^ -20500, var50_ref.field_A, 0, var34_int);
                            var34_int = var34_int + (var50_ref.field_A - -io.field_n);
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          if (-1 != (1 << ai.field_M & var14 ^ -1)) {
                            L25: {
                              if (!var12.field_Sb) {
                                if (var12.field_Nb) {
                                  stackIn_83_0 = 1;
                                  break L25;
                                } else {
                                  stackIn_83_0 = 0;
                                  break L25;
                                }
                              } else {
                                stackIn_83_0 = 1;
                                break L25;
                              }
                            }
                            L26: {
                              var36 = stackIn_83_0;
                              stackIn_85_0 = mo.field_g;

                              if (var36 == 0) {
                                stackIn_86_0 = (wk[]) ((Object) stackIn_85_0);
                                stackIn_86_1 = 0;
                                break L26;
                              } else {
                                stackIn_86_0 = (wk[]) ((Object) stackIn_85_0);
                                stackIn_86_1 = 1;
                                break L26;
                              }
                            }
                            var51_ref = stackIn_86_0[stackIn_86_1];
                            var12.field_ec.field_cb = var51_ref;
                            var12.field_ec.a(var12.field_oc.field_ob, param0 ^ -20500, var51_ref.field_A, 0, var34_int);
                            var34_int = var34_int + (var51_ref.field_A + io.field_n);
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L27: {
                          if ((1 << gg.field_I & var14) == 0) {
                            break L27;
                          } else {
                            var52_ref = lm.field_h[var12.field_ac + -1];
                            var12.field_fc.field_cb = var52_ref;
                            var12.field_fc.a(var12.field_oc.field_ob, -20500, var52_ref.field_A, 0, var34_int);
                            var34_int = var34_int + (var52_ref.field_A - -io.field_n);
                            break L27;
                          }
                        }
                        L28: {
                          if ((1 << uj.field_j & var14) != 0) {
                            L29: {
                              stackIn_93_0 = bp.field_d;

                              if (!var12.field_vc) {
                                stackIn_94_0 = (wk[]) ((Object) stackIn_93_0);
                                stackIn_94_1 = 0;
                                break L29;
                              } else {
                                stackIn_94_0 = (wk[]) ((Object) stackIn_93_0);
                                stackIn_94_1 = 1;
                                break L29;
                              }
                            }
                            var53_ref = stackIn_94_0[stackIn_94_1];
                            var12.field_Vb.field_cb = var53_ref;
                            var12.field_Vb.a(var12.field_oc.field_ob, -20500, var53_ref.field_A, 0, var34_int);
                            var34_int = var34_int + (io.field_n + var53_ref.field_A);
                            break L28;
                          } else {
                            break L28;
                          }
                        }
                        L30: {
                          if (ju.field_a != null) {
                            var36 = 0;
                            L31: while (true) {
                              if (var36 >= tq.field_b) {
                                break L30;
                              } else {
                                if (ju.field_a[var36] != null) {
                                  L32: {
                                    if ((1 << var36 + na.field_E & var14) != 0) {
                                      var42 = ju.field_a[var36][var12.field_pc[var36] & 255];
                                      var54 = var42;
                                      var12.field_Qb[var36].field_cb = var42;
                                      var12.field_Qb[var36].a(var12.field_oc.field_ob, -20500, var54.field_A, 0, var34_int);
                                      var34_int = var34_int + (var54.field_A + io.field_n);
                                      break L32;
                                    } else {
                                      break L32;
                                    }
                                  }
                                  var36++;
                                  continue L31;
                                } else {
                                  var36++;
                                  continue L31;
                                }
                              }
                            }
                          } else {
                            break L30;
                          }
                        }
                        L33: {
                          var36 = (var12.field_oc.field_gb + -var34_int) / 2;
                          if (0 >= var36) {
                            break L33;
                          } else {
                            var12.field_ic.field_S = var12.field_ic.field_S + var36;
                            var12.field_ec.field_S = var12.field_ec.field_S + var36;
                            var12.field_fc.field_S = var12.field_fc.field_S + var36;
                            var12.field_Vb.field_S = var12.field_Vb.field_S + var36;
                            var37_int = 0;
                            L34: while (true) {
                              if (var37_int >= tq.field_b) {
                                break L33;
                              } else {
                                dupTemp$0 = var12.field_Qb[var37_int];
                                dupTemp$0.field_S = dupTemp$0.field_S + var36;
                                var37_int++;
                                continue L34;
                              }
                            }
                          }
                        }
                        L35: {
                          if (!var12.field_kc) {
                            break L35;
                          } else {
                            L36: {
                              var37_int = var12.field_bc;
                              if (-1 >= (var37_int ^ -1)) {
                                break L36;
                              } else {
                                var37_int = (int)(-var12.field_Mb + var9);
                                break L36;
                              }
                            }
                            var38_int = var37_int / 1000;
                            var39 = var38_int / 60;
                            var38_int = var38_int % 60;
                            if (var39 >= 60) {
                              var40 = var39 / 60;
                              var39 = var39 % 60;
                              var12.field_Rb.field_X = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                              break L35;
                            } else {
                              var12.field_Rb.field_X = var39 + ":" + var38_int / 10 + var38_int % 10;
                              break L35;
                            }
                          }
                        }
                        L37: {
                          var12.field_Rb.a(jn.field_d, -20500, -365 + var12.field_gb, var31, 365);
                          var31 = var31 + jn.field_d;
                          if (var12.field_jc == null) {
                            break L37;
                          } else {
                            var31 += 2;
                            var37 = new StringBuilder(64);
                            discarded$1 = var37.append(dh.field_i);
                            discarded$2 = var37.append(var12.field_jc[0]);
                            var38_int = 1;
                            L38: while (true) {
                              if (var12.field_Ub <= var38_int) {
                                var38 = var37.toString();
                                var12.field_Pb.field_X = var38;
                                var39 = var12.field_Pb.field_Z.c(var38, var12.field_gb - var12.field_Pb.field_O * 2);
                                var12.field_Pb.a(var39 * jn.field_d, -20500, var12.field_gb, var31, 0);
                                var31 = var31 + jn.field_d * var39;
                                break L37;
                              } else {
                                discarded$3 = var37.append(", ");
                                discarded$4 = var37.append(var12.field_jc[var38_int]);
                                var38_int++;
                                continue L38;
                              }
                            }
                          }
                        }
                        L39: {
                          if (var12.field_Nb) {
                            var12.field_Ib.field_X = fo.a(4800, sq.field_n, new String[]{var32});
                            var12.field_Ib.a(jn.field_d, -20500, -(2 * mi.field_l) + var12.field_gb, var31, mi.field_l);
                            var31 = var31 + jn.field_d;
                            break L39;
                          } else {
                            break L39;
                          }
                        }
                        if (!var12.field_gc) {
                          break L14;
                        } else {
                          var12.field_sc.field_X = fo.a(4800, ic.field_A, new String[]{var32});
                          var12.field_sc.a(jn.field_d, -20500, var12.field_gb - 2 * mi.field_l, var31, mi.field_l);
                          var31 = var31 + jn.field_d;
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L40: {
                      var33 = gm.a(var12.field_mc, 6, var32);
                      if (var33 != null) {
                        var34_int = var12.field_Wb.field_Z.c(var33, var12.field_gb + -mi.field_l + -mi.field_l);
                        var12.field_Wb.field_X = var33;
                        var12.field_Wb.field_C = var12.field_Lb * 256 / qd.field_K;
                        var12.field_Wb.a(jn.field_d * var34_int, -20500, var12.field_gb - mi.field_l * 2, var31, mi.field_l);
                        var31 = var31 + var34_int * jn.field_d;
                        break L40;
                      } else {
                        break L40;
                      }
                    }
                    L41: {
                      if (var7_int != 0) {
                        break L41;
                      } else {
                        var12.field_nb = var31 - var12.field_ob;
                        break L41;
                      }
                    }
                    L42: {
                      if (var13 != 0) {
                        bv.field_x.field_Jb.a(var12, true, 2, (je) (var11));
                        break L42;
                      } else {
                        break L42;
                      }
                    }
                    var34_int = 0;
                    L43: while (true) {
                      if (var34_int >= tq.field_b) {
                        L44: {
                          if (!var12.field_ic.field_eb) {
                            break L44;
                          } else {
                            L45: {
                              if (1 == var12.field_Tb) {
                                var34 = ir.field_j;
                                break L45;
                              } else {
                                var34 = ks.field_u[var12.field_Tb];
                                break L45;
                              }
                            }
                            ad.field_I = vu.field_P + " - " + var34;
                            break L44;
                          }
                        }
                        L46: {
                          if (var12.field_Vb.field_eb) {
                            L47: {
                              if (var12.field_vc) {
                                stackIn_155_0 = uu.field_a;
                                break L47;
                              } else {
                                stackIn_155_0 = cm.field_c;
                                break L47;
                              }
                            }
                            ad.field_I = stackIn_155_0;
                            break L46;
                          } else {
                            break L46;
                          }
                        }
                        L48: {
                          if (var12.field_ec.field_eb) {
                            L49: {
                              L50: {
                                if (var12.field_Sb) {
                                  break L50;
                                } else {
                                  if (!var12.field_Nb) {
                                    if (var12.field_tc) {
                                      stackIn_165_0 = mv.field_e;
                                      break L49;
                                    } else {
                                      stackIn_165_0 = hw.field_y;
                                      break L49;
                                    }
                                  } else {
                                    break L50;
                                  }
                                }
                              }
                              stackIn_165_0 = ns.field_K;
                              break L49;
                            }
                            ad.field_I = stackIn_165_0;
                            break L48;
                          } else {
                            break L48;
                          }
                        }
                        L51: {
                          if (!var12.field_fc.field_eb) {
                            break L51;
                          } else {
                            L52: {
                              if (var12.field_ac != 2) {
                                stackIn_170_0 = jj.field_d;
                                break L52;
                              } else {
                                stackIn_170_0 = ak.field_e;
                                break L52;
                              }
                            }
                            ad.field_I = stackIn_170_0;
                            break L51;
                          }
                        }
                        L53: {
                          if (var12.field_yb == 0) {
                            break L53;
                          } else {
                            if (!var12.k(param0 ^ -7)) {
                              if (-1 == (var12.field_Yb.field_yb ^ -1)) {
                                ml.a(-114, var12, param2, var32);
                                break L53;
                              } else {
                                L54: {
                                  if (!var12.field_kc) {
                                    break L54;
                                  } else {
                                    L55: {
                                      if (!var12.field_tc) {
                                        break L55;
                                      } else {
                                        if (var12.field_Sb) {
                                          break L54;
                                        } else {
                                          if (var12.field_Nb) {
                                            break L54;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                    ov.a(param6, param0 + 3, var12.d((byte) 119));
                                    break L53;
                                  }
                                }
                                ag.a(param6, -99, var12.d((byte) -97));
                                break L53;
                              }
                            } else {
                              var12 = (au) ((Object) var8.a((byte) 123));
                              continue L2;
                            }
                          }
                        }
                        var12 = (au) ((Object) var8.a((byte) 123));
                        continue L2;
                      } else {
                        L56: {
                          if (!var12.field_Qb[var34_int].field_eb) {
                            break L56;
                          } else {
                            L57: {
                              if (wb.field_a == null) {
                                var35 = null;
                                break L57;
                              } else {
                                if (wb.field_a[var34_int] != null) {
                                  var35 = wb.field_a[var34_int][255 & var12.field_pc[var34_int]];
                                  break L57;
                                } else {
                                  var35 = null;
                                  break L57;
                                }
                              }
                            }
                            if (var35 != null) {
                              ad.field_I = ob.field_M[var34_int] + " - " + (String) (var35);
                              break L56;
                            } else {
                              ad.field_I = ob.field_M[var34_int];
                              break L56;
                            }
                          }
                        }
                        var34_int++;
                        continue L43;
                      }
                    }
                  } else {
                    var12.field_Qb[var22_int].field_cb = null;
                    var23 = var12.field_Qb[var22_int];
                    var12.field_Qb[var22_int].field_ob = 0;
                    var23.field_gb = 0;
                    var22_int++;
                    continue L13;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var7), "jg.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void e(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
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
        var8 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              var13 = mg.field_e;
              var2 = var13.k(param0);
              if (-1 == (var2 ^ -1)) {
                var10 = ce.a(-80);
                var3 = var10;
                var9 = var10;
                var4 = var9;
                var5 = var13;
                var6 = ((vh) ((Object) var5)).k(0);
                var7 = 0;
                L2: while (true) {
                  if (var7 >= var6) {
                    var12 = (b) ((Object) ta.field_O.e((byte) 98));
                    if (var12 != null) {
                      var12.field_m = true;
                      var12.field_l = var3;
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
                    continue L2;
                  }
                }
              } else {
                if ((var2 ^ -1) == -2) {
                  var11 = (iw) ((Object) cg.field_c.e((byte) 104));
                  if (var11 == null) {
                    dj.a((byte) -126);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var11.d(41);
                    break L1;
                  }
                } else {
                  if (var2 == 2) {
                    var14 = (b) ((Object) ta.field_O.e((byte) 125));
                    if (var14 != null) {
                      var14.field_l = ce.a(-120);
                      var14.field_m = true;
                      var14.d(param0 ^ 35);
                      break L1;
                    } else {
                      dj.a((byte) -125);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  } else {
                    af.a((Throwable) null, 78, "A1: " + cm.b(false));
                    dj.a((byte) -127);
                    break L1;
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
