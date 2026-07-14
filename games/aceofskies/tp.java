/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tp extends rf {
    private kp field_k;
    private kp field_j;
    private int field_l;
    private int field_i;

    private final void a(va param0) {
        param0.c(-126);
        param0.a();
        wf var2 = ((tp) this).field_j.field_e.field_a;
        if (var2 == ((tp) this).field_j.field_e) {
            ((tp) this).field_i = -1;
        } else {
            ((tp) this).field_i = ((va) var2).field_e;
        }
    }

    private final void a(wf param0, va param1) {
        L0: while (true) {
          if (param0 != ((tp) this).field_j.field_e) {
            if (((va) param0).field_e <= ((va) param1).field_e) {
              param0 = ((wf) param0).field_a;
              continue L0;
            } else {
              ml.a((byte) -20, param0, (wf) (Object) param1);
              ((tp) this).field_i = ((va) ((tp) this).field_j.field_e.field_a).field_e;
              return;
            }
          } else {
            ml.a((byte) -20, param0, (wf) (Object) param1);
            ((tp) this).field_i = ((va) ((tp) this).field_j.field_e.field_a).field_e;
            return;
          }
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        va var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((tp) this).field_i >= 0) {
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
                    if (((tp) this).field_l + param2 >= ((tp) this).field_i) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((tp) this).field_l = ((tp) this).field_l + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((tp) this).field_i - ((tp) this).field_l;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((tp) this).field_l = ((tp) this).field_l + var4;
                    this.e();
                    var5 = (va) ((tp) this).field_j.d(268435455);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((tp) this);
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
                        var5.field_e = 0;
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
                        var5.field_e = var7;
                        this.a(((va) var5).field_a, var5);
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

    private final void e() {
        va var1 = null;
        if (((tp) this).field_l > 0) {
            var1 = (va) ((tp) this).field_j.d(268435455);
            while (var1 != null) {
                ((va) var1).field_e = ((va) var1).field_e - ((tp) this).field_l;
                var1 = (va) ((tp) this).field_j.b((byte) 103);
            }
            ((tp) this).field_i = ((tp) this).field_i - ((tp) this).field_l;
            ((tp) this).field_l = 0;
        }
    }

    final synchronized void b(rf param0) {
        ((tp) this).field_k.a((wf) (Object) param0, 25611);
    }

    private final void d(int param0) {
        rf var2 = (rf) ((tp) this).field_k.d(268435455);
        while (var2 != null) {
            var2.a(param0);
            var2 = (rf) ((tp) this).field_k.b((byte) 103);
        }
    }

    final rf a() {
        return (rf) ((tp) this).field_k.b((byte) 103);
    }

    private final void c(int[] param0, int param1, int param2) {
        rf var4 = (rf) ((tp) this).field_k.d(268435455);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (rf) ((tp) this).field_k.b((byte) 103);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        va var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((tp) this).field_i >= 0) {
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
                    if (((tp) this).field_l + param0 >= ((tp) this).field_i) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((tp) this).field_l = ((tp) this).field_l + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((tp) this).field_i - ((tp) this).field_l;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((tp) this).field_l = ((tp) this).field_l + var2;
                    this.e();
                    var3 = (va) ((tp) this).field_j.d(268435455);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((tp) this);
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
                        var3.field_e = 0;
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
                        var3.field_e = var5;
                        this.a(((va) var3).field_a, var3);
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

    final synchronized void a(rf param0) {
        param0.c(-126);
    }

    final rf b() {
        return (rf) ((tp) this).field_k.d(268435455);
    }

    final int d() {
        return 0;
    }

    public tp() {
        ((tp) this).field_k = new kp();
        ((tp) this).field_j = new kp();
        ((tp) this).field_i = -1;
        ((tp) this).field_l = 0;
    }
}
