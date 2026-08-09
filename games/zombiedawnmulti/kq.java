/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends java.awt.Canvas {
    private java.awt.Component field_a;
    static byte[] field_b;

    final static void a(int param0) {
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var5 = nn.field_c;
                        var1 = var5;
                        var2 = param0;
                        var3 = var5.length;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        if (var2 >= var3) {
                            statePc = 9;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        incrementValue$8 = var2;
                        var2++;
                        var5[incrementValue$8] = 0;
                        incrementValue$9 = var2;
                        var2++;
                        var5[incrementValue$9] = 0;
                        incrementValue$10 = var2;
                        var2++;
                        var5[incrementValue$10] = 0;
                        incrementValue$11 = var2;
                        var2++;
                        var5[incrementValue$11] = 0;
                        incrementValue$12 = var2;
                        var2++;
                        var5[incrementValue$12] = 0;
                        incrementValue$13 = var2;
                        var2++;
                        var5[incrementValue$13] = 0;
                        incrementValue$14 = var2;
                        var2++;
                        var5[incrementValue$14] = 0;
                        incrementValue$15 = var2;
                        var2++;
                        var5[incrementValue$15] = 0;
                        if (var4 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        return;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var4 == 0) {
                            statePc = 2;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var1_ref = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) var1_ref), "kq.A(" + param0 + ')');
                }
                case 9: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    kq(java.awt.Component param0) {
        try {
            this.field_a = param0;
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kq.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 != 60) {
            field_b = (byte[]) null;
        }
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kq.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        try {
            this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "kq.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
