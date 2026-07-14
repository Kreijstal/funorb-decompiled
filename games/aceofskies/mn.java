/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mn {
    final static ha a(byte param0, int param1, java.awt.Canvas param2, gk param3, d param4) {
        try {
            Class var5 = null;
            RuntimeException var5_ref = null;
            Throwable var5_ref2 = null;
            java.lang.reflect.Method var6 = null;
            d var7 = null;
            ha stackIn_8_0 = null;
            ha stackOut_7_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (tq.c(true)) {
                                statePc = 2;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = (stateCaught_0 instanceof RuntimeException ? 9 : 10);
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = (stateCaught_1 instanceof RuntimeException ? 9 : 10);
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!ei.a("jagdx", (byte) -16)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = (stateCaught_2 instanceof RuntimeException ? 9 : 10);
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof RuntimeException ? 9 : 10);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof RuntimeException ? 9 : 10);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var5 = Class.forName("kr");
                            if (param0 == 1) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = (stateCaught_5 instanceof RuntimeException ? 9 : 10);
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var7 = (d) null;
                            ha discarded$2 = mn.a((byte) 32, -121, (java.awt.Canvas) null, (gk) null, (d) null);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = (stateCaught_6 instanceof RuntimeException ? 9 : 10);
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var5.getDeclaredMethod("createToolkit", new Class[4]);
                            stackOut_7_0 = (ha) var6.invoke((Object) null, new Object[4]);
                            stackIn_8_0 = stackOut_7_0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof RuntimeException ? 9 : 10);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return (ha) (Object) stackIn_8_0;
                    }
                    case 9: {
                        try {
                            var5_ref = (RuntimeException) (Object) caughtException;
                            throw var5_ref;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var5_ref2 = caughtException;
                            throw new RuntimeException("");
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
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
