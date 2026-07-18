/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ka {
    static ed field_a;
    static hh field_e;
    static int[] field_b;
    static int[] field_c;
    static int[] field_d;

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var8 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            if (dj.field_d != null) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ka.A(" + 105 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1, int param2, int param3, DataInputStream param4, int[] param5, byte param6, int param7) throws IOException {
        int var8_int = 0;
        int var9 = 0;
        int var10 = EscapeVector.field_A;
        if (0 == param1) {
            return;
        }
        if (1 == param1) {
            var8_int = -(1 << param0) + (2 << -1 + param3);
            for (var9 = param7; param2 > var9; var9++) {
                param5[var9] = lb.a(param5[var9], var8_int);
            }
            return;
        }
        try {
            int discarded$0 = 2147483647;
            bf.a(param7, param2, param4, param0, param3, param5);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ka.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + -74 + ',' + param7 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_d = null;
        int var1 = 0;
        field_b = null;
        field_a = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[17];
        field_d = new int[17];
        field_b[2] = 500;
        field_b[14] = 4000;
        field_b[16] = 4000;
        field_d[1] = 1000;
        field_b[4] = 500;
        field_b[15] = 4000;
        field_b[0] = 1000;
        field_b[6] = 2000;
        field_b[3] = 500;
        field_b[5] = 500;
        field_b[7] = 2000;
        field_d[10] = 1000;
        field_d[11] = 1000;
        field_d[13] = 1000;
        field_d[12] = 1000;
        field_d[5] = 500;
        field_d[9] = 1000;
    }
}
