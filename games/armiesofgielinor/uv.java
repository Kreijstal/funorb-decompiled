/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uv extends hn {
    private at field_r;
    private at field_q;
    private int field_o;
    private int field_p;

    final int c() {
        return 0;
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        bf var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((uv) this).field_p >= 0) {
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
                    if (((uv) this).field_o + param0 >= ((uv) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((uv) this).field_o = ((uv) this).field_o + param0;
                    this.e(param0);
                    return;
                }
                case 4: {
                    var2 = ((uv) this).field_p - ((uv) this).field_o;
                    this.e(var2);
                    param0 = param0 - var2;
                    ((uv) this).field_o = ((uv) this).field_o + var2;
                    this.e();
                    var3 = (bf) (Object) ((uv) this).field_q.e((byte) 110);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((uv) this);
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
                        var3.field_k = var5;
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

    final synchronized void a(hn param0) {
        ((uv) this).field_r.a(750, (tc) (Object) param0);
    }

    private final void a(bf param0) {
        param0.d(103);
        param0.a();
        tc var2 = ((uv) this).field_q.field_d.field_b;
        if (var2 == ((uv) this).field_q.field_d) {
            ((uv) this).field_p = -1;
        } else {
            ((uv) this).field_p = ((bf) (Object) var2).field_k;
        }
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        bf var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((uv) this).field_p >= 0) {
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
                    if (((uv) this).field_o + param2 >= ((uv) this).field_p) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((uv) this).field_o = ((uv) this).field_o + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((uv) this).field_p - ((uv) this).field_o;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((uv) this).field_o = ((uv) this).field_o + var4;
                    this.e();
                    var5 = (bf) (Object) ((uv) this).field_q.e((byte) 127);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((uv) this);
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
                        var5.field_k = var7;
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

    private final void c(int[] param0, int param1, int param2) {
        hn var4 = (hn) (Object) ((uv) this).field_r.e((byte) 118);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (hn) (Object) ((uv) this).field_r.a((byte) 123);
        }
    }

    final hn b() {
        return (hn) (Object) ((uv) this).field_r.a((byte) 123);
    }

    final hn a() {
        return (hn) (Object) ((uv) this).field_r.e((byte) 126);
    }

    private final void e(int param0) {
        hn var2 = (hn) (Object) ((uv) this).field_r.e((byte) 103);
        while (var2 != null) {
            var2.a(param0);
            var2 = (hn) (Object) ((uv) this).field_r.a((byte) 123);
        }
    }

    private final void e() {
        bf var1 = null;
        if (((uv) this).field_o > 0) {
            var1 = (bf) (Object) ((uv) this).field_q.e((byte) 111);
            while (var1 != null) {
                var1.field_k = var1.field_k - ((uv) this).field_o;
                var1 = (bf) (Object) ((uv) this).field_q.a((byte) 123);
            }
            ((uv) this).field_p = ((uv) this).field_p - ((uv) this).field_o;
            ((uv) this).field_o = 0;
        }
    }

    private final void a(tc param0, bf param1) {
        L0: while (true) {
          if (param0 != ((uv) this).field_q.field_d) {
            if (((bf) (Object) param0).field_k <= param1.field_k) {
              param0 = param0.field_b;
              continue L0;
            } else {
              fj.a((byte) -123, (tc) (Object) param1, param0);
              ((uv) this).field_p = ((bf) (Object) ((uv) this).field_q.field_d.field_b).field_k;
              return;
            }
          } else {
            fj.a((byte) -123, (tc) (Object) param1, param0);
            ((uv) this).field_p = ((bf) (Object) ((uv) this).field_q.field_d.field_b).field_k;
            return;
          }
        }
    }

    public uv() {
        ((uv) this).field_r = new at();
        ((uv) this).field_q = new at();
        ((uv) this).field_o = 0;
        ((uv) this).field_p = -1;
    }
}
