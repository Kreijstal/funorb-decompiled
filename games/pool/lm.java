/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends tm {
    lm() {
    }

    final static void i(int param0) {
        int var4 = 0;
        dd var1 = new dd(540, 140);
        int var2 = -31 / ((79 - param0) / 34);
        kj.a(62, var1);
        fb.a();
        qh.d();
        im.field_fc = 0;
        gi.a(-21818);
        dd var3 = var1.d();
        for (var4 = 0; 15 > var4; var4++) {
            var3.f(-2, -2, 16777215);
            qh.e(4, 4, 0, 0, 540, 140);
        }
        ci.field_h.e();
        var1.b(0, 0);
        oc.a(126);
    }

    final void a(int param0, di param1) {
        if (param0 != 198123656) {
            return;
        }
        ((lm) this).field_e = aj.a(0, "", param1, "top_bar_balls_space");
    }

    final static void c(int param0, int param1) {
        oq var2 = ej.field_j;
        var2.b(false, param1);
        var2.field_v = var2.field_v + 1;
        int var3 = var2.field_v;
        var2.a(param0, false);
        var2.a(em.field_L.field_Nb, false);
        int var4 = em.field_L.field_ac + (em.field_L.field_Yb << -2045039098);
        var2.a(var4, false);
        var2.a(em.field_L.field_tc, (byte) 0, 0, em.field_L.field_tc.length);
        var2.b(-var3 + var2.field_v, true);
    }

    final void a(di param0, byte param1) {
        if (null == ((lm) this).field_a) {
          ((lm) this).field_a = new eg[16];
          ((lm) this).field_a[0] = eg.a(param0, "", "balls/SPACE/space_ball_white");
          if (param1 != 117) {
            return;
          } else {
            eg dupTemp$2 = eg.a(param0, "", "balls/SPACE/space_ball_01");
            ((lm) this).field_a[7] = dupTemp$2;
            ((lm) this).field_a[6] = dupTemp$2;
            ((lm) this).field_a[5] = dupTemp$2;
            ((lm) this).field_a[4] = dupTemp$2;
            ((lm) this).field_a[3] = dupTemp$2;
            ((lm) this).field_a[2] = dupTemp$2;
            ((lm) this).field_a[1] = dupTemp$2;
            ((lm) this).field_a[8] = eg.a(param0, "", "balls/SPACE/space_ball_black");
            eg dupTemp$3 = eg.a(param0, "", "balls/SPACE/space_ball_02");
            ((lm) this).field_a[15] = dupTemp$3;
            ((lm) this).field_a[14] = dupTemp$3;
            ((lm) this).field_a[13] = dupTemp$3;
            ((lm) this).field_a[12] = dupTemp$3;
            ((lm) this).field_a[11] = dupTemp$3;
            ((lm) this).field_a[10] = dupTemp$3;
            ((lm) this).field_a[9] = dupTemp$3;
            ((lm) this).field_a[0].a(8, 8, 8, 8);
            ((lm) this).field_a[1].a(8, 8, 8, 8);
            ((lm) this).field_a[8].a(8, 8, 8, 8);
            ((lm) this).field_a[9].a(8, 8, 8, 8);
            return;
          }
        } else {
          return;
        }
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
            Object var4 = null;
            lm.a(-24, 10, -99, 68, -80, 113, (String) null, 109, 92);
            return -1 == (param1 ^ -1) ? sn.field_j : dq.field_g;
        }
        return -1 == (param1 ^ -1) ? sn.field_j : dq.field_g;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        ma.field_e.field_nb = param6;
        if ((hn.field_b ^ -1) == -3) {
          wn.field_g.field_nb = li.field_g;
          if (param3 != 4) {
            return;
          } else {
            var9 = 495;
            var10 = 5;
            vi.field_c.b(var10, param3 ^ 2147483643, 5, var9 + -10, param7);
            pa.field_J.b(0, param3 + 2147483643, 0, -fj.field_j.field_gb + vi.field_c.field_gb, param7);
            var10 = var10 + (param1 + param7);
            fj.field_j.b(0, 2147483647, pa.field_J.field_gb, fj.field_j.field_gb, param7);
            be.field_L.b(var10, 2147483647, 5, be.field_L.b(true), param8);
            var11 = wn.field_g.b(true);
            wn.field_g.b(var10, 2147483647, -var11 + var9 - 5, var11, param8);
            var12 = param8 + var10 + 5;
            ma.field_e.b(0, param3 ^ 2147483643, 0, var9, param2);
            ml.field_e.b(param2, param3 ^ 2147483643, 0, var9, var12);
            var12 = var12 + param2;
            ml.field_e.field_F = rp.a(32450, 3, 2105376, ml.field_e.field_Db, 11579568, 8421504);
            uq.field_D.b(-(var12 / 2) + param4, 2147483647, param5 - var9 / 2, var9, var12);
            return;
          }
        } else {
          wn.field_g.field_nb = ff.field_j;
          if (param3 != 4) {
            return;
          } else {
            var9 = 495;
            var10 = 5;
            vi.field_c.b(var10, param3 ^ 2147483643, 5, var9 + -10, param7);
            pa.field_J.b(0, param3 + 2147483643, 0, -fj.field_j.field_gb + vi.field_c.field_gb, param7);
            var10 = var10 + (param1 + param7);
            fj.field_j.b(0, 2147483647, pa.field_J.field_gb, fj.field_j.field_gb, param7);
            be.field_L.b(var10, 2147483647, 5, be.field_L.b(true), param8);
            var11 = wn.field_g.b(true);
            wn.field_g.b(var10, 2147483647, -var11 + var9 - 5, var11, param8);
            var12 = param8 + var10 + 5;
            ma.field_e.b(0, param3 ^ 2147483643, 0, var9, param2);
            ml.field_e.b(param2, param3 ^ 2147483643, 0, var9, var12);
            var12 = var12 + param2;
            ml.field_e.field_F = rp.a(32450, 3, 2105376, ml.field_e.field_Db, 11579568, 8421504);
            uq.field_D.b(-(var12 / 2) + param4, 2147483647, param5 - var9 / 2, var9, var12);
            return;
          }
        }
    }

    final static hj[] a(byte param0) {
        if (param0 != -32) {
          return null;
        } else {
          return new hj[]{gr.field_G, lb.field_N, nk.field_g, kk.field_A, en.field_c, jk.field_i, no.field_g, of.field_Tb, mj.field_d, pf.field_e, pq.field_J, ch.field_K, bq.field_r, pn.field_k};
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        var4 = Pool.field_O;
        if (!param1) {
          var5 = null;
          ((lm) this).a((di) null, (byte) -106);
          var3 = param0;
          if (-1 != (var3 ^ -1)) {
            if (-2 != (var3 ^ -1)) {
              if ((var3 ^ -1) != -3) {
                if ((var3 ^ -1) != -4) {
                  if (4 != var3) {
                    if ((var3 ^ -1) == -6) {
                      return this.b(0, (byte) -108);
                    } else {
                      if (-7 != (var3 ^ -1)) {
                        if (7 != var3) {
                          if (var3 != 8) {
                            L0: {
                              if (9 == var3) {
                                break L0;
                              } else {
                                if (-11 == (var3 ^ -1)) {
                                  break L0;
                                } else {
                                  if (var3 == 11) {
                                    break L0;
                                  } else {
                                    if (-13 == (var3 ^ -1)) {
                                      break L0;
                                    } else {
                                      if (13 != var3) {
                                        if (var3 != 14) {
                                          if (-16 != (var3 ^ -1)) {
                                            return 16711935;
                                          } else {
                                            return this.b(1, (byte) -108);
                                          }
                                        } else {
                                          return this.b(1, (byte) -108);
                                        }
                                      } else {
                                        return this.b(1, (byte) -108);
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            return this.b(1, (byte) -108);
                          } else {
                            return 3355443;
                          }
                        } else {
                          return this.b(0, (byte) -108);
                        }
                      } else {
                        return this.b(0, (byte) -108);
                      }
                    }
                  } else {
                    return this.b(0, (byte) -108);
                  }
                } else {
                  return this.b(0, (byte) -108);
                }
              } else {
                return this.b(0, (byte) -108);
              }
            } else {
              return this.b(0, (byte) -108);
            }
          } else {
            return 13421772;
          }
        } else {
          var3 = param0;
          if (-1 != (var3 ^ -1)) {
            if (-2 != (var3 ^ -1)) {
              L1: {
                if ((var3 ^ -1) == -3) {
                  break L1;
                } else {
                  if ((var3 ^ -1) != -4) {
                    if (4 != var3) {
                      if ((var3 ^ -1) == -6) {
                        break L1;
                      } else {
                        if (-7 != (var3 ^ -1)) {
                          if (7 != var3) {
                            if (var3 != 8) {
                              L2: {
                                if (9 == var3) {
                                  break L2;
                                } else {
                                  if (-11 == (var3 ^ -1)) {
                                    break L2;
                                  } else {
                                    if (var3 == 11) {
                                      break L2;
                                    } else {
                                      if (-13 == (var3 ^ -1)) {
                                        break L2;
                                      } else {
                                        if (13 != var3) {
                                          if (var3 != 14) {
                                            if (-16 != (var3 ^ -1)) {
                                              return 16711935;
                                            } else {
                                              return this.b(1, (byte) -108);
                                            }
                                          } else {
                                            return this.b(1, (byte) -108);
                                          }
                                        } else {
                                          return this.b(1, (byte) -108);
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                              return this.b(1, (byte) -108);
                            } else {
                              return 3355443;
                            }
                          } else {
                            return this.b(0, (byte) -108);
                          }
                        } else {
                          return this.b(0, (byte) -108);
                        }
                      }
                    } else {
                      return this.b(0, (byte) -108);
                    }
                  } else {
                    return this.b(0, (byte) -108);
                  }
                }
              }
              return this.b(0, (byte) -108);
            } else {
              return this.b(0, (byte) -108);
            }
          } else {
            return 13421772;
          }
        }
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            return true;
        }
        return false;
    }

    private final int b(int param0, byte param1) {
        if (param1 != -108) {
            return -14;
        }
        if (param0 != 0) {
            if (param0 == 1) {
                return 10066329;
            }
            return 16777215;
        }
        return 6697745;
    }

    static {
    }
}
