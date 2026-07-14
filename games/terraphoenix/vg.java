/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg extends lj {
    private jj field_m;
    private jj field_o;
    private int field_n;
    private int field_l;

    final lj a() {
        return (lj) (Object) ((vg) this).field_m.e((byte) -119);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        we var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vg) this).field_l >= 0) {
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
                    if (((vg) this).field_n + param0 >= ((vg) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vg) this).field_n = ((vg) this).field_n + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((vg) this).field_l - ((vg) this).field_n;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((vg) this).field_n = ((vg) this).field_n + var2;
                    this.e();
                    var3 = (we) (Object) ((vg) this).field_o.d(9272);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((vg) this);
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
                        var3.field_h = 0;
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
                        var3.field_h = var5;
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

    private final void a(uf param0, we param1) {
        L0: while (true) {
          if (param0 != ((vg) this).field_o.field_a) {
            if (((we) (Object) param0).field_h <= param1.field_h) {
              param0 = param0.field_d;
              continue L0;
            } else {
              ha.a(127, param0, (uf) (Object) param1);
              ((vg) this).field_l = ((we) (Object) ((vg) this).field_o.field_a.field_d).field_h;
              return;
            }
          } else {
            ha.a(127, param0, (uf) (Object) param1);
            ((vg) this).field_l = ((we) (Object) ((vg) this).field_o.field_a.field_d).field_h;
            return;
          }
        }
    }

    private final void e() {
        we var1 = null;
        if (((vg) this).field_n > 0) {
            var1 = (we) (Object) ((vg) this).field_o.d(9272);
            while (var1 != null) {
                var1.field_h = var1.field_h - ((vg) this).field_n;
                var1 = (we) (Object) ((vg) this).field_o.e((byte) -119);
            }
            ((vg) this).field_l = ((vg) this).field_l - ((vg) this).field_n;
            ((vg) this).field_n = 0;
        }
    }

    private final void a(we param0) {
        param0.b((byte) 12);
        param0.a();
        uf var2 = ((vg) this).field_o.field_a.field_d;
        if (var2 == ((vg) this).field_o.field_a) {
            ((vg) this).field_l = -1;
        } else {
            ((vg) this).field_l = ((we) (Object) var2).field_h;
        }
    }

    final synchronized void a(lj param0) {
        ((vg) this).field_m.a((uf) (Object) param0, (byte) 0);
    }

    final int d() {
        return 0;
    }

    private final void c(int[] param0, int param1, int param2) {
        lj var4 = (lj) (Object) ((vg) this).field_m.d(9272);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (lj) (Object) ((vg) this).field_m.e((byte) -119);
        }
    }

    final void a(gg param0, int param1, int param2) {
        ((vg) this).a((lj) (Object) lh.a(param0, param1, param2));
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        we var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((vg) this).field_l >= 0) {
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
                    if (((vg) this).field_n + param2 >= ((vg) this).field_l) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((vg) this).field_n = ((vg) this).field_n + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((vg) this).field_l - ((vg) this).field_n;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((vg) this).field_n = ((vg) this).field_n + var4;
                    this.e();
                    var5 = (we) (Object) ((vg) this).field_o.d(9272);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((vg) this);
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
                        var5.field_h = 0;
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
                        var5.field_h = var7;
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

    private final void c(int param0) {
        lj var2 = (lj) (Object) ((vg) this).field_m.d(9272);
        while (var2 != null) {
            var2.a(param0);
            var2 = (lj) (Object) ((vg) this).field_m.e((byte) -119);
        }
    }

    final lj c() {
        return (lj) (Object) ((vg) this).field_m.d(9272);
    }

    public vg() {
        ((vg) this).field_m = new jj();
        ((vg) this).field_o = new jj();
        ((vg) this).field_n = 0;
        ((vg) this).field_l = -1;
    }
}
