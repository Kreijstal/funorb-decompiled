/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class me extends df implements vb {
    static vn field_O;
    private String field_J;
    static String field_Q;
    private ed field_G;
    static String field_R;
    static String field_N;
    static String field_E;
    static boolean field_C;
    private dj field_D;
    private int field_K;
    static String[] field_L;
    static String field_P;
    static int[] field_H;
    private int[] field_S;
    private ag[] field_M;
    static int field_I;

    me(ed param0, dj param1, String param2) {
        super(0, 0, 288, 0, (pf) null);
        ((me) this).field_K = 0;
        ((me) this).field_D = param1;
        ((me) this).field_J = param2;
        ((me) this).field_G = param0;
        int var4 = ((me) this).field_J == null ? 0 : ((me) this).field_D.a(((me) this).field_J, 260, ((me) this).field_D.field_C);
        ((me) this).a(22 - -var4, 0, 288, 0, -51);
    }

    final void a(String param0, byte param1, int param2) {
        int var4 = ((me) this).field_K;
        this.a(-84, 1 + var4);
        ((me) this).field_M[var4] = ((me) this).a(121, param0, (wc) this);
        ((me) this).field_S[var4] = param2;
        int var5 = 64 / ((71 - param1) / 35);
    }

    final ag a(int param0, String param1, wc param2) {
        ag var4 = new ag(param1, param2);
        var4.field_r = (pf) (Object) new mm();
        if (param0 < 71) {
            return null;
        }
        int var5 = ((me) this).field_k + -2;
        ((me) this).a(((me) this).field_k + 34, 0, ((me) this).field_v, 0, -57);
        var4.a(30, var5, -14 + ((me) this).field_v, 7, -85);
        ((me) this).c(-104, (qm) (Object) var4);
        return var4;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        this.a((byte) -100, param1, param2, param3);
        if (param0 >= -52) {
            ((me) this).field_S = null;
        }
        int discarded$0 = ((me) this).field_D.a(((me) this).field_J, ((me) this).field_n + param1 + 14, ((me) this).field_j + (param3 + 10), ((me) this).field_v + -28, ((me) this).field_k, 16777215, -1, 0, 0, ((me) this).field_D.field_C);
    }

    private final void a(int param0, int param1) {
        int var6 = 0;
        int var7 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(((me) this).field_K < param1)) {
            return;
        }
        ag[] var8 = new ag[param1];
        ag[] var3 = var8;
        int[] var4 = new int[param1];
        int var5 = 114 % ((84 - param0) / 42);
        for (var6 = 0; var6 < ((me) this).field_K; var6++) {
            var8[var6] = ((me) this).field_M[var6];
            var4[var6] = ((me) this).field_S[var6];
        }
        ((me) this).field_M = var3;
        ((me) this).field_K = param1;
        ((me) this).field_S = var4;
    }

    public static void a(byte param0) {
        field_O = null;
        if (param0 <= 88) {
            Object var2 = null;
            ll discarded$0 = me.a((eg) null, -67, 92, -61);
        }
        field_L = null;
        field_E = null;
        field_Q = null;
        field_N = null;
        field_H = null;
        field_P = null;
        field_R = null;
    }

    private final static ll a(int param0) {
        ll var1 = new ll(pb.field_g, gn.field_a, hl.field_l[0], be.field_d[0], jg.field_p[0], ho.field_i[0], ln.field_I[param0], ph.field_c);
        dk.a(-18229);
        return var1;
    }

    final static eg a(int param0, boolean param1, int param2, boolean param3, int param4, boolean param5) {
        try {
            be var6 = null;
            IOException var6_ref = null;
            be var7 = null;
            tj var8 = null;
            Object stackIn_2_0 = null;
            eg stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            eg stackOut_14_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param2 == 2097152) {
                                statePc = 3;
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
                            stackOut_1_0 = null;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return (eg) (Object) stackIn_2_0;
                    }
                    case 3: {
                        try {
                            var6 = null;
                            var7 = null;
                            if (null != ri.field_g.field_q) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            bm.field_e = new sd(ri.field_g.field_q, 5200, 0);
                            ri.field_g.field_q = null;
                            var6 = new be(255, bm.field_e, new sd(ri.field_g.field_e, 12000, 0), 2097152);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (bm.field_e == null) {
                                statePc = 12;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (bb.field_b != null) {
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
                            bb.field_b = new sd[ri.field_g.field_d.length];
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
                            if (bb.field_b[param0] != null) {
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
                            bb.field_b[param0] = new sd(ri.field_g.field_d[param0], 12000, 0);
                            ri.field_g.field_d[param0] = null;
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
                            var7 = new be(param0, bm.field_e, bb.field_b[param0], 2097152);
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
                            var8 = mk.field_O.a(var6, param5, -113, var7, param0);
                            if (!param3) {
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
                            var8.g((byte) 53);
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
                            stackOut_14_0 = new eg((tl) (Object) var8, param1, param4);
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
                        return (eg) (Object) stackIn_15_0;
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

    final static ll a(eg param0, int param1, int param2, int param3) {
        if (param1 != 31027) {
            ll discarded$0 = me.a(50);
        }
        if (!fc.a(-120, param0, param2, param3)) {
            return null;
        }
        return me.a(0);
    }

    public final void a(boolean param0, int param1, int param2, int param3, ag param4) {
        int var7 = 0;
        int var8 = ArcanistsMulti.field_G ? 1 : 0;
        int var6 = 0;
        if (!param0) {
            field_H = null;
        }
        while (var6 < ((me) this).field_K) {
            if (((me) this).field_M[var6] == param4) {
                var7 = ((me) this).field_S[var6];
                if (var7 == -1) {
                    ((me) this).field_G.h(77);
                    break;
                }
                ee.a(((me) this).field_S[var6], (byte) 30);
                break;
            }
            var6++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_Q = "Start";
        field_N = "Sorted by rating";
        field_L = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        field_P = "Towers:";
        field_H = new int[]{25, 8, 26};
        field_O = new vn();
        field_I = 0;
    }
}
