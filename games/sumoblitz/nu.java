/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nu {
    final static ha a(int param0, ki param1, d param2, java.awt.Canvas param3, int param4) {
        try {
            Class var5 = null;
            RuntimeException var5_ref = null;
            Throwable var5_ref2 = null;
            java.lang.reflect.Method var6 = null;
            Object stackIn_7_0 = null;
            ha stackIn_9_0 = null;
            Object stackOut_6_0 = null;
            ha stackOut_8_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (!of.c((byte) 124)) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof RuntimeException ? 10 : 11);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 10 : 11);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 10 : 11);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (mc.b((byte) 125, "jagdx")) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof RuntimeException ? 10 : 11);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof RuntimeException ? 10 : 11);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (param0 == 7023) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof RuntimeException ? 10 : 11);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = null;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof RuntimeException ? 10 : 11);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return (ha) (Object) stackIn_7_0;
                    }
                    case 8: {
                        try {
                            var5 = Class.forName("ir");
                            var6 = var5.getDeclaredMethod("createToolkit", new Class[4]);
                            stackOut_8_0 = (ha) var6.invoke((Object) null, new Object[4]);
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof RuntimeException ? 10 : 11);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            var5_ref = (RuntimeException) (Object) caughtException;
                            throw var5_ref;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var5_ref2 = caughtException;
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var5_ref = (RuntimeException) (Object) caughtException;
                        throw var5_ref;
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
    }
}
