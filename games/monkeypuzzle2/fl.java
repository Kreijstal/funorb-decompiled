/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    static int field_b;
    static sd field_c;
    static int field_d;
    static int[] field_a;

    final static void b(int param0) {
        RuntimeException runtimeException = null;
        int var1_int = 0;
        int var2 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var2 = MonkeyPuzzle2.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var1_int = 0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (-18 >= (var1_int ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        pe.field_d[var1_int].field_e[0] = (float)(-(10 * var1_int) + 320);
                        pe.field_d[var1_int].field_e[1] = (float)(-20 - 20 * var1_int);
                        pe.field_d[var1_int].field_i[0] = (float)(320 + -(10 * var1_int));
                        pe.field_d[var1_int].field_i[1] = (float)(-20 - 20 * var1_int);
                        pe.field_d[var1_int].field_f[0] = 0.0f;
                        pe.field_d[var1_int].field_f[1] = 1000.0f;
                        var1_int++;
                        if (var2 != 0) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var2 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var1_int = -38 / ((param0 - 78) / 46);
                        bl.field_f = 640;
                        mh.field_D = 640;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw la.a((Throwable) ((Object) runtimeException), "fl.C(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_c = null;
        field_a = null;
        if (param0 != -45) {
            fl.a((byte) 31);
        }
    }

    final static void a(int param0) {
        if ((ol.field_e ^ -1) > param0) {
          w.a(-1, 32 + ol.field_e);
          if (MonkeyPuzzle2.field_F) {
            w.a(-1, 256);
            return;
          } else {
            return;
          }
        } else {
          w.a(-1, 256);
          return;
        }
    }

    static {
        field_a = new int[11];
        field_c = new sd();
    }
}
