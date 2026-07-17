/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class sl extends li {
    private int field_m;
    String field_z;
    static String field_s;
    private int field_n;
    static rf field_o;
    private int field_u;
    private boolean field_r;
    private int field_v;
    private static int field_q;
    private long field_w;
    static String field_B;
    private int field_p;
    static he[] field_x;
    private boolean field_y;
    private boolean field_t;
    private int field_A;

    final void a(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_25_0 = 0;
        String stackIn_100_0 = null;
        String stackIn_101_0 = null;
        String stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        String stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        String stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        String stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_134_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        String stackOut_99_0 = null;
        String stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        String stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        String stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        String stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        String stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        L0: {
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (null == pi.field_V) {
            break L0;
          } else {
            L1: {
              if (null != df.field_l) {
                break L1;
              } else {
                int discarded$21 = 0;
                var6 = nf.b();
                var4 = var6.getSize();
                pi.field_V.a(var4.height, var4.width, 2);
                break L1;
              }
            }
            pi.field_V.a((byte) 123);
            break L0;
          }
        }
        L2: {
          li.b((byte) -81);
          ia.a(-116);
          int discarded$22 = 0;
          if (kh.a()) {
            break L2;
          } else {
            if (af.field_b != 11) {
              lg.a(2);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (param1 >= 34) {
            break L3;
          } else {
            ((sl) this).field_p = -105;
            break L3;
          }
        }
        L4: {
          if (sc.field_e == null) {
            break L4;
          } else {
            ma.field_sb = sc.field_e.a(0);
            break L4;
          }
        }
        L5: {
          int discarded$23 = 64;
          if (n.a()) {
            L6: {
              var3 = 1200 * pk.d((byte) 9);
              if (((sl) this).field_r) {
                break L6;
              } else {
                if (~nf.c(false) >= ~var3) {
                  break L5;
                } else {
                  int discarded$24 = 12484;
                  if (var3 < qg.m()) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((sl) this).field_r = false;
            int discarded$25 = 126;
            eg.a();
            int discarded$26 = 11;
            am.e();
            dl.a(ni.field_u, 2, 120);
            int discarded$27 = 115;
            fj.e();
            dd.field_j = true;
            ab.field_a = la.a(false) + 15000L;
            break L5;
          } else {
            break L5;
          }
        }
        L7: {
          L8: {
            if (mh.field_d == -1) {
              break L8;
            } else {
              if (mh.field_d != 0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          L9: {
            if (-1 != mh.field_d) {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              break L9;
            } else {
              stackOut_23_0 = 1;
              stackIn_25_0 = stackOut_23_0;
              break L9;
            }
          }
          L10: {
            var3 = stackIn_25_0;
            int discarded$28 = -106;
            mh.field_d = dm.d();
            if (var3 == 0) {
              break L10;
            } else {
              if (0 != mh.field_d) {
                break L10;
              } else {
                if (11 != af.field_b) {
                  break L10;
                } else {
                  if (sb.b(-11)) {
                    break L10;
                  } else {
                    int discarded$29 = 1;
                    wh.b();
                    break L10;
                  }
                }
              }
            }
          }
          if (mh.field_d == -1) {
            break L7;
          } else {
            if (mh.field_d != 0) {
              ab.field_a = 15000L + la.a(false);
              break L7;
            } else {
              break L7;
            }
          }
        }
        L11: {
          if (mh.field_d == -1) {
            break L11;
          } else {
            if (mh.field_d == 0) {
              break L11;
            } else {
              if (10 > hj.field_f) {
                if (3 == mh.field_d) {
                  ((sl) this).a(-51, "js5crc");
                  break L11;
                } else {
                  if (mh.field_d == 4) {
                    ((sl) this).a(-51, "js5io");
                    break L11;
                  } else {
                    if (mh.field_d != 2) {
                      if (mh.field_d == 5) {
                        ((sl) this).a(-51, "outofdate");
                        break L11;
                      } else {
                        ((sl) this).a(-51, "js5connect");
                        break L11;
                      }
                    } else {
                      ((sl) this).a(-51, "js5connect_full");
                      break L11;
                    }
                  }
                }
              } else {
                if (10 > af.field_b) {
                  break L11;
                } else {
                  L12: {
                    int discarded$30 = 11;
                    am.e();
                    if (mh.field_d != 3) {
                      if (4 == mh.field_d) {
                        dl.a(ug.field_p, 256, 102);
                        break L12;
                      } else {
                        if (mh.field_d != 2) {
                          if (mh.field_d != 5) {
                            dl.a(db.field_f, 256, 68);
                            break L12;
                          } else {
                            dl.a(gm.field_K, 5, 105);
                            break L12;
                          }
                        } else {
                          dl.a(ce.field_d, 256, 75);
                          break L12;
                        }
                      }
                    } else {
                      dl.a(vd.field_e, 256, 66);
                      break L12;
                    }
                  }
                  dd.field_j = true;
                  break L11;
                }
              }
            }
          }
        }
        L13: {
          L14: {
            L15: {
              if (-1 == mh.field_d) {
                break L15;
              } else {
                if (0 != mh.field_d) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (sb.b(-11)) {
              break L14;
            } else {
              break L13;
            }
          }
          if (la.a(false) >= ab.field_a) {
            dd.field_j = false;
            if (mh.field_d == -1) {
              break L13;
            } else {
              if (mh.field_d != 0) {
                mh.field_d = -1;
                df.a((byte) 112);
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
          if (mh.field_d != 0) {
            break L16;
          } else {
            if (!sb.b(-11)) {
              kl.field_S = false;
              break L16;
            } else {
              break L16;
            }
          }
        }
        L17: {
          if (0 == hj.field_f) {
            int discarded$31 = -98;
            if (!jj.b()) {
              break L17;
            } else {
              hj.field_f = 1;
              break L17;
            }
          } else {
            break L17;
          }
        }
        L18: {
          if (hj.field_f != 1) {
            break L18;
          } else {
            L19: {
              if (0 != ob.field_c) {
                bi.field_I = al.a(3, md.field_d);
                break L19;
              } else {
                break L19;
              }
            }
            int discarded$32 = 8;
            int discarded$33 = 1;
            qd.field_Jb = lk.a(false, true, hb.field_q);
            int discarded$34 = 8;
            int discarded$35 = 1;
            sb.field_i = lk.a(false, true, field_q);
            int discarded$36 = 8;
            int discarded$37 = 1;
            ig.field_t = lk.a(false, true, jd.field_O);
            si.field_E = sb.field_i;
            hj.field_f = 2;
            ph.field_b = qd.field_Jb;
            break L18;
          }
        }
        L20: {
          if (hj.field_f != 2) {
            break L20;
          } else {
            L21: {
              if (null != bi.field_I) {
                if (!bi.field_I.a(0)) {
                  break L21;
                } else {
                  if (bi.field_I.a((byte) 12, "")) {
                    if (!bi.field_I.a(255, "")) {
                      break L21;
                    } else {
                      jd.a(7, bi.field_I);
                      bi.field_I = null;
                      int discarded$38 = 86;
                      tc.a();
                      break L21;
                    }
                  } else {
                    bi.field_I = null;
                    break L21;
                  }
                }
              } else {
                break L21;
              }
            }
            if (bi.field_I != null) {
              break L20;
            } else {
              hj.field_f = 3;
              break L20;
            }
          }
        }
        L22: {
          if (hj.field_f == 3) {
            if (!ad.a(ig.field_t, (byte) -91, sb.field_i, qd.field_Jb)) {
              break L22;
            } else {
              if (pa.a((byte) 64, ig.field_t)) {
                L23: {
                  L24: {
                    int discarded$39 = 94;
                    dm.c();
                    ue.a(false);
                    rh.field_d = ha.field_e;
                    gm.field_M = false;
                    wh.a(-80, sb.field_i, ig.field_t, qd.field_Jb, bd.field_N);
                    if (fm.field_l) {
                      break L24;
                    } else {
                      if (null == hb.field_b) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    stackOut_99_0 = hb.field_b;
                    stackIn_101_0 = stackOut_99_0;
                    stackIn_100_0 = stackOut_99_0;
                    if (fm.field_l) {
                      stackOut_101_0 = (String) (Object) stackIn_101_0;
                      stackOut_101_1 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      stackIn_102_1 = stackOut_101_1;
                      break L25;
                    } else {
                      stackOut_100_0 = (String) (Object) stackIn_100_0;
                      stackOut_100_1 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_102_0 = (String) (Object) stackIn_102_0;
                    stackOut_102_1 = stackIn_102_1;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_104_1 = stackOut_102_1;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    if (fm.field_l) {
                      stackOut_104_0 = (String) (Object) stackIn_104_0;
                      stackOut_104_1 = stackIn_104_1;
                      stackOut_104_2 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      stackIn_105_2 = stackOut_104_2;
                      break L26;
                    } else {
                      stackOut_103_0 = (String) (Object) stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      stackIn_105_2 = stackOut_103_2;
                      break L26;
                    }
                  }
                  int discarded$40 = 10;
                  eb.a(stackIn_105_0, stackIn_105_1 != 0, stackIn_105_2 != 0);
                  break L23;
                }
                L27: {
                  if (!em.field_b) {
                    break L27;
                  } else {
                    ka.a((byte) -87);
                    break L27;
                  }
                }
                L28: {
                  if (ac.field_b == null) {
                    ac.field_b = ai.g(-29132);
                    pe.field_j = ac.a(-1);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                ui.a(ac.field_b, (byte) -88, pe.field_j, ig.field_t);
                sb.field_i = null;
                ig.field_t = null;
                qd.field_Jb = null;
                jc.a(79, (java.applet.Applet) this);
                int discarded$41 = 86;
                tc.a();
                hj.field_f = 10;
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
          if (10 == hj.field_f) {
            L30: {
              if (ob.field_c == 0) {
                break L30;
              } else {
                df.field_m = al.a(3, p.field_f);
                break L30;
              }
            }
            hj.field_f = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if (hj.field_f == 11) {
            L32: {
              if (df.field_m == null) {
                break L32;
              } else {
                L33: {
                  if (!df.field_m.a(0)) {
                    break L33;
                  } else {
                    if (df.field_m.c((byte) 126)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                we.a(kl.a(mi.field_d, df.field_m, 27867, dh.field_J), -125, 0.0f);
                break L31;
              }
            }
            nd.field_Q = true;
            hj.field_f = 12;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if (12 != hj.field_f) {
            break L34;
          } else {
            if (nd.field_Q) {
              break L34;
            } else {
              hj.field_f = 13;
              break L34;
            }
          }
        }
        L35: {
          if (hj.field_f != 13) {
            break L35;
          } else {
            L36: {
              var3 = 1;
              if (null != jl.field_k) {
                L37: {
                  if (!jl.field_k.a(-11255)) {
                    stackOut_133_0 = 0;
                    stackIn_134_0 = stackOut_133_0;
                    break L37;
                  } else {
                    stackOut_132_0 = 1;
                    stackIn_134_0 = stackOut_132_0;
                    break L37;
                  }
                }
                var3 = stackIn_134_0;
                we.a(jl.field_k.field_h, -111, jl.field_k.field_a);
                break L36;
              } else {
                break L36;
              }
            }
            if (var3 != 0) {
              hj.field_f = 20;
              break L35;
            } else {
              break L35;
            }
          }
        }
        L38: {
          if (param0) {
            break L38;
          } else {
            if (ci.field_U) {
              hb.a(-5, n.field_g);
              ((sl) this).f(118);
              ej.a(n.field_g, (byte) 95);
              break L38;
            } else {
              break L38;
            }
          }
        }
        L39: {
          if (g.field_p[8]) {
            vg.b((byte) 75);
            break L39;
          } else {
            break L39;
          }
        }
    }

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((sl) this).setBackground(java.awt.Color.black);
        ob.field_c = ((sl) this).field_n;
        jd.a((byte) 119, ob.field_c);
        ua.a(((sl) this).field_t, ((sl) this).field_A, (byte) 34, ((sl) this).field_v, 5000, sb.field_d, ob.field_c, 5000, ((sl) this).field_z, ((sl) this).field_m, ((sl) this).field_p, param2, ((sl) this).field_w, param1);
        int discarded$0 = 111;
        wi.a(((sl) this).field_v, param1, ob.field_c, ((sl) this).field_m, ((sl) this).field_z, ((sl) this).field_p, sb.field_d, ((sl) this).field_A);
        rg.a(param3 ^ -11603);
        int discarded$1 = 65;
        sc.field_e = vb.a();
        ej.a(n.field_g, (byte) 71);
        md.field_d = param7;
        p.field_f = param6;
        if (param3 != 7320) {
            ((sl) this).field_m = -76;
        }
        jd.field_O = param5;
        hb.field_q = param4;
        field_q = param0;
        this.l(param3 ^ -7321);
        bf.b(param3 ^ 7192);
    }

    private final void i(int param0) {
        int discarded$0 = 0;
        String var2 = ca.b();
        hg.a(nb.a(-102), -1, var2);
    }

    private final void n() {
        g.field_p[4] = true;
    }

    final int b(boolean param0) {
        int var2 = 0;
        if (((sl) this).field_c) {
          return -1;
        } else {
          if (sb.b(-11)) {
            if (!dd.field_j) {
              var2 = f.a(((sl) this).field_u, -50, true, fl.a(false), vd.f(-61), ((sl) this).field_y);
              if (var2 == -1) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    break L0;
                  } else {
                    if (var2 != 1) {
                      L1: {
                        if (oh.field_a) {
                          break L1;
                        } else {
                          ((sl) this).a(-51, "reconnect");
                          break L1;
                        }
                      }
                      int discarded$4 = 11;
                      am.e();
                      dl.a(cc.field_p, var2, 105);
                      dd.field_j = true;
                      ab.field_a = 15000L + la.a(param0);
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (af.field_b != 11) {
                    break L2;
                  } else {
                    if (mh.field_d != 0) {
                      break L2;
                    } else {
                      int discarded$5 = 1;
                      wh.b();
                      break L2;
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

    private final void e() {
        g.field_p[1] = true;
    }

    public static void j(int param0) {
        field_o = null;
        field_x = null;
        field_B = null;
        field_s = null;
    }

    final static jb a(byte param0, byte[] param1) {
        jb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        Object stackIn_2_0 = null;
        jb stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        jb stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 != null) {
              var3 = 0;
              var2 = new jb(param1, kh.field_i, vi.field_b, gf.field_o, qa.field_J, a.field_e);
              int discarded$2 = -21;
              oc.a();
              stackOut_3_0 = (jb) var2;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (jb) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2_ref;
            stackOut_5_1 = new StringBuilder().append("sl.N(").append(-83).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    private final void l(int param0) {
        vi.field_a[17] = -1;
        vi.field_a[13] = -1;
        vi.field_a[12] = param0;
        vi.field_a[3] = -1;
        vi.field_a[5] = -1;
        vi.field_a[8] = -2;
        vi.field_a[7] = -1;
        vi.field_a[1] = 16;
        vi.field_a[18] = 1;
        vi.field_a[2] = -2;
        vi.field_a[11] = -1;
        vi.field_a[10] = -1;
        vi.field_a[4] = -1;
        vi.field_a[16] = -1;
        vi.field_a[6] = -2;
        vi.field_a[9] = -1;
    }

    final void c(boolean param0) {
        int var2 = 0;
        fg var3 = null;
        int var4 = 0;
        int stackIn_29_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param0) {
            break L0;
          } else {
            int discarded$10 = ((sl) this).b(true);
            break L0;
          }
        }
        L1: {
          var2 = t.field_b;
          if (var2 >= 64) {
            break L1;
          } else {
            if (!g.field_p[var2]) {
              break L1;
            } else {
              if (0 == var2) {
                return;
              } else {
                L2: {
                  if (var2 == 1) {
                    int discarded$11 = 59;
                    af.a();
                    break L2;
                  } else {
                    if (var2 != 2) {
                      if (3 != var2) {
                        if (var2 != 4) {
                          if (var2 != 5) {
                            if (var2 != 6) {
                              if (var2 != 7) {
                                if (var2 != 8) {
                                  if (var2 == 16) {
                                    am.g(11);
                                    break L2;
                                  } else {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (var2 != 12) {
                                          if (13 != var2) {
                                            if (var2 != 17) {
                                              if (var2 != 18) {
                                                gb.a((Throwable) null, "MGS1: " + al.a(-64), 10);
                                                int discarded$12 = 126;
                                                eg.a();
                                                break L2;
                                              } else {
                                                int discarded$13 = -127;
                                                lc.a();
                                                break L2;
                                              }
                                            } else {
                                              this.k(28586);
                                              break L2;
                                            }
                                          } else {
                                            la.a(1);
                                            break L2;
                                          }
                                        } else {
                                          break L3;
                                        }
                                      }
                                    }
                                    L4: {
                                      if (var2 != 12) {
                                        stackOut_28_0 = 0;
                                        stackIn_29_0 = stackOut_28_0;
                                        break L4;
                                      } else {
                                        stackOut_27_0 = 1;
                                        stackIn_29_0 = stackOut_27_0;
                                        break L4;
                                      }
                                    }
                                    var3 = dl.a(stackIn_29_0 != 0, -120);
                                    gk.a(var3, -15980);
                                    break L2;
                                  }
                                } else {
                                  hd.a((byte) 109, (od) (Object) dh.field_N, sb.field_d, gf.field_C);
                                  break L2;
                                }
                              } else {
                                this.i(-115);
                                break L2;
                              }
                            } else {
                              int discarded$14 = 124;
                              fm.a();
                              break L2;
                            }
                          } else {
                            int discarded$15 = 4;
                            ta.c();
                            break L2;
                          }
                        } else {
                          int discarded$16 = -31114;
                          uk.a();
                          break L2;
                        }
                      } else {
                        int discarded$17 = -3;
                        dh.k();
                        break L2;
                      }
                    } else {
                      int discarded$18 = -4;
                      sf.a();
                      break L2;
                    }
                  }
                }
                return;
              }
            }
          }
        }
        gb.a((Throwable) null, "MGS2: " + al.a(-77), 10);
        int discarded$19 = 126;
        eg.a();
    }

    private final void a(String param0, int param1, int param2, int param3) {
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
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
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
          try {
            L0: {
              if (!((sl) this).e(-125)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((sl) this).field_z = ((sl) this).getCodeBase().getHost();
                    var6_ref2 = ((sl) this).field_z.toLowerCase();
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
                ((sl) this).field_y = stackIn_8_1 != 0;
                ((sl) this).field_v = Integer.parseInt(((sl) this).getParameter("gameport1"));
                ((sl) this).field_p = Integer.parseInt(((sl) this).getParameter("gameport2"));
                if (param3 == -5375) {
                  L3: {
                    var7 = ((sl) this).getParameter("servernum");
                    if (var7 == null) {
                      break L3;
                    } else {
                      ((sl) this).field_A = Integer.parseInt(var7);
                      break L3;
                    }
                  }
                  L4: {
                    ((sl) this).field_m = Integer.parseInt(((sl) this).getParameter("gamecrc"));
                    ((sl) this).field_w = Long.parseLong(((sl) this).getParameter("instanceid"));
                    ((sl) this).field_t = ((sl) this).getParameter("member").equals((Object) (Object) "yes");
                    var8 = ((sl) this).getParameter("lang");
                    if (var8 != null) {
                      ((sl) this).field_n = Integer.parseInt(var8);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (((sl) this).field_n >= 5) {
                      ((sl) this).field_n = 0;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    var9 = ((sl) this).getParameter("affid");
                    if (var9 != null) {
                      ((sl) this).field_u = Integer.parseInt(var9);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  em.field_b = Boolean.valueOf(((sl) this).getParameter("simplemode")).booleanValue();
                  ((sl) this).a(-4, param1, ((sl) this).field_m, 32, 480, param0, 640);
                  break L0;
                } else {
                  return;
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              gb.a((Throwable) (Object) var6, (String) null, param3 + 5385);
              ((sl) this).a(param3 ^ 5324, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var6_ref;
            stackOut_25_1 = new StringBuilder().append("sl.H(");
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
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L8;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + param1 + 44 + 480 + 44 + param3 + 44 + 640 + 41);
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 != 5017) {
            int discarded$0 = this.a(false, true, 12);
        }
        return this.a(param1, true, 10);
    }

    private final void a() {
        int var3 = -111;
        g.field_p[7] = true;
        g.field_p[3] = true;
        g.field_p[17] = true;
        g.field_p[16] = true;
        g.field_p[18] = true;
        g.field_p[0] = true;
        g.field_p[8] = false;
    }

    final void m(int param0) {
        int var3 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 < -111) {
          L0: {
            int discarded$306 = 13;
            if (!bj.a()) {
              if (hj.field_f >= 10) {
                int discarded$307 = -81;
                if (!s.a()) {
                  int discarded$308 = 0;
                  sa.b();
                  break L0;
                } else {
                  if (af.field_b != 0) {
                    ui.a(ma.field_sb, 1);
                    break L0;
                  } else {
                    int discarded$309 = this.a(false, false, 10);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            } else {
              L1: {
                stackOut_3_0 = this;
                stackIn_5_0 = stackOut_3_0;
                stackIn_4_0 = stackOut_3_0;
                if (null == df.field_l) {
                  stackOut_5_0 = this;
                  stackOut_5_1 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  stackIn_6_1 = stackOut_5_1;
                  break L1;
                } else {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_6_1 = stackOut_4_1;
                  break L1;
                }
              }
              int discarded$310 = this.a(stackIn_6_1 != 0, false, 10);
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final void a(int param0, String param1, byte param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              int discarded$2 = 640;
              this.a(param1, param0, 480, param2 + -5387);
              if (param2 == 12) {
                break L1;
              } else {
                ((sl) this).field_r = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("sl.E(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 44 + param2 + 41);
        }
    }

    private final void g(byte param0) {
        g.field_p[5] = true;
        int var2 = 45;
    }

    private final void f() {
        g.field_p[2] = true;
    }

    private final void k(int param0) {
        int var2 = dh.field_N.l(31760);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = gf.field_C + -1;
        byte[] var5 = new byte[var4];
        dh.field_N.a(var4, 0, var5, (byte) -118);
        wa.a(mj.a((byte) 127, var5), var3 != 0, nb.a(89), (byte) 9);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        int discarded$0 = 0;
        int discarded$1 = 82;
        this.a();
        if (!(!param2)) {
            int discarded$2 = -99;
            this.e();
        }
        if (param3) {
            int discarded$3 = 72;
            this.f();
        }
        if (param4 != -6) {
            field_B = null;
        }
        if (param0) {
            int discarded$4 = -5721;
            this.n();
        }
        if (param1) {
            this.g((byte) -59);
        }
    }

    private final int a(boolean param0, boolean param1, int param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Boolean var9 = null;
            od var10 = null;
            Throwable decompiledCaughtException = null;
            var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var4 = hl.a(ob.field_c, param0, -1980693983, ma.field_sb);
            if (var4 == 0) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (var4 == 1) {
                  L1: {
                    int discarded$13 = 36;
                    int discarded$14 = -21;
                    int discarded$15 = -85;
                    var5_int = oi.a(fj.f(), hg.d());
                    if (var5_int != -1) {
                      int discarded$16 = 105;
                      rb.a(var5_int, td.field_m, cc.field_p);
                      cc.field_p = null;
                      td.field_m = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var9 = qj.a(-11);
                  if (var9 != null) {
                    e.a(-1, var9.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if (var4 == 2) {
                  int discarded$17 = 127;
                  int discarded$18 = 109;
                  int discarded$19 = 1;
                  var5_int = hb.a(-60, fl.a(false), ((sl) this).field_u, nf.e(), ug.f(), vd.f(-51), fa.a());
                  if (var5_int != -1) {
                    wh.a(var5_int, cc.field_p, (byte) 117, td.field_m);
                    cc.field_p = null;
                    td.field_m = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (var4 == 3) {
                  L4: {
                    if (mh.field_d == -1) {
                      break L4;
                    } else {
                      if (mh.field_d == 0) {
                        break L4;
                      } else {
                        mh.field_d = -1;
                        df.a((byte) 101);
                        break L4;
                      }
                    }
                  }
                  if (param1) {
                    dd.field_j = false;
                    break L3;
                  } else {
                    var5_int = f.a(((sl) this).field_u, -73, false, fl.a(false), vd.f(89), ((sl) this).field_y);
                    if (var5_int != -1) {
                      if (var5_int != 0) {
                        dl.a(cc.field_p, var5_int, 79);
                        cc.field_p = null;
                        break L3;
                      } else {
                        sf.field_l = ld.field_b;
                        int discarded$20 = 1;
                        wh.b();
                        gf.field_G = false;
                        af.field_b = 10;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (4 != var4) {
                  break L5;
                } else {
                  if (!bd.field_N) {
                    af.field_b = 10;
                    gf.field_G = true;
                    break L5;
                  } else {
                    sg.a(param2 + -6998, nb.a(-71));
                    break L5;
                  }
                }
              }
              L6: {
                if (var4 != 5) {
                  break L6;
                } else {
                  DrPhlogistonSavesTheEarth.a(nb.a(120), param2 ^ -127);
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (!gm.field_M) {
                    break L7;
                  } else {
                    af.field_b = 10;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if (var4 == 7) {
                  ei.a(false, nb.a(param2 ^ 101));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var4 != 8) {
                  break L9;
                } else {
                  sg.a(-6988, nb.a(param2 ^ 99));
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  int discarded$21 = 75;
                  al.a(nb.a(param2 + 107));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 == 10) {
                  nj.field_p.d(17, -18392);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4 != 11) {
                  break L12;
                } else {
                  bf.a(63, nb.a(param2 + -75));
                  break L12;
                }
              }
              L13: {
                if (var4 != 12) {
                  break L13;
                } else {
                  int discarded$22 = 22812;
                  ff.a(-76, hm.a(), nb.a(param2 ^ 110));
                  break L13;
                }
              }
              L14: {
                if (13 == var4) {
                  try {
                    L15: {
                      L16: {
                        if (al.field_e != null) {
                          break L16;
                        } else {
                          al.field_e = new fi(sb.field_d, new java.net.URL(((sl) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (!al.field_e.b(1)) {
                          break L17;
                        } else {
                          L18: {
                            var10 = al.field_e.a((byte) 127);
                            if (var10 == null) {
                              int discarded$23 = 1;
                              cb.a((String) null);
                              break L18;
                            } else {
                              var7 = p.a(var10.field_j, (byte) 79, var10.field_h, 0);
                              int discarded$24 = 1;
                              cb.a(var7);
                              break L18;
                            }
                          }
                          al.field_e = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      gb.a((Throwable) (Object) var5, "S1", param2);
                      int discarded$25 = 1;
                      cb.a((String) null);
                      al.field_e = null;
                      break L19;
                    }
                  }
                  break L14;
                } else {
                  break L14;
                }
              }
              L20: {
                if (var4 == 15) {
                  af.field_b = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (17 == var4) {
                  return 2;
                } else {
                  if (param2 == 10) {
                    return 0;
                  } else {
                    field_q = -3;
                    return 0;
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected sl() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = "Unpacking sound effects";
        field_B = "to return to the normal view.";
    }
}
