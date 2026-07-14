/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vp extends gq {
    private th field_l;
    private th field_k;
    private int field_j;
    private int field_m;

    final synchronized void a(int param0) {
        int var2 = 0;
        rc var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vp) this).field_m >= 0) {
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
                    if (((vp) this).field_j + param0 >= ((vp) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vp) this).field_j = ((vp) this).field_j + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((vp) this).field_m - ((vp) this).field_j;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((vp) this).field_j = ((vp) this).field_j + var2;
                    this.e();
                    var3 = (rc) (Object) ((vp) this).field_k.c(126);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((vp) this);
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

    private final void a(br param0, rc param1) {
        L0: while (true) {
          if (param0 != ((vp) this).field_k.field_b) {
            if (((rc) (Object) param0).field_f <= param1.field_f) {
              param0 = param0.field_d;
              continue L0;
            } else {
              vc.a(param0, (br) (Object) param1, true);
              ((vp) this).field_m = ((rc) (Object) ((vp) this).field_k.field_b.field_d).field_f;
              return;
            }
          } else {
            vc.a(param0, (br) (Object) param1, true);
            ((vp) this).field_m = ((rc) (Object) ((vp) this).field_k.field_b.field_d).field_f;
            return;
          }
        }
    }

    final gq d() {
        return (gq) (Object) ((vp) this).field_l.b(6);
    }

    private final void a(rc param0) {
        param0.a(true);
        param0.a();
        br var2 = ((vp) this).field_k.field_b.field_d;
        if (var2 == ((vp) this).field_k.field_b) {
            ((vp) this).field_m = -1;
        } else {
            ((vp) this).field_m = ((rc) (Object) var2).field_f;
        }
    }

    final int a() {
        return 0;
    }

    final synchronized void b(gq param0) {
        ((vp) this).field_l.a(-25612, (br) (Object) param0);
    }

    final gq b() {
        return (gq) (Object) ((vp) this).field_l.c(44);
    }

    final synchronized void a(gq param0) {
        param0.a(true);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        rc var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vp) this).field_m >= 0) {
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
                    if (((vp) this).field_j + param2 >= ((vp) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vp) this).field_j = ((vp) this).field_j + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((vp) this).field_m - ((vp) this).field_j;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((vp) this).field_j = ((vp) this).field_j + var4;
                    this.e();
                    var5 = (rc) (Object) ((vp) this).field_k.c(84);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((vp) this);
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

    private final void e() {
        rc var1 = null;
        if (((vp) this).field_j > 0) {
            var1 = (rc) (Object) ((vp) this).field_k.c(39);
            while (var1 != null) {
                var1.field_f = var1.field_f - ((vp) this).field_j;
                var1 = (rc) (Object) ((vp) this).field_k.b(6);
            }
            ((vp) this).field_m = ((vp) this).field_m - ((vp) this).field_j;
            ((vp) this).field_j = 0;
        }
    }

    private final void c(int param0) {
        gq var2 = (gq) (Object) ((vp) this).field_l.c(67);
        while (var2 != null) {
            var2.a(param0);
            var2 = (gq) (Object) ((vp) this).field_l.b(6);
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        gq var4 = (gq) (Object) ((vp) this).field_l.c(97);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (gq) (Object) ((vp) this).field_l.b(6);
        }
    }

    public vp() {
        ((vp) this).field_l = new th();
        ((vp) this).field_k = new th();
        ((vp) this).field_j = 0;
        ((vp) this).field_m = -1;
    }
}
