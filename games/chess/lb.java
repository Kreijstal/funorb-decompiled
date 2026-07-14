/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lb extends nm {
    private jc field_o;
    private jc field_q;
    private int field_n;
    private int field_p;

    private final void c(int[] param0, int param1, int param2) {
        nm var4 = (nm) (Object) ((lb) this).field_o.g(-18110);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (nm) (Object) ((lb) this).field_o.a((byte) -114);
        }
    }

    final nm a() {
        return (nm) (Object) ((lb) this).field_o.g(-18110);
    }

    private final void a(pl param0) {
        param0.c(-2193);
        param0.a();
        o var2 = ((lb) this).field_q.field_a.field_h;
        if (var2 == ((lb) this).field_q.field_a) {
            ((lb) this).field_p = -1;
        } else {
            ((lb) this).field_p = ((pl) (Object) var2).field_j;
        }
    }

    final nm b() {
        return (nm) (Object) ((lb) this).field_o.a((byte) -106);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        pl var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((lb) this).field_p >= 0) {
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
                    if (((lb) this).field_n + param2 >= ((lb) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((lb) this).field_n = ((lb) this).field_n + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((lb) this).field_p - ((lb) this).field_n;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((lb) this).field_n = ((lb) this).field_n + var4;
                    this.e();
                    var5 = (pl) (Object) ((lb) this).field_q.g(-18110);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((lb) this);
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
                        var5.field_j = 0;
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
                        var5.field_j = var7;
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

    final int d() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        pl var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((lb) this).field_p >= 0) {
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
                    if (((lb) this).field_n + param0 >= ((lb) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((lb) this).field_n = ((lb) this).field_n + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((lb) this).field_p - ((lb) this).field_n;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((lb) this).field_n = ((lb) this).field_n + var2;
                    this.e();
                    var3 = (pl) (Object) ((lb) this).field_q.g(-18110);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((lb) this);
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
                        var3.field_j = 0;
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
                        var3.field_j = var5;
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

    private final void e() {
        pl var1 = null;
        if (((lb) this).field_n > 0) {
            var1 = (pl) (Object) ((lb) this).field_q.g(-18110);
            while (var1 != null) {
                var1.field_j = var1.field_j - ((lb) this).field_n;
                var1 = (pl) (Object) ((lb) this).field_q.a((byte) -116);
            }
            ((lb) this).field_p = ((lb) this).field_p - ((lb) this).field_n;
            ((lb) this).field_n = 0;
        }
    }

    private final void a(o param0, pl param1) {
        L0: while (true) {
          if (param0 != ((lb) this).field_q.field_a) {
            if (((pl) (Object) param0).field_j <= param1.field_j) {
              param0 = param0.field_h;
              continue L0;
            } else {
              he.a((o) (Object) param1, param0, true);
              ((lb) this).field_p = ((pl) (Object) ((lb) this).field_q.field_a.field_h).field_j;
              return;
            }
          } else {
            he.a((o) (Object) param1, param0, true);
            ((lb) this).field_p = ((pl) (Object) ((lb) this).field_q.field_a.field_h).field_j;
            return;
          }
        }
    }

    final synchronized void a(nm param0) {
        ((lb) this).field_o.a((o) (Object) param0, 69);
    }

    private final void d(int param0) {
        nm var2 = (nm) (Object) ((lb) this).field_o.g(-18110);
        while (var2 != null) {
            var2.a(param0);
            var2 = (nm) (Object) ((lb) this).field_o.a((byte) -127);
        }
    }

    public lb() {
        ((lb) this).field_o = new jc();
        ((lb) this).field_q = new jc();
        ((lb) this).field_n = 0;
        ((lb) this).field_p = -1;
    }
}
