/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ed extends ca {
    static int field_v;
    int field_x;
    static th field_q;
    int field_p;
    int field_s;
    int field_u;
    int field_w;
    int field_r;
    static String[] field_t;

    public static void c(int param0) {
        field_q = null;
        field_t = null;
        if (param0 >= -31) {
            field_v = -74;
        }
    }

    final static void a(int param0, wf param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            wf var6 = null;
            byte[] var7 = null;
            byte[] var8 = null;
            byte[] var9 = null;
            byte stackIn_5_0 = 0;
            int stackIn_9_0 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            byte stackOut_4_0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var9 = new byte[24];
                            var8 = var9;
                            var7 = var8;
                            var2 = var7;
                            if (null == kf.field_y) {
                                statePc = 18;
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
                            kf.field_y.a((byte) 40, 0L);
                            kf.field_y.a(var9, 0);
                            var3_int = 0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = ((Object) stateCaught_2 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (24 <= var3_int) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            stackOut_4_0 = var9[var3_int];
                            stackIn_9_0 = stackOut_4_0;
                            stackIn_5_0 = stackOut_4_0;
                            if (var5 != 0) {
                                statePc = 9;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = ((Object) stateCaught_4 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (stackIn_5_0 != 0) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_int++;
                            if (var5 == 0) {
                                statePc = 3;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = ((Object) stateCaught_6 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackIn_9_0 = -25;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (stackIn_9_0 >= (var3_int ^ -1)) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof Exception ? 13 : 22);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3 = (Exception) ((Object) caughtException);
                            var4 = 0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (-25 >= (var4 ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var7[var4] = (byte)-1;
                            var4++;
                            if (var5 != 0) {
                                statePc = 26;
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
                            if (var5 == 0) {
                                statePc = 14;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (param0 > 79) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var6 = (wf) null;
                            ed.a(-106, (wf) null);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            param1.a(0, var9, 255, 24);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        runtimeException = (RuntimeException) ((Object) caughtException);
                        stackIn_24_0 = (RuntimeException) (runtimeException);
                        stackIn_23_0 = stackIn_24_0;
                        stackIn_24_1 = new StringBuilder().append("ed.GB(").append(param0).append(',');
                        stackIn_23_1 = stackIn_24_1;
                        if (param1 == null) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_23_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_23_1);
                        stackIn_25_2 = "{...}";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                        stackIn_25_2 = "null";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        throw ld.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
                    }
                    case 26: {
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

    final static void a(int param0, sh param1) {
        sd var2 = null;
        try {
            sd.b(param1.a((byte) 127, "", "headers.packvorbis"));
            if (param0 != 0) {
                ed.c(-110);
            }
            var2 = sd.a(param1, "jagex logo2.packvorbis", "");
            var2.c();
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "ed.FB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static eb[] a(sh param0, boolean param1) {
        eb[] stackIn_6_0 = null;
        eb[] stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        eb[] var2 = null;
        RuntimeException var2_ref = null;
        wf var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        eb var7 = null;
        int var8 = 0;
        int var9 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = Lexicominos.field_L ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var2 = new eb[64];
                        if (param1) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_q = (th) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var3 = new wf(param0.a((byte) 127, "", "index"));
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (var3.field_j.length <= var3.field_h) {
                            statePc = 13;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var4 = var3.d(true);
                        var5 = var3.b(-1698573656);
                        var6 = var3.d(true);
                        var7 = new eb(var4, var3.b(-1698573656));
                        stackIn_14_0 = (eb[]) (var2);
                        stackIn_6_0 = stackIn_14_0;
                        if (var9 != 0) {
                            statePc = 14;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackIn_6_0[var7.field_g] = var7;
                        var8 = 0;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (var8 >= var7.field_c.length) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var7.field_c[var8][0] = var3.c(false);
                        var7.field_c[var8][1] = var3.c(false);
                        var8++;
                        if (var9 != 0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var9 == 0) {
                            statePc = 7;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var7.a(new wf(param0.a(var5, -27493, var6)), (byte) 96);
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (var9 == 0) {
                            statePc = 4;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackIn_14_0 = (eb[]) (var2);
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    return stackIn_14_0;
                }
                case 15: {
                    var2_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_17_0 = (RuntimeException) (var2_ref);
                    stackIn_16_0 = stackIn_17_0;
                    stackIn_17_1 = new StringBuilder().append("ed.DB(");
                    stackIn_16_1 = stackIn_17_1;
                    if (param0 == null) {
                        statePc = 17;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 16: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_16_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_16_1);
                    stackIn_18_2 = "{...}";
                    statePc = 18;
                    continue stateLoop;
                }
                case 17: {
                    stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
                    stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
                    stackIn_18_2 = "null";
                    statePc = 18;
                    continue stateLoop;
                }
                case 18: {
                    throw ld.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    ed() {
    }

    static {
        field_v = 0;
    }
}
