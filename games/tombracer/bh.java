/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends ela {
    static int field_o;
    static boolean field_p;

    bh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, boolean param6) {
        jea dupTemp$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        iv stackIn_5_0;
        int stackIn_5_1;
        boolean stackIn_5_2;
        int stackIn_5_3;
        int stackIn_5_4;
        int stackIn_5_5;
        iv stackIn_6_0;
        int stackIn_6_1;
        boolean stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_6_5;
        int stackIn_6_6;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        ht stackIn_12_0;
        jea stackIn_12_1;
        jea stackIn_12_2;
        long stackIn_12_3;
        ht stackIn_13_0 = null;
        jea stackIn_13_1 = null;
        jea stackIn_13_2 = null;
        long stackIn_13_3 = 0L;
        jea stackIn_13_4 = null;
        ht stackIn_31_0;
        jea stackIn_31_1;
        jea stackIn_31_2;
        long stackIn_31_3;
        ht stackIn_32_0;
        jea stackIn_32_1;
        jea stackIn_32_2;
        long stackIn_32_3;
        jea stackIn_32_4;
        int stackIn_36_0 = 0;
        int stackIn_71_0 = 0;
        int stackIn_80_0 = 0;
        iu[] stackIn_82_0 = null;
        iu[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        iu[] stackIn_90_0 = null;
        iu[] stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        String stackIn_151_0 = null;
        String stackIn_160_0 = null;
        String stackIn_165_0 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        vna var8 = null;
        long var9 = 0L;
        Object var11 = null;
        ht var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var18_int = 0;
        jea var18 = null;
        jea var19 = null;
        jea var20 = null;
        jea var21 = null;
        int var22_int = 0;
        jea var22 = null;
        jea var23 = null;
        jea var24 = null;
        jea var25 = null;
        jea var26 = null;
        jea var27 = null;
        jea var28 = null;
        jea var29 = null;
        jea var30 = null;
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
        iu var42 = null;
        jea var43 = null;
        jea var44 = null;
        jea var45 = null;
        jea var46 = null;
        jea var47 = null;
        jea var48 = null;
        jea var49 = null;
        Object var50 = null;
        iu var50_ref = null;
        Object var51 = null;
        iu var51_ref = null;
        Object var52 = null;
        iu var52_ref = null;
        Object var53 = null;
        iu var53_ref = null;
        iu var54 = null;
        var50 = null;
        var51 = null;
        var52 = null;
        var53 = null;
        var41 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                bh.a(75, true);
                break L1;
              }
            }
            L2: {
              stackIn_5_0 = nsa.field_i;

              stackIn_5_1 = 2;

              stackIn_5_2 = param6;

              stackIn_5_3 = 107;

              stackIn_5_4 = param3 * (2 + di.field_a) * 4;

              stackIn_5_5 = 2 * (2 + di.field_a);

              if (nsa.field_i != lu.field_b) {
                stackIn_6_0 = (iv) ((Object) stackIn_5_0);
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = stackIn_5_3;
                stackIn_6_4 = stackIn_5_4;
                stackIn_6_5 = stackIn_5_5;
                stackIn_6_6 = 0;
                break L2;
              } else {
                stackIn_6_0 = (iv) ((Object) stackIn_5_0);
                stackIn_6_1 = stackIn_5_1;
                stackIn_6_2 = stackIn_5_2;
                stackIn_6_3 = stackIn_5_3;
                stackIn_6_4 = stackIn_5_4;
                stackIn_6_5 = stackIn_5_5;
                stackIn_6_6 = 1;
                break L2;
              }
            }
            var7_int = ((iv) (Object) stackIn_6_0).a(stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_6_5, stackIn_6_6 != 0) ? 1 : 0;
            var8 = nsa.field_i.field_tb.field_J;
            var9 = bva.b((byte) -107);
            var11 = null;
            var12 = (ht) ((Object) var8.f(-80));
            L3: while (true) {
              if (var12 == null) {
                break L0;
              } else {
                L4: {
                  var13 = 0;
                  if (null != var12.field_J) {
                    break L4;
                  } else {
                    var12.field_Vb = new jea(0L, iea.field_g);
                    stackIn_10_0 = param4;
                    stackIn_10_1 = param0;
                    L5: {
                      var14 = stackIn_10_0 | stackIn_10_1;
                      var12.b(-122, var12.field_Vb);
                      var12.field_Vb.field_z = 1;
                      var12.field_bc = new jea(0L, lta.field_a);
                      var12.b(-124, var12.field_bc);
                      var12.field_Hb = new jea(0L, iea.field_g);
                      var12.b(-124, var12.field_Hb);
                      var12.field_Hb.field_x = 0;
                      var12.field_wb = new jea(0L, iea.field_g);
                      var12.b(-124, var12.field_wb);
                      var12.field_wb.field_x = 0;
                      var12.field_Lb = new jea(0L, lta.field_a);
                      var12.b(-125, var12.field_Lb);
                      var12.field_Lb.field_z = 2;
                      stackIn_12_0 = (ht) (var12);

                      stackIn_12_1 = null;

                      stackIn_12_2 = null;

                      stackIn_12_3 = 0L;

                      if (!rca.field_p) {
                        stackIn_13_0 = (ht) ((Object) stackIn_12_0);
                        stackIn_13_1 = null;
                        stackIn_13_2 = null;
                        stackIn_13_3 = stackIn_12_3;
                        stackIn_13_4 = lta.field_a;
                        break L5;
                      } else {
                        stackIn_13_0 = (ht) ((Object) stackIn_12_0);
                        stackIn_13_1 = null;
                        stackIn_13_2 = null;
                        stackIn_13_3 = stackIn_12_3;
                        stackIn_13_4 = iea.field_g;
                        break L5;
                      }
                    }
                    L6: {
                      stackIn_13_0.field_Eb = new jea(stackIn_13_3, stackIn_13_4);
                      var12.b(-125, var12.field_Eb);
                      var12.field_Ub = new jea[fk.field_b];
                      var12.field_xb = new jea(0L, (jea) null);
                      if ((1 << rl.field_w & var14) != 0) {
                        var12.field_Eb.b(-128, var12.field_xb);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var12.field_vb = new jea(0L, (jea) null);
                      if (0 != (var14 & 1 << una.field_c)) {
                        var12.field_Eb.b(-124, var12.field_vb);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      var12.field_Zb = new jea(0L, (jea) null);
                      if ((var14 & 1 << wta.field_F) == 0) {
                        break L8;
                      } else {
                        var12.field_Eb.b(param1 + -123, var12.field_Zb);
                        break L8;
                      }
                    }
                    L9: {
                      var12.field_fc = new jea(0L, (jea) null);
                      if ((1 << ts.field_b & var14) == 0) {
                        break L9;
                      } else {
                        var12.field_Eb.b(param1 ^ -124, var12.field_fc);
                        break L9;
                      }
                    }
                    var45 = var12.field_xb;
                    var44 = var12.field_fc;
                    var43 = var12.field_vb;
                    var12.field_Zb.field_bb = 1;
                    var43.field_bb = 1;
                    var44.field_bb = 1;
                    var45.field_bb = 1;
                    var18_int = 0;
                    L10: while (true) {
                      if (fk.field_b <= var18_int) {
                        L11: {
                          stackIn_31_0 = (ht) (var12);

                          stackIn_31_1 = null;

                          stackIn_31_2 = null;

                          stackIn_31_3 = 0L;

                          if (!rca.field_p) {
                            stackIn_32_0 = (ht) ((Object) stackIn_31_0);
                            stackIn_32_1 = null;
                            stackIn_32_2 = null;
                            stackIn_32_3 = stackIn_31_3;
                            stackIn_32_4 = iea.field_g;
                            break L11;
                          } else {
                            stackIn_32_0 = (ht) ((Object) stackIn_31_0);
                            stackIn_32_1 = null;
                            stackIn_32_2 = null;
                            stackIn_32_3 = stackIn_31_3;
                            stackIn_32_4 = lta.field_a;
                            break L11;
                          }
                        }
                        stackIn_32_0.field_ub = new jea(stackIn_32_3, stackIn_32_4);
                        var12.b(-127, var12.field_ub);
                        var12.field_ub.field_z = 2;
                        var12.field_Qb = new jea(0L, lta.field_a);
                        var12.b(param1 ^ -122, var12.field_Qb);
                        var12.field_hc = new jea(0L, dja.field_p);
                        var12.b(-125, var12.field_hc);
                        var12.field_dc = new jea(0L, dja.field_p);
                        var12.b(-122, var12.field_dc);
                        var12.field_Rb = new jea(0L, kua.field_i);
                        var12.b(param1 ^ -127, var12.field_Rb);
                        var12.a(-10966);
                        var12.field_Nb = new jea(0L, bua.field_g);
                        var12.b(-124, var12.field_Nb);
                        var13 = 1;
                        break L4;
                      } else {
                        L12: {
                          var12.field_Ub[var18_int] = new jea(0L, (jea) null);
                          if (-1 != (1 << var18_int + fm.field_m & var14 ^ -1)) {
                            var12.field_Eb.b(-126, var12.field_Ub[var18_int]);
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        var12.field_Ub[var18_int].field_bb = 1;
                        var18_int++;
                        continue L10;
                      }
                    }
                  }
                }
                L13: {
                  var12.field_Vb.field_r = null;
                  if (var12.field_ec) {
                    stackIn_36_0 = param0;
                    break L13;
                  } else {
                    stackIn_36_0 = param4;
                    break L13;
                  }
                }
                var14 = stackIn_36_0;
                var12.field_Vb.field_t = 0;
                var46 = var12.field_Vb;
                var12.field_Nb.field_r = null;
                var46.field_G = 0;
                var47 = var12.field_Nb;
                var12.field_Nb.field_t = 0;
                var12.field_bc.field_r = null;
                var47.field_G = 0;
                var48 = var12.field_bc;
                var12.field_bc.field_t = 0;
                var48.field_G = 0;
                var12.field_Hb.field_r = null;
                var18 = var12.field_Hb;
                var12.field_Hb.field_t = 0;
                var18.field_G = 0;
                var12.field_wb.field_r = null;
                var12.field_wb.field_t = 0;
                var19 = var12.field_wb;
                var19.field_G = 0;
                var12.field_Lb.field_r = null;
                var20 = var12.field_Lb;
                var12.field_Lb.field_t = 0;
                var12.field_Eb.field_r = null;
                var20.field_G = 0;
                var21 = var12.field_Eb;
                var12.field_Eb.field_t = 0;
                var21.field_G = 0;
                var22_int = 0;
                L14: while (true) {
                  if (fk.field_b <= var22_int) {
                    L15: {
                      var12.field_xb.field_R = null;
                      var22 = var12.field_xb;
                      var12.field_xb.field_t = 0;
                      var12.field_fc.field_R = null;
                      var22.field_G = 0;
                      var49 = var12.field_fc;
                      var12.field_fc.field_t = 0;
                      var12.field_vb.field_R = null;
                      var49.field_G = 0;
                      var12.field_vb.field_t = 0;
                      var24 = var12.field_vb;
                      var24.field_G = 0;
                      var12.field_Zb.field_R = null;
                      var12.field_Zb.field_t = 0;
                      var25 = var12.field_Zb;
                      var12.field_ub.field_r = null;
                      var25.field_G = 0;
                      var12.field_ub.field_t = 0;
                      var26 = var12.field_ub;
                      var12.field_Qb.field_r = null;
                      var26.field_G = 0;
                      var12.field_Qb.field_t = 0;
                      var27 = var12.field_Qb;
                      var27.field_G = 0;
                      var12.field_hc.field_r = null;
                      var12.field_hc.field_t = 0;
                      var28 = var12.field_hc;
                      var12.field_dc.field_r = null;
                      var28.field_G = 0;
                      var12.field_dc.field_t = 0;
                      var29 = var12.field_dc;
                      var12.field_Rb.field_r = null;
                      var29.field_G = 0;
                      var30 = var12.field_Rb;
                      var12.field_Rb.field_t = 0;
                      var30.field_G = 0;
                      var12.field_G = nsa.field_i.field_tb.field_G;
                      var31 = 0;
                      var32 = var12.field_tb;
                      if (!var12.g(0)) {
                        L16: {
                          if (var12.field_ec) {
                            if (var12.field_Kb >= 0) {
                              var12.field_Vb.field_r = wda.field_l;
                              break L16;
                            } else {
                              L17: {
                                if (!var12.field_Yb) {
                                  break L17;
                                } else {
                                  L18: {
                                    if (var12.field_Bb) {
                                      break L18;
                                    } else {
                                      if (!var12.field_gc) {
                                        break L17;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                  var12.field_Nb.field_r = hj.field_b;
                                  break L16;
                                }
                              }
                              if (var12.field_yb == 2) {
                                var12.field_Nb.field_r = vua.field_z;
                                break L16;
                              } else {
                                var12.field_Vb.field_r = pv.field_q;
                                break L16;
                              }
                            }
                          } else {
                            L19: {
                              if (var12.field_Bb) {
                                break L19;
                              } else {
                                if (!var12.field_gc) {
                                  if (!var12.field_Tb) {
                                    var12.field_Vb.field_r = wua.field_p;
                                    break L16;
                                  } else {
                                    var12.field_Vb.field_r = aua.field_c;
                                    break L16;
                                  }
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var12.field_Nb.field_r = hj.field_b;
                            break L16;
                          }
                        }
                        L20: {
                          if (null == var12.field_Nb.field_r) {
                            var12.field_Vb.a(68, di.field_a, -23776, var31, 0);
                            break L20;
                          } else {
                            var12.field_Nb.a(68, di.field_a, -23776, var31, 0);
                            break L20;
                          }
                        }
                        L21: {
                          var12.field_bc.field_r = il.a(var12.field_bc.field_H, var32, 78);
                          var12.field_bc.a(78, di.field_a, param1 ^ -23776, var31, 70);
                          if (!var12.field_bc.field_o) {
                            break L21;
                          } else {
                            if (var12.field_bc.field_r.equals(var32)) {
                              break L21;
                            } else {
                              qda.field_b = var32;
                              break L21;
                            }
                          }
                        }
                        L22: {
                          var12.field_Hb.field_r = Integer.toString(var12.field_Mb);
                          if (var12.field_Yb) {
                            var12.field_Hb.field_z = 2;
                            var12.field_wb.field_r = "/" + var12.field_Jb;
                            var33_int = (348 + -var12.field_wb.field_H.b("/")) / 2;
                            var12.field_Hb.a(var33_int + -150, di.field_a, -23776, var31, 150);
                            var12.field_wb.a(-var33_int + 198, di.field_a, -23776, var31, var33_int);
                            break L22;
                          } else {
                            var12.field_Hb.field_z = 1;
                            var12.field_Hb.a(48, di.field_a, -23776, var31, 150);
                            break L22;
                          }
                        }
                        L23: {
                          var12.field_Lb.field_r = Integer.toString(var12.field_Wb);
                          var12.field_Lb.a(48, di.field_a, param1 ^ -23776, var31, 200);
                          if (rca.field_p) {
                            stackIn_71_0 = 250;
                            break L23;
                          } else {
                            stackIn_71_0 = 200;
                            break L23;
                          }
                        }
                        L24: {
                          var33_int = stackIn_71_0;
                          var12.field_Eb.a(-2 + (-var33_int + 365), di.field_a, -23776, var31, var33_int);
                          var34_int = pda.field_c;
                          if (0 == (var14 & 1 << rl.field_w)) {
                            break L24;
                          } else {
                            var50_ref = w.field_f[var12.field_cc];
                            var12.field_xb.field_R = var50_ref;
                            var12.field_xb.a(var50_ref.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                            var34_int = var34_int + (var50_ref.field_n - -pda.field_c);
                            break L24;
                          }
                        }
                        L25: {
                          if (-1 == (1 << una.field_c & var14 ^ -1)) {
                            break L25;
                          } else {
                            L26: {
                              if (!var12.field_Bb) {
                                if (var12.field_gc) {
                                  stackIn_80_0 = 1;
                                  break L26;
                                } else {
                                  stackIn_80_0 = 0;
                                  break L26;
                                }
                              } else {
                                stackIn_80_0 = 1;
                                break L26;
                              }
                            }
                            L27: {
                              var36 = stackIn_80_0;
                              stackIn_82_0 = nja.field_K;

                              if (var36 != 0) {
                                stackIn_83_0 = (iu[]) ((Object) stackIn_82_0);
                                stackIn_83_1 = 1;
                                break L27;
                              } else {
                                stackIn_83_0 = (iu[]) ((Object) stackIn_82_0);
                                stackIn_83_1 = 0;
                                break L27;
                              }
                            }
                            var51_ref = stackIn_83_0[stackIn_83_1];
                            var12.field_vb.field_R = var51_ref;
                            var12.field_vb.a(var51_ref.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                            var34_int = var34_int + (var51_ref.field_n - -pda.field_c);
                            break L25;
                          }
                        }
                        L28: {
                          if (-1 == (1 << wta.field_F & var14 ^ -1)) {
                            break L28;
                          } else {
                            var52_ref = pca.field_k[-1 + var12.field_yb];
                            var12.field_Zb.field_R = var52_ref;
                            var12.field_Zb.a(var52_ref.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                            var34_int = var34_int + (pda.field_c + var52_ref.field_n);
                            break L28;
                          }
                        }
                        L29: {
                          if ((var14 & 1 << ts.field_b) != 0) {
                            L30: {
                              stackIn_90_0 = wt.field_c;

                              if (var12.field_Ob) {
                                stackIn_91_0 = (iu[]) ((Object) stackIn_90_0);
                                stackIn_91_1 = 1;
                                break L30;
                              } else {
                                stackIn_91_0 = (iu[]) ((Object) stackIn_90_0);
                                stackIn_91_1 = 0;
                                break L30;
                              }
                            }
                            var53_ref = stackIn_91_0[stackIn_91_1];
                            var12.field_fc.field_R = var53_ref;
                            var12.field_fc.a(var53_ref.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                            var34_int = var34_int + (pda.field_c + var53_ref.field_n);
                            break L29;
                          } else {
                            break L29;
                          }
                        }
                        L31: {
                          if (pda.field_d == null) {
                            break L31;
                          } else {
                            var36 = 0;
                            L32: while (true) {
                              if (fk.field_b <= var36) {
                                break L31;
                              } else {
                                L33: {
                                  if (null != pda.field_d[var36]) {
                                    if (0 != (1 << var36 + fm.field_m & var14)) {
                                      var42 = pda.field_d[var36][var12.field_ac[var36] & 255];
                                      var54 = var42;
                                      var12.field_Ub[var36].field_R = var42;
                                      var12.field_Ub[var36].a(var54.field_n, var12.field_Eb.field_t, -23776, 0, var34_int);
                                      var34_int = var34_int + (var54.field_n - -pda.field_c);
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
                          }
                        }
                        L34: {
                          var36 = (-var34_int + var12.field_Eb.field_G) / 2;
                          if (0 >= var36) {
                            break L34;
                          } else {
                            var12.field_xb.field_qb = var12.field_xb.field_qb + var36;
                            var12.field_vb.field_qb = var12.field_vb.field_qb + var36;
                            var12.field_Zb.field_qb = var12.field_Zb.field_qb + var36;
                            var12.field_fc.field_qb = var12.field_fc.field_qb + var36;
                            var37_int = 0;
                            L35: while (true) {
                              if (var37_int >= fk.field_b) {
                                break L34;
                              } else {
                                dupTemp$0 = var12.field_Ub[var37_int];
                                dupTemp$0.field_qb = dupTemp$0.field_qb + var36;
                                var37_int++;
                                continue L35;
                              }
                            }
                          }
                        }
                        L36: {
                          if (!var12.field_ec) {
                            break L36;
                          } else {
                            L37: {
                              var37_int = var12.field_Kb;
                              if ((var37_int ^ -1) <= -1) {
                                break L37;
                              } else {
                                var37_int = (int)(-var12.field_Gb + var9);
                                break L37;
                              }
                            }
                            var38_int = var37_int / 1000;
                            var39 = var38_int / 60;
                            var38_int = var38_int % 60;
                            if (60 <= var39) {
                              var40 = var39 / 60;
                              var39 = var39 % 60;
                              var12.field_ub.field_r = var40 + ":" + var39 / 10 + var39 % 10 + ":" + var38_int / 10 + var38_int % 10;
                              break L36;
                            } else {
                              var12.field_ub.field_r = var39 + ":" + var38_int / 10 + var38_int % 10;
                              break L36;
                            }
                          }
                        }
                        L38: {
                          var12.field_ub.a(var12.field_G - 365, di.field_a, param1 ^ -23776, var31, 365);
                          var31 = var31 + di.field_a;
                          if (var12.field_Cb == null) {
                            break L38;
                          } else {
                            var31 += 2;
                            var37 = new StringBuilder(64);
                            discarded$1 = var37.append(ds.field_l);
                            discarded$2 = var37.append(var12.field_Cb[0]);
                            var38_int = 1;
                            L39: while (true) {
                              if (var12.field_Mb <= var38_int) {
                                var38 = var37.toString();
                                var12.field_Qb.field_r = var38;
                                var39 = var12.field_Qb.field_H.a(var38, var12.field_G - 2 * var12.field_Qb.field_x);
                                var12.field_Qb.a(var12.field_G, var39 * di.field_a, param1 ^ -23776, var31, 0);
                                var31 = var31 + di.field_a * var39;
                                break L38;
                              } else {
                                discarded$3 = var37.append(", ");
                                discarded$4 = var37.append(var12.field_Cb[var38_int]);
                                var38_int++;
                                continue L39;
                              }
                            }
                          }
                        }
                        L40: {
                          if (!var12.field_gc) {
                            break L40;
                          } else {
                            var12.field_hc.field_r = gl.a((byte) 123, jf.field_o, new String[]{var32});
                            var12.field_hc.a(var12.field_G - 2 * mna.field_d, di.field_a, -23776, var31, mna.field_d);
                            var31 = var31 + di.field_a;
                            break L40;
                          }
                        }
                        if (var12.field_Sb) {
                          var12.field_dc.field_r = gl.a((byte) 121, ona.field_I, new String[]{var32});
                          var12.field_dc.a(-(mna.field_d * 2) + var12.field_G, di.field_a, -23776, var31, mna.field_d);
                          var31 = var31 + di.field_a;
                          break L15;
                        } else {
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                    L41: {
                      var33 = qb.a(var32, param1 + 8793, var12.field_Ib);
                      if (var33 != null) {
                        var34_int = var12.field_Rb.field_H.a(var33, var12.field_G + -mna.field_d + -mna.field_d);
                        var12.field_Rb.field_r = var33;
                        var12.field_Rb.field_s = var12.field_zb * 256 / qsa.field_a;
                        var12.field_Rb.a(-(mna.field_d * 2) + var12.field_G, di.field_a * var34_int, param1 + -23776, var31, mna.field_d);
                        var31 = var31 + di.field_a * var34_int;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    L42: {
                      if (var7_int != 0) {
                        break L42;
                      } else {
                        var12.field_O = var31 + -var12.field_t;
                        break L42;
                      }
                    }
                    L43: {
                      if (var13 != 0) {
                        nsa.field_i.field_tb.a(2, (jea) (var11), var12, (byte) -122);
                        break L43;
                      } else {
                        break L43;
                      }
                    }
                    var34_int = 0;
                    L44: while (true) {
                      if (fk.field_b <= var34_int) {
                        L45: {
                          if (!var12.field_xb.field_o) {
                            break L45;
                          } else {
                            L46: {
                              if (1 == var12.field_cc) {
                                var34 = ala.field_f;
                                break L46;
                              } else {
                                var34 = gv.field_w[var12.field_cc];
                                break L46;
                              }
                            }
                            qda.field_b = ova.field_k + " - " + var34;
                            break L45;
                          }
                        }
                        L47: {
                          if (!var12.field_fc.field_o) {
                            break L47;
                          } else {
                            L48: {
                              if (var12.field_Ob) {
                                stackIn_151_0 = dka.field_a;
                                break L48;
                              } else {
                                stackIn_151_0 = sda.field_i;
                                break L48;
                              }
                            }
                            qda.field_b = stackIn_151_0;
                            break L47;
                          }
                        }
                        L49: {
                          if (var12.field_vb.field_o) {
                            L50: {
                              L51: {
                                if (var12.field_Bb) {
                                  break L51;
                                } else {
                                  if (var12.field_gc) {
                                    break L51;
                                  } else {
                                    if (!var12.field_Yb) {
                                      stackIn_160_0 = lva.field_v;
                                      break L50;
                                    } else {
                                      stackIn_160_0 = cf.field_c;
                                      break L50;
                                    }
                                  }
                                }
                              }
                              stackIn_160_0 = kba.field_k;
                              break L50;
                            }
                            qda.field_b = stackIn_160_0;
                            break L49;
                          } else {
                            break L49;
                          }
                        }
                        L52: {
                          if (!var12.field_Zb.field_o) {
                            break L52;
                          } else {
                            L53: {
                              if (2 != var12.field_yb) {
                                stackIn_165_0 = ega.field_d;
                                break L53;
                              } else {
                                stackIn_165_0 = bha.field_y;
                                break L53;
                              }
                            }
                            qda.field_b = stackIn_165_0;
                            break L52;
                          }
                        }
                        L54: {
                          if (var12.field_y == 0) {
                            break L54;
                          } else {
                            if (var12.g(param1 + 0)) {
                              break L54;
                            } else {
                              if (var12.field_Nb.field_y == 0) {
                                st.a((byte) -62, var12, param2, var32);
                                break L54;
                              } else {
                                L55: {
                                  if (!var12.field_ec) {
                                    break L55;
                                  } else {
                                    L56: {
                                      if (!var12.field_Yb) {
                                        break L56;
                                      } else {
                                        if (var12.field_Bb) {
                                          break L55;
                                        } else {
                                          if (!var12.field_gc) {
                                            break L56;
                                          } else {
                                            break L55;
                                          }
                                        }
                                      }
                                    }
                                    kw.a(param5, false, var12.f(0));
                                    break L54;
                                  }
                                }
                                q.a((byte) -111, param5, var12.f(param1 ^ 0));
                                break L54;
                              }
                            }
                          }
                        }
                        var12 = (ht) ((Object) var8.e(param1 + 114));
                        continue L3;
                      } else {
                        L57: {
                          if (var12.field_Ub[var34_int].field_o) {
                            L58: {
                              if (null != eca.field_b) {
                                if (eca.field_b[var34_int] != null) {
                                  var35 = eca.field_b[var34_int][var12.field_ac[var34_int] & 255];
                                  break L58;
                                } else {
                                  var35 = null;
                                  break L58;
                                }
                              } else {
                                var35 = null;
                                break L58;
                              }
                            }
                            if (var35 != null) {
                              qda.field_b = kma.field_e[var34_int] + " - " + (String) (var35);
                              break L57;
                            } else {
                              qda.field_b = kma.field_e[var34_int];
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
                    var12.field_Ub[var22_int].field_R = null;
                    var23 = var12.field_Ub[var22_int];
                    var12.field_Ub[var22_int].field_t = 0;
                    var23.field_G = 0;
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
          throw tba.a((Throwable) ((Object) var7), "bh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final bfa a(bfa[] param0, int param1) {
        RuntimeException var3 = null;
        bfa stackIn_2_0 = null;
        bfa stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 == 0) {
              stackIn_4_0 = new bfa(rua.a((String) (param0[0].field_d), -62));
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (bfa) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("bh.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(int param0, boolean param1) {
        int stackIn_6_0 = 0;
        L0: {
          if (!param1) {
            break L0;
          } else {
            field_o = 18;
            break L0;
          }
        }
        L1: {
          L2: {
            if (1 == param0) {
              break L2;
            } else {
              if ((param0 ^ -1) == -8) {
                break L2;
              } else {
                stackIn_6_0 = 1;
                break L1;
              }
            }
          }
          stackIn_6_0 = 0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        field_o = 17825;
    }
}
