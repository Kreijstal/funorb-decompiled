/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qkb extends f {
    private ij field_h;
    private ij field_k;
    private int field_j;
    private int field_i;

    final int d() {
        return 0;
    }

    private final void e() {
        wka var1 = null;
        if (((qkb) this).field_j > 0) {
            var1 = (wka) (Object) ((qkb) this).field_k.d(0);
            while (var1 != null) {
                var1.field_d = var1.field_d - ((qkb) this).field_j;
                var1 = (wka) (Object) ((qkb) this).field_k.a((byte) 59);
            }
            ((qkb) this).field_i = ((qkb) this).field_i - ((qkb) this).field_j;
            ((qkb) this).field_j = 0;
        }
    }

    final f a() {
        return (f) (Object) ((qkb) this).field_h.a((byte) 111);
    }

    final f c() {
        return (f) (Object) ((qkb) this).field_h.d(0);
    }

    private final void a(wka param0) {
        param0.b(-3846);
        param0.a();
        ksa var2 = ((qkb) this).field_k.field_a.field_c;
        if (var2 == ((qkb) this).field_k.field_a) {
            ((qkb) this).field_i = -1;
        } else {
            ((qkb) this).field_i = ((wka) (Object) var2).field_d;
        }
    }

    final synchronized void b(f param0) {
        ((qkb) this).field_h.a((ksa) (Object) param0, (byte) -55);
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        wka var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((qkb) this).field_i >= 0) {
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
                    if (((qkb) this).field_j + param2 >= ((qkb) this).field_i) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((qkb) this).field_j = ((qkb) this).field_j + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((qkb) this).field_i - ((qkb) this).field_j;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((qkb) this).field_j = ((qkb) this).field_j + var4;
                    this.e();
                    var5 = (wka) (Object) ((qkb) this).field_k.d(0);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((qkb) this);
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
                        var5.field_d = 0;
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
                        var5.field_d = var7;
                        this.a(var5.field_c, var5);
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

    private final void c(int[] param0, int param1, int param2) {
        f var4 = (f) (Object) ((qkb) this).field_h.d(0);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (f) (Object) ((qkb) this).field_h.a((byte) 60);
        }
    }

    final synchronized void a(f param0) {
        param0.b(-3846);
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        wka var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((qkb) this).field_i >= 0) {
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
                    if (((qkb) this).field_j + param0 >= ((qkb) this).field_i) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((qkb) this).field_j = ((qkb) this).field_j + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((qkb) this).field_i - ((qkb) this).field_j;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((qkb) this).field_j = ((qkb) this).field_j + var2;
                    this.e();
                    var3 = (wka) (Object) ((qkb) this).field_k.d(0);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((qkb) this);
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
                        var3.field_d = 0;
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
                        var3.field_d = var5;
                        this.a(var3.field_c, var3);
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

    private final void c(int param0) {
        f var2 = (f) (Object) ((qkb) this).field_h.d(0);
        while (var2 != null) {
            var2.a(param0);
            var2 = (f) (Object) ((qkb) this).field_h.a((byte) 59);
        }
    }

    private final void a(ksa param0, wka param1) {
        L0: while (true) {
          if (param0 != ((qkb) this).field_k.field_a) {
            if (((wka) (Object) param0).field_d <= param1.field_d) {
              param0 = param0.field_c;
              continue L0;
            } else {
              al.a((ksa) (Object) param1, param0, 2);
              ((qkb) this).field_i = ((wka) (Object) ((qkb) this).field_k.field_a.field_c).field_d;
              return;
            }
          } else {
            al.a((ksa) (Object) param1, param0, 2);
            ((qkb) this).field_i = ((wka) (Object) ((qkb) this).field_k.field_a.field_c).field_d;
            return;
          }
        }
    }

    public qkb() {
        ((qkb) this).field_h = new ij();
        ((qkb) this).field_k = new ij();
        ((qkb) this).field_i = -1;
        ((qkb) this).field_j = 0;
    }
}
