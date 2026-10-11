/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends le {
    static dj field_l;
    static sf field_j;
    static String field_i;
    static int field_h;
    static String field_m;
    static int field_n;
    int field_k;

    public static void c(byte param0) {
        field_j = null;
        field_l = null;
        if (param0 > 55) {
          field_m = null;
          field_i = null;
          return;
        }
        field_h = -12;
        field_m = null;
        field_i = null;
    }

    final static void d(byte param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        am var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = ZombieDawn.field_J;
        try {
          if (param0 != -48) {
            return;
          }
          var1 = dp.field_e;
          while (jh.a((byte) 103)) {
            var1.j(11, 8);
            fieldTemp$0 = var1.field_j + 1;
            var1.field_j = var1.field_j + 1;
            var2 = fieldTemp$0;
            dn.a(var1, 84);
            dp.field_e.d(-128, var1.field_j - var2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1_ref), "da.A(" + param0 + ')');
        }
    }

    da(int param0) {
        this.field_k = param0;
    }

    static {
        field_m = null;
        field_h = 25;
        field_n = 15;
    }
}
