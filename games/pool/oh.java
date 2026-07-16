/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class oh {
    static int[] field_d;
    static String field_f;
    static long field_e;
    static String field_g;
    static boolean field_h;
    private java.util.zip.Inflater field_b;
    static ai field_c;
    static String field_a;

    final static qr a(int param0, String param1) {
        int var2 = -79 % ((51 - param0) / 49);
        return new qr(param1);
    }

    final void a(byte[] param0, boolean param1, ge param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1) {
                break L0;
              } else {
                oh.a((byte) 4);
                break L0;
              }
            }
            L1: {
              if (-32 != param2.field_t[param2.field_v]) {
                break L1;
              } else {
                if (116 != param2.field_t[param2.field_v + 1]) {
                  break L1;
                } else {
                  L2: {
                    if (null != ((oh) this).field_b) {
                      break L2;
                    } else {
                      ((oh) this).field_b = new java.util.zip.Inflater(true);
                      break L2;
                    }
                  }
                  try {
                    L3: {
                      ((oh) this).field_b.setInput(param2.field_t, 10 + param2.field_v, -10 + (-param2.field_v + -8 + param2.field_t.length));
                      int discarded$2 = ((oh) this).field_b.inflate(param0);
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    exception = (Exception) (Object) decompiledCaughtException;
                    ((oh) this).field_b.reset();
                    throw new RuntimeException("");
                  }
                  ((oh) this).field_b.reset();
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

    public oh() {
        this(-1, 1000000, 1000000);
    }

    private oh(int param0, int param1, int param2) {
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 >= -82) {
            return;
        }
        field_d = null;
        field_a = null;
        field_c = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[12];
        field_g = "Names cannot contain consecutive spaces";
        field_e = 20000000L;
        field_h = false;
        field_f = "<%0> lost 2 lives!";
        field_a = "Report abuse";
    }
}
