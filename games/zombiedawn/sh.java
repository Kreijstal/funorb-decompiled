/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh implements Runnable {
    static String field_c;
    static int field_g;
    static int field_a;
    static int field_i;
    static qf field_d;
    static byte[][] field_j;
    static int field_e;
    private ra field_b;
    private boolean field_l;
    private Thread field_h;
    static String field_f;
    int field_k;

    final wd a(byte param0, int param1, na param2, byte[] param3) {
        wd var5 = null;
        if (param0 <= 37) {
          sh.a((byte) -26);
          var5 = new wd();
          var5.field_x = param2;
          var5.field_A = param3;
          var5.field_n = (long)param1;
          var5.field_r = false;
          var5.field_v = 2;
          this.a(true, var5);
          return var5;
        } else {
          var5 = new wd();
          var5.field_x = param2;
          var5.field_A = param3;
          var5.field_n = (long)param1;
          var5.field_r = false;
          var5.field_v = 2;
          this.a(true, var5);
          return var5;
        }
    }

    private final void a(boolean param0, wd param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((sh) this).field_b;
                    // monitorenter ((sh) this).field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((sh) this).field_b.a((nb) (Object) param1, (byte) -112);
                        ((sh) this).field_k = ((sh) this).field_k + 1;
                        if (param0) {
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
                        aj discarded$3 = sh.a((Throwable) null, (String) null);
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
                        ((Object) (Object) ((sh) this).field_b).notifyAll();
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

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            wd var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = ZombieDawn.field_J;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((sh) this).field_l) {
                            statePc = 22;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((sh) this).field_b;
                        // monitorenter ((sh) this).field_b
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (wd) (Object) ((sh) this).field_b.a(-90);
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
                            ((sh) this).field_k = ((sh) this).field_k - 1;
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
                            ((Object) (Object) ((sh) this).field_b).wait();
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
                            if (2 != var7.field_v) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            boolean discarded$1 = var7.field_x.a((int)var7.field_n, var7.field_A, var7.field_A.length, (byte) -96);
                            var7.field_q = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (-4 == (var7.field_v ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_q = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var7.field_A = var7.field_x.a(-65536, (int)var7.field_n);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref = (Exception) (Object) caughtException;
                        var6 = null;
                        ae.a((Throwable) (Object) var2_ref, 10331, (String) null);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        var7.field_q = false;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 22: {
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

    final static aj a(Throwable param0, String param1) {
        aj var2_ref = null;
        aj var2 = null;
        if (!(param0 instanceof aj)) {
            var2 = new aj(param0, param1);
        } else {
            var2_ref = (aj) (Object) param0;
            var2_ref.field_b = var2_ref.field_b + 32 + param1;
        }
        return var2_ref;
    }

    final void a(boolean param0) {
        ((sh) this).field_l = param0 ? true : false;
        Object var2 = (Object) (Object) ((sh) this).field_b;
        // monitorenter ((sh) this).field_b
        ((Object) (Object) ((sh) this).field_b).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((sh) this).field_h.join();
        } catch (InterruptedException interruptedException) {
        }
        ((sh) this).field_h = null;
    }

    final wd a(int param0, na param1, int param2) {
        wd var4 = null;
        Object var5 = null;
        wd var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object stackIn_3_0 = null;
        wd stackIn_10_0 = null;
        Object stackOut_2_0 = null;
        wd stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawn.field_J;
                    var4 = new wd();
                    var4.field_v = 1;
                    var5 = (Object) (Object) ((sh) this).field_b;
                    // monitorenter ((sh) this).field_b
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param2 < -101) {
                            statePc = 4;
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
                        // monitorexit var5
                        stackOut_2_0 = null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (wd) (Object) stackIn_3_0;
                }
                case 4: {
                    try {
                        var6 = (wd) (Object) ((sh) this).field_b.c((byte) 34);
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6 == null) {
                            statePc = 12;
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
                        if ((long)param0 != var6.field_n) {
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
                        if (var6.field_x != param1) {
                            statePc = 11;
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
                        if ((var6.field_v ^ -1) != -3) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4.field_A = var6.field_A;
                        var4.field_q = false;
                        // monitorexit var5
                        stackOut_9_0 = (wd) var4;
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
                        var6 = (wd) (Object) ((sh) this).field_b.a((byte) 114);
                        statePc = 5;
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
                    var4.field_A = param1.a(-65536, param0);
                    var4.field_r = true;
                    var4.field_q = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_f = null;
        field_d = null;
        field_c = null;
        if (param0 >= -117) {
            field_f = null;
        }
    }

    final wd a(byte param0, na param1, int param2) {
        wd var4 = null;
        Object var5 = null;
        var4 = new wd();
        var4.field_r = false;
        var4.field_n = (long)param2;
        var4.field_x = param1;
        var4.field_v = 3;
        this.a(true, var4);
        if (param0 != -119) {
          var5 = null;
          this.a(false, (wd) null);
          return var4;
        } else {
          return var4;
        }
    }

    sh(ec param0) {
        ((sh) this).field_b = new ra();
        ((sh) this).field_l = false;
        ((sh) this).field_k = 0;
        op var2 = param0.a(5, (Runnable) this, true);
        while (0 == var2.field_f) {
            ld.a(10L, (byte) 105);
        }
        if (2 == var2.field_f) {
            throw new RuntimeException();
        }
        ((sh) this).field_h = (Thread) var2.field_d;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = -1;
        field_j = new byte[50][];
        field_c = "Resume Game";
        field_g = 70;
        field_f = "The requirements and rewards for this will be shown once it has been achieved.";
    }
}
