/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn extends tda {
    private eaa field_k;
    private eaa field_m;
    private int field_j;
    private int field_l;

    final synchronized void a(int param0) {
        int var2 = 0;
        lea var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((hn) this).field_j >= 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.b(param0);
                    return;
                }
                case 2: {
                    if (((hn) this).field_l + param0 >= ((hn) this).field_j) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((hn) this).field_l = ((hn) this).field_l + param0;
                    this.b(param0);
                    return;
                }
                case 4: {
                    var2 = ((hn) this).field_j - ((hn) this).field_l;
                    this.b(var2);
                    param0 = param0 - var2;
                    ((hn) this).field_l = ((hn) this).field_l + var2;
                    this.e();
                    var3 = (lea) (Object) ((hn) this).field_m.b((byte) 90);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((hn) this);
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
                        var3.field_f = 0;
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
                        var3.field_f = var5;
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

    private final void c(int[] param0, int param1, int param2) {
        tda var4 = (tda) (Object) ((hn) this).field_k.b((byte) 90);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (tda) (Object) ((hn) this).field_k.c(0);
        }
    }

    final tda b() {
        return (tda) (Object) ((hn) this).field_k.b((byte) 90);
    }

    final synchronized void a(tda param0) {
        ((hn) this).field_k.a(-80, (bw) (Object) param0);
    }

    final int d() {
        return 0;
    }

    final tda a() {
        return (tda) (Object) ((hn) this).field_k.c(0);
    }

    private final void a(lea param0) {
        param0.a(false);
        param0.a();
        bw var2 = ((hn) this).field_m.field_g.field_b;
        if (var2 == ((hn) this).field_m.field_g) {
            ((hn) this).field_j = -1;
        } else {
            ((hn) this).field_j = ((lea) (Object) var2).field_f;
        }
    }

    final synchronized void b(tda param0) {
        param0.a(false);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        lea var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((hn) this).field_j >= 0) {
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
                    if (((hn) this).field_l + param2 >= ((hn) this).field_j) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((hn) this).field_l = ((hn) this).field_l + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((hn) this).field_j - ((hn) this).field_l;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((hn) this).field_l = ((hn) this).field_l + var4;
                    this.e();
                    var5 = (lea) (Object) ((hn) this).field_m.b((byte) 90);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((hn) this);
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
                        var5.field_f = 0;
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
                        var5.field_f = var7;
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

    private final void b(int param0) {
        tda var2 = (tda) (Object) ((hn) this).field_k.b((byte) 90);
        while (var2 != null) {
            var2.a(param0);
            var2 = (tda) (Object) ((hn) this).field_k.c(0);
        }
    }

    private final void e() {
        lea var1 = null;
        if (((hn) this).field_l > 0) {
            var1 = (lea) (Object) ((hn) this).field_m.b((byte) 90);
            while (var1 != null) {
                var1.field_f = var1.field_f - ((hn) this).field_l;
                var1 = (lea) (Object) ((hn) this).field_m.c(0);
            }
            ((hn) this).field_j = ((hn) this).field_j - ((hn) this).field_l;
            ((hn) this).field_l = 0;
        }
    }

    private final void a(bw param0, lea param1) {
        L0: while (true) {
          if (param0 != ((hn) this).field_m.field_g) {
            if (((lea) (Object) param0).field_f <= param1.field_f) {
              param0 = param0.field_b;
              continue L0;
            } else {
              nr.a((byte) 115, param0, (bw) (Object) param1);
              ((hn) this).field_j = ((lea) (Object) ((hn) this).field_m.field_g.field_b).field_f;
              return;
            }
          } else {
            nr.a((byte) 115, param0, (bw) (Object) param1);
            ((hn) this).field_j = ((lea) (Object) ((hn) this).field_m.field_g.field_b).field_f;
            return;
          }
        }
    }

    public hn() {
        ((hn) this).field_k = new eaa();
        ((hn) this).field_m = new eaa();
        ((hn) this).field_j = -1;
        ((hn) this).field_l = 0;
    }
}
