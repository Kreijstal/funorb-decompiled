/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetPainter {
    public abstract int getTextTop(int obfuscationGuard, int originY, Widget widget);

    public abstract void drawSelection(int obfuscationGuard, int startIndex, int endIndex, Widget widget, int originY, int originX);

    public abstract int getPreferredHeight(Widget widget, int obfuscationGuard);

    public abstract int getLineInkHeight(boolean obfuscationGuard);

    public abstract int getTextLeft(Widget widget, int originX, byte obfuscationGuard);

    public abstract int hitTestCharacter(Widget widget, int pointerX, int obfuscationGuard, int originY, int pointerY, int originX);

    public abstract int getContentWidth(int obfuscationGuard, Widget widget);

    public abstract TextLayout getTextLayout(int obfuscationGuard, Widget widget);

    public abstract void drawCaret(int originY, int obfuscationGuard, int originX, Widget widget, int characterIndex);

    public abstract int getPreferredWidth(Widget widget, byte obfuscationGuard);
}
