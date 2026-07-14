/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends we {
    private ul field_u;
    private ul field_s;
    private int field_t;
    private int field_v;

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        w var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((wg) this).field_v >= 0) {
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
                    if (((wg) this).field_t + param2 >= ((wg) this).field_v) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((wg) this).field_t = ((wg) this).field_t + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((wg) this).field_v - ((wg) this).field_t;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((wg) this).field_t = ((wg) this).field_t + var4;
                    this.e();
                    var5 = (w) (Object) ((wg) this).field_s.e(13058);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((wg) this);
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
                        var5.field_o = 0;
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
                        var5.field_o = var7;
                        this.a(var5.field_k, var5);
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

    final synchronized void b(we param0) {
        ((wg) this).field_u.a((ck) (Object) param0, -21459);
    }

    final we d() {
        return (we) (Object) ((wg) this).field_u.e(13058);
    }

    private final void a(w param0) {
        param0.b(4);
        param0.a();
        ck var2 = ((wg) this).field_s.field_e.field_k;
        if (var2 == ((wg) this).field_s.field_e) {
            ((wg) this).field_v = -1;
        } else {
            ((wg) this).field_v = ((w) (Object) var2).field_o;
        }
    }

    final we b() {
        return (we) (Object) ((wg) this).field_u.a((byte) -25);
    }

    private final void a(ck param0, w param1) {
        L0: while (true) {
          if (param0 != ((wg) this).field_s.field_e) {
            if (((w) (Object) param0).field_o <= param1.field_o) {
              param0 = param0.field_k;
              continue L0;
            } else {
              ie.a(param0, 30, (ck) (Object) param1);
              ((wg) this).field_v = ((w) (Object) ((wg) this).field_s.field_e.field_k).field_o;
              return;
            }
          } else {
            ie.a(param0, 30, (ck) (Object) param1);
            ((wg) this).field_v = ((w) (Object) ((wg) this).field_s.field_e.field_k).field_o;
            return;
          }
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        w var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((wg) this).field_v >= 0) {
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
                    if (((wg) this).field_t + param0 >= ((wg) this).field_v) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((wg) this).field_t = ((wg) this).field_t + param0;
                    this.e(param0);
                    return;
                }
                case 4: {
                    var2 = ((wg) this).field_v - ((wg) this).field_t;
                    this.e(var2);
                    param0 = param0 - var2;
                    ((wg) this).field_t = ((wg) this).field_t + var2;
                    this.e();
                    var3 = (w) (Object) ((wg) this).field_s.e(13058);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((wg) this);
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
                        var3.field_o = 0;
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
                        var3.field_o = var5;
                        this.a(var3.field_k, var3);
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
        w var1 = null;
        if (((wg) this).field_t > 0) {
            var1 = (w) (Object) ((wg) this).field_s.e(13058);
            while (var1 != null) {
                var1.field_o = var1.field_o - ((wg) this).field_t;
                var1 = (w) (Object) ((wg) this).field_s.a((byte) -75);
            }
            ((wg) this).field_v = ((wg) this).field_v - ((wg) this).field_t;
            ((wg) this).field_t = 0;
        }
    }

    final int a() {
        return 0;
    }

    final synchronized void a(we param0) {
        param0.b(4);
    }

    private final void e(int param0) {
        we var2 = (we) (Object) ((wg) this).field_u.e(13058);
        while (var2 != null) {
            var2.d(param0);
            var2 = (we) (Object) ((wg) this).field_u.a((byte) -58);
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        we var4 = (we) (Object) ((wg) this).field_u.e(13058);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (we) (Object) ((wg) this).field_u.a((byte) -29);
        }
    }

    public wg() {
        ((wg) this).field_u = new ul();
        ((wg) this).field_s = new ul();
        ((wg) this).field_t = 0;
        ((wg) this).field_v = -1;
    }
}
