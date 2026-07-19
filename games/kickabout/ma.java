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
            return (hd) null;
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
        int var2 = 0;
        if (param0 <= -53) {
          L0: {
            L1: {
              var2 = this.l((byte) 121);
              if (var2 == 0) {
                break L1;
              } else {
                if (1 != var2) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!hr.field_h[1]) {
                break L2;
              } else {
                da.a(0, 2);
                break L2;
              }
            }
            L3: {
              if (hr.field_h[2]) {
                hm.a(115, 3);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!hr.field_h[3]) {
                break L4;
              } else {
                kp.a(4, -56);
                break L4;
              }
            }
            L5: {
              if (!hr.field_h[4]) {
                break L5;
              } else {
                hg.a(5, (byte) -122);
                break L5;
              }
            }
            L6: {
              if (hr.field_h[5]) {
                dq.a(-1, 6);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (hr.field_h[6]) {
                mf.a(7, (byte) -128);
                break L7;
              } else {
                break L7;
              }
            }
            if (!hr.field_h[8]) {
              break L0;
            } else {
              sj.b(-1);
              break L0;
            }
          }
          return var2;
        } else {
          return 89;
        }
    }

    final void l(int param0) {
        if (param0 != -1) {
            String var3 = (String) null;
            this.a((String) null, 31, 32, -108, 43);
        }
        hr.field_h[2] = true;
    }

    final void a(String param0, int param1, byte param2) {
        try {
            if (param2 != -60) {
                this.field_A = true;
            }
            this.a(param0, param1, 480, 640, -93);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) ((Object) runtimeException), "ma.WA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void e(int param0) {
        hr.field_h[param0] = true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6, boolean param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        vv.field_r = this.field_p;
        vg.b(vv.field_r, 31900);
        uv.a(127, this.field_x, this.field_A, this.field_s, this.field_B, param7, param1, 5000, oo.field_c, vv.field_r, this.field_v, this.field_u, 5000, this.field_z);
        js.a(this.field_z, param1, oo.field_c, vv.field_r, this.field_u, this.field_x, this.field_B, this.field_s, false);
        ml.o(255);
        ag.field_f = aw.g((byte) 3);
        lp.a(ic.field_d, (byte) -64);
        no.field_F = param4;
        gr.field_y = param3;
        if (param5 >= -3) {
            field_t = (pk) null;
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
            field_y = (String) null;
        }
        field_w = null;
    }

    final static void b(boolean param0) {
        String var2 = null;
        if (h.field_f != null) {
            var2 = h.field_f;
            String var1 = var2;
            n.a(126, vo.a((byte) -18, qo.field_j, new String[]{var2}));
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
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_6_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_12_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param0 < -108) {
                break L1;
              } else {
                field_w = (String) null;
                break L1;
              }
            }
            var3 = iv.a(0, param2, param1);
            if (var3 != null) {
              stackOut_5_0 = (String) (var3);
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = 0;
              L2: while (true) {
                if (var4 < param1.length()) {
                  if (!jw.a(param1.charAt(var4), 160)) {
                    stackOut_12_0 = pl.field_c;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3_ref);
            stackOut_16_1 = new StringBuilder().append("ma.NA(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_13_0;
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
              if (var2 == 0) {
                return;
              } else {
                L2: {
                  if (-2 != (var2 ^ -1)) {
                    if (var2 != 2) {
                      if (3 == var2) {
                        gf.a((byte) 53);
                        break L2;
                      } else {
                        if (-5 == (var2 ^ -1)) {
                          sm.a((byte) 103);
                          break L2;
                        } else {
                          if (var2 != 5) {
                            if (-7 == (var2 ^ -1)) {
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
                                  qv.a(un.field_e, ms.field_b, -1, oo.field_c);
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
        int discarded$1 = 0;
        int discarded$2 = 0;
        int var3 = Kickabout.field_G;
        int var2 = 31 / ((param0 - 61) / 48);
        if (hh.b((byte) 97)) {
            discarded$1 = this.a(false, true, null != e.field_m ? true : false);
        } else {
            if (10 > hl.field_d) {
            } else {
                if (!nq.i(-92)) {
                    fs.a((byte) -126);
                } else {
                    if (-1 != (vj.field_c ^ -1)) {
                        iu.a(59, id.field_v);
                    } else {
                        discarded$2 = this.a(false, true, false);
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
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        int stackIn_134_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
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
              if (this.field_q) {
                break L5;
              } else {
                if ((or.a(true) ^ -1) >= (var3 ^ -1)) {
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
            this.field_q = false;
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
              if (-1 == (es.field_h ^ -1)) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (0 != (es.field_h ^ -1)) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_24_0;
            es.field_h = cp.a(522);
            if (var3 == 0) {
              break L9;
            } else {
              if ((es.field_h ^ -1) == -1) {
                if (11 != vj.field_c) {
                  break L9;
                } else {
                  if (!hq.a((byte) 10)) {
                    bd.e(-1);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
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
        L10: {
          if (0 == (es.field_h ^ -1)) {
            break L10;
          } else {
            if (es.field_h != 0) {
              if (10 > hl.field_d) {
                if ((es.field_h ^ -1) != -4) {
                  if (es.field_h != 4) {
                    if (-3 != (es.field_h ^ -1)) {
                      if (5 == es.field_h) {
                        this.a((byte) -66, "outofdate");
                        break L10;
                      } else {
                        this.a((byte) -123, "js5connect");
                        break L10;
                      }
                    } else {
                      this.a((byte) -101, "js5connect_full");
                      break L10;
                    }
                  } else {
                    this.a((byte) -124, "js5io");
                    break L10;
                  }
                } else {
                  this.a((byte) 27, "js5crc");
                  break L10;
                }
              } else {
                if (10 > vj.field_c) {
                  break L10;
                } else {
                  L11: {
                    ws.a((byte) -13);
                    if (-4 != (es.field_h ^ -1)) {
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
            L14: {
              if (0 == (es.field_h ^ -1)) {
                break L14;
              } else {
                if (-1 != (es.field_h ^ -1)) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!hq.a((byte) 10)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (nj.a(param0 ^ 34) < ua.field_g) {
            break L12;
          } else {
            fc.field_d = false;
            if (-1 == es.field_h) {
              break L12;
            } else {
              if (es.field_h == 0) {
                break L12;
              } else {
                es.field_h = -1;
                np.b(23877);
                break L12;
              }
            }
          }
        }
        L15: {
          if (0 != es.field_h) {
            break L15;
          } else {
            if (hq.a((byte) 10)) {
              break L15;
            } else {
              m.field_h = false;
              break L15;
            }
          }
        }
        L16: {
          if ((hl.field_d ^ -1) == -1) {
            if (!wb.h(param0 + -96)) {
              break L16;
            } else {
              hl.field_d = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if ((hl.field_d ^ -1) == -2) {
            L18: {
              if ((vv.field_r ^ -1) != -1) {
                qq.field_H = dh.a((byte) -128, ub.field_E);
                break L18;
              } else {
                break L18;
              }
            }
            bw.field_b = gu.a(false, ie.field_G, 1, true, 118);
            gs.field_c = gu.a(false, gr.field_y, 1, true, param0 ^ 125);
            up.field_k = gu.a(false, no.field_F, 1, true, param0 ^ 127);
            hl.field_d = 2;
            kh.field_g = bw.field_b;
            ht.field_b = gs.field_c;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (hl.field_d == 2) {
            L20: {
              if (qq.field_H != null) {
                if (!qq.field_H.d(param0 ^ -43)) {
                  break L20;
                } else {
                  if (qq.field_H.a("", (byte) -81)) {
                    if (qq.field_H.a(false, "")) {
                      pt.a(true, qq.field_H);
                      qq.field_H = null;
                      dd.a((byte) 51);
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    qq.field_H = null;
                    break L20;
                  }
                }
              } else {
                break L20;
              }
            }
            if (qq.field_H == null) {
              hl.field_d = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if ((hl.field_d ^ -1) == -4) {
            if (!so.a(bw.field_b, true, gs.field_c, up.field_k)) {
              break L21;
            } else {
              if (!ch.a(-2, up.field_k)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    oi.a(115);
                    wm.c(param0 + 1);
                    ts.field_b = jw.field_yb;
                    aw.field_H = false;
                    da.a(up.field_k, fu.field_c, bw.field_b, gs.field_c, -120);
                    if (kk.field_m) {
                      break L23;
                    } else {
                      if (lf.field_c != null) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    stackOut_100_0 = -101;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_101_0 = stackOut_100_0;
                    if (kk.field_m) {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      break L24;
                    } else {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_103_0 = stackIn_103_0;
                    stackOut_103_1 = stackIn_103_1;
                    stackIn_105_0 = stackOut_103_0;
                    stackIn_105_1 = stackOut_103_1;
                    stackIn_104_0 = stackOut_103_0;
                    stackIn_104_1 = stackOut_103_1;
                    if (kk.field_m) {
                      stackOut_105_0 = stackIn_105_0;
                      stackOut_105_1 = stackIn_105_1;
                      stackOut_105_2 = 0;
                      stackIn_106_0 = stackOut_105_0;
                      stackIn_106_1 = stackOut_105_1;
                      stackIn_106_2 = stackOut_105_2;
                      break L25;
                    } else {
                      stackOut_104_0 = stackIn_104_0;
                      stackOut_104_1 = stackIn_104_1;
                      stackOut_104_2 = 1;
                      stackIn_106_0 = stackOut_104_0;
                      stackIn_106_1 = stackOut_104_1;
                      stackIn_106_2 = stackOut_104_2;
                      break L25;
                    }
                  }
                  kk.a((byte) stackIn_106_0, stackIn_106_1 != 0, stackIn_106_2 != 0, lf.field_c);
                  break L22;
                }
                L26: {
                  if (o.field_d) {
                    bh.a(true);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != qt.field_y) {
                    break L27;
                  } else {
                    qt.field_y = ia.a(55);
                    jo.field_D = us.a((byte) -88);
                    break L27;
                  }
                }
                nt.a(jo.field_D, up.field_k, param0 + 98, qt.field_y);
                bw.field_b = null;
                gs.field_c = null;
                up.field_k = null;
                lo.a((byte) -127, (java.applet.Applet) (this));
                dd.a((byte) 120);
                hl.field_d = 10;
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (hl.field_d != 10) {
            break L28;
          } else {
            L29: {
              if (0 != vv.field_r) {
                fn.field_b = dh.a((byte) -125, wf.field_Q);
                break L29;
              } else {
                break L29;
              }
            }
            hl.field_d = 11;
            break L28;
          }
        }
        L30: {
          if (11 == hl.field_d) {
            L31: {
              if (null == fn.field_b) {
                break L31;
              } else {
                L32: {
                  if (!fn.field_b.d(-50)) {
                    break L32;
                  } else {
                    if (fn.field_b.a(false)) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                ju.a(0.0f, hn.a(ep.field_e, ks.field_g, param0 + -25, fn.field_b), (byte) 30);
                break L30;
              }
            }
            hl.field_d = 12;
            nd.field_c = true;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (-13 != (hl.field_d ^ -1)) {
            break L33;
          } else {
            if (nd.field_c) {
              break L33;
            } else {
              hl.field_d = 13;
              break L33;
            }
          }
        }
        L34: {
          if ((hl.field_d ^ -1) != -14) {
            break L34;
          } else {
            L35: {
              var3 = 1;
              if (mp.field_h == null) {
                break L35;
              } else {
                L36: {
                  if (!mp.field_h.a(param0 + 1183118480)) {
                    stackOut_133_0 = 0;
                    stackIn_134_0 = stackOut_133_0;
                    break L36;
                  } else {
                    stackOut_132_0 = 1;
                    stackIn_134_0 = stackOut_132_0;
                    break L36;
                  }
                }
                var3 = stackIn_134_0;
                ju.a(mp.field_h.field_h, mp.field_h.field_a, (byte) 30);
                break L35;
              }
            }
            if (var3 != 0) {
              hl.field_d = 20;
              break L34;
            } else {
              break L34;
            }
          }
        }
        L37: {
          if (param1) {
            break L37;
          } else {
            if (mf.field_Ib) {
              hm.a(-113, ic.field_d);
              this.f((byte) -88);
              lp.a(ic.field_d, (byte) -64);
              break L37;
            } else {
              break L37;
            }
          }
        }
        L38: {
          if (hr.field_h[8]) {
            gw.b(5);
            break L38;
          } else {
            break L38;
          }
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 != 5) {
            this.m(-23);
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
        RuntimeException var4 = null;
        int var4_int = 0;
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
        Object var19 = null;
        String var19_ref = null;
        Object var20 = null;
        Object var21 = null;
        int var22_int = 0;
        Object var22 = null;
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
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_24_0 = 0;
        vu stackIn_36_0 = null;
        vu stackIn_37_0 = null;
        vu stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        vu stackIn_42_0 = null;
        vu stackIn_43_0 = null;
        vu stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_60_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_76_0 = 0;
        vu stackIn_90_0 = null;
        vu stackIn_91_0 = null;
        vu stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        vu stackIn_97_0 = null;
        boolean stackIn_97_1 = false;
        vu stackIn_98_0 = null;
        boolean stackIn_98_1 = false;
        vu stackIn_99_0 = null;
        boolean stackIn_99_1 = false;
        int stackIn_99_2 = 0;
        vu stackIn_101_0 = null;
        vu stackIn_102_0 = null;
        vu stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        vu stackIn_105_0 = null;
        vu stackIn_106_0 = null;
        vu stackIn_107_0 = null;
        vu stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_112_0 = 0;
        vu stackIn_125_0 = null;
        vu stackIn_126_0 = null;
        vu stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        vu stackIn_130_0 = null;
        vu stackIn_131_0 = null;
        vu stackIn_132_0 = null;
        int stackIn_132_1 = 0;
        vu stackIn_134_0 = null;
        vu stackIn_135_0 = null;
        vu stackIn_136_0 = null;
        int stackIn_136_1 = 0;
        vu stackIn_138_0 = null;
        vu stackIn_139_0 = null;
        vu stackIn_140_0 = null;
        int stackIn_140_1 = 0;
        String stackIn_153_0 = null;
        vu stackIn_156_0 = null;
        vu stackIn_157_0 = null;
        vu stackIn_158_0 = null;
        int stackIn_158_1 = 0;
        vu stackIn_159_0 = null;
        vu stackIn_160_0 = null;
        vu stackIn_161_0 = null;
        int stackIn_161_1 = 0;
        int stackIn_167_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_225_0 = 0;
        vu stackIn_325_0 = null;
        vu stackIn_326_0 = null;
        vu stackIn_327_0 = null;
        vu stackIn_328_0 = null;
        int stackIn_328_1 = 0;
        vu stackIn_333_0 = null;
        boolean stackIn_333_1 = false;
        vu stackIn_334_0 = null;
        boolean stackIn_334_1 = false;
        vu stackIn_335_0 = null;
        boolean stackIn_335_1 = false;
        int stackIn_335_2 = 0;
        vu stackIn_337_0 = null;
        vu stackIn_338_0 = null;
        vu stackIn_339_0 = null;
        int stackIn_339_1 = 0;
        vu stackIn_341_0 = null;
        vu stackIn_342_0 = null;
        vu stackIn_343_0 = null;
        vu stackIn_344_0 = null;
        int stackIn_344_1 = 0;
        RuntimeException stackIn_352_0 = null;
        StringBuilder stackIn_352_1 = null;
        RuntimeException stackIn_353_0 = null;
        StringBuilder stackIn_353_1 = null;
        RuntimeException stackIn_354_0 = null;
        StringBuilder stackIn_354_1 = null;
        String stackIn_354_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_57_0 = 0;
        int stackOut_55_0 = 0;
        vu stackOut_35_0 = null;
        vu stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        vu stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        vu stackOut_41_0 = null;
        vu stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        vu stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        vu stackOut_100_0 = null;
        vu stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        vu stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        vu stackOut_96_0 = null;
        boolean stackOut_96_1 = false;
        vu stackOut_98_0 = null;
        boolean stackOut_98_1 = false;
        int stackOut_98_2 = 0;
        vu stackOut_97_0 = null;
        boolean stackOut_97_1 = false;
        int stackOut_97_2 = 0;
        vu stackOut_89_0 = null;
        vu stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        vu stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        vu stackOut_104_0 = null;
        vu stackOut_105_0 = null;
        vu stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        vu stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        String stackOut_152_0 = null;
        Object stackOut_151_0 = null;
        vu stackOut_155_0 = null;
        vu stackOut_157_0 = null;
        int stackOut_157_1 = 0;
        vu stackOut_156_0 = null;
        int stackOut_156_1 = 0;
        vu stackOut_158_0 = null;
        vu stackOut_160_0 = null;
        int stackOut_160_1 = 0;
        vu stackOut_159_0 = null;
        int stackOut_159_1 = 0;
        int stackOut_166_0 = 0;
        int stackOut_165_0 = 0;
        int stackOut_199_0 = 0;
        int stackOut_198_0 = 0;
        int stackOut_196_0 = 0;
        int stackOut_194_0 = 0;
        int stackOut_192_0 = 0;
        int stackOut_224_0 = 0;
        int stackOut_223_0 = 0;
        vu stackOut_336_0 = null;
        vu stackOut_338_0 = null;
        int stackOut_338_1 = 0;
        vu stackOut_337_0 = null;
        int stackOut_337_1 = 0;
        vu stackOut_332_0 = null;
        boolean stackOut_332_1 = false;
        vu stackOut_334_0 = null;
        boolean stackOut_334_1 = false;
        int stackOut_334_2 = 0;
        vu stackOut_333_0 = null;
        boolean stackOut_333_1 = false;
        int stackOut_333_2 = 0;
        vu stackOut_324_0 = null;
        vu stackOut_325_0 = null;
        vu stackOut_326_0 = null;
        int stackOut_326_1 = 0;
        vu stackOut_327_0 = null;
        int stackOut_327_1 = 0;
        vu stackOut_340_0 = null;
        vu stackOut_341_0 = null;
        vu stackOut_342_0 = null;
        int stackOut_342_1 = 0;
        vu stackOut_343_0 = null;
        int stackOut_343_1 = 0;
        vu stackOut_133_0 = null;
        vu stackOut_135_0 = null;
        int stackOut_135_1 = 0;
        vu stackOut_134_0 = null;
        int stackOut_134_1 = 0;
        vu stackOut_129_0 = null;
        vu stackOut_131_0 = null;
        int stackOut_131_1 = 0;
        vu stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        vu stackOut_124_0 = null;
        vu stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        vu stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        vu stackOut_137_0 = null;
        vu stackOut_139_0 = null;
        int stackOut_139_1 = 0;
        vu stackOut_138_0 = null;
        int stackOut_138_1 = 0;
        RuntimeException stackOut_351_0 = null;
        StringBuilder stackOut_351_1 = null;
        RuntimeException stackOut_353_0 = null;
        StringBuilder stackOut_353_1 = null;
        String stackOut_353_2 = null;
        RuntimeException stackOut_352_0 = null;
        StringBuilder stackOut_352_1 = null;
        String stackOut_352_2 = null;
        var26 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (!param3) {
                L2: {
                  if (np.a(99)) {
                    if (!param2.field_Cb) {
                      stackOut_10_0 = 1;
                      stackIn_12_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_12_0 = stackOut_9_0;
                      break L2;
                    }
                  } else {
                    stackOut_7_0 = 0;
                    stackIn_12_0 = stackOut_7_0;
                    break L2;
                  }
                }
                var4_int = stackIn_12_0;
                break L1;
              } else {
                L3: {
                  if (hw.field_k) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L3;
                  } else {
                    stackOut_3_0 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    break L3;
                  }
                }
                var4_int = stackIn_5_0;
                break L1;
              }
            }
            L4: {
              L5: {
                L6: {
                  var5 = 0;
                  if (!param3) {
                    var6 = 0;
                    L7: while (true) {
                      if (5 <= var6) {
                        L8: {
                          if (rf.field_c[0][2].field_Q) {
                            if (!np.a(77)) {
                              sn.field_e = vo.a((byte) -18, gr.field_v, new String[]{uv.field_i.field_ec});
                              break L8;
                            } else {
                              sn.field_e = ib.field_B;
                              break L8;
                            }
                          } else {
                            break L8;
                          }
                        }
                        L9: {
                          if (param1 < -48) {
                            break L9;
                          } else {
                            field_t = (pk) null;
                            break L9;
                          }
                        }
                        if (2 <= rn.field_d.length) {
                          L10: {
                            if (param3) {
                              if (pn.field_t != -1) {
                                stackOut_58_0 = 1;
                                stackIn_60_0 = stackOut_58_0;
                                break L10;
                              } else {
                                stackOut_57_0 = 0;
                                stackIn_60_0 = stackOut_57_0;
                                break L10;
                              }
                            } else {
                              stackOut_55_0 = 0;
                              stackIn_60_0 = stackOut_55_0;
                              break L10;
                            }
                          }
                          var6 = stackIn_60_0;
                          if (var6 == 0) {
                            break L5;
                          } else {
                            var7 = pn.field_t;
                            var8_int = 0;
                            L11: while (true) {
                              if (var8_int >= er.field_h.length) {
                                break L6;
                              } else {
                                er.field_h[var8_int] = (byte) 0;
                                var8_int++;
                                continue L11;
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        L12: {
                          if (var4_int == 0) {
                            break L12;
                          } else {
                            if (rf.field_c[0][var6 - -1].field_sb == 0) {
                              break L12;
                            } else {
                              if (param2.field_Wb != var6) {
                                var5 = 1;
                                param2.field_Wb = var6;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        L13: {
                          stackOut_35_0 = rf.field_c[0][var6 - -1];
                          stackIn_37_0 = stackOut_35_0;
                          stackIn_36_0 = stackOut_35_0;
                          if (var4_int == 0) {
                            stackOut_37_0 = (vu) ((Object) stackIn_37_0);
                            stackOut_37_1 = 0;
                            stackIn_38_0 = stackOut_37_0;
                            stackIn_38_1 = stackOut_37_1;
                            break L13;
                          } else {
                            stackOut_36_0 = (vu) ((Object) stackIn_36_0);
                            stackOut_36_1 = 1;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            break L13;
                          }
                        }
                        L14: {
                          stackIn_38_0.field_lb = stackIn_38_1 != 0;
                          if (ui.field_t) {
                            break L14;
                          } else {
                            if (3 != var6) {
                              break L14;
                            } else {
                              rf.field_c[0][1 + var6].field_lb = false;
                              break L14;
                            }
                          }
                        }
                        L15: {
                          stackOut_41_0 = rf.field_c[0][1 + var6];
                          stackIn_43_0 = stackOut_41_0;
                          stackIn_42_0 = stackOut_41_0;
                          if (param2.field_Wb != var6) {
                            stackOut_43_0 = (vu) ((Object) stackIn_43_0);
                            stackOut_43_1 = 0;
                            stackIn_44_0 = stackOut_43_0;
                            stackIn_44_1 = stackOut_43_1;
                            break L15;
                          } else {
                            stackOut_42_0 = (vu) ((Object) stackIn_42_0);
                            stackOut_42_1 = 1;
                            stackIn_44_0 = stackOut_42_0;
                            stackIn_44_1 = stackOut_42_1;
                            break L15;
                          }
                        }
                        stackIn_44_0.field_I = stackIn_44_1 != 0;
                        var6++;
                        continue L7;
                      }
                    }
                  } else {
                    L16: {
                      if (param1 < -48) {
                        break L16;
                      } else {
                        field_t = (pk) null;
                        break L16;
                      }
                    }
                    if (2 <= rn.field_d.length) {
                      L17: {
                        if (param3) {
                          if (pn.field_t != -1) {
                            stackOut_22_0 = 1;
                            stackIn_24_0 = stackOut_22_0;
                            break L17;
                          } else {
                            stackOut_21_0 = 0;
                            stackIn_24_0 = stackOut_21_0;
                            break L17;
                          }
                        } else {
                          stackOut_19_0 = 0;
                          stackIn_24_0 = stackOut_19_0;
                          break L17;
                        }
                      }
                      var6 = stackIn_24_0;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        var7 = pn.field_t;
                        var8_int = 0;
                        L18: while (true) {
                          if (var8_int >= er.field_h.length) {
                            break L6;
                          } else {
                            er.field_h[var8_int] = (byte) 0;
                            var8_int++;
                            continue L18;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                er.field_h[var7 / 8] = (byte)hf.a((int) er.field_h[var7 / 8], 1 << var7 % 8);
                break L5;
              }
              L19: {
                if (param3) {
                  stackOut_67_0 = -1;
                  stackIn_68_0 = stackOut_67_0;
                  break L19;
                } else {
                  stackOut_66_0 = 0;
                  stackIn_68_0 = stackOut_66_0;
                  break L19;
                }
              }
              var7 = stackIn_68_0;
              L20: while (true) {
                if (var7 >= rn.field_d.length) {
                  break L4;
                } else {
                  L21: {
                    if (var6 != 0) {
                      if (pn.field_t != var7) {
                        stackOut_74_0 = 1;
                        stackIn_76_0 = stackOut_74_0;
                        break L21;
                      } else {
                        stackOut_73_0 = 0;
                        stackIn_76_0 = stackOut_73_0;
                        break L21;
                      }
                    } else {
                      stackOut_71_0 = 0;
                      stackIn_76_0 = stackOut_71_0;
                      break L21;
                    }
                  }
                  L22: {
                    var8_int = stackIn_76_0;
                    if (var4_int == 0) {
                      break L22;
                    } else {
                      if (-1 == (rf.field_c[1][var7 + 1].field_sb ^ -1)) {
                        break L22;
                      } else {
                        if (param3) {
                          if (var6 != 0) {
                            break L22;
                          } else {
                            if (-1 == var7) {
                              var9 = 0;
                              L23: while (true) {
                                if (var9 >= er.field_h.length) {
                                  break L22;
                                } else {
                                  er.field_h[var9] = (byte) 0;
                                  var9++;
                                  continue L23;
                                }
                              }
                            } else {
                              er.field_h[var7 / 8] = (byte)ek.b((int) er.field_h[var7 / 8], 1 << qj.b(7, var7));
                              break L22;
                            }
                          }
                        } else {
                          var9 = rn.field_d[var7];
                          if (var9 != param2.field_bc) {
                            param2.field_bc = var9;
                            var5 = 1;
                            break L22;
                          } else {
                            break L22;
                          }
                        }
                      }
                    }
                  }
                  L24: {
                    if (param3) {
                      if ((var7 ^ -1) != 0) {
                        L25: {
                          stackOut_100_0 = rf.field_c[1][var7 - -1];
                          stackIn_102_0 = stackOut_100_0;
                          stackIn_101_0 = stackOut_100_0;
                          if ((er.field_h[var7 / 8] & 1 << (var7 & 7)) == 0) {
                            stackOut_102_0 = (vu) ((Object) stackIn_102_0);
                            stackOut_102_1 = 0;
                            stackIn_103_0 = stackOut_102_0;
                            stackIn_103_1 = stackOut_102_1;
                            break L25;
                          } else {
                            stackOut_101_0 = (vu) ((Object) stackIn_101_0);
                            stackOut_101_1 = 1;
                            stackIn_103_0 = stackOut_101_0;
                            stackIn_103_1 = stackOut_101_1;
                            break L25;
                          }
                        }
                        stackIn_103_0.field_I = stackIn_103_1 != 0;
                        break L24;
                      } else {
                        rf.field_c[1][var7 - -1].field_I = true;
                        var9 = 0;
                        L26: while (true) {
                          if (rn.field_d.length <= var9) {
                            break L24;
                          } else {
                            L27: {
                              stackOut_96_0 = rf.field_c[1][1 + var7];
                              stackOut_96_1 = rf.field_c[1][1 + var7].field_I;
                              stackIn_98_0 = stackOut_96_0;
                              stackIn_98_1 = stackOut_96_1;
                              stackIn_97_0 = stackOut_96_0;
                              stackIn_97_1 = stackOut_96_1;
                              if ((er.field_h[var9 / 8] & 1 << (7 & var9)) != 0) {
                                stackOut_98_0 = (vu) ((Object) stackIn_98_0);
                                stackOut_98_1 = stackIn_98_1;
                                stackOut_98_2 = 0;
                                stackIn_99_0 = stackOut_98_0;
                                stackIn_99_1 = stackOut_98_1;
                                stackIn_99_2 = stackOut_98_2;
                                break L27;
                              } else {
                                stackOut_97_0 = (vu) ((Object) stackIn_97_0);
                                stackOut_97_1 = stackIn_97_1;
                                stackOut_97_2 = 1;
                                stackIn_99_0 = stackOut_97_0;
                                stackIn_99_1 = stackOut_97_1;
                                stackIn_99_2 = stackOut_97_2;
                                break L27;
                              }
                            }
                            stackIn_99_0.field_I = stackIn_99_1 & stackIn_99_2 != 0;
                            var9++;
                            continue L26;
                          }
                        }
                      }
                    } else {
                      L28: {
                        var9 = rn.field_d[var7];
                        stackOut_89_0 = rf.field_c[1][1 + var7];
                        stackIn_91_0 = stackOut_89_0;
                        stackIn_90_0 = stackOut_89_0;
                        if (param2.field_bc != var9) {
                          stackOut_91_0 = (vu) ((Object) stackIn_91_0);
                          stackOut_91_1 = 0;
                          stackIn_92_0 = stackOut_91_0;
                          stackIn_92_1 = stackOut_91_1;
                          break L28;
                        } else {
                          stackOut_90_0 = (vu) ((Object) stackIn_90_0);
                          stackOut_90_1 = 1;
                          stackIn_92_0 = stackOut_90_0;
                          stackIn_92_1 = stackOut_90_1;
                          break L28;
                        }
                      }
                      stackIn_92_0.field_I = stackIn_92_1 != 0;
                      break L24;
                    }
                  }
                  L29: {
                    L30: {
                      stackOut_104_0 = rf.field_c[1][var7 + 1];
                      stackIn_107_0 = stackOut_104_0;
                      stackIn_105_0 = stackOut_104_0;
                      if (var4_int == 0) {
                        break L30;
                      } else {
                        stackOut_105_0 = (vu) ((Object) stackIn_105_0);
                        stackIn_107_0 = stackOut_105_0;
                        stackIn_106_0 = stackOut_105_0;
                        if (var8_int != 0) {
                          break L30;
                        } else {
                          stackOut_106_0 = (vu) ((Object) stackIn_106_0);
                          stackOut_106_1 = 1;
                          stackIn_108_0 = stackOut_106_0;
                          stackIn_108_1 = stackOut_106_1;
                          break L29;
                        }
                      }
                    }
                    stackOut_107_0 = (vu) ((Object) stackIn_107_0);
                    stackOut_107_1 = 0;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    break L29;
                  }
                  stackIn_108_0.field_lb = stackIn_108_1 != 0;
                  var7++;
                  continue L20;
                }
              }
            }
            L31: {
              if (param3) {
                stackOut_111_0 = 0;
                stackIn_112_0 = stackOut_111_0;
                break L31;
              } else {
                stackOut_110_0 = 1;
                stackIn_112_0 = stackOut_110_0;
                break L31;
              }
            }
            var6 = stackIn_112_0;
            L32: while (true) {
              if (var6 >= 3) {
                L33: {
                  if (!param3) {
                    break L33;
                  } else {
                    if (1 >= ku.field_f) {
                      break L33;
                    } else {
                      var6 = 0;
                      L34: while (true) {
                        if (ku.field_f - -1 <= var6) {
                          break L33;
                        } else {
                          L35: {
                            var29 = rf.field_c[3][var6];
                            if (var4_int == 0) {
                              break L35;
                            } else {
                              if (-1 == (var29.field_sb ^ -1)) {
                                break L35;
                              } else {
                                lk.field_l = var6;
                                break L35;
                              }
                            }
                          }
                          L36: {
                            if (!var29.field_Q) {
                              break L36;
                            } else {
                              if ((var6 ^ -1) >= -1) {
                                break L36;
                              } else {
                                L37: {
                                  if (null != oi.field_f) {
                                    stackOut_152_0 = oi.field_f[-1 + var6];
                                    stackIn_153_0 = stackOut_152_0;
                                    break L37;
                                  } else {
                                    stackOut_151_0 = null;
                                    stackIn_153_0 = (String) ((Object) stackOut_151_0);
                                    break L37;
                                  }
                                }
                                var8_ref = stackIn_153_0;
                                if (var8_ref == null) {
                                  break L36;
                                } else {
                                  sn.field_e = var8_ref;
                                  break L36;
                                }
                              }
                            }
                          }
                          L38: {
                            stackOut_155_0 = (vu) (var29);
                            stackIn_157_0 = stackOut_155_0;
                            stackIn_156_0 = stackOut_155_0;
                            if (var6 != lk.field_l) {
                              stackOut_157_0 = (vu) ((Object) stackIn_157_0);
                              stackOut_157_1 = 0;
                              stackIn_158_0 = stackOut_157_0;
                              stackIn_158_1 = stackOut_157_1;
                              break L38;
                            } else {
                              stackOut_156_0 = (vu) ((Object) stackIn_156_0);
                              stackOut_156_1 = 1;
                              stackIn_158_0 = stackOut_156_0;
                              stackIn_158_1 = stackOut_156_1;
                              break L38;
                            }
                          }
                          L39: {
                            stackIn_158_0.field_I = stackIn_158_1 != 0;
                            stackOut_158_0 = (vu) (var29);
                            stackIn_160_0 = stackOut_158_0;
                            stackIn_159_0 = stackOut_158_0;
                            if (var4_int == 0) {
                              stackOut_160_0 = (vu) ((Object) stackIn_160_0);
                              stackOut_160_1 = 0;
                              stackIn_161_0 = stackOut_160_0;
                              stackIn_161_1 = stackOut_160_1;
                              break L39;
                            } else {
                              stackOut_159_0 = (vu) ((Object) stackIn_159_0);
                              stackOut_159_1 = 1;
                              stackIn_161_0 = stackOut_159_0;
                              stackIn_161_1 = stackOut_159_1;
                              break L39;
                            }
                          }
                          stackIn_161_0.field_lb = stackIn_161_1 != 0;
                          var6++;
                          continue L34;
                        }
                      }
                    }
                  }
                }
                var6 = 0;
                var7 = 0;
                L40: while (true) {
                  if (ss.field_j <= var7) {
                    L41: {
                      if (var5 == 0) {
                        break L41;
                      } else {
                        if (!param3) {
                          lu.a(6773, param0);
                          break L41;
                        } else {
                          break L41;
                        }
                      }
                    }
                    break L0;
                  } else {
                    L42: {
                      var30 = rf.field_c[var7 + 4];
                      var8 = var30;
                      if (!param3) {
                        stackOut_166_0 = 0;
                        stackIn_167_0 = stackOut_166_0;
                        break L42;
                      } else {
                        stackOut_165_0 = -1;
                        stackIn_167_0 = stackOut_165_0;
                        break L42;
                      }
                    }
                    var9 = stackIn_167_0;
                    L43: while (true) {
                      if (-1 + var30.length <= var9) {
                        var6 = var6 + (255 & rp.field_x[var7]);
                        var7++;
                        continue L40;
                      } else {
                        L44: {
                          var10 = 0;
                          var11 = 0;
                          var12 = 0;
                          var13 = 0;
                          var14 = 0;
                          var15 = 0;
                          if (var4_int == 0) {
                            break L44;
                          } else {
                            if (var9 < 0) {
                              break L44;
                            } else {
                              L45: {
                                if (hm.field_D == null) {
                                  break L45;
                                } else {
                                  if (null != hm.field_D[var7]) {
                                    if (((sb.field_a ^ -1) & hm.field_D[var7][var9] ^ -1) >= -1) {
                                      break L45;
                                    } else {
                                      var14 = 1;
                                      var15 = ps.a((byte) -126, hm.field_D[var7][var9] & (sb.field_a ^ -1));
                                      break L45;
                                    }
                                  } else {
                                    break L45;
                                  }
                                }
                              }
                              L46: {
                                if (null == ds.field_h) {
                                  break L46;
                                } else {
                                  if (null == ds.field_h[var7]) {
                                    break L46;
                                  } else {
                                    if (0 < eq.field_d) {
                                      break L46;
                                    } else {
                                      if (!ds.field_h[var7][var9]) {
                                        break L46;
                                      } else {
                                        var10 = 1;
                                        break L46;
                                      }
                                    }
                                  }
                                }
                              }
                              L47: {
                                if (lh.field_E == null) {
                                  break L47;
                                } else {
                                  if (null == lh.field_E[var7]) {
                                    break L47;
                                  } else {
                                    L48: {
                                      var16 = lh.field_E[var7][var9];
                                      if (var16 == 0) {
                                        break L48;
                                      } else {
                                        if (fv.field_d) {
                                          break L48;
                                        } else {
                                          if (eq.field_d <= 0) {
                                            var10 = 1;
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                    }
                                    if ((var16 ^ -1) >= -1) {
                                      break L47;
                                    } else {
                                      if (var16 <= mi.field_d) {
                                        break L47;
                                      } else {
                                        var12 = 1;
                                        break L47;
                                      }
                                    }
                                  }
                                }
                              }
                              L49: {
                                if (param3) {
                                  if (qd.field_e != null) {
                                    if (null != qd.field_e[var7]) {
                                      if (qd.field_e[var7][var9]) {
                                        stackOut_199_0 = 1;
                                        stackIn_201_0 = stackOut_199_0;
                                        break L49;
                                      } else {
                                        stackOut_198_0 = 0;
                                        stackIn_201_0 = stackOut_198_0;
                                        break L49;
                                      }
                                    } else {
                                      stackOut_196_0 = 0;
                                      stackIn_201_0 = stackOut_196_0;
                                      break L49;
                                    }
                                  } else {
                                    stackOut_194_0 = 0;
                                    stackIn_201_0 = stackOut_194_0;
                                    break L49;
                                  }
                                } else {
                                  stackOut_192_0 = 0;
                                  stackIn_201_0 = stackOut_192_0;
                                  break L49;
                                }
                              }
                              var13 = stackIn_201_0;
                              if (null == so.field_f) {
                                break L44;
                              } else {
                                if (null != so.field_f[var7]) {
                                  L50: {
                                    var16 = so.field_f[var7][var9];
                                    if (0 == var16) {
                                      break L50;
                                    } else {
                                      if (fv.field_d) {
                                        break L50;
                                      } else {
                                        if (0 >= eq.field_d) {
                                          var10 = 1;
                                          break L50;
                                        } else {
                                          break L50;
                                        }
                                      }
                                    }
                                  }
                                  if (-1 <= (var16 ^ -1)) {
                                    break L44;
                                  } else {
                                    if (da.field_o < var16) {
                                      var11 = 1;
                                      break L44;
                                    } else {
                                      break L44;
                                    }
                                  }
                                } else {
                                  break L44;
                                }
                              }
                            }
                          }
                        }
                        L51: {
                          if (-3 < (tk.field_Ib ^ -1)) {
                            break L51;
                          } else {
                            if (ne.field_G[12]) {
                              var13 = 0;
                              var10 = 0;
                              var11 = 0;
                              var14 = 0;
                              var12 = 0;
                              break L51;
                            } else {
                              break L51;
                            }
                          }
                        }
                        L52: {
                          L53: {
                            if (var10 != 0) {
                              break L53;
                            } else {
                              if (var11 != 0) {
                                break L53;
                              } else {
                                if (var12 != 0) {
                                  break L53;
                                } else {
                                  if (var13 != 0) {
                                    break L53;
                                  } else {
                                    if (var14 == 0) {
                                      stackOut_224_0 = 0;
                                      stackIn_225_0 = stackOut_224_0;
                                      break L52;
                                    } else {
                                      break L53;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_223_0 = 1;
                          stackIn_225_0 = stackOut_223_0;
                          break L52;
                        }
                        L54: {
                          var16 = stackIn_225_0;
                          tt.field_c = true;
                          if (var16 != 0) {
                            break L54;
                          } else {
                            if ((var9 ^ -1) > -1) {
                              break L54;
                            } else {
                              if (la.field_k == null) {
                                break L54;
                              } else {
                                L55: {
                                  if (!param3) {
                                    break L55;
                                  } else {
                                    if (hw.field_k) {
                                      break L54;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                                L56: {
                                  if (null == hm.field_G) {
                                    m.field_f = new boolean[ss.field_j];
                                    hm.field_G = new byte[ss.field_j];
                                    break L56;
                                  } else {
                                    break L56;
                                  }
                                }
                                tt.field_c = false;
                                ee.field_e = false;
                                var17_int = 0;
                                L57: while (true) {
                                  if (var7 <= var17_int) {
                                    L58: {
                                      pl.a(0, var7, param2, -1, (byte) -125, var9, -1, param3);
                                      if (tk.field_Ib < 2) {
                                        break L58;
                                      } else {
                                        if (ne.field_G[12]) {
                                          tt.field_c = true;
                                          break L58;
                                        } else {
                                          break L58;
                                        }
                                      }
                                    }
                                    if (tt.field_c) {
                                      break L54;
                                    } else {
                                      var16 = 1;
                                      break L54;
                                    }
                                  } else {
                                    m.field_f[var17_int] = false;
                                    var17_int++;
                                    continue L57;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L59: {
                          var17 = var8[1 + var9];
                          if (var4_int == 0) {
                            break L59;
                          } else {
                            if (var17.field_sb == 0) {
                              break L59;
                            } else {
                              if (param3) {
                                if (-1 == var9) {
                                  var18 = var6;
                                  L60: while (true) {
                                    if (var6 - (-var30.length - -1) <= var18) {
                                      break L59;
                                    } else {
                                      rf.field_d[var18 / 8] = (byte)qj.b((int) rf.field_d[var18 / 8], 1 << qj.b(var18, 7) ^ -1);
                                      var18++;
                                      continue L60;
                                    }
                                  }
                                } else {
                                  rf.field_d[(var9 + var6) / 8] = (byte)ek.b((int) rf.field_d[(var9 + var6) / 8], 1 << qj.b(var6 + var9, 7));
                                  break L59;
                                }
                              } else {
                                if (var16 != 0) {
                                  break L59;
                                } else {
                                  if (param2.field_Eb[var7] == (byte)var9) {
                                    break L59;
                                  } else {
                                    var5 = 1;
                                    param2.field_Eb[var7] = (byte)var9;
                                    break L59;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L61: {
                          if (!param3) {
                            break L61;
                          } else {
                            if (var16 != 0) {
                              rf.field_d[(var6 + var9) / 8] = (byte)qj.b((int) rf.field_d[(var6 + var9) / 8], 1 << qj.b(7, var9 + var6) ^ -1);
                              break L61;
                            } else {
                              break L61;
                            }
                          }
                        }
                        L62: {
                          if (-1 < (var9 ^ -1)) {
                            break L62;
                          } else {
                            if (var17.field_Q) {
                              L63: {
                                if (null == oj.field_Q) {
                                  var18_ref = null;
                                  break L63;
                                } else {
                                  if (oj.field_Q[var7] != null) {
                                    var18_ref = oj.field_Q[var7][var9];
                                    break L63;
                                  } else {
                                    var18_ref = null;
                                    break L63;
                                  }
                                }
                              }
                              L64: {
                                if (ca.field_g != null) {
                                  if (ca.field_g[var7] != null) {
                                    var19_ref = ca.field_g[var7][var9];
                                    break L64;
                                  } else {
                                    var19_ref = null;
                                    break L64;
                                  }
                                } else {
                                  var19_ref = null;
                                  break L64;
                                }
                              }
                              L65: {
                                var20 = null;
                                if (var19_ref == null) {
                                  break L65;
                                } else {
                                  if (!var19_ref.equals(var18_ref)) {
                                    var20 = var19_ref;
                                    break L65;
                                  } else {
                                    break L65;
                                  }
                                }
                              }
                              L66: {
                                var21 = null;
                                if (var13 == 0) {
                                  if (var10 == 0) {
                                    L67: {
                                      if (var11 != 0) {
                                        var22_int = -da.field_o + so.field_f[var7][var9];
                                        if ((var22_int ^ -1) != -2) {
                                          var21 = vo.a((byte) -18, wq.field_c, new String[]{Integer.toString(var22_int)});
                                          break L67;
                                        } else {
                                          var21 = ss.field_d;
                                          break L67;
                                        }
                                      } else {
                                        break L67;
                                      }
                                    }
                                    L68: {
                                      if (var12 != 0) {
                                        var31 = vo.a((byte) -18, aq.field_h, new String[]{Integer.toString(mi.field_d), Integer.toString(lh.field_E[var7][var9])});
                                        var21 = var31;
                                        var21 = var31;
                                        if (var21 != null) {
                                          var21 = (String) (var21) + "<br>" + var31;
                                          break L68;
                                        } else {
                                          var21 = var31;
                                          break L68;
                                        }
                                      } else {
                                        break L68;
                                      }
                                    }
                                    if (var14 != 0) {
                                      L69: {
                                        var22_ref = wv.field_bb;
                                        if ((var15 ^ -1) >= -1) {
                                          break L69;
                                        } else {
                                          if (um.field_a == null) {
                                            break L69;
                                          } else {
                                            if (um.field_a.length < var15) {
                                              break L69;
                                            } else {
                                              if (um.field_a[-1 + var15] != null) {
                                                var22_ref = um.field_a[var15 + -1][0];
                                                break L69;
                                              } else {
                                                break L69;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      if (var21 == null) {
                                        var21 = var22_ref;
                                        break L66;
                                      } else {
                                        var21 = (String) (var21) + "<br>" + var22_ref;
                                        break L66;
                                      }
                                    } else {
                                      break L66;
                                    }
                                  } else {
                                    var21 = oe.field_n;
                                    break L66;
                                  }
                                } else {
                                  var21 = w.field_c;
                                  break L66;
                                }
                              }
                              L70: {
                                if (var4_int == 0) {
                                  break L70;
                                } else {
                                  if (!tt.field_c) {
                                    L71: {
                                      var22_ref = null;
                                      if (!ee.field_e) {
                                        break L71;
                                      } else {
                                        var22_ref = "</col>" + qk.field_H + "<col=A00000>";
                                        var25 = var22_ref;
                                        var22_ref = var25;
                                        var25 = var22_ref;
                                        var22_ref = var25;
                                        var21 = var22_ref;
                                        break L71;
                                      }
                                    }
                                    var23 = 0;
                                    var24 = 0;
                                    L72: while (true) {
                                      if (var7 <= var24) {
                                        if (var23 != 0) {
                                          var21 = nr.field_m + var22_ref;
                                          break L70;
                                        } else {
                                          var21 = vo.a((byte) -18, gk.field_d, new String[]{var22_ref});
                                          break L70;
                                        }
                                      } else {
                                        if (m.field_f[var24]) {
                                          L73: {
                                            var25 = "</col>" + ok.field_b[var24] + "<col=A00000>";
                                            var22_ref = var25;
                                            var21 = var22_ref;
                                            var22_ref = var25;
                                            if (var22_ref == null) {
                                              var22_ref = var25;
                                              var21 = var22_ref;
                                              var21 = var22_ref;
                                              break L73;
                                            } else {
                                              var23 = 1;
                                              var22_ref = var22_ref + ", " + var25;
                                              break L73;
                                            }
                                          }
                                          var24++;
                                          continue L72;
                                        } else {
                                          var24++;
                                          continue L72;
                                        }
                                      }
                                    }
                                  } else {
                                    break L70;
                                  }
                                }
                              }
                              L74: {
                                if (var21 != null) {
                                  var32 = "<col=A00000>" + (String) (var21);
                                  var33 = wj.a("<br>", "<br><col=A00000>", true, var32);
                                  if (var20 != null) {
                                    var20 = (String) (var20) + "<br>" + var33;
                                    break L74;
                                  } else {
                                    var20 = var33;
                                    break L74;
                                  }
                                } else {
                                  break L74;
                                }
                              }
                              if (var20 == null) {
                                break L62;
                              } else {
                                sn.field_e = (String) (var20);
                                break L62;
                              }
                            } else {
                              break L62;
                            }
                          }
                        }
                        L75: {
                          if (param3) {
                            if ((var9 ^ -1) != 0) {
                              L76: {
                                stackOut_336_0 = (vu) (var17);
                                stackIn_338_0 = stackOut_336_0;
                                stackIn_337_0 = stackOut_336_0;
                                if (-1 == (rf.field_d[(var6 - -var9) / 8] & 1 << (var6 + var9 & 7) ^ -1)) {
                                  stackOut_338_0 = (vu) ((Object) stackIn_338_0);
                                  stackOut_338_1 = 0;
                                  stackIn_339_0 = stackOut_338_0;
                                  stackIn_339_1 = stackOut_338_1;
                                  break L76;
                                } else {
                                  stackOut_337_0 = (vu) ((Object) stackIn_337_0);
                                  stackOut_337_1 = 1;
                                  stackIn_339_0 = stackOut_337_0;
                                  stackIn_339_1 = stackOut_337_1;
                                  break L76;
                                }
                              }
                              stackIn_339_0.field_I = stackIn_339_1 != 0;
                              break L75;
                            } else {
                              var17.field_I = true;
                              var27 = var6;
                              var18 = var27;
                              L77: while (true) {
                                if (var27 >= var6 - -var30.length + -1) {
                                  break L75;
                                } else {
                                  L78: {
                                    stackOut_332_0 = (vu) (var17);
                                    stackOut_332_1 = var17.field_I;
                                    stackIn_334_0 = stackOut_332_0;
                                    stackIn_334_1 = stackOut_332_1;
                                    stackIn_333_0 = stackOut_332_0;
                                    stackIn_333_1 = stackOut_332_1;
                                    if (0 != (rf.field_d[var27 / 8] & 1 << (var27 & 7))) {
                                      stackOut_334_0 = (vu) ((Object) stackIn_334_0);
                                      stackOut_334_1 = stackIn_334_1;
                                      stackOut_334_2 = 0;
                                      stackIn_335_0 = stackOut_334_0;
                                      stackIn_335_1 = stackOut_334_1;
                                      stackIn_335_2 = stackOut_334_2;
                                      break L78;
                                    } else {
                                      stackOut_333_0 = (vu) ((Object) stackIn_333_0);
                                      stackOut_333_1 = stackIn_333_1;
                                      stackOut_333_2 = 1;
                                      stackIn_335_0 = stackOut_333_0;
                                      stackIn_335_1 = stackOut_333_1;
                                      stackIn_335_2 = stackOut_333_2;
                                      break L78;
                                    }
                                  }
                                  stackIn_335_0.field_I = stackIn_335_1 & stackIn_335_2 != 0;
                                  var27++;
                                  continue L77;
                                }
                              }
                            }
                          } else {
                            L79: {
                              L80: {
                                stackOut_324_0 = (vu) (var17);
                                stackIn_327_0 = stackOut_324_0;
                                stackIn_325_0 = stackOut_324_0;
                                if (!tt.field_c) {
                                  break L80;
                                } else {
                                  stackOut_325_0 = (vu) ((Object) stackIn_325_0);
                                  stackIn_327_0 = stackOut_325_0;
                                  stackIn_326_0 = stackOut_325_0;
                                  if ((byte)var9 != param2.field_Eb[var7]) {
                                    break L80;
                                  } else {
                                    stackOut_326_0 = (vu) ((Object) stackIn_326_0);
                                    stackOut_326_1 = 1;
                                    stackIn_328_0 = stackOut_326_0;
                                    stackIn_328_1 = stackOut_326_1;
                                    break L79;
                                  }
                                }
                              }
                              stackOut_327_0 = (vu) ((Object) stackIn_327_0);
                              stackOut_327_1 = 0;
                              stackIn_328_0 = stackOut_327_0;
                              stackIn_328_1 = stackOut_327_1;
                              break L79;
                            }
                            stackIn_328_0.field_I = stackIn_328_1 != 0;
                            break L75;
                          }
                        }
                        L81: {
                          L82: {
                            stackOut_340_0 = (vu) (var17);
                            stackIn_343_0 = stackOut_340_0;
                            stackIn_341_0 = stackOut_340_0;
                            if (var4_int == 0) {
                              break L82;
                            } else {
                              stackOut_341_0 = (vu) ((Object) stackIn_341_0);
                              stackIn_343_0 = stackOut_341_0;
                              stackIn_342_0 = stackOut_341_0;
                              if (var16 != 0) {
                                break L82;
                              } else {
                                stackOut_342_0 = (vu) ((Object) stackIn_342_0);
                                stackOut_342_1 = 1;
                                stackIn_344_0 = stackOut_342_0;
                                stackIn_344_1 = stackOut_342_1;
                                break L81;
                              }
                            }
                          }
                          stackOut_343_0 = (vu) ((Object) stackIn_343_0);
                          stackOut_343_1 = 0;
                          stackIn_344_0 = stackOut_343_0;
                          stackIn_344_1 = stackOut_343_1;
                          break L81;
                        }
                        stackIn_344_0.field_lb = stackIn_344_1 != 0;
                        var9++;
                        continue L43;
                      }
                    }
                  }
                }
              } else {
                L83: {
                  var28 = rf.field_c[2][var6];
                  if (var4_int == 0) {
                    break L83;
                  } else {
                    if (0 == var28.field_sb) {
                      break L83;
                    } else {
                      if (param3) {
                        if (var6 == 0) {
                          ru.field_C = 0;
                          break L83;
                        } else {
                          ru.field_C = ru.field_C ^ var6;
                          break L83;
                        }
                      } else {
                        if (param2.field_Mb != var6) {
                          var5 = 1;
                          param2.field_Mb = var6;
                          break L83;
                        } else {
                          break L83;
                        }
                      }
                    }
                  }
                }
                L84: {
                  if (param3) {
                    if (var6 == 0) {
                      L85: {
                        stackOut_133_0 = (vu) (var28);
                        stackIn_135_0 = stackOut_133_0;
                        stackIn_134_0 = stackOut_133_0;
                        if (0 != ru.field_C) {
                          stackOut_135_0 = (vu) ((Object) stackIn_135_0);
                          stackOut_135_1 = 0;
                          stackIn_136_0 = stackOut_135_0;
                          stackIn_136_1 = stackOut_135_1;
                          break L85;
                        } else {
                          stackOut_134_0 = (vu) ((Object) stackIn_134_0);
                          stackOut_134_1 = 1;
                          stackIn_136_0 = stackOut_134_0;
                          stackIn_136_1 = stackOut_134_1;
                          break L85;
                        }
                      }
                      stackIn_136_0.field_I = stackIn_136_1 != 0;
                      break L84;
                    } else {
                      L86: {
                        stackOut_129_0 = (vu) (var28);
                        stackIn_131_0 = stackOut_129_0;
                        stackIn_130_0 = stackOut_129_0;
                        if ((ru.field_C & var6) == 0) {
                          stackOut_131_0 = (vu) ((Object) stackIn_131_0);
                          stackOut_131_1 = 0;
                          stackIn_132_0 = stackOut_131_0;
                          stackIn_132_1 = stackOut_131_1;
                          break L86;
                        } else {
                          stackOut_130_0 = (vu) ((Object) stackIn_130_0);
                          stackOut_130_1 = 1;
                          stackIn_132_0 = stackOut_130_0;
                          stackIn_132_1 = stackOut_130_1;
                          break L86;
                        }
                      }
                      stackIn_132_0.field_I = stackIn_132_1 != 0;
                      break L84;
                    }
                  } else {
                    L87: {
                      stackOut_124_0 = (vu) (var28);
                      stackIn_126_0 = stackOut_124_0;
                      stackIn_125_0 = stackOut_124_0;
                      if ((param2.field_Mb & var6) == 0) {
                        stackOut_126_0 = (vu) ((Object) stackIn_126_0);
                        stackOut_126_1 = 0;
                        stackIn_127_0 = stackOut_126_0;
                        stackIn_127_1 = stackOut_126_1;
                        break L87;
                      } else {
                        stackOut_125_0 = (vu) ((Object) stackIn_125_0);
                        stackOut_125_1 = 1;
                        stackIn_127_0 = stackOut_125_0;
                        stackIn_127_1 = stackOut_125_1;
                        break L87;
                      }
                    }
                    stackIn_127_0.field_I = stackIn_127_1 != 0;
                    break L84;
                  }
                }
                L88: {
                  stackOut_137_0 = (vu) (var28);
                  stackIn_139_0 = stackOut_137_0;
                  stackIn_138_0 = stackOut_137_0;
                  if (var4_int == 0) {
                    stackOut_139_0 = (vu) ((Object) stackIn_139_0);
                    stackOut_139_1 = 0;
                    stackIn_140_0 = stackOut_139_0;
                    stackIn_140_1 = stackOut_139_1;
                    break L88;
                  } else {
                    stackOut_138_0 = (vu) ((Object) stackIn_138_0);
                    stackOut_138_1 = 1;
                    stackIn_140_0 = stackOut_138_0;
                    stackIn_140_1 = stackOut_138_1;
                    break L88;
                  }
                }
                stackIn_140_0.field_lb = stackIn_140_1 != 0;
                var6++;
                continue L32;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L89: {
            var4 = decompiledCaughtException;
            stackOut_351_0 = (RuntimeException) (var4);
            stackOut_351_1 = new StringBuilder().append("ma.AB(").append(param0).append(',').append(param1).append(',');
            stackIn_353_0 = stackOut_351_0;
            stackIn_353_1 = stackOut_351_1;
            stackIn_352_0 = stackOut_351_0;
            stackIn_352_1 = stackOut_351_1;
            if (param2 == null) {
              stackOut_353_0 = (RuntimeException) ((Object) stackIn_353_0);
              stackOut_353_1 = (StringBuilder) ((Object) stackIn_353_1);
              stackOut_353_2 = "null";
              stackIn_354_0 = stackOut_353_0;
              stackIn_354_1 = stackOut_353_1;
              stackIn_354_2 = stackOut_353_2;
              break L89;
            } else {
              stackOut_352_0 = (RuntimeException) ((Object) stackIn_352_0);
              stackOut_352_1 = (StringBuilder) ((Object) stackIn_352_1);
              stackOut_352_2 = "{...}";
              stackIn_354_0 = stackOut_352_0;
              stackIn_354_1 = stackOut_352_1;
              stackIn_354_2 = stackOut_352_2;
              break L89;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_354_0), stackIn_354_2 + ',' + param3 + ')');
        }
    }

    private final int a(boolean param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            iw var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = Kickabout.field_G;
            var4 = ou.b(id.field_v, -1951459327, vv.field_r, param2);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (1 == var4) {
                  L1: {
                    var5_int = bo.a(s.j(61), (byte) -98, va.f(-1));
                    if (-1 == var5_int) {
                      break L1;
                    } else {
                      no.a(mr.field_X, var5_int, gd.field_b, -1);
                      gd.field_b = null;
                      mr.field_X = null;
                      break L1;
                    }
                  }
                  var11 = v.d(83);
                  if (var11 == null) {
                    break L0;
                  } else {
                    ia.a(var11.booleanValue(), -23249);
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (-3 != (var4 ^ -1)) {
                  break L2;
                } else {
                  var5_int = mu.a(12, qq.g((byte) -17), ls.g(-26370), ev.h(10326), he.a(320), la.b(820907312), this.field_r);
                  if ((var5_int ^ -1) != 0) {
                    vs.a(gd.field_b, mr.field_X, (byte) 122, var5_int);
                    mr.field_X = null;
                    gd.field_b = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (-4 != (var4 ^ -1)) {
                  break L3;
                } else {
                  L4: {
                    if (es.field_h == -1) {
                      break L4;
                    } else {
                      if (-1 != (es.field_h ^ -1)) {
                        es.field_h = -1;
                        np.b(23877);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param0) {
                    fc.field_d = false;
                    break L3;
                  } else {
                    var5_int = js.a(0, ls.g(-26370), this.field_o, false, ev.h(10326), this.field_r);
                    if (0 == (var5_int ^ -1)) {
                      break L3;
                    } else {
                      if (var5_int != 0) {
                        fc.a(gd.field_b, var5_int, 125);
                        gd.field_b = null;
                        break L3;
                      } else {
                        tn.field_a = wq.field_d;
                        bd.e(-1);
                        vj.field_c = 10;
                        nb.field_f = false;
                        break L3;
                      }
                    }
                  }
                }
              }
              L5: {
                if ((var4 ^ -1) != -5) {
                  break L5;
                } else {
                  if (fu.field_c) {
                    hi.a(so.a(108), param1);
                    break L5;
                  } else {
                    vj.field_c = 10;
                    nb.field_f = true;
                    break L5;
                  }
                }
              }
              L6: {
                if (5 == var4) {
                  js.a(20338, so.a(-111));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 != 6) {
                  break L7;
                } else {
                  if (!aw.field_H) {
                    break L7;
                  } else {
                    vj.field_c = 10;
                    break L7;
                  }
                }
              }
              L8: {
                if (var4 != 7) {
                  break L8;
                } else {
                  vr.a(so.a(35), 23607);
                  break L8;
                }
              }
              L9: {
                if (param1) {
                  break L9;
                } else {
                  this.field_u = -76;
                  break L9;
                }
              }
              L10: {
                if (var4 != 8) {
                  break L10;
                } else {
                  hi.a(so.a(124), param1);
                  break L10;
                }
              }
              L11: {
                if (var4 == 9) {
                  ap.a(so.a(-93), 0);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (10 != var4) {
                  break L12;
                } else {
                  or.field_d.b(17, (byte) -87);
                  break L12;
                }
              }
              L13: {
                if (var4 != 11) {
                  break L13;
                } else {
                  bq.a((byte) 125, so.a(51));
                  break L13;
                }
              }
              L14: {
                if (-13 != (var4 ^ -1)) {
                  break L14;
                } else {
                  im.a(so.a(-85), 114, aq.c(71));
                  break L14;
                }
              }
              L15: {
                if (13 != var4) {
                  break L15;
                } else {
                  try {
                    L16: {
                      L17: {
                        if (null != rk.field_d) {
                          break L17;
                        } else {
                          rk.field_d = new u(oo.field_c, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        }
                      }
                      L18: {
                        if (!rk.field_d.a((byte) 58)) {
                          break L18;
                        } else {
                          L19: {
                            var12 = rk.field_d.b(0);
                            if (var12 == null) {
                              var9 = (String) null;
                              ue.a((String) null, (byte) -118);
                              break L19;
                            } else {
                              var7 = hf.a((byte) -122, var12.field_n, 0, var12.field_f);
                              ue.a(var7, (byte) -49);
                              break L19;
                            }
                          }
                          rk.field_d = null;
                          break L18;
                        }
                      }
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L20: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      bd.a("S1", (Throwable) ((Object) var5), 1);
                      var10 = (String) null;
                      ue.a((String) null, (byte) 119);
                      rk.field_d = null;
                      break L20;
                    }
                  }
                  break L15;
                }
              }
              L21: {
                if (15 != var4) {
                  break L21;
                } else {
                  vj.field_c = 10;
                  break L21;
                }
              }
              if (-17 != (var4 ^ -1)) {
                if ((var4 ^ -1) == -18) {
                  return 2;
                } else {
                  return 0;
                }
              } else {
                return 1;
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
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.d((byte) 118)) {
                  L2: {
                    L3: {
                      this.field_z = this.getCodeBase().getHost();
                      var6_ref2 = this.field_z.toLowerCase();
                      stackOut_2_0 = this;
                      stackIn_5_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var6_ref2.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackOut_3_0 = this;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_6_0 = this;
                          stackOut_6_1 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          break L2;
                        } else {
                          stackOut_4_0 = this;
                          stackIn_5_0 = stackOut_4_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                  L4: {
                    ((ma) (this)).field_o = stackIn_7_1 != 0;
                    this.field_s = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_u = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 != null) {
                      this.field_x = Integer.parseInt(var7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    this.field_B = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_v = Long.parseLong(this.getParameter("instanceid"));
                    this.field_A = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_p = Integer.parseInt(var8);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (param4 < -78) {
                      break L6;
                    } else {
                      this.i(38);
                      break L6;
                    }
                  }
                  L7: {
                    if (-6 >= (this.field_p ^ -1)) {
                      this.field_p = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_r = Integer.parseInt(var9);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  o.field_d = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(param1, param3, this.field_B, (byte) -126, param2, param0, 32);
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                bd.a((String) null, (Throwable) ((Object) var6), 1);
                this.a((byte) 87, "crash");
                decompiledRegionSelector0 = 1;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var6_ref);
            stackOut_25_1 = new StringBuilder().append("ma.BB(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L10;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L10;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void k(int param0) {
        String discarded$0 = null;
        if (!(!kd.field_s)) {
            on.g(on.field_b, on.field_e, on.field_c + -on.field_b, on.field_h + -on.field_e);
            qa.field_E.a(46, false);
        }
        if (param0 != 1) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = ma.a((byte) -6, (CharSequence) null, true);
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
        if (this.field_e) {
          return -1;
        } else {
          if (!hq.a((byte) 10)) {
            return -1;
          } else {
            if (!fc.field_d) {
              var2 = js.a(0, ls.g(-26370), this.field_o, true, ev.h(10326), this.field_r);
              if ((var2 ^ -1) != 0) {
                L0: {
                  if (0 == var2) {
                    break L0;
                  } else {
                    if ((var2 ^ -1) != -2) {
                      L1: {
                        if (!kr.field_e) {
                          this.a((byte) 61, "reconnect");
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
                          field_t = (pk) null;
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
        field_w = "Secret achievement";
    }
}
