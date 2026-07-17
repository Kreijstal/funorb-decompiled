/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static String field_a;
    static boolean field_b;
    static og field_c;

    final static void a(int param0, int param1, int param2, boolean param3, int param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = StarCannon.field_A;
        try {
          L0: {
            L1: {
              ki.b(param0, param4, param1 + 1, 10000536);
              ki.b(param0, param2 + param4, 1 + param1, 12105912);
              var5_int = 1;
              if (ki.field_e <= var5_int + param4) {
                break L1;
              } else {
                var5_int = -param4 + ki.field_e;
                break L1;
              }
            }
            L2: {
              var6 = param2;
              if (ki.field_i < var6 + param4) {
                var6 = -param4 + ki.field_i;
                break L2;
              } else {
                break L2;
              }
            }
            var7 = var5_int;
            L3: while (true) {
              if (var7 >= var6) {
                break L0;
              } else {
                var8 = 152 - -(48 * var7 / param2);
                var9 = var8 << 16 | var8 << 8 | var8;
                ki.field_a[param0 + ki.field_j * (param4 + var7)] = var9;
                ki.field_a[param0 + ki.field_j * (param4 + var7) + param1] = var9;
                var7++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var5, "sk.B(" + param0 + 44 + param1 + 44 + param2 + 44 + 1 + 44 + param4 + 41);
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a() {
        field_a = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Passwords must be between 5 and 20 letters and numbers";
        field_c = new og();
    }
}
