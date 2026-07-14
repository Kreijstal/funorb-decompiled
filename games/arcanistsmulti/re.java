/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class re extends kh {
    static String[] field_t;
    private boolean field_n;
    static qb[] field_j;
    static int field_r;
    private int field_l;
    private int field_s;
    static String field_m;
    private dj field_i;
    private int field_o;
    static String field_k;
    private String field_q;
    private int field_p;
    private int field_h;

    final void a(String param0, int param1, int param2, byte param3, dj param4) {
        if (param0 == null) {
            ((re) this).field_f = null;
            return;
        }
        if (param4 == ((re) this).field_i) {
            if (((re) this).field_n) {
                if (1 == ((re) this).field_h) {
                    if (null != ((re) this).field_q) {
                        if (((re) this).field_q.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((re) this).field_i = param4;
        ((re) this).field_n = true;
        if (param3 != -18) {
            Object var8 = null;
            vd discarded$0 = this.a((dj) null, 47, 36, (String) null);
        }
        ((re) this).field_h = 1;
        vd var9 = this.a(param4, 0, param2, param0);
        int var7 = param4.b(param0);
        var9.field_f[0] = -(var7 >> 1021473505) + param1;
        var9.field_f[param0.length()] = param1 - -(var7 >> 476414817);
        be.a(0, var9, param0, param4, (byte) 35);
    }

    final void a(int param0, byte param1, dj param2, int param3, String param4) {
        if (param4 == null) {
            ((re) this).field_f = null;
            return;
        }
        if (param2 == ((re) this).field_i) {
            if (((re) this).field_n) {
                if (2 == ((re) this).field_h) {
                    if (null != ((re) this).field_q) {
                        if (!(!((re) this).field_q.equals((Object) (Object) param4))) {
                            return;
                        }
                    }
                }
            }
        }
        ((re) this).field_n = true;
        ((re) this).field_i = param2;
        ((re) this).field_h = 2;
        ((re) this).field_q = param4;
        vd var9 = this.a(param2, 0, param3, param4);
        vd var10 = var9;
        var10.field_f[0] = -param2.b(param4) + param0;
        var10.field_f[param4.length()] = param0;
        be.a(0, var10, param4, param2, (byte) 35);
        int var7 = -84 / ((-47 - param1) / 49);
    }

    private final vd a(dj param0, int param1, int param2, String param3) {
        vd var6 = new vd(param2 - param0.field_C, param2 - -param0.field_m, param3.length());
        vd var5 = var6;
        if (param1 != 0) {
            return null;
        }
        ((re) this).field_f = new vd[]{var6};
        return var5;
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            Object var8 = null;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = ArcanistsMulti.field_G ? 1 : 0;
                        if (!cb.field_a) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) ei.a(param1, param0 + 171, "getcookies");
                            var4 = eh.a(false, ';', var3);
                            if (param0 == -68) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var8 = null;
                            boolean discarded$2 = re.a((byte) 30, (java.applet.Applet) null);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var5 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 13;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = 1;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0 != 0;
                    }
                    case 10: {
                        try {
                            var5++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var2_ref = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (null == param1.getParameter("tuhstatbut")) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
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

    final void a(byte param0, dj param1, int param2, int param3, int param4, int param5, String param6, int param7) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        vd var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        vd stackIn_34_0 = null;
        vd stackIn_34_1 = null;
        int stackIn_34_2 = 0;
        int stackIn_34_3 = 0;
        vd stackIn_35_0 = null;
        vd stackIn_35_1 = null;
        int stackIn_35_2 = 0;
        int stackIn_35_3 = 0;
        vd stackIn_36_0 = null;
        vd stackIn_36_1 = null;
        int stackIn_36_2 = 0;
        int stackIn_36_3 = 0;
        int stackIn_36_4 = 0;
        int stackIn_41_0 = 0;
        vd stackOut_33_0 = null;
        vd stackOut_33_1 = null;
        int stackOut_33_2 = 0;
        int stackOut_33_3 = 0;
        vd stackOut_35_0 = null;
        vd stackOut_35_1 = null;
        int stackOut_35_2 = 0;
        int stackOut_35_3 = 0;
        int stackOut_35_4 = 0;
        vd stackOut_34_0 = null;
        vd stackOut_34_1 = null;
        int stackOut_34_2 = 0;
        int stackOut_34_3 = 0;
        int stackOut_34_4 = 0;
        int stackOut_40_0 = 0;
        int stackOut_39_0 = 0;
        L0: {
          var15 = ArcanistsMulti.field_G ? 1 : 0;
          if (-1 == (param3 ^ -1)) {
            param3 = param1.field_H;
            break L0;
          } else {
            break L0;
          }
        }
        if (param6 != null) {
          L1: {
            if (((re) this).field_i != param1) {
              break L1;
            } else {
              if (((re) this).field_n) {
                break L1;
              } else {
                if (param4 != ((re) this).field_h) {
                  break L1;
                } else {
                  if (param5 != ((re) this).field_s) {
                    break L1;
                  } else {
                    if (((re) this).field_o != param3) {
                      break L1;
                    } else {
                      if (param2 != ((re) this).field_l) {
                        break L1;
                      } else {
                        if (((re) this).field_p != param7) {
                          break L1;
                        } else {
                          if (((re) this).field_q == null) {
                            break L1;
                          } else {
                            if (((re) this).field_q.equals((Object) (Object) param6)) {
                              return;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
          ((re) this).field_p = param7;
          ((re) this).field_s = param5;
          ((re) this).field_h = param4;
          ((re) this).field_o = param3;
          ((re) this).field_i = param1;
          ((re) this).field_n = false;
          ((re) this).field_l = param2;
          ((re) this).field_q = param6;
          if (param0 > 118) {
            L2: {
              var16 = new String[param1.a(param6, param7) - -1];
              var17 = var16;
              var10 = Math.max(1, param1.a(param6, new int[1], var17));
              if (-4 != ((re) this).field_s) {
                break L2;
              } else {
                if (1 == var10) {
                  ((re) this).field_s = 1;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              ((re) this).field_f = new vd[var10];
              if (-1 == ((re) this).field_s) {
                var11 = param1.field_C;
                break L3;
              } else {
                if (-2 == (((re) this).field_s ^ -1)) {
                  var11 = (-(var10 * ((re) this).field_o) + ((re) this).field_l >> -287870367) + param1.field_C;
                  break L3;
                } else {
                  if (((re) this).field_s == 2) {
                    var11 = ((re) this).field_l + -param1.field_m - var10 * ((re) this).field_o;
                    break L3;
                  } else {
                    L4: {
                      var12 = (-(var10 * ((re) this).field_o) + ((re) this).field_l) / (var10 - -1);
                      if (0 <= var12) {
                        break L4;
                      } else {
                        var12 = 0;
                        break L4;
                      }
                    }
                    var11 = param1.field_C - -var12;
                    ((re) this).field_o = ((re) this).field_o + var12;
                    break L3;
                  }
                }
              }
            }
            var12 = 0;
            L5: while (true) {
              if (var10 <= var12) {
                return;
              } else {
                L6: {
                  var13 = var16[var12];
                  stackOut_33_0 = null;
                  stackOut_33_1 = null;
                  stackOut_33_2 = -param1.field_C + var11;
                  stackOut_33_3 = var11 - -param1.field_m;
                  stackIn_35_0 = stackOut_33_0;
                  stackIn_35_1 = stackOut_33_1;
                  stackIn_35_2 = stackOut_33_2;
                  stackIn_35_3 = stackOut_33_3;
                  stackIn_34_0 = stackOut_33_0;
                  stackIn_34_1 = stackOut_33_1;
                  stackIn_34_2 = stackOut_33_2;
                  stackIn_34_3 = stackOut_33_3;
                  if (var13 == null) {
                    stackOut_35_0 = null;
                    stackOut_35_1 = null;
                    stackOut_35_2 = stackIn_35_2;
                    stackOut_35_3 = stackIn_35_3;
                    stackOut_35_4 = 0;
                    stackIn_36_0 = stackOut_35_0;
                    stackIn_36_1 = stackOut_35_1;
                    stackIn_36_2 = stackOut_35_2;
                    stackIn_36_3 = stackOut_35_3;
                    stackIn_36_4 = stackOut_35_4;
                    break L6;
                  } else {
                    stackOut_34_0 = null;
                    stackOut_34_1 = null;
                    stackOut_34_2 = stackIn_34_2;
                    stackOut_34_3 = stackIn_34_3;
                    stackOut_34_4 = var13.length();
                    stackIn_36_0 = stackOut_34_0;
                    stackIn_36_1 = stackOut_34_1;
                    stackIn_36_2 = stackOut_34_2;
                    stackIn_36_3 = stackOut_34_3;
                    stackIn_36_4 = stackOut_34_4;
                    break L6;
                  }
                }
                L7: {
                  new vd(stackIn_36_2, stackIn_36_3, stackIn_36_4);
                  var14 = (vd) (Object) stackIn_36_0;
                  var14.field_f[0] = 0;
                  if (var13 != null) {
                    L8: {
                      var14.field_f[var13.length()] = param1.b(var13);
                      if (-4 != (param4 ^ -1)) {
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        break L8;
                      } else {
                        stackOut_39_0 = ((re) this).a(var13, false, param7, param1.b(var13));
                        stackIn_41_0 = stackOut_39_0;
                        break L8;
                      }
                    }
                    be.a(stackIn_41_0, var14, var13, param1, (byte) 35);
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var11 = var11 + param3;
                ((re) this).field_f[var12] = var14;
                var12++;
                continue L5;
              }
            }
          } else {
            return;
          }
        } else {
          ((re) this).field_f = null;
          return;
        }
    }

    final void a(String param0, byte param1, dj param2, int param3, int param4) {
        if (param1 > -109) {
            Object var7 = null;
            ((re) this).a((byte) 70, (dj) null, -111, -15, -72, 7, (String) null, -64);
        }
        if (!(param0 != null)) {
            ((re) this).field_f = null;
            return;
        }
        if (((re) this).field_i == param2) {
            if (((re) this).field_n) {
                if (0 == ((re) this).field_h) {
                    if (null != ((re) this).field_q) {
                        if (((re) this).field_q.equals((Object) (Object) param0)) {
                            return;
                        }
                    }
                }
            }
        }
        ((re) this).field_n = true;
        ((re) this).field_q = param0;
        ((re) this).field_h = 0;
        ((re) this).field_i = param2;
        vd var8 = this.a(param2, 0, param3, param0);
        vd var9 = var8;
        var8.field_f[0] = param4;
        var9.field_f[param0.length()] = param2.b(param0) + param4;
        be.a(0, var9, param0, param2, (byte) 35);
    }

    public static void b(int param0) {
        field_t = null;
        field_k = null;
        field_j = null;
        if (param0 != 0) {
            return;
        }
        field_m = null;
    }

    public re() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Well done for mastering Fire Ball. Now you will practise with another basic spell.";
        field_k = "You have 1 unread message!";
        field_t = new String[]{"Showing by rating", "Showing by win percentage"};
        field_r = 0;
    }
}
