/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cm {
    static int field_j;
    int field_a;
    int field_g;
    int field_d;
    int field_e;
    static bh field_b;
    static mf field_i;
    int field_h;
    static int field_f;
    int field_c;

    final static void a(byte param0) {
        if (!hi.a((byte) -72)) {
          return;
        } else {
          if (param0 != -28) {
            cm.a((byte) 87);
            pf.a(4, 1, false);
            return;
          } else {
            pf.a(4, 1, false);
            return;
          }
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 < 44) {
            cm.b(91);
            field_b = null;
            return;
        }
        field_b = null;
    }

    abstract void a(int param0, int param1);

    final static int b(int param0) {
        if (param0 < 34) {
            return 54;
        }
        return 1;
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = fleas.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        gi.a(true, 0, qh.field_D, -3300, lc.field_u, param0, ea.field_a);
                        var2_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (qh.field_D <= var2_int) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        mh.field_y[param0 + var2_int] = var2_int;
                        var2_int++;
                        if (var3 != 0) {
                            statePc = 7;
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
                        if (var3 == 0) {
                            statePc = 2;
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
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var2_int = -9 % ((79 - param1) / 38);
                        gi.a(false, param0, qh.field_D - -param0, -3300, ok.field_L, param0 - -param0, ak.field_f);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (param0 < qh.field_D) {
                            statePc = 9;
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
                        return;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        qh.field_D = param0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return;
                }
                case 11: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw pf.a((Throwable) ((Object) var2), "cm.I(" + param0 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract void a(int param0, int param1, int param2);

    static {
        field_b = null;
    }
}
