/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb implements Runnable {
    static ff field_c;
    private o field_h;
    static ot[] field_i;
    int field_e;
    private Thread field_a;
    private boolean field_f;
    static int field_b;
    static int field_d;
    static String[] field_g;

    private final void a(hi param0, boolean param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((eb) this).field_h;
                    // monitorenter ((eb) this).field_h
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((eb) this).field_h.a(127, (am) (Object) param0);
                        ((eb) this).field_e = ((eb) this).field_e + 1;
                        ((Object) (Object) ((eb) this).field_h).notifyAll();
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
                    if (param1) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    return;
                }
                case 7: {
                    field_b = -100;
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
            hi var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Kickabout.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((eb) this).field_f) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((eb) this).field_h;
                        // monitorenter ((eb) this).field_h
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (hi) (Object) ((eb) this).field_h.b((byte) 3);
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
                            ((eb) this).field_e = ((eb) this).field_e - 1;
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
                            ((Object) (Object) ((eb) this).field_h).wait();
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
                            if (2 == var7.field_t) {
                                statePc = 18;
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
                            if (3 == var7.field_t) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var7.field_p = false;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var7.field_u = var7.field_v.a((int)var7.field_l, 65280);
                            var7.field_p = false;
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
                            boolean discarded$1 = var7.field_v.a((byte) 66, (int)var7.field_l, var7.field_u.length, var7.field_u);
                            var7.field_p = false;
                            statePc = 1;
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
                        bd.a((String) null, (Throwable) (Object) var2_ref, 1);
                        var7.field_p = false;
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

    final hi a(int param0, int param1, qh param2) {
        hi var4 = null;
        var4 = new hi();
        if (param0 != 8947) {
          return null;
        } else {
          var4.field_q = false;
          var4.field_v = param2;
          var4.field_t = 3;
          var4.field_l = (long)param1;
          this.a(var4, false);
          return var4;
        }
    }

    final hi a(int param0, qh param1, int param2) {
        hi var4 = null;
        Object var5 = null;
        hi var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        hi stackIn_9_0 = null;
        hi stackOut_8_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Kickabout.field_G;
                    var4 = new hi();
                    var4.field_t = 1;
                    var5 = (Object) (Object) ((eb) this).field_h;
                    // monitorenter ((eb) this).field_h
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 == -913) {
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
                        ((eb) this).b(-77);
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
                        var6 = (hi) (Object) ((eb) this).field_h.a(-125);
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
                        if (var6.field_l != (long)param2) {
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
                        if (var6.field_v != param1) {
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
                        if ((var6.field_t ^ -1) != -3) {
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
                        var4.field_p = false;
                        var4.field_u = var6.field_u;
                        // monitorexit var5
                        stackOut_8_0 = (hi) var4;
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
                        var6 = (hi) (Object) ((eb) this).field_h.b(0);
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
                    var4.field_u = param1.a(param2, param0 + 66193);
                    var4.field_q = true;
                    var4.field_p = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        ((eb) this).field_f = true;
        Object var2 = (Object) (Object) ((eb) this).field_h;
        // monitorenter ((eb) this).field_h
        if (param0 <= 107) {
            ((eb) this).field_f = false;
        }
        ((Object) (Object) ((eb) this).field_h).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((eb) this).field_a.join();
        } catch (InterruptedException interruptedException) {
        }
        ((eb) this).field_a = null;
    }

    public static void a(int param0) {
        field_i = null;
        field_c = null;
        field_g = null;
        if (param0 != 2) {
            field_b = 17;
        }
    }

    final hi a(int param0, qh param1, byte[] param2, byte param3) {
        hi var5 = null;
        if (param3 <= 1) {
          return null;
        } else {
          var5 = new hi();
          var5.field_l = (long)param0;
          var5.field_q = false;
          var5.field_u = param2;
          var5.field_v = param1;
          var5.field_t = 2;
          this.a(var5, false);
          return var5;
        }
    }

    eb(bu param0) {
        ((eb) this).field_h = new o();
        ((eb) this).field_e = 0;
        ((eb) this).field_f = false;
        wu var2 = param0.a(5, (byte) 121, (Runnable) this);
        while (-1 == (var2.field_a ^ -1)) {
            aj.a(10L, 1);
        }
        if (2 == var2.field_a) {
            throw new RuntimeException();
        }
        ((eb) this).field_a = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ff(0, 2, 2, 1);
    }
}
