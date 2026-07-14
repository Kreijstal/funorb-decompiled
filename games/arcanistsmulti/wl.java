/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wl extends mg {
    static String field_I;
    static int[][] field_L;
    static String field_M;
    private rn field_J;
    private rn field_T;
    static so field_S;
    private boolean field_G;
    private rn field_Q;
    static String field_R;
    static String field_N;
    static ll[] field_U;
    static long field_O;
    static String field_H;
    static int field_K;
    static String field_P;

    final static jg a(boolean param0, int param1) {
        ab var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Exception var6 = null;
        int var7 = 0;
        ab var8 = null;
        tk var9 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int[] stackIn_24_0 = null;
        int stackOut_1_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int[] stackOut_22_0 = null;
        Object stackOut_23_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = ArcanistsMulti.field_G ? 1 : 0;
                    var8 = df.field_z;
                    var2 = var8;
                    var3 = var8.e((byte) 122);
                    if (-1 == (128 & var3 ^ -1)) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    sc.field_V = stackIn_3_0 != 0;
                    sl.field_W = var3 & 127;
                    db.field_e = var8.e((byte) 44);
                    vi.field_P = var8.c(-943038560);
                    if ((sl.field_W ^ -1) != -3) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    i.field_f = var8.n(-98);
                    ma.field_M = var8.h(11609);
                    statePc = 6;
                    continue stateLoop;
                }
                case 5: {
                    ma.field_M = 0;
                    i.field_f = 0;
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (var8.e((byte) -105) != 1) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 8: {
                    stackOut_8_0 = 0;
                    stackIn_9_0 = stackOut_8_0;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    var4 = stackIn_9_0;
                    vf.field_j = var8.l(-1);
                    if (var4 == 0) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ff.field_a = var8.l(-1);
                    statePc = 12;
                    continue stateLoop;
                }
                case 11: {
                    ff.field_a = vf.field_j;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (-2 == (sl.field_W ^ -1)) {
                        statePc = 15;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (sl.field_W == 4) {
                        statePc = 16;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    field_N = null;
                    mc.field_c = 0;
                    statePc = 17;
                    continue stateLoop;
                }
                case 15: {
                    mc.field_c = var8.n(-98);
                    field_N = var8.l(-1);
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    mc.field_c = var8.n(-98);
                    field_N = var8.l(-1);
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (param1 >= 36) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return null;
                }
                case 19: {
                    if (!param0) {
                        statePc = 27;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    var5 = var8.n(-98);
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    try {
                        var9 = th.field_d.a(var5, (byte) -119);
                        fe.field_p = var9.c(true);
                        if (ff.field_a.equals((Object) (Object) ah.field_b)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackOut_22_0 = var9.field_u;
                        stackIn_24_0 = stackOut_22_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = null;
                        stackIn_24_0 = (int[]) (Object) stackOut_23_0;
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        ga.field_s = (int[]) (Object) stackIn_24_0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 26;
                        continue stateLoop;
                    }
                }
                case 25: {
                    return new jg(param0);
                }
                case 26: {
                    var6 = (Exception) (Object) caughtException;
                    jh.a((Throwable) (Object) var6, "CC1", (byte) 20);
                    fe.field_p = null;
                    ga.field_s = null;
                    return new jg(param0);
                }
                case 27: {
                    fe.field_p = rm.a((wk) (Object) var8, 80, -79);
                    ga.field_s = null;
                    return new jg(param0);
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final String b(boolean param0) {
        String var2 = null;
        String stackIn_8_0 = null;
        String stackIn_18_0 = null;
        String stackOut_17_0 = null;
        String stackOut_16_0 = null;
        String stackOut_7_0 = null;
        String stackOut_6_0 = null;
        var2 = ((wl) this).field_Q.b(param0);
        if (!param0) {
          if (var2 != null) {
            return var2;
          } else {
            if (!((wl) this).field_w) {
              return null;
            } else {
              L0: {
                if (((wl) this).field_q == null) {
                  stackOut_17_0 = ((wl) this).field_g;
                  stackIn_18_0 = stackOut_17_0;
                  break L0;
                } else {
                  stackOut_16_0 = ((wl) this).field_q;
                  stackIn_18_0 = stackOut_16_0;
                  break L0;
                }
              }
              return (String) (Object) stackIn_18_0;
            }
          }
        } else {
          String discarded$10 = ((wl) this).b(false);
          if (var2 != null) {
            return var2;
          } else {
            if (!((wl) this).field_w) {
              return null;
            } else {
              L1: {
                if (((wl) this).field_q == null) {
                  stackOut_7_0 = ((wl) this).field_g;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = ((wl) this).field_q;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              return (String) (Object) stackIn_8_0;
            }
          }
        }
    }

    final void a(bl param0, byte param1) {
        this.a(param0, (byte) 116);
        ((wl) this).field_T.field_o = (wc) (Object) param0;
        ((wl) this).field_Q.field_o = (wc) (Object) param0;
        int var3 = -113 / ((63 - param1) / 47);
        ((wl) this).field_J.field_o = (wc) (Object) param0;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (param0 >= -52) {
            field_N = null;
            this.a((byte) -57, param1, param2, param3);
            if (!(param2 == 0)) {
                return;
            }
            param1 = param1 + ((wl) this).field_n;
            param3 = param3 + ((wl) this).field_j;
            this.a(param3, ne.field_f, (qm) (Object) ((wl) this).field_T, -5187, param1);
            this.a(param3, ud.field_y, (qm) (Object) ((wl) this).field_Q, -5187, param1);
            this.a(param3, rc.field_g, (qm) (Object) ((wl) this).field_J, -5187, param1);
            return;
        }
        this.a((byte) -57, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        param1 = param1 + ((wl) this).field_n;
        param3 = param3 + ((wl) this).field_j;
        this.a(param3, ne.field_f, (qm) (Object) ((wl) this).field_T, -5187, param1);
        this.a(param3, ud.field_y, (qm) (Object) ((wl) this).field_Q, -5187, param1);
        this.a(param3, rc.field_g, (qm) (Object) ((wl) this).field_J, -5187, param1);
    }

    public static void k(int param0) {
        if (param0 != 0) {
          jg discarded$2 = wl.a(false, 47);
          field_P = null;
          field_N = null;
          field_H = null;
          field_S = null;
          field_M = null;
          field_L = null;
          field_U = null;
          field_R = null;
          field_I = null;
          return;
        } else {
          field_P = null;
          field_N = null;
          field_H = null;
          field_S = null;
          field_M = null;
          field_L = null;
          field_U = null;
          field_R = null;
          field_I = null;
          return;
        }
    }

    final static void f(boolean param0) {
        pn.a(-47);
        if (!param0) {
            jg discarded$0 = wl.a(false, -104);
        }
    }

    final int h(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            if (param0 >= 18) {
              break L0;
            } else {
              field_O = 112L;
              break L0;
            }
          }
          stackOut_2_0 = Integer.parseInt(((wl) this).field_T.field_g);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    private final void a(int param0, String param1, qm param2, int param3, int param4) {
        if (param3 != -5187) {
          return;
        } else {
          vc.field_e.b(param1, (param2.field_v >> -1730267839) + (param4 + param2.field_n), -5 + (param2.field_j + param0), 16777215, -1);
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        this.a(param0, param1, param2, param3, -67);
        if (param4 <= -49) {
          var6 = -130 + param2 >> 1125942593;
          if (!((wl) this).field_G) {
            ((wl) this).field_T.a(param0, 0, 25, var6, -80);
            ((wl) this).field_Q.a(param0, 0, 25, 45 + var6, -50);
            ((wl) this).field_J.a(param0, 0, 40, 90 + var6, -72);
            return;
          } else {
            ((wl) this).field_Q.a(param0, 0, 25, var6, -74);
            ((wl) this).field_T.a(param0, 0, 25, 45 + var6, -124);
            ((wl) this).field_J.a(param0, 0, 40, 90 + var6, -72);
            return;
          }
        } else {
          return;
        }
    }

    final boolean j(int param0) {
        if (null != ((wl) this).field_T.field_g) {
          if (0 != ((wl) this).field_T.field_g.length()) {
            if (null != ((wl) this).field_Q.field_g) {
              if (((wl) this).field_Q.field_g.length() != 0) {
                if (null != ((wl) this).field_J.field_g) {
                  if (((wl) this).field_J.field_g.length() != 0) {
                    if (param0 != -28612) {
                      field_I = null;
                      return false;
                    } else {
                      return false;
                    }
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final int e(boolean param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            wl.k(94);
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((wl) this).field_J.field_g);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    final int g(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        L0: {
          if (param0 > 59) {
            break L0;
          } else {
            field_M = null;
            break L0;
          }
        }
        try {
          stackOut_2_0 = Integer.parseInt(((wl) this).field_Q.field_g) - 1;
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    wl(pf param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((wl) this).a(param5, param3, param4, param2, -58);
    }

    private wl(pf param0, boolean param1) {
        super(0, 0, 0, 0, (pf) null);
        ((wl) this).field_T = (rn) (Object) new bi("", (wc) null, 2);
        ((wl) this).field_Q = (rn) (Object) new bi("", (wc) null, 2);
        ((wl) this).field_J = (rn) (Object) new bi("", (wc) null, 4);
        ((wl) this).field_G = param1 ? true : false;
        ((wl) this).field_J.field_r = param0;
        ((wl) this).field_Q.field_r = param0;
        ((wl) this).field_T.field_r = param0;
        if (!((wl) this).field_G) {
            ((wl) this).c(-107, (qm) (Object) ((wl) this).field_T);
            ((wl) this).c(-121, (qm) (Object) ((wl) this).field_Q);
        } else {
            ((wl) this).c(-104, (qm) (Object) ((wl) this).field_Q);
            ((wl) this).c(-110, (qm) (Object) ((wl) this).field_T);
        }
        ((wl) this).c(-103, (qm) (Object) ((wl) this).field_J);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Remove name";
        field_L = new int[17][];
        field_R = "Error connecting to server. Please try using a different server.";
        field_I = "The '<%0>' setting needs to be changed.";
        field_S = new so(1);
        field_H = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_K = 64;
        field_P = "You must be a member to play with the current options.";
    }
}
