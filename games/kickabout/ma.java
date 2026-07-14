/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ma extends ah {
    private int field_p;
    private long field_v;
    String field_z;
    private int field_r;
    static String field_w;
    private int field_u;
    private int field_s;
    static pk field_t;
    private boolean field_A;
    private int field_B;
    private int field_x;
    static String field_y;
    private boolean field_q;
    private boolean field_o;

    final void i(int param0) {
        hr.field_h[11] = true;
        hr.field_h[param0] = true;
        hr.field_h[12] = true;
    }

    final static hd f(int param0) {
        if (param0 != 0) {
            return null;
        }
        return bf.field_u.field_Ab;
    }

    private final void h(int param0) {
        uc.field_A[8] = -2;
        uc.field_A[6] = -2;
        uc.field_A[5] = -1;
        uc.field_A[9] = -1;
        uc.field_A[12] = -1;
        uc.field_A[11] = -1;
        uc.field_A[13] = -1;
        uc.field_A[3] = -1;
        uc.field_A[4] = -1;
        uc.field_A[10] = -1;
        uc.field_A[18] = 1;
        uc.field_A[16] = -1;
        uc.field_A[17] = -1;
        uc.field_A[7] = -1;
        uc.field_A[1] = 16;
        if (param0 != 0) {
            return;
        }
        uc.field_A[2] = -2;
    }

    final void m(int param0) {
        if (param0 != 10) {
            return;
        }
        hr.field_h[5] = true;
    }

    final int i(byte param0) {
        if (param0 > -53) {
            return 89;
        }
        int var2 = this.l((byte) 121);
        if (var2 != 0) {
            // if_icmpne L147
        }
        if (hr.field_h[1]) {
            da.a(0, 2);
        }
        if (!(!hr.field_h[2])) {
            hm.a(115, 3);
        }
        if (hr.field_h[3]) {
            kp.a(4, -56);
        }
        if (hr.field_h[4]) {
            hg.a(5, (byte) -122);
        }
        if (!(!hr.field_h[5])) {
            dq.a(-1, 6);
        }
        if (!(!hr.field_h[6])) {
            mf.a(7, (byte) -128);
        }
        if (hr.field_h[8]) {
            sj.b(-1);
        }
        return var2;
    }

    final void l(int param0) {
        if (param0 != -1) {
            Object var3 = null;
            this.a((String) null, 31, 32, -108, 43);
        }
        hr.field_h[2] = true;
    }

    final void a(String param0, int param1, byte param2) {
        if (param2 != -60) {
            ((ma) this).field_A = true;
        }
        this.a(param0, param1, 480, 640, -93);
    }

    final void e(int param0) {
        hr.field_h[param0] = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ma) this).setBackground(java.awt.Color.black);
        vv.field_r = ((ma) this).field_p;
        vg.b(vv.field_r, 31900);
        uv.a(127, ((ma) this).field_x, ((ma) this).field_A, ((ma) this).field_s, ((ma) this).field_B, param7, param1, 5000, oo.field_c, vv.field_r, ((ma) this).field_v, ((ma) this).field_u, 5000, ((ma) this).field_z);
        js.a(((ma) this).field_z, param1, oo.field_c, vv.field_r, ((ma) this).field_u, ((ma) this).field_x, ((ma) this).field_B, ((ma) this).field_s, false);
        ml.o(255);
        ag.field_f = aw.g((byte) 3);
        lp.a(ic.field_d, (byte) -64);
        no.field_F = param4;
        gr.field_y = param3;
        if (param5 >= -3) {
            field_t = null;
        }
        ie.field_G = param0;
        ub.field_E = param2;
        wf.field_Q = param6;
        this.h(0);
        lm.d(-1);
    }

    final void a(boolean param0, int param1) {
        hr.field_h[0] = true;
        if (param1 != -1) {
            return;
        }
        hr.field_h[16] = true;
        hr.field_h[3] = true;
        hr.field_h[17] = true;
        hr.field_h[7] = true;
        hr.field_h[8] = param0;
        hr.field_h[18] = true;
    }

    private final void c(boolean param0) {
        String var2 = fj.a(param0);
        bv.a(so.a(19), var2, (byte) 15);
    }

    public static void d(boolean param0) {
        field_y = null;
        field_t = null;
        if (!param0) {
            field_y = null;
        }
        field_w = null;
    }

    final static void b(boolean param0) {
        String var2 = null;
        if (h.field_f != null) {
            var2 = h.field_f;
            String var1 = var2;
            n.a(126, vo.a((byte) -18, qo.field_j, new String[1]));
            h.field_f = null;
        }
        if (!param0) {
            ma.k((byte) 24);
        }
    }

    final static void k(byte param0) {
        if (na.field_Ab != ea.field_f.field_e) {
            c.field_c = c.field_c + (ea.field_f.field_e - na.field_Ab);
            na.field_Ab = ea.field_f.field_e;
        }
        if (param0 != -118) {
            return;
        }
        if (!(-1 <= (pg.field_b ^ -1))) {
            pg.field_b = pg.field_b - 1;
        }
        if (!(pg.field_b <= 0)) {
            eq.a(0);
        }
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if (param0 < -108) {
            break L0;
          } else {
            field_w = null;
            break L0;
          }
        }
        var3 = iv.a(0, param2, param1);
        if (var3 != null) {
          return var3;
        } else {
          var4 = 0;
          L1: while (true) {
            if (var4 < param1.length()) {
              if (!jw.a(param1.charAt(var4), 160)) {
                return pl.field_c;
              } else {
                var4++;
                continue L1;
              }
            } else {
              return null;
            }
          }
        }
    }

    final void h(byte param0) {
        hr.field_h[1] = true;
        int var2 = 110 / ((39 - param0) / 57);
    }

    final void j(int param0) {
        int var2 = 0;
        tv var3 = null;
        int var4 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_27_1 = 0;
        int stackOut_24_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_26_1 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        L0: {
          var4 = Kickabout.field_G;
          if (param0 >= 83) {
            break L0;
          } else {
            ma.b(false);
            break L0;
          }
        }
        L1: {
          var2 = so.field_b;
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (hr.field_h[var2]) {
              if (var2 == -1) {
                return;
              } else {
                L2: {
                  if (-2 != var2) {
                    if (var2 != 2) {
                      if (3 == var2) {
                        gf.a((byte) 53);
                        break L2;
                      } else {
                        if (-5 == var2) {
                          sm.a((byte) 103);
                          break L2;
                        } else {
                          if (var2 != 5) {
                            if (-7 == var2) {
                              ki.a(true);
                              break L2;
                            } else {
                              if (var2 != 7) {
                                if (var2 != 8) {
                                  if (16 == var2) {
                                    gn.c(-49);
                                    break L2;
                                  } else {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (-13 != (var2 ^ -1)) {
                                          if (13 != var2) {
                                            if (-18 == (var2 ^ -1)) {
                                              this.j((byte) -1);
                                              break L2;
                                            } else {
                                              if (var2 != 18) {
                                                bd.a("MGS1: " + tr.b(0), (Throwable) null, 1);
                                                lr.b((byte) -116);
                                                break L2;
                                              } else {
                                                gs.c(25957);
                                                break L2;
                                              }
                                            }
                                          } else {
                                            tt.a((byte) 77);
                                            break L2;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L4: {
                                      stackOut_24_0 = 113;
                                      stackIn_26_0 = stackOut_24_0;
                                      stackIn_25_0 = stackOut_24_0;
                                      if (12 != var2) {
                                        stackOut_26_0 = stackIn_26_0;
                                        stackOut_26_1 = 0;
                                        stackIn_27_0 = stackOut_26_0;
                                        stackIn_27_1 = stackOut_26_1;
                                        break L4;
                                      } else {
                                        stackOut_25_0 = stackIn_25_0;
                                        stackOut_25_1 = 1;
                                        stackIn_27_0 = stackOut_25_0;
                                        stackIn_27_1 = stackOut_25_1;
                                        break L4;
                                      }
                                    }
                                    var3 = jd.a((byte) stackIn_27_0, stackIn_27_1 != 0);
                                    qh.a((byte) -112, var3);
                                    break L2;
                                  }
                                } else {
                                  qv.a((iw) (Object) un.field_e, ms.field_b, -1, oo.field_c);
                                  break L2;
                                }
                              } else {
                                this.c(false);
                                break L2;
                              }
                            }
                          } else {
                            om.a(0);
                            break L2;
                          }
                        }
                      }
                    } else {
                      tl.b(2);
                      break L2;
                    }
                  } else {
                    sk.a(true);
                    break L2;
                  }
                }
                return;
              }
            } else {
              break L1;
            }
          }
        }
        bd.a("MGS2: " + tr.b(0), (Throwable) null, 1);
        lr.b((byte) -116);
    }

    final void n(int param0) {
        int var3 = Kickabout.field_G;
        int var2 = 31 / ((param0 - 61) / 48);
        if (hh.b((byte) 97)) {
            int discarded$1 = this.a(false, true, null != e.field_m ? true : false);
        } else {
            if (10 > hl.field_d) {
            } else {
                if (!nq.i(-92)) {
                    fs.a((byte) -126);
                } else {
                    if (-1 != (vj.field_c ^ -1)) {
                        iu.a(59, id.field_v);
                    } else {
                        int discarded$2 = this.a(false, true, false);
                    }
                }
            }
        }
    }

    final void c(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_120_1 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_123_0 = 0;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_151_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_119_1 = 0;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        int stackOut_120_0 = 0;
        int stackOut_120_1 = 0;
        int stackOut_122_0 = 0;
        int stackOut_122_1 = 0;
        int stackOut_122_2 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        L0: {
          var5 = Kickabout.field_G;
          if (null == kl.field_h) {
            break L0;
          } else {
            L1: {
              if (null == e.field_m) {
                var6 = va.d((byte) -13);
                var4 = var6.getSize();
                kl.field_h.a(768, var4.width, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            kl.field_h.c(0);
            break L0;
          }
        }
        L2: {
          fo.g(param0);
          ew.a((byte) 58);
          if (uf.c(608)) {
            break L2;
          } else {
            if (11 != vj.field_c) {
              pe.a(127);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != ag.field_f) {
            id.field_v = ag.field_f.b((byte) -22);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!oh.b(-14954)) {
            break L4;
          } else {
            L5: {
              var3 = 1200 * nb.b((byte) 126);
              if (((ma) this).field_q) {
                break L5;
              } else {
                if (or.a(true) <= var3) {
                  break L4;
                } else {
                  if (var3 >= tl.a(-126)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ma) this).field_q = false;
            lr.b((byte) -116);
            ws.a((byte) -31);
            fc.a(uc.field_D, 2, -56);
            oe.c(30929);
            fc.field_d = true;
            ua.field_g = 15000L + nj.a(-48);
            break L4;
          }
        }
        L6: {
          L7: {
            if (es.field_h == -1) {
              break L7;
            } else {
              if (-1 == es.field_h) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (0 != es.field_h) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          var3 = stackIn_24_0;
          es.field_h = cp.a(522);
          if (var3 == 0) {
            if (es.field_h == -1) {
              break L6;
            } else {
              L9: {
                if (0 != es.field_h) {
                  break L9;
                } else {
                  if (es.field_h == -1) {
                    break L6;
                  } else {
                    if (0 == es.field_h) {
                      break L6;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              ua.field_g = nj.a(-65) + 15000L;
              break L6;
            }
          } else {
            if (es.field_h == -1) {
              break L6;
            } else {
              if (0 == es.field_h) {
                break L6;
              } else {
                ua.field_g = nj.a(-65) + 15000L;
                break L6;
              }
            }
          }
        }
        L10: {
          if (0 == es.field_h) {
            break L10;
          } else {
            if (es.field_h != 0) {
              if (10 > hl.field_d) {
                if (es.field_h != -4) {
                  if (es.field_h != 4) {
                    if (-3 != es.field_h) {
                      if (5 == es.field_h) {
                        ((ma) this).a((byte) -66, "outofdate");
                        break L10;
                      } else {
                        ((ma) this).a((byte) -123, "js5connect");
                        break L10;
                      }
                    } else {
                      ((ma) this).a((byte) -101, "js5connect_full");
                      break L10;
                    }
                  } else {
                    ((ma) this).a((byte) -124, "js5io");
                    break L10;
                  }
                } else {
                  ((ma) this).a((byte) 27, "js5crc");
                  break L10;
                }
              } else {
                if (10 > vj.field_c) {
                  break L10;
                } else {
                  L11: {
                    ws.a((byte) -13);
                    if (-4 != es.field_h) {
                      if (-5 != (es.field_h ^ -1)) {
                        if (2 != es.field_h) {
                          if (es.field_h == 5) {
                            fc.a(sr.field_m, 5, -94);
                            break L11;
                          } else {
                            fc.a(ih.field_b, 256, 69);
                            break L11;
                          }
                        } else {
                          fc.a(w.field_h, 256, param0 ^ 102);
                          break L11;
                        }
                      } else {
                        fc.a(st.field_o, 256, 79);
                        break L11;
                      }
                    } else {
                      fc.a(cj.field_F, 256, 96);
                      break L11;
                    }
                  }
                  fc.field_d = true;
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          L13: {
            if (0 == es.field_h) {
              break L13;
            } else {
              if (-1 != es.field_h) {
                if (nj.a(param0 ^ 34) >= ua.field_g) {
                  fc.field_d = false;
                  if (-1 != es.field_h) {
                    if (es.field_h != 0) {
                      es.field_h = -1;
                      np.b(23877);
                      if (0 != es.field_h) {
                        break L12;
                      } else {
                        if (hq.a((byte) 10)) {
                          break L12;
                        } else {
                          m.field_h = false;
                          break L12;
                        }
                      }
                    } else {
                      if (0 != es.field_h) {
                        break L12;
                      } else {
                        if (hq.a((byte) 10)) {
                          break L12;
                        } else {
                          m.field_h = false;
                          break L12;
                        }
                      }
                    }
                  } else {
                    if (0 != es.field_h) {
                      break L12;
                    } else {
                      if (hq.a((byte) 10)) {
                        break L12;
                      } else {
                        m.field_h = false;
                        break L12;
                      }
                    }
                  }
                } else {
                  L14: {
                    if (0 == es.field_h) {
                      break L14;
                    } else {
                      if (0 != es.field_h) {
                        break L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                  if (hq.a((byte) 10)) {
                    break L12;
                  } else {
                    m.field_h = false;
                    break L12;
                  }
                }
              } else {
                break L13;
              }
            }
          }
          if (hq.a((byte) 10)) {
            if (0 != es.field_h) {
              break L12;
            } else {
              if (hq.a((byte) 10)) {
                break L12;
              } else {
                m.field_h = false;
                break L12;
              }
            }
          } else {
            if (0 != es.field_h) {
              break L12;
            } else {
              if (hq.a((byte) 10)) {
                break L12;
              } else {
                m.field_h = false;
                break L12;
              }
            }
          }
        }
        L15: {
          if (hl.field_d == 0) {
            if (!wb.h(param0 + -96)) {
              break L15;
            } else {
              hl.field_d = 1;
              break L15;
            }
          } else {
            break L15;
          }
        }
        L16: {
          if ((hl.field_d ^ -1) == -2) {
            L17: {
              if (vv.field_r != 0) {
                qq.field_H = dh.a((byte) -128, ub.field_E);
                break L17;
              } else {
                break L17;
              }
            }
            bw.field_b = gu.a(false, ie.field_G, 1, true, 118);
            gs.field_c = gu.a(false, gr.field_y, 1, true, param0 ^ 125);
            up.field_k = gu.a(false, no.field_F, 1, true, param0 ^ 127);
            hl.field_d = 2;
            kh.field_g = bw.field_b;
            ht.field_b = gs.field_c;
            break L16;
          } else {
            break L16;
          }
        }
        L18: {
          if (hl.field_d == 2) {
            L19: {
              if (qq.field_H != null) {
                if (!qq.field_H.d(param0 ^ -43)) {
                  break L19;
                } else {
                  if (qq.field_H.a("", (byte) -81)) {
                    if (qq.field_H.a(false, "")) {
                      pt.a(true, qq.field_H);
                      qq.field_H = null;
                      dd.a((byte) 51);
                      break L19;
                    } else {
                      break L19;
                    }
                  } else {
                    qq.field_H = null;
                    break L19;
                  }
                }
              } else {
                break L19;
              }
            }
            if (qq.field_H == null) {
              hl.field_d = 3;
              break L18;
            } else {
              break L18;
            }
          } else {
            break L18;
          }
        }
        L20: {
          if ((hl.field_d ^ -1) == -4) {
            if (!so.a(bw.field_b, true, gs.field_c, up.field_k)) {
              break L20;
            } else {
              if (!ch.a(-2, up.field_k)) {
                break L20;
              } else {
                L21: {
                  L22: {
                    oi.a(115);
                    wm.c(param0 + 1);
                    ts.field_b = jw.field_yb;
                    aw.field_H = false;
                    da.a(up.field_k, fu.field_c, bw.field_b, gs.field_c, -120);
                    if (kk.field_m) {
                      break L22;
                    } else {
                      if (lf.field_c != null) {
                        break L22;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L23: {
                    stackOut_117_0 = -101;
                    stackIn_119_0 = stackOut_117_0;
                    stackIn_118_0 = stackOut_117_0;
                    if (kk.field_m) {
                      stackOut_119_0 = stackIn_119_0;
                      stackOut_119_1 = 0;
                      stackIn_120_0 = stackOut_119_0;
                      stackIn_120_1 = stackOut_119_1;
                      break L23;
                    } else {
                      stackOut_118_0 = stackIn_118_0;
                      stackOut_118_1 = 1;
                      stackIn_120_0 = stackOut_118_0;
                      stackIn_120_1 = stackOut_118_1;
                      break L23;
                    }
                  }
                  L24: {
                    stackOut_120_0 = stackIn_120_0;
                    stackOut_120_1 = stackIn_120_1;
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_122_1 = stackOut_120_1;
                    stackIn_121_0 = stackOut_120_0;
                    stackIn_121_1 = stackOut_120_1;
                    if (kk.field_m) {
                      stackOut_122_0 = stackIn_122_0;
                      stackOut_122_1 = stackIn_122_1;
                      stackOut_122_2 = 0;
                      stackIn_123_0 = stackOut_122_0;
                      stackIn_123_1 = stackOut_122_1;
                      stackIn_123_2 = stackOut_122_2;
                      break L24;
                    } else {
                      stackOut_121_0 = stackIn_121_0;
                      stackOut_121_1 = stackIn_121_1;
                      stackOut_121_2 = 1;
                      stackIn_123_0 = stackOut_121_0;
                      stackIn_123_1 = stackOut_121_1;
                      stackIn_123_2 = stackOut_121_2;
                      break L24;
                    }
                  }
                  kk.a((byte) stackIn_123_0, stackIn_123_1 != 0, stackIn_123_2 != 0, lf.field_c);
                  break L21;
                }
                L25: {
                  if (o.field_d) {
                    bh.a(true);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (null != qt.field_y) {
                    break L26;
                  } else {
                    qt.field_y = ia.a(55);
                    jo.field_D = us.a((byte) -88);
                    break L26;
                  }
                }
                nt.a(jo.field_D, up.field_k, param0 + 98, qt.field_y);
                bw.field_b = null;
                gs.field_c = null;
                up.field_k = null;
                lo.a((byte) -127, (java.applet.Applet) this);
                dd.a((byte) 120);
                hl.field_d = 10;
                break L20;
              }
            }
          } else {
            break L20;
          }
        }
        L27: {
          if (hl.field_d != 10) {
            break L27;
          } else {
            L28: {
              if (0 != vv.field_r) {
                fn.field_b = dh.a((byte) -125, wf.field_Q);
                break L28;
              } else {
                break L28;
              }
            }
            hl.field_d = 11;
            break L27;
          }
        }
        L29: {
          if (11 == hl.field_d) {
            L30: {
              if (null == fn.field_b) {
                break L30;
              } else {
                L31: {
                  if (!fn.field_b.d(-50)) {
                    break L31;
                  } else {
                    if (fn.field_b.a(false)) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                ju.a(0.0f, hn.a(ep.field_e, ks.field_g, param0 + -25, fn.field_b), (byte) 30);
                break L29;
              }
            }
            hl.field_d = 12;
            nd.field_c = true;
            break L29;
          } else {
            break L29;
          }
        }
        L32: {
          if (-13 != (hl.field_d ^ -1)) {
            break L32;
          } else {
            if (nd.field_c) {
              break L32;
            } else {
              hl.field_d = 13;
              break L32;
            }
          }
        }
        L33: {
          if ((hl.field_d ^ -1) != -14) {
            break L33;
          } else {
            L34: {
              var3 = 1;
              if (mp.field_h == null) {
                break L34;
              } else {
                L35: {
                  if (!mp.field_h.a(param0 + 1183118480)) {
                    stackOut_150_0 = 0;
                    stackIn_151_0 = stackOut_150_0;
                    break L35;
                  } else {
                    stackOut_149_0 = 1;
                    stackIn_151_0 = stackOut_149_0;
                    break L35;
                  }
                }
                var3 = stackIn_151_0;
                ju.a(mp.field_h.field_h, mp.field_h.field_a, (byte) 30);
                break L34;
              }
            }
            if (var3 != 0) {
              hl.field_d = 20;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L36: {
          if (param1) {
            break L36;
          } else {
            if (mf.field_Ib) {
              hm.a(-113, ic.field_d);
              ((ma) this).f((byte) -88);
              lp.a(ic.field_d, (byte) -64);
              break L36;
            } else {
              break L36;
            }
          }
        }
        L37: {
          if (hr.field_h[8]) {
            gw.b(5);
            break L37;
          } else {
            break L37;
          }
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 != 5) {
            ((ma) this).m(-23);
        }
        return this.a(true, true, param1);
    }

    final void g(int param0) {
        if (param0 != 13) {
            return;
        }
        hr.field_h[4] = true;
    }

    final static void a(int param0, byte param1, qb param2, boolean param3) {
        String var8_ref2 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        vu[] var8 = null;
        String var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        vu var17 = null;
        int var17_int = 0;
        int var18 = 0;
        Object var18_ref = null;
        String var18_ref_String = null;
        Object var19 = null;
        String var19_ref = null;
        String var20 = null;
        String var21 = null;
        int var22_int = 0;
        String var22 = null;
        String var22_ref = null;
        int var23 = 0;
        int var24 = 0;
        String var25 = null;
        int var26 = 0;
        int var27 = 0;
        vu var28 = null;
        vu var29 = null;
        vu[] var30 = null;
        String var31 = null;
        String var32 = null;
        String var33 = null;
        int stackIn_4_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_23_0 = 0;
        vu stackIn_35_0 = null;
        vu stackIn_36_0 = null;
        vu stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        vu stackIn_41_0 = null;
        vu stackIn_42_0 = null;
        vu stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_75_0 = 0;
        vu stackIn_89_0 = null;
        vu stackIn_90_0 = null;
        vu stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        vu stackIn_96_0 = null;
        boolean stackIn_96_1 = false;
        vu stackIn_97_0 = null;
        boolean stackIn_97_1 = false;
        vu stackIn_98_0 = null;
        boolean stackIn_98_1 = false;
        int stackIn_98_2 = 0;
        vu stackIn_100_0 = null;
        vu stackIn_101_0 = null;
        vu stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        vu stackIn_104_0 = null;
        vu stackIn_105_0 = null;
        vu stackIn_106_0 = null;
        vu stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_111_0 = 0;
        vu stackIn_124_0 = null;
        vu stackIn_125_0 = null;
        vu stackIn_126_0 = null;
        int stackIn_126_1 = 0;
        vu stackIn_129_0 = null;
        vu stackIn_130_0 = null;
        vu stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        vu stackIn_133_0 = null;
        vu stackIn_134_0 = null;
        vu stackIn_135_0 = null;
        int stackIn_135_1 = 0;
        vu stackIn_137_0 = null;
        vu stackIn_138_0 = null;
        vu stackIn_139_0 = null;
        int stackIn_139_1 = 0;
        String stackIn_152_0 = null;
        vu stackIn_155_0 = null;
        vu stackIn_156_0 = null;
        vu stackIn_157_0 = null;
        int stackIn_157_1 = 0;
        vu stackIn_158_0 = null;
        vu stackIn_159_0 = null;
        vu stackIn_160_0 = null;
        int stackIn_160_1 = 0;
        int stackIn_166_0 = 0;
        int stackIn_199_0 = 0;
        int stackIn_227_0 = 0;
        vu stackIn_326_0 = null;
        vu stackIn_327_0 = null;
        vu stackIn_328_0 = null;
        vu stackIn_329_0 = null;
        int stackIn_329_1 = 0;
        vu stackIn_334_0 = null;
        boolean stackIn_334_1 = false;
        vu stackIn_335_0 = null;
        boolean stackIn_335_1 = false;
        vu stackIn_336_0 = null;
        boolean stackIn_336_1 = false;
        int stackIn_336_2 = 0;
        vu stackIn_338_0 = null;
        vu stackIn_339_0 = null;
        vu stackIn_340_0 = null;
        int stackIn_340_1 = 0;
        vu stackIn_342_0 = null;
        vu stackIn_343_0 = null;
        vu stackIn_344_0 = null;
        vu stackIn_345_0 = null;
        int stackIn_345_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_54_0 = 0;
        vu stackOut_34_0 = null;
        vu stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        vu stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        vu stackOut_40_0 = null;
        vu stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        vu stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_70_0 = 0;
        vu stackOut_99_0 = null;
        vu stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        vu stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        vu stackOut_95_0 = null;
        boolean stackOut_95_1 = false;
        vu stackOut_97_0 = null;
        boolean stackOut_97_1 = false;
        int stackOut_97_2 = 0;
        vu stackOut_96_0 = null;
        boolean stackOut_96_1 = false;
        int stackOut_96_2 = 0;
        vu stackOut_88_0 = null;
        vu stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        vu stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        vu stackOut_103_0 = null;
        vu stackOut_104_0 = null;
        vu stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        vu stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_109_0 = 0;
        String stackOut_151_0 = null;
        Object stackOut_150_0 = null;
        vu stackOut_154_0 = null;
        vu stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        vu stackOut_155_0 = null;
        int stackOut_155_1 = 0;
        vu stackOut_157_0 = null;
        vu stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        vu stackOut_158_0 = null;
        int stackOut_158_1 = 0;
        int stackOut_165_0 = 0;
        int stackOut_164_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_195_0 = 0;
        int stackOut_193_0 = 0;
        int stackOut_191_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_220_0 = 0;
        int stackOut_218_0 = 0;
        int stackOut_216_0 = 0;
        vu stackOut_337_0 = null;
        vu stackOut_339_0 = null;
        int stackOut_339_1 = 0;
        vu stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        vu stackOut_333_0 = null;
        boolean stackOut_333_1 = false;
        vu stackOut_335_0 = null;
        boolean stackOut_335_1 = false;
        int stackOut_335_2 = 0;
        vu stackOut_334_0 = null;
        boolean stackOut_334_1 = false;
        int stackOut_334_2 = 0;
        vu stackOut_325_0 = null;
        vu stackOut_326_0 = null;
        vu stackOut_327_0 = null;
        int stackOut_327_1 = 0;
        vu stackOut_328_0 = null;
        int stackOut_328_1 = 0;
        vu stackOut_341_0 = null;
        vu stackOut_342_0 = null;
        vu stackOut_343_0 = null;
        int stackOut_343_1 = 0;
        vu stackOut_344_0 = null;
        int stackOut_344_1 = 0;
        vu stackOut_132_0 = null;
        vu stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        vu stackOut_133_0 = null;
        int stackOut_133_1 = 0;
        vu stackOut_128_0 = null;
        vu stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        vu stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        vu stackOut_123_0 = null;
        vu stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        vu stackOut_124_0 = null;
        int stackOut_124_1 = 0;
        vu stackOut_136_0 = null;
        vu stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        vu stackOut_137_0 = null;
        int stackOut_137_1 = 0;
        var8_ref2 = null;
        L0: {
          var26 = Kickabout.field_G;
          if (!param3) {
            L1: {
              if (np.a(99)) {
                if (!param2.field_Cb) {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L1;
                } else {
                  stackOut_8_0 = 0;
                  stackIn_11_0 = stackOut_8_0;
                  break L1;
                }
              } else {
                stackOut_6_0 = 0;
                stackIn_11_0 = stackOut_6_0;
                break L1;
              }
            }
            var4 = stackIn_11_0;
            break L0;
          } else {
            L2: {
              if (hw.field_k) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L2;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L2;
              }
            }
            var4 = stackIn_4_0;
            break L0;
          }
        }
        L3: {
          L4: {
            L5: {
              var5 = 0;
              if (!param3) {
                var6 = 0;
                L6: while (true) {
                  if (5 <= var6) {
                    L7: {
                      if (rf.field_c[0][2].field_Q) {
                        if (!np.a(77)) {
                          sn.field_e = vo.a((byte) -18, gr.field_v, new String[1]);
                          break L7;
                        } else {
                          sn.field_e = ib.field_B;
                          break L7;
                        }
                      } else {
                        break L7;
                      }
                    }
                    L8: {
                      if (param1 < -48) {
                        break L8;
                      } else {
                        field_t = null;
                        break L8;
                      }
                    }
                    if (2 <= rn.field_d.length) {
                      L9: {
                        if (param3) {
                          if (pn.field_t != -1) {
                            stackOut_57_0 = 1;
                            stackIn_59_0 = stackOut_57_0;
                            break L9;
                          } else {
                            stackOut_56_0 = 0;
                            stackIn_59_0 = stackOut_56_0;
                            break L9;
                          }
                        } else {
                          stackOut_54_0 = 0;
                          stackIn_59_0 = stackOut_54_0;
                          break L9;
                        }
                      }
                      var6 = stackIn_59_0;
                      if (var6 == 0) {
                        break L4;
                      } else {
                        var7 = pn.field_t;
                        var8_int = 0;
                        L10: while (true) {
                          if (var8_int >= er.field_h.length) {
                            break L5;
                          } else {
                            er.field_h[var8_int] = (byte) 0;
                            var8_int++;
                            continue L10;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    L11: {
                      if (var4 == 0) {
                        break L11;
                      } else {
                        if (rf.field_c[0][var6 - -1].field_sb == 0) {
                          break L11;
                        } else {
                          if (param2.field_Wb != var6) {
                            var5 = 1;
                            param2.field_Wb = var6;
                            break L11;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    L12: {
                      stackOut_34_0 = rf.field_c[0][var6 - -1];
                      stackIn_36_0 = stackOut_34_0;
                      stackIn_35_0 = stackOut_34_0;
                      if (var4 == 0) {
                        stackOut_36_0 = (vu) (Object) stackIn_36_0;
                        stackOut_36_1 = 0;
                        stackIn_37_0 = stackOut_36_0;
                        stackIn_37_1 = stackOut_36_1;
                        break L12;
                      } else {
                        stackOut_35_0 = (vu) (Object) stackIn_35_0;
                        stackOut_35_1 = 1;
                        stackIn_37_0 = stackOut_35_0;
                        stackIn_37_1 = stackOut_35_1;
                        break L12;
                      }
                    }
                    L13: {
                      stackIn_37_0.field_lb = stackIn_37_1 != 0;
                      if (ui.field_t) {
                        break L13;
                      } else {
                        if (3 != var6) {
                          break L13;
                        } else {
                          rf.field_c[0][1 + var6].field_lb = false;
                          break L13;
                        }
                      }
                    }
                    L14: {
                      stackOut_40_0 = rf.field_c[0][1 + var6];
                      stackIn_42_0 = stackOut_40_0;
                      stackIn_41_0 = stackOut_40_0;
                      if (param2.field_Wb != var6) {
                        stackOut_42_0 = (vu) (Object) stackIn_42_0;
                        stackOut_42_1 = 0;
                        stackIn_43_0 = stackOut_42_0;
                        stackIn_43_1 = stackOut_42_1;
                        break L14;
                      } else {
                        stackOut_41_0 = (vu) (Object) stackIn_41_0;
                        stackOut_41_1 = 1;
                        stackIn_43_0 = stackOut_41_0;
                        stackIn_43_1 = stackOut_41_1;
                        break L14;
                      }
                    }
                    stackIn_43_0.field_I = stackIn_43_1 != 0;
                    var6++;
                    continue L6;
                  }
                }
              } else {
                L15: {
                  if (param1 < -48) {
                    break L15;
                  } else {
                    field_t = null;
                    break L15;
                  }
                }
                if (2 <= rn.field_d.length) {
                  L16: {
                    if (param3) {
                      if (pn.field_t != -1) {
                        stackOut_21_0 = 1;
                        stackIn_23_0 = stackOut_21_0;
                        break L16;
                      } else {
                        stackOut_20_0 = 0;
                        stackIn_23_0 = stackOut_20_0;
                        break L16;
                      }
                    } else {
                      stackOut_18_0 = 0;
                      stackIn_23_0 = stackOut_18_0;
                      break L16;
                    }
                  }
                  var6 = stackIn_23_0;
                  if (var6 == 0) {
                    break L4;
                  } else {
                    var7 = pn.field_t;
                    var8_int = 0;
                    L17: while (true) {
                      if (var8_int >= er.field_h.length) {
                        break L5;
                      } else {
                        er.field_h[var8_int] = (byte) 0;
                        var8_int++;
                        continue L17;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
            }
            er.field_h[var7 / 8] = (byte)hf.a((int) er.field_h[var7 / 8], 1 << var7 % 8);
            break L4;
          }
          L18: {
            if (param3) {
              stackOut_66_0 = -1;
              stackIn_67_0 = stackOut_66_0;
              break L18;
            } else {
              stackOut_65_0 = 0;
              stackIn_67_0 = stackOut_65_0;
              break L18;
            }
          }
          var7 = stackIn_67_0;
          L19: while (true) {
            if (var7 >= rn.field_d.length) {
              break L3;
            } else {
              L20: {
                if (var6 != 0) {
                  if (pn.field_t != var7) {
                    stackOut_73_0 = 1;
                    stackIn_75_0 = stackOut_73_0;
                    break L20;
                  } else {
                    stackOut_72_0 = 0;
                    stackIn_75_0 = stackOut_72_0;
                    break L20;
                  }
                } else {
                  stackOut_70_0 = 0;
                  stackIn_75_0 = stackOut_70_0;
                  break L20;
                }
              }
              L21: {
                var8_int = stackIn_75_0;
                if (var4 == 0) {
                  break L21;
                } else {
                  if (-1 == (rf.field_c[1][var7 + 1].field_sb ^ -1)) {
                    break L21;
                  } else {
                    if (param3) {
                      if (var6 != 0) {
                        break L21;
                      } else {
                        if (-1 == var7) {
                          var9 = 0;
                          L22: while (true) {
                            if (var9 >= er.field_h.length) {
                              break L21;
                            } else {
                              er.field_h[var9] = (byte) 0;
                              var9++;
                              continue L22;
                            }
                          }
                        } else {
                          er.field_h[var7 / 8] = (byte)ek.b((int) er.field_h[var7 / 8], 1 << qj.b(7, var7));
                          break L21;
                        }
                      }
                    } else {
                      var9 = rn.field_d[var7];
                      if (var9 != param2.field_bc) {
                        param2.field_bc = var9;
                        var5 = 1;
                        break L21;
                      } else {
                        break L21;
                      }
                    }
                  }
                }
              }
              L23: {
                if (param3) {
                  if ((var7 ^ -1) != 0) {
                    L24: {
                      stackOut_99_0 = rf.field_c[1][var7 - -1];
                      stackIn_101_0 = stackOut_99_0;
                      stackIn_100_0 = stackOut_99_0;
                      if ((er.field_h[var7 / 8] & 1 << (var7 & 7)) == 0) {
                        stackOut_101_0 = (vu) (Object) stackIn_101_0;
                        stackOut_101_1 = 0;
                        stackIn_102_0 = stackOut_101_0;
                        stackIn_102_1 = stackOut_101_1;
                        break L24;
                      } else {
                        stackOut_100_0 = (vu) (Object) stackIn_100_0;
                        stackOut_100_1 = 1;
                        stackIn_102_0 = stackOut_100_0;
                        stackIn_102_1 = stackOut_100_1;
                        break L24;
                      }
                    }
                    stackIn_102_0.field_I = stackIn_102_1 != 0;
                    break L23;
                  } else {
                    rf.field_c[1][var7 - -1].field_I = true;
                    var9 = 0;
                    L25: while (true) {
                      if (rn.field_d.length <= var9) {
                        break L23;
                      } else {
                        L26: {
                          stackOut_95_0 = rf.field_c[1][1 + var7];
                          stackOut_95_1 = rf.field_c[1][1 + var7].field_I;
                          stackIn_97_0 = stackOut_95_0;
                          stackIn_97_1 = stackOut_95_1;
                          stackIn_96_0 = stackOut_95_0;
                          stackIn_96_1 = stackOut_95_1;
                          if ((er.field_h[var9 / 8] & 1 << (7 & var9)) != 0) {
                            stackOut_97_0 = (vu) (Object) stackIn_97_0;
                            stackOut_97_1 = stackIn_97_1;
                            stackOut_97_2 = 0;
                            stackIn_98_0 = stackOut_97_0;
                            stackIn_98_1 = stackOut_97_1;
                            stackIn_98_2 = stackOut_97_2;
                            break L26;
                          } else {
                            stackOut_96_0 = (vu) (Object) stackIn_96_0;
                            stackOut_96_1 = stackIn_96_1;
                            stackOut_96_2 = 1;
                            stackIn_98_0 = stackOut_96_0;
                            stackIn_98_1 = stackOut_96_1;
                            stackIn_98_2 = stackOut_96_2;
                            break L26;
                          }
                        }
                        stackIn_98_0.field_I = stackIn_98_1 & stackIn_98_2 != 0;
                        var9++;
                        continue L25;
                      }
                    }
                  }
                } else {
                  L27: {
                    var9 = rn.field_d[var7];
                    stackOut_88_0 = rf.field_c[1][1 + var7];
                    stackIn_90_0 = stackOut_88_0;
                    stackIn_89_0 = stackOut_88_0;
                    if (param2.field_bc != var9) {
                      stackOut_90_0 = (vu) (Object) stackIn_90_0;
                      stackOut_90_1 = 0;
                      stackIn_91_0 = stackOut_90_0;
                      stackIn_91_1 = stackOut_90_1;
                      break L27;
                    } else {
                      stackOut_89_0 = (vu) (Object) stackIn_89_0;
                      stackOut_89_1 = 1;
                      stackIn_91_0 = stackOut_89_0;
                      stackIn_91_1 = stackOut_89_1;
                      break L27;
                    }
                  }
                  stackIn_91_0.field_I = stackIn_91_1 != 0;
                  break L23;
                }
              }
              L28: {
                L29: {
                  stackOut_103_0 = rf.field_c[1][var7 + 1];
                  stackIn_106_0 = stackOut_103_0;
                  stackIn_104_0 = stackOut_103_0;
                  if (var4 == 0) {
                    break L29;
                  } else {
                    stackOut_104_0 = (vu) (Object) stackIn_104_0;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_105_0 = stackOut_104_0;
                    if (var8_int != 0) {
                      break L29;
                    } else {
                      stackOut_105_0 = (vu) (Object) stackIn_105_0;
                      stackOut_105_1 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      break L28;
                    }
                  }
                }
                stackOut_106_0 = (vu) (Object) stackIn_106_0;
                stackOut_106_1 = 0;
                stackIn_107_0 = stackOut_106_0;
                stackIn_107_1 = stackOut_106_1;
                break L28;
              }
              stackIn_107_0.field_lb = stackIn_107_1 != 0;
              var7++;
              continue L19;
            }
          }
        }
        L30: {
          if (param3) {
            stackOut_110_0 = 0;
            stackIn_111_0 = stackOut_110_0;
            break L30;
          } else {
            stackOut_109_0 = 1;
            stackIn_111_0 = stackOut_109_0;
            break L30;
          }
        }
        var6 = stackIn_111_0;
        L31: while (true) {
          if (var6 >= 3) {
            L32: {
              if (!param3) {
                break L32;
              } else {
                if (1 >= ku.field_f) {
                  break L32;
                } else {
                  var6 = 0;
                  L33: while (true) {
                    if (ku.field_f - -1 <= var6) {
                      break L32;
                    } else {
                      L34: {
                        var29 = rf.field_c[3][var6];
                        if (var4 == 0) {
                          break L34;
                        } else {
                          if (-1 == (var29.field_sb ^ -1)) {
                            break L34;
                          } else {
                            lk.field_l = var6;
                            break L34;
                          }
                        }
                      }
                      L35: {
                        if (!var29.field_Q) {
                          break L35;
                        } else {
                          if ((var6 ^ -1) >= -1) {
                            break L35;
                          } else {
                            L36: {
                              if (null != oi.field_f) {
                                stackOut_151_0 = oi.field_f[-1 + var6];
                                stackIn_152_0 = stackOut_151_0;
                                break L36;
                              } else {
                                stackOut_150_0 = null;
                                stackIn_152_0 = (String) (Object) stackOut_150_0;
                                break L36;
                              }
                            }
                            var8_ref2 = stackIn_152_0;
                            if (var8_ref2 == null) {
                              break L35;
                            } else {
                              sn.field_e = var8_ref2;
                              break L35;
                            }
                          }
                        }
                      }
                      L37: {
                        stackOut_154_0 = (vu) var29;
                        stackIn_156_0 = stackOut_154_0;
                        stackIn_155_0 = stackOut_154_0;
                        if (var6 != lk.field_l) {
                          stackOut_156_0 = (vu) (Object) stackIn_156_0;
                          stackOut_156_1 = 0;
                          stackIn_157_0 = stackOut_156_0;
                          stackIn_157_1 = stackOut_156_1;
                          break L37;
                        } else {
                          stackOut_155_0 = (vu) (Object) stackIn_155_0;
                          stackOut_155_1 = 1;
                          stackIn_157_0 = stackOut_155_0;
                          stackIn_157_1 = stackOut_155_1;
                          break L37;
                        }
                      }
                      L38: {
                        stackIn_157_0.field_I = stackIn_157_1 != 0;
                        stackOut_157_0 = (vu) var29;
                        stackIn_159_0 = stackOut_157_0;
                        stackIn_158_0 = stackOut_157_0;
                        if (var4 == 0) {
                          stackOut_159_0 = (vu) (Object) stackIn_159_0;
                          stackOut_159_1 = 0;
                          stackIn_160_0 = stackOut_159_0;
                          stackIn_160_1 = stackOut_159_1;
                          break L38;
                        } else {
                          stackOut_158_0 = (vu) (Object) stackIn_158_0;
                          stackOut_158_1 = 1;
                          stackIn_160_0 = stackOut_158_0;
                          stackIn_160_1 = stackOut_158_1;
                          break L38;
                        }
                      }
                      stackIn_160_0.field_lb = stackIn_160_1 != 0;
                      var6++;
                      continue L33;
                    }
                  }
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L39: while (true) {
              if (ss.field_j <= var7) {
                L40: {
                  if (var5 == 0) {
                    break L40;
                  } else {
                    if (!param3) {
                      lu.a(6773, param0);
                      break L40;
                    } else {
                      break L40;
                    }
                  }
                }
                return;
              } else {
                L41: {
                  var30 = rf.field_c[var7 + 4];
                  var8 = var30;
                  if (!param3) {
                    stackOut_165_0 = 0;
                    stackIn_166_0 = stackOut_165_0;
                    break L41;
                  } else {
                    stackOut_164_0 = -1;
                    stackIn_166_0 = stackOut_164_0;
                    break L41;
                  }
                }
                var9 = stackIn_166_0;
                L42: while (true) {
                  if (-1 + var30.length <= var9) {
                    var6 = var6 + (255 & rp.field_x[var7]);
                    var7++;
                    continue L39;
                  } else {
                    L43: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4 == 0) {
                        break L43;
                      } else {
                        if (var9 < 0) {
                          break L43;
                        } else {
                          L44: {
                            if (hm.field_D == null) {
                              break L44;
                            } else {
                              if (null != hm.field_D[var7]) {
                                if (((sb.field_a ^ -1) & hm.field_D[var7][var9] ^ -1) >= -1) {
                                  break L44;
                                } else {
                                  var14 = 1;
                                  var15 = ps.a((byte) -126, hm.field_D[var7][var9] & (sb.field_a ^ -1));
                                  break L44;
                                }
                              } else {
                                break L44;
                              }
                            }
                          }
                          L45: {
                            if (null == ds.field_h) {
                              break L45;
                            } else {
                              if (null == ds.field_h[var7]) {
                                break L45;
                              } else {
                                if (0 < eq.field_d) {
                                  break L45;
                                } else {
                                  if (!ds.field_h[var7][var9]) {
                                    break L45;
                                  } else {
                                    var10 = 1;
                                    break L45;
                                  }
                                }
                              }
                            }
                          }
                          L46: {
                            if (lh.field_E == null) {
                              break L46;
                            } else {
                              if (null == lh.field_E[var7]) {
                                break L46;
                              } else {
                                L47: {
                                  var16 = lh.field_E[var7][var9];
                                  if (var16 == 0) {
                                    break L47;
                                  } else {
                                    if (fv.field_d) {
                                      break L47;
                                    } else {
                                      if (eq.field_d <= 0) {
                                        var10 = 1;
                                        break L47;
                                      } else {
                                        break L47;
                                      }
                                    }
                                  }
                                }
                                if ((var16 ^ -1) >= -1) {
                                  break L46;
                                } else {
                                  if (var16 <= mi.field_d) {
                                    break L46;
                                  } else {
                                    var12 = 1;
                                    break L46;
                                  }
                                }
                              }
                            }
                          }
                          L48: {
                            if (param3) {
                              if (qd.field_e != null) {
                                if (null != qd.field_e[var7]) {
                                  if (!qd.field_e[var7][var9]) {
                                    stackOut_198_0 = 0;
                                    stackIn_199_0 = stackOut_198_0;
                                    break L48;
                                  } else {
                                    stackOut_197_0 = 1;
                                    stackIn_199_0 = stackOut_197_0;
                                    break L48;
                                  }
                                } else {
                                  stackOut_195_0 = 0;
                                  stackIn_199_0 = stackOut_195_0;
                                  break L48;
                                }
                              } else {
                                stackOut_193_0 = 0;
                                stackIn_199_0 = stackOut_193_0;
                                break L48;
                              }
                            } else {
                              stackOut_191_0 = 0;
                              stackIn_199_0 = stackOut_191_0;
                              break L48;
                            }
                          }
                          var13 = stackIn_199_0;
                          if (null == so.field_f) {
                            break L43;
                          } else {
                            if (null != so.field_f[var7]) {
                              L49: {
                                var16 = so.field_f[var7][var9];
                                if (0 == var16) {
                                  break L49;
                                } else {
                                  if (fv.field_d) {
                                    break L49;
                                  } else {
                                    if (0 >= eq.field_d) {
                                      var10 = 1;
                                      break L49;
                                    } else {
                                      break L49;
                                    }
                                  }
                                }
                              }
                              if (-1 <= var16) {
                                break L43;
                              } else {
                                if (da.field_o < var16) {
                                  var11 = 1;
                                  break L43;
                                } else {
                                  break L43;
                                }
                              }
                            } else {
                              break L43;
                            }
                          }
                        }
                      }
                    }
                    L50: {
                      if (-3 > tk.field_Ib) {
                        break L50;
                      } else {
                        if (ne.field_G[12]) {
                          var13 = 0;
                          var10 = 0;
                          var11 = 0;
                          var14 = 0;
                          var12 = 0;
                          break L50;
                        } else {
                          break L50;
                        }
                      }
                    }
                    L51: {
                      if (var10 == 0) {
                        if (var11 == 0) {
                          if (var12 == 0) {
                            if (var13 == 0) {
                              if (var14 != 0) {
                                stackOut_225_0 = 1;
                                stackIn_227_0 = stackOut_225_0;
                                break L51;
                              } else {
                                stackOut_224_0 = 0;
                                stackIn_227_0 = stackOut_224_0;
                                break L51;
                              }
                            } else {
                              stackOut_222_0 = 1;
                              stackIn_227_0 = stackOut_222_0;
                              break L51;
                            }
                          } else {
                            stackOut_220_0 = 1;
                            stackIn_227_0 = stackOut_220_0;
                            break L51;
                          }
                        } else {
                          stackOut_218_0 = 1;
                          stackIn_227_0 = stackOut_218_0;
                          break L51;
                        }
                      } else {
                        stackOut_216_0 = 1;
                        stackIn_227_0 = stackOut_216_0;
                        break L51;
                      }
                    }
                    L52: {
                      var16 = stackIn_227_0;
                      tt.field_c = true;
                      if (var16 != 0) {
                        break L52;
                      } else {
                        if ((var9 ^ -1) > -1) {
                          break L52;
                        } else {
                          if (la.field_k == null) {
                            break L52;
                          } else {
                            L53: {
                              if (!param3) {
                                break L53;
                              } else {
                                if (hw.field_k) {
                                  break L52;
                                } else {
                                  break L53;
                                }
                              }
                            }
                            L54: {
                              if (null == hm.field_G) {
                                m.field_f = new boolean[ss.field_j];
                                hm.field_G = new byte[ss.field_j];
                                break L54;
                              } else {
                                break L54;
                              }
                            }
                            tt.field_c = false;
                            ee.field_e = false;
                            var17_int = 0;
                            L55: while (true) {
                              if (var7 <= var17_int) {
                                L56: {
                                  pl.a(0, var7, param2, -1, (byte) -125, var9, -1, param3);
                                  if (tk.field_Ib < 2) {
                                    break L56;
                                  } else {
                                    if (ne.field_G[12]) {
                                      tt.field_c = true;
                                      break L56;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                                if (tt.field_c) {
                                  break L52;
                                } else {
                                  var16 = 1;
                                  break L52;
                                }
                              } else {
                                m.field_f[var17_int] = false;
                                var17_int++;
                                continue L55;
                              }
                            }
                          }
                        }
                      }
                    }
                    L57: {
                      var17 = var8[1 + var9];
                      if (var4 == 0) {
                        break L57;
                      } else {
                        if (var17.field_sb == 0) {
                          break L57;
                        } else {
                          if (param3) {
                            if (-1 == var9) {
                              var18 = var6;
                              L58: while (true) {
                                if (var6 - (-var30.length - -1) <= var18) {
                                  break L57;
                                } else {
                                  rf.field_d[var18 / 8] = (byte)qj.b((int) rf.field_d[var18 / 8], 1 << qj.b(var18, 7) ^ -1);
                                  var18++;
                                  continue L58;
                                }
                              }
                            } else {
                              rf.field_d[(var9 + var6) / 8] = (byte)ek.b((int) rf.field_d[(var9 + var6) / 8], 1 << qj.b(var6 + var9, 7));
                              break L57;
                            }
                          } else {
                            if (var16 != 0) {
                              break L57;
                            } else {
                              if (param2.field_Eb[var7] == (byte)var9) {
                                break L57;
                              } else {
                                var5 = 1;
                                param2.field_Eb[var7] = (byte)var9;
                                break L57;
                              }
                            }
                          }
                        }
                      }
                    }
                    L59: {
                      if (!param3) {
                        break L59;
                      } else {
                        if (var16 != 0) {
                          rf.field_d[(var6 + var9) / 8] = (byte)qj.b((int) rf.field_d[(var6 + var9) / 8], 1 << qj.b(7, var9 + var6));
                          break L59;
                        } else {
                          break L59;
                        }
                      }
                    }
                    L60: {
                      if (-1 > var9) {
                        break L60;
                      } else {
                        if (var17.field_Q) {
                          L61: {
                            if (null == oj.field_Q) {
                              var18_ref = null;
                              break L61;
                            } else {
                              if (oj.field_Q[var7] != null) {
                                var18_ref_String = oj.field_Q[var7][var9];
                                break L61;
                              } else {
                                var18_ref_String = null;
                                break L61;
                              }
                            }
                          }
                          L62: {
                            if (ca.field_g != null) {
                              if (ca.field_g[var7] != null) {
                                var19_ref = ca.field_g[var7][var9];
                                break L62;
                              } else {
                                var19_ref = null;
                                break L62;
                              }
                            } else {
                              var19_ref = null;
                              break L62;
                            }
                          }
                          L63: {
                            var20 = null;
                            if (var19_ref == null) {
                              break L63;
                            } else {
                              if (!var19_ref.equals(var18_ref)) {
                                var20 = var19_ref;
                                break L63;
                              } else {
                                break L63;
                              }
                            }
                          }
                          L64: {
                            var21 = null;
                            if (var13 == 0) {
                              if (var10 == 0) {
                                L65: {
                                  if (var11 != 0) {
                                    var22_int = -da.field_o + so.field_f[var7][var9];
                                    if ((var22_int ^ -1) != -2) {
                                      var21 = vo.a((byte) -18, wq.field_c, new String[1]);
                                      break L65;
                                    } else {
                                      var21 = ss.field_d;
                                      break L65;
                                    }
                                  } else {
                                    break L65;
                                  }
                                }
                                L66: {
                                  if (var12 != 0) {
                                    var31 = vo.a((byte) -18, aq.field_h, new String[2]);
                                    var21 = var31;
                                    var21 = var31;
                                    if (var21 != null) {
                                      var21 = var21 + "<br>" + var31;
                                      break L66;
                                    } else {
                                      var21 = var31;
                                      break L66;
                                    }
                                  } else {
                                    break L66;
                                  }
                                }
                                if (var14 != 0) {
                                  L67: {
                                    var22 = wv.field_bb;
                                    if ((var15 ^ -1) >= -1) {
                                      break L67;
                                    } else {
                                      if (um.field_a == null) {
                                        break L67;
                                      } else {
                                        if (um.field_a.length < var15) {
                                          break L67;
                                        } else {
                                          if (um.field_a[-1 + var15] != null) {
                                            var22_ref = um.field_a[var15 + -1][0];
                                            break L67;
                                          } else {
                                            break L67;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = var22_ref;
                                    break L64;
                                  } else {
                                    var21 = var21 + "<br>" + var22_ref;
                                    break L64;
                                  }
                                } else {
                                  break L64;
                                }
                              } else {
                                var21 = oe.field_n;
                                break L64;
                              }
                            } else {
                              var21 = w.field_c;
                              break L64;
                            }
                          }
                          L68: {
                            if (var4 == 0) {
                              break L68;
                            } else {
                              if (!tt.field_c) {
                                L69: {
                                  var22_ref = null;
                                  if (!ee.field_e) {
                                    break L69;
                                  } else {
                                    var22 = "</col>" + qk.field_H + "<col=A00000>";
                                    var25 = var22;
                                    var22 = var25;
                                    var25 = var22;
                                    var22 = var25;
                                    var21 = var22;
                                    break L69;
                                  }
                                }
                                var23 = 0;
                                var24 = 0;
                                L70: while (true) {
                                  if (var7 <= var24) {
                                    if (var23 != 0) {
                                      var21 = nr.field_m + var22;
                                      break L68;
                                    } else {
                                      var21 = vo.a((byte) -18, gk.field_d, new String[1]);
                                      break L68;
                                    }
                                  } else {
                                    if (m.field_f[var24]) {
                                      var25 = "</col>" + ok.field_b[var24] + "<col=A00000>";
                                      var22 = var25;
                                      var21 = var22;
                                      var22 = var25;
                                      if (var22 == null) {
                                        var22 = var25;
                                        var21 = var22;
                                        var21 = var22;
                                        var24++;
                                        continue L70;
                                      } else {
                                        var23 = 1;
                                        var22 = var22 + ", " + var25;
                                        var24++;
                                        continue L70;
                                      }
                                    } else {
                                      var24++;
                                      continue L70;
                                    }
                                  }
                                }
                              } else {
                                break L68;
                              }
                            }
                          }
                          L71: {
                            if (var21 != null) {
                              var32 = "<col=A00000>" + var21;
                              var33 = wj.a("<br>", "<br><col=A00000>", true, var32);
                              if (var20 != null) {
                                var20 = var20 + "<br>" + var33;
                                break L71;
                              } else {
                                var20 = var33;
                                break L71;
                              }
                            } else {
                              break L71;
                            }
                          }
                          if (var20 == null) {
                            break L60;
                          } else {
                            sn.field_e = var20;
                            break L60;
                          }
                        } else {
                          break L60;
                        }
                      }
                    }
                    L72: {
                      if (param3) {
                        if ((var9 ^ -1) != 0) {
                          L73: {
                            stackOut_337_0 = (vu) var17;
                            stackIn_339_0 = stackOut_337_0;
                            stackIn_338_0 = stackOut_337_0;
                            if (-1 == (rf.field_d[(var6 - -var9) / 8] & 1 << (var6 + var9 & 7) ^ -1)) {
                              stackOut_339_0 = (vu) (Object) stackIn_339_0;
                              stackOut_339_1 = 0;
                              stackIn_340_0 = stackOut_339_0;
                              stackIn_340_1 = stackOut_339_1;
                              break L73;
                            } else {
                              stackOut_338_0 = (vu) (Object) stackIn_338_0;
                              stackOut_338_1 = 1;
                              stackIn_340_0 = stackOut_338_0;
                              stackIn_340_1 = stackOut_338_1;
                              break L73;
                            }
                          }
                          stackIn_340_0.field_I = stackIn_340_1 != 0;
                          break L72;
                        } else {
                          var17.field_I = true;
                          var27 = var6;
                          var18 = var27;
                          L74: while (true) {
                            if (var27 >= var6 - -var30.length + -1) {
                              break L72;
                            } else {
                              L75: {
                                stackOut_333_0 = (vu) var17;
                                stackOut_333_1 = var17.field_I;
                                stackIn_335_0 = stackOut_333_0;
                                stackIn_335_1 = stackOut_333_1;
                                stackIn_334_0 = stackOut_333_0;
                                stackIn_334_1 = stackOut_333_1;
                                if (0 != (rf.field_d[var27 / 8] & 1 << (var27 & 7))) {
                                  stackOut_335_0 = (vu) (Object) stackIn_335_0;
                                  stackOut_335_1 = stackIn_335_1;
                                  stackOut_335_2 = 0;
                                  stackIn_336_0 = stackOut_335_0;
                                  stackIn_336_1 = stackOut_335_1;
                                  stackIn_336_2 = stackOut_335_2;
                                  break L75;
                                } else {
                                  stackOut_334_0 = (vu) (Object) stackIn_334_0;
                                  stackOut_334_1 = stackIn_334_1;
                                  stackOut_334_2 = 1;
                                  stackIn_336_0 = stackOut_334_0;
                                  stackIn_336_1 = stackOut_334_1;
                                  stackIn_336_2 = stackOut_334_2;
                                  break L75;
                                }
                              }
                              stackIn_336_0.field_I = stackIn_336_1 & stackIn_336_2 != 0;
                              var27++;
                              continue L74;
                            }
                          }
                        }
                      } else {
                        L76: {
                          L77: {
                            stackOut_325_0 = (vu) var17;
                            stackIn_328_0 = stackOut_325_0;
                            stackIn_326_0 = stackOut_325_0;
                            if (!tt.field_c) {
                              break L77;
                            } else {
                              stackOut_326_0 = (vu) (Object) stackIn_326_0;
                              stackIn_328_0 = stackOut_326_0;
                              stackIn_327_0 = stackOut_326_0;
                              if ((byte)var9 != param2.field_Eb[var7]) {
                                break L77;
                              } else {
                                stackOut_327_0 = (vu) (Object) stackIn_327_0;
                                stackOut_327_1 = 1;
                                stackIn_329_0 = stackOut_327_0;
                                stackIn_329_1 = stackOut_327_1;
                                break L76;
                              }
                            }
                          }
                          stackOut_328_0 = (vu) (Object) stackIn_328_0;
                          stackOut_328_1 = 0;
                          stackIn_329_0 = stackOut_328_0;
                          stackIn_329_1 = stackOut_328_1;
                          break L76;
                        }
                        stackIn_329_0.field_I = stackIn_329_1 != 0;
                        break L72;
                      }
                    }
                    L78: {
                      L79: {
                        stackOut_341_0 = (vu) var17;
                        stackIn_344_0 = stackOut_341_0;
                        stackIn_342_0 = stackOut_341_0;
                        if (var4 == 0) {
                          break L79;
                        } else {
                          stackOut_342_0 = (vu) (Object) stackIn_342_0;
                          stackIn_344_0 = stackOut_342_0;
                          stackIn_343_0 = stackOut_342_0;
                          if (var16 != 0) {
                            break L79;
                          } else {
                            stackOut_343_0 = (vu) (Object) stackIn_343_0;
                            stackOut_343_1 = 1;
                            stackIn_345_0 = stackOut_343_0;
                            stackIn_345_1 = stackOut_343_1;
                            break L78;
                          }
                        }
                      }
                      stackOut_344_0 = (vu) (Object) stackIn_344_0;
                      stackOut_344_1 = 0;
                      stackIn_345_0 = stackOut_344_0;
                      stackIn_345_1 = stackOut_344_1;
                      break L78;
                    }
                    stackIn_345_0.field_lb = stackIn_345_1 != 0;
                    var9++;
                    continue L42;
                  }
                }
              }
            }
          } else {
            L80: {
              var28 = rf.field_c[2][var6];
              if (var4 == 0) {
                break L80;
              } else {
                if (0 == var28.field_sb) {
                  break L80;
                } else {
                  if (param3) {
                    if (var6 == 0) {
                      ru.field_C = 0;
                      break L80;
                    } else {
                      ru.field_C = ru.field_C ^ var6;
                      break L80;
                    }
                  } else {
                    if (param2.field_Mb != var6) {
                      var5 = 1;
                      param2.field_Mb = var6;
                      break L80;
                    } else {
                      break L80;
                    }
                  }
                }
              }
            }
            L81: {
              if (param3) {
                if (var6 == 0) {
                  L82: {
                    stackOut_132_0 = (vu) var28;
                    stackIn_134_0 = stackOut_132_0;
                    stackIn_133_0 = stackOut_132_0;
                    if (0 != ru.field_C) {
                      stackOut_134_0 = (vu) (Object) stackIn_134_0;
                      stackOut_134_1 = 0;
                      stackIn_135_0 = stackOut_134_0;
                      stackIn_135_1 = stackOut_134_1;
                      break L82;
                    } else {
                      stackOut_133_0 = (vu) (Object) stackIn_133_0;
                      stackOut_133_1 = 1;
                      stackIn_135_0 = stackOut_133_0;
                      stackIn_135_1 = stackOut_133_1;
                      break L82;
                    }
                  }
                  stackIn_135_0.field_I = stackIn_135_1 != 0;
                  break L81;
                } else {
                  L83: {
                    stackOut_128_0 = (vu) var28;
                    stackIn_130_0 = stackOut_128_0;
                    stackIn_129_0 = stackOut_128_0;
                    if ((ru.field_C & var6) == 0) {
                      stackOut_130_0 = (vu) (Object) stackIn_130_0;
                      stackOut_130_1 = 0;
                      stackIn_131_0 = stackOut_130_0;
                      stackIn_131_1 = stackOut_130_1;
                      break L83;
                    } else {
                      stackOut_129_0 = (vu) (Object) stackIn_129_0;
                      stackOut_129_1 = 1;
                      stackIn_131_0 = stackOut_129_0;
                      stackIn_131_1 = stackOut_129_1;
                      break L83;
                    }
                  }
                  stackIn_131_0.field_I = stackIn_131_1 != 0;
                  break L81;
                }
              } else {
                L84: {
                  stackOut_123_0 = (vu) var28;
                  stackIn_125_0 = stackOut_123_0;
                  stackIn_124_0 = stackOut_123_0;
                  if ((param2.field_Mb & var6) == 0) {
                    stackOut_125_0 = (vu) (Object) stackIn_125_0;
                    stackOut_125_1 = 0;
                    stackIn_126_0 = stackOut_125_0;
                    stackIn_126_1 = stackOut_125_1;
                    break L84;
                  } else {
                    stackOut_124_0 = (vu) (Object) stackIn_124_0;
                    stackOut_124_1 = 1;
                    stackIn_126_0 = stackOut_124_0;
                    stackIn_126_1 = stackOut_124_1;
                    break L84;
                  }
                }
                stackIn_126_0.field_I = stackIn_126_1 != 0;
                break L81;
              }
            }
            L85: {
              stackOut_136_0 = (vu) var28;
              stackIn_138_0 = stackOut_136_0;
              stackIn_137_0 = stackOut_136_0;
              if (var4 == 0) {
                stackOut_138_0 = (vu) (Object) stackIn_138_0;
                stackOut_138_1 = 0;
                stackIn_139_0 = stackOut_138_0;
                stackIn_139_1 = stackOut_138_1;
                break L85;
              } else {
                stackOut_137_0 = (vu) (Object) stackIn_137_0;
                stackOut_137_1 = 1;
                stackIn_139_0 = stackOut_137_0;
                stackIn_139_1 = stackOut_137_1;
                break L85;
              }
            }
            stackIn_139_0.field_lb = stackIn_139_1 != 0;
            var6++;
            continue L31;
          }
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            iw var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Kickabout.field_G;
                        var4 = ou.b(id.field_v, -1951459327, vv.field_r, param2);
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        throw new IllegalStateException();
                    }
                    case 3: {
                        if (1 == var4) {
                            statePc = 5;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var5_int = bo.a(s.j(61), (byte) -98, va.f(-1));
                        if (-1 == var5_int) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        no.a(mr.field_X, var5_int, gd.field_b, -1);
                        gd.field_b = null;
                        mr.field_X = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = v.d(83);
                        if (var11 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        ia.a(var11.booleanValue(), -23249);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (-3 != (var4 ^ -1)) {
                            statePc = 13;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var5_int = mu.a(12, qq.g((byte) -17), ls.g(-26370), ev.h(10326), he.a(320), la.b(820907312), ((ma) this).field_r);
                        if (var5_int != 0) {
                            statePc = 12;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        vs.a(gd.field_b, mr.field_X, (byte) 122, var5_int);
                        mr.field_X = null;
                        gd.field_b = null;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (-4 != var4) {
                            statePc = 24;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (es.field_h == -1) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (-1 != (es.field_h ^ -1)) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        es.field_h = -1;
                        np.b(23877);
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (param0) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var5_int = js.a(0, ls.g(-26370), ((ma) this).field_o, false, ev.h(10326), ((ma) this).field_r);
                        if (0 == (var5_int ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (var5_int != 0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        tn.field_a = wq.field_d;
                        bd.e(-1);
                        vj.field_c = 10;
                        nb.field_f = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 22: {
                        fc.a(gd.field_b, var5_int, 125);
                        gd.field_b = null;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        fc.field_d = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if ((var4 ^ -1) != -5) {
                            statePc = 28;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (fu.field_c) {
                            statePc = 27;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        vj.field_c = 10;
                        nb.field_f = true;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 27: {
                        hi.a(so.a(108), param1);
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        if (5 == var4) {
                            statePc = 30;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        js.a(20338, so.a(-111));
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (var4 != 6) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        if (!aw.field_H) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        vj.field_c = 10;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (var4 != 7) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        vr.a(so.a(35), 23607);
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (param1) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        ((ma) this).field_u = -76;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (var4 != 8) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        hi.a(so.a(124), param1);
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (var4 == 9) {
                            statePc = 42;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        ap.a(so.a(-93), 0);
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (10 != var4) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        or.field_d.b(17, (byte) -87);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (var4 != 11) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        bq.a((byte) 125, so.a(51));
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (-13 != (var4 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        im.a(so.a(-85), 114, aq.c(71));
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if (13 != var4) {
                            statePc = 59;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        try {
                            if (null != rk.field_d) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            rk.field_d = new u(oo.field_c, new java.net.URL(((ma) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!rk.field_d.a((byte) 58)) {
                                statePc = 59;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var12 = rk.field_d.b(0);
                            if (var12 == null) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var7 = hf.a((byte) -122, var12.field_n, 0, var12.field_f);
                            ue.a(var7, (byte) -49);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var9 = null;
                            ue.a((String) null, (byte) -118);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            rk.field_d = null;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 58;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        var5 = (Exception) (Object) caughtException;
                        bd.a("S1", (Throwable) (Object) var5, 1);
                        var10 = null;
                        ue.a((String) null, (byte) 119);
                        rk.field_d = null;
                        statePc = 59;
                        continue stateLoop;
                    }
                    case 59: {
                        if (15 != var4) {
                            statePc = 61;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    }
                    case 60: {
                        vj.field_c = 10;
                        statePc = 61;
                        continue stateLoop;
                    }
                    case 61: {
                        if (-17 != (var4 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    }
                    case 62: {
                        return 1;
                    }
                    case 63: {
                        if ((var4 ^ -1) == -18) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        return 0;
                    }
                    case 65: {
                        return 2;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(String param0, int param1, int param2, int param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        try {
          if (((ma) this).d((byte) 118)) {
            L0: {
              L1: {
                ((ma) this).field_z = ((ma) this).getCodeBase().getHost();
                var6_ref = ((ma) this).field_z.toLowerCase();
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L0;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L0;
            }
            L2: {
              ((ma) this).field_o = stackIn_7_1 != 0;
              ((ma) this).field_s = Integer.parseInt(((ma) this).getParameter("gameport1"));
              ((ma) this).field_u = Integer.parseInt(((ma) this).getParameter("gameport2"));
              var7 = ((ma) this).getParameter("servernum");
              if (var7 != null) {
                ((ma) this).field_x = Integer.parseInt(var7);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((ma) this).field_B = Integer.parseInt(((ma) this).getParameter("gamecrc"));
              ((ma) this).field_v = Long.parseLong(((ma) this).getParameter("instanceid"));
              ((ma) this).field_A = ((ma) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((ma) this).getParameter("lang");
              if (var8 != null) {
                ((ma) this).field_p = Integer.parseInt(var8);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param4 < -78) {
                break L4;
              } else {
                ((ma) this).i(38);
                break L4;
              }
            }
            L5: {
              if (-6 >= (((ma) this).field_p ^ -1)) {
                ((ma) this).field_p = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var9 = ((ma) this).getParameter("affid");
              if (var9 != null) {
                ((ma) this).field_r = Integer.parseInt(var9);
                break L6;
              } else {
                break L6;
              }
            }
            o.field_d = Boolean.valueOf(((ma) this).getParameter("simplemode")).booleanValue();
            ((ma) this).a(param1, param3, ((ma) this).field_B, (byte) -126, param2, param0, 32);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        bd.a((String) null, (Throwable) (Object) var6, 1);
        ((ma) this).a((byte) 87, "crash");
    }

    final static void k(int param0) {
        if (!(!kd.field_s)) {
            on.g(on.field_b, on.field_e, on.field_c + -on.field_b, on.field_h + -on.field_e);
            qa.field_E.a(46, false);
        }
        if (param0 != 1) {
            Object var2 = null;
            String discarded$0 = ma.a((byte) -6, (CharSequence) null, true);
        }
    }

    ma() {
    }

    private final void j(byte param0) {
        int var2 = un.field_e.h((byte) -122);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = ms.field_b + -1;
        byte[] var5 = new byte[var4];
        un.field_e.a((byte) -30, 0, var5, var4);
        bv.a(0, kt.a(var5, true), var3 != 0, so.a(55));
        int var6 = 115 % ((-74 - param0) / 48);
    }

    private final int l(byte param0) {
        int var2 = 0;
        if (((ma) this).field_e) {
          return -1;
        } else {
          if (!hq.a((byte) 10)) {
            return -1;
          } else {
            if (!fc.field_d) {
              var2 = js.a(0, ls.g(-26370), ((ma) this).field_o, true, ev.h(10326), ((ma) this).field_r);
              if ((var2 ^ -1) != 0) {
                L0: {
                  if (0 == var2) {
                    break L0;
                  } else {
                    if ((var2 ^ -1) != -2) {
                      L1: {
                        if (!kr.field_e) {
                          ((ma) this).a((byte) 61, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      L2: {
                        ws.a((byte) -74);
                        fc.a(gd.field_b, var2, 71);
                        fc.field_d = true;
                        ua.field_g = nj.a(121) + 15000L;
                        if (param0 >= 114) {
                          break L2;
                        } else {
                          field_t = null;
                          break L2;
                        }
                      }
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L3: {
                  if (vj.field_c != 11) {
                    break L3;
                  } else {
                    if (es.field_h != 0) {
                      break L3;
                    } else {
                      bd.e(-1);
                      break L3;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            } else {
              return -1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Secret achievement";
    }
}
