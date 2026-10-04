/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CrcAcknowledgedPacket extends IntrusiveNode {
    int acknowledgementCrc;
    byte[] payload;
    static volatile boolean canvasHasFocus;

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
          param1 = CharacterReplacementSupport.replaceCharacter(param1, "", '_', (byte) 127);
          var3 = CachedArchiveSource.reverseTextCodeUnits(82, param1);
          if (param2 > -77) {
            canvasHasFocus = true;
          }
          stackIn_7_0 = !(param0.indexOf(param1) == -1) || !(param0.indexOf(var3) == -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
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
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void requestAvatarTintForRadius(float maxAttachedRadiusSquared, byte methodGuard) {
        if (!(MultiHandleSliderRenderer.avatarTintFadeTicks <= 0)) {
            return;
        }
        AccountCreationDialog.avatarTintStartColor = DisplayModeInfo.avatarTintColor;
        int sentinelDivisionGuard = -71 / ((-59 - methodGuard) / 47);
        float normalizedRadiusSquared = maxAttachedRadiusSquared / 52900.0f;
        int tintPaletteIndex = (int)(0.5f + 4.0f * normalizedRadiusSquared);
        GmtTimestampSupport.avatarTintRedDelta = (float)(-(DisplayModeInfo.avatarTintColor >> 16 & 255) + ((DiskCacheWorker.avatarTintPalette[tintPaletteIndex] & 16722826) >> 16));
        GzipInflater.avatarTintGreenDelta = (float)((DiskCacheWorker.avatarTintPalette[tintPaletteIndex] >> 8 & 255) - (DisplayModeInfo.avatarTintColor >> 8 & 255));
        UsernameAvailabilityValidator.avatarTintBlueDelta = (float)(-(255 & DisplayModeInfo.avatarTintColor) + (255 & DiskCacheWorker.avatarTintPalette[tintPaletteIndex]));
        MultiHandleSliderRenderer.avatarTintFadeTicks = 50;
    }

    private CrcAcknowledgedPacket() throws Throwable {
        throw new Error();
    }

    static {
        canvasHasFocus = true;
    }
}
