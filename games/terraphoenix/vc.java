/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class vc {
    static ci field_e;
    static jj field_d;
    static jj field_g;
    static String field_b;
    static fh field_c;
    static ud field_f;
    static ec field_a;

    abstract void b(int param0);

    final int a(long param0, int param1) {
        if (param1 >= -45) {
            field_a = null;
        }
        long var4 = ((vc) this).a(120);
        if (!(var4 <= 0L)) {
            gi.a((byte) -93, var4);
        }
        return ((vc) this).a(0, param0);
    }

    abstract long a(int param0);

    abstract int a(int param0, long param1);

    public static void c(int param0) {
        field_d = null;
        field_c = null;
        field_f = null;
        if (param0 != 0) {
            boolean discarded$0 = vc.a(83, 26);
        }
        field_e = null;
        field_b = null;
        field_g = null;
        field_a = null;
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 <= -97) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_b = null;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (mk.field_j.field_k >= param1) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return true;
                    }
                    case 5: {
                        if (null != ig.field_e) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return false;
                    }
                    case 7: {
                        try {
                            var2_int = ig.field_e.a(0);
                            if (-1 > (var2_int ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (param1 - mk.field_j.field_k >= var2_int) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2_int = param1 - mk.field_j.field_k;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ig.field_e.a(mk.field_j.field_i, var2_int, mk.field_j.field_k, (byte) 114);
                            dm.field_c = ll.a(1000);
                            mk.field_j.field_k = mk.field_j.field_k + var2_int;
                            if (param1 > mk.field_j.field_k) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            mk.field_j.field_k = 0;
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    case 17: {
                        try {
                            if (0 > var2_int) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (30000L >= ce.b(1)) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            gb.g(-17464);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            gb.g(-17464);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return false;
                    }
                    case 23: {
                        var2 = (IOException) (Object) caughtException;
                        gb.g(-17464);
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        return false;
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

    final static void a(boolean param0) {
        int var3 = 0;
        int var4 = Terraphoenix.field_V;
        ci var1 = new ci(540, 140);
        il.a(1, var1);
        ob.b();
        l.a();
        if (!param0) {
            return;
        }
        kf.field_f = 0;
        af.d(-2766);
        ci var2 = var1.d();
        for (var3 = 0; (var3 ^ -1) > -16; var3++) {
            var2.b(-2, -2, 16777215);
            l.e(4, 4, 0, 0, 540, 140);
        }
        s.field_a.a();
        var1.f(0, 0);
        ij.a(!param0 ? true : false);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new jj();
        field_b = "L-TAW";
        field_g = new jj();
    }
}
