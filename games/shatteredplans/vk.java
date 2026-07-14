/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends tn {
    private pf field_l;
    private pf field_o;
    private int field_m;
    private int field_n;

    final tn b() {
        return (tn) (Object) ((vk) this).field_l.d(0);
    }

    private final void e() {
        bm var1 = null;
        if (((vk) this).field_n > 0) {
            var1 = (bm) (Object) ((vk) this).field_o.d(0);
            while (var1 != null) {
                var1.field_h = var1.field_h - ((vk) this).field_n;
                var1 = (bm) (Object) ((vk) this).field_o.a((byte) -71);
            }
            ((vk) this).field_m = ((vk) this).field_m - ((vk) this).field_n;
            ((vk) this).field_n = 0;
        }
    }

    final int a() {
        return 0;
    }

    private final void a(bm param0) {
        param0.b((byte) -122);
        param0.a();
        oh var2 = ((vk) this).field_o.field_h.field_f;
        if (var2 == ((vk) this).field_o.field_h) {
            ((vk) this).field_m = -1;
        } else {
            ((vk) this).field_m = ((bm) (Object) var2).field_h;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        bm var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vk) this).field_m >= 0) {
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
                    if (((vk) this).field_n + param0 >= ((vk) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vk) this).field_n = ((vk) this).field_n + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((vk) this).field_m - ((vk) this).field_n;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((vk) this).field_n = ((vk) this).field_n + var2;
                    this.e();
                    var3 = (bm) (Object) ((vk) this).field_o.d(0);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((vk) this);
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

    final synchronized void a(tn param0) {
        ((vk) this).field_l.a((oh) (Object) param0, 0);
    }

    final tn d() {
        return (tn) (Object) ((vk) this).field_l.a((byte) -71);
    }

    private final void a(oh param0, bm param1) {
        L0: while (true) {
          if (param0 != ((vk) this).field_o.field_h) {
            if (((bm) (Object) param0).field_h <= param1.field_h) {
              param0 = param0.field_f;
              continue L0;
            } else {
              wp.a((byte) -128, (oh) (Object) param1, param0);
              ((vk) this).field_m = ((bm) (Object) ((vk) this).field_o.field_h.field_f).field_h;
              return;
            }
          } else {
            wp.a((byte) -128, (oh) (Object) param1, param0);
            ((vk) this).field_m = ((bm) (Object) ((vk) this).field_o.field_h.field_f).field_h;
            return;
          }
        }
    }

    private final void d(int param0) {
        tn var2 = (tn) (Object) ((vk) this).field_l.d(0);
        while (var2 != null) {
            var2.a(param0);
            var2 = (tn) (Object) ((vk) this).field_l.a((byte) -71);
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        tn var4 = (tn) (Object) ((vk) this).field_l.d(0);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (tn) (Object) ((vk) this).field_l.a((byte) -71);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        bm var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vk) this).field_m >= 0) {
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
                    if (((vk) this).field_n + param2 >= ((vk) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vk) this).field_n = ((vk) this).field_n + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((vk) this).field_m - ((vk) this).field_n;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((vk) this).field_n = ((vk) this).field_n + var4;
                    this.e();
                    var5 = (bm) (Object) ((vk) this).field_o.d(0);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((vk) this);
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

    public vk() {
        ((vk) this).field_l = new pf();
        ((vk) this).field_o = new pf();
        ((vk) this).field_m = -1;
        ((vk) this).field_n = 0;
    }
}
