/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends sj {
    private bb field_r;
    private bb field_p;
    private int field_o;
    private int field_q;

    final synchronized void a(sj param0) {
        ((vj) this).field_r.b(1392503105, (fa) (Object) param0);
    }

    final sj d() {
        return (sj) (Object) ((vj) this).field_r.f(1504642273);
    }

    final sj b() {
        return (sj) (Object) ((vj) this).field_r.c(1504642273);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        hl var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vj) this).field_q >= 0) {
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
                    if (((vj) this).field_o + param0 >= ((vj) this).field_q) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vj) this).field_o = ((vj) this).field_o + param0;
                    this.e(param0);
                    return;
                }
                case 4: {
                    var2 = ((vj) this).field_q - ((vj) this).field_o;
                    this.e(var2);
                    param0 = param0 - var2;
                    ((vj) this).field_o = ((vj) this).field_o + var2;
                    this.e();
                    var3 = (hl) (Object) ((vj) this).field_p.c(1504642273);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((vj) this);
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
                        var3.field_k = 0;
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
                        var3.field_k = var5;
                        this.a(var3.field_a, var3);
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

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        hl var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vj) this).field_q >= 0) {
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
                    if (((vj) this).field_o + param2 >= ((vj) this).field_q) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vj) this).field_o = ((vj) this).field_o + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((vj) this).field_q - ((vj) this).field_o;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((vj) this).field_o = ((vj) this).field_o + var4;
                    this.e();
                    var5 = (hl) (Object) ((vj) this).field_p.c(1504642273);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((vj) this);
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
                        var5.field_k = 0;
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
                        var5.field_k = var7;
                        this.a(var5.field_a, var5);
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

    private final void e() {
        hl var1 = null;
        if (((vj) this).field_o > 0) {
            var1 = (hl) (Object) ((vj) this).field_p.c(1504642273);
            while (var1 != null) {
                var1.field_k = var1.field_k - ((vj) this).field_o;
                var1 = (hl) (Object) ((vj) this).field_p.f(1504642273);
            }
            ((vj) this).field_q = ((vj) this).field_q - ((vj) this).field_o;
            ((vj) this).field_o = 0;
        }
    }

    private final void e(int param0) {
        sj var2 = (sj) (Object) ((vj) this).field_r.c(1504642273);
        while (var2 != null) {
            var2.a(param0);
            var2 = (sj) (Object) ((vj) this).field_r.f(1504642273);
        }
    }

    final int a() {
        return 0;
    }

    private final void a(fa param0, hl param1) {
        L0: while (true) {
          if (param0 != ((vj) this).field_p.field_f) {
            if (((hl) (Object) param0).field_k <= param1.field_k) {
              param0 = param0.field_a;
              continue L0;
            } else {
              jj.a((byte) 98, param0, (fa) (Object) param1);
              ((vj) this).field_q = ((hl) (Object) ((vj) this).field_p.field_f.field_a).field_k;
              return;
            }
          } else {
            jj.a((byte) 98, param0, (fa) (Object) param1);
            ((vj) this).field_q = ((hl) (Object) ((vj) this).field_p.field_f.field_a).field_k;
            return;
          }
        }
    }

    private final void a(hl param0) {
        param0.c(2779);
        param0.a();
        fa var2 = ((vj) this).field_p.field_f.field_a;
        if (var2 == ((vj) this).field_p.field_f) {
            ((vj) this).field_q = -1;
        } else {
            ((vj) this).field_q = ((hl) (Object) var2).field_k;
        }
    }

    public vj() {
        ((vj) this).field_r = new bb();
        ((vj) this).field_p = new bb();
        ((vj) this).field_o = 0;
        ((vj) this).field_q = -1;
    }

    private final void c(int[] param0, int param1, int param2) {
        sj var4 = (sj) (Object) ((vj) this).field_r.c(1504642273);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (sj) (Object) ((vj) this).field_r.f(1504642273);
        }
    }
}
