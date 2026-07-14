/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ci {
    static int[] field_b;
    static int field_d;
    private java.util.zip.Inflater field_e;
    static String field_a;
    static int field_c;

    final static int a(int param0) {
        if (param0 == 256) {
          ep.field_l.a(true);
          if (tf.field_c.c(param0 + -277)) {
            return 0;
          } else {
            return jo.w(79);
          }
        } else {
          return 54;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_b = null;
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    private ci(int param0, int param1, int param2) {
    }

    final void a(byte[] param0, de param1, int param2) {
        try {
            if (param1.field_h[param1.field_j] == 31) {
                // if_icmpne L45
            } else {
                throw new RuntimeException("");
            }
            if (null == ((ci) this).field_e) {
                ((ci) this).field_e = new java.util.zip.Inflater(true);
            }
            try {
                ((ci) this).field_e.setInput(param1.field_h, param1.field_j - -10, param1.field_h.length + param2 + -param1.field_j + -10);
                int discarded$0 = ((ci) this).field_e.inflate(param0);
            } catch (Exception exception) {
                ((ci) this).field_e.reset();
                throw new RuntimeException("");
            }
            ((ci) this).field_e.reset();
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public ci() {
        this(-1, 1000000, 1000000);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_d = 0;
        field_b = new int[256];
        field_a = "Passwords must be between 5 and 20 characters long";
        var1 = 0;
        L0: while (true) {
          if (256 <= var1) {
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (8 <= var2) {
                field_b[var1] = var0;
                var1++;
                continue L0;
              } else {
                if (-2 == (1 & var0 ^ -1)) {
                  var0 = var0 >>> 1464523905 ^ -306674912;
                  var2++;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  var2++;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
