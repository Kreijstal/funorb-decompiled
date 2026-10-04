/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BootstrapUiSupport {
    static String achievementsText;

    final static void clearAchievementsTextWhenGuardAllows(int methodGuard) {
        if (methodGuard >= -9) {
            achievementsText = (String) null;
        }
    }

    final static boolean shouldShowBootstrapLoadingScreen(int methodGuard) {
        if (methodGuard != 255) {
            BootstrapUiSupport.countSetBits(-112, (byte) -119);
            if (VisualPropertyOverrides.clientBootstrapStage < 20) {
                return true;
            }
            if (!CacheReference.haveRequiredClientStages(-31456)) {
                return true;
            }
            if (EntityLinkSupport.sessionAccessLevelByte <= 0) {
                return false;
            }
            if (!TextTemplateArgumentType.returnTrueWithSoundThemeGuard(0)) {
                return true;
            }
            return false;
        }
        if (VisualPropertyOverrides.clientBootstrapStage < 20) {
            return true;
        }
        if (!CacheReference.haveRequiredClientStages(-31456)) {
            return true;
        }
        if (EntityLinkSupport.sessionAccessLevelByte <= 0) {
            return false;
        }
        if (!TextTemplateArgumentType.returnTrueWithSoundThemeGuard(0)) {
            return true;
        }
        return false;
    }

    final static int countSetBits(int valueThenPartialBitCount, byte methodGuard) {
        valueThenPartialBitCount = (-715827883 & valueThenPartialBitCount >>> 1) + (1431655765 & valueThenPartialBitCount);
        if (methodGuard == 70) {
            valueThenPartialBitCount = (valueThenPartialBitCount & 858993459) + (valueThenPartialBitCount >>> 2 & 858993459);
            valueThenPartialBitCount = valueThenPartialBitCount + (valueThenPartialBitCount >>> 4) & 252645135;
            valueThenPartialBitCount = valueThenPartialBitCount + (valueThenPartialBitCount >>> 8);
            valueThenPartialBitCount = valueThenPartialBitCount + (valueThenPartialBitCount >>> 16);
            return valueThenPartialBitCount & 255;
        }
        achievementsText = (String) null;
        valueThenPartialBitCount = (valueThenPartialBitCount & 858993459) + (valueThenPartialBitCount >>> 2 & 858993459);
        valueThenPartialBitCount = valueThenPartialBitCount + (valueThenPartialBitCount >>> 4) & 252645135;
        valueThenPartialBitCount = valueThenPartialBitCount + (valueThenPartialBitCount >>> 8);
        valueThenPartialBitCount = valueThenPartialBitCount + (valueThenPartialBitCount >>> 16);
        return valueThenPartialBitCount & 255;
    }

    public static void releaseBootstrapUiText(int methodGuard) {
        if (methodGuard != -9751) {
            BootstrapUiSupport.countSetBits(31, (byte) -123);
            achievementsText = null;
            return;
        }
        achievementsText = null;
    }

    static {
        achievementsText = "Achievements";
    }
}
