/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PointerMenuState {
    static volatile int livePointerX;
    static TextTemplateArgumentType textTemplateArgumentTypeSix;
    static int menuPointerInitialRepeatDelay;
    static Sprite smallBoxSprite;
    static IndexedSprite[] screenOptionThreeStateSprites;
    private static String unusedDiagnosticPrefix;

    public static void releasePointerMenuResources(int methodGuard) {
        if (methodGuard == -1) {
            smallBoxSprite = null;
            textTemplateArgumentTypeSix = null;
            screenOptionThreeStateSprites = null;
            return;
        }
        livePointerX = -112;
        smallBoxSprite = null;
        textTemplateArgumentTypeSix = null;
        screenOptionThreeStateSprites = null;
    }

    static {
        unusedDiagnosticPrefix = "lj.A(";
        livePointerX = -1;
        textTemplateArgumentTypeSix = new TextTemplateArgumentType(6, 0, 4, 2);
        menuPointerInitialRepeatDelay = 20;
    }
}
