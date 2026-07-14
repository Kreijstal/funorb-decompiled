/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kea {
    static boolean field_b;
    static llb field_a;

    final static boolean a(boolean param0, Class param1, String param2) {
        try {
            Class var3 = null;
            RuntimeException var3_ref = null;
            File var4 = null;
            File var4_ref = null;
            NoSuchMethodException var5 = null;
            Throwable var5_ref = null;
            Class var5_ref2 = null;
            Class var6 = null;
            java.lang.reflect.Method var7 = null;
            java.lang.reflect.Method var8 = null;
            int stackIn_8_0 = 0;
            int stackIn_10_0 = 0;
            int stackIn_13_0 = 0;
            int stackIn_20_0 = 0;
            int stackIn_22_0 = 0;
            int stackIn_25_0 = 0;
            RuntimeException stackIn_28_0 = null;
            StringBuilder stackIn_28_1 = null;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_31_0 = null;
            StringBuilder stackIn_31_1 = null;
            String stackIn_31_2 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_34_0 = null;
            StringBuilder stackIn_34_1 = null;
            RuntimeException stackIn_35_0 = null;
            StringBuilder stackIn_35_1 = null;
            String stackIn_35_2 = null;
            int stackOut_7_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_19_0 = 0;
            int stackOut_21_0 = 0;
            int stackOut_24_0 = 0;
            RuntimeException stackOut_27_0 = null;
            StringBuilder stackOut_27_1 = null;
            RuntimeException stackOut_28_0 = null;
            StringBuilder stackOut_28_1 = null;
            String stackOut_28_2 = null;
            RuntimeException stackOut_30_0 = null;
            StringBuilder stackOut_30_1 = null;
            String stackOut_30_2 = null;
            RuntimeException stackOut_31_0 = null;
            StringBuilder stackOut_31_1 = null;
            RuntimeException stackOut_32_0 = null;
            StringBuilder stackOut_32_1 = null;
            String stackOut_32_2 = null;
            RuntimeException stackOut_34_0 = null;
            StringBuilder stackOut_34_1 = null;
            String stackOut_34_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var3 = (Class) fnb.field_c.get((Object) (Object) param2);
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            if (var3 != null) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof NoSuchMethodException ? 3 : 26);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof NoSuchMethodException ? 3 : 26);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var3.getClassLoader() != param1.getClassLoader()) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof NoSuchMethodException ? 6 : 26);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof NoSuchMethodException ? 6 : 26);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            stackOut_7_0 = 0;
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return stackIn_8_0 != 0;
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            if (!param0) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = 1;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        return stackIn_13_0 != 0;
                    }
                    case 14: {
                        try {
                            var4 = null;
                            if (null != var4) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var4_ref = (File) jma.field_q.get((Object) (Object) param2);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (null != var4_ref) {
                                statePc = 19;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof NoSuchMethodException ? 18 : 26);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof NoSuchMethodException ? 18 : 26);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var4 = new File(var4_ref.getCanonicalPath());
                            var5_ref2 = Class.forName("java.lang.Runtime");
                            var6 = Class.forName("java.lang.reflect.AccessibleObject");
                            var7 = var6.getDeclaredMethod("setAccessible", new Class[1]);
                            var8 = var5_ref2.getDeclaredMethod("load0", new Class[2]);
                            Object discarded$5 = var7.invoke((Object) (Object) var8, new Object[1]);
                            Object discarded$6 = var8.invoke((Object) (Object) Runtime.getRuntime(), new Object[2]);
                            Object discarded$7 = var7.invoke((Object) (Object) var8, new Object[1]);
                            Object discarded$8 = fnb.field_c.put((Object) (Object) param2, (Object) (Object) param1);
                            stackOut_19_0 = 1;
                            stackIn_20_0 = stackOut_19_0;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof NoSuchMethodException ? 21 : 23);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        return stackIn_20_0 != 0;
                    }
                    case 21: {
                        try {
                            var5 = (NoSuchMethodException) (Object) caughtException;
                            System.load(var4.getPath());
                            Object discarded$9 = fnb.field_c.put((Object) (Object) param2, (Object) (Object) cd.class);
                            stackOut_21_0 = 1;
                            stackIn_22_0 = stackOut_21_0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        return stackIn_22_0 != 0;
                    }
                    case 23: {
                        try {
                            var5_ref = caughtException;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            stackOut_24_0 = 0;
                            stackIn_25_0 = stackOut_24_0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        return stackIn_25_0 != 0;
                    }
                    case 26: {
                        var3_ref = (RuntimeException) (Object) caughtException;
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            stackOut_27_0 = (RuntimeException) var3_ref;
                            stackOut_27_1 = new StringBuilder().append("kea.A(").append(param0).append(44);
                            stackIn_30_0 = stackOut_27_0;
                            stackIn_30_1 = stackOut_27_1;
                            stackIn_28_0 = stackOut_27_0;
                            stackIn_28_1 = stackOut_27_1;
                            if (param1 == null) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
                            stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
                            stackOut_28_2 = "{...}";
                            stackIn_31_0 = stackOut_28_0;
                            stackIn_31_1 = stackOut_28_1;
                            stackIn_31_2 = stackOut_28_2;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 30: {
                        stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
                        stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
                        stackOut_30_2 = "null";
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        stackIn_31_2 = stackOut_30_2;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
                            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(44);
                            stackIn_34_0 = stackOut_31_0;
                            stackIn_34_1 = stackOut_31_1;
                            stackIn_32_0 = stackOut_31_0;
                            stackIn_32_1 = stackOut_31_1;
                            if (param2 == null) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
                            stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
                            stackOut_32_2 = "{...}";
                            stackIn_35_0 = stackOut_32_0;
                            stackIn_35_1 = stackOut_32_1;
                            stackIn_35_2 = stackOut_32_2;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        throw (RuntimeException) (Object) caughtException;
                    }
                    case 34: {
                        stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
                        stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
                        stackOut_34_2 = "null";
                        stackIn_35_0 = stackOut_34_0;
                        stackIn_35_1 = stackOut_34_1;
                        stackIn_35_2 = stackOut_34_2;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
                        throw rta.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + 41);
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
            field_a = null;
            int var1_int = 35 / ((param0 - 40) / 63);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "kea.B(" + param0 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
    }
}
