/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fh {
    private java.util.zip.Inflater field_g;
    static String field_i;
    static String field_e;
    static nd field_a;
    static int field_b;
    static int[] field_f;
    static String field_h;
    static String field_d;
    static boolean[] field_c;

    public static void b(int param0) {
        field_h = null;
        field_a = null;
        if (param0 != 9992) {
          field_b = 71;
          field_f = null;
          field_e = null;
          field_c = null;
          field_i = null;
          field_d = null;
          return;
        } else {
          field_f = null;
          field_e = null;
          field_c = null;
          field_i = null;
          field_d = null;
          return;
        }
    }

    final void a(int param0, byte[] param1, vi param2) {
        try {
            Exception exception = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (-32 != (param2.field_n[param2.field_i] ^ -1)) {
                break L0;
              } else {
                if (-117 == param2.field_n[param2.field_i - -1]) {
                  L1: {
                    if (param0 >= 82) {
                      break L1;
                    } else {
                      fh.a(62);
                      break L1;
                    }
                  }
                  L2: {
                    if (null != ((fh) this).field_g) {
                      break L2;
                    } else {
                      ((fh) this).field_g = new java.util.zip.Inflater(true);
                      break L2;
                    }
                  }
                  try {
                    ((fh) this).field_g.setInput(param2.field_n, 10 + param2.field_i, param2.field_n.length + (-param2.field_i + -10 - 8));
                    int discarded$2 = ((fh) this).field_g.inflate(param1);
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                  }
                  exception = (Exception) (Object) decompiledCaughtException;
                  ((fh) this).field_g.reset();
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

    public fh() {
        this(-1, 1000000, 1000000);
    }

    private fh(int param0, int param1, int param2) {
    }

    final static void a(int param0) {
        he.field_y = null;
        vh.field_d = null;
        if (param0 != 1) {
            field_c = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Loading music";
        field_e = "Fullscreen";
        field_a = new nd(12, 0, 1, 0);
        field_f = new int[]{20, 0, 18, 4, 5, 7, 10, 22};
        field_h = "OK";
        field_c = new boolean[2];
        field_d = "Mission ";
    }
}
