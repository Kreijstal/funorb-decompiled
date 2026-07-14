/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class k extends wh {
    private ja field_p;
    private ja field_o;
    private int field_n;
    private int field_m;

    final synchronized void a(wh param0) {
        ((k) this).field_p.a((fc) (Object) param0, (byte) 36);
    }

    private final void a(i param0) {
        param0.a(-110);
        param0.a();
        fc var2 = ((k) this).field_o.field_d.field_h;
        if (var2 == ((k) this).field_o.field_d) {
            ((k) this).field_n = -1;
        } else {
            ((k) this).field_n = ((i) (Object) var2).field_i;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        i var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((k) this).field_n >= 0) {
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
                    if (((k) this).field_m + param2 >= ((k) this).field_n) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((k) this).field_m = ((k) this).field_m + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((k) this).field_n - ((k) this).field_m;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((k) this).field_m = ((k) this).field_m + var4;
                    this.e();
                    var5 = (i) (Object) ((k) this).field_o.b(2);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((k) this);
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
                        var5.field_i = 0;
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
                        var5.field_i = var7;
                        this.a(var5.field_h, var5);
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

    final int c() {
        return 0;
    }

    private final void e() {
        i var1 = null;
        if (((k) this).field_m > 0) {
            var1 = (i) (Object) ((k) this).field_o.b(2);
            while (var1 != null) {
                var1.field_i = var1.field_i - ((k) this).field_m;
                var1 = (i) (Object) ((k) this).field_o.a(10);
            }
            ((k) this).field_n = ((k) this).field_n - ((k) this).field_m;
            ((k) this).field_m = 0;
        }
    }

    private final void e(int param0) {
        wh var2 = (wh) (Object) ((k) this).field_p.b(2);
        while (var2 != null) {
            var2.d(param0);
            var2 = (wh) (Object) ((k) this).field_p.a(10);
        }
    }

    private final void a(fc param0, i param1) {
        L0: while (true) {
          if (param0 != ((k) this).field_o.field_d) {
            if (((i) (Object) param0).field_i <= param1.field_i) {
              param0 = param0.field_h;
              continue L0;
            } else {
              lj.a(param0, (fc) (Object) param1, -126);
              ((k) this).field_n = ((i) (Object) ((k) this).field_o.field_d.field_h).field_i;
              return;
            }
          } else {
            lj.a(param0, (fc) (Object) param1, -126);
            ((k) this).field_n = ((i) (Object) ((k) this).field_o.field_d.field_h).field_i;
            return;
          }
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        i var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((k) this).field_n >= 0) {
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
                    if (((k) this).field_m + param0 >= ((k) this).field_n) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((k) this).field_m = ((k) this).field_m + param0;
                    this.e(param0);
                    return;
                }
                case 4: {
                    var2 = ((k) this).field_n - ((k) this).field_m;
                    this.e(var2);
                    param0 = param0 - var2;
                    ((k) this).field_m = ((k) this).field_m + var2;
                    this.e();
                    var3 = (i) (Object) ((k) this).field_o.b(2);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((k) this);
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
                        var3.field_i = 0;
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
                        var3.field_i = var5;
                        this.a(var3.field_h, var3);
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

    final synchronized void b(wh param0) {
        param0.a(-58);
    }

    private final void c(int[] param0, int param1, int param2) {
        wh var4 = (wh) (Object) ((k) this).field_p.b(2);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (wh) (Object) ((k) this).field_p.a(10);
        }
    }

    final wh b() {
        return (wh) (Object) ((k) this).field_p.b(2);
    }

    final wh a() {
        return (wh) (Object) ((k) this).field_p.a(10);
    }

    public k() {
        ((k) this).field_p = new ja();
        ((k) this).field_o = new ja();
        ((k) this).field_m = 0;
        ((k) this).field_n = -1;
    }
}
