/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kl implements Runnable {
    private ci field_a;
    private boolean field_d;
    int field_c;
    private Thread field_b;

    final void a(byte param0) {
        if (param0 != -114) {
            ((kl) this).field_c = -72;
        }
        ((kl) this).field_d = true;
        Object var2 = (Object) (Object) ((kl) this).field_a;
        // monitorenter ((kl) this).field_a
        ((Object) (Object) ((kl) this).field_a).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((kl) this).field_b.join();
        } catch (InterruptedException interruptedException) {
        }
        ((kl) this).field_b = null;
    }

    private final void a(int param0, fj param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((kl) this).field_a;
                    // monitorenter ((kl) this).field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((kl) this).field_a.a(91, (ca) (Object) param1);
                        ((kl) this).field_c = ((kl) this).field_c + 1;
                        if (param0 > 58) {
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
                        fj discarded$3 = ((kl) this).a((dl) null, (byte) -50, -68);
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
                        ((Object) (Object) ((kl) this).field_a).notifyAll();
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

    final fj a(int param0, dl param1, int param2) {
        fj var4 = new fj();
        var4.field_j = (long)param0;
        var4.field_p = false;
        var4.field_z = param1;
        var4.field_A = param2;
        this.a(110, var4);
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
            fj var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((kl) this).field_d) {
                            statePc = 22;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((kl) this).field_a;
                        // monitorenter ((kl) this).field_a
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (fj) (Object) ((kl) this).field_a.a((byte) 100);
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
                            ((Object) (Object) ((kl) this).field_a).wait();
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
                            ((kl) this).field_c = ((kl) this).field_c - 1;
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
                            if (var7.field_A != 2) {
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
                            boolean discarded$1 = var7.field_z.a(var7.field_w, var7.field_w.length, (int)var7.field_j, -1);
                            var7.field_v = false;
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
                            if (-4 == (var7.field_A ^ -1)) {
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
                            var7.field_v = false;
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
                            var7.field_w = var7.field_z.a((int)var7.field_j, -65536);
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
                        uj.a((String) null, (Throwable) (Object) var2_ref, 1);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        var7.field_v = false;
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

    final fj a(byte[] param0, int param1, int param2, dl param3) {
        fj var5 = null;
        Object var6 = null;
        if (param2 != 1) {
          var6 = null;
          fj discarded$1 = ((kl) this).a((byte[]) null, -102, -125, (dl) null);
          var5 = new fj();
          var5.field_A = 2;
          var5.field_p = false;
          var5.field_z = param3;
          var5.field_w = param0;
          var5.field_j = (long)param1;
          this.a(param2 ^ 118, var5);
          return var5;
        } else {
          var5 = new fj();
          var5.field_A = 2;
          var5.field_p = false;
          var5.field_z = param3;
          var5.field_w = param0;
          var5.field_j = (long)param1;
          this.a(param2 ^ 118, var5);
          return var5;
        }
    }

    final fj a(dl param0, byte param1, int param2) {
        fj var4 = null;
        Object var5 = null;
        fj var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        Object var9 = null;
        fj stackIn_9_0 = null;
        fj stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Lexicominos.field_L ? 1 : 0;
                    var4 = new fj();
                    var4.field_A = 1;
                    var5 = (Object) (Object) ((kl) this).field_a;
                    // monitorenter ((kl) this).field_a
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == -6) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var9 = null;
                        fj discarded$2 = ((kl) this).a(30, (dl) null, 85);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var6 = (fj) (Object) ((kl) this).field_a.a(true);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6 == null) {
                            statePc = 11;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (((long)param2 ^ -1L) != (var6.field_j ^ -1L)) {
                            statePc = 10;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (var6.field_z != param0) {
                            statePc = 10;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var6.field_A != 2) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var4.field_v = false;
                        var4.field_w = var6.field_w;
                        // monitorexit var5
                        stackOut_8_0 = (fj) var4;
                        stackIn_9_0 = stackOut_8_0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 9: {
                    return stackIn_9_0;
                }
                case 10: {
                    try {
                        var6 = (fj) (Object) ((kl) this).field_a.a(-256);
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        // monitorexit var5
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 13;
                        continue stateLoop;
                    }
                }
                case 14: {
                    throw (RuntimeException) (Object) var7;
                }
                case 15: {
                    var4.field_w = param0.a(param2, -65536);
                    var4.field_p = true;
                    var4.field_v = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, int param1, int param2, db[] param3, int param4, le param5, int param6, byte param7, db[] param8, boolean param9, int param10, int param11) {
        int var12 = 11 / ((18 - param7) / 37);
        pe.a(param10, param1, param2, param5, param0, param8, param3, param6, param5, param0, param4, -98, param11, param10, param9);
    }

    kl(ab param0) {
        ((kl) this).field_a = new ci();
        ((kl) this).field_d = false;
        ((kl) this).field_c = 0;
        ei var2 = param0.a((Runnable) this, false, 5);
        while (0 == var2.field_b) {
            ge.a(0, 10L);
        }
        if ((var2.field_b ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((kl) this).field_b = (Thread) var2.field_g;
    }

    static {
    }
}
