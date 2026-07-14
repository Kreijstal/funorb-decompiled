/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class tg extends hk {
    private int field_k;
    private int field_r;
    private boolean field_o;
    private boolean field_n;
    private long field_s;
    private int field_q;
    private int field_p;
    private int field_l;
    String field_i;
    private int field_m;
    private boolean field_j;

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        if (param3 >= -24) {
            return;
        }
        var10.pack();
        var10.dispose();
        ((tg) this).setBackground(java.awt.Color.black);
        sn.field_i = ((tg) this).field_k;
        il.a((byte) 52, sn.field_i);
        in.a(((tg) this).field_l, ((tg) this).field_o, ((tg) this).field_i, param0, sn.field_i, 5000, ((tg) this).field_r, nk.field_u, param2, ((tg) this).field_p, 0, ((tg) this).field_s, 5000, ((tg) this).field_m);
        mg.a(-1, sn.field_i, ((tg) this).field_r, ((tg) this).field_m, nk.field_u, ((tg) this).field_l, ((tg) this).field_i, ((tg) this).field_p, param0);
        qg.d(-125);
        wb.field_u = la.b(26);
        j.a(k.field_d, (byte) -125);
        b.field_w = param6;
        uf.field_p = param1;
        gf.field_k = param5;
        ug.field_b = param4;
        tp.field_g = param7;
        this.h(11);
        rn.a(-117);
    }

    private final static void m(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Torquing.field_u;
                    var1 = (Object) (Object) ha.field_b;
                    // monitorenter ha.field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        q.field_g = mj.field_d;
                        po.field_w = po.field_w + 1;
                        if (0 <= hb.field_y) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var2 = 0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var2 >= 112) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        i.field_P[var2] = false;
                        var2++;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        hb.field_y = n.field_w;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (n.field_w == hb.field_y) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var2 = no.field_i[n.field_w];
                        n.field_w = 127 & n.field_w - -1;
                        if (-1 >= (var2 ^ -1)) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        i.field_P[var2 ^ -1] = false;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        i.field_P[var2] = true;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        mj.field_d = gn.field_d;
                        // monitorexit var1
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var3;
                }
                case 14: {
                    if (param0 <= -26) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    tg.m(67);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var5 = 0;
        int stackIn_22_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_108_0 = 0;
        String stackIn_108_1 = null;
        int stackIn_109_0 = 0;
        String stackIn_109_1 = null;
        int stackIn_110_0 = 0;
        String stackIn_110_1 = null;
        int stackIn_110_2 = 0;
        int stackIn_140_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_105_0 = 0;
        int stackOut_107_0 = 0;
        String stackOut_107_1 = null;
        int stackOut_109_0 = 0;
        String stackOut_109_1 = null;
        int stackOut_109_2 = 0;
        int stackOut_108_0 = 0;
        String stackOut_108_1 = null;
        int stackOut_108_2 = 0;
        int stackOut_139_0 = 0;
        int stackOut_138_0 = 0;
        L0: {
          var5 = Torquing.field_u;
          if (ki.field_D == null) {
            tg.m(param0 ^ -104);
            gj.c(24417);
            if (sf.a(param0 ^ -24)) {
              break L0;
            } else {
              if (11 == op.field_i) {
                break L0;
              } else {
                ra.a((byte) 75);
                break L0;
              }
            }
          } else {
            tg.m(param0 ^ -104);
            gj.c(24417);
            if (sf.a(param0 ^ -24)) {
              break L0;
            } else {
              if (11 == op.field_i) {
                break L0;
              } else {
                ra.a((byte) 75);
                break L0;
              }
            }
          }
        }
        L1: {
          if (wb.field_u == null) {
            break L1;
          } else {
            da.field_g = wb.field_u.b(0);
            break L1;
          }
        }
        L2: {
          if (!oo.a(16158)) {
            break L2;
          } else {
            L3: {
              var3 = n.c((byte) 57) * 1200;
              if (((tg) this).field_n) {
                break L3;
              } else {
                if (var3 >= k.b(124)) {
                  break L2;
                } else {
                  if (var3 >= ac.d((byte) -97)) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
            }
            ((tg) this).field_n = false;
            ih.b(true);
            lg.h(-101);
            dc.a(2, gh.field_b, 2);
            pp.a(false);
            gk.field_a = true;
            ta.field_k = km.b(-1) - -15000L;
            break L2;
          }
        }
        L4: {
          L5: {
            if ((aj.field_J ^ -1) == 0) {
              break L5;
            } else {
              if (aj.field_J == 0) {
                break L5;
              } else {
                break L4;
              }
            }
          }
          L6: {
            if ((aj.field_J ^ -1) != 0) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L6;
            } else {
              stackOut_20_0 = 1;
              stackIn_22_0 = stackOut_20_0;
              break L6;
            }
          }
          var3 = stackIn_22_0;
          aj.field_J = un.a(0);
          if (var3 != 0) {
            L7: {
              if (0 == aj.field_J) {
                if (op.field_i == 11) {
                  if (!mk.a((byte) 38)) {
                    qa.a((byte) -72);
                    break L7;
                  } else {
                    if (aj.field_J == 0) {
                      break L4;
                    } else {
                      if (-1 == aj.field_J) {
                        break L4;
                      } else {
                        ta.field_k = km.b(-1) - -15000L;
                        break L4;
                      }
                    }
                  }
                } else {
                  if (aj.field_J == 0) {
                    break L4;
                  } else {
                    if (-1 == aj.field_J) {
                      break L4;
                    } else {
                      ta.field_k = km.b(-1) - -15000L;
                      break L4;
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            if (aj.field_J == 0) {
              break L4;
            } else {
              if (-1 == aj.field_J) {
                break L4;
              } else {
                ta.field_k = km.b(-1) - -15000L;
                break L4;
              }
            }
          } else {
            if (aj.field_J == 0) {
              break L4;
            } else {
              if (-1 == aj.field_J) {
                break L4;
              } else {
                ta.field_k = km.b(-1) - -15000L;
                break L4;
              }
            }
          }
        }
        L8: {
          if ((aj.field_J ^ -1) == 0) {
            break L8;
          } else {
            if (0 == aj.field_J) {
              break L8;
            } else {
              if (b.field_x > -11) {
                if (aj.field_J == 3) {
                  ((tg) this).a(10, "js5crc");
                  break L8;
                } else {
                  if (aj.field_J == 4) {
                    ((tg) this).a(param0 + -13, "js5io");
                    break L8;
                  } else {
                    if (2 != aj.field_J) {
                      if ((aj.field_J ^ -1) != -6) {
                        ((tg) this).a(10, "js5connect");
                        break L8;
                      } else {
                        ((tg) this).a(10, "outofdate");
                        break L8;
                      }
                    } else {
                      ((tg) this).a(10, "js5connect_full");
                      break L8;
                    }
                  }
                }
              } else {
                if (-11 <= op.field_i) {
                  L9: {
                    lg.h(param0 ^ -107);
                    if (aj.field_J != 3) {
                      if (aj.field_J == -5) {
                        dc.a(256, ib.field_a, 2);
                        break L9;
                      } else {
                        if (-3 == aj.field_J) {
                          dc.a(256, ra.field_b, param0 + -21);
                          break L9;
                        } else {
                          if (-6 != (aj.field_J ^ -1)) {
                            dc.a(256, jk.field_b, 2);
                            break L9;
                          } else {
                            dc.a(5, e.field_d, 2);
                            break L9;
                          }
                        }
                      }
                    } else {
                      dc.a(256, bm.field_r, param0 ^ 21);
                      break L9;
                    }
                  }
                  gk.field_a = true;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
          }
        }
        L10: {
          L11: {
            L12: {
              if (-1 == aj.field_J) {
                break L12;
              } else {
                if (aj.field_J != 0) {
                  break L11;
                } else {
                  break L12;
                }
              }
            }
            if (!mk.a((byte) 38)) {
              break L10;
            } else {
              break L11;
            }
          }
          if ((ta.field_k ^ -1L) < (km.b(-1) ^ -1L)) {
            break L10;
          } else {
            gk.field_a = false;
            if (0 == (aj.field_J ^ -1)) {
              break L10;
            } else {
              if (aj.field_J != 0) {
                aj.field_J = -1;
                jl.b((byte) 106);
                break L10;
              } else {
                break L10;
              }
            }
          }
        }
        L13: {
          if (aj.field_J != 0) {
            break L13;
          } else {
            break L13;
          }
        }
        L14: {
          if (b.field_x != 0) {
            break L14;
          } else {
            if (!sb.b(-80)) {
              break L14;
            } else {
              b.field_x = 1;
              break L14;
            }
          }
        }
        L15: {
          if (1 == b.field_x) {
            L16: {
              if (sn.field_i != 0) {
                je.field_f = vg.a(-27646, b.field_w);
                break L16;
              } else {
                break L16;
              }
            }
            lp.field_a = sd.a(true, 1, (byte) -125, tp.field_g, false);
            eg.field_v = sd.a(true, 1, (byte) -84, ug.field_b, false);
            kb.field_a = sd.a(true, 1, (byte) -65, gf.field_k, false);
            e.field_b = eg.field_v;
            rp.field_d = lp.field_a;
            b.field_x = 2;
            break L15;
          } else {
            break L15;
          }
        }
        L17: {
          if (-3 != (b.field_x ^ -1)) {
            break L17;
          } else {
            L18: {
              if (null != je.field_f) {
                if (je.field_f.a(-12749)) {
                  if (!je.field_f.b((byte) -58, "")) {
                    je.field_f = null;
                    break L18;
                  } else {
                    if (je.field_f.a(true, "")) {
                      fh.a(7, je.field_f);
                      je.field_f = null;
                      cf.a(param0 ^ 6648);
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                } else {
                  break L18;
                }
              } else {
                break L18;
              }
            }
            if (null != je.field_f) {
              break L17;
            } else {
              b.field_x = 3;
              break L17;
            }
          }
        }
        L19: {
          if (b.field_x == 3) {
            if (!ro.a((byte) 54, lp.field_a, kb.field_a, eg.field_v)) {
              break L19;
            } else {
              if (!pg.a(true, kb.field_a)) {
                break L19;
              } else {
                L20: {
                  L21: {
                    od.c(-8431868);
                    mk.a(true);
                    ob.field_b = vo.field_e;
                    r.field_c = false;
                    fd.a(ao.field_b, lp.field_a, 0, kb.field_a, eg.field_v);
                    if (ra.field_a) {
                      break L21;
                    } else {
                      if (null == vo.field_c) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L22: {
                    if (ra.field_a) {
                      stackOut_106_0 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      break L22;
                    } else {
                      stackOut_105_0 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      break L22;
                    }
                  }
                  L23: {
                    stackOut_107_0 = stackIn_107_0;
                    stackOut_107_1 = vo.field_c;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_109_1 = stackOut_107_1;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    if (ra.field_a) {
                      stackOut_109_0 = stackIn_109_0;
                      stackOut_109_1 = (String) (Object) stackIn_109_1;
                      stackOut_109_2 = 0;
                      stackIn_110_0 = stackOut_109_0;
                      stackIn_110_1 = stackOut_109_1;
                      stackIn_110_2 = stackOut_109_2;
                      break L23;
                    } else {
                      stackOut_108_0 = stackIn_108_0;
                      stackOut_108_1 = (String) (Object) stackIn_108_1;
                      stackOut_108_2 = 1;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_110_1 = stackOut_108_1;
                      stackIn_110_2 = stackOut_108_2;
                      break L23;
                    }
                  }
                  vb.a(stackIn_110_0 != 0, stackIn_110_1, stackIn_110_2 != 0, param0 ^ 4818);
                  break L20;
                }
                L24: {
                  if (ii.field_n) {
                    eh.c((byte) 90);
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (kb.field_d != null) {
                    break L25;
                  } else {
                    kb.field_d = rg.a(true);
                    qc.field_Z = c.a(24852);
                    break L25;
                  }
                }
                cl.a(qc.field_Z, false, kb.field_d, kb.field_a);
                eg.field_v = null;
                kb.field_a = null;
                lp.field_a = null;
                ne.a((java.applet.Applet) this, 0);
                cf.a(6639);
                b.field_x = 10;
                break L19;
              }
            }
          } else {
            break L19;
          }
        }
        L26: {
          if (b.field_x != -11) {
            break L26;
          } else {
            L27: {
              if (0 != sn.field_i) {
                rd.field_z = vg.a(-27646, uf.field_p);
                break L27;
              } else {
                break L27;
              }
            }
            b.field_x = 11;
            break L26;
          }
        }
        L28: {
          if (-12 != b.field_x) {
            break L28;
          } else {
            L29: {
              if (null == rd.field_z) {
                break L29;
              } else {
                L30: {
                  if (!rd.field_z.a(-12749)) {
                    break L30;
                  } else {
                    if (!rd.field_z.c(-19375)) {
                      break L30;
                    } else {
                      break L29;
                    }
                  }
                }
                df.a(0.0f, -84, il.a(Torquing.field_w, rd.field_z, md.field_b, (byte) 78));
                break L28;
              }
            }
            b.field_x = 12;
            w.field_F = true;
            break L28;
          }
        }
        L31: {
          if (b.field_x != -13) {
            break L31;
          } else {
            if (!w.field_F) {
              b.field_x = 13;
              break L31;
            } else {
              break L31;
            }
          }
        }
        L32: {
          if (-14 == b.field_x) {
            L33: {
              var3 = 1;
              if (null != a.field_c) {
                L34: {
                  if (!a.field_c.b(param0 ^ 23)) {
                    stackOut_139_0 = 0;
                    stackIn_140_0 = stackOut_139_0;
                    break L34;
                  } else {
                    stackOut_138_0 = 1;
                    stackIn_140_0 = stackOut_138_0;
                    break L34;
                  }
                }
                var3 = stackIn_140_0;
                df.a(a.field_c.field_l, 75, a.field_c.field_h);
                break L33;
              } else {
                break L33;
              }
            }
            if (var3 != 0) {
              b.field_x = 20;
              break L32;
            } else {
              break L32;
            }
          } else {
            break L32;
          }
        }
        L35: {
          if (param1) {
            break L35;
          } else {
            if (b.field_v) {
              tf.a(-101, k.field_d);
              ((tg) this).a(false);
              j.a(k.field_d, (byte) -118);
              break L35;
            } else {
              break L35;
            }
          }
        }
        L36: {
          if (hh.field_d[8]) {
            kj.a(8);
            break L36;
          } else {
            break L36;
          }
        }
        L37: {
          if (param0 == 23) {
            break L37;
          } else {
            ((tg) this).field_k = 113;
            break L37;
          }
        }
    }

    private final void h(int param0) {
        nk.field_s[6] = -2;
        nk.field_s[7] = -1;
        nk.field_s[17] = -1;
        nk.field_s[4] = -1;
        nk.field_s[16] = -1;
        nk.field_s[2] = -2;
        nk.field_s[8] = -2;
        nk.field_s[13] = -1;
        nk.field_s[1] = 16;
        nk.field_s[3] = -1;
        nk.field_s[10] = -1;
        nk.field_s[param0] = -1;
        nk.field_s[5] = -1;
        nk.field_s[12] = -1;
        nk.field_s[9] = -1;
        nk.field_s[18] = 1;
    }

    private final void c(byte param0) {
        String var2 = ol.a(124);
        ol.a(var2, true, ip.a(param0 + -81));
        if (param0 != 90) {
            this.k(30);
        }
    }

    private final void l(int param0) {
        hh.field_d[1] = true;
        if (param0 != 0) {
            Object var3 = null;
            ((tg) this).a(43, (String) null, -13);
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        int var3 = 0;
        hi var4 = null;
        int var5 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_30_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        L0: {
          var5 = Torquing.field_u;
          var2 = fa.field_e;
          var3 = -51 / ((param0 - 4) / 53);
          if (64 <= var2) {
            break L0;
          } else {
            if (hh.field_d[var2]) {
              if (-1 == (var2 ^ -1)) {
                return;
              } else {
                L1: {
                  if (1 != var2) {
                    if (2 == var2) {
                      il.f(-30593);
                      break L1;
                    } else {
                      if (3 == var2) {
                        vd.a(27912);
                        break L1;
                      } else {
                        if (var2 == 4) {
                          wh.b(99);
                          break L1;
                        } else {
                          if (-6 != (var2 ^ -1)) {
                            if (6 != var2) {
                              if (var2 != 7) {
                                if (var2 == 8) {
                                  nh.a(nk.field_u, oo.field_a, (fj) (Object) kj.field_d, (byte) -126);
                                  break L1;
                                } else {
                                  if (-17 == (var2 ^ -1)) {
                                    ti.b(1);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (11 == var2) {
                                        break L2;
                                      } else {
                                        if ((var2 ^ -1) == -13) {
                                          break L2;
                                        } else {
                                          if (var2 != -14) {
                                            if (-18 != var2) {
                                              if (18 != var2) {
                                                nn.a("MGS1: " + me.a(-1), (Throwable) null, -9958);
                                                ih.b(true);
                                                break L1;
                                              } else {
                                                mm.a((byte) 60);
                                                break L1;
                                              }
                                            } else {
                                              this.k(1);
                                              break L1;
                                            }
                                          } else {
                                            ld.a((byte) 123);
                                            break L1;
                                          }
                                        }
                                      }
                                    }
                                    L3: {
                                      stackOut_27_0 = -11936;
                                      stackIn_29_0 = stackOut_27_0;
                                      stackIn_28_0 = stackOut_27_0;
                                      if ((var2 ^ -1) != -13) {
                                        stackOut_29_0 = stackIn_29_0;
                                        stackOut_29_1 = 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        stackIn_30_1 = stackOut_29_1;
                                        break L3;
                                      } else {
                                        stackOut_28_0 = stackIn_28_0;
                                        stackOut_28_1 = 1;
                                        stackIn_30_0 = stackOut_28_0;
                                        stackIn_30_1 = stackOut_28_1;
                                        break L3;
                                      }
                                    }
                                    var4 = pa.a(stackIn_30_0, stackIn_30_1 != 0);
                                    ga.a(false, var4);
                                    break L1;
                                  }
                                }
                              } else {
                                this.c((byte) 90);
                                break L1;
                              }
                            } else {
                              en.e((byte) 50);
                              break L1;
                            }
                          } else {
                            ij.e(10078);
                            break L1;
                          }
                        }
                      }
                    }
                  } else {
                    uf.b(-109);
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
        nn.a("MGS2: " + me.a(-1), (Throwable) null, -9958);
        ih.b(true);
    }

    private final void i(int param0) {
        hh.field_d[2] = true;
        if (param0 != 24500) {
            int discarded$0 = ((tg) this).b(false, 7);
        }
    }

    private final void a(boolean param0, byte param1) {
        hh.field_d[7] = true;
        hh.field_d[16] = true;
        if (param1 > -90) {
            return;
        }
        hh.field_d[8] = param0;
        hh.field_d[17] = true;
        hh.field_d[0] = true;
        hh.field_d[18] = true;
        hh.field_d[3] = true;
    }

    final int g(int param0) {
        int var2 = -125 / ((param0 - 70) / 47);
        int var3 = this.j(-93);
        if (0 != var3) {
            // if_icmpeq L31
        } else {
            if (hh.field_d[1]) {
                kf.b(2, -8190);
            }
            if (hh.field_d[2]) {
                ag.a((byte) -45, 3);
            }
            if (hh.field_d[3]) {
                jm.a(4, 0);
            }
            if (hh.field_d[4]) {
                km.a((byte) -128, 5);
            }
            if (hh.field_d[5]) {
                jd.a(true, 6);
            }
            if (hh.field_d[6]) {
                fa.a(7, -21386);
            }
            if (!(!hh.field_d[8])) {
                kg.a(112);
            }
        }
        return var3;
    }

    private final void k(int param0) {
        int var2 = kj.field_d.i((byte) -101);
        int var3 = (param0 & var2) != 0 ? 1 : 0;
        int var4 = -1 + oo.field_a;
        byte[] var5 = new byte[var4];
        kj.field_d.b(0, param0 + 7, var5, var4);
        a.a(var3 != 0, lj.a(var5, false), ip.a(9), 3);
    }

    private final void d(byte param0) {
        if (param0 != 84) {
            ((tg) this).field_l = -57;
        }
        hh.field_d[5] = true;
    }

    final void a(int param0, String param1, int param2) {
        this.a((byte) 88, param0, 480, 640, param1);
        int var4 = 56 % ((28 - param2) / 53);
    }

    final int b(boolean param0, int param1) {
        if (param1 > -85) {
            this.f(93);
        }
        return this.a(param0, true, true);
    }

    private final int j(int param0) {
        int var2 = 0;
        if (!((tg) this).field_e) {
          if (!mk.a((byte) 38)) {
            return -1;
          } else {
            if (param0 <= -68) {
              if (gk.field_a) {
                return -1;
              } else {
                var2 = vb.a(fo.i(17543), ki.i(20), (byte) 27, true, ((tg) this).field_j, ((tg) this).field_q);
                if (var2 != -1) {
                  L0: {
                    if (var2 == 0) {
                      break L0;
                    } else {
                      if (var2 != 1) {
                        L1: {
                          if (hg.field_c) {
                            break L1;
                          } else {
                            ((tg) this).a(10, "reconnect");
                            break L1;
                          }
                        }
                        lg.h(-128);
                        dc.a(var2, pl.field_u, 2);
                        gk.field_a = true;
                        ta.field_k = 15000L + km.b(-1);
                        return var2;
                      } else {
                        break L0;
                      }
                    }
                  }
                  L2: {
                    if (op.field_i != 11) {
                      break L2;
                    } else {
                      if (aj.field_J == 0) {
                        qa.a((byte) -95);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return var2;
                } else {
                  return -1;
                }
              }
            } else {
              return 107;
            }
          }
        } else {
          return -1;
        }
    }

    private final void f(int param0) {
        hh.field_d[param0] = true;
    }

    final void n(int param0) {
        int var3 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        Object stackOut_8_0 = null;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          var3 = Torquing.field_u;
          if (la.a(true)) {
            L1: {
              stackOut_8_0 = this;
              stackIn_10_0 = stackOut_8_0;
              stackIn_9_0 = stackOut_8_0;
              if (dg.field_i == null) {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                break L1;
              } else {
                stackOut_9_0 = this;
                stackOut_9_1 = 1;
                stackIn_11_0 = stackOut_9_0;
                stackIn_11_1 = stackOut_9_1;
                break L1;
              }
            }
            int discarded$77 = this.a(stackIn_11_1 != 0, false, true);
            break L0;
          } else {
            if (-11 >= (b.field_x ^ -1)) {
              if (pl.b(-115)) {
                if (op.field_i != 0) {
                  ue.a(-16513, da.field_g);
                  break L0;
                } else {
                  int discarded$78 = this.a(false, false, true);
                  break L0;
                }
              } else {
                pg.a((byte) -3);
                break L0;
              }
            } else {
              break L0;
            }
          }
        }
        L2: {
          if (param0 >= 0) {
            break L2;
          } else {
            ((tg) this).field_j = false;
            break L2;
          }
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.a(param4, (byte) -116);
        if (param3) {
            this.l(0);
        }
        if (!(!param2)) {
            this.i(24500);
        }
        if (param0) {
            this.f(4);
        }
        if (!(!param1)) {
            this.d((byte) 84);
        }
    }

    private final void a(byte param0, int param1, int param2, int param3, String param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        L0: {
          if (param0 >= 80) {
            break L0;
          } else {
            ((tg) this).field_q = -47;
            break L0;
          }
        }
        try {
          if (((tg) this).b(false)) {
            L1: {
              L2: {
                ((tg) this).field_i = ((tg) this).getCodeBase().getHost();
                var6_ref = ((tg) this).field_i.toLowerCase();
                stackOut_4_0 = this;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L2;
                } else {
                  stackOut_5_0 = this;
                  stackIn_8_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_8_0 = this;
                    stackOut_8_1 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    break L1;
                  } else {
                    stackOut_6_0 = this;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = this;
              stackOut_7_1 = 1;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              break L1;
            }
            L3: {
              ((tg) this).field_j = stackIn_9_1 != 0;
              ((tg) this).field_p = Integer.parseInt(((tg) this).getParameter("gameport1"));
              ((tg) this).field_m = Integer.parseInt(((tg) this).getParameter("gameport2"));
              var7 = ((tg) this).getParameter("servernum");
              if (var7 == null) {
                break L3;
              } else {
                ((tg) this).field_l = Integer.parseInt(var7);
                break L3;
              }
            }
            L4: {
              ((tg) this).field_r = Integer.parseInt(((tg) this).getParameter("gamecrc"));
              ((tg) this).field_s = Long.parseLong(((tg) this).getParameter("instanceid"));
              ((tg) this).field_o = ((tg) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((tg) this).getParameter("lang");
              if (var8 == null) {
                break L4;
              } else {
                ((tg) this).field_k = Integer.parseInt(var8);
                break L4;
              }
            }
            L5: {
              if ((((tg) this).field_k ^ -1) <= -6) {
                ((tg) this).field_k = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var9 = ((tg) this).getParameter("affid");
              if (var9 == null) {
                break L6;
              } else {
                ((tg) this).field_q = Integer.parseInt(var9);
                break L6;
              }
            }
            ii.field_n = Boolean.valueOf(((tg) this).getParameter("simplemode")).booleanValue();
            ((tg) this).a(((tg) this).field_r, 121, param4, param2, param3, 32, param1);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        nn.a((String) null, (Throwable) (Object) var6, -9958);
        ((tg) this).a(10, "crash");
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
            fj var12 = null;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Torquing.field_u;
                        var4 = vb.a(da.field_g, sn.field_i, param0, 32);
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
                        if ((var4 ^ -1) != -2) {
                            statePc = 11;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        if (param2) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        stackOut_4_0 = 1;
                        stackIn_6_0 = stackOut_4_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 5: {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        var5_int = uj.a(hb.a(stackIn_6_0 != 0), (byte) 75, wp.b(-118));
                        if (-1 == var5_int) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        wb.a(var5_int, kh.field_n, (byte) -94, pl.field_u);
                        kh.field_n = null;
                        pl.field_u = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = qd.a(-112);
                        if (var11 != null) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        nl.a(-2, var11.booleanValue());
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (-3 != (var4 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var5_int = od.a(wd.a(-19), -124, fo.i(17543), of.d((byte) -87), ((tg) this).field_q, oc.a(false), ki.i(20));
                        if (0 == (var5_int ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        gk.a(-5006, pl.field_u, kh.field_n, var5_int);
                        pl.field_u = null;
                        kh.field_n = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (3 != var4) {
                            statePc = 25;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if ((aj.field_J ^ -1) == 0) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (0 != aj.field_J) {
                            statePc = 18;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        aj.field_J = -1;
                        jl.b((byte) 106);
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (!param1) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        gk.field_a = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 21: {
                        var5_int = vb.a(fo.i(17543), ki.i(20), (byte) 27, false, ((tg) this).field_j, ((tg) this).field_q);
                        if (-1 == var5_int) {
                            statePc = 25;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (-1 != (var5_int ^ -1)) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        gf.field_f = qd.field_e;
                        qa.a((byte) -106);
                        kb.field_h = false;
                        op.field_i = 10;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        dc.a(var5_int, pl.field_u, 2);
                        pl.field_u = null;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (-5 != var4) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (!ao.field_b) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        bc.a(ip.a(9), (byte) 108);
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        op.field_i = 10;
                        kb.field_h = true;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (-6 == var4) {
                            statePc = 31;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        to.a(ip.a(9), -20);
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
                        if ((var4 ^ -1) == -7) {
                            statePc = 34;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        if (r.field_c) {
                            statePc = 36;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        op.field_i = 10;
                        statePc = 37;
                        continue stateLoop;
                    }
                    case 37: {
                        if ((var4 ^ -1) == -8) {
                            statePc = 39;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        tp.a(ip.a(9), -65);
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (param2) {
                            statePc = 42;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        ((tg) this).field_r = 12;
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if (8 == var4) {
                            statePc = 44;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        bc.a(ip.a(9), (byte) 108);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (var4 == 9) {
                            statePc = 47;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        bi.a(ip.a(9), (byte) -126);
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (-11 != var4) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        wa.field_d.f(120, 17);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if (-12 == var4) {
                            statePc = 52;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        gq.a(25530, ip.a(9));
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (12 == var4) {
                            statePc = 55;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        ul.a(0, ah.c(2048), ip.a(9));
                        statePc = 56;
                        continue stateLoop;
                    }
                    case 56: {
                        if (-14 == (var4 ^ -1)) {
                            statePc = 58;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 58: {
                        try {
                            if (null == ub.field_G) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ub.field_G = new mm(nk.field_u, new java.net.URL(((tg) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (!ub.field_G.a(3)) {
                                statePc = 68;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var12 = ub.field_G.a(true);
                            if (var12 == null) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var7 = hk.a(var12.field_n, true, 0, var12.field_j);
                            hn.a(var7, (byte) -84);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var9 = null;
                            hn.a((String) null, (byte) -126);
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            ub.field_G = null;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 67;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        var5 = (Exception) (Object) caughtException;
                        nn.a("S1", (Throwable) (Object) var5, -9958);
                        var10 = null;
                        hn.a((String) null, (byte) -87);
                        ub.field_G = null;
                        statePc = 68;
                        continue stateLoop;
                    }
                    case 68: {
                        if ((var4 ^ -1) != -16) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        op.field_i = 10;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 70: {
                        if ((var4 ^ -1) != -17) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        return 1;
                    }
                    case 72: {
                        if ((var4 ^ -1) != -18) {
                            statePc = 74;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    }
                    case 73: {
                        return 2;
                    }
                    case 74: {
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

    protected tg() {
    }

    static {
    }
}
