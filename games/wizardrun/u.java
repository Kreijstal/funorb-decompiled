/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

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

    private final int p() {
        int var2 = 0;
        if (((u) this).field_c) {
          return -1;
        } else {
          int discarded$7 = 1;
          if (!h.b()) {
            return -1;
          } else {
            if (t.field_c) {
              return -1;
            } else {
              var2 = qh.a(pl.a(0), ((u) this).field_r, ((u) this).field_B, -9, nf.a((byte) 125), true);
              if (var2 != -1) {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (var2 == 1) {
                      break L0;
                    } else {
                      L1: {
                        if (ri.field_b) {
                          break L1;
                        } else {
                          ((u) this).a("reconnect", (byte) 126);
                          break L1;
                        }
                      }
                      ci.a((byte) -128);
                      nj.a(10, bh.field_g, var2);
                      t.field_c = true;
                      sb.field_c = d.a((byte) 49) + 15000L;
                      return var2;
                    }
                  }
                }
                L2: {
                  if (ml.field_t != 11) {
                    break L2;
                  } else {
                    if (nl.field_r != 0) {
                      break L2;
                    } else {
                      vc.a(260);
                      break L2;
                    }
                  }
                }
                return var2;
              } else {
                return -1;
              }
            }
          }
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(false, (byte) -124);
        if (!param2) {
            ((u) this).field_p = -29;
        }
        if (!(!param4)) {
            int discarded$0 = 110;
            this.l();
        }
        if (!(!param3)) {
            int discarded$1 = 0;
            this.b();
        }
        if (param1) {
            int discarded$2 = 28135;
            this.m();
        }
        if (param0) {
            int discarded$3 = -120;
            this.k();
        }
    }

    final static ae b(String param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object stackIn_7_0 = null;
        ae stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ae stackOut_9_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = wizardrun.field_H;
        try {
          L0: {
            var2_int = param0.length();
            var3 = 0;
            L1: while (true) {
              if (var2_int <= var3) {
                stackOut_9_0 = tl.field_d;
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                var4 = param0.charAt(var3);
                if (var4 >= 48) {
                  if (var4 <= 57) {
                    var3++;
                    continue L1;
                  } else {
                    stackOut_6_0 = null;
                    stackIn_7_0 = stackOut_6_0;
                    return (ae) (Object) stackIn_7_0;
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("u.SA(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + -125 + ')');
        }
        return stackIn_10_0;
    }

    private final void b() {
        field_z[2] = true;
    }

    private final void j() {
        kc.field_G[17] = -1;
        kc.field_G[3] = -1;
        kc.field_G[16] = -1;
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
          int discarded$14 = -21;
          th.b();
          if (ta.a((byte) 60)) {
            break L2;
          } else {
            if (ml.field_t != 11) {
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
            ((u) this).d((byte) 27);
            break L4;
          }
        }
        L5: {
          if (!wj.a(0)) {
            break L5;
          } else {
            L6: {
              var3 = ih.a((byte) -95) * 1200;
              if (((u) this).field_n) {
                break L6;
              } else {
                if (~ne.a((byte) 28) >= ~var3) {
                  break L5;
                } else {
                  int discarded$15 = 53;
                  if (~var3 <= ~mj.a()) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            ((u) this).field_n = false;
            ql.a(-92);
            ci.a((byte) -124);
            nj.a(param0 ^ -4124, df.field_e, 2);
            int discarded$16 = 0;
            qh.a();
            t.field_c = true;
            sb.field_c = 15000L + d.a((byte) 25);
            break L5;
          }
        }
        L7: {
          L8: {
            if (nl.field_r == -1) {
              break L8;
            } else {
              if (nl.field_r == 0) {
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
            int discarded$17 = 14326;
            nl.field_r = ab.c();
            if (var3 == 0) {
              break L10;
            } else {
              if (0 != nl.field_r) {
                break L10;
              } else {
                if (11 != ml.field_t) {
                  break L10;
                } else {
                  int discarded$18 = 1;
                  if (!h.b()) {
                    vc.a(260);
                    break L10;
                  } else {
                    break L10;
                  }
                }
              }
            }
          }
          if (nl.field_r == -1) {
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
          if (nl.field_r == -1) {
            break L11;
          } else {
            if (nl.field_r == 0) {
              break L11;
            } else {
              if (ri.field_a < 10) {
                if (3 != nl.field_r) {
                  if (nl.field_r != 4) {
                    if (nl.field_r != 2) {
                      if (nl.field_r != 5) {
                        ((u) this).a("js5connect", (byte) 126);
                        break L11;
                      } else {
                        ((u) this).a("outofdate", (byte) 126);
                        break L11;
                      }
                    } else {
                      ((u) this).a("js5connect_full", (byte) 126);
                      break L11;
                    }
                  } else {
                    ((u) this).a("js5io", (byte) 127);
                    break L11;
                  }
                } else {
                  ((u) this).a("js5crc", (byte) 127);
                  break L11;
                }
              } else {
                if (ml.field_t >= 10) {
                  L12: {
                    ci.a((byte) -125);
                    if (nl.field_r == 3) {
                      nj.a(10, ai.field_r, 256);
                      break L12;
                    } else {
                      if (nl.field_r == 4) {
                        nj.a(10, ld.field_f, 256);
                        break L12;
                      } else {
                        if (nl.field_r == 2) {
                          nj.a(param0 ^ -4124, ne.field_d, 256);
                          break L12;
                        } else {
                          if (nl.field_r == 5) {
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
              if (nl.field_r == -1) {
                break L15;
              } else {
                if (nl.field_r != 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            int discarded$19 = 1;
            if (!h.b()) {
              break L13;
            } else {
              break L14;
            }
          }
          if (~sb.field_c >= ~d.a((byte) 22)) {
            t.field_c = false;
            if (-1 == nl.field_r) {
              break L13;
            } else {
              if (nl.field_r == 0) {
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
            int discarded$20 = 1;
            if (!h.b()) {
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
            int discarded$21 = 1;
            ub.field_x = l.a(sf.field_g, param0 ^ 1784758027, false, 1);
            int discarded$22 = 1;
            vj.field_b = l.a(jg.field_o, -1784753947, false, 1);
            int discarded$23 = 1;
            cc.field_a = l.a(rk.field_n, param0 + -1784749833, false, 1);
            bb.field_h = ub.field_x;
            ri.field_a = 2;
            md.field_c = vj.field_b;
            break L18;
          } else {
            break L18;
          }
        }
        L20: {
          if (ri.field_a != 2) {
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
                    int discarded$24 = 3;
                    mi.d();
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
                      stackOut_108_2 = (String) (Object) stackIn_108_2;
                      stackOut_108_3 = 0;
                      stackIn_109_0 = stackOut_108_0;
                      stackIn_109_1 = stackOut_108_1;
                      stackIn_109_2 = stackOut_108_2;
                      stackIn_109_3 = stackOut_108_3;
                      break L26;
                    } else {
                      stackOut_107_0 = stackIn_107_0;
                      stackOut_107_1 = stackIn_107_1;
                      stackOut_107_2 = (String) (Object) stackIn_107_2;
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
                    int discarded$25 = 126;
                    pk.field_n = sl.d();
                    int discarded$26 = 8300;
                    mk.field_f = u.r();
                    break L28;
                  }
                }
                ec.a(cc.field_a, (byte) -82, mk.field_f, pk.field_n);
                vj.field_b = null;
                cc.field_a = null;
                ub.field_x = null;
                ae.a((java.applet.Applet) this, param0 ^ -4213);
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
              int discarded$27 = 8053;
              ka.a(wizardrun.field_G);
              ((u) this).e(88);
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
            param2.field_c.field_b = param2;
            param2.field_b.field_c = param2;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "u.JA(" + 74 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void k() {
        field_z[5] = true;
    }

    private final void a(boolean param0, byte param1) {
        field_z[8] = false;
        field_z[0] = true;
        field_z[17] = true;
        field_z[16] = true;
        field_z[18] = true;
        int var3 = 0;
        field_z[3] = true;
        field_z[7] = true;
    }

    private final void q() {
        int var2 = nk.field_N.f(255);
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + gd.field_c;
        byte[] var5 = new byte[var4];
        nk.field_N.a(0, var4, 0, var5);
        sh.a(var3 != 0, 122, nf.a((byte) 113, var5), jg.f(1));
    }

    final static void a(va param0) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            var5 = wizardrun.field_H;
            try {
              L0: {
                L1: {
                  L2: {
                    var6 = new byte[24];
                    var2 = var6;
                    if (ub.field_t == null) {
                      break L2;
                    } else {
                      try {
                        L3: {
                          ub.field_t.a(0L, (byte) 113);
                          ub.field_t.a(var6, 9350);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              if (var3_int >= 24) {
                                break L5;
                              } else {
                                if (0 == var2[var3_int]) {
                                  var3_int++;
                                  continue L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            if (var3_int >= 24) {
                              throw new IOException();
                            } else {
                              param0.a(var2, 0, 24, -99);
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L7: while (true) {
                            if (var4 >= 24) {
                              decompiledRegionSelector0 = 1;
                              break L6;
                            } else {
                              var2[var4] = (byte) -1;
                              var4++;
                              continue L7;
                            }
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  param0.a(var2, 0, 24, -99);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var2_ref;
                stackOut_16_1 = new StringBuilder().append("u.HA(");
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param0 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L8;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L8;
                }
              }
              throw bd.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + -18 + ')');
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
            int discarded$0 = 640;
            int discarded$1 = 19;
            this.a(param0, 480, param2);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "u.U(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void m() {
        field_z[4] = true;
    }

    private final static int r() {
        return sk.field_v;
    }

    private final void c(byte param0) {
        int var3 = -90;
        int discarded$0 = -106;
        String var2 = vl.a();
        wl.a(var2, jg.f(1), (byte) -107);
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
            va var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = wizardrun.field_H;
            var4 = ad.a(mh.field_tb, gi.field_c, param1, 72);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (1 == var4) {
                  L1: {
                    int discarded$6 = -68;
                    int discarded$7 = 12;
                    var5_int = mk.a(vf.a(), -124, n.a());
                    if (var5_int != -1) {
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
                  int discarded$8 = -21;
                  int discarded$9 = -126;
                  var5_int = qk.a(pl.a(0), ((u) this).field_r, nf.a((byte) 123), dg.a(), sc.a(0), 0, w.c());
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
                if (var4 == 3) {
                  L4: {
                    if (-1 == nl.field_r) {
                      break L4;
                    } else {
                      if (nl.field_r == 0) {
                        break L4;
                      } else {
                        nl.field_r = -1;
                        oh.a((byte) -128);
                        break L4;
                      }
                    }
                  }
                  if (!param2) {
                    var5_int = qh.a(pl.a(0), ((u) this).field_r, ((u) this).field_B, -9, nf.a((byte) 124), false);
                    if (var5_int == -1) {
                      break L3;
                    } else {
                      if (0 == var5_int) {
                        h.field_m = pe.field_D;
                        vc.a(260);
                        ml.field_t = 10;
                        qb.field_p = false;
                        break L3;
                      } else {
                        nj.a(10, bh.field_g, var5_int);
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
                    int discarded$10 = -113;
                    cd.a(jg.f(1));
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
                if (var4 == 6) {
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
                if (var4 == 7) {
                  lb.a(60, jg.f(1));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var4 == 8) {
                  int discarded$11 = -113;
                  cd.a(jg.f(1));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 != 9) {
                  break L10;
                } else {
                  wg.a(1234, jg.f(1));
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
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
                if (var4 != 12) {
                  break L13;
                } else {
                  rb.a(jj.a(true), -1926289535, jg.f(1));
                  break L13;
                }
              }
              L14: {
                if (var4 != 13) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (null == cb.field_b) {
                          cb.field_b = new ud(ld.field_g, new java.net.URL(((u) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (cb.field_b.c(81)) {
                          L18: {
                            var12 = cb.field_b.b(-4);
                            if (var12 == null) {
                              var9 = null;
                              gf.b(9, (String) null);
                              break L18;
                            } else {
                              var7 = bi.a(0, var12.field_m, var12.field_k, false);
                              gf.b(9, var7);
                              break L18;
                            }
                          }
                          cb.field_b = null;
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      rg.a((Throwable) (Object) var5, "S1", -562);
                      var10 = null;
                      gf.b(9, (String) null);
                      cb.field_b = null;
                      break L19;
                    }
                  }
                  break L14;
                }
              }
              L20: {
                if (var4 == 15) {
                  ml.field_t = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (var4 != 17) {
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
            field_m = null;
            break L0;
          }
        }
        L1: {
          var2 = ra.field_k;
          if (var2 >= 64) {
            break L1;
          } else {
            if (field_z[var2]) {
              if (var2 != 0) {
                L2: {
                  if (var2 != 1) {
                    if (var2 != 2) {
                      if (var2 != 3) {
                        if (var2 == 4) {
                          pj.f(-17144);
                          break L2;
                        } else {
                          if (var2 == 5) {
                            rk.c(-2);
                            break L2;
                          } else {
                            if (var2 == 6) {
                              int discarded$6 = -114;
                              kk.o();
                              break L2;
                            } else {
                              if (7 != var2) {
                                if (8 == var2) {
                                  mi.a(-21284, (va) (Object) nk.field_N, ld.field_g, gd.field_c);
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
                                            int discarded$7 = 1;
                                            jk.a();
                                            break L2;
                                          } else {
                                            if (var2 == 17) {
                                              int discarded$8 = 108;
                                              this.q();
                                              break L2;
                                            } else {
                                              if (var2 == 18) {
                                                ck.a(2046877441);
                                                break L2;
                                              } else {
                                                int discarded$9 = 6;
                                                rg.a((Throwable) null, "MGS1: " + ni.c(), -562);
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
                                      if (var2 != 12) {
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
                                      stackOut_34_0 = (wc) var3;
                                      stackIn_36_0 = stackOut_34_0;
                                      stackIn_35_0 = stackOut_34_0;
                                      if (param0) {
                                        stackOut_36_0 = (wc) (Object) stackIn_36_0;
                                        stackOut_36_1 = 0;
                                        stackIn_37_0 = stackOut_36_0;
                                        stackIn_37_1 = stackOut_36_1;
                                        break L5;
                                      } else {
                                        stackOut_35_0 = (wc) (Object) stackIn_35_0;
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
                    int discarded$10 = 124;
                    bk.b();
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
        int discarded$11 = 6;
        rg.a((Throwable) null, "MGS2: " + ni.c(), -562);
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
        ((u) this).setBackground(java.awt.Color.black);
        mh.field_tb = ((u) this).field_p;
        me.a(mh.field_tb, !param4 ? true : false);
        i.a(mh.field_tb, ((u) this).field_l, param6, param1, ((u) this).field_q, ((u) this).field_s, ((u) this).field_w, ((u) this).field_y, 5000, 5000, ((u) this).field_t, ((u) this).field_C, 64, ld.field_g);
        qc.a(((u) this).field_w, param6, ((u) this).field_C, ld.field_g, ((u) this).field_l, ((u) this).field_y, true, ((u) this).field_q, mh.field_tb);
        int discarded$0 = 0;
        of.d();
        vc.field_K = qj.a(param4);
        jf.a(param4, wizardrun.field_G);
        sf.field_g = param7;
        jg.field_o = param2;
        ni.field_b = param3;
        rk.field_n = param0;
        hj.field_a = param5;
        int discarded$1 = -1;
        this.j();
        rl.a(-19);
    }

    protected u() {
    }

    public static void n() {
        field_u = null;
        field_A = null;
        field_x = null;
        field_z = null;
        field_v = null;
        field_m = null;
        field_o = null;
    }

    final int o(int param0) {
        int var2 = 0;
        L0: {
          if (param0 == -10618) {
            break L0;
          } else {
            ((u) this).c(88, true);
            break L0;
          }
        }
        L1: {
          L2: {
            int discarded$8 = -1;
            var2 = this.p();
            if (var2 == 0) {
              break L2;
            } else {
              if (var2 != 1) {
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
              int discarded$9 = 6;
              int discarded$10 = -86;
              oe.a();
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
            int discarded$11 = 99;
            gh.a();
            break L1;
          } else {
            break L1;
          }
        }
        return var2;
    }

    private final void a(int param0, int param1, String param2) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
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
          try {
            L0: {
              if (!((u) this).g(-49)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((u) this).field_y = ((u) this).getCodeBase().getHost();
                    var6_ref2 = ((u) this).field_y.toLowerCase();
                    stackOut_3_0 = this;
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                      break L2;
                    } else {
                      stackOut_4_0 = this;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (!var6_ref2.endsWith(".jagex.com")) {
                        stackOut_7_0 = this;
                        stackOut_7_1 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        stackIn_8_1 = stackOut_7_1;
                        break L1;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_6_0 = stackOut_5_0;
                        break L2;
                      }
                    }
                  }
                  stackOut_6_0 = this;
                  stackOut_6_1 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  stackIn_8_1 = stackOut_6_1;
                  break L1;
                }
                L3: {
                  ((u) this).field_B = stackIn_8_1 != 0;
                  ((u) this).field_C = Integer.parseInt(((u) this).getParameter("gameport1"));
                  ((u) this).field_w = Integer.parseInt(((u) this).getParameter("gameport2"));
                  var7 = ((u) this).getParameter("servernum");
                  if (var7 != null) {
                    ((u) this).field_l = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((u) this).field_q = Integer.parseInt(((u) this).getParameter("gamecrc"));
                  ((u) this).field_s = Long.parseLong(((u) this).getParameter("instanceid"));
                  ((u) this).field_t = ((u) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((u) this).getParameter("lang");
                  if (var8 != null) {
                    ((u) this).field_p = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((u) this).field_p < 5) {
                    break L5;
                  } else {
                    ((u) this).field_p = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((u) this).getParameter("affid");
                  if (var9 != null) {
                    ((u) this).field_r = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                mj.field_c = Boolean.valueOf(((u) this).getParameter("simplemode")).booleanValue();
                ((u) this).a(((u) this).field_q, param0, (byte) -100, param2, 480, 640, 32);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              rg.a((Throwable) (Object) var6, (String) null, -562);
              ((u) this).a("crash", (byte) 127);
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6_ref;
            stackOut_23_1 = new StringBuilder().append("u.CA(").append(param0).append(',').append(480).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + 19 + ',' + 640 + ')');
        }
    }

    private final void l() {
        field_z[1] = true;
    }

    final void d(byte param0) {
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
                int discarded$10 = -117;
                if (w.a()) {
                  if (ml.field_t != 0) {
                    ac.a(0, gi.field_c);
                    break L1;
                  } else {
                    int discarded$11 = this.a(6498, false, false);
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
              int discarded$12 = this.a(stackIn_4_1, stackIn_4_2 != 0, false);
              break L1;
            }
          }
          var2 = 95 / ((param0 - -52) / 50);
          break L0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "The Beach";
        field_m = new int[]{500, 100, 100, 300, 500, 100, 200, 200, 300, 500, 1000, 200};
        field_v = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
        field_z = new boolean[64];
        field_u = "Please wait...";
    }
}
