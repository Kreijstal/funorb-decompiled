/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class nk extends qb {
    private int field_A;
    private int field_r;
    static int field_z;
    private int field_s;
    private int field_q;
    private int field_u;
    private int field_D;
    static String field_C;
    private boolean field_x;
    private boolean field_y;
    private boolean field_w;
    String field_B;
    private long field_v;
    static String field_t;

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((nk) this).setBackground(java.awt.Color.black);
        ri.field_e = ((nk) this).field_u;
        jh.a(14221, ri.field_e);
        sb.a(((nk) this).field_v, jh.field_a, ((nk) this).field_q, 0, param2, param7, ri.field_e, ((nk) this).field_s, param4, ((nk) this).field_D, ((nk) this).field_B, 5000, ((nk) this).field_r, ((nk) this).field_x);
        uk.a(((nk) this).field_D, ((nk) this).field_s, ri.field_e, jh.field_a, ((nk) this).field_r, (byte) -92, param7, ((nk) this).field_q, ((nk) this).field_B);
        li.g(false);
        rk.field_c = bl.a(115);
        ha.a(ug.field_y, (byte) 76);
        th.field_m = param6;
        ea.field_d = param0;
        ll.field_f = param1;
        ij.field_l = param3;
        gf.field_e = param5;
        this.g(7);
        vk.b(0);
    }

    private final void h(int param0) {
        String var2 = kg.g(0);
        if (param0 != 16) {
            ((nk) this).field_w = true;
        }
        gg.a(true, kk.c(-14047), var2);
    }

    private final void j(int param0) {
        ij.field_o[4] = true;
        if (param0 >= -25) {
            this.l(-103);
        }
    }

    private final void i(int param0) {
        ij.field_o[2] = true;
        if (param0 != -1) {
            ((nk) this).field_r = -84;
        }
    }

    private final void a(int param0, boolean param1) {
        ij.field_o[17] = true;
        ij.field_o[0] = true;
        ij.field_o[18] = true;
        ij.field_o[7] = true;
        ij.field_o[8] = param1;
        ij.field_o[16] = true;
        ij.field_o[param0] = true;
    }

    public static void c(byte param0) {
        if (param0 != 89) {
            nk.c((byte) -5);
        }
        field_t = null;
        field_C = null;
    }

    final int b(boolean param0, int param1) {
        if (param1 >= -51) {
            ((nk) this).field_u = 35;
        }
        return this.a(true, 0, param0);
    }

    final void e(byte param0) {
        int var3 = Lexicominos.field_L ? 1 : 0;
        if (ha.a(118)) {
            int discarded$1 = this.a(false, 0, null != ff.field_b ? true : false);
        } else {
            if (10 > wf.field_i) {
            } else {
                if (!og.a(23440)) {
                    ta.d(-108);
                } else {
                    if (ta.field_g == 0) {
                        int discarded$3 = this.a(false, 0, false);
                    } else {
                        hb.a(gd.field_l, true);
                    }
                }
            }
        }
        if (param0 < 4) {
            int discarded$4 = this.a(true, 79, false);
        }
    }

    private final void g(int param0) {
        fg.field_f[5] = -1;
        fg.field_f[12] = -1;
        fg.field_f[8] = -2;
        fg.field_f[3] = -1;
        fg.field_f[1] = 16;
        fg.field_f[16] = -1;
        fg.field_f[13] = -1;
        fg.field_f[2] = -2;
        fg.field_f[6] = -2;
        fg.field_f[18] = 1;
        fg.field_f[4] = -1;
        fg.field_f[17] = -1;
        fg.field_f[11] = -1;
        fg.field_f[9] = -1;
        fg.field_f[param0] = -1;
        fg.field_f[10] = -1;
    }

    final void c(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_25_0 = 0;
        String stackIn_110_0 = null;
        String stackIn_111_0 = null;
        String stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        String stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        String stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        String stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_115_2 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        String stackOut_109_0 = null;
        String stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        String stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        String stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        String stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        String stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (null != da.field_a) {
            L1: {
              if (ff.field_b == null) {
                var6 = jd.a(-88);
                var4 = var6.getSize();
                da.field_a.a(var4.height, (byte) -65, var4.width);
                break L1;
              } else {
                break L1;
              }
            }
            da.field_a.d(-1);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          u.j(param1 ^ 6);
          bf.b((byte) -21);
          if (lh.b(param1 ^ 24920)) {
            break L2;
          } else {
            if ((ta.field_g ^ -1) != -12) {
              kj.a((byte) 22);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (null != rk.field_c) {
            gd.field_l = rk.field_c.c(82);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!bd.c(false)) {
            break L4;
          } else {
            L5: {
              var3 = cl.p(param1 + -127) * 1200;
              if (((nk) this).field_w) {
                break L5;
              } else {
                if (ec.a(-28617) <= var3) {
                  break L4;
                } else {
                  if (var3 >= rf.a(30448)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((nk) this).field_w = false;
            ck.b((byte) -125);
            ia.a((byte) 93);
            sc.a(2, (byte) -128, kk.field_i);
            l.i(57);
            kj.field_o = true;
            mc.field_i = rf.c(0) - -15000L;
            break L4;
          }
        }
        L6: {
          L7: {
            if (nc.field_r == 0) {
              break L7;
            } else {
              if (-1 == nc.field_r) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if ((nc.field_r ^ -1) != 0) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L8;
            } else {
              stackOut_23_0 = 1;
              stackIn_25_0 = stackOut_23_0;
              break L8;
            }
          }
          var3 = stackIn_25_0;
          nc.field_r = ea.a((byte) 105);
          if (var3 != 0) {
            L9: {
              if (0 == nc.field_r) {
                if (ta.field_g == 11) {
                  if (!d.a((byte) 117)) {
                    wb.b((byte) 50);
                    break L9;
                  } else {
                    if (-1 == nc.field_r) {
                      break L6;
                    } else {
                      if (0 == nc.field_r) {
                        break L6;
                      } else {
                        mc.field_i = rf.c(0) + 15000L;
                        break L6;
                      }
                    }
                  }
                } else {
                  if (-1 == nc.field_r) {
                    break L6;
                  } else {
                    if (0 == nc.field_r) {
                      break L6;
                    } else {
                      mc.field_i = rf.c(0) + 15000L;
                      break L6;
                    }
                  }
                }
              } else {
                break L9;
              }
            }
            if (-1 == nc.field_r) {
              break L6;
            } else {
              if (0 == nc.field_r) {
                break L6;
              } else {
                mc.field_i = rf.c(0) + 15000L;
                break L6;
              }
            }
          } else {
            if (-1 == nc.field_r) {
              break L6;
            } else {
              if (0 == nc.field_r) {
                break L6;
              } else {
                mc.field_i = rf.c(0) + 15000L;
                break L6;
              }
            }
          }
        }
        L10: {
          if ((nc.field_r ^ -1) == 0) {
            break L10;
          } else {
            if (nc.field_r == 0) {
              break L10;
            } else {
              if ((wf.field_i ^ -1) > -11) {
                if (3 == nc.field_r) {
                  ((nk) this).a("js5crc", 78);
                  break L10;
                } else {
                  if (-5 != (nc.field_r ^ -1)) {
                    if (2 == nc.field_r) {
                      ((nk) this).a("js5connect_full", 118);
                      break L10;
                    } else {
                      if (nc.field_r == 5) {
                        ((nk) this).a("outofdate", 90);
                        break L10;
                      } else {
                        ((nk) this).a("js5connect", 80);
                        break L10;
                      }
                    }
                  } else {
                    ((nk) this).a("js5io", param1 ^ -113);
                    break L10;
                  }
                }
              } else {
                if ((ta.field_g ^ -1) <= -11) {
                  L11: {
                    ia.a((byte) 103);
                    if (nc.field_r == -4) {
                      sc.a(256, (byte) -98, mh.field_H);
                      break L11;
                    } else {
                      if (-5 != nc.field_r) {
                        if (nc.field_r == 2) {
                          sc.a(256, (byte) -93, ib.field_b);
                          break L11;
                        } else {
                          if ((nc.field_r ^ -1) != -6) {
                            sc.a(256, (byte) 111, e.field_g);
                            break L11;
                          } else {
                            sc.a(5, (byte) 96, ri.field_f);
                            break L11;
                          }
                        }
                      } else {
                        sc.a(256, (byte) -114, jd.field_b);
                        break L11;
                      }
                    }
                  }
                  kj.field_o = true;
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
              if (0 == (nc.field_r ^ -1)) {
                break L14;
              } else {
                if (nc.field_r != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (d.a((byte) -24)) {
              break L13;
            } else {
              break L12;
            }
          }
          if (mc.field_i > rf.c(0)) {
            break L12;
          } else {
            kj.field_o = false;
            if ((nc.field_r ^ -1) == 0) {
              break L12;
            } else {
              if (nc.field_r != 0) {
                nc.field_r = -1;
                si.e((byte) 13);
                break L12;
              } else {
                break L12;
              }
            }
          }
        }
        L15: {
          if (nc.field_r != 0) {
            break L15;
          } else {
            if (!d.a((byte) 112)) {
              fh.field_i = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if ((wf.field_i ^ -1) == param1) {
            if (!gd.d((byte) -53)) {
              break L16;
            } else {
              wf.field_i = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (1 == wf.field_i) {
            L18: {
              if (ri.field_e == 0) {
                break L18;
              } else {
                eh.field_d = oj.a(false, th.field_m);
                break L18;
              }
            }
            we.field_h = cl.a(true, (byte) -98, false, gf.field_e, 1);
            gk.field_a = cl.a(true, (byte) -15, false, ij.field_l, 1);
            ej.field_d = cl.a(true, (byte) -37, false, ll.field_f, 1);
            wf.field_i = 2;
            gg.field_d = gk.field_a;
            th.field_p = we.field_h;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if ((wf.field_i ^ -1) != -3) {
            break L19;
          } else {
            L20: {
              if (eh.field_d == null) {
                break L20;
              } else {
                if (eh.field_d.c(92)) {
                  if (!eh.field_d.a("", (byte) -114)) {
                    eh.field_d = null;
                    break L20;
                  } else {
                    if (eh.field_d.a("", 10762)) {
                      kb.a(-119, eh.field_d);
                      eh.field_d = null;
                      dl.b(5);
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                } else {
                  break L20;
                }
              }
            }
            if (null == eh.field_d) {
              wf.field_i = 3;
              break L19;
            } else {
              break L19;
            }
          }
        }
        L21: {
          if ((wf.field_i ^ -1) != -4) {
            break L21;
          } else {
            if (!cl.a(ej.field_d, we.field_h, gk.field_a, (byte) 127)) {
              break L21;
            } else {
              if (oh.a(ej.field_d, -109)) {
                L22: {
                  L23: {
                    qa.b(0);
                    mg.e(0);
                    u.field_tb = false;
                    pb.field_j = qk.field_a;
                    fk.a(hl.field_F, we.field_h, (byte) 40, ej.field_d, gk.field_a);
                    if (ki.field_e) {
                      break L23;
                    } else {
                      if (null == sc.field_c) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    stackOut_109_0 = sc.field_c;
                    stackIn_111_0 = stackOut_109_0;
                    stackIn_110_0 = stackOut_109_0;
                    if (ki.field_e) {
                      stackOut_111_0 = (String) (Object) stackIn_111_0;
                      stackOut_111_1 = 0;
                      stackIn_112_0 = stackOut_111_0;
                      stackIn_112_1 = stackOut_111_1;
                      break L24;
                    } else {
                      stackOut_110_0 = (String) (Object) stackIn_110_0;
                      stackOut_110_1 = 1;
                      stackIn_112_0 = stackOut_110_0;
                      stackIn_112_1 = stackOut_110_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_112_0 = (String) (Object) stackIn_112_0;
                    stackOut_112_1 = stackIn_112_1;
                    stackIn_114_0 = stackOut_112_0;
                    stackIn_114_1 = stackOut_112_1;
                    stackIn_113_0 = stackOut_112_0;
                    stackIn_113_1 = stackOut_112_1;
                    if (ki.field_e) {
                      stackOut_114_0 = (String) (Object) stackIn_114_0;
                      stackOut_114_1 = stackIn_114_1;
                      stackOut_114_2 = 0;
                      stackIn_115_0 = stackOut_114_0;
                      stackIn_115_1 = stackOut_114_1;
                      stackIn_115_2 = stackOut_114_2;
                      break L25;
                    } else {
                      stackOut_113_0 = (String) (Object) stackIn_113_0;
                      stackOut_113_1 = stackIn_113_1;
                      stackOut_113_2 = 1;
                      stackIn_115_0 = stackOut_113_0;
                      stackIn_115_1 = stackOut_113_1;
                      stackIn_115_2 = stackOut_113_2;
                      break L25;
                    }
                  }
                  rb.a(stackIn_115_0, stackIn_115_1 != 0, stackIn_115_2 != 0, param1 + 14636);
                  break L22;
                }
                L26: {
                  if (Lexicominos.field_M) {
                    ui.d(4);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != de.field_b) {
                    break L27;
                  } else {
                    de.field_b = fb.b(12898);
                    jh.field_c = kf.g(0);
                    break L27;
                  }
                }
                vk.a(ej.field_d, param1 ^ 0, de.field_b, jh.field_c);
                gk.field_a = null;
                we.field_h = null;
                ej.field_d = null;
                mc.a(-116, (java.applet.Applet) this);
                dl.b(5);
                wf.field_i = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if (-11 == (wf.field_i ^ -1)) {
            L29: {
              if (ri.field_e == 0) {
                break L29;
              } else {
                eg.field_C = oj.a(false, ea.field_d);
                break L29;
              }
            }
            wf.field_i = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (11 == wf.field_i) {
            L31: {
              if (null == eg.field_C) {
                break L31;
              } else {
                L32: {
                  if (!eg.field_C.c(param1 + -104)) {
                    break L32;
                  } else {
                    if (!eg.field_C.a((byte) 60)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                al.a(16, ee.a((byte) 126, oh.field_a, we.field_c, eg.field_C), 0.0f);
                break L30;
              }
            }
            wf.field_i = 12;
            ne.field_e = true;
            break L30;
          } else {
            break L30;
          }
        }
        L33: {
          if (wf.field_i != 12) {
            if (param0) {
              break L33;
            } else {
              if (!rl.field_O) {
                break L33;
              } else {
                jd.a(ug.field_y, 160);
                ((nk) this).f(param1 ^ -468);
                ha.a(ug.field_y, (byte) 105);
                break L33;
              }
            }
          } else {
            if (param0) {
              break L33;
            } else {
              if (!rl.field_O) {
                break L33;
              } else {
                jd.a(ug.field_y, 160);
                ((nk) this).f(param1 ^ -468);
                ha.a(ug.field_y, (byte) 105);
                break L33;
              }
            }
          }
        }
        L34: {
          if (!ij.field_o[8]) {
            break L34;
          } else {
            uk.g(true);
            break L34;
          }
        }
    }

    final int n(int param0) {
        int var2 = this.f((byte) -127);
        if (param0 != 6) {
            ((nk) this).e((byte) -85);
        }
        if (var2 != 0) {
            // if_icmpeq L37
        } else {
            if (ij.field_o[1]) {
                bh.a((byte) 77, 2);
            }
            if (ij.field_o[2]) {
                g.a(3, (byte) -39);
            }
            if (ij.field_o[3]) {
                vh.a(false, 4);
            }
            if (ij.field_o[4]) {
                hl.f(5, -2212);
            }
            if (!(!ij.field_o[5])) {
                bd.a(6, -4584);
            }
            if (!(!ij.field_o[6])) {
                n.b(7, param0 + -7);
            }
            if (!(!ij.field_o[8])) {
                pg.a((byte) 92);
            }
        }
        return var2;
    }

    private final void a(String param0, int param1, int param2, byte param3, int param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        try {
          if (!((nk) this).c(-7257)) {
            return;
          } else {
            L0: {
              if (param3 == 62) {
                break L0;
              } else {
                ((nk) this).field_B = null;
                break L0;
              }
            }
            L1: {
              L2: {
                ((nk) this).field_B = ((nk) this).getCodeBase().getHost();
                var6_ref = ((nk) this).field_B.toLowerCase();
                stackOut_5_0 = this;
                stackIn_8_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L2;
                } else {
                  stackOut_6_0 = this;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_9_0 = this;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L1;
                  } else {
                    stackOut_7_0 = this;
                    stackIn_8_0 = stackOut_7_0;
                    break L2;
                  }
                }
              }
              stackOut_8_0 = this;
              stackOut_8_1 = 1;
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              break L1;
            }
            L3: {
              ((nk) this).field_y = stackIn_10_1 != 0;
              ((nk) this).field_D = Integer.parseInt(((nk) this).getParameter("gameport1"));
              ((nk) this).field_q = Integer.parseInt(((nk) this).getParameter("gameport2"));
              var7 = ((nk) this).getParameter("servernum");
              if (var7 == null) {
                break L3;
              } else {
                ((nk) this).field_s = Integer.parseInt(var7);
                break L3;
              }
            }
            L4: {
              ((nk) this).field_r = Integer.parseInt(((nk) this).getParameter("gamecrc"));
              ((nk) this).field_v = Long.parseLong(((nk) this).getParameter("instanceid"));
              ((nk) this).field_x = ((nk) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((nk) this).getParameter("lang");
              if (var8 != null) {
                ((nk) this).field_u = Integer.parseInt(var8);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (-6 >= (((nk) this).field_u ^ -1)) {
                ((nk) this).field_u = 0;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              var9 = ((nk) this).getParameter("affid");
              if (var9 == null) {
                break L6;
              } else {
                ((nk) this).field_A = Integer.parseInt(var9);
                break L6;
              }
            }
            Lexicominos.field_M = Boolean.valueOf(((nk) this).getParameter("simplemode")).booleanValue();
            ((nk) this).a(((nk) this).field_r, param2, param4, param1, param3 ^ 92, 32, param0);
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        uj.a((String) null, (Throwable) (Object) var6, 1);
        ((nk) this).a("crash", 92);
    }

    private final int f(byte param0) {
        int var2 = 0;
        if (((nk) this).field_g) {
          return -1;
        } else {
          if (d.a((byte) 83)) {
            if (!kj.field_o) {
              L0: {
                var2 = ve.a(el.b(1), (byte) -25, ((nk) this).field_y, true, dg.a(false), ((nk) this).field_A);
                if (param0 < -85) {
                  break L0;
                } else {
                  ((nk) this).field_s = -83;
                  break L0;
                }
              }
              if (var2 == 0) {
                return -1;
              } else {
                L1: {
                  if (-1 == var2) {
                    if (ta.field_g == 11) {
                      if (nc.field_r == 0) {
                        wb.b((byte) 50);
                        break L1;
                      } else {
                        return var2;
                      }
                    } else {
                      if (ta.field_g == 11) {
                        if (nc.field_r == 0) {
                          wb.b((byte) 50);
                          break L1;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    }
                  } else {
                    if (ta.field_g == 11) {
                      if (nc.field_r == 0) {
                        wb.b((byte) 50);
                        break L1;
                      } else {
                        return var2;
                      }
                    } else {
                      return var2;
                    }
                  }
                }
                return var2;
              }
            } else {
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    final void a(int param0, String param1, byte param2) {
        this.a(param1, 480, param0, (byte) 62, 640);
        if (param2 >= -82) {
            ((nk) this).field_y = true;
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4) {
        this.a(3, false);
        if (!(!param0)) {
            this.l(-74);
        }
        if (param2) {
            this.i(-1);
        }
        if (!(!param4)) {
            this.j(-67);
        }
        if (!(!param1)) {
            this.d((byte) -47);
        }
        int var6 = -104 % ((param3 - 77) / 34);
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            wf var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Lexicominos.field_L ? 1 : 0;
                        var4 = qk.a(ri.field_e, param2, param1 + param1, gd.field_l);
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
                        var5_int = mg.a(0, fk.a(85), qd.a(false));
                        if (var5_int != -1) {
                            statePc = 7;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        mb.a(105, var5_int, wj.field_p, fc.field_S);
                        wj.field_p = null;
                        fc.field_S = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        var11 = al.e((byte) -117);
                        if (var11 != null) {
                            statePc = 10;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        mc.a(var11.booleanValue(), 0);
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
                        var5_int = il.a(((nk) this).field_A, dg.a(false), el.b(param1 ^ 1), ve.b(25594), tf.a((byte) -101), 103, a.c(true));
                        if (var5_int == -1) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        nl.a(var5_int, -6258, wj.field_p, fc.field_S);
                        fc.field_S = null;
                        wj.field_p = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (-4 == var4) {
                            statePc = 16;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        if (0 == nc.field_r) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (0 != nc.field_r) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        nc.field_r = -1;
                        si.e((byte) 86);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (!param0) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        kj.field_o = false;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 22: {
                        var5_int = ve.a(el.b(1), (byte) -25, ((nk) this).field_y, false, dg.a(false), ((nk) this).field_A);
                        if (var5_int == -1) {
                            statePc = 26;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (var5_int != 0) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        d.field_a = rc.field_f;
                        wb.b((byte) 50);
                        ta.field_g = 10;
                        qg.field_d = false;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 25: {
                        sc.a(var5_int, (byte) 58, wj.field_p);
                        wj.field_p = null;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        if (4 != var4) {
                            statePc = 30;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        if (hl.field_F) {
                            statePc = 29;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        ta.field_g = 10;
                        qg.field_d = true;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 29: {
                        lj.a(kk.c(-14047), (byte) 125);
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        if ((var4 ^ -1) == -6) {
                            statePc = 32;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        ge.a(0, kk.c(param1 ^ -14047));
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if ((var4 ^ -1) == -7) {
                            statePc = 35;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        if (u.field_tb) {
                            statePc = 37;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        ta.field_g = 10;
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (7 == var4) {
                            statePc = 40;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        sk.a(kk.c(-14047), 12);
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (var4 == -9) {
                            statePc = 43;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        lj.a(kk.c(-14047), (byte) 123);
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (-10 == var4) {
                            statePc = 46;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        la.a(kk.c(-14047), true);
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (var4 != 10) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        ed.field_q.h(17, 0);
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if ((var4 ^ -1) != -12) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        rf.a(20104, kk.c(-14047));
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (12 == var4) {
                            statePc = 53;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        pd.a(cf.c(32), -120, kk.c(param1 + -14047));
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (13 != var4) {
                            statePc = 65;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    }
                    case 55: {
                        try {
                            if (g.field_m != null) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 64;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            g.field_m = new wg(jh.field_a, new java.net.URL(((nk) this).getCodeBase(), "countrylist.ws"), 5000);
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
                            if (g.field_m.a(74)) {
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
                            var12 = g.field_m.a((byte) -65);
                            if (var12 != null) {
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
                            var9 = null;
                            hf.a((String) null, (byte) 122);
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
                            var7 = dc.a(var12.field_h, var12.field_j, (byte) 16, 0);
                            hf.a(var7, (byte) 110);
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
                            g.field_m = null;
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
                        uj.a("S1", (Throwable) (Object) var5, 1);
                        var10 = null;
                        hf.a((String) null, (byte) 118);
                        g.field_m = null;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (15 != var4) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        ta.field_g = 10;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (-17 == (var4 ^ -1)) {
                            statePc = 69;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        return 1;
                    }
                    case 70: {
                        if (17 == var4) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        return 0;
                    }
                    case 72: {
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

    private final void l(int param0) {
        ij.field_o[1] = true;
        int var2 = 65 % ((62 - param0) / 33);
    }

    protected nk() {
    }

    final void m(int param0) {
        int var2 = 0;
        df var3 = null;
        int var4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        if (param0 == -6721) {
          L0: {
            var2 = pg.field_d;
            if (var2 >= 64) {
              break L0;
            } else {
              if (!ij.field_o[var2]) {
                break L0;
              } else {
                if (var2 == -1) {
                  return;
                } else {
                  L1: {
                    if (-2 == var2) {
                      rb.a(false);
                      break L1;
                    } else {
                      if (2 == var2) {
                        hl.d(0);
                        break L1;
                      } else {
                        if (var2 == -4) {
                          me.e(false);
                          break L1;
                        } else {
                          if (-5 != var2) {
                            if (-6 == (var2 ^ -1)) {
                              pg.a(1);
                              break L1;
                            } else {
                              if (var2 == 6) {
                                ge.c(param0 ^ -6708);
                                break L1;
                              } else {
                                if (var2 != -8) {
                                  if (8 != var2) {
                                    if (-17 == var2) {
                                      kf.h(-1);
                                      break L1;
                                    } else {
                                      L2: {
                                        if (var2 == 11) {
                                          break L2;
                                        } else {
                                          if (-13 == var2) {
                                            break L2;
                                          } else {
                                            if (13 != var2) {
                                              if (var2 == 17) {
                                                this.k(126);
                                                break L1;
                                              } else {
                                                if (-19 != var2) {
                                                  uj.a("MGS1: " + qj.h(param0 ^ 6689), (Throwable) null, 1);
                                                  ck.b((byte) -118);
                                                  break L1;
                                                } else {
                                                  vk.a((byte) -117);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              pa.a(15);
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                      L3: {
                                        stackOut_28_0 = 0;
                                        stackIn_30_0 = stackOut_28_0;
                                        stackIn_29_0 = stackOut_28_0;
                                        if (var2 != 12) {
                                          stackOut_30_0 = stackIn_30_0;
                                          stackOut_30_1 = 0;
                                          stackIn_31_0 = stackOut_30_0;
                                          stackIn_31_1 = stackOut_30_1;
                                          break L3;
                                        } else {
                                          stackOut_29_0 = stackIn_29_0;
                                          stackOut_29_1 = 1;
                                          stackIn_31_0 = stackOut_29_0;
                                          stackIn_31_1 = stackOut_29_1;
                                          break L3;
                                        }
                                      }
                                      var3 = qd.a(stackIn_31_0, stackIn_31_1 != 0);
                                      ij.a(var3, param0 + 6833);
                                      break L1;
                                    }
                                  } else {
                                    ge.a((byte) -127, a.field_c, (wf) (Object) ig.field_a, jh.field_a);
                                    break L1;
                                  }
                                } else {
                                  this.h(16);
                                  break L1;
                                }
                              }
                            }
                          } else {
                            u.l((byte) -124);
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  return;
                }
              }
            }
          }
          uj.a("MGS2: " + qj.h(param0 + 6632), (Throwable) null, param0 + 6722);
          ck.b((byte) -79);
          return;
        } else {
          return;
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        byte[] var5 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var2 = ig.field_a.d(true);
          if (0 == (var2 & 1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var3 = stackIn_3_0;
        if (param0 <= 125) {
          return;
        } else {
          var4 = -1 + a.field_c;
          var5 = new byte[var4];
          ig.field_a.b(var4, 0, 55, var5);
          m.a(var3 != 0, true, ni.a((byte) -55, var5), kk.c(-14047));
          return;
        }
    }

    private final void d(byte param0) {
        if (param0 != -47) {
            return;
        }
        ij.field_o[5] = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = 0;
        field_C = "Player names can be up to 12 letters, numbers and underscores";
        field_t = "Connection timed out. Please try using a different server.";
    }
}
