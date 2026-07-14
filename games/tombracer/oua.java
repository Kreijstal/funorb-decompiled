/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oua {
    final static ha a(d param0, int param1, byte param2, cn param3, java.awt.Canvas param4) {
        try {
            Class var5 = null;
            RuntimeException var5_ref = null;
            Throwable var5_ref2 = null;
            java.lang.reflect.Method var6 = null;
            ha stackIn_5_0 = null;
            ha stackOut_4_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (mja.a(param2)) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof RuntimeException ? 6 : 7);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 6 : 7);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (in.a("jagdx", 480)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 6 : 7);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof RuntimeException ? 6 : 7);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var5 = Class.forName("cta");
                            var6 = var5.getDeclaredMethod("createToolkit", new Class[4]);
                            stackOut_4_0 = (ha) var6.invoke((Object) null, new Object[4]);
                            stackIn_5_0 = stackOut_4_0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof RuntimeException ? 6 : 7);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        return stackIn_5_0;
                    }
                    case 6: {
                        try {
                            var5_ref = (RuntimeException) (Object) caughtException;
                            throw var5_ref;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var5_ref2 = caughtException;
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
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
