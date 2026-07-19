/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
                var6 = nf.b(false);
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
          if (kh.a(false)) {
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
            this.field_p = -105;
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
          if (n.a(64)) {
            L6: {
              var3 = 1200 * pk.d((byte) 9);
              if (this.field_r) {
                break L6;
              } else {
                if ((nf.c(false) ^ -1) >= (var3 ^ -1)) {
                  break L5;
                } else {
                  if (var3 < qg.m(12484)) {
                    break L6;
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_r = false;
            eg.a((byte) 126);
            am.e(11);
            dl.a(ni.field_u, 2, 120);
            fj.e(115);
            dd.field_j = true;
            ab.field_a = la.a(false) + 15000L;
            break L5;
          } else {
            break L5;
          }
        }
        L7: {
          L8: {
            if (0 == (mh.field_d ^ -1)) {
              break L8;
            } else {
              if (-1 != (mh.field_d ^ -1)) {
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
            mh.field_d = dm.d(-106);
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
                    wh.b(true);
                    break L10;
                  }
                }
              }
            }
          }
          if (0 == (mh.field_d ^ -1)) {
            break L7;
          } else {
            if (-1 != (mh.field_d ^ -1)) {
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
            if (-1 == (mh.field_d ^ -1)) {
              break L11;
            } else {
              if (10 > hj.field_f) {
                if (3 == mh.field_d) {
                  this.a(-51, "js5crc");
                  break L11;
                } else {
                  if (-5 == (mh.field_d ^ -1)) {
                    this.a(-51, "js5io");
                    break L11;
                  } else {
                    if ((mh.field_d ^ -1) != -3) {
                      if ((mh.field_d ^ -1) == -6) {
                        this.a(-51, "outofdate");
                        break L11;
                      } else {
                        this.a(-51, "js5connect");
                        break L11;
                      }
                    } else {
                      this.a(-51, "js5connect_full");
                      break L11;
                    }
                  }
                }
              } else {
                if (10 > af.field_b) {
                  break L11;
                } else {
                  L12: {
                    am.e(11);
                    if ((mh.field_d ^ -1) != -4) {
                      if (4 == mh.field_d) {
                        dl.a(ug.field_p, 256, 102);
                        break L12;
                      } else {
                        if (-3 != (mh.field_d ^ -1)) {
                          if ((mh.field_d ^ -1) != -6) {
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
              if ((mh.field_d ^ -1) != -1) {
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
          if (-1 != (mh.field_d ^ -1)) {
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
            if (!jj.b(-98)) {
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
          if ((hj.field_f ^ -1) != -2) {
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
            qd.field_Jb = lk.a(false, true, hb.field_q, 1, 8);
            sb.field_i = lk.a(false, true, field_q, 1, 8);
            ig.field_t = lk.a(false, true, jd.field_O, 1, 8);
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
                      tc.a((byte) 86);
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
                    dm.c((byte) 94);
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
                      stackOut_101_0 = (String) ((Object) stackIn_101_0);
                      stackOut_101_1 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      stackIn_102_1 = stackOut_101_1;
                      break L25;
                    } else {
                      stackOut_100_0 = (String) ((Object) stackIn_100_0);
                      stackOut_100_1 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      stackIn_102_1 = stackOut_100_1;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_102_0 = (String) ((Object) stackIn_102_0);
                    stackOut_102_1 = stackIn_102_1;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_104_1 = stackOut_102_1;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    if (fm.field_l) {
                      stackOut_104_0 = (String) ((Object) stackIn_104_0);
                      stackOut_104_1 = stackIn_104_1;
                      stackOut_104_2 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      stackIn_105_2 = stackOut_104_2;
                      break L26;
                    } else {
                      stackOut_103_0 = (String) ((Object) stackIn_103_0);
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      stackIn_105_2 = stackOut_103_2;
                      break L26;
                    }
                  }
                  eb.a(stackIn_105_0, stackIn_105_1 != 0, stackIn_105_2 != 0, 10);
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
                jc.a(79, (java.applet.Applet) (this));
                tc.a((byte) 86);
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
              if (-1 == (ob.field_c ^ -1)) {
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
          if ((hj.field_f ^ -1) == -12) {
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
              this.f(118);
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
        this.setBackground(java.awt.Color.black);
        ob.field_c = this.field_n;
        jd.a((byte) 119, ob.field_c);
        ua.a(this.field_t, this.field_A, (byte) 34, this.field_v, 5000, sb.field_d, ob.field_c, 5000, this.field_z, this.field_m, this.field_p, param2, this.field_w, param1);
        wi.a(this.field_v, param1, ob.field_c, this.field_m, this.field_z, this.field_p, sb.field_d, this.field_A, 111);
        rg.a(param3 ^ -11603);
        sc.field_e = vb.a((byte) 65);
        ej.a(n.field_g, (byte) 71);
        md.field_d = param7;
        p.field_f = param6;
        if (param3 != 7320) {
            this.field_m = -76;
        }
        jd.field_O = param5;
        hb.field_q = param4;
        field_q = param0;
        this.l(param3 ^ -7321);
        bf.b(param3 ^ 7192);
    }

    private final void i(int param0) {
        if (param0 >= -106) {
            field_o = (rf) null;
        }
        String var2 = ca.b(false);
        hg.a(nb.a(-102), -1, var2);
    }

    private final void n(int param0) {
        if (param0 != -5721) {
            this.c(false);
        }
        g.field_p[4] = true;
    }

    final int b(boolean param0) {
        int var2 = 0;
        if (this.field_c) {
          return -1;
        } else {
          if (sb.b(-11)) {
            if (!dd.field_j) {
              var2 = f.a(this.field_u, -50, true, fl.a(false), vd.f(-61), this.field_y);
              if (0 == (var2 ^ -1)) {
                return -1;
              } else {
                L0: {
                  if (var2 == 0) {
                    if ((af.field_b ^ -1) == -12) {
                      if (mh.field_d == 0) {
                        wh.b(true);
                        break L0;
                      } else {
                        return var2;
                      }
                    } else {
                      if ((af.field_b ^ -1) == -12) {
                        if (mh.field_d == 0) {
                          wh.b(true);
                          break L0;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    }
                  } else {
                    if ((af.field_b ^ -1) == -12) {
                      if (mh.field_d == 0) {
                        wh.b(true);
                        break L0;
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

    private final void e(byte param0) {
        if (param0 >= -71) {
            return;
        }
        g.field_p[1] = true;
    }

    public static void j(int param0) {
        field_o = null;
        if (param0 != 26395) {
            return;
        }
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
        int decompiledRegionSelector0 = 0;
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
              var3 = 42 % ((18 - param0) / 48);
              var2 = new jb(param1, kh.field_i, vi.field_b, gf.field_o, qa.field_J, a.field_e);
              oc.a((byte) -21);
              stackOut_3_0 = (jb) (var2);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var2_ref);
            stackOut_5_1 = new StringBuilder().append("sl.N(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (jb) ((Object) stackIn_2_0);
        } else {
          return stackIn_4_0;
        }
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
        int discarded$1 = 0;
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
            discarded$1 = this.b(true);
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
                  if ((var2 ^ -1) == -2) {
                    af.a((byte) 59);
                    break L2;
                  } else {
                    if (-3 != (var2 ^ -1)) {
                      if (3 != var2) {
                        if (var2 != 4) {
                          if (-6 != (var2 ^ -1)) {
                            if (var2 != 6) {
                              if ((var2 ^ -1) != -8) {
                                if ((var2 ^ -1) != -9) {
                                  if (var2 == 16) {
                                    am.g(11);
                                    break L2;
                                  } else {
                                    L3: {
                                      if ((var2 ^ -1) == -12) {
                                        break L3;
                                      } else {
                                        if (-13 != (var2 ^ -1)) {
                                          if (13 != var2) {
                                            if (-18 != (var2 ^ -1)) {
                                              if ((var2 ^ -1) != -19) {
                                                gb.a((Throwable) null, "MGS1: " + al.a(-64), 10);
                                                eg.a((byte) 126);
                                                break L2;
                                              } else {
                                                lc.a((byte) -127);
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
                                  hd.a((byte) 109, dh.field_N, sb.field_d, gf.field_C);
                                  break L2;
                                }
                              } else {
                                this.i(-115);
                                break L2;
                              }
                            } else {
                              fm.a((byte) 124);
                              break L2;
                            }
                          } else {
                            ta.c(4);
                            break L2;
                          }
                        } else {
                          uk.a(-31114);
                          break L2;
                        }
                      } else {
                        dh.k(-3);
                        break L2;
                      }
                    } else {
                      sf.a((byte) -4);
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
        eg.a((byte) 126);
    }

    private final void a(String param0, int param1, int param2, int param3, int param4) {
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
                if (!this.e(-125)) {
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.field_z = this.getCodeBase().getHost();
                      var6_ref2 = this.field_z.toLowerCase();
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
                  ((sl) (this)).field_y = stackIn_8_1 != 0;
                  this.field_v = Integer.parseInt(this.getParameter("gameport1"));
                  this.field_p = Integer.parseInt(this.getParameter("gameport2"));
                  if (param3 == -5375) {
                    L4: {
                      var7 = this.getParameter("servernum");
                      if (var7 == null) {
                        break L4;
                      } else {
                        this.field_A = Integer.parseInt(var7);
                        break L4;
                      }
                    }
                    L5: {
                      this.field_m = Integer.parseInt(this.getParameter("gamecrc"));
                      this.field_w = Long.parseLong(this.getParameter("instanceid"));
                      this.field_t = this.getParameter("member").equals("yes");
                      var8 = this.getParameter("lang");
                      if (var8 != null) {
                        this.field_n = Integer.parseInt(var8);
                        break L5;
                      } else {
                        break L5;
                      }
                    }
                    L6: {
                      if ((this.field_n ^ -1) <= -6) {
                        this.field_n = 0;
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var9 = this.getParameter("affid");
                      if (var9 != null) {
                        this.field_u = Integer.parseInt(var9);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                    em.field_b = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                    this.a(-4, param1, this.field_m, 32, param2, param0, param4);
                    decompiledRegionSelector0 = 2;
                    break L1;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6 = (Exception) (Object) decompiledCaughtException;
                gb.a((Throwable) ((Object) var6), (String) null, param3 + 5385);
                this.a(param3 ^ 5324, "crash");
                decompiledRegionSelector0 = 2;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                decompiledRegionSelector1 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) (var6_ref);
            stackOut_25_1 = new StringBuilder().append("sl.H(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final int b(int param0, boolean param1) {
        int discarded$0 = 0;
        if (param0 != 5017) {
            discarded$0 = this.a(false, true, 12);
        }
        return this.a(param1, true, 10);
    }

    private final void a(byte param0, boolean param1) {
        int var3 = 111 / ((22 - param0) / 38);
        g.field_p[7] = true;
        g.field_p[3] = true;
        g.field_p[17] = true;
        g.field_p[16] = true;
        g.field_p[18] = true;
        g.field_p[0] = true;
        g.field_p[8] = param1;
    }

    final void m(int param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        int var3 = 0;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param0 >= -111) {
          return;
        } else {
          L0: {
            if (!bj.a(13)) {
              if (-11 >= (hj.field_f ^ -1)) {
                if (!s.a((byte) -81)) {
                  sa.b(0);
                  break L0;
                } else {
                  if (-1 != (af.field_b ^ -1)) {
                    ui.a(ma.field_sb, 1);
                    break L0;
                  } else {
                    discarded$2 = this.a(false, false, 10);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            } else {
              L1: {
                stackOut_2_0 = this;
                stackIn_4_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (null == df.field_l) {
                  stackOut_4_0 = this;
                  stackOut_4_1 = 0;
                  stackIn_5_0 = stackOut_4_0;
                  stackIn_5_1 = stackOut_4_1;
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackOut_3_1 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  stackIn_5_1 = stackOut_3_1;
                  break L1;
                }
              }
              discarded$3 = this.a(stackIn_5_1 != 0, false, 10);
              break L0;
            }
          }
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
              this.a(param1, param0, 480, param2 + -5387, 640);
              if (param2 == 12) {
                break L1;
              } else {
                this.field_r = true;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("sl.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param2 + ')');
        }
    }

    private final void g(byte param0) {
        g.field_p[5] = true;
        int var2 = -91 / ((param0 - 58) / 49);
    }

    private final void f(byte param0) {
        if (param0 != 72) {
            return;
        }
        g.field_p[2] = true;
    }

    private final void k(int param0) {
        jb discarded$0 = null;
        int var2 = dh.field_N.l(31760);
        if (param0 != 28586) {
            byte[] var6 = (byte[]) null;
            discarded$0 = sl.a((byte) 74, (byte[]) null);
        }
        int var3 = -1 != (1 & var2 ^ -1) ? 1 : 0;
        int var4 = gf.field_C + -1;
        byte[] var5 = new byte[var4];
        dh.field_N.a(var4, 0, var5, (byte) -118);
        wa.a(mj.a((byte) 127, var5), var3 != 0, nb.a(89), (byte) 9);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a((byte) 82, false);
        if (!(!param2)) {
            this.e((byte) -99);
        }
        if (param3) {
            this.f((byte) 72);
        }
        if (param4 != -6) {
            field_B = (String) null;
        }
        if (param0) {
            this.n(-5721);
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
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            od var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
            var4 = hl.a(ob.field_c, param0, -1980693983, ma.field_sb);
            if ((var4 ^ -1) == -1) {
              throw new IllegalStateException();
            } else {
              L0: {
                if ((var4 ^ -1) == -2) {
                  L1: {
                    var5_int = oi.a(fj.f(36), hg.d((byte) -21), (byte) -85);
                    if ((var5_int ^ -1) != 0) {
                      rb.a(var5_int, td.field_m, cc.field_p, 105);
                      cc.field_p = null;
                      td.field_m = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var11 = qj.a(-11);
                  if (var11 != null) {
                    e.a(-1, var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if ((var4 ^ -1) == -3) {
                  var5_int = hb.a(-60, fl.a(false), this.field_u, nf.e((byte) 127), ug.f(109), vd.f(-51), fa.a(true));
                  if (0 != (var5_int ^ -1)) {
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
                if ((var4 ^ -1) == -4) {
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
                    var5_int = f.a(this.field_u, -73, false, fl.a(false), vd.f(89), this.field_y);
                    if (var5_int != -1) {
                      if (-1 != (var5_int ^ -1)) {
                        dl.a(cc.field_p, var5_int, 79);
                        cc.field_p = null;
                        break L3;
                      } else {
                        sf.field_l = ld.field_b;
                        wh.b(true);
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
                if (-6 != (var4 ^ -1)) {
                  break L6;
                } else {
                  DrPhlogistonSavesTheEarth.a(nb.a(120), param2 ^ -127);
                  break L6;
                }
              }
              L7: {
                if ((var4 ^ -1) == -7) {
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
                if ((var4 ^ -1) == -8) {
                  ei.a(false, nb.a(param2 ^ 101));
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (-9 != (var4 ^ -1)) {
                  break L9;
                } else {
                  sg.a(-6988, nb.a(param2 ^ 99));
                  break L9;
                }
              }
              L10: {
                if ((var4 ^ -1) == -10) {
                  al.a(nb.a(param2 + 107), 75);
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if ((var4 ^ -1) == -11) {
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
                if (-13 != (var4 ^ -1)) {
                  break L13;
                } else {
                  ff.a(-76, hm.a(22812), nb.a(param2 ^ 110));
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
                          al.field_e = new fi(sb.field_d, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (!al.field_e.b(1)) {
                          break L17;
                        } else {
                          L18: {
                            var12 = al.field_e.a((byte) 127);
                            if (var12 == null) {
                              var9 = (String) null;
                              cb.a((String) null, true);
                              break L18;
                            } else {
                              var7 = p.a(var12.field_j, (byte) 79, var12.field_h, 0);
                              cb.a(var7, true);
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
                      gb.a((Throwable) ((Object) var5), "S1", param2 ^ 0);
                      var10 = (String) null;
                      cb.a((String) null, true);
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
                if (-16 == (var4 ^ -1)) {
                  af.field_b = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (-17 == (var4 ^ -1)) {
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
        field_s = "Unpacking sound effects";
        field_B = "to return to the normal view.";
    }
}
