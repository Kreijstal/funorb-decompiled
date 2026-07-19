/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class u extends da {
    private boolean field_B;
    String field_y;
    private int field_w;
    private int field_r;
    private int field_p;
    static String field_u;
    static o field_x;
    private int field_C;
    static String field_o;
    private boolean field_n;
    static wi field_A;
    private long field_s;
    private int field_q;
    private boolean field_t;
    static String field_v;
    private static boolean[] field_z;
    static int[] field_m;
    private int field_l;

    private final int p(int param0) {
        int var2 = 0;
        if (this.field_c) {
          return -1;
        } else {
          if (!h.b(true)) {
            return -1;
          } else {
            if (param0 == -1) {
              if (t.field_c) {
                return -1;
              } else {
                var2 = qh.a(pl.a(param0 + 1), this.field_r, this.field_B, -9, nf.a((byte) 125), true);
                if ((var2 ^ -1) != 0) {
                  L0: {
                    if (var2 != 0) {
                      if (-2 != (var2 ^ -1)) {
                        L1: {
                          if (ri.field_b) {
                            break L1;
                          } else {
                            this.a("reconnect", (byte) 126);
                            break L1;
                          }
                        }
                        ci.a((byte) -128);
                        nj.a(10, bh.field_g, var2);
                        t.field_c = true;
                        sb.field_c = d.a((byte) 49) + 15000L;
                        return var2;
                      } else {
                        if (ml.field_t != 11) {
                          break L0;
                        } else {
                          if (nl.field_r != 0) {
                            break L0;
                          } else {
                            vc.a(260);
                            break L0;
                          }
                        }
                      }
                    } else {
                      if (ml.field_t != 11) {
                        break L0;
                      } else {
                        if (nl.field_r != 0) {
                          break L0;
                        } else {
                          vc.a(260);
                          break L0;
                        }
                      }
                    }
                  }
                  return var2;
                } else {
                  return -1;
                }
              }
            } else {
              return 31;
            }
          }
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, (byte) -124);
        if (!param2) {
            this.field_p = -29;
        }
        if (!(!param4)) {
            this.l(110);
        }
        if (!(!param3)) {
            this.b((byte) 0);
        }
        if (param1) {
            this.m(28135);
        }
        if (param0) {
            this.k(-120);
        }
    }

    final static ae b(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        ae stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_11_0 = null;
        Object stackOut_8_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param1 <= -117) {
                break L1;
              } else {
                field_o = (String) null;
                break L1;
              }
            }
            var2_int = param0.length();
            var3 = 0;
            L2: while (true) {
              if (var2_int <= var3) {
                stackOut_11_0 = tl.field_d;
                stackIn_12_0 = stackOut_11_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L2;
                  } else {
                    stackOut_8_0 = null;
                    stackIn_9_0 = stackOut_8_0;
                    decompiledRegionSelector0 = 0;
                    break L0;
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
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var2);
            stackOut_13_1 = new StringBuilder().append("u.SA(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ae) ((Object) stackIn_9_0);
        } else {
          return stackIn_12_0;
        }
    }

    private final void b(byte param0) {
        int discarded$0 = 0;
        field_z[2] = true;
        if (param0 != 0) {
            discarded$0 = this.o(46);
        }
    }

    private final void j(int param0) {
        kc.field_G[17] = -1;
        kc.field_G[3] = -1;
        kc.field_G[16] = param0;
        kc.field_G[7] = -1;
        kc.field_G[18] = 1;
        kc.field_G[2] = -2;
        kc.field_G[10] = -1;
        kc.field_G[5] = -1;
        kc.field_G[8] = -2;
        kc.field_G[13] = -1;
        kc.field_G[11] = -1;
        kc.field_G[1] = 16;
        kc.field_G[4] = -1;
        kc.field_G[9] = -1;
        kc.field_G[6] = -2;
        kc.field_G[12] = -1;
    }

    final void c(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        String stackIn_107_2 = null;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        String stackIn_108_2 = null;
        int stackIn_109_0 = 0;
        int stackIn_109_1 = 0;
        String stackIn_109_2 = null;
        int stackIn_109_3 = 0;
        int stackIn_139_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        String stackOut_106_2 = null;
        int stackOut_108_0 = 0;
        int stackOut_108_1 = 0;
        String stackOut_108_2 = null;
        int stackOut_108_3 = 0;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        String stackOut_107_2 = null;
        int stackOut_107_3 = 0;
        int stackOut_138_0 = 0;
        int stackOut_137_0 = 0;
        L0: {
          var5 = wizardrun.field_H;
          if (null == oa.field_c) {
            break L0;
          } else {
            L1: {
              if (null == ki.field_E) {
                var6 = pe.e(152);
                var4 = var6.getSize();
                oa.field_c.a((byte) -64, var4.height, var4.width);
                break L1;
              } else {
                break L1;
              }
            }
            oa.field_c.a(true);
            break L0;
          }
        }
        L2: {
          t.a(-1);
          th.b((byte) -21);
          if (ta.a((byte) 60)) {
            break L2;
          } else {
            if (-12 != (ml.field_t ^ -1)) {
              ti.a(param0 + 4122);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != vc.field_K) {
            gi.field_c = vc.field_K.a(-1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param0 == -4114) {
            break L4;
          } else {
            this.d((byte) 27);
            break L4;
          }
        }
        L5: {
          if (!wj.a(0)) {
            break L5;
          } else {
            L6: {
              var3 = ih.a((byte) -95) * 1200;
              if (this.field_n) {
                break L6;
              } else {
                if ((ne.a((byte) 28) ^ -1) >= (var3 ^ -1)) {
                  break L5;
                } else {
                  if ((var3 ^ -1) <= (mj.a((byte) 53) ^ -1)) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            this.field_n = false;
            ql.a(-92);
            ci.a((byte) -124);
            nj.a(param0 ^ -4124, df.field_e, 2);
            qh.a(false);
            t.field_c = true;
            sb.field_c = 15000L + d.a((byte) 25);
            break L5;
          }
        }
        L7: {
          L8: {
            if ((nl.field_r ^ -1) == 0) {
              break L8;
            } else {
              if (-1 == (nl.field_r ^ -1)) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          L9: {
            if (-1 != nl.field_r) {
              stackOut_25_0 = 0;
              stackIn_26_0 = stackOut_25_0;
              break L9;
            } else {
              stackOut_24_0 = 1;
              stackIn_26_0 = stackOut_24_0;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_26_0;
            nl.field_r = ab.c(14326);
            if (var3 == 0) {
              break L10;
            } else {
              if (0 != nl.field_r) {
                break L10;
              } else {
                if (11 != ml.field_t) {
                  break L10;
                } else {
                  if (!h.b(true)) {
                    vc.a(260);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          if (0 == (nl.field_r ^ -1)) {
            break L7;
          } else {
            if (0 == nl.field_r) {
              break L7;
            } else {
              sb.field_c = d.a((byte) 36) - -15000L;
              break L7;
            }
          }
        }
        L11: {
          if (0 == (nl.field_r ^ -1)) {
            break L11;
          } else {
            if (-1 == (nl.field_r ^ -1)) {
              break L11;
            } else {
              if ((ri.field_a ^ -1) > -11) {
                if (3 != nl.field_r) {
                  if (nl.field_r != 4) {
                    if ((nl.field_r ^ -1) != -3) {
                      if ((nl.field_r ^ -1) != -6) {
                        this.a("js5connect", (byte) 126);
                        break L11;
                      } else {
                        this.a("outofdate", (byte) 126);
                        break L11;
                      }
                    } else {
                      this.a("js5connect_full", (byte) 126);
                      break L11;
                    }
                  } else {
                    this.a("js5io", (byte) 127);
                    break L11;
                  }
                } else {
                  this.a("js5crc", (byte) 127);
                  break L11;
                }
              } else {
                if (-11 >= (ml.field_t ^ -1)) {
                  L12: {
                    ci.a((byte) -125);
                    if ((nl.field_r ^ -1) == -4) {
                      nj.a(10, ai.field_r, 256);
                      break L12;
                    } else {
                      if (-5 == (nl.field_r ^ -1)) {
                        nj.a(10, ld.field_f, 256);
                        break L12;
                      } else {
                        if (-3 == (nl.field_r ^ -1)) {
                          nj.a(param0 ^ -4124, ne.field_d, 256);
                          break L12;
                        } else {
                          if ((nl.field_r ^ -1) == -6) {
                            nj.a(10, ki.field_L, 5);
                            break L12;
                          } else {
                            nj.a(param0 + 4124, mi.field_C, 256);
                            break L12;
                          }
                        }
                      }
                    }
                  }
                  t.field_c = true;
                  break L11;
                } else {
                  break L11;
                }
              }
            }
          }
        }
        L13: {
          L14: {
            L15: {
              if (0 == (nl.field_r ^ -1)) {
                break L15;
              } else {
                if ((nl.field_r ^ -1) != -1) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (!h.b(true)) {
              break L13;
            } else {
              break L14;
            }
          }
          if ((sb.field_c ^ -1L) >= (d.a((byte) 22) ^ -1L)) {
            t.field_c = false;
            if (-1 == nl.field_r) {
              break L13;
            } else {
              if (-1 == (nl.field_r ^ -1)) {
                break L13;
              } else {
                nl.field_r = -1;
                oh.a((byte) -117);
                break L13;
              }
            }
          } else {
            break L13;
          }
        }
        L16: {
          if (nl.field_r != 0) {
            break L16;
          } else {
            if (!h.b(true)) {
              cb.field_c = false;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (ri.field_a == 0) {
            if (!ab.d(param0 + 3988)) {
              break L17;
            } else {
              ri.field_a = 1;
              break L17;
            }
          } else {
            break L17;
          }
        }
        L18: {
          if (ri.field_a == 1) {
            L19: {
              if (0 != mh.field_tb) {
                qh.field_c = si.a(46, hj.field_a);
                break L19;
              } else {
                break L19;
              }
            }
            ub.field_x = l.a(sf.field_g, param0 ^ 1784758027, false, 1, true);
            vj.field_b = l.a(jg.field_o, -1784753947, false, 1, true);
            cc.field_a = l.a(rk.field_n, param0 + -1784749833, false, 1, true);
            bb.field_h = ub.field_x;
            ri.field_a = 2;
            md.field_c = vj.field_b;
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if (-3 != (ri.field_a ^ -1)) {
            break L20;
          } else {
            L21: {
              if (qh.field_c != null) {
                if (!qh.field_c.b(17820)) {
                  break L21;
                } else {
                  if (!qh.field_c.c(-1, "")) {
                    qh.field_c = null;
                    break L21;
                  } else {
                    if (qh.field_c.a((byte) 29, "")) {
                      ea.a(0, qh.field_c);
                      qh.field_c = null;
                      jj.b(param0 + 4114);
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                }
              } else {
                break L21;
              }
            }
            if (null == qh.field_c) {
              ri.field_a = 3;
              break L20;
            } else {
              break L20;
            }
          }
        }
        L22: {
          if (3 == ri.field_a) {
            if (!of.a(ub.field_x, cc.field_a, (byte) -1, vj.field_b)) {
              break L22;
            } else {
              if (lc.a(param0 + 4114, cc.field_a)) {
                L23: {
                  L24: {
                    pg.a(-382);
                    mi.d(3);
                    vc.field_M = false;
                    dg.field_a = wj.field_G;
                    dj.a(param0 ^ -6284, cc.field_a, ub.field_x, vj.field_b, pf.field_g);
                    if (rf.field_c) {
                      break L24;
                    } else {
                      if (null != l.field_K) {
                        break L24;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L25: {
                    if (rf.field_c) {
                      stackOut_105_0 = 0;
                      stackIn_106_0 = stackOut_105_0;
                      break L25;
                    } else {
                      stackOut_104_0 = 1;
                      stackIn_106_0 = stackOut_104_0;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_106_0 = stackIn_106_0;
                    stackOut_106_1 = 126;
                    stackOut_106_2 = l.field_K;
                    stackIn_108_0 = stackOut_106_0;
                    stackIn_108_1 = stackOut_106_1;
                    stackIn_108_2 = stackOut_106_2;
                    stackIn_107_0 = stackOut_106_0;
                    stackIn_107_1 = stackOut_106_1;
                    stackIn_107_2 = stackOut_106_2;
                    if (rf.field_c) {
                      stackOut_108_0 = stackIn_108_0;
                      stackOut_108_1 = stackIn_108_1;
                      stackOut_108_2 = (String) ((Object) stackIn_108_2);
                      stackOut_108_3 = 0;
                      stackIn_109_0 = stackOut_108_0;
                      stackIn_109_1 = stackOut_108_1;
                      stackIn_109_2 = stackOut_108_2;
                      stackIn_109_3 = stackOut_108_3;
                      break L26;
                    } else {
                      stackOut_107_0 = stackIn_107_0;
                      stackOut_107_1 = stackIn_107_1;
                      stackOut_107_2 = (String) ((Object) stackIn_107_2);
                      stackOut_107_3 = 1;
                      stackIn_109_0 = stackOut_107_0;
                      stackIn_109_1 = stackOut_107_1;
                      stackIn_109_2 = stackOut_107_2;
                      stackIn_109_3 = stackOut_107_3;
                      break L26;
                    }
                  }
                  ai.a(stackIn_109_0 != 0, (byte) stackIn_109_1, stackIn_109_2, stackIn_109_3 != 0);
                  break L23;
                }
                L27: {
                  if (!mj.field_c) {
                    break L27;
                  } else {
                    jf.a(param0 ^ -4158);
                    break L27;
                  }
                }
                L28: {
                  if (null != pk.field_n) {
                    break L28;
                  } else {
                    pk.field_n = sl.d((byte) 126);
                    mk.field_f = u.r(8300);
                    break L28;
                  }
                }
                ec.a(cc.field_a, (byte) -82, mk.field_f, pk.field_n);
                vj.field_b = null;
                cc.field_a = null;
                ub.field_x = null;
                ae.a((java.applet.Applet) (this), param0 ^ -4213);
                jj.b(0);
                ri.field_a = 10;
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
          if (10 == ri.field_a) {
            L30: {
              if (mh.field_tb == 0) {
                break L30;
              } else {
                oh.field_b = si.a(90, ni.field_b);
                break L30;
              }
            }
            ri.field_a = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if (ri.field_a == 11) {
            L32: {
              if (null == oh.field_b) {
                break L32;
              } else {
                L33: {
                  if (!oh.field_b.b(17820)) {
                    break L33;
                  } else {
                    if (!oh.field_b.d(-111)) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                ok.a(de.a(param0 ^ 4150, td.field_e, oh.field_b, bl.field_c), 0.0f, 0);
                break L31;
              }
            }
            f.field_c = true;
            ri.field_a = 12;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if (ri.field_a == 12) {
            if (f.field_c) {
              break L34;
            } else {
              ri.field_a = 13;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (13 == ri.field_a) {
            L36: {
              var3 = 1;
              if (null != ih.field_b) {
                L37: {
                  if (!ih.field_b.a(true)) {
                    stackOut_138_0 = 0;
                    stackIn_139_0 = stackOut_138_0;
                    break L37;
                  } else {
                    stackOut_137_0 = 1;
                    stackIn_139_0 = stackOut_137_0;
                    break L37;
                  }
                }
                var3 = stackIn_139_0;
                ok.a(ih.field_b.field_i, ih.field_b.field_k, 0);
                break L36;
              } else {
                break L36;
              }
            }
            if (var3 != 0) {
              ri.field_a = 20;
              break L35;
            } else {
              break L35;
            }
          } else {
            break L35;
          }
        }
        L38: {
          if (param1) {
            break L38;
          } else {
            if (tj.field_F) {
              ka.a(wizardrun.field_G, 8053);
              this.e(88);
              jf.a(false, wizardrun.field_G);
              break L38;
            } else {
              break L38;
            }
          }
        }
        L39: {
          if (!field_z[8]) {
            break L39;
          } else {
            di.a(8);
            break L39;
          }
        }
    }

    final static void a(byte param0, wl param1, wl param2) {
        try {
            if (!(null == param2.field_c)) {
                param2.a(false);
            }
            param2.field_c = param1.field_c;
            param2.field_b = param1;
            if (param0 != 74) {
                u.n(-127);
            }
            param2.field_c.field_b = param2;
            param2.field_b.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "u.JA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void k(int param0) {
        field_z[5] = true;
        if (param0 > -77) {
            u.n(111);
        }
    }

    private final void a(boolean param0, byte param1) {
        field_z[8] = param0;
        field_z[0] = true;
        field_z[17] = true;
        field_z[16] = true;
        field_z[18] = true;
        int var3 = 92 % ((param1 - -62) / 56);
        field_z[3] = true;
        field_z[7] = true;
    }

    private final void q(int param0) {
        int var2 = nk.field_N.f(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + gd.field_c;
        byte[] var5 = new byte[var4];
        if (param0 <= 3) {
            return;
        }
        nk.field_N.a(0, var4, 0, var5);
        sh.a(var3 != 0, 122, nf.a((byte) 113, var5), jg.f(1));
    }

    final static void a(va param0, int param1) {
        try {
            int discarded$2 = 0;
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            var5 = wizardrun.field_H;
            try {
              L0: {
                L1: {
                  var6 = new byte[24];
                  var2 = var6;
                  if (ub.field_t == null) {
                    break L1;
                  } else {
                    try {
                      L2: {
                        ub.field_t.a(0L, (byte) 113);
                        ub.field_t.a(var6, 9350);
                        var3_int = 0;
                        L3: while (true) {
                          L4: {
                            if (var3_int >= 24) {
                              break L4;
                            } else {
                              if (0 == var2[var3_int]) {
                                var3_int++;
                                continue L3;
                              } else {
                                break L4;
                              }
                            }
                          }
                          if (-25 >= (var3_int ^ -1)) {
                            throw new IOException();
                          } else {
                            break L2;
                          }
                        }
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L5: {
                        var3 = (Exception) (Object) decompiledCaughtException;
                        var4 = 0;
                        L6: while (true) {
                          if (-25 >= (var4 ^ -1)) {
                            break L5;
                          } else {
                            var2[var4] = (byte)-1;
                            var4++;
                            continue L6;
                          }
                        }
                      }
                    }
                    break L1;
                  }
                }
                L7: {
                  param0.a(var2, 0, 24, -99);
                  if (param1 == -18) {
                    break L7;
                  } else {
                    discarded$2 = u.r(5);
                    break L7;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_17_0 = (RuntimeException) (var2_ref);
                stackOut_17_1 = new StringBuilder().append("u.HA(");
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                if (param0 == null) {
                  stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
                  stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
                  stackOut_19_2 = "null";
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  stackIn_20_2 = stackOut_19_2;
                  break L8;
                } else {
                  stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackOut_18_2 = "{...}";
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  stackIn_20_2 = stackOut_18_2;
                  break L8;
                }
              }
              throw bd.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, byte param1, String param2) {
        try {
            int var4_int = -125 / ((param1 - -9) / 49);
            this.a(param0, 480, param2, (byte) 19, 640);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "u.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void m(int param0) {
        field_z[4] = true;
        if (param0 != 28135) {
            field_m = (int[]) null;
        }
    }

    private final static int r(int param0) {
        if (param0 != 8300) {
            wl var2 = (wl) null;
            u.a((byte) 86, (wl) null, (wl) null);
        }
        return sk.field_v;
    }

    private final void c(byte param0) {
        int var3 = -90 / ((-61 - param0) / 53);
        String var2 = vl.a(-106);
        wl.a(var2, jg.f(1), (byte) -107);
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var10 = null;
            Boolean var11 = null;
            va var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = wizardrun.field_H;
            var4 = ad.a(mh.field_tb, gi.field_c, param1, param0 + -6426);
            if ((var4 ^ -1) == -1) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (1 == var4) {
                  L1: {
                    var5_int = mk.a(vf.a((byte) -68), -124, n.a((byte) 12));
                    if (0 != (var5_int ^ -1)) {
                      ni.a(bh.field_g, -101, pd.field_I, var5_int);
                      pd.field_I = null;
                      bh.field_g = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var11 = df.b((byte) -52);
                  if (var11 != null) {
                    vg.a(var11.booleanValue(), 3289);
                    break L0;
                  } else {
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
                  var5_int = qk.a(pl.a(param0 + -6498), this.field_r, nf.a((byte) 123), dg.a(-21), sc.a(0), param0 + -6498, w.c(-126));
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    ve.a(bh.field_g, pd.field_I, (byte) -112, var5_int);
                    bh.field_g = null;
                    pd.field_I = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (-4 == (var4 ^ -1)) {
                  L4: {
                    if (-1 == nl.field_r) {
                      break L4;
                    } else {
                      if ((nl.field_r ^ -1) == -1) {
                        break L4;
                      } else {
                        nl.field_r = -1;
                        oh.a((byte) -128);
                        break L4;
                      }
                    }
                  }
                  if (!param2) {
                    var5_int = qh.a(pl.a(0), this.field_r, this.field_B, -9, nf.a((byte) 124), false);
                    if ((var5_int ^ -1) == 0) {
                      break L3;
                    } else {
                      if (0 == var5_int) {
                        h.field_m = pe.field_D;
                        vc.a(260);
                        ml.field_t = 10;
                        qb.field_p = false;
                        break L3;
                      } else {
                        nj.a(param0 + -6488, bh.field_g, var5_int);
                        bh.field_g = null;
                        break L3;
                      }
                    }
                  } else {
                    t.field_c = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (var4 == 4) {
                  if (pf.field_g) {
                    cd.a(jg.f(param0 + -6497), (byte) -113);
                    break L5;
                  } else {
                    qb.field_p = true;
                    ml.field_t = 10;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (5 != var4) {
                  break L6;
                } else {
                  bc.a(125, jg.f(1));
                  break L6;
                }
              }
              L7: {
                if ((var4 ^ -1) == -7) {
                  if (!vc.field_M) {
                    break L7;
                  } else {
                    ml.field_t = 10;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (-8 == (var4 ^ -1)) {
                  lb.a(param0 + -6438, jg.f(1));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if ((var4 ^ -1) == -9) {
                  cd.a(jg.f(1), (byte) -113);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (-10 != (var4 ^ -1)) {
                  break L10;
                } else {
                  wg.a(param0 ^ 7600, jg.f(1));
                  break L10;
                }
              }
              L11: {
                if (-11 != (var4 ^ -1)) {
                  break L11;
                } else {
                  n.field_b.c((byte) -118, 17);
                  break L11;
                }
              }
              L12: {
                if (var4 == 11) {
                  ga.a(jg.f(1), (byte) -40);
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (param0 == 6498) {
                  break L13;
                } else {
                  this.l(-45);
                  break L13;
                }
              }
              L14: {
                if ((var4 ^ -1) != -13) {
                  break L14;
                } else {
                  rb.a(jj.a(true), -1926289535, jg.f(1));
                  break L14;
                }
              }
              L15: {
                if (-14 != (var4 ^ -1)) {
                  break L15;
                } else {
                  try {
                    L16: {
                      L17: {
                        if (null == cb.field_b) {
                          cb.field_b = new ud(ld.field_g, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (cb.field_b.c(81)) {
                          L19: {
                            var12 = cb.field_b.b(-4);
                            if (var12 == null) {
                              gf.b(param0 ^ 6507, (String) null);
                              break L19;
                            } else {
                              var7 = bi.a(0, var12.field_m, var12.field_k, false);
                              gf.b(9, var7);
                              break L19;
                            }
                          }
                          cb.field_b = null;
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
                      rg.a((Throwable) ((Object) var5), "S1", param0 ^ -6996);
                      var10 = (String) null;
                      gf.b(9, (String) null);
                      cb.field_b = null;
                      break L20;
                    }
                  }
                  break L15;
                }
              }
              L21: {
                if (var4 == 15) {
                  ml.field_t = 10;
                  break L21;
                } else {
                  break L21;
                }
              }
              if ((var4 ^ -1) == -17) {
                return 1;
              } else {
                if (-18 != (var4 ^ -1)) {
                  return 0;
                } else {
                  return 2;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void b(boolean param0) {
        int var2 = 0;
        wc var3 = null;
        int var4 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_34_1 = 0;
        wc stackIn_35_0 = null;
        wc stackIn_36_0 = null;
        wc stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_33_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        wc stackOut_34_0 = null;
        wc stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        wc stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        L0: {
          var4 = wizardrun.field_H;
          if (param0) {
            break L0;
          } else {
            field_m = (int[]) null;
            break L0;
          }
        }
        L1: {
          var2 = ra.field_k;
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (field_z[var2]) {
              if (-1 != (var2 ^ -1)) {
                L2: {
                  if (var2 != 1) {
                    if ((var2 ^ -1) != -3) {
                      if (-4 != (var2 ^ -1)) {
                        if (-5 == (var2 ^ -1)) {
                          pj.f(-17144);
                          break L2;
                        } else {
                          if ((var2 ^ -1) == -6) {
                            rk.c(-2);
                            break L2;
                          } else {
                            if (-7 == (var2 ^ -1)) {
                              kk.o(-114);
                              break L2;
                            } else {
                              if (7 != var2) {
                                if (8 == var2) {
                                  mi.a(-21284, nk.field_N, ld.field_g, gd.field_c);
                                  break L2;
                                } else {
                                  if (16 != var2) {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (12 == var2) {
                                          break L3;
                                        } else {
                                          if (var2 == 13) {
                                            jk.a(true);
                                            break L2;
                                          } else {
                                            if ((var2 ^ -1) == -18) {
                                              this.q(108);
                                              break L2;
                                            } else {
                                              if (var2 == 18) {
                                                ck.a(2046877441);
                                                break L2;
                                              } else {
                                                rg.a((Throwable) null, "MGS1: " + ni.c(6), -562);
                                                ql.a(-42);
                                                break L2;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      stackOut_31_0 = -2;
                                      stackIn_33_0 = stackOut_31_0;
                                      stackIn_32_0 = stackOut_31_0;
                                      if ((var2 ^ -1) != -13) {
                                        stackOut_33_0 = stackIn_33_0;
                                        stackOut_33_1 = 0;
                                        stackIn_34_0 = stackOut_33_0;
                                        stackIn_34_1 = stackOut_33_1;
                                        break L4;
                                      } else {
                                        stackOut_32_0 = stackIn_32_0;
                                        stackOut_32_1 = 1;
                                        stackIn_34_0 = stackOut_32_0;
                                        stackIn_34_1 = stackOut_32_1;
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      var3 = cf.a(stackIn_34_0, stackIn_34_1 != 0);
                                      stackOut_34_0 = (wc) (var3);
                                      stackIn_36_0 = stackOut_34_0;
                                      stackIn_35_0 = stackOut_34_0;
                                      if (param0) {
                                        stackOut_36_0 = (wc) ((Object) stackIn_36_0);
                                        stackOut_36_1 = 0;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackIn_37_1 = stackOut_36_1;
                                        break L5;
                                      } else {
                                        stackOut_35_0 = (wc) ((Object) stackIn_35_0);
                                        stackOut_35_1 = 1;
                                        stackIn_37_0 = stackOut_35_0;
                                        stackIn_37_1 = stackOut_35_1;
                                        break L5;
                                      }
                                    }
                                    sc.a(stackIn_37_0, stackIn_37_1 != 0);
                                    break L2;
                                  } else {
                                    qi.e(12582);
                                    break L2;
                                  }
                                }
                              } else {
                                this.c((byte) -117);
                                break L2;
                              }
                            }
                          }
                        }
                      } else {
                        pd.d(false);
                        break L2;
                      }
                    } else {
                      fg.a((byte) 112);
                      break L2;
                    }
                  } else {
                    bk.b(124);
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              break L1;
            }
          }
        }
        rg.a((Throwable) null, "MGS2: " + ni.c(6), -562);
        ql.a(-79);
    }

    final int a(byte param0, boolean param1) {
        if (param0 <= 0) {
            return -74;
        }
        return this.a(6498, param1, true);
    }

    final void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        mh.field_tb = this.field_p;
        me.a(mh.field_tb, !param4 ? true : false);
        i.a(mh.field_tb, this.field_l, param6, param1, this.field_q, this.field_s, this.field_w, this.field_y, 5000, 5000, this.field_t, this.field_C, 64, ld.field_g);
        qc.a(this.field_w, param6, this.field_C, ld.field_g, this.field_l, this.field_y, true, this.field_q, mh.field_tb);
        of.d(0);
        vc.field_K = qj.a(param4);
        jf.a(param4, wizardrun.field_G);
        sf.field_g = param7;
        jg.field_o = param2;
        ni.field_b = param3;
        rk.field_n = param0;
        hj.field_a = param5;
        this.j(-1);
        rl.a(-19);
    }

    protected u() {
    }

    public static void n(int param0) {
        field_u = null;
        field_A = null;
        field_x = null;
        field_z = null;
        field_v = null;
        if (param0 != -18084) {
            field_v = (String) null;
        }
        field_m = null;
        field_o = null;
    }

    final int o(int param0) {
        int var2 = 0;
        L0: {
          if (param0 == -10618) {
            break L0;
          } else {
            this.c(88, true);
            break L0;
          }
        }
        L1: {
          L2: {
            var2 = this.p(-1);
            if (-1 == (var2 ^ -1)) {
              break L2;
            } else {
              if (-2 != (var2 ^ -1)) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (field_z[1]) {
              rb.a(2, (byte) -85);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (!field_z[2]) {
              break L4;
            } else {
              fh.b(-28323, 3);
              break L4;
            }
          }
          L5: {
            if (!field_z[3]) {
              break L5;
            } else {
              ei.a((byte) 51, 4);
              break L5;
            }
          }
          L6: {
            if (!field_z[4]) {
              break L6;
            } else {
              ud.a(5, param0 ^ 10496);
              break L6;
            }
          }
          L7: {
            if (field_z[5]) {
              oe.a((byte) -86, 6);
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (field_z[6]) {
              fh.c(7, param0 + 10618);
              break L8;
            } else {
              break L8;
            }
          }
          if (field_z[8]) {
            gh.a((byte) 99);
            break L1;
          } else {
            break L1;
          }
        }
        return var2;
    }

    private final void a(int param0, int param1, String param2, byte param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
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
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
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
                if (!this.g(param3 ^ -36)) {
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.field_y = this.getCodeBase().getHost();
                      var6_ref2 = this.field_y.toLowerCase();
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
                    ((u) (this)).field_B = stackIn_8_1 != 0;
                    this.field_C = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_w = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (param3 == 19) {
                      break L4;
                    } else {
                      field_m = (int[]) null;
                      break L4;
                    }
                  }
                  L5: {
                    if (var7 != null) {
                      this.field_l = Integer.parseInt(var7);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    this.field_q = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_s = Long.parseLong(this.getParameter("instanceid"));
                    this.field_t = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_p = Integer.parseInt(var8);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if ((this.field_p ^ -1) > -6) {
                      break L7;
                    } else {
                      this.field_p = 0;
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
                  mj.field_c = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(this.field_q, param0, (byte) -100, param2, param1, param4, 32);
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                rg.a((Throwable) ((Object) var6), (String) null, -562);
                this.a("crash", (byte) 127);
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
            stackOut_25_1 = new StringBuilder().append("u.CA(").append(param0).append(',').append(param1).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
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
          throw bd.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void l(int param0) {
        field_z[1] = true;
        if (param0 < 88) {
            u.n(63);
        }
    }

    final void d(byte param0) {
        int discarded$9 = 0;
        int discarded$10 = 0;
        int var2 = 0;
        int var3 = 0;
        Object stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        L0: {
          L1: {
            var3 = wizardrun.field_H;
            if (!ph.a((byte) 89)) {
              if (ri.field_a >= 10) {
                if (w.a((byte) -117)) {
                  if (-1 != (ml.field_t ^ -1)) {
                    ac.a(0, gi.field_c);
                    break L1;
                  } else {
                    discarded$9 = this.a(6498, false, false);
                    break L1;
                  }
                } else {
                  qa.c(250);
                  break L1;
                }
              } else {
                var2 = 95 / ((param0 - -52) / 50);
                break L0;
              }
            } else {
              L2: {
                stackOut_1_0 = this;
                stackOut_1_1 = 6498;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_2_0 = stackOut_1_0;
                stackIn_2_1 = stackOut_1_1;
                if (null == ki.field_E) {
                  stackOut_3_0 = this;
                  stackOut_3_1 = stackIn_3_1;
                  stackOut_3_2 = 0;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  stackIn_4_2 = stackOut_3_2;
                  break L2;
                } else {
                  stackOut_2_0 = this;
                  stackOut_2_1 = stackIn_2_1;
                  stackOut_2_2 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_4_1 = stackOut_2_1;
                  stackIn_4_2 = stackOut_2_2;
                  break L2;
                }
              }
              discarded$10 = this.a(stackIn_4_1, stackIn_4_2 != 0, false);
              break L1;
            }
          }
          var2 = 95 / ((param0 - -52) / 50);
          break L0;
        }
    }

    static {
        field_o = "The Beach";
        field_m = new int[]{500, 100, 100, 300, 500, 100, 200, 200, 300, 500, 1000, 200};
        field_v = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_z = new boolean[64];
        field_u = "Please wait...";
    }
}
