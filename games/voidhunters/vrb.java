/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vrb extends rqa {
    vrb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean a(int param0) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 < -89) {
          L0: {
            L1: {
              if (fda.e((byte) 120)) {
                break L1;
              } else {
                if (hcb.field_o > 0) {
                  stackOut_6_0 = 0;
                  stackIn_7_0 = stackOut_6_0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            stackOut_5_0 = 1;
            stackIn_7_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -119) {
                break L1;
              } else {
                boolean discarded$2 = vrb.a(106);
                break L1;
              }
            }
            si.a(215, 62, param0[0].a(123));
            stackOut_2_0 = new nc((Object) (Object) "void");
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("vrb.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(byte[] param0, int param1, int param2, asb param3, String[] param4, String[][] param5, phb[][] param6, int param7, phb[][] param8, String[][] param9, String[] param10, byte[] param11, int param12, String[] param13, int[] param14) {
        llb var16 = null;
        int var17_int = 0;
        llb var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        llb var23 = null;
        llb var24 = null;
        llb stackIn_4_0 = null;
        llb stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        llb stackIn_4_3 = null;
        llb stackIn_5_0 = null;
        llb stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        llb stackIn_5_3 = null;
        llb stackIn_6_0 = null;
        llb stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        llb stackIn_6_3 = null;
        String stackIn_6_4 = null;
        llb stackOut_3_0 = null;
        llb stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        llb stackOut_3_3 = null;
        llb stackOut_5_0 = null;
        llb stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        llb stackOut_5_3 = null;
        String stackOut_5_4 = null;
        llb stackOut_4_0 = null;
        llb stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        llb stackOut_4_3 = null;
        String stackOut_4_4 = null;
        L0: {
          var21 = VoidHunters.field_G;
          wja.field_c = param4;
          sha.field_w = 8;
          nkb.field_r = 1;
          hqb.field_k = param9;
          ieb.field_o = param14;
          hva.field_c = param10;
          ea.field_k = param13;
          awa.field_o = param5;
          gm.field_M = param0;
          mg.field_o = param6;
          vva.field_u = param11;
          hwa.field_p = param8;
          sqb.field_o = wjb.a(param3, true, "lobby", "gameprivacy");
          hnb.field_U = wjb.a(param3, true, "lobby", "ratedgame");
          atb.field_b = wjb.a(param3, true, "lobby", "opentome");
          lcb.field_t = wjb.a(param3, true, "lobby", "allowspectators");
          uka.field_p = new String[5];
          uka.field_p[2] = tja.field_b;
          uka.field_p[3] = gkb.field_q;
          uka.field_p[1] = uh.field_o;
          uka.field_p[0] = uob.field_f;
          uka.field_p[4] = ikb.field_o;
          fh.field_f = new llb(0L, (llb) null);
          me.field_q = new llb(0L, sdb.field_p, kpb.field_r);
          epa.field_o = new llb(0L, qsa.field_d, k.field_p);
          tja.field_a = new soa(0L, new llb(0L, (llb) null), htb.field_w, cab.field_o);
          fh.field_f.b(-561, me.field_q);
          if (ll.field_o) {
            fh.field_f.b(-561, epa.field_o);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          fh.field_f.b(-561, (llb) (Object) tja.field_a);
          tja.field_a.field_xb.a(18445, qc.field_q);
          var23 = tja.field_a.field_xb;
          var24 = var23;
          tja.field_a.field_xb.field_B = 1;
          var24.field_F = 1;
          nna.field_v = new llb(0L, qc.field_q);
          nna.field_v.field_F = 1;
          gmb.field_c = new llb(0L, vj.field_q, bw.field_a.toUpperCase());
          qpb.field_w = new llb(0L, pa.field_a, cta.field_o.toUpperCase());
          sra.field_a = new llb(0L, as.field_c);
          fwa.field_a = new llb(0L, sdb.field_p, bo.field_o);
          wrb.field_q = new llb(0L, ki.field_p, lw.field_e);
          gs.field_b = new llb(0L, ki.field_p, sc.field_b);
          mqb.field_C = new llb(0L, ki.field_p, qdb.field_e);
          jna.field_o = new llb(0L, ki.field_p, gq.field_o);
          uga.field_h = new llb(0L, qsa.field_d, tea.field_c);
          rgb.field_f = new soa(0L, new llb(0L, (llb) null), htb.field_w, cab.field_o);
          gha.field_p = new llb(0L, qcb.field_p, ev.field_b.toUpperCase());
          gha.field_p.field_y = ll.field_o;
          stackOut_3_0 = null;
          stackOut_3_1 = null;
          stackOut_3_2 = 0L;
          stackOut_3_3 = qcb.field_p;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          stackIn_5_2 = stackOut_3_2;
          stackIn_5_3 = stackOut_3_3;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          if (ll.field_o) {
            stackOut_5_0 = null;
            stackOut_5_1 = null;
            stackOut_5_2 = stackIn_5_2;
            stackOut_5_3 = (llb) (Object) stackIn_5_3;
            stackOut_5_4 = uab.field_a;
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
            stackOut_4_3 = (llb) (Object) stackIn_4_3;
            stackOut_4_4 = ueb.field_o;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            break L1;
          }
        }
        L2: {
          oib.field_a = new llb(stackIn_6_2, stackIn_6_3, ((String) (Object) stackIn_6_4).toUpperCase());
          bqa.field_d = new llb(0L, (llb) null);
          bqa.field_d.b(-561, qpb.field_w);
          bqa.field_d.b(-561, sra.field_a);
          sra.field_a.b(-561, fwa.field_a);
          sra.field_a.b(-561, wrb.field_q);
          sra.field_a.b(-561, gs.field_b);
          if (!ll.field_o) {
            break L2;
          } else {
            sra.field_a.b(-561, mqb.field_C);
            break L2;
          }
        }
        L3: {
          sra.field_a.b(-561, jna.field_o);
          sra.field_a.b(-561, uga.field_h);
          sra.field_a.b(-561, (llb) (Object) rgb.field_f);
          if (ll.field_o) {
            bqa.field_d.b(-561, gha.field_p);
            break L3;
          } else {
            break L3;
          }
        }
        bqa.field_d.b(-561, oib.field_a);
        nbb.field_y = new llb(0L, qc.field_q);
        nbb.field_y.field_F = 1;
        nbb.field_y.field_B = 0;
        ss.field_o = new llb(0L, hnb.field_X, tia.field_K.toUpperCase());
        dd.field_o = new llb(0L, fh.field_g);
        dd.field_o.b(-561, nbb.field_y);
        dd.field_o.b(-561, ss.field_o);
        wo.field_p = new llb(0L, htb.field_w);
        wo.field_p.a(18445, qc.field_q);
        var16 = wo.field_p;
        wo.field_p.field_B = 1;
        L4: {
          var16.field_F = 1;
          rsa.field_o = new llb(0L, (llb) null);
          ukb.field_o = new llb(0L, qc.field_q);
          ukb.field_o.field_F = 1;
          jn.field_a = new llb(0L, sdb.field_p, kpb.field_r);
          vqb.field_o = new llb(0L, qsa.field_d, k.field_p);
          rga.field_f = new soa(0L, new llb(0L, (llb) null), htb.field_w, cab.field_o);
          rsa.field_o.b(-561, ukb.field_o);
          rsa.field_o.b(-561, jn.field_a);
          if (ll.field_o) {
            rsa.field_o.b(-561, vqb.field_o);
            break L4;
          } else {
            break L4;
          }
        }
        rsa.field_o.b(-561, (llb) (Object) rga.field_f);
        nt.field_q = new llb(0L, vj.field_q, tua.field_b.toUpperCase());
        rob.field_q = new llb(0L, pa.field_a);
        gt.field_o = new llb(0L, as.field_c);
        aqb.field_e = new llb(0L, bv.field_b, mr.field_J.toUpperCase());
        ceb.field_o = new llb[5];
        inb.field_q = new cna[5][];
        ceb.field_o[0] = new llb(0L, gjb.field_p, tm.field_p);
        inb.field_q[0] = new cna[6];
        var17_int = 0;
        L5: while (true) {
          if (var17_int >= 5) {
            L6: {
              if (ieb.field_o.length >= 2) {
                ceb.field_o[1] = new llb(0L, gjb.field_p, uda.field_a);
                inb.field_q[1] = new cna[1 + ieb.field_o.length];
                inb.field_q[1][0] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k);
                var17_int = 0;
                L7: while (true) {
                  if (var17_int >= ieb.field_o.length) {
                    break L6;
                  } else {
                    inb.field_q[1][var17_int + 1] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, Integer.toString(ieb.field_o[var17_int]));
                    var17_int++;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
            L8: {
              ceb.field_o[2] = new llb(0L, gjb.field_p, kra.field_b);
              inb.field_q[2] = new cna[3];
              if (nkb.field_r > 1) {
                ceb.field_o[3] = new llb(0L, gjb.field_p, ijb.field_o);
                inb.field_q[3] = new cna[1 + nkb.field_r];
                inb.field_q[3][0] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k);
                var17_int = 0;
                L9: while (true) {
                  if (var17_int >= nkb.field_r) {
                    break L8;
                  } else {
                    inb.field_q[3][var17_int + 1] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, wja.field_c[var17_int]);
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
              if (1 <= var17_int) {
                var17_int = 0;
                L11: while (true) {
                  if (var17_int >= 5) {
                    vw.field_a = new llb(0L, qcb.field_p);
                    qsa.field_b = new llb(0L, qcb.field_p);
                    qi.field_p = new llb(0L, mla.field_q);
                    qi.field_p.a(18445, qc.field_q);
                    qi.field_p.field_B = 1;
                    var17 = qi.field_p;
                    var17.field_F = 1;
                    vva.field_r = new llb(0L, (llb) null);
                    vva.field_r.b(-561, rob.field_q);
                    vva.field_r.b(-561, gt.field_o);
                    gt.field_o.b(-561, aqb.field_e);
                    var18 = 0;
                    L12: while (true) {
                      if (5 <= var18) {
                        vva.field_r.b(-561, vw.field_a);
                        vva.field_r.b(-561, qsa.field_b);
                        vva.field_r.b(-561, qi.field_p);
                        sfa.field_d = new llb(0L, lo.field_b, ko.field_d.toUpperCase());
                        rlb.field_a = new llb(0L, hnb.field_X, vsa.field_s.toUpperCase());
                        return;
                      } else {
                        L13: {
                          L14: {
                            if (var18 != 1) {
                              break L14;
                            } else {
                              if (ieb.field_o.length < 2) {
                                break L13;
                              } else {
                                break L14;
                              }
                            }
                          }
                          L15: {
                            if (var18 != 3) {
                              break L15;
                            } else {
                              if (nkb.field_r > 1) {
                                break L15;
                              } else {
                                break L13;
                              }
                            }
                          }
                          gt.field_o.b(-561, ceb.field_o[var18]);
                          var19 = 0;
                          L16: while (true) {
                            if (var19 >= inb.field_q[var18].length) {
                              break L13;
                            } else {
                              L17: {
                                if (null != inb.field_q[var18][var19]) {
                                  gt.field_o.b(-561, (llb) (Object) inb.field_q[var18][var19]);
                                  break L17;
                                } else {
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
                    L18: {
                      if (ceb.field_o[var17_int] == null) {
                        break L18;
                      } else {
                        ceb.field_o[var17_int].field_D = 11;
                        break L18;
                      }
                    }
                    L19: {
                      if (inb.field_q[var17_int] != null) {
                        var18 = 0;
                        L20: while (true) {
                          if (var18 >= inb.field_q[var17_int].length) {
                            break L19;
                          } else {
                            L21: {
                              if (inb.field_q[var17_int][var18] == null) {
                                break L21;
                              } else {
                                break L21;
                              }
                            }
                            var18++;
                            continue L20;
                          }
                        }
                      } else {
                        break L19;
                      }
                    }
                    var17_int++;
                    continue L11;
                  }
                }
              } else {
                ceb.field_o[var17_int + 4] = new llb(0L, gjb.field_p, hva.field_c[var17_int]);
                inb.field_q[var17_int + 4] = new cna[dla.a(255, (int) gm.field_M[var17_int]) + 1];
                inb.field_q[var17_int + 4][0] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) null, mpb.field_k);
                var18 = 0;
                L22: while (true) {
                  if (var18 >= (gm.field_M[var17_int] & 255)) {
                    var17_int++;
                    continue L10;
                  } else {
                    L23: {
                      if (mg.field_o == null) {
                        var19_ref = null;
                        break L23;
                      } else {
                        if (null == mg.field_o[var17_int]) {
                          var19_ref = null;
                          break L23;
                        } else {
                          var19_ref = (Object) (Object) mg.field_o[var17_int][var18];
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (null == hqb.field_k) {
                        var20 = null;
                        break L24;
                      } else {
                        if (null == hqb.field_k[var17_int]) {
                          var20 = null;
                          break L24;
                        } else {
                          var20 = (Object) (Object) hqb.field_k[var17_int][var18];
                          break L24;
                        }
                      }
                    }
                    inb.field_q[4 + var17_int][1 + var18] = new cna(0L, tia.field_M, (llb) null, iga.field_o, (phb) var19_ref, (String) var20);
                    var18++;
                    continue L22;
                  }
                }
              }
            }
          } else {
            inb.field_q[0][1 + var17_int] = new cna(0L, tia.field_M, (llb) null, iga.field_o, sqb.field_o[var17_int], uka.field_p[var17_int]);
            var17_int++;
            continue L5;
          }
        }
    }

    static {
    }
}
