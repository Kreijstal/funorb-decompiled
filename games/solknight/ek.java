/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static String field_a;

    final static void b(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          var1_int = fb.field_b[0];
          for (var2 = param0; var2 < fb.field_b.length; var2++) {
            var3 = fb.field_b[var2];
            fk.a(he.field_a, var2 << 4, he.field_a, var1_int, var3);
            var1_int = var1_int + var3;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "ek.A(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 < 41) {
          field_a = (String) null;
        }
    }

    static {
    }
}
