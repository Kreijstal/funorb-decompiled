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
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_27_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        int stackIn_117_0 = 0;
        int stackIn_117_1 = 0;
        String stackIn_117_2 = null;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        String stackIn_118_2 = null;
        int stackIn_119_0 = 0;
        int stackIn_119_1 = 0;
        String stackIn_119_2 = null;
        int stackIn_119_3 = 0;
        int stackIn_148_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        String stackOut_116_2 = null;
        int stackOut_118_0 = 0;
        int stackOut_118_1 = 0;
        String stackOut_118_2 = null;
        int stackOut_118_3 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        String stackOut_117_2 = null;
        int stackOut_117_3 = 0;
        int stackOut_147_0 = 0;
        int stackOut_146_0 = 0;
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
              stackOut_26_0 = 0;
              stackIn_27_0 = stackOut_26_0;
              break L9;
            } else {
              stackOut_25_0 = 1;
              stackIn_27_0 = stackOut_25_0;
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
              L12: {
                if ((mp.field_a ^ -1) > -11) {
                  break L12;
                } else {
                  if (10 <= jv.field_a) {
                    L13: {
                      L14: {
                        we.a((byte) 70);
                        if (gr.field_l == 3) {
                          break L14;
                        } else {
                          L15: {
                            if (-5 == (gr.field_l ^ -1)) {
                              break L15;
                            } else {
                              L16: {
                                if ((gr.field_l ^ -1) == -3) {
                                  break L16;
                                } else {
                                  L17: {
                                    if (gr.field_l == 5) {
                                      break L17;
                                    } else {
                                      rj.a((byte) -97, 256, ao.field_z);
                                      if (var5 == 0) {
                                        break L13;
                                      } else {
                                        break L17;
                                      }
                                    }
                                  }
                                  rj.a((byte) -113, 5, s.field_k);
                                  if (var5 == 0) {
                                    break L13;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                              rj.a((byte) 90, 256, bn.field_O);
                              if (var5 == 0) {
                                break L13;
                              } else {
                                break L15;
                              }
                            }
                          }
                          rj.a((byte) 61, 256, eg.field_n);
                          if (var5 == 0) {
                            break L13;
                          } else {
                            break L14;
                          }
                        }
                      }
                      rj.a((byte) -97, 256, o.field_a);
                      break L13;
                    }
                    ts.field_d = true;
                    if (var5 == 0) {
                      break L11;
                    } else {
                      break L12;
                    }
                  } else {
                    break L11;
                  }
                }
              }
              L18: {
                if (3 != gr.field_l) {
                  break L18;
                } else {
                  this.a("js5crc", 21253);
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L18;
                  }
                }
              }
              L19: {
                if (-5 != (gr.field_l ^ -1)) {
                  break L19;
                } else {
                  this.a("js5io", 21253);
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L19;
                  }
                }
              }
              L20: {
                if ((gr.field_l ^ -1) != -3) {
                  break L20;
                } else {
                  this.a("js5connect_full", 21253);
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L20;
                  }
                }
              }
              L21: {
                if (-6 != (gr.field_l ^ -1)) {
                  break L21;
                } else {
                  this.a("outofdate", 21253);
                  if (var5 == 0) {
                    break L11;
                  } else {
                    break L21;
                  }
                }
              }
              this.a("js5connect", 21253);
              break L11;
            } else {
              break L11;
            }
          }
        }
        L22: {
          L23: {
            L24: {
              if (0 == (gr.field_l ^ -1)) {
                break L24;
              } else {
                if (gr.field_l != 0) {
                  break L23;
                } else {
                  break L24;
                }
              }
            }
            if (en.a(-23517)) {
              break L23;
            } else {
              break L22;
            }
          }
          if ((wq.a(-87) ^ -1L) <= (sj.field_a ^ -1L)) {
            ts.field_d = false;
            if (-1 == gr.field_l) {
              break L22;
            } else {
              if (0 != gr.field_l) {
                gr.field_l = -1;
                ic.a(4);
                break L22;
              } else {
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L25: {
          if (gr.field_l != 0) {
            break L25;
          } else {
            if (!en.a(-23517)) {
              ch.field_h = false;
              break L25;
            } else {
              break L25;
            }
          }
        }
        L26: {
          if ((mp.field_a ^ -1) != -1) {
            break L26;
          } else {
            if (f.d((byte) 63)) {
              mp.field_a = 1;
              break L26;
            } else {
              break L26;
            }
          }
        }
        L27: {
          if ((mp.field_a ^ -1) == -2) {
            L28: {
              if (-1 == (dk.field_c ^ -1)) {
                break L28;
              } else {
                hd.field_H = wd.a(u.field_P, (byte) 125);
                break L28;
              }
            }
            wd.field_j = ve.a(11880, true, pn.field_i, 1, false);
            eb.field_f = ve.a(11880, true, pp.field_h, 1, false);
            hw.field_a = ve.a(11880, true, ra.field_f, 1, false);
            pi.field_c = wd.field_j;
            mp.field_a = 2;
            vb.field_J = eb.field_f;
            break L27;
          } else {
            break L27;
          }
        }
        L29: {
          if ((mp.field_a ^ -1) == -3) {
            L30: {
              if (null != hd.field_H) {
                if (!hd.field_H.b((byte) 127)) {
                  break L30;
                } else {
                  L31: {
                    if (!hd.field_H.b((byte) -99, "")) {
                      break L31;
                    } else {
                      if (!hd.field_H.a("", 100)) {
                        break L30;
                      } else {
                        ni.a(7, hd.field_H);
                        hd.field_H = null;
                        ls.b(0);
                        if (var5 == 0) {
                          break L30;
                        } else {
                          break L31;
                        }
                      }
                    }
                  }
                  hd.field_H = null;
                  break L30;
                }
              } else {
                break L30;
              }
            }
            if (hd.field_H != null) {
              break L29;
            } else {
              mp.field_a = 3;
              break L29;
            }
          } else {
            break L29;
          }
        }
        L32: {
          if (3 == mp.field_a) {
            if (!rd.a(eb.field_f, (byte) 124, hw.field_a, wd.field_j)) {
              break L32;
            } else {
              if (wc.a(hw.field_a, 40)) {
                L33: {
                  L34: {
                    ph.a((byte) -93);
                    th.e(true);
                    pu.field_m = false;
                    hn.field_k = li.field_y;
                    ea.a(hw.field_a, qn.field_a, (byte) 40, eb.field_f, wd.field_j);
                    if (hv.field_c) {
                      break L34;
                    } else {
                      if (st.field_B != null) {
                        break L34;
                      } else {
                        break L33;
                      }
                    }
                  }
                  L35: {
                    stackOut_113_0 = 1;
                    stackIn_115_0 = stackOut_113_0;
                    stackIn_114_0 = stackOut_113_0;
                    if (hv.field_c) {
                      stackOut_115_0 = stackIn_115_0;
                      stackOut_115_1 = 0;
                      stackIn_116_0 = stackOut_115_0;
                      stackIn_116_1 = stackOut_115_1;
                      break L35;
                    } else {
                      stackOut_114_0 = stackIn_114_0;
                      stackOut_114_1 = 1;
                      stackIn_116_0 = stackOut_114_0;
                      stackIn_116_1 = stackOut_114_1;
                      break L35;
                    }
                  }
                  L36: {
                    stackOut_116_0 = stackIn_116_0;
                    stackOut_116_1 = stackIn_116_1;
                    stackOut_116_2 = st.field_B;
                    stackIn_118_0 = stackOut_116_0;
                    stackIn_118_1 = stackOut_116_1;
                    stackIn_118_2 = stackOut_116_2;
                    stackIn_117_0 = stackOut_116_0;
                    stackIn_117_1 = stackOut_116_1;
                    stackIn_117_2 = stackOut_116_2;
                    if (hv.field_c) {
                      stackOut_118_0 = stackIn_118_0;
                      stackOut_118_1 = stackIn_118_1;
                      stackOut_118_2 = (String) ((Object) stackIn_118_2);
                      stackOut_118_3 = 0;
                      stackIn_119_0 = stackOut_118_0;
                      stackIn_119_1 = stackOut_118_1;
                      stackIn_119_2 = stackOut_118_2;
                      stackIn_119_3 = stackOut_118_3;
                      break L36;
                    } else {
                      stackOut_117_0 = stackIn_117_0;
                      stackOut_117_1 = stackIn_117_1;
                      stackOut_117_2 = (String) ((Object) stackIn_117_2);
                      stackOut_117_3 = 1;
                      stackIn_119_0 = stackOut_117_0;
                      stackIn_119_1 = stackOut_117_1;
                      stackIn_119_2 = stackOut_117_2;
                      stackIn_119_3 = stackOut_117_3;
                      break L36;
                    }
                  }
                  ea.a(stackIn_119_0, stackIn_119_1 != 0, stackIn_119_2, stackIn_119_3 != 0);
                  break L33;
                }
                L37: {
                  if (!gn.field_b) {
                    break L37;
                  } else {
                    vi.e(4);
                    break L37;
                  }
                }
                L38: {
                  if (hh.field_d != null) {
                    break L38;
                  } else {
                    hh.field_d = ea.a(14263);
                    ur.field_O = cv.e(false);
                    break L38;
                  }
                }
                ss.a(hh.field_d, (byte) 127, hw.field_a, ur.field_O);
                hw.field_a = null;
                eb.field_f = null;
                wd.field_j = null;
                si.a((java.applet.Applet) (this), (byte) -96);
                ls.b(0);
                mp.field_a = 10;
                break L32;
              } else {
                break L32;
              }
            }
          } else {
            break L32;
          }
        }
        L39: {
          if ((mp.field_a ^ -1) != -11) {
            break L39;
          } else {
            L40: {
              if (0 == dk.field_c) {
                break L40;
              } else {
                vf.field_a = wd.a(ak.field_f, (byte) 125);
                break L40;
              }
            }
            mp.field_a = 11;
            break L39;
          }
        }
        L41: {
          if (-12 != (mp.field_a ^ -1)) {
            break L41;
          } else {
            L42: {
              if (vf.field_a == null) {
                break L42;
              } else {
                L43: {
                  if (!vf.field_a.b((byte) 127)) {
                    break L43;
                  } else {
                    if (vf.field_a.a(true)) {
                      break L42;
                    } else {
                      break L43;
                    }
                  }
                }
                pe.a(20, 0.0f, lq.a(117, mm.field_c, ek.field_k, vf.field_a));
                if (var5 == 0) {
                  break L41;
                } else {
                  break L42;
                }
              }
            }
            ml.field_u = true;
            mp.field_a = 12;
            break L41;
          }
        }
        L44: {
          if (mp.field_a == 12) {
            if (!ml.field_u) {
              mp.field_a = 13;
              break L44;
            } else {
              break L44;
            }
          } else {
            break L44;
          }
        }
        L45: {
          if (mp.field_a == 13) {
            L46: {
              var3 = 1;
              if (ih.field_a == null) {
                break L46;
              } else {
                L47: {
                  if (!ih.field_a.a(100)) {
                    stackOut_147_0 = 0;
                    stackIn_148_0 = stackOut_147_0;
                    break L47;
                  } else {
                    stackOut_146_0 = 1;
                    stackIn_148_0 = stackOut_146_0;
                    break L47;
                  }
                }
                var3 = stackIn_148_0;
                pe.a(20, ih.field_a.field_d, ih.field_a.field_f);
                break L46;
              }
            }
            if (var3 == 0) {
              break L45;
            } else {
              mp.field_a = 20;
              break L45;
            }
          } else {
            break L45;
          }
        }
        L48: {
          if (param0) {
            break L48;
          } else {
            if (aj.field_A) {
              wr.a(true, qn.field_f);
              this.e(1000);
              db.a(false, qn.field_f);
              break L48;
            } else {
              break L48;
            }
          }
        }
        L49: {
          if (wp.field_z[8]) {
            qi.a(8);
            break L49;
          } else {
            break L49;
          }
        }
    }

    private final int c(byte param0) {
        int var2 = 0;
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
        int discarded$4 = 0;
        int discarded$5 = 0;
        int var3 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        int stackIn_15_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        int stackOut_14_2 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
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
          L2: {
            if (we.g(-1)) {
              break L2;
            } else {
              if ((mp.field_a ^ -1) > -11) {
                break L1;
              } else {
                L3: {
                  if (!lf.b(-251)) {
                    break L3;
                  } else {
                    L4: {
                      if (jv.field_a != 0) {
                        break L4;
                      } else {
                        discarded$4 = this.a(16981, false, false);
                        if (var3 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    rg.a((byte) 55, pn.field_r);
                    if (var3 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                rm.a((byte) 126);
                if (var3 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          L5: {
            stackOut_12_0 = this;
            stackOut_12_1 = 16981;
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (gk.field_o == null) {
              stackOut_14_0 = this;
              stackOut_14_1 = stackIn_14_1;
              stackOut_14_2 = 0;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L5;
            } else {
              stackOut_13_0 = this;
              stackOut_13_1 = stackIn_13_1;
              stackOut_13_2 = 1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L5;
            }
          }
          discarded$5 = this.a(stackIn_15_1, stackIn_15_2 != 0, false);
          break L1;
        }
    }

    final void q(int param0) {
        int var2 = 0;
        br var3 = null;
        int var4 = 0;
        int stackIn_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        var4 = Sumoblitz.field_L ? 1 : 0;
        if (param0 == 9289) {
          L0: {
            var2 = iw.field_a;
            if (-65 >= (var2 ^ -1)) {
              break L0;
            } else {
              if (wp.field_z[var2]) {
                L1: {
                  if (0 == var2) {
                    break L1;
                  } else {
                    L2: {
                      L3: {
                        if ((var2 ^ -1) != -2) {
                          break L3;
                        } else {
                          uu.c(false);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      L4: {
                        if (-3 == (var2 ^ -1)) {
                          break L4;
                        } else {
                          L5: {
                            if (var2 == 3) {
                              break L5;
                            } else {
                              L6: {
                                if (-5 != (var2 ^ -1)) {
                                  break L6;
                                } else {
                                  pt.a(-22683);
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                if (var2 != 5) {
                                  break L7;
                                } else {
                                  ar.e((byte) -93);
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                              L8: {
                                if (var2 != 6) {
                                  break L8;
                                } else {
                                  vi.c((byte) -77);
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              L9: {
                                if (-8 != (var2 ^ -1)) {
                                  break L9;
                                } else {
                                  this.o(-1);
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              L10: {
                                if ((var2 ^ -1) != -9) {
                                  break L10;
                                } else {
                                  ro.a((byte) 127, ig.field_a, lt.field_m, gu.field_d);
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              L11: {
                                if (-17 == (var2 ^ -1)) {
                                  break L11;
                                } else {
                                  L12: {
                                    L13: {
                                      if (11 == var2) {
                                        break L13;
                                      } else {
                                        if ((var2 ^ -1) != -13) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    L14: {
                                      if (var2 != 12) {
                                        stackOut_33_0 = 0;
                                        stackIn_34_0 = stackOut_33_0;
                                        break L14;
                                      } else {
                                        stackOut_32_0 = 1;
                                        stackIn_34_0 = stackOut_32_0;
                                        break L14;
                                      }
                                    }
                                    var3 = r.a(stackIn_34_0 != 0, (byte) -62);
                                    nn.a(var3, (byte) 60);
                                    if (var4 == 0) {
                                      break L2;
                                    } else {
                                      break L12;
                                    }
                                  }
                                  L15: {
                                    if (var2 != 13) {
                                      break L15;
                                    } else {
                                      js.f((byte) 117);
                                      if (var4 == 0) {
                                        break L2;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  L16: {
                                    if (-18 == (var2 ^ -1)) {
                                      break L16;
                                    } else {
                                      L17: {
                                        if (var2 == 18) {
                                          break L17;
                                        } else {
                                          ms.a("MGS1: " + di.b((byte) -22), (Throwable) null, 0);
                                          kk.a((byte) -128);
                                          if (var4 == 0) {
                                            break L2;
                                          } else {
                                            break L17;
                                          }
                                        }
                                      }
                                      bq.a(8192);
                                      if (var4 == 0) {
                                        break L2;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                  this.f((byte) -76);
                                  if (var4 == 0) {
                                    break L2;
                                  } else {
                                    break L11;
                                  }
                                }
                              }
                              we.e((byte) -93);
                              if (var4 == 0) {
                                break L2;
                              } else {
                                break L5;
                              }
                            }
                          }
                          b.a(-30084);
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L4;
                          }
                        }
                      }
                      ue.a((byte) -70);
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                    return;
                  }
                }
                return;
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
        int var2 = 0;
        var2 = this.c((byte) -99);
        if (param0) {
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
        } else {
          return -127;
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
        }
        this.c(false, -12605);
        if (param1) {
            this.n(1);
        }
        if (!(!param3)) {
            this.l(8);
        }
        if (!(!param4)) {
            this.e((byte) 30);
        }
        if (!(!param0)) {
            this.d((byte) 68);
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
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
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
                      var6_ref2 = this.field_D.toLowerCase();
                      stackOut_3_0 = this;
                      stackIn_6_0 = stackOut_3_0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var6_ref2.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackOut_4_0 = this;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_7_0 = this;
                          stackOut_7_1 = 0;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          break L2;
                        } else {
                          stackOut_5_0 = this;
                          stackIn_6_0 = stackOut_5_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_6_0 = this;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
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
                var6 = (Exception) (Object) decompiledCaughtException;
                ms.a((String) null, (Throwable) ((Object) var6), param1 ^ 0);
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
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var6_ref);
            stackOut_23_1 = new StringBuilder().append("fn.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param3 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L10;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
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
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            fs var12 = null;
            Throwable decompiledCaughtException = null;
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
                  L6: {
                    if (param2) {
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  ts.field_d = false;
                  break L4;
                }
              }
              L7: {
                if (var4 == 4) {
                  L8: {
                    if (qn.field_a) {
                      break L8;
                    } else {
                      ms.field_a = true;
                      jv.field_a = 10;
                      if (var8 == 0) {
                        break L7;
                      } else {
                        break L8;
                      }
                    }
                  }
                  gt.a(-1540, ra.c(param0 ^ 16983));
                  break L7;
                } else {
                  break L7;
                }
              }
              L9: {
                if (var4 == 5) {
                  jl.a(ra.c(param0 + -16979), false);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 == 6) {
                  if (pu.field_m) {
                    jv.field_a = 10;
                    break L10;
                  } else {
                    break L10;
                  }
                } else {
                  break L10;
                }
              }
              L11: {
                if ((var4 ^ -1) == -8) {
                  ic.a(false, ra.c(2));
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (8 == var4) {
                  gt.a(-1540, ra.c(param0 + -16979));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (9 == var4) {
                  us.a(ra.c(2), (byte) -124);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (-11 != (var4 ^ -1)) {
                  break L14;
                } else {
                  as.field_v.g(17, param0 ^ 16989);
                  break L14;
                }
              }
              L15: {
                if (-12 != (var4 ^ -1)) {
                  break L15;
                } else {
                  of.a(8192, ra.c(2));
                  break L15;
                }
              }
              L16: {
                if (-13 != (var4 ^ -1)) {
                  break L16;
                } else {
                  cn.a(f.e(false), ra.c(2), (byte) -103);
                  break L16;
                }
              }
              L17: {
                if (-14 == (var4 ^ -1)) {
                  try {
                    L18: {
                      L19: {
                        if (null != ms.field_e) {
                          break L19;
                        } else {
                          ms.field_e = new cc(lt.field_m, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L19;
                        }
                      }
                      L20: {
                        if (ms.field_e.a((byte) -110)) {
                          L21: {
                            L22: {
                              var12 = ms.field_e.b((byte) 126);
                              if (var12 != null) {
                                break L22;
                              } else {
                                var9 = (String) null;
                                ha.a((byte) 122, (String) null);
                                if (var8 == 0) {
                                  break L21;
                                } else {
                                  break L22;
                                }
                              }
                            }
                            var7 = sd.a(var12.field_n, 0, var12.field_p, 26564);
                            ha.a((byte) 115, var7);
                            break L21;
                          }
                          ms.field_e = null;
                          break L20;
                        } else {
                          break L20;
                        }
                      }
                      break L18;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L23: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      ms.a("S1", (Throwable) ((Object) var5), 0);
                      var10 = (String) null;
                      ha.a((byte) 111, (String) null);
                      ms.field_e = null;
                      break L23;
                    }
                  }
                  break L17;
                } else {
                  break L17;
                }
              }
              L24: {
                if (15 == var4) {
                  jv.field_a = 10;
                  break L24;
                } else {
                  break L24;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if ((var4 ^ -1) != -18) {
                  return 0;
                } else {
                  return 2;
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
