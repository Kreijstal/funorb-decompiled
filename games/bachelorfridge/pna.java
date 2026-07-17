/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class pna extends sna {
    private int field_vb;
    private int[] field_Hb;
    private sna field_Fb;
    private int field_Ab;
    private gna[] field_Gb;
    private int field_yb;
    private int field_Eb;
    private sna field_Cb;
    static rs[] field_zb;
    private int field_Bb;
    private kv[] field_Db;
    private int field_wb;
    private int field_xb;

    public static void f() {
        field_zb = null;
    }

    final void a(String param0, boolean param1, int param2) {
        try {
            ((pna) this).field_Gb[((pna) this).field_yb] = new gna(0L, (sna) null, (sna) null, ((pna) this).field_Cb, (kv) null, param0);
            ((pna) this).field_Gb[((pna) this).field_yb].field_A = ((pna) this).field_Db;
            ((pna) this).field_Gb[((pna) this).field_yb].field_qb = param1 ? true : false;
            ((pna) this).field_Gb[((pna) this).field_yb].field_Y = 1;
            ((pna) this).a(-1, (sna) (Object) ((pna) this).field_Gb[((pna) this).field_yb]);
            ((pna) this).field_Hb[((pna) this).field_yb] = param2;
            ((pna) this).field_yb = ((pna) this).field_yb + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pna.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = BachelorFridge.field_y;
        if (param2 == 0) {
          var6 = param3 - param4;
          var7 = -param5 + param0;
          if (var6 != 0) {
            if (var7 != 0) {
              L0: {
                var12 = (var7 << 12) / var6;
                var13 = -(param4 * var12 >> 12) + param5;
                if (~param4 > ~eo.field_l) {
                  var10 = (var12 * eo.field_l >> 12) + var13;
                  var8 = eo.field_l;
                  break L0;
                } else {
                  if (pw.field_x >= param4) {
                    var8 = param4;
                    var10 = param5;
                    break L0;
                  } else {
                    var8 = pw.field_x;
                    var10 = (pw.field_x * var12 >> 12) + var13;
                    break L0;
                  }
                }
              }
              L1: {
                if (~param3 <= ~eo.field_l) {
                  if (param3 > pw.field_x) {
                    var9 = pw.field_x;
                    var11 = var13 + (var12 * pw.field_x >> 12);
                    break L1;
                  } else {
                    var9 = param3;
                    var11 = param0;
                    break L1;
                  }
                } else {
                  var11 = var13 + (var12 * eo.field_l >> 12);
                  var9 = eo.field_l;
                  break L1;
                }
              }
              L2: {
                if (an.field_q > var10) {
                  var10 = an.field_q;
                  var8 = (an.field_q - var13 << 12) / var12;
                  break L2;
                } else {
                  if (ha.field_n >= var10) {
                    break L2;
                  } else {
                    var8 = (ha.field_n - var13 << 12) / var12;
                    var10 = ha.field_n;
                    break L2;
                  }
                }
              }
              L3: {
                if (var11 < an.field_q) {
                  var11 = an.field_q;
                  var9 = (an.field_q + -var13 << 12) / var12;
                  break L3;
                } else {
                  if (var11 > ha.field_n) {
                    var9 = (ha.field_n - var13 << 12) / var12;
                    var11 = ha.field_n;
                    break L3;
                  } else {
                    break L3;
                  }
                }
              }
              oe.a(var10, param1, -116, var9, var11, var8);
              return;
            } else {
              sfa.a(param1, param4, (byte) -20, param5, param3);
              return;
            }
          } else {
            L4: {
              if (var7 == 0) {
                break L4;
              } else {
                ap.a(param0, param4, param5, param2 + 76, param1);
                break L4;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void a(kv[][] param0, int param1, vr param2, int param3, String[] param4, byte[] param5, byte[] param6, String[][] param7, String[] param8, boolean param9, int param10, String[] param11, kv[][] param12, int[] param13, String[][] param14) {
        sna var16 = null;
        int var17_int = 0;
        sna var17 = null;
        int var18 = 0;
        Object var19_ref = null;
        int var19 = 0;
        Object var20 = null;
        int var21 = 0;
        sna var23 = null;
        sna var24 = null;
        sna stackIn_5_0 = null;
        sna stackIn_5_1 = null;
        long stackIn_5_2 = 0L;
        sna stackIn_5_3 = null;
        sna stackIn_6_0 = null;
        sna stackIn_6_1 = null;
        long stackIn_6_2 = 0L;
        sna stackIn_6_3 = null;
        sna stackIn_7_0 = null;
        sna stackIn_7_1 = null;
        long stackIn_7_2 = 0L;
        sna stackIn_7_3 = null;
        String stackIn_7_4 = null;
        sna stackOut_4_0 = null;
        sna stackOut_4_1 = null;
        long stackOut_4_2 = 0L;
        sna stackOut_4_3 = null;
        sna stackOut_6_0 = null;
        sna stackOut_6_1 = null;
        long stackOut_6_2 = 0L;
        sna stackOut_6_3 = null;
        String stackOut_6_4 = null;
        sna stackOut_5_0 = null;
        sna stackOut_5_1 = null;
        long stackOut_5_2 = 0L;
        sna stackOut_5_3 = null;
        String stackOut_5_4 = null;
        var21 = BachelorFridge.field_y;
        kka.field_k = param8;
        cla.field_a = param6;
        qha.field_c = param13;
        rha.field_e = param0;
        dw.field_g = param5;
        bma.field_u = param1;
        mt.field_s = param10;
        md.field_p = param11;
        cia.field_f = param4;
        L0: {
          uha.field_Xb = param12;
          co.field_a = param14;
          gk.field_c = param7;
          ut.field_r = gw.a("lobby", "gameprivacy", param2, -89);
          gba.field_Db = gw.a("lobby", "ratedgame", param2, -81);
          sma.field_H = gw.a("lobby", "opentome", param2, -78);
          rv.field_k = gw.a("lobby", "allowspectators", param2, -72);
          cc.field_d = new String[5];
          cc.field_d[0] = cd.field_m;
          cc.field_d[4] = ct.field_s;
          cc.field_d[2] = kg.field_c;
          cc.field_d[3] = pv.field_h;
          cc.field_d[1] = oja.field_d;
          tv.field_o = new sna(0L, (sna) null);
          fja.field_a = new sna(0L, iia.field_m, bs.field_j);
          oca.field_n = new sna(0L, vda.field_a, tv.field_m);
          qba.field_m = new sga(0L, new sna(0L, (sna) null), vg.field_k, qf.field_y);
          tv.field_o.a(-1, fja.field_a);
          if (eaa.field_c) {
            tv.field_o.a(-1, oca.field_n);
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          tv.field_o.a(-1, (sna) (Object) qba.field_m);
          qba.field_m.field_wb.a(qs.field_m, 11);
          qba.field_m.field_wb.field_Y = 1;
          var23 = qba.field_m.field_wb;
          var24 = var23;
          var24.field_N = 1;
          dea.field_m = new sna(0L, qs.field_m);
          dea.field_m.field_N = 1;
          mc.field_g = new sna(0L, iw.field_a, pja.field_f.toUpperCase());
          wia.field_f = new sna(0L, p.field_o, vl.field_b.toUpperCase());
          nea.field_yb = new sna(0L, vq.field_v);
          fl.field_m = new sna(0L, iia.field_m, oha.field_e);
          nd.field_i = new sna(0L, bna.field_z, iia.field_n);
          mt.field_q = new sna(0L, bna.field_z, gp.field_z);
          hj.field_p = new sna(0L, bna.field_z, oda.field_a);
          vf.field_F = new sna(0L, bna.field_z, iga.field_b);
          aia.field_l = new sna(0L, vda.field_a, fu.field_s);
          p.field_n = new sga(0L, new sna(0L, (sna) null), vg.field_k, qf.field_y);
          ae.field_a = new sna(0L, vo.field_b, si.field_d.toUpperCase());
          ae.field_a.field_u = eaa.field_c;
          stackOut_4_0 = null;
          stackOut_4_1 = null;
          stackOut_4_2 = 0L;
          stackOut_4_3 = vo.field_b;
          stackIn_6_0 = stackOut_4_0;
          stackIn_6_1 = stackOut_4_1;
          stackIn_6_2 = stackOut_4_2;
          stackIn_6_3 = stackOut_4_3;
          stackIn_5_0 = stackOut_4_0;
          stackIn_5_1 = stackOut_4_1;
          stackIn_5_2 = stackOut_4_2;
          stackIn_5_3 = stackOut_4_3;
          if (!eaa.field_c) {
            stackOut_6_0 = null;
            stackOut_6_1 = null;
            stackOut_6_2 = stackIn_6_2;
            stackOut_6_3 = (sna) (Object) stackIn_6_3;
            stackOut_6_4 = mg.field_o;
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
            stackOut_5_3 = (sna) (Object) stackIn_5_3;
            stackOut_5_4 = mv.field_m;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_7_2 = stackOut_5_2;
            stackIn_7_3 = stackOut_5_3;
            stackIn_7_4 = stackOut_5_4;
            break L1;
          }
        }
        L2: {
          vh.field_y = new sna(stackIn_7_2, stackIn_7_3, ((String) (Object) stackIn_7_4).toUpperCase());
          ui.field_r = new sna(0L, (sna) null);
          ui.field_r.a(-1, wia.field_f);
          ui.field_r.a(-1, nea.field_yb);
          nea.field_yb.a(-1, fl.field_m);
          nea.field_yb.a(-1, nd.field_i);
          nea.field_yb.a(-1, mt.field_q);
          if (eaa.field_c) {
            nea.field_yb.a(-1, hj.field_p);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          nea.field_yb.a(-1, vf.field_F);
          nea.field_yb.a(-1, aia.field_l);
          nea.field_yb.a(-1, (sna) (Object) p.field_n);
          if (!eaa.field_c) {
            break L3;
          } else {
            ui.field_r.a(-1, ae.field_a);
            break L3;
          }
        }
        L4: {
          ui.field_r.a(-1, vh.field_y);
          io.field_q = new sna(0L, qs.field_m);
          io.field_q.field_Y = 0;
          io.field_q.field_N = 1;
          aja.field_l = new sna(0L, sn.field_l, ne.field_m.toUpperCase());
          sb.field_n = new sna(0L, qaa.field_d);
          sb.field_n.a(-1, io.field_q);
          sb.field_n.a(-1, aja.field_l);
          sr.field_b = new sna(0L, vg.field_k);
          sr.field_b.a(qs.field_m, 58);
          var16 = sr.field_b;
          sr.field_b.field_Y = 1;
          var16.field_N = 1;
          nu.field_f = new sna(0L, (sna) null);
          mja.field_t = new sna(0L, qs.field_m);
          mja.field_t.field_N = 1;
          oga.field_t = new sna(0L, iia.field_m, bs.field_j);
          ut.field_q = new sna(0L, vda.field_a, tv.field_m);
          ak.field_q = new sga(0L, new sna(0L, (sna) null), vg.field_k, qf.field_y);
          nu.field_f.a(-1, mja.field_t);
          nu.field_f.a(-1, oga.field_t);
          if (eaa.field_c) {
            nu.field_f.a(-1, ut.field_q);
            break L4;
          } else {
            break L4;
          }
        }
        nu.field_f.a(-1, (sna) (Object) ak.field_q);
        jj.field_wb = new sna(0L, iw.field_a, dh.field_i.toUpperCase());
        vaa.field_a = new sna(0L, p.field_o);
        vm.field_i = new sna(0L, vq.field_v);
        mh.field_j = new sna(0L, rda.field_a, ou.field_c.toUpperCase());
        pka.field_b = new sna[param3 + 4];
        gd.field_n = new gna[4 + param3][];
        pka.field_b[0] = new sna(0L, ina.field_n, pf.field_k);
        gd.field_n[0] = new gna[6];
        var17_int = 0;
        L5: while (true) {
          if (var17_int >= 5) {
            L6: {
              if (qha.field_c.length >= 2) {
                pka.field_b[1] = new sna(0L, ina.field_n, gb.field_j);
                gd.field_n[1] = new gna[qha.field_c.length + 1];
                gd.field_n[1][0] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j);
                var17_int = 0;
                L7: while (true) {
                  if (qha.field_c.length <= var17_int) {
                    break L6;
                  } else {
                    gd.field_n[1][1 + var17_int] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, Integer.toString(qha.field_c[var17_int]));
                    var17_int++;
                    continue L7;
                  }
                }
              } else {
                break L6;
              }
            }
            L8: {
              pka.field_b[2] = new sna(0L, ina.field_n, ud.field_q);
              gd.field_n[2] = new gna[3];
              if (bma.field_u <= 1) {
                break L8;
              } else {
                pka.field_b[3] = new sna(0L, ina.field_n, uk.field_w);
                gd.field_n[3] = new gna[1 + bma.field_u];
                gd.field_n[3][0] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j);
                var17_int = 0;
                L9: while (true) {
                  if (~var17_int <= ~bma.field_u) {
                    break L8;
                  } else {
                    gd.field_n[3][var17_int - -1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, cia.field_f[var17_int]);
                    var17_int++;
                    continue L9;
                  }
                }
              }
            }
            var17_int = 0;
            L10: while (true) {
              if (~var17_int <= ~param3) {
                var17_int = 0;
                L11: while (true) {
                  if (var17_int >= param3 + 4) {
                    ik.field_i = new sna(0L, vo.field_b);
                    cn.field_j = new sna(0L, vo.field_b);
                    cw.field_yb = new sna(0L, rea.field_g);
                    cw.field_yb.a(qs.field_m, 16);
                    var17 = cw.field_yb;
                    cw.field_yb.field_Y = 1;
                    var17.field_N = 1;
                    ho.field_g = new sna(0L, (sna) null);
                    ho.field_g.a(-1, vaa.field_a);
                    ho.field_g.a(-1, vm.field_i);
                    vm.field_i.a(-1, mh.field_j);
                    var18 = 0;
                    L12: while (true) {
                      if (~var18 <= ~(4 + param3)) {
                        ho.field_g.a(-1, ik.field_i);
                        ho.field_g.a(-1, cn.field_j);
                        ho.field_g.a(-1, cw.field_yb);
                        saa.field_f = new sna(0L, mda.field_c, pe.field_l.toUpperCase());
                        vca.field_h = new sna(0L, sn.field_l, fk.field_t.toUpperCase());
                        return;
                      } else {
                        L13: {
                          L14: {
                            if (var18 != 1) {
                              break L14;
                            } else {
                              if (qha.field_c.length < 2) {
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
                              if (bma.field_u > 1) {
                                break L15;
                              } else {
                                break L13;
                              }
                            }
                          }
                          vm.field_i.a(-1, pka.field_b[var18]);
                          var19 = 0;
                          L16: while (true) {
                            if (gd.field_n[var18].length <= var19) {
                              break L13;
                            } else {
                              L17: {
                                if (null != gd.field_n[var18][var19]) {
                                  vm.field_i.a(-1, (sna) (Object) gd.field_n[var18][var19]);
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
                      if (pka.field_b[var17_int] == null) {
                        break L18;
                      } else {
                        pka.field_b[var17_int].field_B = 11;
                        break L18;
                      }
                    }
                    L19: {
                      if (gd.field_n[var17_int] == null) {
                        break L19;
                      } else {
                        var18 = 0;
                        L20: while (true) {
                          if (gd.field_n[var17_int].length <= var18) {
                            break L19;
                          } else {
                            L21: {
                              if (null == gd.field_n[var17_int][var18]) {
                                break L21;
                              } else {
                                if (null != gd.field_n[var17_int][var18].field_vb) {
                                  gd.field_n[var17_int][var18].field_vb.field_B = 11;
                                  break L21;
                                } else {
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
                pka.field_b[4 - -var17_int] = new sna(0L, ina.field_n, kka.field_k[var17_int]);
                gd.field_n[var17_int + 4] = new gna[1 + dda.a(255, (int) dw.field_g[var17_int])];
                gd.field_n[4 - -var17_int][0] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) null, ur.field_j);
                var18 = 0;
                L22: while (true) {
                  if (var18 >= (dw.field_g[var17_int] & 255)) {
                    var17_int++;
                    continue L10;
                  } else {
                    L23: {
                      if (rha.field_e == null) {
                        var19_ref = null;
                        break L23;
                      } else {
                        if (rha.field_e[var17_int] == null) {
                          var19_ref = null;
                          break L23;
                        } else {
                          var19_ref = (Object) (Object) rha.field_e[var17_int][var18];
                          break L23;
                        }
                      }
                    }
                    L24: {
                      if (null == co.field_a) {
                        var20 = null;
                        break L24;
                      } else {
                        if (co.field_a[var17_int] == null) {
                          var20 = null;
                          break L24;
                        } else {
                          var20 = (Object) (Object) co.field_a[var17_int][var18];
                          break L24;
                        }
                      }
                    }
                    gd.field_n[var17_int + 4][var18 + 1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, (kv) var19_ref, (String) var20);
                    var18++;
                    continue L22;
                  }
                }
              }
            }
          } else {
            gd.field_n[0][var17_int + 1] = new gna(0L, uj.field_r, (sna) null, dla.field_k, ut.field_r[var17_int], cc.field_d[var17_int]);
            var17_int++;
            continue L5;
          }
        }
    }

    pna(pna param0) {
        this((sna) (Object) param0, param0.field_Db, param0.field_Fb, param0.field_Cb, param0.field_Eb, param0.field_xb, param0.field_vb, param0.field_Bb, param0.field_wb);
    }

    pna(sna param0, kv[] param1, sna param2, sna param3, int param4, int param5, int param6, int param7, int param8) {
        super(0L, param0);
        ((pna) this).field_Hb = new int[256];
        ((pna) this).field_Ab = -2;
        ((pna) this).field_Gb = new gna[256];
        try {
            ((pna) this).field_Fb = param2;
            ((pna) this).field_Eb = param4;
            ((pna) this).field_Db = param1;
            ((pna) this).field_Cb = param3;
            ((pna) this).field_Bb = param7;
            ((pna) this).field_xb = param5;
            ((pna) this).field_wb = param8;
            ((pna) this).field_vb = param6;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pna.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          if (((pna) this).field_yb == 0) {
            ((pna) this).field_Gb[((pna) this).field_yb] = new gna(0L, (sna) null, (sna) null, ((pna) this).field_Fb, (kv) null, hba.field_u);
            ((pna) this).field_Gb[((pna) this).field_yb].field_Y = 1;
            ((pna) this).a(-1, (sna) (Object) ((pna) this).field_Gb[((pna) this).field_yb]);
            ((pna) this).field_Hb[((pna) this).field_yb] = -1;
            ((pna) this).field_yb = ((pna) this).field_yb + 1;
            break L0;
          } else {
            break L0;
          }
        }
        var6 = 0;
        var7 = 0;
        L1: while (true) {
          if (((pna) this).field_yb <= var7) {
            L2: {
              var6 = var6 + ((pna) this).field_Eb * 2;
              var7 = ((pna) this).field_Bb - -(((pna) this).field_wb * ((pna) this).field_yb) + ((pna) this).field_Bb;
              var8 = oi.a(param0, var6, param2, -21264);
              if (!param1) {
                break L2;
              } else {
                ((pna) this).a(-23, true, -68, 36, -73);
                break L2;
              }
            }
            var9 = nga.a(var7, param4, (byte) 119, param3);
            ((pna) this).a(var7, 31407, var6, var8, var9);
            var10 = 0;
            L3: while (true) {
              if (var10 >= ((pna) this).field_yb) {
                return;
              } else {
                ((pna) this).field_Gb[var10].a(var6 + -(2 * ((pna) this).field_Eb), ((pna) this).field_xb, ((pna) this).field_wb, ((pna) this).field_Eb, ((pna) this).field_vb, (byte) -123, var10 * ((pna) this).field_wb + ((pna) this).field_Bb);
                var10++;
                continue L3;
              }
            }
          } else {
            var8 = ((pna) this).field_Gb[var7].a(120, ((pna) this).field_vb, ((pna) this).field_xb);
            if (var8 > var6) {
              var6 = var8;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    final int b(boolean param0, int param1) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        ((pna) this).a(19842, param0);
        if (!(param0)) {
            return -2;
        }
        for (var3 = 0; var3 < ((pna) this).field_yb; var3++) {
            if (((pna) this).field_Gb[var3].field_R != 0) {
                return ((pna) this).field_Hb[var3];
            }
        }
        if (param1 < 67) {
            ((pna) this).field_Db = null;
        }
        if (!(lf.field_c == 0)) {
            return -1;
        }
        return ((pna) this).field_Ab;
    }

    final void a(byte param0, String param1, kv param2, int param3) {
        try {
            ((pna) this).field_Gb[((pna) this).field_yb] = new gna(0L, (sna) null, (sna) null, ((pna) this).field_Cb, param2, param1);
            ((pna) this).field_Gb[((pna) this).field_yb].field_A = ((pna) this).field_Db;
            if (param0 < 8) {
                ((pna) this).a(63, false, -121, 19, -117);
            }
            ((pna) this).field_Gb[((pna) this).field_yb].field_qb = true;
            ((pna) this).field_Gb[((pna) this).field_yb].field_Y = 1;
            ((pna) this).a(-1, (sna) (Object) ((pna) this).field_Gb[((pna) this).field_yb]);
            ((pna) this).field_Hb[((pna) this).field_yb] = param3;
            ((pna) this).field_yb = ((pna) this).field_yb + 1;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pna.A(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    final boolean g(int param0) {
        if (((pna) this).field_Ab != -2) {
            return false;
        }
        if (!(13 != gf.field_k)) {
            ((pna) this).field_Ab = -1;
        }
        if (param0 != 0) {
            pna.a((kv[][]) null, -30, (vr) null, -6, (String[]) null, (byte[]) null, (byte[]) null, (String[][]) null, (String[]) null, true, 101, (String[]) null, (kv[][]) null, (int[]) null, (String[][]) null);
        }
        return true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = new rs[55];
    }
}
