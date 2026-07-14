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
            Object var9 = null;
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
                if (-1 == var2) {
                  return;
                } else {
                  L1: {
                    if (var2 != -2) {
                      if (-3 == var2) {
                        wc.b((byte) -45);
                        break L1;
                      } else {
                        if (3 == var2) {
                          nb.a(param0);
                          break L1;
                        } else {
                          if (-5 != var2) {
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
                                    pa.a(sb.field_sb, true, (p) (Object) tk.field_h, oc.field_l);
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
                                              if (var2 == -18) {
                                                this.d(-127);
                                                break L1;
                                              } else {
                                                if (-19 == var2) {
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
        if (!((gb) this).field_g) {
          if (!nc.j(param0 ^ 127)) {
            return -1;
          } else {
            if (!bg.field_ab) {
              var2 = ji.a(((gb) this).field_y, true, si.f(1633075718), ob.d((byte) -99), (byte) 113, ((gb) this).field_z);
              if (var2 == 0) {
                return -1;
              } else {
                L0: {
                  if (param0 != var2) {
                    if (11 == rm.field_Q) {
                      if (-1 == cf.field_Lb) {
                        gb.i(param0 ^ -29025);
                        break L0;
                      } else {
                        if (11 == rm.field_Q) {
                          if (-1 == cf.field_Lb) {
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
                        if (-1 == cf.field_Lb) {
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
                      if (-1 == cf.field_Lb) {
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
              int discarded$11 = this.a((byte) stackIn_11_1, stackIn_11_2 != 0, false);
              break L1;
            } else {
              if (10 <= il.field_a) {
                if (!mk.b((byte) -119)) {
                  ni.b(0);
                  break L1;
                } else {
                  if (0 == rm.field_Q) {
                    int discarded$12 = this.a((byte) 110, false, false);
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
          if (!((gb) this).a(48)) {
            return;
          } else {
            L0: {
              L1: {
                ((gb) this).field_w = ((gb) this).getCodeBase().getHost();
                var6_ref = ((gb) this).field_w.toLowerCase();
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
              ((gb) this).field_z = stackIn_8_1 != 0;
              ((gb) this).field_r = Integer.parseInt(((gb) this).getParameter("gameport1"));
              ((gb) this).field_m = Integer.parseInt(((gb) this).getParameter("gameport2"));
              var7 = ((gb) this).getParameter("servernum");
              if (var7 == null) {
                break L2;
              } else {
                ((gb) this).field_x = Integer.parseInt(var7);
                break L2;
              }
            }
            L3: {
              ((gb) this).field_q = Integer.parseInt(((gb) this).getParameter("gamecrc"));
              ((gb) this).field_p = Long.parseLong(((gb) this).getParameter("instanceid"));
              ((gb) this).field_u = ((gb) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((gb) this).getParameter("lang");
              if (var8 != null) {
                ((gb) this).field_v = Integer.parseInt(var8);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (-6 < (((gb) this).field_v ^ -1)) {
                break L4;
              } else {
                ((gb) this).field_v = 0;
                break L4;
              }
            }
            L5: {
              var9 = ((gb) this).getParameter("affid");
              if (var9 != null) {
                ((gb) this).field_y = Integer.parseInt(var9);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param0) {
                break L6;
              } else {
                field_t = -94L;
                break L6;
              }
            }
            se.field_X = Boolean.valueOf(((gb) this).getParameter("simplemode")).booleanValue();
            ((gb) this).a(param4, -117, param2, ((gb) this).field_q, 32, param3, param1);
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        fg.a((Throwable) (Object) var6, (byte) -77, (String) null);
        ((gb) this).a("crash", -58);
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
            ((gb) this).field_z = true;
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
            ((gb) this).b(false, (byte) 11);
        }
    }

    final void a(int param0, int param1, String param2) {
        this.a(true, param1, param2, 640, 480);
        if (param0 != 16742) {
            Object var5 = null;
            ((gb) this).a(110, -96, (String) null);
        }
    }

    final void b(boolean param0, byte param1) {
        int var3 = 0;
        java.awt.Dimension var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_22_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_114_0 = 0;
        int stackIn_114_1 = 0;
        String stackIn_114_2 = null;
        int stackIn_115_0 = 0;
        int stackIn_115_1 = 0;
        String stackIn_115_2 = null;
        int stackIn_116_0 = 0;
        int stackIn_116_1 = 0;
        String stackIn_116_2 = null;
        int stackIn_116_3 = 0;
        int stackIn_149_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_113_1 = 0;
        String stackOut_113_2 = null;
        int stackOut_115_0 = 0;
        int stackOut_115_1 = 0;
        String stackOut_115_2 = null;
        int stackOut_115_3 = 0;
        int stackOut_114_0 = 0;
        int stackOut_114_1 = 0;
        String stackOut_114_2 = null;
        int stackOut_114_3 = 0;
        int stackOut_148_0 = 0;
        int stackOut_147_0 = 0;
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
                var4_ref = var6.getSize();
                ch.field_gb.a(var4_ref.width, -83, var4_ref.height);
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
              if (((gb) this).field_n) {
                break L5;
              } else {
                if (ea.h((byte) -16) <= var3) {
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
          var4 = stackIn_22_0;
          cf.field_Lb = la.a((byte) -98);
          if (var4 != 0) {
            if (-1 == (cf.field_Lb ^ -1)) {
              if ((rm.field_Q ^ -1) == -12) {
                if (!nc.j(125)) {
                  gb.i(-29025);
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
                } else {
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
              } else {
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
            } else {
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
          } else {
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
        }
        L9: {
          if (cf.field_Lb == -1) {
            break L9;
          } else {
            if (cf.field_Lb != -1) {
              if (10 > il.field_a) {
                if (-4 != cf.field_Lb) {
                  if (4 == cf.field_Lb) {
                    ((gb) this).a("js5io", -58);
                    break L9;
                  } else {
                    if (-3 == cf.field_Lb) {
                      ((gb) this).a("js5connect_full", -58);
                      break L9;
                    } else {
                      if ((cf.field_Lb ^ -1) != -6) {
                        ((gb) this).a("js5connect", -58);
                        break L9;
                      } else {
                        ((gb) this).a("outofdate", -58);
                        break L9;
                      }
                    }
                  }
                } else {
                  ((gb) this).a("js5crc", -58);
                  break L9;
                }
              } else {
                if (-11 <= rm.field_Q) {
                  L10: {
                    dh.c(12);
                    if (cf.field_Lb == 3) {
                      jc.a(256, ti.field_b, (byte) 109);
                      break L10;
                    } else {
                      if (-5 == (cf.field_Lb ^ -1)) {
                        jc.a(256, fb.field_F, (byte) -49);
                        break L10;
                      } else {
                        if ((cf.field_Lb ^ -1) != -3) {
                          if (5 == cf.field_Lb) {
                            jc.a(5, rb.field_a, (byte) -126);
                            break L10;
                          } else {
                            jc.a(256, wh.field_d, (byte) -66);
                            break L10;
                          }
                        } else {
                          jc.a(256, b.field_h, (byte) 122);
                          break L10;
                        }
                      }
                    }
                  }
                  bg.field_ab = true;
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
        L11: {
          L12: {
            L13: {
              if (cf.field_Lb == -1) {
                break L13;
              } else {
                if (cf.field_Lb != 0) {
                  break L12;
                } else {
                  break L13;
                }
              }
            }
            if (!nc.j(121)) {
              break L11;
            } else {
              break L12;
            }
          }
          if ((ud.a(2) ^ -1L) <= (ma.field_E ^ -1L)) {
            bg.field_ab = false;
            if ((cf.field_Lb ^ -1) == 0) {
              break L11;
            } else {
              if (0 == cf.field_Lb) {
                break L11;
              } else {
                cf.field_Lb = -1;
                ta.b(0);
                break L11;
              }
            }
          } else {
            break L11;
          }
        }
        L14: {
          if (cf.field_Lb != 0) {
            break L14;
          } else {
            if (!nc.j(121)) {
              gg.field_n = false;
              break L14;
            } else {
              break L14;
            }
          }
        }
        L15: {
          if (0 == il.field_a) {
            if (oh.a(25331)) {
              il.field_a = 1;
              break L15;
            } else {
              break L15;
            }
          } else {
            break L15;
          }
        }
        L16: {
          if ((il.field_a ^ -1) == -2) {
            L17: {
              if (se.field_V != 0) {
                qa.field_c = ri.a(dh.field_c, (byte) 127);
                break L17;
              } else {
                break L17;
              }
            }
            fl.field_m = sh.a(1, nk.field_q, true, 935, false);
            Chess.field_B = sh.a(1, m.field_b, true, 935, false);
            bi.field_a = sh.a(1, kf.field_u, true, 935, false);
            hm.field_e = fl.field_m;
            f.field_b = Chess.field_B;
            il.field_a = 2;
            break L16;
          } else {
            break L16;
          }
        }
        L18: {
          if ((il.field_a ^ -1) != -3) {
            break L18;
          } else {
            L19: {
              if (null == qa.field_c) {
                break L19;
              } else {
                if (!qa.field_c.c((byte) 124)) {
                  break L19;
                } else {
                  if (!qa.field_c.a(4, "")) {
                    qa.field_c = null;
                    break L19;
                  } else {
                    if (qa.field_c.b("", 100)) {
                      gm.a(qa.field_c, -44);
                      qa.field_c = null;
                      ob.f(0);
                      break L19;
                    } else {
                      break L19;
                    }
                  }
                }
              }
            }
            if (null == qa.field_c) {
              il.field_a = 3;
              break L18;
            } else {
              break L18;
            }
          }
        }
        L20: {
          if (il.field_a != 3) {
            break L20;
          } else {
            if (!vi.a(fl.field_m, 99, Chess.field_B, bi.field_a)) {
              break L20;
            } else {
              if (ml.a(0, bi.field_a)) {
                L21: {
                  L22: {
                    gb.e(-5);
                    ag.a((byte) -119);
                    vh.field_e = false;
                    ih.field_T = ca.field_c;
                    n.a(fl.field_m, bi.field_a, ln.field_Kb, 0, Chess.field_B);
                    if (gf.field_e) {
                      break L22;
                    } else {
                      if (kg.field_O != null) {
                        break L22;
                      } else {
                        break L21;
                      }
                    }
                  }
                  L23: {
                    if (gf.field_e) {
                      stackOut_112_0 = 0;
                      stackIn_113_0 = stackOut_112_0;
                      break L23;
                    } else {
                      stackOut_111_0 = 1;
                      stackIn_113_0 = stackOut_111_0;
                      break L23;
                    }
                  }
                  L24: {
                    stackOut_113_0 = stackIn_113_0;
                    stackOut_113_1 = 2;
                    stackOut_113_2 = kg.field_O;
                    stackIn_115_0 = stackOut_113_0;
                    stackIn_115_1 = stackOut_113_1;
                    stackIn_115_2 = stackOut_113_2;
                    stackIn_114_0 = stackOut_113_0;
                    stackIn_114_1 = stackOut_113_1;
                    stackIn_114_2 = stackOut_113_2;
                    if (gf.field_e) {
                      stackOut_115_0 = stackIn_115_0;
                      stackOut_115_1 = stackIn_115_1;
                      stackOut_115_2 = (String) (Object) stackIn_115_2;
                      stackOut_115_3 = 0;
                      stackIn_116_0 = stackOut_115_0;
                      stackIn_116_1 = stackOut_115_1;
                      stackIn_116_2 = stackOut_115_2;
                      stackIn_116_3 = stackOut_115_3;
                      break L24;
                    } else {
                      stackOut_114_0 = stackIn_114_0;
                      stackOut_114_1 = stackIn_114_1;
                      stackOut_114_2 = (String) (Object) stackIn_114_2;
                      stackOut_114_3 = 1;
                      stackIn_116_0 = stackOut_114_0;
                      stackIn_116_1 = stackOut_114_1;
                      stackIn_116_2 = stackOut_114_2;
                      stackIn_116_3 = stackOut_114_3;
                      break L24;
                    }
                  }
                  nj.a(stackIn_116_0 != 0, stackIn_116_1, (String) (Object) stackIn_116_2, stackIn_116_3 != 0);
                  break L21;
                }
                L25: {
                  if (se.field_X) {
                    jg.b(true);
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (pe.field_f == null) {
                    pe.field_f = ke.a(-27212);
                    qf.field_i = rb.a((byte) 46);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                kh.a((byte) -127, pe.field_f, qf.field_i, bi.field_a);
                bi.field_a = null;
                Chess.field_B = null;
                fl.field_m = null;
                ml.a((java.applet.Applet) this, (byte) -43);
                ob.f(0);
                il.field_a = 10;
                break L20;
              } else {
                break L20;
              }
            }
          }
        }
        L27: {
          if (10 == il.field_a) {
            L28: {
              if (se.field_V != 0) {
                td.field_o = ri.a(rm.field_U, (byte) 127);
                break L28;
              } else {
                break L28;
              }
            }
            il.field_a = 11;
            break L27;
          } else {
            break L27;
          }
        }
        L29: {
          if ((il.field_a ^ -1) != -12) {
            break L29;
          } else {
            L30: {
              if (null == td.field_o) {
                break L30;
              } else {
                L31: {
                  if (!td.field_o.c((byte) 123)) {
                    break L31;
                  } else {
                    if (!td.field_o.b((byte) -40)) {
                      break L31;
                    } else {
                      break L30;
                    }
                  }
                }
                nj.a(-20, da.a(uk.field_a, e.field_T, td.field_o, -123), 0.0f);
                break L29;
              }
            }
            il.field_a = 12;
            ic.field_b = true;
            break L29;
          }
        }
        L32: {
          if (-13 == il.field_a) {
            if (ic.field_b) {
              break L32;
            } else {
              il.field_a = 13;
              break L32;
            }
          } else {
            break L32;
          }
        }
        L33: {
          if (-14 == il.field_a) {
            L34: {
              var4 = 1;
              if (null == wj.field_c) {
                break L34;
              } else {
                L35: {
                  if (!wj.field_c.b(-1)) {
                    stackOut_148_0 = 0;
                    stackIn_149_0 = stackOut_148_0;
                    break L35;
                  } else {
                    stackOut_147_0 = 1;
                    stackIn_149_0 = stackOut_147_0;
                    break L35;
                  }
                }
                var4 = stackIn_149_0;
                nj.a(-20, wj.field_c.field_d, wj.field_c.field_i);
                break L34;
              }
            }
            if (var4 != 0) {
              il.field_a = 20;
              if (param0) {
                break L33;
              } else {
                if (!hf.field_a) {
                  break L33;
                } else {
                  kl.a(ja.field_h, (byte) -114);
                  ((gb) this).d((byte) 125);
                  ca.a(13369344, ja.field_h);
                  break L33;
                }
              }
            } else {
              if (!hf.field_a) {
                break L33;
              } else {
                kl.a(ja.field_h, (byte) -114);
                ((gb) this).d((byte) 125);
                ca.a(13369344, ja.field_h);
                break L33;
              }
            }
          } else {
            if (param0) {
              break L33;
            } else {
              if (!hf.field_a) {
                break L33;
              } else {
                kl.a(ja.field_h, (byte) -114);
                ((gb) this).d((byte) 125);
                ca.a(13369344, ja.field_h);
                break L33;
              }
            }
          }
        }
        L36: {
          if (!wc.field_t[8]) {
            break L36;
          } else {
            jj.c(8);
            break L36;
          }
        }
    }

    private final void i(byte param0) {
        String var2 = rf.a((byte) -54);
        if (param0 != -109) {
            ((gb) this).field_n = true;
        }
        qa.a((byte) 26, var2, bh.i(param0 ^ -62));
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
            ((gb) this).field_q = -85;
        }
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
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var8 = Chess.field_G;
                        if (param0 >= 95) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return -100;
                    }
                    case 2: {
                        var4 = jb.a((byte) 93, fl.field_p, param1, se.field_V);
                        if (var4 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        throw new IllegalStateException();
                    }
                    case 5: {
                        if (-2 == var4) {
                            statePc = 7;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        var5_int = cg.a(pg.a(-12316), n.a((byte) 117), true);
                        if (0 == var5_int) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        v.a(31689, var5_int, n.field_c, sa.field_b);
                        sa.field_b = null;
                        n.field_c = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        var11 = mk.a(-28850);
                        if (var11 != null) {
                            statePc = 11;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        cl.a(-1, var11.booleanValue());
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (-3 == (var4 ^ -1)) {
                            statePc = 14;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        var5_int = nj.a(true, ob.d((byte) -126), ((gb) this).field_y, od.a(-5), jb.f(-127), Chess.t(0), si.f(1633075718));
                        if (var5_int == 0) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        lk.a(sa.field_b, 255, var5_int, n.field_c);
                        n.field_c = null;
                        sa.field_b = null;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (-4 != var4) {
                            statePc = 28;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        if (-1 == cf.field_Lb) {
                            statePc = 21;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        if (cf.field_Lb != 0) {
                            statePc = 20;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        cf.field_Lb = -1;
                        ta.b(0);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (param2) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var5_int = ji.a(((gb) this).field_y, false, si.f(1633075718), ob.d((byte) -119), (byte) 82, ((gb) this).field_z);
                        if (var5_int != -1) {
                            statePc = 24;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (0 != var5_int) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        gi.field_e = sj.field_i;
                        gb.i(-29025);
                        ad.field_b = false;
                        rm.field_Q = 10;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 26: {
                        jc.a(var5_int, n.field_c, (byte) 81);
                        n.field_c = null;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 27: {
                        bg.field_ab = false;
                        statePc = 28;
                        continue stateLoop;
                    }
                    case 28: {
                        if (var4 == 4) {
                            statePc = 30;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        if (!ln.field_Kb) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        gh.a(bh.i(81), -161);
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 32: {
                        rm.field_Q = 10;
                        ad.field_b = true;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        if (var4 != 5) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 34: {
                        dh.a(bh.i(81), true);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        if (6 != var4) {
                            statePc = 39;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 36: {
                        if (vh.field_e) {
                            statePc = 38;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        rm.field_Q = 10;
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (-8 != (var4 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    }
                    case 40: {
                        ak.a(false, bh.i(81));
                        statePc = 41;
                        continue stateLoop;
                    }
                    case 41: {
                        if (var4 == 8) {
                            statePc = 43;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    }
                    case 43: {
                        gh.a(bh.i(81), -161);
                        statePc = 44;
                        continue stateLoop;
                    }
                    case 44: {
                        if (var4 == 9) {
                            statePc = 46;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        le.a(126, bh.i(81));
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (-11 != (var4 ^ -1)) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    }
                    case 48: {
                        qn.field_U.f(17, -93);
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        if ((var4 ^ -1) == -12) {
                            statePc = 51;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    }
                    case 51: {
                        jd.a((byte) -117, bh.i(81));
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
                        sg.a(bh.i(81), (byte) 125, un.g(115));
                        statePc = 54;
                        continue stateLoop;
                    }
                    case 54: {
                        if (-14 == (var4 ^ -1)) {
                            statePc = 56;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        try {
                            if (ki.field_M != null) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ki.field_M = new qk(oc.field_l, new java.net.URL(((gb) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (ki.field_M.a(17)) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var12 = ki.field_M.b(-120);
                            if (var12 != null) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var9 = null;
                            ge.a((String) null, (byte) 36);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var7 = gh.a(var12.field_o, 0, -161, var12.field_l);
                            ge.a(var7, (byte) 107);
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ki.field_M = null;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 65;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        var5 = (Exception) (Object) caughtException;
                        fg.a((Throwable) (Object) var5, (byte) -77, "S1");
                        var10 = null;
                        ge.a((String) null, (byte) 30);
                        ki.field_M = null;
                        statePc = 66;
                        continue stateLoop;
                    }
                    case 66: {
                        if (var4 == 15) {
                            statePc = 68;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        rm.field_Q = 10;
                        statePc = 69;
                        continue stateLoop;
                    }
                    case 69: {
                        if (var4 != -17) {
                            statePc = 71;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    }
                    case 70: {
                        return 1;
                    }
                    case 71: {
                        if (-18 == var4) {
                            statePc = 73;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        return 0;
                    }
                    case 73: {
                        return 2;
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

    protected gb() {
    }

    private final void d(int param0) {
        int var2 = tk.field_h.i(-121);
        int var3 = 0 != (var2 & 1) ? 1 : 0;
        int var4 = -1 + sb.field_sb;
        byte[] var5 = new byte[var4];
        if (param0 >= -110) {
            ((gb) this).field_p = 64L;
        }
        tk.field_h.a(var4, var5, false, 0);
        fe.a(ad.a(-29410, var5), var3 != 0, (byte) 16, bh.i(81));
    }

    private final void g(int param0) {
        wc.field_t[param0] = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Waiting for graphics";
    }
}
