/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class apb {
    static int field_b;
    static int field_a;
    int field_c;

    final static void a(byte param0) {
        cf.b(32);
        int var1 = -97 % ((62 - param0) / 54);
    }

    final static boolean a(int param0) {
        int var2 = 0;
        mv var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        int var4 = 0;
        mv var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = VoidHunters.field_G;
        try {
          var5 = (mv) (tma.field_r.d(0));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          var3 = 58 % ((param0 + 10) / 48);
          for (var2 = 0; var2 < var1.field_i; var2++) {
            if (null != var5.field_g[var2] &&
              var5.field_g[var2].field_f == 0) {
              return false;
            }
            if (null != var5.field_e[var2] &&
              0 == var5.field_e[var2].field_f) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1_ref), "apb.B(" + param0 + ')');
        }
    }

    static {
        field_a = 1;
        field_b = 4;
    }
}
