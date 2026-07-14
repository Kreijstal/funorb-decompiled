/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class fn extends kc {
    private int field_r;
    private int field_w;
    private int field_E;
    static int field_t;
    private int field_v;
    static int field_s;
    private boolean field_q;
    private boolean field_z;
    static String field_A;
    private long field_y;
    private int field_C;
    private int field_x;
    static String[] field_u;
    String field_D;
    private boolean field_B;

    private final void p(int param0) {
        ov.field_e[1] = 16;
        ov.field_e[13] = -1;
        ov.field_e[16] = -1;
        ov.field_e[4] = -1;
        ov.field_e[9] = param0;
        ov.field_e[6] = -2;
        ov.field_e[12] = -1;
        ov.field_e[10] = -1;
        ov.field_e[11] = -1;
        ov.field_e[5] = -1;
        ov.field_e[17] = -1;
        ov.field_e[18] = 1;
        ov.field_e[3] = -1;
        ov.field_e[7] = -1;
        ov.field_e[2] = -2;
        ov.field_e[8] = -2;
    }

    private final void d(byte param0) {
        if (param0 != 68) {
            return;
        }
        wp.field_z[5] = true;
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_27_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_112_1 = 0;
        int stackIn_113_0 = 0;
        int stackIn_113_1 = 0;
        String stackIn_113_2 = null;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        String stackIn_114_2 = null;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        String stackIn_115_2 = null;
        int stackIn_115_3 = 0;
        int stackIn_143_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_111_1 = 0;
        int stackOut_110_0 = 0;
        int stackOut_110_1 = 0;
        int stackOut_112_0 = 0;
        int stackOut_112_1 = 0;
        String stackOut_112_2 = null;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        String stackOut_114_2 = null;
        int stackOut_114_3 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        String stackOut_113_2 = null;
        int stackOut_113_3 = 0;
        int stackOut_142_0 = 0;
        int stackOut_141_0 = 0;
        L0: {
          var5 = Sumoblitz.field_L ? 1 : 0;
          if (vv.field_b != null) {
            L1: {
              if (null == gk.field_o) {
                var6 = km.c(false);
                var4 = var6.getSize();
                vv.field_b.a(var4.height, var4.width, (byte) -123);
                break L1;
              } else {
                break L1;
              }
            }
            vv.field_b.d(2);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          c.a((byte) 124);
          au.d(123);
          if (in.g(-66)) {
            break L2;
          } else {
            if (11 == jv.field_a) {
              break L2;
            } else {
              ip.d(1886067877);
              break L2;
            }
          }
        }
        L3: {
          if (null != as.field_w) {
            pn.field_r = as.field_w.a(-88);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1 < -97) {
            break L4;
          } else {
            ((fn) this).field_D = null;
            break L4;
          }
        }
        L5: {
          if (nt.a((byte) 90)) {
            L6: {
              var3 = 1200 * vm.a(-79);
              if (((fn) this).field_B) {
                break L6;
              } else {
                if (var3 >= df.a((byte) 114)) {
                  break L5;
                } else {
                  if (za.c(false) > var3) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((fn) this).field_B = false;
            kk.a((byte) -112);
            we.a((byte) 16);
            rj.a((byte) 87, 2, ab.field_d);
            ha.a(-36);
            ts.field_d = true;
            sj.field_a = 15000L + wq.a(-96);
            break L5;
          } else {
            break L5;
          }
        }
        L7: {
          L8: {
            if (gr.field_l == 0) {
              break L8;
            } else {
              if (-1 != gr.field_l) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (gr.field_l != -1) {
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L9;
            } else {
              stackOut_25_0 = 1;
              stackIn_27_0 = stackOut_25_0;
              break L9;
            }
          }
          var3 = stackIn_27_0;
          gr.field_l = cs.g(-5);
          if (var3 != 0) {
            if (0 != gr.field_l) {
              if (0 == gr.field_l) {
                break L7;
              } else {
                sj.field_a = wq.a(-47) + 15000L;
                break L7;
              }
            } else {
              if (0 == gr.field_l) {
                break L7;
              } else {
                if (0 == gr.field_l) {
                  break L7;
                } else {
                  sj.field_a = wq.a(-47) + 15000L;
                  break L7;
                }
              }
            }
          } else {
            if (0 != gr.field_l) {
              if (0 == gr.field_l) {
                break L7;
              } else {
                sj.field_a = wq.a(-47) + 15000L;
                break L7;
              }
            } else {
              if (0 == gr.field_l) {
                break L7;
              } else {
                if (0 == gr.field_l) {
                  break L7;
                } else {
                  sj.field_a = wq.a(-47) + 15000L;
                  break L7;
                }
              }
            }
          }
        }
        L10: {
          if (gr.field_l == -1) {
            break L10;
          } else {
            if (gr.field_l != 0) {
              if (mp.field_a > -11) {
                if (3 != gr.field_l) {
                  if (-5 != (gr.field_l ^ -1)) {
                    if (gr.field_l != -3) {
                      if (-6 != gr.field_l) {
                        ((fn) this).a("js5connect", 21253);
                        break L10;
                      } else {
                        ((fn) this).a("outofdate", 21253);
                        break L10;
                      }
                    } else {
                      ((fn) this).a("js5connect_full", 21253);
                      break L10;
                    }
                  } else {
                    ((fn) this).a("js5io", 21253);
                    break L10;
                  }
                } else {
                  ((fn) this).a("js5crc", 21253);
                  break L10;
                }
              } else {
                if (10 <= jv.field_a) {
                  L11: {
                    we.a((byte) 70);
                    if (gr.field_l == 3) {
                      rj.a((byte) -97, 256, o.field_a);
                      break L11;
                    } else {
                      if (-5 == gr.field_l) {
                        rj.a((byte) 61, 256, eg.field_n);
                        break L11;
                      } else {
                        if ((gr.field_l ^ -1) == -3) {
                          rj.a((byte) 90, 256, bn.field_O);
                          break L11;
                        } else {
                          if (gr.field_l == 5) {
                            rj.a((byte) -113, 5, s.field_k);
                            break L11;
                          } else {
                            rj.a((byte) -97, 256, ao.field_z);
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  ts.field_d = true;
                  break L10;
                } else {
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
              if (0 == (gr.field_l ^ -1)) {
                break L14;
              } else {
                if (gr.field_l != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (en.a(-23517)) {
              break L13;
            } else {
              break L12;
            }
          }
          if ((wq.a(-87) ^ -1L) <= (sj.field_a ^ -1L)) {
            ts.field_d = false;
            if (-1 == gr.field_l) {
              break L12;
            } else {
              if (0 != gr.field_l) {
                gr.field_l = -1;
                ic.a(4);
                break L12;
              } else {
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (gr.field_l != 0) {
            break L15;
          } else {
            if (!en.a(-23517)) {
              ch.field_h = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (mp.field_a != 0) {
            break L16;
          } else {
            if (f.d((byte) 63)) {
              mp.field_a = 1;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (mp.field_a == -2) {
            L18: {
              if (-1 == dk.field_c) {
                break L18;
              } else {
                hd.field_H = wd.a(u.field_P, (byte) 125);
                break L18;
              }
            }
            wd.field_j = ve.a(11880, true, pn.field_i, 1, false);
            eb.field_f = ve.a(11880, true, pp.field_h, 1, false);
            hw.field_a = ve.a(11880, true, ra.field_f, 1, false);
            pi.field_c = wd.field_j;
            mp.field_a = 2;
            vb.field_J = eb.field_f;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if ((mp.field_a ^ -1) == -3) {
            L20: {
              if (null != hd.field_H) {
                if (!hd.field_H.b((byte) 127)) {
                  break L20;
                } else {
                  if (!hd.field_H.b((byte) -99, "")) {
                    hd.field_H = null;
                    break L20;
                  } else {
                    if (!hd.field_H.a("", 100)) {
                      break L20;
                    } else {
                      ni.a(7, hd.field_H);
                      hd.field_H = null;
                      ls.b(0);
                      break L20;
                    }
                  }
                }
              } else {
                break L20;
              }
            }
            if (hd.field_H != null) {
              break L19;
            } else {
              mp.field_a = 3;
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (3 == mp.field_a) {
            if (!rd.a(eb.field_f, (byte) 124, hw.field_a, wd.field_j)) {
              break L21;
            } else {
              if (wc.a(hw.field_a, 40)) {
                L22: {
                  L23: {
                    ph.a((byte) -93);
                    th.e(true);
                    pu.field_m = false;
                    hn.field_k = li.field_y;
                    ea.a(hw.field_a, qn.field_a, (byte) 40, eb.field_f, wd.field_j);
                    if (hv.field_c) {
                      break L23;
                    } else {
                      if (st.field_B != null) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    stackOut_109_0 = 1;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_110_0 = stackOut_109_0;
                    if (hv.field_c) {
                      stackOut_111_0 = stackIn_111_0;
                      stackOut_111_1 = 0;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      break L24;
                    } else {
                      stackOut_110_0 = stackIn_110_0;
                      stackOut_110_1 = 1;
                      stackIn_112_0 = stackOut_110_0;
                      stackIn_112_1 = stackOut_110_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_112_0 = stackIn_112_0;
                    stackOut_112_1 = stackIn_112_1;
                    stackOut_112_2 = st.field_B;
                    stackIn_114_0 = stackOut_112_0;
                    stackIn_114_1 = stackOut_112_1;
                    stackIn_114_2 = stackOut_112_2;
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    stackIn_113_2 = stackOut_112_2;
                    if (hv.field_c) {
                      stackOut_114_0 = stackIn_114_0;
                      stackOut_114_1 = stackIn_114_1;
                      stackOut_114_2 = (String) (Object) stackIn_114_2;
                      stackOut_114_3 = 0;
                      stackIn_115_0 = stackOut_114_0;
                      stackIn_115_1 = stackOut_114_1;
                      stackIn_115_2 = stackOut_114_2;
                      stackIn_115_3 = stackOut_114_3;
                      break L25;
                    } else {
                      stackOut_113_0 = stackIn_113_0;
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = (String) (Object) stackIn_113_2;
                      stackOut_113_3 = 1;
                      stackIn_115_0 = stackOut_113_0;
                      stackIn_115_1 = stackOut_113_1;
                      stackIn_115_2 = stackOut_113_2;
                      stackIn_115_3 = stackOut_113_3;
                      break L25;
                    }
                  }
                  ea.a(stackIn_115_0, stackIn_115_1 != 0, stackIn_115_2, stackIn_115_3 != 0);
                  break L22;
                }
                L26: {
                  if (!gn.field_b) {
                    break L26;
                  } else {
                    vi.e(4);
                    break L26;
                  }
                }
                L27: {
                  if (hh.field_d != null) {
                    break L27;
                  } else {
                    hh.field_d = ea.a(14263);
                    ur.field_O = cv.e(false);
                    break L27;
                  }
                }
                ss.a(hh.field_d, (byte) 127, hw.field_a, ur.field_O);
                hw.field_a = null;
                eb.field_f = null;
                wd.field_j = null;
                si.a((java.applet.Applet) this, (byte) -96);
                ls.b(0);
                mp.field_a = 10;
                break L21;
              } else {
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (mp.field_a != -11) {
            break L28;
          } else {
            L29: {
              if (0 == dk.field_c) {
                break L29;
              } else {
                vf.field_a = wd.a(ak.field_f, (byte) 125);
                break L29;
              }
            }
            mp.field_a = 11;
            break L28;
          }
        }
        L30: {
          if (-12 != mp.field_a) {
            break L30;
          } else {
            L31: {
              if (vf.field_a == null) {
                break L31;
              } else {
                L32: {
                  if (!vf.field_a.b((byte) 127)) {
                    break L32;
                  } else {
                    if (vf.field_a.a(true)) {
                      break L31;
                    } else {
                      break L32;
                    }
                  }
                }
                pe.a(20, 0.0f, lq.a(117, mm.field_c, ek.field_k, vf.field_a));
                break L30;
              }
            }
            ml.field_u = true;
            mp.field_a = 12;
            break L30;
          }
        }
        L33: {
          if (mp.field_a == 12) {
            if (!ml.field_u) {
              mp.field_a = 13;
              break L33;
            } else {
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if (mp.field_a == 13) {
            L35: {
              var3 = 1;
              if (ih.field_a == null) {
                break L35;
              } else {
                L36: {
                  if (!ih.field_a.a(100)) {
                    stackOut_142_0 = 0;
                    stackIn_143_0 = stackOut_142_0;
                    break L36;
                  } else {
                    stackOut_141_0 = 1;
                    stackIn_143_0 = stackOut_141_0;
                    break L36;
                  }
                }
                var3 = stackIn_143_0;
                pe.a(20, ih.field_a.field_d, ih.field_a.field_f);
                break L35;
              }
            }
            if (var3 == 0) {
              break L34;
            } else {
              mp.field_a = 20;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param0) {
            break L37;
          } else {
            if (aj.field_A) {
              wr.a(true, qn.field_f);
              ((fn) this).e(1000);
              db.a(false, qn.field_f);
              break L37;
            } else {
              break L37;
            }
          }
        }
        L38: {
          if (wp.field_z[8]) {
            qi.a(8);
            break L38;
          } else {
            break L38;
          }
        }
    }

    private final int c(byte param0) {
        if (!(!((fn) this).field_d)) {
            return -1;
        }
        if (!en.a(-23517)) {
            return -1;
        }
        if (ts.field_d) {
            return -1;
        }
        int var2 = jb.a(gi.c((byte) -2), ((fn) this).field_z, (byte) 56, true, ((fn) this).field_w, rw.c((byte) -97));
        if (!(-1 != var2)) {
            return -1;
        }
        if (param0 >= -38) {
            return 99;
        }
        if (0 != var2) {
            // if_icmpeq L88
        } else {
            if (jv.field_a == 11) {
                if (!(-1 != (gr.field_l ^ -1))) {
                    ov.b(2);
                }
            }
            return var2;
        }
        if (!nl.field_o) {
            ((fn) this).a("reconnect", 21253);
        }
        we.a((byte) 63);
        rj.a((byte) 114, var2, ns.field_c);
        ts.field_d = true;
        sj.field_a = 15000L + wq.a(-50);
        return var2;
    }

    private final void n(int param0) {
        wp.field_z[param0] = true;
    }

    final void m(int param0) {
        int var3 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (param0 > 94) {
            break L0;
          } else {
            field_A = null;
            break L0;
          }
        }
        L1: {
          if (we.g(-1)) {
            L2: {
              stackOut_9_0 = this;
              stackOut_9_1 = 16981;
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              if (gk.field_o == null) {
                stackOut_11_0 = this;
                stackOut_11_1 = stackIn_11_1;
                stackOut_11_2 = 0;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                stackIn_12_2 = stackOut_11_2;
                break L2;
              } else {
                stackOut_10_0 = this;
                stackOut_10_1 = stackIn_10_1;
                stackOut_10_2 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                break L2;
              }
            }
            int discarded$122 = this.a(stackIn_12_1, stackIn_12_2 != 0, false);
            break L1;
          } else {
            if ((mp.field_a ^ -1) > -11) {
              break L1;
            } else {
              if (!lf.b(-251)) {
                rm.a((byte) 126);
                break L1;
              } else {
                if (jv.field_a != 0) {
                  rg.a((byte) 55, pn.field_r);
                  break L1;
                } else {
                  int discarded$123 = this.a(16981, false, false);
                  break L1;
                }
              }
            }
          }
        }
    }

    final void q(int param0) {
        int var2 = 0;
        br var3 = null;
        int var4 = 0;
        int stackIn_28_0 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 9289) {
          L0: {
            var2 = iw.field_a;
            if (-65 >= (var2 ^ -1)) {
              break L0;
            } else {
              if (wp.field_z[var2]) {
                if (0 == var2) {
                  return;
                } else {
                  L1: {
                    if (var2 != -2) {
                      if (-3 == var2) {
                        ue.a((byte) -70);
                        break L1;
                      } else {
                        if (var2 == 3) {
                          b.a(-30084);
                          break L1;
                        } else {
                          if (-5 != (var2 ^ -1)) {
                            if (var2 != 5) {
                              if (var2 != 6) {
                                if (-8 != (var2 ^ -1)) {
                                  if (var2 != -9) {
                                    if (-17 == var2) {
                                      we.e((byte) -93);
                                      break L1;
                                    } else {
                                      L2: {
                                        if (11 == var2) {
                                          break L2;
                                        } else {
                                          if ((var2 ^ -1) != -13) {
                                            if (var2 != 13) {
                                              if (-18 == (var2 ^ -1)) {
                                                this.f((byte) -76);
                                                break L1;
                                              } else {
                                                if (var2 == 18) {
                                                  bq.a(8192);
                                                  break L1;
                                                } else {
                                                  ms.a("MGS1: " + di.b((byte) -22), (Throwable) null, 0);
                                                  kk.a((byte) -128);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              js.f((byte) 117);
                                              break L1;
                                            }
                                          } else {
                                            break L2;
                                          }
                                        }
                                      }
                                      L3: {
                                        if (var2 != 12) {
                                          stackOut_27_0 = 0;
                                          stackIn_28_0 = stackOut_27_0;
                                          break L3;
                                        } else {
                                          stackOut_26_0 = 1;
                                          stackIn_28_0 = stackOut_26_0;
                                          break L3;
                                        }
                                      }
                                      var3 = r.a(stackIn_28_0 != 0, (byte) -62);
                                      nn.a(var3, (byte) 60);
                                      break L1;
                                    }
                                  } else {
                                    ro.a((byte) 127, (fs) (Object) ig.field_a, lt.field_m, gu.field_d);
                                    break L1;
                                  }
                                } else {
                                  this.o(-1);
                                  break L1;
                                }
                              } else {
                                vi.c((byte) -77);
                                break L1;
                              }
                            } else {
                              ar.e((byte) -93);
                              break L1;
                            }
                          } else {
                            pt.a(-22683);
                            break L1;
                          }
                        }
                      }
                    } else {
                      uu.c(false);
                      break L1;
                    }
                  }
                  return;
                }
              } else {
                break L0;
              }
            }
          }
          ms.a("MGS2: " + di.b((byte) 86), (Throwable) null, 0);
          kk.a((byte) -112);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        this.a(false, param0, (byte) 111, param3, param5, param2, param4, param1);
        if (!param6) {
            ((fn) this).m(-95);
        }
    }

    final int a(int param0, boolean param1) {
        if (param0 != -1) {
            return 50;
        }
        return this.a(16981, param1, true);
    }

    private final void o(int param0) {
        String var2 = ls.a((byte) -62);
        if (param0 != -1) {
            return;
        }
        ie.a(61, var2, ra.c(2));
    }

    private final void l(int param0) {
        wp.field_z[2] = true;
        if (param0 != 8) {
            ((fn) this).field_E = 114;
        }
    }

    final int b(boolean param0) {
        int var2 = 0;
        var2 = this.c((byte) -99);
        if (!param0) {
          return -127;
        } else {
          L0: {
            L1: {
              if (var2 == 0) {
                break L1;
              } else {
                if (-2 != (var2 ^ -1)) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (!wp.field_z[1]) {
                break L2;
              } else {
                dq.a((byte) 115, 2);
                break L2;
              }
            }
            L3: {
              if (!wp.field_z[2]) {
                break L3;
              } else {
                vi.a(3, (byte) -73);
                break L3;
              }
            }
            L4: {
              if (!wp.field_z[3]) {
                break L4;
              } else {
                ko.a(0, 4);
                break L4;
              }
            }
            L5: {
              if (!wp.field_z[4]) {
                break L5;
              } else {
                dd.a(28778, 5);
                break L5;
              }
            }
            L6: {
              if (!wp.field_z[5]) {
                break L6;
              } else {
                wm.a(false, 6);
                break L6;
              }
            }
            L7: {
              if (wp.field_z[6]) {
                jl.a(7, param0);
                break L7;
              } else {
                break L7;
              }
            }
            if (wp.field_z[8]) {
              vk.a(-58);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        }
    }

    private final void f(byte param0) {
        int var2 = ig.field_a.e(-31302);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + gu.field_d;
        byte[] var5 = new byte[var4];
        ig.field_a.a(var5, 0, 0, var4);
        if (param0 > -55) {
            ((fn) this).field_w = -30;
        }
        kj.a(-23166, ra.c(2), var3 != 0, uu.a(0, var5));
    }

    final void a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4) {
        if (param2 != 60) {
          return;
        } else {
          L0: {
            this.c(false, -12605);
            if (!param1) {
              break L0;
            } else {
              this.n(1);
              break L0;
            }
          }
          L1: {
            if (param3) {
              this.l(8);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (param4) {
              this.e((byte) 30);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (param0) {
              this.d((byte) 68);
              break L3;
            } else {
              break L3;
            }
          }
          return;
        }
    }

    public static void k(int param0) {
        if (param0 < 79) {
            field_t = -119;
        }
        field_u = null;
        field_A = null;
    }

    final void a(int param0, String param1, int param2) {
        this.a(param0, param2 ^ 480, 640, param1, param2);
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        try {
          if (!((fn) this).i(-1)) {
            return;
          } else {
            L0: {
              L1: {
                ((fn) this).field_D = ((fn) this).getCodeBase().getHost();
                var6_ref = ((fn) this).field_D.toLowerCase();
                stackOut_3_0 = this;
                stackIn_6_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackIn_7_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_7_0 = this;
                    stackOut_7_1 = 0;
                    stackIn_8_0 = stackOut_7_0;
                    stackIn_8_1 = stackOut_7_1;
                    break L0;
                  } else {
                    stackOut_5_0 = this;
                    stackIn_6_0 = stackOut_5_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = this;
              stackOut_6_1 = 1;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              break L0;
            }
            L2: {
              ((fn) this).field_z = stackIn_8_1 != 0;
              if (param1 == 0) {
                break L2;
              } else {
                this.o(-5);
                break L2;
              }
            }
            L3: {
              ((fn) this).field_r = Integer.parseInt(((fn) this).getParameter("gameport1"));
              ((fn) this).field_E = Integer.parseInt(((fn) this).getParameter("gameport2"));
              var7 = ((fn) this).getParameter("servernum");
              if (var7 == null) {
                break L3;
              } else {
                ((fn) this).field_x = Integer.parseInt(var7);
                break L3;
              }
            }
            L4: {
              ((fn) this).field_C = Integer.parseInt(((fn) this).getParameter("gamecrc"));
              ((fn) this).field_y = Long.parseLong(((fn) this).getParameter("instanceid"));
              ((fn) this).field_q = ((fn) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((fn) this).getParameter("lang");
              if (var8 == null) {
                break L4;
              } else {
                ((fn) this).field_v = Integer.parseInt(var8);
                break L4;
              }
            }
            L5: {
              if (-6 < (((fn) this).field_v ^ -1)) {
                break L5;
              } else {
                ((fn) this).field_v = 0;
                break L5;
              }
            }
            L6: {
              var9 = ((fn) this).getParameter("affid");
              if (var9 != null) {
                ((fn) this).field_w = Integer.parseInt(var9);
                break L6;
              } else {
                break L6;
              }
            }
            gn.field_b = Boolean.valueOf(((fn) this).getParameter("simplemode")).booleanValue();
            ((fn) this).a(32, param4, (byte) 44, param2, ((fn) this).field_C, param3, param0);
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        ms.a((String) null, (Throwable) (Object) var6, param1 ^ 0);
        ((fn) this).a("crash", 21253);
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            fs var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Sumoblitz.field_L ? 1 : 0;
                        var4 = sb.a(param1, pn.field_r, dk.field_c, (byte) 81);
                        if (-1 != (var4 ^ -1)) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        throw new IllegalStateException();
                    }
                    case 2: {
                        if (param0 == 16981) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        ((fn) this).field_w = 90;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        if ((var4 ^ -1) != -2) {
                            statePc = 10;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var5_int = tn.a(ht.c(true), 0, qt.a((byte) 21));
                        if (var5_int != -1) {
                            statePc = 7;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        jv.a(var5_int, mn.field_g, ns.field_c, true);
                        ns.field_c = null;
                        mn.field_g = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = li.c(82);
                        if (var11 == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        kd.a(var11.booleanValue(), -80);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (var4 == 2) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var5_int = rs.a(oj.b(-98), gi.c((byte) -2), eu.a((byte) -97), of.c(-86), ((fn) this).field_w, 119, rw.c((byte) -109));
                        if ((var5_int ^ -1) != 0) {
                            statePc = 14;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        Sumoblitz.a(mn.field_g, param0 ^ 16984, var5_int, ns.field_c);
                        ns.field_c = null;
                        mn.field_g = null;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (3 != var4) {
                            statePc = 27;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (0 == (gr.field_l ^ -1)) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (gr.field_l != 0) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        gr.field_l = -1;
                        ic.a(4);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (param2) {
                            statePc = 26;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var5_int = jb.a(gi.c((byte) -2), ((fn) this).field_z, (byte) 21, false, ((fn) this).field_w, rw.c((byte) -124));
                        if (-1 != var5_int) {
                            statePc = 23;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (var5_int == 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        rj.a((byte) -118, var5_int, ns.field_c);
                        ns.field_c = null;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 25: {
                        km.field_k = lb.field_a;
                        ov.b(2);
                        jv.field_a = 10;
                        ms.field_a = false;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 26: {
                        ts.field_d = false;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        if (var4 == 4) {
                            statePc = 29;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        if (qn.field_a) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        ms.field_a = true;
                        jv.field_a = 10;
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 31: {
                        gt.a(-1540, ra.c(param0 ^ 16983));
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (var4 == 5) {
                            statePc = 34;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        jl.a(ra.c(param0 + -16979), false);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (var4 == 6) {
                            statePc = 37;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        if (pu.field_m) {
                            statePc = 39;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        jv.field_a = 10;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if ((var4 ^ -1) == -8) {
                            statePc = 42;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        ic.a(false, ra.c(2));
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (8 == var4) {
                            statePc = 45;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        gt.a(-1540, ra.c(param0 + -16979));
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (9 == var4) {
                            statePc = 48;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        us.a(ra.c(2), (byte) -124);
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if (-11 != var4) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        as.field_v.g(17, param0 ^ 16989);
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (-12 != var4) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        of.a(8192, ra.c(2));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (-13 != var4) {
                            statePc = 55;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        cn.a(f.e(false), ra.c(2), (byte) -103);
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        if (-14 == var4) {
                            statePc = 57;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 57: {
                        try {
                            if (null != ms.field_e) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ms.field_e = new cc(lt.field_m, new java.net.URL(((fn) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (ms.field_e.a((byte) -110)) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var12 = ms.field_e.b((byte) 126);
                            if (var12 != null) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var9 = null;
                            ha.a((byte) 122, (String) null);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var7 = sd.a(var12.field_n, 0, var12.field_p, 26564);
                            ha.a((byte) 115, var7);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            ms.field_e = null;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        var5 = (Exception) (Object) caughtException;
                        ms.a("S1", (Throwable) (Object) var5, 0);
                        var10 = null;
                        ha.a((byte) 111, (String) null);
                        ms.field_e = null;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (15 == var4) {
                            statePc = 69;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        jv.field_a = 10;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 70: {
                        if (var4 == 16) {
                            statePc = 72;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        return 1;
                    }
                    case 73: {
                        if ((var4 ^ -1) == -18) {
                            statePc = 75;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    }
                    case 74: {
                        return 0;
                    }
                    case 75: {
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

    private final void e(byte param0) {
        int var2 = 76 / ((param0 - -76) / 48);
        wp.field_z[4] = true;
    }

    private final void c(boolean param0, int param1) {
        wp.field_z[0] = true;
        wp.field_z[7] = true;
        wp.field_z[18] = true;
        if (param1 != -12605) {
            ((fn) this).q(112);
        }
        wp.field_z[3] = true;
        wp.field_z[8] = param0;
        wp.field_z[17] = true;
        wp.field_z[16] = true;
    }

    protected fn() {
    }

    private final void a(boolean param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        ((fn) this).setBackground(java.awt.Color.black);
        dk.field_c = ((fn) this).field_v;
        jq.a(dk.field_c, 13586);
        tm.a(param0, (byte) 84, lt.field_m, 5000, ((fn) this).field_E, param1, ((fn) this).field_C, ((fn) this).field_r, 5000, ((fn) this).field_D, ((fn) this).field_q, ((fn) this).field_x, dk.field_c, ((fn) this).field_y);
        fs.a(lt.field_m, ((fn) this).field_r, ((fn) this).field_E, ((fn) this).field_D, (byte) -56, ((fn) this).field_C, ((fn) this).field_x, param1, dk.field_c);
        rp.a(false);
        as.field_w = dk.a((byte) -126);
        int var10 = -116 / ((2 - param2) / 36);
        db.a(false, qn.field_f);
        ak.field_f = param7;
        u.field_P = param4;
        pn.field_i = param5;
        ra.field_f = param3;
        pp.field_h = param6;
        this.p(-1);
        wt.c(8193);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 50;
        field_A = "Waiting for sound effects";
    }
}
