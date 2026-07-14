/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends ag {
    private qj field_n;
    private qj field_m;
    private int field_l;
    private int field_k;

    private final void a(gi param0) {
        param0.c(5);
        param0.a();
        wf var2 = ((jc) this).field_m.field_d.field_b;
        if (var2 == ((jc) this).field_m.field_d) {
            ((jc) this).field_k = -1;
        } else {
            ((jc) this).field_k = ((gi) (Object) var2).field_g;
        }
    }

    private final void e() {
        gi var1 = null;
        if (((jc) this).field_l > 0) {
            var1 = (gi) (Object) ((jc) this).field_m.a((byte) -95);
            while (var1 != null) {
                var1.field_g = var1.field_g - ((jc) this).field_l;
                var1 = (gi) (Object) ((jc) this).field_m.a(true);
            }
            ((jc) this).field_k = ((jc) this).field_k - ((jc) this).field_l;
            ((jc) this).field_l = 0;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        ag var4 = (ag) (Object) ((jc) this).field_n.a((byte) -95);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (ag) (Object) ((jc) this).field_n.a(true);
        }
    }

    final synchronized void d(int param0) {
        int var2 = 0;
        gi var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((jc) this).field_k >= 0) {
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
                    if (((jc) this).field_l + param0 >= ((jc) this).field_k) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((jc) this).field_l = ((jc) this).field_l + param0;
                    this.e(param0);
                    return;
                }
                case 4: {
                    var2 = ((jc) this).field_k - ((jc) this).field_l;
                    this.e(var2);
                    param0 = param0 - var2;
                    ((jc) this).field_l = ((jc) this).field_l + var2;
                    this.e();
                    var3 = (gi) (Object) ((jc) this).field_m.a((byte) -95);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((jc) this);
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
                        var3.field_g = 0;
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
                        var3.field_g = var5;
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

    private final void a(wf param0, gi param1) {
        L0: while (true) {
          if (param0 != ((jc) this).field_m.field_d) {
            if (((gi) (Object) param0).field_g <= param1.field_g) {
              param0 = param0.field_b;
              continue L0;
            } else {
              td.a(param0, (byte) 125, (wf) (Object) param1);
              ((jc) this).field_k = ((gi) (Object) ((jc) this).field_m.field_d.field_b).field_g;
              return;
            }
          } else {
            td.a(param0, (byte) 125, (wf) (Object) param1);
            ((jc) this).field_k = ((gi) (Object) ((jc) this).field_m.field_d.field_b).field_g;
            return;
          }
        }
    }

    final ag d() {
        return (ag) (Object) ((jc) this).field_n.a((byte) -95);
    }

    final synchronized void a(ag param0) {
        ((jc) this).field_n.a((wf) (Object) param0, (byte) 33);
    }

    private final void e(int param0) {
        ag var2 = (ag) (Object) ((jc) this).field_n.a((byte) -95);
        while (var2 != null) {
            var2.d(param0);
            var2 = (ag) (Object) ((jc) this).field_n.a(true);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        gi var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((jc) this).field_k >= 0) {
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
                    if (((jc) this).field_l + param2 >= ((jc) this).field_k) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((jc) this).field_l = ((jc) this).field_l + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((jc) this).field_k - ((jc) this).field_l;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((jc) this).field_l = ((jc) this).field_l + var4;
                    this.e();
                    var5 = (gi) (Object) ((jc) this).field_m.a((byte) -95);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((jc) this);
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
                        var5.field_g = 0;
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
                        var5.field_g = var7;
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

    final ag a() {
        return (ag) (Object) ((jc) this).field_n.a(true);
    }

    final int b() {
        return 0;
    }

    public jc() {
        ((jc) this).field_n = new qj();
        ((jc) this).field_m = new qj();
        ((jc) this).field_l = 0;
        ((jc) this).field_k = -1;
    }
}
