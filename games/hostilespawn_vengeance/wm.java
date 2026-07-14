/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends tj {
    private vl field_l;
    private vl field_o;
    private int field_n;
    private int field_m;

    private final void d(int param0) {
        tj var2 = (tj) (Object) ((wm) this).field_l.g(-48);
        while (var2 != null) {
            var2.c(param0);
            var2 = (tj) (Object) ((wm) this).field_l.a(12684);
        }
    }

    private final void e() {
        da var1 = null;
        if (((wm) this).field_n > 0) {
            var1 = (da) (Object) ((wm) this).field_o.g(-27);
            while (var1 != null) {
                var1.field_h = var1.field_h - ((wm) this).field_n;
                var1 = (da) (Object) ((wm) this).field_o.a(12684);
            }
            ((wm) this).field_m = ((wm) this).field_m - ((wm) this).field_n;
            ((wm) this).field_n = 0;
        }
    }

    final synchronized void c(int param0) {
        int var2 = 0;
        da var3 = null;
        Object var4 = null;
        int var5 = 0;
        Throwable var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((wm) this).field_m >= 0) {
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
                    if (((wm) this).field_n + param0 >= ((wm) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((wm) this).field_n = ((wm) this).field_n + param0;
                    this.d(param0);
                    return;
                }
                case 4: {
                    var2 = ((wm) this).field_m - ((wm) this).field_n;
                    this.d(var2);
                    param0 = param0 - var2;
                    ((wm) this).field_n = ((wm) this).field_n + var2;
                    this.e();
                    var3 = (da) (Object) ((wm) this).field_o.g(-76);
                    var4 = (Object) (Object) var3;
                    // monitorenter var3
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var5 = var3.a((wm) this);
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

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        da var5 = null;
        Object var6 = null;
        int var7 = 0;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((wm) this).field_m >= 0) {
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
                    if (((wm) this).field_n + param2 >= ((wm) this).field_m) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((wm) this).field_n = ((wm) this).field_n + param2;
                    this.c(param0, param1, param2);
                    return;
                }
                case 4: {
                    var4 = ((wm) this).field_m - ((wm) this).field_n;
                    this.c(param0, param1, var4);
                    param1 = param1 + var4;
                    param2 = param2 - var4;
                    ((wm) this).field_n = ((wm) this).field_n + var4;
                    this.e();
                    var5 = (da) (Object) ((wm) this).field_o.g(-69);
                    var6 = (Object) (Object) var5;
                    // monitorenter var5
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        var7 = var5.a((wm) this);
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

    final tj b() {
        return (tj) (Object) ((wm) this).field_l.a(12684);
    }

    private final void c(int[] param0, int param1, int param2) {
        tj var4 = (tj) (Object) ((wm) this).field_l.g(-15);
        while (var4 != null) {
            var4.a(param0, param1, param2);
            var4 = (tj) (Object) ((wm) this).field_l.a(12684);
        }
    }

    final synchronized void a(tj param0) {
        param0.b(-104);
    }

    final synchronized void b(tj param0) {
        ((wm) this).field_l.a((byte) -64, (am) (Object) param0);
    }

    final void a(jb param0, int param1, int param2) {
        ((wm) this).b((tj) (Object) b.a(param0, param1, param2));
    }

    final tj d() {
        return (tj) (Object) ((wm) this).field_l.g(-26);
    }

    private final void a(da param0) {
        param0.b(-62);
        param0.a();
        am var2 = ((wm) this).field_o.field_b.field_g;
        if (var2 == ((wm) this).field_o.field_b) {
            ((wm) this).field_m = -1;
        } else {
            ((wm) this).field_m = ((da) (Object) var2).field_h;
        }
    }

    private final void a(am param0, da param1) {
        L0: while (true) {
          if (param0 != ((wm) this).field_o.field_b) {
            if (((da) (Object) param0).field_h <= param1.field_h) {
              param0 = param0.field_g;
              continue L0;
            } else {
              uf.a((am) (Object) param1, param0, (byte) -78);
              ((wm) this).field_m = ((da) (Object) ((wm) this).field_o.field_b.field_g).field_h;
              return;
            }
          } else {
            uf.a((am) (Object) param1, param0, (byte) -78);
            ((wm) this).field_m = ((da) (Object) ((wm) this).field_o.field_b.field_g).field_h;
            return;
          }
        }
    }

    final int c() {
        return 0;
    }

    public wm() {
        ((wm) this).field_l = new vl();
        ((wm) this).field_o = new vl();
        ((wm) this).field_n = 0;
        ((wm) this).field_m = -1;
    }
}
