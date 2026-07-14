/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class qj {
    private java.util.zip.Inflater field_b;
    static long[] field_a;
    static nf field_c;
    static tj field_d;

    public qj() {
        this(-1, 1000000, 1000000);
    }

    final void a(wi param0, byte[] param1, byte param2) {
        try {
            Exception exception = null;
            int var4 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0.field_i[param0.field_h] != 31) {
                break L0;
              } else {
                if (-117 == param0.field_i[1 + param0.field_h]) {
                  L1: {
                    if (null == ((qj) this).field_b) {
                      ((qj) this).field_b = new java.util.zip.Inflater(true);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  var4 = 61 / ((param2 - -40) / 55);
                  try {
                    ((qj) this).field_b.setInput(param0.field_i, param0.field_h - -10, -10 + (-param0.field_h - 8) + param0.field_i.length);
                    int discarded$2 = ((qj) this).field_b.inflate(param1);
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    exception = (Exception) (Object) decompiledCaughtException;
                    ((qj) this).field_b.reset();
                    throw new RuntimeException("");
                  }
                  ((qj) this).field_b.reset();
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

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        int var1 = -29 % ((43 - param0) / 38);
    }

    private qj(int param0, int param1, int param2) {
    }

    final static rg a(boolean param0, String[] param1) {
        rg var2 = new rg(param0);
        var2.field_d = param1;
        return var2;
    }

    final static fe a(byte param0) {
        L0: {
          if (null == ca.field_b) {
            ca.field_b = new fe();
            ca.field_b.a(32, sg.field_a);
            ca.field_b.field_m = 2763306;
            ca.field_b.field_f = 5;
            ca.field_b.field_n = 14;
            ca.field_b.field_q = 7697781;
            ca.field_b.field_d = field_d;
            ca.field_b.field_k = 6;
            ca.field_b.field_o = 0;
            ca.field_b.field_h = 4;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 67) {
          field_a = null;
          return ca.field_b;
        } else {
          return ca.field_b;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new long[32];
        field_c = new nf();
    }
}
