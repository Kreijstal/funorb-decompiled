/*
 * Decompiled by CFR-JS 0.4.0.
 */
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

    private final void h(byte param0) {
        int var2 = -90 % ((27 - param0) / 58);
        wc.field_t[2] = true;
    }

    final void a(boolean param0, int param1, boolean param2, boolean param3, boolean param4, boolean param5, boolean param6) {
        this.a(true, (byte) 101);
        if (param1 != 10231) {
            String var9 = (String) null;
            this.a(true, -127, (String) null, -38, 34);
        }
        if (!(!param4)) {
            this.k(13);
        }
        if (!(!param3)) {
            this.h((byte) -81);
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
            this.g((byte) -62);
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 > -67) {
            gb.i(14);
        }
        field_A = null;
    }

    final void b(boolean param0) {
        int var2 = 0;
        ld var3 = null;
        int var4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        var4 = Chess.field_G;
        if (param0) {
          L0: {
            var2 = wg.field_B;
            if (-65 >= (var2 ^ -1)) {
              break L0;
            } else {
              if (!wc.field_t[var2]) {
                break L0;
              } else {
                if (-1 == (var2 ^ -1)) {
                  return;
                } else {
                  L1: {
                    if ((var2 ^ -1) != -2) {
                      if (-3 == (var2 ^ -1)) {
                        wc.b((byte) -45);
                        break L1;
                      } else {
                        if (3 == var2) {
                          nb.a(param0);
                          break L1;
                        } else {
                          if (-5 != (var2 ^ -1)) {
                            if ((var2 ^ -1) == -6) {
                              gg.b((byte) 84);
                              break L1;
                            } else {
                              if (var2 != 6) {
                                if (var2 == 7) {
                                  this.i((byte) -109);
                                  break L1;
                                } else {
                                  if (var2 == 8) {
                                    pa.a(sb.field_sb, true, tk.field_h, oc.field_l);
                                    break L1;
                                  } else {
                                    if (16 == var2) {
                                      aj.a((byte) 49);
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
                                              if ((var2 ^ -1) == -18) {
                                                this.d(-127);
                                                break L1;
                                              } else {
                                                if (-19 == (var2 ^ -1)) {
                                                  si.a((byte) -121);
                                                  break L1;
                                                } else {
                                                  fg.a((Throwable) null, (byte) -77, "MGS1: " + tm.b((byte) -124));
                                                  si.d(65280);
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              am.a((byte) 115);
                                              break L1;
                                            }
                                          }
                                        }
                                      }
                                      L3: {
                                        stackOut_28_0 = 0;
                                        stackIn_30_0 = stackOut_28_0;
                                        stackIn_29_0 = stackOut_28_0;
                                        if ((var2 ^ -1) != -13) {
                                          stackOut_30_0 = stackIn_30_0;
                                          stackOut_30_1 = 0;
                                          stackIn_31_0 = stackOut_30_0;
                                          stackIn_31_1 = stackOut_30_1;
                                          break L3;
                                        } else {
                                          stackOut_29_0 = stackIn_29_0;
                                          stackOut_29_1 = 1;
                                          stackIn_31_0 = stackOut_29_0;
                                          stackIn_31_1 = stackOut_29_1;
                                          break L3;
                                        }
                                      }
                                      var3 = fa.a(stackIn_31_0, stackIn_31_1 != 0);
                                      d.a((byte) 126, var3);
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                pi.a(125);
                                break L1;
                              }
                            }
                          } else {
                            uj.a(-243);
                            break L1;
                          }
                        }
                      }
                    } else {
                      dh.c((byte) 49);
                      break L1;
                    }
                  }
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

    private final void g(byte param0) {
        wc.field_t[13] = true;
        if (param0 != -62) {
            return;
        }
        wc.field_t[12] = true;
        wc.field_t[11] = true;
    }

    final int l(int param0) {
        int var2 = 0;
        if (!this.field_g) {
          if (!nc.j(param0 ^ 127)) {
            return -1;
          } else {
            if (!bg.field_ab) {
              var2 = ji.a(this.field_y, true, si.f(1633075718), ob.d((byte) -99), (byte) 113, this.field_z);
              if ((var2 ^ -1) == 0) {
                return -1;
              } else {
                L0: {
                  if (param0 == var2) {
                    if (11 == rm.field_Q) {
                      if (-1 == (cf.field_Lb ^ -1)) {
                        gb.i(param0 ^ -29025);
                        break L0;
                      } else {
                        return var2;
                      }
                    } else {
                      if (11 == rm.field_Q) {
                        if (-1 == (cf.field_Lb ^ -1)) {
                          gb.i(param0 ^ -29025);
                          break L0;
                        } else {
                          return var2;
                        }
                      } else {
                        return var2;
                      }
                    }
                  } else {
                    if (11 == rm.field_Q) {
                      if (-1 == (cf.field_Lb ^ -1)) {
                        gb.i(param0 ^ -29025);
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
                      qf.field_g = oc.a(rc.field_c, new String[]{Integer.toString(var1)}, (byte) -113);
                      break L2;
                    } else {
                      qf.field_g = k.field_T;
                      break L2;
                    }
                  }
                  qf.field_g = tb.a((byte) 96, new CharSequence[]{(CharSequence) ((Object) qf.field_g), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) bl.field_a)});
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
        int discarded$11 = 0;
        int discarded$12 = 0;
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
              discarded$11 = this.a((byte) stackIn_11_1, stackIn_11_2 != 0, false);
              break L1;
            } else {
              if (10 <= il.field_a) {
                if (!mk.b((byte) -119)) {
                  ni.b(0);
                  break L1;
                } else {
                  if (0 == rm.field_Q) {
                    discarded$12 = this.a((byte) 110, false, false);
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
        String var10 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
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
        Object stackOut_3_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_5_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
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
                if (!this.a(48)) {
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L2: {
                    L3: {
                      this.field_w = this.getCodeBase().getHost();
                      var6_ref2 = this.field_w.toLowerCase();
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
                    ((gb) (this)).field_z = stackIn_8_1 != 0;
                    this.field_r = Integer.parseInt(this.getParameter("gameport1"));
                    this.field_m = Integer.parseInt(this.getParameter("gameport2"));
                    var7 = this.getParameter("servernum");
                    if (var7 == null) {
                      break L4;
                    } else {
                      this.field_x = Integer.parseInt(var7);
                      break L4;
                    }
                  }
                  L5: {
                    this.field_q = Integer.parseInt(this.getParameter("gamecrc"));
                    this.field_p = Long.parseLong(this.getParameter("instanceid"));
                    this.field_u = this.getParameter("member").equals("yes");
                    var8 = this.getParameter("lang");
                    if (var8 != null) {
                      this.field_v = Integer.parseInt(var8);
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  L6: {
                    if (-6 < (this.field_v ^ -1)) {
                      break L6;
                    } else {
                      this.field_v = 0;
                      break L6;
                    }
                  }
                  L7: {
                    var9 = this.getParameter("affid");
                    if (var9 != null) {
                      this.field_y = Integer.parseInt(var9);
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  L8: {
                    if (param0) {
                      break L8;
                    } else {
                      field_t = -94L;
                      break L8;
                    }
                  }
                  se.field_X = Boolean.valueOf(this.getParameter("simplemode")).booleanValue();
                  this.a(param4, -117, param2, this.field_q, 32, param3, param1);
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L9: {
                var6 = (Exception) (Object) decompiledCaughtException;
                var10 = (String) null;
                fg.a((Throwable) ((Object) var6), (byte) -77, (String) null);
                this.a("crash", -58);
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
            stackOut_24_1 = new StringBuilder().append("gb.FB(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(boolean param0) {
        if (param0) {
            field_t = 121L;
        }
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

    private final void a(boolean param0, byte param1) {
        wc.field_t[18] = true;
        wc.field_t[7] = true;
        wc.field_t[0] = true;
        wc.field_t[17] = true;
        wc.field_t[3] = true;
        wc.field_t[16] = true;
        if (param1 < 92) {
            this.field_z = true;
        }
        wc.field_t[8] = param0;
    }

    private final static void e(int param0) {
        li.field_f = null;
        ga.field_a = null;
        if (param0 != -5) {
            gb.i(110);
        }
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
        if (param0 != 18) {
            this.b(false, (byte) 11);
        }
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        String var5 = null;
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
                var5 = (String) null;
                this.a(110, -96, (String) null);
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
            stackOut_3_1 = new StringBuilder().append("gb.BB(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
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
          throw fk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
                var6 = a.a((byte) -110);
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
          cb.a((byte) 12);
          fl.a(true);
          if (je.h(30065)) {
            break L2;
          } else {
            if (11 != rm.field_Q) {
              e.i((byte) 114);
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
          if (!ub.a(21549)) {
            break L4;
          } else {
            L5: {
              var3 = qd.d(-31137) * 1200;
              if (this.field_n) {
                break L5;
              } else {
                if ((ea.h((byte) -16) ^ -1) >= (var3 ^ -1)) {
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
            this.field_n = false;
            si.d(65280);
            dh.c(12);
            jc.a(2, fe.field_e, (byte) 97);
            ia.a((byte) -121);
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
              if ((cf.field_Lb ^ -1) == -1) {
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
            cf.field_Lb = la.a((byte) -98);
            if (var4 == 0) {
              break L9;
            } else {
              if (-1 != (cf.field_Lb ^ -1)) {
                break L9;
              } else {
                if ((rm.field_Q ^ -1) != -12) {
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
            if ((cf.field_Lb ^ -1) != -1) {
              if (10 > il.field_a) {
                if (-4 != (cf.field_Lb ^ -1)) {
                  if (4 == cf.field_Lb) {
                    this.a("js5io", -58);
                    break L10;
                  } else {
                    if (-3 == (cf.field_Lb ^ -1)) {
                      this.a("js5connect_full", -58);
                      break L10;
                    } else {
                      if ((cf.field_Lb ^ -1) != -6) {
                        this.a("js5connect", -58);
                        break L10;
                      } else {
                        this.a("outofdate", -58);
                        break L10;
                      }
                    }
                  }
                } else {
                  this.a("js5crc", -58);
                  break L10;
                }
              } else {
                if (-11 >= (rm.field_Q ^ -1)) {
                  L11: {
                    dh.c(12);
                    if (cf.field_Lb == 3) {
                      jc.a(256, ti.field_b, (byte) 109);
                      break L11;
                    } else {
                      if (-5 == (cf.field_Lb ^ -1)) {
                        jc.a(256, fb.field_F, (byte) -49);
                        break L11;
                      } else {
                        if ((cf.field_Lb ^ -1) != -3) {
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
                if ((cf.field_Lb ^ -1) != -1) {
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
          if ((ud.a(2) ^ -1L) <= (ma.field_E ^ -1L)) {
            bg.field_ab = false;
            if ((cf.field_Lb ^ -1) == 0) {
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
          if ((cf.field_Lb ^ -1) != -1) {
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
            if (oh.a(25331)) {
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
          if ((il.field_a ^ -1) == -2) {
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
          if ((il.field_a ^ -1) != -3) {
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
                      ob.f(0);
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
                    gb.e(-5);
                    ag.a((byte) -119);
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
                      stackOut_103_2 = (String) ((Object) stackIn_103_2);
                      stackOut_103_3 = 0;
                      stackIn_104_0 = stackOut_103_0;
                      stackIn_104_1 = stackOut_103_1;
                      stackIn_104_2 = stackOut_103_2;
                      stackIn_104_3 = stackOut_103_3;
                      break L25;
                    } else {
                      stackOut_102_0 = stackIn_102_0;
                      stackOut_102_1 = stackIn_102_1;
                      stackOut_102_2 = (String) ((Object) stackIn_102_2);
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
                    jg.b(true);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                L27: {
                  if (pe.field_f == null) {
                    pe.field_f = ke.a(-27212);
                    qf.field_i = rb.a((byte) 46);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                kh.a((byte) -127, pe.field_f, qf.field_i, bi.field_a);
                bi.field_a = null;
                Chess.field_B = null;
                fl.field_m = null;
                ml.a((java.applet.Applet) (this), (byte) -43);
                ob.f(0);
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
          if ((il.field_a ^ -1) != -12) {
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
          if (-13 == (il.field_a ^ -1)) {
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
          if (-14 != (il.field_a ^ -1)) {
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
              kl.a(ja.field_h, (byte) -114);
              this.d((byte) 125);
              ca.a(13369344, ja.field_h);
              break L37;
            }
          }
        }
        L38: {
          if (!wc.field_t[8]) {
            break L38;
          } else {
            jj.c(8);
            break L38;
          }
        }
    }

    private final void i(byte param0) {
        String var2 = rf.a((byte) -54);
        if (param0 != -109) {
            this.field_n = true;
        }
        qa.a((byte) 26, var2, bh.i(param0 ^ -62));
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        if (param6 != -4) {
            field_o = (String) null;
        }
        var10.pack();
        var10.dispose();
        this.setBackground(java.awt.Color.black);
        se.field_V = this.field_v;
        sc.a(se.field_V, false);
        jn.a(this.field_u, oc.field_l, this.field_w, se.field_V, this.field_r, 5000, this.field_x, this.field_p, (byte) -121, 5000, param5, this.field_m, param4, this.field_q);
        jb.a(350, this.field_w, se.field_V, param4, this.field_r, oc.field_l, this.field_q, this.field_x, this.field_m);
        bf.g((byte) 69);
        ii.field_L = sa.b(param6 + 28);
        ca.a(13369344, ja.field_h);
        nk.field_q = param2;
        kf.field_u = param0;
        dh.field_c = param3;
        m.field_b = param7;
        rm.field_U = param1;
        this.c(false);
        ug.b(false);
    }

    private final void k(int param0) {
        wc.field_t[1] = true;
        if (param0 != 13) {
            this.field_q = -85;
        }
    }

    private final int a(byte param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            int var8 = 0;
            String var9 = null;
            String var10 = null;
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
                  if (-2 == (var4 ^ -1)) {
                    L1: {
                      var5_int = cg.a(pg.a(-12316), n.a((byte) 117), true);
                      if (0 == (var5_int ^ -1)) {
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
                  if (-3 == (var4 ^ -1)) {
                    var5_int = nj.a(true, ob.d((byte) -126), this.field_y, od.a(-5), jb.f(-127), Chess.t(0), si.f(1633075718));
                    if ((var5_int ^ -1) == 0) {
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
                  if (-4 != (var4 ^ -1)) {
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
                      var5_int = ji.a(this.field_y, false, si.f(1633075718), ob.d((byte) -119), (byte) 82, this.field_z);
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
                      gh.a(bh.i(81), -161);
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
                    dh.a(bh.i(81), true);
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
                  if (-8 != (var4 ^ -1)) {
                    break L8;
                  } else {
                    ak.a(false, bh.i(81));
                    break L8;
                  }
                }
                L9: {
                  if (var4 == 8) {
                    gh.a(bh.i(81), -161);
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
                  if (-11 != (var4 ^ -1)) {
                    break L11;
                  } else {
                    qn.field_U.f(17, -93);
                    break L11;
                  }
                }
                L12: {
                  if ((var4 ^ -1) == -12) {
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
                    sg.a(bh.i(81), (byte) 125, un.g(115));
                    break L13;
                  }
                }
                L14: {
                  if (-14 == (var4 ^ -1)) {
                    try {
                      L15: {
                        L16: {
                          if (ki.field_M != null) {
                            break L16;
                          } else {
                            ki.field_M = new qk(oc.field_l, new java.net.URL(this.getCodeBase(), "countrylist.ws"), 5000);
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
                                var9 = (String) null;
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
                        fg.a((Throwable) ((Object) var5), (byte) -77, "S1");
                        var10 = (String) null;
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
                if ((var4 ^ -1) != -17) {
                  if (-18 == (var4 ^ -1)) {
                    return 2;
                  } else {
                    return 0;
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
        if (param0 >= -110) {
            this.field_p = 64L;
        }
        tk.field_h.a(var4, var5, false, 0);
        fe.a(ad.a(-29410, var5), var3 != 0, (byte) 16, bh.i(81));
    }

    private final void g(int param0) {
        wc.field_t[param0] = true;
    }

    static {
        field_o = "Waiting for graphics";
    }
}
