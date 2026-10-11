/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua {
    static o field_d;
    static int field_c;
    static ge field_b;
    static int field_a;

    public static void a(int param0) {
        if (param0 != 128) {
          return;
        }
        field_d = null;
        field_b = null;
    }

    final static boolean a(char param0, int param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = StarCannon.field_A;
        try {
          if (param1 < param0 &&
            128 > param0) {
            return true;
          }
          if (160 <= param0 &&
            255 >= param0) {
            return true;
          }
          if (0 != param0) {
            var6 = ee.field_c;
            var2 = var6;
            var3 = 0;
            while (var6.length > var3) {
              var4 = var6[var3];
              if (var4 != param0) {
                var3++;
                continue;
              }
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "ua.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_d = new o(9, 0, 4, 1);
        field_b = new ge();
        field_a = -1;
    }
}
