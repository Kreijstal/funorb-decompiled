/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class p {
    static Random field_b;
    static long field_a;
    static int field_d;
    static String field_c;

    final static void b(int param0, int param1) {
        try {
            Throwable var2 = null;
            Throwable decompiledCaughtException = null;
            L0: {
              if (param1 == 27102) {
                break L0;
              } else {
                p.b(-112, 62);
                break L0;
              }
            }
            try {
              L1: {
                Object discarded$1 = qe.a(new Object[1], "resizing", 29674, hc.a(0));
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a() {
        am var2 = dp.field_e;
        var2.j(11, 6);
        var2.i(1, 101);
        var2.i(0, 45);
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
            field_b = null;
        }
    }

    final static void a(int param0) {
        if (param0 != 1) {
          L0: {
            p.a(true);
            if (sn.field_c != null) {
              sn.field_c.a(-126);
              sn.field_c = null;
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (sn.field_c != null) {
              sn.field_c.a(-126);
              sn.field_c = null;
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Random();
        field_c = "Highscores";
    }
}
