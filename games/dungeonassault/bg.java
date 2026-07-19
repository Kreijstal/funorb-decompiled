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
        this.field_e.b(0, 0);
        gf.e(41, 48, 599, 416);
        var2 = 41;
        L0: while (true) {
          if (var2 >= 599) {
            gf.b();
            this.a(117, 122);
            this.a(20, 84, 117);
            var8 = (rj) ((Object) this.field_p.e(-24172));
            L1: while (true) {
              if (var8 == null) {
                L2: {
                  oe.field_m.h(24, 383);
                  oe.field_m.j(560, 383);
                  if (null != this.field_b) {
                    this.field_b.a((byte) -126);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                bg.e();
                this.field_r.d();
                this.field_w.d();
                var8 = (rj) ((Object) this.field_p.e(-24172));
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
                      if (null == this.field_b) {
                        break L5;
                      } else {
                        var6 = 0;
                        var3 = var6;
                        L6: while (true) {
                          if (gf.field_b.length <= var6) {
                            this.field_b.b(111);
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
                    var8 = (rj) ((Object) this.field_p.a(4));
                    continue L3;
                  }
                }
              } else {
                var8.a(126);
                var8 = (rj) ((Object) this.field_p.a(4));
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
                  if (this.field_b == null) {
                    break L2;
                  } else {
                    if (this.field_b.field_d) {
                      L3: {
                        var2 = 0;
                        if (!(this.field_b instanceof ce)) {
                          if (this.field_b instanceof pk) {
                            L4: {
                              var6 = (pk) ((Object) this.field_b);
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
                            if (!(this.field_b instanceof fk)) {
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          var5 = (ce) ((Object) this.field_b);
                          if (var5.field_u != null) {
                            ri.a(var5.field_u.toString(), -109);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                      }
                      this.field_b.c(-123);
                      this.field_b = null;
                      if (var2 == 0) {
                        break L2;
                      } else {
                        this.field_b = (kl) ((Object) new fk(hj.field_Q, li.field_j));
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
        jh.a(this.field_e);
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
        this.field_r = new rh(58, 394, 80, 160, 255, 197376, 240);
        this.field_w = new rh(580, 394, 80, 160, 255, 197376, 240);
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
        int var5_int = 0;
        if (param3 == null) {
            return;
        }
        try {
            if (!(null != this.field_u)) {
                this.a(param3, param0 ^ 461);
            }
            param2 = param2 + (24 - la.field_b.field_H >> 1335855713);
            this.field_u.b(s.field_b[0], param2, 64);
            var5_int = (int)((te.a(mo.field_a) + 1.0) * 128.0);
            if (param0 != 432) {
                di var6 = (di) null;
                this.a(124, (byte) 59, (di) null, 121);
            }
            if (0 > var5_int) {
                var5_int = 0;
            }
            if (!((var5_int ^ -1) >= -257)) {
                var5_int = 256;
            }
            this.field_v.b(s.field_b[0], param2, var5_int);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bg.U(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        L0: {
          if (param0 < s.field_b[0]) {
            break L0;
          } else {
            if (s.field_b[4] > param0) {
              L1: {
                if (param1) {
                  break L1;
                } else {
                  field_x = (String) null;
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
        int var7_int = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = DungeonAssault.field_K;
        try {
            var7_int = this.a(param3, (byte) -98);
            var8 = var7_int == 0 ? 0 : 10 + var7_int * 5;
            param4 = param4 - var8;
            var9 = ta.a(la.field_b, param3.field_j, param4, param3.field_g, 115);
            var10 = la.field_b.b(var9);
            param1 = param1 - ((var10 >> -1065571935) + 5);
            for (var11 = 0; var11 < var7_int; var11++) {
                fb.field_f.a(param1, -10 + param5);
                param1 += 5;
            }
            if (param2 <= 4) {
                di var13 = (di) null;
                this.a(-30, -105, (di) null, 82);
            }
            param1 += 15;
            la.field_b.b(var9, param1, param5, param0, -1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bg.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = this.a(param2, true, param1);
        if (!((var4 ^ -1) != 0)) {
            return -1;
        }
        if (param0 > -72) {
            field_s = (md) null;
        }
        return vd.field_a + var4;
    }

    private final void a(byte param0) {
        this.b();
        le.field_g = tn.a(-jm.field_i.field_y + 164 >> 2071938689, 8 + (32 - jm.field_i.field_v >> 1242503649), ne.field_c, jm.field_i, -62, l.field_d);
        wf.field_w = tn.a(580 + -jm.field_i.field_y, (-jm.field_i.field_v + 56 >> -1324447039) + 424, ne.field_c, jm.field_i, -52, ia.field_Y);
        ic.field_y = tn.a(60, (-jm.field_i.field_v + 56 >> -216962303) + 424, ne.field_c, jm.field_i, -61, hb.field_l.toUpperCase());
        wf.field_w.field_w = false;
        ic.field_y.field_w = !ed.c(true) ? true : false;
        int var2 = ao.field_o + -10;
        if (var2 < 0) {
            var2 = 0;
        }
        hi.field_c = new pd(552, 84, 0, 295, var2, vd.field_a);
        this.field_p.a(le.field_g, false);
        this.field_p.a(wf.field_w, false);
        this.field_p.a(ic.field_y, false);
        int var3 = -125 / ((param0 - 48) / 56);
        this.field_p.a(hi.field_c, false);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = DungeonAssault.field_K;
        var4 = param1 + ((db.field_v.field_H + param0 >> -1570339743) + 2);
        if (param2 == 117) {
          var5 = 0;
          L0: while (true) {
            if (var5 >= rb.field_J.length) {
              return;
            } else {
              L1: {
                L2: {
                  var6 = rb.field_J[var5].toUpperCase();
                  var7 = s.field_b[var5 + 1] + s.field_b[var5] >> 511850273;
                  var8 = db.field_v.b(var6);
                  if (var5 == 1) {
                    break L2;
                  } else {
                    if (3 == var5) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                var8 -= 18;
                break L1;
              }
              L3: {
                var9 = var7 - (var8 >> 161338913);
                if (2 != var5) {
                  break L3;
                } else {
                  var9 -= 2;
                  break L3;
                }
              }
              L4: {
                db.field_v.b(var6, var9, var4, 16629550, -1);
                if (-2 == (var5 ^ -1)) {
                  ue.field_i[0].h(-18 + var9, -12 + var4);
                  break L4;
                } else {
                  break L4;
                }
              }
              if (-4 == (var5 ^ -1)) {
                ue.field_i[1].h(-18 + var9, -12 + var4);
                var5++;
                continue L0;
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

    private final void a(int param0, int param1, int param2, byte param3, int param4, di param5, int param6) {
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = DungeonAssault.field_K;
        int var8_int = this.a(param5, (byte) -119);
        int var9 = var8_int != 0 ? 10 + 5 * var8_int : 0;
        param1 = param1 - var9;
        if (param3 < 122) {
            return;
        }
        try {
            var10 = u.a(la.field_b, (byte) 44, param5.field_g, param5.field_j, param2, param1);
            var11 = la.field_b.b(var10);
            param0 = param0 - ((var11 >> 89253153) - -5);
            for (var12 = 0; var12 < var8_int; var12++) {
                fb.field_f.a(param0, -10 + param4);
                param0 += 5;
            }
            param0 += 15;
            la.field_b.b(var10, param0, param4, param6, -1);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "bg.J(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
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
                  if (var4 <= var5) {
                    if (qc.field_y < 0) {
                      break L1;
                    } else {
                      if (qc.field_y < ao.field_o) {
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
                    var6 = vd.field_a - -var5;
                    if (var6 != qc.field_y) {
                      this.a(var6, (byte) -79, fb.field_d[var5], var3);
                      var3 += 24;
                      var5++;
                      continue L3;
                    } else {
                      var3 += 24;
                      var5++;
                      continue L3;
                    }
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
        RuntimeException var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        cn var11 = null;
        int var12 = 0;
        String var13 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            var5_int = 8421616;
            var6 = new int[32];
            param0 += 2;
            var7 = 0;
            L1: while (true) {
              if (-33 >= (var7 ^ -1)) {
                var7 = 3;
                L2: while (true) {
                  if (-25 >= (var7 ^ -1)) {
                    L3: {
                      gf.b(66, 2 + param0, 490, 7895160);
                      gf.b(66, 24 + param0, 490, 6771538);
                      if (param1 == 48) {
                        break L3;
                      } else {
                        var13 = (String) null;
                        this.a(false, 22, -55, 111, 82, (String) null);
                        break L3;
                      }
                    }
                    L4: {
                      param0 -= 2;
                      param0 = param0 + (la.field_b.field_H + 24 >> -362605055);
                      if (param2 != null) {
                        la.field_b.c(Integer.toString(param2.field_b + 1), s.field_b[0] - -s.field_b[1] >> -533104735, param0, 16777215, -1);
                        var7 = -s.field_b[1] + (s.field_b[2] + -5);
                        var8 = s.field_b[1] - -s.field_b[2] >> -957575807;
                        this.a(var8, var7, 16777215, (byte) 126, param0, param2, var5_int);
                        la.field_b.c(gh.a(param2.field_a, (byte) -121), s.field_b[2] + s.field_b[3] >> -35217951, param0, 16777215, -1);
                        if (!param2.field_c.equals("")) {
                          L5: {
                            var9 = u.a(la.field_b, (byte) -111, param2.field_c, ek.field_c, 16777215, -s.field_b[3] + (s.field_b[4] + -25));
                            var10 = s.field_b[3] - -10;
                            if (0 < param2.field_f) {
                              var11 = ue.field_i[0];
                              break L5;
                            } else {
                              if (-1 < (param2.field_f ^ -1)) {
                                var11 = ue.field_i[1];
                                break L5;
                              } else {
                                var11 = ue.field_i[8];
                                break L5;
                              }
                            }
                          }
                          var11.h(var10, param0 - la.field_b.field_H);
                          la.field_b.b(var9, var10 + 20, param0, var5_int, -1);
                          break L4;
                        } else {
                          la.field_b.c("-", s.field_b[3] + s.field_b[4] >> -1197541951, param0, 16777215, -1);
                          break L4;
                        }
                      } else {
                        la.field_b.c(nl.field_c, s.field_b[1] - -s.field_b[2] >> -1792041567, param0, 16777215, -1);
                        break L4;
                      }
                    }
                    break L0;
                  } else {
                    gf.d(66, param0 + var7, 490, 1285 * (-var7 + 24) + (14614528 + -(131072 * var7)), 128);
                    var7++;
                    continue L2;
                  }
                }
              } else {
                var8 = 32 - -(var7 * 1);
                var6[var7] = 65793 * var8;
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var5);
            stackOut_20_1 = new StringBuilder().append("bg.Q(").append(param0).append(',').append(param1).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param3 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, String param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            if (param2 == 0) {
              L1: {
                hj.field_Q = param5;
                li.field_j = param4;
                if (param0) {
                  this.field_b = (kl) ((Object) new pk(ia.field_Y, kc.field_P, 0));
                  break L1;
                } else {
                  if (-1 == (param1 ^ -1)) {
                    this.field_b = (kl) ((Object) new fk(param5, param4));
                    break L1;
                  } else {
                    L2: {
                      var7_int = 25 * param1;
                      if (-101 <= (var7_int ^ -1)) {
                        break L2;
                      } else {
                        var7_int = 100;
                        break L2;
                      }
                    }
                    var8 = var7_int + "%";
                    var9 = jk.a(param2 + 127, param3);
                    this.field_b = (kl) ((Object) new pk(ia.field_Y, jk.a(new String[]{var8, var9}, no.field_e, 30496), 0));
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var7 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var7);
            stackOut_11_1 = new StringBuilder().append("bg.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param5 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(di param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -48) {
                break L1;
              } else {
                this.a(-90, 71);
                break L1;
              }
            }
            if (param0.field_h != 0) {
              L2: {
                var3_int = (20 * param0.field_h - 1) / gm.field_d.field_N + 1;
                if (3 < var3_int) {
                  stackOut_7_0 = 3;
                  stackIn_8_0 = stackOut_7_0;
                  break L2;
                } else {
                  stackOut_6_0 = var3_int;
                  stackIn_8_0 = stackOut_6_0;
                  break L2;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var3);
            stackOut_9_1 = new StringBuilder().append("bg.C(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_8_0;
        }
    }

    private final void c(int param0) {
        Object var2 = null;
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
            if (ao.field_o <= qc.field_y) {
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
                      var2 = fb.field_d[var3];
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
          if (var2 != null) {
            var7 = ek.a(0, (byte) -127, gm.field_d.field_N, ((di) (var2)).field_a);
            if (-1 > (((di) (var2)).field_h ^ -1)) {
              if (var7 <= 0.0) {
                var5 = jk.a(new String[]{gh.a(((di) (var2)).field_h, (byte) -114)}, mi.field_c, 30496);
                break L1;
              } else {
                var12 = gh.a((int)(1000.0 * var7), (byte) -112);
                var5 = jk.a(new String[]{gh.a(((di) (var2)).field_h, (byte) -112), var12, gh.a(var4, (byte) -109)}, ra.field_a, 30496);
                break L1;
              }
            } else {
              if (0.0 >= var7) {
                var5 = jk.a(new String[]{gh.a(var4, (byte) -102)}, le.field_a, 30496);
                break L1;
              } else {
                var11 = gh.a((int)(var7 * 1000.0), (byte) -118);
                var5 = jk.a(new String[]{var11, gh.a(var4, (byte) -108)}, vl.field_l, 30496);
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
        RuntimeException var3 = null;
        gp var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        cn var6 = null;
        String var7 = null;
        int var8 = 0;
        cn var9 = null;
        int var10 = 0;
        gp var11 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = DungeonAssault.field_K;
        try {
          L0: {
            if (param0 == null) {
              this.field_u = null;
              this.field_v = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0.field_b != qc.field_y) {
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                var11 = la.field_b;
                var3_ref = var11;
                var4 = -s.field_b[0] + s.field_b[4];
                var5 = ((se) ((Object) var3_ref)).field_E + ((se) ((Object) var3_ref)).field_H;
                var6 = new cn(var4, var5);
                jh.a(var6);
                ((se) ((Object) var3_ref)).c(Integer.toString(param0.field_b + 1), -s.field_b[0] + (s.field_b[1] + s.field_b[0] >> -2140981631), la.field_b.field_H, 12690143, -1);
                this.a(12690143, -s.field_b[0] + (s.field_b[2] - -s.field_b[1] >> -1106277311), 120, param0, -5 + s.field_b[2] + -s.field_b[1], la.field_b.field_H);
                ((se) ((Object) var3_ref)).c(gh.a(param0.field_a, (byte) -117), -s.field_b[0] + (s.field_b[2] + s.field_b[3] >> 396477505), la.field_b.field_H, 12690143, -1);
                if (!param0.field_c.equals("")) {
                  L3: {
                    var7 = u.a(var3_ref, (byte) 124, param0.field_c, ek.field_c, 12690143, -s.field_b[3] + s.field_b[4] - 25);
                    var8 = 10 + -s.field_b[0] + s.field_b[3];
                    if (param0.field_f > 0) {
                      var9 = ue.field_i[0];
                      break L3;
                    } else {
                      if (param0.field_f < 0) {
                        var9 = ue.field_i[1];
                        break L3;
                      } else {
                        var9 = ue.field_i[8];
                        break L3;
                      }
                    }
                  }
                  var9.h(var8, 0);
                  ((se) ((Object) var3_ref)).b(var7, var8 + 20, ((se) ((Object) var3_ref)).field_H, 12690143, -1);
                  break L2;
                } else {
                  ((se) ((Object) var11)).c("-", (s.field_b[4] + s.field_b[3] >> 954442785) - s.field_b[0], la.field_b.field_H, 12690143, -1);
                  break L2;
                }
              }
              if (param1 > 117) {
                jh.b();
                this.field_u = rb.a(8, var6, 12690143, (byte) -38);
                this.field_v = rb.a(16, var6, 255, (byte) -74);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var3);
            stackOut_19_1 = new StringBuilder().append("bg.G(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L4;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final static nh a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        if (param3) {
            field_t = (String) null;
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
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var8 = DungeonAssault.field_K;
        if (vd.field_a == param1) {
            return;
        }
        if (param0 >= -96) {
            this.field_w = (rh) null;
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
        for (var7 = 0; var7 < var6; var7++) {
            incrementValue$0 = var5;
            var5++;
            incrementValue$1 = var4;
            var4++;
            var9[incrementValue$0] = fb.field_d[incrementValue$1];
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
        int discarded$1 = 0;
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        cn var11 = null;
        int var12 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var12 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (param0 == rb.field_N) {
                stackOut_3_0 = 16760960;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = 16777215;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5_int = stackIn_4_0;
              var6 = 3446736;
              param3 = param3 + (db.field_v.field_H + 24 >> 1510174209);
              if (param1 <= -37) {
                break L2;
              } else {
                this.a((byte) 111);
                break L2;
              }
            }
            L3: {
              if (param2 == null) {
                la.field_b.c(Integer.toString(1 + param0), s.field_b[0] - -s.field_b[1] >> 304562241, param3, var5_int, -1);
                la.field_b.c(nl.field_c, s.field_b[2] + s.field_b[1] >> 1616107105, param3, var5_int, -1);
                break L3;
              } else {
                la.field_b.c(Integer.toString(1 + param2.field_b), s.field_b[0] + s.field_b[1] >> -648903839, param3, var5_int, -1);
                var7 = -5 + (-s.field_b[1] + s.field_b[2]);
                var8 = s.field_b[1] - -s.field_b[2] >> -924312639;
                this.a(var8, var7, var5_int, (byte) 125, param3, param2, var6);
                la.field_b.c(gh.a(param2.field_a, (byte) -110), s.field_b[3] + s.field_b[2] >> -1555015295, param3, var5_int, -1);
                if (0 < param2.field_c.length()) {
                  L4: {
                    var9 = u.a(la.field_b, (byte) -76, param2.field_c, ek.field_c, var5_int, -s.field_b[3] + (s.field_b[4] + -25));
                    discarded$1 = la.field_b.b(var9);
                    var10 = s.field_b[3] - -10;
                    if ((param2.field_f ^ -1) < -1) {
                      var11 = ue.field_i[0];
                      break L4;
                    } else {
                      if (-1 >= (param2.field_f ^ -1)) {
                        var11 = ue.field_i[8];
                        break L4;
                      } else {
                        var11 = ue.field_i[1];
                        break L4;
                      }
                    }
                  }
                  var11.h(var10, param3 - la.field_b.field_H);
                  la.field_b.b(var9, 20 + var10, param3, var6, -1);
                  break L3;
                } else {
                  la.field_b.c("-", s.field_b[4] + s.field_b[3] >> -650781983, param3, var5_int, -1);
                  break L3;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) (var5);
            stackOut_17_1 = new StringBuilder().append("bg.V(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    bg() {
    }

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        String var5 = null;
        String var6 = null;
        String var7 = null;
        di var8 = null;
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
            if (hh.field_s == le.field_g) {
              gd.a(dc.field_z, 0, 0, true);
              break L3;
            } else {
              if (hh.field_s != wf.field_w) {
                if (ic.field_y == hh.field_s) {
                  if (!ed.c(true)) {
                    this.field_b = (kl) ((Object) new ce(tc.field_u.toLowerCase()));
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
                      var7 = (String) null;
                      throw new RuntimeException((String) null);
                    }
                  } else {
                    var6 = (String) null;
                    throw new RuntimeException((String) null);
                  }
                } else {
                  var5 = (String) null;
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
              if (0 == (var2 ^ -1)) {
                break L7;
              } else {
                if (0 == pj.field_r) {
                  break L7;
                } else {
                  hi.field_c.a(1, pj.field_r);
                  break L7;
                }
              }
            } else {
              if (0 == (var2 ^ -1)) {
                break L7;
              } else {
                if (0 == pj.field_r) {
                  break L7;
                } else {
                  hi.field_c.a(1, pj.field_r);
                  break L7;
                }
              }
            }
          }
          L8: {
            if (param0 == 5458) {
              break L8;
            } else {
              var8 = (di) null;
              this.a((di) null, -127);
              break L8;
            }
          }
          return;
        }
    }

    static {
        field_x = "Buy";
        field_s = new md();
        field_t = "Loading...";
    }
}
