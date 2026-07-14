/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al extends hj {
    private jn field_q;
    private jn field_o;
    private int field_p;
    private int field_r;

    private final void e() {
        md var1 = null;
        if (((al) this).field_p > 0) {
            var1 = (md) (Object) ((al) this).field_o.b(-108);
            while (var1 != null) {
                var1.field_k = var1.field_k - ((al) this).field_p;
                var1 = (md) (Object) ((al) this).field_o.d((byte) 18);
            }
            ((al) this).field_r = ((al) this).field_r - ((al) this).field_p;
            ((al) this).field_p = 0;
        }
    }

    private final void a(ms param0, md param1) {
        L0: while (true) {
          if (param0 != ((al) this).field_o.field_e) {
            if (((md) (Object) param0).field_k <= param1.field_k) {
              param0 = param0.field_b;
              continue L0;
            } else {
              ha.a(-2, param0, (ms) (Object) param1);
              ((al) this).field_r = ((md) (Object) ((al) this).field_o.field_e.field_b).field_k;
              return;
            }
          } else {
            ha.a(-2, param0, (ms) (Object) param1);
            ((al) this).field_r = ((md) (Object) ((al) this).field_o.field_e.field_b).field_k;
            return;
          }
        }
    }

    final synchronized void b(hj param0) {
        ((al) this).field_q.a((ms) (Object) param0, -10295);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        md var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((al) this).field_r >= 0) {
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
                    if (((al) this).field_p + param2 >= ((al) this).field_r) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((al) this).field_p = ((al) this).field_p + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((al) this).field_r - ((al) this).field_p;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((al) this).field_p = ((al) this).field_p + var4;
                    this.e();
                    var5 = (md) (Object) ((al) this).field_o.b(69);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((al) this);
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

    final synchronized void a(int param0) {
        int var2 = 0;
        md var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((al) this).field_r >= 0) {
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
                    if (((al) this).field_p + param0 >= ((al) this).field_r) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((al) this).field_p = ((al) this).field_p + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((al) this).field_r - ((al) this).field_p;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((al) this).field_p = ((al) this).field_p + var2;
                    this.e();
                    var3 = (md) (Object) ((al) this).field_o.b(-102);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((al) this);
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

    private final void c(int param0) {
        hj var2 = (hj) (Object) ((al) this).field_q.b(105);
        while (var2 != null) {
            var2.a(param0);
            var2 = (hj) (Object) ((al) this).field_q.d((byte) 18);
        }
    }

    final int d() {
        return 0;
    }

    private final void a(md param0) {
        param0.b(false);
        param0.a();
        ms var2 = ((al) this).field_o.field_e.field_b;
        if (var2 == ((al) this).field_o.field_e) {
            ((al) this).field_r = -1;
        } else {
            ((al) this).field_r = ((md) (Object) var2).field_k;
        }
    }

    final synchronized void a(hj param0) {
        param0.b(false);
    }

    final hj c() {
        return (hj) (Object) ((al) this).field_q.d((byte) 18);
    }

    final hj a() {
        return (hj) (Object) ((al) this).field_q.b(104);
    }

    private final void c(int[] param0, int param1, int param2) {
        hj var4 = (hj) (Object) ((al) this).field_q.b(-91);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (hj) (Object) ((al) this).field_q.d((byte) 18);
        }
    }

    public al() {
        ((al) this).field_q = new jn();
        ((al) this).field_o = new jn();
        ((al) this).field_r = -1;
        ((al) this).field_p = 0;
    }
}
