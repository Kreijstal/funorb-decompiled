/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ih {
    private java.util.zip.Inflater field_c;
    static oi field_b;
    static int field_a;
    static String field_d;

    final void a(byte[] param0, ng param1, int param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-32 != (param1.field_h[param1.field_f] ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (-117 == param1.field_h[1 + param1.field_f]) {
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
                        if (null != ((ih) this).field_c) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        ((ih) this).field_c = new java.util.zip.Inflater(true);
                        statePc = 6;
                        continue stateLoop;
                    }
                    case 6: {
                        try {
                            ((ih) this).field_c.setInput(param1.field_h, 10 + param1.field_f, -param1.field_f + -18 + param1.field_h.length);
                            int discarded$3 = ((ih) this).field_c.inflate(param0);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        exception = (Exception) (Object) caughtException;
                        ((ih) this).field_c.reset();
                        throw new RuntimeException("");
                    }
                    case 9: {
                        if (param2 != -19515) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        ((ih) this).field_c.reset();
                        return;
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

    public ih() {
        this(-1, 1000000, 1000000);
    }

    final static void a(byte param0) {
        uo.field_i = new dc();
        jm.field_d.a((qm) (Object) uo.field_i, (byte) -50);
        if (param0 != 63) {
            field_d = null;
        }
    }

    private ih(int param0, int param1, int param2) {
    }

    public static void a(int param0) {
        if (param0 <= 39) {
            ih.a((byte) -111);
            field_b = null;
            field_d = null;
            return;
        }
        field_b = null;
        field_d = null;
    }

    final static void a(byte param0, int param1, String param2, int param3) {
        if (-97 > (param1 ^ -1)) {
          gi.field_n.a();
          kh.a();
          go.field_l.a(param2, 0, 20, 16760896, -1);
          dk.field_o.a(param0 ^ -6963);
          gi.field_n.c(538, param3 + -20, 24576 / param1, 25);
          if (param0 == -20) {
            return;
          } else {
            field_b = null;
            return;
          }
        } else {
          go.field_l.a(param2, 538, param3, 16760896, -1);
          if (param0 == -20) {
            return;
          } else {
            field_b = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new oi();
        field_d = "Orb points: ";
        field_a = 50;
    }
}
