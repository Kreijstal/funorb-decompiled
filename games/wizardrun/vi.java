/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends k {
    private oi field_n;
    private oi field_p;
    private int field_o;
    private int field_m;

    private final void e() {
        nb var1 = null;
        if (((vi) this).field_m > 0) {
            var1 = (nb) (Object) ((vi) this).field_p.b((byte) 84);
            while (var1 != null) {
                var1.field_i = var1.field_i - ((vi) this).field_m;
                var1 = (nb) (Object) ((vi) this).field_p.d(8192);
            }
            ((vi) this).field_o = ((vi) this).field_o - ((vi) this).field_m;
            ((vi) this).field_m = 0;
        }
    }

    final k a() {
        return (k) (Object) ((vi) this).field_n.b((byte) 106);
    }

    final void a(je param0, int param1, int param2) {
        ((vi) this).a((k) (Object) uj.a(param0, param1, param2));
    }

    final synchronized void a(k param0) {
        ((vi) this).field_n.a((wl) (Object) param0, -5441);
    }

    private final void a(nb param0) {
        param0.a(false);
        param0.a();
        wl var2 = ((vi) this).field_p.field_a.field_b;
        if (var2 == ((vi) this).field_p.field_a) {
            ((vi) this).field_o = -1;
        } else {
            ((vi) this).field_o = ((nb) (Object) var2).field_i;
        }
    }

    final int d() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        nb var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vi) this).field_o >= 0) {
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
                    if (((vi) this).field_m + param0 >= ((vi) this).field_o) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vi) this).field_m = ((vi) this).field_m + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((vi) this).field_o - ((vi) this).field_m;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((vi) this).field_m = ((vi) this).field_m + var2;
                    this.e();
                    var3 = (nb) (Object) ((vi) this).field_p.b((byte) 106);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((vi) this);
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

    private final void a(wl param0, nb param1) {
        L0: while (true) {
          if (param0 != ((vi) this).field_p.field_a) {
            if (((nb) (Object) param0).field_i <= param1.field_i) {
              param0 = param0.field_b;
              continue L0;
            } else {
              u.a((byte) 74, param0, (wl) (Object) param1);
              ((vi) this).field_o = ((nb) (Object) ((vi) this).field_p.field_a.field_b).field_i;
              return;
            }
          } else {
            u.a((byte) 74, param0, (wl) (Object) param1);
            ((vi) this).field_o = ((nb) (Object) ((vi) this).field_p.field_a.field_b).field_i;
            return;
          }
        }
    }

    final k c() {
        return (k) (Object) ((vi) this).field_n.d(8192);
    }

    private final void c(int[] param0, int param1, int param2) {
        k var4 = (k) (Object) ((vi) this).field_n.b((byte) 87);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (k) (Object) ((vi) this).field_n.d(8192);
        }
    }

    private final void c(int param0) {
        k var2 = (k) (Object) ((vi) this).field_n.b((byte) 98);
        while (var2 != null) {
            var2.a(param0);
            var2 = (k) (Object) ((vi) this).field_n.d(8192);
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        nb var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vi) this).field_o >= 0) {
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
                    if (((vi) this).field_m + param2 >= ((vi) this).field_o) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vi) this).field_m = ((vi) this).field_m + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((vi) this).field_o - ((vi) this).field_m;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((vi) this).field_m = ((vi) this).field_m + var4;
                    this.e();
                    var5 = (nb) (Object) ((vi) this).field_p.b((byte) 99);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((vi) this);
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

    public vi() {
        ((vi) this).field_n = new oi();
        ((vi) this).field_p = new oi();
        ((vi) this).field_o = -1;
        ((vi) this).field_m = 0;
    }
}
