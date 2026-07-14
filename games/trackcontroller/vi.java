/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vi {
    private java.util.zip.Inflater field_b;
    static cd field_f;
    static int field_c;
    static String field_a;
    static String field_e;
    static int field_d;

    private vi(int param0, int param1, int param2) {
    }

    public static void a(int param0) {
        if (param0 != -25590) {
          field_f = null;
          field_e = null;
          field_f = null;
          field_a = null;
          return;
        } else {
          field_e = null;
          field_f = null;
          field_a = null;
          return;
        }
    }

    final void a(byte param0, byte[] param1, be param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param2.field_j[param2.field_k] != 31) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (116 == (param2.field_j[param2.field_k + 1] ^ -1)) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        throw new RuntimeException("");
                    }
                    case 4: {
                        if (((vi) this).field_b == null) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        ((vi) this).field_b = new java.util.zip.Inflater(true);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((vi) this).field_b.setInput(param2.field_j, 10 + param2.field_k, -10 - (param2.field_k + (8 - param2.field_j.length)));
                            int discarded$3 = ((vi) this).field_b.inflate(param1);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        exception = (Exception) (Object) caughtException;
                        ((vi) this).field_b.reset();
                        throw new RuntimeException("");
                    }
                    case 10: {
                        if (param0 < 4) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        ((vi) this).field_b.reset();
                        return;
                    }
                    case 12: {
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

    public vi() {
        this(-1, 1000000, 1000000);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new cd(1);
        field_e = "Invalid password.";
    }
}
