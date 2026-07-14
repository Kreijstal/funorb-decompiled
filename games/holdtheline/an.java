/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class an {
    static qi field_e;
    static String field_d;
    static String[] field_c;
    private java.util.zip.Inflater field_b;
    static java.security.SecureRandom field_a;

    final static boolean a(byte param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          param2 = ua.a((byte) 110, '_', param2, "");
          if (param0 == -127) {
            break L0;
          } else {
            field_e = null;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = hc.a(param2, (byte) -93);
            if (param1.indexOf(param2) != -1) {
              break L2;
            } else {
              if (-1 == param1.indexOf(var3)) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 1;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0 != 0;
    }

    final static int a(CharSequence param0, int param1) {
        int var4 = 0;
        int var5 = HoldTheLine.field_D;
        int var2 = param0.length();
        int var3 = param1;
        for (var4 = 0; var4 < var2; var4++) {
            var3 = sj.a(113, param0.charAt(var4)) + ((var3 << 997825349) + -var3);
        }
        return var3;
    }

    public an() {
        this(-1, 1000000, 1000000);
    }

    final void a(byte param0, th param1, byte[] param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-32 != (param1.field_i[param1.field_l] ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (-117 == param1.field_i[1 + param1.field_l]) {
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
                        if (((an) this).field_b == null) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        ((an) this).field_b = new java.util.zip.Inflater(true);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        try {
                            ((an) this).field_b.setInput(param1.field_i, 10 + param1.field_l, -8 + (-param1.field_l - 10 + param1.field_i.length));
                            int discarded$3 = ((an) this).field_b.inflate(param2);
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
                        ((an) this).field_b.reset();
                        throw new RuntimeException("");
                    }
                    case 10: {
                        if (param0 == -117) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        ((an) this).field_b.reset();
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

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        if (param0 != 40) {
            Object var2 = null;
            int discarded$0 = an.a((CharSequence) null, -23);
        }
        field_a = null;
        field_c = null;
    }

    private an(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new String[16];
        field_d = "No highscores";
    }
}
