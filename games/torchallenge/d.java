/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class d extends ug {
    private int field_D;
    private boolean field_A;
    static int[] field_y;
    static String field_z;
    private int field_v;
    static String field_r;
    private boolean field_t;
    private int field_C;
    String field_w;
    private int field_s;
    private long field_q;
    private int field_x;
    private boolean field_B;
    private int field_u;

    private final void a(boolean param0) {
        ki.field_a[1] = param0;
    }

    final static boolean p(int param0) {
        if (param0 >= -64) {
            field_z = null;
        }
        return lj.field_q;
    }

    private final void m() {
        qc.field_h[8] = -2;
        qc.field_h[16] = -1;
        qc.field_h[17] = -1;
        qc.field_h[5] = -1;
        qc.field_h[9] = -1;
        qc.field_h[13] = -1;
        qc.field_h[11] = -1;
        qc.field_h[18] = 1;
        qc.field_h[7] = -1;
        qc.field_h[2] = -2;
        qc.field_h[4] = -1;
        qc.field_h[1] = 16;
        qc.field_h[3] = -1;
        qc.field_h[10] = -1;
        qc.field_h[6] = -2;
        qc.field_h[12] = -1;
    }

    public static void h() {
        field_y = null;
        field_r = null;
        field_z = null;
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_136_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_135_0 = 0;
        int stackOut_134_0 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (null != tf.field_h) {
            L1: {
              if (null != gi.field_d) {
                break L1;
              } else {
                int discarded$20 = 4;
                var6 = ak.b();
                var4 = var6.getSize();
                tf.field_h.a(var4.width, 122, var4.height);
                break L1;
              }
            }
            tf.field_h.a(2);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          te.a(-11);
          int discarded$21 = 30210;
          cb.a();
          if (hc.c((byte) 99)) {
            break L2;
          } else {
            if (11 == gj.field_c) {
              break L2;
            } else {
              ak.a(false);
              break L2;
            }
          }
        }
        L3: {
          if (ef.field_l != null) {
            bl.field_X = ef.field_l.a((byte) 29);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          int discarded$22 = 4;
          if (!hf.a()) {
            break L4;
          } else {
            L5: {
              var3 = ol.b(-118) * 1200;
              if (((d) this).field_t) {
                break L5;
              } else {
                if (pg.e(-35) <= var3) {
                  break L4;
                } else {
                  int discarded$23 = -10365;
                  if (~ll.b() < ~var3) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((d) this).field_t = false;
            ob.b(-126);
            int discarded$24 = 10;
            kc.f();
            te.a(-1, 2, wh.field_a);
            ug.a(-13);
            dj.field_Z = true;
            ji.field_y = 15000L + ol.a(256);
            break L4;
          }
        }
        L6: {
          L7: {
            if (ah.field_b == -1) {
              break L7;
            } else {
              if (ah.field_b == 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (-1 != ah.field_b) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L8;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_23_0;
            int discarded$25 = 0;
            ah.field_b = bd.e();
            if (var3 == 0) {
              break L9;
            } else {
              if (ah.field_b != 0) {
                break L9;
              } else {
                if (gj.field_c != 11) {
                  break L9;
                } else {
                  int discarded$26 = -26375;
                  if (!nb.a()) {
                    mc.a(112);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == ah.field_b) {
            break L6;
          } else {
            if (ah.field_b != 0) {
              ji.field_y = 15000L + ol.a(256);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (-1 == ah.field_b) {
            break L10;
          } else {
            if (ah.field_b != 0) {
              if (li.field_K < 10) {
                if (3 == ah.field_b) {
                  ((d) this).a((byte) -105, "js5crc");
                  break L10;
                } else {
                  if (ah.field_b != 4) {
                    if (ah.field_b != 2) {
                      if (ah.field_b != 5) {
                        ((d) this).a((byte) -99, "js5connect");
                        break L10;
                      } else {
                        ((d) this).a((byte) -126, "outofdate");
                        break L10;
                      }
                    } else {
                      ((d) this).a((byte) -108, "js5connect_full");
                      break L10;
                    }
                  } else {
                    ((d) this).a((byte) -111, "js5io");
                    break L10;
                  }
                }
              } else {
                if (gj.field_c >= 10) {
                  L11: {
                    int discarded$27 = 10;
                    kc.f();
                    if (ah.field_b != 3) {
                      if (ah.field_b == 4) {
                        te.a(-1, 256, uc.field_R);
                        break L11;
                      } else {
                        if (2 == ah.field_b) {
                          te.a(-1, 256, vi.field_b);
                          break L11;
                        } else {
                          if (ah.field_b != 5) {
                            te.a(-1, 256, bk.field_r);
                            break L11;
                          } else {
                            te.a(-1, 5, qa.field_d);
                            break L11;
                          }
                        }
                      }
                    } else {
                      te.a(-1, 256, ei.field_y);
                      break L11;
                    }
                  }
                  dj.field_Z = true;
                  break L10;
                } else {
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if (ah.field_b == -1) {
                break L14;
              } else {
                if (ah.field_b != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            int discarded$28 = -26375;
            if (nb.a()) {
              break L13;
            } else {
              break L12;
            }
          }
          if (~ji.field_y >= ~ol.a(256)) {
            dj.field_Z = false;
            if (ah.field_b == -1) {
              break L12;
            } else {
              if (ah.field_b != 0) {
                ah.field_b = -1;
                ac.a(-113);
                break L12;
              } else {
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (ah.field_b != 0) {
            break L15;
          } else {
            int discarded$29 = -26375;
            if (!nb.a()) {
              hk.field_d = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (li.field_K != 0) {
            break L16;
          } else {
            int discarded$30 = -1;
            if (!ul.a()) {
              break L16;
            } else {
              li.field_K = 1;
              break L16;
            }
          }
        }
        L17: {
          if (1 == li.field_K) {
            L18: {
              if (kf.field_b != 0) {
                rj.field_f = pe.b(rj.field_c, -1);
                break L18;
              } else {
                break L18;
              }
            }
            int discarded$31 = 1;
            sl.field_a = fc.a(false, 1, 88, a.field_a);
            int discarded$32 = 1;
            gf.field_p = fc.a(false, 1, -116, qh.field_P);
            int discarded$33 = 1;
            jl.field_b = fc.a(false, 1, -20, gh.field_w);
            aj.field_f = sl.field_a;
            ad.field_g = gf.field_p;
            li.field_K = 2;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (li.field_K != 2) {
            break L19;
          } else {
            L20: {
              if (rj.field_f != null) {
                if (!rj.field_f.b(-7957)) {
                  break L20;
                } else {
                  if (rj.field_f.a((byte) -39, "")) {
                    if (!rj.field_f.b(5, "")) {
                      break L20;
                    } else {
                      oj.a(-3798, rj.field_f);
                      rj.field_f = null;
                      id.a(104);
                      break L20;
                    }
                  } else {
                    rj.field_f = null;
                    break L20;
                  }
                }
              } else {
                break L20;
              }
            }
            if (rj.field_f != null) {
              break L19;
            } else {
              li.field_K = 3;
              break L19;
            }
          }
        }
        L21: {
          if (li.field_K != 3) {
            break L21;
          } else {
            if (!pl.a(gf.field_p, jl.field_b, (byte) -100, sl.field_a)) {
              break L21;
            } else {
              if (de.a(30, jl.field_b)) {
                L22: {
                  L23: {
                    int discarded$34 = 76;
                    ch.a();
                    sa.a(0);
                    sa.field_b = wb.field_m;
                    fh.field_g = false;
                    rf.a(sl.field_a, (byte) -23, fg.field_S, jl.field_b, gf.field_p);
                    if (qc.field_j) {
                      break L23;
                    } else {
                      if (qe.field_bb == null) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    if (qc.field_j) {
                      stackOut_101_0 = 0;
                      stackIn_102_0 = stackOut_101_0;
                      break L24;
                    } else {
                      stackOut_100_0 = 1;
                      stackIn_102_0 = stackOut_100_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_102_0 = stackIn_102_0;
                    stackOut_102_1 = -24;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_104_1 = stackOut_102_1;
                    stackIn_103_0 = stackOut_102_0;
                    stackIn_103_1 = stackOut_102_1;
                    if (qc.field_j) {
                      stackOut_104_0 = stackIn_104_0;
                      stackOut_104_1 = stackIn_104_1;
                      stackOut_104_2 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      stackIn_105_2 = stackOut_104_2;
                      break L25;
                    } else {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      stackIn_105_2 = stackOut_103_2;
                      break L25;
                    }
                  }
                  v.a(stackIn_105_0 != 0, (byte) stackIn_105_1, stackIn_105_2 != 0, qe.field_bb);
                  break L22;
                }
                L26: {
                  if (cd.field_h) {
                    hf.a((byte) -116);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (null != o.field_k) {
                    break L27;
                  } else {
                    int discarded$35 = -944;
                    o.field_k = sl.b();
                    int discarded$36 = 38;
                    ja.field_a = gb.b();
                    break L27;
                  }
                }
                v.a((byte) 127, o.field_k, ja.field_a, jl.field_b);
                jl.field_b = null;
                gf.field_p = null;
                sl.field_a = null;
                int discarded$37 = -109;
                ca.a((java.applet.Applet) this);
                id.a(127);
                li.field_K = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if (li.field_K != 10) {
            break L28;
          } else {
            L29: {
              if (kf.field_b != 0) {
                jd.field_e = pe.b(kk.field_j, -1);
                break L29;
              } else {
                break L29;
              }
            }
            li.field_K = 11;
            break L28;
          }
        }
        L30: {
          if (li.field_K != 11) {
            break L30;
          } else {
            L31: {
              if (jd.field_e == null) {
                break L31;
              } else {
                L32: {
                  if (!jd.field_e.b(-7957)) {
                    break L32;
                  } else {
                    if (!jd.field_e.b((byte) 79)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                int discarded$38 = 256;
                mh.a(tk.a(ol.field_f, jd.field_e, sd.field_g), (byte) -125, 0.0f);
                break L30;
              }
            }
            li.field_K = 12;
            tc.field_k = true;
            break L30;
          }
        }
        L33: {
          if (12 == li.field_K) {
            if (!tc.field_k) {
              li.field_K = 13;
              break L33;
            } else {
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if (li.field_K == 13) {
            L35: {
              var3 = 1;
              if (wc.field_h != null) {
                L36: {
                  if (!wc.field_h.a(0)) {
                    stackOut_135_0 = 0;
                    stackIn_136_0 = stackOut_135_0;
                    break L36;
                  } else {
                    stackOut_134_0 = 1;
                    stackIn_136_0 = stackOut_134_0;
                    break L36;
                  }
                }
                var3 = stackIn_136_0;
                mh.a(wc.field_h.field_c, (byte) -125, wc.field_h.field_d);
                break L35;
              } else {
                break L35;
              }
            }
            if (var3 != 0) {
              li.field_K = 20;
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
            if (!sa.field_c) {
              break L37;
            } else {
              rk.a((byte) -104, bg.field_P);
              ((d) this).e(-72);
              lk.a(bg.field_P, false);
              break L37;
            }
          }
        }
        L38: {
          if (!ki.field_a[8]) {
            break L38;
          } else {
            int discarded$39 = 102;
            ma.e();
            break L38;
          }
        }
        L39: {
          if (param0 < -74) {
            break L39;
          } else {
            ((d) this).field_v = -55;
            break L39;
          }
        }
    }

    private final void g() {
        ki.field_a[4] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.c(32457, param4);
        if (!(!param1)) {
            this.a(!param4 ? true : false);
        }
        if (!(!param3)) {
            int discarded$0 = -95;
            this.n();
        }
        if (param2) {
            int discarded$1 = 87;
            this.g();
        }
        if (param0) {
            this.f((byte) -115);
        }
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    final void j(int param0) {
        int var2 = 0;
        bf var3 = null;
        int var4 = 0;
        int stackIn_34_0 = 0;
        int stackOut_33_0 = 0;
        int stackOut_32_0 = 0;
        var4 = TorChallenge.field_F ? 1 : 0;
        var2 = cb.field_g;
        if (param0 == 5000) {
          L0: {
            if (64 <= var2) {
              break L0;
            } else {
              if (!ki.field_a[var2]) {
                break L0;
              } else {
                if (var2 != 0) {
                  L1: {
                    if (var2 == 1) {
                      int discarded$7 = 108;
                      lh.f();
                      break L1;
                    } else {
                      if (2 == var2) {
                        hc.d((byte) -117);
                        break L1;
                      } else {
                        if (var2 == 3) {
                          la.a((byte) -64);
                          break L1;
                        } else {
                          if (var2 != 4) {
                            if (var2 != 5) {
                              if (var2 != 6) {
                                if (var2 == 7) {
                                  int discarded$8 = 17;
                                  this.o();
                                  break L1;
                                } else {
                                  if (var2 != 8) {
                                    if (var2 != 16) {
                                      L2: {
                                        if (11 == var2) {
                                          break L2;
                                        } else {
                                          if (var2 == 12) {
                                            break L2;
                                          } else {
                                            if (var2 != 13) {
                                              if (var2 != 17) {
                                                if (var2 != 18) {
                                                  td.a("MGS1: " + ck.a(-13299), (Throwable) null, (byte) -52);
                                                  ob.b(param0 + -5101);
                                                  break L1;
                                                } else {
                                                  int discarded$9 = -44;
                                                  ba.b();
                                                  break L1;
                                                }
                                              } else {
                                                this.k(param0 ^ -15709);
                                                break L1;
                                              }
                                            } else {
                                              rc.d(param0 ^ 5116);
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                      L3: {
                                        if (var2 != 12) {
                                          stackOut_33_0 = 0;
                                          stackIn_34_0 = stackOut_33_0;
                                          break L3;
                                        } else {
                                          stackOut_32_0 = 1;
                                          stackIn_34_0 = stackOut_32_0;
                                          break L3;
                                        }
                                      }
                                      var3 = oa.a(stackIn_34_0 != 0, true);
                                      kf.a(param0 ^ 5001, var3);
                                      break L1;
                                    } else {
                                      int discarded$10 = 7;
                                      pi.a();
                                      break L1;
                                    }
                                  } else {
                                    bg.a(bb.field_i, (byte) 121, sh.field_u, (uf) (Object) id.field_b);
                                    break L1;
                                  }
                                }
                              } else {
                                int discarded$11 = 5427;
                                aj.c();
                                break L1;
                              }
                            } else {
                              int discarded$12 = -123;
                              db.i();
                              break L1;
                            }
                          } else {
                            int discarded$13 = 260;
                            wj.b();
                            break L1;
                          }
                        }
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
          td.a("MGS2: " + ck.a(-13299), (Throwable) null, (byte) -98);
          ob.b(-111);
          return;
        } else {
          return;
        }
    }

    final int a(boolean param0, int param1) {
        if (param1 <= 114) {
            this.f((byte) -102);
        }
        return this.a(true, (byte) -42, param0);
    }

    private final void c(int param0, boolean param1) {
        ki.field_a[7] = true;
        ki.field_a[3] = true;
        ki.field_a[8] = param1;
        ki.field_a[17] = true;
        ki.field_a[0] = true;
        ki.field_a[16] = true;
        ki.field_a[18] = true;
    }

    final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((d) this).setBackground(java.awt.Color.black);
        kf.field_b = ((d) this).field_v;
        int discarded$0 = 121;
        rd.a(kf.field_b);
        rj.a(((d) this).field_u, 5000, ((d) this).field_B, ((d) this).field_C, param4, 5000, ((d) this).field_D, ((d) this).field_x, ((d) this).field_w, kf.field_b, ((d) this).field_q, param0, param7, sh.field_u);
        hd.a(7, ((d) this).field_w, ((d) this).field_D, ((d) this).field_u, ((d) this).field_C, kf.field_b, ((d) this).field_x, param7, sh.field_u);
        kk.e(-79);
        int discarded$1 = 96;
        ef.field_l = dj.c();
        lk.a(bg.field_P, param0);
        kk.field_j = param3;
        gh.field_w = param1;
        rj.field_c = param5;
        a.field_a = param6;
        qh.field_P = param2;
        int discarded$2 = 256;
        this.m();
        ja.a((byte) 123);
    }

    final void a(byte param0, int param1, String param2) {
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
              this.a(param2, (byte) -125, 480, 640, param1);
              if (param0 == 58) {
                break L1;
              } else {
                ((d) this).field_s = 28;
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
            stackOut_3_1 = new StringBuilder().append("d.HA(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw oj.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final int l() {
        int var2 = 0;
        if (((d) this).field_g) {
          return -1;
        } else {
          int discarded$2 = -26375;
          if (nb.a()) {
            if (dj.field_Z) {
              return -1;
            } else {
              int discarded$3 = 0;
              var2 = uf.a(((d) this).field_A, true, ((d) this).field_s, a.a((byte) 127), si.h(118));
              if (-1 == var2) {
                return -1;
              } else {
                L0: {
                  if (0 == var2) {
                    if (gj.field_c == 11) {
                      if (0 == ah.field_b) {
                        mc.a(122);
                        break L0;
                      } else {
                        return var2;
                      }
                    } else {
                      return var2;
                    }
                  } else {
                    if (gj.field_c == 11) {
                      if (0 == ah.field_b) {
                        mc.a(122);
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
            }
          } else {
            return -1;
          }
        }
    }

    private final void k(int param0) {
        int var2 = id.field_b.j(param0 ^ 11943);
        if (param0 != -11989) {
            field_y = null;
        }
        int var3 = (var2 & 1) != 0 ? 1 : 0;
        int var4 = -1 + bb.field_i;
        byte[] var5 = new byte[var4];
        id.field_b.a(-25038, var4, 0, var5);
        u.a(gi.b(12476), var3 != 0, -127, re.a(18990, var5));
    }

    private final int a(boolean param0, byte param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            uf var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = TorChallenge.field_F ? 1 : 0;
            var4 = rc.a(kf.field_b, -2, param2, bl.field_X);
            if (var4 != 0) {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    int discarded$10 = 2;
                    int discarded$11 = -47;
                    var5_int = ic.a(kc.g(), be.a(true));
                    if (-1 == var5_int) {
                      break L1;
                    } else {
                      m.a(var5_int, ag.field_c, false, ra.field_d);
                      ra.field_d = null;
                      ag.field_c = null;
                      break L1;
                    }
                  }
                  int discarded$12 = -48;
                  var11 = al.d();
                  if (var11 == null) {
                    break L0;
                  } else {
                    be.a(var11.booleanValue(), (byte) 86);
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 == 2) {
                  int discarded$13 = 83;
                  int discarded$14 = 0;
                  var5_int = TorChallenge.a(il.f(-24044), hd.b(), -20031, ((d) this).field_s, si.h(127), a.a((byte) 126), vd.c());
                  if (var5_int == -1) {
                    break L2;
                  } else {
                    hl.a(0, var5_int, ra.field_d, ag.field_c);
                    ag.field_c = null;
                    ra.field_d = null;
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 == var4) {
                  L4: {
                    if (ah.field_b == -1) {
                      break L4;
                    } else {
                      if (ah.field_b != 0) {
                        ah.field_b = -1;
                        ac.a(-122);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param0) {
                    int discarded$15 = 0;
                    var5_int = uf.a(((d) this).field_A, false, ((d) this).field_s, a.a((byte) 126), si.h(122));
                    if (var5_int != -1) {
                      if (var5_int != 0) {
                        te.a(-1, var5_int, ag.field_c);
                        ag.field_c = null;
                        break L3;
                      } else {
                        je.field_a = ed.field_j;
                        mc.a(111);
                        gj.field_c = 10;
                        lj.field_q = false;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  } else {
                    dj.field_Z = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (var4 == 4) {
                  if (fg.field_S) {
                    pl.a((byte) 119, gi.b(12476));
                    break L5;
                  } else {
                    lj.field_q = true;
                    gj.field_c = 10;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var4 != 5) {
                  break L6;
                } else {
                  ef.a((byte) -93, gi.b(12476));
                  break L6;
                }
              }
              L7: {
                if (var4 != 6) {
                  break L7;
                } else {
                  if (!fh.field_g) {
                    break L7;
                  } else {
                    gj.field_c = 10;
                    break L7;
                  }
                }
              }
              L8: {
                if (var4 != 7) {
                  break L8;
                } else {
                  int discarded$16 = 101;
                  hd.a(gi.b(12476));
                  break L8;
                }
              }
              L9: {
                if (var4 == 8) {
                  pl.a((byte) 126, gi.b(12476));
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4 == 9) {
                  int discarded$17 = 17;
                  gl.a(gi.b(12476));
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  dk.field_s.d(25, 17);
                  break L11;
                }
              }
              L12: {
                if (11 != var4) {
                  break L12;
                } else {
                  ek.a((byte) 56, gi.b(12476));
                  break L12;
                }
              }
              L13: {
                if (var4 == 12) {
                  int discarded$18 = 84;
                  int discarded$19 = 43;
                  ob.a(t.d(), gi.b(12476));
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
                        if (tc.field_o == null) {
                          tc.field_o = new we(sh.field_u, new java.net.URL(((d) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                      L17: {
                        if (tc.field_o.a(true)) {
                          L18: {
                            var12 = tc.field_o.b(120);
                            if (var12 == null) {
                              var9 = null;
                              ti.a((String) null, -126);
                              break L18;
                            } else {
                              var7 = r.a(var12.field_q, 0, var12.field_m, (byte) 8);
                              ti.a(var7, -122);
                              break L18;
                            }
                          }
                          tc.field_o = null;
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
                      td.a("S1", (Throwable) (Object) var5, (byte) -63);
                      var10 = null;
                      ti.a((String) null, -94);
                      tc.field_o = null;
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
                  gj.field_c = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if (var4 == 16) {
                return 1;
              } else {
                if (var4 == 17) {
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

    private final void f(byte param0) {
        ki.field_a[5] = true;
        if (param0 > -109) {
            ((d) this).b(-122, true);
        }
    }

    private final void a(String param0, byte param1, int param2, int param3, int param4) {
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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          try {
            L0: {
              if (!((d) this).c((byte) 124)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((d) this).field_w = ((d) this).getCodeBase().getHost();
                    var6_ref2 = ((d) this).field_w.toLowerCase();
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
                  ((d) this).field_A = stackIn_8_1 != 0;
                  ((d) this).field_C = Integer.parseInt(((d) this).getParameter("gameport1"));
                  ((d) this).field_D = Integer.parseInt(((d) this).getParameter("gameport2"));
                  var7 = ((d) this).getParameter("servernum");
                  if (var7 != null) {
                    ((d) this).field_x = Integer.parseInt(var7);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  ((d) this).field_u = Integer.parseInt(((d) this).getParameter("gamecrc"));
                  ((d) this).field_q = Long.parseLong(((d) this).getParameter("instanceid"));
                  ((d) this).field_B = ((d) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((d) this).getParameter("lang");
                  if (var8 == null) {
                    break L4;
                  } else {
                    ((d) this).field_v = Integer.parseInt(var8);
                    break L4;
                  }
                }
                L5: {
                  if (((d) this).field_v >= 5) {
                    ((d) this).field_v = 0;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L6: {
                  var9 = ((d) this).getParameter("affid");
                  if (var9 == null) {
                    break L6;
                  } else {
                    ((d) this).field_s = Integer.parseInt(var9);
                    break L6;
                  }
                }
                cd.field_h = Boolean.valueOf(((d) this).getParameter("simplemode")).booleanValue();
                ((d) this).a(480, param0, 25, 640, 32, ((d) this).field_u, param4);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              td.a((String) null, (Throwable) (Object) var6, (byte) -52);
              ((d) this).a((byte) -122, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6_ref;
            stackOut_22_1 = new StringBuilder().append("d.PA(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + -125 + 44 + 480 + 44 + 640 + 44 + param4 + 41);
        }
    }

    final void i(int param0) {
        int var3 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        L0: {
          var3 = TorChallenge.field_F ? 1 : 0;
          if (ih.f((byte) -123)) {
            L1: {
              stackOut_7_0 = this;
              stackOut_7_1 = 0;
              stackOut_7_2 = -42;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (gi.field_d == null) {
                stackOut_9_0 = this;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                break L1;
              }
            }
            int discarded$21 = this.a(stackIn_10_1 != 0, (byte) stackIn_10_2, stackIn_10_3 != 0);
            break L0;
          } else {
            if (li.field_K < 10) {
              break L0;
            } else {
              if (!eh.a(50)) {
                int discarded$22 = 3870;
                t.c();
                break L0;
              } else {
                if (0 == gj.field_c) {
                  int discarded$23 = this.a(false, (byte) -42, false);
                  break L0;
                } else {
                  mc.a(bl.field_X, -65);
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (param0 > 54) {
            break L2;
          } else {
            ((d) this).field_v = 10;
            break L2;
          }
        }
    }

    private final void o() {
        int discarded$0 = 6;
        String var2 = bb.a();
        pa.a(var2, 8, gi.b(12476));
    }

    private final void n() {
        ki.field_a[2] = true;
    }

    final int e(byte param0) {
        int var2 = 0;
        L0: {
          if (param0 == 110) {
            break L0;
          } else {
            int discarded$20 = ((d) this).e((byte) 66);
            break L0;
          }
        }
        L1: {
          L2: {
            int discarded$21 = -7407;
            var2 = this.l();
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
            if (!ki.field_a[1]) {
              break L3;
            } else {
              vh.a(2, param0 + -140);
              break L3;
            }
          }
          L4: {
            if (ki.field_a[2]) {
              int discarded$22 = 103;
              int discarded$23 = 3;
              ni.a();
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (!ki.field_a[3]) {
              break L5;
            } else {
              int discarded$24 = 0;
              int discarded$25 = 4;
              fg.a();
              break L5;
            }
          }
          L6: {
            if (!ki.field_a[4]) {
              break L6;
            } else {
              ah.a((byte) -86, 5);
              break L6;
            }
          }
          L7: {
            if (ki.field_a[5]) {
              int discarded$26 = 6;
              int discarded$27 = -26445;
              ek.a();
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (!ki.field_a[6]) {
              break L8;
            } else {
              int discarded$28 = 7;
              e.a(param0 + -111);
              break L8;
            }
          }
          if (!ki.field_a[8]) {
            break L1;
          } else {
            int discarded$29 = -110;
            eh.b();
            break L1;
          }
        }
        return var2;
    }

    protected d() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_y = new int[]{0, 0};
        field_r = "Please check if address is correct";
    }
}
