/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ia {
    private tf field_m;
    private tf field_j;
    private int field_k;
    private int field_l;

    private final void a(jd param0) {
        param0.a(false);
        param0.a();
        hf var2 = ((ob) this).field_j.field_a.field_b;
        if (var2 == ((ob) this).field_j.field_a) {
            ((ob) this).field_k = -1;
        } else {
            ((ob) this).field_k = ((jd) (Object) var2).field_f;
        }
    }

    final ia c() {
        return (ia) (Object) ((ob) this).field_m.d(1);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        jd var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ob) this).field_k >= 0) {
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
                    if (((ob) this).field_l + param2 >= ((ob) this).field_k) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((ob) this).field_l = ((ob) this).field_l + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((ob) this).field_k - ((ob) this).field_l;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((ob) this).field_l = ((ob) this).field_l + var4;
                    this.e();
                    var5 = (jd) (Object) ((ob) this).field_j.g(0);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((ob) this);
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

    private final void a(hf param0, jd param1) {
        L0: while (true) {
          if (param0 != ((ob) this).field_j.field_a) {
            if (((jd) (Object) param0).field_f <= param1.field_f) {
              param0 = param0.field_b;
              continue L0;
            } else {
              le.a(param0, 93, (hf) (Object) param1);
              ((ob) this).field_k = ((jd) (Object) ((ob) this).field_j.field_a.field_b).field_f;
              return;
            }
          } else {
            le.a(param0, 93, (hf) (Object) param1);
            ((ob) this).field_k = ((jd) (Object) ((ob) this).field_j.field_a.field_b).field_f;
            return;
          }
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        ia var4 = (ia) (Object) ((ob) this).field_m.g(0);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (ia) (Object) ((ob) this).field_m.d(1);
        }
    }

    final int d() {
        return 0;
    }

    final synchronized void b(int param0) {
        int var2 = 0;
        jd var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((ob) this).field_k >= 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.c(param0);
                    return;
                }
                case 2: {
                    if (((ob) this).field_l + param0 >= ((ob) this).field_k) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((ob) this).field_l = ((ob) this).field_l + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((ob) this).field_k - ((ob) this).field_l;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((ob) this).field_l = ((ob) this).field_l + var2;
                    this.e();
                    var3 = (jd) (Object) ((ob) this).field_j.g(0);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((ob) this);
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

    private final void e() {
        jd var1 = null;
        if (((ob) this).field_l > 0) {
            var1 = (jd) (Object) ((ob) this).field_j.g(0);
            while (var1 != null) {
                var1.field_f = var1.field_f - ((ob) this).field_l;
                var1 = (jd) (Object) ((ob) this).field_j.d(1);
            }
            ((ob) this).field_k = ((ob) this).field_k - ((ob) this).field_l;
            ((ob) this).field_l = 0;
        }
    }

    final ia b() {
        return (ia) (Object) ((ob) this).field_m.g(0);
    }

    private final void c(int param0) {
        ia var2 = (ia) (Object) ((ob) this).field_m.g(0);
        while (var2 != null) {
            var2.b(param0);
            var2 = (ia) (Object) ((ob) this).field_m.d(1);
        }
    }

    final synchronized void a(ia param0) {
        ((ob) this).field_m.a((hf) (Object) param0, false);
    }

    public ob() {
        ((ob) this).field_m = new tf();
        ((ob) this).field_j = new tf();
        ((ob) this).field_k = -1;
        ((ob) this).field_l = 0;
    }
}
