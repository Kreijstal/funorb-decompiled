/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class am {
    static int field_c;
    static int field_b;
    static String field_a;

    public static void b(int param0) {
        field_a = null;
        if (param0 != -7) {
          am.a(102, 53, -113, 106, 29);
        }
    }

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 > 0 &&
            128 > param0) {
            return true;
          }
          if (160 <= param0 &&
            255 >= param0) {
            return true;
          }
          if (0 != param0) {
            var6 = vg.field_s;
            var2 = var6;
            var3 = 0;
            while (var3 < var6.length) {
              var4 = var6[var3];
              if (~var4 != ~param0) {
                var3++;
                continue;
              }
              return true;
            }
          }
          if (param1 < 42) {
            field_b = 89;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var2_ref), "am.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_8_0 = false;
        if (param0 >= -97) {
          return true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (pl.field_I != 10 && (-7 != pl.field_I ||
          df.field_I)) {
          stackIn_8_0 = false;
          decompiledFrameRemainder0 = false;
        }
        else {
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    final static ja a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 1) {
          am.a('ﾘ', (byte) -57);
        }
        return nk.a(no.field_Hb[param2][param0], param1, 255, param4);
    }

    static {
    }
}
