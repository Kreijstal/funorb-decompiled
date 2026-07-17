/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class asa extends aa {
    static String field_d;
    static aba field_a;
    static long field_c;
    im field_b;
    static int field_e;

    public static void a(int param0) {
        field_d = null;
        field_a = null;
    }

    final static Object a(File param0, byte param1) {
        try {
            IOException var2 = null;
            ClassNotFoundException var2_ref = null;
            RuntimeException var2_ref2 = null;
            FileInputStream var2_ref3 = null;
            ObjectInputStream var3 = null;
            Object var4 = null;
            Object stackIn_2_0 = null;
            Object stackIn_6_0 = null;
            Object stackIn_10_0 = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            String stackIn_14_2 = null;
            Object stackOut_1_0 = null;
            Object stackOut_5_0 = null;
            Object stackOut_9_0 = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param0.exists()) {
                                statePc = 3;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            stackOut_1_0 = null;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return stackIn_2_0;
                    }
                    case 3: {
                        try {
                            var2_ref3 = new FileInputStream(param0);
                            var3 = new ObjectInputStream((InputStream) (Object) var2_ref3);
                            var4 = var3.readObject();
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = ((Object) stateCaught_3 instanceof IOException ? 7 : ((Object) stateCaught_3 instanceof ClassNotFoundException ? 8 : 11));
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3.close();
                            var2_ref3.close();
                            stackOut_5_0 = var4;
                            stackIn_6_0 = stackOut_5_0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = ((Object) stateCaught_5 instanceof IOException ? 7 : ((Object) stateCaught_5 instanceof ClassNotFoundException ? 8 : 11));
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return stackIn_6_0;
                    }
                    case 7: {
                        try {
                            var2 = (IOException) (Object) caughtException;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2_ref = (ClassNotFoundException) (Object) caughtException;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = null;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0;
                    }
                    case 11: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_11_0 = (RuntimeException) var2_ref2;
                        stackOut_11_1 = new StringBuilder().append("asa.B(");
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_13_1 = stackOut_11_1;
                        stackIn_12_0 = stackOut_11_0;
                        stackIn_12_1 = stackOut_11_1;
                        if (param0 == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                        stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                        stackOut_12_2 = "{...}";
                        stackIn_14_0 = stackOut_12_0;
                        stackIn_14_1 = stackOut_12_1;
                        stackIn_14_2 = stackOut_12_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                        stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                        stackOut_13_2 = "null";
                        stackIn_14_0 = stackOut_13_0;
                        stackIn_14_1 = stackOut_13_1;
                        stackIn_14_2 = stackOut_13_2;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + -48 + 41);
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

    private asa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Data array";
        field_c = 20000000L;
        field_a = new aba();
        field_e = 128;
    }
}
