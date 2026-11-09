/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ScanlineSpriteMask extends SpriteMask {
    int[] rowWidths;
    int[] rowStarts;
    static int pendingTooltipY;
    private static String dmText;

    private ScanlineSpriteMask() throws Throwable {
        throw new Error();
    }

    static {
        dmText = "dm.<init>()";
        pendingTooltipY = -1;
    }
}
