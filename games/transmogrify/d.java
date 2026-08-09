/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class d {
    static Random field_c;
    static pl field_e;
    static int[] field_a;
    static oa field_d;
    static int[] field_b;

    final static void a(Throwable param0, int param1, String param2) {
        try {
            fe stackIn_11_0 = null;
            int stackIn_11_1 = 0;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            java.net.URL stackIn_11_4 = null;
            StringBuilder stackIn_11_5 = null;
            fe stackIn_12_0 = null;
            int stackIn_12_1 = 0;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            java.net.URL stackIn_12_4 = null;
            StringBuilder stackIn_12_5 = null;
            fe stackIn_13_0 = null;
            int stackIn_13_1 = 0;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            java.net.URL stackIn_13_4 = null;
            StringBuilder stackIn_13_5 = null;
            String stackIn_13_6 = null;
            int decompiledRegionSelector0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var3 = 0;
            String var4 = null;
            Exception var4_ref = null;
            ib var5 = null;
            DataInputStream var6 = null;
            int var7 = 0;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            String var11 = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Transmogrify.field_A ? 1 : 0;
                        var3 = 90 % ((param1 - -65) / 45);
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var4 = "";
                            if (param0 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var4 = rk.a(param0, false);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param2 == null) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 21;
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
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var4 = var4 + " | ";
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4 = var4 + param2;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            fc.a(121, var4);
                            var8 = mg.a(":", false, "%3a", var4);
                            var9 = mg.a("@", false, "%40", var8);
                            var10 = mg.a("&", false, "%26", var9);
                            var11 = mg.a("#", false, "%23", var10);
                            if (re.field_i != null) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            stackIn_12_0 = f.field_b;
                            stackIn_11_0 = stackIn_12_0;
                            stackIn_12_1 = -21377;
                            stackIn_11_1 = stackIn_12_1;
                            stackIn_12_2 = null;
                            stackIn_11_2 = stackIn_12_2;
                            stackIn_12_3 = null;
                            stackIn_11_3 = stackIn_12_3;
                            stackIn_12_4 = re.field_i.getCodeBase();
                            stackIn_11_4 = stackIn_12_4;
                            stackIn_12_5 = new StringBuilder().append("clienterror.ws?c=").append(gh.field_h).append("&u=");
                            stackIn_11_5 = stackIn_12_5;
                            if (null == mh.field_c) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackIn_13_0 = (fe) ((Object) stackIn_11_0);
                            stackIn_13_1 = stackIn_11_1;
                            stackIn_13_2 = null;
                            stackIn_13_3 = null;
                            stackIn_13_4 = (java.net.URL) ((Object) stackIn_11_4);
                            stackIn_13_5 = (StringBuilder) ((Object) stackIn_11_5);
                            stackIn_13_6 = mh.field_c;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackIn_13_0 = (fe) ((Object) stackIn_12_0);
                            stackIn_13_1 = stackIn_12_1;
                            stackIn_13_2 = null;
                            stackIn_13_3 = null;
                            stackIn_13_4 = (java.net.URL) ((Object) stackIn_12_4);
                            stackIn_13_5 = (StringBuilder) ((Object) stackIn_12_5);
                            stackIn_13_6 = "" + oi.field_i;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var5 = ((fe) (Object) stackIn_13_0).a(stackIn_13_1, new java.net.URL(stackIn_13_4, stackIn_13_6 + "&v1=" + fe.field_w + "&v2=" + fe.field_c + "&e=" + var11));
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var5.field_c != 0) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            pg.a(1L, -124);
                            if (var7 != 0) {
                                statePc = 22;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var7 == 0) {
                                statePc = 14;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var5.field_c != 1) {
                                statePc = 22;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var6 = (DataInputStream) (var5.field_g);
                            var6.read();
                            var6.close();
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var4_ref = (Exception) ((Object) caughtException);
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
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
        field_e = null;
        field_b = null;
        field_c = null;
        if (param0 != 1) {
            return;
        }
        field_d = null;
        field_a = null;
    }

    static {
        field_c = new Random();
        field_a = new int[8192];
        field_d = new oa(256);
        field_b = new int[8192];
    }
}
