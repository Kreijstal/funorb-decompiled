/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj implements Runnable {
    static int field_h;
    static int[] field_k;
    static String field_f;
    private dl field_d;
    static String field_b;
    static int field_g;
    static int field_i;
    int field_j;
    static String[] field_c;
    private Thread field_a;
    private boolean field_e;
    static int field_l;

    final si a(gf param0, int param1, int param2) {
        si var4 = null;
        Object var5 = null;
        si var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        si stackIn_7_0 = null;
        si stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                    var4 = new si();
                    var4.field_q = param1;
                    var5 = (Object) (Object) ((uj) this).field_d;
                    // monitorenter ((uj) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (si) (Object) ((uj) this).field_d.a(true);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var6 == null) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (((long)param2 ^ -1L) != (var6.field_f ^ -1L)) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var6.field_t != param0) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var6.field_q != 2) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var4.field_j = false;
                        var4.field_p = var6.field_p;
                        // monitorexit var5
                        stackOut_6_0 = (si) var4;
                        stackIn_7_0 = stackOut_6_0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return stackIn_7_0;
                }
                case 8: {
                    try {
                        var6 = (si) (Object) ((uj) this).field_d.c((byte) -75);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        // monitorexit var5
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 12: {
                    throw (RuntimeException) (Object) var7;
                }
                case 13: {
                    var4.field_p = param0.a(param2, (byte) 100);
                    var4.field_m = true;
                    var4.field_j = false;
                    return var4;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final si a(boolean param0, int param1, byte[] param2, gf param3) {
        si var5 = new si();
        var5.field_f = (long)param1;
        var5.field_m = param0 ? true : false;
        var5.field_p = param2;
        var5.field_q = 2;
        var5.field_t = param3;
        this.a(-37, var5);
        return var5;
    }

    final static ai[] a(String param0, String param1, ad param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        var4 = param2.c(param0, (byte) -105);
        if (param3) {
          field_k = null;
          var5 = param2.a(param1, var4, -28459);
          return b.a(var5, 10, param2, var4);
        } else {
          var5 = param2.a(param1, var4, -28459);
          return b.a(var5, 10, param2, var4);
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
            si var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((uj) this).field_e) {
                            statePc = 21;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((uj) this).field_d;
                        // monitorenter ((uj) this).field_d
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (si) (Object) ((uj) this).field_d.a((byte) -120);
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
                            ((uj) this).field_j = ((uj) this).field_j - 1;
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
                            ((Object) (Object) ((uj) this).field_d).wait();
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
                            if (var7.field_q != 2) {
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
                            boolean discarded$1 = var7.field_t.a(5, (int)var7.field_f, var7.field_p.length, var7.field_p);
                            var7.field_j = false;
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
                            if (var7.field_q != 3) {
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
                            var7.field_p = var7.field_t.a((int)var7.field_f, (byte) 125);
                            var7.field_j = false;
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
                        kk.a((String) null, (byte) 73, (Throwable) (Object) var2_ref);
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        var7.field_j = false;
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

    final static void b(int param0) {
        hd.field_u.a(ri.field_b, param0 + 0);
        ok.field_a.a(ri.field_b, 0);
        wd.field_h.a(ri.field_b, 0);
        rf.field_a.a(aj.field_b, param0 + param0);
        sb.field_m.e();
        ge.d();
        ac.field_a.a((byte) 114);
        ek.field_b = 0;
        dc.field_e = 0;
        ok.field_d = false;
        sc.field_c = 0;
    }

    final si a(int param0, gf param1, byte param2) {
        si var4 = null;
        var4 = new si();
        var4.field_t = param1;
        if (param2 >= -90) {
          ((uj) this).field_a = null;
          var4.field_m = false;
          var4.field_f = (long)param0;
          var4.field_q = 3;
          this.a(-52, var4);
          return var4;
        } else {
          var4.field_m = false;
          var4.field_f = (long)param0;
          var4.field_q = 3;
          this.a(-52, var4);
          return var4;
        }
    }

    public static void a(int param0) {
        if (param0 != 10) {
          field_g = -34;
          field_b = null;
          field_k = null;
          field_c = null;
          field_f = null;
          return;
        } else {
          field_b = null;
          field_k = null;
          field_c = null;
          field_f = null;
          return;
        }
    }

    private final void a(int param0, si param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 <= -29) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((uj) this).field_d = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var3 = (Object) (Object) ((uj) this).field_d;
                    // monitorenter ((uj) this).field_d
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        ((uj) this).field_d.a((bf) (Object) param1, (byte) -100);
                        ((uj) this).field_j = ((uj) this).field_j + 1;
                        ((Object) (Object) ((uj) this).field_d).notifyAll();
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

    final void a(boolean param0) {
        ((uj) this).field_e = param0 ? true : false;
        Object var2 = (Object) (Object) ((uj) this).field_d;
        // monitorenter ((uj) this).field_d
        ((Object) (Object) ((uj) this).field_d).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((uj) this).field_a.join();
        } catch (InterruptedException interruptedException) {
        }
        ((uj) this).field_a = null;
    }

    final static byte[] a(int param0, Object param1, boolean param2) {
        byte[] var3_ref_byte__ = null;
        int var3 = 0;
        ka var4 = null;
        if (param1 != null) {
          if (param1 instanceof byte[]) {
            var3_ref_byte__ = (byte[]) param1;
            if (!param2) {
              return var3_ref_byte__;
            } else {
              return bk.a(0, var3_ref_byte__);
            }
          } else {
            var3 = 89 / ((param0 - 0) / 38);
            if (param1 instanceof ka) {
              var4 = (ka) param1;
              return var4.d(-13913);
            } else {
              throw new IllegalArgumentException();
            }
          }
        } else {
          return null;
        }
    }

    uj(md param0) {
        ((uj) this).field_d = new dl();
        ((uj) this).field_j = 0;
        ((uj) this).field_e = false;
        ic var2 = param0.a((Runnable) this, 5, 0);
        while (0 == var2.field_g) {
            em.a(10L, false);
        }
        if (2 == var2.field_g) {
            throw new RuntimeException();
        }
        ((uj) this).field_a = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new int[20];
        field_b = "Waiting for fonts";
        field_h = 1;
        field_l = 480;
    }
}
