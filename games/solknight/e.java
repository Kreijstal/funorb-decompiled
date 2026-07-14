/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class e extends ej {
    private nc field_l;
    private nc field_n;
    private int field_m;
    private int field_o;

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        ag var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((e) this).field_o >= 0) {
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
                    if (((e) this).field_m + param2 >= ((e) this).field_o) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((e) this).field_m = ((e) this).field_m + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((e) this).field_o - ((e) this).field_m;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((e) this).field_m = ((e) this).field_m + var4;
                    this.e();
                    var5 = (ag) (Object) ((e) this).field_n.a((byte) 51);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((e) this);
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
                        this.a(var5.field_d, var5);
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
        ej var2 = (ej) (Object) ((e) this).field_l.a((byte) 51);
        while (var2 != null) {
            var2.a(param0);
            var2 = (ej) (Object) ((e) this).field_l.b(-79);
        }
    }

    final synchronized void a(ej param0) {
        ((e) this).field_l.a(-3024, (gg) (Object) param0);
    }

    final ej a() {
        return (ej) (Object) ((e) this).field_l.a((byte) 51);
    }

    private final void a(ag param0) {
        param0.c(10);
        param0.a();
        gg var2 = ((e) this).field_n.field_e.field_d;
        if (var2 == ((e) this).field_n.field_e) {
            ((e) this).field_o = -1;
        } else {
            ((e) this).field_o = ((ag) (Object) var2).field_h;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        ag var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((e) this).field_o >= 0) {
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
                    if (((e) this).field_m + param0 >= ((e) this).field_o) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((e) this).field_m = ((e) this).field_m + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((e) this).field_o - ((e) this).field_m;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((e) this).field_m = ((e) this).field_m + var2;
                    this.e();
                    var3 = (ag) (Object) ((e) this).field_n.a((byte) 51);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((e) this);
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
                        this.a(var3.field_d, var3);
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

    final ej b() {
        return (ej) (Object) ((e) this).field_l.b(-51);
    }

    final int d() {
        return 0;
    }

    private final void e() {
        ag var1 = null;
        if (((e) this).field_m > 0) {
            var1 = (ag) (Object) ((e) this).field_n.a((byte) 51);
            while (var1 != null) {
                var1.field_h = var1.field_h - ((e) this).field_m;
                var1 = (ag) (Object) ((e) this).field_n.b(-31);
            }
            ((e) this).field_o = ((e) this).field_o - ((e) this).field_m;
            ((e) this).field_m = 0;
        }
    }

    private final void a(gg param0, ag param1) {
        L0: while (true) {
          if (param0 != ((e) this).field_n.field_e) {
            if (((ag) (Object) param0).field_h <= param1.field_h) {
              param0 = param0.field_d;
              continue L0;
            } else {
              ha.a((gg) (Object) param1, (byte) 93, param0);
              ((e) this).field_o = ((ag) (Object) ((e) this).field_n.field_e.field_d).field_h;
              return;
            }
          } else {
            ha.a((gg) (Object) param1, (byte) 93, param0);
            ((e) this).field_o = ((ag) (Object) ((e) this).field_n.field_e.field_d).field_h;
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        ej var4 = (ej) (Object) ((e) this).field_l.a((byte) 51);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (ej) (Object) ((e) this).field_l.b(-27);
        }
    }

    public e() {
        ((e) this).field_l = new nc();
        ((e) this).field_n = new nc();
        ((e) this).field_m = 0;
        ((e) this).field_o = -1;
    }
}
