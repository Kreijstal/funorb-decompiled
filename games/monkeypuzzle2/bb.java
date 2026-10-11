/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb {
    static long field_b;
    static h field_a;

    final static boolean a(byte param0) {
        if (param0 <= -44) {
          return !field_a.a(0) ? true : false;
        }
        field_b = -103L;
        return !field_a.a(0) ? true : false;
    }

    final static void a(int param0) {
        int var3 = 0;
        int var1_int = 0;
        int var2 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          var1_int = hb.field_l[0];
          var2 = 32 % ((param0 + 17) / 41);
          for (var3 = 1; hb.field_l.length > var3; var3++) {
            var4 = hb.field_l[var3];
            gl.a(dj.field_c, var3 << 4, dj.field_c, var1_int, var4);
            var1_int = var1_int + var4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "bb.B(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (!param0) {
          field_a = (h) null;
        }
    }

    static {
    }
}
