/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends eb {
    private je field_s;
    private je field_t;
    private int field_r;
    private int field_u;

    final synchronized void a(int param0) {
        int var2 = 0;
        ln var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((fg) this).field_r >= 0) {
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
                    if (((fg) this).field_u + param0 >= ((fg) this).field_r) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((fg) this).field_u = ((fg) this).field_u + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((fg) this).field_r - ((fg) this).field_u;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((fg) this).field_u = ((fg) this).field_u + var2;
                    this.e();
                    var3 = (ln) (Object) ((fg) this).field_t.c(false);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((fg) this);
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
                        var3.field_n = 0;
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
                        var3.field_n = var5;
                        this.a(var3.field_j, var3);
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

    final synchronized void a(eb param0) {
        ((fg) this).field_s.a((mc) (Object) param0, 127);
    }

    private final void c(int[] param0, int param1, int param2) {
        eb var4 = (eb) (Object) ((fg) this).field_s.c(false);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (eb) (Object) ((fg) this).field_s.a((byte) -70);
        }
    }

    final eb b() {
        return (eb) (Object) ((fg) this).field_s.c(false);
    }

    private final void a(mc param0, ln param1) {
        L0: while (true) {
          if (param0 != ((fg) this).field_t.field_c) {
            if (((ln) (Object) param0).field_n <= param1.field_n) {
              param0 = param0.field_j;
              continue L0;
            } else {
              cl.a(param0, -71, (mc) (Object) param1);
              ((fg) this).field_r = ((ln) (Object) ((fg) this).field_t.field_c.field_j).field_n;
              return;
            }
          } else {
            cl.a(param0, -71, (mc) (Object) param1);
            ((fg) this).field_r = ((ln) (Object) ((fg) this).field_t.field_c.field_j).field_n;
            return;
          }
        }
    }

    private final void c(int param0) {
        eb var2 = (eb) (Object) ((fg) this).field_s.c(false);
        while (var2 != null) {
            var2.a(param0);
            var2 = (eb) (Object) ((fg) this).field_s.a((byte) -70);
        }
    }

    private final void a(ln param0) {
        param0.b(false);
        param0.a();
        mc var2 = ((fg) this).field_t.field_c.field_j;
        if (var2 == ((fg) this).field_t.field_c) {
            ((fg) this).field_r = -1;
        } else {
            ((fg) this).field_r = ((ln) (Object) var2).field_n;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        ln var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((fg) this).field_r >= 0) {
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
                    if (((fg) this).field_u + param2 >= ((fg) this).field_r) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((fg) this).field_u = ((fg) this).field_u + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((fg) this).field_r - ((fg) this).field_u;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((fg) this).field_u = ((fg) this).field_u + var4;
                    this.e();
                    var5 = (ln) (Object) ((fg) this).field_t.c(false);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((fg) this);
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
                        var5.field_n = 0;
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
                        var5.field_n = var7;
                        this.a(var5.field_j, var5);
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

    final int a() {
        return 0;
    }

    private final void e() {
        ln var1 = null;
        if (((fg) this).field_u > 0) {
            var1 = (ln) (Object) ((fg) this).field_t.c(false);
            while (var1 != null) {
                var1.field_n = var1.field_n - ((fg) this).field_u;
                var1 = (ln) (Object) ((fg) this).field_t.a((byte) -70);
            }
            ((fg) this).field_r = ((fg) this).field_r - ((fg) this).field_u;
            ((fg) this).field_u = 0;
        }
    }

    final eb c() {
        return (eb) (Object) ((fg) this).field_s.a((byte) -70);
    }

    public fg() {
        ((fg) this).field_s = new je();
        ((fg) this).field_t = new je();
        ((fg) this).field_r = -1;
        ((fg) this).field_u = 0;
    }
}
