/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj {
    static cn field_b;
    static String field_d;
    static int field_c;
    static String field_a;

    public static void a(byte param0) {
        field_a = null;
        if (param0 <= 60) {
          field_b = (cn) null;
        }
        field_d = null;
        field_b = null;
    }

    final static void b(byte param0) {
        if (param0 >= -87) {
          field_b = (cn) null;
        }
        eg.a(rl.field_h, true);
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
        var12 = DungeonAssault.field_K;
        try {
          if (gf.field_j > param2) {
            param5 = param5 - (gf.field_j - param2);
            param2 = gf.field_j;
          }
          if (gf.field_f > param3) {
            param4 = param4 - (gf.field_f - param3);
            param3 = gf.field_f;
          }
          if (gf.field_h < param2 + param5) {
            param5 = -param2 + gf.field_h;
          }
          if (param1 != -971598481) {
            field_a = (String) null;
          }
          if (param4 + param3 > gf.field_e) {
            param4 = gf.field_e - param3;
          }
          if (param5 > 0 &&
            0 < param4) {
            var6_int = param2 + param3 * gf.field_i;
            var7 = -param5 + gf.field_i;
            for (param3 = -param4; param3 < 0; param3++) {
              for (param2 = -param5; 0 > param2; param2++) {
                var8 = gf.field_b[var6_int];
                if ((65280 & var8) >> 8 > param0 &&
                  (255 & var8 >> 16) <= (255 & var8 >> 8)) {
                  var9 = ((var8 & 16711680) >> 15) - 60;
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = 65280 & (var10 >> 1) - (var10 >> 5);
                  var11 = 31 & var8 >> 3;
                  gf.field_b[var6_int] = mp.a(var11, mp.a(var9 << 16, var10));
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
          throw vk.a((Throwable) ((Object) var6), "jj.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_d = null;
        field_a = "Razor Construct";
    }
}
