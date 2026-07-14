/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke extends sh {
    private vc field_n;
    private vc field_p;
    private int field_o;
    private int field_m;

    private final void a(lh param0, vl param1) {
        L0: while (true) {
          if (param0 != ((ke) this).field_p.field_e) {
            if (((vl) (Object) param0).field_i <= param1.field_i) {
              param0 = param0.field_h;
              continue L0;
            } else {
              nl.a(100, param0, (lh) (Object) param1);
              ((ke) this).field_m = ((vl) (Object) ((ke) this).field_p.field_e.field_h).field_i;
              return;
            }
          } else {
            nl.a(100, param0, (lh) (Object) param1);
            ((ke) this).field_m = ((vl) (Object) ((ke) this).field_p.field_e.field_h).field_i;
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        sh var4 = (sh) (Object) ((ke) this).field_n.c((byte) 47);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (sh) (Object) ((ke) this).field_n.b((byte) -105);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        vl var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ke) this).field_m >= 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.d(param0);
                    return;
                }
                case 2: {
                    if (((ke) this).field_o + param0 >= ((ke) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((ke) this).field_o = ((ke) this).field_o + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((ke) this).field_m - ((ke) this).field_o;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((ke) this).field_o = ((ke) this).field_o + var2;
                    this.e();
                    var3 = (vl) (Object) ((ke) this).field_p.c((byte) 47);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((ke) this);
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

    private final void d(int param0) {
        sh var2 = (sh) (Object) ((ke) this).field_n.c((byte) 47);
        while (var2 != null) {
            var2.a(param0);
            var2 = (sh) (Object) ((ke) this).field_n.b((byte) -105);
        }
    }

    final synchronized void a(sh param0) {
        ((ke) this).field_n.b(true, (lh) (Object) param0);
    }

    final sh d() {
        return (sh) (Object) ((ke) this).field_n.c((byte) 47);
    }

    final int a() {
        return 0;
    }

    private final void e() {
        vl var1 = null;
        if (((ke) this).field_o > 0) {
            var1 = (vl) (Object) ((ke) this).field_p.c((byte) 47);
            while (var1 != null) {
                var1.field_i = var1.field_i - ((ke) this).field_o;
                var1 = (vl) (Object) ((ke) this).field_p.b((byte) -105);
            }
            ((ke) this).field_m = ((ke) this).field_m - ((ke) this).field_o;
            ((ke) this).field_o = 0;
        }
    }

    private final void a(vl param0) {
        param0.c(-1);
        param0.a();
        lh var2 = ((ke) this).field_p.field_e.field_h;
        if (var2 == ((ke) this).field_p.field_e) {
            ((ke) this).field_m = -1;
        } else {
            ((ke) this).field_m = ((vl) (Object) var2).field_i;
        }
    }

    final sh c() {
        return (sh) (Object) ((ke) this).field_n.b((byte) -105);
    }

    public ke() {
        ((ke) this).field_n = new vc();
        ((ke) this).field_p = new vc();
        ((ke) this).field_o = 0;
        ((ke) this).field_m = -1;
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        vl var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ke) this).field_m >= 0) {
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
                    if (((ke) this).field_o + param2 >= ((ke) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((ke) this).field_o = ((ke) this).field_o + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((ke) this).field_m - ((ke) this).field_o;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((ke) this).field_o = ((ke) this).field_o + var4;
                    this.e();
                    var5 = (vl) (Object) ((ke) this).field_p.c((byte) 47);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((ke) this);
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
}
