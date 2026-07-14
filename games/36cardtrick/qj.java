/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj extends je {
    private bk field_n;
    private bk field_m;
    private int field_k;
    private int field_l;

    private final void d(int param0) {
        je var2 = (je) ((qj) this).field_n.a((byte) 74);
        while (var2 != null) {
            var2.a(param0);
            var2 = (je) ((qj) this).field_n.b((byte) -121);
        }
    }

    final synchronized void b(sf param0) {
        if (((sf) param0).field_h != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_h = (qj) this;
          param0.b();
          this.a(((qj) this).field_m.field_a.field_d, param0);
          return;
        }
    }

    final je a() {
        return (je) ((qj) this).field_n.b((byte) -95);
    }

    final synchronized void a(sf param0) {
        if (((sf) param0).field_h != null) {
          if ((Object) (Object) ((sf) param0).field_h != this) {
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

    final synchronized void b(je param0) {
        ((qj) this).field_n.a(-126, (qb) (Object) param0);
    }

    private final void c(int[] param0, int param1, int param2) {
        je var4 = (je) ((qj) this).field_n.a((byte) 74);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (je) ((qj) this).field_n.b((byte) -95);
        }
    }

    private final void e() {
        sf var1 = null;
        if (((qj) this).field_k > 0) {
            var1 = (sf) ((qj) this).field_m.a((byte) 74);
            while (var1 != null) {
                ((sf) var1).field_g = ((sf) var1).field_g - ((qj) this).field_k;
                var1 = (sf) ((qj) this).field_m.b((byte) -122);
            }
            ((qj) this).field_l = ((qj) this).field_l - ((qj) this).field_k;
            ((qj) this).field_k = 0;
        }
    }

    private final void c(sf param0) {
        param0.c(107);
        param0.a();
        param0.field_h = null;
        qb var2 = ((qj) this).field_m.field_a.field_d;
        if (var2 == ((qj) this).field_m.field_a) {
            ((qj) this).field_l = -1;
        } else {
            ((qj) this).field_l = ((sf) var2).field_g;
        }
    }

    final int c() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        sf var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((qj) this).field_l >= 0) {
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
                    if (((qj) this).field_k + param0 >= ((qj) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((qj) this).field_k = ((qj) this).field_k + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((qj) this).field_l - ((qj) this).field_k;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((qj) this).field_k = ((qj) this).field_k + var2;
                    this.e();
                    var3 = (sf) ((qj) this).field_m.a((byte) 74);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((qj) this);
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
                        var3.field_g = var5;
                        this.a(((sf) var3).field_d, var3);
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

    private final void a(qb param0, sf param1) {
        L0: while (true) {
          if (param0 != ((qj) this).field_m.field_a) {
            if (((sf) param0).field_g <= ((sf) param1).field_g) {
              param0 = ((qb) param0).field_d;
              continue L0;
            } else {
              ce.a(param0, 0, (qb) (Object) param1);
              ((qj) this).field_l = ((sf) ((qj) this).field_m.field_a.field_d).field_g;
              return;
            }
          } else {
            ce.a(param0, 0, (qb) (Object) param1);
            ((qj) this).field_l = ((sf) ((qj) this).field_m.field_a.field_d).field_g;
            return;
          }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        sf var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((qj) this).field_l >= 0) {
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
                    if (((qj) this).field_k + param2 >= ((qj) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((qj) this).field_k = ((qj) this).field_k + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((qj) this).field_l - ((qj) this).field_k;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((qj) this).field_k = ((qj) this).field_k + var4;
                    this.e();
                    var5 = (sf) ((qj) this).field_m.a((byte) 74);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((qj) this);
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
                        var5.field_g = var7;
                        this.a(((sf) var5).field_d, var5);
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

    final synchronized void a(je param0) {
        param0.c(104);
    }

    public qj() {
        ((qj) this).field_n = new bk();
        ((qj) this).field_m = new bk();
        ((qj) this).field_k = 0;
        ((qj) this).field_l = -1;
    }

    final je b() {
        return (je) ((qj) this).field_n.a((byte) 74);
    }
}
