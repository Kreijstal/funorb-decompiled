/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static long field_b;
    static h field_a;

    final static boolean a() {
        return !field_a.a(0);
    }

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = hb.field_l[0];
            var2 = 2;
            var3 = 1;
            L1: while (true) {
              if (hb.field_l.length <= var3) {
                break L0;
              } else {
                var4 = hb.field_l[var3];
                gl.a(dj.field_c, var3 << 4, dj.field_c, var1_int, var4);
                var1_int = var1_int + var4;
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var1, "bb.B(" + 121 + 41);
        }
    }

    public static void a(boolean param0) {
        field_a = null;
    }

    static {
    }
}
