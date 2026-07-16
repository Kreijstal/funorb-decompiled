/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kg {
    static mg field_a;
    static ff field_f;
    private java.util.zip.Inflater field_d;
    static String field_b;
    static int field_e;
    static int field_c;

    public static void a(boolean param0) {
        field_b = null;
        field_f = null;
        if (param0) {
            field_f = null;
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static void a(int param0) {
        if (param0 != -15617) {
            field_c = 24;
        }
    }

    public kg() {
        this(-1, 1000000, 1000000);
    }

    private kg(int param0, int param1, int param2) {
    }

    final void a(byte param0, gb param1, byte[] param2) {
        try {
            Exception exception = null;
            Object var5 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1.field_l[param1.field_m] != 31) {
                break L0;
              } else {
                if (-117 == param1.field_l[param1.field_m + 1]) {
                  L1: {
                    if (null != ((kg) this).field_d) {
                      break L1;
                    } else {
                      ((kg) this).field_d = new java.util.zip.Inflater(true);
                      break L1;
                    }
                  }
                  L2: {
                    if (param0 == 97) {
                      break L2;
                    } else {
                      var5 = null;
                      ((kg) this).a((byte) 118, (gb) null, (byte[]) null);
                      break L2;
                    }
                  }
                  try {
                    L3: {
                      ((kg) this).field_d.setInput(param1.field_l, 10 + param1.field_m, -param1.field_m + (-10 + (-8 + param1.field_l.length)));
                      int discarded$2 = ((kg) this).field_d.inflate(param2);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    exception = (Exception) (Object) decompiledCaughtException;
                    ((kg) this).field_d.reset();
                    throw new RuntimeException("");
                  }
                  ((kg) this).field_d.reset();
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Mouse over an icon for details";
        field_e = 50;
        field_f = new ff(13, 0, 1, 0);
    }
}
