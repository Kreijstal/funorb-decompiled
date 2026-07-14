/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wb extends cd {
    private boolean field_s;
    String field_n;
    private long field_x;
    private int field_p;
    private int field_l;
    static int field_y;
    private int field_m;
    private int field_r;
    static ed field_q;
    private int field_u;
    private int field_k;
    static byte[][] field_t;
    private boolean field_o;
    static String field_w;
    private boolean field_v;

    final static int a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          lc.field_r = 0;
          jj.field_M = null;
          nj.field_a = null;
          var2 = il.field_g;
          il.field_g = pg.field_c;
          if (param1 == 5) {
            break L0;
          } else {
            field_w = null;
            break L0;
          }
        }
        L1: {
          td.field_k.field_c = td.field_k.field_c + 1;
          if (51 == param0) {
            td.field_k.field_b = 2;
            break L1;
          } else {
            if (-51 == (param0 ^ -1)) {
              td.field_k.field_b = 5;
              break L1;
            } else {
              td.field_k.field_b = 1;
              break L1;
            }
          }
        }
        L2: {
          pg.field_c = var2;
          if (td.field_k.field_c < 2) {
            break L2;
          } else {
            if (param0 != -52) {
              break L2;
            } else {
              return 2;
            }
          }
        }
        L3: {
          if (-3 > td.field_k.field_c) {
            break L3;
          } else {
            if (param0 != 50) {
              break L3;
            } else {
              return 5;
            }
          }
        }
        if (td.field_k.field_c < 4) {
          return -1;
        } else {
          return 1;
        }
    }

    final void a(int param0, int param1, String param2) {
        if (param1 != 8) {
            ((wb) this).field_n = null;
        }
        this.a(480, param0, false, param2, 640);
    }

    final void b(boolean param0, byte param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_26_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_117_0 = 0;
        int stackIn_118_0 = 0;
        int stackIn_118_1 = 0;
        int stackIn_152_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_117_0 = 0;
        int stackOut_117_1 = 0;
        int stackOut_116_0 = 0;
        int stackOut_116_1 = 0;
        int stackOut_151_0 = 0;
        int stackOut_150_0 = 0;
        L0: {
          var5 = fleas.field_A ? 1 : 0;
          if (null == aa.field_r) {
            break L0;
          } else {
            L1: {
              if (rh.field_p == null) {
                var6 = sk.a((byte) 60);
                var4 = var6.getSize();
                aa.field_r.a(var4.width, 0, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            aa.field_r.a((byte) -37);
            break L0;
          }
        }
        L2: {
          if (param1 > 12) {
            break L2;
          } else {
            ((wb) this).field_n = null;
            break L2;
          }
        }
        L3: {
          sc.a(-1);
          aj.g(28003);
          if (mc.b((byte) -112)) {
            break L3;
          } else {
            if (bh.field_t != 11) {
              ah.a(-1);
              break L3;
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (ui.field_pb == null) {
            break L4;
          } else {
            al.field_f = ui.field_pb.b(0);
            break L4;
          }
        }
        L5: {
          if (qh.j(32391)) {
            L6: {
              var3 = bm.f((byte) 85) * 1200;
              if (((wb) this).field_v) {
                break L6;
              } else {
                if (var3 >= td.a(true)) {
                  break L5;
                } else {
                  if (vg.c(-127) <= var3) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
            }
            ((wb) this).field_v = false;
            k.c(-28354);
            id.a(false);
            rl.a(wi.field_m, 2, 109);
            ji.a((byte) -69);
            rj.field_j = true;
            ua.field_sb = lj.a((byte) -95) - -15000L;
            break L5;
          } else {
            break L5;
          }
        }
        L7: {
          L8: {
            if (oa.field_j == -1) {
              break L8;
            } else {
              if (oa.field_j == -1) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          L9: {
            if (0 != oa.field_j) {
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
          oa.field_j = ld.a(82);
          if (var3 != 0) {
            L10: {
              if (oa.field_j == 0) {
                if (-12 == (bh.field_t ^ -1)) {
                  if (!lk.i(10)) {
                    ii.a((byte) -88);
                    break L10;
                  } else {
                    if (oa.field_j == 0) {
                      break L7;
                    } else {
                      if (-1 == oa.field_j) {
                        break L7;
                      } else {
                        ua.field_sb = 15000L + lj.a((byte) -125);
                        break L7;
                      }
                    }
                  }
                } else {
                  if (oa.field_j == 0) {
                    break L7;
                  } else {
                    if (-1 == oa.field_j) {
                      break L7;
                    } else {
                      ua.field_sb = 15000L + lj.a((byte) -125);
                      break L7;
                    }
                  }
                }
              } else {
                break L10;
              }
            }
            if (oa.field_j == 0) {
              break L7;
            } else {
              if (-1 == oa.field_j) {
                break L7;
              } else {
                ua.field_sb = 15000L + lj.a((byte) -125);
                break L7;
              }
            }
          } else {
            if (oa.field_j == 0) {
              break L7;
            } else {
              if (-1 == oa.field_j) {
                break L7;
              } else {
                ua.field_sb = 15000L + lj.a((byte) -125);
                break L7;
              }
            }
          }
        }
        L11: {
          if (-1 == oa.field_j) {
            break L11;
          } else {
            if (-1 != oa.field_j) {
              if (ib.field_k <= -11) {
                if (-11 < (bh.field_t ^ -1)) {
                  break L11;
                } else {
                  L12: {
                    id.a(false);
                    if (3 != oa.field_j) {
                      if (oa.field_j != 4) {
                        if (-3 != oa.field_j) {
                          if (-6 == oa.field_j) {
                            rl.a(r.field_j, 5, 91);
                            break L12;
                          } else {
                            rl.a(ri.field_r, 256, 102);
                            break L12;
                          }
                        } else {
                          rl.a(w.field_j, 256, 109);
                          break L12;
                        }
                      } else {
                        rl.a(oc.field_b, 256, 104);
                        break L12;
                      }
                    } else {
                      rl.a(li.field_c, 256, 102);
                      break L12;
                    }
                  }
                  rj.field_j = true;
                  break L11;
                }
              } else {
                if (-4 != oa.field_j) {
                  if (-5 == oa.field_j) {
                    ((wb) this).a(-6469, "js5io");
                    break L11;
                  } else {
                    if (oa.field_j != 2) {
                      if ((oa.field_j ^ -1) == -6) {
                        ((wb) this).a(-6469, "outofdate");
                        break L11;
                      } else {
                        ((wb) this).a(-6469, "js5connect");
                        break L11;
                      }
                    } else {
                      ((wb) this).a(-6469, "js5connect_full");
                      break L11;
                    }
                  }
                } else {
                  ((wb) this).a(-6469, "js5crc");
                  break L11;
                }
              }
            } else {
              break L11;
            }
          }
        }
        L13: {
          L14: {
            if (0 == oa.field_j) {
              break L14;
            } else {
              if (-1 != oa.field_j) {
                if ((ua.field_sb ^ -1L) < (lj.a((byte) -47) ^ -1L)) {
                  if (0 != oa.field_j) {
                    break L13;
                  } else {
                    if (lk.i(10)) {
                      break L13;
                    } else {
                      rj.field_m = false;
                      break L13;
                    }
                  }
                } else {
                  if (0 != oa.field_j) {
                    break L13;
                  } else {
                    if (lk.i(10)) {
                      break L13;
                    } else {
                      rj.field_m = false;
                      break L13;
                    }
                  }
                }
              } else {
                break L14;
              }
            }
          }
          if (lk.i(10)) {
            if (0 != oa.field_j) {
              break L13;
            } else {
              if (lk.i(10)) {
                break L13;
              } else {
                rj.field_m = false;
                break L13;
              }
            }
          } else {
            if (0 != oa.field_j) {
              break L13;
            } else {
              if (lk.i(10)) {
                break L13;
              } else {
                rj.field_m = false;
                break L13;
              }
            }
          }
        }
        L15: {
          if (-1 != ib.field_k) {
            break L15;
          } else {
            if (gd.a((byte) 70)) {
              ib.field_k = 1;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (ib.field_k != 1) {
            break L16;
          } else {
            L17: {
              if (-1 == cg.field_y) {
                break L17;
              } else {
                il.field_a = q.a(8192, df.field_a);
                break L17;
              }
            }
            rl.field_d = uh.a(1, 26, false, true, ki.field_d);
            oa.field_l = uh.a(1, 26, false, true, bm.field_M);
            kc.field_d = uh.a(1, 26, false, true, lh.field_f);
            pf.field_b = oa.field_l;
            ib.field_k = 2;
            a.field_a = rl.field_d;
            break L16;
          }
        }
        L18: {
          if (ib.field_k != 2) {
            break L18;
          } else {
            L19: {
              if (il.field_a != null) {
                if (!il.field_a.b((byte) -109)) {
                  break L19;
                } else {
                  if (!il.field_a.b("", 37)) {
                    il.field_a = null;
                    break L19;
                  } else {
                    if (!il.field_a.a("", -123)) {
                      break L19;
                    } else {
                      je.a(il.field_a, -30);
                      il.field_a = null;
                      fleas.h((byte) 76);
                      break L19;
                    }
                  }
                }
              } else {
                break L19;
              }
            }
            if (null != il.field_a) {
              break L18;
            } else {
              ib.field_k = 3;
              break L18;
            }
          }
        }
        L20: {
          if ((ib.field_k ^ -1) == -4) {
            if (!pl.a(rl.field_d, oa.field_l, kc.field_d, true)) {
              break L20;
            } else {
              if (!rl.a(kc.field_d, 0)) {
                break L20;
              } else {
                L21: {
                  L22: {
                    l.a((byte) -56);
                    sd.a((byte) -63);
                    qj.field_I = jg.field_a;
                    tb.field_c = false;
                    oh.a(kc.field_d, oa.field_l, va.field_m, (byte) 28, rl.field_d);
                    if (of.field_i) {
                      break L22;
                    } else {
                      if (null != hc.field_d) {
                        break L22;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L23: {
                    if (of.field_i) {
                      stackOut_114_0 = 0;
                      stackIn_115_0 = stackOut_114_0;
                      break L23;
                    } else {
                      stackOut_113_0 = 1;
                      stackIn_115_0 = stackOut_113_0;
                      break L23;
                    }
                  }
                  L24: {
                    stackOut_115_0 = stackIn_115_0;
                    stackIn_117_0 = stackOut_115_0;
                    stackIn_116_0 = stackOut_115_0;
                    if (of.field_i) {
                      stackOut_117_0 = stackIn_117_0;
                      stackOut_117_1 = 0;
                      stackIn_118_0 = stackOut_117_0;
                      stackIn_118_1 = stackOut_117_1;
                      break L24;
                    } else {
                      stackOut_116_0 = stackIn_116_0;
                      stackOut_116_1 = 1;
                      stackIn_118_0 = stackOut_116_0;
                      stackIn_118_1 = stackOut_116_1;
                      break L24;
                    }
                  }
                  fl.a(stackIn_118_0 != 0, stackIn_118_1 != 0, hc.field_d, -22175);
                  break L21;
                }
                L25: {
                  if (tg.field_j) {
                    ak.a(38);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (null == td.field_g) {
                    td.field_g = wc.a((byte) -95);
                    u.field_a = rk.e(24089);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                kb.a(-1, td.field_g, kc.field_d, u.field_a);
                rl.field_d = null;
                oa.field_l = null;
                kc.field_d = null;
                bh.a(false, (java.applet.Applet) this);
                fleas.h((byte) -127);
                ib.field_k = 10;
                break L20;
              }
            }
          } else {
            break L20;
          }
        }
        L27: {
          if (10 == ib.field_k) {
            L28: {
              if (cg.field_y != 0) {
                ne.field_a = q.a(8192, ll.field_s);
                break L28;
              } else {
                break L28;
              }
            }
            ib.field_k = 11;
            break L27;
          } else {
            break L27;
          }
        }
        L29: {
          if (-12 == (ib.field_k ^ -1)) {
            L30: {
              if (null == ne.field_a) {
                break L30;
              } else {
                L31: {
                  if (!ne.field_a.b((byte) -113)) {
                    break L31;
                  } else {
                    if (ne.field_a.a(-18)) {
                      break L30;
                    } else {
                      break L31;
                    }
                  }
                }
                jj.a(0.0f, cb.a(sg.field_a, mk.field_a, ne.field_a, (byte) 13), true);
                break L29;
              }
            }
            d.field_Q = true;
            ib.field_k = 12;
            break L29;
          } else {
            break L29;
          }
        }
        L32: {
          if ((ib.field_k ^ -1) == -13) {
            if (d.field_Q) {
              break L32;
            } else {
              ib.field_k = 13;
              break L32;
            }
          } else {
            break L32;
          }
        }
        L33: {
          if (ib.field_k == 13) {
            L34: {
              var3 = 1;
              if (fc.field_c == null) {
                break L34;
              } else {
                L35: {
                  if (!fc.field_c.c(0)) {
                    stackOut_151_0 = 0;
                    stackIn_152_0 = stackOut_151_0;
                    break L35;
                  } else {
                    stackOut_150_0 = 1;
                    stackIn_152_0 = stackOut_150_0;
                    break L35;
                  }
                }
                var3 = stackIn_152_0;
                jj.a(fc.field_c.field_k, fc.field_c.field_f, true);
                break L34;
              }
            }
            if (var3 != 0) {
              ib.field_k = 20;
              if (param0) {
                break L33;
              } else {
                if (!h.field_h) {
                  break L33;
                } else {
                  lh.a((byte) -69, ol.field_e);
                  ((wb) this).c(122);
                  aj.a(0, ol.field_e);
                  break L33;
                }
              }
            } else {
              if (param0) {
                break L33;
              } else {
                if (!h.field_h) {
                  break L33;
                } else {
                  lh.a((byte) -69, ol.field_e);
                  ((wb) this).c(122);
                  aj.a(0, ol.field_e);
                  break L33;
                }
              }
            }
          } else {
            if (param0) {
              break L33;
            } else {
              if (!h.field_h) {
                break L33;
              } else {
                lh.a((byte) -69, ol.field_e);
                ((wb) this).c(122);
                aj.a(0, ol.field_e);
                break L33;
              }
            }
          }
        }
        L36: {
          if (!ui.field_mb[8]) {
            break L36;
          } else {
            bj.e((byte) -41);
            break L36;
          }
        }
    }

    private final int h(int param0) {
        if (((wb) this).field_i) {
            return -1;
        }
        if (!(lk.i(10))) {
            return -1;
        }
        if (param0 != 5000) {
            Object var3 = null;
            ((wb) this).a(102, 69, (String) null);
        }
        if (!(!rj.field_j)) {
            return -1;
        }
        int var2 = rb.a(((wb) this).field_s, lc.f(0), true, vi.b((byte) -55), ((wb) this).field_k, -107);
        if (-1 == var2) {
            return -1;
        }
        if (var2 != 0) {
            // if_icmpeq L103
        } else {
            if (11 == bh.field_t) {
                if (!(0 != oa.field_j)) {
                    ii.a((byte) -88);
                }
            }
            return var2;
        }
        if (!lj.field_e) {
            ((wb) this).a(-6469, "reconnect");
        }
        id.a(false);
        rl.a(fh.field_a, var2, param0 ^ 5115);
        rj.field_j = true;
        ua.field_sb = lj.a((byte) -53) - -15000L;
        return var2;
    }

    private final void j(int param0) {
        ne.field_b[10] = -1;
        ne.field_b[7] = -1;
        ne.field_b[3] = -1;
        ne.field_b[13] = -1;
        ne.field_b[2] = -2;
        ne.field_b[9] = -1;
        ne.field_b[11] = -1;
        ne.field_b[4] = -1;
        ne.field_b[17] = -1;
        ne.field_b[6] = -2;
        ne.field_b[1] = 16;
        if (param0 <= 52) {
            field_q = null;
        }
        ne.field_b[18] = 1;
        ne.field_b[8] = -2;
        ne.field_b[12] = -1;
        ne.field_b[5] = -1;
        ne.field_b[16] = -1;
    }

    final void g(int param0) {
        int var2 = 0;
        sg var3 = null;
        int var4 = 0;
        int stackIn_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          var4 = fleas.field_A ? 1 : 0;
          var2 = be.field_a;
          if (param0 == -12) {
            break L0;
          } else {
            this.a(false, -14);
            break L0;
          }
        }
        L1: {
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (ui.field_mb[var2]) {
              if (var2 == -1) {
                return;
              } else {
                L2: {
                  if (-2 == var2) {
                    gf.a(-45);
                    break L2;
                  } else {
                    if (var2 != 2) {
                      if (3 == var2) {
                        cl.a((byte) -36);
                        break L2;
                      } else {
                        if ((var2 ^ -1) == -5) {
                          se.a(param0 ^ 120);
                          break L2;
                        } else {
                          if (5 == var2) {
                            q.a(true);
                            break L2;
                          } else {
                            if (var2 == 6) {
                              pj.e((byte) 117);
                              break L2;
                            } else {
                              if ((var2 ^ -1) == -8) {
                                this.k(924);
                                break L2;
                              } else {
                                if (8 == var2) {
                                  kf.a((ni) (Object) ae.field_a, -3, pd.field_l, fg.field_q);
                                  break L2;
                                } else {
                                  if (16 != var2) {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (var2 == 12) {
                                          break L3;
                                        } else {
                                          if (13 == var2) {
                                            ib.b(-118);
                                            break L2;
                                          } else {
                                            if (-18 != (var2 ^ -1)) {
                                              if ((var2 ^ -1) == -19) {
                                                ha.a(-17288);
                                                break L2;
                                              } else {
                                                ud.a("MGS1: " + ak.a(true), (Throwable) null, 0);
                                                k.c(-28354);
                                                break L2;
                                              }
                                            } else {
                                              this.e((byte) -70);
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if (12 != var2) {
                                        stackOut_29_0 = 0;
                                        stackIn_30_0 = stackOut_29_0;
                                        break L4;
                                      } else {
                                        stackOut_28_0 = 1;
                                        stackIn_30_0 = stackOut_28_0;
                                        break L4;
                                      }
                                    }
                                    var3 = sg.a(stackIn_30_0 != 0, param0 ^ -113);
                                    lg.a(var3, param0 + 12);
                                    break L2;
                                  } else {
                                    pi.c((byte) 15);
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      bd.o(param0 + -24009);
                      break L2;
                    }
                  }
                }
                return;
              }
            } else {
              break L1;
            }
          }
        }
        ud.a("MGS2: " + ak.a(true), (Throwable) null, 0);
        k.c(-28354);
    }

    final void f(byte param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        L0: {
          var3 = fleas.field_A ? 1 : 0;
          if (!nl.a(-118)) {
            if (-11 < (ib.field_k ^ -1)) {
              break L0;
            } else {
              if (!wh.b(27415)) {
                lk.a((byte) 35);
                break L0;
              } else {
                if (0 == bh.field_t) {
                  int discarded$63 = this.a(false, 0, false);
                  break L0;
                } else {
                  te.b(0, al.field_f);
                  break L0;
                }
              }
            }
          } else {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (rh.field_p == null) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            int discarded$64 = this.a(stackIn_4_1 != 0, 0, false);
            break L0;
          }
        }
        var2 = 114 / ((-58 - param0) / 63);
    }

    private final void k(int param0) {
        if (param0 != 924) {
            field_w = null;
        }
        String var2 = ta.f(-15040);
        cb.a(50, var2, rl.a((byte) -99));
    }

    private final void e(byte param0) {
        if (param0 != -70) {
            ((wb) this).field_v = false;
        }
        int var2 = ae.field_a.e(false);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + pd.field_l;
        byte[] var5 = new byte[var4];
        ae.field_a.a(111, var4, 0, var5);
        me.a(rl.a((byte) -116), param0 ^ 110, ab.a(0, var5), var3 != 0);
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        this.a(false, -126);
        if (!(!param1)) {
            this.c((byte) -114);
        }
        if (!(!param3)) {
            this.d((byte) -68);
        }
        if (param4 > -24) {
            this.d((byte) -119);
        }
        if (param2) {
            this.e(91);
        }
        if (!(!param0)) {
            this.f(12405);
        }
    }

    private final void a(int param0, int param1, boolean param2, String param3, int param4) {
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
          if (!((wb) this).b(true)) {
            return;
          } else {
            L0: {
              L1: {
                ((wb) this).field_n = ((wb) this).getCodeBase().getHost();
                var6_ref = ((wb) this).field_n.toLowerCase();
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
              ((wb) this).field_s = stackIn_8_1 != 0;
              ((wb) this).field_u = Integer.parseInt(((wb) this).getParameter("gameport1"));
              ((wb) this).field_p = Integer.parseInt(((wb) this).getParameter("gameport2"));
              var7 = ((wb) this).getParameter("servernum");
              if (var7 == null) {
                break L2;
              } else {
                ((wb) this).field_r = Integer.parseInt(var7);
                break L2;
              }
            }
            L3: {
              ((wb) this).field_l = Integer.parseInt(((wb) this).getParameter("gamecrc"));
              ((wb) this).field_x = Long.parseLong(((wb) this).getParameter("instanceid"));
              ((wb) this).field_o = ((wb) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((wb) this).getParameter("lang");
              if (var8 == null) {
                break L3;
              } else {
                ((wb) this).field_m = Integer.parseInt(var8);
                break L3;
              }
            }
            L4: {
              if (-6 >= (((wb) this).field_m ^ -1)) {
                ((wb) this).field_m = 0;
                break L4;
              } else {
                break L4;
              }
            }
            if (!param2) {
              L5: {
                var9 = ((wb) this).getParameter("affid");
                if (var9 == null) {
                  break L5;
                } else {
                  ((wb) this).field_k = Integer.parseInt(var9);
                  break L5;
                }
              }
              tg.field_j = Boolean.valueOf(((wb) this).getParameter("simplemode")).booleanValue();
              ((wb) this).a(param4, param1, param0, ((wb) this).field_l, param3, 32, 3);
            } else {
              return;
            }
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        ud.a((String) null, (Throwable) (Object) var6, 0);
        ((wb) this).a(-6469, "crash");
    }

    private final void d(byte param0) {
        ui.field_mb[2] = true;
        if (param0 > -44) {
            field_y = -117;
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((wb) this).setBackground(java.awt.Color.black);
        cg.field_y = ((wb) this).field_m;
        ek.a(10, cg.field_y);
        wc.a(22986, param2, cg.field_y, param3, fg.field_q, ((wb) this).field_p, ((wb) this).field_n, ((wb) this).field_o, ((wb) this).field_u, 5000, ((wb) this).field_r, ((wb) this).field_x, 5000, ((wb) this).field_l);
        rh.a(cg.field_y, ((wb) this).field_r, 8737, param2, ((wb) this).field_u, ((wb) this).field_n, ((wb) this).field_p, ((wb) this).field_l, fg.field_q);
        vg.b((byte) 32);
        ui.field_pb = of.a(-21814);
        aj.a(0, ol.field_e);
        bm.field_M = param5;
        ll.field_s = param1;
        df.field_a = param0;
        if (param6 != 8) {
            field_w = null;
        }
        ki.field_d = param4;
        lh.field_f = param7;
        this.j(90);
        ia.b(true);
    }

    private final void c(byte param0) {
        if (param0 >= -55) {
            ((wb) this).field_r = 94;
        }
        ui.field_mb[1] = true;
    }

    final int e(boolean param0) {
        if (param0) {
            return -52;
        }
        int var2 = this.h(5000);
        if (0 != var2) {
            // if_icmpeq L31
        } else {
            if (!(!ui.field_mb[1])) {
                ik.a(2, (byte) 110);
            }
            if (!(!ui.field_mb[2])) {
                pb.a(3, 0);
            }
            if (!(!ui.field_mb[3])) {
                wd.a(-29250, 4);
            }
            if (!(!ui.field_mb[4])) {
                td.a(5, -1115925337);
            }
            if (ui.field_mb[5]) {
                pg.a(-68, 6);
            }
            if (!(!ui.field_mb[6])) {
                ml.a(7, 960240129);
            }
            if (ui.field_mb[8]) {
                ge.a(119);
            }
        }
        return var2;
    }

    private final void e(int param0) {
        int var2 = -17 / ((param0 - -78) / 43);
        ui.field_mb[4] = true;
    }

    private final void a(boolean param0, int param1) {
        ui.field_mb[3] = true;
        if (param1 > -52) {
            return;
        }
        ui.field_mb[18] = true;
        ui.field_mb[8] = param0;
        ui.field_mb[7] = true;
        ui.field_mb[17] = true;
        ui.field_mb[16] = true;
        ui.field_mb[0] = true;
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
            ni var12 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = fleas.field_A ? 1 : 0;
                        var4 = mg.a(param0, cg.field_y, 10, al.field_f);
                        if (var4 != 0) {
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
                        if (var4 == 1) {
                            statePc = 4;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5_int = tg.a(ol.a(-125), param1 ^ 0, fc.d(64));
                        if (var5_int != -1) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        fk.a(fh.field_a, var5_int, false, tc.field_e);
                        tc.field_e = null;
                        fh.field_a = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var11 = mf.a(true);
                        if (var11 != null) {
                            statePc = 9;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        ta.a(var11.booleanValue(), 105);
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (var4 != 2) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        var5_int = j.a(((wb) this).field_k, b.a(param1 ^ 14638), lc.f(0), ti.a((byte) -8), (byte) -116, vi.b((byte) -55), uj.a(param1 + -2477));
                        if (-1 != var5_int) {
                            statePc = 13;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        oc.a(false, tc.field_e, var5_int, fh.field_a);
                        tc.field_e = null;
                        fh.field_a = null;
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
                        if (0 == oa.field_j) {
                            statePc = 20;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (0 != oa.field_j) {
                            statePc = 19;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        oa.field_j = -1;
                        vh.a(0);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (param2) {
                            statePc = 25;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var5_int = rb.a(((wb) this).field_s, lc.f(0), false, vi.b((byte) -55), ((wb) this).field_k, -99);
                        if ((var5_int ^ -1) == 0) {
                            statePc = 26;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (0 != var5_int) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        of.field_c = aj.field_w;
                        ii.a((byte) -88);
                        ci.field_f = false;
                        bh.field_t = 10;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 24: {
                        rl.a(fh.field_a, var5_int, 110);
                        fh.field_a = null;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 25: {
                        rj.field_j = false;
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        if (var4 == -5) {
                            statePc = 28;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        if (!va.field_m) {
                            statePc = 30;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        hi.a((byte) -38, rl.a((byte) -113));
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 30: {
                        bh.field_t = 10;
                        ci.field_f = true;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (-6 == var4) {
                            statePc = 33;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        hf.a(rl.a((byte) -99), -60);
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
                        if (param1 == 0) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        wb.i(-102);
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (var4 == 6) {
                            statePc = 38;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        if (!tb.field_c) {
                            statePc = 40;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 39: {
                        bh.field_t = 10;
                        statePc = 40;
                        continue stateLoop;
                    }
                    case 40: {
                        if (var4 == -8) {
                            statePc = 42;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    }
                    case 42: {
                        ha.a(rl.a((byte) -105), 7152);
                        statePc = 43;
                        continue stateLoop;
                    }
                    case 43: {
                        if (8 != var4) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        hi.a((byte) -38, rl.a((byte) -94));
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (-10 == var4) {
                            statePc = 47;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 47: {
                        al.a(-75, rl.a((byte) -106));
                        statePc = 48;
                        continue stateLoop;
                    }
                    case 48: {
                        if (-11 != (var4 ^ -1)) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        ud.field_b.e(8, 17);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if (11 != var4) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        df.a(rl.a((byte) -88), 10245);
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        if (12 != var4) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        qg.a(qh.i(-114), rl.a((byte) -56), 0);
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (var4 == 13) {
                            statePc = 56;
                        } else {
                            statePc = 67;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        try {
                            if (lh.field_g == null) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            lh.field_g = new sk(fg.field_q, new java.net.URL(((wb) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (lh.field_g.c((byte) 79)) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var12 = lh.field_g.a(param1 + 86);
                            if (var12 != null) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var9 = null;
                            w.a(61, (String) null);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var7 = pg.a(var12.field_i, 0, var12.field_k, 0);
                            w.a(61, var7);
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            lh.field_g = null;
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 66;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        var5 = (Exception) (Object) caughtException;
                        ud.a("S1", (Throwable) (Object) var5, 0);
                        var10 = null;
                        w.a(61, (String) null);
                        lh.field_g = null;
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        if (-16 == var4) {
                            statePc = 69;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        bh.field_t = 10;
                        statePc = 70;
                        continue stateLoop;
                    }
                    case 70: {
                        if (16 != var4) {
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
                        if (-18 != var4) {
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

    private final void f(int param0) {
        if (param0 != 12405) {
            ((wb) this).field_s = false;
        }
        ui.field_mb[5] = true;
    }

    final int a(byte param0, boolean param1) {
        if (param0 > -53) {
            return -128;
        }
        return this.a(param1, 0, true);
    }

    public static void i(int param0) {
        field_q = null;
        field_t = null;
        field_w = null;
        if (param0 != -1) {
            wb.a(-80, -9, 33, (byte) 20, 49, 5, 89, -70);
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        int var9 = 0;
        L0: {
          var9 = fleas.field_A ? 1 : 0;
          if (param3 == -39) {
            break L0;
          } else {
            wb.a(-108, 18, 34, (byte) -127, -110, -18, 7, 121);
            break L0;
          }
        }
        L1: {
          if (param5 >= param1) {
            if (param5 < param2) {
              rl.a(param7, param1, gb.field_a, param0, param5, param4, param6, param2, (byte) -115);
              break L1;
            } else {
              if (param2 > param1) {
                rl.a(param7, param1, gb.field_a, param6, param2, param4, param0, param5, (byte) -115);
                break L1;
              } else {
                rl.a(param0, param2, gb.field_a, param6, param1, param4, param7, param5, (byte) -115);
                break L1;
              }
            }
          } else {
            if (param2 <= param1) {
              if (param2 <= param5) {
                rl.a(param0, param2, gb.field_a, param7, param5, param4, param6, param1, (byte) -115);
                break L1;
              } else {
                rl.a(param6, param5, gb.field_a, param7, param2, param4, param0, param1, (byte) -115);
                break L1;
              }
            } else {
              rl.a(param6, param5, gb.field_a, param0, param1, param4, param7, param2, (byte) -115);
              break L1;
            }
          }
        }
    }

    protected wb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = 10;
        field_q = new ed();
        field_w = "OVER <%0>";
    }
}
