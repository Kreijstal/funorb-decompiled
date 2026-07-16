/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rc {
    static int field_d;
    static String field_b;
    private java.util.zip.Inflater field_a;
    static int field_f;
    static String field_c;
    static String field_e;

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        if (param0 <= 112) {
            field_e = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    public rc() {
        this(-1, 1000000, 1000000);
    }

    final void a(int param0, iw param1, byte[] param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (-32 != param1.field_f[param1.field_n]) {
                break L0;
              } else {
                if (116 != param1.field_f[param1.field_n + 1]) {
                  break L0;
                } else {
                  L1: {
                    if (null != ((rc) this).field_a) {
                      break L1;
                    } else {
                      ((rc) this).field_a = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      L3: {
                        ((rc) this).field_a.setInput(param1.field_f, 10 + param1.field_n, param1.field_f.length + (-10 + (-param1.field_n + -8)));
                        if (param0 == -4019) {
                          break L3;
                        } else {
                          rc.a(51);
                          break L3;
                        }
                      }
                      int discarded$2 = ((rc) this).field_a.inflate(param2);
                      break L2;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    exception = (Exception) (Object) decompiledCaughtException;
                    ((rc) this).field_a.reset();
                    throw new RuntimeException("");
                  }
                  ((rc) this).field_a.reset();
                  return;
                }
              }
            }
            throw new RuntimeException("");
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private rc(int param0, int param1, int param2) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
        field_c = "<%0> cannot join; the game is full.";
        field_b = "Allow spectators?";
        field_e = "You have declined the invitation.";
    }
}
