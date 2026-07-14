/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ap extends ob {
    static int field_r;
    private j field_q;

    final void e(int param0) {
        Exception var2 = null;
        RuntimeException var2_ref = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        ((ap) this).field_q.b((byte) -118);
                        if (param0 == 20406) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof Exception ? 3 : 6);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        this.a(true, 38);
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof Exception ? 3 : 6);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        var2 = (Exception) (Object) caughtException;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((ap) this).field_q = null;
                        ((ap) this).field_p = -1;
                        ((ap) this).field_j = ((ap) this).field_j + 1;
                        ((ap) this).field_d = (byte)(int)(Math.random() * 255.0 + 1.0);
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var2_ref = (RuntimeException) (Object) caughtException;
                    throw dn.a((Throwable) (Object) var2_ref, "ap.J(" + param0 + 41);
                }
                case 7: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void a(boolean param0, Object param1, boolean param2) {
        try {
            Exception var4 = null;
            IOException var4_ref = null;
            RuntimeException var4_ref2 = null;
            ld var4_ref3 = null;
            Exception var5 = null;
            int var6 = 0;
            int stackIn_13_0 = 0;
            int stackIn_23_0 = 0;
            ng stackIn_32_0 = null;
            ng stackIn_34_0 = null;
            ng stackIn_35_0 = null;
            int stackIn_35_1 = 0;
            RuntimeException stackIn_46_0 = null;
            StringBuilder stackIn_46_1 = null;
            RuntimeException stackIn_48_0 = null;
            StringBuilder stackIn_48_1 = null;
            RuntimeException stackIn_49_0 = null;
            StringBuilder stackIn_49_1 = null;
            String stackIn_49_2 = null;
            int stackOut_12_0 = 0;
            int stackOut_22_0 = 0;
            ng stackOut_31_0 = null;
            ng stackOut_32_0 = null;
            int stackOut_32_1 = 0;
            ng stackOut_34_0 = null;
            int stackOut_34_1 = 0;
            RuntimeException stackOut_45_0 = null;
            StringBuilder stackOut_45_1 = null;
            RuntimeException stackOut_46_0 = null;
            StringBuilder stackOut_46_1 = null;
            String stackOut_46_2 = null;
            RuntimeException stackOut_48_0 = null;
            StringBuilder stackOut_48_1 = null;
            String stackOut_48_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != ((ap) this).field_q) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 44 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 44 : 3);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((ap) this).field_q.b((byte) -118);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof Exception ? 6 : 44);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var4 = (Exception) (Object) caughtException;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((ap) this).field_q = null;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((ap) this).field_q = (j) param1;
                            this.d((byte) -121);
                            this.a(param0, 25);
                            ((ap) this).field_h = null;
                            ((ap) this).field_i.field_f = 0;
                            if (!param2) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            var4_ref3 = (ld) (Object) ((ap) this).field_f.d(-4425);
                            if (var4_ref3 != null) {
                                statePc = 16;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var6 != 0) {
                                statePc = 19;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 15 : 44);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = var6;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 15 : 44);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (stackIn_13_0 == 0) {
                                statePc = 20;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 18 : 44);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 18 : 44);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 18 : 44);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((ap) this).field_m.a((byte) 122, (ij) (Object) var4_ref3);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof Exception ? 18 : 44);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var6 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var4_ref3 = (ld) (Object) ((ap) this).field_a.d(-4425);
                            if (var4_ref3 != null) {
                                statePc = 26;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var6 != 0) {
                                statePc = 29;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof Exception ? 25 : 44);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = var6;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof Exception ? 25 : 44);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (stackIn_23_0 == 0) {
                                statePc = 30;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof Exception ? 28 : 44);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof Exception ? 28 : 44);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof Exception ? 28 : 44);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((ap) this).field_k.a((byte) 110, (ij) (Object) var4_ref3);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof Exception ? 28 : 44);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var6 == 0) {
                                statePc = 20;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((ap) this).field_d == 0) {
                                statePc = 42;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((ap) this).field_n.field_f = 0;
                            ((ap) this).field_n.a(true, 4);
                            stackOut_31_0 = ((ap) this).field_n;
                            stackIn_34_0 = stackOut_31_0;
                            stackIn_32_0 = stackOut_31_0;
                            if (param2) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 37 : (stateCaught_31 instanceof Exception ? 33 : 44));
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            stackOut_32_0 = (ng) (Object) stackIn_32_0;
                            stackOut_32_1 = 1;
                            stackIn_35_0 = stackOut_32_0;
                            stackIn_35_1 = stackOut_32_1;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 37 : (stateCaught_32 instanceof Exception ? 33 : 44));
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 37 : 44);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = (ng) (Object) stackIn_34_0;
                            stackOut_34_1 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 37 : 44);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            ((ng) (Object) stackIn_35_0).a(stackIn_35_1 != 0, (int) ((ap) this).field_d);
                            ((ap) this).field_n.a(0, -16384);
                            ((ap) this).field_q.a(0, 90, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 37 : 44);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var4_ref = (IOException) (Object) caughtException;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            ((ap) this).field_q.b((byte) -118);
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof Exception ? 40 : 44);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var5 = (Exception) (Object) caughtException;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            ((ap) this).field_q = null;
                            ((ap) this).field_j = ((ap) this).field_j + 1;
                            ((ap) this).field_p = -2;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((ap) this).field_c = 0;
                            ((ap) this).field_e = lo.a((byte) -33);
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 44;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        var4_ref2 = (RuntimeException) (Object) caughtException;
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        try {
                            stackOut_45_0 = (RuntimeException) var4_ref2;
                            stackOut_45_1 = new StringBuilder().append("ap.D(").append(param0).append(44);
                            stackIn_48_0 = stackOut_45_0;
                            stackIn_48_1 = stackOut_45_1;
                            stackIn_46_0 = stackOut_45_0;
                            stackIn_46_1 = stackOut_45_1;
                            if (param1 == null) {
                                statePc = 48;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
                            stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
                            stackOut_46_2 = "{...}";
                            stackIn_49_0 = stackOut_46_0;
                            stackIn_49_1 = stackOut_46_1;
                            stackIn_49_2 = stackOut_46_2;
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 47;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 48: {
                        stackOut_48_0 = (RuntimeException) (Object) stackIn_48_0;
                        stackOut_48_1 = (StringBuilder) (Object) stackIn_48_1;
                        stackOut_48_2 = "null";
                        stackIn_49_0 = stackOut_48_0;
                        stackIn_49_1 = stackOut_48_1;
                        stackIn_49_2 = stackOut_48_2;
                        statePc = 49;
                        continue stateLoop;
                    }
                    case 49: {
                        throw dn.a((Throwable) (Object) stackIn_49_0, stackIn_49_2 + 44 + param2 + 41);
                    }
                    case 50: {
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

    private final void a(boolean param0, int param1) {
        try {
            int var3_int = 0;
            RuntimeException var3 = null;
            IOException var4 = null;
            Exception var5 = null;
            ng stackIn_3_0 = null;
            int stackIn_3_1 = 0;
            ng stackIn_5_0 = null;
            int stackIn_5_1 = 0;
            ng stackIn_6_0 = null;
            int stackIn_6_1 = 0;
            int stackIn_6_2 = 0;
            ng stackOut_2_0 = null;
            int stackOut_2_1 = 0;
            ng stackOut_3_0 = null;
            int stackOut_3_1 = 0;
            int stackOut_3_2 = 0;
            ng stackOut_5_0 = null;
            int stackOut_5_1 = 0;
            int stackOut_5_2 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3_int = -20 / ((param1 - -57) / 33);
                            if (((ap) this).field_q != null) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        try {
                            ((ap) this).field_n.field_f = 0;
                            stackOut_2_0 = ((ap) this).field_n;
                            stackOut_2_1 = 1;
                            stackIn_5_0 = stackOut_2_0;
                            stackIn_5_1 = stackOut_2_1;
                            stackIn_3_0 = stackOut_2_0;
                            stackIn_3_1 = stackOut_2_1;
                            if (param0) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 8 : 14);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            stackOut_3_0 = (ng) (Object) stackIn_3_0;
                            stackOut_3_1 = stackIn_3_1;
                            stackOut_3_2 = 3;
                            stackIn_6_0 = stackOut_3_0;
                            stackIn_6_1 = stackOut_3_1;
                            stackIn_6_2 = stackOut_3_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof IOException ? 8 : 14);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            stackOut_5_0 = (ng) (Object) stackIn_5_0;
                            stackOut_5_1 = stackIn_5_1;
                            stackOut_5_2 = 2;
                            stackIn_6_0 = stackOut_5_0;
                            stackIn_6_1 = stackOut_5_1;
                            stackIn_6_2 = stackOut_5_2;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof IOException ? 8 : 14);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((ng) (Object) stackIn_6_0).a(stackIn_6_1 != 0, stackIn_6_2);
                            ((ap) this).field_n.a(0L, false);
                            ((ap) this).field_q.a(0, 108, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof IOException ? 8 : 14);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var4 = (IOException) (Object) caughtException;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((ap) this).field_q.b((byte) -118);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof Exception ? 11 : 14);
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
                            var5 = (Exception) (Object) caughtException;
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
                            ((ap) this).field_p = -2;
                            ((ap) this).field_j = ((ap) this).field_j + 1;
                            ((ap) this).field_q = null;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var3 = (RuntimeException) (Object) caughtException;
                        throw dn.a((Throwable) (Object) var3, "ap.K(" + param0 + 44 + param1 + 41);
                    }
                    case 15: {
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

    private final void d(byte param0) {
        try {
            int var2_int = 0;
            RuntimeException var2 = null;
            IOException var3 = null;
            Exception var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2_int = -62 % ((19 - param0) / 51);
                            if (null != ((ap) this).field_q) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        return;
                    }
                    case 2: {
                        try {
                            ((ap) this).field_n.field_f = 0;
                            ((ap) this).field_n.a(true, 6);
                            ((ap) this).field_n.a((byte) 104, 3);
                            ((ap) this).field_n.c(-161478600, 0);
                            ((ap) this).field_q.a(0, 124, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof IOException ? 4 : 10);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var3 = (IOException) (Object) caughtException;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            ((ap) this).field_q.b((byte) -118);
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof Exception ? 7 : 10);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4 = (Exception) (Object) caughtException;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((ap) this).field_j = ((ap) this).field_j + 1;
                            ((ap) this).field_p = -2;
                            ((ap) this).field_q = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2 = (RuntimeException) (Object) caughtException;
                        throw dn.a((Throwable) (Object) var2, "ap.L(" + param0 + 41);
                    }
                    case 11: {
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

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        md var1_ref = null;
        int var2 = 0;
        int var3_int = 0;
        String var3 = null;
        String var4_ref = null;
        int var4 = 0;
        String var5 = null;
        ce var6 = null;
        String var7 = null;
        ce var7_ref = null;
        int var8 = 0;
        int stackIn_17_0 = 0;
        int stackIn_26_0 = 0;
        ce stackIn_70_0 = null;
        ce stackIn_71_0 = null;
        ce stackIn_77_0 = null;
        ce stackIn_79_0 = null;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_25_0 = 0;
        ce stackOut_69_0 = null;
        ce stackOut_70_0 = null;
        ce stackOut_76_0 = null;
        ce stackOut_77_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = CrazyCrystals.field_B;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ap.a(true);
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        var1_ref = kd.field_n;
                        var2 = var1_ref.h(255);
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (0 == var2) {
                            statePc = 9;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (null != vl.field_d) {
                            statePc = 13;
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
                        vl.field_d = new vp(128);
                        hl.field_h = 0;
                        statePc = 11;
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
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var1_ref.h(255) != 1) {
                            statePc = 16;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        stackOut_14_0 = 1;
                        stackIn_17_0 = stackOut_14_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var3_int = stackIn_17_0;
                        var4_ref = var1_ref.i(117);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if (var3_int != 0) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        String discarded$1 = var1_ref.i(110);
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        if (param0) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        stackOut_23_0 = 1;
                        stackIn_26_0 = stackOut_23_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 24;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        stackOut_25_0 = 0;
                        stackIn_26_0 = stackOut_25_0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var5 = (String) (Object) fk.a(stackIn_26_0 != 0, var4_ref);
                        var6 = (ce) (Object) var1_ref.i(122);
                        var7 = fe.a(60136, (CharSequence) (Object) var4_ref);
                        if (var7 != null) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        var7 = var4_ref;
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        if (null != var5) {
                            statePc = 34;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5 = (String) (Object) fk.a(true, (String) (Object) var6);
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (var5 != null) {
                            statePc = 33;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        vl.field_d.a((ij) (Object) var5, (long)var7.hashCode(), (byte) 125);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (var5 == null) {
                            statePc = 37;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        var5 = (String) (Object) new ce();
                        vl.field_d.a((ij) (Object) var5, (long)var7.hashCode(), (byte) 104);
                        hl.field_h = hl.field_h + 1;
                        ((ce) (Object) var5).field_db = hl.field_h;
                        g.field_b.b(0, (jb) (Object) var5);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((ce) (Object) var5).field_fb = var4_ref;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 39: {
                    return;
                }
                case 40: {
                    try {
                        if (var2 == 1) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        statePc = 84;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (null != me.field_f) {
                            statePc = 47;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        me.field_f = new vp(128);
                        ob.field_g = 0;
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var3 = var1_ref.i(118);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (var3.equals((Object) (Object) "")) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        var3 = null;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        var4_ref = var1_ref.i(119);
                        var5 = var1_ref.i(123);
                        var6 = rg.a(var4_ref, (byte) -3);
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        if (null == var6) {
                            statePc = 56;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        var6 = rg.a(var5, (byte) -1);
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (var6 == null) {
                            statePc = 61;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        me.field_f.a((ij) (Object) var6, (long)fe.a(60136, (CharSequence) (Object) var4_ref).hashCode(), (byte) 92);
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 60;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var6 != null) {
                            statePc = 63;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        var6 = new ce();
                        me.field_f.a((ij) (Object) var6, (long)fe.a(60136, (CharSequence) (Object) var4_ref).hashCode(), (byte) 85);
                        ob.field_g = ob.field_g + 1;
                        var6.field_db = ob.field_g;
                        df.field_b.b(0, (jb) (Object) var6);
                        statePc = 63;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        if (null != var3) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 65;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var3 = var3.intern();
                        statePc = 67;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var6.field_cb = var3;
                        var6.field_fb = var4_ref;
                        var6.a(param0);
                        var7_ref = (ce) (Object) df.field_b.g(32073);
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var7_ref == null) {
                            statePc = 75;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackOut_69_0 = (ce) var6;
                        stackIn_70_0 = stackOut_69_0;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        stackOut_70_0 = (ce) (Object) stackIn_70_0;
                        stackIn_79_0 = stackOut_70_0;
                        stackIn_71_0 = stackOut_70_0;
                        if (var8 != 0) {
                            statePc = 79;
                        } else {
                            statePc = 71;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (!ll.a(stackIn_71_0, 0, var7_ref)) {
                            statePc = 75;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 73;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        statePc = 74;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        var7_ref = (ce) (Object) df.field_b.a(false);
                        if (var8 == 0) {
                            statePc = 68;
                        } else {
                            statePc = 75;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        if (null == var7_ref) {
                            statePc = 80;
                        } else {
                            statePc = 76;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackOut_76_0 = (ce) var7_ref;
                        stackIn_77_0 = stackOut_76_0;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 78;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        stackOut_77_0 = (ce) (Object) stackIn_77_0;
                        stackIn_79_0 = stackOut_77_0;
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        rf.a((jb) (Object) stackIn_79_0, (jb) (Object) var6, 47);
                        if (var8 == 0) {
                            statePc = 83;
                        } else {
                            statePc = 80;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        df.field_b.b(0, (jb) (Object) var6);
                        statePc = 81;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 83: {
                    return;
                }
                case 84: {
                    try {
                        if ((var2 ^ -1) != -3) {
                            statePc = 92;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        if (1 == mh.field_h) {
                            statePc = 90;
                        } else {
                            statePc = 86;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 86: {
                    try {
                        statePc = 88;
                        continue stateLoop;
                    } catch (Throwable stateCaught_86) {
                        caughtException = stateCaught_86;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 89;
                        continue stateLoop;
                    }
                }
                case 89: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_89) {
                        caughtException = stateCaught_89;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        mh.field_h = 2;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 91: {
                    return;
                }
                case 92: {
                    try {
                        if (var2 == 3) {
                            statePc = 95;
                        } else {
                            statePc = 93;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        statePc = 100;
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (2 == mh.field_h) {
                            statePc = 98;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 97;
                        continue stateLoop;
                    }
                }
                case 97: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_97) {
                        caughtException = stateCaught_97;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        mh.field_h = 1;
                        statePc = 99;
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 99: {
                    return;
                }
                case 100: {
                    try {
                        if (4 != var2) {
                            statePc = 103;
                        } else {
                            statePc = 101;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_100) {
                        caughtException = stateCaught_100;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        mh.field_h = 1;
                        var3 = var1_ref.i(111);
                        nh.field_z = var3.intern();
                        var4 = var1_ref.h(255);
                        wl.a(7, var4);
                        statePc = 102;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 102: {
                    return;
                }
                case 103: {
                    try {
                        wp.a((Throwable) null, "F1: " + ug.a(-1815), 21862);
                        jj.a(4);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 105;
                        continue stateLoop;
                    }
                }
                case 105: {
                    var1 = (RuntimeException) (Object) caughtException;
                    throw dn.a((Throwable) (Object) var1, "ap.M(" + param0 + 41);
                }
                case 106: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean b(byte param0) {
        try {
            IOException var2 = null;
            RuntimeException var2_ref = null;
            long var2_long = 0L;
            ld var2_ref2 = null;
            int var2_int = 0;
            Exception var3 = null;
            int var3_int = 0;
            int var4 = 0;
            Exception var5_ref_Exception = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            int var11 = 0;
            long var12 = 0L;
            Object var14 = null;
            ld var14_ref = null;
            int var15 = 0;
            int var16 = 0;
            int stackIn_19_0 = 0;
            int stackIn_21_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_40_0 = 0;
            int stackIn_41_0 = 0;
            int stackIn_41_1 = 0;
            int stackIn_102_0 = 0;
            int stackIn_106_0 = 0;
            int stackIn_108_0 = 0;
            int stackIn_115_0 = 0;
            int stackIn_123_0 = 0;
            int stackIn_127_0 = 0;
            int stackIn_145_0 = 0;
            int stackIn_155_0 = 0;
            int stackIn_157_0 = 0;
            int stackOut_18_0 = 0;
            int stackOut_20_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_39_0 = 0;
            int stackOut_40_0 = 0;
            int stackOut_40_1 = 0;
            int stackOut_99_0 = 0;
            int stackOut_101_0 = 0;
            int stackOut_105_0 = 0;
            int stackOut_106_0 = 0;
            int stackOut_114_0 = 0;
            int stackOut_122_0 = 0;
            int stackOut_124_0 = 0;
            int stackOut_126_0 = 0;
            int stackOut_144_0 = 0;
            int stackOut_154_0 = 0;
            int stackOut_156_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = CrazyCrystals.field_B;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((ap) this).field_q != null) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 158 : 3);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 158 : 3);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var2_long = lo.a((byte) 95);
                            var4 = (int)(-((ap) this).field_e + var2_long);
                            if (var4 <= 200) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var4 = 200;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((ap) this).field_e = var2_long;
                            ((ap) this).field_c = ((ap) this).field_c + var4;
                            if (((ap) this).field_c <= 30000) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((ap) this).field_q.b((byte) -118);
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof Exception ? 9 : 158);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var5_ref_Exception = (Exception) (Object) caughtException;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((ap) this).field_q = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (null == ((ap) this).field_q) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof Exception ? 13 : 158);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof Exception ? 13 : 158);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (-1 != (((ap) this).b(20) ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 17 : 158);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (0 == ((ap) this).d(20)) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof Exception ? 17 : 158);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            stackOut_18_0 = 0;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return stackIn_19_0 != 0;
                    }
                    case 20: {
                        try {
                            stackOut_20_0 = 1;
                            stackIn_21_0 = stackOut_20_0;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return stackIn_21_0 != 0;
                    }
                    case 22: {
                        try {
                            ((ap) this).field_q.a(-128);
                            var2_ref2 = (ld) (Object) ((ap) this).field_m.b(120);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (null == var2_ref2) {
                                statePc = 29;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((ap) this).field_n.field_f = 0;
                            ((ap) this).field_n.a(true, 1);
                            ((ap) this).field_n.a(var2_ref2.field_k, false);
                            ((ap) this).field_q.a(0, 106, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
                            ((ap) this).field_f.a((byte) 113, (ij) (Object) var2_ref2);
                            var2_ref2 = (ld) (Object) ((ap) this).field_m.a(127);
                            stackOut_24_0 = var16;
                            stackIn_25_0 = stackOut_24_0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (stackIn_25_0 != 0) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 146 : (stateCaught_25 instanceof Exception ? 28 : 158));
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var16 == 0) {
                                statePc = 23;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 146 : (stateCaught_26 instanceof Exception ? 28 : 158));
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var2_ref2 = (ld) (Object) ((ap) this).field_k.b(124);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var2_ref2 == null) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            ((ap) this).field_n.field_f = 0;
                            ((ap) this).field_n.a(true, 0);
                            ((ap) this).field_n.a(var2_ref2.field_k, false);
                            ((ap) this).field_q.a(0, 116, ((ap) this).field_n.field_h, ((ap) this).field_n.field_h.length);
                            ((ap) this).field_a.a((byte) 111, (ij) (Object) var2_ref2);
                            var2_ref2 = (ld) (Object) ((ap) this).field_k.a(104);
                            if (var16 == 0) {
                                statePc = 30;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var2_int = 0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (param0 >= 60) {
                                statePc = 37;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof IOException ? 146 : (stateCaught_33 instanceof Exception ? 36 : 158));
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            ((ap) this).e(111);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof IOException ? 146 : (stateCaught_34 instanceof Exception ? 36 : 158));
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var2_int >= 100) {
                                statePc = 144;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var3_int = ((ap) this).field_q.c(0);
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            stackOut_39_0 = var3_int ^ -1;
                            stackIn_145_0 = stackOut_39_0;
                            stackIn_40_0 = stackOut_39_0;
                            if (var16 != 0) {
                                statePc = 145;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof IOException ? 146 : (stateCaught_39 instanceof Exception ? 43 : 158));
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            stackOut_40_0 = stackIn_40_0;
                            stackOut_40_1 = -1;
                            stackIn_41_0 = stackOut_40_0;
                            stackIn_41_1 = stackOut_40_1;
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof IOException ? 146 : (stateCaught_40 instanceof Exception ? 43 : 158));
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (stackIn_41_0 <= stackIn_41_1) {
                                statePc = 46;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof IOException ? 146 : (stateCaught_41 instanceof Exception ? 45 : 158));
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof IOException ? 146 : (stateCaught_42 instanceof Exception ? 45 : 158));
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof IOException ? 146 : (stateCaught_43 instanceof Exception ? 45 : 158));
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof IOException ? 146 : (stateCaught_44 instanceof Exception ? 45 : 158));
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (0 == var3_int) {
                                statePc = 144;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            ((ap) this).field_c = 0;
                            var4 = 0;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (((ap) this).field_h == null) {
                                statePc = 55;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof IOException ? 146 : (stateCaught_48 instanceof Exception ? 51 : 158));
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            if (0 == ((ap) this).field_h.field_t) {
                                statePc = 54;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof IOException ? 146 : (stateCaught_49 instanceof Exception ? 53 : 158));
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof IOException ? 146 : (stateCaught_50 instanceof Exception ? 53 : 158));
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof IOException ? 146 : (stateCaught_51 instanceof Exception ? 53 : 158));
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof IOException ? 146 : (stateCaught_52 instanceof Exception ? 53 : 158));
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var4 = 1;
                            if (var16 == 0) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var4 = 10;
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (-1 > (var4 ^ -1)) {
                                statePc = 81;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var5 = ((ap) this).field_h.field_s.field_h.length - ((ap) this).field_h.field_u;
                            var6 = -((ap) this).field_h.field_t + 512;
                            if (var6 <= var5 - ((ap) this).field_h.field_s.field_f) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var6 = var5 + -((ap) this).field_h.field_s.field_f;
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (var6 > var3_int) {
                                statePc = 62;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof IOException ? 146 : (stateCaught_59 instanceof Exception ? 61 : 158));
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof IOException ? 146 : (stateCaught_60 instanceof Exception ? 61 : 158));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var6 = var3_int;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((ap) this).field_q.a(((ap) this).field_h.field_s.field_h, var6, 2034, ((ap) this).field_h.field_s.field_f);
                            if (((ap) this).field_d == 0) {
                                statePc = 70;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var7 = 0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (var6 <= var7) {
                                statePc = 70;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            ((ap) this).field_h.field_s.field_h[var7 + ((ap) this).field_h.field_s.field_f] = (byte)oe.a((int) ((ap) this).field_h.field_s.field_h[var7 + ((ap) this).field_h.field_s.field_f], (int) ((ap) this).field_d);
                            var7++;
                            if (var16 != 0) {
                                statePc = 71;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof IOException ? 146 : (stateCaught_66 instanceof Exception ? 69 : 158));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var16 == 0) {
                                statePc = 65;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof IOException ? 146 : (stateCaught_67 instanceof Exception ? 69 : 158));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            ((ap) this).field_h.field_s.field_f = ((ap) this).field_h.field_s.field_f + var6;
                            ((ap) this).field_h.field_t = ((ap) this).field_h.field_t + var6;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var5 != ((ap) this).field_h.field_s.field_f) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof IOException ? 146 : (stateCaught_71 instanceof Exception ? 74 : 158));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            ((ap) this).field_h.a(1);
                            ((ap) this).field_h.field_n = false;
                            ((ap) this).field_h = null;
                            if (var16 == 0) {
                                statePc = 143;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof IOException ? 146 : (stateCaught_72 instanceof Exception ? 77 : 158));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof IOException ? 146 : (stateCaught_73 instanceof Exception ? 77 : 158));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof IOException ? 146 : (stateCaught_74 instanceof Exception ? 77 : 158));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (-513 != (((ap) this).field_h.field_t ^ -1)) {
                                statePc = 143;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof IOException ? 146 : (stateCaught_75 instanceof Exception ? 80 : 158));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof IOException ? 146 : (stateCaught_76 instanceof Exception ? 80 : 158));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof IOException ? 146 : (stateCaught_77 instanceof Exception ? 80 : 158));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((ap) this).field_h.field_t = 0;
                            if (var16 == 0) {
                                statePc = 143;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof IOException ? 146 : (stateCaught_78 instanceof Exception ? 80 : 158));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var5 = var4 - ((ap) this).field_i.field_f;
                            if (var5 <= var3_int) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var5 = var3_int;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ((ap) this).field_q.a(((ap) this).field_i.field_h, var5, 2034, ((ap) this).field_i.field_f);
                            if ((((ap) this).field_d ^ -1) == -1) {
                                statePc = 90;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var6 = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if ((var5 ^ -1) >= (var6 ^ -1)) {
                                statePc = 90;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((ap) this).field_i.field_h[((ap) this).field_i.field_f - -var6] = (byte)oe.a((int) ((ap) this).field_i.field_h[((ap) this).field_i.field_f + var6], (int) ((ap) this).field_d);
                            var6++;
                            if (var16 != 0) {
                                statePc = 91;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof IOException ? 146 : (stateCaught_86 instanceof Exception ? 89 : 158));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            if (var16 == 0) {
                                statePc = 85;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof IOException ? 146 : (stateCaught_87 instanceof Exception ? 89 : 158));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            ((ap) this).field_i.field_f = ((ap) this).field_i.field_f + var5;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (var4 > ((ap) this).field_i.field_f) {
                                statePc = 143;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof IOException ? 146 : (stateCaught_91 instanceof Exception ? 94 : 158));
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (null == ((ap) this).field_h) {
                                statePc = 97;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof IOException ? 146 : (stateCaught_92 instanceof Exception ? 96 : 158));
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof IOException ? 146 : (stateCaught_93 instanceof Exception ? 96 : 158));
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof IOException ? 146 : (stateCaught_94 instanceof Exception ? 96 : 158));
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 129;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof IOException ? 146 : (stateCaught_95 instanceof Exception ? 96 : 158));
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            ((ap) this).field_i.field_f = 0;
                            var6 = ((ap) this).field_i.h(255);
                            var7 = ((ap) this).field_i.b((byte) 126);
                            var8 = ((ap) this).field_i.h(255);
                            var9 = ((ap) this).field_i.b((byte) 127);
                            var10 = 127 & var8;
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (-1 == (var8 & 128 ^ -1)) {
                                statePc = 101;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof IOException ? 146 : (stateCaught_98 instanceof Exception ? 100 : 158));
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            stackOut_99_0 = 1;
                            stackIn_102_0 = stackOut_99_0;
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof IOException ? 146 : (stateCaught_99 instanceof Exception ? 100 : 158));
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            stackOut_101_0 = 0;
                            stackIn_102_0 = stackOut_101_0;
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var11 = stackIn_102_0;
                            var12 = (long)var7 + ((long)var6 << -643036640);
                            var14 = null;
                            if (var11 == 0) {
                                statePc = 112;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var14_ref = (ld) (Object) ((ap) this).field_a.b(120);
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            if (var14_ref == null) {
                                statePc = 119;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof IOException ? 146 : (stateCaught_104 instanceof Exception ? 107 : 158));
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            stackOut_105_0 = ((var14_ref.field_k ^ -1L) < (var12 ^ -1L) ? -1 : ((var14_ref.field_k ^ -1L) == (var12 ^ -1L) ? 0 : 1));
                            stackIn_123_0 = stackOut_105_0;
                            stackIn_106_0 = stackOut_105_0;
                            if (var16 != 0) {
                                statePc = 123;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof IOException ? 146 : (stateCaught_105 instanceof Exception ? 110 : 158));
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            stackOut_106_0 = stackIn_106_0;
                            stackIn_108_0 = stackOut_106_0;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof IOException ? 146 : (stateCaught_106 instanceof Exception ? 110 : 158));
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof IOException ? 146 : (stateCaught_107 instanceof Exception ? 110 : 158));
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            if (stackIn_108_0 == 0) {
                                statePc = 119;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof IOException ? 146 : (stateCaught_108 instanceof Exception ? 110 : 158));
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var14_ref = (ld) (Object) ((ap) this).field_a.a(93);
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var14_ref = (ld) (Object) ((ap) this).field_f.b(114);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            if (var14_ref == null) {
                                statePc = 119;
                            } else {
                                statePc = 114;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            stackOut_114_0 = (var14_ref.field_k < var12 ? -1 : (var14_ref.field_k == var12 ? 0 : 1));
                            stackIn_123_0 = stackOut_114_0;
                            stackIn_115_0 = stackOut_114_0;
                            if (var16 != 0) {
                                statePc = 123;
                            } else {
                                statePc = 115;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof IOException ? 146 : (stateCaught_114 instanceof Exception ? 117 : 158));
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            if (stackIn_115_0 == 0) {
                                statePc = 119;
                            } else {
                                statePc = 116;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = (stateCaught_115 instanceof IOException ? 146 : (stateCaught_115 instanceof Exception ? 117 : 158));
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = (stateCaught_116 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = (stateCaught_117 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            var14_ref = (ld) (Object) ((ap) this).field_f.a(96);
                            if (var16 == 0) {
                                statePc = 113;
                            } else {
                                statePc = 119;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = (stateCaught_118 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            if (var14_ref != null) {
                                statePc = 122;
                            } else {
                                statePc = 120;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = (stateCaught_119 instanceof IOException ? 146 : (stateCaught_119 instanceof Exception ? 121 : 158));
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = (stateCaught_120 instanceof IOException ? 146 : (stateCaught_120 instanceof Exception ? 121 : 158));
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = (stateCaught_121 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 122: {
                        try {
                            stackOut_122_0 = -1;
                            stackIn_123_0 = stackOut_122_0;
                            statePc = 123;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = (stateCaught_122 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            if (stackIn_123_0 == (var10 ^ -1)) {
                                statePc = 126;
                            } else {
                                statePc = 124;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = (stateCaught_123 instanceof IOException ? 146 : (stateCaught_123 instanceof Exception ? 125 : 158));
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            stackOut_124_0 = 9;
                            stackIn_127_0 = stackOut_124_0;
                            statePc = 127;
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = (stateCaught_124 instanceof IOException ? 146 : (stateCaught_124 instanceof Exception ? 125 : 158));
                            continue stateLoop;
                        }
                    }
                    case 125: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_125) {
                            caughtException = stateCaught_125;
                            statePc = (stateCaught_125 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            stackOut_126_0 = 5;
                            stackIn_127_0 = stackOut_126_0;
                            statePc = 127;
                            continue stateLoop;
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = (stateCaught_126 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 127: {
                        try {
                            var15 = stackIn_127_0;
                            statePc = 128;
                            continue stateLoop;
                        } catch (Throwable stateCaught_127) {
                            caughtException = stateCaught_127;
                            statePc = (stateCaught_127 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        try {
                            ((ap) this).field_h = var14_ref;
                            ((ap) this).field_h.field_s = new ng(((ap) this).field_h.field_u + (var15 + var9));
                            ((ap) this).field_h.field_s.a(true, var10);
                            ((ap) this).field_h.field_s.a(var9, -16384);
                            ((ap) this).field_h.field_t = 10;
                            ((ap) this).field_i.field_f = 0;
                            if (var16 == 0) {
                                statePc = 143;
                            } else {
                                statePc = 129;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_128) {
                            caughtException = stateCaught_128;
                            statePc = (stateCaught_128 instanceof IOException ? 146 : (stateCaught_128 instanceof Exception ? 131 : 158));
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            if (0 == ((ap) this).field_h.field_t) {
                                statePc = 134;
                            } else {
                                statePc = 130;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = (stateCaught_129 instanceof IOException ? 146 : (stateCaught_129 instanceof Exception ? 133 : 158));
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            statePc = 132;
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = (stateCaught_130 instanceof IOException ? 146 : (stateCaught_130 instanceof Exception ? 133 : 158));
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = (stateCaught_131 instanceof IOException ? 146 : (stateCaught_131 instanceof Exception ? 133 : 158));
                            continue stateLoop;
                        }
                    }
                    case 132: {
                        try {
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_132) {
                            caughtException = stateCaught_132;
                            statePc = (stateCaught_132 instanceof IOException ? 146 : (stateCaught_132 instanceof Exception ? 133 : 158));
                            continue stateLoop;
                        }
                    }
                    case 133: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_133) {
                            caughtException = stateCaught_133;
                            statePc = (stateCaught_133 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 134: {
                        try {
                            if ((((ap) this).field_i.field_h[0] ^ -1) == 0) {
                                statePc = 138;
                            } else {
                                statePc = 135;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_134) {
                            caughtException = stateCaught_134;
                            statePc = (stateCaught_134 instanceof IOException ? 146 : (stateCaught_134 instanceof Exception ? 137 : 158));
                            continue stateLoop;
                        }
                    }
                    case 135: {
                        try {
                            ((ap) this).field_h = null;
                            if (var16 == 0) {
                                statePc = 143;
                            } else {
                                statePc = 136;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_135) {
                            caughtException = stateCaught_135;
                            statePc = (stateCaught_135 instanceof IOException ? 146 : (stateCaught_135 instanceof Exception ? 140 : 158));
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            statePc = 138;
                            continue stateLoop;
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = (stateCaught_136 instanceof IOException ? 146 : (stateCaught_136 instanceof Exception ? 140 : 158));
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = (stateCaught_137 instanceof IOException ? 146 : (stateCaught_137 instanceof Exception ? 140 : 158));
                            continue stateLoop;
                        }
                    }
                    case 138: {
                        try {
                            ((ap) this).field_h.field_t = 1;
                            ((ap) this).field_i.field_f = 0;
                            if (var16 == 0) {
                                statePc = 143;
                            } else {
                                statePc = 139;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = (stateCaught_138 instanceof IOException ? 146 : (stateCaught_138 instanceof Exception ? 142 : 158));
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            statePc = 141;
                            continue stateLoop;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = (stateCaught_139 instanceof IOException ? 146 : (stateCaught_139 instanceof Exception ? 142 : 158));
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = (stateCaught_140 instanceof IOException ? 146 : (stateCaught_140 instanceof Exception ? 142 : 158));
                            continue stateLoop;
                        }
                    }
                    case 141: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_141) {
                            caughtException = stateCaught_141;
                            statePc = (stateCaught_141 instanceof IOException ? 146 : (stateCaught_141 instanceof Exception ? 142 : 158));
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_142) {
                            caughtException = stateCaught_142;
                            statePc = (stateCaught_142 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 143: {
                        try {
                            var2_int++;
                            if (var16 == 0) {
                                statePc = 37;
                            } else {
                                statePc = 144;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_143) {
                            caughtException = stateCaught_143;
                            statePc = (stateCaught_143 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 144: {
                        try {
                            stackOut_144_0 = 1;
                            stackIn_145_0 = stackOut_144_0;
                            statePc = 145;
                            continue stateLoop;
                        } catch (Throwable stateCaught_144) {
                            caughtException = stateCaught_144;
                            statePc = (stateCaught_144 instanceof IOException ? 146 : 158);
                            continue stateLoop;
                        }
                    }
                    case 145: {
                        return stackIn_145_0 != 0;
                    }
                    case 146: {
                        try {
                            var2 = (IOException) (Object) caughtException;
                            statePc = 147;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        try {
                            ((ap) this).field_q.b((byte) -118);
                            statePc = 148;
                            continue stateLoop;
                        } catch (Throwable stateCaught_147) {
                            caughtException = stateCaught_147;
                            statePc = (stateCaught_147 instanceof Exception ? 149 : 158);
                            continue stateLoop;
                        }
                    }
                    case 148: {
                        try {
                            statePc = 150;
                            continue stateLoop;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        try {
                            var3 = (Exception) (Object) caughtException;
                            statePc = 150;
                            continue stateLoop;
                        } catch (Throwable stateCaught_149) {
                            caughtException = stateCaught_149;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 150: {
                        try {
                            ((ap) this).field_q = null;
                            ((ap) this).field_p = -2;
                            ((ap) this).field_j = ((ap) this).field_j + 1;
                            if (0 != ((ap) this).b(20)) {
                                statePc = 154;
                            } else {
                                statePc = 151;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_150) {
                            caughtException = stateCaught_150;
                            statePc = (stateCaught_150 instanceof Exception ? 153 : 158);
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        try {
                            if (0 == ((ap) this).d(20)) {
                                statePc = 156;
                            } else {
                                statePc = 152;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = (stateCaught_151 instanceof Exception ? 153 : 158);
                            continue stateLoop;
                        }
                    }
                    case 152: {
                        try {
                            statePc = 154;
                            continue stateLoop;
                        } catch (Throwable stateCaught_152) {
                            caughtException = stateCaught_152;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 153: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_153) {
                            caughtException = stateCaught_153;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 154: {
                        try {
                            stackOut_154_0 = 0;
                            stackIn_155_0 = stackOut_154_0;
                            statePc = 155;
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        return stackIn_155_0 != 0;
                    }
                    case 156: {
                        try {
                            stackOut_156_0 = 1;
                            stackIn_157_0 = stackOut_156_0;
                            statePc = 157;
                            continue stateLoop;
                        } catch (Throwable stateCaught_156) {
                            caughtException = stateCaught_156;
                            statePc = 158;
                            continue stateLoop;
                        }
                    }
                    case 157: {
                        return stackIn_157_0 != 0;
                    }
                    case 158: {
                        var2_ref = (RuntimeException) (Object) caughtException;
                        throw dn.a((Throwable) (Object) var2_ref, "ap.E(" + param0 + 41);
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

    final void a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          try {
            L0: {
              if (((ap) this).field_q == null) {
                break L0;
              } else {
                ((ap) this).field_q.b((byte) -118);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          var2_int = -61 / ((-61 - param0) / 62);
        }
    }

    public ap() {
    }

    static {
    }
}
