/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientOptionSupport {
    static int[] sharedSavedClip;
    static int clientOptionMask;
    static ClientProtocolStage awaitingLoginDetailsStage;
    static ClientProtocolStage awaitingLoginResultStage;
    static int selectedHighscoreView;
    static Sprite validationIconScratchSprite;
    static String createEmailValidText;

    final static void configureMenuPointerRepeat(int rateScale, int baseInitialDelay) {
        PointerMenuState.menuPointerInitialRepeatDelay = baseInitialDelay * rateScale / 50;
        CacheReference.menuPointerRepeatInterval = rateScale * 4 / 50;
    }

    final static boolean isClientOptionEnabled(int optionBitIndex, int methodGuard) {
        if (optionBitIndex != -1) {
            int sentinelQuotient = 43 / ((24 - methodGuard) / 50);
            return (clientOptionMask & 1 << optionBitIndex) != 0 ? true : false;
        }
        return true;
    }

    final static int roundUpPowerOfTwo(byte methodGuard, int valueThenSpreadBits) {
        valueThenSpreadBits--;
        valueThenSpreadBits = valueThenSpreadBits | valueThenSpreadBits >>> 1;
        valueThenSpreadBits = valueThenSpreadBits | valueThenSpreadBits >>> 2;
        if (methodGuard > 88) {
            valueThenSpreadBits = valueThenSpreadBits | valueThenSpreadBits >>> 4;
            valueThenSpreadBits = valueThenSpreadBits | valueThenSpreadBits >>> 8;
            valueThenSpreadBits = valueThenSpreadBits | valueThenSpreadBits >>> 16;
            return valueThenSpreadBits + 1;
        }
        return -15;
    }

    final static void selectBootstrapLanguageText(boolean methodGuard, int languageIndex) {
        SocialListEntry.field_lb = InstrumentEnvelope.field_k[languageIndex];
        LoginProtocolSupport.field_c = IntrusiveDeque.waitingForTextByLanguage[languageIndex];
        CachedTextLayout.field_g = PointerInputListener.field_b[languageIndex];
        if (!methodGuard) {
            sharedSavedClip = (int[]) null;
        }
    }

    public static void releaseClientOptionResources(int methodGuard) {
        validationIconScratchSprite = null;
        createEmailValidText = null;
        if (methodGuard == 50) {
            sharedSavedClip = null;
            awaitingLoginResultStage = null;
            awaitingLoginDetailsStage = null;
            return;
        }
        sharedSavedClip = (int[]) null;
        sharedSavedClip = null;
        awaitingLoginResultStage = null;
        awaitingLoginDetailsStage = null;
    }

    static {
        sharedSavedClip = new int[4];
        clientOptionMask = 0;
        awaitingLoginDetailsStage = new ClientProtocolStage();
        awaitingLoginResultStage = new ClientProtocolStage();
        createEmailValidText = "Email is valid";
        selectedHighscoreView = 0;
    }
}
