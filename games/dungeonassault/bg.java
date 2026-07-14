/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg extends qe {
    private rh field_w;
    private cn field_u;
    static md field_s;
    private rh field_r;
    static String field_x;
    private cn field_v;
    static String field_t;

    final void a(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        rj var8 = null;
        var5 = DungeonAssault.field_K;
        super.a(param0);
        ((bg) this).field_e.b(0, 0);
        gf.e(41, 48, 599, 416);
        var2 = 41;
        L0: while (true) {
          if (var2 >= 599) {
            gf.b();
            this.a(117, 122);
            this.a(20, 84, 117);
            var8 = (rj) (Object) ((bg) this).field_p.e(-24172);
            L1: while (true) {
              if (var8 == null) {
                L2: {
                  oe.field_m.h(24, 383);
                  oe.field_m.j(560, 383);
                  if (null != ((bg) this).field_b) {
                    ((bg) this).field_b.a((byte) -126);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                bg.e();
                ((bg) this).field_r.d();
                ((bg) this).field_w.d();
                var8 = (rj) (Object) ((bg) this).field_p.e(-24172);
                L3: while (true) {
                  if (var8 == null) {
                    L4: {
                      if (-1 < (rb.field_N ^ -1)) {
                        break L4;
                      } else {
                        if (ao.field_o > rb.field_N) {
                          var3 = -vd.field_a + rb.field_N;
                          if (-1 < (var3 ^ -1)) {
                            break L4;
                          } else {
                            if ((var3 ^ -1) > -11) {
                              var4 = 121 + var3 * 24;
                              this.a(432, rb.field_N, var4, fb.field_d[var3]);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      this.c(1);
                      ih.field_x.a(320, 25, 1699);
                      if (null == ((bg) this).field_b) {
                        break L5;
                      } else {
                        var6 = 0;
                        var3 = var6;
                        L6: while (true) {
                          if (gf.field_b.length <= var6) {
                            ((bg) this).field_b.b(111);
                            break L5;
                          } else {
                            gf.field_b[var6] = nb.a(gf.field_b[var6], -50529028) >>> -623827966;
                            var6++;
                            continue L6;
                          }
                        }
                      }
                    }
                    L7: {
                      if (kn.field_g) {
                        ab.a(0);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    oh.a((byte) 125);
                    return;
                  } else {
                    var8.d(0);
                    var8 = (rj) (Object) ((bg) this).field_p.a(4);
                    continue L3;
                  }
                }
              } else {
                var8.a(126);
                var8 = (rj) (Object) ((bg) this).field_p.a(4);
                continue L1;
              }
            }
          } else {
            df.field_c.c(var2, 48);
            var2 = var2 + df.field_c.field_E;
            continue L0;
          }
        }
    }

    final void c(boolean param0) {
        int var2 = 0;
        int var4 = 0;
        ce var5 = null;
        pk var6 = null;
        int stackIn_24_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var4 = DungeonAssault.field_K;
        super.c(param0);
        if (kh.field_s) {
          return;
        } else {
          if (!param0) {
            return;
          } else {
            L0: while (true) {
              if (!ha.b((byte) 47)) {
                L1: {
                  if (kn.field_g) {
                    bl.a(0);
                    break L1;
                  } else {
                    break L1;
                  }
                }
                L2: {
                  if (((bg) this).field_b == null) {
                    break L2;
                  } else {
                    if (((bg) this).field_b.field_d) {
                      L3: {
                        var2 = 0;
                        if (!(((bg) this).field_b instanceof ce)) {
                          if (((bg) this).field_b instanceof pk) {
                            L4: {
                              var6 = (pk) (Object) ((bg) this).field_b;
                              if (!var6.field_r) {
                                stackOut_23_0 = 0;
                                stackIn_24_0 = stackOut_23_0;
                                break L4;
                              } else {
                                stackOut_22_0 = 1;
                                stackIn_24_0 = stackOut_22_0;
                                break L4;
                              }
                            }
                            var2 = stackIn_24_0;
                            break L3;
                          } else {
                            if (!(((bg) this).field_b instanceof fk)) {
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          var5 = (ce) (Object) ((bg) this).field_b;
                          if (var5.field_u != null) {
                            ri.a(var5.field_u.toString(), -109);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ((bg) this).field_b.c(-123);
                      ((bg) this).field_b = null;
                      if (var2 == 0) {
                        break L2;
                      } else {
                        ((bg) this).field_b = (kl) (Object) new fk(hj.field_Q, li.field_j);
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                this.a(5458);
                return;
              } else {
                if ((mm.field_t ^ -1) == -14) {
                  gd.a(g.field_Hb, 0, g.field_Hb, false);
                  continue L0;
                } else {
                  super.f();
                  continue L0;
                }
              }
            }
          }
        }
    }

    final void b(boolean param0) {
        int var3 = DungeonAssault.field_K;
        super.b(param0);
        jh.a(((bg) this).field_e);
        c.a(0, 640, 0, (byte) 64);
        c.a(0, 640, 40, (byte) 75);
        vf.a(432, true, 33, 114, 48);
        vf.a(432, true, 599, 115, 48);
        vf.a(32, true, 164, -54, 8);
        vf.a(32, true, 468, 107, 8);
        un.a(41, (byte) 63, 558, 416, true);
        this.a(40, 70, 117);
        jh.b();
        fk.a((byte) 121, wj.field_u);
        ao.field_o = 0;
        if (!(fb.field_d != null)) {
            fb.field_d = new di[10];
        }
        bj.field_G = false;
        if (ed.c(true)) {
            oi.f((byte) 100);
        } else {
            ri.a(tc.field_u, -113);
        }
        ((bg) this).field_r = new rh(58, 394, 80, 160, 255, 197376, 240);
        ((bg) this).field_w = new rh(580, 394, 80, 160, 255, 197376, 240);
        this.a((byte) -111);
        this.a((byte) -124, 0);
        if (!ed.c(true)) {
            gh.a(23, 11);
        } else {
            gh.a(22, 11);
        }
        vl.a(1, (byte) -49);
    }

    private final void a(int param0, int param1, int param2, di param3) {
        if (param3 == null) {
            return;
        }
        if (!(null != ((bg) this).field_u)) {
            this.a(param3, param0 ^ 461);
        }
        param2 = param2 + (24 - la.field_b.field_H >> 1335855713);
        ((bg) this).field_u.b(s.field_b[0], param2, 64);
        int var5 = (int)((te.a(mo.field_a) + 1.0) * 128.0);
        if (param0 != 432) {
            Object var6 = null;
            this.a(124, (byte) 59, (di) null, 121);
        }
        if (0 > var5) {
            var5 = 0;
        }
        if (!((var5 ^ -1) >= -257)) {
            var5 = 256;
        }
        ((bg) this).field_v.b(s.field_b[0], param2, var5);
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        L0: {
          if (param0 < s.field_b[0]) {
            break L0;
          } else {
            if ((s.field_b[4] ^ -1) < (param0 ^ -1)) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_x = null;
                  break L1;
                }
              }
              L2: {
                var4 = (-117 + param2 + -4) / 24;
                if (0 > var4) {
                  break L2;
                } else {
                  if (-11 >= (var4 ^ -1)) {
                    break L2;
                  } else {
                    return var4;
                  }
                }
              }
              return -1;
            } else {
              break L0;
            }
          }
        }
        return -1;
    }

    private final void a(int param0, int param1, int param2, di param3, int param4, int param5) {
        int var11 = 0;
        int var12 = DungeonAssault.field_K;
        int var7 = this.a(param3, (byte) -98);
        int var8 = (var7 ^ -1) == -1 ? 0 : 10 + var7 * 5;
        param4 = param4 - var8;
        String var9 = ta.a((se) (Object) la.field_b, param3.field_j, param4, param3.field_g, 115);
        int var10 = la.field_b.b(var9);
        param1 = param1 - ((var10 >> -1065571935) + 5);
        for (var11 = 0; var11 < var7; var11++) {
            fb.field_f.a(param1, -10 + param5);
            param1 += 5;
        }
        if (param2 <= 4) {
            Object var13 = null;
            this.a(-30, -105, (di) null, 82);
        }
        param1 += 15;
        la.field_b.b(var9, param1, param5, param0, -1);
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = this.a(param2, true, param1);
        if (!((var4 ^ -1) != 0)) {
            return -1;
        }
        if (param0 > -72) {
            field_s = null;
        }
        return vd.field_a + var4;
    }

    private final void a(byte param0) {
        ((bg) this).b();
        le.field_g = tn.a(-jm.field_i.field_y + 164 >> 2071938689, 8 + (32 - jm.field_i.field_v >> 1242503649), (se) (Object) ne.field_c, jm.field_i, -62, l.field_d);
        wf.field_w = tn.a(580 + -jm.field_i.field_y, (-jm.field_i.field_v + 56 >> -1324447039) + 424, (se) (Object) ne.field_c, jm.field_i, -52, ia.field_Y);
        ic.field_y = tn.a(60, (-jm.field_i.field_v + 56 >> -216962303) + 424, (se) (Object) ne.field_c, jm.field_i, -61, hb.field_l.toUpperCase());
        wf.field_w.field_w = false;
        ic.field_y.field_w = !ed.c(true) ? true : false;
        int var2 = ao.field_o + -10;
        if (var2 < 0) {
            var2 = 0;
        }
        hi.field_c = new pd(552, 84, 0, 295, var2, vd.field_a);
        ((bg) this).field_p.a((ne) (Object) le.field_g, false);
        ((bg) this).field_p.a((ne) (Object) wf.field_w, false);
        ((bg) this).field_p.a((ne) (Object) ic.field_y, false);
        int var3 = -125 / ((param0 - 48) / 56);
        ((bg) this).field_p.a((ne) (Object) hi.field_c, false);
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = DungeonAssault.field_K;
        int var4 = param1 + ((db.field_v.field_H + param0 >> -1570339743) + 2);
        if (param2 != 117) {
            return;
        }
        for (var5 = 0; (var5 ^ -1) > (rb.field_J.length ^ -1); var5++) {
            var6 = rb.field_J[var5].toUpperCase();
            var7 = s.field_b[var5 + 1] + s.field_b[var5] >> 511850273;
            var8 = db.field_v.b(var6);
            if (var5 != 1) {
                // if_icmpeq L103
            } else {
                var8 -= 18;
            }
            var9 = var7 - (var8 >> 161338913);
            if (2 == var5) {
                var9 -= 2;
            }
            db.field_v.b(var6, var9, var4, 16629550, -1);
            if (!(-2 != (var5 ^ -1))) {
                ue.field_i[0].h(-18 + var9, -12 + var4);
            }
            if (!(-4 != (var5 ^ -1))) {
                ue.field_i[1].h(-18 + var9, -12 + var4);
            }
        }
    }

    private final void a(int param0, int param1, int param2, byte param3, int param4, di param5, int param6) {
        int var12 = 0;
        int var13 = DungeonAssault.field_K;
        int var8 = this.a(param5, (byte) -119);
        int var9 = (var8 ^ -1) != -1 ? 10 + 5 * var8 : 0;
        param1 = param1 - var9;
        if (param3 < 122) {
            return;
        }
        String var10 = u.a((se) (Object) la.field_b, (byte) 44, param5.field_g, param5.field_j, param2, param1);
        int var11 = la.field_b.b(var10);
        param0 = param0 - ((var11 >> 89253153) - -5);
        for (var12 = 0; var12 < var8; var12++) {
            fb.field_f.a(param0, -10 + param4);
            param0 += 5;
        }
        param0 += 15;
        la.field_b.b(var10, param0, param4, param6, -1);
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var7 = DungeonAssault.field_K;
        am.field_a.h(41, 48);
        var3 = 0;
        L0: while (true) {
          if (-5 >= (var3 ^ -1)) {
            L1: {
              if (!bj.field_G) {
                L2: {
                  var3 = 4 + param0;
                  if (ao.field_o > 10 + vd.field_a) {
                    stackOut_7_0 = 10;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  } else {
                    stackOut_6_0 = -vd.field_a + ao.field_o;
                    stackIn_8_0 = stackOut_6_0;
                    break L2;
                  }
                }
                var4 = stackIn_8_0;
                var5 = 0;
                L3: while (true) {
                  if ((var4 ^ -1) >= (var5 ^ -1)) {
                    if (qc.field_y < 0) {
                      break L1;
                    } else {
                      if ((qc.field_y ^ -1) > (ao.field_o ^ -1)) {
                        var5 = qc.field_y - vd.field_a;
                        if (-1 < (var5 ^ -1)) {
                          break L1;
                        } else {
                          if (var5 >= 10) {
                            break L1;
                          } else {
                            var6 = 4 + (param0 - -(var5 * 24));
                            this.a(var6, 48, fb.field_d[var5], qc.field_y);
                            break L1;
                          }
                        }
                      } else {
                        break L1;
                      }
                    }
                  } else {
                    L4: {
                      var6 = vd.field_a - -var5;
                      if (var6 == qc.field_y) {
                        break L4;
                      } else {
                        this.a(var6, (byte) -79, fb.field_d[var5], var3);
                        break L4;
                      }
                    }
                    var3 += 24;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                la.field_b.c(ac.field_D, 320, 240, 16777215, -1);
                break L1;
              }
            }
            if (param1 >= 44) {
              bg.a(66, 76, 507, 306, 256, 32, 8, 128);
              return;
            } else {
              return;
            }
          } else {
            bg.b(s.field_b[var3], 85, -2 + (s.field_b[1 + var3] + -s.field_b[var3]), 25, 0, 48, 128);
            bg.b(s.field_b[var3], 112, -2 + -s.field_b[var3] + s.field_b[1 + var3], 256, 0, 48, 128);
            var3++;
            continue L0;
          }
        }
    }

    private final void a(int param0, int param1, di param2, int param3) {
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        cn var11 = null;
        int var12 = 0;
        Object var13 = null;
        var12 = DungeonAssault.field_K;
        var5 = 8421616;
        var6 = new int[32];
        param0 += 2;
        var7 = 0;
        L0: while (true) {
          if (-33 >= (var7 ^ -1)) {
            var7 = 3;
            L1: while (true) {
              if (-25 >= (var7 ^ -1)) {
                L2: {
                  gf.b(66, 2 + param0, 490, 7895160);
                  gf.b(66, 24 + param0, 490, 6771538);
                  if (param1 == 48) {
                    break L2;
                  } else {
                    var13 = null;
                    ((bg) this).a(false, 22, -55, 111, 82, (String) null);
                    break L2;
                  }
                }
                L3: {
                  param0 -= 2;
                  param0 = param0 + (la.field_b.field_H + 24 >> -362605055);
                  if (param2 != null) {
                    la.field_b.c(Integer.toString(param2.field_b + 1), s.field_b[0] - -s.field_b[1] >> -533104735, param0, 16777215, -1);
                    var7 = -s.field_b[1] + (s.field_b[2] + -5);
                    var8 = s.field_b[1] - -s.field_b[2] >> -957575807;
                    this.a(var8, var7, 16777215, (byte) 126, param0, param2, var5);
                    la.field_b.c(gh.a(param2.field_a, (byte) -121), s.field_b[2] + s.field_b[3] >> -35217951, param0, 16777215, -1);
                    if (!param2.field_c.equals((Object) (Object) "")) {
                      L4: {
                        var9 = u.a((se) (Object) la.field_b, (byte) -111, param2.field_c, ek.field_c, 16777215, -s.field_b[3] + (s.field_b[4] + -25));
                        var10 = s.field_b[3] - -10;
                        if (0 < param2.field_f) {
                          var11 = ue.field_i[0];
                          break L4;
                        } else {
                          if (-1 < (param2.field_f ^ -1)) {
                            var11 = ue.field_i[1];
                            break L4;
                          } else {
                            var11 = ue.field_i[8];
                            break L4;
                          }
                        }
                      }
                      var11.h(var10, param0 - la.field_b.field_H);
                      la.field_b.b(var9, var10 + 20, param0, var5, -1);
                      break L3;
                    } else {
                      la.field_b.c("-", s.field_b[3] + s.field_b[4] >> -1197541951, param0, 16777215, -1);
                      break L3;
                    }
                  } else {
                    la.field_b.c(nl.field_c, s.field_b[1] - -s.field_b[2] >> -1792041567, param0, 16777215, -1);
                    break L3;
                  }
                }
                return;
              } else {
                gf.d(66, param0 + var7, 490, 1285 * (-var7 + 24) + (14614528 + -(131072 * var7)), 128);
                var7++;
                continue L1;
              }
            }
          } else {
            var8 = 32 - -(var7 * 1);
            var6[var7] = 65793 * var8;
            var7++;
            continue L0;
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, String param5) {
        int var7 = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        if (param2 == 0) {
          L0: {
            hj.field_Q = param5;
            li.field_j = param4;
            if (param0) {
              ((bg) this).field_b = (kl) (Object) new pk(ia.field_Y, kc.field_P, 0);
              break L0;
            } else {
              if (-1 == (param1 ^ -1)) {
                ((bg) this).field_b = (kl) (Object) new fk(param5, param4);
                break L0;
              } else {
                L1: {
                  var7 = 25 * param1;
                  if (-101 <= (var7 ^ -1)) {
                    break L1;
                  } else {
                    var7 = 100;
                    break L1;
                  }
                }
                var8 = var7 + "%";
                var9 = jk.a(param2 + 127, param3);
                ((bg) this).field_b = (kl) (Object) new pk(ia.field_Y, jk.a(new String[2], no.field_e, 30496), 0);
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final int a(di param0, byte param1) {
        if (param1 > -48) {
            this.a(-90, 71);
        }
        if (param0.field_h == 0) {
            return 0;
        }
        int var3 = (20 * param0.field_h - 1) / gm.field_d.field_N + 1;
        return 3 >= var3 ? var3 : 3;
    }

    private final void c(int param0) {
        Object var2 = null;
        di var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        double var7 = 0.0;
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        L0: {
          var10 = DungeonAssault.field_K;
          var2 = null;
          if (0 > qc.field_y) {
            break L0;
          } else {
            if ((ao.field_o ^ -1) >= (qc.field_y ^ -1)) {
              break L0;
            } else {
              var3 = -vd.field_a + qc.field_y;
              if ((var3 ^ -1) > -1) {
                break L0;
              } else {
                if (10 <= var3) {
                  break L0;
                } else {
                  if (fb.field_d[var3] == null) {
                    break L0;
                  } else {
                    if (eh.a(true, fb.field_d[var3].field_i)) {
                      break L0;
                    } else {
                      var2_ref = fb.field_d[var3];
                      break L0;
                    }
                  }
                }
              }
            }
          }
        }
        L1: {
          var3 = 430;
          var4 = gm.field_d.field_N / 40;
          var6 = 16777215;
          if (var2_ref != null) {
            var7 = ek.a(0, (byte) -127, gm.field_d.field_N, var2_ref.field_a);
            if (-1 > (var2_ref.field_h ^ -1)) {
              if (var7 <= 0.0) {
                var5 = jk.a(new String[1], mi.field_c, 30496);
                break L1;
              } else {
                var12 = gh.a((int)(1000.0 * var7), (byte) -112);
                var5 = jk.a(new String[3], ra.field_a, 30496);
                break L1;
              }
            } else {
              if (0.0 >= var7) {
                var5 = jk.a(new String[1], le.field_a, 30496);
                break L1;
              } else {
                var11 = gh.a((int)(var7 * 1000.0), (byte) -118);
                var5 = jk.a(new String[2], vl.field_l, 30496);
                break L1;
              }
            }
          } else {
            var5 = ai.field_e;
            break L1;
          }
        }
        int discarded$1 = db.field_v.a(var5, 215, var3, 210, 45, var6, -1, param0, 1, db.field_v.field_H);
    }

    private final void a(di param0, int param1) {
        gp var3 = null;
        int var4 = 0;
        int var5 = 0;
        cn var6 = null;
        String var7 = null;
        int var8 = 0;
        cn var9 = null;
        int var10 = 0;
        gp var11 = null;
        var10 = DungeonAssault.field_K;
        if (param0 == null) {
          ((bg) this).field_u = null;
          ((bg) this).field_v = null;
          return;
        } else {
          L0: {
            if (param0.field_b != qc.field_y) {
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var11 = la.field_b;
            var3 = var11;
            var4 = -s.field_b[0] + s.field_b[4];
            var5 = ((se) (Object) var3).field_E + ((se) (Object) var3).field_H;
            var6 = new cn(var4, var5);
            jh.a(var6);
            ((se) (Object) var3).c(Integer.toString(param0.field_b + 1), -s.field_b[0] + (s.field_b[1] + s.field_b[0] >> -2140981631), la.field_b.field_H, 12690143, -1);
            this.a(12690143, -s.field_b[0] + (s.field_b[2] - -s.field_b[1] >> -1106277311), 120, param0, -5 + s.field_b[2] + -s.field_b[1], la.field_b.field_H);
            ((se) (Object) var3).c(gh.a(param0.field_a, (byte) -117), -s.field_b[0] + (s.field_b[2] + s.field_b[3] >> 396477505), la.field_b.field_H, 12690143, -1);
            if (!param0.field_c.equals((Object) (Object) "")) {
              L2: {
                var7 = u.a((se) (Object) var3, (byte) 124, param0.field_c, ek.field_c, 12690143, -s.field_b[3] + s.field_b[4] - 25);
                var8 = 10 + -s.field_b[0] + s.field_b[3];
                if (param0.field_f > 0) {
                  var9 = ue.field_i[0];
                  break L2;
                } else {
                  if (param0.field_f < 0) {
                    var9 = ue.field_i[1];
                    break L2;
                  } else {
                    var9 = ue.field_i[8];
                    break L2;
                  }
                }
              }
              var9.h(var8, 0);
              ((se) (Object) var3).b(var7, var8 + 20, ((se) (Object) var3).field_H, 12690143, -1);
              break L1;
            } else {
              ((se) (Object) var11).c("-", (s.field_b[4] + s.field_b[3] >> 954442785) - s.field_b[0], la.field_b.field_H, 12690143, -1);
              break L1;
            }
          }
          if (param1 > 117) {
            jh.b();
            ((bg) this).field_u = rb.a(8, var6, 12690143, (byte) -38);
            ((bg) this).field_v = rb.a(16, var6, 255, (byte) -74);
            return;
          } else {
            return;
          }
        }
    }

    final static nh a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        if (param3) {
            field_t = null;
        }
        return uo.a(param0, !param4 ? 0 : 1, param2, param1, 27847, false);
    }

    public static void b(int param0) {
        field_x = null;
        field_t = null;
        field_s = null;
        if (param0 != 41) {
            bg.b(-1);
        }
    }

    private final void a(byte param0, int param1) {
        int var7 = 0;
        int var8 = DungeonAssault.field_K;
        if ((vd.field_a ^ -1) == (param1 ^ -1)) {
            return;
        }
        if (param0 >= -96) {
            ((bg) this).field_w = null;
        }
        di[] var9 = new di[10];
        di[] var3 = var9;
        int var4 = 0;
        int var5 = vd.field_a - param1;
        int var6 = 10;
        if (-1 < (var5 ^ -1)) {
            var6 = var6 + var5;
            var4 = var4 - var5;
            var5 = 0;
        }
        if (!((var5 + var6 ^ -1) >= -11)) {
            var6 = 10 - var5;
        }
        for (var7 = 0; (var7 ^ -1) > (var6 ^ -1); var7++) {
            var5++;
            var4++;
            var9[var5] = fb.field_d[var4];
        }
        fb.field_d = var3;
        og.field_f = param1;
        vd.field_a = param1;
        if (hi.field_c != null) {
            hi.field_c.field_z = vd.field_a;
            if (!(hi.field_c.field_z <= hi.field_c.field_C)) {
                hi.field_c.field_z = hi.field_c.field_C;
            }
        }
    }

    private final void a(int param0, byte param1, di param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        cn var11 = null;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var12 = DungeonAssault.field_K;
          if ((param0 ^ -1) == (rb.field_N ^ -1)) {
            stackOut_2_0 = 16760960;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 16777215;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          var6 = 3446736;
          param3 = param3 + (db.field_v.field_H + 24 >> 1510174209);
          if (param1 <= -37) {
            break L1;
          } else {
            this.a((byte) 111);
            break L1;
          }
        }
        L2: {
          if (param2 == null) {
            la.field_b.c(Integer.toString(1 + param0), s.field_b[0] - -s.field_b[1] >> 304562241, param3, var5, -1);
            la.field_b.c(nl.field_c, s.field_b[2] + s.field_b[1] >> 1616107105, param3, var5, -1);
            break L2;
          } else {
            la.field_b.c(Integer.toString(1 + param2.field_b), s.field_b[0] + s.field_b[1] >> -648903839, param3, var5, -1);
            var7 = -5 + (-s.field_b[1] + s.field_b[2]);
            var8 = s.field_b[1] - -s.field_b[2] >> -924312639;
            this.a(var8, var7, var5, (byte) 125, param3, param2, var6);
            la.field_b.c(gh.a(param2.field_a, (byte) -110), s.field_b[3] + s.field_b[2] >> -1555015295, param3, var5, -1);
            if (0 < param2.field_c.length()) {
              L3: {
                var9 = u.a((se) (Object) la.field_b, (byte) -76, param2.field_c, ek.field_c, var5, -s.field_b[3] + (s.field_b[4] + -25));
                int discarded$1 = la.field_b.b(var9);
                var10 = s.field_b[3] - -10;
                if ((param2.field_f ^ -1) < -1) {
                  var11 = ue.field_i[0];
                  break L3;
                } else {
                  if (-1 >= (param2.field_f ^ -1)) {
                    var11 = ue.field_i[8];
                    break L3;
                  } else {
                    var11 = ue.field_i[1];
                    break L3;
                  }
                }
              }
              var11.h(var10, param3 - la.field_b.field_H);
              la.field_b.b(var9, 20 + var10, param3, var6, -1);
              break L2;
            } else {
              la.field_b.c("-", s.field_b[4] + s.field_b[3] >> -650781983, param3, var5, -1);
              break L2;
            }
          }
        }
    }

    bg() {
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        Object var6 = null;
        Object var7 = null;
        Object var8 = null;
        L0: {
          var4 = DungeonAssault.field_K;
          if (kn.field_g) {
            if (!od.a((byte) -116)) {
              break L0;
            } else {
              return;
            }
          } else {
            break L0;
          }
        }
        if (super.d()) {
          return;
        } else {
          L1: {
            if (vd.field_a == hi.field_c.field_z) {
              break L1;
            } else {
              this.a((byte) -104, hi.field_c.field_z);
              oi.f((byte) 100);
              break L1;
            }
          }
          L2: {
            var2 = this.b(-73, eh.field_h, hj.field_S);
            var3 = -1;
            if (no.field_d == 1) {
              var3 = this.b(-119, hm.field_k, lc.field_c);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((Object) (Object) hh.field_s == (Object) (Object) le.field_g) {
              gd.a(dc.field_z, 0, 0, true);
              break L3;
            } else {
              if ((Object) (Object) hh.field_s != (Object) (Object) wf.field_w) {
                if ((Object) (Object) ic.field_y == (Object) (Object) hh.field_s) {
                  if (!ed.c(true)) {
                    ((bg) this).field_b = (kl) (Object) new ce(tc.field_u.toLowerCase());
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              } else {
                if (!ed.c(true)) {
                  if (!eh.a(true, k.field_b)) {
                    if (null != gm.field_d) {
                      L4: {
                        if (gm.field_d.field_H) {
                          break L4;
                        } else {
                          ac.field_B.d((byte) -112, 58);
                          break L4;
                        }
                      }
                      ac.a(k.field_b, 0);
                      break L3;
                    } else {
                      var7 = null;
                      throw new RuntimeException((String) null);
                    }
                  } else {
                    var6 = null;
                    throw new RuntimeException((String) null);
                  }
                } else {
                  var5 = null;
                  throw new RuntimeException((String) null);
                }
              }
            }
          }
          L5: {
            if ((var2 ^ -1) != 0) {
              L6: {
                if (rb.field_N == var2) {
                  break L6;
                } else {
                  this.a(fb.field_d[var2 - vd.field_a], 120);
                  break L6;
                }
              }
              rb.field_N = var2;
              break L5;
            } else {
              break L5;
            }
          }
          L7: {
            if ((var3 ^ -1) == 0) {
              break L7;
            } else {
              L8: {
                qc.field_y = var3;
                if (rb.field_N != qc.field_y) {
                  break L8;
                } else {
                  this.a(fb.field_d[-vd.field_a + rb.field_N], 125);
                  break L8;
                }
              }
              gg.a((byte) -96);
              break L7;
            }
          }
          L9: {
            if (0 == (var2 ^ -1)) {
              break L9;
            } else {
              if (0 == pj.field_r) {
                break L9;
              } else {
                hi.field_c.a(1, pj.field_r);
                break L9;
              }
            }
          }
          L10: {
            if (param0 == 5458) {
              break L10;
            } else {
              var8 = null;
              this.a((di) null, -127);
              break L10;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Buy";
        field_s = new md();
        field_t = "Loading...";
    }
}
