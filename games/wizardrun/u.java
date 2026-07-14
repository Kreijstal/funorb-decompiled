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

    private final int p(int param0) {
        int var2 = 0;
        if (((u) this).field_c) {
          return -1;
        } else {
          if (!h.b(true)) {
            return -1;
          } else {
            if (param0 == -1) {
              if (t.field_c) {
                return -1;
              } else {
                var2 = qh.a(pl.a(param0 + 1), ((u) this).field_r, ((u) this).field_B, -9, nf.a((byte) 125), true);
                if ((var2 ^ -1) != 0) {
                  L0: {
                    if (var2 != 0) {
                      if (-2 != var2) {
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
                        if (nl.field_r != -1) {
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
            ((u) this).field_p = -29;
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
        int var3 = 0;
        int var4 = 0;
        int var5 = wizardrun.field_H;
        if (param1 > -117) {
            field_o = null;
        }
        int var2 = param0.length();
        for (var3 = 0; var2 > var3; var3++) {
            var4 = param0.charAt(var3);
            if (var4 < 48) {
                return null;
            }
            if (var4 > 57) {
                return null;
            }
        }
        return tl.field_d;
    }

    private final void b(byte param0) {
        field_z[2] = true;
        if (param0 != 0) {
            int discarded$0 = ((u) this).o(46);
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
        int stackIn_105_0 = 0;
        int stackIn_106_0 = 0;
        int stackIn_106_1 = 0;
        String stackIn_106_2 = null;
        int stackIn_107_0 = 0;
        int stackIn_107_1 = 0;
        String stackIn_107_2 = null;
        int stackIn_108_0 = 0;
        int stackIn_108_1 = 0;
        String stackIn_108_2 = null;
        int stackIn_108_3 = 0;
        int stackIn_138_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_105_1 = 0;
        String stackOut_105_2 = null;
        int stackOut_107_0 = 0;
        int stackOut_107_1 = 0;
        String stackOut_107_2 = null;
        int stackOut_107_3 = 0;
        int stackOut_106_0 = 0;
        int stackOut_106_1 = 0;
        String stackOut_106_2 = null;
        int stackOut_106_3 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
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
                if (ne.a((byte) 28) <= var3) {
                  break L5;
                } else {
                  if (var3 >= mj.a((byte) 53)) {
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
            qh.a(false);
            t.field_c = true;
            sb.field_c = 15000L + d.a((byte) 25);
            break L5;
          }
        }
        L7: {
          L8: {
            if (nl.field_r == 0) {
              break L8;
            } else {
              if (-1 == nl.field_r) {
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
          var3 = stackIn_26_0;
          nl.field_r = ab.c(14326);
          if (var3 == 0) {
            if (0 == nl.field_r) {
              break L7;
            } else {
              if (0 == nl.field_r) {
                break L7;
              } else {
                sb.field_c = d.a((byte) 36) - -15000L;
                break L7;
              }
            }
          } else {
            if (0 == nl.field_r) {
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
        }
        L10: {
          if (0 == nl.field_r) {
            break L10;
          } else {
            if (-1 == (nl.field_r ^ -1)) {
              break L10;
            } else {
              if (ri.field_a > -11) {
                if (3 != nl.field_r) {
                  if (nl.field_r != 4) {
                    if ((nl.field_r ^ -1) != -3) {
                      if (nl.field_r != -6) {
                        ((u) this).a("js5connect", (byte) 126);
                        break L10;
                      } else {
                        ((u) this).a("outofdate", (byte) 126);
                        break L10;
                      }
                    } else {
                      ((u) this).a("js5connect_full", (byte) 126);
                      break L10;
                    }
                  } else {
                    ((u) this).a("js5io", (byte) 127);
                    break L10;
                  }
                } else {
                  ((u) this).a("js5crc", (byte) 127);
                  break L10;
                }
              } else {
                if (-11 <= ml.field_t) {
                  L11: {
                    ci.a((byte) -125);
                    if (nl.field_r == -4) {
                      nj.a(10, ai.field_r, 256);
                      break L11;
                    } else {
                      if (-5 == nl.field_r) {
                        nj.a(10, ld.field_f, 256);
                        break L11;
                      } else {
                        if (-3 == (nl.field_r ^ -1)) {
                          nj.a(param0 ^ -4124, ne.field_d, 256);
                          break L11;
                        } else {
                          if ((nl.field_r ^ -1) == -6) {
                            nj.a(10, ki.field_L, 5);
                            break L11;
                          } else {
                            nj.a(param0 + 4124, mi.field_C, 256);
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  t.field_c = true;
                  break L10;
                } else {
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (0 == nl.field_r) {
                break L14;
              } else {
                if (nl.field_r != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!h.b(true)) {
              break L12;
            } else {
              break L13;
            }
          }
          if ((sb.field_c ^ -1L) >= (d.a((byte) 22) ^ -1L)) {
            t.field_c = false;
            if (-1 == nl.field_r) {
              break L12;
            } else {
              if (-1 == (nl.field_r ^ -1)) {
                break L12;
              } else {
                nl.field_r = -1;
                oh.a((byte) -117);
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (nl.field_r != 0) {
            break L15;
          } else {
            if (!h.b(true)) {
              cb.field_c = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (ri.field_a == 0) {
            if (!ab.d(param0 + 3988)) {
              break L16;
            } else {
              ri.field_a = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (ri.field_a == 1) {
            L18: {
              if (0 != mh.field_tb) {
                qh.field_c = si.a(46, hj.field_a);
                break L18;
              } else {
                break L18;
              }
            }
            ub.field_x = l.a(sf.field_g, param0 ^ 1784758027, false, 1, true);
            vj.field_b = l.a(jg.field_o, -1784753947, false, 1, true);
            cc.field_a = l.a(rk.field_n, param0 + -1784749833, false, 1, true);
            bb.field_h = ub.field_x;
            ri.field_a = 2;
            md.field_c = vj.field_b;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (-3 != (ri.field_a ^ -1)) {
            break L19;
          } else {
            L20: {
              if (qh.field_c != null) {
                if (!qh.field_c.b(17820)) {
                  break L20;
                } else {
                  if (!qh.field_c.c(-1, "")) {
                    qh.field_c = null;
                    break L20;
                  } else {
                    if (qh.field_c.a((byte) 29, "")) {
                      ea.a(0, qh.field_c);
                      qh.field_c = null;
                      jj.b(param0 + 4114);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              } else {
                break L20;
              }
            }
            if (null == qh.field_c) {
              ri.field_a = 3;
              break L19;
            } else {
              break L19;
            }
          }
        }
        L21: {
          if (3 == ri.field_a) {
            if (!of.a(ub.field_x, cc.field_a, (byte) -1, vj.field_b)) {
              break L21;
            } else {
              if (lc.a(param0 + 4114, cc.field_a)) {
                L22: {
                  L23: {
                    pg.a(-382);
                    mi.d(3);
                    vc.field_M = false;
                    dg.field_a = wj.field_G;
                    dj.a(param0 ^ -6284, cc.field_a, ub.field_x, vj.field_b, pf.field_g);
                    if (rf.field_c) {
                      break L23;
                    } else {
                      if (null != l.field_K) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    if (rf.field_c) {
                      stackOut_104_0 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      break L24;
                    } else {
                      stackOut_103_0 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_105_0 = stackIn_105_0;
                    stackOut_105_1 = 126;
                    stackOut_105_2 = l.field_K;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    stackIn_107_2 = stackOut_105_2;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    stackIn_106_2 = stackOut_105_2;
                    if (rf.field_c) {
                      stackOut_107_0 = stackIn_107_0;
                      stackOut_107_1 = stackIn_107_1;
                      stackOut_107_2 = (String) (Object) stackIn_107_2;
                      stackOut_107_3 = 0;
                      stackIn_108_0 = stackOut_107_0;
                      stackIn_108_1 = stackOut_107_1;
                      stackIn_108_2 = stackOut_107_2;
                      stackIn_108_3 = stackOut_107_3;
                      break L25;
                    } else {
                      stackOut_106_0 = stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackOut_106_2 = (String) (Object) stackIn_106_2;
                      stackOut_106_3 = 1;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      stackIn_108_2 = stackOut_106_2;
                      stackIn_108_3 = stackOut_106_3;
                      break L25;
                    }
                  }
                  ai.a(stackIn_108_0 != 0, (byte) stackIn_108_1, stackIn_108_2, stackIn_108_3 != 0);
                  break L22;
                }
                L26: {
                  if (!mj.field_c) {
                    break L26;
                  } else {
                    jf.a(param0 ^ -4158);
                    break L26;
                  }
                }
                L27: {
                  if (null != pk.field_n) {
                    break L27;
                  } else {
                    pk.field_n = sl.d((byte) 126);
                    mk.field_f = u.r(8300);
                    break L27;
                  }
                }
                ec.a(cc.field_a, (byte) -82, mk.field_f, pk.field_n);
                vj.field_b = null;
                cc.field_a = null;
                ub.field_x = null;
                ae.a((java.applet.Applet) this, param0 ^ -4213);
                jj.b(0);
                ri.field_a = 10;
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
          if (10 == ri.field_a) {
            L29: {
              if (mh.field_tb == 0) {
                break L29;
              } else {
                oh.field_b = si.a(90, ni.field_b);
                break L29;
              }
            }
            ri.field_a = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (ri.field_a == 11) {
            L31: {
              if (null == oh.field_b) {
                break L31;
              } else {
                L32: {
                  if (!oh.field_b.b(17820)) {
                    break L32;
                  } else {
                    if (!oh.field_b.d(-111)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                ok.a(de.a(param0 ^ 4150, td.field_e, oh.field_b, bl.field_c), 0.0f, 0);
                break L30;
              }
            }
            f.field_c = true;
            ri.field_a = 12;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (ri.field_a == 12) {
            if (f.field_c) {
              break L33;
            } else {
              ri.field_a = 13;
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if (13 == ri.field_a) {
            L35: {
              var3 = 1;
              if (null != ih.field_b) {
                L36: {
                  if (!ih.field_b.a(true)) {
                    stackOut_137_0 = 0;
                    stackIn_138_0 = stackOut_137_0;
                    break L36;
                  } else {
                    stackOut_136_0 = 1;
                    stackIn_138_0 = stackOut_136_0;
                    break L36;
                  }
                }
                var3 = stackIn_138_0;
                ok.a(ih.field_b.field_i, ih.field_b.field_k, 0);
                break L35;
              } else {
                break L35;
              }
            }
            if (var3 != 0) {
              ri.field_a = 20;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param1) {
            break L37;
          } else {
            if (tj.field_F) {
              ka.a(wizardrun.field_G, 8053);
              ((u) this).e(88);
              jf.a(false, wizardrun.field_G);
              break L37;
            } else {
              break L37;
            }
          }
        }
        L38: {
          if (!field_z[8]) {
            break L38;
          } else {
            di.a(8);
            break L38;
          }
        }
    }

    final static void a(byte param0, wl param1, wl param2) {
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
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = wizardrun.field_H;
                        var6 = new byte[24];
                        var2 = var6;
                        if (ub.field_t == null) {
                            statePc = 13;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ub.field_t.a(0L, (byte) 113);
                            ub.field_t.a(var6, 9350);
                            var3_int = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var3_int >= 24) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (0 == var2[var3_int]) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_int++;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (-25 >= var3_int) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (-25 <= var4) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        param0.a(var2, 0, 24, -99);
                        if (param1 == -18) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        int discarded$2 = u.r(5);
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return;
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

    final void a(int param0, byte param1, String param2) {
        int var4 = -125 / ((param1 - -9) / 49);
        this.a(param0, 480, param2, (byte) 19, 640);
    }

    private final void m(int param0) {
        field_z[4] = true;
        if (param0 != 28135) {
            field_m = null;
        }
    }

    private final static int r(int param0) {
        if (param0 != 8300) {
            Object var2 = null;
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
            Object var10 = null;
            Boolean var11 = null;
            va var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = wizardrun.field_H;
                        var4 = ad.a(mh.field_tb, gi.field_c, param1, param0 + -6426);
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
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        var5_int = mk.a(vf.a((byte) -68), -124, n.a((byte) 12));
                        if (0 != (var5_int ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        ni.a(bh.field_g, -101, pd.field_I, var5_int);
                        pd.field_I = null;
                        bh.field_g = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = df.b((byte) -52);
                        if (var11 != null) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        vg.a(var11.booleanValue(), 3289);
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (var4 != 2) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var5_int = qk.a(pl.a(param0 + -6498), ((u) this).field_r, nf.a((byte) 123), dg.a(-21), sc.a(0), param0 + -6498, w.c(-126));
                        if (var5_int == -1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        ve.a(bh.field_g, pd.field_I, (byte) -112, var5_int);
                        bh.field_g = null;
                        pd.field_I = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (-4 == (var4 ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (-1 == nl.field_r) {
                            statePc = 19;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (nl.field_r == 0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        nl.field_r = -1;
                        oh.a((byte) -128);
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (!param2) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        t.field_c = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 21: {
                        var5_int = qh.a(pl.a(0), ((u) this).field_r, ((u) this).field_B, -9, nf.a((byte) 124), false);
                        if ((var5_int ^ -1) == 0) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (0 == var5_int) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        nj.a(param0 + -6488, bh.field_g, var5_int);
                        bh.field_g = null;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        h.field_m = pe.field_D;
                        vc.a(260);
                        ml.field_t = 10;
                        qb.field_p = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (var4 == 4) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (pf.field_g) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        qb.field_p = true;
                        ml.field_t = 10;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        cd.a(jg.f(param0 + -6497), (byte) -113);
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if (5 != var4) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        bc.a(125, jg.f(1));
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if (var4 == -7) {
                            statePc = 34;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (!vc.field_M) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        ml.field_t = 10;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (-8 == var4) {
                            statePc = 38;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        lb.a(param0 + -6438, jg.f(1));
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (var4 == -9) {
                            statePc = 41;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        cd.a(jg.f(1), (byte) -113);
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if (-10 != var4) {
                            statePc = 44;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        wg.a(param0 ^ 7600, jg.f(1));
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (-11 != (var4 ^ -1)) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        n.field_b.c((byte) -118, 17);
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (var4 == 11) {
                            statePc = 48;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        ga.a(jg.f(1), (byte) -40);
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if (param0 == 6498) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        this.l(-45);
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (var4 != -13) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        rb.a(jj.a(true), -1926289535, jg.f(1));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (-14 != var4) {
                            statePc = 65;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        try {
                            if (null == cb.field_b) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            cb.field_b = new ud(ld.field_g, new java.net.URL(((u) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (cb.field_b.c(81)) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var12 = cb.field_b.b(-4);
                            if (var12 == null) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var7 = bi.a(0, var12.field_m, var12.field_k, false);
                            gf.b(9, var7);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            gf.b(param0 ^ 6507, (String) null);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            cb.field_b = null;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        var5 = (Exception) (Object) caughtException;
                        rg.a((Throwable) (Object) var5, "S1", param0 ^ -6996);
                        var10 = null;
                        gf.b(9, (String) null);
                        cb.field_b = null;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (var4 == 15) {
                            statePc = 67;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        ml.field_t = 10;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        if (var4 == -17) {
                            statePc = 70;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        return 1;
                    }
                    case 71: {
                        if (-18 != var4) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        return 2;
                    }
                    case 73: {
                        return 0;
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
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (field_z[var2]) {
              if (-1 != (var2 ^ -1)) {
                L2: {
                  if (var2 != 1) {
                    if (var2 != -3) {
                      if (-4 != var2) {
                        if (-5 == (var2 ^ -1)) {
                          pj.f(-17144);
                          break L2;
                        } else {
                          if (var2 == -6) {
                            rk.c(-2);
                            break L2;
                          } else {
                            if (-7 == var2) {
                              kk.o(-114);
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
        ((u) this).setBackground(java.awt.Color.black);
        mh.field_tb = ((u) this).field_p;
        me.a(mh.field_tb, !param4 ? true : false);
        i.a(mh.field_tb, ((u) this).field_l, param6, param1, ((u) this).field_q, ((u) this).field_s, ((u) this).field_w, ((u) this).field_y, 5000, 5000, ((u) this).field_t, ((u) this).field_C, 64, ld.field_g);
        qc.a(((u) this).field_w, param6, ((u) this).field_C, ld.field_g, ((u) this).field_l, ((u) this).field_y, true, ((u) this).field_q, mh.field_tb);
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
            field_v = null;
        }
        field_m = null;
        field_o = null;
    }

    final int o(int param0) {
        if (param0 != -10618) {
            ((u) this).c(88, true);
        }
        int var2 = this.p(-1);
        if (-1 != var2) {
            // if_icmpne L166
        }
        if (!(!field_z[1])) {
            rb.a(2, (byte) -85);
        }
        if (field_z[2]) {
            fh.b(-28323, 3);
        }
        if (field_z[3]) {
            ei.a((byte) 51, 4);
        }
        if (field_z[4]) {
            ud.a(5, param0 ^ 10496);
        }
        if (!(!field_z[5])) {
            oe.a((byte) -86, 6);
        }
        if (!(!field_z[6])) {
            fh.c(7, param0 + 10618);
        }
        if (!(!field_z[8])) {
            gh.a((byte) 99);
        }
        return var2;
    }

    private final void a(int param0, int param1, String param2, byte param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
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
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        try {
          if (!((u) this).g(param3 ^ -36)) {
            return;
          } else {
            L0: {
              L1: {
                ((u) this).field_y = ((u) this).getCodeBase().getHost();
                var6_ref = ((u) this).field_y.toLowerCase();
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
              ((u) this).field_B = stackIn_8_1 != 0;
              ((u) this).field_C = Integer.parseInt(((u) this).getParameter("gameport1"));
              ((u) this).field_w = Integer.parseInt(((u) this).getParameter("gameport2"));
              var7 = ((u) this).getParameter("servernum");
              if (param3 == 19) {
                break L2;
              } else {
                field_m = null;
                break L2;
              }
            }
            L3: {
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
              if ((((u) this).field_p ^ -1) > -6) {
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
            ((u) this).a(((u) this).field_q, param0, (byte) -100, param2, param1, param4, 32);
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        rg.a((Throwable) (Object) var6, (String) null, -562);
        ((u) this).a("crash", (byte) 127);
    }

    private final void l(int param0) {
        field_z[1] = true;
        if (param0 < 88) {
            u.n(63);
        }
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
                if (w.a((byte) -117)) {
                  if (-1 != (ml.field_t ^ -1)) {
                    ac.a(0, gi.field_c);
                    break L1;
                  } else {
                    int discarded$9 = this.a(6498, false, false);
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
              int discarded$10 = this.a(stackIn_4_1, stackIn_4_2 != 0, false);
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
