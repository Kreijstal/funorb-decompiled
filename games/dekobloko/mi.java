/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends ol {
    private vj field_t;
    private vj field_u;
    private int field_r;
    private int field_s;

    private final void e() {
        rh var2 = null;
        if (((mi) this).field_s > 0) {
            var2 = (rh) (Object) ((mi) this).field_u.c((byte) -59);
            while (var2 != null) {
                var2.field_o = var2.field_o - ((mi) this).field_s;
                rh var1 = (rh) (Object) ((mi) this).field_u.d(true);
            }
            ((mi) this).field_r = ((mi) this).field_r - ((mi) this).field_s;
            ((mi) this).field_s = 0;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        rh var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((mi) this).field_r >= 0) {
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
                    if (((mi) this).field_s + param2 >= ((mi) this).field_r) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((mi) this).field_s = ((mi) this).field_s + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((mi) this).field_r - ((mi) this).field_s;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((mi) this).field_s = ((mi) this).field_s + var4;
                    this.e();
                    var5 = (rh) (Object) ((mi) this).field_u.c((byte) -109);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((mi) this);
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
                        var5.field_o = 0;
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
                        var5.field_o = var7;
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

    private final void c(int param0) {
        ol var3 = (ol) (Object) ((mi) this).field_t.c((byte) -69);
        while (var3 != null) {
            var3.a(param0);
            ol var2 = (ol) (Object) ((mi) this).field_t.d(true);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        rh var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((mi) this).field_r >= 0) {
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
                    if (((mi) this).field_s + param0 >= ((mi) this).field_r) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((mi) this).field_s = ((mi) this).field_s + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((mi) this).field_r - ((mi) this).field_s;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((mi) this).field_s = ((mi) this).field_s + var2;
                    this.e();
                    var3 = (rh) (Object) ((mi) this).field_u.c((byte) -54);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((mi) this);
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
                        var3.field_o = 0;
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
                        var3.field_o = var5;
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

    final synchronized void b(ol param0) {
        param0.b((byte) 108);
    }

    final ol c() {
        return (ol) (Object) ((mi) this).field_t.d(true);
    }

    final void a(ud param0, int param1, int param2, int param3) {
        ((mi) this).a((ol) (Object) ei.a(param0, param1, param2, param3));
    }

    final synchronized void a(ol param0) {
        ((mi) this).field_t.b((bh) (Object) param0, 7143);
    }

    private final void b(rh param0) {
        param0.b((byte) 114);
        param0.a();
        param0.field_n = null;
        bh var2 = ((mi) this).field_u.field_c.field_b;
        if (var2 == ((mi) this).field_u.field_c) {
            ((mi) this).field_r = -1;
        } else {
            ((mi) this).field_r = ((rh) (Object) var2).field_o;
        }
    }

    final synchronized void c(rh param0) {
        if (param0.field_n != null) {
          if ((Object) (Object) param0.field_n != this) {
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

    final int a() {
        return 0;
    }

    final synchronized void a(rh param0) {
        if (param0.field_n != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_n = (mi) this;
          param0.b();
          this.a(((mi) this).field_u.field_c.field_b, param0);
          return;
        }
    }

    private final void a(bh param0, rh param1) {
        L0: while (true) {
          if (param0 != ((mi) this).field_u.field_c) {
            if (((rh) (Object) param0).field_o <= param1.field_o) {
              param0 = param0.field_b;
              continue L0;
            } else {
              fm.a((byte) 10, (bh) (Object) param1, param0);
              ((mi) this).field_r = ((rh) (Object) ((mi) this).field_u.field_c.field_b).field_o;
              return;
            }
          } else {
            fm.a((byte) 10, (bh) (Object) param1, param0);
            ((mi) this).field_r = ((rh) (Object) ((mi) this).field_u.field_c.field_b).field_o;
            return;
          }
        }
    }

    final ol d() {
        return (ol) (Object) ((mi) this).field_t.c((byte) 126);
    }

    private final void c(int[] param0, int param1, int param2) {
        ol var5 = (ol) (Object) ((mi) this).field_t.c((byte) -106);
        while (var5 != null) {
            var5.a(param0, param1, param2);
            ol var4 = (ol) (Object) ((mi) this).field_t.d(true);
        }
    }

    public mi() {
        ((mi) this).field_t = new vj();
        ((mi) this).field_u = new vj();
        ((mi) this).field_r = -1;
        ((mi) this).field_s = 0;
    }
}
