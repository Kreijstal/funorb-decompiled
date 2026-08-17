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
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_L ? 1 : 0;
        try {
          L0: {
            if (param0 == 50) {
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
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= ap.field_d.field_k.length) {
                  ap.field_d.field_u = true;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  ap.field_d.field_k[var2_int] = Vertigo2.a(new String[]{Integer.toString(1 + var2_int)}, dg.field_b, 103);
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "Vertigo2.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void f(int param0) {
        boolean discarded$0 = false;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Object stackIn_36_0 = null;
        Object stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_125_0 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        Object var3_ref = null;
        int var4 = 0;
        pp var4_ref_pp = null;
        int var5 = 0;
        int var6 = 0;
        Object var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String[] var11 = null;
        int var12_int = 0;
        tr var12 = null;
        int var13 = 0;
        int var14 = 0;
        ub var15 = null;
        Object var16 = null;
        nf var16_ref = null;
        var16 = null;
        var14 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              jq.a((byte) 29);
              mk.field_M = hb.b((byte) 119);
              um.h(0);
              var2_int = -90 % ((-13 - param0) / 47);
              if (dc.field_L == null) {
                break L1;
              } else {
                if (!dc.field_L.field_e) {
                  break L1;
                } else {
                  cp.a((byte) 126);
                  tg.a(96);
                  break L1;
                }
              }
            }
            L2: {
              stackIn_7_0 = this;

              if (dc.field_L == null) {
                stackIn_8_0 = this;
                stackIn_8_1 = 0;
                break L2;
              } else {
                stackIn_8_0 = this;
                stackIn_8_1 = 1;
                break L2;
              }
            }
            L3: {
              this.c(stackIn_8_1 != 0, -6);
              if (!hh.field_c) {
                break L3;
              } else {
                this.l((byte) 123);
                hh.field_c = false;
                break L3;
              }
            }
            L4: {
              rg.field_f = rg.field_f + 1;
              if (!cp.a(-109)) {
                break L4;
              } else {
                this.m(-105);
                if (cp.a(-1)) {
                  L5: {
                    if (!tk.c((byte) -94)) {
                      break L5;
                    } else {
                      discarded$0 = this.a(16777215, false);
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L4;
                }
              }
            }
            L6: {
              if (!rg.field_a) {
                iq.a((byte) -107, uo.field_h);
                if (!this.a(16777215, true)) {
                  break L6;
                } else {
                  rg.field_a = true;
                  break L6;
                }
              } else {
                if (!fb.i(11)) {
                  t.a((byte) 44);
                  break L6;
                } else {
                  if (!kg.h(114)) {
                    if (!pq.b(0)) {
                      if (!rh.e((byte) 99)) {
                        this.d(false, -97);
                        break L6;
                      } else {
                        if (t.field_a != t.field_f) {
                          this.d(false, -104);
                          break L6;
                        } else {
                          L7: {
                            var3 = Vertigo2.p((byte) -78);
                            if ((var3 ^ -1) == -2) {
                              ad.field_h = true;
                              ip.a((byte) -71, oc.field_x, 0);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          this.d(true, -110);
                          break L6;
                        }
                      }
                    } else {
                      L8: {
                        stackIn_36_0 = this;

                        if (dc.field_L == null) {
                          stackIn_37_0 = this;
                          stackIn_37_1 = 0;
                          break L8;
                        } else {
                          stackIn_37_0 = this;
                          stackIn_37_1 = 1;
                          break L8;
                        }
                      }
                      L9: {
                        L10: {
                          var3 = this.b(stackIn_37_1 != 0, 125);
                          if (-2 == (var3 ^ -1)) {
                            break L10;
                          } else {
                            if ((var3 ^ -1) == -3) {
                              break L10;
                            } else {
                              break L9;
                            }
                          }
                        }
                        L11: {
                          if (null != dc.field_L) {
                            cp.a((byte) 127);
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                        if (-3 == (var3 ^ -1)) {
                          sf.a((java.applet.Applet) (this), -85);
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      this.d(true, -107);
                      break L6;
                    }
                  } else {
                    if (t.field_a != t.field_f) {
                      this.d(false, -111);
                      break L6;
                    } else {
                      L12: {
                        var3 = lr.e((byte) -116);
                        if ((var3 ^ -1) != -3) {
                          if ((var3 ^ -1) == -4) {
                            ig.a(9790, true);
                            break L12;
                          } else {
                            if ((var3 ^ -1) != -5) {
                              break L12;
                            } else {
                              jo.field_d = true;
                              ip.a((byte) -65, ob.field_I, 0);
                              break L12;
                            }
                          }
                        } else {
                          cp.a((byte) 125);
                          break L12;
                        }
                      }
                      this.d(true, -93);
                      break L6;
                    }
                  }
                }
              }
            }
            L13: {
              if (ag.b(49)) {
                break L13;
              } else {
                L14: while (true) {
                  var16_ref = (nf) ((Object) fg.field_eb.b((byte) -43));
                  if (var16_ref != null) {
                    de.a(4, var16_ref, 4);
                    continue L14;
                  } else {
                    L15: while (true) {
                      var15 = (ub) ((Object) oh.field_D.b((byte) -43));
                      if (var15 == null) {
                        break L13;
                      } else {
                        jk.a(5, (byte) 44, var15);
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
            L16: while (true) {
              if (!j.a(0, ok.field_d)) {
                L17: {
                  lf.d(75, 0);
                  if (!eo.field_o) {
                    break L17;
                  } else {
                    wg.field_g = 0;
                    break L17;
                  }
                }
                L18: {
                  if (va.b((byte) -81)) {
                    L19: {
                      L20: {
                        var3 = this.h((byte) -127);
                        if (var3 == 0) {
                          break L20;
                        } else {
                          if (-2 != (var3 ^ -1)) {
                            break L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                      en.a(true);
                      if (1 == var3) {
                        kj.field_C = true;
                        rg.field_b = true;
                        break L19;
                      } else {
                        L21: {
                          if (!oj.field_P) {
                            break L21;
                          } else {
                            L22: {
                              an.field_c = true;
                              sk.field_g = true;
                              lc.field_d = false;
                              if (am.field_b) {
                                ke.field_i = qp.field_c;
                                gj.a((byte) -103, false, am.field_n, 11);
                                break L22;
                              } else {
                                gj.a((byte) 124, false, am.field_n, 0);
                                break L22;
                              }
                            }
                            g.b(7);
                            fh.field_y[lc.field_b].a(-91, false, 0);
                            ed.field_q = false;
                            am.field_b = false;
                            oj.field_P = false;
                            vl.a(-115);
                            ki.a((byte) -72);
                            ua.a(-5141);
                            break L21;
                          }
                        }
                        kj.field_C = false;
                        rg.field_b = false;
                        break L19;
                      }
                    }
                    L23: {
                      var4 = 0;
                      if (2 != var3) {
                        break L23;
                      } else {
                        var4 = 1;
                        break L23;
                      }
                    }
                    L24: {
                      L25: {
                        if (oj.field_P) {
                          break L25;
                        } else {
                          if (rg.field_b) {
                            break L25;
                          } else {
                            if (kj.field_C) {
                              break L25;
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                      var4 = 1;
                      break L24;
                    }
                    L26: {
                      if (va.b((byte) -81)) {
                        break L26;
                      } else {
                        var4 = 0;
                        break L26;
                      }
                    }
                    if (var4 != 0) {
                      wp.a(10);
                      break L18;
                    } else {
                      break L18;
                    }
                  } else {
                    break L18;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((lc.field_f ^ -1) != -70) {
                  if (9 == lc.field_f) {
                    g.b(7);
                    rg.field_b = false;
                    am.field_n = 11;
                    kj.field_C = false;
                    rg.field_b = false;
                    ke.field_i = id.field_f.f(128);
                    continue L16;
                  } else {
                    if (lc.field_f != 14) {
                      if (lc.field_f == 15) {
                        L27: {
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
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        kj.field_C = false;
                        rg.field_b = false;
                        continue L16;
                      } else {
                        L28: {
                          if (lc.field_f != 10) {
                            break L28;
                          } else {
                            if (!oj.field_P) {
                              break L28;
                            } else {
                              tq.a((byte) -66);
                              continue L16;
                            }
                          }
                        }
                        if (lc.field_f == 67) {
                          L29: {
                            var3 = id.field_f.b(true);
                            var3 = var3 & (ml.field_z ^ -1);
                            if (!sp.field_V) {
                              break L29;
                            } else {
                              var4 = 0;
                              L30: while (true) {
                                if (hi.field_i.length <= var4) {
                                  break L29;
                                } else {
                                  L31: {
                                    if ((1 << var4 & var3 ^ -1) != -1) {
                                      bg.field_b.a(new fa(var4), false);
                                      break L31;
                                    } else {
                                      break L31;
                                    }
                                  }
                                  var4++;
                                  continue L30;
                                }
                              }
                            }
                          }
                          ml.field_z = ml.field_z | var3;
                          jq.field_e = jq.field_e | var3;
                          continue L16;
                        } else {
                          L32: {
                            if ((lc.field_f ^ -1) == -58) {
                              break L32;
                            } else {
                              if (58 != lc.field_f) {
                                if (lc.field_f != 59) {
                                  L33: {
                                    var3_ref = null;
                                    if (am.field_b) {
                                      var3_ref = ln.field_d;
                                      break L33;
                                    } else {
                                      if (ed.field_q) {
                                        var3_ref = oe.field_pb;
                                        break L33;
                                      } else {
                                        break L33;
                                      }
                                    }
                                  }
                                  L34: {
                                    if (var3_ref != null) {
                                      if ((lc.field_f ^ -1) == -71) {
                                        var4_ref_pp = new pp(((tr) (var3_ref)).field_D.field_z);
                                        var4_ref_pp.a((byte) -8, ((tr) (var3_ref)).field_B, id.field_f);
                                        ((tr) (var3_ref)).a(10, var4_ref_pp);
                                        continue L16;
                                      } else {
                                        if (lc.field_f != 62) {
                                          if (lc.field_f != 63) {
                                            if (-65 != (lc.field_f ^ -1)) {
                                              if (lc.field_f != 65) {
                                                if (-67 != (lc.field_f ^ -1)) {
                                                  break L34;
                                                } else {
                                                  ((tr) (var3_ref)).field_h = id.field_f.h(-11);
                                                  if (null == ln.field_d) {
                                                    continue L16;
                                                  } else {
                                                    mq.b(true);
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                ((tr) (var3_ref)).field_D.field_t = id.field_f.h(-11);
                                                if (ln.field_d != null) {
                                                  mq.b(true);
                                                  continue L16;
                                                } else {
                                                  continue L16;
                                                }
                                              }
                                            } else {
                                              ((tr) (var3_ref)).field_D.field_u = id.field_f.h(-11);
                                              continue L16;
                                            }
                                          } else {
                                            ((tr) (var3_ref)).field_D.field_d = id.field_f.h(-11);
                                            if (ln.field_d == null) {
                                              continue L16;
                                            } else {
                                              jc.b(10);
                                              continue L16;
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
                                            continue L16;
                                          } else {
                                            gj.a((byte) 63, true, am.field_n, 16);
                                            continue L16;
                                          }
                                        }
                                      }
                                    } else {
                                      break L34;
                                    }
                                  }
                                  this.g(-109);
                                  continue L16;
                                } else {
                                  L35: {
                                    L36: {
                                      if (am.field_b) {
                                        break L36;
                                      } else {
                                        if (ed.field_q) {
                                          break L36;
                                        } else {
                                          break L35;
                                        }
                                      }
                                    }
                                    L37: {
                                      g.b(7);
                                      if (!am.field_b) {
                                        break L37;
                                      } else {
                                        ln.field_d.a(2, false);
                                        break L37;
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
                                    break L35;
                                  }
                                  kj.field_C = false;
                                  continue L16;
                                }
                              } else {
                                break L32;
                              }
                            }
                          }
                          L38: {
                            g.b(7);
                            var3 = id.field_f.h(-11);
                            var4 = id.field_f.h(-11);
                            var5 = id.field_f.h(-11);
                            var6 = id.field_f.h(-11);
                            var7_int = id.field_f.a((byte) -11);
                            var8 = id.field_f.a((byte) -11);
                            if (id.field_f.h(-11) == 0) {
                              stackIn_125_0 = 0;
                              break L38;
                            } else {
                              stackIn_125_0 = 1;
                              break L38;
                            }
                          }
                          var9 = stackIn_125_0;
                          var10 = -2 + id.field_f.h(-11);
                          var11 = new String[id.field_f.h(-11)];
                          var12_int = 0;
                          L39: while (true) {
                            if (var12_int >= var11.length) {
                              L40: {
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
                                  break L40;
                                } else {
                                  break L40;
                                }
                              }
                              L41: {
                                if (an.field_c) {
                                  ln.field_d = null;
                                  oe.field_pb = null;
                                  an.field_c = false;
                                  break L41;
                                } else {
                                  break L41;
                                }
                              }
                              L42: {
                                if (-58 == (lc.field_f ^ -1)) {
                                  am.field_b = true;
                                  ln.field_d = var12;
                                  jc.b(10);
                                  mq.b(true);
                                  mb.b((byte) -110);
                                  break L42;
                                } else {
                                  oe.field_pb = var12;
                                  ed.field_q = true;
                                  break L42;
                                }
                              }
                              lc.field_d = true;
                              kj.field_C = false;
                              am.field_n = -1;
                              continue L16;
                            } else {
                              var11[var12_int] = id.field_f.f(128);
                              var12_int++;
                              continue L39;
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
                      continue L16;
                    }
                  }
                } else {
                  L43: {
                    if (ig.field_c == null) {
                      ig.field_c = new short[50];
                      break L43;
                    } else {
                      break L43;
                    }
                  }
                  var3 = 0;
                  L44: while (true) {
                    if (var3 >= 50) {
                      continue L16;
                    } else {
                      L45: {
                        ig.field_c[var3] = (short)id.field_f.a((byte) -11);
                        if (0 == ig.field_c[var3]) {
                          ig.field_c[var3] = (short)30000;
                          break L45;
                        } else {
                          break L45;
                        }
                      }
                      var3++;
                      continue L44;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "Vertigo2.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void n(byte param0) {
        ee.a(11579, nn.field_y);
        er var7 = new er(nn.field_y.a("", "nebula_2_v2.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        er var8 = var7;
        er var3 = new er(nn.field_y.a("", "nebula_1.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        er var4 = new er(nn.field_y.a("", "planet_1.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        er var5 = new er(nn.field_y.a("", "stars.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        er var6 = new er(nn.field_y.a("", "asteroids.jpg", 0), (java.awt.Component) ((Object) ne.field_F));
        qr.field_l = new rp(true, new er[]{var7, var3, var4, var5, var7.c(), var6});
        ue.field_N = new er(640, 480);
        ue.field_N.d();
        var8.c(0, 0);
        if (param0 > -89) {
            return;
        }
        try {
            var3.c(var8.field_y, 0);
            var4.c(0, var8.field_t);
            var5.c(var8.field_y, var8.field_t);
            ro.field_g.a(-128);
            nn.field_y = null;
            this.d(-17);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "Vertigo2.L(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              nm.k(8);
              if (param0 < -113) {
                break L1;
              } else {
                this.b((byte) 27);
                break L1;
              }
            }
            L2: {
              if (null != dc.field_L) {
                cp.a((byte) 124);
                break L2;
              } else {
                break L2;
              }
            }
            we.i(-1733144127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "Vertigo2.Q(" + param0 + ')');
        }
    }

    private final void q(int param0) {
        int var2_int = 0;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_L ? 1 : 0;
        try {
          L0: {
            on.field_b[0][0] = hp.a(gp.field_s, "", "v_menu_select").a();
            on.field_b[1][0] = hp.a(gp.field_s, "", "v_explode").a();
            if (param0 == 19804) {
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
              si.a(le.field_f, "", "vertigo2_multiplayer_lvl_lost_jingle");
              si.a(le.field_f, "", "vertigo2_time_running_out_jingle");
              qc.field_v.a(0, jk.field_b, op.field_d, re.field_d, (byte) 75);
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= up.field_B.length) {
                  mj.field_b = null;
                  gp.field_s = null;
                  this.d(-17);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  qc.field_v.a(0, jk.field_b, up.field_B[var2_int], re.field_d, (byte) 56);
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "Vertigo2.N(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void o(byte param0) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              qi.field_d = new bl(40, 100, 260, 300, va.field_s, qr.field_h, li.field_m, tb.field_d, pc.field_c);
              if (param0 >= 80) {
                break L1;
              } else {
                field_C = (fe) null;
                break L1;
              }
            }
            qi.field_d.field_F = 16777215;
            qi.field_d.field_P = 16777215;
            qi.field_d.field_I = 16777215;
            qi.field_d.field_m = 5921370;
            qi.field_d.field_y = new boolean[50];
            qi.field_d.field_k = new String[50];
            qi.field_d.field_x = 15637810;
            qi.field_d.field_J = 0;
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= qi.field_d.field_k.length) {
                qi.field_d.field_u = false;
                break L0;
              } else {
                qi.field_d.field_k[var2_int] = Vertigo2.a(new String[]{Integer.toString(var2_int + 1)}, bl.field_o, -121);
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "Vertigo2.E(" + param0 + ')');
        }
    }

    final void b(int param0) {
        db var3 = null;
        try {
            this.a(4, 0, 19, 1, false, -16, 2, 64);
            var3 = new db();
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
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "Vertigo2.S(" + param0 + ')');
        }
    }

    private final void j(byte param0) {
        u[] var2 = null;
        int var3 = 0;
        int var4_int = 0;
        int var9 = 0;
        u[] var11 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        er[][] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        er[] var10 = null;
        var9 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
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
                break L1;
              } else {
                field_I = (String[]) null;
                break L1;
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
            L2: while (true) {
              if (var4_int >= mb.field_q.length) {
                var4_int = 0;
                L3: while (true) {
                  if (var4_int >= td.field_l.length) {
                    tn.field_i = (fe) ((Object) rq.a(rn.field_u, "interface_lives", "", (byte) 98));
                    bj.field_j = (fe) ((Object) rq.a(rn.field_u, "interface_jetpack", "", (byte) 98));
                    be.field_n = (fe) ((Object) rq.a(rn.field_u, "interface_dynamite", "", (byte) 98));
                    uo.field_e = (fe) ((Object) rq.a(rn.field_u, "interface_bucket_6", "", (byte) 98));
                    oj.field_L = (fe) ((Object) rq.a(rn.field_u, "lobby_logo", "", (byte) 98));
                    im.field_c = new fe[5];
                    bh.field_y = new fe[5];
                    var4_int = 0;
                    L4: while (true) {
                      if (5 <= var4_int) {
                        var4_int = 0;
                        L5: while (true) {
                          if (var4_int >= 5) {
                            sf.field_b = (fe) ((Object) rq.a(rn.field_u, "star", "", (byte) 98));
                            am.field_o = (fe) ((Object) rq.a(rn.field_u, "cloud", "", (byte) 98));
                            field_C = (fe) ((Object) rq.a(rn.field_u, "planet1", "", (byte) 98));
                            ji.field_p = (fe) ((Object) rq.a(rn.field_u, "planet2", "", (byte) 98));
                            jf.field_M = (fe) ((Object) rq.a(rn.field_u, "nebula", "", (byte) 98));
                            mp.field_a = (fe) ((Object) rq.a(rn.field_u, "instructions_how_to_play", "", (byte) 98));
                            li.field_i = new fe[aa.field_Sb.length];
                            var4_int = 0;
                            L6: while (true) {
                              if (aa.field_Sb.length <= var4_int) {
                                vj.field_g = new fe[bg.field_e.length];
                                var4_int = 0;
                                L7: while (true) {
                                  if (bg.field_e.length <= var4_int) {
                                    eq.field_F = (fe) ((Object) rq.a(rn.field_u, "maintitle", "", (byte) 98));
                                    rq.a(rn.field_u, "timeattack_complete", "", (byte) 98);
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
                                    break L0;
                                  } else {
                                    vj.field_g[var4_int] = (fe) ((Object) rq.a(rn.field_u, "instructions_item_" + var4_int, "", (byte) 98));
                                    var4_int++;
                                    continue L7;
                                  }
                                }
                              } else {
                                li.field_i[var4_int] = (fe) ((Object) rq.a(rn.field_u, "instructions_block_" + var4_int, "", (byte) 98));
                                var4_int++;
                                continue L6;
                              }
                            }
                          } else {
                            bh.field_y[var4_int] = (fe) ((Object) rq.a(rn.field_u, "interface_bucket_blue_" + (-var4_int + 5), "", (byte) 98));
                            var4_int++;
                            continue L5;
                          }
                        }
                      } else {
                        im.field_c[var4_int] = (fe) ((Object) rq.a(rn.field_u, "interface_bucket_" + (-var4_int + 5), "", (byte) 98));
                        var4_int++;
                        continue L4;
                      }
                    }
                  } else {
                    ea.field_d[var4_int] = an.b(119, td.field_l[var4_int]);
                    var4_int++;
                    continue L3;
                  }
                }
              } else {
                L8: {
                  if (null != mb.field_q[var4_int]) {
                    th.field_f[var4_int] = an.b(118, mb.field_q[var4_int]);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var4_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2_ref), "Vertigo2.H(" + param0 + ')');
        }
    }

    public final void init() {
        try {
            this.a(20, 0, "vertigo2");
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "Vertigo2.init()");
        }
    }

    final void d(byte param0) {
        try {
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
            if (param0 <= 103) {
                field_J = (int[][]) null;
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
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "Vertigo2.J(" + param0 + ')');
        }
    }

    public Vertigo2() {
    }

    final void d(int param0) {
        int stackIn_53_0 = 0;
        int stackIn_82_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        fa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        java.awt.Canvas var8 = null;
        var7 = field_L ? 1 : 0;
        try {
          L0: {
            var8 = gn.a(param0 + -22781);
            if (cp.a(96)) {
              bp.a(240, sl.b(param0 ^ -108), var8);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param0 == -17) {
                  break L1;
                } else {
                  this.n((byte) 108);
                  break L1;
                }
              }
              if (rg.field_a) {
                if (fb.i(param0 + 28)) {
                  L2: {
                    L3: {
                      var3 = 1;
                      if (lc.field_b != -1) {
                        break L3;
                      } else {
                        if (am.field_n == -1) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var3 = 0;
                    break L2;
                  }
                  L4: {
                    if (am.field_n == lc.field_b) {
                      if (lc.field_b >= 0) {
                        L5: {
                          if (vp.a(18055, lc.field_b)) {
                            ca.a(var3 != 0, -16237);
                            break L5;
                          } else {
                            wn.field_b.a(0);
                            break L5;
                          }
                        }
                        if ((lc.field_b ^ -1) > -1) {
                          break L4;
                        } else {
                          fh.field_y[lc.field_b].b((byte) -114);
                          break L4;
                        }
                      } else {
                        if (vp.a(param0 + 18072, lc.field_b)) {
                          ca.a(var3 != 0, -16237);
                          break L4;
                        } else {
                          wn.field_b.a(0);
                          break L4;
                        }
                      }
                    } else {
                      if (-17 >= (vl.field_c ^ -1)) {
                        L6: {
                          if (vp.a(18055, lc.field_b)) {
                            ca.a(var3 != 0, -16237);
                            break L6;
                          } else {
                            wn.field_b.a(0);
                            break L6;
                          }
                        }
                        if (0 > am.field_n) {
                          break L4;
                        } else {
                          fh.field_y[am.field_n].b((byte) -114);
                          break L4;
                        }
                      } else {
                        L7: {
                          if (vp.a(param0 ^ -18072, lc.field_b)) {
                            ca.a(var3 != 0, param0 + -16220);
                            break L7;
                          } else {
                            wn.field_b.a(0);
                            break L7;
                          }
                        }
                        if ((lc.field_b ^ -1) > -1) {
                          break L4;
                        } else {
                          fh.field_y[lc.field_b].b((byte) -114);
                          break L4;
                        }
                      }
                    }
                  }
                  L8: {
                    L9: {
                      if (-1 != (vl.field_c ^ -1)) {
                        break L9;
                      } else {
                        if (0 == vq.field_r) {
                          break L8;
                        } else {
                          break L9;
                        }
                      }
                    }
                    L10: {
                      if (vl.field_c == 0) {
                        stackIn_53_0 = vq.field_r;
                        break L10;
                      } else {
                        stackIn_53_0 = vl.field_c;
                        break L10;
                      }
                    }
                    L11: {
                      var4_int = stackIn_53_0;
                      if (var4_int <= 16) {
                        break L11;
                      } else {
                        var4_int = -var4_int + 32;
                        break L11;
                      }
                    }
                    L12: {
                      if (0 <= var4_int) {
                        break L12;
                      } else {
                        var4_int = -var4_int;
                        break L12;
                      }
                    }
                    var4_int = var4_int << 2;
                    bi.c(var4_int, var4_int, 0, 0, 640, 480);
                    bi.b(0, 0, 640, 480, 1, var4_int << -1064431710);
                    break L8;
                  }
                  L13: {
                    L14: {
                      if (!qh.field_g) {
                        break L14;
                      } else {
                        if (!lc.field_d) {
                          break L14;
                        } else {
                          break L13;
                        }
                      }
                    }
                    ff.a(m.h(-124), 11182);
                    break L13;
                  }
                  L15: {
                    var4 = (fa) ((Object) bg.field_b.a((byte) 100));
                    if (var4 != null) {
                      L16: {
                        var6 = oa.field_l;
                        if (-81 < (var6 ^ -1)) {
                          var5 = -32 + var6 / 2;
                          break L16;
                        } else {
                          if (-231 < (var6 ^ -1)) {
                            var5 = 8;
                            break L16;
                          } else {
                            var5 = -(var6 / 2) + 123;
                            break L16;
                          }
                        }
                      }
                      vj.field_b[var4.field_n].d(158, var5);
                      va.field_s.a(16777215, (byte) 85, -1, 198, hi.field_i[var4.field_n], var5 + va.field_s.field_j);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  L17: {
                    if (kg.h(param0 ^ -111)) {
                      var5 = oi.a(-110) + 30;
                      var6 = 30 + hk.a(true);
                      rq.a(var6, var5, -(var6 / 2) + 240, -(var5 / 2) + 320, 82, 210);
                      eb.b(-14732);
                      break L17;
                    } else {
                      if (pq.b(0)) {
                        L18: {
                          if (null == dc.field_L) {
                            stackIn_82_0 = uj.field_g ? 1 : 0;
                            break L18;
                          } else {
                            stackIn_82_0 = 1;
                            break L18;
                          }
                        }
                        hr.a(stackIn_82_0 != 0, true);
                        break L17;
                      } else {
                        if (rh.e((byte) 99)) {
                          var5 = 30 + el.a((byte) -72);
                          var6 = f.b(false) - -30;
                          rq.a(var6, var5, -(var6 / 2) + 270, 320 - var5 / 2, -77, 210);
                          bk.b((byte) -101);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  L19: {
                    if (t.field_a != t.field_f) {
                      var5 = 256 * ok.field_c / 16;
                      if (0 >= var5) {
                        break L19;
                      } else {
                        bi.b(0, 0, bi.field_e, bi.field_j, 0, var5);
                        break L19;
                      }
                    } else {
                      break L19;
                    }
                  }
                  dh.a(0, (byte) -88, var8, 0);
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  aj.a(false, 100.0f, dk.field_n);
                  an.a(-1243, var8);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                an.a(-1243, var8);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2), "Vertigo2.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
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
        try {
            field_F = null;
            field_J = (int[][]) null;
            field_C = null;
            field_H = null;
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "Vertigo2.M(" + param0 + ')');
        }
    }

    private final static int p(byte param0) {
        int var1_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
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
                stackIn_17_0 = var2;
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
        return stackIn_17_0;
    }

    private final void l(byte param0) {
        try {
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
            int var2_int = -39 / ((param0 - 70) / 42);
            ii.field_C = pm.a(17, 124);
            hi.field_o = pm.a(18, 123);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "Vertigo2.O(" + param0 + ')');
        }
    }

    private final void k(byte param0) {
        try {
            int var2_int = -22 / ((48 - param0) / 60);
            ei.a(pp.field_s, (byte) -81);
            pp.field_s = null;
            this.d(-17);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "Vertigo2.P(" + param0 + ')');
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
        ae[] array$1 = null;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = field_L ? 1 : 0;
        try {
          L0: {
            array$1 = new ae[param0 + param2];
            on.field_b[param3] = array$1;
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
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("Vertigo2.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final boolean a(int param0, boolean param1) {
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_62_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_135_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_158_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = field_L ? 1 : 0;
        try {
          L0: {
            ro.a((byte) -52);
            if (null == gp.field_s) {
              L1: {
                mn.a(false);
                if (null != rn.field_u) {
                  aj.a(false, 86.0f, nh.field_p);
                  this.d(-17);
                  oo.a(new nr(hi.field_o, ii.field_C, rn.field_u, 13, false));
                  ii.field_C = null;
                  this.j((byte) 31);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (null == pp.field_s) {
                  break L2;
                } else {
                  aj.a(false, 90.0f, cp.field_a);
                  this.d(param0 ^ -16777200);
                  this.k((byte) 109);
                  break L2;
                }
              }
              L3: {
                if (nn.field_y == null) {
                  break L3;
                } else {
                  aj.a(false, 92.0f, lk.field_g);
                  this.d(-17);
                  this.n((byte) -121);
                  break L3;
                }
              }
              L4: {
                if (null == tl.field_c) {
                  break L4;
                } else {
                  aj.a(false, 95.0f, dh.field_f);
                  this.d(param0 + -16777232);
                  w.a(ml.field_u, np.field_Kb, tl.field_c, (byte) 59);
                  tl.field_c = null;
                  ml.field_u = null;
                  np.field_Kb = null;
                  break L4;
                }
              }
              if (null == gi.field_p) {
                L5: {
                  kr.a(-3645);
                  if (param0 == 16777215) {
                    break L5;
                  } else {
                    this.n((byte) 93);
                    break L5;
                  }
                }
                var3_int = 0;
                L6: while (true) {
                  if ((var3_int ^ -1) <= -24) {
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
                    stackIn_158_0 = 1;
                    decompiledRegionSelector0 = 27;
                    break L0;
                  } else {
                    fh.field_y[var3_int] = new fo(var3_int);
                    var3_int++;
                    continue L6;
                  }
                }
              } else {
                aj.a(false, 98.0f, fa.field_v);
                this.d(-17);
                ch.a(new ke(gi.field_p.a("", "huffman", 0)), (byte) 98);
                gi.field_p = null;
                di.b((byte) 126);
                stackIn_150_0 = 0;
                decompiledRegionSelector0 = 26;
                break L0;
              }
            } else {
              L7: {
                if (!ml.field_y.b(0)) {
                  break L7;
                } else {
                  if (!ml.field_y.c("basic", 0)) {
                    break L7;
                  } else {
                    if (ml.field_y.c("roman20", param0 ^ 16777215)) {
                      L8: {
                        if (!ac.field_G.b(0)) {
                          break L8;
                        } else {
                          if (ac.field_G.c("roman20", 0)) {
                            if (!ml.field_y.c("kartika13", 0)) {
                              aj.a(false, 6.0f, gr.a(vc.field_a, (byte) 103, ml.field_y, vd.field_c, "kartika13"));
                              stackIn_20_0 = 0;
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              L9: {
                                if (!ac.field_G.b(param0 ^ 16777215)) {
                                  break L9;
                                } else {
                                  if (ac.field_G.c("kartika13", 0)) {
                                    if (!ml.field_y.c("comic20", param0 ^ 16777215)) {
                                      aj.a(false, 8.0f, gr.a(vc.field_a, (byte) 47, ml.field_y, vd.field_c, "comic20"));
                                      stackIn_30_0 = 0;
                                      decompiledRegionSelector0 = 5;
                                      break L0;
                                    } else {
                                      L10: {
                                        if (!ac.field_G.b(param0 ^ 16777215)) {
                                          break L10;
                                        } else {
                                          if (ac.field_G.c("comic20", param0 ^ 16777215)) {
                                            L11: {
                                              if (!ml.field_y.b(0)) {
                                                break L11;
                                              } else {
                                                if (ml.field_y.c("lobby", 0)) {
                                                  L12: {
                                                    if (!ac.field_G.b(0)) {
                                                      break L12;
                                                    } else {
                                                      if (!ac.field_G.c("lobby", 0)) {
                                                        break L12;
                                                      } else {
                                                        L13: {
                                                          if (!gp.field_s.b(0)) {
                                                            break L13;
                                                          } else {
                                                            if (gp.field_s.c("", 0)) {
                                                              L14: {
                                                                if (!mj.field_b.b(0)) {
                                                                  break L14;
                                                                } else {
                                                                  if (!mj.field_b.c("", 0)) {
                                                                    break L14;
                                                                  } else {
                                                                    L15: {
                                                                      if (!re.field_d.b(param0 + -16777215)) {
                                                                        break L15;
                                                                      } else {
                                                                        if (re.field_d.a((byte) -112)) {
                                                                          L16: {
                                                                            if (!le.field_f.b(param0 + -16777215)) {
                                                                              break L16;
                                                                            } else {
                                                                              if (!le.field_f.c("", 0)) {
                                                                                break L16;
                                                                              } else {
                                                                                L17: {
                                                                                  if (!rn.field_u.b(param0 + -16777215)) {
                                                                                    break L17;
                                                                                  } else {
                                                                                    if (!rn.field_u.c("", param0 ^ 16777215)) {
                                                                                      break L17;
                                                                                    } else {
                                                                                      L18: {
                                                                                        if (!vi.field_n.b(0)) {
                                                                                          break L18;
                                                                                        } else {
                                                                                          if (vi.field_n.c("", 0)) {
                                                                                            L19: {
                                                                                              if (!gi.field_p.b(param0 ^ 16777215)) {
                                                                                                break L19;
                                                                                              } else {
                                                                                                if (!gi.field_p.c("", param0 ^ 16777215)) {
                                                                                                  break L19;
                                                                                                } else {
                                                                                                  L20: {
                                                                                                    if (!pp.field_s.b(param0 ^ 16777215)) {
                                                                                                      break L20;
                                                                                                    } else {
                                                                                                      if (pp.field_s.c("", param0 ^ 16777215)) {
                                                                                                        L21: {
                                                                                                          if (!np.field_Kb.b(0)) {
                                                                                                            break L21;
                                                                                                          } else {
                                                                                                            if (!np.field_Kb.a((byte) -112)) {
                                                                                                              break L21;
                                                                                                            } else {
                                                                                                              L22: {
                                                                                                                if (!tl.field_c.b(param0 ^ 16777215)) {
                                                                                                                  break L22;
                                                                                                                } else {
                                                                                                                  if (!tl.field_c.a((byte) -112)) {
                                                                                                                    break L22;
                                                                                                                  } else {
                                                                                                                    L23: {
                                                                                                                      if (!ml.field_u.b(0)) {
                                                                                                                        break L23;
                                                                                                                      } else {
                                                                                                                        if (!ml.field_u.a((byte) -112)) {
                                                                                                                          break L23;
                                                                                                                        } else {
                                                                                                                          L24: {
                                                                                                                            if (!ii.field_C.b(0)) {
                                                                                                                              break L24;
                                                                                                                            } else {
                                                                                                                              if (!ii.field_C.a((byte) -112)) {
                                                                                                                                break L24;
                                                                                                                              } else {
                                                                                                                                L25: {
                                                                                                                                  if (!hi.field_o.b(param0 + -16777215)) {
                                                                                                                                    break L25;
                                                                                                                                  } else {
                                                                                                                                    if (!hi.field_o.a((byte) -112)) {
                                                                                                                                      break L25;
                                                                                                                                    } else {
                                                                                                                                      L26: {
                                                                                                                                        if (!nn.field_y.b(0)) {
                                                                                                                                          break L26;
                                                                                                                                        } else {
                                                                                                                                          if (!nn.field_y.c("", 0)) {
                                                                                                                                            break L26;
                                                                                                                                          } else {
                                                                                                                                            L27: {
                                                                                                                                              if (!m.field_z.b(param0 ^ 16777215)) {
                                                                                                                                                break L27;
                                                                                                                                              } else {
                                                                                                                                                if (!m.field_z.a((byte) -112)) {
                                                                                                                                                  break L27;
                                                                                                                                                } else {
                                                                                                                                                  aj.a(false, 78.0f, oe.field_sb);
                                                                                                                                                  if (param1) {
                                                                                                                                                    le.a(468713154);
                                                                                                                                                    this.d(-17);
                                                                                                                                                    jk.field_b = new id(gp.field_s, mj.field_b);
                                                                                                                                                    this.q(19804);
                                                                                                                                                    gp.field_s = null;
                                                                                                                                                    di.b((byte) 109);
                                                                                                                                                    stackIn_137_0 = 0;
                                                                                                                                                    decompiledRegionSelector0 = 25;
                                                                                                                                                    break L0;
                                                                                                                                                  } else {
                                                                                                                                                    stackIn_135_0 = 0;
                                                                                                                                                    decompiledRegionSelector0 = 24;
                                                                                                                                                    break L0;
                                                                                                                                                  }
                                                                                                                                                }
                                                                                                                                              }
                                                                                                                                            }
                                                                                                                                            aj.a(false, 73.0f, fg.a(m.field_z, dk.field_n, vj.field_a, 274));
                                                                                                                                            stackIn_132_0 = 0;
                                                                                                                                            decompiledRegionSelector0 = 23;
                                                                                                                                            break L0;
                                                                                                                                          }
                                                                                                                                        }
                                                                                                                                      }
                                                                                                                                      aj.a(false, 72.0f, gr.a(eq.field_E, (byte) 109, nn.field_y, bm.field_D, ""));
                                                                                                                                      stackIn_126_0 = 0;
                                                                                                                                      decompiledRegionSelector0 = 22;
                                                                                                                                      break L0;
                                                                                                                                    }
                                                                                                                                  }
                                                                                                                                }
                                                                                                                                aj.a(false, 68.0f, fg.a(ii.field_C, ua.field_g, ee.field_d, 274));
                                                                                                                                stackIn_120_0 = 0;
                                                                                                                                decompiledRegionSelector0 = 21;
                                                                                                                                break L0;
                                                                                                                              }
                                                                                                                            }
                                                                                                                          }
                                                                                                                          aj.a(false, 67.0f, fg.a(ii.field_C, ua.field_g, ee.field_d, param0 ^ 16776941));
                                                                                                                          stackIn_114_0 = 0;
                                                                                                                          decompiledRegionSelector0 = 20;
                                                                                                                          break L0;
                                                                                                                        }
                                                                                                                      }
                                                                                                                    }
                                                                                                                    aj.a(false, 66.0f, fg.a(ml.field_u, kq.field_Vb, bb.field_G, 274));
                                                                                                                    stackIn_108_0 = 0;
                                                                                                                    decompiledRegionSelector0 = 19;
                                                                                                                    break L0;
                                                                                                                  }
                                                                                                                }
                                                                                                              }
                                                                                                              aj.a(false, 65.0f, fg.a(tl.field_c, kq.field_Vb, bb.field_G, param0 + -16776941));
                                                                                                              stackIn_102_0 = 0;
                                                                                                              decompiledRegionSelector0 = 18;
                                                                                                              break L0;
                                                                                                            }
                                                                                                          }
                                                                                                        }
                                                                                                        aj.a(false, 60.0f, fg.a(np.field_Kb, kq.field_Vb, bb.field_G, 274));
                                                                                                        stackIn_96_0 = 0;
                                                                                                        decompiledRegionSelector0 = 17;
                                                                                                        break L0;
                                                                                                      } else {
                                                                                                        break L20;
                                                                                                      }
                                                                                                    }
                                                                                                  }
                                                                                                  aj.a(false, 56.0f, gr.a(ga.field_ib, (byte) 52, pp.field_s, ec.field_D, ""));
                                                                                                  stackIn_90_0 = 0;
                                                                                                  decompiledRegionSelector0 = 16;
                                                                                                  break L0;
                                                                                                }
                                                                                              }
                                                                                            }
                                                                                            aj.a(false, 55.0f, gr.a(vj.field_a, (byte) 114, gi.field_p, dk.field_n, ""));
                                                                                            stackIn_85_0 = 0;
                                                                                            decompiledRegionSelector0 = 15;
                                                                                            break L0;
                                                                                          } else {
                                                                                            break L18;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                      aj.a(false, 54.0f, gr.a(vc.field_a, (byte) 54, vi.field_n, vd.field_c, ""));
                                                                                      stackIn_79_0 = 0;
                                                                                      decompiledRegionSelector0 = 14;
                                                                                      break L0;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                aj.a(false, 50.0f, gr.a(ib.field_b, (byte) 112, rn.field_u, me.field_b, ""));
                                                                                stackIn_74_0 = 0;
                                                                                decompiledRegionSelector0 = 13;
                                                                                break L0;
                                                                              }
                                                                            }
                                                                          }
                                                                          aj.a(false, 40.0f, gr.a(tm.field_c, (byte) 109, le.field_f, lo.field_b, ""));
                                                                          stackIn_68_0 = 0;
                                                                          decompiledRegionSelector0 = 12;
                                                                          break L0;
                                                                        } else {
                                                                          break L15;
                                                                        }
                                                                      }
                                                                    }
                                                                    aj.a(false, 35.0f, en.a(false, tm.field_c, re.field_d, 0, lo.field_b));
                                                                    stackIn_62_0 = 0;
                                                                    decompiledRegionSelector0 = 11;
                                                                    break L0;
                                                                  }
                                                                }
                                                              }
                                                              aj.a(false, 30.0f, gr.a(lc.field_c, (byte) 35, mj.field_b, de.field_a, ""));
                                                              stackIn_57_0 = 0;
                                                              decompiledRegionSelector0 = 10;
                                                              break L0;
                                                            } else {
                                                              break L13;
                                                            }
                                                          }
                                                        }
                                                        aj.a(false, 12.0f, gr.a(lc.field_c, (byte) 95, gp.field_s, de.field_a, ""));
                                                        stackIn_51_0 = 0;
                                                        decompiledRegionSelector0 = 9;
                                                        break L0;
                                                      }
                                                    }
                                                  }
                                                  aj.a(false, 11.0f, gr.a(vc.field_a, (byte) 119, ac.field_G, vd.field_c, "lobby"));
                                                  stackIn_46_0 = 0;
                                                  decompiledRegionSelector0 = 8;
                                                  break L0;
                                                } else {
                                                  break L11;
                                                }
                                              }
                                            }
                                            aj.a(false, 10.0f, gr.a(ib.field_b, (byte) 50, ml.field_y, me.field_b, "lobby"));
                                            stackIn_40_0 = 0;
                                            decompiledRegionSelector0 = 7;
                                            break L0;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      aj.a(false, 9.0f, gr.a(vc.field_a, (byte) 39, ac.field_G, vd.field_c, "comic20"));
                                      stackIn_35_0 = 0;
                                      decompiledRegionSelector0 = 6;
                                      break L0;
                                    }
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              aj.a(false, 7.0f, gr.a(vc.field_a, (byte) 64, ac.field_G, vd.field_c, "kartika13"));
                              stackIn_25_0 = 0;
                              decompiledRegionSelector0 = 4;
                              break L0;
                            }
                          } else {
                            break L8;
                          }
                        }
                      }
                      aj.a(false, 5.0f, gr.a(vc.field_a, (byte) 37, ac.field_G, vd.field_c, "roman20"));
                      stackIn_15_0 = 0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      aj.a(false, 4.0f, gr.a(vc.field_a, (byte) 66, ml.field_y, vd.field_c, "roman20"));
                      stackIn_10_0 = 0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    }
                  }
                }
              }
              aj.a(false, 1.0f, gr.a(ib.field_b, (byte) 60, ml.field_y, me.field_b, "basic"));
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "Vertigo2.K(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_15_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_25_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_30_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_35_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_40_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_46_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_51_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_57_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_62_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_68_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_74_0 != 0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_79_0 != 0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_85_0 != 0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_90_0 != 0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_96_0 != 0;
                                          } else {
                                            if (decompiledRegionSelector0 == 18) {
                                              return stackIn_102_0 != 0;
                                            } else {
                                              if (decompiledRegionSelector0 == 19) {
                                                return stackIn_108_0 != 0;
                                              } else {
                                                if (decompiledRegionSelector0 == 20) {
                                                  return stackIn_114_0 != 0;
                                                } else {
                                                  if (decompiledRegionSelector0 == 21) {
                                                    return stackIn_120_0 != 0;
                                                  } else {
                                                    if (decompiledRegionSelector0 == 22) {
                                                      return stackIn_126_0 != 0;
                                                    } else {
                                                      if (decompiledRegionSelector0 == 23) {
                                                        return stackIn_132_0 != 0;
                                                      } else {
                                                        if (decompiledRegionSelector0 == 24) {
                                                          return stackIn_135_0 != 0;
                                                        } else {
                                                          if (decompiledRegionSelector0 == 25) {
                                                            return stackIn_137_0 != 0;
                                                          } else {
                                                            if (decompiledRegionSelector0 == 26) {
                                                              return stackIn_150_0 != 0;
                                                            } else {
                                                              return stackIn_158_0 != 0;
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void d(boolean param0, int param1) {
        int fieldTemp$0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_145_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        wo var7_ref_wo = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              wn.field_b.b(8);
              var3_int = 0;
              if (t.field_f != t.field_a) {
                if (t.field_f == no.field_c) {
                  ok.field_c = ok.field_c + 1;
                  if (16 == ok.field_c) {
                    L2: {
                      if (!jo.field_d) {
                        id.a(-5);
                        break L2;
                      } else {
                        ho.a(-106);
                        break L2;
                      }
                    }
                    t.field_f = go.field_h;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  if (go.field_h == t.field_f) {
                    L3: {
                      if (ag.b(49)) {
                        break L3;
                      } else {
                        L4: {
                          if (uh.field_Xb != null) {
                            nr.a(3, -22754, uh.field_Xb);
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        L5: {
                          if (j.field_n == null) {
                            break L5;
                          } else {
                            nr.a(3, -22754, j.field_n);
                            break L5;
                          }
                        }
                        L6: {
                          lb.a(11141);
                          am.field_n = lp.field_C;
                          if (!jo.field_d) {
                            break L6;
                          } else {
                            ig.a(9790, false);
                            break L6;
                          }
                        }
                        L7: {
                          if (!ad.field_h) {
                            break L7;
                          } else {
                            gj.a((byte) 61, false, am.field_n, -4);
                            break L7;
                          }
                        }
                        if (!al.a(am.field_n, (byte) -94)) {
                          break L3;
                        } else {
                          g.b(7);
                          break L3;
                        }
                      }
                    }
                    t.field_f = ak.field_e;
                    break L1;
                  } else {
                    ok.field_c = ok.field_c - 1;
                    if (ok.field_c == 0) {
                      t.field_f = t.field_a;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                L8: {
                  var4 = 0;
                  var5 = 0;
                  if (!param0) {
                    if (am.field_n == lc.field_b) {
                      if (lc.field_b == -1) {
                        if (!oj.field_P) {
                          ln.field_d.a(true, true);
                          var3_int = 1;
                          L9: while (true) {
                            if (!gf.a(false)) {
                              break L8;
                            } else {
                              ln.field_d.a((byte) 115);
                              continue L9;
                            }
                          }
                        } else {
                          var4 = 1;
                          var5 = 1;
                          break L8;
                        }
                      } else {
                        if (lc.field_b != -2) {
                          if (al.a(lc.field_b, (byte) -94)) {
                            fh.field_y[lc.field_b].e((byte) -125);
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          var4 = 1;
                          break L8;
                        }
                      }
                    } else {
                      vl.field_c = vl.field_c + 1;
                      if (32 != vl.field_c) {
                        break L8;
                      } else {
                        g.b(7);
                        break L8;
                      }
                    }
                  } else {
                    break L8;
                  }
                }
                L10: {
                  if (!oj.field_P) {
                    break L10;
                  } else {
                    if (rg.field_b) {
                      break L10;
                    } else {
                      if (!kj.field_C) {
                        L11: {
                          if (!am.field_b) {
                            break L11;
                          } else {
                            if (!il.field_a) {
                              break L11;
                            } else {
                              var4 = 0;
                              break L11;
                            }
                          }
                        }
                        L12: {
                          hj.a(1726, var4 != 0);
                          if (ed.field_q) {
                            oe.field_pb.a(var5 != 0, true);
                            var3_int = 1;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (am.field_b) {
                            la.a(180, var5 != 0, (byte) -120, 320);
                            ln.field_d.a(var5 != 0, true);
                            var3_int = 1;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                        L14: while (true) {
                          if (!gf.a(false)) {
                            break L10;
                          } else {
                            L15: {
                              if (eo.field_o) {
                                if (!am.field_b) {
                                  gh.a(12, 12, 13, 15);
                                  break L15;
                                } else {
                                  if (!jm.a(15, 13, 915, 12)) {
                                    break L15;
                                  } else {
                                    continue L14;
                                  }
                                }
                              } else {
                                break L15;
                              }
                            }
                            L16: {
                              if (ed.field_q) {
                                oe.field_pb.a((byte) 115);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            if (am.field_b) {
                              ln.field_d.a((byte) 115);
                              continue L14;
                            } else {
                              continue L14;
                            }
                          }
                        }
                      } else {
                        break L10;
                      }
                    }
                  }
                }
                L17: {
                  if (!oj.field_P) {
                    wn.c(-2618);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (eo.field_o) {
                    if (ld.field_b <= sg.field_e) {
                      break L18;
                    } else {
                      sg.field_e = sg.field_e + 1;
                      break L18;
                    }
                  } else {
                    if (0 >= sg.field_e) {
                      break L18;
                    } else {
                      sg.field_e = sg.field_e - 1;
                      break L18;
                    }
                  }
                }
                var6_int = ld.field_b * ld.field_b;
                var7 = -(sg.field_e * sg.field_e) + var6_int;
                var8 = mk.field_E + 120 * var7 / var6_int;
                jf.c(var8, 91);
                if (bg.field_b.a((byte) 100) == null) {
                  break L1;
                } else {
                  fieldTemp$0 = oa.field_l + 1;
                  oa.field_l = oa.field_l + 1;
                  if (335 != fieldTemp$0) {
                    break L1;
                  } else {
                    oa.field_l = 0;
                    bg.field_b.b((byte) -43);
                    break L1;
                  }
                }
              }
            }
            L19: {
              if (-3 != am.field_n) {
                break L19;
              } else {
                L20: {
                  uh.field_Xb = null;
                  j.field_n = null;
                  var4 = qi.field_d.field_t;
                  if ((var4 ^ -1) <= -1) {
                    break L20;
                  } else {
                    var4 = 0;
                    break L20;
                  }
                }
                L21: {
                  var5 = 0;
                  if (qe.field_V == null) {
                    var6 = ed.field_o;
                    break L21;
                  } else {
                    var6 = qe.field_V;
                    break L21;
                  }
                }
                L22: {
                  ln.field_d = new tr(false, new String[]{var6}, 0, false, var5, var4, var4, -1);
                  if (!pm.field_d) {
                    stackIn_105_0 = 0;
                    break L22;
                  } else {
                    stackIn_105_0 = 1;
                    break L22;
                  }
                }
                var7 = stackIn_105_0;
                gj.a((byte) 54, var7 != 0, am.field_n, -1);
                lc.field_d = false;
                break L19;
              }
            }
            if (param1 <= -92) {
              L23: {
                if (am.field_n != -7) {
                  break L23;
                } else {
                  if (!ln.field_d.field_D.field_r.field_f[0].h((byte) 117)) {
                    L24: {
                      var4 = ln.field_d.field_D.field_l[0].field_p;
                      var5 = ln.field_d.field_D.field_l[0].field_W;
                      var6_int = -var5 + var4;
                      ln.field_d.field_D.field_l[0].field_W = var4;
                      if (var6_int == 0) {
                        break L24;
                      } else {
                        var7 = var6_int;
                        if (null == ln.field_d) {
                          break L24;
                        } else {
                          if ((ln.field_d.field_B ^ -1) > -1) {
                            break L24;
                          } else {
                            if (null == oe.field_pb) {
                              var8 = ln.field_d.field_s % 3;
                              if (0 == var8) {
                                gi.field_u = gi.field_u + var7;
                                break L24;
                              } else {
                                if (var8 == 1) {
                                  pn.field_R = pn.field_R - var7;
                                  break L24;
                                } else {
                                  var9 = var7 / 3;
                                  pn.field_R = pn.field_R - (-var9 + var7);
                                  gi.field_u = gi.field_u + var9;
                                  break L24;
                                }
                              }
                            } else {
                              break L24;
                            }
                          }
                        }
                      }
                    }
                    L25: {
                      ln.field_d.field_D.a(30113, true);
                      ln.field_d.e(-111);
                      if (-1 == (ln.field_d.field_D.field_j ^ -1)) {
                        var7_ref_wo = ln.field_d.field_D.field_r.field_f[0];
                        var7_ref_wo.a(true, var7_ref_wo.l(-32768) + -1);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    L26: {
                      if (!pm.field_d) {
                        stackIn_133_0 = 0;
                        break L26;
                      } else {
                        stackIn_133_0 = 1;
                        break L26;
                      }
                    }
                    var7 = stackIn_133_0;
                    gj.a((byte) -70, var7 != 0, am.field_n, -1);
                    lc.field_d = false;
                    break L23;
                  } else {
                    L27: {
                      if (!pm.field_d) {
                        stackIn_113_0 = 0;
                        break L27;
                      } else {
                        stackIn_113_0 = 1;
                        break L27;
                      }
                    }
                    var4 = stackIn_113_0;
                    gj.a((byte) -112, var4 != 0, am.field_n, -1);
                    lc.field_d = false;
                    break L23;
                  }
                }
              }
              L28: {
                if (-6 == am.field_n) {
                  L29: {
                    uh.field_Xb = null;
                    j.field_n = null;
                    var4 = ap.field_d.field_t;
                    if (var4 >= 0) {
                      break L29;
                    } else {
                      var4 = 0;
                      break L29;
                    }
                  }
                  L30: {
                    var5 = 3;
                    if (null == qe.field_V) {
                      var6 = ed.field_o;
                      break L30;
                    } else {
                      var6 = qe.field_V;
                      break L30;
                    }
                  }
                  L31: {
                    ln.field_d = new tr(false, new String[]{var6}, 0, false, var5, var4, var4, 1);
                    if (!pm.field_d) {
                      stackIn_145_0 = 0;
                      break L31;
                    } else {
                      stackIn_145_0 = 1;
                      break L31;
                    }
                  }
                  var7 = stackIn_145_0;
                  gj.a((byte) 91, var7 != 0, am.field_n, -1);
                  lc.field_d = false;
                  break L28;
                } else {
                  break L28;
                }
              }
              L32: {
                if (am.field_n != -4) {
                  break L32;
                } else {
                  uh.field_Wb.j(9, 127);
                  sg.field_e = ld.field_b;
                  rg.field_b = true;
                  am.field_n = lc.field_b;
                  break L32;
                }
              }
              L33: {
                if ((am.field_n ^ -1) != 4) {
                  break L33;
                } else {
                  qk.d(gd.field_j.a((byte) -38), 11, 18964);
                  kj.field_C = true;
                  am.field_n = lc.field_b;
                  break L33;
                }
              }
              L34: {
                if (var3_int != 0) {
                  break L34;
                } else {
                  ee.a(-11747);
                  break L34;
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
          var3 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var3), "Vertigo2.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(String[] args, String param1, int param2) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        int stackIn_6_0 = 0;
        String stackIn_35_0 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        String var7_ref_String = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = field_L ? 1 : 0;
        try {
          L0: {
            var3_int = param1.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (-1 >= (var6_int ^ -1)) {
                stackIn_6_0 = var6_int - -2;
                var5 = stackIn_6_0;
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
                      if (-63 == (param1.charAt(var5) ^ -1)) {
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
                            discarded$0 = var6.append(param1.substring(var7, var9));
                            var7 = var5;
                            discarded$1 = var6.append(args[var11]);
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
                    discarded$2 = var6.append(param1.substring(var7));
                    stackIn_35_0 = var6.toString();
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
            stackIn_39_0 = (RuntimeException) (var3);

            stackIn_39_1 = new StringBuilder().append("Vertigo2.D(");

            if (args == null) {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "null";
              break L7;
            } else {
              stackIn_40_0 = (RuntimeException) ((Object) stackIn_39_0);
              stackIn_40_1 = (StringBuilder) ((Object) stackIn_39_1);
              stackIn_40_2 = "{...}";
              break L7;
            }
          }
          L8: {
            stackIn_43_0 = (RuntimeException) ((Object) stackIn_40_0);

            stackIn_43_1 = ((StringBuilder) (Object) stackIn_40_1).append(stackIn_40_2).append(',');

            if (param1 == null) {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "null";
              break L8;
            } else {
              stackIn_44_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackIn_44_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackIn_44_2 = "{...}";
              break L8;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ',' + param2 + ')');
        }
        return stackIn_35_0;
    }

    final static void a(java.awt.Canvas param0, byte param1) {
        java.awt.Canvas var3 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
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
            stackIn_9_0 = (RuntimeException) (var2);

            stackIn_9_1 = new StringBuilder().append("Vertigo2.I(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
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
