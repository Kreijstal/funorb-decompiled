/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class le {
    static im field_a;
    private java.util.zip.Inflater field_b;
    static int field_c;
    static String field_d;

    public le() {
        this(-1, 1000000, 1000000);
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        if (param0 != 1000000) {
            field_a = null;
        }
    }

    final void a(byte[] param0, int param1, mg param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param2.field_j[param2.field_i] != 31) {
                break L0;
              } else {
                if (-117 == param2.field_j[1 + param2.field_i]) {
                  L1: {
                    if (((le) this).field_b != null) {
                      break L1;
                    } else {
                      ((le) this).field_b = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      if (param1 == 693) {
                        break L2;
                      } else {
                        field_c = -106;
                        break L2;
                      }
                    }
                    ((le) this).field_b.setInput(param2.field_j, 10 + param2.field_i, -8 - (10 + (param2.field_i - param2.field_j.length)));
                    int discarded$2 = ((le) this).field_b.inflate(param0);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((le) this).field_b.reset();
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

    private le(int param0, int param1, int param2) {
    }

    final static ik a(int param0, ki param1, int param2) {
        byte[] var3 = null;
        byte[] var4 = null;
        var4 = param1.a(param0, true);
        var3 = var4;
        if (param2 == 10) {
          if (var4 == null) {
            return null;
          } else {
            return new ik(var4);
          }
        } else {
          le.a(-107);
          if (var4 == null) {
            return null;
          } else {
            return new ik(var4);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0;
        field_a = new im();
        field_d = "Login: ";
    }
}
