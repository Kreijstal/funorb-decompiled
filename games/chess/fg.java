/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fg {
    static String field_a;
    static jc field_c;
    static boolean field_b;
    static ok field_d;

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
            fg.a(false);
            field_a = null;
            field_d = null;
            return;
        }
        field_a = null;
        field_d = null;
    }

    final static void a(Throwable param0, byte param1, String param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            nl var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            jk stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            jk stackIn_14_0 = null;
            int stackIn_14_1 = 0;
            java.net.URL stackIn_14_2 = null;
            java.net.URL stackIn_14_3 = null;
            java.net.URL stackIn_14_4 = null;
            StringBuilder stackIn_14_5 = null;
            jk stackIn_15_0 = null;
            int stackIn_15_1 = 0;
            java.net.URL stackIn_15_2 = null;
            java.net.URL stackIn_15_3 = null;
            java.net.URL stackIn_15_4 = null;
            StringBuilder stackIn_15_5 = null;
            String stackIn_15_6 = null;
            jk stackOut_12_0 = null;
            int stackOut_12_1 = 0;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            java.net.URL stackOut_12_4 = null;
            StringBuilder stackOut_12_5 = null;
            jk stackOut_13_0 = null;
            int stackOut_13_1 = 0;
            java.net.URL stackOut_13_2 = null;
            java.net.URL stackOut_13_3 = null;
            java.net.URL stackOut_13_4 = null;
            StringBuilder stackOut_13_5 = null;
            String stackOut_13_6 = null;
            jk stackOut_14_0 = null;
            int stackOut_14_1 = 0;
            java.net.URL stackOut_14_2 = null;
            java.net.URL stackOut_14_3 = null;
            java.net.URL stackOut_14_4 = null;
            StringBuilder stackOut_14_5 = null;
            String stackOut_14_6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Chess.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param0 != null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3_ref = qm.a((byte) -89, param0);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param2 == null) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
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
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var3_ref = var3_ref + param2;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ol.a(var3_ref, 26613);
                            var7 = kb.a(var3_ref, 0, "%3a", ":");
                            var8 = kb.a(var7, param1 + 77, "%40", "@");
                            var9 = kb.a(var8, 0, "%26", "&");
                            var10 = kb.a(var9, param1 ^ -77, "%23", "#");
                            if (null == ba.field_L) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = um.field_g;
                            stackOut_12_1 = -49;
                            stackOut_12_2 = null;
                            stackOut_12_3 = null;
                            stackOut_12_4 = ba.field_L.getCodeBase();
                            stackOut_12_5 = new StringBuilder().append("clienterror.ws?c=").append(cg.field_a).append("&u=");
                            stackIn_14_0 = stackOut_12_0;
                            stackIn_14_1 = stackOut_12_1;
                            stackIn_14_2 = stackOut_12_2;
                            stackIn_14_3 = stackOut_12_3;
                            stackIn_14_4 = stackOut_12_4;
                            stackIn_14_5 = stackOut_12_5;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            stackIn_13_3 = stackOut_12_3;
                            stackIn_13_4 = stackOut_12_4;
                            stackIn_13_5 = stackOut_12_5;
                            if (null == fj.field_h) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = (jk) (Object) stackIn_13_0;
                            stackOut_13_1 = stackIn_13_1;
                            stackOut_13_2 = null;
                            stackOut_13_3 = null;
                            stackOut_13_4 = (java.net.URL) (Object) stackIn_13_4;
                            stackOut_13_5 = (StringBuilder) (Object) stackIn_13_5;
                            stackOut_13_6 = fj.field_h;
                            stackIn_15_0 = stackOut_13_0;
                            stackIn_15_1 = stackOut_13_1;
                            stackIn_15_2 = stackOut_13_2;
                            stackIn_15_3 = stackOut_13_3;
                            stackIn_15_4 = stackOut_13_4;
                            stackIn_15_5 = stackOut_13_5;
                            stackIn_15_6 = stackOut_13_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = (jk) (Object) stackIn_14_0;
                            stackOut_14_1 = stackIn_14_1;
                            stackOut_14_2 = null;
                            stackOut_14_3 = null;
                            stackOut_14_4 = (java.net.URL) (Object) stackIn_14_4;
                            stackOut_14_5 = (StringBuilder) (Object) stackIn_14_5;
                            stackOut_14_6 = "" + gi.field_e;
                            stackIn_15_0 = stackOut_14_0;
                            stackIn_15_1 = stackOut_14_1;
                            stackIn_15_2 = stackOut_14_2;
                            stackIn_15_3 = stackOut_14_3;
                            stackIn_15_4 = stackOut_14_4;
                            stackIn_15_5 = stackOut_14_5;
                            stackIn_15_6 = stackOut_14_6;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            new java.net.URL((java.net.URL) (Object) stackIn_15_4, (String) (Object) (stackIn_15_6 + "&v1=" + jk.field_o + "&v2=" + jk.field_i + "&e=" + var10));
                            var4 = ((jk) (Object) stackIn_15_0).a((byte) stackIn_15_1, (java.net.URL) (Object) stackIn_15_2);
                            if (param1 == -77) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            field_a = null;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var4.field_f != 0) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            bc.a(1L, (byte) -92);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((var4.field_f ^ -1) != -2) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var5 = (DataInputStream) var4.field_b;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
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
        field_a = "Show all private chat";
        field_c = new jc();
    }
}
