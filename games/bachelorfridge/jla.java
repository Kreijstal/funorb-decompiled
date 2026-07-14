/*
 * Decompiled by CFR-JS 0.4.0.
 */
class jla {
    static rca field_a;
    int field_b;
    private jd field_e;
    static ee field_d;
    static String field_c;
    static String field_f;

    private final void b(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          if (nt.field_z == null) {
            if (null != pm.field_v) {
              bp.field_y = hha.field_y;
              vla.field_r = hb.field_k;
              vu.field_k = ik.field_h;
              nt.field_z = pm.field_v;
              break L0;
            } else {
              nt.field_z = bla.a(29611, "basic", "fly_small", wha.field_a);
              vla.field_r = new ee[2];
              var2 = 0;
              L1: while (true) {
                if (nt.field_z.length <= var2) {
                  bp.field_y = bla.a(29611, "basic", "maggot_small", wha.field_a);
                  vu.field_k = new ee[bp.field_y.length];
                  var2 = 0;
                  L2: while (true) {
                    if ((var2 ^ -1) <= (bp.field_y.length ^ -1)) {
                      break L0;
                    } else {
                      vu.field_k[var2] = bp.field_y[var2].b();
                      var2++;
                      continue L2;
                    }
                  }
                } else {
                  vla.field_r[var2] = nt.field_z[var2].b();
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          var2 = 590;
          var3 = 0;
          aha.field_D.c(ana.field_o[0], 25, 30, uga.field_v, -1);
          var3++;
          var3 = var3 + g.field_g.a(ana.field_o[1], 25, 30 + g.field_g.field_u * var3, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var3 += 2;
          aha.field_D.c(ana.field_o[2], 25, var3 * g.field_g.field_u + 40, uga.field_v, -1);
          var3 += 2;
          if (param0 == -56) {
            break L3;
          } else {
            field_d = null;
            break L3;
          }
        }
        L4: {
          g.field_g.c(ana.field_o[3], 25, 40 + g.field_g.field_u * var3, 3518976, -1);
          var3 += 2;
          g.field_g.c(ana.field_o[4], 25, 40 - -(g.field_g.field_u * var3), 3518976, -1);
          var3++;
          var2 -= 90;
          var3 = var3 + g.field_g.a(ana.field_o[5], 25, (var3 - -1) * g.field_g.field_u + 40, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var4 = 570;
          var5 = 20 + var3 * g.field_g.field_u;
          vw.field_a[2].field_b[102].a(-(vw.field_a[0].field_b[0].field_d / 2) + var4, 16 + var5);
          var6 = vr.field_b;
          var7 = (int)(Math.sin(0.5 * ((double)((var5 * var4 << 1471746946) + var6) / 40.0)) * 30.0);
          var8 = (int)(Math.cos((double)(var6 + (var4 * var5 << 607760674)) / 40.0 * 0.5) * 15.0);
          var3 += 7;
          if (-1 >= (var8 ^ -1)) {
            vla.field_r[(var6 >> 995949122) % 2].b(-7 + var4 - -var7, var5 - -var8, 16711680);
            break L4;
          } else {
            nt.field_z[(var6 >> 1345695810) % 2].b(var7 + var4 - 7, var5 + var8, 16711680);
            break L4;
          }
        }
        L5: {
          var3 = var3 + g.field_g.a(ana.field_o[6], 25, g.field_g.field_u * var3 + 40, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var5 = g.field_g.field_u * (-2 + var3) + 40;
          vw.field_a[1].field_b[102].a(-(vw.field_a[0].field_b[0].field_d / 2) + var4, var5 + -14);
          var7 = (int)(32.0 * Math.sin((double)(var6 + (var4 * var5 << -1057849950)) / 80.0 * 0.5));
          var8 = (int)(Math.cos(0.5 * ((double)((var5 * var4 << 1414470626) + var6) / 80.0)) * 15.0);
          var9 = 0.5 * ((double)(var6 - -(var4 * var5 << -499725822)) / 80.0) + 1.5707963267948966;
          if ((var8 ^ -1) > -1) {
            if (var9 % 3.141592653589793 <= 2.0943951023931953) {
              if (1.0471975511965976 >= var9 % 3.141592653589793) {
                bp.field_y[(var6 >> -827649949) % 5 + 5].a(var4 + (var7 - bp.field_y[0].field_a / 2), var5 - -var8);
                break L5;
              } else {
                bp.field_y[(var6 >> 1701099651) % 5].a(var7 + var4 - bp.field_y[0].field_a / 2, var8 + var5);
                break L5;
              }
            } else {
              bp.field_y[(var6 >> 1866250659) % 5 + 10].a(var4 + (var7 - bp.field_y[0].field_a / 2), var5 + var8);
              break L5;
            }
          } else {
            if (2.0943951023931953 >= var9 % 3.141592653589793) {
              if (var9 % 3.141592653589793 <= 1.0471975511965976) {
                vu.field_k[10 + (var6 >> 1400880899) % 5].a(-(bp.field_y[0].field_a / 2) + var7 + var4, var5 + var8);
                break L5;
              } else {
                vu.field_k[(var6 >> -496769277) % 5].a(-(bp.field_y[0].field_a / 2) + (var4 + var7), var5 + var8);
                break L5;
              }
            } else {
              vu.field_k[5 + (var6 >> 1782309955) % 5].a(-(bp.field_y[0].field_a / 2) + (var7 + var4), var5 + var8);
              break L5;
            }
          }
        }
    }

    final boolean d(int param0, int param1) {
        if (param1 != 26891) {
            jla.b(false, -112);
        }
        return ((jla) this).c(param0, 19950);
    }

    private final void c(byte param0) {
        int var2 = 590;
        int var3 = 0;
        aha.field_D.c(ana.field_u[0], 25, 30, uga.field_v, -1);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_u[1], 25, g.field_g.field_u * var3 + 30, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        if (param0 <= 103) {
            return;
        }
        var3 = var3 + g.field_g.a(ana.field_u[2], 25, 30 + g.field_g.field_u * var3, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_u[3], 25, var3 * g.field_g.field_u + 30, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
    }

    int a(int param0, boolean param1) {
        if (6 != ((jla) this).field_b) {
          L0: {
            if (param1) {
              break L0;
            } else {
              this.a(true);
              break L0;
            }
          }
          return pj.field_c[((jla) this).field_b];
        } else {
          if (0 == param0) {
            return de.field_I;
          } else {
            if (-3 != (param0 ^ -1)) {
              L1: {
                if ((ut.field_o ^ -1) == -1) {
                  break L1;
                } else {
                  if (kaa.field_m != 0) {
                    return pga.field_a;
                  } else {
                    break L1;
                  }
                }
              }
              return gha.field_e;
            } else {
              return pd.field_d;
            }
          }
        }
    }

    private final static void b(boolean param0, int param1) {
        uu var2 = null;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        qm.field_d.a(param1 + -8260, true);
        qm.field_d.a(vc.field_a * 32, false, 32, 105);
        ug.field_q.a(19842, true);
        ug.field_q.a(vc.field_a * 32, false, 32, 121);
        var2 = (uu) (Object) mda.field_b.field_z.b((byte) 90);
        L0: while (true) {
          if (var2 == null) {
            if (param1 == 28102) {
              L1: {
                bw.field_a.a(19842, true);
                if (bw.field_a.field_R != 1) {
                  break L1;
                } else {
                  L2: {
                    if (dea.field_n > mg.field_m.field_a) {
                      break L2;
                    } else {
                      if (-1 <= (gu.field_d ^ -1)) {
                        break L2;
                      } else {
                        if (lca.c(false)) {
                          if (-1 == (dga.field_a ^ -1)) {
                            L3: {
                              L4: {
                                qm.a(6, 7758);
                                if (af.field_a) {
                                  break L4;
                                } else {
                                  if (bp.e(-29919)) {
                                    break L4;
                                  } else {
                                    gs.field_f.a(false, iea.field_d);
                                    iea.field_d = new eaa();
                                    mg.field_m.field_a = mg.field_m.field_a - dea.field_n;
                                    gu.field_d = 0;
                                    dea.field_n = 0;
                                    break L3;
                                  }
                                }
                              }
                              gs.field_f.a(iea.field_d, 50);
                              pka.a((byte) -107, true);
                              break L3;
                            }
                            uca.a(33, (byte) 98);
                            break L1;
                          } else {
                            L5: {
                              if (dga.field_a != 1) {
                                break L5;
                              } else {
                                if ((1 + gs.field_f.field_d.field_c.field_n ^ -1) == (tp.field_v ^ -1)) {
                                  gs.field_f.e((byte) 8);
                                  tp.field_v = -1;
                                  break L1;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (-2 != (dga.field_a ^ -1)) {
                              break L1;
                            } else {
                              if ((gs.field_f.field_d.field_c.field_n - -1 ^ -1) != (tp.field_v ^ -1)) {
                                return;
                              } else {
                                break L1;
                              }
                            }
                          }
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  qm.a(32, 7758);
                  break L1;
                }
              }
              L6: {
                lfa.field_l.a(19842, true);
                if (-2 == (lfa.field_l.field_R ^ -1)) {
                  rs.a(true);
                  sia.field_h = true;
                  lg.a(true, -3, true);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                rv.field_l.a(19842, true);
                if (1 != rv.field_l.field_R) {
                  break L7;
                } else {
                  qm.a(7, param1 ^ 29576);
                  tha.field_p = tha.field_p - 1;
                  if ((tha.field_p ^ -1) > -1) {
                    tha.field_p = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                hk.field_c.a(param1 + -8260, true);
                if (hk.field_c.field_R != 1) {
                  break L8;
                } else {
                  qm.a(7, 7758);
                  tha.field_p = tha.field_p + 1;
                  if (tha.field_p <= gu.field_d + -1) {
                    break L8;
                  } else {
                    tha.field_p = gu.field_d + -1;
                    break L8;
                  }
                }
              }
              L9: {
                mg.field_l.a(param1 + -8260, true);
                if ((mg.field_l.field_R ^ -1) != -2) {
                  break L9;
                } else {
                  uca.a(31, (byte) -127);
                  qm.a(31, 7758);
                  baa.field_Q = 1;
                  lf.a(param1 ^ 28154);
                  break L9;
                }
              }
              L10: {
                qba.field_l.a(19842, true);
                if ((qba.field_l.field_R ^ -1) != -2) {
                  break L10;
                } else {
                  uca.a(31, (byte) -87);
                  qm.a(31, 7758);
                  baa.field_Q = 2;
                  lf.a(106);
                  break L10;
                }
              }
              L11: {
                dt.field_b.a(19842, true);
                if (dt.field_b.field_R != 1) {
                  break L11;
                } else {
                  uca.a(31, (byte) -10);
                  qm.a(31, param1 ^ 29576);
                  baa.field_Q = 3;
                  lf.a(82);
                  break L11;
                }
              }
              L12: {
                bea.field_u.a(19842, true);
                if (bea.field_u.field_R != 1) {
                  break L12;
                } else {
                  uca.a(31, (byte) 105);
                  qm.a(31, 7758);
                  baa.field_Q = 4;
                  lf.a(97);
                  break L12;
                }
              }
              L13: {
                sea.field_k.a(19842, true);
                if (-2 == (sea.field_k.field_R ^ -1)) {
                  uca.a(31, (byte) -91);
                  qm.a(31, param1 ^ 29576);
                  baa.field_Q = 5;
                  lf.a(76);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                mk.field_h.a(param1 ^ 8260, true);
                if (1 != mk.field_h.field_R) {
                  break L14;
                } else {
                  uca.a(31, (byte) -62);
                  qm.a(31, 7758);
                  baa.field_Q = 6;
                  lf.a(114);
                  break L14;
                }
              }
              L15: {
                mja.field_q.a(param1 ^ 8260, true);
                if (-2 != (mja.field_q.field_R ^ -1)) {
                  break L15;
                } else {
                  uca.a(31, (byte) -65);
                  qm.a(31, 7758);
                  baa.field_Q = 7;
                  lf.a(param1 ^ 28154);
                  break L15;
                }
              }
              L16: {
                rfa.field_b.a(19842, true);
                if (1 != rfa.field_b.field_R) {
                  break L16;
                } else {
                  uca.a(31, (byte) 120);
                  qm.a(31, param1 ^ 29576);
                  baa.field_Q = 8;
                  lf.a(103);
                  break L16;
                }
              }
              wa.e((byte) -87);
              return;
            } else {
              return;
            }
          } else {
            L17: {
              if ((var2.field_R ^ -1) != -2) {
                break L17;
              } else {
                L18: {
                  if ((dm.field_f ^ -1) < -1) {
                    break L18;
                  } else {
                    if (fw.field_h[var2.field_Cb].field_e) {
                      break L18;
                    } else {
                      var2 = (uu) (Object) mda.field_b.field_z.c(0);
                      continue L0;
                    }
                  }
                }
                uca.a(32, (byte) 121);
                qm.a(7, param1 ^ 29576);
                uka.a(param1 + -28204, var2.field_Cb, 1);
                break L17;
              }
            }
            var2 = (uu) (Object) mda.field_b.field_z.c(0);
            continue L0;
          }
        }
    }

    private final void h(int param0) {
        dg.b(0, 0, 640, 480, 65280, 4227136);
        aha.field_D.a(hl.field_E, 320, 240, 16777215, -1);
        if (param0 >= -120) {
            ((jla) this).field_e = null;
        }
    }

    void i(int param0) {
        ada.field_p.d(0, 0);
        gla.field_j.c(137, 0);
        ml.field_a.d(127, 0);
        int var2 = 137;
        bh.field_r.e(418 + var2, 41);
        if (ku.field_q) {
            // ifeq L73
            gca.field_g.e(var2 + 410, 148);
        } else {
            cba.field_a.e(var2 + 410, 148);
        }
        vj.field_p.e(154, 17);
        if (param0 != -12988) {
            ((jla) this).j(-44);
        }
    }

    private final void g(int param0) {
        if (param0 != 10) {
            field_f = null;
        }
        int var2 = hs.a(false, nga.field_i) ? 1 : 0;
        String var3 = nga.field_j;
        var3 = var3 + " " + jm.a((byte) 75, lga.a(true, new String[1], ja.a((byte) -48, false, false, var2 != 0)), '#', "<br><br>");
        int discarded$0 = aha.field_D.a(var3, 80, 200, 480, 300, 3518976, -1, 1, 0, 30);
    }

    private final void f(int param0) {
        if (wl.field_yb != null) {
        } else {
            if (ve.field_m != null) {
                wl.field_yb = ve.field_m;
            } else {
                wl.field_yb = new kv[4][];
                wl.field_yb[0] = pi.a(wha.field_a, -8845, "basic", "powerup_hp");
                wl.field_yb[1] = pi.a(wha.field_a, -8845, "basic", "powerup_speed");
                wl.field_yb[2] = pi.a(wha.field_a, param0 + -9140, "basic", "powerup_attack");
                wl.field_yb[3] = pi.a(wha.field_a, param0 + -9140, "basic", "powerup_special");
            }
        }
        int var2 = 590;
        aha.field_D.c(ana.field_s[0], 25, 30, uga.field_v, -1);
        int var3 = 0;
        var3++;
        var3 = var3 + g.field_g.a(ana.field_s[1], 25, g.field_g.field_u * var3 + 30, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3 += 2;
        aha.field_D.c(ana.field_s[2], 25, 40 + var3 * g.field_g.field_u, uga.field_v, -1);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_s[3], 25, 40 + var3 * g.field_g.field_u, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        int var4 = vr.field_b % (wl.field_yb[0].length * 4);
        wl.field_yb[2][var4 / 4].e(25, 40 + g.field_g.field_u * var3);
        g.field_g.c(ana.field_s[4], wl.field_yb[0][0].field_q + 35, wl.field_yb[0][0].field_p / 2 + g.field_g.field_u * var3 + (40 + g.field_g.field_u / 4), 3518976, -1);
        var3 += 3;
        wl.field_yb[3][var4 / 4].e(25, g.field_g.field_u * var3 + 40);
        g.field_g.c(ana.field_s[5], 10 + (25 - -wl.field_yb[0][0].field_q), wl.field_yb[0][0].field_p / 2 + (g.field_g.field_u * var3 + 40) + g.field_g.field_u / 4, 3518976, -1);
        if (param0 != 295) {
            ((jla) this).field_b = -24;
        }
        var3 += 3;
        wl.field_yb[0][var4 / 4].e(25, 40 - -(var3 * g.field_g.field_u));
        g.field_g.c(ana.field_s[6], wl.field_yb[0][0].field_q + 25 - -10, wl.field_yb[0][0].field_p / 2 + g.field_g.field_u * var3 + 40 + g.field_g.field_u / 4, 3518976, -1);
        var3 += 3;
        wl.field_yb[1][var4 / 4].e(25, 40 + var3 * g.field_g.field_u);
        int discarded$0 = g.field_g.a(ana.field_s[7], 25 - (-wl.field_yb[0][0].field_q + -10), -(g.field_g.field_u * 5 / 4) + wl.field_yb[0][0].field_p / 2 + (var3 * g.field_g.field_u + 40), -10 + (var2 - wl.field_yb[0][0].field_q), 430, 3518976, -1, 0, 0, g.field_g.field_u);
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (param0 == 25428) {
            break L0;
          } else {
            boolean discarded$1 = ((jla) this).c(-43, -128);
            break L0;
          }
        }
        L1: {
          L2: {
            if ((((jla) this).field_b ^ -1) == -16) {
              break L2;
            } else {
              if (((jla) this).field_b == 1) {
                break L2;
              } else {
                if ((((jla) this).field_b ^ -1) == -3) {
                  break L2;
                } else {
                  if (-5 != (((jla) this).field_b ^ -1)) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
            }
          }
          L3: {
            var2 = 255;
            if ((iba.field_s ^ -1) == (kaa.field_m ^ -1)) {
              break L3;
            } else {
              var2 = tma.field_v * 255 / 32;
              if ((((jla) this).field_b ^ -1) == (kaa.field_m ^ -1)) {
                break L3;
              } else {
                var2 = -var2 + 255;
                break L3;
              }
            }
          }
          L4: {
            var3 = 2;
            if (15 == ((jla) this).field_b) {
              var3 = 180;
              break L4;
            } else {
              if (-2 != (((jla) this).field_b ^ -1)) {
                break L4;
              } else {
                var3 = (-wt.field_q.field_p + 480) / 2;
                break L4;
              }
            }
          }
          L5: {
            if (-256 == (var2 ^ -1)) {
              wt.field_q.e((640 + -wt.field_q.field_q) / 2, var3);
              break L5;
            } else {
              wt.field_q.a((640 - wt.field_q.field_q) / 2, var3, var2);
              break L5;
            }
          }
          L6: {
            if (((jla) this).field_b == 2) {
              break L6;
            } else {
              if ((((jla) this).field_b ^ -1) == -5) {
                break L6;
              } else {
                break L1;
              }
            }
          }
          if (var2 != 255) {
            lp.field_q.a((-lp.field_q.field_q + 640) / 2, -2 + (-lp.field_q.field_p + 480), var2);
            break L1;
          } else {
            lp.field_q.e((-lp.field_q.field_q + 640) / 2, 480 - lp.field_q.field_p + -2);
            break L1;
          }
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var12 = null;
        int stackIn_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_77_0 = 0;
        L0: {
          var9 = BachelorFridge.field_y;
          if (-13 == (iba.field_s ^ -1)) {
            break L0;
          } else {
            L1: {
              if (((jla) this).field_e.field_b) {
                qm.a(17, 7758);
                break L1;
              } else {
                break L1;
              }
            }
            if (!((jla) this).field_e.e(0)) {
              break L0;
            } else {
              qm.a(18, param0 ^ -7788);
              break L0;
            }
          }
        }
        if (((jla) this).d(param1, 26891)) {
          if (hb.field_j) {
            return;
          } else {
            L2: {
              if (param0 == -38) {
                break L2;
              } else {
                field_c = null;
                break L2;
              }
            }
            L3: {
              var4 = pj.field_b[((jla) this).field_b][param1];
              var6 = var4;
              if (0 != var6) {
                L4: {
                  if ((var6 ^ -1) != -34) {
                    if ((var6 ^ -1) == -2) {
                      if (((jla) this).field_e.e(0)) {
                        if (null == mg.field_m) {
                          break L4;
                        } else {
                          if (!mg.field_m.a((byte) 122)) {
                            break L4;
                          } else {
                            if (mg.field_m.field_e.field_m.g(0) == 0) {
                              break L4;
                            } else {
                              if (!bp.e(-29919)) {
                                lg.a(true, -4, param2);
                                break L3;
                              } else {
                                L5: {
                                  if (!bp.e(param0 + -29881)) {
                                    stackOut_78_0 = 1;
                                    stackIn_79_0 = stackOut_78_0;
                                    break L5;
                                  } else {
                                    stackOut_77_0 = 0;
                                    stackIn_79_0 = stackOut_77_0;
                                    break L5;
                                  }
                                }
                                var6 = stackIn_79_0;
                                gu.a(8, param2, 6106, (po) (Object) aha.field_D, aha.field_D.field_B + aha.field_D.field_v, he.field_n, aha.field_D.field_v, true, (kv[]) null, 8, 240, 320, (kv[]) null, var6, 2);
                                break L3;
                              }
                            }
                          }
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      if (-3 != (var6 ^ -1)) {
                        if (var6 == 7) {
                          if (!((jla) this).field_e.e(0)) {
                            break L4;
                          } else {
                            lg.a(true, 0, param2);
                            break L3;
                          }
                        } else {
                          if (var6 != 24) {
                            if (-23 == (var6 ^ -1)) {
                              if (((jla) this).field_e.e(0)) {
                                lg.a(true, 7, param2);
                                break L3;
                              } else {
                                break L3;
                              }
                            } else {
                              if (-6 != (var6 ^ -1)) {
                                if ((var6 ^ -1) == -9) {
                                  if (!((jla) this).field_e.e(0)) {
                                    break L4;
                                  } else {
                                    lg.a(true, ut.field_o, param2);
                                    break L3;
                                  }
                                } else {
                                  if (var6 != 4) {
                                    if ((var6 ^ -1) == -21) {
                                      L6: {
                                        var5 = 0;
                                        if (!((jla) this).field_e.d(param0 + -9869)) {
                                          break L6;
                                        } else {
                                          if ((b.field_u ^ -1) >= -1) {
                                            break L6;
                                          } else {
                                            var5 = 1;
                                            di.a(true, 0);
                                            break L6;
                                          }
                                        }
                                      }
                                      L7: {
                                        if (!((jla) this).field_e.a(param0 ^ 37)) {
                                          break L7;
                                        } else {
                                          if ((b.field_u ^ -1) > -257) {
                                            di.a(true, 256);
                                            var5 = 1;
                                            break L7;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      L8: {
                                        if (!((jla) this).field_e.b(0)) {
                                          break L8;
                                        } else {
                                          L9: {
                                            var6 = ((jla) this).a(param1, true) - -((jla) this).b(param1, 40) - (-mv.field_n - -89) >> -819516319;
                                            var7 = mk.field_p - var6;
                                            var8 = 256 * var7 / 89;
                                            if (0 < var8) {
                                              if (256 <= var8) {
                                                di.a(true, 256);
                                                break L9;
                                              } else {
                                                di.a(true, var8);
                                                break L9;
                                              }
                                            } else {
                                              di.a(true, 0);
                                              break L9;
                                            }
                                          }
                                          var5 = 1;
                                          break L8;
                                        }
                                      }
                                      L10: {
                                        if (!((jla) this).field_e.c(-27)) {
                                          break L10;
                                        } else {
                                          if ((b.field_u ^ -1) >= -1) {
                                            break L10;
                                          } else {
                                            var5 = 1;
                                            gb.a(-9372);
                                            break L10;
                                          }
                                        }
                                      }
                                      L11: {
                                        if (!((jla) this).field_e.b((byte) -73)) {
                                          break L11;
                                        } else {
                                          if (256 > b.field_u) {
                                            var5 = 1;
                                            ii.c((byte) 62);
                                            break L11;
                                          } else {
                                            break L11;
                                          }
                                        }
                                      }
                                      if (var5 == 0) {
                                        break L4;
                                      } else {
                                        L12: {
                                          if (!((jla) this).field_e.b(param0 ^ -38)) {
                                            break L12;
                                          } else {
                                            if ((fia.field_q ^ -1) <= (vr.field_b ^ -1)) {
                                              break L4;
                                            } else {
                                              break L12;
                                            }
                                          }
                                        }
                                        cq discarded$1 = ol.a(kea.field_r[0], true);
                                        fia.field_q = 20 + vr.field_b;
                                        break L3;
                                      }
                                    } else {
                                      if (-22 == (var6 ^ -1)) {
                                        L13: {
                                          if (((jla) this).field_e.d(-9907)) {
                                            gka.a(-119, 0);
                                            break L13;
                                          } else {
                                            break L13;
                                          }
                                        }
                                        L14: {
                                          if (!((jla) this).field_e.a(param0 + 37)) {
                                            break L14;
                                          } else {
                                            gka.a(-52, 230);
                                            break L14;
                                          }
                                        }
                                        L15: {
                                          if (!((jla) this).field_e.b(param0 ^ -38)) {
                                            break L15;
                                          } else {
                                            var6 = -89 + (((jla) this).a(param1, true) + ((jla) this).b(param1, 40)) + mv.field_n >> -670901119;
                                            var7 = -var6 + mk.field_p;
                                            var8 = var7 * 230 / 89;
                                            if (var8 <= 0) {
                                              gka.a(-97, 0);
                                              break L15;
                                            } else {
                                              if (230 <= var8) {
                                                gka.a(param0 ^ -87, 230);
                                                break L15;
                                              } else {
                                                gka.a(81, var8);
                                                break L15;
                                              }
                                            }
                                          }
                                        }
                                        L16: {
                                          if (((jla) this).field_e.c(param0 ^ 88)) {
                                            sr.a((byte) -107);
                                            break L16;
                                          } else {
                                            break L16;
                                          }
                                        }
                                        if (!((jla) this).field_e.b((byte) -73)) {
                                          break L4;
                                        } else {
                                          bv.b(16964);
                                          break L3;
                                        }
                                      } else {
                                        if (6 == var6) {
                                          if (((jla) this).field_e.e(0)) {
                                            if (null != kga.field_c) {
                                              lga.c((byte) 119);
                                              break L3;
                                            } else {
                                              oq.a(param2, false);
                                              break L3;
                                            }
                                          } else {
                                            break L3;
                                          }
                                        } else {
                                          if ((var6 ^ -1) != -10) {
                                            if (-11 != (var6 ^ -1)) {
                                              if (var6 == 11) {
                                                if (((jla) this).field_e.e(0)) {
                                                  dj.field_c.field_e.d(-111);
                                                  lg.a(true, -1, param2);
                                                  break L3;
                                                } else {
                                                  break L3;
                                                }
                                              } else {
                                                if (12 != var6) {
                                                  if ((var6 ^ -1) == -14) {
                                                    if (!((jla) this).field_e.e(0)) {
                                                      break L4;
                                                    } else {
                                                      if (((jla) this).d(param1, param0 ^ -26927)) {
                                                        this.c(param2, param0 + -17769);
                                                        break L3;
                                                      } else {
                                                        break L3;
                                                      }
                                                    }
                                                  } else {
                                                    if (34 == var6) {
                                                      L17: {
                                                        L18: {
                                                          if (null == sna.field_fb) {
                                                            break L18;
                                                          } else {
                                                            if (sna.field_fb.field_e.field_a) {
                                                              break L17;
                                                            } else {
                                                              break L18;
                                                            }
                                                          }
                                                        }
                                                        L19: {
                                                          if (dj.field_c == null) {
                                                            break L19;
                                                          } else {
                                                            if (dj.field_c.field_e.field_a) {
                                                              break L17;
                                                            } else {
                                                              break L19;
                                                            }
                                                          }
                                                        }
                                                        if (!((jla) this).field_e.e(0)) {
                                                          break L4;
                                                        } else {
                                                          if (!((jla) this).d(param1, 26891)) {
                                                            break L4;
                                                          } else {
                                                            hp.field_c = -3;
                                                            ((dfa) (Object) dj.field_c).a(8, param2);
                                                            vs.field_d = false;
                                                            uca.a(39, (byte) -97);
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                      if (!((jla) this).field_e.e(0)) {
                                                        break L4;
                                                      } else {
                                                        if (((jla) this).d(param1, param0 ^ -26927)) {
                                                          this.c(param2, -17807);
                                                          break L3;
                                                        } else {
                                                          break L3;
                                                        }
                                                      }
                                                    } else {
                                                      if (17 != var6) {
                                                        if ((var6 ^ -1) != -19) {
                                                          if (-24 == (var6 ^ -1)) {
                                                            if (((jla) this).field_e.e(0)) {
                                                              if (9 != ((jla) this).field_b) {
                                                                L20: {
                                                                  if (7 == ((jla) this).field_b) {
                                                                    break L20;
                                                                  } else {
                                                                    if ((iba.field_s ^ -1) != -6) {
                                                                      break L4;
                                                                    } else {
                                                                      break L20;
                                                                    }
                                                                  }
                                                                }
                                                                au.a(((jla) this).field_b, gba.field_Ib, false);
                                                                break L3;
                                                              } else {
                                                                var12 = null;
                                                                au.a(8, (String) null, false);
                                                                break L3;
                                                              }
                                                            } else {
                                                              break L3;
                                                            }
                                                          } else {
                                                            if (25 != var6) {
                                                              if ((var6 ^ -1) != -27) {
                                                                if (var6 == 19) {
                                                                  if (((jla) this).field_e.e(param0 + 38)) {
                                                                    dh.a(nia.d(-31768), 124);
                                                                    break L3;
                                                                  } else {
                                                                    break L3;
                                                                  }
                                                                } else {
                                                                  if (27 == var6) {
                                                                    if (((jla) this).field_e.e(param0 + 38)) {
                                                                      break L4;
                                                                    } else {
                                                                      break L3;
                                                                    }
                                                                  } else {
                                                                    if (28 == var6) {
                                                                      if (((jla) this).field_e.e(0)) {
                                                                        break L4;
                                                                      } else {
                                                                        break L3;
                                                                      }
                                                                    } else {
                                                                      if ((var6 ^ -1) != -30) {
                                                                        if (-31 != (var6 ^ -1)) {
                                                                          if ((var6 ^ -1) == -32) {
                                                                            if (((jla) this).field_e.e(0)) {
                                                                              break L4;
                                                                            } else {
                                                                              break L3;
                                                                            }
                                                                          } else {
                                                                            if (32 == var6) {
                                                                              if (((jla) this).field_e.e(0)) {
                                                                                if (((jla) this).field_e.e(0)) {
                                                                                  lg.a(true, 14, param2);
                                                                                  break L4;
                                                                                } else {
                                                                                  break L3;
                                                                                }
                                                                              } else {
                                                                                break L3;
                                                                              }
                                                                            } else {
                                                                              break L3;
                                                                            }
                                                                          }
                                                                        } else {
                                                                          if (((jla) this).field_e.e(0)) {
                                                                            break L4;
                                                                          } else {
                                                                            break L3;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        if (!((jla) this).field_e.e(0)) {
                                                                          break L4;
                                                                        } else {
                                                                          break L3;
                                                                        }
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                if (!((jla) this).field_e.e(param0 ^ -38)) {
                                                                  break L4;
                                                                } else {
                                                                  if (((jla) this).d(param1, param0 + 26929)) {
                                                                    ie.field_a = ie.field_a + 1;
                                                                    break L3;
                                                                  } else {
                                                                    break L3;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              if (!((jla) this).field_e.e(0)) {
                                                                break L4;
                                                              } else {
                                                                if (((jla) this).d(param1, 26891)) {
                                                                  ie.field_a = ie.field_a - 1;
                                                                  break L3;
                                                                } else {
                                                                  break L3;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        } else {
                                                          if (!((jla) this).field_e.e(0)) {
                                                            break L4;
                                                          } else {
                                                            ks.field_i = 1;
                                                            break L3;
                                                          }
                                                        }
                                                      } else {
                                                        if (((jla) this).field_e.e(param0 ^ -38)) {
                                                          ks.field_i = 0;
                                                          break L3;
                                                        } else {
                                                          break L3;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  if (!((jla) this).field_e.e(0)) {
                                                    break L4;
                                                  } else {
                                                    if (null != sna.field_fb) {
                                                      break L4;
                                                    } else {
                                                      dj.field_c.field_e.b((byte) 27);
                                                      lg.a(true, -1, param2);
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              if (((jla) this).field_e.e(param0 + 38)) {
                                                dj.field_c.field_e.b(param0 + 97);
                                                lg.a(true, -1, param2);
                                                break L3;
                                              } else {
                                                break L3;
                                              }
                                            }
                                          } else {
                                            if (!((jla) this).field_e.e(0)) {
                                              break L4;
                                            } else {
                                              L21: {
                                                if (null != dj.field_c) {
                                                  ((dfa) (Object) dj.field_c).a(8, param2);
                                                  break L21;
                                                } else {
                                                  break L21;
                                                }
                                              }
                                              L22: {
                                                if (gs.field_f == null) {
                                                  break L22;
                                                } else {
                                                  gs.field_f.b(param2, false);
                                                  break L22;
                                                }
                                              }
                                              vs.field_d = false;
                                              sia.field_h = false;
                                              nu.field_b = true;
                                              if (!mg.field_m.a((byte) 102)) {
                                                L23: {
                                                  if (!bp.e(param0 + -29881)) {
                                                    h.c((byte) -69);
                                                    break L23;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                                mg.field_m.b(param0 ^ -27157);
                                                break L3;
                                              } else {
                                                break L3;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    if (!((jla) this).field_e.e(param0 ^ -38)) {
                                      break L4;
                                    } else {
                                      lg.a(true, 5, param2);
                                      break L3;
                                    }
                                  }
                                }
                              } else {
                                if (!((jla) this).field_e.e(param0 ^ -38)) {
                                  break L4;
                                } else {
                                  ie.field_a = 0;
                                  lg.a(true, 6, param2);
                                  break L3;
                                }
                              }
                            }
                          } else {
                            if (!((jla) this).field_e.e(0)) {
                              break L4;
                            } else {
                              lg.a(true, 11, param2);
                              ai.field_c = true;
                              break L3;
                            }
                          }
                        }
                      } else {
                        if (!((jla) this).field_e.e(0)) {
                          break L4;
                        } else {
                          L24: {
                            if (dj.field_c != null) {
                              break L24;
                            } else {
                              if (sna.field_fb != null) {
                                break L24;
                              } else {
                                lg.a(true, -3, param2);
                                break L3;
                              }
                            }
                          }
                          lg.a(true, -1, param2);
                          break L3;
                        }
                      }
                    }
                  } else {
                    if (!((jla) this).field_e.e(0)) {
                      break L4;
                    } else {
                      lg.a(true, 15, param2);
                      break L3;
                    }
                  }
                }
                break L3;
              } else {
                if (((jla) this).field_e.e(0)) {
                  L25: {
                    if (mg.field_m == null) {
                      break L25;
                    } else {
                      if (mg.field_m.a((byte) 118)) {
                        break L25;
                      } else {
                        L26: {
                          if (bp.e(param0 ^ 29947)) {
                            break L26;
                          } else {
                            h.c((byte) -69);
                            break L26;
                          }
                        }
                        mg.field_m.b(27185);
                        break L25;
                      }
                    }
                  }
                  kj.b((byte) -88);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final void c(boolean param0, int param1) {
        if (!(!vs.field_d)) {
            lg.a(true, -5, param0);
        }
        if (param1 != -17807) {
            field_d = null;
        }
        if (gja.field_n) {
            sfa.a(11, 0, false);
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var3 = BachelorFridge.field_y;
        if (!param0) {
            ((jla) this).field_b = 117;
        }
        for (var2 = 0; (((jla) this).field_e.field_e ^ -1) < (var2 ^ -1); var2++) {
            if (!(!((jla) this).c(var2, 19950))) {
                ((jla) this).b((((jla) this).field_e.field_g ^ -1) == (var2 ^ -1) ? true : false, var2, 0);
            }
        }
    }

    final String d(boolean param0, int param1) {
        String var3 = null;
        String var3_ref = null;
        int var4 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          var3 = lr.field_k[param1];
          if (!param0) {
            break L0;
          } else {
            field_d = null;
            break L0;
          }
        }
        L1: {
          if (-9 != (param1 ^ -1)) {
            break L1;
          } else {
            L2: {
              if (-1 == (ut.field_o ^ -1)) {
                break L2;
              } else {
                if ((kaa.field_m ^ -1) == -1) {
                  break L2;
                } else {
                  if (11 == ut.field_o) {
                    break L2;
                  } else {
                    if (-12 != (kaa.field_m ^ -1)) {
                      L3: {
                        if (1 == ut.field_o) {
                          break L3;
                        } else {
                          if ((kaa.field_m ^ -1) == -2) {
                            break L3;
                          } else {
                            L4: {
                              if (2 == ut.field_o) {
                                break L4;
                              } else {
                                if (-3 == (kaa.field_m ^ -1)) {
                                  break L4;
                                } else {
                                  if ((ut.field_o ^ -1) == -4) {
                                    break L4;
                                  } else {
                                    if (-4 == (kaa.field_m ^ -1)) {
                                      break L4;
                                    } else {
                                      if (4 == ut.field_o) {
                                        break L4;
                                      } else {
                                        if (kaa.field_m == 4) {
                                          break L4;
                                        } else {
                                          if ((kaa.field_m ^ -1) == (ut.field_o ^ -1)) {
                                            var3 = lr.field_k[7];
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            var3_ref = mp.field_t;
                            break L1;
                          }
                        }
                      }
                      var3_ref = baa.field_E;
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            var3 = lr.field_k[7];
            break L1;
          }
        }
        return var3_ref;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          if (null != eea.field_a) {
            break L0;
          } else {
            L1: {
              if (null == wq.field_k) {
                wq.field_k = wfa.a("creatureviewer_bg", wha.field_a, "basic", (byte) 58);
                eea.field_a = wfa.a("creatureviewer_bg", wha.field_a, "basic", (byte) 58);
                break L1;
              } else {
                eea.field_a = wq.field_k;
                break L1;
              }
            }
            jm.field_i = new lna(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
            jm.field_i.a(false, 1, 1, true, 0);
            i.field_d = new lna(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
            i.field_d.a(false, 1, 1, true, 0);
            break L0;
          }
        }
        var2 = 590;
        aha.field_D.c(ana.field_k[0], 25, 30, uga.field_v, -1);
        var3 = 0;
        var3++;
        var3 = var3 + g.field_g.a(ana.field_k[1], 25, 30 - -(var3 * g.field_g.field_u), var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var4 = 35 + g.field_g.field_u * var3 + eea.field_a.field_p / 4;
        bh.field_r.e(25, var4 - bh.field_r.field_p / 2);
        jm.field_i.c(11);
        i.field_d.c(11);
        jm.field_i.a(false, false, 2048, 2048, 0, -121, 256, bh.field_r.field_q + 45, -(3 * bd.field_i.field_p / 8) + var4);
        eea.field_a.c(615 + -(eea.field_a.field_q / 2), -(eea.field_a.field_p / 4) + var4, eea.field_a.field_q / 2, eea.field_a.field_p / 2);
        i.field_d.a(false, false, 2048, 2048, 0, -46, 256, 615 + -(eea.field_a.field_q * 15 / 32), var4 - bd.field_i.field_p * 29 / 64);
        dg.c(45 + bh.field_r.field_q, var4 - 5, 20, 4, 3518976);
        dg.c(53 - -bh.field_r.field_q, var4 - 13, 4, 20, 3518976);
        dg.c(163 + bh.field_r.field_q, -8 + var4, 20, 4, 3518976);
        dg.c(bh.field_r.field_q + 163, var4 + -2, 20, 4, 3518976);
        var5 = -116 % ((-51 - param0) / 57);
        var3 += 16;
        aha.field_D.c(ana.field_k[2], 25, 40 + g.field_g.field_u * var3, uga.field_v, -1);
        var3++;
        var3 = var3 + g.field_g.a(ana.field_k[3], 25, 40 + g.field_g.field_u * var3, var2, 430, 3518976, -1, 0, 0, g.field_g.field_u);
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          var4 = BachelorFridge.field_y;
          if (param0 == 89) {
            break L0;
          } else {
            this.n(57);
            break L0;
          }
        }
        L1: {
          if (!((jla) this).d(0, 26891)) {
            stackOut_4_0 = 1;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 0;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var2 = stackIn_5_0;
          if (((jla) this).d(2, 26891)) {
            stackOut_7_0 = 2;
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = 1;
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          L4: {
            var3 = stackIn_8_0;
            if (!((jla) this).field_e.b(0)) {
              L5: {
                if (gf.field_k != 96) {
                  break L5;
                } else {
                  if ((((jla) this).field_e.field_g ^ -1) < (var2 ^ -1)) {
                    ((jla) this).field_e.b(param0 ^ 56, -1 + ((jla) this).field_e.field_g);
                    break L5;
                  } else {
                    ((jla) this).field_e.b(114, var3);
                    break L5;
                  }
                }
              }
              if (97 == gf.field_k) {
                L6: {
                  if ((((jla) this).field_e.field_g ^ -1) > -1) {
                    break L6;
                  } else {
                    if (((jla) this).field_e.field_g < var3) {
                      ((jla) this).field_e.b(118, ((jla) this).field_e.field_g - -1);
                      break L4;
                    } else {
                      break L6;
                    }
                  }
                }
                ((jla) this).field_e.b(param0 ^ 2, var2);
                break L4;
              } else {
                ((jla) this).field_e.a(true);
                break L3;
              }
            } else {
              break L4;
            }
          }
          ((jla) this).field_e.a(true);
          break L3;
        }
    }

    int a(int param0, byte param1) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        if (-7 != (((jla) this).field_b ^ -1)) {
          L0: {
            if (param1 < -38) {
              break L0;
            } else {
              ((jla) this).field_b = -66;
              break L0;
            }
          }
          L1: {
            if (2 == ((jla) this).field_b) {
              break L1;
            } else {
              if (-5 == (((jla) this).field_b ^ -1)) {
                break L1;
              } else {
                return pj.field_h[((jla) this).field_b] - -(pj.field_o[((jla) this).field_b] * param0);
              }
            }
          }
          L2: {
            var3 = pj.field_h[((jla) this).field_b] - -(param0 * pj.field_o[((jla) this).field_b]);
            if (ng.a((byte) -24)) {
              stackOut_13_0 = 4;
              stackIn_14_0 = stackOut_13_0;
              break L2;
            } else {
              stackOut_12_0 = 5;
              stackIn_14_0 = stackOut_12_0;
              break L2;
            }
          }
          L3: {
            var4 = stackIn_14_0;
            if (param0 >= var4) {
              var3 = pj.field_o[((jla) this).field_b] * (-var4 + param0) + 294;
              break L3;
            } else {
              break L3;
            }
          }
          return var3;
        } else {
          L4: {
            if (0 == param0) {
              break L4;
            } else {
              if (2 != param0) {
                return bb.field_F;
              } else {
                break L4;
              }
            }
          }
          return pj.field_h[((jla) this).field_b];
        }
    }

    boolean c(int param0, int param1) {
        if (!(-7 != (((jla) this).field_b ^ -1))) {
            if (0 == param0) {
                if (ie.field_a == 0) {
                    return false;
                }
            }
            if ((param0 ^ -1) == -3) {
                if ((ie.field_a ^ -1) == -6) {
                    return false;
                }
            }
        }
        if (param1 != 19950) {
            field_d = null;
        }
        if ((((jla) this).field_b ^ -1) != -4) {
            return true;
        }
        if ((param0 ^ -1) == -1) {
            if (sna.field_fb != null) {
                return false;
            }
        }
        return true;
    }

    private final void m(int param0) {
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        int var2 = 0;
        while ((var2 ^ -1) > -641) {
            var3 = 0;
            while (480 > var3) {
                mr.field_f.e(var2, var3);
                var3 = var3 + mr.field_f.field_p;
            }
            var2 = var2 + mr.field_f.field_q;
        }
        dg.a(10, 10, 620, 460, 10, 0, 192);
        var2 = -124 % ((param0 - 65) / 33);
        g.field_g.b(jm.a((byte) -117, ie.field_a), 600, 460, uga.field_v, -1);
    }

    int b(int param0, int param1) {
        if (((jla) this).field_b == 6) {
            if (-1 != (param0 ^ -1)) {
                if (-3 != (param0 ^ -1)) {
                    if ((ut.field_o ^ -1) != -1) {
                        if ((kaa.field_m ^ -1) != -1) {
                            return ((jla) this).a(param0, true) + 150;
                        }
                    }
                    return 60 + ((jla) this).a(param0, true);
                }
            }
            return ((jla) this).a(param0, true) + sia.field_j.field_p / 2;
        }
        if (param1 != 40) {
            ((jla) this).field_e = null;
        }
        return pj.field_l[((jla) this).field_b];
    }

    public static void b(boolean param0) {
        field_d = null;
        field_f = null;
        if (!param0) {
            return;
        }
        field_a = null;
        field_c = null;
    }

    private final void n(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          this.m(116);
          ((jla) this).c(true);
          var2 = ie.field_a;
          if (0 != var2) {
            if ((var2 ^ -1) == -2) {
              this.f(295);
              break L0;
            } else {
              if ((var2 ^ -1) != -3) {
                if ((var2 ^ -1) != -4) {
                  if (4 == var2) {
                    this.b(-46);
                    break L0;
                  } else {
                    if ((var2 ^ -1) != -6) {
                      break L0;
                    } else {
                      this.c((byte) 110);
                      break L0;
                    }
                  }
                } else {
                  this.b((byte) -56);
                  break L0;
                }
              } else {
                this.a((byte) -124);
                break L0;
              }
            }
          } else {
            this.d(2);
            break L0;
          }
        }
        L1: {
          if (param0 == 4) {
            break L1;
          } else {
            ((jla) this).j(-58);
            break L1;
          }
        }
    }

    void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        var3 = BachelorFridge.field_y;
        if (param0 == 8456) {
          if (((jla) this).field_b != 11) {
            L0: {
              if (12 != ((jla) this).field_b) {
                break L0;
              } else {
                jla.b(true, param0 ^ 19662);
                break L0;
              }
            }
            L1: {
              if (bka.field_h) {
                break L1;
              } else {
                L2: {
                  if (pha.field_a) {
                    break L2;
                  } else {
                    if ((((jla) this).field_b ^ -1) == (kaa.field_m ^ -1)) {
                      L3: while (true) {
                        if (!kaa.b(127)) {
                          ((jla) this).field_e.a(this.a(false, nfa.field_a, jc.field_r), -128, this.a(false, mk.field_p, gd.field_m));
                          if (-1 == ((jla) this).field_e.field_g) {
                            break L2;
                          } else {
                            this.a((byte) -38, ((jla) this).field_e.field_g, true);
                            break L1;
                          }
                        } else {
                          if (13 != gf.field_k) {
                            this.d(false);
                            if (((jla) this).field_e.field_g == -1) {
                              continue L3;
                            } else {
                              this.a((byte) -38, ((jla) this).field_e.field_g, false);
                              continue L3;
                            }
                          } else {
                            if (((jla) this).field_b != 3) {
                              L4: {
                                L5: {
                                  if (((jla) this).field_b == 1) {
                                    break L5;
                                  } else {
                                    if (2 == ((jla) this).field_b) {
                                      break L5;
                                    } else {
                                      if (-5 == (((jla) this).field_b ^ -1)) {
                                        break L5;
                                      } else {
                                        if ((((jla) this).field_b ^ -1) != -14) {
                                          break L4;
                                        } else {
                                          break L5;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (kaa.field_m == 0) {
                                  break L4;
                                } else {
                                  if (-1 == (iba.field_s ^ -1)) {
                                    break L4;
                                  } else {
                                    if (-8 == (iba.field_s ^ -1)) {
                                      break L4;
                                    } else {
                                      if (-9 == (iba.field_s ^ -1)) {
                                        break L4;
                                      } else {
                                        if (10 == iba.field_s) {
                                          break L4;
                                        } else {
                                          if ((iba.field_s ^ -1) != -4) {
                                            L6: {
                                              if (null != dj.field_c) {
                                                break L6;
                                              } else {
                                                if (sna.field_fb != null) {
                                                  break L6;
                                                } else {
                                                  L7: {
                                                    if ((((jla) this).field_b ^ -1) != -14) {
                                                      break L7;
                                                    } else {
                                                      if (gs.field_f == null) {
                                                        hb.a(2, ut.field_o, ut.field_o, false);
                                                        continue L3;
                                                      } else {
                                                        break L7;
                                                      }
                                                    }
                                                  }
                                                  lg.a(true, -3, false);
                                                  continue L3;
                                                }
                                              }
                                            }
                                            lg.a(true, -1, false);
                                            continue L3;
                                          } else {
                                            break L4;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              if (-10 == (iba.field_s ^ -1)) {
                                continue L3;
                              } else {
                                if (iba.field_s == 0) {
                                  continue L3;
                                } else {
                                  hb.a(2, ut.field_o, ut.field_o, false);
                                  continue L3;
                                }
                              }
                            } else {
                              continue L3;
                            }
                          }
                        }
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                break L1;
              }
            }
            return;
          } else {
            L8: {
              if (nma.e(-8774)) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L8;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L8;
              }
            }
            L9: {
              var2 = em.a(stackIn_6_0 != 0, param0 ^ 8456);
              if ((var2 ^ -1) == -4) {
                L10: {
                  if (null != kga.field_c) {
                    lga.c((byte) 119);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                rj.a(param0 + -38592, nia.d(-31768));
                break L9;
              } else {
                break L9;
              }
            }
            L11: {
              if (1 == var2) {
                lg.a(true, 0, false);
                break L11;
              } else {
                break L11;
              }
            }
            L12: {
              if ((var2 ^ -1) == -3) {
                lg.a(true, 0, true);
                break L12;
              } else {
                break L12;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final int a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = BachelorFridge.field_y;
        if (param0) {
            jla.b(false);
        }
        for (var4 = 0; pj.field_b[((jla) this).field_b].length > var4; var4++) {
            var5 = ((jla) this).a(var4, (byte) -115);
            if (((jla) this).c(var4, 19950)) {
                if ((((jla) this).a(var4, true) ^ -1) >= (param1 ^ -1)) {
                    if (param1 < ((jla) this).b(var4, 40)) {
                        if (var5 <= param2) {
                            if (!((param2 ^ -1) <= (((jla) this).a(105, var4) + var5 ^ -1))) {
                                return var4;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    private final void d(boolean param0) {
        int var3 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          if (-7 == (iba.field_s ^ -1)) {
            this.k(89);
            break L0;
          } else {
            L1: {
              if (-6 != (iba.field_s ^ -1)) {
                break L1;
              } else {
                if (bp.e(-29919)) {
                  break L1;
                } else {
                  this.a(true);
                  break L0;
                }
              }
            }
            ((jla) this).field_e.b(true);
            break L0;
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            ((jla) this).field_b = 31;
            break L2;
          }
        }
    }

    void j(int param0) {
        if (-6 == (((jla) this).field_b ^ -1)) {
            ri.field_b = null;
        }
        if (param0 != -5) {
            field_c = null;
        }
    }

    int a(int param0, int param1) {
        int var3 = -128 / ((param0 - -64) / 38);
        return 36;
    }

    jla(int param0) {
        ((jla) this).field_b = param0;
        ((jla) this).field_e = new jd(pj.field_b[((jla) this).field_b].length);
    }

    void b(boolean param0, int param1, int param2) {
        int var4 = 0;
        String var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var20 = null;
        int stackIn_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_33_0 = 0;
        L0: {
          var16 = BachelorFridge.field_y;
          if (-7 != (((jla) this).field_b ^ -1)) {
            break L0;
          } else {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                if (-3 == (param1 ^ -1)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              var4 = ((jla) this).a(param1, true) - -(sia.field_j.field_p / 4);
              var5_int = ((jla) this).a(param1, (byte) -88) + sia.field_j.field_q / 4;
              var6 = 16384;
              if (2 != param1) {
                break L2;
              } else {
                var6 = -16384;
                break L2;
              }
            }
            if (!param0) {
              sia.field_j.a(var6, var5_int, var4, -1049413117, 2048);
              return;
            } else {
              et.field_p.a(var6, var5_int, var4, -1049413117, 2048);
              return;
            }
          }
        }
        L3: {
          L4: {
            var4 = pj.field_b[((jla) this).field_b][param1];
            var5 = ((jla) this).d(false, var4);
            var6 = dja.field_l.a(var5);
            var7 = ((jla) this).a(param1, true);
            var8 = ((jla) this).b(param1, 40);
            var9 = ((jla) this).a(param1, (byte) -121);
            if (-21 == (var4 ^ -1)) {
              break L4;
            } else {
              if (var4 != 21) {
                break L3;
              } else {
                break L4;
              }
            }
          }
          var6 = mv.field_n + 103;
          break L3;
        }
        L5: {
          L6: {
            var10 = -var6 + (var7 + var8) >> 301888225;
            var11 = ((jla) this).a(-22, param1);
            int discarded$1 = ((jla) this).a(param2 ^ param2, param1);
            var12 = 0;
            var13 = 0;
            if ((((jla) this).field_b ^ -1) == -16) {
              break L6;
            } else {
              if (-2 == (((jla) this).field_b ^ -1)) {
                break L6;
              } else {
                if (-3 == (((jla) this).field_b ^ -1)) {
                  break L6;
                } else {
                  if ((((jla) this).field_b ^ -1) == -5) {
                    break L6;
                  } else {
                    L7: {
                      if (1 != var4) {
                        break L7;
                      } else {
                        if (null == mg.field_m) {
                          break L7;
                        } else {
                          L8: {
                            if (!mg.field_m.a((byte) 103)) {
                              break L8;
                            } else {
                              if (-1 != (mg.field_m.field_e.field_m.g(0) ^ -1)) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var12 = 5921370;
                          var13 = 5921370;
                          break L5;
                        }
                      }
                    }
                    if (!param0) {
                      var12 = 3260416;
                      var13 = 1789952;
                      break L5;
                    } else {
                      var13 = 4500243;
                      var12 = 6939164;
                      break L5;
                    }
                  }
                }
              }
            }
          }
          if (!param0) {
            var12 = 16763392;
            var13 = 16763392;
            break L5;
          } else {
            var13 = 15854080;
            var12 = 15854080;
            break L5;
          }
        }
        L9: {
          L10: {
            var20 = a.a(var12, 32, param2 + 16763049, var13);
            gna.a(true, var20, var5, var10, false, var9 + aha.field_D.field_u);
            if (20 == var4) {
              break L10;
            } else {
              if ((var4 ^ -1) != -22) {
                break L9;
              } else {
                break L10;
              }
            }
          }
          L11: {
            var10 = var10 + mv.field_n;
            ls.field_c.c(var10, var9);
            dg.a(dfa.field_c);
            if (var4 != 20) {
              stackOut_34_0 = 89 * bs.field_k / 230;
              stackIn_35_0 = stackOut_34_0;
              break L11;
            } else {
              stackOut_33_0 = 89 * b.field_u / 256;
              stackIn_35_0 = stackOut_33_0;
              break L11;
            }
          }
          var15 = stackIn_35_0;
          var15 += 7;
          dg.a(var10, var9, var15 + var10, var9 - -var11);
          ni.field_j.c(var10, var9);
          dg.b(dfa.field_c);
          qw.field_c.e(-qw.field_c.field_q + 2 * var15 + 2 * var10 >> 320453569, -var11 + (2 * qw.field_c.field_p + var9 * 2) >> 1710533217);
          break L9;
        }
    }

    private final void a(boolean param0) {
        int var3 = BachelorFridge.field_y;
        if ((gf.field_k ^ -1) == -97) {
            if (((jla) this).field_e.field_g <= 0) {
                ((jla) this).field_e.b(105, 1);
            } else {
                if (!(((jla) this).field_e.field_g == 2)) {
                    ((jla) this).field_e.b(115, 0);
                }
            }
        }
        if (97 == gf.field_k) {
            if (((jla) this).field_e.field_g != 1) {
                // if_icmpeq L120
                ((jla) this).field_e.b(109, 1);
            } else {
                ((jla) this).field_e.b(106, 0);
            }
        }
        if ((gf.field_k ^ -1) == -100) {
            if (((jla) this).field_e.field_g >= 0) {
                // if_icmpgt L164
                ((jla) this).field_e.b(89, 2);
            } else {
                ((jla) this).field_e.b(108, ks.field_i);
            }
        }
        if (98 != gf.field_k) {
        } else {
            if ((((jla) this).field_e.field_g ^ -1) != -3) {
                ((jla) this).field_e.b(91, 2);
            } else {
                ((jla) this).field_e.b(100, ks.field_i);
            }
        }
        ((jla) this).field_e.a(param0);
    }

    void a(boolean param0, int param1) {
        int var3 = 0;
        if (!(11 != ((jla) this).field_b)) {
            var3 = -1;
        }
        if (0 != (((jla) this).field_e.field_g ^ -1)) {
            var3 = ((jla) this).field_e.field_g;
        }
        ((jla) this).field_e.a(param0, 115, this.a(false, mk.field_p, gd.field_m), var3);
        fia.field_q = vr.field_b;
        if (param1 != 32) {
            this.a((byte) -76);
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var2 = 590;
          aha.field_D.c(ana.field_t[0], 25, 30, uga.field_v, -1);
          var3 = 0;
          var3 += 2;
          g.field_g.c(ana.field_t[1], 25, 30 + g.field_g.field_u * var3, 3518976, -1);
          var3++;
          vw.field_a[0].field_b[80].a(25, 30 - -(var3 * g.field_g.field_u), 64, 32);
          var3 = var3 + g.field_g.a(ana.field_t[2], 99, var3 * g.field_g.field_u + 30, -64 + (var2 + -10), 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var3++;
          vw.field_a[2].field_b[80].a(25, 30 + var3 * g.field_g.field_u, 64, 32);
          var3 = var3 + g.field_g.a(ana.field_t[3], 99, 30 + g.field_g.field_u * var3, -10 + var2 + -64, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var3++;
          vw.field_a[1].field_b[80].a(25, var3 * g.field_g.field_u + 30, 64, 32);
          var3 = var3 + g.field_g.a(ana.field_t[4], 99, g.field_g.field_u * var3 + 30, var2 + -64 + -10, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var3 += 4;
          if (param0 <= -20) {
            break L0;
          } else {
            this.c((byte) 26);
            break L0;
          }
        }
        aha.field_D.c(ana.field_t[5], 25, 30 - -(g.field_g.field_u * var3), uga.field_v, -1);
        var3++;
        vw.field_a[0].field_b[120].a(25, 30 - -(var3 * g.field_g.field_u), 64, 32);
        vw.field_a[2].field_b[120].a(89, g.field_g.field_u * var3 + 30, 64, 32);
        vw.field_a[1].field_b[120].a(153, 30 - -(g.field_g.field_u * var3), 64, 32);
        g.field_g.c(ana.field_t[6], 227, 30 + (g.field_g.field_u * (var3 + 1) - -(3 * g.field_g.field_u / 8)), 3518976, -1);
        var3 += 3;
        vw.field_a[0].field_b[88].a(25, 30 + g.field_g.field_u * var3, 64, 32);
        vw.field_a[2].field_b[88].a(89, g.field_g.field_u * var3 + 30, 64, 32);
        vw.field_a[1].field_b[88].a(153, 30 - -(g.field_g.field_u * var3), 64, 32);
        var3 = var3 + g.field_g.a(ana.field_t[7], 227, 30 + g.field_g.field_u * var3, -10 + (-192 + var2), 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3 += 2;
        vw.field_a[0].field_b[80].a(25, 30 - -(g.field_g.field_u * var3), 64, 32);
        vw.field_a[0].field_b[103].a(25, 30 + g.field_g.field_u * var3, 64, 32);
        vw.field_a[0].field_b[95].a(25, -32 + (30 - -(var3 * g.field_g.field_u)), 64, 32);
        vw.field_a[2].field_b[80].a(89, 30 - -(var3 * g.field_g.field_u), 64, 32);
        vw.field_a[2].field_b[103].a(89, var3 * g.field_g.field_u + 30, 64, 32);
        vw.field_a[2].field_b[95].a(89, var3 * g.field_g.field_u + 30 - 32, 64, 32);
        vw.field_a[1].field_b[80].a(153, g.field_g.field_u * var3 + 30, 64, 32);
        vw.field_a[1].field_b[103].a(153, 30 - -(g.field_g.field_u * var3), 64, 32);
        vw.field_a[1].field_b[95].a(153, 30 + var3 * g.field_g.field_u - 32, 64, 32);
        var3 = var3 + g.field_g.a(ana.field_t[8], 227, 30 + (var3 * g.field_g.field_u + -(g.field_g.field_u / 2)), -192 + var2 + -10, 430, 3518976, -1, 0, 0, g.field_g.field_u);
        var3++;
        vw.field_a[0].field_b[80].a(25, 30 - -(g.field_g.field_u * var3), 64, 32);
        vw.field_a[0].field_b[109].a(25, 30 + var3 * g.field_g.field_u, 64, 32);
        vw.field_a[2].field_b[80].a(89, g.field_g.field_u * var3 + 30, 64, 32);
        vw.field_a[2].field_b[109].a(89, 30 - -(var3 * g.field_g.field_u), 64, 32);
        vw.field_a[1].field_b[80].a(153, 30 + var3 * g.field_g.field_u, 64, 32);
        vw.field_a[1].field_b[109].a(153, 30 + var3 * g.field_g.field_u, 64, 32);
        g.field_g.c(ana.field_t[9], 227, (1 + var3) * g.field_g.field_u + 30 + 3 * g.field_g.field_u / 8, 3518976, -1);
    }

    void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = BachelorFridge.field_y;
        if (11 != ((jla) this).field_b) {
          if ((((jla) this).field_b ^ -1) != -13) {
            L0: {
              if (-7 == (((jla) this).field_b ^ -1)) {
                break L0;
              } else {
                this.c(2);
                break L0;
              }
            }
            L1: {
              L2: {
                if (-1 == (iba.field_s ^ -1)) {
                  break L2;
                } else {
                  if ((iba.field_s ^ -1) == -16) {
                    break L2;
                  } else {
                    if (kaa.field_m == 0) {
                      break L2;
                    } else {
                      if (-16 == (kaa.field_m ^ -1)) {
                        break L2;
                      } else {
                        if (kaa.field_m != 10) {
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              ((jla) this).i(-12988);
              break L1;
            }
            this.a(25428);
            if (param0 == 9) {
              L3: {
                ((jla) this).c(true);
                if (((jla) this).field_b != 6) {
                  if (9 != ((jla) this).field_b) {
                    if (((jla) this).field_b != 14) {
                      L4: {
                        if (-11 != (((jla) this).field_b ^ -1)) {
                          break L4;
                        } else {
                          var2 = aha.field_D.b(fia.field_s, 480);
                          hp.a(uma.field_J[0].field_n + 480 - -uma.field_J[2].field_n, -uma.field_J[0].field_n + 80, (byte) 113, 30 * var2 + (uma.field_J[0].field_o + uma.field_J[6].field_o), uma.field_J, -uma.field_J[0].field_o + (200 + -aha.field_D.field_u));
                          int discarded$1 = aha.field_D.a(fia.field_s, 80, 188, 480, 1000, 3518976, -1, 0, 0, 30);
                          break L4;
                        }
                      }
                      break L3;
                    } else {
                      this.h(param0 + -137);
                      break L3;
                    }
                  } else {
                    this.g(10);
                    break L3;
                  }
                } else {
                  this.n(4);
                  break L3;
                }
              }
              return;
            } else {
              return;
            }
          } else {
            eb.a(true, 36);
            return;
          }
        } else {
          if (!di.b(40)) {
            return;
          } else {
            aia.d((byte) -112);
            return;
          }
        }
    }

    private final void c(int param0) {
        wl.field_yb = null;
        eea.field_a = null;
        if (param0 != 2) {
            ((jla) this).field_e = null;
        }
        vla.field_r = null;
        vu.field_k = null;
        jm.field_i = null;
        i.field_d = null;
        nt.field_z = null;
        bp.field_y = null;
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var2 = 0;
          aha.field_D.c(ana.field_j[0], 25, 30, uga.field_v, -1);
          var2++;
          var2 = var2 + g.field_g.a(ana.field_j[1], 25, -10 + (g.field_g.field_u * var2 + 40), 590, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var2 += 2;
          g.field_g.c(ana.field_j[2], 25, 40 - (-(var2 * g.field_g.field_u) + 10), 3518976, -1);
          r.field_n.e(25, 40 + var2 * g.field_g.field_u);
          var4 = 10 + (25 + r.field_n.field_q);
          var3 = -r.field_n.field_q + 590;
          var2 = var2 + g.field_g.a(ana.field_j[4], var4, 40 + g.field_g.field_u * var2, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          pt.a(315, 3518976, 145, true, var2 * g.field_g.field_u + 40 - g.field_g.field_u / 2, 180, 5, (byte) 111, 350);
          var2++;
          qh.a(180, 270, -1271, 234, g.field_g.field_u * (1 + var2) + 40, 350, 5, 3518976);
          var2 = var2 + g.field_g.a(ana.field_j[5], var4, 40 + g.field_g.field_u * var2, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var2++;
          pt.a(283, 3518976, 215, true, (var2 - -1) * g.field_g.field_u + 40, 280, 5, (byte) 53, 350);
          var2 = var2 + g.field_g.a(ana.field_j[6], var4, 40 + g.field_g.field_u * var2, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var2++;
          pt.a(322, 3518976, 295, true, 40 - -(g.field_g.field_u * (var2 + 1)), 360, 10, (byte) 64, 350);
          var2 = var2 + g.field_g.a(ana.field_j[7], var4, var2 * g.field_g.field_u + 40, var3, 430, 3518976, -1, 0, 0, g.field_g.field_u);
          var3 = r.field_n.field_q;
          var5 = 1;
          if ((kt.field_k ^ -1) == -1) {
            var5 = 0;
            break L0;
          } else {
            break L0;
          }
        }
        int discarded$1 = g.field_g.a(ana.field_j[3], 125, -((var5 + 11) * g.field_g.field_u / param0) + 470, var3, 2 * g.field_g.field_u, 3518976, -1, 0, 0, g.field_g.field_u);
        qh.a(180, 198, -1271, 32, (-var5 + 3) * g.field_g.field_u / 2 + 385, 120, 10, 3518976);
        var3 = g.field_g.a(ana.field_j[8]);
        g.field_g.c(ana.field_j[8], 25, 470 + -(3 * g.field_g.field_u / 2), 3518976, -1);
        qh.a(362, 91, -1271, 45, 435, 68, 5, 3518976);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new rca(0, 0);
        field_c = "Wallet: ";
        field_f = "Welcome. Click the tooltips to continue.";
    }
}
