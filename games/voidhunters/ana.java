/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ana extends ksa {
    static int field_f;
    fga field_e;
    int field_d;
    ksa field_g;

    final static byte[] a(File param0, byte param1) {
        if (param1 != 48) {
            return null;
        }
        return ana.a((byte) -123, (int)param0.length(), param0);
    }

    final static void c(byte param0) {
        int var1 = -34 / ((param0 - 16) / 54);
    }

    private final static byte[] a(byte param0, int param1, File param2) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            byte[] var4 = null;
            byte[] stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_2_0 = null;
            try {
              L0: {
                if (param0 <= -89) {
                  break L0;
                } else {
                  ana.c((byte) 117);
                  break L0;
                }
              }
              var4 = new byte[param1];
              var3 = var4;
              dib.a(param2, param1, var4, (byte) 119);
              stackOut_2_0 = (byte[]) var4;
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

    ana(fga param0, ksa param1) {
        ((ana) this).field_e = param0;
        ((ana) this).field_d = param0.f();
        ((ana) this).field_g = param1;
        ((ana) this).field_e.e(128 + ((ana) this).field_d * kt.field_l >> -960748184);
    }

    final void a(int param0, int param1, int param2) {
        param2 = param2 << 6;
        param1 = param1 << 6;
        ((ana) this).field_d = param1;
        ((ana) this).field_e.c(param0 + param1 * kt.field_l >> 1700467176, param2);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 192;
    }
}
