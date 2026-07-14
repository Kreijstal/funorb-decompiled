/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hl extends kd {
    private oj field_o;
    private oj field_r;
    private int field_q;
    private int field_p;

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        p var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((hl) this).field_q >= 0) {
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
                    if (((hl) this).field_p + param2 >= ((hl) this).field_q) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((hl) this).field_p = ((hl) this).field_p + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((hl) this).field_q - ((hl) this).field_p;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((hl) this).field_p = ((hl) this).field_p + var4;
                    this.e();
                    var5 = (p) (Object) ((hl) this).field_r.b(-102);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((hl) this);
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
                        var5.field_l = 0;
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
                        var5.field_l = var7;
                        this.a(var5.field_g, var5);
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
        kd var2 = (kd) (Object) ((hl) this).field_o.b(-92);
        while (var2 != null) {
            var2.a(param0);
            var2 = (kd) (Object) ((hl) this).field_o.b((byte) -57);
        }
    }

    final synchronized void b(p param0) {
        if (param0.field_k != null) {
          if ((Object) (Object) param0.field_k != this) {
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

    final synchronized void a(p param0) {
        if (param0.field_k != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_k = (hl) this;
          param0.b();
          this.a(((hl) this).field_r.field_d.field_g, param0);
          return;
        }
    }

    private final void e() {
        p var1 = null;
        if (((hl) this).field_p > 0) {
            var1 = (p) (Object) ((hl) this).field_r.b(-101);
            while (var1 != null) {
                var1.field_l = var1.field_l - ((hl) this).field_p;
                var1 = (p) (Object) ((hl) this).field_r.b((byte) 101);
            }
            ((hl) this).field_q = ((hl) this).field_q - ((hl) this).field_p;
            ((hl) this).field_p = 0;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        p var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((hl) this).field_q >= 0) {
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
                    if (((hl) this).field_p + param0 >= ((hl) this).field_q) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((hl) this).field_p = ((hl) this).field_p + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((hl) this).field_q - ((hl) this).field_p;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((hl) this).field_p = ((hl) this).field_p + var2;
                    this.e();
                    var3 = (p) (Object) ((hl) this).field_r.b(-115);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((hl) this);
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
                        var3.field_l = 0;
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
                        var3.field_l = var5;
                        this.a(var3.field_g, var3);
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

    final kd c() {
        return (kd) (Object) ((hl) this).field_o.b((byte) 124);
    }

    final synchronized void b(kd param0) {
        param0.c(20);
    }

    final int b() {
        return 0;
    }

    final synchronized void a(kd param0) {
        ((hl) this).field_o.a(-1, (gg) (Object) param0);
    }

    private final void c(p param0) {
        param0.c(20);
        param0.a();
        param0.field_k = null;
        gg var2 = ((hl) this).field_r.field_d.field_g;
        if (var2 == ((hl) this).field_r.field_d) {
            ((hl) this).field_q = -1;
        } else {
            ((hl) this).field_q = ((p) (Object) var2).field_l;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        kd var4 = (kd) (Object) ((hl) this).field_o.b(-81);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (kd) (Object) ((hl) this).field_o.b((byte) 77);
        }
    }

    final kd d() {
        return (kd) (Object) ((hl) this).field_o.b(-125);
    }

    private final void a(gg param0, p param1) {
        L0: while (true) {
          if (param0 != ((hl) this).field_r.field_d) {
            if (((p) (Object) param0).field_l <= param1.field_l) {
              param0 = param0.field_g;
              continue L0;
            } else {
              kk.a(103, (gg) (Object) param1, param0);
              ((hl) this).field_q = ((p) (Object) ((hl) this).field_r.field_d.field_g).field_l;
              return;
            }
          } else {
            kk.a(103, (gg) (Object) param1, param0);
            ((hl) this).field_q = ((p) (Object) ((hl) this).field_r.field_d.field_g).field_l;
            return;
          }
        }
    }

    final void a(ud param0, int param1, int param2) {
        ((hl) this).a((kd) (Object) gd.a(param0, param1, param2));
    }

    public hl() {
        ((hl) this).field_o = new oj();
        ((hl) this).field_r = new oj();
        ((hl) this).field_q = -1;
        ((hl) this).field_p = 0;
    }
}
