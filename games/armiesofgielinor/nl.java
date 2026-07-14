/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class nl extends kb implements gw {
    static String field_D;
    kb field_E;
    static String field_F;
    static String field_G;
    static String field_C;

    void b(boolean param0) {
        if (null != ((nl) this).field_E) {
            ((nl) this).field_E.e(0);
        }
        if (!param0) {
            Object var3 = null;
            boolean discarded$0 = ((nl) this).a(-121, -73, 76, 99, (kb) null, -116, -36);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, kb param6) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param5 >= 93) {
            break L0;
          } else {
            ((nl) this).a(87, -41, (byte) 121, -47);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((nl) this).field_E) {
              break L2;
            } else {
              if (!((nl) this).field_E.a(false)) {
                break L2;
              } else {
                if (!((nl) this).field_E.a(param0, param1, param2, param3, param4, 96, param6)) {
                  break L2;
                } else {
                  stackOut_5_0 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  break L1;
                }
              }
            }
          }
          stackOut_6_0 = 0;
          stackIn_7_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    void a(int param0, int param1, int param2, kb param3) {
        this.a(param0 + 0, param1, param2, param3);
        if (param0 != 32722) {
            Object var6 = null;
            ((nl) this).a(-74, (kb) null, -57, (byte) -35, 30, 107);
        }
        if (((nl) this).field_E != null) {
            ((nl) this).field_E.a(32722, ((nl) this).field_B + param1, param2 + ((nl) this).field_p, param3);
        }
    }

    void a(int param0, kb param1, int param2, byte param3, int param4, int param5) {
        int var7 = -82 % ((param3 - -58) / 53);
        if (((nl) this).field_E != null) {
            ((nl) this).field_E.a(param0 - -((nl) this).field_p, param1, param2, (byte) 109, param4, ((nl) this).field_B + param5);
        }
    }

    final void f(int param0) {
        if (!(null == ((nl) this).field_E)) {
            ((nl) this).field_E.f(1);
        }
        if (param0 != 1) {
            Object var3 = null;
            nl.a(-28, -106, (iw) null);
        }
    }

    StringBuilder a(int param0, StringBuilder param1, int param2, Hashtable param3) {
        if (!(!((nl) this).a(param3, param0, (byte) 39, param1))) {
            ((nl) this).a(param0, param3, true, param1);
            ((nl) this).a(param3, param0, 106, param1);
        }
        if (param2 != 26477) {
            Object var6 = null;
            nl.a((kl) null, (qb[][]) null, (kl) null, (byte) -118);
        }
        return param1;
    }

    final void a(Hashtable param0, int param1, int param2, StringBuilder param3) {
        int var6 = 0;
        int var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        StringBuilder discarded$0 = param3.append(10);
        int var5 = -96 / ((param2 - 43) / 54);
        for (var6 = 0; var6 <= param1; var6++) {
            StringBuilder discarded$1 = param3.append(32);
        }
        if (null == ((nl) this).field_E) {
            StringBuilder discarded$3 = param3.append("null");
        } else {
            StringBuilder discarded$4 = ((nl) this).field_E.a(param1 - -1, param3, 26477, param0);
        }
    }

    final int g(int param0) {
        if (param0 != -31989) {
            Object var3 = null;
            ((nl) this).a(87, 114, -83, (kb) null);
        }
        return ((nl) this).field_E != null ? ((nl) this).field_E.g(-31989) : 0;
    }

    nl(int param0, int param1, int param2, int param3, kh param4, qo param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    boolean a(int param0, int param1, int param2, int param3, kb param4, int param5, int param6) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param3 > 103) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((nl) this).field_E) {
              break L2;
            } else {
              if (!((nl) this).field_E.a(param0, param1 - -((nl) this).field_B, param2 - -((nl) this).field_p, 125, param4, param5, param6)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(byte[] param0, int param1, int param2, String[] param3, String[][] param4, byte[] param5, String[][] param6, kl param7, wk[][] param8, wk[][] param9, String[] param10, int[] param11, String[] param12, boolean param13, int param14) {
        je var16 = null;
        int var17_int = 0;
        je var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        wk var19_ref_wk = null;
        int var19 = 0;
        Object var20 = null;
        String var20_ref = null;
        int var21 = 0;
        Object var22 = null;
        je var24 = null;
        je var25 = null;
        je stackIn_3_0 = null;
        je stackIn_3_1 = null;
        long stackIn_3_2 = 0L;
        je stackIn_3_3 = null;
        je stackIn_4_0 = null;
        je stackIn_4_1 = null;
        long stackIn_4_2 = 0L;
        je stackIn_4_3 = null;
        je stackIn_5_0 = null;
        je stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        je stackIn_5_3 = null;
        String stackIn_5_4 = null;
        je stackOut_2_0 = null;
        je stackOut_2_1 = null;
        long stackOut_2_2 = 0L;
        je stackOut_2_3 = null;
        je stackOut_4_0 = null;
        je stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        je stackOut_4_3 = null;
        String stackOut_4_4 = null;
        je stackOut_3_0 = null;
        je stackOut_3_1 = null;
        long stackOut_3_2 = 0L;
        je stackOut_3_3 = null;
        String stackOut_3_4 = null;
        L0: {
          var21 = ArmiesOfGielinor.field_M ? 1 : 0;
          tr.field_F = param5;
          lm.field_e = param11;
          ob.field_M = param10;
          ll.field_Mb = param6;
          wb.field_a = param4;
          cj.field_j = param3;
          gt.field_f = param12;
          ei.field_h = param14;
          mi.field_r = param0;
          jn.field_b = param8;
          ju.field_a = param9;
          mt.field_d = param2;
          rs.field_p = fk.a("gameprivacy", (byte) -128, param7, "lobby");
          bp.field_d = fk.a("ratedgame", (byte) -125, param7, "lobby");
          mo.field_g = fk.a("opentome", (byte) -124, param7, "lobby");
          lm.field_h = fk.a("allowspectators", (byte) -125, param7, "lobby");
          ks.field_u = new String[5];
          ks.field_u[1] = pc.field_i;
          ks.field_u[3] = ek.field_f;
          ks.field_u[2] = kd.field_L;
          ks.field_u[0] = ns.field_D;
          ks.field_u[4] = io.field_p;
          nf.field_Kb = new je(0L, (je) null);
          rj.field_F = new je(0L, te.field_p, su.field_b);
          cm.field_a = new je(0L, br.field_e, rh.field_g);
          ne.field_f = new dn(0L, new je(0L, (je) null), cb.field_c, ri.field_b);
          nf.field_Kb.a(rj.field_F, 79);
          if (!fh.field_c) {
            break L0;
          } else {
            nf.field_Kb.a(cm.field_a, 69);
            break L0;
          }
        }
        L1: {
          nf.field_Kb.a((je) (Object) ne.field_f, 59);
          ne.field_f.field_Nb.a(0, eq.field_h);
          ne.field_f.field_Nb.field_Fb = 1;
          var24 = ne.field_f.field_Nb;
          var25 = var24;
          var25.field_Eb = 1;
          t.field_g = new je(0L, eq.field_h);
          t.field_g.field_Eb = 1;
          cp.field_d = new je(0L, kd.field_M, eq.field_e.toUpperCase());
          tg.field_n = new je(0L, be.field_y, nr.field_d.toUpperCase());
          of.field_Lb = new je(0L, sh.field_m);
          r.field_v = new je(0L, te.field_p, tc.field_a);
          ek.field_c = new je(0L, ho.field_a, wb.field_c);
          sr.field_p = new je(0L, ho.field_a, fk.field_g);
          bs.field_a = new je(0L, ho.field_a, fw.field_H);
          ee.field_A = new je(0L, ho.field_a, hs.field_D);
          wl.field_K = new je(0L, br.field_e, rt.field_B);
          bv.field_x = new dn(0L, new je(0L, (je) null), cb.field_c, ri.field_b);
          fj.field_d = new je(0L, nd.field_a, l.field_f.toUpperCase());
          fj.field_d.field_xb = fh.field_c;
          stackOut_2_0 = null;
          stackOut_2_1 = null;
          stackOut_2_2 = 0L;
          stackOut_2_3 = nd.field_a;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          stackIn_4_2 = stackOut_2_2;
          stackIn_4_3 = stackOut_2_3;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          stackIn_3_2 = stackOut_2_2;
          stackIn_3_3 = stackOut_2_3;
          if (!fh.field_c) {
            stackOut_4_0 = null;
            stackOut_4_1 = null;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = (je) (Object) stackIn_4_3;
            stackOut_4_4 = jf.field_G;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            break L1;
          } else {
            stackOut_3_0 = null;
            stackOut_3_1 = null;
            stackOut_3_2 = stackIn_3_2;
            stackOut_3_3 = (je) (Object) stackIn_3_3;
            stackOut_3_4 = cq.field_C;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_5_2 = stackOut_3_2;
            stackIn_5_3 = stackOut_3_3;
            stackIn_5_4 = stackOut_3_4;
            break L1;
          }
        }
        L2: {
          new je(stackIn_5_2, (je) (Object) stackIn_5_3, ((String) (Object) stackIn_5_4).toUpperCase());
          pe.field_x = (je) (Object) stackIn_5_0;
          ov.field_i = new je(0L, (je) null);
          ov.field_i.a(tg.field_n, 92);
          ov.field_i.a(of.field_Lb, 47);
          of.field_Lb.a(r.field_v, 38);
          of.field_Lb.a(ek.field_c, 114);
          of.field_Lb.a(sr.field_p, 121);
          if (!fh.field_c) {
            break L2;
          } else {
            of.field_Lb.a(bs.field_a, 114);
            break L2;
          }
        }
        L3: {
          of.field_Lb.a(ee.field_A, 78);
          of.field_Lb.a(wl.field_K, 99);
          of.field_Lb.a((je) (Object) bv.field_x, 70);
          if (!fh.field_c) {
            break L3;
          } else {
            ov.field_i.a(fj.field_d, 127);
            break L3;
          }
        }
        L4: {
          ov.field_i.a(pe.field_x, 93);
          vu.field_Q = new je(0L, eq.field_h);
          vu.field_Q.field_Eb = 1;
          vu.field_Q.field_Fb = 0;
          td.field_g = new je(0L, bw.field_h, ul.field_f.toUpperCase());
          qc.field_c = new je(0L, jm.field_b);
          qc.field_c.a(vu.field_Q, 116);
          qc.field_c.a(td.field_g, 89);
          uj.field_l = new je(0L, cb.field_c);
          uj.field_l.a(0, eq.field_h);
          uj.field_l.field_Fb = 1;
          var16 = uj.field_l;
          var16.field_Eb = 1;
          eb.field_c = new je(0L, (je) null);
          gg.field_E = new je(0L, eq.field_h);
          gg.field_E.field_Eb = 1;
          di.field_l = new je(0L, te.field_p, su.field_b);
          pj.field_D = new je(0L, br.field_e, rh.field_g);
          bu.field_a = new dn(0L, new je(0L, (je) null), cb.field_c, ri.field_b);
          eb.field_c.a(gg.field_E, 72);
          eb.field_c.a(di.field_l, 83);
          if (fh.field_c) {
            eb.field_c.a(pj.field_D, 107);
            break L4;
          } else {
            break L4;
          }
        }
        eb.field_c.a((je) (Object) bu.field_a, 109);
        mp.field_Lb = new je(0L, kd.field_M, pl.field_v.toUpperCase());
        kd.field_F = new je(0L, be.field_y);
        vc.field_l = new je(0L, sh.field_m);
        iu.field_d = new je(0L, rn.field_a, tb.field_d.toUpperCase());
        rl.field_z = new je[param1 - -4];
        pu.field_k = new nf[4 + param1][];
        rl.field_z[0] = new je(0L, fp.field_Lb, et.field_c);
        pu.field_k[0] = new nf[6];
        var17_int = 0;
        L5: while (true) {
          L6: {
            if (var17_int >= 5) {
              break L6;
            } else {
              pu.field_k[0][var17_int + 1] = new nf(0L, eb.field_a, (je) null, ms.field_k, rs.field_p[var17_int], ks.field_u[var17_int]);
              var17_int++;
              if (0 == 0) {
                continue L5;
              } else {
                break L6;
              }
            }
          }
          L7: {
            if ((lm.field_e.length ^ -1) <= -3) {
              rl.field_z[1] = new je(0L, fp.field_Lb, ep.field_h);
              pu.field_k[1] = new nf[1 + lm.field_e.length];
              pu.field_k[1][0] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a);
              var17_int = 0;
              L8: while (true) {
                if (lm.field_e.length <= var17_int) {
                  break L7;
                } else {
                  pu.field_k[1][var17_int - -1] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, Integer.toString(lm.field_e[var17_int]));
                  var17_int++;
                  if (0 == 0) {
                    continue L8;
                  } else {
                    break L7;
                  }
                }
              }
            } else {
              break L7;
            }
          }
          L9: {
            rl.field_z[2] = new je(0L, fp.field_Lb, oj.field_p);
            pu.field_k[2] = new nf[3];
            if (ei.field_h > 1) {
              rl.field_z[3] = new je(0L, fp.field_Lb, wp.field_u);
              pu.field_k[3] = new nf[1 + ei.field_h];
              pu.field_k[3][0] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a);
              var17_int = 0;
              L10: while (true) {
                if (var17_int >= ei.field_h) {
                  break L9;
                } else {
                  pu.field_k[3][1 + var17_int] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, gt.field_f[var17_int]);
                  var17_int++;
                  if (0 == 0) {
                    continue L10;
                  } else {
                    break L9;
                  }
                }
              }
            } else {
              break L9;
            }
          }
          var17_int = 0;
          L11: while (true) {
            L12: {
              if (param1 <= var17_int) {
                break L12;
              } else {
                rl.field_z[var17_int + 4] = new je(0L, fp.field_Lb, ob.field_M[var17_int]);
                pu.field_k[var17_int + 4] = new nf[rn.a(255, (int) mi.field_r[var17_int]) + 1];
                pu.field_k[var17_int + 4][0] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) null, ki.field_a);
                var18 = 0;
                L13: while (true) {
                  L14: {
                    if (var18 >= (mi.field_r[var17_int] & 255)) {
                      break L14;
                    } else {
                      L15: {
                        if (jn.field_b == null) {
                          var19_ref = null;
                          break L15;
                        } else {
                          if (jn.field_b[var17_int] != null) {
                            var19_ref_wk = jn.field_b[var17_int][var18];
                            break L15;
                          } else {
                            var19_ref_wk = null;
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (ll.field_Mb != null) {
                          if (ll.field_Mb[var17_int] != null) {
                            var20_ref = ll.field_Mb[var17_int][var18];
                            break L16;
                          } else {
                            var20_ref = null;
                            break L16;
                          }
                        } else {
                          var20_ref = null;
                          break L16;
                        }
                      }
                      pu.field_k[var17_int + 4][1 + var18] = new nf(0L, eb.field_a, (je) null, ms.field_k, (wk) var19_ref, var20_ref);
                      var18++;
                      if (0 == 0) {
                        continue L13;
                      } else {
                        break L14;
                      }
                    }
                  }
                  var17_int++;
                  if (0 == 0) {
                    continue L11;
                  } else {
                    break L12;
                  }
                }
              }
            }
            var17_int = 0;
            L17: while (true) {
              L18: {
                if (param1 - -4 <= var17_int) {
                  break L18;
                } else {
                  L19: {
                    if (null == rl.field_z[var17_int]) {
                      break L19;
                    } else {
                      rl.field_z[var17_int].field_pb = 11;
                      break L19;
                    }
                  }
                  L20: {
                    if (pu.field_k[var17_int] != null) {
                      var18 = 0;
                      L21: while (true) {
                        if (pu.field_k[var17_int].length <= var18) {
                          break L20;
                        } else {
                          L22: {
                            if (pu.field_k[var17_int][var18] == null) {
                              break L22;
                            } else {
                              if (null == pu.field_k[var17_int][var18].field_Ob) {
                                break L22;
                              } else {
                                pu.field_k[var17_int][var18].field_Ob.field_pb = 11;
                                break L22;
                              }
                            }
                          }
                          var18++;
                          if (0 == 0) {
                            continue L21;
                          } else {
                            break L20;
                          }
                        }
                      }
                    } else {
                      break L20;
                    }
                  }
                  var17_int++;
                  if (0 == 0) {
                    continue L17;
                  } else {
                    break L18;
                  }
                }
              }
              L23: {
                lm.field_b = new je(0L, nd.field_a);
                so.field_d = new je(0L, nd.field_a);
                pi.field_N = new je(0L, ke.field_e);
                pi.field_N.a(0, eq.field_h);
                var17 = pi.field_N;
                pi.field_N.field_Fb = 1;
                if (!param13) {
                  break L23;
                } else {
                  var22 = null;
                  nl.a(-73, 39, (iw) null);
                  break L23;
                }
              }
              var17.field_Eb = 1;
              pd.field_c = new je(0L, (je) null);
              pd.field_c.a(kd.field_F, 44);
              pd.field_c.a(vc.field_l, 68);
              vc.field_l.a(iu.field_d, 106);
              var18 = 0;
              L24: while (true) {
                L25: {
                  if (var18 >= param1 - -4) {
                    break L25;
                  } else {
                    L26: {
                      L27: {
                        if (var18 != 1) {
                          break L27;
                        } else {
                          if (2 > lm.field_e.length) {
                            break L26;
                          } else {
                            break L27;
                          }
                        }
                      }
                      L28: {
                        if (var18 != 3) {
                          break L28;
                        } else {
                          if (ei.field_h <= 1) {
                            break L26;
                          } else {
                            break L28;
                          }
                        }
                      }
                      vc.field_l.a(rl.field_z[var18], 86);
                      var19 = 0;
                      L29: while (true) {
                        if (var19 >= pu.field_k[var18].length) {
                          break L26;
                        } else {
                          L30: {
                            if (pu.field_k[var18][var19] != null) {
                              vc.field_l.a((je) (Object) pu.field_k[var18][var19], 48);
                              break L30;
                            } else {
                              break L30;
                            }
                          }
                          var19++;
                          if (0 == 0) {
                            continue L29;
                          } else {
                            break L26;
                          }
                        }
                      }
                    }
                    var18++;
                    if (0 == 0) {
                      continue L24;
                    } else {
                      break L25;
                    }
                  }
                }
                pd.field_c.a(lm.field_b, 77);
                pd.field_c.a(so.field_d, 69);
                pd.field_c.a(pi.field_N, 91);
                bk.field_f = new je(0L, hr.field_m, em.field_d.toUpperCase());
                dv.field_m = new je(0L, bw.field_h, dr.field_D.toUpperCase());
                return;
              }
            }
          }
        }
    }

    kb a(int param0) {
        kb var2 = ((nl) this).field_E;
        if (var2 != null) {
            if (!(!var2.a(false))) {
                return var2;
            }
        }
        if (param0 == -1848) {
            return null;
        }
        Object var3 = null;
        boolean discarded$0 = ((nl) this).a(-40, -59, -4, 58, 32, -127, (kb) null);
        return null;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (-1 == (param3 ^ -1)) {
            if (!(((nl) this).field_k == null)) {
                ((nl) this).field_k.a((kb) this, param0, -94, true, param1);
            }
        }
        if (param2 > -82) {
            return;
        }
        if (((nl) this).field_E != null) {
            ((nl) this).field_E.a(((nl) this).field_B + param0, ((nl) this).field_p + param1, (byte) -118, param3);
        }
    }

    final boolean a(boolean param0) {
        if (param0) {
            field_D = null;
        }
        return ((nl) this).a(-1848) != null ? true : false;
    }

    String h(int param0) {
        String var3 = null;
        if (param0 != 21384) {
            return null;
        }
        String var2 = this.h(param0 + 0);
        if (((nl) this).field_E != null) {
            var3 = ((nl) this).field_E.h(21384);
            if (var3 != null) {
                return var3;
            }
        }
        return var2;
    }

    public static void i(int param0) {
        field_C = null;
        if (param0 > -81) {
            field_F = null;
        }
        field_D = null;
        field_G = null;
        field_F = null;
    }

    private final boolean b(int param0, kb param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param0 == 4) {
          L0: {
            L1: {
              if (null == ((nl) this).field_E) {
                break L1;
              } else {
                if (((nl) this).field_E.a(false)) {
                  break L1;
                } else {
                  if (!((nl) this).field_E.a(11, param1)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return true;
        }
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        if (param3 != -12215) {
            Object var6 = null;
            nl.a((byte[]) null, 101, 110, (String[]) null, (String[][]) null, (byte[]) null, (String[][]) null, (kl) null, (wk[][]) null, (wk[][]) null, (String[]) null, (int[]) null, (String[]) null, true, 39);
        }
        if (((nl) this).field_E != null) {
            if (((nl) this).field_E.a(false)) {
                if (((nl) this).field_E.a(param0, param1, param2, -12215)) {
                    return true;
                }
            }
        }
        int var5 = param1;
        if (80 != var5) {
            return false;
        }
        return br.field_f[81] ? this.b(4, param0) : this.a(param0, (byte) 107);
    }

    final static void a(int param0, int param1, iw param2) {
        if (param0 != 0) {
            Object var4 = null;
            nl.a(30, -59, (iw) null);
        }
        cg.field_c.a((byte) -119, (tc) (Object) param2);
        ot.a((byte) 112, param1, param2);
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        this.a(param0, param1, param2, param3, param4);
        ((nl) this).b(true);
    }

    final static void a(kl param0, qb[][] param1, kl param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        qb var8 = null;
        int[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        fd var14 = null;
        int var15 = 0;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] var19 = null;
        var15 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param1 != null) {
          var4 = param1.length;
          var5 = 0;
          L0: while (true) {
            if (var4 <= var5) {
              L1: {
                if (param3 >= 124) {
                  break L1;
                } else {
                  field_D = null;
                  break L1;
                }
              }
              return;
            } else {
              if (param1[var5] != null) {
                var6 = param1[var5].length;
                var7 = 0;
                L2: while (true) {
                  if (var6 > var7) {
                    var8 = param1[var5][var7];
                    if (var8 != null) {
                      var19 = var8.field_a;
                      var18 = var19;
                      var17 = var18;
                      var16 = var17;
                      var9 = var16;
                      if (var9 != null) {
                        var10 = var19.length;
                        var11 = 0;
                        L3: while (true) {
                          if (var11 < var10) {
                            var12 = var19[var11] >> 103014960;
                            if (!ge.a(0, var12)) {
                              L4: {
                                var14 = new fd(param2, param0, var12);
                                if (null == bk.field_e) {
                                  bk.field_e = new at();
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              bk.field_e.a((byte) -119, (tc) (Object) var14);
                              var11++;
                              continue L3;
                            } else {
                              var11++;
                              continue L3;
                            }
                          } else {
                            var7++;
                            continue L2;
                          }
                        }
                      } else {
                        var7++;
                        continue L2;
                      }
                    } else {
                      var7++;
                      continue L2;
                    }
                  } else {
                    var5++;
                    continue L0;
                  }
                }
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    final boolean a(int param0, kb param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 11) {
            break L0;
          } else {
            field_C = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == ((nl) this).field_E) {
              break L2;
            } else {
              if (!((nl) this).field_E.a(param0 + 0, param1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final boolean a(kb param0, byte param1) {
        int stackIn_7_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_6_0 = 0;
        if (param1 == 107) {
          L0: {
            L1: {
              if (null == ((nl) this).field_E) {
                break L1;
              } else {
                if (((nl) this).field_E.a(false)) {
                  break L1;
                } else {
                  if (!((nl) this).field_E.a(11, param0)) {
                    break L1;
                  } else {
                    stackOut_5_0 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    break L0;
                  }
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
          return stackIn_7_0 != 0;
        } else {
          return false;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Battle";
        field_D = "Fire";
        field_F = "Hotseat Game";
        field_C = "Location";
    }
}
