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
        RuntimeException var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Torquing.field_u;
        try {
          L0: {
            var1 = (Object) (Object) ha.field_b;
            synchronized (var1) {
              L1: {
                L2: {
                  q.field_g = mj.field_d;
                  po.field_w = po.field_w + 1;
                  if (0 <= hb.field_y) {
                    L3: while (true) {
                      if (n.field_w == hb.field_y) {
                        break L2;
                      } else {
                        var2 = no.field_i[n.field_w];
                        n.field_w = 127 & n.field_w - -1;
                        if (var2 >= 0) {
                          i.field_P[var2] = true;
                          continue L3;
                        } else {
                          i.field_P[~var2] = false;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    var2 = 0;
                    L4: while (true) {
                      if (var2 >= 112) {
                        hb.field_y = n.field_w;
                        break L2;
                      } else {
                        i.field_P[var2] = false;
                        var2++;
                        continue L4;
                      }
                    }
                  }
                }
                mj.field_d = gn.field_d;
                break L1;
              }
            }
            L5: {
              if (param0 <= -26) {
                break L5;
              } else {
                tg.m(67);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw rb.a((Throwable) (Object) var1_ref, "tg.R(" + param0 + 41);
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_22_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        String stackIn_101_1 = null;
        int stackIn_102_0 = 0;
        String stackIn_102_1 = null;
        int stackIn_103_0 = 0;
        String stackIn_103_1 = null;
        int stackIn_103_2 = 0;
        int stackIn_133_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_100_0 = 0;
        String stackOut_100_1 = null;
        int stackOut_102_0 = 0;
        String stackOut_102_1 = null;
        int stackOut_102_2 = 0;
        int stackOut_101_0 = 0;
        String stackOut_101_1 = null;
        int stackOut_101_2 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        L0: {
          var5 = Torquing.field_u;
          if (ki.field_D == null) {
            break L0;
          } else {
            L1: {
              if (dg.field_i == null) {
                var6 = lp.b(20);
                var4 = var6.getSize();
                ki.field_D.a(var4.width, false, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            ki.field_D.a((byte) -110);
            break L0;
          }
        }
        L2: {
          tg.m(param0 ^ -104);
          gj.c(24417);
          if (sf.a(param0 ^ -24)) {
            break L2;
          } else {
            if (11 == op.field_i) {
              break L2;
            } else {
              ra.a((byte) 75);
              break L2;
            }
          }
        }
        L3: {
          if (wb.field_u == null) {
            break L3;
          } else {
            da.field_g = wb.field_u.b(0);
            break L3;
          }
        }
        L4: {
          if (!oo.a(16158)) {
            break L4;
          } else {
            L5: {
              var3 = n.c((byte) 57) * 1200;
              if (((tg) this).field_n) {
                break L5;
              } else {
                if (~var3 <= ~k.b(124)) {
                  break L4;
                } else {
                  if (var3 >= ac.d((byte) -97)) {
                    break L4;
                  } else {
                    break L5;
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
            break L4;
          }
        }
        L6: {
          L7: {
            if (aj.field_J == -1) {
              break L7;
            } else {
              if (aj.field_J == 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (aj.field_J != -1) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L8;
            } else {
              stackOut_20_0 = 1;
              stackIn_22_0 = stackOut_20_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_22_0;
            aj.field_J = un.a(0);
            if (var3 == 0) {
              break L9;
            } else {
              if (0 == aj.field_J) {
                if (op.field_i != 11) {
                  break L9;
                } else {
                  if (mk.a((byte) 38)) {
                    break L9;
                  } else {
                    qa.a((byte) -72);
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (aj.field_J == -1) {
            break L6;
          } else {
            if (aj.field_J == 0) {
              break L6;
            } else {
              ta.field_k = km.b(-1) - -15000L;
              break L6;
            }
          }
        }
        L10: {
          if (aj.field_J == -1) {
            break L10;
          } else {
            if (0 == aj.field_J) {
              break L10;
            } else {
              if (b.field_x < 10) {
                if (aj.field_J == 3) {
                  ((tg) this).a(10, "js5crc");
                  break L10;
                } else {
                  if (aj.field_J == 4) {
                    ((tg) this).a(param0 + -13, "js5io");
                    break L10;
                  } else {
                    if (2 != aj.field_J) {
                      if (aj.field_J != 5) {
                        ((tg) this).a(10, "js5connect");
                        break L10;
                      } else {
                        ((tg) this).a(10, "outofdate");
                        break L10;
                      }
                    } else {
                      ((tg) this).a(10, "js5connect_full");
                      break L10;
                    }
                  }
                }
              } else {
                if (op.field_i >= 10) {
                  L11: {
                    lg.h(param0 ^ -107);
                    if (aj.field_J != 3) {
                      if (aj.field_J == 4) {
                        dc.a(256, ib.field_a, 2);
                        break L11;
                      } else {
                        if (aj.field_J == 2) {
                          dc.a(256, ra.field_b, param0 + -21);
                          break L11;
                        } else {
                          if (aj.field_J != 5) {
                            dc.a(256, jk.field_b, 2);
                            break L11;
                          } else {
                            dc.a(5, e.field_d, 2);
                            break L11;
                          }
                        }
                      }
                    } else {
                      dc.a(256, bm.field_r, param0 ^ 21);
                      break L11;
                    }
                  }
                  gk.field_a = true;
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
              if (-1 == aj.field_J) {
                break L14;
              } else {
                if (aj.field_J != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!mk.a((byte) 38)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (~ta.field_k < ~km.b(-1)) {
            break L12;
          } else {
            gk.field_a = false;
            if (aj.field_J == -1) {
              break L12;
            } else {
              if (aj.field_J != 0) {
                aj.field_J = -1;
                jl.b((byte) 106);
                break L12;
              } else {
                break L12;
              }
            }
          }
        }
        L15: {
          if (aj.field_J != 0) {
            break L15;
          } else {
            if (!mk.a((byte) 38)) {
              mh.field_g = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (b.field_x != 0) {
            break L16;
          } else {
            if (!sb.b(-80)) {
              break L16;
            } else {
              b.field_x = 1;
              break L16;
            }
          }
        }
        L17: {
          if (1 == b.field_x) {
            L18: {
              if (sn.field_i != 0) {
                je.field_f = vg.a(-27646, b.field_w);
                break L18;
              } else {
                break L18;
              }
            }
            lp.field_a = sd.a(true, 1, (byte) -125, tp.field_g, false);
            eg.field_v = sd.a(true, 1, (byte) -84, ug.field_b, false);
            kb.field_a = sd.a(true, 1, (byte) -65, gf.field_k, false);
            e.field_b = eg.field_v;
            rp.field_d = lp.field_a;
            b.field_x = 2;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (b.field_x != 2) {
            break L19;
          } else {
            L20: {
              if (null != je.field_f) {
                if (je.field_f.a(-12749)) {
                  if (!je.field_f.b((byte) -58, "")) {
                    je.field_f = null;
                    break L20;
                  } else {
                    if (je.field_f.a(true, "")) {
                      fh.a(7, je.field_f);
                      je.field_f = null;
                      cf.a(param0 ^ 6648);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              } else {
                break L20;
              }
            }
            if (null != je.field_f) {
              break L19;
            } else {
              b.field_x = 3;
              break L19;
            }
          }
        }
        L21: {
          if (b.field_x == 3) {
            if (!ro.a((byte) 54, lp.field_a, kb.field_a, eg.field_v)) {
              break L21;
            } else {
              if (!pg.a(true, kb.field_a)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    od.c(-8431868);
                    mk.a(true);
                    ob.field_b = vo.field_e;
                    r.field_c = false;
                    fd.a(ao.field_b, lp.field_a, 0, kb.field_a, eg.field_v);
                    if (ra.field_a) {
                      break L23;
                    } else {
                      if (null == vo.field_c) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (ra.field_a) {
                      stackOut_99_0 = 0;
                      stackIn_100_0 = stackOut_99_0;
                      break L24;
                    } else {
                      stackOut_98_0 = 1;
                      stackIn_100_0 = stackOut_98_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_100_0 = stackIn_100_0;
                    stackOut_100_1 = vo.field_c;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_102_1 = stackOut_100_1;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    if (ra.field_a) {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = (String) (Object) stackIn_102_1;
                      stackOut_102_2 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      stackIn_103_2 = stackOut_102_2;
                      break L25;
                    } else {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = (String) (Object) stackIn_101_1;
                      stackOut_101_2 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      stackIn_103_2 = stackOut_101_2;
                      break L25;
                    }
                  }
                  vb.a(stackIn_103_0 != 0, stackIn_103_1, stackIn_103_2 != 0, param0 ^ 4818);
                  break L22;
                }
                L26: {
                  if (ii.field_n) {
                    eh.c((byte) 90);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (kb.field_d != null) {
                    break L27;
                  } else {
                    kb.field_d = rg.a(true);
                    qc.field_Z = c.a(24852);
                    break L27;
                  }
                }
                cl.a(qc.field_Z, false, kb.field_d, kb.field_a);
                eg.field_v = null;
                kb.field_a = null;
                lp.field_a = null;
                ne.a((java.applet.Applet) this, 0);
                cf.a(6639);
                b.field_x = 10;
                break L21;
              }
            }
          } else {
            break L21;
          }
        }
        L28: {
          if (b.field_x != 10) {
            break L28;
          } else {
            L29: {
              if (0 != sn.field_i) {
                rd.field_z = vg.a(-27646, uf.field_p);
                break L29;
              } else {
                break L29;
              }
            }
            b.field_x = 11;
            break L28;
          }
        }
        L30: {
          if (b.field_x != 11) {
            break L30;
          } else {
            L31: {
              if (null == rd.field_z) {
                break L31;
              } else {
                L32: {
                  if (!rd.field_z.a(-12749)) {
                    break L32;
                  } else {
                    if (!rd.field_z.c(-19375)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                df.a(0.0f, -84, il.a(Torquing.field_w, rd.field_z, md.field_b, (byte) 78));
                break L30;
              }
            }
            b.field_x = 12;
            w.field_F = true;
            break L30;
          }
        }
        L33: {
          if (b.field_x != 12) {
            break L33;
          } else {
            if (!w.field_F) {
              b.field_x = 13;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L34: {
          if (b.field_x == 13) {
            L35: {
              var3 = 1;
              if (null != a.field_c) {
                L36: {
                  if (!a.field_c.b(param0 ^ 23)) {
                    stackOut_132_0 = 0;
                    stackIn_133_0 = stackOut_132_0;
                    break L36;
                  } else {
                    stackOut_131_0 = 1;
                    stackIn_133_0 = stackOut_131_0;
                    break L36;
                  }
                }
                var3 = stackIn_133_0;
                df.a(a.field_c.field_l, 75, a.field_c.field_h);
                break L35;
              } else {
                break L35;
              }
            }
            if (var3 != 0) {
              b.field_x = 20;
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
            if (b.field_v) {
              tf.a(-101, k.field_d);
              ((tg) this).a(false);
              j.a(k.field_d, (byte) -118);
              break L37;
            } else {
              break L37;
            }
          }
        }
        L38: {
          if (hh.field_d[8]) {
            kj.a(8);
            break L38;
          } else {
            break L38;
          }
        }
        L39: {
          if (param0 == 23) {
            break L39;
          } else {
            ((tg) this).field_k = 113;
            break L39;
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
        nk.field_s[11] = -1;
        nk.field_s[5] = -1;
        nk.field_s[12] = -1;
        nk.field_s[9] = -1;
        nk.field_s[18] = 1;
    }

    private final void c(byte param0) {
        String var2 = ol.a(124);
        ol.a(var2, true, ip.a(9));
    }

    private final void l(int param0) {
        hh.field_d[1] = true;
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
              if (var2 == 0) {
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
                          if (var2 != 5) {
                            if (6 != var2) {
                              if (var2 != 7) {
                                if (var2 == 8) {
                                  nh.a(nk.field_u, oo.field_a, (fj) (Object) kj.field_d, (byte) -126);
                                  break L1;
                                } else {
                                  if (var2 == 16) {
                                    ti.b(1);
                                    break L1;
                                  } else {
                                    L2: {
                                      if (11 == var2) {
                                        break L2;
                                      } else {
                                        if (var2 == 12) {
                                          break L2;
                                        } else {
                                          if (var2 != 13) {
                                            if (var2 != 17) {
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
                                      if (var2 != 12) {
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
    }

    private final void a(boolean param0, byte param1) {
        hh.field_d[7] = true;
        hh.field_d[16] = true;
        hh.field_d[8] = param0;
        hh.field_d[17] = true;
        hh.field_d[0] = true;
        hh.field_d[18] = true;
        hh.field_d[3] = true;
    }

    final int g(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            var2 = -125 / ((param0 - 70) / 47);
            var3 = this.j(-93);
            if (0 == var3) {
              break L1;
            } else {
              if (1 == var3) {
                break L1;
              } else {
                break L0;
              }
            }
          }
          L2: {
            if (!hh.field_d[1]) {
              break L2;
            } else {
              kf.b(2, -8190);
              break L2;
            }
          }
          L3: {
            if (!hh.field_d[2]) {
              break L3;
            } else {
              ag.a((byte) -45, 3);
              break L3;
            }
          }
          L4: {
            if (!hh.field_d[3]) {
              break L4;
            } else {
              jm.a(4, 0);
              break L4;
            }
          }
          L5: {
            if (!hh.field_d[4]) {
              break L5;
            } else {
              km.a((byte) -128, 5);
              break L5;
            }
          }
          L6: {
            if (!hh.field_d[5]) {
              break L6;
            } else {
              jd.a(true, 6);
              break L6;
            }
          }
          L7: {
            if (!hh.field_d[6]) {
              break L7;
            } else {
              fa.a(7, -21386);
              break L7;
            }
          }
          if (hh.field_d[8]) {
            kg.a(112);
            break L0;
          } else {
            break L0;
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
        hh.field_d[5] = true;
    }

    final void a(int param0, String param1, int param2) {
        try {
            this.a((byte) 88, param0, 480, 640, param1);
            int var4_int = 56 % ((28 - param2) / 53);
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) (Object) runtimeException, "tg.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
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
            if (b.field_x >= 10) {
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
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 80) {
                break L1;
              } else {
                ((tg) this).field_q = -47;
                break L1;
              }
            }
            try {
              L2: {
                if (((tg) this).b(false)) {
                  L3: {
                    L4: {
                      ((tg) this).field_i = ((tg) this).getCodeBase().getHost();
                      var6_ref2 = ((tg) this).field_i.toLowerCase();
                      stackOut_4_0 = this;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var6_ref2.equals((Object) (Object) "jagex.com")) {
                        break L4;
                      } else {
                        stackOut_5_0 = this;
                        stackIn_8_0 = stackOut_5_0;
                        stackIn_6_0 = stackOut_5_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_8_0 = this;
                          stackOut_8_1 = 0;
                          stackIn_9_0 = stackOut_8_0;
                          stackIn_9_1 = stackOut_8_1;
                          break L3;
                        } else {
                          stackOut_6_0 = this;
                          stackIn_7_0 = stackOut_6_0;
                          break L4;
                        }
                      }
                    }
                    stackOut_7_0 = this;
                    stackOut_7_1 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_9_1 = stackOut_7_1;
                    break L3;
                  }
                  L5: {
                    ((tg) this).field_j = stackIn_9_1 != 0;
                    ((tg) this).field_p = Integer.parseInt(((tg) this).getParameter("gameport1"));
                    ((tg) this).field_m = Integer.parseInt(((tg) this).getParameter("gameport2"));
                    var7 = ((tg) this).getParameter("servernum");
                    if (var7 == null) {
                      break L5;
                    } else {
                      ((tg) this).field_l = Integer.parseInt(var7);
                      break L5;
                    }
                  }
                  L6: {
                    ((tg) this).field_r = Integer.parseInt(((tg) this).getParameter("gamecrc"));
                    ((tg) this).field_s = Long.parseLong(((tg) this).getParameter("instanceid"));
                    ((tg) this).field_o = ((tg) this).getParameter("member").equals((Object) (Object) "yes");
                    var8 = ((tg) this).getParameter("lang");
                    if (var8 == null) {
                      break L6;
                    } else {
                      ((tg) this).field_k = Integer.parseInt(var8);
                      break L6;
                    }
                  }
                  L7: {
                    if (((tg) this).field_k >= 5) {
                      ((tg) this).field_k = 0;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    var9 = ((tg) this).getParameter("affid");
                    if (var9 == null) {
                      break L8;
                    } else {
                      ((tg) this).field_q = Integer.parseInt(var9);
                      break L8;
                    }
                  }
                  ii.field_n = Boolean.valueOf(((tg) this).getParameter("simplemode")).booleanValue();
                  ((tg) this).a(((tg) this).field_r, 121, param4, param2, param3, 32, param1);
                  break L2;
                } else {
                  return;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = null;
                nn.a((String) null, (Throwable) (Object) var6, -9958);
                ((tg) this).a(10, "crash");
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6_ref;
            stackOut_22_1 = new StringBuilder().append("tg.P(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param4 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
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
            fj var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = Torquing.field_u;
            var4 = vb.a(da.field_g, sn.field_i, param0, 32);
            if (var4 != 0) {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    var5_int = uj.a(hb.a(false), (byte) 75, wp.b(-118));
                    if (-1 == var5_int) {
                      break L1;
                    } else {
                      wb.a(var5_int, kh.field_n, (byte) -94, pl.field_u);
                      kh.field_n = null;
                      pl.field_u = null;
                      break L1;
                    }
                  }
                  var11 = qd.a(-112);
                  if (var11 != null) {
                    nl.a(-2, var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 != 2) {
                  break L2;
                } else {
                  var5_int = od.a(wd.a(-19), -124, fo.i(17543), of.d((byte) -87), ((tg) this).field_q, oc.a(false), ki.i(20));
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    gk.a(-5006, pl.field_u, kh.field_n, var5_int);
                    pl.field_u = null;
                    kh.field_n = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (3 != var4) {
                  break L3;
                } else {
                  L4: {
                    if (aj.field_J == -1) {
                      break L4;
                    } else {
                      if (0 != aj.field_J) {
                        aj.field_J = -1;
                        jl.b((byte) 106);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param1) {
                    var5_int = vb.a(fo.i(17543), ki.i(20), (byte) 27, false, ((tg) this).field_j, ((tg) this).field_q);
                    if (-1 == var5_int) {
                      break L3;
                    } else {
                      if (var5_int != 0) {
                        dc.a(var5_int, pl.field_u, 2);
                        pl.field_u = null;
                        break L3;
                      } else {
                        gf.field_f = qd.field_e;
                        qa.a((byte) -106);
                        kb.field_h = false;
                        op.field_i = 10;
                        break L3;
                      }
                    }
                  } else {
                    gk.field_a = false;
                    break L3;
                  }
                }
              }
              L5: {
                if (var4 != 4) {
                  break L5;
                } else {
                  if (!ao.field_b) {
                    op.field_i = 10;
                    kb.field_h = true;
                    break L5;
                  } else {
                    bc.a(ip.a(9), (byte) 108);
                    break L5;
                  }
                }
              }
              L6: {
                if (var4 == 5) {
                  to.a(ip.a(9), -20);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (r.field_c) {
                    op.field_i = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (var4 == 7) {
                  tp.a(ip.a(9), -65);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (8 == var4) {
                  bc.a(ip.a(9), (byte) 108);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  bi.a(ip.a(9), (byte) -126);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  wa.field_d.f(120, 17);
                  break L11;
                }
              }
              L12: {
                if (var4 == 11) {
                  gq.a(25530, ip.a(9));
                  break L12;
                } else {
                  break L12;
                }
              }
              L13: {
                if (12 == var4) {
                  ul.a(0, ah.c(2048), ip.a(9));
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if (var4 == 13) {
                  try {
                    L15: {
                      L16: {
                        if (null == ub.field_G) {
                          ub.field_G = new mm(nk.field_u, new java.net.URL(((tg) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (!ub.field_G.a(3)) {
                          break L17;
                        } else {
                          L18: {
                            var12 = ub.field_G.a(true);
                            if (var12 == null) {
                              var9 = null;
                              hn.a((String) null, (byte) -126);
                              break L18;
                            } else {
                              var7 = hk.a(var12.field_n, true, 0, var12.field_j);
                              hn.a(var7, (byte) -84);
                              break L18;
                            }
                          }
                          ub.field_G = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      nn.a("S1", (Throwable) (Object) var5, -9958);
                      var10 = null;
                      hn.a((String) null, (byte) -87);
                      ub.field_G = null;
                      break L19;
                    }
                  }
                  break L14;
                } else {
                  break L14;
                }
              }
              L20: {
                if (var4 != 15) {
                  break L20;
                } else {
                  op.field_i = 10;
                  break L20;
                }
              }
              if (var4 != 16) {
                if (var4 != 17) {
                  return 0;
                } else {
                  return 2;
                }
              } else {
                return 1;
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

    protected tg() {
    }

    static {
    }
}
