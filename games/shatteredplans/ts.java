/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

class ts extends kg {
    static String[] field_K;
    static bi[] field_L;
    private pf field_D;
    private ql field_I;
    private String[] field_J;
    static String field_E;
    static String field_H;
    static kf field_G;
    static String field_F;

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(0 == param0)) {
            return;
        }
        pj var5 = (pj) (Object) ((ts) this).field_p;
        ql var6 = ((ts) this).field_I;
        if (var6 != null) {
            var7 = var5.b(0, (vg) this, param3);
            var8 = var5.a(param2, (vg) this, 100);
            do {
                dd.a(2 + var6.field_l, param1 ^ -11858, 2 + var6.field_j, var6.field_k + var7 + -2, var8 + (var6.field_m - 2));
                var6 = var6.field_h;
            } while (var6 != null);
        }
    }

    final void a(int param0, boolean param1, String param2) {
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
        String[] var9 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null == ((ts) this).field_J) {
          var7 = new String[1 + param0];
          var9 = var7;
          if (null != ((ts) this).field_J) {
            var5 = 0;
            L0: while (true) {
              if (((ts) this).field_J.length <= var5) {
                ((ts) this).field_J = var9;
                ((ts) this).field_J[param0] = param2;
                if (param1) {
                  return;
                } else {
                  ((ts) this).e(false);
                  return;
                }
              } else {
                var7[var5] = ((ts) this).field_J[var5];
                var5++;
                continue L0;
              }
            }
          } else {
            ((ts) this).field_J = var9;
            ((ts) this).field_J[param0] = param2;
            if (!param1) {
              ((ts) this).e(false);
              return;
            } else {
              return;
            }
          }
        } else {
          if (((ts) this).field_J.length > param0) {
            ((ts) this).field_J[param0] = param2;
            if (param1) {
              return;
            } else {
              ((ts) this).e(false);
              return;
            }
          } else {
            var7 = new String[1 + param0];
            var8 = var7;
            var4 = var7;
            if (null != ((ts) this).field_J) {
              var5 = 0;
              L1: while (true) {
                if (((ts) this).field_J.length <= var5) {
                  ((ts) this).field_J = var8;
                  ((ts) this).field_J[param0] = param2;
                  if (!param1) {
                    ((ts) this).e(false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  var7[var5] = ((ts) this).field_J[var5];
                  var5++;
                  continue L1;
                }
              }
            } else {
              ((ts) this).field_J = var8;
              ((ts) this).field_J[param0] = param2;
              if (!param1) {
                ((ts) this).e(false);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    ts(String param0, iq param1) {
        super(param0, (ko) null);
        ((ts) this).field_I = null;
        ((ts) this).field_p = param1;
    }

    final void a(int param0, int param1, byte param2, int param3, int param4) {
        super.a(param0, param1, (byte) 122, param3, param4);
        ((ts) this).e(false);
        if (param2 < 99) {
            ((ts) this).a(23, -42, -29, 82);
        }
    }

    boolean a(byte param0, vg param1) {
        int var3 = 125 / ((61 - param0) / 59);
        return false;
    }

    public static void a(byte param0) {
        field_F = null;
        field_E = null;
        int var1 = -63 / ((-15 - param0) / 60);
        field_L = null;
        field_K = null;
        field_H = null;
    }

    final static boolean a(boolean param0, int param1) {
        try {
            IOException var2 = null;
            sl var4 = null;
            sl var5 = null;
            int stackIn_9_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_8_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (da.field_e != null) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        da.field_e = nr.field_l.a(65535, of.field_f, mk.field_c);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (-1 == (da.field_e.field_d ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        mj.field_Pb = pr.a(14274);
                        pf.field_e = pr.a(14274);
                        if (param1 != (da.field_e.field_d ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            wg.field_f = new ke((java.net.Socket) da.field_e.field_e, nr.field_l);
                            var4 = sa.field_a;
                            var5 = var4;
                            js.field_f.field_j = 0;
                            if (param0) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = -1;
                            stackIn_9_0 = stackOut_7_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = -2;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            rm.field_e = stackIn_9_0;
                            tp.field_g = stackIn_9_0;
                            kp.field_n = stackIn_9_0;
                            cs.field_j = j.field_r;
                            var5.field_j = 0;
                            hq.a(sp.field_g, ee.field_o, (ob) (Object) js.field_f, (byte) 20, uk.field_a);
                            d.a(-1, (byte) 82);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        da.field_e = null;
                        return true;
                    }
                    case 11: {
                        var2 = (IOException) (Object) caughtException;
                        cs.field_j = oa.field_a;
                        da.field_e = null;
                        return true;
                    }
                    case 12: {
                        cs.field_j = oa.field_a;
                        da.field_e = null;
                        return true;
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

    final static void a(java.applet.Applet param0, byte param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "subscribe.ws");
                int var3 = 96 / ((param1 - -19) / 53);
                param0.getAppletContext().showDocument(jg.a(param0, false, var2), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        ((ts) this).a(param1, ((pj) (Object) ((ts) this).field_p).a(true, (vg) this), (byte) 100, param0, param3);
        if (param2 != 57) {
            field_E = null;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if ((ui.field_m ^ -1) == -1) {
          gd.a(-114);
          if (param0 == 6493) {
            L0: {
              if ((bj.field_L ^ -1) > -51) {
                us.a(0, bj.field_L);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              qn.a((byte) -120);
              var1 = tk.field_C.c(np.field_d) + 20;
              if (var1 >= 80) {
                break L1;
              } else {
                var1 = 80;
                break L1;
              }
            }
            nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
            return;
          } else {
            return;
          }
        } else {
          if ((ui.field_m ^ -1) == -2) {
            hd.a(param0 + -6373);
            if (param0 == 6493) {
              L2: {
                if ((bj.field_L ^ -1) > -51) {
                  us.a(0, bj.field_L);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                qn.a((byte) -120);
                var1 = tk.field_C.c(np.field_d) + 20;
                if (var1 >= 80) {
                  break L3;
                } else {
                  var1 = 80;
                  break L3;
                }
              }
              nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
              return;
            } else {
              return;
            }
          } else {
            if (2 != ui.field_m) {
              if (ui.field_m == 3) {
                pa.c(8421504);
                if (param0 == 6493) {
                  L4: {
                    if ((bj.field_L ^ -1) > -51) {
                      us.a(0, bj.field_L);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    qn.a((byte) -120);
                    var1 = tk.field_C.c(np.field_d) + 20;
                    if (var1 >= 80) {
                      break L5;
                    } else {
                      var1 = 80;
                      break L5;
                    }
                  }
                  nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                  return;
                } else {
                  return;
                }
              } else {
                if (4 == ui.field_m) {
                  eb.a(param0 + -6173);
                  if (param0 == 6493) {
                    L6: {
                      if ((bj.field_L ^ -1) > -51) {
                        us.a(0, bj.field_L);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      qn.a((byte) -120);
                      var1 = tk.field_C.c(np.field_d) + 20;
                      if (var1 >= 80) {
                        break L7;
                      } else {
                        var1 = 80;
                        break L7;
                      }
                    }
                    nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                    return;
                  } else {
                    return;
                  }
                } else {
                  if (ui.field_m == 5) {
                    vi.c(param0 ^ 6333);
                    if (param0 == 6493) {
                      L8: {
                        if ((bj.field_L ^ -1) > -51) {
                          us.a(0, bj.field_L);
                          break L8;
                        } else {
                          break L8;
                        }
                      }
                      L9: {
                        qn.a((byte) -120);
                        var1 = tk.field_C.c(np.field_d) + 20;
                        if (var1 >= 80) {
                          break L9;
                        } else {
                          var1 = 80;
                          break L9;
                        }
                      }
                      nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                      return;
                    } else {
                      return;
                    }
                  } else {
                    if (param0 == 6493) {
                      L10: {
                        if ((bj.field_L ^ -1) > -51) {
                          us.a(0, bj.field_L);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        qn.a((byte) -120);
                        var1 = tk.field_C.c(np.field_d) + 20;
                        if (var1 >= 80) {
                          break L11;
                        } else {
                          var1 = 80;
                          break L11;
                        }
                      }
                      nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
            } else {
              wj.a(128);
              if (param0 == 6493) {
                L12: {
                  if ((bj.field_L ^ -1) > -51) {
                    us.a(0, bj.field_L);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  qn.a((byte) -120);
                  var1 = tk.field_C.c(np.field_d) + 20;
                  if (var1 >= 80) {
                    break L13;
                  } else {
                    var1 = 80;
                    break L13;
                  }
                }
                nh.a(var1, tk.field_C, 8421504, 440, 10526880, -20 - var1 + 640, np.field_d, ci.field_o, 4210752, 20, -1, 5);
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    final void e(boolean param0) {
        int var2 = 0;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ql var10 = null;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        Object var17 = null;
        String var18 = null;
        qo var19 = null;
        ha var20 = null;
        ql var21 = null;
        Object var22 = null;
        String var23 = null;
        qo var24 = null;
        ha var25 = null;
        ql var26 = null;
        pj var27 = null;
        pj var28 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_32_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var17 = null;
        var22 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        ((ts) this).field_D = new pf();
        if (!param0) {
          var2 = 0;
          var28 = (pj) (Object) ((ts) this).field_p;
          var24 = var28.a((vg) this, true);
          L0: while (true) {
            var5 = ((ts) this).field_s.indexOf("<hotspot=", var2);
            if (var5 != -1) {
              var7 = ((ts) this).field_s.indexOf(">", var5);
              var23 = ((ts) this).field_s.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var23);
              var2 = ((ts) this).field_s.indexOf("</hotspot>", var5);
              var8 = var24.a((byte) 87, var5);
              var9 = var24.a((byte) 103, var2);
              var10 = null;
              var11 = var8;
              L1: while (true) {
                if (var9 < var11) {
                  continue L0;
                } else {
                  L2: {
                    var25 = var24.field_d[var11];
                    if (var8 == var11) {
                      stackOut_26_0 = var24.a(true, var5);
                      stackIn_27_0 = stackOut_26_0;
                      break L2;
                    } else {
                      stackOut_25_0 = var25.field_b[0];
                      stackIn_27_0 = stackOut_25_0;
                      break L2;
                    }
                  }
                  L3: {
                    var13 = stackIn_27_0;
                    if ((var11 ^ -1) == (var9 ^ -1)) {
                      stackOut_31_0 = var24.a(true, var2);
                      stackIn_32_0 = stackOut_31_0;
                      break L3;
                    } else {
                      if (var25 != null) {
                        stackOut_30_0 = var25.field_b[var25.field_b.length - 1];
                        stackIn_32_0 = stackOut_30_0;
                        break L3;
                      } else {
                        stackOut_29_0 = 0;
                        stackIn_32_0 = stackOut_29_0;
                        break L3;
                      }
                    }
                  }
                  var14 = stackIn_32_0;
                  var26 = new ql(var7, var13, var25.field_e, var14 - var13, Math.max(var28.a(false), -var25.field_e + var25.field_c));
                  if (var10 == null) {
                    var10 = var26;
                    ((ts) this).field_D.a((byte) -113, (oh) (Object) var26);
                    var11++;
                    continue L1;
                  } else {
                    var10.field_h = var26;
                    var10 = var26;
                    ((ts) this).field_D.a((byte) -113, (oh) (Object) var26);
                    var11++;
                    continue L1;
                  }
                }
              }
            } else {
              return;
            }
          }
        } else {
          field_L = null;
          var2 = 0;
          var27 = (pj) (Object) ((ts) this).field_p;
          var19 = var27.a((vg) this, true);
          L4: while (true) {
            var5 = ((ts) this).field_s.indexOf("<hotspot=", var2);
            if (var5 != -1) {
              var7 = ((ts) this).field_s.indexOf(">", var5);
              var18 = ((ts) this).field_s.substring(var5 - -9, var7);
              var7 = Integer.parseInt(var18);
              var2 = ((ts) this).field_s.indexOf("</hotspot>", var5);
              var8 = var19.a((byte) 87, var5);
              var9 = var19.a((byte) 103, var2);
              var10 = null;
              var11 = var8;
              L5: while (true) {
                if (var9 < var11) {
                  continue L4;
                } else {
                  L6: {
                    var20 = var19.field_d[var11];
                    if (var8 == var11) {
                      stackOut_8_0 = var19.a(true, var5);
                      stackIn_9_0 = stackOut_8_0;
                      break L6;
                    } else {
                      stackOut_7_0 = var20.field_b[0];
                      stackIn_9_0 = stackOut_7_0;
                      break L6;
                    }
                  }
                  L7: {
                    var13 = stackIn_9_0;
                    if ((var11 ^ -1) == (var9 ^ -1)) {
                      stackOut_13_0 = var19.a(true, var2);
                      stackIn_14_0 = stackOut_13_0;
                      break L7;
                    } else {
                      if (var20 != null) {
                        stackOut_12_0 = var20.field_b[var20.field_b.length - 1];
                        stackIn_14_0 = stackOut_12_0;
                        break L7;
                      } else {
                        stackOut_11_0 = 0;
                        stackIn_14_0 = stackOut_11_0;
                        break L7;
                      }
                    }
                  }
                  var14 = stackIn_14_0;
                  var21 = new ql(var7, var13, var20.field_e, var14 - var13, Math.max(var27.a(false), -var20.field_e + var20.field_c));
                  if (var10 == null) {
                    var10 = var21;
                    ((ts) this).field_D.a((byte) -113, (oh) (Object) var21);
                    var11++;
                    continue L5;
                  } else {
                    var10.field_h = var21;
                    var10 = var21;
                    ((ts) this).field_D.a((byte) -113, (oh) (Object) var21);
                    var11++;
                    continue L5;
                  }
                }
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        param0 += 30;
        if (param1 != -1) {
            return;
        }
        param2 += 30;
        ga.a(param2, -param2 + 480 >> 1464963841, -param0 + 640 >> 1821600033, (byte) -70, param0);
    }

    private final ql b(int param0, int param1, byte param2) {
        ql var4 = null;
        ql var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        var4 = (ql) (Object) ((ts) this).field_D.d(0);
        L0: while (true) {
          if (var4 == null) {
            if (param2 != -66) {
              ((ts) this).field_J = null;
              return null;
            } else {
              return null;
            }
          } else {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (ql) (Object) ((ts) this).field_D.a((byte) -71);
                continue L0;
              } else {
                if (var5.field_k > param0) {
                  var5 = var5.field_h;
                  continue L1;
                } else {
                  if (var5.field_m > param1) {
                    var5 = var5.field_h;
                    continue L1;
                  } else {
                    if ((var5.field_k + var5.field_j ^ -1) >= (param0 ^ -1)) {
                      var5 = var5.field_h;
                      continue L1;
                    } else {
                      if ((var5.field_l + var5.field_m ^ -1) <= (param1 ^ -1)) {
                        return var4;
                      } else {
                        var5 = var5.field_h;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    String c(boolean param0) {
        if (null == ((ts) this).field_I) {
            return null;
        }
        if (((ts) this).field_J == null) {
            return null;
        }
        if (((ts) this).field_J.length <= ((ts) this).field_I.field_i) {
            return null;
        }
        if (!param0) {
            field_F = null;
            return ((ts) this).field_J[((ts) this).field_I.field_i];
        }
        return ((ts) this).field_J[((ts) this).field_I.field_i];
    }

    void a(int param0, int param1, vg param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        super.a(param0, param1, param2, param3);
        ((ts) this).field_I = null;
        if (((ts) this).field_k) {
            var5 = -((ts) this).field_m + (-param0 + pd.field_k);
            var6 = bb.field_b - param1 + -((ts) this).field_q;
            ((ts) this).field_I = this.b(var5, var6, (byte) -66);
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
        super.a(param0, param1, param2, param3);
        int var5 = -((ts) this).field_m + param1;
        int var6 = -((ts) this).field_q + param2;
        ql var7 = this.b(var5, var6, (byte) -66);
        if (var7 == null) {
            return;
        }
        if (((ts) this).field_u == null) {
            return;
        }
        ((op) (Object) ((ts) this).field_u).a(param0, var7.field_i, 2, (ts) this);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new String[16];
        field_E = "Retry";
        field_H = "Show lobby chat from my friends";
        field_F = "Add <%0> to ignore list";
        field_G = null;
    }
}
