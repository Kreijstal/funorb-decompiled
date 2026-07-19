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
          field_e = (String) null;
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
            byte[] discarded$2 = null;
            byte[] var3 = null;
            IOException var3_ref = null;
            RuntimeException var3_ref2 = null;
            File var4 = null;
            byte[] var5 = null;
            byte[] stackIn_3_0 = null;
            Object stackIn_5_0 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_2_0 = null;
            Object stackOut_4_0 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            RuntimeException stackOut_8_0 = null;
            StringBuilder stackOut_8_1 = null;
            String stackOut_8_2 = null;
            RuntimeException stackOut_7_0 = null;
            StringBuilder stackOut_7_1 = null;
            String stackOut_7_2 = null;
            try {
              L0: {
                L1: {
                  if (param0 == 19758) {
                    break L1;
                  } else {
                    var4 = (File) null;
                    discarded$2 = og.a(82, (File) null, -63);
                    break L1;
                  }
                }
                try {
                  L2: {
                    var5 = new byte[param2];
                    var3 = var5;
                    jm.a(param1, param2, 0, var5);
                    stackOut_2_0 = (byte[]) (var5);
                    stackIn_3_0 = stackOut_2_0;
                    break L2;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var3_ref = (IOException) (Object) decompiledCaughtException;
                  stackOut_4_0 = null;
                  stackIn_5_0 = stackOut_4_0;
                  return (byte[]) ((Object) stackIn_5_0);
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_6_0 = (RuntimeException) (var3_ref2);
                stackOut_6_1 = new StringBuilder().append("og.B(").append(param0).append(',');
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                if (param1 == null) {
                  stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackOut_8_2 = "null";
                  stackIn_9_0 = stackOut_8_0;
                  stackIn_9_1 = stackOut_8_1;
                  stackIn_9_2 = stackOut_8_2;
                  break L3;
                } else {
                  stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
                  stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
                  stackOut_7_2 = "{...}";
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_9_1 = stackOut_7_1;
                  stackIn_9_2 = stackOut_7_2;
                  break L3;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ')');
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_a = new og();
        field_b = " WARNING - ENCUMBERED ";
        field_g = "Corporal ";
    }
}
