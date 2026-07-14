/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class tm extends l {
    static String field_i;
    static String field_j;
    int field_m;
    static String field_k;
    static int[] field_o;
    static int field_n;
    int[] field_p;
    static int field_g;
    static je field_l;
    static int[] field_h;

    public static void a(int param0) {
        field_j = null;
        field_i = null;
        field_l = null;
        field_o = null;
        if (param0 > -48) {
            return;
        }
        field_h = null;
        field_k = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, mg[] param5) {
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        Object var23 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var22 = Virogrid.field_F ? 1 : 0;
        if (param5 != null) {
          if (param3 > 0) {
            if ((param4 ^ -1) < -1) {
              L0: {
                if (param5[3] == null) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  stackOut_7_0 = param5[3].field_u;
                  stackIn_9_0 = stackOut_7_0;
                  break L0;
                }
              }
              L1: {
                var6 = stackIn_9_0;
                if (null == param5[5]) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_10_0 = param5[5].field_u;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_12_0;
                if (null == param5[1]) {
                  stackOut_14_0 = 0;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  stackOut_13_0 = param5[1].field_z;
                  stackIn_15_0 = stackOut_13_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_15_0;
                if (param5[7] != null) {
                  stackOut_17_0 = param5[7].field_z;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_16_0 = 0;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_18_0;
                var10 = param0 - -param3;
                var11 = param1 + param4;
                var12 = var6 + param0;
                var13 = var10 - var7;
                var14 = var8 + param1;
                var15 = var11 + -var9;
                var16 = var12;
                var17 = var13;
                if (var17 >= var16) {
                  break L4;
                } else {
                  var17 = param3 * var6 / (var6 - -var7) + param0;
                  var16 = param3 * var6 / (var6 - -var7) + param0;
                  break L4;
                }
              }
              L5: {
                var18 = var14;
                var19 = var15;
                df.b(nf.field_f);
                if (var19 >= var18) {
                  break L5;
                } else {
                  var19 = param1 + var8 * param4 / (var9 + var8);
                  var18 = param1 + var8 * param4 / (var9 + var8);
                  break L5;
                }
              }
              L6: {
                if (param5[0] != null) {
                  df.h(param0, param1, var16, var18);
                  param5[0].d(param0, param1);
                  df.a(nf.field_f);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (null == param5[2]) {
                  break L7;
                } else {
                  df.h(var17, param1, var10, var18);
                  param5[2].d(var13, param1);
                  df.a(nf.field_f);
                  break L7;
                }
              }
              L8: {
                if (param5[6] != null) {
                  df.h(param0, var19, var16, var11);
                  param5[6].d(param0, var15);
                  df.a(nf.field_f);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (param5[8] == null) {
                  break L9;
                } else {
                  df.h(var17, var19, var10, var11);
                  param5[8].d(var13, var15);
                  df.a(nf.field_f);
                  break L9;
                }
              }
              L10: {
                if (param5[1] == null) {
                  break L10;
                } else {
                  if (param5[1].field_u != 0) {
                    df.h(var16, param1, var17, var18);
                    var20 = var12;
                    L11: while (true) {
                      L12: {
                        if (var13 <= var20) {
                          break L12;
                        } else {
                          param5[1].d(var20, param1);
                          var20 = var20 + param5[1].field_u;
                          if (0 == 0) {
                            continue L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      df.a(nf.field_f);
                      break L10;
                    }
                  } else {
                    break L10;
                  }
                }
              }
              L13: {
                if (null == param5[7]) {
                  break L13;
                } else {
                  if (param5[7].field_u != 0) {
                    df.h(var16, var19, var17, var11);
                    var20 = var12;
                    L14: while (true) {
                      L15: {
                        if (var20 >= var13) {
                          break L15;
                        } else {
                          param5[7].d(var20, var15);
                          var20 = var20 + param5[7].field_u;
                          if (0 == 0) {
                            continue L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      df.a(nf.field_f);
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
              }
              L16: {
                if (!param2) {
                  break L16;
                } else {
                  var23 = null;
                  tm.a(-38, 91, true, -16, -31, (mg[]) null);
                  break L16;
                }
              }
              L17: {
                if (null == param5[3]) {
                  break L17;
                } else {
                  if (param5[3].field_z == 0) {
                    break L17;
                  } else {
                    df.h(param0, var18, var16, var19);
                    var20 = var14;
                    L18: while (true) {
                      L19: {
                        if (var15 <= var20) {
                          break L19;
                        } else {
                          param5[3].d(param0, var20);
                          var20 = var20 + param5[3].field_z;
                          if (0 == 0) {
                            continue L18;
                          } else {
                            break L19;
                          }
                        }
                      }
                      df.a(nf.field_f);
                      break L17;
                    }
                  }
                }
              }
              L20: {
                if (null == param5[5]) {
                  break L20;
                } else {
                  if (param5[5].field_z == 0) {
                    break L20;
                  } else {
                    df.h(var17, var18, var10, var19);
                    var20 = var14;
                    L21: while (true) {
                      L22: {
                        if (var15 <= var20) {
                          break L22;
                        } else {
                          param5[5].d(var13, var20);
                          var20 = var20 + param5[5].field_z;
                          if (0 == 0) {
                            continue L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      df.a(nf.field_f);
                      break L20;
                    }
                  }
                }
              }
              L23: {
                if (param5[4] == null) {
                  break L23;
                } else {
                  if (0 == param5[4].field_u) {
                    break L23;
                  } else {
                    if (-1 == (param5[4].field_z ^ -1)) {
                      break L23;
                    } else {
                      df.h(var16, var18, var17, var19);
                      var20 = var14;
                      L24: while (true) {
                        L25: {
                          if (var15 <= var20) {
                            break L25;
                          } else {
                            var21 = var12;
                            L26: while (true) {
                              L27: {
                                if (var13 <= var21) {
                                  break L27;
                                } else {
                                  param5[4].d(var21, var20);
                                  var21 = var21 + param5[4].field_u;
                                  if (0 == 0) {
                                    continue L26;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              var20 = var20 + param5[4].field_z;
                              if (0 == 0) {
                                continue L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                        }
                        df.a(nf.field_f);
                        break L23;
                      }
                    }
                  }
                }
              }
              return;
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static pe a(jh param0, int param1) {
        pe var2 = new pe(param0, (l) (Object) param0);
        co.field_a.a((l) (Object) var2, (byte) -70);
        int var3 = -54 % ((7 - param1) / 49);
        hd.field_g.a((in) (Object) param0);
        return var2;
    }

    final static void a(mg[][] param0, int param1, int param2, int param3, int[] param4, eh param5, mg[][] param6, byte[] param7, String[][] param8, int param9, String[][] param10, String[] param11, String[] param12, byte[] param13, String[] param14) {
        km var16 = null;
        int var17_int = 0;
        km var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        mg var19_ref_mg = null;
        int var19 = 0;
        Object var20 = null;
        String var20_ref = null;
        int var21 = 0;
        km var23 = null;
        km var24 = null;
        km stackIn_5_0 = null;
        km stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        km stackIn_5_3 = null;
        km stackIn_6_0 = null;
        km stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        km stackIn_6_3 = null;
        km stackIn_7_0 = null;
        km stackIn_7_1 = null;
        long stackIn_7_2 = 0L;
        km stackIn_7_3 = null;
        String stackIn_7_4 = null;
        Object stackIn_47_0 = null;
        km stackIn_47_1 = null;
        km stackOut_4_0 = null;
        km stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        km stackOut_4_3 = null;
        km stackOut_6_0 = null;
        km stackOut_6_1 = null;
        long stackOut_6_2 = 0L;
        km stackOut_6_3 = null;
        String stackOut_6_4 = null;
        km stackOut_5_0 = null;
        km stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        km stackOut_5_3 = null;
        String stackOut_5_4 = null;
        Object stackOut_46_0 = null;
        km stackOut_46_1 = null;
        L0: {
          var21 = Virogrid.field_F ? 1 : 0;
          sf.field_J = param0;
          oj.field_Vb = param2;
          qi.field_f = param3;
          bd.field_a = param12;
          vj.field_b = param4;
          vc.field_fb = param6;
          ch.field_j = param11;
          te.field_e = param14;
          p.field_e = param7;
          ic.field_f = param13;
          th.field_p = param10;
          uf.field_d = param8;
          jb.field_I = ke.a(32, param5, "lobby", "gameprivacy");
          m.field_f = ke.a(32, param5, "lobby", "ratedgame");
          lc.field_c = ke.a(32, param5, "lobby", "opentome");
          ph.field_m = ke.a(32, param5, "lobby", "allowspectators");
          cj.field_b = new String[5];
          cj.field_b[1] = ob.field_a;
          cj.field_b[0] = vi.field_j;
          cj.field_b[2] = wf.field_i;
          cj.field_b[3] = ca.field_R;
          cj.field_b[4] = ak.field_c;
          ij.field_m = new km(0L, (km) null);
          me.field_d = new km(0L, ag.field_d, tl.field_h);
          wm.field_m = new km(0L, he.field_Jb, wl.field_f);
          uf.field_j = new um(0L, new km(0L, (km) null), gg.field_M, ub.field_z);
          ij.field_m.a(0, me.field_d);
          if (!ql.field_d) {
            break L0;
          } else {
            ij.field_m.a(0, wm.field_m);
            break L0;
          }
        }
        ij.field_m.a(0, (km) (Object) uf.field_j);
        uf.field_j.field_Eb.b(18003, ti.field_h);
        uf.field_j.field_Eb.field_D = 1;
        var23 = uf.field_j.field_Eb;
        var24 = var23;
        var24.field_lb = 1;
        qd.field_f = new km(0L, ti.field_h);
        if (param1 > 92) {
          L1: {
            qd.field_f.field_lb = 1;
            s.field_b = new km(0L, mf.field_j, um.field_Ib.toUpperCase());
            ng.field_Z = new km(0L, kh.field_b, uf.field_o.toUpperCase());
            nk.field_I = new km(0L, cc.field_w);
            f.field_c = new km(0L, ag.field_d, pi.field_a);
            qn.field_H = new km(0L, jm.field_b, wf.field_g);
            fn.field_d = new km(0L, jm.field_b, lh.field_c);
            gk.field_b = new km(0L, jm.field_b, th.field_r);
            ec.field_C = new km(0L, jm.field_b, fh.field_d);
            qn.field_J = new km(0L, he.field_Jb, bf.field_k);
            ch.field_a = new um(0L, new km(0L, (km) null), gg.field_M, ub.field_z);
            nd.field_a = new km(0L, bd.field_b, dm.field_s.toUpperCase());
            nd.field_a.field_Y = ql.field_d;
            stackOut_4_0 = null;
            stackOut_4_1 = null;
            stackOut_4_2 = 0L;
            stackOut_4_3 = bd.field_b;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            if (ql.field_d) {
              stackOut_6_0 = null;
              stackOut_6_1 = null;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = (km) (Object) stackIn_6_3;
              stackOut_6_4 = we.field_f;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              break L1;
            } else {
              stackOut_5_0 = null;
              stackOut_5_1 = null;
              stackOut_5_2 = stackIn_5_2;
              stackOut_5_3 = (km) (Object) stackIn_5_3;
              stackOut_5_4 = wb.field_l;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              break L1;
            }
          }
          L2: {
            new km(stackIn_7_2, stackIn_7_3, ((String) (Object) stackIn_7_4).toUpperCase());
            dc.field_R = stackIn_7_0;
            hg.field_p = new km(0L, (km) null);
            hg.field_p.a(0, ng.field_Z);
            hg.field_p.a(0, nk.field_I);
            nk.field_I.a(0, f.field_c);
            nk.field_I.a(0, qn.field_H);
            nk.field_I.a(0, fn.field_d);
            if (!ql.field_d) {
              break L2;
            } else {
              nk.field_I.a(0, gk.field_b);
              break L2;
            }
          }
          L3: {
            nk.field_I.a(0, ec.field_C);
            nk.field_I.a(0, qn.field_J);
            nk.field_I.a(0, (km) (Object) ch.field_a);
            if (!ql.field_d) {
              break L3;
            } else {
              hg.field_p.a(0, nd.field_a);
              break L3;
            }
          }
          L4: {
            hg.field_p.a(0, dc.field_R);
            pa.field_o = new km(0L, ti.field_h);
            pa.field_o.field_D = 0;
            pa.field_o.field_lb = 1;
            nk.field_H = new km(0L, fa.field_n, kb.field_a.toUpperCase());
            jj.field_a = new km(0L, fn.field_e);
            jj.field_a.a(0, pa.field_o);
            jj.field_a.a(0, nk.field_H);
            l.field_b = new km(0L, gg.field_M);
            l.field_b.b(18003, ti.field_h);
            var16 = l.field_b;
            l.field_b.field_D = 1;
            var16.field_lb = 1;
            ia.field_d = new km(0L, (km) null);
            qh.field_R = new km(0L, ti.field_h);
            qh.field_R.field_lb = 1;
            kh.field_g = new km(0L, ag.field_d, tl.field_h);
            gn.field_F = new km(0L, he.field_Jb, wl.field_f);
            wm.field_r = new um(0L, new km(0L, (km) null), gg.field_M, ub.field_z);
            ia.field_d.a(0, qh.field_R);
            ia.field_d.a(0, kh.field_g);
            if (ql.field_d) {
              ia.field_d.a(0, gn.field_F);
              break L4;
            } else {
              break L4;
            }
          }
          ia.field_d.a(0, (km) (Object) wm.field_r);
          fb.field_o = new km(0L, mf.field_j, mf.field_i.toUpperCase());
          qi.field_e = new km(0L, kh.field_b);
          nn.field_b = new km(0L, cc.field_w);
          qa.field_c = new km(0L, me.field_c, tk.field_a.toUpperCase());
          oe.field_b = new hk[4 + param9][];
          f.field_f = new km[param9 + 4];
          f.field_f[0] = new km(0L, ke.field_u, ul.field_b);
          oe.field_b[0] = new hk[6];
          var17_int = 0;
          L5: while (true) {
            L6: {
              if (var17_int >= 5) {
                break L6;
              } else {
                oe.field_b[0][var17_int - -1] = new hk(0L, vf.field_e, (km) null, ma.field_e, jb.field_I[var17_int], cj.field_b[var17_int]);
                var17_int++;
                if (0 == 0) {
                  continue L5;
                } else {
                  break L6;
                }
              }
            }
            L7: {
              if (2 > vj.field_b.length) {
                break L7;
              } else {
                f.field_f[1] = new km(0L, ke.field_u, wg.field_d);
                oe.field_b[1] = new hk[vj.field_b.length + 1];
                oe.field_b[1][0] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I);
                var17_int = 0;
                L8: while (true) {
                  if (var17_int >= vj.field_b.length) {
                    break L7;
                  } else {
                    oe.field_b[1][1 + var17_int] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, Integer.toString(vj.field_b[var17_int]));
                    var17_int++;
                    if (0 == 0) {
                      continue L8;
                    } else {
                      break L7;
                    }
                  }
                }
              }
            }
            L9: {
              f.field_f[2] = new km(0L, ke.field_u, field_i);
              oe.field_b[2] = new hk[3];
              if (qi.field_f <= 1) {
                break L9;
              } else {
                f.field_f[3] = new km(0L, ke.field_u, sm.field_c);
                oe.field_b[3] = new hk[1 + qi.field_f];
                oe.field_b[3][0] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I);
                var17_int = 0;
                L10: while (true) {
                  if (var17_int >= qi.field_f) {
                    break L9;
                  } else {
                    oe.field_b[3][var17_int - -1] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, te.field_e[var17_int]);
                    var17_int++;
                    if (0 == 0) {
                      continue L10;
                    } else {
                      break L9;
                    }
                  }
                }
              }
            }
            var17_int = 0;
            L11: while (true) {
              L12: {
                if (param9 <= var17_int) {
                  break L12;
                } else {
                  f.field_f[var17_int + 4] = new km(0L, ke.field_u, bd.field_a[var17_int]);
                  oe.field_b[4 - -var17_int] = new hk[1 + rb.a(255, (int) ic.field_f[var17_int])];
                  oe.field_b[var17_int + 4][0] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I);
                  var18 = 0;
                  L13: while (true) {
                    L14: {
                      if (var18 >= (ic.field_f[var17_int] & 255)) {
                        break L14;
                      } else {
                        L15: {
                          if (sf.field_J == null) {
                            var19_ref = null;
                            break L15;
                          } else {
                            if (null != sf.field_J[var17_int]) {
                              var19_ref_mg = sf.field_J[var17_int][var18];
                              break L15;
                            } else {
                              var19_ref_mg = null;
                              break L15;
                            }
                          }
                        }
                        L16: {
                          if (uf.field_d != null) {
                            if (uf.field_d[var17_int] == null) {
                              var20 = null;
                              break L16;
                            } else {
                              var20_ref = uf.field_d[var17_int][var18];
                              break L16;
                            }
                          } else {
                            var20_ref = null;
                            break L16;
                          }
                        }
                        oe.field_b[4 - -var17_int][var18 + 1] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) var19_ref, (String) var20);
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
                  if (var17_int >= param9 + 4) {
                    break L18;
                  } else {
                    stackOut_46_0 = null;
                    stackOut_46_1 = f.field_f[var17_int];
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    L19: {
                      if (stackIn_47_0 != (Object) (Object) stackIn_47_1) {
                        f.field_f[var17_int].field_fb = 11;
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    L20: {
                      if (null != oe.field_b[var17_int]) {
                        var18 = 0;
                        L21: while (true) {
                          if (var18 >= oe.field_b[var17_int].length) {
                            break L20;
                          } else {
                            L22: {
                              if (null == oe.field_b[var17_int][var18]) {
                                break L22;
                              } else {
                                if (oe.field_b[var17_int][var18].field_Fb == null) {
                                  break L22;
                                } else {
                                  oe.field_b[var17_int][var18].field_Fb.field_fb = 11;
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
                ed.field_c = new km(0L, bd.field_b);
                ii.field_d = new km(0L, bd.field_b);
                jk.field_b = new km(0L, da.field_n);
                jk.field_b.b(18003, ti.field_h);
                var17 = jk.field_b;
                jk.field_b.field_D = 1;
                var17.field_lb = 1;
                dm.field_r = new km(0L, (km) null);
                dm.field_r.a(0, qi.field_e);
                dm.field_r.a(0, nn.field_b);
                nn.field_b.a(0, qa.field_c);
                var18 = 0;
                L23: while (true) {
                  L24: {
                    if (4 + param9 <= var18) {
                      break L24;
                    } else {
                      L25: {
                        L26: {
                          if (var18 != 1) {
                            break L26;
                          } else {
                            if (-3 < (vj.field_b.length ^ -1)) {
                              break L25;
                            } else {
                              break L26;
                            }
                          }
                        }
                        L27: {
                          if (var18 != 3) {
                            break L27;
                          } else {
                            if (qi.field_f > 1) {
                              break L27;
                            } else {
                              if (0 == 0) {
                                break L25;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        nn.field_b.a(0, f.field_f[var18]);
                        var19 = 0;
                        L28: while (true) {
                          if (oe.field_b[var18].length <= var19) {
                            break L25;
                          } else {
                            L29: {
                              if (null != oe.field_b[var18][var19]) {
                                nn.field_b.a(0, (km) (Object) oe.field_b[var18][var19]);
                                break L29;
                              } else {
                                break L29;
                              }
                            }
                            var19++;
                            if (0 == 0) {
                              continue L28;
                            } else {
                              break L25;
                            }
                          }
                        }
                      }
                      var18++;
                      if (0 == 0) {
                        continue L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  dm.field_r.a(0, ed.field_c);
                  dm.field_r.a(0, ii.field_d);
                  dm.field_r.a(0, jk.field_b);
                  jj.field_m = new km(0L, wh.field_a, lc.field_h.toUpperCase());
                  na.field_Ib = new km(0L, fa.field_n, ob.field_b.toUpperCase());
                  return;
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final static mg[] a(eh param0, int param1, int param2, int param3) {
        if (param2 != 4) {
            return null;
        }
        if (!hn.a(param0, param1, param3, (byte) 109)) {
            return null;
        }
        return dd.a((byte) -123);
    }

    private tm() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "<%0> has joined your game.";
        field_i = "Allow spectators?";
        field_k = null;
    }
}
