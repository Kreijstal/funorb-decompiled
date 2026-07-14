/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh extends lf {
    private ei field_n;
    private ei field_q;
    private int field_o;
    private int field_p;

    private final void e() {
        sl var1 = null;
        if (((uh) this).field_p > 0) {
            var1 = (sl) (Object) ((uh) this).field_q.b(0);
            while (var1 != null) {
                var1.field_k = var1.field_k - ((uh) this).field_p;
                var1 = (sl) (Object) ((uh) this).field_q.f(-24059);
            }
            ((uh) this).field_o = ((uh) this).field_o - ((uh) this).field_p;
            ((uh) this).field_p = 0;
        }
    }

    private final void a(q param0, sl param1) {
        L0: while (true) {
          if (param0 != ((uh) this).field_q.field_b) {
            if (((sl) (Object) param0).field_k <= param1.field_k) {
              param0 = param0.field_e;
              continue L0;
            } else {
              fi.a((q) (Object) param1, param0, -1240266932);
              ((uh) this).field_o = ((sl) (Object) ((uh) this).field_q.field_b.field_e).field_k;
              return;
            }
          } else {
            fi.a((q) (Object) param1, param0, -1240266932);
            ((uh) this).field_o = ((sl) (Object) ((uh) this).field_q.field_b.field_e).field_k;
            return;
          }
        }
    }

    final synchronized void a(sl param0) {
        if (param0.field_j != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_j = (uh) this;
          param0.b();
          this.a(((uh) this).field_q.field_b.field_e, param0);
          return;
        }
    }

    final int a() {
        return 0;
    }

    final synchronized void a(lf param0) {
        param0.f(0);
    }

    final synchronized void c(sl param0) {
        if (param0.field_j != null) {
          if ((Object) (Object) param0.field_j != this) {
            throw new RuntimeException();
          } else {
            this.e();
            this.b(param0);
            return;
          }
        } else {
          return;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        sl var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((uh) this).field_o >= 0) {
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
                    if (((uh) this).field_p + param0 >= ((uh) this).field_o) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((uh) this).field_p = ((uh) this).field_p + param0;
                    this.b(param0);
                    return;
                }
                case 4: {
                    var2 = ((uh) this).field_o - ((uh) this).field_p;
                    this.b(var2);
                    param0 = param0 - var2;
                    ((uh) this).field_p = ((uh) this).field_p + var2;
                    this.e();
                    var3 = (sl) (Object) ((uh) this).field_q.b(0);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((uh) this);
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
                        var3.field_k = 0;
                        this.b(var3);
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
                        var3.field_k = var5;
                        this.a(var3.field_e, var3);
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

    final lf c() {
        return (lf) (Object) ((uh) this).field_n.b(0);
    }

    final synchronized void b(lf param0) {
        ((uh) this).field_n.b((byte) 68, (q) (Object) param0);
    }

    private final void a(lf param0, int param1) {
        if (param1 > 0) {
            param0 = (lf) (Object) qc.a(param1, (byte) -112, param0);
        }
        ((uh) this).b(param0);
    }

    final void a(gg param0, int param1, int param2, int param3) {
        this.a((lf) (Object) nj.a(param0, param1, param2), param3);
    }

    private final void b(sl param0) {
        param0.f(0);
        param0.a();
        param0.field_j = null;
        q var2 = ((uh) this).field_q.field_b.field_e;
        if (var2 == ((uh) this).field_q.field_b) {
            ((uh) this).field_o = -1;
        } else {
            ((uh) this).field_o = ((sl) (Object) var2).field_k;
        }
    }

    final lf b() {
        return (lf) (Object) ((uh) this).field_n.f(-24059);
    }

    final void a(gg param0, int param1, int param2) {
        ((uh) this).b((lf) (Object) nj.a(param0, param1, param2));
    }

    private final void c(int[] param0, int param1, int param2) {
        lf var4 = (lf) (Object) ((uh) this).field_n.b(0);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (lf) (Object) ((uh) this).field_n.f(-24059);
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        sl var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((uh) this).field_o >= 0) {
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
                    if (((uh) this).field_p + param2 >= ((uh) this).field_o) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((uh) this).field_p = ((uh) this).field_p + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((uh) this).field_o - ((uh) this).field_p;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((uh) this).field_p = ((uh) this).field_p + var4;
                    this.e();
                    var5 = (sl) (Object) ((uh) this).field_q.b(0);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((uh) this);
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
                        var5.field_k = 0;
                        this.b(var5);
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
                        var5.field_k = var7;
                        this.a(var5.field_e, var5);
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

    private final void b(int param0) {
        lf var2 = (lf) (Object) ((uh) this).field_n.b(0);
        while (var2 != null) {
            var2.a(param0);
            var2 = (lf) (Object) ((uh) this).field_n.f(-24059);
        }
    }

    public uh() {
        ((uh) this).field_n = new ei();
        ((uh) this).field_q = new ei();
        ((uh) this).field_o = -1;
        ((uh) this).field_p = 0;
    }
}
