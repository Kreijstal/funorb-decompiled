/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    static boolean field_a;
    static hj field_c;
    static int field_b;

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
            Throwable throwable = null;
            RuntimeException runtimeException = null;
            String var3 = null;
            String var4 = null;
            String var5 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            String stackOut_16_2 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            String stackOut_20_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            hg.field_M = param0;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            var3 = param1.getParameter("cookieprefix");
                            var4 = param1.getParameter("cookiehost");
                            var5 = var3 + "session=" + param0 + "; version=1; path=/; domain=" + var4;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (0 == param0.length()) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 4;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var5 = var5 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            eo.a(param1, -31645, "document.cookie=\"" + var5 + "\"");
                            if (param2 == -1) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            mn.a((wd[]) null, (vd) null, (byte) 41);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throwable = caughtException;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            bb.a(param1, (byte) 49);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        runtimeException = (RuntimeException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = (RuntimeException) runtimeException;
                            stackOut_15_1 = new StringBuilder().append("mn.A(");
                            stackIn_18_0 = stackOut_15_0;
                            stackIn_18_1 = stackOut_15_1;
                            stackIn_16_0 = stackOut_15_0;
                            stackIn_16_1 = stackOut_15_1;
                            if (param0 == null) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                            stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                            stackOut_16_2 = "{...}";
                            stackIn_19_0 = stackOut_16_0;
                            stackIn_19_1 = stackOut_16_1;
                            stackIn_19_2 = stackOut_16_2;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "null";
                        stackIn_19_0 = stackOut_18_0;
                        stackIn_19_1 = stackOut_18_1;
                        stackIn_19_2 = stackOut_18_2;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        try {
                            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
                            stackIn_22_0 = stackOut_19_0;
                            stackIn_22_1 = stackOut_19_1;
                            stackIn_20_0 = stackOut_19_0;
                            stackIn_20_1 = stackOut_19_1;
                            if (param1 == null) {
                                statePc = 22;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                            stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                            stackOut_20_2 = "{...}";
                            stackIn_23_0 = stackOut_20_0;
                            stackIn_23_1 = stackOut_20_1;
                            stackIn_23_2 = stackOut_20_2;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 22: {
                        stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                        stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                        stackOut_22_2 = "null";
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        stackIn_23_2 = stackOut_22_2;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        throw kk.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param2 + 41);
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
        try {
            field_c = null;
            if (param0 >= -102) {
                field_a = false;
            }
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "mn.B(" + param0 + 41);
        }
    }

    final static void a(wd[] param0, vd param1, byte param2) {
        RuntimeException var3 = null;
        uh var3_ref = null;
        uh var4 = null;
        wd var5 = null;
        qm var6 = null;
        qm var7 = null;
        float var8 = 0.0f;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        int var12 = 0;
        wd var13 = null;
        float var14 = 0.0f;
        int var15 = 0;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        int var19 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var19 = HoldTheLine.field_D;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_ref = o.a((byte) 80);
                        var4 = o.a((byte) 7);
                        var5 = param0[-1 + param0.length];
                        var6 = var5.c(true);
                        var7 = var5.o(-14);
                        var3_ref.a(var6.field_h, (byte) 77);
                        var3_ref.a(var6.field_f, (byte) 104);
                        var4.a(var7.field_h, (byte) 85);
                        var4.a(var7.field_f, (byte) 81);
                        var8 = ce.a(-1, (wc[]) (Object) param0);
                        var9 = 1 + (int)(var8 / 40.0f);
                        var10 = var8 / (float)var9;
                        if (param2 < -13) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var11 = var10;
                        var12 = 0;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if ((var12 ^ -1) <= (param0.length ^ -1)) {
                            statePc = 28;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var13 = param0[var12];
                        var14 = var13.f(50);
                        var15 = 1 + (int)(var14 / 5.0f);
                        var16 = var14 / (float)var15;
                        var17 = 1.0f / (float)var15;
                        if (var19 != 0) {
                            statePc = 28;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var18 = var17;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (1.0f <= var18) {
                            statePc = 15;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var6 = var13.a(var18, 255);
                        var7 = var13.a(var18, false);
                        var3_ref.a(var6.field_h, (byte) 110);
                        var3_ref.a(var6.field_f, (byte) 122);
                        var4.a(var7.field_h, (byte) 102);
                        var11 = var11 - var16;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var4.a(var7.field_f, (byte) 110);
                        stackOut_9_0 = (var11 < 0.0f ? -1 : (var11 == 0.0f ? 0 : 1));
                        stackIn_16_0 = stackOut_9_0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var19 != 0) {
                            statePc = 16;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (stackIn_10_0 >= 0) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        param1.a(ef.a(var18, var13, 14, var18 - var17), var4.a(-50), var13.field_k, var3_ref.a(-90), (byte) 49);
                        var3_ref = o.a((byte) 51);
                        var4 = o.a((byte) 21);
                        var3_ref.a(var6.field_h, (byte) 84);
                        var3_ref.a(var6.field_f, (byte) 68);
                        var4.a(var7.field_h, (byte) 67);
                        var11 = var11 + var10;
                        var4.a(var7.field_f, (byte) 77);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        var18 = var18 + var17;
                        if (var19 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6 = var13.h(7560980);
                        var7 = var13.a((byte) 29);
                        var3_ref.a(var6.field_h, (byte) 117);
                        var3_ref.a(var6.field_f, (byte) 66);
                        var4.a(var7.field_h, (byte) 95);
                        var4.a(var7.field_f, (byte) 121);
                        param1.a(ef.a(1.0f, var13, 14, -var17 + var18), var4.a(-60), var13.field_k, var3_ref.a(-127), (byte) 49);
                        var3_ref = o.a((byte) 17);
                        stackOut_15_0 = -128;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var4 = o.a((byte) stackIn_16_0);
                        var3_ref.a(var6.field_h, (byte) 71);
                        var3_ref.a(var6.field_f, (byte) 123);
                        var4.a(var7.field_h, (byte) 91);
                        var4.a(var7.field_f, (byte) 101);
                        var11 = var10;
                        var12++;
                        if (var19 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var3 = (RuntimeException) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        stackOut_19_0 = (RuntimeException) var3;
                        stackOut_19_1 = new StringBuilder().append("mn.C(");
                        stackIn_22_0 = stackOut_19_0;
                        stackIn_22_1 = stackOut_19_1;
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        if (param0 == null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
                        stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
                        stackOut_20_2 = "{...}";
                        stackIn_23_0 = stackOut_20_0;
                        stackIn_23_1 = stackOut_20_1;
                        stackIn_23_2 = stackOut_20_2;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 21: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 22: {
                    stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                    stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                    stackOut_22_2 = "null";
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    stackIn_23_2 = stackOut_22_2;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    try {
                        stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                        stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(44);
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        if (param1 == null) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                        stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                        stackOut_24_2 = "{...}";
                        stackIn_27_0 = stackOut_24_0;
                        stackIn_27_1 = stackOut_24_1;
                        stackIn_27_2 = stackOut_24_2;
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 25;
                        continue stateLoop;
                    }
                }
                case 25: {
                    throw (RuntimeException) (Object) caughtException;
                }
                case 26: {
                    stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                    stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                    stackOut_26_2 = "null";
                    stackIn_27_0 = stackOut_26_0;
                    stackIn_27_1 = stackOut_26_1;
                    stackIn_27_2 = stackOut_26_2;
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    throw kk.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 41);
                }
                case 28: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = true;
        field_b = -1;
    }
}
