/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec extends ic {
    private vd field_o;
    private vd field_m;
    private int field_n;
    private int field_l;

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        ak var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ec) this).field_n >= 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.c(param0, param1, param2);
                    return;
                }
                case 2: {
                    if (((ec) this).field_l + param2 >= ((ec) this).field_n) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((ec) this).field_l = ((ec) this).field_l + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((ec) this).field_n - ((ec) this).field_l;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((ec) this).field_l = ((ec) this).field_l + var4;
                    this.e();
                    var5 = (ak) (Object) ((ec) this).field_m.h(-11151);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((ec) this);
                        if (var7 >= 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5.field_h = 0;
                        this.a(var5);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var5.field_h = var7;
                        this.a(var5.field_e, var5);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var6
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) var8;
                }
                case 12: {
                    if (param2 != 0) {
                        statePc = 0;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ic c() {
        return (ic) (Object) ((ec) this).field_o.e(0);
    }

    final int d() {
        return 0;
    }

    final synchronized void a(ic param0) {
        ((ec) this).field_o.a(79, (gi) (Object) param0);
    }

    private final void e() {
        ak var1 = null;
        if (((ec) this).field_l > 0) {
            var1 = (ak) (Object) ((ec) this).field_m.h(-11151);
            while (var1 != null) {
                var1.field_h = var1.field_h - ((ec) this).field_l;
                var1 = (ak) (Object) ((ec) this).field_m.e(0);
            }
            ((ec) this).field_n = ((ec) this).field_n - ((ec) this).field_l;
            ((ec) this).field_l = 0;
        }
    }

    final ic a() {
        return (ic) (Object) ((ec) this).field_o.h(-11151);
    }

    private final void e(int param0) {
        ic var2 = (ic) (Object) ((ec) this).field_o.h(-11151);
        while (var2 != null) {
            var2.d(param0);
            var2 = (ic) (Object) ((ec) this).field_o.e(0);
        }
    }

    private final void a(ak param0) {
        param0.a(-16175);
        param0.a();
        gi var2 = ((ec) this).field_m.field_c.field_e;
        if (var2 == ((ec) this).field_m.field_c) {
            ((ec) this).field_n = -1;
        } else {
            ((ec) this).field_n = ((ak) (Object) var2).field_h;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        ic var4 = (ic) (Object) ((ec) this).field_o.h(-11151);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (ic) (Object) ((ec) this).field_o.e(0);
        }
    }

    final synchronized void b(ic param0) {
        param0.a(-16175);
    }

    private final void a(gi param0, ak param1) {
        L0: while (true) {
          if (param0 != ((ec) this).field_m.field_c) {
            if (((ak) (Object) param0).field_h <= param1.field_h) {
              param0 = param0.field_e;
              continue L0;
            } else {
              tf.a((gi) (Object) param1, 16709, param0);
              ((ec) this).field_n = ((ak) (Object) ((ec) this).field_m.field_c.field_e).field_h;
              return;
            }
          } else {
            tf.a((gi) (Object) param1, 16709, param0);
            ((ec) this).field_n = ((ak) (Object) ((ec) this).field_m.field_c.field_e).field_h;
            return;
          }
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        ak var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ec) this).field_n >= 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.e(param0);
                    return;
                }
                case 2: {
                    if (((ec) this).field_l + param0 >= ((ec) this).field_n) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((ec) this).field_l = ((ec) this).field_l + param0;
                    this.e(param0);
                    return;
                }
                case 4: {
                    var2 = ((ec) this).field_n - ((ec) this).field_l;
                    this.e(var2);
                    param0 = param0 - var2;
                    ((ec) this).field_l = ((ec) this).field_l + var2;
                    this.e();
                    var3 = (ak) (Object) ((ec) this).field_m.h(-11151);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((ec) this);
                        if (var5 >= 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var3.field_h = 0;
                        this.a(var3);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var3.field_h = var5;
                        this.a(var3.field_e, var3);
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        // monitorexit var4
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = caughtException;
                        // monitorexit var4
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 11: {
                    throw (RuntimeException) (Object) var6;
                }
                case 12: {
                    if (param0 != 0) {
                        statePc = 0;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public ec() {
        ((ec) this).field_o = new vd();
        ((ec) this).field_m = new vd();
        ((ec) this).field_n = -1;
        ((ec) this).field_l = 0;
    }
}
