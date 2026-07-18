/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ck {
    static byte[][] field_c;
    static String field_b;
    static cn field_a;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        RuntimeException var9 = null;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        try {
          L0: {
            L1: {
              if (param6 > 65) {
                break L1;
              } else {
                ck.a(-121, (String[][]) null, -66, (iu[][]) null, (String[]) null, (String[]) null, (byte[]) null, (String[]) null, (String[][]) null, -31, (cn) null, 29, (byte[]) null, (iu[][]) null, (int[]) null);
                break L1;
              }
            }
            L2: {
              if (~(-(param8 / 2) + param0) > ~(-(param3 / 2) + param2)) {
                break L2;
              } else {
                if (param0 - -((param8 - -1) / 2) > (param3 - -1) / 2 + param2) {
                  break L2;
                } else {
                  if (~(-(param4 / 2) + param7) < ~(-(param1 / 2) + param5)) {
                    break L2;
                  } else {
                    if (param5 - -((param1 + 1) / 2) <= (param4 + 1) / 2 + param7) {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      break L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            return stackIn_14_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var9, "ck.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
        return stackIn_16_0 != 0;
    }

    final static void a(int param0, String[][] param1, int param2, iu[][] param3, String[] param4, String[] param5, byte[] param6, String[] param7, String[][] param8, int param9, cn param10, int param11, byte[] param12, iu[][] param13, int[] param14) {
        jea var15 = null;
        jea var16 = null;
        int var17_int = 0;
        jea var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        iu var19_ref_iu = null;
        String var20 = null;
        int var21 = 0;
        jea stackIn_4_0 = null;
        jea stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        jea stackIn_4_3 = null;
        jea stackIn_5_0 = null;
        jea stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        jea stackIn_5_3 = null;
        jea stackIn_6_0 = null;
        jea stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        jea stackIn_6_3 = null;
        String stackIn_6_4 = null;
        int stackIn_28_0 = 0;
        iu stackIn_37_0 = null;
        String stackIn_42_0 = null;
        Object stackIn_49_0 = null;
        jea stackOut_3_0 = null;
        jea stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        jea stackOut_3_3 = null;
        jea stackOut_5_0 = null;
        jea stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        jea stackOut_5_3 = null;
        String stackOut_5_4 = null;
        jea stackOut_4_0 = null;
        jea stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        jea stackOut_4_3 = null;
        String stackOut_4_4 = null;
        Object stackOut_48_0 = null;
        int stackOut_27_0 = 0;
        Object stackOut_36_0 = null;
        Object stackOut_35_0 = null;
        iu stackOut_34_0 = null;
        String stackOut_41_0 = null;
        Object stackOut_40_0 = null;
        Object stackOut_38_0 = null;
        L0: {
          var21 = TombRacer.field_G ? 1 : 0;
          mh.field_L = param7;
          eda.field_e = param9;
          pda.field_d = param3;
          oo.field_n = param12;
          aca.field_i = param6;
          ws.field_r = param2;
          kma.field_e = param4;
          no.field_o = param8;
          eca.field_b = param1;
          efa.field_w = param13;
          sg.field_u = param14;
          rda.field_m = param5;
          w.field_f = uka.a(param10, "lobby", 5, "gameprivacy");
          wt.field_c = uka.a(param10, "lobby", 5, "ratedgame");
          nja.field_K = uka.a(param10, "lobby", 5, "opentome");
          pca.field_k = uka.a(param10, "lobby", 5, "allowspectators");
          gv.field_w = new String[5];
          gv.field_w[0] = kda.field_cd;
          gv.field_w[2] = un.field_q;
          gv.field_w[3] = pta.field_d;
          gv.field_w[4] = uia.field_f;
          gv.field_w[1] = cha.field_b;
          rra.field_e = new jea(0L, (jea) null);
          uh.field_h = new jea(0L, ooa.field_f, ija.field_i);
          vw.field_b = new jea(0L, hma.field_b, dl.field_m);
          bsa.field_j = new iv(0L, new jea(0L, (jea) null), rfa.field_C, fe.field_F);
          rra.field_e.b(-126, uh.field_h);
          if (rca.field_p) {
            rra.field_e.b(param11 + -25575, vw.field_b);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          rra.field_e.b(-127, (jea) (Object) bsa.field_j);
          bsa.field_j.field_vb.a(false, kua.field_i);
          var15 = bsa.field_j.field_vb;
          bsa.field_j.field_vb.field_bb = 1;
          var15.field_z = 1;
          lva.field_t = new jea(0L, kua.field_i);
          lva.field_t.field_z = 1;
          st.field_j = new jea(0L, ssa.field_g, tt.field_g.toUpperCase());
          ap.field_a = new jea(0L, uda.field_s, tha.field_B.toUpperCase());
          db.field_s = new jea(0L, cfa.field_c);
          gta.field_b = new jea(0L, ooa.field_f, oo.field_m);
          iia.field_r = new jea(0L, cs.field_a, ria.field_r);
          spa.field_o = new jea(0L, cs.field_a, du.field_a);
          l.field_K = new jea(0L, cs.field_a, qo.field_i);
          aw.field_I = new jea(0L, cs.field_a, ff.field_N);
          cq.field_e = new jea(0L, hma.field_b, ra.field_G);
          nsa.field_i = new iv(0L, new jea(0L, (jea) null), rfa.field_C, fe.field_F);
          uq.field_c = new jea(0L, hg.field_g, iw.field_b.toUpperCase());
          uq.field_c.field_X = rca.field_p;
          stackOut_3_0 = null;
          stackOut_3_1 = null;
          stackOut_3_2 = 0L;
          stackOut_3_3 = hg.field_g;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          if (rca.field_p) {
            stackOut_5_0 = null;
            stackOut_5_1 = null;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = (jea) (Object) stackIn_5_3;
            stackOut_5_4 = jma.field_h;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            stackIn_6_2 = stackOut_5_2;
            stackIn_6_3 = stackOut_5_3;
            stackIn_6_4 = stackOut_5_4;
            break L1;
          } else {
            stackOut_4_0 = null;
            stackOut_4_1 = null;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = (jea) (Object) stackIn_4_3;
            stackOut_4_4 = bua.field_c;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            break L1;
          }
        }
        L2: {
          pq.field_c = new jea(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
          cka.field_fd = new jea(0L, (jea) null);
          cka.field_fd.b(-126, ap.field_a);
          cka.field_fd.b(param11 ^ -25371, db.field_s);
          db.field_s.b(-124, gta.field_b);
          db.field_s.b(-126, iia.field_r);
          db.field_s.b(-127, spa.field_o);
          if (!rca.field_p) {
            break L2;
          } else {
            db.field_s.b(-128, l.field_K);
            break L2;
          }
        }
        L3: {
          db.field_s.b(-123, aw.field_I);
          db.field_s.b(-128, cq.field_e);
          db.field_s.b(-122, (jea) (Object) nsa.field_i);
          if (!rca.field_p) {
            break L3;
          } else {
            cka.field_fd.b(-124, uq.field_c);
            break L3;
          }
        }
        L4: {
          cka.field_fd.b(-124, pq.field_c);
          rv.field_c = new jea(0L, kua.field_i);
          rv.field_c.field_bb = 0;
          rv.field_c.field_z = 1;
          bma.field_v = new jea(0L, dp.field_i, nf.field_j.toUpperCase());
          wo.field_k = new jea(0L, lma.field_r);
          wo.field_k.b(param11 + -25572, rv.field_c);
          wo.field_k.b(-122, bma.field_v);
          fu.field_t = new jea(0L, rfa.field_C);
          fu.field_t.a(false, kua.field_i);
          fu.field_t.field_bb = 1;
          var16 = fu.field_t;
          var16.field_z = 1;
          lk.field_l = new jea(0L, (jea) null);
          cea.field_a = new jea(0L, kua.field_i);
          cea.field_a.field_z = 1;
          uaa.field_b = new jea(0L, ooa.field_f, ija.field_i);
          lda.field_F = new jea(0L, hma.field_b, dl.field_m);
          tn.field_n = new iv(0L, new jea(0L, (jea) null), rfa.field_C, fe.field_F);
          lk.field_l.b(param11 ^ -25371, cea.field_a);
          lk.field_l.b(-124, uaa.field_b);
          if (!rca.field_p) {
            break L4;
          } else {
            lk.field_l.b(-122, lda.field_F);
            break L4;
          }
        }
        lk.field_l.b(-124, (jea) (Object) tn.field_n);
        bc.field_b = new jea(0L, ssa.field_g, jja.field_k.toUpperCase());
        wf.field_g = new jea(0L, uda.field_s);
        dba.field_g = new jea(0L, cfa.field_c);
        qna.field_b = new jea(0L, sm.field_r, mh.field_G.toUpperCase());
        rb.field_p = new jea[param0 + 4];
        bf.field_b = new tv[4 + param0][];
        rb.field_p[0] = new jea(0L, una.field_j, fj.field_a);
        bf.field_b[0] = new tv[6];
        var17_int = 0;
        L5: while (true) {
          if (var17_int >= 5) {
            L6: {
              if (2 <= sg.field_u.length) {
                rb.field_p[1] = new jea(0L, una.field_j, mi.field_j);
                bf.field_b[1] = new tv[1 + sg.field_u.length];
                bf.field_b[1][0] = new tv(0L, qja.field_j, (jea) null, dja.field_p, (iu) null, aa.field_b);
                var17_int = 0;
                L7: while (true) {
                  if (~var17_int <= ~sg.field_u.length) {
                    break L6;
                  } else {
                    bf.field_b[1][1 + var17_int] = new tv(0L, qja.field_j, (jea) null, dja.field_p, (iu) null, Integer.toString(sg.field_u[var17_int]));
                    var17_int++;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
            L8: {
              rb.field_p[2] = new jea(0L, una.field_j, nb.field_a);
              bf.field_b[2] = new tv[3];
              if (ws.field_r > 1) {
                rb.field_p[3] = new jea(0L, una.field_j, k.field_z);
                bf.field_b[3] = new tv[1 + ws.field_r];
                bf.field_b[3][0] = new tv(0L, qja.field_j, (jea) null, dja.field_p, (iu) null, aa.field_b);
                var17_int = 0;
                L9: while (true) {
                  if (ws.field_r <= var17_int) {
                    break L8;
                  } else {
                    bf.field_b[3][1 + var17_int] = new tv(0L, qja.field_j, (jea) null, dja.field_p, (iu) null, rda.field_m[var17_int]);
                    var17_int++;
                    continue L9;
                  }
                }
              } else {
                break L8;
              }
            }
            var17_int = 0;
            L10: while (true) {
              if (var17_int >= param0) {
                if (param11 == 25447) {
                  var17_int = 0;
                  L11: while (true) {
                    if (~var17_int <= ~(param0 - -4)) {
                      pk.field_z = new jea(0L, hg.field_g);
                      hw.field_a = new jea(0L, hg.field_g);
                      dl.field_t = new jea(0L, tka.field_q);
                      dl.field_t.a(false, kua.field_i);
                      dl.field_t.field_bb = 1;
                      var17 = dl.field_t;
                      var17.field_z = 1;
                      dka.field_b = new jea(0L, (jea) null);
                      dka.field_b.b(param11 ^ -25373, wf.field_g);
                      dka.field_b.b(-128, dba.field_g);
                      dba.field_g.b(-122, qna.field_b);
                      var18 = 0;
                      L12: while (true) {
                        if (var18 >= 4 + param0) {
                          dka.field_b.b(-128, pk.field_z);
                          dka.field_b.b(-125, hw.field_a);
                          dka.field_b.b(-123, dl.field_t);
                          vca.field_e = new jea(0L, oba.field_f, eu.field_b.toUpperCase());
                          fsa.field_q = new jea(0L, dp.field_i, ej.field_b.toUpperCase());
                          return;
                        } else {
                          L13: {
                            L14: {
                              if (var18 != 1) {
                                break L14;
                              } else {
                                if (sg.field_u.length >= 2) {
                                  break L14;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L15: {
                              if (var18 != 3) {
                                break L15;
                              } else {
                                if (ws.field_r > 1) {
                                  break L15;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            dba.field_g.b(-123, rb.field_p[var18]);
                            var19 = 0;
                            L16: while (true) {
                              if (~var19 <= ~bf.field_b[var18].length) {
                                break L13;
                              } else {
                                L17: {
                                  if (null == bf.field_b[var18][var19]) {
                                    break L17;
                                  } else {
                                    dba.field_g.b(-124, (jea) (Object) bf.field_b[var18][var19]);
                                    break L17;
                                  }
                                }
                                var19++;
                                continue L16;
                              }
                            }
                          }
                          var18++;
                          continue L12;
                        }
                      }
                    } else {
                      stackOut_48_0 = null;
                      stackIn_49_0 = stackOut_48_0;
                      L18: {
                        if (stackIn_49_0 != (Object) (Object) rb.field_p[var17_int]) {
                          rb.field_p[var17_int].field_P = 11;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (null == bf.field_b[var17_int]) {
                          break L19;
                        } else {
                          var18 = 0;
                          L20: while (true) {
                            if (~bf.field_b[var17_int].length >= ~var18) {
                              break L19;
                            } else {
                              L21: {
                                if (bf.field_b[var17_int][var18] == null) {
                                  break L21;
                                } else {
                                  if (bf.field_b[var17_int][var18].field_vb == null) {
                                    break L21;
                                  } else {
                                    bf.field_b[var17_int][var18].field_vb.field_P = 11;
                                    break L21;
                                  }
                                }
                              }
                              var18++;
                              continue L20;
                            }
                          }
                        }
                      }
                      var17_int++;
                      continue L11;
                    }
                  }
                } else {
                  return;
                }
              } else {
                rb.field_p[var17_int + 4] = new jea(0L, una.field_j, kma.field_e[var17_int]);
                bf.field_b[4 + var17_int] = new tv[1 + sea.c((int) oo.field_n[var17_int], 255)];
                bf.field_b[var17_int + 4][0] = new tv(0L, qja.field_j, (jea) null, dja.field_p, (iu) null, aa.field_b);
                stackOut_27_0 = 0;
                stackIn_28_0 = stackOut_27_0;
                var18 = stackIn_28_0;
                L22: while (true) {
                  if (var18 >= (oo.field_n[var17_int] & 255)) {
                    var17_int++;
                    continue L10;
                  } else {
                    L23: {
                      if (null == efa.field_w) {
                        stackOut_36_0 = null;
                        stackIn_37_0 = (iu) (Object) stackOut_36_0;
                        break L23;
                      } else {
                        if (null == efa.field_w[var17_int]) {
                          stackOut_35_0 = null;
                          stackIn_37_0 = (iu) (Object) stackOut_35_0;
                          break L23;
                        } else {
                          stackOut_34_0 = efa.field_w[var17_int][var18];
                          stackIn_37_0 = stackOut_34_0;
                          break L23;
                        }
                      }
                    }
                    L24: {
                      var19_ref_iu = stackIn_37_0;
                      if (null != no.field_o) {
                        if (no.field_o[var17_int] != null) {
                          stackOut_41_0 = no.field_o[var17_int][var18];
                          stackIn_42_0 = stackOut_41_0;
                          break L24;
                        } else {
                          stackOut_40_0 = null;
                          stackIn_42_0 = (String) (Object) stackOut_40_0;
                          break L24;
                        }
                      } else {
                        stackOut_38_0 = null;
                        stackIn_42_0 = (String) (Object) stackOut_38_0;
                        break L24;
                      }
                    }
                    var20 = stackIn_42_0;
                    bf.field_b[var17_int + 4][var18 + 1] = new tv(0L, qja.field_j, (jea) null, dja.field_p, var19_ref_iu, var20);
                    var18++;
                    continue L22;
                  }
                }
              }
            }
          } else {
            bf.field_b[0][1 + var17_int] = new tv(0L, qja.field_j, (jea) null, dja.field_p, w.field_f[var17_int], gv.field_w[var17_int]);
            var17_int++;
            continue L5;
          }
        }
    }

    final static void a(int param0, boolean param1, an param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = bia.a((byte) 93, 3 * (param4 - param0));
              var6 = 3 * param0;
              var7 = -10 + var5_int;
              int discarded$2 = -62;
              td.b();
              if (param2.field_K <= 0) {
                break L1;
              } else {
                if (param2.field_q == null) {
                  break L1;
                } else {
                  int discarded$3 = 0;
                  ssa.b();
                  break L1;
                }
              }
            }
            pq.field_f = 0;
            var8 = 0;
            L2: while (true) {
              if (var8 >= param2.field_u) {
                L3: {
                  if (param2.field_K <= 0) {
                    break L3;
                  } else {
                    if (null != param2.field_q) {
                      var8 = 0;
                      var9 = 0;
                      L4: while (true) {
                        if (var9 >= ow.field_q.length) {
                          break L3;
                        } else {
                          var10 = ow.field_q[var9];
                          ow.field_q[var9] = var8;
                          var8 = var8 + var10;
                          var9++;
                          continue L4;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                break L0;
              } else {
                L5: {
                  L6: {
                    var9 = param2.field_B[var8];
                    var10 = param2.field_w[var8];
                    var11 = param2.field_f[var8];
                    if (0 != 0) {
                      var12 = ds.field_f[var9];
                      var13 = mg.field_e[var9];
                      var14 = ds.field_f[var10] - var12;
                      var15 = ds.field_f[var11] + -var12;
                      var16 = mg.field_e[var10] + -var13;
                      var17 = mg.field_e[var11] + -var13;
                      if (var17 * var14 + -(var15 * var16) >= 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    } else {
                      break L6;
                    }
                  }
                  var12 = wp.field_c[var9];
                  if (var12 == -2147483648) {
                    break L5;
                  } else {
                    var13 = wp.field_c[var10];
                    if (var13 == -2147483648) {
                      break L5;
                    } else {
                      var14 = wp.field_c[var11];
                      if (var14 == -2147483648) {
                        break L5;
                      } else {
                        L7: {
                          var15 = var14 + (var13 + var12 - var6);
                          if (var7 >= 0) {
                            stackOut_20_0 = var15 >> var7;
                            stackIn_21_0 = stackOut_20_0;
                            break L7;
                          } else {
                            stackOut_18_0 = var15 << -var7;
                            stackIn_21_0 = stackOut_18_0;
                            break L7;
                          }
                        }
                        var16 = -stackIn_21_0 + c.field_g.length - 1;
                        var17 = c.field_g[var16];
                        L8: while (true) {
                          if (var17 >> 4 == 0) {
                            L9: {
                              var18 = (var16 << 4) + var17;
                              aia.field_t[var18] = var8;
                              c.field_g[var16] = 1 + var17;
                              if (param2.field_K <= 0) {
                                break L9;
                              } else {
                                if (null == param2.field_q) {
                                  break L9;
                                } else {
                                  ow.field_q[param2.field_q[var8]] = ow.field_q[param2.field_q[var8]] + 1;
                                  break L9;
                                }
                              }
                            }
                            pq.field_f = pq.field_f + 1;
                            break L5;
                          } else {
                            var16--;
                            if (var16 >= 0) {
                              var17 = c.field_g[var16];
                              continue L8;
                            } else {
                              System.err.println("Out of range!");
                              break L5;
                            }
                          }
                        }
                      }
                    }
                  }
                }
                var8++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var5 = decompiledCaughtException;
            stackOut_53_0 = (RuntimeException) var5;
            stackOut_53_1 = new StringBuilder().append("ck.A(").append(param0).append(',').append(false).append(',');
            stackIn_56_0 = stackOut_53_0;
            stackIn_56_1 = stackOut_53_1;
            stackIn_54_0 = stackOut_53_0;
            stackIn_54_1 = stackOut_53_1;
            if (param2 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L10;
            } else {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "{...}";
              stackIn_57_0 = stackOut_54_0;
              stackIn_57_1 = stackOut_54_1;
              stackIn_57_2 = stackOut_54_2;
              break L10;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_57_0, stackIn_57_2 + ',' + -8234 + ',' + param4 + ')');
        }
    }

    public static void a() {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            field_b = null;
            field_a = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "ck.C(" + false + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please log in as a subscribing member to access this feature.";
    }
}
