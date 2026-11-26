/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ak extends IntrusiveNode {
    int field_g;
    boolean field_n;
    int[][] field_l;
    long[][] field_k;
    String[][] field_i;
    static db field_f;
    int field_j;
    int field_h;
    static int field_m;

    public static void clearDeclaredStaticReferences(int param0) {
        field_f = null;
        if (param0 != 77) {
          field_f = (db) null;
        }
    }

    final static void a(int param0, byte param1) {
        try {
          IOException iOException = null;
          Throwable decompiledCaughtException = null;
          if (null != oi.field_c && (param0 < 0 ||
            ek.field_h == gj.field_k)) {
            if (tp.field_f.position == 0 &&
              (10000L + mp.field_p) < lo.correctedCurrentTimeMillis((byte) -118)) {
              tp.field_f.d(8, param0);
            }
            if (tp.field_f.position > 0) {
              try {
                oi.field_c.a(0, param1 ^ -116, tp.field_f.payload, tp.field_f.position);
                mp.field_p = lo.correctedCurrentTimeMillis((byte) 90);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
                jj.a(4);
              }
              tp.field_f.position = 0;
            }
            if (param1 == -48) {
              return;
            }
            ak.a((byte) -60, 78, 70, 24, -99);
            return;
          }
          tp.field_f.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    ak() {
    }

    final static void a(byte param0, int param1, int param2, int param3, int param4) {
        SoftwareRasterizer.fillRectangle(param1, param2 + 10, 79, 4, 0);
        SoftwareRasterizer.fillRectangle(param1 + 1, param2 + 9, 77, 6, 0);
        SoftwareRasterizer.fillRectangle(param1 + 1, 10 + param2, 77, 4, param4);
        oc.a(DirectByteStorage.field_c, 26, param2, param3 + param1, 15, -123);
        if (param0 != 61) {
          ak.clearDeclaredStaticReferences(-86);
        }
    }

    static {
    }
}
