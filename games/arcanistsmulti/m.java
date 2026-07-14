/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m extends sg {
    private vn field_l;
    private vn field_m;
    private int field_k;
    private int field_n;

    private final void a(d param0) {
        param0.a(true);
        param0.a();
        pg var2 = ((m) this).field_m.field_e.field_b;
        if (var2 == ((m) this).field_m.field_e) {
            ((m) this).field_k = -1;
        } else {
            ((m) this).field_k = ((d) (Object) var2).field_g;
        }
    }

    final synchronized void a(sg param0) {
        param0.a(true);
    }

    final synchronized void b(sg param0) {
        ((m) this).field_l.a((pg) (Object) param0, (byte) -58);
    }

    private final void c(int[] param0, int param1, int param2) {
        sg var4 = (sg) (Object) ((m) this).field_l.b(12623);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (sg) (Object) ((m) this).field_l.a(0);
        }
    }

    final sg a() {
        return (sg) (Object) ((m) this).field_l.b(12623);
    }

    private final void c(int param0) {
        sg var2 = (sg) (Object) ((m) this).field_l.b(12623);
        while (var2 != null) {
            var2.a(param0);
            var2 = (sg) (Object) ((m) this).field_l.a(0);
        }
    }

    final sg b() {
        return (sg) (Object) ((m) this).field_l.a(0);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        d var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((m) this).field_k >= 0) {
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
                    if (((m) this).field_n + param2 >= ((m) this).field_k) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((m) this).field_n = ((m) this).field_n + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((m) this).field_k - ((m) this).field_n;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((m) this).field_n = ((m) this).field_n + var4;
                    this.e();
                    var5 = (d) (Object) ((m) this).field_m.b(12623);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((m) this);
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
                        var5.field_g = 0;
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
                        var5.field_g = var7;
                        this.a(var5.field_b, var5);
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
        d var1 = null;
        if (((m) this).field_n > 0) {
            var1 = (d) (Object) ((m) this).field_m.b(12623);
            while (var1 != null) {
                var1.field_g = var1.field_g - ((m) this).field_n;
                var1 = (d) (Object) ((m) this).field_m.a(0);
            }
            ((m) this).field_k = ((m) this).field_k - ((m) this).field_n;
            ((m) this).field_n = 0;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        d var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((m) this).field_k >= 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.c(param0);
                    return;
                }
                case 2: {
                    if (((m) this).field_n + param0 >= ((m) this).field_k) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((m) this).field_n = ((m) this).field_n + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((m) this).field_k - ((m) this).field_n;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((m) this).field_n = ((m) this).field_n + var2;
                    this.e();
                    var3 = (d) (Object) ((m) this).field_m.b(12623);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((m) this);
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
                        var3.field_g = 0;
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
                        var3.field_g = var5;
                        this.a(var3.field_b, var3);
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

    private final void a(pg param0, d param1) {
        L0: while (true) {
          if (param0 != ((m) this).field_m.field_e) {
            if (((d) (Object) param0).field_g <= param1.field_g) {
              param0 = param0.field_b;
              continue L0;
            } else {
              da.a(param0, 20, (pg) (Object) param1);
              ((m) this).field_k = ((d) (Object) ((m) this).field_m.field_e.field_b).field_g;
              return;
            }
          } else {
            da.a(param0, 20, (pg) (Object) param1);
            ((m) this).field_k = ((d) (Object) ((m) this).field_m.field_e.field_b).field_g;
            return;
          }
        }
    }

    public m() {
        ((m) this).field_l = new vn();
        ((m) this).field_m = new vn();
        ((m) this).field_k = -1;
        ((m) this).field_n = 0;
    }
}
