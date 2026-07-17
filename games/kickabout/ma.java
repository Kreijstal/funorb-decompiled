/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
            Object var3 = null;
            this.a((String) null, 31, 32, -108, 43);
        }
        hr.field_h[2] = true;
    }

    final void a(String param0, int param1, byte param2) {
        try {
            if (param2 != -60) {
                ((ma) this).field_A = true;
            }
            this.a(param0, param1, 480, 640, -93);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ma.WA(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
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
        String var2 = fj.a(false);
        bv.a(so.a(19), var2, (byte) 15);
    }

    public static void d(boolean param0) {
        field_y = null;
        field_t = null;
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
        if (!(pg.field_b <= 0)) {
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
            if (param0 < -108) {
              break L0;
            } else {
              field_w = null;
              break L0;
            }
          }
          var3 = iv.a(0, param2, param1);
          if (var3 != null) {
            stackOut_5_0 = (String) var3;
            stackIn_6_0 = stackOut_5_0;
            return stackIn_6_0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 < param1.length()) {
                if (!jw.a(param1.charAt(var4), 160)) {
                  stackOut_12_0 = pl.field_c;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3_ref;
            stackOut_16_1 = new StringBuilder().append("ma.NA(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L2;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
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
          if (var2 >= 64) {
            break L1;
          } else {
            if (hr.field_h[var2]) {
              if (var2 == 0) {
                return;
              } else {
                L2: {
                  if (var2 != 1) {
                    if (var2 != 2) {
                      if (3 == var2) {
                        gf.a((byte) 53);
                        break L2;
                      } else {
                        if (var2 == 4) {
                          sm.a((byte) 103);
                          break L2;
                        } else {
                          if (var2 != 5) {
                            if (var2 == 6) {
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
                                        if (var2 != 12) {
                                          if (13 != var2) {
                                            if (var2 == 17) {
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
                    if (vj.field_c != 0) {
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
              if (((ma) this).field_q) {
                break L5;
              } else {
                if (~or.a(true) >= ~var3) {
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
              if (es.field_h == 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (es.field_h != -1) {
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
              if (es.field_h == 0) {
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
          if (es.field_h == -1) {
            break L10;
          } else {
            if (es.field_h != 0) {
              if (10 > hl.field_d) {
                if (es.field_h != 3) {
                  if (es.field_h != 4) {
                    if (es.field_h != 2) {
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
                    if (es.field_h != 3) {
                      if (es.field_h != 4) {
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
              if (es.field_h == -1) {
                break L14;
              } else {
                if (es.field_h != 0) {
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
          if (hl.field_d == 0) {
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
          if (hl.field_d == 1) {
            L18: {
              if (vv.field_r != 0) {
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
          if (hl.field_d == 3) {
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
                lo.a((byte) -127, (java.applet.Applet) this);
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
          if (hl.field_d != 12) {
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
          if (hl.field_d != 13) {
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
              ((ma) this).f((byte) -88);
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
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_19_0 = 0;
        vu stackIn_31_0 = null;
        vu stackIn_32_0 = null;
        vu stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        vu stackIn_37_0 = null;
        vu stackIn_38_0 = null;
        vu stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_53_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_67_0 = 0;
        vu stackIn_81_0 = null;
        vu stackIn_82_0 = null;
        vu stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        vu stackIn_88_0 = null;
        boolean stackIn_88_1 = false;
        vu stackIn_89_0 = null;
        boolean stackIn_89_1 = false;
        vu stackIn_90_0 = null;
        boolean stackIn_90_1 = false;
        int stackIn_90_2 = 0;
        vu stackIn_92_0 = null;
        vu stackIn_93_0 = null;
        vu stackIn_94_0 = null;
        int stackIn_94_1 = 0;
        vu stackIn_96_0 = null;
        vu stackIn_97_0 = null;
        vu stackIn_98_0 = null;
        vu stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_103_0 = 0;
        vu stackIn_116_0 = null;
        vu stackIn_117_0 = null;
        vu stackIn_118_0 = null;
        int stackIn_118_1 = 0;
        vu stackIn_121_0 = null;
        vu stackIn_122_0 = null;
        vu stackIn_123_0 = null;
        int stackIn_123_1 = 0;
        vu stackIn_125_0 = null;
        vu stackIn_126_0 = null;
        vu stackIn_127_0 = null;
        int stackIn_127_1 = 0;
        vu stackIn_129_0 = null;
        vu stackIn_130_0 = null;
        vu stackIn_131_0 = null;
        int stackIn_131_1 = 0;
        String stackIn_144_0 = null;
        vu stackIn_147_0 = null;
        vu stackIn_148_0 = null;
        vu stackIn_149_0 = null;
        int stackIn_149_1 = 0;
        vu stackIn_150_0 = null;
        vu stackIn_151_0 = null;
        vu stackIn_152_0 = null;
        int stackIn_152_1 = 0;
        int stackIn_158_0 = 0;
        int stackIn_188_0 = 0;
        int stackIn_212_0 = 0;
        vu stackIn_311_0 = null;
        vu stackIn_312_0 = null;
        vu stackIn_313_0 = null;
        vu stackIn_314_0 = null;
        int stackIn_314_1 = 0;
        vu stackIn_319_0 = null;
        boolean stackIn_319_1 = false;
        vu stackIn_320_0 = null;
        boolean stackIn_320_1 = false;
        vu stackIn_321_0 = null;
        boolean stackIn_321_1 = false;
        int stackIn_321_2 = 0;
        vu stackIn_323_0 = null;
        vu stackIn_324_0 = null;
        vu stackIn_325_0 = null;
        int stackIn_325_1 = 0;
        vu stackIn_327_0 = null;
        vu stackIn_328_0 = null;
        vu stackIn_329_0 = null;
        vu stackIn_330_0 = null;
        int stackIn_330_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_52_0 = 0;
        vu stackOut_30_0 = null;
        vu stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        vu stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        vu stackOut_36_0 = null;
        vu stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        vu stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_65_0 = 0;
        int stackOut_66_0 = 0;
        vu stackOut_91_0 = null;
        vu stackOut_93_0 = null;
        int stackOut_93_1 = 0;
        vu stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        vu stackOut_87_0 = null;
        boolean stackOut_87_1 = false;
        vu stackOut_89_0 = null;
        boolean stackOut_89_1 = false;
        int stackOut_89_2 = 0;
        vu stackOut_88_0 = null;
        boolean stackOut_88_1 = false;
        int stackOut_88_2 = 0;
        vu stackOut_80_0 = null;
        vu stackOut_82_0 = null;
        int stackOut_82_1 = 0;
        vu stackOut_81_0 = null;
        int stackOut_81_1 = 0;
        vu stackOut_95_0 = null;
        vu stackOut_96_0 = null;
        vu stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        vu stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_101_0 = 0;
        String stackOut_143_0 = null;
        Object stackOut_142_0 = null;
        vu stackOut_146_0 = null;
        vu stackOut_148_0 = null;
        int stackOut_148_1 = 0;
        vu stackOut_147_0 = null;
        int stackOut_147_1 = 0;
        vu stackOut_149_0 = null;
        vu stackOut_151_0 = null;
        int stackOut_151_1 = 0;
        vu stackOut_150_0 = null;
        int stackOut_150_1 = 0;
        int stackOut_157_0 = 0;
        int stackOut_156_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_187_0 = 0;
        int stackOut_211_0 = 0;
        int stackOut_210_0 = 0;
        vu stackOut_322_0 = null;
        vu stackOut_324_0 = null;
        int stackOut_324_1 = 0;
        vu stackOut_323_0 = null;
        int stackOut_323_1 = 0;
        vu stackOut_318_0 = null;
        boolean stackOut_318_1 = false;
        vu stackOut_320_0 = null;
        boolean stackOut_320_1 = false;
        int stackOut_320_2 = 0;
        vu stackOut_319_0 = null;
        boolean stackOut_319_1 = false;
        int stackOut_319_2 = 0;
        vu stackOut_310_0 = null;
        vu stackOut_311_0 = null;
        vu stackOut_312_0 = null;
        int stackOut_312_1 = 0;
        vu stackOut_313_0 = null;
        int stackOut_313_1 = 0;
        vu stackOut_326_0 = null;
        vu stackOut_327_0 = null;
        vu stackOut_328_0 = null;
        int stackOut_328_1 = 0;
        vu stackOut_329_0 = null;
        int stackOut_329_1 = 0;
        vu stackOut_124_0 = null;
        vu stackOut_126_0 = null;
        int stackOut_126_1 = 0;
        vu stackOut_125_0 = null;
        int stackOut_125_1 = 0;
        vu stackOut_120_0 = null;
        vu stackOut_122_0 = null;
        int stackOut_122_1 = 0;
        vu stackOut_121_0 = null;
        int stackOut_121_1 = 0;
        vu stackOut_115_0 = null;
        vu stackOut_117_0 = null;
        int stackOut_117_1 = 0;
        vu stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        vu stackOut_128_0 = null;
        vu stackOut_130_0 = null;
        int stackOut_130_1 = 0;
        vu stackOut_129_0 = null;
        int stackOut_129_1 = 0;
        L0: {
          var26 = Kickabout.field_G;
          if (!param3) {
            L1: {
              L2: {
                if (!np.a(99)) {
                  break L2;
                } else {
                  if (param2.field_Cb) {
                    break L2;
                  } else {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              break L1;
            }
            var4_int = stackIn_9_0;
            break L0;
          } else {
            L3: {
              if (hw.field_k) {
                stackOut_3_0 = 0;
                stackIn_4_0 = stackOut_3_0;
                break L3;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L3;
              }
            }
            var4_int = stackIn_4_0;
            break L0;
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
                          sn.field_e = vo.a((byte) -18, gr.field_v, new String[1]);
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
                        field_t = null;
                        break L9;
                      }
                    }
                    if (2 <= rn.field_d.length) {
                      L10: {
                        L11: {
                          if (!param3) {
                            break L11;
                          } else {
                            if (pn.field_t == -1) {
                              break L11;
                            } else {
                              stackOut_51_0 = 1;
                              stackIn_53_0 = stackOut_51_0;
                              break L10;
                            }
                          }
                        }
                        stackOut_52_0 = 0;
                        stackIn_53_0 = stackOut_52_0;
                        break L10;
                      }
                      var6 = stackIn_53_0;
                      if (var6 == 0) {
                        break L5;
                      } else {
                        var7 = pn.field_t;
                        var8_int = 0;
                        L12: while (true) {
                          if (var8_int >= er.field_h.length) {
                            break L6;
                          } else {
                            er.field_h[var8_int] = (byte) 0;
                            var8_int++;
                            continue L12;
                          }
                        }
                      }
                    } else {
                      break L4;
                    }
                  } else {
                    L13: {
                      if (var4_int == 0) {
                        break L13;
                      } else {
                        if (rf.field_c[0][var6 - -1].field_sb == 0) {
                          break L13;
                        } else {
                          if (~param2.field_Wb != ~var6) {
                            var5 = 1;
                            param2.field_Wb = var6;
                            break L13;
                          } else {
                            break L13;
                          }
                        }
                      }
                    }
                    L14: {
                      stackOut_30_0 = rf.field_c[0][var6 - -1];
                      stackIn_32_0 = stackOut_30_0;
                      stackIn_31_0 = stackOut_30_0;
                      if (var4_int == 0) {
                        stackOut_32_0 = (vu) (Object) stackIn_32_0;
                        stackOut_32_1 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        break L14;
                      } else {
                        stackOut_31_0 = (vu) (Object) stackIn_31_0;
                        stackOut_31_1 = 1;
                        stackIn_33_0 = stackOut_31_0;
                        stackIn_33_1 = stackOut_31_1;
                        break L14;
                      }
                    }
                    L15: {
                      stackIn_33_0.field_lb = stackIn_33_1 != 0;
                      if (ui.field_t) {
                        break L15;
                      } else {
                        if (3 != var6) {
                          break L15;
                        } else {
                          rf.field_c[0][1 + var6].field_lb = false;
                          break L15;
                        }
                      }
                    }
                    L16: {
                      stackOut_36_0 = rf.field_c[0][1 + var6];
                      stackIn_38_0 = stackOut_36_0;
                      stackIn_37_0 = stackOut_36_0;
                      if (~param2.field_Wb != ~var6) {
                        stackOut_38_0 = (vu) (Object) stackIn_38_0;
                        stackOut_38_1 = 0;
                        stackIn_39_0 = stackOut_38_0;
                        stackIn_39_1 = stackOut_38_1;
                        break L16;
                      } else {
                        stackOut_37_0 = (vu) (Object) stackIn_37_0;
                        stackOut_37_1 = 1;
                        stackIn_39_0 = stackOut_37_0;
                        stackIn_39_1 = stackOut_37_1;
                        break L16;
                      }
                    }
                    stackIn_39_0.field_I = stackIn_39_1 != 0;
                    var6++;
                    continue L7;
                  }
                }
              } else {
                L17: {
                  if (param1 < -48) {
                    break L17;
                  } else {
                    field_t = null;
                    break L17;
                  }
                }
                if (2 <= rn.field_d.length) {
                  L18: {
                    L19: {
                      if (!param3) {
                        break L19;
                      } else {
                        if (pn.field_t == -1) {
                          break L19;
                        } else {
                          stackOut_17_0 = 1;
                          stackIn_19_0 = stackOut_17_0;
                          break L18;
                        }
                      }
                    }
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L18;
                  }
                  var6 = stackIn_19_0;
                  if (var6 == 0) {
                    break L5;
                  } else {
                    var7 = pn.field_t;
                    var8_int = 0;
                    L20: while (true) {
                      if (var8_int >= er.field_h.length) {
                        break L6;
                      } else {
                        er.field_h[var8_int] = (byte) 0;
                        var8_int++;
                        continue L20;
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
          L21: {
            if (param3) {
              stackOut_60_0 = -1;
              stackIn_61_0 = stackOut_60_0;
              break L21;
            } else {
              stackOut_59_0 = 0;
              stackIn_61_0 = stackOut_59_0;
              break L21;
            }
          }
          var7 = stackIn_61_0;
          L22: while (true) {
            if (~var7 <= ~rn.field_d.length) {
              break L4;
            } else {
              L23: {
                L24: {
                  if (var6 == 0) {
                    break L24;
                  } else {
                    if (pn.field_t == var7) {
                      break L24;
                    } else {
                      stackOut_65_0 = 1;
                      stackIn_67_0 = stackOut_65_0;
                      break L23;
                    }
                  }
                }
                stackOut_66_0 = 0;
                stackIn_67_0 = stackOut_66_0;
                break L23;
              }
              L25: {
                var8_int = stackIn_67_0;
                if (var4_int == 0) {
                  break L25;
                } else {
                  if (rf.field_c[1][var7 + 1].field_sb == 0) {
                    break L25;
                  } else {
                    if (param3) {
                      if (var6 != 0) {
                        break L25;
                      } else {
                        if (-1 == var7) {
                          var9 = 0;
                          L26: while (true) {
                            if (~var9 <= ~er.field_h.length) {
                              break L25;
                            } else {
                              er.field_h[var9] = (byte) 0;
                              var9++;
                              continue L26;
                            }
                          }
                        } else {
                          er.field_h[var7 / 8] = (byte)ek.b((int) er.field_h[var7 / 8], 1 << qj.b(7, var7));
                          break L25;
                        }
                      }
                    } else {
                      var9 = rn.field_d[var7];
                      if (~var9 != ~param2.field_bc) {
                        param2.field_bc = var9;
                        var5 = 1;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
              }
              L27: {
                if (param3) {
                  if (var7 != -1) {
                    L28: {
                      stackOut_91_0 = rf.field_c[1][var7 - -1];
                      stackIn_93_0 = stackOut_91_0;
                      stackIn_92_0 = stackOut_91_0;
                      if ((er.field_h[var7 / 8] & 1 << (var7 & 7)) == 0) {
                        stackOut_93_0 = (vu) (Object) stackIn_93_0;
                        stackOut_93_1 = 0;
                        stackIn_94_0 = stackOut_93_0;
                        stackIn_94_1 = stackOut_93_1;
                        break L28;
                      } else {
                        stackOut_92_0 = (vu) (Object) stackIn_92_0;
                        stackOut_92_1 = 1;
                        stackIn_94_0 = stackOut_92_0;
                        stackIn_94_1 = stackOut_92_1;
                        break L28;
                      }
                    }
                    stackIn_94_0.field_I = stackIn_94_1 != 0;
                    break L27;
                  } else {
                    rf.field_c[1][var7 - -1].field_I = true;
                    var9 = 0;
                    L29: while (true) {
                      if (~rn.field_d.length >= ~var9) {
                        break L27;
                      } else {
                        L30: {
                          stackOut_87_0 = rf.field_c[1][1 + var7];
                          stackOut_87_1 = rf.field_c[1][1 + var7].field_I;
                          stackIn_89_0 = stackOut_87_0;
                          stackIn_89_1 = stackOut_87_1;
                          stackIn_88_0 = stackOut_87_0;
                          stackIn_88_1 = stackOut_87_1;
                          if ((er.field_h[var9 / 8] & 1 << (7 & var9)) != 0) {
                            stackOut_89_0 = (vu) (Object) stackIn_89_0;
                            stackOut_89_1 = stackIn_89_1;
                            stackOut_89_2 = 0;
                            stackIn_90_0 = stackOut_89_0;
                            stackIn_90_1 = stackOut_89_1;
                            stackIn_90_2 = stackOut_89_2;
                            break L30;
                          } else {
                            stackOut_88_0 = (vu) (Object) stackIn_88_0;
                            stackOut_88_1 = stackIn_88_1;
                            stackOut_88_2 = 1;
                            stackIn_90_0 = stackOut_88_0;
                            stackIn_90_1 = stackOut_88_1;
                            stackIn_90_2 = stackOut_88_2;
                            break L30;
                          }
                        }
                        stackIn_90_0.field_I = stackIn_90_1 & stackIn_90_2 != 0;
                        var9++;
                        continue L29;
                      }
                    }
                  }
                } else {
                  L31: {
                    var9 = rn.field_d[var7];
                    stackOut_80_0 = rf.field_c[1][1 + var7];
                    stackIn_82_0 = stackOut_80_0;
                    stackIn_81_0 = stackOut_80_0;
                    if (param2.field_bc != var9) {
                      stackOut_82_0 = (vu) (Object) stackIn_82_0;
                      stackOut_82_1 = 0;
                      stackIn_83_0 = stackOut_82_0;
                      stackIn_83_1 = stackOut_82_1;
                      break L31;
                    } else {
                      stackOut_81_0 = (vu) (Object) stackIn_81_0;
                      stackOut_81_1 = 1;
                      stackIn_83_0 = stackOut_81_0;
                      stackIn_83_1 = stackOut_81_1;
                      break L31;
                    }
                  }
                  stackIn_83_0.field_I = stackIn_83_1 != 0;
                  break L27;
                }
              }
              L32: {
                L33: {
                  stackOut_95_0 = rf.field_c[1][var7 + 1];
                  stackIn_98_0 = stackOut_95_0;
                  stackIn_96_0 = stackOut_95_0;
                  if (var4_int == 0) {
                    break L33;
                  } else {
                    stackOut_96_0 = (vu) (Object) stackIn_96_0;
                    stackIn_98_0 = stackOut_96_0;
                    stackIn_97_0 = stackOut_96_0;
                    if (var8_int != 0) {
                      break L33;
                    } else {
                      stackOut_97_0 = (vu) (Object) stackIn_97_0;
                      stackOut_97_1 = 1;
                      stackIn_99_0 = stackOut_97_0;
                      stackIn_99_1 = stackOut_97_1;
                      break L32;
                    }
                  }
                }
                stackOut_98_0 = (vu) (Object) stackIn_98_0;
                stackOut_98_1 = 0;
                stackIn_99_0 = stackOut_98_0;
                stackIn_99_1 = stackOut_98_1;
                break L32;
              }
              stackIn_99_0.field_lb = stackIn_99_1 != 0;
              var7++;
              continue L22;
            }
          }
        }
        L34: {
          if (param3) {
            stackOut_102_0 = 0;
            stackIn_103_0 = stackOut_102_0;
            break L34;
          } else {
            stackOut_101_0 = 1;
            stackIn_103_0 = stackOut_101_0;
            break L34;
          }
        }
        var6 = stackIn_103_0;
        L35: while (true) {
          if (var6 >= 3) {
            L36: {
              if (!param3) {
                break L36;
              } else {
                if (1 >= ku.field_f) {
                  break L36;
                } else {
                  var6 = 0;
                  L37: while (true) {
                    if (~(ku.field_f - -1) >= ~var6) {
                      break L36;
                    } else {
                      L38: {
                        var29 = rf.field_c[3][var6];
                        if (var4_int == 0) {
                          break L38;
                        } else {
                          if (var29.field_sb == 0) {
                            break L38;
                          } else {
                            lk.field_l = var6;
                            break L38;
                          }
                        }
                      }
                      L39: {
                        if (!var29.field_Q) {
                          break L39;
                        } else {
                          if (var6 <= 0) {
                            break L39;
                          } else {
                            L40: {
                              if (null != oi.field_f) {
                                stackOut_143_0 = oi.field_f[-1 + var6];
                                stackIn_144_0 = stackOut_143_0;
                                break L40;
                              } else {
                                stackOut_142_0 = null;
                                stackIn_144_0 = (String) (Object) stackOut_142_0;
                                break L40;
                              }
                            }
                            var8_ref = stackIn_144_0;
                            if (var8_ref == null) {
                              break L39;
                            } else {
                              sn.field_e = var8_ref;
                              break L39;
                            }
                          }
                        }
                      }
                      L41: {
                        stackOut_146_0 = (vu) var29;
                        stackIn_148_0 = stackOut_146_0;
                        stackIn_147_0 = stackOut_146_0;
                        if (~var6 != ~lk.field_l) {
                          stackOut_148_0 = (vu) (Object) stackIn_148_0;
                          stackOut_148_1 = 0;
                          stackIn_149_0 = stackOut_148_0;
                          stackIn_149_1 = stackOut_148_1;
                          break L41;
                        } else {
                          stackOut_147_0 = (vu) (Object) stackIn_147_0;
                          stackOut_147_1 = 1;
                          stackIn_149_0 = stackOut_147_0;
                          stackIn_149_1 = stackOut_147_1;
                          break L41;
                        }
                      }
                      L42: {
                        stackIn_149_0.field_I = stackIn_149_1 != 0;
                        stackOut_149_0 = (vu) var29;
                        stackIn_151_0 = stackOut_149_0;
                        stackIn_150_0 = stackOut_149_0;
                        if (var4_int == 0) {
                          stackOut_151_0 = (vu) (Object) stackIn_151_0;
                          stackOut_151_1 = 0;
                          stackIn_152_0 = stackOut_151_0;
                          stackIn_152_1 = stackOut_151_1;
                          break L42;
                        } else {
                          stackOut_150_0 = (vu) (Object) stackIn_150_0;
                          stackOut_150_1 = 1;
                          stackIn_152_0 = stackOut_150_0;
                          stackIn_152_1 = stackOut_150_1;
                          break L42;
                        }
                      }
                      stackIn_152_0.field_lb = stackIn_152_1 != 0;
                      var6++;
                      continue L37;
                    }
                  }
                }
              }
            }
            var6 = 0;
            var7 = 0;
            L43: while (true) {
              if (~ss.field_j >= ~var7) {
                L44: {
                  L45: {
                    if (var5 == 0) {
                      break L45;
                    } else {
                      if (!param3) {
                        lu.a(6773, param0);
                        break L45;
                      } else {
                        break L44;
                      }
                    }
                  }
                  break L44;
                }
                return;
              } else {
                L46: {
                  var30 = rf.field_c[var7 + 4];
                  var8 = var30;
                  if (!param3) {
                    stackOut_157_0 = 0;
                    stackIn_158_0 = stackOut_157_0;
                    break L46;
                  } else {
                    stackOut_156_0 = -1;
                    stackIn_158_0 = stackOut_156_0;
                    break L46;
                  }
                }
                var9 = stackIn_158_0;
                L47: while (true) {
                  if (-1 + var30.length <= var9) {
                    var6 = var6 + (255 & rp.field_x[var7]);
                    var7++;
                    continue L43;
                  } else {
                    L48: {
                      var10 = 0;
                      var11 = 0;
                      var12 = 0;
                      var13 = 0;
                      var14 = 0;
                      var15 = 0;
                      if (var4_int == 0) {
                        break L48;
                      } else {
                        if (var9 < 0) {
                          break L48;
                        } else {
                          L49: {
                            if (hm.field_D == null) {
                              break L49;
                            } else {
                              if (null != hm.field_D[var7]) {
                                if ((~sb.field_a & hm.field_D[var7][var9]) <= 0) {
                                  break L49;
                                } else {
                                  var14 = 1;
                                  var15 = ps.a((byte) -126, hm.field_D[var7][var9] & ~sb.field_a);
                                  break L49;
                                }
                              } else {
                                break L49;
                              }
                            }
                          }
                          L50: {
                            if (null == ds.field_h) {
                              break L50;
                            } else {
                              if (null == ds.field_h[var7]) {
                                break L50;
                              } else {
                                if (0 < eq.field_d) {
                                  break L50;
                                } else {
                                  if (!ds.field_h[var7][var9]) {
                                    break L50;
                                  } else {
                                    var10 = 1;
                                    break L50;
                                  }
                                }
                              }
                            }
                          }
                          L51: {
                            if (lh.field_E == null) {
                              break L51;
                            } else {
                              if (null == lh.field_E[var7]) {
                                break L51;
                              } else {
                                L52: {
                                  var16 = lh.field_E[var7][var9];
                                  if (var16 == 0) {
                                    break L52;
                                  } else {
                                    if (fv.field_d) {
                                      break L52;
                                    } else {
                                      if (eq.field_d <= 0) {
                                        var10 = 1;
                                        break L52;
                                      } else {
                                        break L52;
                                      }
                                    }
                                  }
                                }
                                if (var16 <= 0) {
                                  break L51;
                                } else {
                                  if (var16 <= mi.field_d) {
                                    break L51;
                                  } else {
                                    var12 = 1;
                                    break L51;
                                  }
                                }
                              }
                            }
                          }
                          L53: {
                            L54: {
                              if (!param3) {
                                break L54;
                              } else {
                                if (qd.field_e == null) {
                                  break L54;
                                } else {
                                  if (null == qd.field_e[var7]) {
                                    break L54;
                                  } else {
                                    if (!qd.field_e[var7][var9]) {
                                      break L54;
                                    } else {
                                      stackOut_186_0 = 1;
                                      stackIn_188_0 = stackOut_186_0;
                                      break L53;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_187_0 = 0;
                            stackIn_188_0 = stackOut_187_0;
                            break L53;
                          }
                          var13 = stackIn_188_0;
                          if (null == so.field_f) {
                            break L48;
                          } else {
                            if (null != so.field_f[var7]) {
                              L55: {
                                var16 = so.field_f[var7][var9];
                                if (0 == var16) {
                                  break L55;
                                } else {
                                  if (fv.field_d) {
                                    break L55;
                                  } else {
                                    if (0 >= eq.field_d) {
                                      var10 = 1;
                                      break L55;
                                    } else {
                                      break L55;
                                    }
                                  }
                                }
                              }
                              if (var16 <= 0) {
                                break L48;
                              } else {
                                if (da.field_o < var16) {
                                  var11 = 1;
                                  break L48;
                                } else {
                                  break L48;
                                }
                              }
                            } else {
                              break L48;
                            }
                          }
                        }
                      }
                    }
                    L56: {
                      if (tk.field_Ib < 2) {
                        break L56;
                      } else {
                        if (ne.field_G[12]) {
                          var13 = 0;
                          var10 = 0;
                          var11 = 0;
                          var14 = 0;
                          var12 = 0;
                          break L56;
                        } else {
                          break L56;
                        }
                      }
                    }
                    L57: {
                      L58: {
                        if (var10 != 0) {
                          break L58;
                        } else {
                          if (var11 != 0) {
                            break L58;
                          } else {
                            if (var12 != 0) {
                              break L58;
                            } else {
                              if (var13 != 0) {
                                break L58;
                              } else {
                                if (var14 == 0) {
                                  stackOut_211_0 = 0;
                                  stackIn_212_0 = stackOut_211_0;
                                  break L57;
                                } else {
                                  break L58;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_210_0 = 1;
                      stackIn_212_0 = stackOut_210_0;
                      break L57;
                    }
                    L59: {
                      var16 = stackIn_212_0;
                      tt.field_c = true;
                      if (var16 != 0) {
                        break L59;
                      } else {
                        if (var9 < 0) {
                          break L59;
                        } else {
                          if (la.field_k == null) {
                            break L59;
                          } else {
                            L60: {
                              if (!param3) {
                                break L60;
                              } else {
                                if (hw.field_k) {
                                  break L59;
                                } else {
                                  break L60;
                                }
                              }
                            }
                            L61: {
                              if (null == hm.field_G) {
                                m.field_f = new boolean[ss.field_j];
                                hm.field_G = new byte[ss.field_j];
                                break L61;
                              } else {
                                break L61;
                              }
                            }
                            tt.field_c = false;
                            ee.field_e = false;
                            var17_int = 0;
                            L62: while (true) {
                              if (var7 <= var17_int) {
                                L63: {
                                  pl.a(0, var7, param2, -1, (byte) -125, var9, -1, param3);
                                  if (tk.field_Ib < 2) {
                                    break L63;
                                  } else {
                                    if (ne.field_G[12]) {
                                      tt.field_c = true;
                                      break L63;
                                    } else {
                                      break L63;
                                    }
                                  }
                                }
                                if (tt.field_c) {
                                  break L59;
                                } else {
                                  var16 = 1;
                                  break L59;
                                }
                              } else {
                                m.field_f[var17_int] = false;
                                var17_int++;
                                continue L62;
                              }
                            }
                          }
                        }
                      }
                    }
                    L64: {
                      var17 = var8[1 + var9];
                      if (var4_int == 0) {
                        break L64;
                      } else {
                        if (var17.field_sb == 0) {
                          break L64;
                        } else {
                          if (param3) {
                            if (-1 == var9) {
                              var18 = var6;
                              L65: while (true) {
                                if (var6 - (-var30.length - -1) <= var18) {
                                  break L64;
                                } else {
                                  rf.field_d[var18 / 8] = (byte)qj.b((int) rf.field_d[var18 / 8], ~(1 << qj.b(var18, 7)));
                                  var18++;
                                  continue L65;
                                }
                              }
                            } else {
                              rf.field_d[(var9 + var6) / 8] = (byte)ek.b((int) rf.field_d[(var9 + var6) / 8], 1 << qj.b(var6 + var9, 7));
                              break L64;
                            }
                          } else {
                            if (var16 != 0) {
                              break L64;
                            } else {
                              if (~param2.field_Eb[var7] == ~(byte)var9) {
                                break L64;
                              } else {
                                var5 = 1;
                                param2.field_Eb[var7] = (byte)var9;
                                break L64;
                              }
                            }
                          }
                        }
                      }
                    }
                    L66: {
                      if (!param3) {
                        break L66;
                      } else {
                        if (var16 != 0) {
                          rf.field_d[(var6 + var9) / 8] = (byte)qj.b((int) rf.field_d[(var6 + var9) / 8], ~(1 << qj.b(7, var9 + var6)));
                          break L66;
                        } else {
                          break L66;
                        }
                      }
                    }
                    L67: {
                      if (var9 < 0) {
                        break L67;
                      } else {
                        if (var17.field_Q) {
                          L68: {
                            if (null == oj.field_Q) {
                              var18_ref = null;
                              break L68;
                            } else {
                              if (oj.field_Q[var7] != null) {
                                var18_ref = (Object) (Object) oj.field_Q[var7][var9];
                                break L68;
                              } else {
                                var18_ref = null;
                                break L68;
                              }
                            }
                          }
                          L69: {
                            if (ca.field_g != null) {
                              if (ca.field_g[var7] != null) {
                                var19_ref = ca.field_g[var7][var9];
                                break L69;
                              } else {
                                var19_ref = null;
                                break L69;
                              }
                            } else {
                              var19_ref = null;
                              break L69;
                            }
                          }
                          L70: {
                            var20 = null;
                            if (var19_ref == null) {
                              break L70;
                            } else {
                              if (!var19_ref.equals(var18_ref)) {
                                var20 = (Object) (Object) var19_ref;
                                break L70;
                              } else {
                                break L70;
                              }
                            }
                          }
                          L71: {
                            var21 = null;
                            if (var13 == 0) {
                              if (var10 == 0) {
                                L72: {
                                  if (var11 != 0) {
                                    var22_int = -da.field_o + so.field_f[var7][var9];
                                    if (var22_int != 1) {
                                      var21 = (Object) (Object) vo.a((byte) -18, wq.field_c, new String[1]);
                                      break L72;
                                    } else {
                                      var21 = (Object) (Object) ss.field_d;
                                      break L72;
                                    }
                                  } else {
                                    break L72;
                                  }
                                }
                                L73: {
                                  if (var12 != 0) {
                                    var31 = vo.a((byte) -18, aq.field_h, new String[2]);
                                    var21 = (Object) (Object) var31;
                                    var21 = (Object) (Object) var31;
                                    if (var21 != null) {
                                      var21 = (Object) (Object) (var21 + "<br>" + var31);
                                      break L73;
                                    } else {
                                      var21 = (Object) (Object) var31;
                                      break L73;
                                    }
                                  } else {
                                    break L73;
                                  }
                                }
                                if (var14 != 0) {
                                  L74: {
                                    var22_ref = wv.field_bb;
                                    if (var15 <= 0) {
                                      break L74;
                                    } else {
                                      if (um.field_a == null) {
                                        break L74;
                                      } else {
                                        if (~um.field_a.length > ~var15) {
                                          break L74;
                                        } else {
                                          if (um.field_a[-1 + var15] != null) {
                                            var22_ref = um.field_a[var15 + -1][0];
                                            break L74;
                                          } else {
                                            break L74;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var21 == null) {
                                    var21 = (Object) (Object) var22_ref;
                                    break L71;
                                  } else {
                                    var21 = (Object) (Object) (var21 + "<br>" + var22_ref);
                                    break L71;
                                  }
                                } else {
                                  break L71;
                                }
                              } else {
                                var21 = (Object) (Object) oe.field_n;
                                break L71;
                              }
                            } else {
                              var21 = (Object) (Object) w.field_c;
                              break L71;
                            }
                          }
                          L75: {
                            if (var4_int == 0) {
                              break L75;
                            } else {
                              if (!tt.field_c) {
                                L76: {
                                  var22_ref = null;
                                  if (!ee.field_e) {
                                    break L76;
                                  } else {
                                    var22_ref = "</col>" + qk.field_H + "<col=A00000>";
                                    var25 = var22_ref;
                                    var22_ref = var25;
                                    var25 = var22_ref;
                                    var22_ref = var25;
                                    var21 = (Object) (Object) var22_ref;
                                    break L76;
                                  }
                                }
                                var23 = 0;
                                var24 = 0;
                                L77: while (true) {
                                  if (var7 <= var24) {
                                    if (var23 != 0) {
                                      var21 = (Object) (Object) (nr.field_m + var22_ref);
                                      break L75;
                                    } else {
                                      var21 = (Object) (Object) vo.a((byte) -18, gk.field_d, new String[1]);
                                      break L75;
                                    }
                                  } else {
                                    L78: {
                                      if (!m.field_f[var24]) {
                                        break L78;
                                      } else {
                                        var25 = "</col>" + ok.field_b[var24] + "<col=A00000>";
                                        var22_ref = var25;
                                        var21 = (Object) (Object) var22_ref;
                                        var22_ref = var25;
                                        if (var22_ref == null) {
                                          var22_ref = var25;
                                          var21 = (Object) (Object) var22_ref;
                                          var21 = (Object) (Object) var22_ref;
                                          break L78;
                                        } else {
                                          var23 = 1;
                                          var22_ref = var22_ref + ", " + var25;
                                          break L78;
                                        }
                                      }
                                    }
                                    var24++;
                                    continue L77;
                                  }
                                }
                              } else {
                                break L75;
                              }
                            }
                          }
                          L79: {
                            if (var21 != null) {
                              var32 = "<col=A00000>" + var21;
                              var33 = wj.a("<br>", "<br><col=A00000>", true, var32);
                              if (var20 != null) {
                                var20 = (Object) (Object) (var20 + "<br>" + var33);
                                break L79;
                              } else {
                                var20 = (Object) (Object) var33;
                                break L79;
                              }
                            } else {
                              break L79;
                            }
                          }
                          if (var20 == null) {
                            break L67;
                          } else {
                            sn.field_e = (String) var20;
                            break L67;
                          }
                        } else {
                          break L67;
                        }
                      }
                    }
                    L80: {
                      if (param3) {
                        if (var9 != -1) {
                          L81: {
                            stackOut_322_0 = (vu) var17;
                            stackIn_324_0 = stackOut_322_0;
                            stackIn_323_0 = stackOut_322_0;
                            if ((rf.field_d[(var6 - -var9) / 8] & 1 << (var6 + var9 & 7)) == 0) {
                              stackOut_324_0 = (vu) (Object) stackIn_324_0;
                              stackOut_324_1 = 0;
                              stackIn_325_0 = stackOut_324_0;
                              stackIn_325_1 = stackOut_324_1;
                              break L81;
                            } else {
                              stackOut_323_0 = (vu) (Object) stackIn_323_0;
                              stackOut_323_1 = 1;
                              stackIn_325_0 = stackOut_323_0;
                              stackIn_325_1 = stackOut_323_1;
                              break L81;
                            }
                          }
                          stackIn_325_0.field_I = stackIn_325_1 != 0;
                          break L80;
                        } else {
                          var17.field_I = true;
                          var27 = var6;
                          var18 = var27;
                          L82: while (true) {
                            if (var27 >= var6 - -var30.length + -1) {
                              break L80;
                            } else {
                              L83: {
                                stackOut_318_0 = (vu) var17;
                                stackOut_318_1 = var17.field_I;
                                stackIn_320_0 = stackOut_318_0;
                                stackIn_320_1 = stackOut_318_1;
                                stackIn_319_0 = stackOut_318_0;
                                stackIn_319_1 = stackOut_318_1;
                                if (0 != (rf.field_d[var27 / 8] & 1 << (var27 & 7))) {
                                  stackOut_320_0 = (vu) (Object) stackIn_320_0;
                                  stackOut_320_1 = stackIn_320_1;
                                  stackOut_320_2 = 0;
                                  stackIn_321_0 = stackOut_320_0;
                                  stackIn_321_1 = stackOut_320_1;
                                  stackIn_321_2 = stackOut_320_2;
                                  break L83;
                                } else {
                                  stackOut_319_0 = (vu) (Object) stackIn_319_0;
                                  stackOut_319_1 = stackIn_319_1;
                                  stackOut_319_2 = 1;
                                  stackIn_321_0 = stackOut_319_0;
                                  stackIn_321_1 = stackOut_319_1;
                                  stackIn_321_2 = stackOut_319_2;
                                  break L83;
                                }
                              }
                              stackIn_321_0.field_I = stackIn_321_1 & stackIn_321_2 != 0;
                              var27++;
                              continue L82;
                            }
                          }
                        }
                      } else {
                        L84: {
                          L85: {
                            stackOut_310_0 = (vu) var17;
                            stackIn_313_0 = stackOut_310_0;
                            stackIn_311_0 = stackOut_310_0;
                            if (!tt.field_c) {
                              break L85;
                            } else {
                              stackOut_311_0 = (vu) (Object) stackIn_311_0;
                              stackIn_313_0 = stackOut_311_0;
                              stackIn_312_0 = stackOut_311_0;
                              if ((byte)var9 != param2.field_Eb[var7]) {
                                break L85;
                              } else {
                                stackOut_312_0 = (vu) (Object) stackIn_312_0;
                                stackOut_312_1 = 1;
                                stackIn_314_0 = stackOut_312_0;
                                stackIn_314_1 = stackOut_312_1;
                                break L84;
                              }
                            }
                          }
                          stackOut_313_0 = (vu) (Object) stackIn_313_0;
                          stackOut_313_1 = 0;
                          stackIn_314_0 = stackOut_313_0;
                          stackIn_314_1 = stackOut_313_1;
                          break L84;
                        }
                        stackIn_314_0.field_I = stackIn_314_1 != 0;
                        break L80;
                      }
                    }
                    L86: {
                      L87: {
                        stackOut_326_0 = (vu) var17;
                        stackIn_329_0 = stackOut_326_0;
                        stackIn_327_0 = stackOut_326_0;
                        if (var4_int == 0) {
                          break L87;
                        } else {
                          stackOut_327_0 = (vu) (Object) stackIn_327_0;
                          stackIn_329_0 = stackOut_327_0;
                          stackIn_328_0 = stackOut_327_0;
                          if (var16 != 0) {
                            break L87;
                          } else {
                            stackOut_328_0 = (vu) (Object) stackIn_328_0;
                            stackOut_328_1 = 1;
                            stackIn_330_0 = stackOut_328_0;
                            stackIn_330_1 = stackOut_328_1;
                            break L86;
                          }
                        }
                      }
                      stackOut_329_0 = (vu) (Object) stackIn_329_0;
                      stackOut_329_1 = 0;
                      stackIn_330_0 = stackOut_329_0;
                      stackIn_330_1 = stackOut_329_1;
                      break L86;
                    }
                    stackIn_330_0.field_lb = stackIn_330_1 != 0;
                    var9++;
                    continue L47;
                  }
                }
              }
            }
          } else {
            L88: {
              var28 = rf.field_c[2][var6];
              if (var4_int == 0) {
                break L88;
              } else {
                if (0 == var28.field_sb) {
                  break L88;
                } else {
                  if (param3) {
                    if (var6 == 0) {
                      ru.field_C = 0;
                      break L88;
                    } else {
                      ru.field_C = ru.field_C ^ var6;
                      break L88;
                    }
                  } else {
                    if (param2.field_Mb != var6) {
                      var5 = 1;
                      param2.field_Mb = var6;
                      break L88;
                    } else {
                      break L88;
                    }
                  }
                }
              }
            }
            L89: {
              if (param3) {
                if (var6 == 0) {
                  L90: {
                    stackOut_124_0 = (vu) var28;
                    stackIn_126_0 = stackOut_124_0;
                    stackIn_125_0 = stackOut_124_0;
                    if (0 != ru.field_C) {
                      stackOut_126_0 = (vu) (Object) stackIn_126_0;
                      stackOut_126_1 = 0;
                      stackIn_127_0 = stackOut_126_0;
                      stackIn_127_1 = stackOut_126_1;
                      break L90;
                    } else {
                      stackOut_125_0 = (vu) (Object) stackIn_125_0;
                      stackOut_125_1 = 1;
                      stackIn_127_0 = stackOut_125_0;
                      stackIn_127_1 = stackOut_125_1;
                      break L90;
                    }
                  }
                  stackIn_127_0.field_I = stackIn_127_1 != 0;
                  break L89;
                } else {
                  L91: {
                    stackOut_120_0 = (vu) var28;
                    stackIn_122_0 = stackOut_120_0;
                    stackIn_121_0 = stackOut_120_0;
                    if ((ru.field_C & var6) == 0) {
                      stackOut_122_0 = (vu) (Object) stackIn_122_0;
                      stackOut_122_1 = 0;
                      stackIn_123_0 = stackOut_122_0;
                      stackIn_123_1 = stackOut_122_1;
                      break L91;
                    } else {
                      stackOut_121_0 = (vu) (Object) stackIn_121_0;
                      stackOut_121_1 = 1;
                      stackIn_123_0 = stackOut_121_0;
                      stackIn_123_1 = stackOut_121_1;
                      break L91;
                    }
                  }
                  stackIn_123_0.field_I = stackIn_123_1 != 0;
                  break L89;
                }
              } else {
                L92: {
                  stackOut_115_0 = (vu) var28;
                  stackIn_117_0 = stackOut_115_0;
                  stackIn_116_0 = stackOut_115_0;
                  if ((param2.field_Mb & var6) == 0) {
                    stackOut_117_0 = (vu) (Object) stackIn_117_0;
                    stackOut_117_1 = 0;
                    stackIn_118_0 = stackOut_117_0;
                    stackIn_118_1 = stackOut_117_1;
                    break L92;
                  } else {
                    stackOut_116_0 = (vu) (Object) stackIn_116_0;
                    stackOut_116_1 = 1;
                    stackIn_118_0 = stackOut_116_0;
                    stackIn_118_1 = stackOut_116_1;
                    break L92;
                  }
                }
                stackIn_118_0.field_I = stackIn_118_1 != 0;
                break L89;
              }
            }
            L93: {
              stackOut_128_0 = (vu) var28;
              stackIn_130_0 = stackOut_128_0;
              stackIn_129_0 = stackOut_128_0;
              if (var4_int == 0) {
                stackOut_130_0 = (vu) (Object) stackIn_130_0;
                stackOut_130_1 = 0;
                stackIn_131_0 = stackOut_130_0;
                stackIn_131_1 = stackOut_130_1;
                break L93;
              } else {
                stackOut_129_0 = (vu) (Object) stackIn_129_0;
                stackOut_129_1 = 1;
                stackIn_131_0 = stackOut_129_0;
                stackIn_131_1 = stackOut_129_1;
                break L93;
              }
            }
            stackIn_131_0.field_lb = stackIn_131_1 != 0;
            var6++;
            continue L35;
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
                if (var4 != 2) {
                  break L2;
                } else {
                  var5_int = mu.a(12, qq.g((byte) -17), ls.g(-26370), ev.h(10326), he.a(320), la.b(820907312), ((ma) this).field_r);
                  if (var5_int != -1) {
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
                if (var4 != 3) {
                  break L3;
                } else {
                  L4: {
                    if (es.field_h == -1) {
                      break L4;
                    } else {
                      if (es.field_h != 0) {
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
                    var5_int = js.a(0, ls.g(-26370), ((ma) this).field_o, false, ev.h(10326), ((ma) this).field_r);
                    if (var5_int == -1) {
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
                if (var4 != 4) {
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
                  ((ma) this).field_u = -76;
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
                if (var4 != 12) {
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
                          rk.field_d = new u(oo.field_c, new java.net.URL(((ma) this).getCodeBase(), "countrylist.ws"), 5000);
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
                              var9 = null;
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
                      bd.a("S1", (Throwable) (Object) var5, 1);
                      var10 = null;
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
              if (var4 != 16) {
                if (var4 == 17) {
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
        Object var10 = null;
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
          try {
            L0: {
              if (((ma) this).d((byte) 118)) {
                L1: {
                  L2: {
                    ((ma) this).field_z = ((ma) this).getCodeBase().getHost();
                    var6_ref2 = ((ma) this).field_z.toLowerCase();
                    stackOut_2_0 = this;
                    stackIn_5_0 = stackOut_2_0;
                    stackIn_3_0 = stackOut_2_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_6_0 = this;
                        stackOut_6_1 = 0;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        break L1;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_5_0 = stackOut_4_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_5_0 = this;
                  stackOut_5_1 = 1;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  break L1;
                }
                L3: {
                  ((ma) this).field_o = stackIn_7_1 != 0;
                  ((ma) this).field_s = Integer.parseInt(((ma) this).getParameter("gameport1"));
                  ((ma) this).field_u = Integer.parseInt(((ma) this).getParameter("gameport2"));
                  var7 = ((ma) this).getParameter("servernum");
                  if (var7 != null) {
                    ((ma) this).field_x = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((ma) this).field_B = Integer.parseInt(((ma) this).getParameter("gamecrc"));
                  ((ma) this).field_v = Long.parseLong(((ma) this).getParameter("instanceid"));
                  ((ma) this).field_A = ((ma) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((ma) this).getParameter("lang");
                  if (var8 != null) {
                    ((ma) this).field_p = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (param4 < -78) {
                    break L5;
                  } else {
                    ((ma) this).i(38);
                    break L5;
                  }
                }
                L6: {
                  if (((ma) this).field_p >= 5) {
                    ((ma) this).field_p = 0;
                    break L6;
                  } else {
                    break L6;
                  }
                }
                L7: {
                  var9 = ((ma) this).getParameter("affid");
                  if (var9 != null) {
                    ((ma) this).field_r = Integer.parseInt(var9);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                o.field_d = Boolean.valueOf(((ma) this).getParameter("simplemode")).booleanValue();
                ((ma) this).a(param1, param3, ((ma) this).field_B, (byte) -126, param2, param0, 32);
                break L0;
              } else {
                return;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L8: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              bd.a((String) null, (Throwable) (Object) var6, 1);
              ((ma) this).a((byte) 87, "crash");
              break L8;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6_ref;
            stackOut_25_1 = new StringBuilder().append("ma.BB(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void k(int param0) {
        if (!(!kd.field_s)) {
            on.g(on.field_b, on.field_e, on.field_c + -on.field_b, on.field_h + -on.field_e);
            qa.field_E.a(46, false);
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
        int var6 = 0;
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
              if (var2 != -1) {
                L0: {
                  if (0 == var2) {
                    break L0;
                  } else {
                    if (var2 != 1) {
                      L1: {
                        if (!kr.field_e) {
                          ((ma) this).a((byte) 61, "reconnect");
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      ws.a((byte) -74);
                      fc.a(gd.field_b, var2, 71);
                      fc.field_d = true;
                      ua.field_g = nj.a(121) + 15000L;
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (vj.field_c != 11) {
                    break L2;
                  } else {
                    if (es.field_h != 0) {
                      break L2;
                    } else {
                      bd.e(-1);
                      break L2;
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
