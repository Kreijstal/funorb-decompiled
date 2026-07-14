/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hk extends lk {
    private ng field_m;
    private ng field_l;
    private int field_o;
    private int field_n;

    private final void e() {
        hg var1 = null;
        if (((hk) this).field_o > 0) {
            var1 = (hg) (Object) ((hk) this).field_l.a(true);
            while (var1 != null) {
                var1.field_h = var1.field_h - ((hk) this).field_o;
                var1 = (hg) (Object) ((hk) this).field_l.f(2);
            }
            ((hk) this).field_n = ((hk) this).field_n - ((hk) this).field_o;
            ((hk) this).field_o = 0;
        }
    }

    final lk b() {
        return (lk) (Object) ((hk) this).field_m.f(2);
    }

    private final void a(kd param0, hg param1) {
        L0: while (true) {
          if (param0 != ((hk) this).field_l.field_b) {
            if (((hg) (Object) param0).field_h <= param1.field_h) {
              param0 = param0.field_f;
              continue L0;
            } else {
              vf.a(param0, 0, (kd) (Object) param1);
              ((hk) this).field_n = ((hg) (Object) ((hk) this).field_l.field_b.field_f).field_h;
              return;
            }
          } else {
            vf.a(param0, 0, (kd) (Object) param1);
            ((hk) this).field_n = ((hg) (Object) ((hk) this).field_l.field_b.field_f).field_h;
            return;
          }
        }
    }

    private final void b(int param0) {
        lk var2 = (lk) (Object) ((hk) this).field_m.a(true);
        while (var2 != null) {
            var2.a(param0);
            var2 = (lk) (Object) ((hk) this).field_m.f(2);
        }
    }

    final synchronized void a(lk param0) {
        ((hk) this).field_m.a(-68, (kd) (Object) param0);
    }

    final void a(ke param0, int param1, int param2) {
        ((hk) this).a((lk) (Object) cc.a(param0, param1, param2));
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        hg var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((hk) this).field_n >= 0) {
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
                    if (((hk) this).field_o + param0 >= ((hk) this).field_n) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((hk) this).field_o = ((hk) this).field_o + param0;
                    this.b(param0);
                    return;
                }
                case 4: {
                    var2 = ((hk) this).field_n - ((hk) this).field_o;
                    this.b(var2);
                    param0 = param0 - var2;
                    ((hk) this).field_o = ((hk) this).field_o + var2;
                    this.e();
                    var3 = (hg) (Object) ((hk) this).field_l.a(true);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((hk) this);
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
                        var3.field_h = 0;
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
                        var3.field_h = var5;
                        this.a(var3.field_f, var3);
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

    final int a() {
        return 0;
    }

    final lk d() {
        return (lk) (Object) ((hk) this).field_m.a(true);
    }

    private final void c(int[] param0, int param1, int param2) {
        lk var4 = (lk) (Object) ((hk) this).field_m.a(true);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (lk) (Object) ((hk) this).field_m.f(2);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        hg var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((hk) this).field_n >= 0) {
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
                    if (((hk) this).field_o + param2 >= ((hk) this).field_n) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((hk) this).field_o = ((hk) this).field_o + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((hk) this).field_n - ((hk) this).field_o;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((hk) this).field_o = ((hk) this).field_o + var4;
                    this.e();
                    var5 = (hg) (Object) ((hk) this).field_l.a(true);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((hk) this);
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
                        var5.field_h = 0;
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
                        var5.field_h = var7;
                        this.a(var5.field_f, var5);
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

    private final void a(hg param0) {
        param0.b((byte) -119);
        param0.a();
        kd var2 = ((hk) this).field_l.field_b.field_f;
        if (var2 == ((hk) this).field_l.field_b) {
            ((hk) this).field_n = -1;
        } else {
            ((hk) this).field_n = ((hg) (Object) var2).field_h;
        }
    }

    public hk() {
        ((hk) this).field_m = new ng();
        ((hk) this).field_l = new ng();
        ((hk) this).field_o = 0;
        ((hk) this).field_n = -1;
    }
}
