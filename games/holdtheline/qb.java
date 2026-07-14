/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb implements Runnable {
    static float[] field_e;
    static uf field_b;
    static int[] field_a;
    private ol field_d;
    static float[] field_f;
    int field_c;
    private Thread field_h;
    static int field_i;
    private boolean field_g;

    final bk a(int param0, sk param1, byte[] param2, int param3) {
        bk var5 = null;
        var5 = new bk();
        var5.field_x = param1;
        var5.field_i = (long)param0;
        var5.field_v = param2;
        var5.field_y = 2;
        if (param3 != 11998) {
          return null;
        } else {
          var5.field_t = false;
          this.a(param3 + -39427, var5);
          return var5;
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
            bk var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = HoldTheLine.field_D;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        if (((qb) this).field_g) {
                            statePc = 22;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        var2 = (Object) (Object) ((qb) this).field_d;
                        // monitorenter ((qb) this).field_d
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            var7 = (bk) (Object) ((qb) this).field_d.a((byte) 113);
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
                            ((Object) (Object) ((qb) this).field_d).wait();
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
                            ((qb) this).field_c = ((qb) this).field_c - 1;
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
                            if (-3 != (var7.field_y ^ -1)) {
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
                            boolean discarded$1 = var7.field_x.a(var7.field_v, (int)var7.field_i, var7.field_v.length, false);
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
                            if (var7.field_y == 3) {
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
                            var7.field_v = var7.field_x.a(122, (int)var7.field_i);
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
                        bl.a((Throwable) (Object) var2_ref, (byte) 115, (String) null);
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

    final static void a(int param0, byte param1) {
        int discarded$3 = em.a(true);
        if (param1 > -63) {
            field_i = 124;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0 != -3) {
            qb.b(12);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final bk a(sk param0, int param1, int param2) {
        bk var4 = null;
        Object var5 = null;
        bk var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        bk stackIn_7_0 = null;
        bk stackOut_6_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = HoldTheLine.field_D;
                    var4 = new bk();
                    var4.field_y = 1;
                    var5 = (Object) (Object) ((qb) this).field_d;
                    // monitorenter ((qb) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6 = (bk) (Object) ((qb) this).field_d.c(param1 + 18139);
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
                        if ((long)param2 != var6.field_i) {
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
                        if (param0 != var6.field_x) {
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
                        if ((var6.field_y ^ -1) != -3) {
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
                        var4.field_v = var6.field_v;
                        var4.field_u = false;
                        // monitorexit var5
                        stackOut_6_0 = (bk) var4;
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
                        var6 = (bk) (Object) ((qb) this).field_d.e(param1 ^ 17949);
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
                    var4.field_v = param0.a(117, param2);
                    var4.field_t = true;
                    var4.field_u = false;
                    if (param1 != -18017) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    return var4;
                }
                case 15: {
                    return null;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final bk a(int param0, sk param1, int param2) {
        bk var4 = new bk();
        var4.field_y = param0;
        var4.field_i = (long)param2;
        var4.field_x = param1;
        var4.field_t = false;
        this.a(-27429, var4);
        return var4;
    }

    final static String a(int param0) {
        if (param0 == 100) {
          if (!sk.field_h) {
            if (g.field_h <= dm.field_a) {
              if (we.field_l + g.field_h <= dm.field_a) {
                return null;
              } else {
                return n.field_s;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0) {
        ((qb) this).field_g = param0 ? true : false;
        Object var2 = (Object) (Object) ((qb) this).field_d;
        // monitorenter ((qb) this).field_d
        ((Object) (Object) ((qb) this).field_d).notifyAll();
        // monitorexit var2
        try {
            if (false) throw (InterruptedException) null;
            ((qb) this).field_h.join();
        } catch (InterruptedException interruptedException) {
        }
        ((qb) this).field_h = null;
    }

    private final void a(int param0, bk param1) {
        Object var3 = null;
        Throwable var4 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var3 = (Object) (Object) ((qb) this).field_d;
                    // monitorenter ((qb) this).field_d
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((qb) this).field_d.a(-66, (ln) (Object) param1);
                        ((qb) this).field_c = ((qb) this).field_c + 1;
                        ((Object) (Object) ((qb) this).field_d).notifyAll();
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
                    if (param0 != -27429) {
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
                    qb.a(-68, (byte) 57);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    qb(ib param0) {
        ((qb) this).field_d = new ol();
        ((qb) this).field_g = false;
        ((qb) this).field_c = 0;
        af var2 = param0.a((byte) -28, 5, (Runnable) this);
        while (-1 == (var2.field_d ^ -1)) {
            qe.a(10L, (byte) 45);
        }
        if (2 == var2.field_d) {
            throw new RuntimeException();
        }
        ((qb) this).field_h = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{40, 170, 100, 110, 170};
        field_f = new float[]{1.0f, 10.0f, 10.0f, 10.0f};
        field_e = field_f;
    }
}
