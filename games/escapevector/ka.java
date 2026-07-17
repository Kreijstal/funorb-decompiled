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
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        fn var3 = null;
        ed var4 = null;
        int var5 = 0;
        int var6 = 0;
        fn var7 = null;
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            if (dj.field_d != null) {
              return;
            } else {
              if (param0 > 48) {
                dj.field_d = new fn[sc.field_h.length];
                var1_int = 0;
                L1: while (true) {
                  if (var1_int >= sc.field_h.length) {
                    break L0;
                  } else {
                    var2 = sc.field_h[var1_int];
                    var3 = ph.field_b;
                    var4 = k.a(var2, (byte) -39, 2);
                    var5 = var4.field_A - var3.field_c;
                    var6 = -var3.field_b + var4.field_z;
                    var7 = new fn(var5, var6);
                    dj.field_d[var1_int] = rc.a(var2, (byte) 121, var7, var3);
                    var1_int++;
                    continue L1;
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var1, "ka.A(" + param0 + 41);
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
            if (param6 != -74) {
                ka.a(1);
            }
            bf.a(param7, param2, param4, param0, param3, param5, 2147483647);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ka.B(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + (param4 != null ? "{...}" : "null") + 44 + (param5 != null ? "{...}" : "null") + 44 + param6 + 44 + param7 + 41);
        }
    }

    public static void a(byte param0) {
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
