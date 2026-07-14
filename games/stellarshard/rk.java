/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk implements Runnable {
    static String field_b;
    private al field_d;
    static int field_f;
    private Thread field_g;
    int field_e;
    static wb field_c;
    private boolean field_a;

    final el a(gi param0, int param1, int param2) {
        el var4 = new el();
        var4.field_o = (long)param2;
        var4.field_u = false;
        var4.field_C = param1;
        var4.field_B = param0;
        this.a(-52, var4);
        return var4;
    }

    final static void a(int param0) {
        if (param0 != 3) {
            field_f = 37;
            rh.a(4, (byte) -72);
            return;
        }
        rh.a(4, (byte) -72);
    }

    final el a(gi param0, int param1, int param2, byte[] param3) {
        el var5 = new el();
        var5.field_C = 2;
        var5.field_u = false;
        var5.field_B = param0;
        var5.field_D = param3;
        var5.field_o = (long)param2;
        this.a(-113, var5);
        int var6 = -24 / ((param1 - -50) / 51);
        return var5;
    }

    final void a(byte param0) {
        ((rk) this).field_a = true;
        Object var2 = (Object) (Object) ((rk) this).field_d;
        // monitorenter ((rk) this).field_d
        ((Object) (Object) ((rk) this).field_d).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((rk) this).field_g.join();
            int var2_int = -7 % ((param0 - -18) / 47);
        } catch (InterruptedException interruptedException) {
        }
        ((rk) this).field_g = null;
    }

    private final void a(int param0, el param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((rk) this).field_d;
                    // monitorenter ((rk) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -10) {
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
                        var5 = null;
                        el discarded$3 = ((rk) this).a((gi) null, 8, 126);
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
                        ((rk) this).field_d.a((byte) 127, (ah) (Object) param1);
                        ((rk) this).field_e = ((rk) this).field_e + 1;
                        ((Object) (Object) ((rk) this).field_d).notifyAll();
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

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
        field_c = null;
    }

    final el a(gi param0, byte param1, int param2) {
        el var4 = null;
        Object var5 = null;
        el var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        el stackIn_10_0 = null;
        el stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = stellarshard.field_B;
                    var4 = new el();
                    var4.field_C = 1;
                    var5 = (Object) (Object) ((rk) this).field_d;
                    // monitorenter ((rk) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 >= 30) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((rk) this).field_a = true;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = (el) (Object) ((rk) this).field_d.a(false);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == null) {
                            statePc = 12;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((var6.field_o ^ -1L) != ((long)param2 ^ -1L)) {
                            statePc = 11;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6.field_B != param0) {
                            statePc = 11;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if ((var6.field_C ^ -1) == -3) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4.field_D = var6.field_D;
                        var4.field_w = false;
                        // monitorexit var5
                        stackOut_9_0 = (el) var4;
                        stackIn_10_0 = stackOut_9_0;
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 10: {
                    return stackIn_10_0;
                }
                case 11: {
                    try {
                        var6 = (el) (Object) ((rk) this).field_d.a(-97);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        // monitorexit var5
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 15: {
                    throw (RuntimeException) (Object) var7;
                }
                case 16: {
                    var4.field_D = param0.a(true, param2);
                    var4.field_u = true;
                    var4.field_w = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            el var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = stellarshard.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((rk) this).field_a) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((rk) this).field_d;
                        // monitorenter ((rk) this).field_d
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (el) (Object) ((rk) this).field_d.a((byte) 92);
                            if (var7 == null) {
                                statePc = 5;
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
                            ((rk) this).field_e = ((rk) this).field_e - 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((Object) (Object) ((rk) this).field_d).wait();
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
                            if (-3 != (var7.field_C ^ -1)) {
                                statePc = 16;
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
                            boolean discarded$1 = var7.field_B.a(var7.field_D, var7.field_D.length, 5, (int)var7.field_o);
                            var7.field_w = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (3 != var7.field_C) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_D = var7.field_B.a(true, (int)var7.field_o);
                            var7.field_w = false;
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
                        qe.a(60, (String) null, (Throwable) (Object) var2_ref);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var7.field_w = false;
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

    rk(ej param0) {
        ((rk) this).field_d = new al();
        ((rk) this).field_e = 0;
        ((rk) this).field_a = false;
        re var2 = param0.a((Runnable) this, 5, 0);
        while (0 == var2.field_f) {
            jj.a((byte) -124, 10L);
        }
        if (-3 == (var2.field_f ^ -1)) {
            throw new RuntimeException();
        }
        ((rk) this).field_g = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Start Game";
        field_c = new wb();
    }
}
