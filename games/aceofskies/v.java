/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class v {
    static kp field_b;
    static boolean field_a;

    final static void a(String param0, byte param1, Throwable param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            en var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            rk stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            rk stackIn_16_0 = null;
            int stackIn_16_1 = 0;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            java.net.URL stackIn_16_4 = null;
            StringBuilder stackIn_16_5 = null;
            rk stackIn_17_0 = null;
            int stackIn_17_1 = 0;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            java.net.URL stackIn_17_4 = null;
            StringBuilder stackIn_17_5 = null;
            String stackIn_17_6 = null;
            rk stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            rk stackOut_15_0 = null;
            int stackOut_15_1 = 0;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            java.net.URL stackOut_15_4 = null;
            StringBuilder stackOut_15_5 = null;
            String stackOut_15_6 = null;
            rk stackOut_16_0 = null;
            int stackOut_16_1 = 0;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            java.net.URL stackOut_16_4 = null;
            StringBuilder stackOut_16_5 = null;
            String stackOut_16_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = AceOfSkies.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param2 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = br.a(param2, (byte) -29);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param0 != null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (param2 == null) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            jb.a(var3_ref, 20164);
                            var7 = eh.a(":", param1 + 165, "%3a", var3_ref);
                            var8 = eh.a("@", -77, "%40", var7);
                            var9 = eh.a("&", param1 ^ -67, "%26", var8);
                            if (param1 == -52) {
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
                        return;
                    }
                    case 11: {
                        try {
                            var10 = eh.a("#", 118, "%23", var9);
                            if (null == fb.field_c) {
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
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return;
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = mj.field_a;
                            stackOut_14_1 = 70;
                            stackOut_14_2 = null;
                            stackOut_14_3 = null;
                            stackOut_14_4 = fb.field_c.getCodeBase();
                            stackOut_14_5 = new StringBuilder().append("clienterror.ws?c=").append(bs.field_c).append("&u=");
                            stackIn_16_0 = stackOut_14_0;
                            stackIn_16_1 = stackOut_14_1;
                            stackIn_16_2 = stackOut_14_2;
                            stackIn_16_3 = stackOut_14_3;
                            stackIn_16_4 = stackOut_14_4;
                            stackIn_16_5 = stackOut_14_5;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            stackIn_15_5 = stackOut_14_5;
                            if (co.field_g == null) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = (rk) (Object) stackIn_15_0;
                            stackOut_15_1 = stackIn_15_1;
                            stackOut_15_2 = null;
                            stackOut_15_3 = null;
                            stackOut_15_4 = (java.net.URL) (Object) stackIn_15_4;
                            stackOut_15_5 = (StringBuilder) (Object) stackIn_15_5;
                            stackOut_15_6 = co.field_g;
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_17_2 = stackOut_15_2;
                            stackIn_17_3 = stackOut_15_3;
                            stackIn_17_4 = stackOut_15_4;
                            stackIn_17_5 = stackOut_15_5;
                            stackIn_17_6 = stackOut_15_6;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = (rk) (Object) stackIn_16_0;
                            stackOut_16_1 = stackIn_16_1;
                            stackOut_16_2 = null;
                            stackOut_16_3 = null;
                            stackOut_16_4 = (java.net.URL) (Object) stackIn_16_4;
                            stackOut_16_5 = (StringBuilder) (Object) stackIn_16_5;
                            stackOut_16_6 = "" + dl.field_o;
                            stackIn_17_0 = stackOut_16_0;
                            stackIn_17_1 = stackOut_16_1;
                            stackIn_17_2 = stackOut_16_2;
                            stackIn_17_3 = stackOut_16_3;
                            stackIn_17_4 = stackOut_16_4;
                            stackIn_17_5 = stackOut_16_5;
                            stackIn_17_6 = stackOut_16_6;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            new java.net.URL((java.net.URL) (Object) stackIn_17_4, (String) (Object) (stackIn_17_6 + "&v1=" + rk.field_o + "&v2=" + rk.field_l + "&e=" + var10));
                            var4 = ((rk) (Object) stackIn_17_0).a((byte) stackIn_17_1, (java.net.URL) (Object) stackIn_17_2);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (((en) var4).field_a != -1) {
                                statePc = 20;
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
                            wf.a(1L, false);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (-2 != ((en) var4).field_a) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var5 = (DataInputStream) ((en) var4).field_f;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        return;
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
        if (param0 != 32342) {
            return;
        }
        field_b = null;
    }

    final static void a(boolean param0, java.applet.Applet param1) {
        try {
            Throwable var2 = null;
            String var3 = null;
            java.net.URL var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var4 = param1.getCodeBase();
                            var3 = jf.a(param1, var4, 70).getFile();
                            Object discarded$6 = fe.a("updatelinks", -15201, new Object[2], param1);
                            Object discarded$7 = fe.a("updatelinks", -15201, new Object[2], param1);
                            Object discarded$8 = fe.a("updatelinks", -15201, new Object[2], param1);
                            Object discarded$9 = fe.a("updatelinks", -15201, new Object[2], param1);
                            Object discarded$10 = fe.a("updatelinks", -15201, new Object[2], param1);
                            Object discarded$11 = fe.a("updatelinks", -15201, new Object[2], param1);
                            if (param0) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            field_a = true;
                            return;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2 = caughtException;
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
                        return;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new kp();
    }
}
