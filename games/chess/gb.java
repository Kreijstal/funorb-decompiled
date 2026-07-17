/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class gb extends fa {
    private int field_x;
    static long field_t;
    private int field_y;
    private boolean field_n;
    static int[] field_A;
    private int field_m;
    String field_w;
    private boolean field_u;
    private int field_v;
    static String field_o;
    private int field_r;
    private long field_p;
    private int field_q;
    private boolean field_z;
    static int field_s;

    private final void h() {
        int var2 = 0;
        wc.field_t[2] = true;
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        int discarded$0 = 101;
        int discarded$1 = 1;
        this.a();
        if (param1 != 10231) {
            Object var9 = null;
            this.a(true, -127, (String) null, -38, 34);
        }
        if (!(!param4)) {
            this.k(13);
        }
        if (!(!param3)) {
            int discarded$2 = -81;
            this.h();
        }
        if (!(!param2)) {
            this.j(param1 ^ 10227);
        }
        if (!(!param5)) {
            this.g(5);
        }
        if (!(!param6)) {
            this.h(18);
        }
        if (param0) {
            int discarded$3 = -62;
            this.g();
        }
    }

    public static void f() {
        field_o = null;
        field_A = null;
    }

    final void b(boolean param0) {
        int var2 = 0;
        ld var3 = null;
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
        var4 = Chess.field_G;
        if (param0) {
          L0: {
            var2 = wg.field_B;
            if (var2 >= 64) {
              break L0;
            } else {
              if (!wc.field_t[var2]) {
                break L0;
              } else {
                if (var2 != 0) {
                  L1: {
                    if (var2 != 1) {
                      if (var2 == 2) {
                        wc.b((byte) -45);
                        break L1;
                      } else {
                        if (3 == var2) {
                          nb.a(param0);
                          break L1;
                        } else {
                          if (var2 != 4) {
                            if (var2 == 5) {
                              gg.b((byte) 84);
                              break L1;
                            } else {
                              if (var2 != 6) {
                                if (var2 == 7) {
                                  int discarded$6 = -109;
                                  this.i();
                                  break L1;
                                } else {
                                  if (var2 == 8) {
                                    pa.a(sb.field_sb, true, (p) (Object) tk.field_h, oc.field_l);
                                    break L1;
                                  } else {
                                    if (16 == var2) {
                                      int discarded$7 = 49;
                                      aj.a();
                                      break L1;
                                    } else {
                                      L2: {
                                        if (var2 == 11) {
                                          break L2;
                                        } else {
                                          if (12 == var2) {
                                            break L2;
                                          } else {
                                            if (13 != var2) {
                                              if (var2 == 17) {
                                                this.d(-127);
                                                break L1;
                                              } else {
                                                if (var2 == 18) {
                                                  si.a((byte) -121);
                                                  break L1;
                                                } else {
                                                  fg.a((Throwable) null, (byte) -77, "MGS1: " + tm.b((byte) -124));
                                                  si.d(65280);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              int discarded$8 = 115;
                                              am.a();
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                      L3: {
                                        stackOut_29_0 = 0;
                                        stackIn_31_0 = stackOut_29_0;
                                        stackIn_30_0 = stackOut_29_0;
                                        if (var2 != 12) {
                                          stackOut_31_0 = stackIn_31_0;
                                          stackOut_31_1 = 0;
                                          stackIn_32_0 = stackOut_31_0;
                                          stackIn_32_1 = stackOut_31_1;
                                          break L3;
                                        } else {
                                          stackOut_30_0 = stackIn_30_0;
                                          stackOut_30_1 = 1;
                                          stackIn_32_0 = stackOut_30_0;
                                          stackIn_32_1 = stackOut_30_1;
                                          break L3;
                                        }
                                      }
                                      var3 = fa.a(stackIn_32_0, stackIn_32_1 != 0);
                                      d.a((byte) 126, var3);
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                int discarded$9 = 125;
                                pi.a();
                                break L1;
                              }
                            }
                          } else {
                            int discarded$10 = -243;
                            uj.a();
                            break L1;
                          }
                        }
                      }
                    } else {
                      int discarded$11 = 49;
                      dh.c();
                      break L1;
                    }
                  }
                  return;
                } else {
                  return;
                }
              }
            }
          }
          fg.a((Throwable) null, (byte) -77, "MGS2: " + tm.b((byte) -125));
          si.d(65280);
          return;
        } else {
          return;
        }
    }

    private final void g() {
        wc.field_t[13] = true;
        wc.field_t[12] = true;
        wc.field_t[11] = true;
    }

    final int l(int param0) {
        int var2 = 0;
        if (!((gb) this).field_g) {
          if (!nc.j(param0 ^ 127)) {
            return -1;
          } else {
            if (!bg.field_ab) {
              int discarded$2 = 1633075718;
              var2 = ji.a(((gb) this).field_y, true, si.f(), ob.d((byte) -99), (byte) 113, ((gb) this).field_z);
              if (var2 == -1) {
                return -1;
              } else {
                L0: {
                  if (param0 == var2) {
                    break L0;
                  } else {
                    if (var2 != 1) {
                      L1: {
                        if (!sk.field_p) {
                          ((gb) this).a("reconnect", -58);
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      dh.c(12);
                      jc.a(var2, n.field_c, (byte) 85);
                      bg.field_ab = true;
                      ma.field_E = 15000L + ud.a(param0 + 2);
                      return var2;
                    } else {
                      break L0;
                    }
                  }
                }
                L2: {
                  if (11 != rm.field_Q) {
                    break L2;
                  } else {
                    if (cf.field_Lb != 0) {
                      break L2;
                    } else {
                      gb.i(param0 ^ -29025);
                      break L2;
                    }
                  }
                }
                return var2;
              }
            } else {
              return -1;
            }
          }
        } else {
          return -1;
        }
    }

    private final static void i(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Chess.field_G;
        if (param0 != -29025) {
          return;
        } else {
          L0: {
            qf.field_g = null;
            cf.field_Nb = false;
            if (!dk.field_g) {
              L1: {
                var1 = gm.field_d;
                if (0 < var1) {
                  L2: {
                    if (var1 != 1) {
                      qf.field_g = oc.a(rc.field_c, new String[1], (byte) -113);
                      break L2;
                    } else {
                      qf.field_g = k.field_T;
                      break L2;
                    }
                  }
                  qf.field_g = tb.a((byte) 96, new CharSequence[3]);
                  break L1;
                } else {
                  break L1;
                }
              }
              ua.field_d.k((byte) -123);
              ri.g(127);
              break L0;
            } else {
              ua.field_d.n(24528);
              break L0;
            }
          }
          return;
        }
    }

    final void m(int param0) {
        int var2 = 0;
        int var3 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        L0: {
          L1: {
            var3 = Chess.field_G;
            if (vd.p(-60)) {
              L2: {
                stackOut_8_0 = this;
                stackOut_8_1 = 103;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_9_0 = stackOut_8_0;
                stackIn_9_1 = stackOut_8_1;
                if (null == rm.field_R) {
                  stackOut_10_0 = this;
                  stackOut_10_1 = stackIn_10_1;
                  stackOut_10_2 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  stackIn_11_2 = stackOut_10_2;
                  break L2;
                } else {
                  stackOut_9_0 = this;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L2;
                }
              }
              int discarded$12 = this.a((byte) stackIn_11_1, stackIn_11_2 != 0, false);
              break L1;
            } else {
              if (10 <= il.field_a) {
                if (!mk.b((byte) -119)) {
                  int discarded$13 = 0;
                  ni.b();
                  break L1;
                } else {
                  if (0 == rm.field_Q) {
                    int discarded$14 = this.a((byte) 110, false, false);
                    break L1;
                  } else {
                    cf.a(fl.field_p, (byte) -101);
                    break L1;
                  }
                }
              } else {
                var2 = -56 / ((param0 - 35) / 41);
                break L0;
              }
            }
          }
          var2 = -56 / ((param0 - 35) / 41);
          break L0;
        }
    }

    private final void a(boolean param0, int param1, String param2, int param3, int param4) {
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
              if (!((gb) this).a(48)) {
                return;
              } else {
                L1: {
                  L2: {
                    ((gb) this).field_w = ((gb) this).getCodeBase().getHost();
                    var6_ref2 = ((gb) this).field_w.toLowerCase();
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
                  ((gb) this).field_z = stackIn_8_1 != 0;
                  ((gb) this).field_r = Integer.parseInt(((gb) this).getParameter("gameport1"));
                  ((gb) this).field_m = Integer.parseInt(((gb) this).getParameter("gameport2"));
                  var7 = ((gb) this).getParameter("servernum");
                  if (var7 == null) {
                    break L3;
                  } else {
                    ((gb) this).field_x = Integer.parseInt(var7);
                    break L3;
                  }
                }
                L4: {
                  ((gb) this).field_q = Integer.parseInt(((gb) this).getParameter("gamecrc"));
                  ((gb) this).field_p = Long.parseLong(((gb) this).getParameter("instanceid"));
                  ((gb) this).field_u = ((gb) this).getParameter("member").equals((Object) (Object) "yes");
                  var8 = ((gb) this).getParameter("lang");
                  if (var8 != null) {
                    ((gb) this).field_v = Integer.parseInt(var8);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (((gb) this).field_v < 5) {
                    break L5;
                  } else {
                    ((gb) this).field_v = 0;
                    break L5;
                  }
                }
                L6: {
                  var9 = ((gb) this).getParameter("affid");
                  if (var9 != null) {
                    ((gb) this).field_y = Integer.parseInt(var9);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                se.field_X = Boolean.valueOf(((gb) this).getParameter("simplemode")).booleanValue();
                ((gb) this).a(param4, -117, param2, ((gb) this).field_q, 32, param3, param1);
                break L0;
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L7: {
              var6 = (Exception) (Object) decompiledCaughtException;
              var10 = null;
              fg.a((Throwable) (Object) var6, (byte) -77, (String) null);
              ((gb) this).a("crash", -58);
              break L7;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L8: {
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var6_ref;
            stackOut_22_1 = new StringBuilder().append("gb.FB(").append(1).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
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
          throw fk.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    private final void c(boolean param0) {
        sk.field_r[12] = -1;
        sk.field_r[17] = -1;
        sk.field_r[2] = -2;
        sk.field_r[3] = -1;
        sk.field_r[11] = -1;
        sk.field_r[5] = -1;
        sk.field_r[6] = -2;
        sk.field_r[8] = -2;
        sk.field_r[10] = -1;
        sk.field_r[7] = -1;
        sk.field_r[18] = 1;
        sk.field_r[13] = -1;
        sk.field_r[16] = -1;
        sk.field_r[9] = -1;
        sk.field_r[1] = 16;
        sk.field_r[4] = -1;
    }

    private final void a() {
        wc.field_t[18] = true;
        wc.field_t[7] = true;
        wc.field_t[0] = true;
        wc.field_t[17] = true;
        wc.field_t[3] = true;
        wc.field_t[16] = true;
        wc.field_t[8] = true;
    }

    private final static void e() {
        li.field_f = null;
        ga.field_a = null;
    }

    final int b(byte param0, boolean param1) {
        if (param0 != 68) {
            return 67;
        }
        return this.a((byte) 96, param1, true);
    }

    private final void j(int param0) {
        wc.field_t[param0] = true;
    }

    private final void h(int param0) {
        wc.field_t[6] = true;
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        Object var5 = null;
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
              this.a(true, param1, param2, 640, 480);
              if (param0 == 16742) {
                break L1;
              } else {
                var5 = null;
                ((gb) this).a(110, -96, (String) null);
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
            stackOut_3_1 = new StringBuilder().append("gb.BB(").append(param0).append(44).append(param1).append(44);
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
          throw fk.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void b(boolean param0, byte param1) {
        int var3 = 0;
        java.awt.Dimension var4_ref_java_awt_Dimension = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_22_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_102_1 = 0;
        String stackIn_102_2 = null;
        int stackIn_103_0 = 0;
        int stackIn_103_1 = 0;
        String stackIn_103_2 = null;
        int stackIn_104_0 = 0;
        int stackIn_104_1 = 0;
        String stackIn_104_2 = null;
        int stackIn_104_3 = 0;
        int stackIn_134_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_100_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_101_0 = 0;
        int stackOut_101_1 = 0;
        String stackOut_101_2 = null;
        int stackOut_103_0 = 0;
        int stackOut_103_1 = 0;
        String stackOut_103_2 = null;
        int stackOut_103_3 = 0;
        int stackOut_102_0 = 0;
        int stackOut_102_1 = 0;
        String stackOut_102_2 = null;
        int stackOut_102_3 = 0;
        int stackOut_133_0 = 0;
        int stackOut_132_0 = 0;
        L0: {
          var5 = Chess.field_G;
          if (null == ch.field_gb) {
            break L0;
          } else {
            L1: {
              if (null != rm.field_R) {
                break L1;
              } else {
                int discarded$19 = -110;
                var6 = a.a();
                var4_ref_java_awt_Dimension = var6.getSize();
                ch.field_gb.a(var4_ref_java_awt_Dimension.width, -83, var4_ref_java_awt_Dimension.height);
                break L1;
              }
            }
            ch.field_gb.a(0);
            break L0;
          }
        }
        L2: {
          int discarded$20 = 12;
          cb.a();
          int discarded$21 = 1;
          fl.a();
          int discarded$22 = 30065;
          if (je.h()) {
            break L2;
          } else {
            if (11 != rm.field_Q) {
              int discarded$23 = 114;
              e.i();
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (ii.field_L == null) {
            break L3;
          } else {
            fl.field_p = ii.field_L.a((byte) -91);
            break L3;
          }
        }
        L4: {
          int discarded$24 = 21549;
          if (!ub.a()) {
            break L4;
          } else {
            L5: {
              int discarded$25 = -31137;
              var3 = qd.d() * 1200;
              if (((gb) this).field_n) {
                break L5;
              } else {
                int discarded$26 = -16;
                if (~ea.h() >= ~var3) {
                  break L4;
                } else {
                  if (var3 >= ib.a(true)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((gb) this).field_n = false;
            si.d(65280);
            dh.c(12);
            jc.a(2, fe.field_e, (byte) 97);
            int discarded$27 = -121;
            ia.a();
            bg.field_ab = true;
            ma.field_E = 15000L + ud.a(2);
            break L4;
          }
        }
        L6: {
          L7: {
            var3 = 117 % ((param1 - 65) / 32);
            if (cf.field_Lb == -1) {
              break L7;
            } else {
              if (cf.field_Lb == 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (-1 != cf.field_Lb) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L8;
            } else {
              stackOut_20_0 = 1;
              stackIn_22_0 = stackOut_20_0;
              break L8;
            }
          }
          L9: {
            var4 = stackIn_22_0;
            int discarded$28 = -98;
            cf.field_Lb = la.a();
            if (var4 == 0) {
              break L9;
            } else {
              if (cf.field_Lb != 0) {
                break L9;
              } else {
                if (rm.field_Q != 11) {
                  break L9;
                } else {
                  if (nc.j(125)) {
                    break L9;
                  } else {
                    gb.i(-29025);
                    break L9;
                  }
                }
              }
            }
          }
          if (-1 == cf.field_Lb) {
            break L6;
          } else {
            if (0 == cf.field_Lb) {
              break L6;
            } else {
              ma.field_E = 15000L + ud.a(2);
              break L6;
            }
          }
        }
        L10: {
          if (cf.field_Lb == -1) {
            break L10;
          } else {
            if (cf.field_Lb != 0) {
              if (10 > il.field_a) {
                if (cf.field_Lb != 3) {
                  if (4 == cf.field_Lb) {
                    ((gb) this).a("js5io", -58);
                    break L10;
                  } else {
                    if (cf.field_Lb == 2) {
                      ((gb) this).a("js5connect_full", -58);
                      break L10;
                    } else {
                      if (cf.field_Lb != 5) {
                        ((gb) this).a("js5connect", -58);
                        break L10;
                      } else {
                        ((gb) this).a("outofdate", -58);
                        break L10;
                      }
                    }
                  }
                } else {
                  ((gb) this).a("js5crc", -58);
                  break L10;
                }
              } else {
                if (rm.field_Q >= 10) {
                  L11: {
                    dh.c(12);
                    if (cf.field_Lb == 3) {
                      jc.a(256, ti.field_b, (byte) 109);
                      break L11;
                    } else {
                      if (cf.field_Lb == 4) {
                        jc.a(256, fb.field_F, (byte) -49);
                        break L11;
                      } else {
                        if (cf.field_Lb != 2) {
                          if (5 == cf.field_Lb) {
                            jc.a(5, rb.field_a, (byte) -126);
                            break L11;
                          } else {
                            jc.a(256, wh.field_d, (byte) -66);
                            break L11;
                          }
                        } else {
                          jc.a(256, b.field_h, (byte) 122);
                          break L11;
                        }
                      }
                    }
                  }
                  bg.field_ab = true;
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
              if (cf.field_Lb == -1) {
                break L14;
              } else {
                if (cf.field_Lb != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!nc.j(121)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (~ud.a(2) <= ~ma.field_E) {
            bg.field_ab = false;
            if (cf.field_Lb == -1) {
              break L12;
            } else {
              if (0 == cf.field_Lb) {
                break L12;
              } else {
                cf.field_Lb = -1;
                ta.b(0);
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (cf.field_Lb != 0) {
            break L15;
          } else {
            if (!nc.j(121)) {
              gg.field_n = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (0 == il.field_a) {
            int discarded$29 = 25331;
            if (oh.a()) {
              il.field_a = 1;
              break L16;
            } else {
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (il.field_a == 1) {
            L18: {
              if (se.field_V != 0) {
                qa.field_c = ri.a(dh.field_c, (byte) 127);
                break L18;
              } else {
                break L18;
              }
            }
            fl.field_m = sh.a(1, nk.field_q, true, 935, false);
            Chess.field_B = sh.a(1, m.field_b, true, 935, false);
            bi.field_a = sh.a(1, kf.field_u, true, 935, false);
            hm.field_e = fl.field_m;
            f.field_b = Chess.field_B;
            il.field_a = 2;
            break L17;
          } else {
            break L17;
          }
        }
        L19: {
          if (il.field_a != 2) {
            break L19;
          } else {
            L20: {
              if (null == qa.field_c) {
                break L20;
              } else {
                if (!qa.field_c.c((byte) 124)) {
                  break L20;
                } else {
                  if (!qa.field_c.a(4, "")) {
                    qa.field_c = null;
                    break L20;
                  } else {
                    if (qa.field_c.b("", 100)) {
                      gm.a(qa.field_c, -44);
                      qa.field_c = null;
                      int discarded$30 = 0;
                      ob.f();
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                }
              }
            }
            if (null == qa.field_c) {
              il.field_a = 3;
              break L19;
            } else {
              break L19;
            }
          }
        }
        L21: {
          if (il.field_a != 3) {
            break L21;
          } else {
            if (!vi.a(fl.field_m, 99, Chess.field_B, bi.field_a)) {
              break L21;
            } else {
              if (ml.a(0, bi.field_a)) {
                L22: {
                  L23: {
                    int discarded$31 = -5;
                    gb.e();
                    int discarded$32 = -119;
                    ag.a();
                    vh.field_e = false;
                    ih.field_T = ca.field_c;
                    n.a(fl.field_m, bi.field_a, ln.field_Kb, 0, Chess.field_B);
                    if (gf.field_e) {
                      break L23;
                    } else {
                      if (kg.field_O != null) {
                        break L23;
                      } else {
                        break L22;
                      }
                    }
                  }
                  L24: {
                    if (gf.field_e) {
                      stackOut_100_0 = 0;
                      stackIn_101_0 = stackOut_100_0;
                      break L24;
                    } else {
                      stackOut_99_0 = 1;
                      stackIn_101_0 = stackOut_99_0;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_101_0 = stackIn_101_0;
                    stackOut_101_1 = 2;
                    stackOut_101_2 = kg.field_O;
                    stackIn_103_0 = stackOut_101_0;
                    stackIn_103_1 = stackOut_101_1;
                    stackIn_103_2 = stackOut_101_2;
                    stackIn_102_0 = stackOut_101_0;
                    stackIn_102_1 = stackOut_101_1;
                    stackIn_102_2 = stackOut_101_2;
                    if (gf.field_e) {
                      stackOut_103_0 = stackIn_103_0;
                      stackOut_103_1 = stackIn_103_1;
                      stackOut_103_2 = (String) (Object) stackIn_103_2;
                      stackOut_103_3 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      stackIn_104_2 = stackOut_103_2;
                      stackIn_104_3 = stackOut_103_3;
                      break L25;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = (String) (Object) stackIn_102_2;
                      stackOut_102_3 = 1;
                      stackIn_104_0 = stackOut_102_0;
                      stackIn_104_1 = stackOut_102_1;
                      stackIn_104_2 = stackOut_102_2;
                      stackIn_104_3 = stackOut_102_3;
                      break L25;
                    }
                  }
                  nj.a(stackIn_104_0 != 0, stackIn_104_1, stackIn_104_2, stackIn_104_3 != 0);
                  break L22;
                }
                L26: {
                  if (se.field_X) {
                    int discarded$33 = 1;
                    jg.b();
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (pe.field_f == null) {
                    pe.field_f = ke.a(-27212);
                    int discarded$34 = 46;
                    qf.field_i = rb.a();
                    break L27;
                  } else {
                    break L27;
                  }
                }
                kh.a((byte) -127, pe.field_f, qf.field_i, bi.field_a);
                bi.field_a = null;
                Chess.field_B = null;
                fl.field_m = null;
                ml.a((java.applet.Applet) this, (byte) -43);
                int discarded$35 = 0;
                ob.f();
                il.field_a = 10;
                break L21;
              } else {
                break L21;
              }
            }
          }
        }
        L28: {
          if (10 == il.field_a) {
            L29: {
              if (se.field_V != 0) {
                td.field_o = ri.a(rm.field_U, (byte) 127);
                break L29;
              } else {
                break L29;
              }
            }
            il.field_a = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (il.field_a != 11) {
            break L30;
          } else {
            L31: {
              if (null == td.field_o) {
                break L31;
              } else {
                L32: {
                  if (!td.field_o.c((byte) 123)) {
                    break L32;
                  } else {
                    if (!td.field_o.b((byte) -40)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                nj.a(-20, da.a(uk.field_a, e.field_T, td.field_o, -123), 0.0f);
                break L30;
              }
            }
            il.field_a = 12;
            ic.field_b = true;
            break L30;
          }
        }
        L33: {
          if (il.field_a == 12) {
            if (ic.field_b) {
              break L33;
            } else {
              il.field_a = 13;
              break L33;
            }
          } else {
            break L33;
          }
        }
        L34: {
          if (il.field_a != 13) {
            break L34;
          } else {
            L35: {
              var4 = 1;
              if (null == wj.field_c) {
                break L35;
              } else {
                L36: {
                  if (!wj.field_c.b(-1)) {
                    stackOut_133_0 = 0;
                    stackIn_134_0 = stackOut_133_0;
                    break L36;
                  } else {
                    stackOut_132_0 = 1;
                    stackIn_134_0 = stackOut_132_0;
                    break L36;
                  }
                }
                var4 = stackIn_134_0;
                nj.a(-20, wj.field_c.field_d, wj.field_c.field_i);
                break L35;
              }
            }
            if (var4 == 0) {
              break L34;
            } else {
              il.field_a = 20;
              break L34;
            }
          }
        }
        L37: {
          if (param0) {
            break L37;
          } else {
            if (!hf.field_a) {
              break L37;
            } else {
              int discarded$36 = -114;
              kl.a(ja.field_h);
              ((gb) this).d((byte) 125);
              ca.a(13369344, ja.field_h);
              break L37;
            }
          }
        }
        L38: {
          if (!wc.field_t[8]) {
            break L38;
          } else {
            int discarded$37 = 8;
            jj.c();
            break L38;
          }
        }
    }

    private final void i() {
        int discarded$0 = -54;
        String var2 = rf.a();
        qa.a((byte) 26, var2, bh.i(81));
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        if (param6 != -4) {
            field_o = null;
        }
        var10.pack();
        var10.dispose();
        ((gb) this).setBackground(java.awt.Color.black);
        se.field_V = ((gb) this).field_v;
        sc.a(se.field_V, false);
        jn.a(((gb) this).field_u, oc.field_l, ((gb) this).field_w, se.field_V, ((gb) this).field_r, 5000, ((gb) this).field_x, ((gb) this).field_p, (byte) -121, 5000, param5, ((gb) this).field_m, param4, ((gb) this).field_q);
        jb.a(350, ((gb) this).field_w, se.field_V, param4, ((gb) this).field_r, oc.field_l, ((gb) this).field_q, ((gb) this).field_x, ((gb) this).field_m);
        int discarded$0 = 69;
        bf.g();
        ii.field_L = sa.b(param6 + 28);
        ca.a(13369344, ja.field_h);
        nk.field_q = param2;
        kf.field_u = param0;
        dh.field_c = param3;
        m.field_b = param7;
        rm.field_U = param1;
        this.c(false);
        int discarded$1 = 0;
        ug.b();
    }

    private final void k(int param0) {
        wc.field_t[1] = true;
    }

    private final int a(byte param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            Object var9 = null;
            Object var10 = null;
            Boolean var11 = null;
            p var12 = null;
            Throwable decompiledCaughtException = null;
            var8 = Chess.field_G;
            if (param0 >= 95) {
              var4 = jb.a((byte) 93, fl.field_p, param1, se.field_V);
              if (var4 == 0) {
                throw new IllegalStateException();
              } else {
                L0: {
                  if (var4 == 1) {
                    L1: {
                      int discarded$10 = -12316;
                      int discarded$11 = 117;
                      int discarded$12 = 1;
                      var5_int = cg.a(pg.a(), n.a());
                      if (var5_int == -1) {
                        break L1;
                      } else {
                        v.a(31689, var5_int, n.field_c, sa.field_b);
                        sa.field_b = null;
                        n.field_c = null;
                        break L1;
                      }
                    }
                    var11 = mk.a(-28850);
                    if (var11 != null) {
                      cl.a(-1, var11.booleanValue());
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
                    int discarded$13 = -5;
                    int discarded$14 = 1633075718;
                    var5_int = nj.a(true, ob.d((byte) -126), ((gb) this).field_y, od.a(), jb.f(-127), Chess.t(0), si.f());
                    if (var5_int == -1) {
                      break L2;
                    } else {
                      lk.a(sa.field_b, 255, var5_int, n.field_c);
                      n.field_c = null;
                      sa.field_b = null;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (var4 != 3) {
                    break L3;
                  } else {
                    L4: {
                      if (-1 == cf.field_Lb) {
                        break L4;
                      } else {
                        if (cf.field_Lb != 0) {
                          cf.field_Lb = -1;
                          ta.b(0);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (param2) {
                      bg.field_ab = false;
                      break L3;
                    } else {
                      int discarded$15 = 1633075718;
                      var5_int = ji.a(((gb) this).field_y, false, si.f(), ob.d((byte) -119), (byte) 82, ((gb) this).field_z);
                      if (var5_int != -1) {
                        if (0 != var5_int) {
                          jc.a(var5_int, n.field_c, (byte) 81);
                          n.field_c = null;
                          break L3;
                        } else {
                          gi.field_e = sj.field_i;
                          gb.i(-29025);
                          ad.field_b = false;
                          rm.field_Q = 10;
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
                    if (!ln.field_Kb) {
                      rm.field_Q = 10;
                      ad.field_b = true;
                      break L5;
                    } else {
                      int discarded$16 = -161;
                      gh.a(bh.i(81));
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
                    int discarded$17 = 1;
                    dh.a(bh.i(81));
                    break L6;
                  }
                }
                L7: {
                  if (6 != var4) {
                    break L7;
                  } else {
                    if (vh.field_e) {
                      rm.field_Q = 10;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (var4 != 7) {
                    break L8;
                  } else {
                    ak.a(false, bh.i(81));
                    break L8;
                  }
                }
                L9: {
                  if (var4 == 8) {
                    int discarded$18 = -161;
                    gh.a(bh.i(81));
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (var4 == 9) {
                    le.a(126, bh.i(81));
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var4 != 10) {
                    break L11;
                  } else {
                    qn.field_U.f(17, -93);
                    break L11;
                  }
                }
                L12: {
                  if (var4 == 11) {
                    jd.a((byte) -117, bh.i(81));
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (12 != var4) {
                    break L13;
                  } else {
                    int discarded$19 = 115;
                    sg.a(bh.i(81), (byte) 125, un.g());
                    break L13;
                  }
                }
                L14: {
                  if (var4 == 13) {
                    try {
                      L15: {
                        L16: {
                          if (ki.field_M != null) {
                            break L16;
                          } else {
                            ki.field_M = new qk(oc.field_l, new java.net.URL(((gb) this).getCodeBase(), "countrylist.ws"), 5000);
                            break L16;
                          }
                        }
                        L17: {
                          if (ki.field_M.a(17)) {
                            L18: {
                              var12 = ki.field_M.b(-120);
                              if (var12 != null) {
                                var7 = gh.a(var12.field_o, 0, -161, var12.field_l);
                                ge.a(var7, (byte) 107);
                                break L18;
                              } else {
                                var9 = null;
                                ge.a((String) null, (byte) 36);
                                break L18;
                              }
                            }
                            ki.field_M = null;
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
                        fg.a((Throwable) (Object) var5, (byte) -77, "S1");
                        var10 = null;
                        ge.a((String) null, (byte) 30);
                        ki.field_M = null;
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
                    rm.field_Q = 10;
                    break L20;
                  } else {
                    break L20;
                  }
                }
                if (var4 != 16) {
                  if (var4 != 17) {
                    return 0;
                  } else {
                    return 2;
                  }
                } else {
                  return 1;
                }
              }
            } else {
              return -100;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected gb() {
    }

    private final void d(int param0) {
        int var2 = tk.field_h.i(-121);
        int var3 = 0 != (var2 & 1) ? 1 : 0;
        int var4 = -1 + sb.field_sb;
        byte[] var5 = new byte[var4];
        tk.field_h.a(var4, var5, false, 0);
        fe.a(ad.a(-29410, var5), var3 != 0, (byte) 16, bh.i(81));
    }

    private final void g(int param0) {
        wc.field_t[5] = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Waiting for graphics";
    }
}
