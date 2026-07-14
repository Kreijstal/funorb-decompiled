/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static ci field_a;
    static int field_b;

    final static int a(boolean param0, ig param1, byte param2) {
        if (param2 != 120) {
            return 120;
        }
        return param1.a(param0, 115);
    }

    final static void a(int param0) {
        Object var2 = null;
        L0: {
          if (null != nk.field_b) {
            nk.field_b.a(true);
            nk.field_b = null;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 1) {
          var2 = null;
          ti discarded$2 = pc.a((String) null, (String) null, (ci) null, -89);
          return;
        } else {
          return;
        }
    }

    final static ti a(String param0, String param1, ci param2, int param3) {
        int var6 = 60 / ((-91 - param3) / 33);
        int var4 = param2.b(77, param0);
        int var5 = param2.a(-1, param1, var4);
        return ac.a(var4, var5, param2, false);
    }

    final static boolean b(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) el.field_n;
                    // monitorenter el.field_n
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (bf.field_B == bg.field_l) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var1
                        stackOut_3_0 = 0;
                        stackIn_4_0 = stackOut_3_0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 4: {
                    return stackIn_4_0 != 0;
                }
                case 5: {
                    try {
                        ch.field_d = te.field_c[bg.field_l];
                        var2 = -67 % ((param0 - -82) / 39);
                        sg.field_n = hf.field_h[bg.field_l];
                        bg.field_l = 127 & 1 + bg.field_l;
                        // monitorexit var1
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var3 = caughtException;
                        // monitorexit var1
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 7;
                        continue stateLoop;
                    }
                }
                case 8: {
                    throw (RuntimeException) (Object) var3;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 1) {
            field_b = -120;
        }
    }

    static {
    }
}
