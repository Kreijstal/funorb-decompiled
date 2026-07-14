/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ph extends fa {
    static on field_l;
    static String field_m;
    int field_k;
    static tf field_n;
    static int field_o;

    final static int e(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            we var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_37_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_36_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (pm.field_h.field_h < 4) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (pm.field_h.field_m == -1) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if (-2 != pm.field_h.field_m) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 4;
                    }
                    case 6: {
                        return 1;
                    }
                    case 8: {
                        try {
                            if (0 != rb.field_q) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            se.field_o = ef.field_e.a(20278, bl.field_e, kj.field_s);
                            rb.field_q = rb.field_q + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (1 != rb.field_q) {
                                statePc = 18;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if ((se.field_o.field_b ^ -1) == -3) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = ce.a((byte) -124, -1);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if ((se.field_o.field_b ^ -1) == -2) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            rb.field_q = rb.field_q + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (rb.field_q == 2) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            sc.field_d = new mo((java.net.Socket) se.field_o.field_e, ef.field_e);
                            var2 = new we(13);
                            al.a(ql.field_o, (byte) 66, ak.field_ib, var2, lk.field_n);
                            var2.e(160, 15);
                            var2.d(fj.field_a, -76);
                            sc.field_d.a(13, -103, 0, var2.field_k);
                            rb.field_q = rb.field_q + 1;
                            co.field_a = 30000L + hm.a(64);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (rb.field_q == 3) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (sc.field_d.a(-120) <= 0) {
                                statePc = 28;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var1_int = sc.field_d.c((byte) -81);
                            if (0 == var1_int) {
                                statePc = 27;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = ce.a((byte) -124, var1_int);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            rb.field_q = rb.field_q + 1;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if ((co.field_a ^ -1L) <= (hm.a(64) ^ -1L)) {
                                statePc = 31;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackOut_29_0 = ce.a((byte) -124, -2);
                            stackIn_30_0 = stackOut_29_0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        return stackIn_30_0;
                    }
                    case 31: {
                        try {
                            if (param0 == 25960) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            stackOut_32_0 = -28;
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return stackIn_33_0;
                    }
                    case 34: {
                        try {
                            if ((rb.field_q ^ -1) == -5) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            pm.field_h.a((Object) (Object) sc.field_d, kn.field_L, 8);
                            sc.field_d = null;
                            se.field_o = null;
                            rb.field_q = 0;
                            stackOut_36_0 = 0;
                            stackIn_37_0 = stackOut_36_0;
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 38;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        return stackIn_37_0;
                    }
                    case 38: {
                        var1 = (IOException) (Object) caughtException;
                        return ce.a((byte) -124, -3);
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

    public static void a(int param0) {
        field_n = null;
        if (param0 < 104) {
            return;
        }
        field_l = null;
        field_m = null;
    }

    final static void a(fm param0, byte param1) {
        ak var3 = null;
        ak var5 = null;
        ak var6 = null;
        dk.field_e = bi.a("basic", "display_name_changed", param0, (byte) -25);
        ma.field_z = new pd(0L, rm.field_a, tp.field_u, op.field_q);
        v.field_e = new pd(0L, rm.field_a, qh.field_e, k.field_n);
        wa.field_f = new ak(0L, (ak) null);
        ak.field_E = new ak(0L, mg.field_h);
        ak.field_E.field_Bb = 1;
        kc.field_u = new ak(0L, u.field_l, qn.field_m);
        ae.field_e = new ak(0L, ni.field_s, gp.field_Jb);
        sk.field_e = new ak(0L, dn.field_c);
        wa.field_f.a(ak.field_E, (byte) 26);
        wa.field_f.a(kc.field_u, (byte) 26);
        wa.field_f.a(ae.field_e, (byte) 26);
        wa.field_f.a((ak) (Object) ma.field_z, (byte) 26);
        wa.field_f.a(sk.field_e, (byte) 26);
        ma.field_z.field_Gb.field_Ib.a(param1 ^ 27853, mg.field_h);
        ma.field_z.field_Gb.field_Ib.field_kb = 1;
        var5 = ma.field_z.field_Gb.field_Ib;
        var6 = var5;
        var6.field_Bb = 1;
        v.field_e.field_Gb.field_Ib.a(param1 ^ 27853, mg.field_h);
        v.field_e.field_Gb.field_Ib.field_kb = 1;
        var3 = v.field_e.field_Gb.field_Ib;
        var3.field_Bb = 1;
        if (param1 != -106) {
          ph.a(-30);
          return;
        } else {
          return;
        }
    }

    ph(int param0) {
        ((ph) this).field_k = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_m = "Unfortunately we are unable to create an account for you at this time.";
    }
}
