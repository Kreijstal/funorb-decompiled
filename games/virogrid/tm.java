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
        field_h = null;
        field_k = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, mg[] param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
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
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var22 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            if (param5 != null) {
              L1: {
                if (param3 <= 0) {
                  break L1;
                } else {
                  if (param4 > 0) {
                    L2: {
                      if (param5[3] == null) {
                        stackOut_8_0 = 0;
                        stackIn_9_0 = stackOut_8_0;
                        break L2;
                      } else {
                        stackOut_7_0 = param5[3].field_u;
                        stackIn_9_0 = stackOut_7_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_9_0;
                      if (null == param5[5]) {
                        stackOut_11_0 = 0;
                        stackIn_12_0 = stackOut_11_0;
                        break L3;
                      } else {
                        stackOut_10_0 = param5[5].field_u;
                        stackIn_12_0 = stackOut_10_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_12_0;
                      if (null == param5[1]) {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        break L4;
                      } else {
                        stackOut_13_0 = param5[1].field_z;
                        stackIn_15_0 = stackOut_13_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_15_0;
                      if (param5[7] != null) {
                        stackOut_17_0 = param5[7].field_z;
                        stackIn_18_0 = stackOut_17_0;
                        break L5;
                      } else {
                        stackOut_16_0 = 0;
                        stackIn_18_0 = stackOut_16_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_18_0;
                      var10 = param0 - -param3;
                      var11 = param1 + param4;
                      var12 = var6_int + param0;
                      var13 = var10 - var7;
                      var14 = var8 + param1;
                      var15 = var11 + -var9;
                      var16 = var12;
                      var17 = var13;
                      if (var17 >= var16) {
                        break L6;
                      } else {
                        var17 = param3 * var6_int / (var6_int - -var7) + param0;
                        var16 = param3 * var6_int / (var6_int - -var7) + param0;
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      df.b(nf.field_f);
                      if (var19 >= var18) {
                        break L7;
                      } else {
                        var19 = param1 + var8 * param4 / (var9 + var8);
                        var18 = param1 + var8 * param4 / (var9 + var8);
                        break L7;
                      }
                    }
                    L8: {
                      if (param5[0] != null) {
                        df.h(param0, param1, var16, var18);
                        param5[0].d(param0, param1);
                        df.a(nf.field_f);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: {
                      if (null == param5[2]) {
                        break L9;
                      } else {
                        df.h(var17, param1, var10, var18);
                        param5[2].d(var13, param1);
                        df.a(nf.field_f);
                        break L9;
                      }
                    }
                    L10: {
                      if (param5[6] != null) {
                        df.h(param0, var19, var16, var11);
                        param5[6].d(param0, var15);
                        df.a(nf.field_f);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (param5[8] == null) {
                        break L11;
                      } else {
                        df.h(var17, var19, var10, var11);
                        param5[8].d(var13, var15);
                        df.a(nf.field_f);
                        break L11;
                      }
                    }
                    L12: {
                      if (param5[1] == null) {
                        break L12;
                      } else {
                        if (param5[1].field_u != 0) {
                          df.h(var16, param1, var17, var18);
                          var20 = var12;
                          L13: while (true) {
                            if (var13 <= var20) {
                              df.a(nf.field_f);
                              break L12;
                            } else {
                              param5[1].d(var20, param1);
                              var20 = var20 + param5[1].field_u;
                              continue L13;
                            }
                          }
                        } else {
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (null == param5[7]) {
                        break L14;
                      } else {
                        if (param5[7].field_u != 0) {
                          df.h(var16, var19, var17, var11);
                          var20 = var12;
                          L15: while (true) {
                            if (var20 >= var13) {
                              df.a(nf.field_f);
                              break L14;
                            } else {
                              param5[7].d(var20, var15);
                              var20 = var20 + param5[7].field_u;
                              continue L15;
                            }
                          }
                        } else {
                          break L14;
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
                            if (var15 <= var20) {
                              df.a(nf.field_f);
                              break L17;
                            } else {
                              param5[3].d(param0, var20);
                              var20 = var20 + param5[3].field_z;
                              continue L18;
                            }
                          }
                        }
                      }
                    }
                    L19: {
                      if (null == param5[5]) {
                        break L19;
                      } else {
                        if (param5[5].field_z == 0) {
                          break L19;
                        } else {
                          df.h(var17, var18, var10, var19);
                          var20 = var14;
                          L20: while (true) {
                            if (var15 <= var20) {
                              df.a(nf.field_f);
                              break L19;
                            } else {
                              param5[5].d(var13, var20);
                              var20 = var20 + param5[5].field_z;
                              continue L20;
                            }
                          }
                        }
                      }
                    }
                    L21: {
                      if (param5[4] == null) {
                        break L21;
                      } else {
                        if (0 == param5[4].field_u) {
                          break L21;
                        } else {
                          if (param5[4].field_z == 0) {
                            break L21;
                          } else {
                            df.h(var16, var18, var17, var19);
                            var20 = var14;
                            L22: while (true) {
                              if (var15 <= var20) {
                                df.a(nf.field_f);
                                break L21;
                              } else {
                                var21 = var12;
                                L23: while (true) {
                                  if (var13 <= var21) {
                                    var20 = var20 + param5[4].field_z;
                                    continue L22;
                                  } else {
                                    param5[4].d(var21, var20);
                                    var21 = var21 + param5[4].field_u;
                                    continue L23;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              return;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var6;
            stackOut_71_1 = new StringBuilder().append("tm.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param5 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L24;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L24;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 41);
        }
    }

    final static pe a(jh param0, int param1) {
        pe var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        pe stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        pe stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new pe(param0, (l) (Object) param0);
            co.field_a.a((l) (Object) var2, (byte) -70);
            var3 = -54 % ((7 - param1) / 49);
            hd.field_g.a((in) (Object) param0);
            stackOut_0_0 = (pe) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("tm.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param1 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(mg[][] param0, int param1, int param2, int param3, int[] param4, eh param5, mg[][] param6, byte[] param7, String[][] param8, int param9, String[][] param10, String[] param11, String[] param12, byte[] param13, String[] param14) {
        km var16 = null;
        int var17_int = 0;
        km var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
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
            dc.field_R = new km(stackIn_7_2, stackIn_7_3, ((String) (Object) stackIn_7_4).toUpperCase());
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
            if (var17_int >= 5) {
              L6: {
                if (2 > vj.field_b.length) {
                  break L6;
                } else {
                  f.field_f[1] = new km(0L, ke.field_u, wg.field_d);
                  oe.field_b[1] = new hk[vj.field_b.length + 1];
                  oe.field_b[1][0] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I);
                  var17_int = 0;
                  L7: while (true) {
                    if (~var17_int <= ~vj.field_b.length) {
                      break L6;
                    } else {
                      oe.field_b[1][1 + var17_int] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, Integer.toString(vj.field_b[var17_int]));
                      var17_int++;
                      continue L7;
                    }
                  }
                }
              }
              L8: {
                f.field_f[2] = new km(0L, ke.field_u, field_i);
                oe.field_b[2] = new hk[3];
                if (qi.field_f <= 1) {
                  break L8;
                } else {
                  f.field_f[3] = new km(0L, ke.field_u, sm.field_c);
                  oe.field_b[3] = new hk[1 + qi.field_f];
                  oe.field_b[3][0] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I);
                  var17_int = 0;
                  L9: while (true) {
                    if (~var17_int <= ~qi.field_f) {
                      break L8;
                    } else {
                      oe.field_b[3][var17_int - -1] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, te.field_e[var17_int]);
                      var17_int++;
                      continue L9;
                    }
                  }
                }
              }
              var17_int = 0;
              L10: while (true) {
                if (~param9 >= ~var17_int) {
                  var17_int = 0;
                  L11: while (true) {
                    if (var17_int >= param9 + 4) {
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
                      L12: while (true) {
                        if (~(4 + param9) >= ~var18) {
                          dm.field_r.a(0, ed.field_c);
                          dm.field_r.a(0, ii.field_d);
                          dm.field_r.a(0, jk.field_b);
                          jj.field_m = new km(0L, wh.field_a, lc.field_h.toUpperCase());
                          na.field_Ib = new km(0L, fa.field_n, ob.field_b.toUpperCase());
                          return;
                        } else {
                          L13: {
                            L14: {
                              if (var18 != 1) {
                                break L14;
                              } else {
                                if (vj.field_b.length < 2) {
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
                                if (qi.field_f > 1) {
                                  break L15;
                                } else {
                                  break L13;
                                }
                              }
                            }
                            nn.field_b.a(0, f.field_f[var18]);
                            var19 = 0;
                            L16: while (true) {
                              if (~oe.field_b[var18].length >= ~var19) {
                                break L13;
                              } else {
                                L17: {
                                  if (null != oe.field_b[var18][var19]) {
                                    nn.field_b.a(0, (km) (Object) oe.field_b[var18][var19]);
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
                        if (null != f.field_f[var17_int]) {
                          f.field_f[var17_int].field_fb = 11;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      L19: {
                        if (null != oe.field_b[var17_int]) {
                          var18 = 0;
                          L20: while (true) {
                            if (~var18 <= ~oe.field_b[var17_int].length) {
                              break L19;
                            } else {
                              L21: {
                                if (null == oe.field_b[var17_int][var18]) {
                                  break L21;
                                } else {
                                  if (oe.field_b[var17_int][var18].field_Fb == null) {
                                    break L21;
                                  } else {
                                    oe.field_b[var17_int][var18].field_Fb.field_fb = 11;
                                    break L21;
                                  }
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
                  f.field_f[var17_int + 4] = new km(0L, ke.field_u, bd.field_a[var17_int]);
                  oe.field_b[4 - -var17_int] = new hk[1 + rb.a(255, (int) ic.field_f[var17_int])];
                  oe.field_b[var17_int + 4][0] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) null, gn.field_I);
                  var18 = 0;
                  L22: while (true) {
                    if (var18 >= (ic.field_f[var17_int] & 255)) {
                      var17_int++;
                      continue L10;
                    } else {
                      L23: {
                        if (sf.field_J == null) {
                          var19_ref = null;
                          break L23;
                        } else {
                          if (null != sf.field_J[var17_int]) {
                            var19_ref = (Object) (Object) sf.field_J[var17_int][var18];
                            break L23;
                          } else {
                            var19_ref = null;
                            break L23;
                          }
                        }
                      }
                      L24: {
                        if (uf.field_d != null) {
                          if (uf.field_d[var17_int] == null) {
                            var20 = null;
                            break L24;
                          } else {
                            var20 = (Object) (Object) uf.field_d[var17_int][var18];
                            break L24;
                          }
                        } else {
                          var20 = null;
                          break L24;
                        }
                      }
                      oe.field_b[4 - -var17_int][var18 + 1] = new hk(0L, vf.field_e, (km) null, ma.field_e, (mg) var19_ref, (String) var20);
                      var18++;
                      continue L22;
                    }
                  }
                }
              }
            } else {
              oe.field_b[0][var17_int - -1] = new hk(0L, vf.field_e, (km) null, ma.field_e, jb.field_I[var17_int], cj.field_b[var17_int]);
              var17_int++;
              continue L5;
            }
          }
        } else {
          return;
        }
    }

    final static mg[] a(eh param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_2_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          if (param2 == 4) {
            if (hn.a(param0, param1, param3, (byte) 109)) {
              return dd.a((byte) -123);
            } else {
              return null;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (mg[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("tm.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L0;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L0;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
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
