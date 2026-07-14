/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ck implements Runnable {
    volatile df[] field_e;
    ka field_d;
    static int[][] field_h;
    volatile boolean field_a;
    volatile boolean field_c;
    static rb field_g;
    static String field_b;
    static int field_f;

    public final void run() {
        int var1_int = 0;
        df var2 = null;
        int var4 = StarCannon.field_A;
        ((ck) this).field_c = true;
        try {
            while (!((ck) this).field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((ck) this).field_e[var1_int];
                    if (var2 != null) {
                        var2.d();
                    }
                }
                uc.a(-94, 10L);
                ea.a((Object) null, 105, ((ck) this).field_d);
            }
        } catch (Exception exception) {
            Object var5 = null;
            hc.a((Throwable) (Object) exception, (String) null, (byte) 99);
        } finally {
            ((ck) this).field_c = false;
        }
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            rb var2 = null;
            int stackIn_16_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_38_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_37_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if ((jh.field_b.field_p ^ -1) <= -5) {
                            statePc = 2;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (-1 == jh.field_b.field_d) {
                            statePc = 4;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 3;
                    }
                    case 5: {
                        if ((jh.field_b.field_d ^ -1) != 1) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return 4;
                    }
                    case 7: {
                        return 1;
                    }
                    case 8: {
                        try {
                            if (0 != bg.field_a) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            bj.field_d = ij.field_f.a(va.field_s, 90, md.field_b);
                            bg.field_a = bg.field_a + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (param0 >= 124) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            field_h = null;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (bg.field_a != 1) {
                                statePc = 20;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (2 == bj.field_d.field_b) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = ej.a(2, -1);
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0;
                    }
                    case 17: {
                        try {
                            if (-2 == (bj.field_d.field_b ^ -1)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            bg.field_a = bg.field_a + 1;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (bg.field_a == 2) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ok.field_sb = new sb((java.net.Socket) bj.field_d.field_f, ij.field_f);
                            var2 = new rb(13);
                            oe.a(wj.field_b, 32, var2, kc.field_M, ld.field_fb);
                            var2.a(15, -122);
                            var2.c((byte) -113, ac.field_e);
                            ok.field_sb.a(0, var2.field_f, (byte) 87, 13);
                            bg.field_a = bg.field_a + 1;
                            wf.field_f = dd.b(69) + 30000L;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (bg.field_a != -4) {
                                statePc = 34;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (0 >= ok.field_sb.c(122)) {
                                statePc = 30;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var1_int = ok.field_sb.a(488852616);
                            if (-1 != var1_int) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            stackOut_27_0 = ej.a(2, var1_int);
                            stackIn_28_0 = stackOut_27_0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        return stackIn_28_0;
                    }
                    case 29: {
                        try {
                            bg.field_a = bg.field_a + 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((wf.field_f ^ -1L) > (dd.b(63) ^ -1L)) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            stackOut_32_0 = ej.a(2, -2);
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return stackIn_33_0;
                    }
                    case 34: {
                        try {
                            if (-5 != (bg.field_a ^ -1)) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            jh.field_b.a((Object) (Object) ok.field_sb, 65, bh.field_g);
                            bg.field_a = 0;
                            bj.field_d = null;
                            ok.field_sb = null;
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0;
                    }
                    case 37: {
                        try {
                            stackOut_37_0 = -1;
                            stackIn_38_0 = stackOut_37_0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return stackIn_38_0;
                    }
                    case 39: {
                        var1 = (IOException) (Object) caughtException;
                        return ej.a(2, -3);
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

    final static int b(byte param0) {
        int var1 = -97 / ((param0 - 32) / 58);
        return ie.field_D;
    }

    public static void a(boolean param0) {
        if (param0) {
            int discarded$0 = ck.b((byte) 79);
        }
        field_g = null;
        field_h = null;
        field_b = null;
    }

    ck() {
        ((ck) this).field_e = new df[2];
        ((ck) this).field_a = false;
        ((ck) this).field_c = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new rb(256);
        field_b = "Next";
        field_f = 0;
    }
}
