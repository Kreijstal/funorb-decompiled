/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    static sj field_b;
    static int field_a;
    static dl[] field_c;
    static am field_e;
    static double[] field_d;

    final static boolean b(int param0) {
        int var3 = 0;
        pi var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var4 = 0;
        pi var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          var5 = (pi) (hc.field_b.g(32073));
          var1 = var5;
          if (var1 == null) {
            return false;
          }
          var2 = -85 % ((param0 - 23) / 39);
          for (var3 = 0; var1.field_i > var3; var3++) {
            if (var5.field_k[var3] != null &&
              var5.field_k[var3].field_a == 0) {
              return false;
            }
            if (null != var5.field_m[var3] &&
              var5.field_m[var3].field_a == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1_ref), "cn.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_d = null;
        if (param0 < 9) {
          field_c = (dl[]) null;
          field_e = null;
          return;
        }
        field_e = null;
    }

    static {
        field_b = new sj(14, 0, 4, 1);
    }
}
