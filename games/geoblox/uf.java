/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf implements Runnable {
    static int[] field_h;
    private wd field_k;
    static int field_a;
    static al field_l;
    static String field_i;
    int field_d;
    private Thread field_g;
    static int field_b;
    static ob field_e;
    private boolean field_j;
    static wa field_f;
    static long field_c;

    public static void a(int param0) {
        if (param0 >= -35) {
          field_e = null;
          field_e = null;
          field_h = null;
          field_f = null;
          field_i = null;
          field_l = null;
          return;
        } else {
          field_e = null;
          field_h = null;
          field_f = null;
          field_i = null;
          field_l = null;
          return;
        }
    }

    final o a(byte param0, int param1, jh param2, byte[] param3) {
        o var5 = null;
        var5 = new o();
        var5.field_y = param3;
        var5.field_q = false;
        var5.field_i = (long)param1;
        var5.field_x = 2;
        var5.field_w = param2;
        if (param0 <= 41) {
          return null;
        } else {
          this.a(var5, 15079962);
          return var5;
        }
    }

    final o a(jh param0, int param1, int param2) {
        o var4 = null;
        Object var5 = null;
        o var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        o stackIn_10_0 = null;
        o stackOut_9_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = Geoblox.field_C;
                    var4 = new o();
                    if (param2 == 15079962) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_a = -116;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var4.field_x = 1;
                    var5 = (Object) (Object) ((uf) this).field_k;
                    // monitorenter ((uf) this).field_k
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        var6 = (o) (Object) ((uf) this).field_k.c((byte) 121);
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
                        if ((long)param1 != var6.field_i) {
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
                        if (var6.field_w != param0) {
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
                        if (2 == var6.field_x) {
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
                        var4.field_y = var6.field_y;
                        var4.field_u = false;
                        // monitorexit var5
                        stackOut_9_0 = (o) var4;
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
                        var6 = (o) (Object) ((uf) this).field_k.a(-20);
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
                    var4.field_y = param0.a(param1, (byte) -78);
                    var4.field_q = true;
                    var4.field_u = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void a(o param0, int param1) {
        Object var3 = null;
        Object var3_ref = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3_ref = (Object) (Object) ((uf) this).field_k;
                    // monitorenter ((uf) this).field_k
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((uf) this).field_k.a(-128, (rc) (Object) param0);
                        if (param1 == 15079962) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var3_ref
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return;
                }
                case 4: {
                    try {
                        ((uf) this).field_d = ((uf) this).field_d + 1;
                        ((Object) (Object) ((uf) this).field_k).notifyAll();
                        // monitorexit var3_ref
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4 = caughtException;
                        // monitorexit var3_ref
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var4;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static int a(byte param0, String param1, int param2, int param3, String param4, String param5, boolean param6) {
        mb var7 = null;
        mb var8 = null;
        var7 = new mb(param5);
        var8 = new mb(param4);
        if (param0 != -94) {
          field_e = null;
          return pf.a(param3, param2, var7, var8, param1, param6, 100);
        } else {
          return pf.a(param3, param2, var7, var8, param1, param6, 100);
        }
    }

    final static void a(int param0, int param1) {
        if (param0 < 87) {
            Object var3 = null;
            int discarded$0 = uf.a((byte) -87, (String) null, -112, 119, (String) null, (String) null, false);
        }
    }

    final void a(byte param0) {
        ((uf) this).field_j = true;
        Object var2 = (Object) (Object) ((uf) this).field_k;
        // monitorenter ((uf) this).field_k
        ((Object) (Object) ((uf) this).field_k).notifyAll();
        // monitorexit var2
        if (param0 != 51) {
            return;
        }
        try {
            if (false) throw (InterruptedException) null;
            ((uf) this).field_g.join();
        } catch (InterruptedException interruptedException) {
        }
        ((uf) this).field_g = null;
    }

    final o a(int param0, jh param1, int param2) {
        o var4 = null;
        var4 = new o();
        var4.field_x = 3;
        var4.field_w = param1;
        var4.field_q = false;
        var4.field_i = (long)param2;
        if (param0 < 22) {
          uf.a(70);
          this.a(var4, 15079962);
          return var4;
        } else {
          this.a(var4, 15079962);
          return var4;
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
            o var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Geoblox.field_C;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((uf) this).field_j) {
                            statePc = 22;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((uf) this).field_k;
                        // monitorenter ((uf) this).field_k
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (o) (Object) ((uf) this).field_k.a(true);
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
                            ((uf) this).field_d = ((uf) this).field_d - 1;
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
                            ((Object) (Object) ((uf) this).field_k).wait();
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
                            if ((var7.field_x ^ -1) != -3) {
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
                            boolean discarded$1 = var7.field_w.a(var7.field_y, (byte) -53, (int)var7.field_i, var7.field_y.length);
                            var7.field_u = false;
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
                            if (3 == var7.field_x) {
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
                            var7.field_u = false;
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
                            var7.field_y = var7.field_w.a((int)var7.field_i, (byte) -76);
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
                        gi.a((Throwable) (Object) var2_ref, (String) null, (byte) 125);
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        var7.field_u = false;
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

    uf(d param0) {
        ((uf) this).field_k = new wd();
        ((uf) this).field_d = 0;
        ((uf) this).field_j = false;
        cb var2 = param0.a((Runnable) this, 0, 5);
        while (var2.field_a == 0) {
            bc.a(0, 10L);
        }
        if (2 == var2.field_a) {
            throw new RuntimeException();
        }
        ((uf) this).field_g = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{5167632, 12183066, 16031008, 15087386, 15079962};
        field_i = "This password contains your email address, and would be easy to guess";
        field_b = 0;
        field_l = new al();
    }
}
