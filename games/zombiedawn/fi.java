/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi extends sp {
    private vo field_n;
    private vo field_l;
    private int field_o;
    private int field_m;

    final sp c() {
        return (sp) (Object) ((fi) this).field_n.b((byte) 26);
    }

    final synchronized void b(sp param0) {
        ((fi) this).field_n.a((le) (Object) param0, 97);
    }

    private final void a(le param0, bc param1) {
        L0: while (true) {
          if (param0 != ((fi) this).field_l.field_b) {
            if (((bc) (Object) param0).field_h <= param1.field_h) {
              param0 = param0.field_b;
              continue L0;
            } else {
              we.a(param0, 0, (le) (Object) param1);
              ((fi) this).field_m = ((bc) (Object) ((fi) this).field_l.field_b.field_b).field_h;
              return;
            }
          } else {
            we.a(param0, 0, (le) (Object) param1);
            ((fi) this).field_m = ((bc) (Object) ((fi) this).field_l.field_b.field_b).field_h;
            return;
          }
        }
    }

    final synchronized void a(int[] param0, int param1, int param2) {
        int var4 = 0;
        bc var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((fi) this).field_m >= 0) {
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
                    if (((fi) this).field_o + param2 >= ((fi) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((fi) this).field_o = ((fi) this).field_o + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((fi) this).field_m - ((fi) this).field_o;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((fi) this).field_o = ((fi) this).field_o + var4;
                    this.e();
                    var5 = (bc) (Object) ((fi) this).field_l.b((byte) 26);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((fi) this);
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

    final synchronized void a(sp param0) {
        param0.b(-27598);
    }

    private final void c(int param0) {
        sp var2 = (sp) (Object) ((fi) this).field_n.b((byte) 26);
        while (var2 != null) {
            var2.a(param0);
            var2 = (sp) (Object) ((fi) this).field_n.a(false);
        }
    }

    final sp d() {
        return (sp) (Object) ((fi) this).field_n.a(false);
    }

    private final void c(int[] param0, int param1, int param2) {
        sp var4 = (sp) (Object) ((fi) this).field_n.b((byte) 26);
        while (var4 != null) {
            var4.b(param0, param1, param2);
            var4 = (sp) (Object) ((fi) this).field_n.a(false);
        }
    }

    private final void a(bc param0) {
        param0.b(-27598);
        param0.a();
        le var2 = ((fi) this).field_l.field_b.field_b;
        if (var2 == ((fi) this).field_l.field_b) {
            ((fi) this).field_m = -1;
        } else {
            ((fi) this).field_m = ((bc) (Object) var2).field_h;
        }
    }

    final int a() {
        return 0;
    }

    private final void e() {
        bc var1 = null;
        if (((fi) this).field_o > 0) {
            var1 = (bc) (Object) ((fi) this).field_l.b((byte) 26);
            while (var1 != null) {
                var1.field_h = var1.field_h - ((fi) this).field_o;
                var1 = (bc) (Object) ((fi) this).field_l.a(false);
            }
            ((fi) this).field_m = ((fi) this).field_m - ((fi) this).field_o;
            ((fi) this).field_o = 0;
        }
    }

    final synchronized void a(int param0) {
        int var2 = 0;
        bc var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((fi) this).field_m >= 0) {
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
                    if (((fi) this).field_o + param0 >= ((fi) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((fi) this).field_o = ((fi) this).field_o + param0;
                    this.c(param0);
                    return;
                }
                case 4: {
                    var2 = ((fi) this).field_m - ((fi) this).field_o;
                    this.c(var2);
                    param0 = param0 - var2;
                    ((fi) this).field_o = ((fi) this).field_o + var2;
                    this.e();
                    var3 = (bc) (Object) ((fi) this).field_l.b((byte) 26);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((fi) this);
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

    public fi() {
        ((fi) this).field_n = new vo();
        ((fi) this).field_l = new vo();
        ((fi) this).field_o = 0;
        ((fi) this).field_m = -1;
    }
}
