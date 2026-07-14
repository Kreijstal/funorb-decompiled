/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nba extends ao {
    final static kv[] a(boolean param0, int param1, int param2, boolean param3, int param4, int param5) {
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        kv var9 = null;
        kv var10 = null;
        kv var11 = null;
        int[] var12 = null;
        kv var13 = null;
        kv var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        int[] var18 = null;
        var18 = dg.field_e;
        var17 = var18;
        var16 = var17;
        var15 = var16;
        var12 = var15;
        var6 = var12;
        var7 = dg.field_i;
        var8 = dg.field_c;
        var9 = new kv(16, param4);
        if (param2 != 1) {
          return null;
        } else {
          L0: {
            var9.b();
            dg.b(0, 0, 16, param4, param1, param5);
            var10 = null;
            var11 = null;
            if (!param3) {
              break L0;
            } else {
              var13 = var9.a();
              var10 = var13;
              var13.b();
              dg.e(0, 0, 5, 0);
              dg.e(0, 1, 3, 0);
              dg.e(0, 2, 2, 0);
              dg.e(0, 3, 1, 0);
              dg.e(0, 4, 1, 0);
              break L0;
            }
          }
          L1: {
            if (!param0) {
              break L1;
            } else {
              var14 = var9.a();
              var11 = var14;
              var14.b();
              dg.e(11, 0, 5, 0);
              dg.e(13, 1, 3, 0);
              dg.e(14, 2, 2, 0);
              dg.e(15, 3, 1, 0);
              dg.e(15, 4, 1, 0);
              break L1;
            }
          }
          dg.a(var18, var7, var8);
          return new kv[]{null, null, null, var10, var9, var11, null, null, null};
        }
    }

    final static boolean b(byte param0) {
        if (param0 >= -98) {
            gca discarded$0 = nba.a(-97, false);
            return nla.field_f;
        }
        return nla.field_f;
    }

    final static gca a(int param0, boolean param1) {
        int var2 = 0;
        if (!param1) {
          var2 = param0;
          if (-33 != (var2 ^ -1)) {
            if (var2 != 29) {
              return null;
            } else {
              return (gca) (Object) new ria();
            }
          } else {
            return (gca) (Object) new c();
          }
        } else {
          return null;
        }
    }

    static {
    }
}
