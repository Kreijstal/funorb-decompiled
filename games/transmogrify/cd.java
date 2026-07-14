/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd implements Runnable {
    static int field_b;
    static pg field_f;
    private bk field_c;
    private Thread field_a;
    int field_e;
    private boolean field_d;

    final cl a(int param0, ak param1, byte param2) {
        cl var4 = new cl();
        var4.field_p = false;
        var4.field_C = param1;
        var4.field_z = 3;
        var4.field_j = (long)param0;
        if (param2 != 67) {
            ((cd) this).field_c = null;
        }
        this.a(param2 + -4641, var4);
        return var4;
    }

    final void c(int param0) {
        ((cd) this).field_d = true;
        Object var2 = (Object) (Object) ((cd) this).field_c;
        // monitorenter ((cd) this).field_c
        ((Object) (Object) ((cd) this).field_c).notifyAll();
        // monitorexit var2
        if (param0 != -20444) {
            return;
        }
        try {
            if (false) throw (InterruptedException) null;
            ((cd) this).field_a.join();
        } catch (InterruptedException interruptedException) {
        }
        ((cd) this).field_a = null;
    }

    final static ti a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = Transmogrify.field_A ? 1 : 0;
        ti var6 = new ti(param1, param1);
        ti var3 = var6;
        if (param2 >= -18) {
            String discarded$0 = cd.b(92);
        }
        for (var4 = 0; var4 < var3.field_w.length; var4++) {
            var6.field_w[var4] = param0;
        }
        return var3;
    }

    private final void a(int param0, cl param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((cd) this).field_c;
                    // monitorenter ((cd) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((cd) this).field_c.a((byte) -128, (ri) (Object) param1);
                        ((cd) this).field_e = ((cd) this).field_e + 1;
                        ((Object) (Object) ((cd) this).field_c).notifyAll();
                        // monitorexit var3
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 3;
                        continue stateLoop;
                    }
                }
                case 4: {
                    throw (RuntimeException) (Object) var4;
                }
                case 5: {
                    if (param0 == -4574) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ti discarded$2 = cd.a(3, 60, (byte) 39);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 < 5) {
            cd.a(-105);
        }
        field_f = null;
    }

    final cl a(ak param0, byte[] param1, int param2, int param3) {
        cl var5 = new cl();
        var5.field_j = (long)param3;
        if (param2 > -76) {
            field_f = null;
        }
        var5.field_C = param0;
        var5.field_p = false;
        var5.field_z = 2;
        var5.field_B = param1;
        this.a(-4574, var5);
        return var5;
    }

    final cl a(ak param0, int param1, boolean param2) {
        cl var4 = null;
        Object var5 = null;
        cl var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        cl stackIn_8_0 = null;
        cl stackIn_15_0 = null;
        cl stackIn_16_0 = null;
        cl stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        cl stackOut_7_0 = null;
        cl stackOut_14_0 = null;
        cl stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        cl stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Transmogrify.field_A ? 1 : 0;
                    var4 = new cl();
                    var4.field_z = 1;
                    var5 = (Object) (Object) ((cd) this).field_c;
                    // monitorenter ((cd) this).field_c
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (cl) (Object) ((cd) this).field_c.b((byte) 114);
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
                        if ((var6.field_j ^ -1L) != ((long)param1 ^ -1L)) {
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
                        if (param0 != var6.field_C) {
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
                        if (var6.field_z == 2) {
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
                        var4.field_B = var6.field_B;
                        var4.field_m = false;
                        // monitorexit var5
                        stackOut_7_0 = (cl) var4;
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
                        var6 = (cl) (Object) ((cd) this).field_c.a(108);
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
                    var4.field_B = param0.b(-88, param1);
                    var4.field_m = false;
                    stackOut_14_0 = (cl) var4;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (!param2) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    stackOut_15_0 = (cl) (Object) stackIn_15_0;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 16: {
                    stackOut_16_0 = (cl) (Object) stackIn_16_0;
                    stackOut_16_1 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_17_0.field_p = stackIn_17_1 != 0;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String b(int param0) {
        int var1 = -99 / ((-15 - param0) / 46);
        if (rh.field_v == of.field_d) {
            return kk.field_g;
        }
        if (!(db.field_a != of.field_d)) {
            return jh.field_g;
        }
        if (!dl.field_l.b(-26753)) {
            return jh.field_g;
        }
        return ob.field_F;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            cl var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((cd) this).field_d) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((cd) this).field_c;
                        // monitorenter ((cd) this).field_c
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (cl) (Object) ((cd) this).field_c.d(-31914);
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
                            ((cd) this).field_e = ((cd) this).field_e - 1;
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
                            ((Object) (Object) ((cd) this).field_c).wait();
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
                            if (-3 == (var7.field_z ^ -1)) {
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
                            if (3 != var7.field_z) {
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
                            var7.field_B = var7.field_C.b(-80, (int)var7.field_j);
                            var7.field_m = false;
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
                            boolean discarded$1 = var7.field_C.a(true, (int)var7.field_j, var7.field_B, var7.field_B.length);
                            var7.field_m = false;
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
                        d.a((Throwable) (Object) var2_ref, 100, (String) null);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var7.field_m = false;
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

    cd(fe param0) {
        ((cd) this).field_c = new bk();
        ((cd) this).field_d = false;
        ((cd) this).field_e = 0;
        ib var2 = param0.a((Runnable) this, 5, 65535);
        while (-1 == var2.field_c) {
            pg.a(10L, -95);
        }
        if (-3 == var2.field_c) {
            throw new RuntimeException();
        }
        ((cd) this).field_a = (Thread) var2.field_g;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 640;
    }
}
