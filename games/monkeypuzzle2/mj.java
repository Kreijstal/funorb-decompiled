/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mj extends fh {
    private pj field_l;
    private pj field_i;
    private int field_k;
    private int field_j;

    final fh b() {
        return (fh) (Object) ((mj) this).field_l.d((byte) 63);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        og var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((mj) this).field_j >= 0) {
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
                    if (((mj) this).field_k + param2 >= ((mj) this).field_j) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((mj) this).field_k = ((mj) this).field_k + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((mj) this).field_j - ((mj) this).field_k;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((mj) this).field_k = ((mj) this).field_k + var4;
                    this.e();
                    var5 = (og) (Object) ((mj) this).field_i.a((byte) -117);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((mj) this);
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

    final fh a() {
        return (fh) (Object) ((mj) this).field_l.a((byte) -117);
    }

    final int d() {
        return 0;
    }

    final synchronized void b(fh param0) {
        param0.c(-19822);
    }

    private final void e(int param0) {
        fh var2 = (fh) (Object) ((mj) this).field_l.a((byte) -117);
        while (var2 != null) {
            var2.a(param0);
            var2 = (fh) (Object) ((mj) this).field_l.d((byte) 63);
        }
    }

    final synchronized void b(og param0) {
        if (param0.field_f != null) {
          if ((Object) (Object) param0.field_f != this) {
            throw new RuntimeException();
          } else {
            this.e();
            this.a(param0);
            return;
          }
        } else {
          return;
        }
    }

    private final void c(int[] param0, int param1, int param2) {
        fh var4 = (fh) (Object) ((mj) this).field_l.a((byte) -117);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (fh) (Object) ((mj) this).field_l.d((byte) 63);
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        og var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((mj) this).field_j >= 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    this.e(param0);
                    return;
                }
                case 2: {
                    if (((mj) this).field_k + param0 >= ((mj) this).field_j) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((mj) this).field_k = ((mj) this).field_k + param0;
                    this.e(param0);
                    return;
                }
                case 4: {
                    var2 = ((mj) this).field_j - ((mj) this).field_k;
                    this.e(var2);
                    param0 = param0 - var2;
                    ((mj) this).field_k = ((mj) this).field_k + var2;
                    this.e();
                    var3 = (og) (Object) ((mj) this).field_i.a((byte) -117);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((mj) this);
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

    private final void a(og param0) {
        param0.c(-19822);
        param0.a();
        param0.field_f = null;
        ug var2 = ((mj) this).field_i.field_f.field_d;
        if (var2 == ((mj) this).field_i.field_f) {
            ((mj) this).field_j = -1;
        } else {
            ((mj) this).field_j = ((og) (Object) var2).field_e;
        }
    }

    final synchronized void c(og param0) {
        if (param0.field_f != null) {
          throw new RuntimeException();
        } else {
          this.e();
          param0.field_f = (mj) this;
          param0.b();
          this.a(((mj) this).field_i.field_f.field_d, param0);
          return;
        }
    }

    private final void e() {
        og var1 = null;
        if (((mj) this).field_k > 0) {
            var1 = (og) (Object) ((mj) this).field_i.a((byte) -117);
            while (var1 != null) {
                var1.field_e = var1.field_e - ((mj) this).field_k;
                var1 = (og) (Object) ((mj) this).field_i.d((byte) 63);
            }
            ((mj) this).field_j = ((mj) this).field_j - ((mj) this).field_k;
            ((mj) this).field_k = 0;
        }
    }

    final synchronized void a(fh param0) {
        ((mj) this).field_l.a((ug) (Object) param0, (byte) 13);
    }

    private final void a(ug param0, og param1) {
        L0: while (true) {
          if (param0 != ((mj) this).field_i.field_f) {
            if (((og) (Object) param0).field_e <= param1.field_e) {
              param0 = param0.field_d;
              continue L0;
            } else {
              ja.a(param0, (ug) (Object) param1, -123);
              ((mj) this).field_j = ((og) (Object) ((mj) this).field_i.field_f.field_d).field_e;
              return;
            }
          } else {
            ja.a(param0, (ug) (Object) param1, -123);
            ((mj) this).field_j = ((og) (Object) ((mj) this).field_i.field_f.field_d).field_e;
            return;
          }
        }
    }

    public mj() {
        ((mj) this).field_l = new pj();
        ((mj) this).field_i = new pj();
        ((mj) this).field_j = -1;
        ((mj) this).field_k = 0;
    }
}
