/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class lc implements Iterable {
    static hd field_g;
    private int field_d;
    int field_c;
    private wf field_e;
    private wf field_f;
    wf[] field_a;
    static ej field_b;

    final wf a(long param0, byte param1) {
        wf var5 = null;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        wf var4 = ((lc) this).field_a[(int)((long)(((lc) this).field_c + -1) & param0)];
        ((lc) this).field_f = ((wf) var4).field_a;
        while (((lc) this).field_f != var4) {
            if (((lc) this).field_f.field_b == param0) {
                var5 = ((lc) this).field_f;
                ((lc) this).field_f = ((lc) this).field_f.field_a;
                return var5;
            }
            ((lc) this).field_f = ((lc) this).field_f.field_a;
        }
        ((lc) this).field_f = null;
        if (param1 > 87) {
            return null;
        }
        ((lc) this).field_c = -4;
        return null;
    }

    final static double a(kc param0, boolean param1, kc param2) {
        if (param1) {
            return 0.9309241594003604;
        }
        double var3 = -((kc) param0).field_a + ((kc) param2).field_a;
        double var5 = -((kc) param0).field_b + ((kc) param2).field_b;
        return var3 * var3 + var5 * var5;
    }

    public static void a(boolean param0) {
        field_g = null;
        if (!param0) {
            lc.a(false);
        }
        field_b = null;
    }

    final static gu a(int param0, java.applet.Applet param1) {
        int var4 = 0;
        gu var5 = null;
        int var6 = AceOfSkies.field_G ? 1 : 0;
        String var2 = bg.a(param1, "jagex-last-login-method", (byte) -18);
        if (var2 == null) {
            return ct.field_t;
        }
        gu[] var3 = ci.d((byte) 106);
        if (param0 != 17123) {
            return (gu) null;
        }
        for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (!(!var5.a(param0 ^ 17127, var2))) {
                return var5;
            }
        }
        return ct.field_t;
    }

    final wf b(int param0) {
        ((lc) this).field_d = param0;
        return ((lc) this).a(-71);
    }

    final static gk a(boolean param0, boolean param1, boolean param2, byte param3, int param4, int param5) {
        try {
            bl var6 = null;
            IOException var6_ref = null;
            bl var7 = null;
            fg var8 = null;
            gk stackIn_4_0 = null;
            gk stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            gk stackOut_3_0 = null;
            gk stackOut_14_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var6 = null;
                            var7 = null;
                            if (cs.field_d.field_n == null) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            eq.field_e = new gh(cs.field_d.field_n, 5200, 0);
                            cs.field_d.field_n = null;
                            var6 = new bl(255, eq.field_e, new gh(cs.field_d.field_a, 12000, 0), 2097152);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (param3 == -65) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (gk) null;
                            stackIn_4_0 = stackOut_3_0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return (gk) (Object) stackIn_4_0;
                    }
                    case 5: {
                        try {
                            if (eq.field_e != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (wb.field_i != null) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            wb.field_i = new gh[cs.field_d.field_r.length];
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (wb.field_i[param5] != null) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            wb.field_i[param5] = new gh(cs.field_d.field_r[param5], 12000, 0);
                            cs.field_d.field_r[param5] = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var7 = new bl(param5, eq.field_e, wb.field_i[param5], 2097152);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var8 = om.field_c.a((byte) -122, var6, var7, param2, param5);
                            if (!param1) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var8.c(param3 + 63);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = new gk((ip) (Object) var8, param0, param4);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return (gk) (Object) stackIn_15_0;
                    }
                    case 16: {
                        var6_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException(var6_ref.toString());
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new pe((lc) this);
    }

    final wf a(int param0) {
        wf var2_ref = null;
        wf var3 = null;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        if ((((lc) this).field_d ^ -1) < -1) {
            if (!(((lc) this).field_e == ((lc) this).field_a[((lc) this).field_d - 1])) {
                var2_ref = ((lc) this).field_e;
                ((lc) this).field_e = ((wf) var2_ref).field_a;
                return var2_ref;
            }
        }
        int var2 = 35 / ((param0 - 55) / 60);
        do {
            if (((lc) this).field_d >= ((lc) this).field_c) {
                return null;
            }
            ((lc) this).field_d = ((lc) this).field_d + 1;
            var3 = ((lc) this).field_a[((lc) this).field_d].field_a;
        } while (var3 == ((lc) this).field_a[-1 + ((lc) this).field_d]);
        ((lc) this).field_e = ((wf) var3).field_a;
        return var3;
    }

    final void a(int param0, wf param1, long param2) {
        if (!(((wf) param1).field_c == null)) {
            param1.c(-125);
        }
        wf var5 = ((lc) this).field_a[(int)(param2 & (long)(param0 + ((lc) this).field_c))];
        param1.field_a = var5;
        param1.field_c = ((wf) var5).field_c;
        ((wf) param1).field_c.field_a = param1;
        ((wf) param1).field_a.field_c = param1;
        param1.field_b = param2;
    }

    lc(int param0) {
        int var2 = 0;
        wf var3 = null;
        ((lc) this).field_d = 0;
        ((lc) this).field_a = new wf[param0];
        ((lc) this).field_c = param0;
        for (var2 = 0; param0 > var2; var2++) {
            var3 = new wf();
            ((lc) this).field_a[var2] = new wf();
            var3.field_a = (wf) var3;
            var3.field_c = (wf) var3;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new hd(4);
        field_b = new ej(14, 0, 4, 1);
    }
}
