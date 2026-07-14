/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vi extends c {
    private rk field_k;
    private rk field_j;
    private int field_m;
    private int field_l;

    final int b() {
        return 0;
    }

    final synchronized void a(c param0) {
        param0.b(4);
    }

    final void a(ud param0, int param1, int param2, int param3) {
        this.a((c) (Object) fj.a(param0, param1, param2), param3);
    }

    private final void d(int param0) {
        c var2 = (c) (Object) ((vi) this).field_k.c(-3905);
        while (var2 != null) {
            var2.a(param0);
            var2 = (c) (Object) ((vi) this).field_k.a(-16913);
        }
    }

    private final void a(c param0, int param1) {
        if (param1 > 0) {
            param0 = (c) (Object) eg.a(29723, param1, param0);
        }
        ((vi) this).b(param0);
    }

    final synchronized void a(oa param0) {
        if (param0.field_g != null) {
          if ((Object) (Object) param0.field_g != this) {
            throw new RuntimeException();
          } else {
            this.e();
            this.c(param0);
            return;
          }
        } else {
          return;
        }
    }

    final void a(ud param0, int param1, int param2) {
        ((vi) this).b((c) (Object) fj.a(param0, param1, param2));
    }

    final c c() {
        return (c) (Object) ((vi) this).field_k.c(-3905);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        oa var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vi) this).field_l >= 0) {
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
                    if (((vi) this).field_m + param0 >= ((vi) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vi) this).field_m = ((vi) this).field_m + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((vi) this).field_l - ((vi) this).field_m;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((vi) this).field_m = ((vi) this).field_m + var2;
                    this.e();
                    var3 = (oa) (Object) ((vi) this).field_j.c(-3905);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((vi) this);
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
                        this.c(var3);
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

    final c a() {
        return (c) (Object) ((vi) this).field_k.a(-16913);
    }

    final synchronized void b(c param0) {
        ((vi) this).field_k.a(-97, (rf) (Object) param0);
    }

    private final void c(int[] param0, int param1, int param2) {
        c var4 = (c) (Object) ((vi) this).field_k.c(-3905);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (c) (Object) ((vi) this).field_k.a(-16913);
        }
    }

    final synchronized void b(oa param0) {
        if (param0.field_g != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_g = (vi) this;
          param0.b();
          this.a(((vi) this).field_j.field_c.field_a, param0);
          return;
        }
    }

    private final void c(oa param0) {
        param0.b(4);
        param0.a();
        param0.field_g = null;
        rf var2 = ((vi) this).field_j.field_c.field_a;
        if (var2 == ((vi) this).field_j.field_c) {
            ((vi) this).field_l = -1;
        } else {
            ((vi) this).field_l = ((oa) (Object) var2).field_f;
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        oa var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vi) this).field_l >= 0) {
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
                    if (((vi) this).field_m + param2 >= ((vi) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vi) this).field_m = ((vi) this).field_m + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((vi) this).field_l - ((vi) this).field_m;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((vi) this).field_m = ((vi) this).field_m + var4;
                    this.e();
                    var5 = (oa) (Object) ((vi) this).field_j.c(-3905);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((vi) this);
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
                        this.c(var5);
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

    private final void e() {
        oa var1 = null;
        if (((vi) this).field_m > 0) {
            var1 = (oa) (Object) ((vi) this).field_j.c(-3905);
            while (var1 != null) {
                var1.field_f = var1.field_f - ((vi) this).field_m;
                var1 = (oa) (Object) ((vi) this).field_j.a(-16913);
            }
            ((vi) this).field_l = ((vi) this).field_l - ((vi) this).field_m;
            ((vi) this).field_m = 0;
        }
    }

    private final void a(rf param0, oa param1) {
        L0: while (true) {
          if (param0 != ((vi) this).field_j.field_c) {
            if (((oa) (Object) param0).field_f <= param1.field_f) {
              param0 = param0.field_a;
              continue L0;
            } else {
              fe.a(param0, (rf) (Object) param1, false);
              ((vi) this).field_l = ((oa) (Object) ((vi) this).field_j.field_c.field_a).field_f;
              return;
            }
          } else {
            fe.a(param0, (rf) (Object) param1, false);
            ((vi) this).field_l = ((oa) (Object) ((vi) this).field_j.field_c.field_a).field_f;
            return;
          }
        }
    }

    public vi() {
        ((vi) this).field_k = new rk();
        ((vi) this).field_j = new rk();
        ((vi) this).field_m = 0;
        ((vi) this).field_l = -1;
    }
}
