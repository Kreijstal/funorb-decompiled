/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ak {
    static ud field_b;
    static String field_g;
    static String field_e;
    tc field_h;
    static String field_c;
    static String field_f;
    static String field_a;
    static int field_d;
    static String field_i;

    final static int a(int param0, int param1, byte param2) {
        if (!(c.field_i != null)) {
            return -1;
        }
        if (dm.field_a > param0) {
            if (param2 != 7) {
                ak.a(32, 49, false, -4);
                if (sk.field_e > param0) {
                    return -1;
                }
                if (c.field_i.field_I + sk.field_e <= param0) {
                    return -1;
                }
                if (param1 < dg.field_b) {
                    return -1;
                }
                if (c.field_i.field_H + dg.field_b <= param1) {
                    return -1;
                }
                return 1;
            }
            if (sk.field_e <= param0 && c.field_i.field_I + sk.field_e > param0 && param1 >= dg.field_b && c.field_i.field_H + dg.field_b > param1) {
                return 1;
            }
            return -1;
        }
        if (c.field_i.field_I + dm.field_a <= param0) {
            if (param2 != 7) {
                ak.a(32, 49, false, -4);
                if (sk.field_e <= param0 && c.field_i.field_I + sk.field_e > param0 && param1 >= dg.field_b && c.field_i.field_H + dg.field_b > param1) {
                    return 1;
                }
                return -1;
            }
            if (sk.field_e <= param0 && c.field_i.field_I + sk.field_e > param0 && param1 >= dg.field_b && c.field_i.field_H + dg.field_b > param1) {
                return 1;
            }
            return -1;
        }
        if (sk.field_k <= param1 && param1 < sk.field_k + c.field_i.field_H) {
            return 0;
        }
        if (param2 != 7) {
            ak.a(32, 49, false, -4);
            if (sk.field_e <= param0 && c.field_i.field_I + sk.field_e > param0 && param1 >= dg.field_b && c.field_i.field_H + dg.field_b > param1) {
                return 1;
            }
            return -1;
        }
        if (sk.field_e <= param0 && c.field_i.field_I + sk.field_e > param0 && param1 >= dg.field_b && c.field_i.field_H + dg.field_b > param1) {
            return 1;
        }
        return -1;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        int var4;
        L0: {
          c.field_i.c(param0, param1);
          if (param2) {
            L1: {
              var4 = rb.field_b % c.field_i.field_I * 2;
              if (c.field_i.field_I <= var4) {
                var4 = c.field_i.field_I - (var4 + -c.field_i.field_I);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (var4 < 10) {
                  break L3;
                } else {
                  if (var4 <= -40 + c.field_i.field_I) {
                    break L2;
                  } else {
                    var4 = c.field_i.field_I - 40;
                    if (!client.field_A) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              var4 = 10;
              break L2;
            }
            sh.a(0, 80, 25547, param0, 30, 0, var4, c.field_i, param1);
            break L0;
          } else {
            break L0;
          }
        }
        if (param3 != 40) {
          ak.a(43, 33, true, -46);
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_b = null;
        field_a = null;
        field_e = null;
        field_c = null;
        field_f = null;
        field_i = null;
        if (param0 != -112) {
            ak.a(-56, -90, (byte) -84);
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6;
        int var7;
        var6 = 24;
        var7 = 5;
        this.field_h.a(param0, param4, param1, var7, var6, param2, -53);
        if (param3 < 97) {
          ak.a(127, 8, false, -33);
          jc.field_c.a(tb.field_c.field_mb, 0, 0, kf.field_O, 0);
          tc.field_Ub.a(-2 + -vh.field_e + (tb.field_c.field_mb + -80) - 2, 0, kf.field_O + 2, 18, 0);
          cf.field_d.a(vh.field_e + 82, 0, 2 + kf.field_O, 18, -80 + -vh.field_e + (tb.field_c.field_mb - 2));
          k.field_b.a(0, 1, -kf.field_O + (tb.field_c.field_N - 22), kf.field_O - -22, vh.field_e, 2, tb.field_c.field_mb, 20);
          ge.field_f.a(vh.field_e, 20, 2, 16);
          return;
        } else {
          jc.field_c.a(tb.field_c.field_mb, 0, 0, kf.field_O, 0);
          tc.field_Ub.a(-2 + -vh.field_e + (tb.field_c.field_mb + -80) - 2, 0, kf.field_O + 2, 18, 0);
          cf.field_d.a(vh.field_e + 82, 0, 2 + kf.field_O, 18, -80 + -vh.field_e + (tb.field_c.field_mb - 2));
          k.field_b.a(0, 1, -kf.field_O + (tb.field_c.field_N - 22), kf.field_O - -22, vh.field_e, 2, tb.field_c.field_mb, 20);
          ge.field_f.a(vh.field_e, 20, 2, 16);
          return;
        }
    }

    ak(String param0, w param1) {
        String[] var3 = null;
        w[] var4 = null;
        try {
            var3 = new String[]{param0, al.field_a, tl.field_s};
            var4 = new w[]{param1, tb.field_c, (w) ((Object) ge.field_f)};
            this.field_h = new tc(0L, ec.field_i, var3, fb.field_b, var4, 0);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "ak.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static dc[] a(byte param0, fd param1) {
        dc[] stackIn_3_0 = null;
        dc[] stackIn_12_0 = null;
        dc[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        dc[] var4 = null;
        int var5 = 0;
        dc var6 = null;
        int var7 = 0;
        mh var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var7 = client.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1.b(-86)) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = new dc[]{};
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var8 = param1.a((byte) 123);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var8.field_c != 0) {
                            statePc = 9;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ua.a(10L, -128);
                        if (var7 != 0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var7 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if ((var8.field_c ^ -1) == -3) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        stackIn_12_0 = new dc[]{};
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 12: {
                    return stackIn_12_0;
                }
                case 13: {
                    try {
                        var10 = (int[]) (var8.field_b);
                        var9 = var10;
                        var3 = var9;
                        var4 = new dc[var10.length >> 465277314];
                        var5 = 0;
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (var5 >= var4.length) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = new dc();
                        var4[var5] = var6;
                        var6.field_f = var3[var5 << 789348322];
                        var6.field_j = var3[1 + (var5 << -1273691358)];
                        var6.field_h = var3[(var5 << -330762750) - -2];
                        var6.field_a = var3[3 + (var5 << 1002693154)];
                        var5++;
                        if (var7 != 0) {
                            statePc = 20;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (var7 == 0) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (param0 == -109) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        ak.a(94, -113, true, 89);
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackIn_21_0 = (dc[]) (var4);
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0;
                }
                case 22: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    stackIn_24_0 = (RuntimeException) (var2);
                    stackIn_23_0 = stackIn_24_0;
                    stackIn_24_1 = new StringBuilder().append("ak.E(").append(param0).append(',');
                    stackIn_23_1 = stackIn_24_1;
                    if (param1 == null) {
                        statePc = 24;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                    stackIn_25_2 = "{...}";
                    statePc = 25;
                    continue stateLoop;
                }
                case 24: {
                    stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                    stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                    stackIn_25_2 = "null";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    throw dh.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_e = "Stamina Highscores";
        field_g = "Connection lost - attempting to reconnect";
        field_a = "Rating";
        field_i = "Playing";
        field_c = "Press 'SPACE' or 'ENTER' to continue";
        field_f = "This entry doesn't match";
    }
}
