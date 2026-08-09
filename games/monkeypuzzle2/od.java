/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends f {
    static String field_o;
    static ee field_n;
    static byte[] field_m;
    static long field_l;

    final static le b(int param0) {
        int var1;
        byte[] var2;
        int[] var3;
        int var4_int;
        le var4;
        int var5;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var1 = ra.field_ab[0] * da.field_c[0];
        var2 = cb.field_b[0];
        var3 = new int[var1];
        if (param0 < 55) {
          return (le) null;
        } else {
          var4_int = 0;
          L0: while (true) {
            L1: {
              if (var1 <= var4_int) {
                break L1;
              } else {
                var3[var4_int] = fk.field_d[ch.a(255, (int) var2[var4_int])];
                var4_int++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  break L1;
                }
              }
            }
            var4 = new le(nj.field_d, qk.field_a, qc.field_P[0], mb.field_b[0], da.field_c[0], ra.field_ab[0], var3);
            gb.a(-112);
            return var4;
          }
        }
    }

    public static void c(byte param0) {
        int var1 = -74 / ((73 - param0) / 39);
        field_o = null;
        field_n = null;
        field_m = null;
    }

    final fk a(boolean param0) {
        if (param0) {
            field_o = (String) null;
            return wa.field_e;
        }
        return wa.field_e;
    }

    od(long param0, String param1) {
        super(param0, param1);
    }

    final static StringBuilder a(StringBuilder param0, int param1, int param2, char param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_3_0 = null;
        StringBuilder stackIn_7_0 = null;
        StringBuilder stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var4_int = param0.length();
                        param0.setLength(param1);
                        if (param2 <= -22) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = (StringBuilder) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var5 = var4_int;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (param1 <= var5) {
                            statePc = 9;
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
                        stackIn_10_0 = (StringBuilder) (param0);
                        stackIn_7_0 = stackIn_10_0;
                        if (var6 != 0) {
                            statePc = 10;
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
                        ((StringBuilder) (Object) stackIn_7_0).setCharAt(var5, param3);
                        var5++;
                        if (var6 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
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
                        stackIn_10_0 = (StringBuilder) (param0);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    var4 = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (var4);
                    stackIn_12_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("od.A(");
                    stackIn_12_1 = stackIn_13_1;
                    if (param0 == null) {
                        statePc = 13;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 12: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_12_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_12_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw la.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        field_o = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_m = new byte[520];
    }
}
