/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wd extends se {
    private String field_i;
    static hb field_e;
    private String field_g;
    static ki field_j;
    static String field_h;
    static du field_f;

    final static ki a(int param0, byte param1) {
        if (param1 != 125) {
          field_e = null;
          return ng.a(1, -74, true, param0, false, false);
        } else {
          return ng.a(1, -74, true, param0, false, false);
        }
    }

    final void a(fs param0, byte param1) {
        param0.b(((wd) this).field_i, (byte) -105);
        param0.a(((wd) this).field_g, 46);
        if (param1 >= -107) {
            Object var4 = null;
            ((wd) this).a((fs) null, (byte) 29);
        }
    }

    final static void a(byte param0, int param1) {
        int var2 = -16 / ((18 - param0) / 60);
        fq.field_f.a(-3388, param1);
    }

    final nb a(byte param0) {
        if (param0 < 80) {
            nb discarded$0 = ((wd) this).a((byte) -128);
            return pb.field_b;
        }
        return pb.field_b;
    }

    public static void b(byte param0) {
        if (param0 != 88) {
          field_h = null;
          field_j = null;
          field_f = null;
          field_h = null;
          field_e = null;
          return;
        } else {
          field_j = null;
          field_f = null;
          field_h = null;
          field_e = null;
          return;
        }
    }

    final static boolean c(int param0) {
        Object var1 = null;
        Object var1_ref = null;
        Throwable var2 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1_ref = (Object) (Object) field_e;
                    // monitorenter field_e
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -20) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_h = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (ua.field_a != bj.field_a) {
                            statePc = 6;
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
                        // monitorexit var1_ref
                        stackOut_4_0 = 0;
                        stackIn_5_0 = stackOut_4_0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return stackIn_5_0 != 0;
                }
                case 6: {
                    try {
                        tg.field_a = cp.field_c[bj.field_a];
                        np.field_c = aa.field_c[bj.field_a];
                        bj.field_a = bj.field_a - -1 & 127;
                        // monitorexit var1_ref
                        stackOut_6_0 = 1;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0 != 0;
                }
                case 8: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1_ref
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    wd(String param0, String param1) {
        ((wd) this).field_i = param0;
        ((wd) this).field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new hb();
        field_h = "Continue";
    }
}
