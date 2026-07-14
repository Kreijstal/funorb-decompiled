/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg extends tj {
    private ah field_m;
    private ah field_o;
    private int field_p;
    private int field_n;

    private final void a(pl param0) {
        param0.d(0);
        param0.a();
        hl var2 = ((fg) this).field_o.field_e.field_h;
        if (var2 == ((fg) this).field_o.field_e) {
            ((fg) this).field_p = -1;
        } else {
            ((fg) this).field_p = ((pl) (Object) var2).field_i;
        }
    }

    private final void e(int param0) {
        tj var2 = (tj) (Object) ((fg) this).field_m.b((byte) 114);
        while (var2 != null) {
            var2.a(param0);
            var2 = (tj) (Object) ((fg) this).field_m.c((byte) 90);
        }
    }

    final tj a() {
        return (tj) (Object) ((fg) this).field_m.b((byte) 118);
    }

    final synchronized void b(tj param0) {
        param0.d(0);
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
                    if (((fg) this).field_p >= 0) {
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
                    if (((fg) this).field_n + param0 >= ((fg) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((fg) this).field_n = ((fg) this).field_n + param0;
                    this.e(param0);
                    return;
                }
                case 4: {
                    var2 = ((fg) this).field_p - ((fg) this).field_n;
                    this.e(var2);
                    param0 = param0 - var2;
                    ((fg) this).field_n = ((fg) this).field_n + var2;
                    this.e();
                    var3 = (pl) (Object) ((fg) this).field_o.b((byte) 119);
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

    final synchronized void b(int[] param0, int param1, int param2) {
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
                    if (((fg) this).field_p >= 0) {
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
                    if (((fg) this).field_n + param2 >= ((fg) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((fg) this).field_n = ((fg) this).field_n + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((fg) this).field_p - ((fg) this).field_n;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((fg) this).field_n = ((fg) this).field_n + var4;
                    this.e();
                    var5 = (pl) (Object) ((fg) this).field_o.b((byte) 91);
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

    private final void a(hl param0, pl param1) {
        L0: while (true) {
          if (param0 != ((fg) this).field_o.field_e) {
            if (((pl) (Object) param0).field_i <= param1.field_i) {
              param0 = param0.field_h;
              continue L0;
            } else {
              ah.a(param0, 0, (hl) (Object) param1);
              ((fg) this).field_p = ((pl) (Object) ((fg) this).field_o.field_e.field_h).field_i;
              return;
            }
          } else {
            ah.a(param0, 0, (hl) (Object) param1);
            ((fg) this).field_p = ((pl) (Object) ((fg) this).field_o.field_e.field_h).field_i;
            return;
          }
        }
    }

    private final void e() {
        pl var1 = null;
        if (((fg) this).field_n > 0) {
            var1 = (pl) (Object) ((fg) this).field_o.b((byte) 86);
            while (var1 != null) {
                var1.field_i = var1.field_i - ((fg) this).field_n;
                var1 = (pl) (Object) ((fg) this).field_o.c((byte) -52);
            }
            ((fg) this).field_p = ((fg) this).field_p - ((fg) this).field_n;
            ((fg) this).field_n = 0;
        }
    }

    final tj b() {
        return (tj) (Object) ((fg) this).field_m.c((byte) -114);
    }

    final synchronized void a(tj param0) {
        ((fg) this).field_m.a((hl) (Object) param0, false);
    }

    private final void c(int[] param0, int param1, int param2) {
        tj var4 = (tj) (Object) ((fg) this).field_m.b((byte) 115);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (tj) (Object) ((fg) this).field_m.c((byte) 120);
        }
    }

    final int c() {
        return 0;
    }

    public fg() {
        ((fg) this).field_m = new ah();
        ((fg) this).field_o = new ah();
        ((fg) this).field_n = 0;
        ((fg) this).field_p = -1;
    }
}
