/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gh {
    static we field_b;
    static ea field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        il var4 = null;
        jb var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = MinerDisturbance.field_ab;
        try {
          var4 = (il) (mf.field_h.b(67));
          while (var4 != null) {
            ig.a(param0, 1, var4);
            var4 = (il) (mf.field_h.b((byte) 56));
          }
          var5 = (jb) (sd.field_a.b(96));
          while (var5 != null) {
            ti.a(var5, true, param0);
            var5 = (jb) (sd.field_a.b((byte) 56));
          }
          if (param1 == 21121) {
            return;
          }
          gh.a(-85, -101);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var2), "gh.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        int var1 = 120 % ((-23 - param0) / 47);
    }

    static {
    }
}
