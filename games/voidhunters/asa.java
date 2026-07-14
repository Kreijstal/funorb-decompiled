/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class asa extends aa {
    static String field_d;
    static aba field_a;
    static long field_c;
    im field_b;
    static int field_e;

    public static void a(int param0) {
        field_d = null;
        if (param0 != 20000000) {
            return;
        }
        field_a = null;
    }

    final static Object a(File param0, byte param1) {
        try {
            IOException var2 = null;
            ClassNotFoundException var2_ref = null;
            FileInputStream var2_ref2 = null;
            ObjectInputStream var3 = null;
            Object var4 = null;
            Object stackIn_4_0 = null;
            Object stackIn_6_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_3_0 = null;
            Object stackOut_5_0 = null;
            if (param0.exists()) {
              try {
                var2_ref2 = new FileInputStream(param0);
                var3 = new ObjectInputStream((InputStream) (Object) var2_ref2);
                var4 = var3.readObject();
                if (param1 <= -42) {
                  return stackIn_4_0;
                } else {
                  stackOut_3_0 = null;
                  stackIn_4_0 = stackOut_3_0;
                }
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                var3.close();
                var2_ref2.close();
                stackOut_5_0 = var4;
                stackIn_6_0 = stackOut_5_0;
              } catch (java.lang.Exception decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return stackIn_6_0;
              }
              var2 = (IOException) (Object) decompiledCaughtException;
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    private asa() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Data array";
        field_c = 20000000L;
        field_a = new aba();
        field_e = 128;
    }
}
