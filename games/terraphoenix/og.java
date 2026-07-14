/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class og {
    static int field_d;
    static og field_a;
    static String field_b;
    static ud field_f;
    static ci[] field_c;
    static String field_g;
    static String field_e;

    public static void a(int param0) {
        field_c = null;
        field_f = null;
        field_g = null;
        field_e = null;
        if (param0 != 8934) {
          field_e = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_a = null;
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static byte[] a(int param0, File param1, int param2) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            Object var4 = null;
            byte[] var5 = null;
            byte[] stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_2_0 = null;
            L0: {
              if (param0 == 19758) {
                break L0;
              } else {
                var4 = null;
                byte[] discarded$2 = og.a(82, (File) null, -63);
                break L0;
              }
            }
            try {
              var5 = new byte[param2];
              var3 = var5;
              jm.a(param1, param2, 0, var5);
              stackOut_2_0 = (byte[]) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new og();
        field_b = " WARNING - ENCUMBERED ";
        field_g = "Corporal ";
    }
}
