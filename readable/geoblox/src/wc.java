/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc extends IntrusiveNode {
    int field_h;
    byte[] field_f;
    static volatile boolean field_g;

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = qj.a(param1, "", '_', (byte) 127);
          var3 = CachedArchiveSource.a(82, param1);
          if (param2 > -77) {
            field_g = true;
          }
          stackIn_7_0 = !(param0.indexOf(param1) == -1) || !(param0.indexOf(var3) == -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var3_ref);
          stackIn_10_1 = new StringBuilder().append("wc.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void requestAvatarTintForRadius(float maxAttachedRadiusSquared, byte methodGuard) {
        if (!(jf.avatarTintFadeTicks <= 0)) {
            return;
        }
        r.avatarTintStartColor = rj.avatarTintColor;
        int sentinelDivisionGuard = -71 / ((-59 - methodGuard) / 47);
        float normalizedRadiusSquared = maxAttachedRadiusSquared / 52900.0f;
        int tintPaletteIndex = (int)(0.5f + 4.0f * normalizedRadiusSquared);
        md.avatarTintRedDelta = (float)(-(rj.avatarTintColor >> 16 & 255) + ((DiskCacheWorker.avatarTintPalette[tintPaletteIndex] & 16722826) >> 16));
        GzipInflater.avatarTintGreenDelta = (float)((DiskCacheWorker.avatarTintPalette[tintPaletteIndex] >> 8 & 255) - (rj.avatarTintColor >> 8 & 255));
        uk.avatarTintBlueDelta = (float)(-(255 & rj.avatarTintColor) + (255 & DiskCacheWorker.avatarTintPalette[tintPaletteIndex]));
        jf.avatarTintFadeTicks = 50;
    }

    private wc() throws Throwable {
        throw new Error();
    }

    static {
        field_g = true;
    }
}
