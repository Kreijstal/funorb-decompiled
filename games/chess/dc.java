/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends o {
    int field_o;
    int field_j;
    static ci field_q;
    static ci field_s;
    static boolean field_m;
    int field_k;
    static rk[] field_n;
    int field_r;
    int field_l;
    int field_p;

    public static void d(int param0) {
        if (param0 != 5) {
          field_s = (ci) null;
        }
        field_s = null;
        field_q = null;
        field_n = null;
    }

    final static void c(byte param0) {
        if (param0 < 124) {
          dc.a(-70);
        }
        kb.field_O = new ol();
        nj.field_w.c(kb.field_O, 79);
    }

    final static void a(int param0, int param1, boolean param2, byte param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Chess.field_G;
        try {
          if (param1 <= param6) {
            return;
          }
          if (param6 + 1 >= param5) {
            return;
          }
          if (param5 > param6 + 5 &&
            param4 != param0) {
            if (param3 > -115) {
              field_m = true;
            }
            var7_int = (1 & (param0 & param4)) + (param4 >> 1) + (param0 >> 1);
            var8 = param6;
            var9 = param4;
            var10 = param0;
            for (var11 = param6; var11 < param5; var11++) {
              var12 = vn.field_Ab[var11];
              if (!param2) {
                stackIn_26_0 = gh.field_a[var12];
              } else {
                stackIn_26_0 = hg.field_d[var12];
              }
              var13 = stackIn_26_0;
              if (var13 > var7_int) {
                vn.field_Ab[var11] = vn.field_Ab[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                vn.field_Ab[incrementValue$0] = var12;
              } else {
                if (var13 > var10) {
                  var10 = var13;
                }
              }
            }
            dc.a(var9, param1, param2, (byte) -124, param4, var8, param6);
            dc.a(param0, param1, param2, (byte) -122, var10, param5, var8);
            return;
          }
          for (var7_intLifetime1 = param5 - 1; param6 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = vn.field_Ab[var8Lifetime1];
              var10Lifetime1 = vn.field_Ab[1 + var8Lifetime1];
              if (ec.a((byte) 126, var9Lifetime1, var10Lifetime1, param2)) {
                vn.field_Ab[var8Lifetime1] = var10Lifetime1;
                vn.field_Ab[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var7), "dc.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static boolean a(int param0) {
        int var1 = -31 % ((71 - param0) / 53);
        return dk.field_g;
    }

    private dc() throws Throwable {
        throw new Error();
    }

    static {
        field_m = false;
    }
}
