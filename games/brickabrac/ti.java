/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    private static String field_z;

    final static void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_25_0 = 0;
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
        var14 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param5 <= param6) {
            return;
          }
          if (param2 <= 1 + param6) {
            return;
          }
          if (5 + param6 < param2 &&
            param0 != param1) {
            if (param4 <= 93) {
              return;
            }
            var7_int = (param1 >> 1) - (-(param0 >> 1) - (1 & (param0 & param1)));
            var8 = param6;
            var9 = param0;
            var10 = param1;
            for (var11 = param6; param2 > var11; var11++) {
              var12 = fj.field_Pb[var11];
              if (param3) {
                stackIn_25_0 = ec.field_N[var12];
              } else {
                stackIn_25_0 = pj.field_b[var12];
              }
              var13 = stackIn_25_0;
              if (var7_int < var13) {
                fj.field_Pb[var11] = fj.field_Pb[var8];
                if (var13 < var9) {
                  var9 = var13;
                }
                incrementValue$0 = var8;
                var8++;
                fj.field_Pb[incrementValue$0] = var12;
              } else {
                if (var10 < var13) {
                  var10 = var13;
                }
              }
            }
            ti.a(param0, var9, var8, param3, 125, param5, param6);
            ti.a(var10, param1, param2, param3, 99, param5, var8);
            return;
          }
          for (var7_intLifetime1 = -1 + param2; var7_intLifetime1 > param6; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = fj.field_Pb[var8Lifetime1];
              var10Lifetime1 = fj.field_Pb[var8Lifetime1 + 1];
              if (nd.a(true, var10Lifetime1, var9Lifetime1, param3)) {
                fj.field_Pb[var8Lifetime1] = var10Lifetime1;
                fj.field_Pb[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw qb.addExceptionContext((Throwable) ((Object) var7), field_z + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_z = "ti.A(";
    }
}
