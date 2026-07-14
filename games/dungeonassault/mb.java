/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mb extends qb {
    private md field_o;
    private md field_n;
    private int field_m;
    private int field_p;

    private final void c(int[] param0, int param1, int param2) {
        qb var4 = (qb) (Object) ((mb) this).field_o.e(-24172);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (qb) (Object) ((mb) this).field_o.a(4);
        }
    }

    private final void e() {
        kb var1 = null;
        if (((mb) this).field_m > 0) {
            var1 = (kb) (Object) ((mb) this).field_n.e(-24172);
            while (var1 != null) {
                var1.field_i = var1.field_i - ((mb) this).field_m;
                var1 = (kb) (Object) ((mb) this).field_n.a(4);
            }
            ((mb) this).field_p = ((mb) this).field_p - ((mb) this).field_m;
            ((mb) this).field_m = 0;
        }
    }

    private final void a(ne param0, kb param1) {
        L0: while (true) {
          if (param0 != ((mb) this).field_n.field_c) {
            if (((kb) (Object) param0).field_i <= param1.field_i) {
              param0 = param0.field_e;
              continue L0;
            } else {
              so.a((byte) 89, param0, (ne) (Object) param1);
              ((mb) this).field_p = ((kb) (Object) ((mb) this).field_n.field_c.field_e).field_i;
              return;
            }
          } else {
            so.a((byte) 89, param0, (ne) (Object) param1);
            ((mb) this).field_p = ((kb) (Object) ((mb) this).field_n.field_c.field_e).field_i;
            return;
          }
        }
    }

    final int a() {
        return 0;
    }

    final qb c() {
        return (qb) (Object) ((mb) this).field_o.a(4);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        kb var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((mb) this).field_p >= 0) {
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
                    if (((mb) this).field_m + param0 >= ((mb) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((mb) this).field_m = ((mb) this).field_m + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((mb) this).field_p - ((mb) this).field_m;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((mb) this).field_m = ((mb) this).field_m + var2;
                    this.e();
                    var3 = (kb) (Object) ((mb) this).field_n.e(-24172);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((mb) this);
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

    final synchronized void a(qb param0) {
        param0.a(false);
    }

    final synchronized void b(qb param0) {
        ((mb) this).field_o.b((ne) (Object) param0, false);
    }

    private final void a(kb param0) {
        param0.a(false);
        param0.a();
        ne var2 = ((mb) this).field_n.field_c.field_e;
        if (var2 == ((mb) this).field_n.field_c) {
            ((mb) this).field_p = -1;
        } else {
            ((mb) this).field_p = ((kb) (Object) var2).field_i;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        kb var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((mb) this).field_p >= 0) {
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
                    if (((mb) this).field_m + param2 >= ((mb) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((mb) this).field_m = ((mb) this).field_m + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((mb) this).field_p - ((mb) this).field_m;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((mb) this).field_m = ((mb) this).field_m + var4;
                    this.e();
                    var5 = (kb) (Object) ((mb) this).field_n.e(-24172);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((mb) this);
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

    private final void d(int param0) {
        qb var2 = (qb) (Object) ((mb) this).field_o.e(-24172);
        while (var2 != null) {
            var2.a(param0);
            var2 = (qb) (Object) ((mb) this).field_o.a(4);
        }
    }

    final qb d() {
        return (qb) (Object) ((mb) this).field_o.e(-24172);
    }

    public mb() {
        ((mb) this).field_o = new md();
        ((mb) this).field_n = new md();
        ((mb) this).field_m = 0;
        ((mb) this).field_p = -1;
    }
}
