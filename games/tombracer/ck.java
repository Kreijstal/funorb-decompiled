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
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param6 > 65) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ck.a(-121, (String[][]) null, -66, (iu[][]) null, (String[]) null, (String[]) null, (byte[]) null, (String[]) null, (String[][]) null, -31, (cn) null, 29, (byte[]) null, (iu[][]) null, (int[]) null);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((-(param8 / 2) + param0 ^ -1) > (-(param3 / 2) + param2 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = param0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (stackIn_6_0 - -((param8 - -1) / 2) > (param3 - -1) / 2 + param2) {
                            statePc = 16;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        stackOut_9_0 = param4;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if ((-(stackIn_10_0 / 2) + param7 ^ -1) < (-(param1 / 2) + param5 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param5 - -((param1 + 1) / 2) <= (param4 + 1) / 2 + param7) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    return stackIn_19_0 != 0;
                }
                case 20: {
                    var9 = (RuntimeException) (Object) caughtException;
                    throw tba.a((Throwable) (Object) var9, "ck.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, String[][] param1, int param2, iu[][] param3, String[] param4, String[] param5, byte[] param6, String[] param7, String[][] param8, int param9, cn param10, int param11, byte[] param12, iu[][] param13, int[] param14) {
        jea var15 = null;
        jea var16 = null;
        int var17_int = 0;
        jea var17 = null;
        int var18 = 0;
        iu var19_ref = null;
        int var19 = 0;
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
          new jea(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
          pq.field_c = stackIn_6_0;
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
                  if ((var17_int ^ -1) <= (sg.field_u.length ^ -1)) {
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
              if ((ws.field_r ^ -1) < -2) {
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
                    if ((var17_int ^ -1) <= (param0 - -4 ^ -1)) {
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
                              if ((var18 ^ -1) != -2) {
                                break L14;
                              } else {
                                if (-3 >= (sg.field_u.length ^ -1)) {
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
                                if ((ws.field_r ^ -1) < -2) {
                                  break L15;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            dba.field_g.b(-123, rb.field_p[var18]);
                            var19 = 0;
                            L16: while (true) {
                              if ((var19 ^ -1) <= (bf.field_b[var18].length ^ -1)) {
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
                            if ((bf.field_b[var17_int].length ^ -1) >= (var18 ^ -1)) {
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
                      var19_ref = stackIn_37_0;
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
                    bf.field_b[var17_int + 4][var18 + 1] = new tv(0L, qja.field_j, (jea) null, dja.field_p, var19_ref, var20);
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
        an stackIn_4_0 = null;
        int stackIn_26_0 = 0;
        Object stackIn_38_0 = null;
        int stackIn_47_0 = 0;
        Object stackIn_49_0 = null;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_70_2 = null;
        an stackOut_3_0 = null;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        Object stackOut_37_0 = null;
        int stackOut_46_0 = 0;
        Object stackOut_48_0 = null;
        RuntimeException stackOut_66_0 = null;
        StringBuilder stackOut_66_1 = null;
        RuntimeException stackOut_67_0 = null;
        StringBuilder stackOut_67_1 = null;
        String stackOut_67_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = TombRacer.field_G ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5_int = bia.a((byte) 93, 3 * (param4 - param0));
                        var6 = 3 * param0;
                        var7 = -10 + var5_int;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        td.b((byte) -62);
                        if (-1 <= (param2.field_K ^ -1)) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        stackOut_3_0 = (an) param2;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (stackIn_4_0.field_q == null) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ssa.b(0);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        pq.field_f = 0;
                        var8 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (var8 >= param2.field_u) {
                            statePc = 46;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var9 = param2.field_B[var8];
                        var10 = param2.field_w[var8];
                        var11 = param2.field_f[var8];
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param1) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var12 = ds.field_f[var9];
                        var13 = mg.field_e[var9];
                        var14 = ds.field_f[var10] - var12;
                        var15 = ds.field_f[var11] + -var12;
                        var16 = mg.field_e[var10] + -var13;
                        var17 = mg.field_e[var11] + -var13;
                        if ((var17 * var14 + -(var15 * var16) ^ -1) <= -1) {
                            statePc = 45;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var12 = wp.field_c[var9];
                        if (var12 == -2147483648) {
                            statePc = 45;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        var13 = wp.field_c[var10];
                        if (var13 == -2147483648) {
                            statePc = 45;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var14 = wp.field_c[var11];
                        if (2147483647 == (var14 ^ -1)) {
                            statePc = 45;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        var15 = var14 + (var13 + var12 - var6);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (var7 >= 0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = var15 << -var7;
                        stackIn_26_0 = stackOut_23_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = var15 >> var7;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var16 = -stackIn_26_0 + c.field_g.length - 1;
                        var17 = c.field_g[var16];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if ((var17 >> -83829564 ^ -1) == -1) {
                            statePc = 35;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var16--;
                        if (-1 >= (var16 ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 30;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        System.err.println("Out of range!");
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var17 = c.field_g[var16];
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        var18 = (var16 << 1807987876) + var17;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        aia.field_t[var18] = var8;
                        c.field_g[var16] = 1 + var17;
                        if (-1 <= (param2.field_K ^ -1)) {
                            statePc = 44;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackOut_37_0 = null;
                        stackIn_38_0 = stackOut_37_0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 40;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        if (stackIn_38_0 == (Object) (Object) param2.field_q) {
                            statePc = 44;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        statePc = 41;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        ow.field_q[param2.field_q[var8]] = ow.field_q[param2.field_q[var8]] + 1;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        pq.field_f = pq.field_f + 1;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var8++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        stackOut_46_0 = -1;
                        stackIn_47_0 = stackOut_46_0;
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        if (stackIn_47_0 <= (param2.field_K ^ -1)) {
                            statePc = 60;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = null;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 != (Object) (Object) param2.field_q) {
                            statePc = 54;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var8 = 0;
                        var9 = 0;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if (var9 >= ow.field_q.length) {
                            statePc = 60;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var10 = ow.field_q[var9];
                        ow.field_q[var9] = var8;
                        var8 = var8 + var10;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        var9++;
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (param3 == -8234) {
                            statePc = 71;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        boolean discarded$1 = ck.a(-21, -102, 54, 120, -98, -42, (byte) -6, -39, 90);
                        statePc = 62;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 63;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    var5 = (RuntimeException) (Object) caughtException;
                    statePc = 66;
                    continue stateLoop;
                }
                case 66: {
                    try {
                        stackOut_66_0 = (RuntimeException) var5;
                        stackOut_66_1 = new StringBuilder().append("ck.A(").append(param0).append(44).append(param1).append(44);
                        stackIn_69_0 = stackOut_66_0;
                        stackIn_69_1 = stackOut_66_1;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        if (param2 == null) {
                            statePc = 69;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        stackOut_67_0 = (RuntimeException) (Object) stackIn_67_0;
                        stackOut_67_1 = (StringBuilder) (Object) stackIn_67_1;
                        stackOut_67_2 = "{...}";
                        stackIn_70_0 = stackOut_67_0;
                        stackIn_70_1 = stackOut_67_1;
                        stackIn_70_2 = stackOut_67_2;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 68;
                        continue stateLoop;
                    }
                }
                case 68: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 69: {
                    stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
                    stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
                    stackOut_69_2 = "null";
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    stackIn_70_2 = stackOut_69_2;
                    statePc = 70;
                    continue stateLoop;
                }
                case 70: {
                    throw tba.a((Throwable) (Object) stackIn_70_0, stackIn_70_2 + 44 + param3 + 44 + param4 + 41);
                }
                case 71: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              field_b = null;
              field_a = null;
              if (!param0) {
                break L0;
              } else {
                field_c = null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Please log in as a subscribing member to access this feature.";
    }
}
