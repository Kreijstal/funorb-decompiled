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
            if ((param0 ^ -1) != -52) {
              break L2;
            } else {
              return 2;
            }
          }
        }
        L3: {
          if (-3 < (td.field_k.field_c ^ -1)) {
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
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        int stackIn_134_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
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
                if ((var3 ^ -1) <= (td.a(true) ^ -1)) {
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
              if ((oa.field_j ^ -1) == -1) {
                break L8;
              } else {
                break L7;
              }
            }
          }
          L9: {
            if (0 != (oa.field_j ^ -1)) {
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
            oa.field_j = ld.a(82);
            if (var3 == 0) {
              break L10;
            } else {
              if (oa.field_j == 0) {
                if (-12 != (bh.field_t ^ -1)) {
                  break L10;
                } else {
                  if (lk.i(10)) {
                    break L10;
                  } else {
                    ii.a((byte) -88);
                    break L10;
                  }
                }
              } else {
                break L10;
              }
            }
          }
          if ((oa.field_j ^ -1) == 0) {
            break L7;
          } else {
            if (-1 == (oa.field_j ^ -1)) {
              break L7;
            } else {
              ua.field_sb = 15000L + lj.a((byte) -125);
              break L7;
            }
          }
        }
        L11: {
          if (-1 == oa.field_j) {
            break L11;
          } else {
            if (-1 != (oa.field_j ^ -1)) {
              if ((ib.field_k ^ -1) <= -11) {
                if (-11 < (bh.field_t ^ -1)) {
                  break L11;
                } else {
                  L12: {
                    id.a(false);
                    if (3 != oa.field_j) {
                      if (oa.field_j != 4) {
                        if (-3 != (oa.field_j ^ -1)) {
                          if (-6 == (oa.field_j ^ -1)) {
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
                if (-4 != (oa.field_j ^ -1)) {
                  if (-5 == (oa.field_j ^ -1)) {
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
            L15: {
              if (0 == (oa.field_j ^ -1)) {
                break L15;
              } else {
                if (-1 != (oa.field_j ^ -1)) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (!lk.i(10)) {
              break L13;
            } else {
              break L14;
            }
          }
          if ((ua.field_sb ^ -1L) < (lj.a((byte) -47) ^ -1L)) {
            break L13;
          } else {
            rj.field_j = false;
            if ((oa.field_j ^ -1) == 0) {
              break L13;
            } else {
              if ((oa.field_j ^ -1) != -1) {
                oa.field_j = -1;
                vh.a(0);
                break L13;
              } else {
                break L13;
              }
            }
          }
        }
        L16: {
          if (0 != oa.field_j) {
            break L16;
          } else {
            if (lk.i(10)) {
              break L16;
            } else {
              rj.field_m = false;
              break L16;
            }
          }
        }
        L17: {
          if (-1 != (ib.field_k ^ -1)) {
            break L17;
          } else {
            if (gd.a((byte) 70)) {
              ib.field_k = 1;
              break L17;
            } else {
              break L17;
            }
          }
        }
        L18: {
          if (ib.field_k != 1) {
            break L18;
          } else {
            L19: {
              if (-1 == (cg.field_y ^ -1)) {
                break L19;
              } else {
                il.field_a = q.a(8192, df.field_a);
                break L19;
              }
            }
            rl.field_d = uh.a(1, 26, false, true, ki.field_d);
            oa.field_l = uh.a(1, 26, false, true, bm.field_M);
            kc.field_d = uh.a(1, 26, false, true, lh.field_f);
            pf.field_b = oa.field_l;
            ib.field_k = 2;
            a.field_a = rl.field_d;
            break L18;
          }
        }
        L20: {
          if (ib.field_k != 2) {
            break L20;
          } else {
            L21: {
              if (il.field_a != null) {
                if (!il.field_a.b((byte) -109)) {
                  break L21;
                } else {
                  if (!il.field_a.b("", 37)) {
                    il.field_a = null;
                    break L21;
                  } else {
                    if (!il.field_a.a("", -123)) {
                      break L21;
                    } else {
                      je.a(il.field_a, -30);
                      il.field_a = null;
                      fleas.h((byte) 76);
                      break L21;
                    }
                  }
                }
              } else {
                break L21;
              }
            }
            if (null != il.field_a) {
              break L20;
            } else {
              ib.field_k = 3;
              break L20;
            }
          }
        }
        L22: {
          if ((ib.field_k ^ -1) == -4) {
            if (!pl.a(rl.field_d, oa.field_l, kc.field_d, true)) {
              break L22;
            } else {
              if (!rl.a(kc.field_d, 0)) {
                break L22;
              } else {
                L23: {
                  L24: {
                    l.a((byte) -56);
                    sd.a((byte) -63);
                    qj.field_I = jg.field_a;
                    tb.field_c = false;
                    oh.a(kc.field_d, oa.field_l, va.field_m, (byte) 28, rl.field_d);
                    if (of.field_i) {
                      break L24;
                    } else {
                      if (null != hc.field_d) {
                        break L24;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L25: {
                    if (of.field_i) {
                      stackOut_99_0 = 0;
                      stackIn_100_0 = stackOut_99_0;
                      break L25;
                    } else {
                      stackOut_98_0 = 1;
                      stackIn_100_0 = stackOut_98_0;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_100_0 = stackIn_100_0;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_101_0 = stackOut_100_0;
                    if (of.field_i) {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      break L26;
                    } else {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      break L26;
                    }
                  }
                  fl.a(stackIn_103_0 != 0, stackIn_103_1 != 0, hc.field_d, -22175);
                  break L23;
                }
                L27: {
                  if (tg.field_j) {
                    ak.a(38);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (null == td.field_g) {
                    td.field_g = wc.a((byte) -95);
                    u.field_a = rk.e(24089);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                kb.a(-1, td.field_g, kc.field_d, u.field_a);
                rl.field_d = null;
                oa.field_l = null;
                kc.field_d = null;
                bh.a(false, (java.applet.Applet) this);
                fleas.h((byte) -127);
                ib.field_k = 10;
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L29: {
          if (10 == ib.field_k) {
            L30: {
              if (cg.field_y != 0) {
                ne.field_a = q.a(8192, ll.field_s);
                break L30;
              } else {
                break L30;
              }
            }
            ib.field_k = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if (-12 == (ib.field_k ^ -1)) {
            L32: {
              if (null == ne.field_a) {
                break L32;
              } else {
                L33: {
                  if (!ne.field_a.b((byte) -113)) {
                    break L33;
                  } else {
                    if (ne.field_a.a(-18)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                jj.a(0.0f, cb.a(sg.field_a, mk.field_a, ne.field_a, (byte) 13), true);
                break L31;
              }
            }
            d.field_Q = true;
            ib.field_k = 12;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if ((ib.field_k ^ -1) == -13) {
            if (d.field_Q) {
              break L34;
            } else {
              ib.field_k = 13;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (ib.field_k != 13) {
            break L35;
          } else {
            L36: {
              var3 = 1;
              if (fc.field_c == null) {
                break L36;
              } else {
                L37: {
                  if (!fc.field_c.c(0)) {
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
                jj.a(fc.field_c.field_k, fc.field_c.field_f, true);
                break L36;
              }
            }
            if (var3 == 0) {
              break L35;
            } else {
              ib.field_k = 20;
              break L35;
            }
          }
        }
        L38: {
          if (param0) {
            break L38;
          } else {
            if (!h.field_h) {
              break L38;
            } else {
              lh.a((byte) -69, ol.field_e);
              ((wb) this).c(122);
              aj.a(0, ol.field_e);
              break L38;
            }
          }
        }
        L39: {
          if (!ui.field_mb[8]) {
            break L39;
          } else {
            bj.e((byte) -41);
            break L39;
          }
        }
    }

    private final int h(int param0) {
        int var2 = 0;
        Object var3 = null;
        if (!((wb) this).field_i) {
          if (!lk.i(10)) {
            return -1;
          } else {
            L0: {
              if (param0 == 5000) {
                break L0;
              } else {
                var3 = null;
                ((wb) this).a(102, 69, (String) null);
                break L0;
              }
            }
            if (rj.field_j) {
              return -1;
            } else {
              var2 = rb.a(((wb) this).field_s, lc.f(0), true, vi.b((byte) -55), ((wb) this).field_k, -107);
              if (-1 != var2) {
                L1: {
                  if (var2 == 0) {
                    break L1;
                  } else {
                    if (-2 == (var2 ^ -1)) {
                      break L1;
                    } else {
                      L2: {
                        if (lj.field_e) {
                          break L2;
                        } else {
                          ((wb) this).a(-6469, "reconnect");
                          break L2;
                        }
                      }
                      id.a(false);
                      rl.a(fh.field_a, var2, param0 ^ 5115);
                      rj.field_j = true;
                      ua.field_sb = lj.a((byte) -53) - -15000L;
                      return var2;
                    }
                  }
                }
                L3: {
                  if (11 != bh.field_t) {
                    break L3;
                  } else {
                    if (0 == oa.field_j) {
                      ii.a((byte) -88);
                      break L3;
                    } else {
                      break L3;
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
              if ((var2 ^ -1) == -1) {
                return;
              } else {
                L2: {
                  if (-2 == (var2 ^ -1)) {
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
          L0: {
            if (!((wb) this).b(true)) {
              return;
            } else {
              L1: {
                L2: {
                  ((wb) this).field_n = ((wb) this).getCodeBase().getHost();
                  var6_ref = ((wb) this).field_n.toLowerCase();
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var6_ref.equals((Object) (Object) "jagex.com")) {
                    break L2;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (!var6_ref.endsWith(".jagex.com")) {
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
                ((wb) this).field_s = stackIn_8_1 != 0;
                ((wb) this).field_u = Integer.parseInt(((wb) this).getParameter("gameport1"));
                ((wb) this).field_p = Integer.parseInt(((wb) this).getParameter("gameport2"));
                var7 = ((wb) this).getParameter("servernum");
                if (var7 == null) {
                  break L3;
                } else {
                  ((wb) this).field_r = Integer.parseInt(var7);
                  break L3;
                }
              }
              L4: {
                ((wb) this).field_l = Integer.parseInt(((wb) this).getParameter("gamecrc"));
                ((wb) this).field_x = Long.parseLong(((wb) this).getParameter("instanceid"));
                ((wb) this).field_o = ((wb) this).getParameter("member").equals((Object) (Object) "yes");
                var8 = ((wb) this).getParameter("lang");
                if (var8 == null) {
                  break L4;
                } else {
                  ((wb) this).field_m = Integer.parseInt(var8);
                  break L4;
                }
              }
              L5: {
                if (-6 >= (((wb) this).field_m ^ -1)) {
                  ((wb) this).field_m = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              if (!param2) {
                L6: {
                  var9 = ((wb) this).getParameter("affid");
                  if (var9 == null) {
                    break L6;
                  } else {
                    ((wb) this).field_k = Integer.parseInt(var9);
                    break L6;
                  }
                }
                tg.field_j = Boolean.valueOf(((wb) this).getParameter("simplemode")).booleanValue();
                ((wb) this).a(param4, param1, param0, ((wb) this).field_l, param3, 32, 3);
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
            var10 = null;
            ud.a((String) null, (Throwable) (Object) var6, 0);
            ((wb) this).a(-6469, "crash");
            break L7;
          }
        }
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
        int var2 = 0;
        if (!param0) {
          L0: {
            L1: {
              var2 = this.h(5000);
              if (0 == var2) {
                break L1;
              } else {
                if (-2 == (var2 ^ -1)) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              if (ui.field_mb[1]) {
                ik.a(2, (byte) 110);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (ui.field_mb[2]) {
                pb.a(3, 0);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (ui.field_mb[3]) {
                wd.a(-29250, 4);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (ui.field_mb[4]) {
                td.a(5, -1115925337);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (!ui.field_mb[5]) {
                break L6;
              } else {
                pg.a(-68, 6);
                break L6;
              }
            }
            L7: {
              if (ui.field_mb[6]) {
                ml.a(7, 960240129);
                break L7;
              } else {
                break L7;
              }
            }
            if (!ui.field_mb[8]) {
              break L0;
            } else {
              ge.a(119);
              break L0;
            }
          }
          return var2;
        } else {
          return -52;
        }
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
            var8 = fleas.field_A ? 1 : 0;
            var4 = mg.a(param0, cg.field_y, 10, al.field_f);
            if ((var4 ^ -1) != -1) {
              L0: {
                if (var4 == 1) {
                  L1: {
                    var5_int = tg.a(ol.a(-125), param1 ^ 0, fc.d(64));
                    if (var5_int != -1) {
                      fk.a(fh.field_a, var5_int, false, tc.field_e);
                      tc.field_e = null;
                      fh.field_a = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var11 = mf.a(true);
                  if (var11 != null) {
                    ta.a(var11.booleanValue(), 105);
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
                  var5_int = j.a(((wb) this).field_k, b.a(param1 ^ 14638), lc.f(0), ti.a((byte) -8), (byte) -116, vi.b((byte) -55), uj.a(param1 + -2477));
                  if (-1 != var5_int) {
                    oc.a(false, tc.field_e, var5_int, fh.field_a);
                    tc.field_e = null;
                    fh.field_a = null;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (-4 == (var4 ^ -1)) {
                  L4: {
                    if (0 == (oa.field_j ^ -1)) {
                      break L4;
                    } else {
                      if (0 != oa.field_j) {
                        oa.field_j = -1;
                        vh.a(0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param2) {
                    rj.field_j = false;
                    break L3;
                  } else {
                    var5_int = rb.a(((wb) this).field_s, lc.f(0), false, vi.b((byte) -55), ((wb) this).field_k, -99);
                    if ((var5_int ^ -1) == 0) {
                      break L3;
                    } else {
                      if (0 != var5_int) {
                        rl.a(fh.field_a, var5_int, 110);
                        fh.field_a = null;
                        break L3;
                      } else {
                        of.field_c = aj.field_w;
                        ii.a((byte) -88);
                        ci.field_f = false;
                        bh.field_t = 10;
                        break L3;
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if ((var4 ^ -1) == -5) {
                  if (!va.field_m) {
                    bh.field_t = 10;
                    ci.field_f = true;
                    break L5;
                  } else {
                    hi.a((byte) -38, rl.a((byte) -113));
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (-6 == (var4 ^ -1)) {
                  hf.a(rl.a((byte) -99), -60);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (param1 == 0) {
                  break L7;
                } else {
                  wb.i(-102);
                  break L7;
                }
              }
              L8: {
                if (var4 == 6) {
                  if (!tb.field_c) {
                    break L8;
                  } else {
                    bh.field_t = 10;
                    break L8;
                  }
                } else {
                  break L8;
                }
              }
              L9: {
                if ((var4 ^ -1) == -8) {
                  ha.a(rl.a((byte) -105), 7152);
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (8 != var4) {
                  break L10;
                } else {
                  hi.a((byte) -38, rl.a((byte) -94));
                  break L10;
                }
              }
              L11: {
                if (-10 == (var4 ^ -1)) {
                  al.a(-75, rl.a((byte) -106));
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (-11 != (var4 ^ -1)) {
                  break L12;
                } else {
                  ud.field_b.e(8, 17);
                  break L12;
                }
              }
              L13: {
                if (11 != var4) {
                  break L13;
                } else {
                  df.a(rl.a((byte) -88), 10245);
                  break L13;
                }
              }
              L14: {
                if (12 != var4) {
                  break L14;
                } else {
                  qg.a(qh.i(-114), rl.a((byte) -56), 0);
                  break L14;
                }
              }
              L15: {
                if (var4 == 13) {
                  try {
                    L16: {
                      L17: {
                        if (lh.field_g == null) {
                          lh.field_g = new sk(fg.field_q, new java.net.URL(((wb) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                      L18: {
                        if (lh.field_g.c((byte) 79)) {
                          L19: {
                            var12 = lh.field_g.a(param1 + 86);
                            if (var12 != null) {
                              var7 = pg.a(var12.field_i, 0, var12.field_k, 0);
                              w.a(61, var7);
                              break L19;
                            } else {
                              var9 = null;
                              w.a(61, (String) null);
                              break L19;
                            }
                          }
                          lh.field_g = null;
                          break L18;
                        } else {
                          break L18;
                        }
                      }
                      break L16;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L20: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      ud.a("S1", (Throwable) (Object) var5, 0);
                      var10 = null;
                      w.a(61, (String) null);
                      lh.field_g = null;
                      break L20;
                    }
                  }
                  break L15;
                } else {
                  break L15;
                }
              }
              L21: {
                if (-16 == (var4 ^ -1)) {
                  bh.field_t = 10;
                  break L21;
                } else {
                  break L21;
                }
              }
              if (16 != var4) {
                if (-18 != (var4 ^ -1)) {
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
