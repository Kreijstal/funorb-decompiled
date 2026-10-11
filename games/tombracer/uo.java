/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uo {
    int field_b;
    static String[] field_d;
    int field_c;
    int field_a;

    public static void a(byte param0) {
        field_d = null;
        if (param0 != 10) {
          uo.a((byte) -76);
        }
    }

    final static void b(byte param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        g var11 = null;
        int var12 = 0;
        int var13 = 0;
        g var14 = null;
        g var15 = null;
        ub var16 = null;
        g var17 = null;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        var13 = TombRacer.field_G ? 1 : 0;
        try {
          var16 = new ub(200);
          var2 = 0;
          var3 = 0;
          for (var4 = 0; kba.f(-1) > var4; var4++) {
            var5 = rga.b(26499, var4);
            for (var6 = 0; var6 < var5; var6++) {
              var15 = paa.c(var4, 91, var6);
              if (-1 != var15.field_a ||
                var15.field_e.a(-25584)) {
                var8 = var15.field_e.c(1);
                if (var8 > 0) {
                  var9 = 0;
                  var10 = 0;
                  while (var16.a(-1) > var10) {
                    var11 = (g) (var16.a(true, var10));
                    var12 = var11.field_e.c(1);
                    if (var8 >= var12 && (var8 != var12 ||
                      !(var11.field_a > var15.field_a))) {
                      var10++;
                      continue;
                    }
                    var16.a(var10, 0, var15);
                    var9 = 1;
                    break;
                  }
                  if (var9 == 0) {
                    var16.a((byte) -37, var15);
                  }
                  if (!var15.field_e.a(-25584)) {
                    var2++;
                  } else {
                    var3++;
                  }
                }
              }
            }
          }
          qg.field_a = new g[var2];
          sja.field_i = new g[var3];
          if (param0 > -54) {
            return;
          }
          var4Lifetime1 = 0;
          var5Lifetime1 = 0;
          for (var6Lifetime1 = 0; var16.a(-1) > var6Lifetime1; var6Lifetime1++) {
            var14 = (g) (var16.a(true, var6Lifetime1));
            var17 = var14;
            if (!var17.field_e.a(-25584)) {
              incrementValue$0 = var4Lifetime1;
              var4Lifetime1++;
              qg.field_a[incrementValue$0] = var17;
            } else {
              incrementValue$1 = var5Lifetime1;
              var5Lifetime1++;
              sja.field_i[incrementValue$1] = var14;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "uo.B(" + param0 + ')');
        }
    }

    static {
    }
}
