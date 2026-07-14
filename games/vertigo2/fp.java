/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends sn {
    private nj field_t;
    private nj field_r;
    private int field_u;
    private int field_s;

    private final void a(o param0) {
        param0.c(2);
        param0.a();
        li var2 = ((fp) this).field_r.field_h.field_c;
        if (var2 == ((fp) this).field_r.field_h) {
            ((fp) this).field_u = -1;
        } else {
            ((fp) this).field_u = ((o) (Object) var2).field_n;
        }
    }

    final sn a() {
        return (sn) (Object) ((fp) this).field_t.b(56);
    }

    final synchronized void a(sn param0) {
        ((fp) this).field_t.a((li) (Object) param0, (byte) 27);
    }

    private final void a(li param0, o param1) {
        L0: while (true) {
          if (param0 != ((fp) this).field_r.field_h) {
            if (((o) (Object) param0).field_n <= param1.field_n) {
              param0 = param0.field_c;
              continue L0;
            } else {
              jn.a((li) (Object) param1, param0, 18724);
              ((fp) this).field_u = ((o) (Object) ((fp) this).field_r.field_h.field_c).field_n;
              return;
            }
          } else {
            jn.a((li) (Object) param1, param0, 18724);
            ((fp) this).field_u = ((o) (Object) ((fp) this).field_r.field_h.field_c).field_n;
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        sn var4 = (sn) (Object) ((fp) this).field_t.a((byte) 100);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (sn) (Object) ((fp) this).field_t.b(52);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        o var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((fp) this).field_u >= 0) {
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
                    if (((fp) this).field_s + param2 >= ((fp) this).field_u) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((fp) this).field_s = ((fp) this).field_s + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((fp) this).field_u - ((fp) this).field_s;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((fp) this).field_s = ((fp) this).field_s + var4;
                    this.e();
                    var5 = (o) (Object) ((fp) this).field_r.a((byte) 100);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((fp) this);
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
                        this.a(var5.field_c, var5);
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
        o var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((fp) this).field_u >= 0) {
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
                    if (((fp) this).field_s + param0 >= ((fp) this).field_u) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((fp) this).field_s = ((fp) this).field_s + param0;
                    this.e(param0);
                    return;
                }
                case 4: {
                    var2 = ((fp) this).field_u - ((fp) this).field_s;
                    this.e(var2);
                    param0 = param0 - var2;
                    ((fp) this).field_s = ((fp) this).field_s + var2;
                    this.e();
                    var3 = (o) (Object) ((fp) this).field_r.a((byte) 100);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((fp) this);
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
                        this.a(var3.field_c, var3);
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
        o var1 = null;
        if (((fp) this).field_s > 0) {
            var1 = (o) (Object) ((fp) this).field_r.a((byte) 100);
            while (var1 != null) {
                var1.field_n = var1.field_n - ((fp) this).field_s;
                var1 = (o) (Object) ((fp) this).field_r.b(88);
            }
            ((fp) this).field_u = ((fp) this).field_u - ((fp) this).field_s;
            ((fp) this).field_s = 0;
        }
    }

    final sn c() {
        return (sn) (Object) ((fp) this).field_t.a((byte) 100);
    }

    final int d() {
        return 0;
    }

    private final void e(int param0) {
        sn var2 = (sn) (Object) ((fp) this).field_t.a((byte) 100);
        while (var2 != null) {
            var2.a(param0);
            var2 = (sn) (Object) ((fp) this).field_t.b(88);
        }
    }

    final synchronized void b(sn param0) {
        param0.c(2);
    }

    public fp() {
        ((fp) this).field_t = new nj();
        ((fp) this).field_r = new nj();
        ((fp) this).field_s = 0;
        ((fp) this).field_u = -1;
    }
}
