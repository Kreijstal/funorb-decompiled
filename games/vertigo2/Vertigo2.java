/*
 * Decompiled by CFR-JS 0.4.0.
 */
public final class Vertigo2 extends kd {
    static tj field_E;
    static int[][] field_J;
    static String[] field_H;
    static String field_K;
    static String field_D;
    static String[] field_I;
    static String field_F;
    static fe field_C;
    static cr field_M;
    static String[] field_G;
    public static boolean field_L;

    private final void p(int param0) {
        int var2 = 0;
        int var3 = field_L ? 1 : 0;
        if (param0 != 50) {
            return;
        }
        ap.field_d = new bl(40, 100, 260, 300, va.field_s, qr.field_h, li.field_m, tb.field_d, pc.field_c);
        ap.field_d.field_K = ar.field_a;
        ap.field_d.field_J = 0;
        ap.field_d.field_F = 16777215;
        ap.field_d.field_y = new boolean[50];
        ap.field_d.field_m = 5921370;
        ap.field_d.field_P = 16777215;
        ap.field_d.field_x = 15637810;
        ap.field_d.field_k = new String[50];
        ap.field_d.field_I = 16777215;
        for (var2 = 0; var2 < ap.field_d.field_k.length; var2++) {
            ap.field_d.field_k[var2] = Vertigo2.a(new String[]{Integer.toString(1 + var2)}, dg.field_b, 103);
        }
        ap.field_d.field_u = true;
    }

    final void f(int param0) {
        int discarded$2 = 0;
        boolean discarded$3 = false;
        int var2 = 0;
        int var3 = 0;
        Object var3_ref = null;
        int var4 = 0;
        pp var4_ref_pp = null;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        int var12_int = 0;
        tr var12 = null;
        int var13 = 0;
        int var14 = 0;
        nf var15 = null;
        Object var16 = null;
        ub var17 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_99_0 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_29_0 = null;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_98_0 = 0;
        int stackOut_97_0 = 0;
        L0: {
          var16 = null;
          var14 = field_L ? 1 : 0;
          discarded$2 = jq.a((byte) 29);
          mk.field_M = hb.b((byte) 119);
          um.h(0);
          var2 = -90 % ((-13 - param0) / 47);
          if (dc.field_L == null) {
            break L0;
          } else {
            if (!dc.field_L.field_e) {
              break L0;
            } else {
              cp.a((byte) 126);
              tg.a(96);
              break L0;
            }
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (dc.field_L == null) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          this.c(stackIn_6_1 != 0, -6);
          if (!hh.field_c) {
            break L2;
          } else {
            this.l((byte) 123);
            hh.field_c = false;
            break L2;
          }
        }
        L3: {
          rg.field_f = rg.field_f + 1;
          if (!cp.a(-109)) {
            break L3;
          } else {
            this.m(-105);
            if (cp.a(-1)) {
              if (!tk.c((byte) -94)) {
                return;
              } else {
                discarded$3 = this.a(16777215, false);
                return;
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (!rg.field_a) {
            iq.a((byte) -107, uo.field_h);
            if (!this.a(16777215, true)) {
              break L4;
            } else {
              rg.field_a = true;
              break L4;
            }
          } else {
            if (!fb.i(11)) {
              t.a((byte) 44);
              break L4;
            } else {
              if (!kg.h(114)) {
                if (!pq.b(0)) {
                  if (!rh.e((byte) 99)) {
                    this.d(false, -97);
                    break L4;
                  } else {
                    if (t.field_a != t.field_f) {
                      this.d(false, -104);
                      break L4;
                    } else {
                      L5: {
                        var3 = Vertigo2.p((byte) -78);
                        if ((var3 ^ -1) == -2) {
                          ad.field_h = true;
                          ip.a((byte) -71, oc.field_x, 0);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      this.d(true, -110);
                      break L4;
                    }
                  }
                } else {
                  L6: {
                    stackOut_29_0 = this;
                    stackIn_31_0 = stackOut_29_0;
                    stackIn_30_0 = stackOut_29_0;
                    if (dc.field_L == null) {
                      stackOut_31_0 = this;
                      stackOut_31_1 = 0;
                      stackIn_32_0 = stackOut_31_0;
                      stackIn_32_1 = stackOut_31_1;
                      break L6;
                    } else {
                      stackOut_30_0 = this;
                      stackOut_30_1 = 1;
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_32_1 = stackOut_30_1;
                      break L6;
                    }
                  }
                  L7: {
                    var3 = this.b(stackIn_32_1 != 0, 125);
                    if (-2 == (var3 ^ -1)) {
                      break L7;
                    } else {
                      if ((var3 ^ -1) == -3) {
                        break L7;
                      } else {
                        this.d(true, -107);
                        break L4;
                      }
                    }
                  }
                  L8: {
                    if (null != dc.field_L) {
                      cp.a((byte) 127);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  L9: {
                    if (-3 == (var3 ^ -1)) {
                      sf.a((java.applet.Applet) (this), -85);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  this.d(true, -107);
                  break L4;
                }
              } else {
                if (t.field_a != t.field_f) {
                  this.d(false, -111);
                  break L4;
                } else {
                  var3 = lr.e((byte) -116);
                  if ((var3 ^ -1) != -3) {
                    if ((var3 ^ -1) == -4) {
                      ig.a(9790, true);
                      this.d(true, -93);
                      break L4;
                    } else {
                      if ((var3 ^ -1) != -5) {
                        this.d(true, -93);
                        break L4;
                      } else {
                        jo.field_d = true;
                        ip.a((byte) -65, ob.field_I, 0);
                        this.d(true, -93);
                        break L4;
                      }
                    }
                  } else {
                    cp.a((byte) 125);
                    break L4;
                  }
                }
              }
            }
          }
        }
        L10: {
          if (ag.b(49)) {
            break L10;
          } else {
            L11: while (true) {
              var15 = (nf) ((Object) fg.field_eb.b((byte) -43));
              if (var15 != null) {
                de.a(4, var15, 4);
                continue L11;
              } else {
                L12: while (true) {
                  var17 = (ub) ((Object) oh.field_D.b((byte) -43));
                  if (var17 == null) {
                    break L10;
                  } else {
                    jk.a(5, (byte) 44, var17);
                    continue L12;
                  }
                }
              }
            }
          }
        }
        L13: while (true) {
          if (!j.a(0, ok.field_d)) {
            L14: {
              lf.d(75, 0);
              if (!eo.field_o) {
                break L14;
              } else {
                wg.field_g = 0;
                break L14;
              }
            }
            L15: {
              if (va.b((byte) -81)) {
                L16: {
                  L17: {
                    var3 = this.h((byte) -127);
                    if (var3 == 0) {
                      break L17;
                    } else {
                      if (-2 != (var3 ^ -1)) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  en.a(true);
                  if (1 == var3) {
                    kj.field_C = true;
                    rg.field_b = true;
                    break L16;
                  } else {
                    L18: {
                      if (!oj.field_P) {
                        break L18;
                      } else {
                        an.field_c = true;
                        sk.field_g = true;
                        lc.field_d = false;
                        if (am.field_b) {
                          ke.field_i = qp.field_c;
                          gj.a((byte) -103, false, am.field_n, 11);
                          g.b(7);
                          fh.field_y[lc.field_b].a(-91, false, 0);
                          ed.field_q = false;
                          am.field_b = false;
                          oj.field_P = false;
                          vl.a(-115);
                          ki.a((byte) -72);
                          ua.a(-5141);
                          kj.field_C = false;
                          rg.field_b = false;
                          break L16;
                        } else {
                          gj.a((byte) 124, false, am.field_n, 0);
                          g.b(7);
                          fh.field_y[lc.field_b].a(-91, false, 0);
                          ed.field_q = false;
                          am.field_b = false;
                          oj.field_P = false;
                          vl.a(-115);
                          ki.a((byte) -72);
                          ua.a(-5141);
                          break L18;
                        }
                      }
                    }
                    kj.field_C = false;
                    rg.field_b = false;
                    break L16;
                  }
                }
                L19: {
                  var4 = 0;
                  if (2 != var3) {
                    break L19;
                  } else {
                    var4 = 1;
                    break L19;
                  }
                }
                L20: {
                  L21: {
                    if (oj.field_P) {
                      break L21;
                    } else {
                      if (rg.field_b) {
                        break L21;
                      } else {
                        if (kj.field_C) {
                          break L21;
                        } else {
                          break L20;
                        }
                      }
                    }
                  }
                  var4 = 1;
                  break L20;
                }
                L22: {
                  if (va.b((byte) -81)) {
                    break L22;
                  } else {
                    var4 = 0;
                    break L22;
                  }
                }
                if (var4 != 0) {
                  wp.a(10);
                  break L15;
                } else {
                  break L15;
                }
              } else {
                break L15;
              }
            }
            return;
          } else {
            if ((lc.field_f ^ -1) != -70) {
              if (9 == lc.field_f) {
                g.b(7);
                rg.field_b = false;
                am.field_n = 11;
                kj.field_C = false;
                rg.field_b = false;
                ke.field_i = id.field_f.f(128);
                continue L13;
              } else {
                if (lc.field_f != 14) {
                  if (lc.field_f == 15) {
                    L23: {
                      if (oj.field_P) {
                        g.b(7);
                        ki.a((byte) -128);
                        ua.a(-5141);
                        am.field_b = false;
                        ed.field_q = false;
                        am.field_n = 0;
                        oj.field_P = false;
                        lc.field_d = false;
                        sk.field_g = true;
                        an.field_c = true;
                        vl.a(-127);
                        break L23;
                      } else {
                        break L23;
                      }
                    }
                    kj.field_C = false;
                    rg.field_b = false;
                    continue L13;
                  } else {
                    L24: {
                      if (lc.field_f != 10) {
                        break L24;
                      } else {
                        if (!oj.field_P) {
                          break L24;
                        } else {
                          tq.a((byte) -66);
                          continue L13;
                        }
                      }
                    }
                    if (lc.field_f == 67) {
                      L25: {
                        var3 = id.field_f.b(true);
                        var3 = var3 & (ml.field_z ^ -1);
                        if (!sp.field_V) {
                          break L25;
                        } else {
                          var4 = 0;
                          L26: while (true) {
                            if (hi.field_i.length <= var4) {
                              break L25;
                            } else {
                              if ((1 << var4 & var3) != 0) {
                                bg.field_b.a(new fa(var4), false);
                                var4++;
                                continue L26;
                              } else {
                                var4++;
                                continue L26;
                              }
                            }
                          }
                        }
                      }
                      ml.field_z = ml.field_z | var3;
                      jq.field_e = jq.field_e | var3;
                      continue L13;
                    } else {
                      L27: {
                        if ((lc.field_f ^ -1) == -58) {
                          break L27;
                        } else {
                          if (58 != lc.field_f) {
                            if (lc.field_f != 59) {
                              L28: {
                                var3_ref = null;
                                if (am.field_b) {
                                  var3_ref = ln.field_d;
                                  break L28;
                                } else {
                                  if (ed.field_q) {
                                    var3_ref = oe.field_pb;
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                              }
                              L29: {
                                if (var3_ref != null) {
                                  if ((lc.field_f ^ -1) == -71) {
                                    var4_ref_pp = new pp(((tr) (var3_ref)).field_D.field_z);
                                    var4_ref_pp.a((byte) -8, ((tr) (var3_ref)).field_B, id.field_f);
                                    ((tr) (var3_ref)).a(10, var4_ref_pp);
                                    continue L13;
                                  } else {
                                    if (lc.field_f != 62) {
                                      if (lc.field_f != 63) {
                                        if (-65 != (lc.field_f ^ -1)) {
                                          if (lc.field_f != 65) {
                                            if (-67 != (lc.field_f ^ -1)) {
                                              break L29;
                                            } else {
                                              ((tr) (var3_ref)).field_h = id.field_f.h(-11);
                                              if (null == ln.field_d) {
                                                continue L13;
                                              } else {
                                                mq.b(true);
                                                continue L13;
                                              }
                                            }
                                          } else {
                                            ((tr) (var3_ref)).field_D.field_t = id.field_f.h(-11);
                                            if (ln.field_d != null) {
                                              mq.b(true);
                                              continue L13;
                                            } else {
                                              continue L13;
                                            }
                                          }
                                        } else {
                                          ((tr) (var3_ref)).field_D.field_u = id.field_f.h(-11);
                                          continue L13;
                                        }
                                      } else {
                                        ((tr) (var3_ref)).field_D.field_d = id.field_f.h(-11);
                                        if (ln.field_d == null) {
                                          continue L13;
                                        } else {
                                          jc.b(10);
                                          continue L13;
                                        }
                                      }
                                    } else {
                                      var4 = id.field_f.g(88);
                                      var5 = id.field_f.h(-11);
                                      var6 = id.field_f.h(-11);
                                      ((tr) (var3_ref)).field_D.a((byte) 2, var4);
                                      ((tr) (var3_ref)).field_D.field_g = var6;
                                      ((tr) (var3_ref)).field_D.field_f = var5;
                                      var7 = var3_ref;
                                      if (2 != ((tr) (var7)).field_D.field_j) {
                                        gj.a((byte) -81, true, am.field_n, 15);
                                        continue L13;
                                      } else {
                                        gj.a((byte) 63, true, am.field_n, 16);
                                        continue L13;
                                      }
                                    }
                                  }
                                } else {
                                  break L29;
                                }
                              }
                              this.g(-109);
                              continue L13;
                            } else {
                              L30: {
                                L31: {
                                  if (am.field_b) {
                                    break L31;
                                  } else {
                                    if (ed.field_q) {
                                      break L31;
                                    } else {
                                      break L30;
                                    }
                                  }
                                }
                                L32: {
                                  g.b(7);
                                  if (!am.field_b) {
                                    break L32;
                                  } else {
                                    ln.field_d.a(2, false);
                                    break L32;
                                  }
                                }
                                an.field_c = true;
                                wg.field_g = 0;
                                eo.field_o = true;
                                lc.field_d = false;
                                ed.field_q = false;
                                am.field_n = -2;
                                am.field_b = false;
                                vl.a(-118);
                                break L30;
                              }
                              kj.field_C = false;
                              continue L13;
                            }
                          } else {
                            break L27;
                          }
                        }
                      }
                      L33: {
                        g.b(7);
                        var3 = id.field_f.h(-11);
                        var4 = id.field_f.h(-11);
                        var5 = id.field_f.h(-11);
                        var6 = id.field_f.h(-11);
                        var7_int = id.field_f.a((byte) -11);
                        var8 = id.field_f.a((byte) -11);
                        if (id.field_f.h(-11) == 0) {
                          stackOut_98_0 = 0;
                          stackIn_99_0 = stackOut_98_0;
                          break L33;
                        } else {
                          stackOut_97_0 = 1;
                          stackIn_99_0 = stackOut_97_0;
                          break L33;
                        }
                      }
                      var9 = stackIn_99_0;
                      var10 = -2 + id.field_f.h(-11);
                      var11 = new String[id.field_f.h(-11)];
                      var12_int = 0;
                      L34: while (true) {
                        if (var12_int >= var11.length) {
                          L35: {
                            uh.field_Xb = null;
                            j.field_n = null;
                            var12 = new tr(true, var11, var10, var9 != 0, var3, var4, var5, var6);
                            var12.field_D.field_f = var7_int;
                            var12.field_D.field_g = var8;
                            var13 = id.field_f.h(-11);
                            if ((var13 ^ -1) == -2) {
                              var12.a(16, id.field_f.h(-11));
                              var12.field_D.field_q = id.field_f.b(true);
                              var12.a(id.field_f, 101);
                              break L35;
                            } else {
                              break L35;
                            }
                          }
                          L36: {
                            if (an.field_c) {
                              ln.field_d = null;
                              oe.field_pb = null;
                              an.field_c = false;
                              break L36;
                            } else {
                              break L36;
                            }
                          }
                          L37: {
                            if (-58 == (lc.field_f ^ -1)) {
                              am.field_b = true;
                              ln.field_d = var12;
                              jc.b(10);
                              mq.b(true);
                              mb.b((byte) -110);
                              break L37;
                            } else {
                              oe.field_pb = var12;
                              ed.field_q = true;
                              break L37;
                            }
                          }
                          lc.field_d = true;
                          kj.field_C = false;
                          am.field_n = -1;
                          continue L13;
                        } else {
                          var11[var12_int] = id.field_f.f(128);
                          var12_int++;
                          continue L34;
                        }
                      }
                    }
                  }
                } else {
                  g.b(7);
                  so.a(un.b((byte) 114), 3, 150, 1024, re.c(-1087), rm.field_A, th.a(true), qp.a(2000, 70), 113, qp.a(8, 72));
                  wn.a(-122, cf.a(true), pp.a(12));
                  rg.field_b = false;
                  oj.field_P = true;
                  am.field_n = -2;
                  continue L13;
                }
              }
            } else {
              L38: {
                if (ig.field_c == null) {
                  ig.field_c = new short[50];
                  break L38;
                } else {
                  break L38;
                }
              }
              var3 = 0;
              L39: while (true) {
                if (var3 >= 50) {
                  continue L13;
                } else {
                  ig.field_c[var3] = (short)id.field_f.a((byte) -11);
                  if (0 == ig.field_c[var3]) {
                    ig.field_c[var3] = (short)30000;
                    var3++;
                    continue L39;
                  } else {
                    var3++;
                    continue L39;
                  }
                }
              }
            }
          }
        }
    }

    private final void n(byte param0) {
        er var3 = null;
        er var4 = null;
        er var5 = null;
        er var6 = null;
        er var7 = null;
        er var8 = null;
        ee.a(11579, nn.field_y);
        var7 = new er(nn.field_y.a("", "nebula_2_v2.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        var8 = var7;
        var3 = new er(nn.field_y.a("", "nebula_1.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        var4 = new er(nn.field_y.a("", "planet_1.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        var5 = new er(nn.field_y.a("", "stars.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        var6 = new er(nn.field_y.a("", "asteroids.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        qr.field_l = new rp(true, new er[]{var7, var3, var4, var5, var7.c(), var6});
        ue.field_N = new er(640, 480);
        ue.field_N.d();
        var8.c(0, 0);
        if (param0 <= -89) {
          var3.c(var8.field_y, 0);
          var4.c(0, var8.field_t);
          var5.c(var8.field_y, var8.field_t);
          ro.field_g.a(-128);
          nn.field_y = null;
          this.d(-17);
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        nm.k(8);
        if (param0 >= -113) {
            this.b((byte) 27);
        }
        if (!(null == dc.field_L)) {
            cp.a((byte) 124);
        }
        we.i(-1733144127);
    }

    private final void q(int param0) {
        int var2 = 0;
        boolean discarded$3 = false;
        int var3 = field_L ? 1 : 0;
        on.field_b[0][0] = hp.a(gp.field_s, "", "v_menu_select").a();
        on.field_b[1][0] = hp.a(gp.field_s, "", "v_explode").a();
        if (param0 != 19804) {
            return;
        }
        on.field_b[2][0] = hp.a(gp.field_s, "", "v_deflate").a();
        on.field_b[3] = new ae[2];
        on.field_b[3][0] = hp.a(gp.field_s, "", "v_teleport").a();
        on.field_b[3][1] = hp.a(gp.field_s, "", "v_teleport_2").a();
        on.field_b[5][0] = vh.a(mj.field_b, "", "whee").b();
        on.field_b[6][0] = vh.a(mj.field_b, "", "v_fall").b();
        on.field_b[7][0] = vh.a(mj.field_b, "", "v_extra_life").b();
        on.field_b[8][0] = hp.a(gp.field_s, "", "v_paint_collect").a();
        this.a(1, "v_brush", 4, 9);
        on.field_b[10] = new ae[4];
        on.field_b[10][0] = hp.a(gp.field_s, "", "v_rocket_pack_start").a();
        on.field_b[10][1] = hp.a(gp.field_s, "", "v_rocket_pack_end").a();
        on.field_b[10][2] = hp.a(gp.field_s, "", "v_rocket_pack_ready").a();
        on.field_b[10][3] = hp.a(gp.field_s, "", "v_rocket_pack_loop").a();
        this.a(1, "v_jump", 3, 11);
        on.field_b[12][0] = hp.a(gp.field_s, "", "v_sticky_block").a();
        this.a(1, "v_land", 2, 13);
        on.field_b[14][0] = hp.a(gp.field_s, "", "v_trampoline_jump").a();
        on.field_b[15][0] = hp.a(gp.field_s, "", "v_spring_jump").a();
        on.field_b[16][0] = hp.a(gp.field_s, "", "v_flip_brush").a();
        on.field_b[17][0] = hp.a(gp.field_s, "", "v_coin_collect").a();
        on.field_b[18][0] = on.field_b[5][0];
        on.field_b[19][0] = hp.a(gp.field_s, "", "v_spring_jump_power_up").a();
        on.field_b[20][0] = hp.a(gp.field_s, "", "v_dynamite_collect").a();
        on.field_b[21][0] = hp.a(gp.field_s, "", "v_crumble_platform").a();
        on.field_b[22][0] = hp.a(gp.field_s, "", "v_teleporter_loop").a();
        on.field_b[23][0] = hp.a(gp.field_s, "", "v_fan_loop").a();
        on.field_b[24][0] = hp.a(gp.field_s, "", "v_spikes").a();
        on.field_b[25] = new ae[3];
        on.field_b[25][0] = vh.a(mj.field_b, "", "v_hmm_easy").b();
        on.field_b[25][1] = vh.a(mj.field_b, "", "v_yeah").b();
        on.field_b[25][2] = vh.a(mj.field_b, "", "v_phew").b();
        on.field_b[26][0] = hp.a(gp.field_s, "", "v_paint_runout").a();
        on.field_b[27] = new ae[3];
        on.field_b[27][0] = vh.a(mj.field_b, "", "v_near_edge_1").b();
        on.field_b[27][1] = vh.a(mj.field_b, "", "v_near_edge_2").b();
        on.field_b[27][2] = vh.a(mj.field_b, "", "v_near_edge_3").b();
        on.field_b[28][0] = hp.a(gp.field_s, "", "v_last_block").a();
        on.field_b[29][0] = hp.a(gp.field_s, "", "v_level_select").a();
        rr.field_B[0] = ra.a(on.field_b[23][0], 100, 96);
        rr.field_B[1] = ra.a(on.field_b[22][0], 100, 96);
        rr.field_B[0].i(-1);
        rr.field_B[1].i(-1);
        rr.field_B[2] = ra.a(on.field_b[10][3], 100, 96);
        rr.field_B[2].i(-1);
        op.field_d = si.a(le.field_f, "", "vertigo2_theme");
        up.field_B[0] = si.a(le.field_f, "", "vertigo2_level_1");
        up.field_B[1] = si.a(le.field_f, "", "vertigo2_level_2");
        up.field_B[2] = si.a(le.field_f, "", "vertigo2_level_3");
        kc.field_b = si.a(le.field_f, "", "vertigo2_lvl_complete_jingle");
        rf.field_o = si.a(le.field_f, "", "vertigo2_lvl_start_jingle");
        nq.field_D = si.a(le.field_f, "", "vertigo2_game_over_jingle");
        si discarded$0 = si.a(le.field_f, "", "vertigo2_multiplayer_lvl_lost_jingle");
        si discarded$1 = si.a(le.field_f, "", "vertigo2_time_running_out_jingle");
        boolean discarded$2 = qc.field_v.a(0, jk.field_b, op.field_d, re.field_d, (byte) 75);
        for (var2 = 0; var2 < up.field_B.length; var2++) {
            discarded$3 = qc.field_v.a(0, jk.field_b, up.field_B[var2], re.field_d, (byte) 56);
        }
        mj.field_b = null;
        gp.field_s = null;
        this.d(-17);
    }

    private final void o(byte param0) {
        int var2 = 0;
        int var3 = field_L ? 1 : 0;
        qi.field_d = new bl(40, 100, 260, 300, va.field_s, qr.field_h, li.field_m, tb.field_d, pc.field_c);
        if (param0 < 80) {
            field_C = (fe) null;
        }
        qi.field_d.field_F = 16777215;
        qi.field_d.field_P = 16777215;
        qi.field_d.field_I = 16777215;
        qi.field_d.field_m = 5921370;
        qi.field_d.field_y = new boolean[50];
        qi.field_d.field_k = new String[50];
        qi.field_d.field_x = 15637810;
        qi.field_d.field_J = 0;
        for (var2 = 0; var2 < qi.field_d.field_k.length; var2++) {
            qi.field_d.field_k[var2] = Vertigo2.a(new String[]{Integer.toString(var2 + 1)}, bl.field_o, -121);
        }
        qi.field_d.field_u = false;
    }

    final void b(int param0) {
        this.a(4, 0, 19, 1, false, -16, 2, 64);
        db var3 = new db();
        var3.a(9, true, 128);
        nr.a(true, var3, 22050, gi.field_s, 1024, (java.awt.Component) ((Object) ne.field_F));
        t.field_c = 4473924;
        oi.field_b = 16777215;
        sr.field_a = 16777215;
        vg.field_d = 128;
        ma.field_m = 16777215;
        vm.field_b = param0;
        this.a(true, false, true, true, false, false, true);
        ok.field_d[9] = -1;
        ok.field_d[65] = 1;
        ok.field_d[64] = 1;
        ok.field_d[63] = 1;
        ok.field_d[58] = -2;
        ok.field_d[10] = -1;
        ok.field_d[66] = 1;
        ok.field_d[57] = -2;
        ok.field_d[67] = 4;
        ok.field_d[62] = 3;
        ok.field_d[70] = -2;
        ok.field_d[69] = 100;
    }

    private final void j(byte param0) {
        er discarded$1 = null;
        u[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        er[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        er[] var10 = null;
        u[] var11 = null;
        L0: {
          var9 = field_L ? 1 : 0;
          tk.field_c = (cc) ((Object) w.a(ac.field_G, ml.field_y, "", "kartika13", 119));
          vj.field_b = mi.a("achievementsgame", rn.field_u, (byte) 34, "");
          var11 = new u[19];
          var2 = var11;
          var11[0] = vl.a(0, "", rn.field_u, "keys_esc");
          var11[1] = vl.a(0, "", rn.field_u, "keys_right");
          var2[2] = vl.a(tk.a((int) param0, 31), "", rn.field_u, "keys_left");
          var11[3] = vl.a(0, "", rn.field_u, "keys_down");
          var11[4] = vl.a(0, "", rn.field_u, "keys_up");
          var11[5] = vl.a(0, "", rn.field_u, "keys_space");
          var11[6] = vl.a(0, "", rn.field_u, "keys_ctrl");
          var11[7] = vl.a(0, "", rn.field_u, "keys_enter");
          var11[8] = vl.a(0, "", rn.field_u, "keys_shift");
          var2[9] = vl.a(tk.a((int) param0, 31), "", rn.field_u, "keys_w");
          var11[10] = vl.a(0, "", rn.field_u, "keys_a");
          var11[11] = vl.a(0, "", rn.field_u, "keys_s");
          var11[12] = vl.a(0, "", rn.field_u, "keys_d");
          var11[13] = vl.a(0, "", rn.field_u, "keys_f1");
          var11[14] = vl.a(0, "", rn.field_u, "keys_q");
          var11[15] = vl.a(0, "", rn.field_u, "keys_e");
          var11[16] = vl.a(0, "", rn.field_u, "keys_lt");
          var2[17] = vl.a(param0 + -31, "", rn.field_u, "keys_gt");
          var2[18] = vl.a(tk.a((int) param0, 31), "", rn.field_u, "keys_f12");
          tk.field_c.a(var2, (int[]) null);
          fa.field_s = lm.a("", param0 + 23078, "button_purple_frame", rn.field_u);
          uk.field_r = lm.a("", 23109, "button_blue_frame", rn.field_u);
          mn.field_o = new er[3];
          mn.field_o[0] = tn.a("button_start_blue", rn.field_u, -117, "");
          mn.field_o[1] = tn.a("button_middle_blue", rn.field_u, -108, "");
          mn.field_o[2] = tn.a("button_end_blue", rn.field_u, tk.a((int) param0, -102), "");
          if (param0 == 31) {
            break L0;
          } else {
            field_I = (String[]) null;
            break L0;
          }
        }
        sq.field_a = new er[3];
        sq.field_a[0] = tn.a("button_start_grey", rn.field_u, -111, "");
        sq.field_a[1] = tn.a("button_middle_grey", rn.field_u, -114, "");
        sq.field_a[2] = tn.a("button_end_grey", rn.field_u, -128, "");
        ln.field_b = new er[3];
        ln.field_b[0] = tn.a("button_start_purple", rn.field_u, -126, "");
        ln.field_b[1] = tn.a("button_middle_purple", rn.field_u, tk.a((int) param0, -83), "");
        ln.field_b[2] = tn.a("button_end_purple", rn.field_u, tk.a((int) param0, -84), "");
        vp.field_b = tn.a("unachieved", ml.field_y, -94, "basic");
        wa.field_f = tn.a("orbcoin", ml.field_y, -83, "basic");
        uh.a(false, vp.field_b);
        uh.a(false, wa.field_f);
        uq.field_a = (fe) ((Object) rq.a(rn.field_u, "menu_base", "", (byte) 98));
        ie.field_Hb = (fe) ((Object) rq.a(rn.field_u, "game_complete", "", (byte) 98));
        la.field_a = (cc) ((Object) rl.a(rn.field_u, 12, vi.field_n, "", "title_font"));
        va.field_s = new wn(w.a(vi.field_n, rn.field_u, "interface_font", "", param0 + 96));
        cd.field_b = tn.a("options_brush_01", rn.field_u, -94, "");
        or.field_b = tn.a("options_brush_02", rn.field_u, -103, "");
        tb.field_d = tn.a("levelselect_tab", rn.field_u, -110, "");
        qr.field_h = tn.a("levelselect_arrow_normal", rn.field_u, -126, "");
        li.field_m = tn.a("levelselect_arrow_pressed", rn.field_u, -121, "");
        pc.field_c = null;
        qp.field_h = (fe) ((Object) rq.a(rn.field_u, "interface_box_mid", "", (byte) 98));
        qe.field_W = (fe) ((Object) rq.a(rn.field_u, "interface_box_end", "", (byte) 98));
        ln.field_f = (fe) ((Object) rq.a(rn.field_u, "interface_box_rend", "", (byte) 98));
        var3 = tk.field_c.field_z + tk.field_c.field_M;
        k.field_c = new er(var3, var3);
        k.field_c.d();
        wa.field_f.b(0, 0, var3, var3);
        wa.field_f = null;
        ro.field_g.a(param0 + 77);
        var4_int = 0;
        L1: while (true) {
          if (var4_int >= mb.field_q.length) {
            var4_int = 0;
            L2: while (true) {
              if (var4_int >= td.field_l.length) {
                tn.field_i = (fe) ((Object) rq.a(rn.field_u, "interface_lives", "", (byte) 98));
                bj.field_j = (fe) ((Object) rq.a(rn.field_u, "interface_jetpack", "", (byte) 98));
                be.field_n = (fe) ((Object) rq.a(rn.field_u, "interface_dynamite", "", (byte) 98));
                uo.field_e = (fe) ((Object) rq.a(rn.field_u, "interface_bucket_6", "", (byte) 98));
                oj.field_L = (fe) ((Object) rq.a(rn.field_u, "lobby_logo", "", (byte) 98));
                im.field_c = new fe[5];
                bh.field_y = new fe[5];
                var4_int = 0;
                L3: while (true) {
                  if (5 <= var4_int) {
                    var4_int = 0;
                    L4: while (true) {
                      if (var4_int >= 5) {
                        sf.field_b = (fe) ((Object) rq.a(rn.field_u, "star", "", (byte) 98));
                        am.field_o = (fe) ((Object) rq.a(rn.field_u, "cloud", "", (byte) 98));
                        field_C = (fe) ((Object) rq.a(rn.field_u, "planet1", "", (byte) 98));
                        ji.field_p = (fe) ((Object) rq.a(rn.field_u, "planet2", "", (byte) 98));
                        jf.field_M = (fe) ((Object) rq.a(rn.field_u, "nebula", "", (byte) 98));
                        mp.field_a = (fe) ((Object) rq.a(rn.field_u, "instructions_how_to_play", "", (byte) 98));
                        li.field_i = new fe[aa.field_Sb.length];
                        var4_int = 0;
                        L5: while (true) {
                          if (aa.field_Sb.length <= var4_int) {
                            vj.field_g = new fe[bg.field_e.length];
                            var4_int = 0;
                            L6: while (true) {
                              if (bg.field_e.length <= var4_int) {
                                eq.field_F = (fe) ((Object) rq.a(rn.field_u, "maintitle", "", (byte) 98));
                                discarded$1 = rq.a(rn.field_u, "timeattack_complete", "", (byte) 98);
                                hh.field_a = (fe) ((Object) rq.a(rn.field_u, "timeattack_bronze", "", (byte) 98));
                                kq.field_Kb = (fe) ((Object) rq.a(rn.field_u, "timeattack_silver", "", (byte) 98));
                                il.field_c = (fe) ((Object) rq.a(rn.field_u, "timeattack_gold", "", (byte) 98));
                                var4 = new er[][]{new er[]{tn.a("coop_icon", rn.field_u, -79, ""), tn.a("versus_icon", rn.field_u, -108, "")}, gk.a(rn.field_u, "", "start_icon", true), gk.a(rn.field_u, "", "end_icon", true)};
                                mh.a(true, var4, fd.field_q, 3, ac.field_G, m.field_z, true, ho.field_e, wo.field_V, wa.field_e, var4, 2, wa.field_e, rm.field_A, ml.field_y);
                                jl.field_g = (er) ((Object) oj.field_L);
                                ll.a((byte) -111, 200);
                                vb.field_g = true;
                                gr.field_W = eg.field_s;
                                dl.field_b = vg.field_c;
                                be.a(-103, uk.field_r, 320, 20, 16766751, 10, 5, 16777215, (er[]) null, 8, fa.field_s, 8, va.field_s.field_f, 280, 16777215);
                                var5 = tk.field_c.field_t - -tk.field_c.field_M;
                                var6 = tk.field_c.field_t;
                                var7 = va.field_s.field_f.field_t - -va.field_s.field_f.field_M;
                                var8 = va.field_s.field_f.field_t;
                                var10 = (er[]) null;
                                ua.a(12, uk.field_r, 320, var7, 480, 240, 10, fa.field_s, 12, va.field_s.field_f, 0, var5, 16777215, 16777215, 16777215, var6, (er[]) null, 0, var8, (byte) 92, tk.field_c);
                                di.b((byte) -90);
                                rn.field_u = null;
                                this.d(param0 + -48);
                                return;
                              } else {
                                vj.field_g[var4_int] = (fe) ((Object) rq.a(rn.field_u, "instructions_item_" + var4_int, "", (byte) 98));
                                var4_int++;
                                continue L6;
                              }
                            }
                          } else {
                            li.field_i[var4_int] = (fe) ((Object) rq.a(rn.field_u, "instructions_block_" + var4_int, "", (byte) 98));
                            var4_int++;
                            continue L5;
                          }
                        }
                      } else {
                        bh.field_y[var4_int] = (fe) ((Object) rq.a(rn.field_u, "interface_bucket_blue_" + (-var4_int + 5), "", (byte) 98));
                        var4_int++;
                        continue L4;
                      }
                    }
                  } else {
                    im.field_c[var4_int] = (fe) ((Object) rq.a(rn.field_u, "interface_bucket_" + (-var4_int + 5), "", (byte) 98));
                    var4_int++;
                    continue L3;
                  }
                }
              } else {
                ea.field_d[var4_int] = an.b(119, td.field_l[var4_int]);
                var4_int++;
                continue L2;
              }
            }
          } else {
            if (null != mb.field_q[var4_int]) {
              th.field_f[var4_int] = an.b(118, mb.field_q[var4_int]);
              var4_int++;
              continue L1;
            } else {
              var4_int++;
              continue L1;
            }
          }
        }
    }

    public final void init() {
        this.a(20, 0, "vertigo2");
    }

    final void d(byte param0) {
        L0: {
          Vertigo2.m((byte) 25);
          cg.a((byte) 92);
          ir.a(false);
          bc.a(7);
          rc.a(true);
          og.c((byte) 26);
          sa.a(-31417);
          oo.a();
          nr.b((byte) 120);
          fa.a((byte) -128);
          nj.a(0);
          bi.d();
          tl.a(true);
          r.a(-54);
          cc.a();
          lh.b((byte) 41);
          db.f(97);
          mh.a(-1);
          vh.c();
          id.a((byte) 76);
          ke.a((byte) -125);
          n.a(69);
          ib.a((byte) -35);
          fr.a(false);
          kh.a(false);
          kc.a(false);
          bf.a(104);
          ci.a(64);
          kd.a(true);
          mr.c(true);
          gn.a((byte) 37);
          mf.a(9000);
          vm.a(-586);
          gh.a((byte) 121);
          ea.a((byte) -28);
          as.a(-92);
          ag.a(-2883);
          dj.a(16363);
          ti.a(24260);
          ni.b(false);
          pp.e(87);
          sc.a(4);
          dg.a(0);
          qb.a((byte) -3);
          il.b(0);
          sk.a((byte) 0);
          ed.e(105);
          gk.b(-1060);
          le.a((byte) -87);
          ip.a(-1423419167);
          mm.a((byte) 114);
          ki.a(-7);
          eb.a((byte) 15);
          ja.b(127);
          tn.a(-101);
          ug.c(0);
          lk.b(-18390);
          th.a((byte) -123);
          qi.a(8462);
          ar.c(0);
          wn.a(23744);
          bl.a((byte) -50);
          fo.f((byte) 123);
          tr.a(false);
          rp.a(-78);
          an.a(true);
          li.d(55);
          jl.a(6);
          pe.a(true);
          qd.g();
          rq.e(0);
          dd.a();
          fk.e(-257);
          uj.a(true);
          fh.h(-90);
          mp.a(-127);
          ca.a((byte) -90);
          cr.a(false);
          uh.b((byte) -69);
          fi.c(0);
          bs.b((byte) 100);
          mi.r(116);
          jd.a(-109);
          tk.a((byte) 95);
          t.a(false);
          kr.c(5);
          im.e(33);
          ff.a((byte) 120);
          k.b(-102);
          ab.a(0);
          pd.a(1000000);
          sd.j(-25849);
          oe.p(12705);
          fg.m(-15691);
          ga.m(11840);
          fj.n(-74);
          mk.k(4);
          qm.a(-120);
          ob.a((byte) -103);
          ne.a((byte) -125);
          qj.a((byte) 56);
          mc.a(-119);
          ok.a(2);
          tb.a(30272);
          la.a(false);
          ui.a(64);
          he.a((byte) -125);
          wj.a(-112);
          wg.d(-900429434);
          go.a(-128);
          wo.n(511);
          am.b(1);
          bh.a(0);
          lj.d(1);
          me.a(6457);
          or.a((byte) 87);
          dn.a();
          rd.b();
          gp.g(52);
          fq.a(-126);
          fb.a((byte) 115);
          ua.a((byte) 114);
          vd.a(-115);
          sm.a((byte) 76);
          ie.o(-115);
          kq.k(112);
          dm.l(-1);
          b.b(-90);
          od.k(-23936);
          cb.b(false);
          gm.b(0);
          nk.a((byte) -67);
          lb.a((byte) -120);
          mj.a(18641);
          l.a(false);
          fc.d();
          lg.a();
          op.a(0);
          jg.b(false);
          cd.a(123);
          bg.a((byte) 9);
          dl.a((byte) -119);
          hb.c(2);
          ha.b((byte) -123);
          in.a(0);
          lc.a(30015);
          ap.a((byte) 25);
          en.a(4096);
          tq.a(13597);
          v.a(-18);
          wa.a(124);
          on.a(true);
          bo.a(103);
          hd.b(1);
          ql.j(30560);
          np.a((byte) 123);
          rn.e(107);
          p.b(0);
          tm.a(127);
          eg.h(3);
          ak.b(-56);
          ia.j(-20657);
          qh.c(115);
          nq.j(-124);
          uk.b((byte) -101);
          bj.a(false);
          ln.a(-47);
          vj.a(-11590);
          rk.a(false);
          tg.b(4);
          ce.a(true);
          ji.a(true);
          pq.a(-1);
          dh.a(-1);
          rj.a();
          vq.a((byte) 111);
          al.a(-1216);
          gl.a(true);
          jr.a((byte) -100);
          oc.a(-27171);
          ep.a();
          va.a(60);
          uc.a(91);
          kn.a(true);
          mq.a(true);
          td.a((byte) 122);
          jo.a(2);
          vp.a(-98);
          iq.b((byte) -73);
          oh.e((byte) -122);
          ro.c((byte) 76);
          mg.h(2);
          br.n(-17131);
          sp.l(-6);
          we.b(false);
          oj.a((byte) -110);
          pn.a((byte) -53);
          lr.a((byte) -45);
          qe.h(111);
          ck.b(true);
          da.b((byte) -124);
          ad.a(true);
          ue.i(1);
          jk.a(2);
          gr.g((byte) 123);
          uq.a(-6872);
          jp.a(true);
          pb.a(16711935);
          vg.a(0);
          to.a(84);
          sf.a((byte) 4);
          qf.a((byte) -126);
          hh.a(-72);
          aa.m(-29238);
          uo.a((byte) -122);
          jn.b(54);
          ud.b((byte) -37);
          df.g(-3);
          ko.f(false);
          um.a(46);
          kl.b(true);
          un.k(-67);
          po.a((byte) -43);
          no.a((byte) -111);
          cp.b((byte) -128);
          vc.b(0);
          kf.a(61);
          eh.a((byte) -84);
          q.i(0);
          lo.a((byte) -102);
          ig.a(-1);
          rg.a((byte) 127);
          nl.e(116);
          ma.c(-48);
          gb.a(19199);
          cl.a((byte) 124);
          fm.a((byte) 72);
          oi.a((byte) 88);
          mb.e(-26523);
          g.a(false);
          sg.a((byte) -49);
          sj.a(110);
          ul.a();
          bd.c(4);
          ao.h(0);
          jf.b(false);
          kk.a(true);
          aq.b(-121);
          wh.h(9724);
          h.g(1);
          pc.a(0);
          ld.a(1151);
          tc.b(118);
          af.d(false);
          lp.g(86);
          te.g(-30443);
          lf.b((byte) 107);
          w.g(2);
          ol.h(127);
          di.g(0);
          eq.g(11902);
          vf.b((byte) 36);
          hr.j(93);
          kj.b((byte) -96);
          jm.b((byte) 43);
          ek.g(-88);
          ec.b((byte) 60);
          fn.g(4096);
          nb.g(0);
          dc.g(64);
          up.g(-3144);
          jb.b((byte) -118);
          qk.b(true);
          bp.g(7750);
          rm.g(16145);
          gj.b((byte) -70);
          so.g(-13533);
          rr.b((byte) 123);
          m.g(2);
          bb.b((byte) 76);
          f.b((byte) -98);
          dp.h(-102);
          lm.b((byte) 121);
          qo.b((byte) -128);
          bm.b(true);
          ii.g(125);
          hm.b(true);
          bq.g(13);
          kg.b((byte) -118);
          rb.a(true);
          se.b(true);
          wb.b((byte) -33);
          md.g(-101);
          vb.b((byte) -54);
          sl.d((byte) 53);
          re.a(-124);
          ac.f((byte) 101);
          ng.b(16952);
          el.a(false);
          sr.a(true);
          qc.h(0);
          ve.a((byte) -126);
          oq.b(false);
          aj.a(false);
          mo.a(92);
          ah.a((byte) -128);
          gi.b(false);
          eo.b(0);
          tf.c(84);
          wm.b(86);
          gf.b(-24);
          cf.a(116);
          hj.a((byte) -123);
          qn.a((byte) 54);
          hq.a(false);
          nf.a((byte) -90);
          bk.a(0);
          tj.a(true);
          hl.a((byte) -118);
          be.a(-1);
          ub.a(false);
          ee.b(0);
          ch.a(-81);
          s.a((byte) -118);
          if (param0 > 103) {
            break L0;
          } else {
            field_J = (int[][]) null;
            break L0;
          }
        }
        vi.a((byte) -92);
        vl.a((byte) -11);
        tp.k(-10045);
        ri.a(7139);
        gg.a((byte) -83);
        vo.a(true);
        jc.a(28373);
        ml.c(-15);
        om.c((byte) 122);
        kb.a(96);
        wq.h(-12477);
        qp.a(-19721);
        rh.a((byte) -126);
        hi.d((byte) -114);
        ho.c(11579568);
        nn.a(5);
        ej.a(113);
        c.b(122);
        nd.d(-44);
        wi.b(93);
        e.b(-120);
        lq.a(false);
        hk.c((byte) -114);
        wc.g(3);
        dk.c((byte) -73);
        oa.g(-118);
        na.g(-27799);
        rf.g(29492);
        sq.a(26371);
        pk.f(-8105);
        ba.a(3);
        de.e(21283);
        ll.a(3);
        j.a(0);
        hn.a((byte) 72);
        mn.a(6);
        fd.a(-16836);
        km.h(83);
        jq.a(-113);
        nh.a(false);
        gd.a(true);
        qr.a(false);
        pl.a(true);
        wp.b(10);
        this.field_u = null;
    }

    public Vertigo2() {
    }

    final void d(int param0) {
        int var3 = 0;
        int var4_int = 0;
        fa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        java.awt.Canvas var8 = null;
        int stackIn_40_0 = 0;
        int stackIn_65_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        boolean stackOut_64_0 = false;
        int stackOut_63_0 = 0;
        var7 = field_L ? 1 : 0;
        var8 = gn.a(param0 + -22781);
        if (cp.a(96)) {
          bp.a(240, sl.b(param0 ^ -108), var8);
          return;
        } else {
          L0: {
            if (param0 == -17) {
              break L0;
            } else {
              this.n((byte) 108);
              break L0;
            }
          }
          if (rg.field_a) {
            if (fb.i(param0 + 28)) {
              L1: {
                L2: {
                  var3 = 1;
                  if (lc.field_b != -1) {
                    break L2;
                  } else {
                    if (am.field_n == -1) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var3 = 0;
                break L1;
              }
              L3: {
                if (am.field_n == lc.field_b) {
                  if (lc.field_b >= 0) {
                    L4: {
                      if (vp.a(18055, lc.field_b)) {
                        ca.a(var3 != 0, -16237);
                        break L4;
                      } else {
                        wn.field_b.a(0);
                        break L4;
                      }
                    }
                    if ((lc.field_b ^ -1) > -1) {
                      break L3;
                    } else {
                      fh.field_y[lc.field_b].b((byte) -114);
                      break L3;
                    }
                  } else {
                    if (vp.a(param0 + 18072, lc.field_b)) {
                      ca.a(var3 != 0, -16237);
                      break L3;
                    } else {
                      wn.field_b.a(0);
                      break L3;
                    }
                  }
                } else {
                  if (-17 >= (vl.field_c ^ -1)) {
                    L5: {
                      if (vp.a(18055, lc.field_b)) {
                        ca.a(var3 != 0, -16237);
                        break L5;
                      } else {
                        wn.field_b.a(0);
                        break L5;
                      }
                    }
                    if (0 > am.field_n) {
                      break L3;
                    } else {
                      fh.field_y[am.field_n].b((byte) -114);
                      break L3;
                    }
                  } else {
                    L6: {
                      if (!vp.a(param0 ^ -18072, lc.field_b)) {
                        wn.field_b.a(0);
                        break L6;
                      } else {
                        ca.a(var3 != 0, param0 + -16220);
                        break L6;
                      }
                    }
                    if ((lc.field_b ^ -1) > -1) {
                      break L3;
                    } else {
                      fh.field_y[lc.field_b].b((byte) -114);
                      break L3;
                    }
                  }
                }
              }
              L7: {
                L8: {
                  if (-1 != (vl.field_c ^ -1)) {
                    break L8;
                  } else {
                    if (0 == vq.field_r) {
                      break L7;
                    } else {
                      break L8;
                    }
                  }
                }
                L9: {
                  if (vl.field_c == 0) {
                    stackOut_39_0 = vq.field_r;
                    stackIn_40_0 = stackOut_39_0;
                    break L9;
                  } else {
                    stackOut_38_0 = vl.field_c;
                    stackIn_40_0 = stackOut_38_0;
                    break L9;
                  }
                }
                L10: {
                  var4_int = stackIn_40_0;
                  if (var4_int <= 16) {
                    break L10;
                  } else {
                    var4_int = -var4_int + 32;
                    break L10;
                  }
                }
                L11: {
                  if (0 <= var4_int) {
                    break L11;
                  } else {
                    var4_int = -var4_int;
                    break L11;
                  }
                }
                var4_int = var4_int << 2;
                bi.c(var4_int, var4_int, 0, 0, 640, 480);
                bi.b(0, 0, 640, 480, 1, var4_int << -1064431710);
                break L7;
              }
              L12: {
                L13: {
                  if (!qh.field_g) {
                    break L13;
                  } else {
                    if (!lc.field_d) {
                      break L13;
                    } else {
                      break L12;
                    }
                  }
                }
                ff.a(m.h(-124), 11182);
                break L12;
              }
              L14: {
                var4 = (fa) ((Object) bg.field_b.a((byte) 100));
                if (var4 != null) {
                  L15: {
                    var6 = oa.field_l;
                    if (-81 < (var6 ^ -1)) {
                      var5 = -32 + var6 / 2;
                      break L15;
                    } else {
                      if (-231 < (var6 ^ -1)) {
                        var5 = 8;
                        break L15;
                      } else {
                        var5 = -(var6 / 2) + 123;
                        break L15;
                      }
                    }
                  }
                  vj.field_b[var4.field_n].d(158, var5);
                  va.field_s.a(16777215, (byte) 85, -1, 198, hi.field_i[var4.field_n], var5 + va.field_s.field_j);
                  break L14;
                } else {
                  break L14;
                }
              }
              L16: {
                if (kg.h(param0 ^ -111)) {
                  var5 = oi.a(-110) + 30;
                  var6 = 30 + hk.a(true);
                  rq.a(var6, var5, -(var6 / 2) + 240, -(var5 / 2) + 320, 82, 210);
                  eb.b(-14732);
                  break L16;
                } else {
                  if (pq.b(0)) {
                    L17: {
                      if (null == dc.field_L) {
                        stackOut_64_0 = uj.field_g;
                        stackIn_65_0 = stackOut_64_0 ? 1 : 0;
                        break L17;
                      } else {
                        stackOut_63_0 = 1;
                        stackIn_65_0 = stackOut_63_0;
                        break L17;
                      }
                    }
                    hr.a(stackIn_65_0 != 0, true);
                    break L16;
                  } else {
                    if (rh.e((byte) 99)) {
                      var5 = 30 + el.a((byte) -72);
                      var6 = f.b(false) - -30;
                      rq.a(var6, var5, -(var6 / 2) + 270, 320 - var5 / 2, -77, 210);
                      bk.b((byte) -101);
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                }
              }
              L18: {
                if (t.field_a != t.field_f) {
                  var5 = 256 * ok.field_c / 16;
                  if (0 >= var5) {
                    break L18;
                  } else {
                    bi.b(0, 0, bi.field_e, bi.field_j, 0, var5);
                    break L18;
                  }
                } else {
                  break L18;
                }
              }
              dh.a(0, (byte) -88, var8, 0);
              return;
            } else {
              aj.a(false, 100.0f, dk.field_n);
              an.a(-1243, var8);
              return;
            }
          } else {
            an.a(-1243, var8);
            return;
          }
        }
    }

    public static void m(byte param0) {
        field_D = null;
        field_E = null;
        field_K = null;
        field_M = null;
        field_I = null;
        field_G = null;
        if (param0 <= 18) {
            return;
        }
        field_F = null;
        field_J = (int[][]) null;
        field_C = null;
        field_H = null;
    }

    private final static int p(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        var3 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == -78) {
                break L1;
              } else {
                field_G = (String[]) null;
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (!gf.a(false)) {
                L3: {
                  kg.field_G.a((byte) -29, we.a(gb.field_d, true, ed.field_n), we.a(no.field_e, true, sd.field_N));
                  if (kg.field_G.a(84)) {
                    var1_int = 1;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L4;
                  } else {
                    if (kg.field_G.field_c < 0) {
                      break L4;
                    } else {
                      var2 = rc.field_c[kg.field_G.field_c];
                      if (var2 != 2) {
                        break L4;
                      } else {
                        lb.a(11141);
                        break L4;
                      }
                    }
                  }
                }
                stackOut_15_0 = var2;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                kg.field_G.d((byte) 88);
                if (kg.field_G.a(84)) {
                  var1_int = 1;
                  continue L2;
                } else {
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "Vertigo2.R(" + param0 + ')');
        }
        return stackIn_16_0;
    }

    private final void l(byte param0) {
        if (vp.field_c != null) {
            ah.a(98, vp.field_c);
            vp.field_c = null;
            di.b((byte) -44);
        }
        gi.field_p = pm.a(3, 124);
        rn.field_u = pm.a(5, 125);
        vi.field_n = pm.a(6, 123);
        gp.field_s = pm.a(7, 123);
        mj.field_b = pm.a(8, 127);
        re.field_d = pm.a(9, 126);
        le.field_f = pm.a(10, 124);
        pp.field_s = pm.a(11, 124);
        nn.field_y = pm.a(12, 123);
        m.field_z = pm.a(13, 126);
        np.field_Kb = pm.a(14, 123);
        ml.field_u = pm.a(15, 123);
        tl.field_c = pm.a(16, 124);
        int var2 = -39 / ((param0 - 70) / 42);
        ii.field_C = pm.a(17, 124);
        hi.field_o = pm.a(18, 123);
    }

    private final void k(byte param0) {
        int var2 = -22 / ((48 - param0) / 60);
        ei.a(pp.field_s, (byte) -81);
        pp.field_s = null;
        this.d(-17);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        ae[] array$2 = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        var6 = field_L ? 1 : 0;
        try {
          L0: {
            array$2 = new ae[param0 + param2];
            on.field_b[param3] = array$2;
            on.field_b[param3][0] = hp.a(gp.field_s, "", param1).a();
            var5_int = 1;
            L1: while (true) {
              if (param2 < var5_int) {
                break L0;
              } else {
                on.field_b[param3][var5_int] = hp.a(gp.field_s, "", param1 + var5_int).a();
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var5);
            stackOut_5_1 = new StringBuilder().append("Vertigo2.C(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = field_L ? 1 : 0;
        ro.a((byte) -52);
        if (null == gp.field_s) {
          L0: {
            mn.a(false);
            if (null != rn.field_u) {
              aj.a(false, 86.0f, nh.field_p);
              this.d(-17);
              oo.a(new nr(hi.field_o, ii.field_C, rn.field_u, 13, false));
              ii.field_C = null;
              this.j((byte) 31);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (null == pp.field_s) {
              break L1;
            } else {
              aj.a(false, 90.0f, cp.field_a);
              this.d(param0 ^ -16777200);
              this.k((byte) 109);
              break L1;
            }
          }
          L2: {
            if (nn.field_y == null) {
              break L2;
            } else {
              aj.a(false, 92.0f, lk.field_g);
              this.d(-17);
              this.n((byte) -121);
              break L2;
            }
          }
          L3: {
            if (null == tl.field_c) {
              break L3;
            } else {
              aj.a(false, 95.0f, dh.field_f);
              this.d(param0 + -16777232);
              w.a(ml.field_u, np.field_Kb, tl.field_c, (byte) 59);
              tl.field_c = null;
              ml.field_u = null;
              np.field_Kb = null;
              break L3;
            }
          }
          if (null == gi.field_p) {
            L4: {
              kr.a(-3645);
              if (param0 == 16777215) {
                break L4;
              } else {
                this.n((byte) 93);
                break L4;
              }
            }
            var3 = 0;
            L5: while (true) {
              if ((var3 ^ -1) <= -24) {
                lc.field_b = 0;
                vc.a(0);
                va.a(50, (byte) 119);
                rg.field_a = true;
                this.o((byte) 117);
                this.p(50);
                di.b((byte) 91);
                rn.a(108, op.field_d);
                hj.a(128, (byte) 126);
                wn.field_b = new an();
                ng.a(-10236);
                return true;
              } else {
                fh.field_y[var3] = new fo(var3);
                var3++;
                continue L5;
              }
            }
          } else {
            aj.a(false, 98.0f, fa.field_v);
            this.d(-17);
            ch.a(new ke(gi.field_p.a("", "huffman", 0)), (byte) 98);
            gi.field_p = null;
            di.b((byte) 126);
            return false;
          }
        } else {
          L6: {
            if (!ml.field_y.b(0)) {
              break L6;
            } else {
              if (!ml.field_y.c("basic", 0)) {
                break L6;
              } else {
                if (ml.field_y.c("roman20", param0 ^ 16777215)) {
                  L7: {
                    if (!ac.field_G.b(0)) {
                      break L7;
                    } else {
                      if (ac.field_G.c("roman20", 0)) {
                        if (!ml.field_y.c("kartika13", 0)) {
                          aj.a(false, 6.0f, gr.a(vc.field_a, (byte) 103, ml.field_y, vd.field_c, "kartika13"));
                          return false;
                        } else {
                          L8: {
                            if (!ac.field_G.b(param0 ^ 16777215)) {
                              break L8;
                            } else {
                              if (ac.field_G.c("kartika13", 0)) {
                                if (!ml.field_y.c("comic20", param0 ^ 16777215)) {
                                  aj.a(false, 8.0f, gr.a(vc.field_a, (byte) 47, ml.field_y, vd.field_c, "comic20"));
                                  return false;
                                } else {
                                  L9: {
                                    if (!ac.field_G.b(param0 ^ 16777215)) {
                                      break L9;
                                    } else {
                                      if (ac.field_G.c("comic20", param0 ^ 16777215)) {
                                        L10: {
                                          if (!ml.field_y.b(0)) {
                                            break L10;
                                          } else {
                                            if (ml.field_y.c("lobby", 0)) {
                                              L11: {
                                                if (!ac.field_G.b(0)) {
                                                  break L11;
                                                } else {
                                                  if (!ac.field_G.c("lobby", 0)) {
                                                    break L11;
                                                  } else {
                                                    L12: {
                                                      if (!gp.field_s.b(0)) {
                                                        break L12;
                                                      } else {
                                                        if (gp.field_s.c("", 0)) {
                                                          L13: {
                                                            if (!mj.field_b.b(0)) {
                                                              break L13;
                                                            } else {
                                                              if (!mj.field_b.c("", 0)) {
                                                                break L13;
                                                              } else {
                                                                L14: {
                                                                  if (!re.field_d.b(param0 + -16777215)) {
                                                                    break L14;
                                                                  } else {
                                                                    if (re.field_d.a((byte) -112)) {
                                                                      L15: {
                                                                        if (!le.field_f.b(param0 + -16777215)) {
                                                                          break L15;
                                                                        } else {
                                                                          if (!le.field_f.c("", 0)) {
                                                                            break L15;
                                                                          } else {
                                                                            L16: {
                                                                              if (!rn.field_u.b(param0 + -16777215)) {
                                                                                break L16;
                                                                              } else {
                                                                                if (!rn.field_u.c("", param0 ^ 16777215)) {
                                                                                  break L16;
                                                                                } else {
                                                                                  L17: {
                                                                                    if (!vi.field_n.b(0)) {
                                                                                      break L17;
                                                                                    } else {
                                                                                      if (vi.field_n.c("", 0)) {
                                                                                        L18: {
                                                                                          if (!gi.field_p.b(param0 ^ 16777215)) {
                                                                                            break L18;
                                                                                          } else {
                                                                                            if (!gi.field_p.c("", param0 ^ 16777215)) {
                                                                                              break L18;
                                                                                            } else {
                                                                                              L19: {
                                                                                                if (!pp.field_s.b(param0 ^ 16777215)) {
                                                                                                  break L19;
                                                                                                } else {
                                                                                                  if (pp.field_s.c("", param0 ^ 16777215)) {
                                                                                                    L20: {
                                                                                                      if (!np.field_Kb.b(0)) {
                                                                                                        break L20;
                                                                                                      } else {
                                                                                                        if (!np.field_Kb.a((byte) -112)) {
                                                                                                          break L20;
                                                                                                        } else {
                                                                                                          L21: {
                                                                                                            if (!tl.field_c.b(param0 ^ 16777215)) {
                                                                                                              break L21;
                                                                                                            } else {
                                                                                                              if (!tl.field_c.a((byte) -112)) {
                                                                                                                break L21;
                                                                                                              } else {
                                                                                                                L22: {
                                                                                                                  if (!ml.field_u.b(0)) {
                                                                                                                    break L22;
                                                                                                                  } else {
                                                                                                                    if (!ml.field_u.a((byte) -112)) {
                                                                                                                      break L22;
                                                                                                                    } else {
                                                                                                                      L23: {
                                                                                                                        if (!ii.field_C.b(0)) {
                                                                                                                          break L23;
                                                                                                                        } else {
                                                                                                                          if (!ii.field_C.a((byte) -112)) {
                                                                                                                            break L23;
                                                                                                                          } else {
                                                                                                                            L24: {
                                                                                                                              if (!hi.field_o.b(param0 + -16777215)) {
                                                                                                                                break L24;
                                                                                                                              } else {
                                                                                                                                if (!hi.field_o.a((byte) -112)) {
                                                                                                                                  break L24;
                                                                                                                                } else {
                                                                                                                                  L25: {
                                                                                                                                    if (!nn.field_y.b(0)) {
                                                                                                                                      break L25;
                                                                                                                                    } else {
                                                                                                                                      if (!nn.field_y.c("", 0)) {
                                                                                                                                        break L25;
                                                                                                                                      } else {
                                                                                                                                        L26: {
                                                                                                                                          if (!m.field_z.b(param0 ^ 16777215)) {
                                                                                                                                            break L26;
                                                                                                                                          } else {
                                                                                                                                            if (!m.field_z.a((byte) -112)) {
                                                                                                                                              break L26;
                                                                                                                                            } else {
                                                                                                                                              aj.a(false, 78.0f, oe.field_sb);
                                                                                                                                              if (param1) {
                                                                                                                                                le.a(468713154);
                                                                                                                                                this.d(-17);
                                                                                                                                                jk.field_b = new id(gp.field_s, mj.field_b);
                                                                                                                                                this.q(19804);
                                                                                                                                                gp.field_s = null;
                                                                                                                                                di.b((byte) 109);
                                                                                                                                                return false;
                                                                                                                                              } else {
                                                                                                                                                return false;
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                        aj.a(false, 73.0f, fg.a(m.field_z, dk.field_n, vj.field_a, 274));
                                                                                                                                        return false;
                                                                                                                                      }
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                  aj.a(false, 72.0f, gr.a(eq.field_E, (byte) 109, nn.field_y, bm.field_D, ""));
                                                                                                                                  return false;
                                                                                                                                }
                                                                                                                              }
                                                                                                                            }
                                                                                                                            aj.a(false, 68.0f, fg.a(ii.field_C, ua.field_g, ee.field_d, 274));
                                                                                                                            return false;
                                                                                                                          }
                                                                                                                        }
                                                                                                                      }
                                                                                                                      aj.a(false, 67.0f, fg.a(ii.field_C, ua.field_g, ee.field_d, param0 ^ 16776941));
                                                                                                                      return false;
                                                                                                                    }
                                                                                                                  }
                                                                                                                }
                                                                                                                aj.a(false, 66.0f, fg.a(ml.field_u, kq.field_Vb, bb.field_G, 274));
                                                                                                                return false;
                                                                                                              }
                                                                                                            }
                                                                                                          }
                                                                                                          aj.a(false, 65.0f, fg.a(tl.field_c, kq.field_Vb, bb.field_G, param0 + -16776941));
                                                                                                          return false;
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                    aj.a(false, 60.0f, fg.a(np.field_Kb, kq.field_Vb, bb.field_G, 274));
                                                                                                    return false;
                                                                                                  } else {
                                                                                                    break L19;
                                                                                                  }
                                                                                                }
                                                                                              }
                                                                                              aj.a(false, 56.0f, gr.a(ga.field_ib, (byte) 52, pp.field_s, ec.field_D, ""));
                                                                                              return false;
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        aj.a(false, 55.0f, gr.a(vj.field_a, (byte) 114, gi.field_p, dk.field_n, ""));
                                                                                        return false;
                                                                                      } else {
                                                                                        break L17;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                  aj.a(false, 54.0f, gr.a(vc.field_a, (byte) 54, vi.field_n, vd.field_c, ""));
                                                                                  return false;
                                                                                }
                                                                              }
                                                                            }
                                                                            aj.a(false, 50.0f, gr.a(ib.field_b, (byte) 112, rn.field_u, me.field_b, ""));
                                                                            return false;
                                                                          }
                                                                        }
                                                                      }
                                                                      aj.a(false, 40.0f, gr.a(tm.field_c, (byte) 109, le.field_f, lo.field_b, ""));
                                                                      return false;
                                                                    } else {
                                                                      break L14;
                                                                    }
                                                                  }
                                                                }
                                                                aj.a(false, 35.0f, en.a(false, tm.field_c, re.field_d, 0, lo.field_b));
                                                                return false;
                                                              }
                                                            }
                                                          }
                                                          aj.a(false, 30.0f, gr.a(lc.field_c, (byte) 35, mj.field_b, de.field_a, ""));
                                                          return false;
                                                        } else {
                                                          break L12;
                                                        }
                                                      }
                                                    }
                                                    aj.a(false, 12.0f, gr.a(lc.field_c, (byte) 95, gp.field_s, de.field_a, ""));
                                                    return false;
                                                  }
                                                }
                                              }
                                              aj.a(false, 11.0f, gr.a(vc.field_a, (byte) 119, ac.field_G, vd.field_c, "lobby"));
                                              return false;
                                            } else {
                                              break L10;
                                            }
                                          }
                                        }
                                        aj.a(false, 10.0f, gr.a(ib.field_b, (byte) 50, ml.field_y, me.field_b, "lobby"));
                                        return false;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  aj.a(false, 9.0f, gr.a(vc.field_a, (byte) 39, ac.field_G, vd.field_c, "comic20"));
                                  return false;
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                          aj.a(false, 7.0f, gr.a(vc.field_a, (byte) 64, ac.field_G, vd.field_c, "kartika13"));
                          return false;
                        }
                      } else {
                        break L7;
                      }
                    }
                  }
                  aj.a(false, 5.0f, gr.a(vc.field_a, (byte) 37, ac.field_G, vd.field_c, "roman20"));
                  return false;
                } else {
                  aj.a(false, 4.0f, gr.a(vc.field_a, (byte) 66, ml.field_y, vd.field_c, "roman20"));
                  return false;
                }
              }
            }
          }
          aj.a(false, 1.0f, gr.a(ib.field_b, (byte) 60, ml.field_y, me.field_b, "basic"));
          return false;
        }
    }

    private final void d(boolean param0, int param1) {
        boolean discarded$3 = false;
        int fieldTemp$4 = 0;
        li discarded$5 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var6_int = 0;
        int var7 = 0;
        wo var7_ref_wo = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_78_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_114_0 = 0;
        int stackOut_77_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_84_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_112_0 = 0;
        L0: {
          var10 = field_L ? 1 : 0;
          wn.field_b.b(8);
          var3 = 0;
          if (t.field_f != t.field_a) {
            if (t.field_f == no.field_c) {
              ok.field_c = ok.field_c + 1;
              if (16 == ok.field_c) {
                L1: {
                  if (!jo.field_d) {
                    id.a(-5);
                    break L1;
                  } else {
                    ho.a(-106);
                    break L1;
                  }
                }
                t.field_f = go.field_h;
                break L0;
              } else {
                break L0;
              }
            } else {
              if (go.field_h == t.field_f) {
                L2: {
                  if (ag.b(49)) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                t.field_f = ak.field_e;
                break L0;
              } else {
                ok.field_c = ok.field_c - 1;
                if (ok.field_c == 0) {
                  t.field_f = t.field_a;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            L3: {
              var4 = 0;
              var5 = 0;
              if (!param0) {
                if (am.field_n == lc.field_b) {
                  if (lc.field_b == -1) {
                    if (!oj.field_P) {
                      ln.field_d.a(true, true);
                      var3 = 1;
                      L4: while (true) {
                        if (!gf.a(false)) {
                          break L3;
                        } else {
                          ln.field_d.a((byte) 115);
                          continue L4;
                        }
                      }
                    } else {
                      var4 = 1;
                      var5 = 1;
                      break L3;
                    }
                  } else {
                    if (lc.field_b != -2) {
                      if (al.a(lc.field_b, (byte) -94)) {
                        fh.field_y[lc.field_b].e((byte) -125);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      var4 = 1;
                      break L3;
                    }
                  }
                } else {
                  vl.field_c = vl.field_c + 1;
                  if (32 != vl.field_c) {
                    break L3;
                  } else {
                    g.b(7);
                    break L3;
                  }
                }
              } else {
                break L3;
              }
            }
            L5: {
              if (!oj.field_P) {
                break L5;
              } else {
                if (rg.field_b) {
                  break L5;
                } else {
                  if (!kj.field_C) {
                    L6: {
                      if (!am.field_b) {
                        break L6;
                      } else {
                        if (!il.field_a) {
                          break L6;
                        } else {
                          var4 = 0;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      hj.a(1726, var4 != 0);
                      if (ed.field_q) {
                        oe.field_pb.a(var5 != 0, true);
                        var3 = 1;
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (am.field_b) {
                        la.a(180, var5 != 0, (byte) -120, 320);
                        ln.field_d.a(var5 != 0, true);
                        var3 = 1;
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    L9: while (true) {
                      if (!gf.a(false)) {
                        break L5;
                      } else {
                        L10: {
                          if (eo.field_o) {
                            if (!am.field_b) {
                              discarded$3 = gh.a(12, 12, 13, 15);
                              break L10;
                            } else {
                              if (!jm.a(15, 13, 915, 12)) {
                                break L10;
                              } else {
                                continue L9;
                              }
                            }
                          } else {
                            break L10;
                          }
                        }
                        L11: {
                          if (ed.field_q) {
                            oe.field_pb.a((byte) 115);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        if (am.field_b) {
                          ln.field_d.a((byte) 115);
                          continue L9;
                        } else {
                          continue L9;
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
            }
            L12: {
              if (!oj.field_P) {
                wn.c(-2618);
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              if (eo.field_o) {
                if (ld.field_b <= sg.field_e) {
                  break L13;
                } else {
                  sg.field_e = sg.field_e + 1;
                  break L13;
                }
              } else {
                if (0 >= sg.field_e) {
                  break L13;
                } else {
                  sg.field_e = sg.field_e - 1;
                  break L13;
                }
              }
            }
            var6_int = ld.field_b * ld.field_b;
            var7 = -(sg.field_e * sg.field_e) + var6_int;
            var8 = mk.field_E + 120 * var7 / var6_int;
            jf.c(var8, 91);
            if (bg.field_b.a((byte) 100) == null) {
              break L0;
            } else {
              fieldTemp$4 = oa.field_l + 1;
              oa.field_l = oa.field_l + 1;
              if (335 != fieldTemp$4) {
                break L0;
              } else {
                oa.field_l = 0;
                discarded$5 = bg.field_b.b((byte) -43);
                break L0;
              }
            }
          }
        }
        L14: {
          if (-3 != am.field_n) {
            break L14;
          } else {
            L15: {
              uh.field_Xb = null;
              j.field_n = null;
              var4 = qi.field_d.field_t;
              if ((var4 ^ -1) <= -1) {
                break L15;
              } else {
                var4 = 0;
                break L15;
              }
            }
            L16: {
              var5 = 0;
              if (qe.field_V == null) {
                var6 = ed.field_o;
                break L16;
              } else {
                var6 = qe.field_V;
                break L16;
              }
            }
            L17: {
              ln.field_d = new tr(false, new String[]{var6}, 0, false, var5, var4, var4, -1);
              if (!pm.field_d) {
                stackOut_77_0 = 0;
                stackIn_78_0 = stackOut_77_0;
                break L17;
              } else {
                stackOut_76_0 = 1;
                stackIn_78_0 = stackOut_76_0;
                break L17;
              }
            }
            var7 = stackIn_78_0;
            gj.a((byte) 54, var7 != 0, am.field_n, -1);
            lc.field_d = false;
            break L14;
          }
        }
        if (param1 <= -92) {
          L18: {
            if (am.field_n != -7) {
              break L18;
            } else {
              if (!ln.field_d.field_D.field_r.field_f[0].h((byte) 117)) {
                L19: {
                  var4 = ln.field_d.field_D.field_l[0].field_p;
                  var5 = ln.field_d.field_D.field_l[0].field_W;
                  var6_int = -var5 + var4;
                  ln.field_d.field_D.field_l[0].field_W = var4;
                  if (var6_int == 0) {
                    break L19;
                  } else {
                    var7 = var6_int;
                    if (null == ln.field_d) {
                      break L19;
                    } else {
                      if ((ln.field_d.field_B ^ -1) > -1) {
                        break L19;
                      } else {
                        if (null == oe.field_pb) {
                          var8 = ln.field_d.field_s % 3;
                          if (0 == var8) {
                            gi.field_u = gi.field_u + var7;
                            break L19;
                          } else {
                            if (var8 == 1) {
                              pn.field_R = pn.field_R - var7;
                              break L19;
                            } else {
                              var9 = var7 / 3;
                              pn.field_R = pn.field_R - (-var9 + var7);
                              gi.field_u = gi.field_u + var9;
                              break L19;
                            }
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                  }
                }
                L20: {
                  ln.field_d.field_D.a(30113, true);
                  ln.field_d.e(-111);
                  if (-1 == (ln.field_d.field_D.field_j ^ -1)) {
                    var7_ref_wo = ln.field_d.field_D.field_r.field_f[0];
                    var7_ref_wo.a(true, var7_ref_wo.l(-32768) + -1);
                    break L20;
                  } else {
                    break L20;
                  }
                }
                L21: {
                  if (!pm.field_d) {
                    stackOut_102_0 = 0;
                    stackIn_103_0 = stackOut_102_0;
                    break L21;
                  } else {
                    stackOut_101_0 = 1;
                    stackIn_103_0 = stackOut_101_0;
                    break L21;
                  }
                }
                var7 = stackIn_103_0;
                gj.a((byte) -70, var7 != 0, am.field_n, -1);
                lc.field_d = false;
                break L18;
              } else {
                L22: {
                  if (!pm.field_d) {
                    stackOut_85_0 = 0;
                    stackIn_86_0 = stackOut_85_0;
                    break L22;
                  } else {
                    stackOut_84_0 = 1;
                    stackIn_86_0 = stackOut_84_0;
                    break L22;
                  }
                }
                var4 = stackIn_86_0;
                gj.a((byte) -112, var4 != 0, am.field_n, -1);
                lc.field_d = false;
                break L18;
              }
            }
          }
          L23: {
            if (-6 == am.field_n) {
              L24: {
                uh.field_Xb = null;
                j.field_n = null;
                var4 = ap.field_d.field_t;
                if (var4 >= 0) {
                  break L24;
                } else {
                  var4 = 0;
                  break L24;
                }
              }
              L25: {
                var5 = 3;
                if (null == qe.field_V) {
                  var6 = ed.field_o;
                  break L25;
                } else {
                  var6 = qe.field_V;
                  break L25;
                }
              }
              L26: {
                ln.field_d = new tr(false, new String[]{var6}, 0, false, var5, var4, var4, 1);
                if (!pm.field_d) {
                  stackOut_113_0 = 0;
                  stackIn_114_0 = stackOut_113_0;
                  break L26;
                } else {
                  stackOut_112_0 = 1;
                  stackIn_114_0 = stackOut_112_0;
                  break L26;
                }
              }
              var7 = stackIn_114_0;
              gj.a((byte) 91, var7 != 0, am.field_n, -1);
              lc.field_d = false;
              break L23;
            } else {
              break L23;
            }
          }
          L27: {
            if (am.field_n != -4) {
              break L27;
            } else {
              uh.field_Wb.j(9, 127);
              sg.field_e = ld.field_b;
              rg.field_b = true;
              am.field_n = lc.field_b;
              break L27;
            }
          }
          L28: {
            if ((am.field_n ^ -1) != 4) {
              break L28;
            } else {
              qk.d(gd.field_j.a((byte) -38), 11, 18964);
              kj.field_C = true;
              am.field_n = lc.field_b;
              break L28;
            }
          }
          L29: {
            if (var3 != 0) {
              break L29;
            } else {
              ee.a(-11747);
              break L29;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        String stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_26_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var12 = field_L ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (-1 >= (var6_int ^ -1)) {
                var5 = var6_int - -2;
                L2: while (true) {
                  L3: {
                    if (var5 >= var3_int) {
                      break L3;
                    } else {
                      if (!ab.a(false, param1.charAt(var5))) {
                        break L3;
                      } else {
                        var5++;
                        continue L2;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(var6_int - -2, var5);
                  if (!qb.a((CharSequence) ((Object) var7_ref_String), -124)) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param1.charAt(var5) == 62) {
                        var5++;
                        var8 = cf.a(109, (CharSequence) ((Object) var7_ref_String));
                        var4 = var4 + (-var5 - -var6_int + args[var8].length());
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                var8 = -43 % ((-70 - param2) / 42);
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L4: while (true) {
                  var9 = param1.indexOf("<%", var5);
                  if (0 <= var9) {
                    var5 = 2 + var9;
                    L5: while (true) {
                      L6: {
                        if (var3_int <= var5) {
                          break L6;
                        } else {
                          if (!ab.a(false, param1.charAt(var5))) {
                            break L6;
                          } else {
                            var5++;
                            continue L5;
                          }
                        }
                      }
                      var10 = param1.substring(2 + var9, var5);
                      if (qb.a((CharSequence) ((Object) var10), 112)) {
                        if (var3_int <= var5) {
                          continue L4;
                        } else {
                          if (param1.charAt(var5) == 62) {
                            var5++;
                            var11 = cf.a(92, (CharSequence) ((Object) var10));
                            discarded$3 = var6.append(param1.substring(var7, var9));
                            var7 = var5;
                            discarded$4 = var6.append(args[var11]);
                            continue L4;
                          } else {
                            continue L4;
                          }
                        }
                      } else {
                        continue L4;
                      }
                    }
                  } else {
                    discarded$5 = var6.append(param1.substring(var7));
                    stackOut_26_0 = var6.toString();
                    stackIn_27_0 = stackOut_26_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var3);
            stackOut_28_1 = new StringBuilder().append("Vertigo2.D(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (args == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L7;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L7;
            }
          }
          L8: {
            stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
        }
        return stackIn_27_0;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        RuntimeException var2 = null;
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              rm.a((byte) -89, (java.awt.Component) ((Object) param0));
              ee.a((java.awt.Component) ((Object) param0), param1 + 140);
              if (param1 == -35) {
                break L1;
              } else {
                var3 = (java.awt.Canvas) null;
                Vertigo2.a((java.awt.Canvas) null, (byte) 15);
                break L1;
              }
            }
            L2: {
              if (th.field_g == null) {
                break L2;
              } else {
                th.field_g.a((java.awt.Component) ((Object) param0), param1 + 35);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2);
            stackOut_5_1 = new StringBuilder().append("Vertigo2.I(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    static {
        field_E = new tj();
        field_I = new String[255];
        field_D = "<%0> won!";
        field_K = "You cannot add yourself!";
        field_J = new int[16][65536];
        field_G = new String[]{"&***", "none", "colt", "dna", "loopy", "portal", "bassoon", "toxic", "kebab", "diesel", "focus", "moss", "quay", "oink", "rook", "coal", "fly", "harp", "driver", "blunt", "flash", "plum", "drill", "potter", "walking", "trim", "cluster", "fry", "bumpy", "belize", "hive"};
        field_H = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
