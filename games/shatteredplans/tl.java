/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tl extends kf {
    static int field_D;
    static boolean field_u;
    private boolean field_w;
    private int field_x;
    String field_s;
    private int field_v;
    static char[] field_p;
    private int field_r;
    static String field_z;
    private int field_q;
    static String field_o;
    private long field_t;
    private int field_B;
    private boolean field_C;
    private int field_A;
    private boolean field_y;

    private final void h(int param0) {
        ud.field_c[4] = true;
        if (param0 != 3) {
            field_D = -48;
        }
    }

    private final void d(byte param0) {
        ud.field_c[11] = true;
        ud.field_c[12] = true;
        if (param0 > -8) {
            this.j((byte) 51);
        }
        ud.field_c[13] = true;
    }

    final void a(String param0, int param1, byte param2) {
        try {
            this.a(480, param1, -85, param0, 640);
            int var4_int = -28 % ((57 - param2) / 47);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "tl.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(boolean param0, int param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
            Boolean var11 = null;
            ob var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = ShatteredPlansClient.field_F ? 1 : 0;
            var4 = sr.a(so.field_o, (byte) 0, param2, ai.field_e);
            if (0 != var4) {
              L0: {
                if (var4 == param1) {
                  L1: {
                    var5_int = wi.a(sl.j((byte) 64), of.a(64), 0);
                    if ((var5_int ^ -1) != 0) {
                      wo.a(var5_int, (byte) -88, ae.field_e, nl.field_c);
                      ae.field_e = null;
                      nl.field_c = null;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var11 = fr.j(0);
                  if (var11 != null) {
                    bs.a(var11.booleanValue(), (byte) 72);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  break L0;
                }
              }
              L2: {
                if ((var4 ^ -1) != -3) {
                  break L2;
                } else {
                  var5_int = sr.a(bh.d(-97), this.field_B, (byte) -42, ob.g((byte) -24), vj.i(-100), of.a((byte) 42), aq.a(11));
                  if ((var5_int ^ -1) == 0) {
                    break L2;
                  } else {
                    va.a(ae.field_e, (byte) -113, var5_int, nl.field_c);
                    ae.field_e = null;
                    nl.field_c = null;
                    break L2;
                  }
                }
              }
              L3: {
                if (3 != var4) {
                  break L3;
                } else {
                  L4: {
                    if (0 == (qj.field_g ^ -1)) {
                      break L4;
                    } else {
                      if (qj.field_g != 0) {
                        qj.field_g = -1;
                        ea.a(116);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (param0) {
                    md.field_B = false;
                    break L3;
                  } else {
                    var5_int = ui.a(this.field_B, (byte) -121, false, vj.i(-116), this.field_C, bh.d(-121));
                    if (var5_int != -1) {
                      if (-1 != (var5_int ^ -1)) {
                        bf.a((byte) -127, var5_int, nl.field_c);
                        nl.field_c = null;
                        break L3;
                      } else {
                        co.field_o = pd.field_l;
                        rq.c(98);
                        eh.field_P = false;
                        gm.field_i = 10;
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
              }
              L5: {
                if (var4 == 4) {
                  if (!db.field_b) {
                    gm.field_i = 10;
                    eh.field_P = true;
                    break L5;
                  } else {
                    oj.a(0, kq.f((byte) 127));
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (5 == var4) {
                  da.a(param1 + 0, kq.f((byte) 126));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 == 6) {
                  if (or.field_a) {
                    gm.field_i = 10;
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              L8: {
                if ((var4 ^ -1) != -8) {
                  break L8;
                } else {
                  id.a(kq.f((byte) 127), (byte) -119);
                  break L8;
                }
              }
              L9: {
                if (8 != var4) {
                  break L9;
                } else {
                  oj.a(param1 ^ 1, kq.f((byte) 126));
                  break L9;
                }
              }
              L10: {
                if (9 != var4) {
                  break L10;
                } else {
                  de.a(115, kq.f((byte) 125));
                  break L10;
                }
              }
              L11: {
                if (10 != var4) {
                  break L11;
                } else {
                  js.field_f.h(17, 255);
                  break L11;
                }
              }
              L12: {
                if ((var4 ^ -1) != -12) {
                  break L12;
                } else {
                  hr.a(kq.f((byte) 126), (byte) -105);
                  break L12;
                }
              }
              L13: {
                if (var4 == 12) {
                  sl.a(ui.c(false), kq.f((byte) 126), (byte) 88);
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                if ((var4 ^ -1) != -14) {
                  break L14;
                } else {
                  try {
                    L15: {
                      L16: {
                        if (va.field_g != null) {
                          break L16;
                        } else {
                          va.field_g = new r(fa.field_W, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (!va.field_g.b(10000)) {
                          break L17;
                        } else {
                          L18: {
                            var12 = va.field_g.a(true);
                            if (var12 == null) {
                              var9 = (String) null;
                              aa.a((String) null, true);
                              break L18;
                            } else {
                              var7 = qi.a(var12.field_h, var12.field_j, 0, param1 ^ -128);
                              aa.a(var7, true);
                              break L18;
                            }
                          }
                          va.field_g = null;
                          break L17;
                        }
                      }
                      break L15;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L19: {
                      var5 = (Exception) (Object) decompiledCaughtException;
                      jq.a(-29901, (Throwable) ((Object) var5), "S1");
                      var10 = (String) null;
                      aa.a((String) null, true);
                      va.field_g = null;
                      break L19;
                    }
                  }
                  break L14;
                }
              }
              L20: {
                if (15 == var4) {
                  gm.field_i = 10;
                  break L20;
                } else {
                  break L20;
                }
              }
              if ((var4 ^ -1) == -17) {
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

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        if (param0 != 256) {
            this.e((byte) -62);
        }
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        ai.field_e = this.field_v;
        dm.a(0, ai.field_e);
        jq.a(0, fa.field_W, 5000, this.field_q, 5000, this.field_x, param4, param3, this.field_w, ai.field_e, this.field_r, this.field_A, this.field_s, this.field_t);
        ti.a(param3, this.field_q, this.field_r, this.field_A, ai.field_e, 1491341222, fa.field_W, this.field_s, this.field_x);
        lm.a((byte) 100);
        aj.field_b = cg.e(true);
        re.a(tm.field_i, false);
        jj.field_k = param2;
        ai.field_a = param5;
        jc.field_p = param1;
        tp.field_j = param6;
        lo.field_B = param7;
        this.l((byte) 64);
        qj.b((byte) -120);
    }

    private final void g(byte param0) {
        ud.field_c[1] = true;
        if (param0 > -81) {
            this.d((byte) -17);
        }
    }

    final void e(byte param0) {
        int var2 = 0;
        nf var3 = null;
        int var4 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var4 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = ej.field_e;
          if (param0 <= -55) {
            break L0;
          } else {
            this.b(-69, true);
            break L0;
          }
        }
        L1: {
          if (-65 >= (var2 ^ -1)) {
            break L1;
          } else {
            if (ud.field_c[var2]) {
              if (var2 == 0) {
                return;
              } else {
                L2: {
                  if (1 != var2) {
                    if (-3 != (var2 ^ -1)) {
                      if (var2 == 3) {
                        lr.a(105);
                        break L2;
                      } else {
                        if (4 == var2) {
                          ej.d(-523);
                          break L2;
                        } else {
                          if ((var2 ^ -1) != -6) {
                            if (var2 == 6) {
                              r.a((byte) 67);
                              break L2;
                            } else {
                              if (var2 == 7) {
                                this.b(false);
                                break L2;
                              } else {
                                if (var2 == 8) {
                                  vq.a(sa.field_a, fa.field_W, rr.field_t, -3);
                                  break L2;
                                } else {
                                  if (-17 != (var2 ^ -1)) {
                                    L3: {
                                      if (var2 == 11) {
                                        break L3;
                                      } else {
                                        if (-13 == (var2 ^ -1)) {
                                          break L3;
                                        } else {
                                          if (var2 == 13) {
                                            s.a(true);
                                            break L2;
                                          } else {
                                            if (-18 != (var2 ^ -1)) {
                                              if ((var2 ^ -1) != -19) {
                                                jq.a(-29901, (Throwable) null, "MGS1: " + w.a(16738));
                                                q.g(-107);
                                                break L2;
                                              } else {
                                                sh.a(-1);
                                                break L2;
                                              }
                                            } else {
                                              this.i(-1);
                                              break L2;
                                            }
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      if ((var2 ^ -1) != -13) {
                                        stackOut_31_0 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        break L4;
                                      } else {
                                        stackOut_30_0 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        break L4;
                                      }
                                    }
                                    var3 = sk.a(stackIn_32_0 != 0, -1);
                                    nc.a(var3, 2);
                                    break L2;
                                  } else {
                                    kb.f(-92);
                                    break L2;
                                  }
                                }
                              }
                            }
                          } else {
                            vf.d((byte) -117);
                            break L2;
                          }
                        }
                      }
                    } else {
                      ae.a((byte) 104);
                      break L2;
                    }
                  } else {
                    tl.f((byte) 24);
                    break L2;
                  }
                }
                return;
              }
            } else {
              break L1;
            }
          }
        }
        jq.a(-29901, (Throwable) null, "MGS2: " + w.a(16738));
        q.g(-127);
    }

    public static void k(int param0) {
        field_p = null;
        field_z = null;
        field_o = null;
        if (param0 > -8) {
            tl.f((byte) 43);
        }
    }

    final void a(boolean param0, boolean param1, int param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        if (param2 != -2839) {
            this.field_A = 104;
        }
        this.b(-73, true);
        if (param6) {
            this.g((byte) -111);
        }
        if (!(!param5)) {
            this.h((byte) 43);
        }
        if (param0) {
            this.h(3);
        }
        if (!(!param4)) {
            this.k((byte) -63);
        }
        if (param1) {
            this.j(-31193);
        }
        if (!(!param3)) {
            this.d((byte) -45);
        }
    }

    private final void l(byte param0) {
        ae.field_a[9] = -1;
        ae.field_a[10] = -1;
        ae.field_a[4] = -1;
        ae.field_a[1] = 16;
        ae.field_a[6] = -2;
        ae.field_a[7] = -1;
        ae.field_a[2] = -2;
        if (param0 < 62) {
            field_D = 122;
        }
        ae.field_a[5] = -1;
        ae.field_a[3] = -1;
        ae.field_a[11] = -1;
        ae.field_a[18] = 1;
        ae.field_a[16] = -1;
        ae.field_a[8] = -2;
        ae.field_a[17] = -1;
        ae.field_a[13] = -1;
        ae.field_a[12] = -1;
    }

    private final static void f(byte param0) {
        uq var1 = (uq) ((Object) mh.field_d.d(0));
        if (!(var1 != null)) {
            q.g(-110);
            return;
        }
        sl var2 = sa.field_a;
        int discarded$10 = var2.a(16711680);
        int discarded$16 = var2.a(16711680);
        if (param0 != 24) {
            tl.k(-44);
        }
        int discarded$17 = var2.a(16711680);
        int discarded$18 = var2.a(param0 + 16711656);
        var1.b((byte) -104);
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        String stackIn_105_0 = null;
        String stackIn_106_0 = null;
        String stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        String stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_108_2 = 0;
        String stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int stackIn_109_2 = 0;
        String stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int stackIn_110_3 = 0;
        int stackIn_141_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String stackOut_104_0 = null;
        String stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        String stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        String stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        int stackOut_107_2 = 0;
        String stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        int stackOut_109_3 = 0;
        String stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        int stackOut_108_3 = 0;
        int stackOut_140_0 = 0;
        int stackOut_139_0 = 0;
        L0: {
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          if (bh.field_p != null) {
            L1: {
              if (null == bj.field_K) {
                var6 = nr.a(76);
                var4 = var6.getSize();
                bh.field_p.a(var4.width, var4.height, -28);
                break L1;
              } else {
                break L1;
              }
            }
            bh.field_p.a(true);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          we.a((byte) -59);
          ae.b((byte) 62);
          if (uf.a(false)) {
            break L2;
          } else {
            if (gm.field_i != 11) {
              bc.c(-78);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (aj.field_b == null) {
            break L3;
          } else {
            so.field_o = aj.field_b.b(86);
            break L3;
          }
        }
        L4: {
          if (!cb.b((byte) -117)) {
            break L4;
          } else {
            L5: {
              var3 = tj.a(0) * 1200;
              if (this.field_y) {
                break L5;
              } else {
                if (var3 >= ik.a(-26918)) {
                  break L4;
                } else {
                  if (po.b(123) > var3) {
                    break L5;
                  } else {
                    break L4;
                  }
                }
              }
            }
            this.field_y = false;
            q.g(-113);
            oh.b(-11);
            bf.a((byte) -124, 2, he.field_n);
            rg.b(false);
            md.field_B = true;
            ip.field_b = 15000L + pr.a(14274);
            break L4;
          }
        }
        L6: {
          L7: {
            if (-1 == qj.field_g) {
              break L7;
            } else {
              if ((qj.field_g ^ -1) == -1) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (qj.field_g != -1) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_24_0;
            qj.field_g = u.a(-95);
            if (var3 == 0) {
              break L9;
            } else {
              if (-1 == (qj.field_g ^ -1)) {
                if (gm.field_i != 11) {
                  break L9;
                } else {
                  if (!jc.f(-11)) {
                    rq.c(86);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (qj.field_g == -1) {
            break L6;
          } else {
            if (-1 != (qj.field_g ^ -1)) {
              ip.field_b = pr.a(14274) + 15000L;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (-1 == qj.field_g) {
            break L10;
          } else {
            if (qj.field_g == 0) {
              break L10;
            } else {
              if (ma.field_p >= 10) {
                if (-11 < (gm.field_i ^ -1)) {
                  break L10;
                } else {
                  L11: {
                    oh.b(-11);
                    if (3 != qj.field_g) {
                      if (4 == qj.field_g) {
                        bf.a((byte) -124, 256, sa.field_e);
                        break L11;
                      } else {
                        if (qj.field_g == 2) {
                          bf.a((byte) -125, 256, ar.field_r);
                          break L11;
                        } else {
                          if (-6 != (qj.field_g ^ -1)) {
                            bf.a((byte) -127, 256, nr.field_n);
                            break L11;
                          } else {
                            bf.a((byte) -126, 5, ce.field_w);
                            break L11;
                          }
                        }
                      }
                    } else {
                      bf.a((byte) -126, 256, po.field_g);
                      break L11;
                    }
                  }
                  md.field_B = true;
                  break L10;
                }
              } else {
                if (3 != qj.field_g) {
                  if (4 == qj.field_g) {
                    this.a((byte) -120, "js5io");
                    break L10;
                  } else {
                    if (qj.field_g != 2) {
                      if (5 != qj.field_g) {
                        this.a((byte) -110, "js5connect");
                        break L10;
                      } else {
                        this.a((byte) -85, "outofdate");
                        break L10;
                      }
                    } else {
                      this.a((byte) 33, "js5connect_full");
                      break L10;
                    }
                  }
                } else {
                  this.a((byte) 54, "js5crc");
                  break L10;
                }
              }
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if ((qj.field_g ^ -1) == 0) {
                break L14;
              } else {
                if (-1 != (qj.field_g ^ -1)) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!jc.f(-11)) {
              break L12;
            } else {
              break L13;
            }
          }
          if ((ip.field_b ^ -1L) >= (pr.a(14274) ^ -1L)) {
            md.field_B = false;
            if (-1 == qj.field_g) {
              break L12;
            } else {
              if (qj.field_g != 0) {
                qj.field_g = -1;
                ea.a(112);
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
          if (-1 != (qj.field_g ^ -1)) {
            break L15;
          } else {
            if (jc.f(-11)) {
              break L15;
            } else {
              oi.field_f = false;
              break L15;
            }
          }
        }
        L16: {
          if (ma.field_p == 0) {
            if (mp.a(true)) {
              ma.field_p = 1;
              break L16;
            } else {
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (param1 > 1) {
            break L17;
          } else {
            this.i(-82);
            break L17;
          }
        }
        L18: {
          if (1 != ma.field_p) {
            break L18;
          } else {
            L19: {
              if (-1 != (ai.field_e ^ -1)) {
                es.field_j = io.a(ai.field_a, 124);
                break L19;
              } else {
                break L19;
              }
            }
            rq.field_g = rl.a(-1, true, 1, jc.field_p, false);
            tq.field_f = rl.a(-1, true, 1, tp.field_j, false);
            l.field_g = rl.a(-1, true, 1, jj.field_k, false);
            ma.field_p = 2;
            kl.field_s = rq.field_g;
            rl.field_f = tq.field_f;
            break L18;
          }
        }
        L20: {
          if (-3 == (ma.field_p ^ -1)) {
            L21: {
              if (null == es.field_j) {
                break L21;
              } else {
                if (es.field_j.b((byte) 122)) {
                  if (es.field_j.b("", (byte) -116)) {
                    if (es.field_j.a("", 51)) {
                      vi.a(es.field_j, true);
                      es.field_j = null;
                      u.c(126);
                      break L21;
                    } else {
                      break L21;
                    }
                  } else {
                    es.field_j = null;
                    break L21;
                  }
                } else {
                  break L21;
                }
              }
            }
            if (null != es.field_j) {
              break L20;
            } else {
              ma.field_p = 3;
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if ((ma.field_p ^ -1) == -4) {
            if (!ig.a(rq.field_g, -7526, tq.field_f, l.field_g)) {
              break L22;
            } else {
              if (uq.a(l.field_g, 0)) {
                L23: {
                  L24: {
                    qr.f(-98);
                    kq.c(28164);
                    pc.field_r = tb.field_c;
                    or.field_a = false;
                    rn.a(624, rq.field_g, db.field_b, l.field_g, tq.field_f);
                    if (go.field_D) {
                      break L24;
                    } else {
                      if (null == hr.field_b) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    stackOut_104_0 = hr.field_b;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_105_0 = stackOut_104_0;
                    if (go.field_D) {
                      stackOut_106_0 = (String) ((Object) stackIn_106_0);
                      stackOut_106_1 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      break L25;
                    } else {
                      stackOut_105_0 = (String) ((Object) stackIn_105_0);
                      stackOut_105_1 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      break L25;
                    }
                  }
                  L26: {
                    stackOut_107_0 = (String) ((Object) stackIn_107_0);
                    stackOut_107_1 = stackIn_107_1;
                    stackOut_107_2 = -70;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_109_1 = stackOut_107_1;
                    stackIn_109_2 = stackOut_107_2;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    stackIn_108_2 = stackOut_107_2;
                    if (go.field_D) {
                      stackOut_109_0 = (String) ((Object) stackIn_109_0);
                      stackOut_109_1 = stackIn_109_1;
                      stackOut_109_2 = stackIn_109_2;
                      stackOut_109_3 = 0;
                      stackIn_110_0 = stackOut_109_0;
                      stackIn_110_1 = stackOut_109_1;
                      stackIn_110_2 = stackOut_109_2;
                      stackIn_110_3 = stackOut_109_3;
                      break L26;
                    } else {
                      stackOut_108_0 = (String) ((Object) stackIn_108_0);
                      stackOut_108_1 = stackIn_108_1;
                      stackOut_108_2 = stackIn_108_2;
                      stackOut_108_3 = 1;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_110_1 = stackOut_108_1;
                      stackIn_110_2 = stackOut_108_2;
                      stackIn_110_3 = stackOut_108_3;
                      break L26;
                    }
                  }
                  jm.a(stackIn_110_0, stackIn_110_1 != 0, (byte) stackIn_110_2, stackIn_110_3 != 0);
                  break L23;
                }
                L27: {
                  if (cm.field_f) {
                    oo.a((byte) -58);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (null == ns.field_rb) {
                    ns.field_rb = ae.c(3);
                    md.field_M = ji.a(-123);
                    break L28;
                  } else {
                    break L28;
                  }
                }
                rn.a(ns.field_rb, md.field_M, 1000, l.field_g);
                tq.field_f = null;
                rq.field_g = null;
                l.field_g = null;
                we.a((java.applet.Applet) (this), 4289);
                u.c(124);
                ma.field_p = 10;
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
          if (-11 == (ma.field_p ^ -1)) {
            L30: {
              if ((ai.field_e ^ -1) == -1) {
                break L30;
              } else {
                ka.field_e = io.a(lo.field_B, 101);
                break L30;
              }
            }
            ma.field_p = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if ((ma.field_p ^ -1) != -12) {
            break L31;
          } else {
            L32: {
              if (ka.field_e == null) {
                break L32;
              } else {
                L33: {
                  if (!ka.field_e.b((byte) -88)) {
                    break L33;
                  } else {
                    if (ka.field_e.a(-1)) {
                      break L32;
                    } else {
                      break L33;
                    }
                  }
                }
                nj.a(0.0f, 2, nc.a(i.field_a, ka.field_e, -80, ns.field_xb));
                break L31;
              }
            }
            um.field_n = true;
            ma.field_p = 12;
            break L31;
          }
        }
        L34: {
          if (ma.field_p == 12) {
            if (um.field_n) {
              break L34;
            } else {
              ma.field_p = 13;
              break L34;
            }
          } else {
            break L34;
          }
        }
        L35: {
          if (-14 == (ma.field_p ^ -1)) {
            L36: {
              var3 = 1;
              if (null != hd.field_n) {
                L37: {
                  if (!hd.field_n.b(-1)) {
                    stackOut_140_0 = 0;
                    stackIn_141_0 = stackOut_140_0;
                    break L37;
                  } else {
                    stackOut_139_0 = 1;
                    stackIn_141_0 = stackOut_139_0;
                    break L37;
                  }
                }
                var3 = stackIn_141_0;
                nj.a(hd.field_n.field_h, 2, hd.field_n.field_c);
                break L36;
              } else {
                break L36;
              }
            }
            if (var3 != 0) {
              ma.field_p = 20;
              break L35;
            } else {
              break L35;
            }
          } else {
            break L35;
          }
        }
        L38: {
          if (param0) {
            break L38;
          } else {
            if (pf.field_c) {
              hs.a(tm.field_i, (byte) 125);
              this.f(0);
              re.a(tm.field_i, false);
              break L38;
            } else {
              break L38;
            }
          }
        }
        L39: {
          if (!ud.field_c[8]) {
            break L39;
          } else {
            vd.d(2147483647);
            break L39;
          }
        }
    }

    final int a(boolean param0, boolean param1) {
        if (!param0) {
            this.e((byte) 84);
        }
        return this.a(true, 1, param1);
    }

    private final void b(boolean param0) {
        if (param0) {
            return;
        }
        String var2 = pc.a(param0);
        hp.a((byte) 112, kq.f((byte) 126), var2);
    }

    private final void k(byte param0) {
        ud.field_c[5] = true;
        if (param0 > -22) {
            this.h(99);
        }
    }

    final void j(byte param0) {
        int discarded$32 = 0;
        int discarded$33 = 0;
        int var3 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int stackIn_12_2 = 0;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int stackIn_13_3 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int stackOut_12_3 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0 <= -32) {
          L0: {
            if (wb.b(94)) {
              L1: {
                stackOut_10_0 = this;
                stackOut_10_1 = 0;
                stackOut_10_2 = 1;
                stackIn_12_0 = stackOut_10_0;
                stackIn_12_1 = stackOut_10_1;
                stackIn_12_2 = stackOut_10_2;
                stackIn_11_0 = stackOut_10_0;
                stackIn_11_1 = stackOut_10_1;
                stackIn_11_2 = stackOut_10_2;
                if (null == bj.field_K) {
                  stackOut_12_0 = this;
                  stackOut_12_1 = stackIn_12_1;
                  stackOut_12_2 = stackIn_12_2;
                  stackOut_12_3 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  stackIn_13_1 = stackOut_12_1;
                  stackIn_13_2 = stackOut_12_2;
                  stackIn_13_3 = stackOut_12_3;
                  break L1;
                } else {
                  stackOut_11_0 = this;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = stackIn_11_2;
                  stackOut_11_3 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  stackIn_13_3 = stackOut_11_3;
                  break L1;
                }
              }
              discarded$32 = this.a(stackIn_13_1 != 0, stackIn_13_2, stackIn_13_3 != 0);
              break L0;
            } else {
              if ((ma.field_p ^ -1) <= -11) {
                if (or.a(250)) {
                  if (gm.field_i == 0) {
                    discarded$33 = this.a(false, 1, false);
                    break L0;
                  } else {
                    te.a(0, so.field_o);
                    break L0;
                  }
                } else {
                  lc.b(-82);
                  break L0;
                }
              } else {
                break L0;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void h(byte param0) {
        ud.field_c[2] = true;
        int var2 = -9 % ((param0 - -55) / 57);
    }

    protected tl() {
    }

    final int i(byte param0) {
        int var2 = 0;
        if (this.field_e) {
          return -1;
        } else {
          if (param0 == 16) {
            if (!jc.f(-11)) {
              return -1;
            } else {
              if (md.field_B) {
                return -1;
              } else {
                var2 = ui.a(this.field_B, (byte) -94, true, vj.i(-125), this.field_C, bh.d(-97));
                if (0 == (var2 ^ -1)) {
                  return -1;
                } else {
                  L0: {
                    if (var2 == 0) {
                      break L0;
                    } else {
                      if ((var2 ^ -1) != -2) {
                        L1: {
                          if (!vm.field_Nb) {
                            this.a((byte) 58, "reconnect");
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                        oh.b(-11);
                        bf.a((byte) -126, var2, nl.field_c);
                        md.field_B = true;
                        ip.field_b = pr.a(14274) - -15000L;
                        return var2;
                      } else {
                        break L0;
                      }
                    }
                  }
                  L2: {
                    if (11 != gm.field_i) {
                      break L2;
                    } else {
                      if (0 == qj.field_g) {
                        rq.c(60);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return var2;
                }
              }
            }
          } else {
            return -22;
          }
        }
    }

    private final void a(int param0, int param1, int param2, String param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (this.b((byte) -106)) {
                  L2: {
                    L3: {
                      this.field_s = this.getCodeBase().getHost();
                      var6_ref2 = this.field_s.toLowerCase();
                      stackOut_2_0 = this;
                      stackIn_5_0 = stackOut_2_0;
                      stackIn_3_0 = stackOut_2_0;
                      if (var6_ref2.equals("jagex.com")) {
                        break L3;
                      } else {
                        stackOut_3_0 = this;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_4_0 = stackOut_3_0;
                        if (!var6_ref2.endsWith(".jagex.com")) {
                          stackOut_6_0 = this;
                          stackOut_6_1 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          break L2;
                        } else {
                          stackOut_4_0 = this;
                          stackIn_5_0 = stackOut_4_0;
                          break L3;
                        }
                      }
                    }
                    stackOut_5_0 = this;
                    stackOut_5_1 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L2;
                  }
                  L4: {
                    ((tl) (this)).field_C = stackIn_7_1 != 0;
                    this.field_q = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_x = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 != null) {
                      this.field_A = Integer.parseInt(var7);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    this.field_r = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_t = Long.parseLong(this.getParameter("instanceid"));
                    if (param2 < -7) {
                      break L5;
                    } else {
                      this.field_w = false;
                      break L5;
                    }
                  }
                  L6: {
                    this.field_w = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_v = Integer.parseInt(var8);
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (5 > this.field_v) {
                      break L7;
                    } else {
                      this.field_v = 0;
                      break L7;
                    }
                  }
                  L8: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_B = Integer.parseInt(var9);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  cm.field_f = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a((byte) -50, param1, param0, 32, param3, this.field_r, param4);
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                jq.a(-29901, (Throwable) ((Object) var6), (String) null);
                this.a((byte) -95, "crash");
                decompiledRegionSelector0 = 1;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L10: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var6_ref);
            stackOut_24_1 = new StringBuilder().append("tl.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param3 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L10;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L10;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void i(int param0) {
        int var2 = sa.field_a.j(-82);
        int var3 = param0 != (var2 & 1 ^ -1) ? 1 : 0;
        int var4 = rr.field_t - 1;
        byte[] var5 = new byte[var4];
        sa.field_a.b(var4, param0 ^ -1, 0, var5);
        ue.a(kq.f((byte) 126), var3 != 0, rm.a(var5, 17746), -128);
    }

    private final void j(int param0) {
        ud.field_c[6] = true;
        if (param0 != -31193) {
            this.h((byte) -62);
        }
    }

    final static java.awt.Frame a(boolean param0, qb param1, int param2, int param3, int param4, int param5) {
        RuntimeException var6 = null;
        gl[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        gl[] var10 = null;
        pb var11 = null;
        Object stackIn_3_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_36_0 = null;
        java.awt.Frame stackIn_38_0 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        java.awt.Frame stackOut_37_0 = null;
        Object stackOut_35_0 = null;
        Object stackOut_32_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.a(false)) {
              L1: {
                if (0 == param2) {
                  var10 = dc.a(param1, (byte) -57);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var10.length <= var8) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          return null;
                        }
                      } else {
                        if (var10[var8].field_g == param5) {
                          if (var10[var8].field_c == param4) {
                            L3: {
                              L4: {
                                if (-1 == (param3 ^ -1)) {
                                  break L4;
                                } else {
                                  if (var10[var8].field_f == param3) {
                                    break L4;
                                  } else {
                                    break L3;
                                  }
                                }
                              }
                              L5: {
                                if (var7_int == 0) {
                                  break L5;
                                } else {
                                  if (param2 < var10[var8].field_d) {
                                    break L5;
                                  } else {
                                    var8++;
                                    continue L2;
                                  }
                                }
                              }
                              var7_int = 1;
                              param2 = var10[var8].field_d;
                              break L3;
                            }
                            var8++;
                            continue L2;
                          } else {
                            var8++;
                            continue L2;
                          }
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
              L6: {
                var11 = param1.a(param3, param4, param5, param2, -1194);
                if (param0) {
                  break L6;
                } else {
                  field_o = (String) null;
                  break L6;
                }
              }
              L7: while (true) {
                if (-1 != (var11.field_d ^ -1)) {
                  var7 = (java.awt.Frame) (var11.field_e);
                  if (var7 != null) {
                    if (2 != var11.field_d) {
                      stackOut_37_0 = (java.awt.Frame) (var7);
                      stackIn_38_0 = stackOut_37_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      ql.a(var7, 0, param1);
                      stackOut_35_0 = null;
                      stackIn_36_0 = stackOut_35_0;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    }
                  } else {
                    stackOut_32_0 = null;
                    stackIn_33_0 = stackOut_32_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                } else {
                  jb.a((byte) -122, 10L);
                  continue L7;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var6 = decompiledCaughtException;
            stackOut_39_0 = (RuntimeException) (var6);
            stackOut_39_1 = new StringBuilder().append("tl.O(").append(param0).append(',');
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param1 == null) {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L8;
            } else {
              stackOut_40_0 = (RuntimeException) ((Object) stackIn_40_0);
              stackOut_40_1 = (StringBuilder) ((Object) stackIn_40_1);
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L8;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_42_0), stackIn_42_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.awt.Frame) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.awt.Frame) ((Object) stackIn_8_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return (java.awt.Frame) ((Object) stackIn_33_0);
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.awt.Frame) ((Object) stackIn_36_0);
              } else {
                return stackIn_38_0;
              }
            }
          }
        }
    }

    private final void b(int param0, boolean param1) {
        ud.field_c[0] = true;
        ud.field_c[17] = true;
        ud.field_c[8] = param1;
        if (param0 >= -33) {
            this.i(-80);
        }
        ud.field_c[7] = true;
        ud.field_c[16] = true;
        ud.field_c[3] = true;
        ud.field_c[18] = true;
    }

    static {
        field_p = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
        field_o = "All players have left <%0>'s game.";
        field_z = null;
    }
}
