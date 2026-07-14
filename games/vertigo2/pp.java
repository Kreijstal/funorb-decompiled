/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends li {
    static String field_w;
    static String field_r;
    private int[] field_q;
    static String field_v;
    static String field_y;
    private int[] field_n;
    int field_z;
    private int[] field_o;
    static r field_s;
    private boolean[] field_t;
    static String field_x;
    private boolean[][] field_p;
    private int[][] field_u;

    public static void e(int param0) {
        field_v = null;
        if (param0 < 75) {
            return;
        }
        field_x = null;
        field_s = null;
        field_y = null;
        field_r = null;
        field_w = null;
    }

    final static cr f(int param0) {
        int var1 = 87 % ((param0 - -53) / 59);
        return h.field_D.field_Mb;
    }

    final boolean a(boolean[] param0, int[] param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        var4 = 1;
        if (param2 == 32) {
          var5 = 0;
          L0: while (true) {
            if (((pp) this).field_n.length <= var5) {
              if (var4 != 0) {
                return true;
              } else {
                var5 = 0;
                L1: while (true) {
                  if (param1.length <= var5) {
                    return false;
                  } else {
                    ((pp) this).field_n[var5] = ((pp) this).field_n[var5] + 1;
                    var6 = ((pp) this).field_n[var5];
                    param1[var5] = br.b(((pp) this).field_u[var5][var6], (byte) 48);
                    param0[var5] = ((pp) this).field_p[var5][var6];
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              if (10 > ((pp) this).field_n[var5]) {
                var4 = 0;
                var5++;
                var5++;
                continue L0;
              } else {
                var5++;
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    final int a(byte param0, int param1) {
        if (param0 != 76) {
            ((pp) this).field_z = -29;
            return ((pp) this).field_o[param1];
        }
        return ((pp) this).field_o[param1];
    }

    final static cr a(byte param0) {
        if (param0 != 116) {
            return null;
        }
        return ja.field_f.field_Nb;
    }

    final boolean b(boolean param0, int param1) {
        if (param0) {
            cr discarded$0 = pp.a((byte) 19);
            return ((pp) this).field_t[param1];
        }
        return ((pp) this).field_t[param1];
    }

    final int b(int param0, int param1) {
        if (param1 > -58) {
            return -97;
        }
        return ((pp) this).field_q[param0];
    }

    final static cr a(int param0) {
        if (param0 != 12) {
            Object var2 = null;
            boolean discarded$0 = pp.a((java.applet.Applet) null, 100);
            return hi.b(117);
        }
        return hi.b(117);
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        er var8 = new er(param3, param6);
        int[] var9 = bi.field_l;
        int var10 = bi.field_e;
        int var11 = bi.field_j;
        var8.d();
        int var12 = -9 % ((11 - param1) / 38);
        bi.a(0, 0, param3, param6, 12, param0, param7);
        bi.a(var9, var10, var11);
        var8.f(param4, param2);
        var8.d(param4, param2, param5);
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_8_0 = 0;
            int stackIn_15_0 = 0;
            int stackOut_7_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_14_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Vertigo2.field_L ? 1 : 0;
                        if (!tb.field_b) {
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
                            var3 = (String) je.a(param0, false, "getcookies");
                            var4 = jr.a((byte) -9, ';', var3);
                            var5 = param1;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 12;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (0 > var6) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 1;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var2_ref = caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (null == param0.getParameter("tuhstatbut")) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = 1;
                        stackIn_15_0 = stackOut_13_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = 0;
                        stackIn_15_0 = stackOut_14_0;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        return stackIn_15_0 != 0;
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

    final void a(byte param0, int param1, mi param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        boolean[] stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        boolean[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        boolean[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        boolean[] stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        boolean[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        boolean[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        param2.p(0);
        if (param0 != -8) {
          return;
        } else {
          var4 = 0;
          L0: while (true) {
            if (((pp) this).field_u.length <= var4) {
              L1: {
                ((pp) this).field_z = param2.c((byte) -122, 32);
                if (0 > param1) {
                  break L1;
                } else {
                  L2: {
                    if (param2.c((byte) -101, 1) == 1) {
                      ((pp) this).field_t[param1] = true;
                      ((pp) this).field_q[param1] = param2.c((byte) -108, 8);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  ((pp) this).field_o[param1] = param2.c((byte) -110, 4);
                  break L1;
                }
              }
              param2.b((byte) -90);
              return;
            } else {
              var5 = 0;
              L3: while (true) {
                if (-11 >= (var5 ^ -1)) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    stackOut_5_0 = ((pp) this).field_p[var4];
                    stackOut_5_1 = var5;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_6_0 = stackOut_5_0;
                    stackIn_6_1 = stackOut_5_1;
                    if (1 != param2.c((byte) -120, 1)) {
                      stackOut_7_0 = (boolean[]) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackOut_7_2 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      stackIn_8_2 = stackOut_7_2;
                      break L4;
                    } else {
                      stackOut_6_0 = (boolean[]) (Object) stackIn_6_0;
                      stackOut_6_1 = stackIn_6_1;
                      stackOut_6_2 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      stackIn_8_1 = stackOut_6_1;
                      stackIn_8_2 = stackOut_6_2;
                      break L4;
                    }
                  }
                  stackIn_8_0[stackIn_8_1] = stackIn_8_2 != 0;
                  if (((pp) this).field_p[var4][var5]) {
                    var5++;
                    var5++;
                    var5++;
                    continue L3;
                  } else {
                    ((pp) this).field_u[var4][var5] = param2.c((byte) -104, 6);
                    var5++;
                    var5++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          if (up.field_z == null) {
            break L0;
          } else {
            var3 = up.field_z.b(13721, param1);
            if (1 == (var3 ^ -1)) {
              break L0;
            } else {
              L1: {
                if (-1 == var3) {
                  break L1;
                } else {
                  var4 = up.field_z.k(22719) ? 1 : 0;
                  qg.a(param2, var3, 0, var4 != 0, up.field_z.l(4), up.field_z.field_Kb);
                  break L1;
                }
              }
              up.field_z = null;
              ql.i(30);
              break L0;
            }
          }
        }
        if (param0 > -46) {
          cr discarded$2 = pp.f(63);
          return;
        } else {
          return;
        }
    }

    pp(int param0) {
        ((pp) this).field_n = new int[param0];
        ((pp) this).field_u = new int[param0][10];
        ((pp) this).field_q = new int[param0];
        ((pp) this).field_t = new boolean[param0];
        ((pp) this).field_o = new int[param0];
        ((pp) this).field_p = new boolean[param0][10];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_r = "Don't mind";
        field_w = "Move left:<br>Move right:<br>Move back:<br>Move forward:<br>Jump:<br><br>Lay dynamite:<br>Use jetpack:<br><br>Pause/Options:<br>Rotate camera left:<br>Rotate camera right:<br>Raise camera up:<br>Time attack quick restart:";
        field_v = "Invite <%0> to this game";
        field_x = "Scamming";
        field_y = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
    }
}
