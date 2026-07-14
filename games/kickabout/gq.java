/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gq extends lq {
    private tf field_k;
    private tf field_i;
    private int field_j;
    private int field_l;

    final lq b() {
        return (lq) (Object) ((gq) this).field_k.c(33);
    }

    private final void b(int param0) {
        lq var2 = (lq) (Object) ((gq) this).field_k.g(24009);
        while (var2 != null) {
            var2.a(param0);
            var2 = (lq) (Object) ((gq) this).field_k.c(33);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        me var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((gq) this).field_l >= 0) {
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
                    if (((gq) this).field_j + param0 >= ((gq) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((gq) this).field_j = ((gq) this).field_j + param0;
                    this.b(param0);
                    return;
                }
                case 4: {
                    var2 = ((gq) this).field_l - ((gq) this).field_j;
                    this.b(var2);
                    param0 = param0 - var2;
                    ((gq) this).field_j = ((gq) this).field_j + var2;
                    this.e();
                    var3 = (me) (Object) ((gq) this).field_i.g(24009);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((gq) this);
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

    private final void c(int[] param0, int param1, int param2) {
        lq var4 = (lq) (Object) ((gq) this).field_k.g(24009);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (lq) (Object) ((gq) this).field_k.c(33);
        }
    }

    private final void a(me param0) {
        param0.c((byte) -109);
        param0.a();
        gn var2 = ((gq) this).field_i.field_c.field_d;
        if (var2 == ((gq) this).field_i.field_c) {
            ((gq) this).field_l = -1;
        } else {
            ((gq) this).field_l = ((me) (Object) var2).field_e;
        }
    }

    final synchronized void b(lq param0) {
        param0.c((byte) -109);
    }

    private final void a(gn param0, me param1) {
        L0: while (true) {
          if (param0 != ((gq) this).field_i.field_c) {
            if (((me) (Object) param0).field_e <= param1.field_e) {
              param0 = param0.field_d;
              continue L0;
            } else {
              ug.a(param0, 16737894, (gn) (Object) param1);
              ((gq) this).field_l = ((me) (Object) ((gq) this).field_i.field_c.field_d).field_e;
              return;
            }
          } else {
            ug.a(param0, 16737894, (gn) (Object) param1);
            ((gq) this).field_l = ((me) (Object) ((gq) this).field_i.field_c.field_d).field_e;
            return;
          }
        }
    }

    private final void e() {
        me var1 = null;
        if (((gq) this).field_j > 0) {
            var1 = (me) (Object) ((gq) this).field_i.g(24009);
            while (var1 != null) {
                var1.field_e = var1.field_e - ((gq) this).field_j;
                var1 = (me) (Object) ((gq) this).field_i.c(33);
            }
            ((gq) this).field_l = ((gq) this).field_l - ((gq) this).field_j;
            ((gq) this).field_j = 0;
        }
    }

    final int d() {
        return 0;
    }

    final lq c() {
        return (lq) (Object) ((gq) this).field_k.g(24009);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        me var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((gq) this).field_l >= 0) {
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
                    if (((gq) this).field_j + param2 >= ((gq) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((gq) this).field_j = ((gq) this).field_j + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((gq) this).field_l - ((gq) this).field_j;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((gq) this).field_j = ((gq) this).field_j + var4;
                    this.e();
                    var5 = (me) (Object) ((gq) this).field_i.g(24009);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((gq) this);
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

    final synchronized void a(lq param0) {
        ((gq) this).field_k.a(0, (gn) (Object) param0);
    }

    public gq() {
        ((gq) this).field_k = new tf();
        ((gq) this).field_i = new tf();
        ((gq) this).field_j = 0;
        ((gq) this).field_l = -1;
    }
}
