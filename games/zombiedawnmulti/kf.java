/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class kf extends dl {
    static java.security.SecureRandom field_j;
    static cj field_i;
    private java.net.ProxySelector field_l;
    static String field_k;

    final static java.net.URL a(String param0, int param1, byte param2, String param3, java.net.URL param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            StringBuilder discarded$9 = null;
            int stackIn_4_0 = 0;
            int stackIn_10_0 = 0;
            java.net.URL stackIn_46_0 = null;
            java.net.URL stackIn_48_0 = null;
            RuntimeException stackIn_50_0 = null;
            StringBuilder stackIn_50_1 = null;
            RuntimeException stackIn_51_0 = null;
            StringBuilder stackIn_51_1 = null;
            RuntimeException stackIn_52_0 = null;
            StringBuilder stackIn_52_1 = null;
            String stackIn_52_2 = null;
            RuntimeException stackIn_53_0 = null;
            StringBuilder stackIn_53_1 = null;
            RuntimeException stackIn_54_0 = null;
            StringBuilder stackIn_54_1 = null;
            RuntimeException stackIn_55_0 = null;
            StringBuilder stackIn_55_1 = null;
            String stackIn_55_2 = null;
            RuntimeException stackIn_56_0 = null;
            StringBuilder stackIn_56_1 = null;
            RuntimeException stackIn_57_0 = null;
            StringBuilder stackIn_57_1 = null;
            RuntimeException stackIn_58_0 = null;
            StringBuilder stackIn_58_1 = null;
            String stackIn_58_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            String var5 = null;
            RuntimeException var5_ref = null;
            int var6 = 0;
            int var7_int = 0;
            StringBuilder var7 = null;
            Exception var8 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var5 = param4.getFile();
                            var6 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!var5.regionMatches(var6, "/l=", 0, 3)) {
                                statePc = 9;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            stackIn_10_0 = var7_int;
                            stackIn_4_0 = stackIn_10_0;
                            if (var9 != 0) {
                                statePc = 10;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (stackIn_4_0 >= 0) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (-1 < (param1 ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackIn_10_0 = var5.regionMatches(var6, "/a=", 0, 3) ? 1 : 0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (stackIn_10_0 == 0) {
                                statePc = 14;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if (var7_int >= 0) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (!var5.regionMatches(var6, "/p=", 0, 3)) {
                                statePc = 19;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if (0 > var7_int) {
                                statePc = 19;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (param3 != null) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var5.regionMatches(var6, "/s=", 0, 3)) {
                                statePc = 22;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (!var5.regionMatches(var6, "/c=", 0, 3)) {
                                statePc = 27;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var7_int = var5.indexOf('/', 1 + var6);
                            if (var7_int >= 0) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (param0 == null) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var5 = var5.substring(0, var6) + var5.substring(var7_int);
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var6 = var7_int;
                            if (var9 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var7 = new StringBuilder(var6);
                            discarded$0 = var7.append(var5.substring(0, var6));
                            if (-1 > (param1 ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            discarded$1 = var7.append("/l=");
                            discarded$2 = var7.append(Integer.toString(param1));
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (param3 == null) {
                                statePc = 34;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (param3.length() > 0) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            discarded$3 = var7.append("/p=");
                            discarded$4 = var7.append(param3);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (param0 == null) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (0 < param0.length()) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            discarded$5 = var7.append("/s=");
                            discarded$6 = var7.append(param0);
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var5.length() > var6) {
                                statePc = 41;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            discarded$7 = var7.append('/');
                            if (var9 == 0) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            discarded$8 = var7.append(var5.substring(var6, var5.length()));
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            discarded$9 = var7.append(var5.substring(var6, var5.length()));
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (param2 > 107) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            field_k = (String) null;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackIn_46_0 = new java.net.URL(param4, var7.toString());
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = ((Object) stateCaught_45 instanceof Exception ? 47 : 49);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        return stackIn_46_0;
                    }
                    case 47: {
                        try {
                            var8 = (Exception) ((Object) caughtException);
                            var8.printStackTrace();
                            stackIn_48_0 = (java.net.URL) (param4);
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 49;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        return stackIn_48_0;
                    }
                    case 49: {
                        var5_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_51_0 = (RuntimeException) (var5_ref);
                        stackIn_50_0 = stackIn_51_0;
                        stackIn_51_1 = new StringBuilder().append("kf.A(");
                        stackIn_50_1 = stackIn_51_1;
                        if (param0 == null) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 50: {
                        stackIn_52_0 = (RuntimeException) ((Object) stackIn_50_0);
                        stackIn_52_1 = (StringBuilder) ((Object) stackIn_50_1);
                        stackIn_52_2 = "{...}";
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 51: {
                        stackIn_52_0 = (RuntimeException) ((Object) stackIn_51_0);
                        stackIn_52_1 = (StringBuilder) ((Object) stackIn_51_1);
                        stackIn_52_2 = "null";
                        statePc = 52;
                        continue stateLoop;
                    }
                    case 52: {
                        stackIn_54_0 = (RuntimeException) ((Object) stackIn_52_0);
                        stackIn_53_0 = stackIn_54_0;
                        stackIn_54_1 = ((StringBuilder) (Object) stackIn_52_1).append(stackIn_52_2).append(',').append(param1).append(',').append(param2).append(',');
                        stackIn_53_1 = stackIn_54_1;
                        if (param3 == null) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 53: {
                        stackIn_55_0 = (RuntimeException) ((Object) stackIn_53_0);
                        stackIn_55_1 = (StringBuilder) ((Object) stackIn_53_1);
                        stackIn_55_2 = "{...}";
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 54: {
                        stackIn_55_0 = (RuntimeException) ((Object) stackIn_54_0);
                        stackIn_55_1 = (StringBuilder) ((Object) stackIn_54_1);
                        stackIn_55_2 = "null";
                        statePc = 55;
                        continue stateLoop;
                    }
                    case 55: {
                        stackIn_57_0 = (RuntimeException) ((Object) stackIn_55_0);
                        stackIn_56_0 = stackIn_57_0;
                        stackIn_57_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_55_2).append(',');
                        stackIn_56_1 = stackIn_57_1;
                        if (param4 == null) {
                            statePc = 57;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    }
                    case 56: {
                        stackIn_58_0 = (RuntimeException) ((Object) stackIn_56_0);
                        stackIn_58_1 = (StringBuilder) ((Object) stackIn_56_1);
                        stackIn_58_2 = "{...}";
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 57: {
                        stackIn_58_0 = (RuntimeException) ((Object) stackIn_57_0);
                        stackIn_58_1 = (StringBuilder) ((Object) stackIn_57_1);
                        stackIn_58_2 = "null";
                        statePc = 58;
                        continue stateLoop;
                    }
                    case 58: {
                        throw fa.a((Throwable) ((Object) stackIn_58_0), stackIn_58_2 + ')');
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

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException runtimeException = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var14 = ZombieDawnMulti.field_E ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var6_int = param3 + 485 + (8 - -param2) + 10;
                        qe.field_q.a(-6 + dq.field_k.field_z, 3, var6_int - 6, 3, -3344);
                        var7 = qe.field_q.field_z - 5;
                        ek.field_z.a(param5, var7 - param5, param2 + 487 + param3, 5, param0 ^ -3342);
                        ec.field_b.a(param5, 0, -ua.field_E.field_zb + (ek.field_z.field_zb - param2), param2, -3344);
                        ua.field_E.a(param5, 0, ua.field_E.field_zb, param2 + ec.field_b.field_zb, param0 + -3346);
                        var7 = var7 - (2 + param5);
                        tn.field_A.a(param3, 2, param3 + (param0 + param2) + 485, 5, var7 - 5, param0 ^ -31467, 5);
                        if (ra.field_f == null) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ra.field_f.b(tn.field_A.field_x, tn.field_A.field_Q, 28972, tn.field_A.field_zb, tn.field_A.field_z);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var8 = -var6_int + -param2 + dq.field_k.field_zb;
                        var9 = var8 / 2;
                        var10 = param2 + param1 + var9;
                        var11 = 0;
                        var12 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var12 ^ -1) <= -7) {
                            statePc = 18;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var14 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        return;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (5 <= var12) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (la.field_h[var12] != null) {
                            statePc = 11;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var14 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var13 = (2 + (-6 + dq.field_k.field_z)) * var11 / (1 + gi.field_l) + 3;
                        var11++;
                        var7 = var11 * (dq.field_k.field_z + -4) / (1 + gi.field_l) + (1 + -var13);
                        if (5 > var12) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        nn.field_b.a(var7, var13, var8, var6_int, -3344);
                        if (var14 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        la.field_h[var12].a(var7, var13, var8, var6_int, param0 ^ -3342);
                        ij.field_k[var12].a(var7, 0, var9 - param2, param2, param0 ^ -3342);
                        pf.field_d[var12].a(-param4 + var7 - param4, param4, param1, var9, -3344);
                        hh.field_l[var12].a(-param4 + var7 - param4, param4, var8 - (param2 - -var10), var10, -3344);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var12++;
                        if (var14 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    runtimeException = (RuntimeException) ((Object) caughtException);
                    throw fa.a((Throwable) ((Object) runtimeException), "kf.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
                }
                case 18: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_k = null;
        if (param0 != 3) {
            return;
        }
        field_j = null;
    }

    private final java.net.Socket a(java.net.Proxy param0, int param1) throws IOException {
        java.net.SocketAddress var3 = null;
        RuntimeException var3_ref = null;
        java.net.InetSocketAddress var4 = null;
        Object var5 = null;
        Class var6 = null;
        java.lang.reflect.Method var7 = null;
        Object var8 = null;
        java.lang.reflect.Method var9 = null;
        java.lang.reflect.Method var10 = null;
        java.lang.reflect.Method var11 = null;
        String var12 = null;
        String var13 = null;
        Class var14 = null;
        java.net.Socket stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        java.net.Socket stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        java.net.Socket stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var6_ref = null;
        try {
          L0: {
            if (param0.type() != java.net.Proxy.Type.DIRECT) {
              var3 = param0.address();
              if ((Object) var3 instanceof java.net.InetSocketAddress) {
                var4 = (java.net.InetSocketAddress) ((Object) var3);
                if (param1 == 1) {
                  if (param0.type() == java.net.Proxy.Type.HTTP) {
                    var5 = null;
                    try {
                      L1: {
                        L2: {
                          var14 = Class.forName("sun.net.www.protocol.http.AuthenticationInfo");
                          var6 = var14;
                          var7 = var14.getDeclaredMethod("getProxyAuth", new Class[]{String.class, Integer.TYPE});
                          var7.setAccessible(true);
                          var8 = var7.invoke((Object) null, new Object[]{var4.getHostName(), new Integer(var4.getPort())});
                          if (var8 != null) {
                            var9 = var6.getDeclaredMethod("supportsPreemptiveAuthorization", new Class[]{});
                            var9.setAccessible(true);
                            if (!((Boolean) (var9.invoke(var8, new Object[]{}))).booleanValue()) {
                              break L2;
                            } else {
                              var10 = var6.getDeclaredMethod("getHeaderName", new Class[]{});
                              var10.setAccessible(true);
                              var11 = var14.getDeclaredMethod("getHeaderValue", new Class[]{java.net.URL.class, String.class});
                              var11.setAccessible(true);
                              var12 = (String) (var10.invoke(var8, new Object[]{}));
                              var13 = (String) (var11.invoke(var8, new Object[]{new java.net.URL("https://" + this.field_b + "/"), "https"}));
                              var5 = var12 + ": " + var13;
                              break L2;
                            }
                          } else {
                            break L2;
                          }
                        }
                        break L1;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L3: {
                        var6_ref = (Exception) (Object) decompiledCaughtException;
                        break L3;
                      }
                    }
                    stackIn_22_0 = this.a((byte) -96, var4.getHostName(), var4.getPort(), (String) (var5));
                    decompiledRegionSelector0 = 4;
                    break L0;
                  } else {
                    if (param0.type() == java.net.Proxy.Type.SOCKS) {
                      var5 = new java.net.Socket(param0);
                      ((java.net.Socket) (var5)).connect((java.net.SocketAddress) ((Object) new java.net.InetSocketAddress(this.field_b, this.field_f)));
                      stackIn_13_0 = var5;
                      decompiledRegionSelector0 = 3;
                      break L0;
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackIn_8_0 = (java.net.Socket) null;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                stackIn_5_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = this.b((byte) 100);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L4: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var3_ref);

            stackIn_25_1 = new StringBuilder().append("kf.B(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (java.net.Socket) ((Object) stackIn_5_0);
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_8_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return (java.net.Socket) ((Object) stackIn_13_0);
              } else {
                return stackIn_22_0;
              }
            }
          }
        }
    }

    private final java.net.Socket a(byte param0, String param1, int param2, String param3) throws IOException {
        java.net.Socket stackIn_3_0 = null;
        java.net.Socket stackIn_13_0 = null;
        Object stackIn_29_0 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        OutputStream var6 = null;
        BufferedReader var7 = null;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        int var11 = 0;
        int var12 = 0;
        java.net.Socket var13 = null;
        String var14 = null;
        var12 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          L0: {
            if (param0 <= -25) {
              L1: {
                L2: {
                  var13 = new java.net.Socket(param1, param2);
                  var13.setSoTimeout(10000);
                  var6 = var13.getOutputStream();
                  if (param3 == null) {
                    break L2;
                  } else {
                    var6.write(("CONNECT " + this.field_b + ":" + this.field_f + " HTTP/1.0\n" + param3 + "\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                    if (var12 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6.write(("CONNECT " + this.field_b + ":" + this.field_f + " HTTP/1.0\n\n").getBytes(java.nio.charset.Charset.forName("ISO-8859-1")));
                break L1;
              }
              L3: {
                var6.flush();
                var7 = new BufferedReader((Reader) ((Object) new InputStreamReader(var13.getInputStream())));
                var8 = var7.readLine();
                if (var8 == null) {
                  break L3;
                } else {
                  L4: {
                    if (var8.startsWith("HTTP/1.0 200")) {
                      break L4;
                    } else {
                      if (!var8.startsWith("HTTP/1.1 200")) {
                        L5: {
                          if (var8.startsWith("HTTP/1.0 407")) {
                            break L5;
                          } else {
                            if (var8.startsWith("HTTP/1.1 407")) {
                              break L5;
                            } else {
                              break L3;
                            }
                          }
                        }
                        var9 = 0;
                        var10 = "proxy-authenticate: ";
                        var8 = var7.readLine();
                        L6: while (true) {
                          L7: {
                            if (var8 == null) {
                              break L7;
                            } else {
                              if (50 <= var9) {
                                break L7;
                              } else {
                                if (var8.toLowerCase().startsWith(var10)) {
                                  L8: {
                                    var14 = var8.substring(var10.length()).trim();
                                    var8 = var14;
                                    var11 = var14.indexOf(' ');
                                    if (0 != (var11 ^ -1)) {
                                      var8 = var14.substring(0, var11);
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                  throw new en(var8);
                                } else {
                                  var8 = var7.readLine();
                                  var9++;
                                  if (var12 == 0) {
                                    continue L6;
                                  } else {
                                    break L7;
                                  }
                                }
                              }
                            }
                          }
                          throw new en("");
                        }
                      } else {
                        break L4;
                      }
                    }
                  }
                  stackIn_13_0 = (java.net.Socket) (var13);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              var6.close();
              var7.close();
              var13.close();
              stackIn_29_0 = null;
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_3_0 = (java.net.Socket) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var5 = decompiledCaughtException;
            stackIn_32_0 = (RuntimeException) (var5);

            stackIn_32_1 = new StringBuilder().append("kf.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L9;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_35_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "null";
              break L10;
            } else {
              stackIn_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackIn_36_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackIn_36_2 = "{...}";
              break L10;
            }
          }
          throw fa.a((Throwable) ((Object) stackIn_33_0), stackIn_36_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return (java.net.Socket) ((Object) stackIn_29_0);
          }
        }
    }

    kf() {
        this.field_l = java.net.ProxySelector.getDefault();
    }

    final java.net.Socket b(int param0) throws IOException {
        int stackIn_7_0 = 0;
        java.net.ProxySelector stackIn_10_0;
        java.net.URI stackIn_10_1;
        java.net.URI stackIn_10_2;
        StringBuilder stackIn_10_3;
        java.net.ProxySelector stackIn_11_0 = null;
        java.net.URI stackIn_11_1 = null;
        java.net.URI stackIn_11_2 = null;
        StringBuilder stackIn_11_3 = null;
        String stackIn_11_4 = null;
        java.net.ProxySelector stackIn_13_0;
        java.net.URI stackIn_13_1;
        java.net.URI stackIn_13_2;
        StringBuilder stackIn_13_3;
        java.net.ProxySelector stackIn_14_0;
        java.net.URI stackIn_14_1;
        java.net.URI stackIn_14_2;
        StringBuilder stackIn_14_3;
        String stackIn_14_4;
        java.net.Socket stackIn_23_0 = null;
        Object stackIn_28_0 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        List var3 = null;
        List var4 = null;
        int var5 = 0;
        java.net.URISyntaxException var6 = null;
        Object[] var6_array = null;
        Object var7 = null;
        Object[] var8 = null;
        int var9 = 0;
        Object var10 = null;
        java.net.Proxy var11 = null;
        java.net.Socket var12 = null;
        en var12_ref = null;
        IOException var12_ref2 = null;
        int var13 = 0;
        L0: {
          var13 = ZombieDawnMulti.field_E ? 1 : 0;
          if (param0 == 4646) {
            break L0;
          } else {
            kf.a(-21, 110, 106, 109, 24, -20);
            break L0;
          }
        }
        L1: {
          if (Boolean.parseBoolean(System.getProperty("java.net.useSystemProxies"))) {
            break L1;
          } else {
            System.setProperty("java.net.useSystemProxies", "true");
            break L1;
          }
        }
        L2: {
          if (-444 != (this.field_f ^ -1)) {
            stackIn_7_0 = 0;
            break L2;
          } else {
            stackIn_7_0 = 1;
            break L2;
          }
        }
        var5 = stackIn_7_0;
        try {
          L3: {
            L4: {
              stackIn_10_0 = this.field_l;

              stackIn_10_1 = null;

              stackIn_10_2 = null;

              stackIn_10_3 = new StringBuilder();

              if (var5 == 0) {
                stackIn_11_0 = (java.net.ProxySelector) ((Object) stackIn_10_0);
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_3 = (StringBuilder) ((Object) stackIn_10_3);
                stackIn_11_4 = "http";
                break L4;
              } else {
                stackIn_11_0 = (java.net.ProxySelector) ((Object) stackIn_10_0);
                stackIn_11_1 = null;
                stackIn_11_2 = null;
                stackIn_11_3 = (StringBuilder) ((Object) stackIn_10_3);
                stackIn_11_4 = "https";
                break L4;
              }
            }
            L5: {
              var3 = ((java.net.ProxySelector) (Object) stackIn_11_0).select(new java.net.URI(stackIn_11_4 + "://" + this.field_b));
              stackIn_13_0 = this.field_l;

              stackIn_13_1 = null;

              stackIn_13_2 = null;

              stackIn_13_3 = new StringBuilder();

              if (var5 != 0) {
                stackIn_14_0 = (java.net.ProxySelector) ((Object) stackIn_13_0);
                stackIn_14_1 = null;
                stackIn_14_2 = null;
                stackIn_14_3 = (StringBuilder) ((Object) stackIn_13_3);
                stackIn_14_4 = "http";
                break L5;
              } else {
                stackIn_14_0 = (java.net.ProxySelector) ((Object) stackIn_13_0);
                stackIn_14_1 = null;
                stackIn_14_2 = null;
                stackIn_14_3 = (StringBuilder) ((Object) stackIn_13_3);
                stackIn_14_4 = "https";
                break L5;
              }
            }
            var4 = ((java.net.ProxySelector) (Object) stackIn_14_0).select(new java.net.URI(stackIn_14_4 + "://" + this.field_b));
            break L3;
          }
        } catch (java.net.URISyntaxException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = (java.net.URISyntaxException) (Object) decompiledCaughtException;
          return this.b((byte) 97);
        }
        var3.addAll((Collection) ((Object) var4));
        var6_array = var3.toArray();
        var7 = null;
        var8 = var6_array;
        var9 = 0;
        L6: while (true) {
          L7: {
            L8: {
              if (var9 >= var8.length) {
                break L8;
              } else {
                var10 = var8[var9];
                var11 = (java.net.Proxy) (var10);
                try {
                  L9: {
                    var12 = this.a(var11, 1);
                    stackIn_28_0 = null;

                    if (var13 != 0) {
                      decompiledRegionSelector0 = 0;
                      break L9;
                    } else {
                      if (stackIn_28_0 == var12) {
                        decompiledRegionSelector0 = 1;
                        break L9;
                      } else {
                        stackIn_23_0 = (java.net.Socket) (var12);
                        decompiledRegionSelector0 = 2;
                        break L9;
                      }
                    }
                  }
                } catch (en decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L10: {
                    var12_ref = (en) (Object) decompiledCaughtException;
                    var7 = var12_ref;
                    decompiledRegionSelector0 = 1;
                    break L10;
                  }
                } catch (java.io.IOException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L11: {
                    var12_ref2 = (IOException) (Object) decompiledCaughtException;
                    decompiledRegionSelector0 = 1;
                    break L11;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  break L7;
                } else {
                  if (decompiledRegionSelector0 == 1) {
                    var9++;
                    if (var13 == 0) {
                      continue L6;
                    } else {
                      break L8;
                    }
                  } else {
                    return stackIn_23_0;
                  }
                }
              }
            }
            stackIn_28_0 = null;
            break L7;
          }
          if (stackIn_28_0 != var7) {
            throw kf.<RuntimeException>$cfr$sneakyThrow((Throwable) var7);
          } else {
            return this.b((byte) 89);
          }
        }
    }

    static {
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
