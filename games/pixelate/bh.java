/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends gf {
    static boolean[][] field_h;
    static String field_m;
    private java.nio.ByteBuffer field_j;
    static int field_k;
    static String field_i;
    static String field_n;
    static String field_l;

    bh() {
    }

    final static boolean b(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var1 = (Object) (Object) mc.field_r;
                    // monitorenter mc.field_r
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 >= 105) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var3 = null;
                        bh.a(42, (hf) null, -69);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (ln.field_p == qn.field_p) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        // monitorexit var1
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        ke.field_a = gn.field_z[qn.field_p];
                        nj.field_f = fm.field_d[qn.field_p];
                        qn.field_p = 1 + qn.field_p & 127;
                        // monitorexit var1
                        stackOut_7_0 = 1;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final byte[] b(int param0) {
        byte[] var2 = null;
        byte[] var3 = null;
        var3 = new byte[((bh) this).field_j.capacity()];
        var2 = var3;
        java.nio.Buffer discarded$19 = ((bh) this).field_j.position(0);
        java.nio.ByteBuffer discarded$20 = ((bh) this).field_j.get(var3);
        if (param0 != 32) {
          return null;
        } else {
          return var3;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        if (param0 < 71) {
          boolean discarded$2 = bh.b((byte) -16);
          field_l = null;
          field_i = null;
          field_m = null;
          field_n = null;
          return;
        } else {
          field_l = null;
          field_i = null;
          field_m = null;
          field_n = null;
          return;
        }
    }

    final static void a(int param0, hf param1, int param2) {
        int var3 = 113 / ((59 - param0) / 39);
        dh.field_a.a(22125, (fa) (Object) param1);
        id.a((byte) -109, param1, param2);
    }

    final void a(byte[] param0, boolean param1) {
        ((bh) this).field_j = java.nio.ByteBuffer.allocateDirect(param0.length);
        if (!param1) {
          field_m = null;
          java.nio.Buffer discarded$8 = ((bh) this).field_j.position(0);
          java.nio.ByteBuffer discarded$9 = ((bh) this).field_j.put(param0);
          return;
        } else {
          java.nio.Buffer discarded$10 = ((bh) this).field_j.position(0);
          java.nio.ByteBuffer discarded$11 = ((bh) this).field_j.put(param0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "to return to the normal view.";
        field_i = "The following settings need to be changed:  ";
        field_l = "Honour";
    }
}
