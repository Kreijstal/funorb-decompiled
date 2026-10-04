/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CrcAcknowledgedPacket extends IntrusiveNode {
    int acknowledgementCrc;
    byte[] payload;
    static volatile boolean canvasHasFocus;

    final static boolean containsAccountNameOrReverse(String textToSearch, String accountNameThenWithoutUnderscores, byte methodGuard) {
        String reversedName = null;
        boolean containsNameBeforeReturn = false;
        RuntimeException comparisonFailureBeforeDescription = null;
        StringBuilder comparisonMessagePrefix = null;
        String textDescription = null;
        StringBuilder messageBeforeName = null;
        String nameDescription = null;
        RuntimeException caughtComparisonFailure = null;
        RuntimeException comparisonFailureForContext = null;
        try {
          accountNameThenWithoutUnderscores = CharacterReplacementSupport.replaceCharacter(accountNameThenWithoutUnderscores, "", '_', (byte) 127);
          reversedName = CachedArchiveSource.reverseTextCodeUnits(82, accountNameThenWithoutUnderscores);
          if (methodGuard > -77) {
            canvasHasFocus = true;
          }
          containsNameBeforeReturn = !(textToSearch.indexOf(accountNameThenWithoutUnderscores) == -1) || !(textToSearch.indexOf(reversedName) == -1);
          return containsNameBeforeReturn;
        } catch (java.lang.RuntimeException comparisonFailure) {
          caughtComparisonFailure = comparisonFailure;
          comparisonFailureForContext = caughtComparisonFailure;
          comparisonFailureBeforeDescription = comparisonFailureForContext;
          comparisonMessagePrefix = new StringBuilder().append("wc.B(");
          if (textToSearch == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          messageBeforeName = ((StringBuilder) (Object) comparisonMessagePrefix).append(textDescription).append(',');
          if (accountNameThenWithoutUnderscores == null) {
            nameDescription = "null";
          } else {
            nameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) comparisonFailureBeforeDescription), ((StringBuilder) (Object) messageBeforeName).append(nameDescription).append(',').append(methodGuard).append(')').toString());
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
