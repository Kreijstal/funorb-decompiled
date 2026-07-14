/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends cg {
    private vna field_l;
    private vna field_m;
    private int field_k;
    private int field_j;

    private final void b(int param0) {
        cg var2 = (cg) (Object) ((en) this).field_l.f(-80);
        while (var2 != null) {
            var2.a(param0);
            var2 = (cg) (Object) ((en) this).field_l.e(122);
        }
    }

    private final void e() {
        jva var1 = null;
        if (((en) this).field_k > 0) {
            var1 = (jva) (Object) ((en) this).field_m.f(-80);
            while (var1 != null) {
                var1.field_f = var1.field_f - ((en) this).field_k;
                var1 = (jva) (Object) ((en) this).field_m.e(119);
            }
            ((en) this).field_j = ((en) this).field_j - ((en) this).field_k;
            ((en) this).field_k = 0;
        }
    }

    private final void a(vg param0, jva param1) {
        L0: while (true) {
          if (param0 != ((en) this).field_m.field_e) {
            if (((jva) (Object) param0).field_f <= param1.field_f) {
              param0 = param0.field_a;
              continue L0;
            } else {
              ln.a(param0, (vg) (Object) param1, (byte) -102);
              ((en) this).field_j = ((jva) (Object) ((en) this).field_m.field_e.field_a).field_f;
              return;
            }
          } else {
            ln.a(param0, (vg) (Object) param1, (byte) -102);
            ((en) this).field_j = ((jva) (Object) ((en) this).field_m.field_e.field_a).field_f;
            return;
          }
        }
    }

    final cg c() {
        return (cg) (Object) ((en) this).field_l.e(126);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        jva var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((en) this).field_j >= 0) {
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
                    if (((en) this).field_k + param2 >= ((en) this).field_j) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((en) this).field_k = ((en) this).field_k + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((en) this).field_j - ((en) this).field_k;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((en) this).field_k = ((en) this).field_k + var4;
                    this.e();
                    var5 = (jva) (Object) ((en) this).field_m.f(-80);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((en) this);
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
                        this.a(var5.field_a, var5);
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

    final int a() {
        return 0;
    }

    private final void c(int[] param0, int param1, int param2) {
        cg var4 = (cg) (Object) ((en) this).field_l.f(-80);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (cg) (Object) ((en) this).field_l.e(119);
        }
    }

    final synchronized void b(cg param0) {
        param0.p(80);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        jva var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((en) this).field_j >= 0) {
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
                    if (((en) this).field_k + param0 >= ((en) this).field_j) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((en) this).field_k = ((en) this).field_k + param0;
                    this.b(param0);
                    return;
                }
                case 4: {
                    var2 = ((en) this).field_j - ((en) this).field_k;
                    this.b(var2);
                    param0 = param0 - var2;
                    ((en) this).field_k = ((en) this).field_k + var2;
                    this.e();
                    var3 = (jva) (Object) ((en) this).field_m.f(-80);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((en) this);
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
                        this.a(var3.field_a, var3);
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

    private final void a(jva param0) {
        param0.p(54);
        param0.a();
        vg var2 = ((en) this).field_m.field_e.field_a;
        if (var2 == ((en) this).field_m.field_e) {
            ((en) this).field_j = -1;
        } else {
            ((en) this).field_j = ((jva) (Object) var2).field_f;
        }
    }

    final synchronized void a(cg param0) {
        ((en) this).field_l.a((byte) 110, (vg) (Object) param0);
    }

    final cg b() {
        return (cg) (Object) ((en) this).field_l.f(-80);
    }

    public en() {
        ((en) this).field_l = new vna();
        ((en) this).field_m = new vna();
        ((en) this).field_j = -1;
        ((en) this).field_k = 0;
    }
}
