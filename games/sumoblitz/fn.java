/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int stackIn_27_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        String stackIn_109_2 = null;
        String stackIn_110_2;
        int stackIn_110_3;
        int stackIn_138_0 = 0;
        int var3;
        java.awt.Dimension var4;
        int var5;
        java.awt.Container var6;
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
            this.field_D = (String) null;
            break L4;
          }
        }
        L5: {
          if (nt.a((byte) 90)) {
            L6: {
              var3 = 1200 * vm.a(-79);
              if (this.field_B) {
                break L6;
              } else {
                if ((var3 ^ -1) <= (df.a((byte) 114) ^ -1)) {
                  break L5;
                } else {
                  if ((za.c(false) ^ -1) < (var3 ^ -1)) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_B = false;
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
            if ((gr.field_l ^ -1) == 0) {
              break L8;
            } else {
              if (-1 != (gr.field_l ^ -1)) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (gr.field_l != -1) {
              stackIn_27_0 = 0;
              break L9;
            } else {
              stackIn_27_0 = 1;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_27_0;
            gr.field_l = cs.g(-5);
            if (var3 == 0) {
              break L10;
            } else {
              if (gr.field_l != 0) {
                break L10;
              } else {
                if (11 != jv.field_a) {
                  break L10;
                } else {
                  if (!en.a(-23517)) {
                    ov.b(2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          if (0 == (gr.field_l ^ -1)) {
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
        L11: {
          if (gr.field_l == -1) {
            break L11;
          } else {
            if (gr.field_l != 0) {
              if ((mp.field_a ^ -1) > -11) {
                if (3 != gr.field_l) {
                  if (-5 != (gr.field_l ^ -1)) {
                    if ((gr.field_l ^ -1) != -3) {
                      if (-6 != (gr.field_l ^ -1)) {
                        this.a("js5connect", 21253);
                        break L11;
                      } else {
                        this.a("outofdate", 21253);
                        break L11;
                      }
                    } else {
                      this.a("js5connect_full", 21253);
                      break L11;
                    }
                  } else {
                    this.a("js5io", 21253);
                    break L11;
                  }
                } else {
                  this.a("js5crc", 21253);
                  break L11;
                }
              } else {
                if (10 <= jv.field_a) {
                  L12: {
                    we.a((byte) 70);
                    if (gr.field_l == 3) {
                      rj.a((byte) -97, 256, o.field_a);
                      break L12;
                    } else {
                      if (-5 == (gr.field_l ^ -1)) {
                        rj.a((byte) 61, 256, eg.field_n);
                        break L12;
                      } else {
                        if ((gr.field_l ^ -1) == -3) {
                          rj.a((byte) 90, 256, bn.field_O);
                          break L12;
                        } else {
                          if (gr.field_l == 5) {
                            rj.a((byte) -113, 5, s.field_k);
                            break L12;
                          } else {
                            rj.a((byte) -97, 256, ao.field_z);
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  ts.field_d = true;
                  break L11;
                } else {
                  break L11;
                }
              }
            } else {
              break L11;
            }
          }
        }
        L13: {
          L14: {
            L15: {
              if (0 == (gr.field_l ^ -1)) {
                break L15;
              } else {
                if (gr.field_l != 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (en.a(-23517)) {
              break L14;
            } else {
              break L13;
            }
          }
          if ((wq.a(-87) ^ -1L) <= (sj.field_a ^ -1L)) {
            ts.field_d = false;
            if (-1 == gr.field_l) {
              break L13;
            } else {
              if (0 != gr.field_l) {
                gr.field_l = -1;
                ic.a(4);
                break L13;
              } else {
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        L16: {
          if (gr.field_l != 0) {
            break L16;
          } else {
            if (!en.a(-23517)) {
              ch.field_h = false;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if ((mp.field_a ^ -1) != -1) {
            break L17;
          } else {
            if (f.d((byte) 63)) {
              mp.field_a = 1;
              break L17;
            } else {
              break L17;
            }
          }
        }
        L18: {
          if ((mp.field_a ^ -1) == -2) {
            L19: {
              if (-1 == (dk.field_c ^ -1)) {
                break L19;
              } else {
                hd.field_H = wd.a(u.field_P, (byte) 125);
                break L19;
              }
            }
            wd.field_j = ve.a(11880, true, pn.field_i, 1, false);
            eb.field_f = ve.a(11880, true, pp.field_h, 1, false);
            hw.field_a = ve.a(11880, true, ra.field_f, 1, false);
            pi.field_c = wd.field_j;
            mp.field_a = 2;
            vb.field_J = eb.field_f;
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if ((mp.field_a ^ -1) == -3) {
            L21: {
              if (null != hd.field_H) {
                if (!hd.field_H.b((byte) 127)) {
                  break L21;
                } else {
                  if (!hd.field_H.b((byte) -99, "")) {
                    hd.field_H = null;
                    break L21;
                  } else {
                    if (!hd.field_H.a("", 100)) {
                      break L21;
                    } else {
                      ni.a(7, hd.field_H);
                      hd.field_H = null;
                      ls.b(0);
                      break L21;
                    }
                  }
                }
              } else {
                break L21;
              }
            }
            if (hd.field_H != null) {
              break L20;
            } else {
              mp.field_a = 3;
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if (3 == mp.field_a) {
            if (!rd.a(eb.field_f, (byte) 124, hw.field_a, wd.field_j)) {
              break L22;
            } else {
              if (wc.a(hw.field_a, 40)) {
                L23: {
                  L24: {
                    ph.a((byte) -93);
                    th.e(true);
                    pu.field_m = false;
                    hn.field_k = li.field_y;
                    ea.a(hw.field_a, qn.field_a, (byte) 40, eb.field_f, wd.field_j);
                    if (hv.field_c) {
                      break L24;
                    } else {
                      if (st.field_B != null) {
                        break L24;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L25: {
                    stackIn_106_0 = 1;

                    if (hv.field_c) {
                      stackIn_107_0 = stackIn_106_0;
                      stackIn_107_1 = 0;
                      break L25;
                    } else {
                      stackIn_107_0 = stackIn_106_0;
                      stackIn_107_1 = 1;
                      break L25;
                    }
                  }
                  L26: {




                    stackIn_109_2 = st.field_B;

                    if (hv.field_c) {


                      stackIn_110_2 = (String) ((Object) stackIn_109_2);
                      stackIn_110_3 = 0;
                      break L26;
                    } else {


                      stackIn_110_2 = (String) ((Object) stackIn_109_2);
                      stackIn_110_3 = 1;
                      break L26;
                    }
                  }
                  ea.a(stackIn_107_0, stackIn_107_1 != 0, stackIn_110_2, stackIn_110_3 != 0);
                  break L23;
                }
                L27: {
                  if (!gn.field_b) {
                    break L27;
                  } else {
                    vi.e(4);
                    break L27;
                  }
                }
                L28: {
                  if (hh.field_d != null) {
                    break L28;
                  } else {
                    hh.field_d = ea.a(14263);
                    ur.field_O = cv.e(false);
                    break L28;
                  }
                }
                ss.a(hh.field_d, (byte) 127, hw.field_a, ur.field_O);
                hw.field_a = null;
                eb.field_f = null;
                wd.field_j = null;
                si.a((java.applet.Applet) (this), (byte) -96);
                ls.b(0);
                mp.field_a = 10;
                break L22;
              } else {
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L29: {
          if ((mp.field_a ^ -1) != -11) {
            break L29;
          } else {
            L30: {
              if (0 == dk.field_c) {
                break L30;
              } else {
                vf.field_a = wd.a(ak.field_f, (byte) 125);
                break L30;
              }
            }
            mp.field_a = 11;
            break L29;
          }
        }
        L31: {
          if (-12 != (mp.field_a ^ -1)) {
            break L31;
          } else {
            L32: {
              if (vf.field_a == null) {
                break L32;
              } else {
                L33: {
                  if (!vf.field_a.b((byte) 127)) {
                    break L33;
                  } else {
                    if (vf.field_a.a(true)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                pe.a(20, 0.0f, lq.a(117, mm.field_c, ek.field_k, vf.field_a));
                break L31;
              }
            }
            ml.field_u = true;
            mp.field_a = 12;
            break L31;
          }
        }
        L34: {
          if (mp.field_a == 12) {
            if (!ml.field_u) {
              mp.field_a = 13;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (mp.field_a == 13) {
            L36: {
              var3 = 1;
              if (ih.field_a == null) {
                break L36;
              } else {
                L37: {
                  if (!ih.field_a.a(100)) {
                    stackIn_138_0 = 0;
                    break L37;
                  } else {
                    stackIn_138_0 = 1;
                    break L37;
                  }
                }
                var3 = stackIn_138_0;
                pe.a(20, ih.field_a.field_d, ih.field_a.field_f);
                break L36;
              }
            }
            if (var3 == 0) {
              break L35;
            } else {
              mp.field_a = 20;
              break L35;
            }
          } else {
            break L35;
          }
        }
        L38: {
          if (param0) {
            break L38;
          } else {
            if (aj.field_A) {
              wr.a(true, qn.field_f);
              this.e(1000);
              db.a(false, qn.field_f);
              break L38;
            } else {
              break L38;
            }
          }
        }
        L39: {
          if (wp.field_z[8]) {
            qi.a(8);
            break L39;
          } else {
            break L39;
          }
        }
    }

    private final int c(byte param0) {
        int var2;
        if (this.field_d) {
          return -1;
        } else {
          if (en.a(-23517)) {
            if (!ts.field_d) {
              var2 = jb.a(gi.c((byte) -2), this.field_z, (byte) 56, true, this.field_w, rw.c((byte) -97));
              if (-1 == var2) {
                return -1;
              } else {
                if (param0 < -38) {
                  L0: {
                    if (0 == var2) {
                      break L0;
                    } else {
                      if (var2 == 1) {
                        break L0;
                      } else {
                        L1: {
                          if (nl.field_o) {
                            break L1;
                          } else {
                            this.a("reconnect", 21253);
                            break L1;
                          }
                        }
                        we.a((byte) 63);
                        rj.a((byte) 114, var2, ns.field_c);
                        ts.field_d = true;
                        sj.field_a = 15000L + wq.a(-50);
                        return var2;
                      }
                    }
                  }
                  L2: {
                    if (jv.field_a != 11) {
                      break L2;
                    } else {
                      if (-1 == (gr.field_l ^ -1)) {
                        ov.b(2);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return var2;
                } else {
                  return 99;
                }
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    private final void n(int param0) {
        wp.field_z[param0] = true;
    }

    final void m(int param0) {
        int discarded$33 = 0;
        int discarded$34 = 0;
        int var3;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          if (param0 > 94) {
            break L0;
          } else {
            field_A = (String) null;
            break L0;
          }
        }
        L1: {
          if (we.g(-1)) {
            L2: {
              stackIn_11_0 = this;

              stackIn_11_1 = 16981;

              if (gk.field_o == null) {
                stackIn_12_0 = this;
                stackIn_12_1 = stackIn_11_1;
                stackIn_12_2 = 0;
                break L2;
              } else {
                stackIn_12_0 = this;
                stackIn_12_1 = stackIn_11_1;
                stackIn_12_2 = 1;
                break L2;
              }
            }
            discarded$33 = this.a(stackIn_12_1, stackIn_12_2 != 0, false);
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
                  discarded$34 = this.a(16981, false, false);
                  break L1;
                }
              }
            }
          }
        }
    }

    final void q(int param0) {
        int stackIn_28_0 = 0;
        int var2;
        br var3;
        int var4;
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
                    if ((var2 ^ -1) != -2) {
                      if (-3 == (var2 ^ -1)) {
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
                                  if ((var2 ^ -1) != -9) {
                                    if (-17 == (var2 ^ -1)) {
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
                                          stackIn_28_0 = 0;
                                          break L3;
                                        } else {
                                          stackIn_28_0 = 1;
                                          break L3;
                                        }
                                      }
                                      var3 = r.a(stackIn_28_0 != 0, (byte) -62);
                                      nn.a(var3, (byte) 60);
                                      break L1;
                                    }
                                  } else {
                                    ro.a((byte) 127, ig.field_a, lt.field_m, gu.field_d);
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
            this.m(-95);
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
            this.field_E = 114;
        }
    }

    final int b(boolean param0) {
        int var2;
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
            this.field_w = -30;
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
        try {
            this.a(param0, param2 ^ 480, 640, param1, param2);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "fn.CA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        String var6 = null;
        Exception var6_ref = null;
        RuntimeException var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        try {
          L0: {
            try {
              L1: {
                if (!this.i(-1)) {
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.field_D = this.getCodeBase().getHost();
                      var6 = this.field_D.toLowerCase();
                      stackIn_6_0 = this;

                      if (var6.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackIn_7_0 = this;

                        if (!var6.endsWith(".jagex.com")) {
                          stackIn_8_0 = this;
                          stackIn_8_1 = 0;
                          break L2;
                        } else {
                          stackIn_6_0 = this;
                          break L3;
                        }
                      }
                    }
                    stackIn_8_0 = this;
                    stackIn_8_1 = 1;
                    break L2;
                  }
                  L4: {
                    ((fn) (this)).field_z = stackIn_8_1 != 0;
                    if (param1 == 0) {
                      break L4;
                    } else {
                      this.o(-5);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_r = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_E = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L5;
                    } else {
                      this.field_x = Integer.parseInt(var7);
                      break L5;
                    }
                  }
                  L6: {
                    this.field_C = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_y = Long.parseLong(this.getParameter("instanceid"));
                    this.field_q = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 == null) {
                      break L6;
                    } else {
                      this.field_v = Integer.parseInt(var8);
                      break L6;
                    }
                  }
                  L7: {
                    if (-6 < (this.field_v ^ -1)) {
                      break L7;
                    } else {
                      this.field_v = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_w = Integer.parseInt(var9);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  gn.field_b = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(32, param4, (byte) 44, param2, this.field_C, param3, param0);
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6_ref = (Exception) (Object) decompiledCaughtException;
                ms.a((String) null, (Throwable) ((Object) var6_ref), param1 ^ 0);
                this.a("crash", 21253);
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
            var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var6_ref2);

            stackIn_25_1 = new StringBuilder().append("fn.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L10;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L10;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            Throwable decompiledCaughtException = null;
            int var4 = 0;
            int var5_int = 0;
            Exception var5 = null;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            fs var12 = null;
            var8 = Sumoblitz.field_L ? 1 : 0;
            var4 = sb.a(param1, pn.field_r, dk.field_c, (byte) 81);
            if (-1 != (var4 ^ -1)) {
              L0: {
                if (param0 == 16981) {
                  break L0;
                } else {
                  this.field_w = 90;
                  break L0;
                }
              }
              L1: {
                if ((var4 ^ -1) != -2) {
                  break L1;
                } else {
                  L2: {
                    var5_int = tn.a(ht.c(true), 0, qt.a((byte) 21));
                    if (var5_int != -1) {
                      jv.a(var5_int, mn.field_g, ns.field_c, true);
                      ns.field_c = null;
                      mn.field_g = null;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var11 = li.c(82);
                  if (var11 == null) {
                    break L1;
                  } else {
                    kd.a(var11.booleanValue(), -80);
                    break L1;
                  }
                }
              }
              L3: {
                if (var4 == 2) {
                  var5_int = rs.a(oj.b(-98), gi.c((byte) -2), eu.a((byte) -97), of.c(-86), this.field_w, 119, rw.c((byte) -109));
                  if ((var5_int ^ -1) != 0) {
                    Sumoblitz.a(mn.field_g, param0 ^ 16984, var5_int, ns.field_c);
                    ns.field_c = null;
                    mn.field_g = null;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if (3 != var4) {
                  break L4;
                } else {
                  L5: {
                    if (0 == (gr.field_l ^ -1)) {
                      break L5;
                    } else {
                      if (gr.field_l != 0) {
                        gr.field_l = -1;
                        ic.a(4);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (param2) {
                    ts.field_d = false;
                    break L4;
                  } else {
                    var5_int = jb.a(gi.c((byte) -2), this.field_z, (byte) 21, false, this.field_w, rw.c((byte) -124));
                    if (-1 != var5_int) {
                      if (var5_int == 0) {
                        km.field_k = lb.field_a;
                        ov.b(2);
                        jv.field_a = 10;
                        ms.field_a = false;
                        break L4;
                      } else {
                        rj.a((byte) -118, var5_int, ns.field_c);
                        ns.field_c = null;
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                }
              }
              L6: {
                if (var4 == 4) {
                  if (qn.field_a) {
                    gt.a(-1540, ra.c(param0 ^ 16983));
                    break L6;
                  } else {
                    ms.field_a = true;
                    jv.field_a = 10;
                    break L6;
                  }
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 == 5) {
                  jl.a(ra.c(param0 + -16979), false);
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                if (var4 == 6) {
                  if (pu.field_m) {
                    jv.field_a = 10;
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if ((var4 ^ -1) == -8) {
                  ic.a(false, ra.c(2));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (8 == var4) {
                  gt.a(-1540, ra.c(param0 + -16979));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (9 == var4) {
                  us.a(ra.c(2), (byte) -124);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (-11 != (var4 ^ -1)) {
                  break L12;
                } else {
                  as.field_v.g(17, param0 ^ 16989);
                  break L12;
                }
              }
              L13: {
                if (-12 != (var4 ^ -1)) {
                  break L13;
                } else {
                  of.a(8192, ra.c(2));
                  break L13;
                }
              }
              L14: {
                if (-13 != (var4 ^ -1)) {
                  break L14;
                } else {
                  cn.a(f.e(false), ra.c(2), (byte) -103);
                  break L14;
                }
              }
              L15: {
                if (-14 == (var4 ^ -1)) {
                  try {
                    L16: {
                      L17: {
                        if (null != ms.field_e) {
                          break L17;
                        } else {
                          ms.field_e = new cc(lt.field_m, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        }
                      }
                      L18: {
                        if (ms.field_e.a((byte) -110)) {
                          L19: {
                            var12 = ms.field_e.b((byte) 126);
                            if (var12 != null) {
                              var7 = sd.a(var12.field_n, 0, var12.field_p, 26564);
                              ha.a((byte) 115, var7);
                              break L19;
                            } else {
                              var9 = (String) null;
                              ha.a((byte) 122, (String) null);
                              break L19;
                            }
                          }
                          ms.field_e = null;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L20: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      ms.a("S1", (Throwable) ((Object) var5), 0);
                      var10 = (String) null;
                      ha.a((byte) 111, (String) null);
                      ms.field_e = null;
                      break L20;
                    }
                  }
                  break L15;
                } else {
                  break L15;
                }
              }
              L21: {
                if (15 == var4) {
                  jv.field_a = 10;
                  break L21;
                } else {
                  break L21;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if ((var4 ^ -1) == -18) {
                  return 2;
                } else {
                  return 0;
                }
              }
            } else {
              throw new IllegalStateException();
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
            this.q(112);
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
        this.setBackground(java.awt.Color.black);
        dk.field_c = this.field_v;
        jq.a(dk.field_c, 13586);
        tm.a(param0, (byte) 84, lt.field_m, 5000, this.field_E, param1, this.field_C, this.field_r, 5000, this.field_D, this.field_q, this.field_x, dk.field_c, this.field_y);
        fs.a(lt.field_m, this.field_r, this.field_E, this.field_D, (byte) -56, this.field_C, this.field_x, param1, dk.field_c);
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
        field_s = 50;
        field_A = "Waiting for sound effects";
    }
}
