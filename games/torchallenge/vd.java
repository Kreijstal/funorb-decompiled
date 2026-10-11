/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int[] field_e;
    static ka[] field_d;
    static boolean[] field_c;
    static boolean field_b;
    static int field_f;
    static long field_a;

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_e = null;
        int var1 = 35 % ((param0 - 46) / 56);
    }

    final static void b(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = TorChallenge.field_F ? 1 : 0;
        try {
          if (vj.field_d != null) {
            for (var1_int = 0; vj.field_d.length > var1_int; var1_int++) {
              vj.field_d[var1_int] = null;
            }
          }
          if (param0 != 0) {
            vd.c(-60);
          }
          vj.field_d = null;
          cg.field_g = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "vd.A(" + param0 + ')');
        }
    }

    final static int c(int param0) {
        if (param0 != 0) {
          field_e = (int[]) null;
          return cf.field_f;
        }
        return cf.field_f;
    }

    static {
        field_e = new int[4];
        field_d = new ka[3];
        field_b = false;
        field_a = 0L;
    }
}
