/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class t {
    private java.util.zip.Inflater field_d;
    static wh field_c;
    static java.awt.Font field_e;
    static int[] field_a;
    static long field_b;

    public t() {
        this(-1, 1000000, 1000000);
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        if (param0 <= 121) {
            field_e = null;
        }
    }

    private t(int param0, int param1, int param2) {
    }

    final void a(dh param0, int param1, byte[] param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if ((param0.field_i[param0.field_k] ^ -1) != -32) {
                break L0;
              } else {
                if ((param0.field_i[1 + param0.field_k] ^ -1) == 116) {
                  L1: {
                    if (null == ((t) this).field_d) {
                      ((t) this).field_d = new java.util.zip.Inflater(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  try {
                    ((t) this).field_d.setInput(param0.field_i, param0.field_k + param1, -param0.field_k + (-18 + param0.field_i.length));
                    int discarded$2 = ((t) this).field_d.inflate(param2);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((t) this).field_d.reset();
                  throw new RuntimeException("");
                } else {
                  break L0;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[8192];
    }
}
