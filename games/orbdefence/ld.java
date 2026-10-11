/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ld {
    static int field_a;
    static String field_c;
    static String field_d;
    static int[] field_b;
    static String field_e;

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
        var12 = OrbDefence.field_D ? 1 : 0;
        try {
          if (ul.field_i > param4) {
            param0 = param0 - (-param4 + ul.field_i);
            param4 = ul.field_i;
          }
          if (ul.field_e < param0 + param4) {
            param0 = ul.field_e - param4;
          }
          if (param3 < ul.field_d) {
            param5 = param5 - (-param3 + ul.field_d);
            param3 = ul.field_d;
          }
          if (param3 + param5 > ul.field_a) {
            param5 = -param3 + ul.field_a;
          }
          if (param0 > 0 &&
            param5 > 0) {
            if (param1 < 77) {
              return;
            }
            var6_int = param3 * ul.field_f + param4;
            var7 = ul.field_f - param0;
            for (param3 = -param5; 0 > param3; param3++) {
              for (param4 = -param0; param4 < 0; param4++) {
                var8 = ul.field_b[var6_int];
                if ((var8 >> 8 & 255) > param2 &&
                  (16711680 & var8) >> 16 <= (255 & var8 >> 8)) {
                  var9 = -60 + ((16711680 & var8) >> 15);
                  if (var9 > 255) {
                    var9 = 255;
                  }
                  var10 = var8 & 65280;
                  var10 = 65280 & (var10 >> 1) - (var10 >> 5);
                  var11 = (255 & var8) >> 3;
                  ul.field_b[var6_int] = ge.a(ge.a(var10, var9 << 16), var11);
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
          throw dd.a((Throwable) ((Object) var6), "ld.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static boolean a(byte param0) {
        if (param0 != 85) {
          ld.a(8, -18, 124, -3, 46, 45);
        }
        return true;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          var4 = -108 / ((-53 - param2) / 51);
          var3_int = 0;
          while (param1 > 0) {
            var3_int = var3_int << 1 | 1 & param0;
            param1--;
            param0 = param0 >>> 1;
          }
          stackIn_5_0 = var3_int;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3), "ld.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
        field_e = null;
        field_d = null;
        field_b = null;
    }

    static {
        field_d = "Quit to website";
        field_c = "Waiting for instruments";
    }
}
