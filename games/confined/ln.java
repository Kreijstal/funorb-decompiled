/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ln {
    static Vector field_d;
    static int field_b;
    static int field_c;
    private java.util.zip.Inflater field_a;

    public ln() {
        this(-1, 1000000, 1000000);
    }

    private ln(int param0, int param1, int param2) {
    }

    final void a(boolean param0, byte[] param1, kg param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (31 != param2.field_m[param2.field_n]) {
                break L0;
              } else {
                if (-117 == param2.field_m[1 + param2.field_n]) {
                  L1: {
                    if (!param0) {
                      break L1;
                    } else {
                      ln.a(50);
                      break L1;
                    }
                  }
                  L2: {
                    if (((ln) this).field_a != null) {
                      break L2;
                    } else {
                      ((ln) this).field_a = new java.util.zip.Inflater(true);
                      break L2;
                    }
                  }
                  try {
                    ((ln) this).field_a.setInput(param2.field_m, param2.field_n + 10, -8 + (-param2.field_n + -10) + param2.field_m.length);
                    int discarded$2 = ((ln) this).field_a.inflate(param1);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((ln) this).field_a.reset();
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

    public static void a(int param0) {
        field_d = null;
        if (param0 >= -46) {
            ln.a(-12);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 66;
        field_d = new Vector();
    }
}
