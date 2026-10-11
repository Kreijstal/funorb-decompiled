/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nba extends ao {
    final static kv[] a(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        Object var10 = null;
        Object var11 = null;
        kv var13 = null;
        kv var14 = null;
        int[] var16 = dg.field_e;
        int[] var15 = var16;
        int[] var12 = var15;
        int[] var6 = var12;
        int var7 = dg.field_i;
        int var8 = dg.field_c;
        kv var9 = new kv(16, param4);
        if (param2 == 1) {
          var9.b();
          dg.b(0, 0, 16, param4, param1, param5);
          var10 = null;
          var11 = null;
          if (param3) {
            var13 = var9.a();
            var10 = var13;
            var13.b();
            dg.e(0, 0, 5, 0);
            dg.e(0, 1, 3, 0);
            dg.e(0, 2, 2, 0);
            dg.e(0, 3, 1, 0);
            dg.e(0, 4, 1, 0);
          }
          if (param0) {
            var14 = var9.a();
            var11 = var14;
            var14.b();
            dg.e(11, 0, 5, 0);
            dg.e(13, 1, 3, 0);
            dg.e(14, 2, 2, 0);
            dg.e(15, 3, 1, 0);
            dg.e(15, 4, 1, 0);
          }
          dg.a(var16, var7, var8);
          return new kv[]{null, null, null, (kv) (var10), var9, (kv) (var11), null, null, null};
        }
        return (kv[]) null;
    }

    final static boolean b(byte param0) {
        if (param0 >= -98) {
          nba.a(-97, false);
          return nla.field_f;
        }
        return nla.field_f;
    }

    final static gca a(int param0, boolean param1) {
        if (param1) {
          return (gca) null;
        }
        int var2 = param0;
        if (var2 == 32) {
          return (gca) ((Object) new c());
        }
        if (var2 == 29) {
          return (gca) ((Object) new ria());
        }
        return null;
    }

    static {
    }
}
