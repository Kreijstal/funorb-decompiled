/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class n extends lg {
    private int field_D;
    private boolean field_C;
    private boolean field_E;
    static td field_x;
    static int field_u;
    static String field_o;
    static int[] field_z;
    private long field_r;
    private int field_v;
    private int field_q;
    private int field_n;
    static u field_w;
    private int field_F;
    static int[] field_p;
    private int field_B;
    private boolean field_A;
    static boolean[][] field_s;
    String field_t;
    static String field_y;

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
            gi var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = SteelSentinels.field_G;
            var4 = hh.a(dh.field_D, param1, (byte) -66, jj.field_d);
            if ((var4 ^ -1) == -1) {
              throw new IllegalStateException();
            } else {
              L0: {
                if (-2 != (var4 ^ -1)) {
                  break L0;
                } else {
                  L1: {
                    var5_int = lg.a(ln.a((byte) -89), si.b(64), -121);
                    if ((var5_int ^ -1) == 0) {
                      break L1;
                    } else {
                      a.a(di.field_e, (byte) 118, var5_int, vh.field_d);
                      vh.field_d = null;
                      di.field_e = null;
                      break L1;
                    }
                  }
                  var11 = aj.a(true);
                  if (var11 != null) {
                    fl.a((byte) 97, var11.booleanValue());
                    break L0;
                  } else {
                    break L0;
                  }
                }
              }
              L2: {
                if (2 == var4) {
                  var5_int = id.a(ma.a(false), 0, jj.a(true), this.field_q, hl.d(91), vl.e(37), df.h(82));
                  if (var5_int != -1) {
                    nn.a(vh.field_d, var5_int, di.field_e, (byte) -128);
                    di.field_e = null;
                    vh.field_d = null;
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
                    if (0 == (fl.field_d ^ -1)) {
                      break L4;
                    } else {
                      if ((fl.field_d ^ -1) == -1) {
                        break L4;
                      } else {
                        fl.field_d = -1;
                        bi.b(param2 ^ 7004);
                        break L4;
                      }
                    }
                  }
                  if (!param0) {
                    var5_int = jj.a(-108, this.field_q, jj.a(true), this.field_A, false, ma.a(false));
                    if (0 == (var5_int ^ -1)) {
                      break L3;
                    } else {
                      if ((var5_int ^ -1) != -1) {
                        cl.a(di.field_e, var5_int, 1);
                        di.field_e = null;
                        break L3;
                      } else {
                        oa.field_P = li.field_w;
                        ee.c(11828);
                        mg.field_ac = false;
                        uj.field_d = 10;
                        break L3;
                      }
                    }
                  } else {
                    tf.field_b = false;
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
              L5: {
                if (4 == var4) {
                  if (!ki.field_ib) {
                    mg.field_ac = true;
                    uj.field_d = 10;
                    break L5;
                  } else {
                    ei.a(param2 + 7014, wl.d((byte) -21));
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (5 == var4) {
                  t.a(true, wl.d((byte) -21));
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (-7 == (var4 ^ -1)) {
                  if (!ck.field_a) {
                    break L7;
                  } else {
                    uj.field_d = 10;
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
              if (param2 == -7014) {
                L8: {
                  if (7 == var4) {
                    nc.a((byte) -81, wl.d((byte) -21));
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  if (var4 == 8) {
                    ei.a(0, wl.d((byte) -21));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (9 != var4) {
                    break L10;
                  } else {
                    mj.a((byte) 49, wl.d((byte) -21));
                    break L10;
                  }
                }
                L11: {
                  if ((var4 ^ -1) == -11) {
                    mm.field_g.a(17, (byte) -117);
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if ((var4 ^ -1) == -12) {
                    pf.a(wl.d((byte) -21), 63);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (12 != var4) {
                    break L13;
                  } else {
                    rj.a(db.b(param2 + 7014), wl.d((byte) -21), (byte) -47);
                    break L13;
                  }
                }
                L14: {
                  if ((var4 ^ -1) == -14) {
                    try {
                      L15: {
                        L16: {
                          if (kc.field_s == null) {
                            kc.field_s = new fk(hb.field_i, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (!kc.field_s.c(-2)) {
                            break L17;
                          } else {
                            L18: {
                              var12 = kc.field_s.b(param2 + 7017);
                              if (var12 == null) {
                                var9 = (String) null;
                                na.a((String) null, (byte) -126);
                                break L18;
                              } else {
                                var7 = ub.a((byte) 37, 0, var12.field_t, var12.field_p);
                                na.a(var7, (byte) -105);
                                break L18;
                              }
                            }
                            kc.field_s = null;
                            break L17;
                          }
                        }
                        break L15;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L19: {
                        var5 = (Exception) (Object) decompiledCaughtException;
                        sj.a("S1", -100, (Throwable) ((Object) var5));
                        var10 = (String) null;
                        na.a((String) null, (byte) -104);
                        kc.field_s = null;
                        break L19;
                      }
                    }
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L20: {
                  if (-16 != (var4 ^ -1)) {
                    break L20;
                  } else {
                    uj.field_d = 10;
                    break L20;
                  }
                }
                if (-17 != (var4 ^ -1)) {
                  if (-18 == (var4 ^ -1)) {
                    return 2;
                  } else {
                    return 0;
                  }
                } else {
                  return 1;
                }
              } else {
                return 20;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void d(byte param0) {
        int var2 = -57 / ((param0 - 47) / 53);
        dg.field_h[5] = true;
    }

    private final void a(int param0, String param1, int param2, int param3, int param4) {
        Exception var6 = null;
        RuntimeException var6_ref = null;
        String var6_ref2 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        String var10 = null;
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
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            try {
              L1: {
                if (!this.b((byte) 110)) {
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.field_t = this.getCodeBase().getHost();
                      var6_ref2 = this.field_t.toLowerCase();
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
                  L4: {
                    ((n) (this)).field_A = stackIn_8_1 != 0;
                    this.field_D = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_B = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L4;
                    } else {
                      this.field_v = Integer.parseInt(var7);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_F = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_r = Long.parseLong(this.getParameter("instanceid"));
                    this.field_C = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_n = Integer.parseInt(var8);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if ((this.field_n ^ -1) <= param2) {
                      this.field_n = 0;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_q = Integer.parseInt(var9);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  ud.field_q = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(param3, param0, 32, (byte) 103, param1, this.field_F, param4);
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                sj.a((String) null, -41, (Throwable) ((Object) var6));
                this.a("crash", param2 ^ 16948);
                decompiledRegionSelector0 = 1;
                break L8;
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
          L9: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) (var6_ref);
            stackOut_23_1 = new StringBuilder().append("n.K(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final int i(byte param0) {
        int var2 = 0;
        int var3 = 0;
        if (!this.field_m) {
          if (ri.a(16731221)) {
            if (tf.field_b) {
              return -1;
            } else {
              var2 = jj.a(-119, this.field_q, jj.a(true), this.field_A, true, ma.a(false));
              if (0 != (var2 ^ -1)) {
                L0: {
                  if (-1 == (var2 ^ -1)) {
                    break L0;
                  } else {
                    if (-2 == (var2 ^ -1)) {
                      break L0;
                    } else {
                      L1: {
                        if (am.field_b) {
                          break L1;
                        } else {
                          this.a("reconnect", -16946);
                          break L1;
                        }
                      }
                      of.a(10);
                      var3 = 102 / ((param0 - -32) / 54);
                      cl.a(di.field_e, var2, 1);
                      tf.field_b = true;
                      r.field_l = 15000L + mm.a(42);
                      return var2;
                    }
                  }
                }
                L2: {
                  if (uj.field_d != 11) {
                    break L2;
                  } else {
                    if (fl.field_d == 0) {
                      ee.c(11828);
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
          } else {
            return -1;
          }
        } else {
          return -1;
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        dh.field_D = this.field_n;
        jg.a(dh.field_D, param2 ^ 4192);
        lk.a(hb.field_i, this.field_t, param1, this.field_v, param3, this.field_C, this.field_B, dh.field_D, 5000, this.field_r, (byte) 120, param2, this.field_F, this.field_D);
        g.a(this.field_F, this.field_D, param3, this.field_B, hb.field_i, (byte) -95, dh.field_D, this.field_v, this.field_t);
        fa.a((byte) 127);
        nc.field_j = pi.a((byte) 68);
        hg.a((byte) -93, sl.field_n);
        ea.field_h = param5;
        jl.field_r = param7;
        ed.field_h = param4;
        kd.field_p = param6;
        rf.field_c = param0;
        this.c(true);
        di.a((byte) -128);
    }

    final int a(boolean param0, int param1) {
        if (param1 != -3836) {
            field_o = (String) null;
        }
        return this.a(true, param0, param1 ^ 5534);
    }

    public static void h(byte param0) {
        field_p = null;
        field_w = null;
        field_o = null;
        field_x = null;
        field_s = (boolean[][]) null;
        if (param0 >= -101) {
            return;
        }
        field_z = null;
        field_y = null;
    }

    private final void e(byte param0) {
        if (param0 >= -86) {
            return;
        }
        dg.field_h[4] = true;
    }

    private final void b(boolean param0) {
        dg.field_h[12] = true;
        dg.field_h[11] = true;
        if (param0) {
            return;
        }
        dg.field_h[13] = true;
    }

    final void a(int param0, int param1, String param2) {
        try {
            if (param1 != -28233) {
                this.b(true);
            }
            this.a(480, param2, -6, 640, param0);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "n.M(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, boolean param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.a(true, true);
        if (!(!param3)) {
            this.f((byte) -17);
        }
        if (!(!param1)) {
            this.j(-17573);
        }
        if (param0 != 1) {
            return;
        }
        if (!(!param6)) {
            this.e((byte) -91);
        }
        if (!(!param2)) {
            this.d((byte) -107);
        }
        if (param4) {
            this.i(118);
        }
        if (param5) {
            this.b(false);
        }
    }

    private final void j(int param0) {
        if (param0 != -17573) {
            this.field_q = 102;
        }
        dg.field_h[2] = true;
    }

    final void k(int param0) {
        int discarded$1 = 0;
        int discarded$3 = 0;
        int var3 = SteelSentinels.field_G;
        if (ri.c(6995)) {
            discarded$1 = this.a(false, wb.field_c != null ? true : false, -7014);
        } else {
            if (nj.field_Q >= 10) {
                if (!km.a(-104)) {
                    uj.b(29);
                } else {
                    if (-1 == (uj.field_d ^ -1)) {
                        discarded$3 = this.a(false, false, -7014);
                    } else {
                        r.a(jj.field_d, (byte) 104);
                    }
                }
            }
        }
        int var2 = -84 % ((30 - param0) / 55);
    }

    private final void f(byte param0) {
        if (param0 != -17) {
            this.field_E = false;
        }
        dg.field_h[1] = true;
    }

    private final void l(int param0) {
        int var2 = rf.field_d.f((byte) -86);
        int var3 = (1 & var2) != 0 ? 1 : 0;
        int var4 = -1 + jg.field_f;
        byte[] var5 = new byte[var4];
        rf.field_d.a(0, var4, var5, 103);
        be.a(var3 != 0, (byte) 99, jk.a(13, var5), wl.d((byte) -21));
        if (param0 != 3894) {
            this.f((byte) -96);
        }
    }

    final void a(int param0, boolean param1) {
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
        String stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        String stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_110_2 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        String stackOut_104_0 = null;
        String stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        String stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        String stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        String stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        String stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int stackOut_108_2 = 0;
        L0: {
          var5 = SteelSentinels.field_G;
          if (null != ve.field_a) {
            L1: {
              if (null == wb.field_c) {
                var6 = pl.g(param0 + -45);
                var4 = var6.getSize();
                ve.field_a.b(var4.height, (byte) -114, var4.width);
                break L1;
              } else {
                break L1;
              }
            }
            ve.field_a.b(false);
            break L0;
          } else {
            break L0;
          }
        }
        L2: {
          lg.g(-27983);
          rl.b(param0 ^ param0);
          if (ol.j(0)) {
            break L2;
          } else {
            if (-12 == (uj.field_d ^ -1)) {
              break L2;
            } else {
              sn.c(-51);
              break L2;
            }
          }
        }
        L3: {
          if (nc.field_j != null) {
            jj.field_d = nc.field_j.b(-1);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!ud.e(-116)) {
            break L4;
          } else {
            L5: {
              var3 = sj.a((byte) -123) * 1200;
              if (this.field_E) {
                break L5;
              } else {
                if (var3 >= ub.b(-102)) {
                  break L4;
                } else {
                  if (ha.a((byte) -64) <= var3) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            this.field_E = false;
            pm.m(127);
            of.a(10);
            cl.a(un.field_g, 2, param0 ^ 4);
            tk.e((byte) 82);
            tf.field_b = true;
            r.field_l = mm.a(-94) - -15000L;
            break L4;
          }
        }
        L6: {
          L7: {
            if (-1 == fl.field_d) {
              break L7;
            } else {
              if (fl.field_d != 0) {
                break L6;
              } else {
                break L7;
              }
            }
          }
          L8: {
            if ((fl.field_d ^ -1) != 0) {
              stackOut_23_0 = 0;
              stackIn_24_0 = stackOut_23_0;
              break L8;
            } else {
              stackOut_22_0 = 1;
              stackIn_24_0 = stackOut_22_0;
              break L8;
            }
          }
          var3 = stackIn_24_0;
          fl.field_d = kj.j(param0 + 16);
          if (var3 == 0) {
            if (fl.field_d == -1) {
              break L6;
            } else {
              if (fl.field_d == 0) {
                if (fl.field_d == -1) {
                  break L6;
                } else {
                  if (fl.field_d == 0) {
                    break L6;
                  } else {
                    r.field_l = mm.a(127) + 15000L;
                    break L6;
                  }
                }
              } else {
                if (fl.field_d == -1) {
                  break L6;
                } else {
                  if (fl.field_d == 0) {
                    break L6;
                  } else {
                    r.field_l = mm.a(127) + 15000L;
                    break L6;
                  }
                }
              }
            }
          } else {
            if (fl.field_d == -1) {
              break L6;
            } else {
              if (fl.field_d == 0) {
                break L6;
              } else {
                r.field_l = mm.a(127) + 15000L;
                break L6;
              }
            }
          }
        }
        L9: {
          if (0 == (fl.field_d ^ -1)) {
            break L9;
          } else {
            if (fl.field_d == 0) {
              break L9;
            } else {
              if (10 <= nj.field_Q) {
                if (-11 >= (uj.field_d ^ -1)) {
                  L10: {
                    of.a(10);
                    if (fl.field_d == 3) {
                      cl.a(nh.field_F, 256, 1);
                      break L10;
                    } else {
                      if ((fl.field_d ^ -1) == -5) {
                        cl.a(un.field_c, 256, 1);
                        break L10;
                      } else {
                        if (2 != fl.field_d) {
                          if (-6 != (fl.field_d ^ -1)) {
                            cl.a(pg.field_s, 256, 1);
                            break L10;
                          } else {
                            cl.a(wl.field_R, 5, 1);
                            break L10;
                          }
                        } else {
                          cl.a(qf.field_j, 256, 1);
                          break L10;
                        }
                      }
                    }
                  }
                  tf.field_b = true;
                  break L9;
                } else {
                  break L9;
                }
              } else {
                if (fl.field_d == 3) {
                  this.a("js5crc", -16946);
                  break L9;
                } else {
                  if (fl.field_d == 4) {
                    this.a("js5io", -16946);
                    break L9;
                  } else {
                    if (fl.field_d != 2) {
                      if (fl.field_d == 5) {
                        this.a("outofdate", -16946);
                        break L9;
                      } else {
                        this.a("js5connect", param0 ^ -16949);
                        break L9;
                      }
                    } else {
                      this.a("js5connect_full", -16946);
                      break L9;
                    }
                  }
                }
              }
            }
          }
        }
        L11: {
          L12: {
            L13: {
              if (0 == (fl.field_d ^ -1)) {
                break L13;
              } else {
                if (-1 != (fl.field_d ^ -1)) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (!ri.a(16731221)) {
              break L11;
            } else {
              break L12;
            }
          }
          if (r.field_l <= mm.a(-111)) {
            tf.field_b = false;
            if (0 == (fl.field_d ^ -1)) {
              break L11;
            } else {
              if (fl.field_d != 0) {
                fl.field_d = -1;
                bi.b(-102);
                break L11;
              } else {
                break L11;
              }
            }
          } else {
            break L11;
          }
        }
        L14: {
          if (-1 != (fl.field_d ^ -1)) {
            break L14;
          } else {
            if (!ri.a(param0 ^ 16731216)) {
              rg.field_h = false;
              break L14;
            } else {
              break L14;
            }
          }
        }
        L15: {
          if (nj.field_Q != 0) {
            break L15;
          } else {
            if (jj.a(-1)) {
              nj.field_Q = 1;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if ((nj.field_Q ^ -1) == -2) {
            L17: {
              if (dh.field_D == 0) {
                break L17;
              } else {
                ok.field_f = dh.a(73, ea.field_h);
                break L17;
              }
            }
            ke.field_k = nb.a(true, ed.field_h, param0 + 251, 1, false);
            oe.field_d = nb.a(true, jl.field_r, param0 ^ 261, 1, false);
            id.field_bc = nb.a(true, rf.field_c, 256, 1, false);
            nj.field_Q = 2;
            tm.field_d = ke.field_k;
            ej.field_t = oe.field_d;
            break L16;
          } else {
            break L16;
          }
        }
        L18: {
          if (-3 == (nj.field_Q ^ -1)) {
            L19: {
              if (null == ok.field_f) {
                break L19;
              } else {
                if (!ok.field_f.a(true)) {
                  break L19;
                } else {
                  if (!ok.field_f.a(12145, "")) {
                    ok.field_f = null;
                    break L19;
                  } else {
                    if (ok.field_f.a("", (byte) 90)) {
                      dn.a(ok.field_f, -128);
                      ok.field_f = null;
                      cc.j(0);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              }
            }
            if (ok.field_f != null) {
              break L18;
            } else {
              nj.field_Q = 3;
              break L18;
            }
          } else {
            break L18;
          }
        }
        L20: {
          if (nj.field_Q == 3) {
            if (!da.a(ke.field_k, id.field_bc, param0 ^ -6, oe.field_d)) {
              break L20;
            } else {
              if (fc.a(id.field_bc, param0 + -58)) {
                L21: {
                  L22: {
                    km.a(false);
                    fg.n(-6);
                    od.field_i = eb.field_q;
                    ck.field_a = false;
                    vi.a((byte) -127, ki.field_ib, id.field_bc, ke.field_k, oe.field_d);
                    if (ub.field_j) {
                      break L22;
                    } else {
                      if (null == uj.field_k) {
                        break L21;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L23: {
                    stackOut_104_0 = uj.field_k;
                    stackIn_106_0 = stackOut_104_0;
                    stackIn_105_0 = stackOut_104_0;
                    if (ub.field_j) {
                      stackOut_106_0 = (String) ((Object) stackIn_106_0);
                      stackOut_106_1 = 0;
                      stackIn_107_0 = stackOut_106_0;
                      stackIn_107_1 = stackOut_106_1;
                      break L23;
                    } else {
                      stackOut_105_0 = (String) ((Object) stackIn_105_0);
                      stackOut_105_1 = 1;
                      stackIn_107_0 = stackOut_105_0;
                      stackIn_107_1 = stackOut_105_1;
                      break L23;
                    }
                  }
                  L24: {
                    stackOut_107_0 = (String) ((Object) stackIn_107_0);
                    stackOut_107_1 = stackIn_107_1;
                    stackIn_109_0 = stackOut_107_0;
                    stackIn_109_1 = stackOut_107_1;
                    stackIn_108_0 = stackOut_107_0;
                    stackIn_108_1 = stackOut_107_1;
                    if (ub.field_j) {
                      stackOut_109_0 = (String) ((Object) stackIn_109_0);
                      stackOut_109_1 = stackIn_109_1;
                      stackOut_109_2 = 0;
                      stackIn_110_0 = stackOut_109_0;
                      stackIn_110_1 = stackOut_109_1;
                      stackIn_110_2 = stackOut_109_2;
                      break L24;
                    } else {
                      stackOut_108_0 = (String) ((Object) stackIn_108_0);
                      stackOut_108_1 = stackIn_108_1;
                      stackOut_108_2 = 1;
                      stackIn_110_0 = stackOut_108_0;
                      stackIn_110_1 = stackOut_108_1;
                      stackIn_110_2 = stackOut_108_2;
                      break L24;
                    }
                  }
                  nm.a(stackIn_110_0, stackIn_110_1 != 0, stackIn_110_2 != 0, param0 + 7);
                  break L21;
                }
                L25: {
                  if (ud.field_q) {
                    qg.a((byte) 120);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (null != lk.field_cb) {
                    break L26;
                  } else {
                    lk.field_cb = vn.c((byte) 83);
                    ji.field_e = ue.a((byte) 62);
                    break L26;
                  }
                }
                da.a(id.field_bc, 73, ji.field_e, lk.field_cb);
                oe.field_d = null;
                ke.field_k = null;
                id.field_bc = null;
                e.a((java.applet.Applet) (this), false);
                cc.j(param0 + -5);
                nj.field_Q = 10;
                break L20;
              } else {
                break L20;
              }
            }
          } else {
            break L20;
          }
        }
        L27: {
          if ((nj.field_Q ^ -1) == -11) {
            L28: {
              if (dh.field_D != 0) {
                pl.field_S = dh.a(param0 + -99, kd.field_p);
                break L28;
              } else {
                break L28;
              }
            }
            nj.field_Q = 11;
            break L27;
          } else {
            break L27;
          }
        }
        L29: {
          if (nj.field_Q == 11) {
            L30: {
              if (pl.field_S == null) {
                break L30;
              } else {
                L31: {
                  if (!pl.field_S.a(true)) {
                    break L31;
                  } else {
                    if (!pl.field_S.a(25)) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                mc.a(ka.a((byte) -119, nm.field_t, jk.field_g, pl.field_S), 0.0f, -21801);
                break L29;
              }
            }
            nj.field_Q = 12;
            rm.field_f = true;
            break L29;
          } else {
            break L29;
          }
        }
        L32: {
          if ((nj.field_Q ^ -1) == -13) {
            if (rm.field_f) {
              break L32;
            } else {
              nj.field_Q = 13;
              break L32;
            }
          } else {
            break L32;
          }
        }
        L33: {
          if (nj.field_Q != 13) {
            if (param1) {
              break L33;
            } else {
              if (!ti.field_x) {
                break L33;
              } else {
                pa.a(sl.field_n, 9174);
                this.a(false);
                hg.a((byte) -93, sl.field_n);
                break L33;
              }
            }
          } else {
            if (param1) {
              break L33;
            } else {
              if (!ti.field_x) {
                break L33;
              } else {
                pa.a(sl.field_n, 9174);
                this.a(false);
                hg.a((byte) -93, sl.field_n);
                break L33;
              }
            }
          }
        }
        L34: {
          if (dg.field_h[8]) {
            sa.a((byte) -110);
            break L34;
          } else {
            break L34;
          }
        }
    }

    private final void g(byte param0) {
        if (param0 != -112) {
            this.i(67);
        }
        String var2 = qh.k(8347);
        ic.a(param0 + -14, var2, wl.d((byte) -21));
    }

    final void h(int param0) {
        int var2 = 0;
        na var3 = null;
        int var4 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        L0: {
          var4 = SteelSentinels.field_G;
          if (param0 > 40) {
            break L0;
          } else {
            this.l(8);
            break L0;
          }
        }
        L1: {
          var2 = ch.field_N;
          if (var2 >= 64) {
            break L1;
          } else {
            if (dg.field_h[var2]) {
              if (0 != var2) {
                L2: {
                  if (1 != var2) {
                    if (2 == var2) {
                      g.b(-116);
                      break L2;
                    } else {
                      if ((var2 ^ -1) != -4) {
                        if (-5 == (var2 ^ -1)) {
                          na.a(true);
                          break L2;
                        } else {
                          if ((var2 ^ -1) == -6) {
                            be.a(-16786);
                            break L2;
                          } else {
                            if ((var2 ^ -1) == -7) {
                              pm.k(113);
                              break L2;
                            } else {
                              if ((var2 ^ -1) != -8) {
                                if (-9 == (var2 ^ -1)) {
                                  al.a(hb.field_i, false, rf.field_d, jg.field_f);
                                  break L2;
                                } else {
                                  if ((var2 ^ -1) == -17) {
                                    wa.b(-76);
                                    break L2;
                                  } else {
                                    L3: {
                                      if ((var2 ^ -1) == -12) {
                                        break L3;
                                      } else {
                                        if (var2 == 12) {
                                          break L3;
                                        } else {
                                          if ((var2 ^ -1) != -14) {
                                            if (var2 != 17) {
                                              if (var2 != 18) {
                                                sj.a("MGS1: " + ci.a((byte) 94), -27, (Throwable) null);
                                                pm.m(-93);
                                                break L2;
                                              } else {
                                                oc.a(false);
                                                break L2;
                                              }
                                            } else {
                                              this.l(3894);
                                              break L2;
                                            }
                                          } else {
                                            te.a(2);
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                    L4: {
                                      stackOut_29_0 = -98;
                                      stackIn_31_0 = stackOut_29_0;
                                      stackIn_30_0 = stackOut_29_0;
                                      if (12 != var2) {
                                        stackOut_31_0 = stackIn_31_0;
                                        stackOut_31_1 = 0;
                                        stackIn_32_0 = stackOut_31_0;
                                        stackIn_32_1 = stackOut_31_1;
                                        break L4;
                                      } else {
                                        stackOut_30_0 = stackIn_30_0;
                                        stackOut_30_1 = 1;
                                        stackIn_32_0 = stackOut_30_0;
                                        stackIn_32_1 = stackOut_30_1;
                                        break L4;
                                      }
                                    }
                                    var3 = eb.a((byte) stackIn_32_0, stackIn_32_1 != 0);
                                    bg.a(var3, -69);
                                    break L2;
                                  }
                                }
                              } else {
                                this.g((byte) -112);
                                break L2;
                              }
                            }
                          }
                        }
                      } else {
                        cd.a(0);
                        break L2;
                      }
                    }
                  } else {
                    bi.a(2158);
                    break L2;
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              break L1;
            }
          }
        }
        sj.a("MGS2: " + ci.a((byte) 94), -85, (Throwable) null);
        pm.m(-94);
    }

    private final void i(int param0) {
        dg.field_h[6] = true;
        if (param0 <= 11) {
            String var3 = (String) null;
            this.a(12, (String) null, -17, -112, 117);
        }
    }

    private final void a(boolean param0, boolean param1) {
        dg.field_h[3] = true;
        dg.field_h[8] = param1;
        dg.field_h[7] = true;
        dg.field_h[16] = true;
        dg.field_h[18] = true;
        dg.field_h[0] = param0;
        dg.field_h[17] = true;
    }

    protected n() {
    }

    private final void c(boolean param0) {
        f.field_B[18] = 1;
        f.field_B[3] = -1;
        f.field_B[2] = -2;
        f.field_B[11] = -1;
        f.field_B[6] = -2;
        if (!param0) {
            return;
        }
        f.field_B[12] = -1;
        f.field_B[13] = -1;
        f.field_B[7] = -1;
        f.field_B[17] = -1;
        f.field_B[1] = 16;
        f.field_B[16] = -1;
        f.field_B[4] = -1;
        f.field_B[5] = -1;
        f.field_B[10] = -1;
        f.field_B[8] = -2;
        f.field_B[9] = -1;
    }

    static {
        field_o = "Spectating <%0>'s game";
        field_z = new int[]{0, 55, 57, 62, 65, 69, 72, 75, 79, 84, 88, 92};
        field_p = new int[8192];
        field_s = new boolean[][]{null, null, new boolean[]{false, false, false, false, false, true}};
        field_y = "<%0> has withdrawn the request to join.";
    }
}
