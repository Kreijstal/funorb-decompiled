/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oh {
    static int field_c;
    static int field_d;
    static String field_a;
    static int field_b;

    final static void a(byte param0) {
        if (null != dc.field_a) {
          dc.field_a.b(false);
        }
        if (param0 != 84) {
          return;
        }
        if (null == d.field_r) {
          gm.c(-68);
          return;
        }
        d.field_r.h((byte) 86);
        gm.c(-68);
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int stackIn_18_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        int var14Lifetime1;
        var15 = Torquing.field_u;
        try {
          var6_int = param2 - param1;
          var7 = -param0 + param4;
          if (var7 == 0) {
            if (var6_int != 0) {
              wa.a(param5, param0, true, param2, param1);
            }
            return;
          }
          if (var6_int == 0) {
            rh.a((byte) -115, param4, param1, param0, param5);
            return;
          }
          if (var7 < 0) {
            var7 = -var7;
          }
          if (0 > var6_int) {
            var6_int = -var6_int;
          }
          stackIn_18_0 = (var7 >= var6_int) ? 0 : 1;
          var8 = stackIn_18_0;
          if (var8 != 0) {
            var9 = param0;
            param0 = param1;
            var10 = param4;
            param1 = var9;
            param4 = param2;
            param2 = var10;
          }
          if (param0 > param4) {
            var9Lifetime1 = param0;
            param0 = param4;
            var10Lifetime1 = param1;
            param4 = var9Lifetime1;
            param1 = param2;
            param2 = var10Lifetime1;
          }
          var9Lifetime2 = param1;
          if (param3 != -128) {
            field_c = 118;
          }
          var10Lifetime2 = -param0 + param4;
          var11 = param2 - param1;
          var12 = -(var10Lifetime2 >> 1);
          if (var11 < 0) {
            var11 = -var11;
          }
          stackIn_30_0 = (param2 > param1) ? 1 : -1;
          var13 = stackIn_30_0;
          if (var8 == 0) {
            for (var14 = param0; param4 >= var14; var14++) {
              qd.field_a[var9Lifetime2][var14] = param5;
              var12 = var12 + var11;
              if (0 < var12) {
                var12 = var12 - var10Lifetime2;
                var9Lifetime2 = var9Lifetime2 + var13;
              }
            }
            return;
          }
          var16 = param0;
          var14Lifetime1 = var16;
          while (param4 >= var16) {
            var12 = var12 + var11;
            qd.field_a[var16][var9Lifetime2] = param5;
            if (0 < var12) {
              var9Lifetime2 = var9Lifetime2 + var13;
              var12 = var12 - var10Lifetime2;
            }
            var16++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "oh.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 20269) {
          oh.a(-112);
        }
    }

    static {
        field_c = 0;
        field_a = "Please wait";
    }
}
