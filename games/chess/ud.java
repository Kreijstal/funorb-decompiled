/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud {
    static boolean field_b;
    static nb field_d;
    static int field_a;
    static RgbSprite field_c;

    final synchronized static long correctedCurrentTimeMillis(int param0) {
        PlatformTaskDispatcher var3 = null;
        long var1 = System.currentTimeMillis();
        PlatformTaskDispatcher var3Lifetime1;
        if (v.field_a > var1) {
          cl.field_b = cl.field_b + (-var1 + v.field_a);
          v.field_a = var1;
          if (param0 != 2) {
            var3 = (PlatformTaskDispatcher) null;
            ud.a(-100, (PlatformTaskDispatcher) null);
            return var1 + cl.field_b;
          }
          return var1 + cl.field_b;
        }
        v.field_a = var1;
        if (param0 == 2) {
          return var1 + cl.field_b;
        }
        var3Lifetime1 = (PlatformTaskDispatcher) null;
        ud.a(-100, (PlatformTaskDispatcher) null);
        return var1 + cl.field_b;
    }

    public static void clearStaticReferences(byte param0) {
        if (param0 != -109) {
          return;
        }
        field_c = null;
        field_d = null;
    }

    final static tm[] a(int param0, PlatformTaskDispatcher param1) {
        int var5 = 0;
        tm[] stackIn_4_0 = null;
        tm[] stackIn_10_0 = null;
        tm[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        tm[] var4 = null;
        tm var6 = null;
        int var7 = 0;
        PlatformTaskDispatcher var8 = null;
        PlatformTask var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = Chess.field_G;
        try {
          if (!param1.isFullscreenAvailable(true)) {
            stackIn_4_0 = new tm[]{};
            return stackIn_4_0;
          }
          var9 = param1.requestDisplayModes(param0 - 624985114);
          while (var9.status == 0) {
            bc.sleepMillis(10L, (byte) 95);
          }
          if (var9.status == 2) {
            stackIn_10_0 = new tm[]{};
            return stackIn_10_0;
          }
          if (param0 != 624968802) {
            var8 = (PlatformTaskDispatcher) null;
            ud.a(42, (PlatformTaskDispatcher) null);
          }
          var11 = (int[]) (var9.result);
          var10 = var11;
          var3 = var10;
          var4 = new tm[var11.length >> 2];
          for (var5 = 0; var4.length > var5; var5++) {
            var6 = new tm();
            var4[var5] = var6;
            var6.field_g = var3[var5 << 2];
            var6.field_e = var3[1 + (var5 << 2)];
            var6.field_i = var3[2 + (var5 << 2)];
            var6.field_f = var3[3 + (var5 << 2)];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("ud.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
    }
}
