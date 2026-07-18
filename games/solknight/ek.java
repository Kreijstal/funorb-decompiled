/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static String field_a;

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var1_int = fb.field_b[0];
            var2 = 1;
            L1: while (true) {
              if (var2 >= fb.field_b.length) {
                break L0;
              } else {
                var3 = fb.field_b[var2];
                fk.a(he.field_a, var2 << 4, he.field_a, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1, "ek.A(" + 1 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
    }

    static {
    }
}
