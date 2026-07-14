/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh implements Runnable {
    static String field_a;
    static String field_g;
    private hl field_c;
    static ci field_e;
    private boolean field_f;
    int field_b;
    private Thread field_d;

    private final void a(int param0, ma param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((wh) this).field_c;
                    // monitorenter ((wh) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((wh) this).field_c.a(11152, (vh) (Object) param1);
                        ((wh) this).field_b = ((wh) this).field_b + 1;
                        ((Object) (Object) ((wh) this).field_c).notifyAll();
                        if (param0 == 28366) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_g = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        // monitorexit var3
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 5;
                        continue stateLoop;
                    }
                }
                case 6: {
                    throw (RuntimeException) (Object) var4;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_g = null;
        field_a = null;
        if (param0 != 110) {
            wh.b(-27);
        }
    }

    final ma a(ua param0, int param1, int param2) {
        ma var4 = null;
        Object var5 = null;
        ma var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        ma stackIn_8_0 = null;
        ma stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Terraphoenix.field_V;
                    var4 = new ma();
                    var4.field_H = 1;
                    var5 = (Object) (Object) ((wh) this).field_c;
                    // monitorenter ((wh) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (ma) (Object) ((wh) this).field_c.c(param2 ^ 8194);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 10;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var6.field_m != (long)param1) {
                            statePc = 9;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (param0 != var6.field_F) {
                            statePc = 9;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (2 == var6.field_H) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var4.field_G = var6.field_G;
                        var4.field_A = false;
                        // monitorexit var5
                        stackOut_7_0 = (ma) var4;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0;
                }
                case 9: {
                    try {
                        var6 = (ma) (Object) ((wh) this).field_c.a(6273);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var5
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var7;
                }
                case 14: {
                    if (param2 != 2) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    var4.field_G = param0.a(-18342, param1);
                    var4.field_A = false;
                    var4.field_x = true;
                    return var4;
                }
                case 16: {
                    field_e = null;
                    var4.field_G = param0.a(-18342, param1);
                    var4.field_A = false;
                    var4.field_x = true;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ma a(int param0, int param1, ua param2) {
        ma var4 = new ma();
        var4.field_x = false;
        var4.field_F = param2;
        var4.field_m = (long)param1;
        var4.field_H = 3;
        int var5 = 97 / ((param0 - -11) / 47);
        this.a(28366, var4);
        return var4;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            ma var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Terraphoenix.field_V;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((wh) this).field_f) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((wh) this).field_c;
                        // monitorenter ((wh) this).field_c
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (ma) (Object) ((wh) this).field_c.a((byte) -115);
                            if (var7 != null) {
                                statePc = 10;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((Object) (Object) ((wh) this).field_c).wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof InterruptedException ? 7 : 12);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            interruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            // monitorexit var2
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((wh) this).field_b = ((wh) this).field_b - 1;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 14: {
                        try {
                            if (2 == var7.field_H) {
                                statePc = 17;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if ((var7.field_H ^ -1) != -4) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var7.field_G = var7.field_F.a(-18342, (int)var7.field_m);
                            var7.field_A = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            boolean discarded$1 = var7.field_F.a((int)var7.field_m, var7.field_G, 0, var7.field_G.length);
                            var7.field_A = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        bd.a((Throwable) (Object) var2_ref, (String) null, 96);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var7.field_A = false;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 21: {
                        return;
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

    final void a(int param0) {
        ((wh) this).field_f = true;
        Object var2 = (Object) (Object) ((wh) this).field_c;
        // monitorenter ((wh) this).field_c
        if (param0 > -39) {
            ((wh) this).field_c = null;
        }
        ((Object) (Object) ((wh) this).field_c).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((wh) this).field_d.join();
        } catch (InterruptedException interruptedException) {
        }
        ((wh) this).field_d = null;
    }

    final static void b(int param0) {
        try {
            int var1 = 0;
            Exception var1_ref_Exception = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (mh.field_b == null) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            mh.field_b.a(false, 0L);
                            mh.field_b.a(-1, 24, mk.field_j.field_i, mk.field_j.field_k);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        var1 = -15 % ((param0 - 58) / 35);
                        mk.field_j.field_k = mk.field_j.field_k + 24;
                        return;
                    }
                    case 3: {
                        var1_ref_Exception = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        var1 = -15 % ((param0 - 58) / 35);
                        mk.field_j.field_k = mk.field_j.field_k + 24;
                        return;
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

    final ma a(byte[] param0, int param1, int param2, ua param3) {
        ma var5 = null;
        var5 = new ma();
        var5.field_m = (long)param1;
        var5.field_H = 2;
        var5.field_x = false;
        var5.field_G = param0;
        if (param2 != 4626) {
          ((wh) this).field_d = null;
          var5.field_F = param3;
          this.a(28366, var5);
          return var5;
        } else {
          var5.field_F = param3;
          this.a(28366, var5);
          return var5;
        }
    }

    wh(he param0) {
        ((wh) this).field_c = new hl();
        ((wh) this).field_f = false;
        ((wh) this).field_b = 0;
        mf var2 = param0.a((Runnable) this, (byte) -21, 5);
        while (0 == var2.field_d) {
            gi.a((byte) -37, 10L);
        }
        if (-3 == (var2.field_d ^ -1)) {
            throw new RuntimeException();
        }
        ((wh) this).field_d = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Accuracy: ";
    }
}
