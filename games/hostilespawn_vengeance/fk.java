/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static String field_a;
    static bd field_c;
    static String field_b;

    final static void a(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          var5 = ke.field_z;
          var1 = var5;
          if (param0 > -72) {
            return;
          }
          var2 = 0;
          var3 = var5.length;
          while (var3 > var2) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "fk.A(" + param0 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void b(byte param0) {
        field_b = null;
        field_c = null;
        int var1 = -10 / ((param0 + 86) / 36);
        field_a = null;
    }

    static {
        field_b = "Suggested names: ";
    }
}
