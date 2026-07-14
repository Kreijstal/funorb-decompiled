/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lm extends ae {
    static java.math.BigInteger field_z;
    byte field_B;
    vi field_C;
    static jb[] field_A;
    int field_x;
    static bd field_y;

    final byte[] c(byte param0) {
        L0: {
          if (((lm) this).field_v) {
            break L0;
          } else {
            if (((lm) this).field_C.field_i >= -((lm) this).field_B + ((lm) this).field_C.field_n.length) {
              L1: {
                if (param0 == 127) {
                  break L1;
                } else {
                  int discarded$2 = lm.e(46);
                  break L1;
                }
              }
              return ((lm) this).field_C.field_n;
            } else {
              break L0;
            }
          }
        }
        throw new RuntimeException();
    }

    final static boolean a(int param0, String param1) {
        String var2 = null;
        Exception var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = HostileSpawn.field_I ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == 26) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        int discarded$4 = lm.e(77);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!fd.field_c.startsWith("win")) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        if (param1.startsWith("http://")) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!param1.startsWith("https://")) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param1.length() <= var3) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-1 == var2.indexOf((int) param1.charAt(var3))) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        var3++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        Process discarded$5 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param1 + "\"");
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            Object var2 = null;
            boolean discarded$0 = lm.a((p) null, (p) null, 66);
        }
        field_y = null;
        field_z = null;
        field_A = null;
    }

    final static int e(int param0) {
        if (param0 != 0) {
            Object var2 = null;
            boolean discarded$0 = lm.a(-49, (String) null);
        }
        return -hg.field_f + pc.field_d;
    }

    final int d(int param0) {
        if (null == ((lm) this).field_C) {
            return 0;
        }
        if (param0 > -72) {
            ((lm) this).field_x = -24;
        }
        return 100 * ((lm) this).field_C.field_i / (-((lm) this).field_B + ((lm) this).field_C.field_n.length);
    }

    lm() {
    }

    final static boolean a(p param0, p param1, int param2) {
        double var3 = 0.0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var11 = HostileSpawn.field_I ? 1 : 0;
          oa.field_d.field_i = 13;
          oa.field_d.field_j.a((byte) 46, param1.field_j);
          oa.field_d.field_l.a(param1.field_l.field_a - 0.5, param1.field_l.field_f - 0.5, 1);
          if (0.0 > oa.field_d.field_l.field_a) {
            oa.field_d.field_l.field_a = oa.field_d.field_l.field_a + 1.0;
            oa.field_d.field_j.field_g = oa.field_d.field_j.field_g - 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (0.0 <= oa.field_d.field_l.field_f) {
            break L1;
          } else {
            oa.field_d.field_l.field_f = oa.field_d.field_l.field_f + 1.0;
            oa.field_d.field_j.field_e = oa.field_d.field_j.field_e - 1;
            break L1;
          }
        }
        L2: {
          oa.field_d.field_c = nh.a(-12149, param1, param0);
          var3 = param0.field_l.field_f + (double)param0.field_j.field_e;
          var5 = param0.field_l.field_a + (double)param0.field_j.field_g;
          oa.field_d.field_l.a(20, (byte) 94, oa.field_d.field_c);
          var7 = 0;
          var8 = param0.field_j.b(-4);
          var9 = ln.field_a.field_c[var8];
          ln.field_a.field_c[var8] = 0;
          if (param2 <= -40) {
            break L2;
          } else {
            field_z = null;
            break L2;
          }
        }
        var10 = 0;
        L3: while (true) {
          L4: {
            if (var10 <= -101) {
              break L4;
            } else {
              oa.field_d.a(8573);
              var7 = ln.field_a.field_c[oa.field_d.field_j.b(-4)];
              if (-3 == var7) {
                break L4;
              } else {
                if (!oa.field_d.a(var3, var5, 29821)) {
                  oa.field_d.field_l.a(2, (byte) 94, oa.field_d.field_c);
                  var10++;
                  continue L3;
                } else {
                  break L4;
                }
              }
            }
          }
          L5: {
            ln.field_a.field_c[var8] = var9;
            if ((var7 ^ -1) == -3) {
              stackOut_15_0 = 0;
              stackIn_16_0 = stackOut_15_0;
              break L5;
            } else {
              stackOut_14_0 = 1;
              stackIn_16_0 = stackOut_14_0;
              break L5;
            }
          }
          return stackIn_16_0 != 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new java.math.BigInteger("65537");
        field_A = new jb[26];
    }
}
