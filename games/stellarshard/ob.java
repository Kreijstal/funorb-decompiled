/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static fh field_b;
    static String field_d;
    static long field_a;
    static int[] field_c;

    public static void a(int param0) {
        field_c = null;
        if (param0 != 30063) {
          field_a = 73L;
        }
        field_b = null;
        field_d = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = stellarshard.field_B;
        try {
          if (param1 < ti.field_e) {
            param3 = param3 - (ti.field_e - param1);
            param1 = ti.field_e;
          }
          if (param5 < ti.field_f) {
            param4 = param4 - (-param5 + ti.field_f);
            param5 = ti.field_f;
          }
          if (param1 + param3 > ti.field_c) {
            param3 = -param1 + ti.field_c;
          }
          if (param5 + param4 > ti.field_l) {
            param4 = -param5 + ti.field_l;
          }
          if (param0 < 93) {
            field_b = (fh) null;
          }
          if (param3 > 0 &&
            0 < param4) {
            var6_int = param1 + param5 * ti.field_i;
            var7 = -param3 + ti.field_i;
            for (param5 = -param4; param5 < 0; param5++) {
              for (param1 = -param3; param1 < 0; param1++) {
                var8 = ti.field_a[var6_int];
                if (param2 < (255 & var8 >> 8) &&
                  (var8 >> 8 & 255) >= (var8 & 16711680) >> 16) {
                  var9 = (510 & var8 >> 15) - 60;
                  if (255 < var9) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = 65280 & (var10 >> 1) - (var10 >> 5);
                  var11 = (var8 & 255) >> 3;
                  ti.field_a[var6_int] = vf.b(var11, vf.b(var10, var9 << 16));
                }
                var6_int++;
              }
              var6_int = var6_int + var7;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var6), "ob.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_d = "Names can only contain letters, numbers, spaces and underscores";
        field_c = new int[128];
    }
}
