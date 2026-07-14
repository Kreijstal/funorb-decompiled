/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class lf {
    static ck[] field_h;
    private java.util.zip.Inflater field_a;
    static String field_d;
    static int field_c;
    static boolean field_g;
    static ck field_i;
    static fd field_f;
    static fd field_e;
    static String field_b;

    final void a(byte param0, wl param1, byte[] param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if ((param1.field_r[param1.field_n] ^ -1) != -32) {
                break L0;
              } else {
                if (-117 == param1.field_r[1 + param1.field_n]) {
                  L1: {
                    if (((lf) this).field_a != null) {
                      break L1;
                    } else {
                      ((lf) this).field_a = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  L2: {
                    if (param0 >= 105) {
                      break L2;
                    } else {
                      lf.a(-120);
                      break L2;
                    }
                  }
                  try {
                    ((lf) this).field_a.setInput(param1.field_r, 10 + param1.field_n, -10 + -param1.field_n + -8 + param1.field_r.length);
                    int discarded$2 = ((lf) this).field_a.inflate(param2);
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    exception = (Exception) (Object) decompiledCaughtException;
                    ((lf) this).field_a.reset();
                    throw new RuntimeException("");
                  }
                  ((lf) this).field_a.reset();
                  return;
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

    private lf(int param0, int param1, int param2) {
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        if (param0 != -13495) {
            return;
        }
        field_f = null;
        field_i = null;
        field_b = null;
        field_d = null;
    }

    public lf() {
        this(-1, 1000000, 1000000);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Create a free account to start using this feature";
        field_b = "This password contains repeated characters, and would be easy to guess";
    }
}
