/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    static String field_d;
    private r field_b;
    private lo field_i;
    private r field_a;
    static int field_h;
    static k field_g;
    static String field_c;
    static fe field_e;
    static byte[][] field_f;
    static String field_j;

    final static mc a(int param0) {
        if (!(null != dc.field_P)) {
            dc.field_P = new mc();
            dc.field_P.a(qc.field_x, -2);
            dc.field_P.field_l = 5;
            dc.field_P.field_n = bl.field_N;
            dc.field_P.field_o = 14;
            dc.field_P.field_r = 0;
            dc.field_P.field_m = 6;
            dc.field_P.field_a = 4;
            dc.field_P.field_b = 7697781;
            dc.field_P.field_d = 2763306;
        }
        int var1 = 98 / ((param0 - 63) / 43);
        return dc.field_P;
    }

    public static void a(byte param0) {
        int var1 = 104 % ((-58 - param0) / 49);
        field_j = null;
        field_f = (byte[][]) null;
        field_e = null;
        field_g = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, boolean param3, boolean param4, int param5, int param6) {
        cr dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        od stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        boolean stackIn_3_3;
        od stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        boolean stackIn_4_3 = false;
        int stackIn_4_4 = 0;
        uh stackIn_11_0;
        cr stackIn_11_1;
        cr stackIn_11_2;
        long stackIn_11_3;
        uh stackIn_12_0 = null;
        cr stackIn_12_1 = null;
        cr stackIn_12_2 = null;
        long stackIn_12_3 = 0L;
        cr stackIn_12_4 = null;
        uh stackIn_28_0;
        cr stackIn_28_1;
        cr stackIn_28_2;
        long stackIn_28_3;
        uh stackIn_29_0;
        cr stackIn_29_1;
        cr stackIn_29_2;
        long stackIn_29_3;
        cr stackIn_29_4;
        int stackIn_33_0 = 0;
        int stackIn_66_0 = 0;
        int stackIn_77_0 = 0;
        er[] stackIn_79_0 = null;
        er[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        er[] stackIn_87_0 = null;
        er[] stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        String stackIn_152_0 = null;
        String stackIn_161_0 = null;
        String stackIn_166_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        nj var8 = null;
        long var9 = 0L;
        Object var11 = null;
        uh var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var18_int = 0;
        cr var18 = null;
        cr var19 = null;
        cr var20 = null;
        cr var21 = null;
        int var22_int = 0;
        cr var22 = null;
        cr var23 = null;
        cr var24 = null;
        cr var25 = null;
        cr var26 = null;
        cr var27 = null;
        cr var28 = null;
        cr var29 = null;
        cr var30 = null;
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
        er var42 = null;
        cr var43 = null;
        cr var44 = null;
        cr var45 = null;
        cr var46 = null;
        cr var47 = null;
        cr var48 = null;
        cr var49 = null;
        Object var50 = null;
        er var50_ref = null;
        Object var51 = null;
        er var51_ref = null;
        Object var52 = null;
        er var52_ref = null;
        Object var53 = null;
        er var53_ref = null;
        er var54 = null;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              stackIn_3_0 = uk.field_v;

              stackIn_3_1 = param5 * (8 + r.field_f * 4);

              stackIn_3_2 = 2;

              stackIn_3_3 = param3;

              if (wq.field_M != uk.field_v) {
                stackIn_4_0 = (od) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = 0;
                break L1;
              } else {
                stackIn_4_0 = (od) ((Object) stackIn_3_0);
                stackIn_4_1 = stackIn_3_1;
                stackIn_4_2 = stackIn_3_2;
                stackIn_4_3 = stackIn_3_3;
                stackIn_4_4 = 1;
                break L1;
              }
            }
            var7_int = ((od) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3, stackIn_4_4 != 0, -56, (r.field_f + 2) * 2) ? 1 : 0;
            var8 = uk.field_v.field_Nb.field_M;
            var9 = gk.a(param6 + 109);
            var11 = null;
            if (param6 == 0) {
              var12 = (uh) ((Object) var8.a((byte) 100));
              L2: while (true) {
                if (var12 == null) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L3: {
                    var13 = 0;
                    if (null != var12.field_M) {
                      break L3;
                    } else {
                      L4: {
                        var14 = param1 | param0;
                        var12.field_rc = new cr(0L, tm.field_b);
                        var12.b(var12.field_rc, param6 + 120);
                        var12.field_rc.field_O = 1;
                        var12.field_Vb = new cr(0L, el.field_b);
                        var12.b(var12.field_Vb, 124);
                        var12.field_cc = new cr(0L, tm.field_b);
                        var12.b(var12.field_cc, 124);
                        var12.field_cc.field_R = 0;
                        var12.field_ac = new cr(0L, tm.field_b);
                        var12.b(var12.field_ac, param6 + 124);
                        var12.field_ac.field_R = 0;
                        var12.field_gc = new cr(0L, el.field_b);
                        var12.b(var12.field_gc, 122);
                        var12.field_gc.field_O = 2;
                        stackIn_11_0 = (uh) (var12);

                        stackIn_11_1 = null;

                        stackIn_11_2 = null;

                        stackIn_11_3 = 0L;

                        if (db.field_S) {
                          stackIn_12_0 = (uh) ((Object) stackIn_11_0);
                          stackIn_12_1 = null;
                          stackIn_12_2 = null;
                          stackIn_12_3 = stackIn_11_3;
                          stackIn_12_4 = tm.field_b;
                          break L4;
                        } else {
                          stackIn_12_0 = (uh) ((Object) stackIn_11_0);
                          stackIn_12_1 = null;
                          stackIn_12_2 = null;
                          stackIn_12_3 = stackIn_11_3;
                          stackIn_12_4 = el.field_b;
                          break L4;
                        }
                      }
                      L5: {
                        stackIn_12_0.field_pc = new cr(stackIn_12_3, stackIn_12_4);
                        var12.b(var12.field_pc, 124);
                        var12.field_Zb = new cr[ol.field_A];
                        var12.field_jc = new cr(0L, (cr) null);
                        if (-1 == (1 << t.field_b & var14 ^ -1)) {
                          break L5;
                        } else {
                          var12.field_pc.b(var12.field_jc, param6 + 124);
                          break L5;
                        }
                      }
                      L6: {
                        var12.field_ec = new cr(0L, (cr) null);
                        if ((var14 & 1 << jn.field_c) != 0) {
                          var12.field_pc.b(var12.field_ec, param6 + 118);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      L7: {
                        var12.field_wc = new cr(0L, (cr) null);
                        if (0 == (1 << pf.field_a & var14)) {
                          break L7;
                        } else {
                          var12.field_pc.b(var12.field_wc, param6 ^ 126);
                          break L7;
                        }
                      }
                      L8: {
                        var12.field_Kb = new cr(0L, (cr) null);
                        if (0 == (var14 & 1 << ao.field_K)) {
                          break L8;
                        } else {
                          var12.field_pc.b(var12.field_Kb, 127);
                          break L8;
                        }
                      }
                      var45 = var12.field_jc;
                      var44 = var12.field_Kb;
                      var12.field_wc.field_ab = 1;
                      var43 = var12.field_ec;
                      var43.field_ab = 1;
                      var44.field_ab = 1;
                      var45.field_ab = 1;
                      var18_int = 0;
                      L9: while (true) {
                        if (ol.field_A <= var18_int) {
                          L10: {
                            stackIn_28_0 = (uh) (var12);

                            stackIn_28_1 = null;

                            stackIn_28_2 = null;

                            stackIn_28_3 = 0L;

                            if (!db.field_S) {
                              stackIn_29_0 = (uh) ((Object) stackIn_28_0);
                              stackIn_29_1 = null;
                              stackIn_29_2 = null;
                              stackIn_29_3 = stackIn_28_3;
                              stackIn_29_4 = tm.field_b;
                              break L10;
                            } else {
                              stackIn_29_0 = (uh) ((Object) stackIn_28_0);
                              stackIn_29_1 = null;
                              stackIn_29_2 = null;
                              stackIn_29_3 = stackIn_28_3;
                              stackIn_29_4 = el.field_b;
                              break L10;
                            }
                          }
                          stackIn_29_0.field_Ob = new cr(stackIn_29_3, stackIn_29_4);
                          var12.b(var12.field_Ob, 126);
                          var12.field_Ob.field_O = 2;
                          var12.field_Jb = new cr(0L, el.field_b);
                          var12.b(var12.field_Jb, param6 + 127);
                          var12.field_Ib = new cr(0L, ja.field_e);
                          var12.b(var12.field_Ib, 121);
                          var12.field_bc = new cr(0L, ja.field_e);
                          var12.b(var12.field_bc, 118);
                          var12.field_Rb = new cr(0L, ee.field_b);
                          var12.b(var12.field_Rb, param6 + 125);
                          var12.i(-2147483648);
                          var12.field_nc = new cr(0L, sc.field_c);
                          var12.b(var12.field_nc, param6 ^ 122);
                          var13 = 1;
                          break L3;
                        } else {
                          L11: {
                            var12.field_Zb[var18_int] = new cr(0L, (cr) null);
                            if ((1 << qr.field_n + var18_int & var14) == 0) {
                              break L11;
                            } else {
                              var12.field_pc.b(var12.field_Zb[var18_int], 121);
                              break L11;
                            }
                          }
                          var12.field_Zb[var18_int].field_ab = 1;
                          var18_int++;
                          continue L9;
                        }
                      }
                    }
                  }
                  L12: {
                    if (var12.field_kc) {
                      stackIn_33_0 = param0;
                      break L12;
                    } else {
                      stackIn_33_0 = param1;
                      break L12;
                    }
                  }
                  var14 = stackIn_33_0;
                  var12.field_rc.field_S = null;
                  var12.field_rc.field_db = 0;
                  var46 = var12.field_rc;
                  var12.field_nc.field_S = null;
                  var46.field_Fb = 0;
                  var12.field_nc.field_db = 0;
                  var47 = var12.field_nc;
                  var47.field_Fb = 0;
                  var12.field_Vb.field_S = null;
                  var12.field_Vb.field_db = 0;
                  var48 = var12.field_Vb;
                  var48.field_Fb = 0;
                  var12.field_cc.field_S = null;
                  var18 = var12.field_cc;
                  var12.field_cc.field_db = 0;
                  var12.field_ac.field_S = null;
                  var18.field_Fb = 0;
                  var12.field_ac.field_db = 0;
                  var19 = var12.field_ac;
                  var12.field_gc.field_S = null;
                  var19.field_Fb = 0;
                  var12.field_gc.field_db = 0;
                  var20 = var12.field_gc;
                  var12.field_pc.field_S = null;
                  var20.field_Fb = 0;
                  var12.field_pc.field_db = 0;
                  var21 = var12.field_pc;
                  var21.field_Fb = 0;
                  var22_int = 0;
                  L13: while (true) {
                    if (ol.field_A <= var22_int) {
                      L14: {
                        var12.field_jc.field_Db = null;
                        var12.field_jc.field_db = 0;
                        var22 = var12.field_jc;
                        var12.field_Kb.field_Db = null;
                        var22.field_Fb = 0;
                        var12.field_Kb.field_db = 0;
                        var49 = var12.field_Kb;
                        var49.field_Fb = 0;
                        var12.field_ec.field_Db = null;
                        var12.field_ec.field_db = 0;
                        var24 = var12.field_ec;
                        var24.field_Fb = 0;
                        var12.field_wc.field_Db = null;
                        var25 = var12.field_wc;
                        var12.field_wc.field_db = 0;
                        var25.field_Fb = 0;
                        var12.field_Ob.field_S = null;
                        var26 = var12.field_Ob;
                        var12.field_Ob.field_db = 0;
                        var12.field_Jb.field_S = null;
                        var26.field_Fb = 0;
                        var12.field_Jb.field_db = 0;
                        var27 = var12.field_Jb;
                        var12.field_Ib.field_S = null;
                        var27.field_Fb = 0;
                        var28 = var12.field_Ib;
                        var12.field_Ib.field_db = 0;
                        var28.field_Fb = 0;
                        var12.field_bc.field_S = null;
                        var29 = var12.field_bc;
                        var12.field_bc.field_db = 0;
                        var12.field_Rb.field_S = null;
                        var29.field_Fb = 0;
                        var12.field_Rb.field_db = 0;
                        var30 = var12.field_Rb;
                        var30.field_Fb = 0;
                        var12.field_Fb = uk.field_v.field_Nb.field_Fb;
                        var31 = 0;
                        var32 = var12.field_Nb;
                        if (var12.k(param6 + 4043)) {
                          break L14;
                        } else {
                          L15: {
                            if (var12.field_kc) {
                              if (0 > var12.field_Yb) {
                                L16: {
                                  if (!var12.field_vc) {
                                    break L16;
                                  } else {
                                    L17: {
                                      if (var12.field_dc) {
                                        break L17;
                                      } else {
                                        if (var12.field_Sb) {
                                          break L17;
                                        } else {
                                          break L16;
                                        }
                                      }
                                    }
                                    var12.field_nc.field_S = mo.field_e;
                                    break L15;
                                  }
                                }
                                if ((var12.field_xc ^ -1) != -3) {
                                  var12.field_rc.field_S = or.field_h;
                                  break L15;
                                } else {
                                  var12.field_nc.field_S = vo.field_C;
                                  break L15;
                                }
                              } else {
                                var12.field_rc.field_S = np.field_Mb;
                                break L15;
                              }
                            } else {
                              L18: {
                                if (var12.field_dc) {
                                  break L18;
                                } else {
                                  if (var12.field_Sb) {
                                    break L18;
                                  } else {
                                    if (!var12.field_Mb) {
                                      var12.field_rc.field_S = bm.field_B;
                                      break L15;
                                    } else {
                                      var12.field_rc.field_S = il.field_i;
                                      break L15;
                                    }
                                  }
                                }
                              }
                              var12.field_nc.field_S = mo.field_e;
                              break L15;
                            }
                          }
                          L19: {
                            if (var12.field_nc.field_S == null) {
                              var12.field_rc.a(116, 68, r.field_f, var31, 0);
                              break L19;
                            } else {
                              var12.field_nc.a(77, 68, r.field_f, var31, 0);
                              break L19;
                            }
                          }
                          L20: {
                            var12.field_Vb.field_S = cc.a(var12.field_Vb.field_z, var32, 78);
                            var12.field_Vb.a(77, 78, r.field_f, var31, 70);
                            if (!var12.field_Vb.field_pb) {
                              break L20;
                            } else {
                              if (var12.field_Vb.field_S.equals(var32)) {
                                break L20;
                              } else {
                                ko.field_S = var32;
                                break L20;
                              }
                            }
                          }
                          L21: {
                            var12.field_cc.field_S = Integer.toString(var12.field_Qb);
                            if (!var12.field_vc) {
                              var12.field_cc.field_O = 1;
                              var12.field_cc.a(param6 ^ 111, 48, r.field_f, var31, 150);
                              break L21;
                            } else {
                              var12.field_ac.field_S = "/" + var12.field_uc;
                              var12.field_cc.field_O = 2;
                              var33_int = (-var12.field_ac.field_z.c("/") + 348) / 2;
                              var12.field_cc.a(param6 ^ 99, var33_int - 150, r.field_f, var31, 150);
                              var12.field_ac.a(118, 198 + -var33_int, r.field_f, var31, var33_int);
                              break L21;
                            }
                          }
                          L22: {
                            var12.field_gc.field_S = Integer.toString(var12.field_tc);
                            var12.field_gc.a(param6 + 101, 48, r.field_f, var31, 200);
                            if (db.field_S) {
                              stackIn_66_0 = 250;
                              break L22;
                            } else {
                              stackIn_66_0 = 200;
                              break L22;
                            }
                          }
                          L23: {
                            var33_int = stackIn_66_0;
                            var12.field_pc.a(83, -2 + (-var33_int + 365), r.field_f, var31, var33_int);
                            var34_int = r.field_j;
                            if ((var14 & 1 << t.field_b) != 0) {
                              var50_ref = eg.field_r[var12.field_Ub];
                              var12.field_jc.field_Db = var50_ref;
                              var12.field_jc.a(92, var50_ref.field_x, var12.field_pc.field_db, 0, var34_int);
                              var34_int = var34_int + (r.field_j + var50_ref.field_x);
                              break L23;
                            } else {
                              break L23;
                            }
                          }
                          L24: {
                            if ((var14 & 1 << jn.field_c) != 0) {
                              L25: {
                                if (!var12.field_dc) {
                                  if (var12.field_Sb) {
                                    stackIn_77_0 = 1;
                                    break L25;
                                  } else {
                                    stackIn_77_0 = 0;
                                    break L25;
                                  }
                                } else {
                                  stackIn_77_0 = 1;
                                  break L25;
                                }
                              }
                              L26: {
                                var36 = stackIn_77_0;
                                stackIn_79_0 = mj.field_c;

                                if (var36 == 0) {
                                  stackIn_80_0 = (er[]) ((Object) stackIn_79_0);
                                  stackIn_80_1 = 0;
                                  break L26;
                                } else {
                                  stackIn_80_0 = (er[]) ((Object) stackIn_79_0);
                                  stackIn_80_1 = 1;
                                  break L26;
                                }
                              }
                              var51_ref = stackIn_80_0[stackIn_80_1];
                              var12.field_ec.field_Db = var51_ref;
                              var12.field_ec.a(param6 ^ 90, var51_ref.field_x, var12.field_pc.field_db, 0, var34_int);
                              var34_int = var34_int + (r.field_j + var51_ref.field_x);
                              break L24;
                            } else {
                              break L24;
                            }
                          }
                          L27: {
                            if (-1 != (var14 & 1 << pf.field_a ^ -1)) {
                              var52_ref = sf.field_a[-1 + var12.field_xc];
                              var12.field_wc.field_Db = var52_ref;
                              var12.field_wc.a(78, var52_ref.field_x, var12.field_pc.field_db, 0, var34_int);
                              var34_int = var34_int + (var52_ref.field_x + r.field_j);
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          L28: {
                            if ((var14 & 1 << ao.field_K) == 0) {
                              break L28;
                            } else {
                              L29: {
                                stackIn_87_0 = ne.field_I;

                                if (!var12.field_Tb) {
                                  stackIn_88_0 = (er[]) ((Object) stackIn_87_0);
                                  stackIn_88_1 = 0;
                                  break L29;
                                } else {
                                  stackIn_88_0 = (er[]) ((Object) stackIn_87_0);
                                  stackIn_88_1 = 1;
                                  break L29;
                                }
                              }
                              var53_ref = stackIn_88_0[stackIn_88_1];
                              var12.field_Kb.field_Db = var53_ref;
                              var12.field_Kb.a(84, var53_ref.field_x, var12.field_pc.field_db, 0, var34_int);
                              var34_int = var34_int + (r.field_j + var53_ref.field_x);
                              break L28;
                            }
                          }
                          L30: {
                            if (null == jq.field_c) {
                              break L30;
                            } else {
                              var36 = 0;
                              L31: while (true) {
                                if (var36 >= ol.field_A) {
                                  break L30;
                                } else {
                                  L32: {
                                    if (null != jq.field_c[var36]) {
                                      if (-1 != (var14 & 1 << qr.field_n + var36 ^ -1)) {
                                        var42 = jq.field_c[var36][255 & var12.field_fc[var36]];
                                        var54 = var42;
                                        var12.field_Zb[var36].field_Db = var42;
                                        var12.field_Zb[var36].a(90, var54.field_x, var12.field_pc.field_db, 0, var34_int);
                                        var34_int = var34_int + (r.field_j + var54.field_x);
                                        break L32;
                                      } else {
                                        var36++;
                                        continue L31;
                                      }
                                    } else {
                                      break L32;
                                    }
                                  }
                                  var36++;
                                  continue L31;
                                }
                              }
                            }
                          }
                          L33: {
                            var36 = (var12.field_pc.field_Fb - var34_int) / 2;
                            if (var36 <= 0) {
                              break L33;
                            } else {
                              var12.field_jc.field_wb = var12.field_jc.field_wb + var36;
                              var12.field_ec.field_wb = var12.field_ec.field_wb + var36;
                              var12.field_wc.field_wb = var12.field_wc.field_wb + var36;
                              var12.field_Kb.field_wb = var12.field_Kb.field_wb + var36;
                              var37_int = 0;
                              L34: while (true) {
                                if (var37_int >= ol.field_A) {
                                  break L33;
                                } else {
                                  dupTemp$0 = var12.field_Zb[var37_int];
                                  dupTemp$0.field_wb = dupTemp$0.field_wb + var36;
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
                                var37_int = var12.field_Yb;
                                if (var37_int >= 0) {
                                  break L36;
                                } else {
                                  var37_int = (int)(var9 - var12.field_Pb);
                                  break L36;
                                }
                              }
                              var38_int = var37_int / 1000;
                              var39 = var38_int / 60;
                              var38_int = var38_int % 60;
                              if (-61 >= (var39 ^ -1)) {
                                var40 = var39 / 60;
                                var39 = var39 % 60;
                                var12.field_Ob.field_S = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                                break L35;
                              } else {
                                var12.field_Ob.field_S = var39 + ":" + var38_int / 10 + var38_int % 10;
                                break L35;
                              }
                            }
                          }
                          L37: {
                            var12.field_Ob.a(124, var12.field_Fb + -365, r.field_f, var31, 365);
                            var31 = var31 + r.field_f;
                            if (var12.field_Hb != null) {
                              var31 += 2;
                              var37 = new StringBuilder(64);
                              discarded$1 = var37.append(od.field_Ib);
                              discarded$2 = var37.append(var12.field_Hb[0]);
                              var38_int = 1;
                              L38: while (true) {
                                if (var12.field_Qb <= var38_int) {
                                  var38 = var37.toString();
                                  var12.field_Jb.field_S = var38;
                                  var39 = var12.field_Jb.field_z.b(var38, var12.field_Fb + -(var12.field_Jb.field_R * 2));
                                  var12.field_Jb.a(param6 + 73, var12.field_Fb, r.field_f * var39, var31, 0);
                                  var31 = var31 + r.field_f * var39;
                                  break L37;
                                } else {
                                  discarded$3 = var37.append(", ");
                                  discarded$4 = var37.append(var12.field_Hb[var38_int]);
                                  var38_int++;
                                  continue L38;
                                }
                              }
                            } else {
                              break L37;
                            }
                          }
                          L39: {
                            if (var12.field_Sb) {
                              var12.field_Ib.field_S = Vertigo2.a(new String[]{var32}, g.field_e, 111);
                              var12.field_Ib.a(101, var12.field_Fb - 2 * ia.field_G, r.field_f, var31, ia.field_G);
                              var31 = var31 + r.field_f;
                              break L39;
                            } else {
                              break L39;
                            }
                          }
                          if (var12.field_qc) {
                            var12.field_bc.field_S = Vertigo2.a(new String[]{var32}, kg.field_I, 81);
                            var12.field_bc.a(117, -(ia.field_G * 2) + var12.field_Fb, r.field_f, var31, ia.field_G);
                            var31 = var31 + r.field_f;
                            break L14;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L40: {
                        var33 = rk.a((byte) -27, var32, var12.field_Lb);
                        if (var33 != null) {
                          var34_int = var12.field_Rb.field_z.b(var33, -ia.field_G + var12.field_Fb - ia.field_G);
                          var12.field_Rb.field_U = 256 * var12.field_ic / lp.field_D;
                          var12.field_Rb.field_S = var33;
                          var12.field_Rb.a(param6 + 100, var12.field_Fb + -(ia.field_G * 2), var34_int * r.field_f, var31, ia.field_G);
                          var31 = var31 + var34_int * r.field_f;
                          break L40;
                        } else {
                          break L40;
                        }
                      }
                      L41: {
                        if (var7_int == 0) {
                          var12.field_kb = var31 - var12.field_db;
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                      L42: {
                        if (var13 == 0) {
                          break L42;
                        } else {
                          uk.field_v.field_Nb.a((byte) 109, (cr) (var11), var12, 2);
                          break L42;
                        }
                      }
                      var34_int = 0;
                      L43: while (true) {
                        if (ol.field_A <= var34_int) {
                          L44: {
                            if (var12.field_jc.field_pb) {
                              L45: {
                                if (var12.field_Ub == 1) {
                                  var34 = ec.field_z;
                                  break L45;
                                } else {
                                  var34 = gm.field_c[var12.field_Ub];
                                  break L45;
                                }
                              }
                              ko.field_S = gn.field_c + " - " + var34;
                              break L44;
                            } else {
                              break L44;
                            }
                          }
                          L46: {
                            if (var12.field_Kb.field_pb) {
                              L47: {
                                if (!var12.field_Tb) {
                                  stackIn_152_0 = up.field_y;
                                  break L47;
                                } else {
                                  stackIn_152_0 = ej.field_d;
                                  break L47;
                                }
                              }
                              ko.field_S = stackIn_152_0;
                              break L46;
                            } else {
                              break L46;
                            }
                          }
                          L48: {
                            if (!var12.field_ec.field_pb) {
                              break L48;
                            } else {
                              L49: {
                                L50: {
                                  if (var12.field_dc) {
                                    break L50;
                                  } else {
                                    if (!var12.field_Sb) {
                                      if (var12.field_vc) {
                                        stackIn_161_0 = to.field_a;
                                        break L49;
                                      } else {
                                        stackIn_161_0 = ia.field_E;
                                        break L49;
                                      }
                                    } else {
                                      break L50;
                                    }
                                  }
                                }
                                stackIn_161_0 = rm.field_E;
                                break L49;
                              }
                              ko.field_S = stackIn_161_0;
                              break L48;
                            }
                          }
                          L51: {
                            if (!var12.field_wc.field_pb) {
                              break L51;
                            } else {
                              L52: {
                                if (-3 == (var12.field_xc ^ -1)) {
                                  stackIn_166_0 = n.field_c;
                                  break L52;
                                } else {
                                  stackIn_166_0 = in.field_e;
                                  break L52;
                                }
                              }
                              ko.field_S = stackIn_166_0;
                              break L51;
                            }
                          }
                          L53: {
                            if (-1 == (var12.field_tb ^ -1)) {
                              break L53;
                            } else {
                              if (var12.k(4043)) {
                                break L53;
                              } else {
                                if (-1 != (var12.field_nc.field_tb ^ -1)) {
                                  L54: {
                                    if (!var12.field_kc) {
                                      break L54;
                                    } else {
                                      L55: {
                                        if (!var12.field_vc) {
                                          break L55;
                                        } else {
                                          if (var12.field_dc) {
                                            break L54;
                                          } else {
                                            if (!var12.field_Sb) {
                                              break L55;
                                            } else {
                                              break L54;
                                            }
                                          }
                                        }
                                      }
                                      bs.a(param2, (byte) -47, var12.a((byte) -38));
                                      break L53;
                                    }
                                  }
                                  hk.a(param2, (byte) 60, var12.a((byte) -38));
                                  break L53;
                                } else {
                                  ve.a((byte) 117, var12, var32, param4);
                                  break L53;
                                }
                              }
                            }
                          }
                          var12 = (uh) ((Object) var8.b(param6 ^ 61));
                          continue L2;
                        } else {
                          L56: {
                            if (var12.field_Zb[var34_int].field_pb) {
                              L57: {
                                if (an.field_f == null) {
                                  var35 = null;
                                  break L57;
                                } else {
                                  if (an.field_f[var34_int] == null) {
                                    var35 = null;
                                    break L57;
                                  } else {
                                    var35 = an.field_f[var34_int][255 & var12.field_fc[var34_int]];
                                    break L57;
                                  }
                                }
                              }
                              if (var35 != null) {
                                ko.field_S = md.field_C[var34_int] + " - " + (String) (var35);
                                break L56;
                              } else {
                                ko.field_S = md.field_C[var34_int];
                                break L56;
                              }
                            } else {
                              break L56;
                            }
                          }
                          var34_int++;
                          continue L43;
                        }
                      }
                    } else {
                      var12.field_Zb[var22_int].field_Db = null;
                      var23 = var12.field_Zb[var22_int];
                      var12.field_Zb[var22_int].field_db = 0;
                      var23.field_Fb = 0;
                      var22_int++;
                      continue L13;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "uo.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final ud a(int param0, boolean param1) {
        byte[] var4 = null;
        ud var3 = (ud) (this.field_i.b((long)param0, (byte) 96));
        if (!param1) {
            return (ud) null;
        }
        if (var3 != null) {
            return var3;
        }
        if (-32769 < (param0 ^ -1)) {
            var4 = this.field_a.a(0, param0, (byte) -12);
        } else {
            var4 = this.field_b.a(0, 32767 & param0, (byte) -57);
        }
        var3 = new ud();
        if (var4 != null) {
            var3.a(new ed(var4), -1);
        }
        if (!((param0 ^ -1) > -32769)) {
            var3.a((byte) 89);
        }
        this.field_i.a((long)param0, var3, (byte) -89);
        return var3;
    }

    uo(int param0, r param1, r param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_i = new lo(64);
        try {
          L0: {
            L1: {
              this.field_a = param1;
              this.field_b = param2;
              if (null == this.field_a) {
                break L1;
              } else {
                this.field_a.b(0, (byte) -59);
                break L1;
              }
            }
            L2: {
              if (null == this.field_b) {
                break L2;
              } else {
                this.field_b.b(0, (byte) -61);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("uo.<init>(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_11_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_c = "(<%0> players want to join)";
        field_g = new k();
        field_f = new byte[50][];
        field_j = "Friends";
    }
}
