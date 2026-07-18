/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class rb extends ac {
    private boolean field_x;
    private boolean field_o;
    private long field_y;
    private int field_q;
    static int field_s;
    static String field_t;
    String field_C;
    private int field_r;
    static ci field_u;
    private int field_v;
    private int field_D;
    static int field_w;
    private int field_A;
    private int field_z;
    private boolean field_p;

    final void k(int param0) {
        int var3 = stellarshard.field_B;
        if (vj.a(25424)) {
            int discarded$1 = this.a(pd.field_f != null ? true : false, false, true);
        } else {
            if (rk.field_f >= 10) {
                if (!gh.b((byte) 82)) {
                    hf.c(param0 ^ -241);
                } else {
                    if (eg.field_d == 0) {
                        int discarded$3 = this.a(false, false, true);
                    } else {
                        sg.a(51, ke.field_b);
                    }
                }
            }
        }
        if (param0 != -11) {
            this.a((byte) -116, true);
        }
    }

    final static ek[] g(int param0) {
        ek[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = stellarshard.field_B;
        var1 = new ek[sb.field_b];
        var2 = 0;
        L0: while (true) {
          if (sb.field_b <= var2) {
            if (param0 != 1851) {
              return null;
            } else {
              tb.f((byte) -118);
              return var1;
            }
          } else {
            var1[var2] = new ek(nc.field_G, wd.field_b, ak.field_c[var2], vi.field_c[var2], vc.field_b[var2], ih.field_d[var2], ih.field_b[var2], gj.field_w);
            var2++;
            continue L0;
          }
        }
    }

    private final void c(boolean param0) {
        wc.field_x[2] = true;
    }

    private final void i(int param0) {
        i.field_e[3] = -1;
        i.field_e[10] = -1;
        i.field_e[7] = -1;
        i.field_e[11] = -1;
        i.field_e[4] = -1;
        i.field_e[12] = -1;
        i.field_e[17] = -1;
        i.field_e[2] = -2;
        i.field_e[16] = -1;
        i.field_e[8] = -2;
        i.field_e[9] = -1;
        i.field_e[5] = -1;
        i.field_e[6] = -2;
        if (param0 != 18) {
            Object var3 = null;
            ((rb) this).a(-41, false, (String) null);
        }
        i.field_e[13] = -1;
        i.field_e[1] = 16;
        i.field_e[18] = 1;
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
            ka var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = stellarshard.field_B;
            var4 = ck.a(bb.field_d, ke.field_b, param0, false);
            if (var4 != 0) {
              L0: {
                if (var4 != 1) {
                  break L0;
                } else {
                  L1: {
                    var5_int = dc.a(tb.g((byte) 118), -112, n.a(20));
                    if (var5_int == -1) {
                      break L1;
                    } else {
                      sl.a(ga.field_a, var5_int, (byte) -110, fc.field_b);
                      fc.field_b = null;
                      ga.field_a = null;
                      break L1;
                    }
                  }
                  var11 = wj.g(-117);
                  if (var11 != null) {
                    vk.a((byte) -122, var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (var4 == 2) {
                  var5_int = qe.a(tc.c(-5), kg.e(false), true, rb.j(5), ((rb) this).field_v, wh.a((byte) 88), jg.i((byte) 113));
                  if (var5_int != -1) {
                    pk.a(ga.field_a, fc.field_b, var5_int, (byte) 125);
                    ga.field_a = null;
                    fc.field_b = null;
                    break L2;
                  } else {
                    break L2;
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (3 == var4) {
                  L4: {
                    if (ei.field_F == -1) {
                      break L4;
                    } else {
                      if (ei.field_F != 0) {
                        ei.field_F = -1;
                        ee.a(112);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (!param1) {
                    var5_int = wj.a(wh.a((byte) 97), ((rb) this).field_v, ((rb) this).field_x, tc.c(-5), (byte) 74, false);
                    if (var5_int == -1) {
                      break L3;
                    } else {
                      if (0 == var5_int) {
                        al.field_b = we.field_a;
                        db.a(127);
                        cg.field_a = false;
                        eg.field_d = 10;
                        break L3;
                      } else {
                        wl.a(var5_int, -8440, ga.field_a);
                        ga.field_a = null;
                        break L3;
                      }
                    }
                  } else {
                    pc.field_m = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (4 == var4) {
                  if (uj.field_f) {
                    pf.a(hf.a((byte) -126), (byte) 123);
                    break L5;
                  } else {
                    eg.field_d = 10;
                    cg.field_a = true;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (5 == var4) {
                  df.a(false, hf.a((byte) -96));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var4 != 6) {
                  break L7;
                } else {
                  if (!qh.field_d) {
                    break L7;
                  } else {
                    eg.field_d = 10;
                    break L7;
                  }
                }
              }
              L8: {
                if (var4 != 7) {
                  break L8;
                } else {
                  qj.a((byte) 109, hf.a((byte) -17));
                  break L8;
                }
              }
              L9: {
                if (var4 != 8) {
                  break L9;
                } else {
                  pf.a(hf.a((byte) -85), (byte) 123);
                  break L9;
                }
              }
              L10: {
                if (var4 != 9) {
                  break L10;
                } else {
                  of.a((byte) 99, hf.a((byte) -101));
                  break L10;
                }
              }
              L11: {
                if (var4 != 10) {
                  break L11;
                } else {
                  pg.field_fb.f(17, 950);
                  break L11;
                }
              }
              L12: {
                if (11 != var4) {
                  break L12;
                } else {
                  wf.a(63, hf.a((byte) -7));
                  break L12;
                }
              }
              L13: {
                if (var4 != 12) {
                  break L13;
                } else {
                  gf.a(hf.a((byte) -125), kf.b(-940626896), 16729);
                  break L13;
                }
              }
              L14: {
                if (var4 == 13) {
                  try {
                    L15: {
                      L16: {
                        if (q.field_d != null) {
                          break L16;
                        } else {
                          q.field_d = new v(ic.field_d, new java.net.URL(((rb) this).getCodeBase(), "countrylist.ws"), 5000);
                          break L16;
                        }
                      }
                      L17: {
                        if (q.field_d.a(14709)) {
                          L18: {
                            var12 = q.field_d.b(-4);
                            if (var12 != null) {
                              var7 = kk.a(var12.field_k, (byte) 97, 0, var12.field_r);
                              il.a(7110, var7);
                              break L18;
                            } else {
                              var9 = null;
                              il.a(7110, (String) null);
                              break L18;
                            }
                          }
                          q.field_d = null;
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
                      qe.a(-123, "S1", (Throwable) (Object) var5);
                      var10 = null;
                      il.a(7110, (String) null);
                      q.field_d = null;
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
                  eg.field_d = 10;
                  break L20;
                }
              }
              if (var4 != 16) {
                if (var4 == 17) {
                  return 2;
                } else {
                  return 0;
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

    private final void a(byte param0, boolean param1) {
        wc.field_x[3] = true;
        wc.field_x[8] = param1;
        wc.field_x[16] = true;
        wc.field_x[18] = true;
        wc.field_x[0] = true;
        if (param0 < 126) {
            field_s = -20;
        }
        wc.field_x[17] = true;
        wc.field_x[7] = true;
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, byte param6, int param7) {
        java.awt.Frame var11 = new java.awt.Frame("Jagex");
        var11.pack();
        var11.dispose();
        ((rb) this).setBackground(java.awt.Color.black);
        bb.field_d = ((rb) this).field_q;
        ke.a(41, bb.field_d);
        sg.a(5000, ((rb) this).field_D, ((rb) this).field_C, bb.field_d, ic.field_d, param5, 96, param4, ((rb) this).field_y, 5000, ((rb) this).field_A, ((rb) this).field_z, ((rb) this).field_r, ((rb) this).field_o);
        bg.a(69, ((rb) this).field_r, bb.field_d, ((rb) this).field_A, ic.field_d, param5, ((rb) this).field_C, ((rb) this).field_z, ((rb) this).field_D);
        bl.a((byte) -62);
        og.field_c = ck.n(2113632);
        nc.a(qd.field_j, (byte) 123);
        nk.field_b = param1;
        ck.field_hb = param3;
        ki.field_A = param0;
        vd.field_b = param2;
        int var10 = 11 / ((param6 - 30) / 36);
        wd.field_d = param7;
        this.i(18);
        df.a(-3);
    }

    final int c(int param0, boolean param1) {
        if (param0 != -25186) {
            ((rb) this).field_q = 86;
        }
        return this.a(param1, true, true);
    }

    private final void e(int param0) {
        wc.field_x[4] = true;
    }

    private final void j(byte param0) {
        int var2 = ae.field_N.f(4);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + ue.field_b;
        byte[] var5 = new byte[var4];
        ae.field_N.a(var5, true, 0, var4);
        fk.a(hf.a((byte) -113), var3 != 0, se.a(0, var5), (byte) 103);
    }

    private final void i(byte param0) {
        int var2 = -75 / ((35 - param0) / 59);
        wc.field_x[1] = true;
    }

    public static void m(int param0) {
        int var1 = -38;
        field_u = null;
        field_t = null;
    }

    final void a(int param0, boolean param1, String param2) {
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
              this.a(param0, 480, param2, 640, -7);
              if (param1) {
                break L1;
              } else {
                this.c(false);
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
            stackOut_3_1 = new StringBuilder().append("rb.I(").append(param0).append(',').append(param1).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void b(int param0, boolean param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_24_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_101_1 = 0;
        String stackIn_101_2 = null;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        String stackIn_102_2 = null;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        String stackIn_103_2 = null;
        int stackIn_103_3 = 0;
        int stackIn_133_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_100_1 = 0;
        String stackOut_100_2 = null;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        String stackOut_102_2 = null;
        int stackOut_102_3 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        String stackOut_101_2 = null;
        int stackOut_101_3 = 0;
        int stackOut_132_0 = 0;
        int stackOut_131_0 = 0;
        L0: {
          var5 = stellarshard.field_B;
          if (null == ja.field_m) {
            break L0;
          } else {
            L1: {
              if (null == pd.field_f) {
                var6 = v.a(true);
                var4 = var6.getSize();
                ja.field_m.a((byte) 81, var4.width, var4.height);
                break L1;
              } else {
                break L1;
              }
            }
            ja.field_m.b(0);
            break L0;
          }
        }
        L2: {
          ci.a(36);
          ii.g(256);
          if (ee.b(-117)) {
            break L2;
          } else {
            if (eg.field_d == 11) {
              break L2;
            } else {
              ie.d((byte) -56);
              break L2;
            }
          }
        }
        L3: {
          if (null != og.field_c) {
            ke.field_b = og.field_c.b(-115);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (ih.b(12871)) {
            L5: {
              var3 = ea.f((byte) -21) * 1200;
              if (((rb) this).field_p) {
                break L5;
              } else {
                if (~kf.a(65280) >= ~var3) {
                  break L4;
                } else {
                  if (var3 >= gh.a(true)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((rb) this).field_p = false;
            oj.c(-2290);
            pk.a(4);
            wl.a(2, -8440, wc.field_p);
            cm.a((byte) -117);
            pc.field_m = true;
            vc.field_a = ih.a((byte) -98) + 15000L;
            break L4;
          } else {
            break L4;
          }
        }
        L6: {
          L7: {
            if (ei.field_F == -1) {
              break L7;
            } else {
              if (ei.field_F != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if (-1 != ei.field_F) {
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
            ei.field_F = fa.d(0);
            if (var3 == 0) {
              break L9;
            } else {
              if (ei.field_F == 0) {
                if (eg.field_d != 11) {
                  break L9;
                } else {
                  if (il.e(32525)) {
                    break L9;
                  } else {
                    db.a(111);
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (ei.field_F == -1) {
            break L6;
          } else {
            if (ei.field_F != 0) {
              vc.field_a = ih.a((byte) -98) - -15000L;
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (param0 > 15) {
            break L10;
          } else {
            field_t = null;
            break L10;
          }
        }
        L11: {
          if (-1 == ei.field_F) {
            break L11;
          } else {
            if (ei.field_F != 0) {
              if (rk.field_f < 10) {
                if (ei.field_F == 3) {
                  ((rb) this).a(1, "js5crc");
                  break L11;
                } else {
                  if (4 == ei.field_F) {
                    ((rb) this).a(1, "js5io");
                    break L11;
                  } else {
                    if (2 == ei.field_F) {
                      ((rb) this).a(1, "js5connect_full");
                      break L11;
                    } else {
                      if (5 != ei.field_F) {
                        ((rb) this).a(1, "js5connect");
                        break L11;
                      } else {
                        ((rb) this).a(1, "outofdate");
                        break L11;
                      }
                    }
                  }
                }
              } else {
                if (eg.field_d < 10) {
                  break L11;
                } else {
                  L12: {
                    pk.a(4);
                    if (ei.field_F == 3) {
                      wl.a(256, -8440, al.field_a);
                      break L12;
                    } else {
                      if (ei.field_F == 4) {
                        wl.a(256, -8440, eb.field_d);
                        break L12;
                      } else {
                        if (2 != ei.field_F) {
                          if (ei.field_F != 5) {
                            wl.a(256, -8440, ui.field_B);
                            break L12;
                          } else {
                            wl.a(5, -8440, ah.field_n);
                            break L12;
                          }
                        } else {
                          wl.a(256, -8440, ea.field_n);
                          break L12;
                        }
                      }
                    }
                  }
                  pc.field_m = true;
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
              if (ei.field_F == -1) {
                break L15;
              } else {
                if (ei.field_F != 0) {
                  break L14;
                } else {
                  break L15;
                }
              }
            }
            if (!il.e(32525)) {
              break L13;
            } else {
              break L14;
            }
          }
          if (ih.a((byte) -98) < vc.field_a) {
            break L13;
          } else {
            pc.field_m = false;
            if (ei.field_F == -1) {
              break L13;
            } else {
              if (ei.field_F == 0) {
                break L13;
              } else {
                ei.field_F = -1;
                ee.a(88);
                break L13;
              }
            }
          }
        }
        L16: {
          if (ei.field_F != 0) {
            break L16;
          } else {
            if (il.e(32525)) {
              break L16;
            } else {
              b.field_v = false;
              break L16;
            }
          }
        }
        L17: {
          if (0 != rk.field_f) {
            break L17;
          } else {
            if (!tg.a((byte) 49)) {
              break L17;
            } else {
              rk.field_f = 1;
              break L17;
            }
          }
        }
        L18: {
          if (rk.field_f != 1) {
            break L18;
          } else {
            L19: {
              if (bb.field_d == 0) {
                break L19;
              } else {
                pg.field_db = wl.a(1, ki.field_A);
                break L19;
              }
            }
            lk.field_i = o.a(1, 2, nk.field_b, false, true);
            wf.field_e = o.a(1, 2, ck.field_hb, false, true);
            am.field_g = o.a(1, 2, vd.field_b, false, true);
            rk.field_f = 2;
            fc.field_a = lk.field_i;
            ie.field_u = wf.field_e;
            break L18;
          }
        }
        L20: {
          if (rk.field_f == 2) {
            L21: {
              if (pg.field_db == null) {
                break L21;
              } else {
                if (pg.field_db.a((byte) -36)) {
                  if (!pg.field_db.c("", (byte) -116)) {
                    pg.field_db = null;
                    break L21;
                  } else {
                    if (!pg.field_db.a("", (byte) -109)) {
                      break L21;
                    } else {
                      g.a(pg.field_db, 1);
                      pg.field_db = null;
                      rg.g(-33);
                      break L21;
                    }
                  }
                } else {
                  break L21;
                }
              }
            }
            if (null != pg.field_db) {
              break L20;
            } else {
              rk.field_f = 3;
              break L20;
            }
          } else {
            break L20;
          }
        }
        L22: {
          if (rk.field_f == 3) {
            if (!ni.a(wf.field_e, am.field_g, lk.field_i, (byte) -104)) {
              break L22;
            } else {
              if (!dj.a(am.field_g, (byte) -126)) {
                break L22;
              } else {
                L23: {
                  L24: {
                    ol.b(-114);
                    gk.a(false);
                    am.field_i = fl.field_c;
                    qh.field_d = false;
                    hc.a(am.field_g, lk.field_i, wf.field_e, uj.field_f, (byte) -88);
                    if (v.field_b) {
                      break L24;
                    } else {
                      if (null == ai.field_g) {
                        break L23;
                      } else {
                        break L24;
                      }
                    }
                  }
                  L25: {
                    if (v.field_b) {
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
                    stackOut_100_1 = -1;
                    stackOut_100_2 = ai.field_g;
                    stackIn_102_0 = stackOut_100_0;
                    stackIn_102_1 = stackOut_100_1;
                    stackIn_102_2 = stackOut_100_2;
                    stackIn_101_0 = stackOut_100_0;
                    stackIn_101_1 = stackOut_100_1;
                    stackIn_101_2 = stackOut_100_2;
                    if (v.field_b) {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = (String) (Object) stackIn_102_2;
                      stackOut_102_3 = 0;
                      stackIn_103_0 = stackOut_102_0;
                      stackIn_103_1 = stackOut_102_1;
                      stackIn_103_2 = stackOut_102_2;
                      stackIn_103_3 = stackOut_102_3;
                      break L26;
                    } else {
                      stackOut_101_0 = stackIn_101_0;
                      stackOut_101_1 = stackIn_101_1;
                      stackOut_101_2 = (String) (Object) stackIn_101_2;
                      stackOut_101_3 = 1;
                      stackIn_103_0 = stackOut_101_0;
                      stackIn_103_1 = stackOut_101_1;
                      stackIn_103_2 = stackOut_101_2;
                      stackIn_103_3 = stackOut_101_3;
                      break L26;
                    }
                  }
                  ai.a(stackIn_103_0 != 0, stackIn_103_1, stackIn_103_2, stackIn_103_3 != 0);
                  break L23;
                }
                L27: {
                  if (!wi.field_a) {
                    break L27;
                  } else {
                    qh.a(true);
                    break L27;
                  }
                }
                L28: {
                  if (pg.field_cb != null) {
                    break L28;
                  } else {
                    pg.field_cb = fk.d(75);
                    mj.field_L = qc.a(1);
                    break L28;
                  }
                }
                ab.a(am.field_g, true, mj.field_L, pg.field_cb);
                lk.field_i = null;
                wf.field_e = null;
                am.field_g = null;
                aa.a((java.applet.Applet) this, -106);
                rg.g(-33);
                rk.field_f = 10;
                break L22;
              }
            }
          } else {
            break L22;
          }
        }
        L29: {
          if (rk.field_f == 10) {
            L30: {
              if (bb.field_d != 0) {
                ld.field_G = wl.a(1, wd.field_d);
                break L30;
              } else {
                break L30;
              }
            }
            rk.field_f = 11;
            break L29;
          } else {
            break L29;
          }
        }
        L31: {
          if (rk.field_f == 11) {
            L32: {
              if (ld.field_G == null) {
                break L32;
              } else {
                L33: {
                  if (!ld.field_G.a((byte) -36)) {
                    break L33;
                  } else {
                    if (!ld.field_G.c((byte) -111)) {
                      break L33;
                    } else {
                      break L32;
                    }
                  }
                }
                rd.a((byte) -76, 0.0f, pi.a(kf.field_d, ld.field_G, rg.field_I, 1));
                break L31;
              }
            }
            rk.field_f = 12;
            qd.field_h = true;
            break L31;
          } else {
            break L31;
          }
        }
        L34: {
          if (rk.field_f != 12) {
            break L34;
          } else {
            if (!qd.field_h) {
              rk.field_f = 13;
              break L34;
            } else {
              break L34;
            }
          }
        }
        L35: {
          if (rk.field_f != 13) {
            break L35;
          } else {
            L36: {
              var3 = 1;
              if (fa.field_n != null) {
                L37: {
                  if (!fa.field_n.a(true)) {
                    stackOut_132_0 = 0;
                    stackIn_133_0 = stackOut_132_0;
                    break L37;
                  } else {
                    stackOut_131_0 = 1;
                    stackIn_133_0 = stackOut_131_0;
                    break L37;
                  }
                }
                var3 = stackIn_133_0;
                rd.a((byte) -83, fa.field_n.field_a, fa.field_n.field_g);
                break L36;
              } else {
                break L36;
              }
            }
            if (var3 == 0) {
              break L35;
            } else {
              rk.field_f = 20;
              break L35;
            }
          }
        }
        L38: {
          if (param1) {
            break L38;
          } else {
            if (!tl.field_d) {
              break L38;
            } else {
              nd.a(-26621, qd.field_j);
              ((rb) this).c(31178);
              nc.a(qd.field_j, (byte) 118);
              break L38;
            }
          }
        }
        L39: {
          if (wc.field_x[8]) {
            o.b(-10834);
            break L39;
          } else {
            break L39;
          }
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            var3 = la.a(param2, (byte) 110);
            if (-1 != param0.indexOf(param2)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              if (param0.indexOf(var3) == -1) {
                L1: {
                  if (param1 < -24) {
                    break L1;
                  } else {
                    ek[] discarded$2 = rb.g(19);
                    break L1;
                  }
                }
                L2: {
                  L3: {
                    if (param0.startsWith(param2)) {
                      break L3;
                    } else {
                      if (param0.startsWith(var3)) {
                        break L3;
                      } else {
                        if (param0.endsWith(param2)) {
                          break L3;
                        } else {
                          if (!param0.endsWith(var3)) {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  stackOut_12_0 = 1;
                  stackIn_14_0 = stackOut_12_0;
                  break L2;
                }
                break L0;
              } else {
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var3_ref;
            stackOut_15_1 = new StringBuilder().append("rb.W(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    private final void b(boolean param0) {
        String var2 = wa.a(-1);
        be.a(hf.a((byte) -70), var2, (byte) 116);
    }

    final static String j(int param0) {
        if (!(dj.field_a != o.field_l)) {
            return sb.field_a;
        }
        if (!(al.field_f.a(true))) {
            return al.field_f.c(-112);
        }
        if (!(dj.field_a != el.field_E)) {
            return al.field_f.c(-117);
        }
        return va.field_a;
    }

    private final void a(int param0, int param1, String param2, int param3, int param4) {
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
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          try {
            L0: {
              if (!((rb) this).g((byte) 93)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((rb) this).field_C = ((rb) this).getCodeBase().getHost();
                    var6_ref2 = ((rb) this).field_C.toLowerCase();
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
                  ((rb) this).field_x = stackIn_8_1 != 0;
                  ((rb) this).field_A = Integer.parseInt(((rb) this).getParameter("gameport1"));
                  ((rb) this).field_D = Integer.parseInt(((rb) this).getParameter("gameport2"));
                  var7 = ((rb) this).getParameter("servernum");
                  if (var7 == null) {
                    break L3;
                  } else {
                    ((rb) this).field_z = Integer.parseInt(var7);
                    break L3;
                  }
                }
                ((rb) this).field_r = Integer.parseInt(((rb) this).getParameter("gamecrc"));
                L4: {
                  ((rb) this).field_y = Long.parseLong(((rb) this).getParameter("instanceid"));
                  ((rb) this).field_o = ((rb) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((rb) this).getParameter("lang");
                  if (var8 == null) {
                    break L4;
                  } else {
                    ((rb) this).field_q = Integer.parseInt(var8);
                    break L4;
                  }
                }
                L5: {
                  if (((rb) this).field_q < 5) {
                    break L5;
                  } else {
                    ((rb) this).field_q = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((rb) this).getParameter("affid");
                  if (var9 != null) {
                    ((rb) this).field_v = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                wi.field_a = Boolean.valueOf(((rb) this).getParameter("simplemode")).booleanValue();
                ((rb) this).a(32, param0, 480, ((rb) this).field_r, -118, 640, param2);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              qe.a(-105, (String) null, (Throwable) (Object) var6);
              ((rb) this).a(1, "crash");
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var6_ref;
            stackOut_23_1 = new StringBuilder().append("rb.EA(").append(param0).append(',').append(480).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L8;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + 640 + ',' + -7 + ')');
        }
    }

    final void h(int param0) {
        int var2 = 0;
        nj var3 = null;
        int var4 = 0;
        int stackIn_32_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        L0: {
          var4 = stellarshard.field_B;
          var2 = ja.field_t;
          if (var2 >= 64) {
            break L0;
          } else {
            if (wc.field_x[var2]) {
              if (param0 == 6476) {
                if (var2 == 0) {
                  return;
                } else {
                  L1: {
                    if (1 == var2) {
                      pe.c(param0 + 18738);
                      break L1;
                    } else {
                      if (var2 == 2) {
                        eh.a(-1);
                        break L1;
                      } else {
                        if (var2 != 3) {
                          if (var2 == 4) {
                            v.a((byte) -125);
                            break L1;
                          } else {
                            if (5 == var2) {
                              nf.a((byte) 84);
                              break L1;
                            } else {
                              if (var2 != 6) {
                                if (var2 != 7) {
                                  if (8 != var2) {
                                    if (var2 == 16) {
                                      ue.a((byte) -121);
                                      break L1;
                                    } else {
                                      L2: {
                                        if (var2 == 11) {
                                          break L2;
                                        } else {
                                          if (var2 == 12) {
                                            break L2;
                                          } else {
                                            if (var2 == 13) {
                                              n.d((byte) 4);
                                              break L1;
                                            } else {
                                              if (var2 != 17) {
                                                if (var2 == 18) {
                                                  sl.a((byte) 51);
                                                  break L1;
                                                } else {
                                                  qe.a(-6, "MGS1: " + bh.b((byte) -98), (Throwable) null);
                                                  oj.c(-2290);
                                                  break L1;
                                                }
                                              } else {
                                                this.j((byte) 108);
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L3: {
                                        if (var2 != 12) {
                                          stackOut_31_0 = 0;
                                          stackIn_32_0 = stackOut_31_0;
                                          break L3;
                                        } else {
                                          stackOut_30_0 = 1;
                                          stackIn_32_0 = stackOut_30_0;
                                          break L3;
                                        }
                                      }
                                      var3 = ff.a(stackIn_32_0 != 0, (byte) 92);
                                      ok.a((byte) -54, var3);
                                      break L1;
                                    }
                                  } else {
                                    fb.a((ka) (Object) ae.field_N, ue.field_b, ic.field_d, 20);
                                    break L1;
                                  }
                                } else {
                                  this.b(false);
                                  break L1;
                                }
                              } else {
                                df.c(-88);
                                break L1;
                              }
                            }
                          }
                        } else {
                          jf.e(116);
                          break L1;
                        }
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            } else {
              break L0;
            }
          }
        }
        qe.a(86, "MGS2: " + bh.b((byte) -118), (Throwable) null);
        oj.c(-2290);
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4) {
        this.a((byte) 127, false);
        if (param3) {
            this.i((byte) -110);
        }
        if (param4) {
            this.c(false);
        }
        if (!(!param0)) {
            this.e(5978);
        }
        if (!(!param2)) {
            this.h((byte) 28);
        }
        if (param1 >= -70) {
            this.i(-7);
        }
    }

    private final void h(byte param0) {
        wc.field_x[5] = true;
    }

    final int f(int param0) {
        int var2 = 0;
        L0: {
          L1: {
            var2 = this.l(param0 + 15981);
            if (var2 == 0) {
              break L1;
            } else {
              if (var2 != 1) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (!wc.field_x[1]) {
              break L2;
            } else {
              fa.a(2, param0 ^ 16064);
              break L2;
            }
          }
          L3: {
            if (!wc.field_x[2]) {
              break L3;
            } else {
              vk.a((byte) -128, 3);
              break L3;
            }
          }
          L4: {
            if (!wc.field_x[3]) {
              break L4;
            } else {
              se.a(4, -91);
              break L4;
            }
          }
          L5: {
            if (wc.field_x[4]) {
              ic.a(5, 55);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (!wc.field_x[5]) {
              break L6;
            } else {
              h.a(-96, 6);
              break L6;
            }
          }
          L7: {
            if (wc.field_x[6]) {
              sl.a(7, (byte) -105);
              break L7;
            } else {
              break L7;
            }
          }
          if (!wc.field_x[8]) {
            break L0;
          } else {
            we.a((byte) 15);
            break L0;
          }
        }
        L8: {
          if (param0 == -16028) {
            break L8;
          } else {
            ((rb) this).field_o = false;
            break L8;
          }
        }
        return var2;
    }

    private final int l(int param0) {
        int var2 = 0;
        if (((rb) this).field_g) {
          return -1;
        } else {
          if (il.e(32525)) {
            if (!pc.field_m) {
              var2 = wj.a(wh.a((byte) 116), ((rb) this).field_v, ((rb) this).field_x, tc.c(-5), (byte) 71, true);
              if (-1 == var2) {
                return -1;
              } else {
                L0: {
                  if (param0 < -36) {
                    break L0;
                  } else {
                    this.i((byte) 122);
                    break L0;
                  }
                }
                L1: {
                  if (0 == var2) {
                    break L1;
                  } else {
                    if (var2 == 1) {
                      break L1;
                    } else {
                      L2: {
                        if (!pf.field_c) {
                          ((rb) this).a(1, "reconnect");
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      pk.a(4);
                      wl.a(var2, -8440, ga.field_a);
                      pc.field_m = true;
                      vc.field_a = 15000L + ih.a((byte) -98);
                      return var2;
                    }
                  }
                }
                L3: {
                  if (11 != eg.field_d) {
                    break L3;
                  } else {
                    if (ei.field_F == 0) {
                      db.a(-113);
                      break L3;
                    } else {
                      break L3;
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

    protected rb() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = "achievements to collect";
    }
}
