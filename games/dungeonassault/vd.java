/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static String field_c;
    static String field_d;
    static int field_a;
    static String field_b;

    public static void a(byte param0) {
        int var1 = 80 % ((param0 + 41) / 47);
        field_b = null;
        field_c = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var7Lifetime1;
        int var7Lifetime2;
        var8 = DungeonAssault.field_K;
        try {
          var6_int = wh.field_g.field_d;
          if (2 == param3) {
            param0 = param0 - var6_int;
            param4 = param4 + var6_int;
          }
          jh.c();
          if (2 == param1) {
            param0 = param0 - var6_int;
          }
          gf.e(param4, param5, param4 + param0, 8 + param5);
          var7 = 0;
          if (param2 != -14561) {
            vd.a(-78, 112, -21, -44, 75, -60);
          }
          while (param0 > var7) {
            bk.field_e.b(var7 + param4, param5);
            var7 = var7 + bk.field_e.field_d;
          }
          jh.b();
          if (param3 == 2) {
            wh.field_g.j(-var6_int + param4, param5);
          }
          if (param1 == 2) {
            wh.field_g.h(param0 + param4, param5);
          }
          if (param3 == 1) {
            for (var7Lifetime1 = 0; 8 > var7Lifetime1; var7Lifetime1++) {
              qe.b(param4 + var7Lifetime1, param5, 8, 0, -(24 * var7Lifetime1) + 192);
            }
          }
          if (param1 == 1) {
            for (var7Lifetime2 = 0; var7Lifetime2 < 8; var7Lifetime2++) {
              qe.b(param0 + (param4 - (1 + var7Lifetime2)), param5, 8, 0, 192 - 24 * var7Lifetime2);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var6), "vd.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_c = "ACHIEVEMENTS";
        field_a = 94;
        field_d = "End Game";
        field_b = "<col=8B1717>Disarm</col>";
    }
}
