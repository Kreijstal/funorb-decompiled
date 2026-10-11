/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class lf extends ji {
    static byte[][] field_A;
    static int[] field_y;
    static String field_E;
    static byte[] field_D;
    static long field_B;
    static int[] field_z;
    static boolean field_C;

    final static int g(int param0) {
        if (param0 != 0) {
          field_B = -62L;
        }
        return ea.field_e;
    }

    final int[] c(int param0, int param1) {
        if (param1 < 91) {
          lf.b((byte) 85);
        }
        return rh.field_O;
    }

    public lf() {
        super(0, true);
    }

    final static void d(int param0, int param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (lo.field_k != null && (0 > param1 ||
            bm.field_I == rg.field_d)) {
            if (0 == uh.field_Wb.field_u &&
              (10000L + bm.field_H) < gk.a(55)) {
              uh.field_Wb.j(param1, 121);
            }
            if (param0 <= 37) {
              lf.g(-114);
            }
            if (uh.field_Wb.field_u > 0) {
              try {
                lo.field_k.a(0, uh.field_Wb.field_u, -93, uh.field_Wb.field_p);
                bm.field_H = gk.a(48);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                rm.b((byte) 115);
              }
              uh.field_Wb.field_u = 0;
            }
            return;
          }
          uh.field_Wb.field_u = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(byte param0) {
        field_E = null;
        int var1 = -86 / ((64 - param0) / 42);
        field_z = null;
        field_y = null;
        field_A = (byte[][]) null;
        field_D = null;
    }

    static {
        int var0 = 0;
        int var1 = 0;
        field_A = new byte[12][4096];
        for (var0 = 0; var0 < 12; var0++) {
          for (var1 = 0; var1 < 4096; var1++) {
            field_A[var0][var1] = (byte)(19 * var0 + 19);
          }
        }
        field_E = "to keep fullscreen or";
        field_D = new byte[520];
        field_B = 0L;
    }
}
