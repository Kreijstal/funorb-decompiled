/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class v extends di {
    private im field_m;
    private im field_l;
    private int field_j;
    private int field_k;

    private final void a(rk param0) {
        param0.b(57);
        param0.a();
        ca var2 = ((v) this).field_l.field_d.field_e;
        if (var2 == ((v) this).field_l.field_d) {
            ((v) this).field_k = -1;
        } else {
            ((v) this).field_k = ((rk) (Object) var2).field_f;
        }
    }

    final synchronized void a(di param0) {
        ((v) this).field_m.a((ca) (Object) param0, 9);
    }

    private final void e() {
        rk var1 = null;
        if (((v) this).field_j > 0) {
            var1 = (rk) (Object) ((v) this).field_l.b((byte) -68);
            while (var1 != null) {
                var1.field_f = var1.field_f - ((v) this).field_j;
                var1 = (rk) (Object) ((v) this).field_l.d(853);
            }
            ((v) this).field_k = ((v) this).field_k - ((v) this).field_j;
            ((v) this).field_j = 0;
        }
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        rk var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((v) this).field_k >= 0) {
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
                    if (((v) this).field_j + param0 >= ((v) this).field_k) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((v) this).field_j = ((v) this).field_j + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((v) this).field_k - ((v) this).field_j;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((v) this).field_j = ((v) this).field_j + var2;
                    this.e();
                    var3 = (rk) (Object) ((v) this).field_l.b((byte) 114);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((v) this);
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

    private final void c(int[] param0, int param1, int param2) {
        di var4 = (di) (Object) ((v) this).field_m.b((byte) 120);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (di) (Object) ((v) this).field_m.d(853);
        }
    }

    final di d() {
        return (di) (Object) ((v) this).field_m.d(853);
    }

    private final void a(ca param0, rk param1) {
        L0: while (true) {
          if (param0 != ((v) this).field_l.field_d) {
            if (((rk) (Object) param0).field_f <= param1.field_f) {
              param0 = param0.field_e;
              continue L0;
            } else {
              vk.a((ca) (Object) param1, (byte) -65, param0);
              ((v) this).field_k = ((rk) (Object) ((v) this).field_l.field_d.field_e).field_f;
              return;
            }
          } else {
            vk.a((ca) (Object) param1, (byte) -65, param0);
            ((v) this).field_k = ((rk) (Object) ((v) this).field_l.field_d.field_e).field_f;
            return;
          }
        }
    }

    final int c() {
        return 0;
    }

    private final void d(int param0) {
        di var2 = (di) (Object) ((v) this).field_m.b((byte) 118);
        while (var2 != null) {
            var2.c(param0);
            var2 = (di) (Object) ((v) this).field_m.d(853);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        rk var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((v) this).field_k >= 0) {
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
                    if (((v) this).field_j + param2 >= ((v) this).field_k) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((v) this).field_j = ((v) this).field_j + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((v) this).field_k - ((v) this).field_j;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((v) this).field_j = ((v) this).field_j + var4;
                    this.e();
                    var5 = (rk) (Object) ((v) this).field_l.b((byte) 126);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((v) this);
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

    final di a() {
        return (di) (Object) ((v) this).field_m.b((byte) 127);
    }

    public v() {
        ((v) this).field_m = new im();
        ((v) this).field_l = new im();
        ((v) this).field_j = 0;
        ((v) this).field_k = -1;
    }
}
