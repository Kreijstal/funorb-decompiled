/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

abstract class pe {
    static byte[][] field_a;
    static String field_c;
    static im field_b;

    abstract void a(int param0, java.awt.Component param1);

    abstract int a(int param0);

    abstract void a(java.awt.Component param0, int param1);

    final static void a(byte param0, Throwable param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            eb var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            be stackIn_16_0 = null;
            java.net.URL stackIn_16_1 = null;
            java.net.URL stackIn_16_2 = null;
            java.net.URL stackIn_16_3 = null;
            StringBuilder stackIn_16_4 = null;
            be stackIn_17_0 = null;
            java.net.URL stackIn_17_1 = null;
            java.net.URL stackIn_17_2 = null;
            java.net.URL stackIn_17_3 = null;
            StringBuilder stackIn_17_4 = null;
            be stackIn_18_0 = null;
            java.net.URL stackIn_18_1 = null;
            java.net.URL stackIn_18_2 = null;
            java.net.URL stackIn_18_3 = null;
            StringBuilder stackIn_18_4 = null;
            String stackIn_18_5 = null;
            be stackOut_15_0 = null;
            java.net.URL stackOut_15_1 = null;
            java.net.URL stackOut_15_2 = null;
            java.net.URL stackOut_15_3 = null;
            StringBuilder stackOut_15_4 = null;
            be stackOut_16_0 = null;
            java.net.URL stackOut_16_1 = null;
            java.net.URL stackOut_16_2 = null;
            java.net.URL stackOut_16_3 = null;
            StringBuilder stackOut_16_4 = null;
            String stackOut_16_5 = null;
            be stackOut_17_0 = null;
            java.net.URL stackOut_17_1 = null;
            java.net.URL stackOut_17_2 = null;
            java.net.URL stackOut_17_3 = null;
            StringBuilder stackOut_17_4 = null;
            String stackOut_17_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = OrbDefence.field_D ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param0 == -13) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_c = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = "";
                            if (param1 != null) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_ref = vi.a(41, param1);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (param2 != null) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (param1 != null) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3_ref = var3_ref + param2;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ae.a(var3_ref, param0 ^ -111);
                            var7 = hg.a(var3_ref, "%3a", ":", (byte) -36);
                            var8 = hg.a(var7, "%40", "@", (byte) -67);
                            var9 = hg.a(var8, "%26", "&", (byte) -61);
                            var10 = hg.a(var9, "%23", "#", (byte) -34);
                            if (null == cg.field_f) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return;
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = df.field_e;
                            stackOut_15_1 = null;
                            stackOut_15_2 = null;
                            stackOut_15_3 = cg.field_f.getCodeBase();
                            stackOut_15_4 = new StringBuilder().append("clienterror.ws?c=").append(lm.field_d).append("&u=");
                            stackIn_17_0 = stackOut_15_0;
                            stackIn_17_1 = stackOut_15_1;
                            stackIn_17_2 = stackOut_15_2;
                            stackIn_17_3 = stackOut_15_3;
                            stackIn_17_4 = stackOut_15_4;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            stackIn_16_2 = stackOut_15_2;
                            stackIn_16_3 = stackOut_15_3;
                            stackIn_16_4 = stackOut_15_4;
                            if (null != th.field_b) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = (be) (Object) stackIn_16_0;
                            stackOut_16_1 = null;
                            stackOut_16_2 = null;
                            stackOut_16_3 = (java.net.URL) (Object) stackIn_16_3;
                            stackOut_16_4 = (StringBuilder) (Object) stackIn_16_4;
                            stackOut_16_5 = "" + el.field_F;
                            stackIn_18_0 = stackOut_16_0;
                            stackIn_18_1 = stackOut_16_1;
                            stackIn_18_2 = stackOut_16_2;
                            stackIn_18_3 = stackOut_16_3;
                            stackIn_18_4 = stackOut_16_4;
                            stackIn_18_5 = stackOut_16_5;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            stackOut_17_0 = (be) (Object) stackIn_17_0;
                            stackOut_17_1 = null;
                            stackOut_17_2 = null;
                            stackOut_17_3 = (java.net.URL) (Object) stackIn_17_3;
                            stackOut_17_4 = (StringBuilder) (Object) stackIn_17_4;
                            stackOut_17_5 = th.field_b;
                            stackIn_18_0 = stackOut_17_0;
                            stackIn_18_1 = stackOut_17_1;
                            stackIn_18_2 = stackOut_17_2;
                            stackIn_18_3 = stackOut_17_3;
                            stackIn_18_4 = stackOut_17_4;
                            stackIn_18_5 = stackOut_17_5;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            new java.net.URL(stackIn_18_3, stackIn_18_5 + "&v1=" + be.field_s + "&v2=" + be.field_j + "&e=" + var10);
                            var4 = ((be) (Object) stackIn_18_0).a(stackIn_18_1, (byte) -49);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var4.field_a != 0) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            hb.a(1L, 110);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var4.field_a == 1) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            return;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var5 = (DataInputStream) var4.field_g;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 25;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return;
                    }
                    case 25: {
                        var3 = (Exception) (Object) caughtException;
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

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 <= 105) {
            pe.b(119);
            field_c = null;
            return;
        }
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Suggested names: ";
        field_a = new byte[250][];
        field_b = new im();
    }
}
