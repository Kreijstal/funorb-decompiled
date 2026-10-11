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
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          if (param1 != 27102) {
            p.b(-112, 62);
          }
          try {
            qe.a(new Object[]{new Integer(param0)}, "resizing", 29674, hc.a(0));
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1) {
        am var2 = dp.field_e;
        var2.j(11, param1);
        var2.i(1, 101);
        var2.i(param0, 45);
    }

    public static void a(boolean param0) {
        field_c = null;
        field_b = null;
        if (param0) {
          field_b = (Random) null;
        }
    }

    final static void a(int param0) {
        if (param0 == 1) {
          if (sn.field_c != null) {
            sn.field_c.a(-126);
            sn.field_c = null;
          }
          return;
        }
        p.a(true);
        if (sn.field_c != null) {
          sn.field_c.a(-126);
          sn.field_c = null;
        }
    }

    static {
        field_b = new Random();
        field_c = "Highscores";
    }
}
