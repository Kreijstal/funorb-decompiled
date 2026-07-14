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

    private final void m(int param0) {
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
        if (param0 != 256) {
            ((d) this).i(-16);
        }
        qc.field_h[6] = -2;
        qc.field_h[12] = -1;
    }

    public static void h(int param0) {
        if (param0 <= 90) {
            boolean discarded$0 = d.p(-54);
        }
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
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_134_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        L0: {
          var5 = TorChallenge.field_F ? 1 : 0;
          if (null != tf.field_h) {
            L1: {
              if (null != gi.field_d) {
                break L1;
              } else {
                var6 = ak.b(4);
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
          cb.a(30210);
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
          if (!hf.a(4)) {
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
                  if (ll.b(-10365) > var3) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            ((d) this).field_t = false;
            ob.b(-126);
            kc.f(10);
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
            ah.field_b = bd.e(0);
            if (var3 == 0) {
              break L9;
            } else {
              if (ah.field_b != 0) {
                break L9;
              } else {
                if ((gj.field_c ^ -1) != -12) {
                  break L9;
                } else {
                  if (!nb.a(-26375)) {
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
                  if (-5 != (ah.field_b ^ -1)) {
                    if ((ah.field_b ^ -1) != -3) {
                      if ((ah.field_b ^ -1) != -6) {
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
                    kc.f(10);
                    if (ah.field_b != 3) {
                      if (-5 == (ah.field_b ^ -1)) {
                        te.a(-1, 256, uc.field_R);
                        break L11;
                      } else {
                        if (2 == ah.field_b) {
                          te.a(-1, 256, vi.field_b);
                          break L11;
                        } else {
                          if ((ah.field_b ^ -1) != -6) {
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
              if (0 == ah.field_b) {
                break L14;
              } else {
                if (-1 != ah.field_b) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (nb.a(-26375)) {
              break L13;
            } else {
              break L12;
            }
          }
          if ((ji.field_y ^ -1L) >= (ol.a(256) ^ -1L)) {
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
          if (-1 != (ah.field_b ^ -1)) {
            break L15;
          } else {
            break L15;
          }
        }
        L16: {
          if (li.field_K != 0) {
            break L16;
          } else {
            if (!ul.a(-1)) {
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
            sl.field_a = fc.a(false, 1, 88, a.field_a, true);
            gf.field_p = fc.a(false, 1, -116, qh.field_P, true);
            jl.field_b = fc.a(false, 1, -20, gh.field_w, true);
            aj.field_f = sl.field_a;
            ad.field_g = gf.field_p;
            li.field_K = 2;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (-3 != (li.field_K ^ -1)) {
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
          if (-4 != (li.field_K ^ -1)) {
            break L21;
          } else {
            if (!pl.a(gf.field_p, jl.field_b, (byte) -100, sl.field_a)) {
              break L21;
            } else {
              if (de.a(30, jl.field_b)) {
                L22: {
                  L23: {
                    ch.a(76);
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
                    stackOut_100_1 = -24;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_102_1 = stackOut_100_1;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    if (qc.field_j) {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      stackIn_103_2 = stackOut_102_2;
                      break L25;
                    } else {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = stackIn_101_1;
                      stackOut_101_2 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      stackIn_103_2 = stackOut_101_2;
                      break L25;
                    }
                  }
                  v.a(stackIn_103_0 != 0, (byte) stackIn_103_1, stackIn_103_2 != 0, qe.field_bb);
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
                    o.field_k = sl.b(-944);
                    ja.field_a = gb.b(38);
                    break L27;
                  }
                }
                v.a((byte) 127, o.field_k, ja.field_a, jl.field_b);
                jl.field_b = null;
                gf.field_p = null;
                sl.field_a = null;
                ca.a((java.applet.Applet) this, -109);
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
          if (-11 != li.field_K) {
            break L28;
          } else {
            L29: {
              if (-1 != kf.field_b) {
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
          if (-12 != (li.field_K ^ -1)) {
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
                mh.a(tk.a(ol.field_f, jd.field_e, sd.field_g, 256), (byte) -125, 0.0f);
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
                    stackOut_133_0 = 0;
                    stackIn_134_0 = stackOut_133_0;
                    break L36;
                  } else {
                    stackOut_132_0 = 1;
                    stackIn_134_0 = stackOut_132_0;
                    break L36;
                  }
                }
                var3 = stackIn_134_0;
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
            ma.e(102);
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

    private final void g(byte param0) {
        ki.field_a[4] = true;
        if (param0 != 87) {
            ((d) this).j(-128);
        }
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, boolean param4) {
        this.c(32457, param4);
        if (!(!param1)) {
            this.a(!param4 ? true : false);
        }
        if (!(!param3)) {
            this.n(-95);
        }
        if (param2) {
            this.g((byte) 87);
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
        int stackIn_33_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_31_0 = 0;
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
                if (-1 == (var2 ^ -1)) {
                  return;
                } else {
                  L1: {
                    if (var2 == 1) {
                      lh.f(108);
                      break L1;
                    } else {
                      if (2 == var2) {
                        hc.d((byte) -117);
                        break L1;
                      } else {
                        if ((var2 ^ -1) == -4) {
                          la.a((byte) -64);
                          break L1;
                        } else {
                          if ((var2 ^ -1) != -5) {
                            if (var2 != -6) {
                              if (var2 != 6) {
                                if (-8 == var2) {
                                  this.o(17);
                                  break L1;
                                } else {
                                  if (var2 != 8) {
                                    if (-17 != var2) {
                                      L2: {
                                        if (11 == var2) {
                                          break L2;
                                        } else {
                                          if (-13 == var2) {
                                            break L2;
                                          } else {
                                            if ((var2 ^ -1) != -14) {
                                              if (var2 != 17) {
                                                if (var2 != 18) {
                                                  td.a("MGS1: " + ck.a(-13299), (Throwable) null, (byte) -52);
                                                  ob.b(param0 + -5101);
                                                  break L1;
                                                } else {
                                                  ba.b((byte) -44);
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
                                        if (-13 != (var2 ^ -1)) {
                                          stackOut_32_0 = 0;
                                          stackIn_33_0 = stackOut_32_0;
                                          break L3;
                                        } else {
                                          stackOut_31_0 = 1;
                                          stackIn_33_0 = stackOut_31_0;
                                          break L3;
                                        }
                                      }
                                      var3 = oa.a(stackIn_33_0 != 0, true);
                                      kf.a(param0 ^ 5001, var3);
                                      break L1;
                                    } else {
                                      pi.a((byte) 7);
                                      break L1;
                                    }
                                  } else {
                                    bg.a(bb.field_i, (byte) 121, sh.field_u, (uf) (Object) id.field_b);
                                    break L1;
                                  }
                                }
                              } else {
                                aj.c(5427);
                                break L1;
                              }
                            } else {
                              db.i(-123);
                              break L1;
                            }
                          } else {
                            wj.b(260);
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
        if (param0 != 32457) {
            this.n(-9);
        }
        ki.field_a[18] = true;
    }

    final void a(boolean param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((d) this).setBackground(java.awt.Color.black);
        kf.field_b = ((d) this).field_v;
        rd.a(kf.field_b, (byte) 121);
        rj.a(((d) this).field_u, 5000, ((d) this).field_B, ((d) this).field_C, param4, 5000, ((d) this).field_D, ((d) this).field_x, ((d) this).field_w, kf.field_b, ((d) this).field_q, param0, param7, sh.field_u);
        hd.a(7, ((d) this).field_w, ((d) this).field_D, ((d) this).field_u, ((d) this).field_C, kf.field_b, ((d) this).field_x, param7, sh.field_u);
        kk.e(-79);
        ef.field_l = dj.c((byte) 96);
        lk.a(bg.field_P, param0);
        kk.field_j = param3;
        gh.field_w = param1;
        rj.field_c = param5;
        a.field_a = param6;
        qh.field_P = param2;
        this.m(256);
        ja.a((byte) 123);
    }

    final void a(byte param0, int param1, String param2) {
        this.a(param2, (byte) -125, 480, 640, param1);
        if (param0 != 58) {
            ((d) this).field_s = 28;
        }
    }

    private final int l(int param0) {
        int var2 = 0;
        if (((d) this).field_g) {
          return -1;
        } else {
          if (nb.a(-26375)) {
            if (dj.field_Z) {
              return -1;
            } else {
              var2 = uf.a(((d) this).field_A, true, ((d) this).field_s, a.a((byte) 127), si.h(param0 ^ -7321), false);
              if (-1 == var2) {
                return -1;
              } else {
                L0: {
                  if (0 == var2) {
                    break L0;
                  } else {
                    if (var2 != 1) {
                      L1: {
                        if (ll.field_i) {
                          break L1;
                        } else {
                          ((d) this).a((byte) -108, "reconnect");
                          break L1;
                        }
                      }
                      kc.f(10);
                      te.a(-1, var2, ag.field_c);
                      if (param0 != -7407) {
                        return 79;
                      } else {
                        dj.field_Z = true;
                        ji.field_y = 15000L + ol.a(256);
                        return var2;
                      }
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if ((gj.field_c ^ -1) != -12) {
                    break L2;
                  } else {
                    if (0 != ah.field_b) {
                      break L2;
                    } else {
                      mc.a(122);
                      break L2;
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
            Boolean var10 = null;
            uf var11 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = TorChallenge.field_F ? 1 : 0;
                        var4 = rc.a(kf.field_b, -2, param2, bl.field_X);
                        if (var4 != -1) {
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
                        if (-2 != var4) {
                            statePc = 7;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        var5_int = ic.a(kc.g(2), be.a(true), (byte) -47);
                        if (-1 == var5_int) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        m.a(var5_int, ag.field_c, false, ra.field_d);
                        ra.field_d = null;
                        ag.field_c = null;
                        statePc = 5;
                        continue stateLoop;
                    }
                    case 5: {
                        var10 = al.d((byte) -48);
                        if (var10 == null) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        be.a(var10.booleanValue(), (byte) 86);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        if (var4 == 2) {
                            statePc = 9;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        var5_int = TorChallenge.a(il.f(-24044), hd.b((byte) 83), -20031, ((d) this).field_s, si.h(127), a.a((byte) 126), vd.c(0));
                        if ((var5_int ^ -1) == 0) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        hl.a(0, var5_int, ra.field_d, ag.field_c);
                        ag.field_c = null;
                        ra.field_d = null;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (3 == var4) {
                            statePc = 13;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        if (ah.field_b == 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (-1 != ah.field_b) {
                            statePc = 16;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        ah.field_b = -1;
                        ac.a(-122);
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (!param0) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        dj.field_Z = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 19: {
                        var5_int = uf.a(((d) this).field_A, false, ((d) this).field_s, a.a((byte) 126), si.h(122), false);
                        if (var5_int != -1) {
                            statePc = 21;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (-1 != (var5_int ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        je.field_a = ed.field_j;
                        mc.a(111);
                        gj.field_c = 10;
                        lj.field_q = false;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        te.a(-1, var5_int, ag.field_c);
                        ag.field_c = null;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (-5 == (var4 ^ -1)) {
                            statePc = 26;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (fg.field_S) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        lj.field_q = true;
                        gj.field_c = 10;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        pl.a((byte) 119, gi.b(12476));
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if (var4 != 5) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        ef.a((byte) -93, gi.b(param1 ^ -12438));
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (-7 != var4) {
                            statePc = 34;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        if (!fh.field_g) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        gj.field_c = 10;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (param1 == -42) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        ((d) this).i(123);
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (-8 != var4) {
                            statePc = 38;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    }
                    case 37: {
                        hd.a(gi.b(12476), 101);
                        statePc = 38;
                        continue stateLoop;
                    }
                    case 38: {
                        if (var4 == 8) {
                            statePc = 40;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        pl.a((byte) 126, gi.b(12476));
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (-10 == (var4 ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        gl.a(gi.b(12476), 17);
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (var4 != -11) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 45: {
                        dk.field_s.d(25, 17);
                        statePc = 46;
                        continue stateLoop;
                    }
                    case 46: {
                        if (11 != var4) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        ek.a((byte) 56, gi.b(12476));
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (-13 == var4) {
                            statePc = 50;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        ob.a(t.d(84), gi.b(12476), (byte) 43);
                        statePc = 51;
                        continue stateLoop;
                    }
                    case 51: {
                        if (var4 == 13) {
                            statePc = 53;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        try {
                            if (tc.field_o == null) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            tc.field_o = new we(sh.field_u, new java.net.URL(((d) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (tc.field_o.a(true)) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var11 = tc.field_o.b(120);
                            if (var11 == null) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var7 = r.a(var11.field_q, 0, var11.field_m, (byte) 8);
                            ti.a(var7, -122);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            ti.a((String) null, param1 + -84);
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            tc.field_o = null;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        var5 = (Exception) (Object) caughtException;
                        td.a("S1", (Throwable) (Object) var5, (byte) -63);
                        var9 = null;
                        ti.a((String) null, -94);
                        tc.field_o = null;
                        statePc = 64;
                        continue stateLoop;
                    }
                    case 64: {
                        if ((var4 ^ -1) == -16) {
                            statePc = 66;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 66: {
                        gj.field_c = 10;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (var4 == 16) {
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
                        if ((var4 ^ -1) != -18) {
                            statePc = 72;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    }
                    case 71: {
                        return 2;
                    }
                    case 72: {
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

    private final void f(byte param0) {
        ki.field_a[5] = true;
        if (param0 > -109) {
            ((d) this).b(-122, true);
        }
    }

    private final void a(String param0, byte param1, int param2, int param3, int param4) {
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
          if (!((d) this).c((byte) 124)) {
            return;
          } else {
            L0: {
              L1: {
                ((d) this).field_w = ((d) this).getCodeBase().getHost();
                var6_ref = ((d) this).field_w.toLowerCase();
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
              ((d) this).field_A = stackIn_8_1 != 0;
              ((d) this).field_C = Integer.parseInt(((d) this).getParameter("gameport1"));
              ((d) this).field_D = Integer.parseInt(((d) this).getParameter("gameport2"));
              var7 = ((d) this).getParameter("servernum");
              if (var7 != null) {
                ((d) this).field_x = Integer.parseInt(var7);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ((d) this).field_u = Integer.parseInt(((d) this).getParameter("gamecrc"));
              ((d) this).field_q = Long.parseLong(((d) this).getParameter("instanceid"));
              ((d) this).field_B = ((d) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((d) this).getParameter("lang");
              if (var8 == null) {
                break L3;
              } else {
                ((d) this).field_v = Integer.parseInt(var8);
                break L3;
              }
            }
            L4: {
              if (((d) this).field_v >= 5) {
                ((d) this).field_v = 0;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              var9 = ((d) this).getParameter("affid");
              if (var9 == null) {
                break L5;
              } else {
                ((d) this).field_s = Integer.parseInt(var9);
                break L5;
              }
            }
            L6: {
              cd.field_h = Boolean.valueOf(((d) this).getParameter("simplemode")).booleanValue();
              if (param1 <= -87) {
                break L6;
              } else {
                int discarded$1 = ((d) this).a(true, 43);
                break L6;
              }
            }
            ((d) this).a(param2, param0, 25, param3, 32, ((d) this).field_u, param4);
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        td.a((String) null, (Throwable) (Object) var6, (byte) -52);
        ((d) this).a((byte) -122, "crash");
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
            int discarded$20 = this.a(stackIn_10_1 != 0, (byte) stackIn_10_2, stackIn_10_3 != 0);
            break L0;
          } else {
            if ((li.field_K ^ -1) > -11) {
              break L0;
            } else {
              if (!eh.a(50)) {
                t.c(3870);
                break L0;
              } else {
                if (0 == gj.field_c) {
                  int discarded$21 = this.a(false, (byte) -42, false);
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

    private final void o(int param0) {
        if (param0 != 17) {
            return;
        }
        String var2 = bb.a(6);
        pa.a(var2, 8, gi.b(param0 ^ 12461));
    }

    private final void n(int param0) {
        ki.field_a[2] = true;
        if (param0 >= -80) {
            ((d) this).field_B = false;
        }
    }

    final int e(byte param0) {
        if (param0 != 110) {
            int discarded$0 = ((d) this).e((byte) 66);
        }
        int var2 = this.l(-7407);
        if (var2 != 0) {
            // if_icmpne L163
        }
        if (ki.field_a[1]) {
            vh.a(2, param0 + -140);
        }
        if (!(!ki.field_a[2])) {
            ni.a(3, 103);
        }
        if (ki.field_a[3]) {
            fg.a(4, false);
        }
        if (ki.field_a[4]) {
            ah.a((byte) -86, 5);
        }
        if (!(!ki.field_a[5])) {
            ek.a(-26445, 6);
        }
        if (ki.field_a[6]) {
            e.a(param0 + -111, 7);
        }
        if (ki.field_a[8]) {
            eh.b((byte) -110);
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
