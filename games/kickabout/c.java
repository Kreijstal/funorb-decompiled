/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class c {
    static String field_h;
    static ut[] field_f;
    static ut field_e;
    static StringBuilder field_a;
    static ut field_b;
    static String field_d;
    static boolean field_g;
    static int field_c;

    final static void a(int param0, int param1, int param2, int param3) {
        lo.a(0, param1, param2, false, (byte) -55);
        if (param0 != 31) {
          c.a(28, -64, 64, 35);
        }
    }

    public static void a(byte param0) {
        field_d = null;
        field_h = null;
        field_f = null;
        field_a = null;
        field_b = null;
        if (param0 == 114) {
          field_e = null;
          return;
        }
        field_b = (ut) null;
        field_e = null;
    }

    final static void a(int param0, boolean param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (op.field_y != null && (param0 < 0 ||
            un.field_c == jn.field_rb)) {
            if (0 == or.field_d.field_n &&
              (mp.field_i + 10000L) < nj.a(86)) {
              or.field_d.b(param0, (byte) 101);
            }
            if (param1) {
              return;
            }
            if (or.field_d.field_n > 0) {
              try {
                op.field_y.a(or.field_d.field_n, (byte) -127, 0, or.field_d.field_f);
                mp.field_i = nj.a(-117);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                lr.b((byte) -116);
              }
              or.field_d.field_n = 0;
            }
            return;
          }
          or.field_d.field_n = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1, int[] param2) {
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            c.a(-46, true);
          }
          stackIn_5_0 = ((param2[param0 >> 5] & 1 << (31 & param0)) != 0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("c.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_h = "Auction Settings";
        field_a = new StringBuilder(100);
        field_b = new ut(190, 190);
        field_d = "Game";
        field_c = 360;
    }
}
