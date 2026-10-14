/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface WidgetLayoutProvider {
    public abstract int getTextOriginX(Widget widget, byte obfuscationGuard, int parentX);

    public abstract int getTextOriginY(int parentY, byte obfuscationGuard, Widget widget);

    public abstract int getPreferredWidth(Widget widget, int obfuscationGuard);

    public abstract int findTextSourceOffset(Widget widget, int pointerX, boolean obfuscationGuard, int parentY, int pointerY, int parentX);

    public abstract WidgetTextLayout getTextLayout(Widget widget, int obfuscationGuard);

    public abstract int getTextAreaWidth(int obfuscationGuard, Widget widget);

    public abstract int getLineHeight(byte obfuscationGuard);

    public abstract void paintTextSelection(int obfuscationGuard, int parentY, int parentX, int selectionAnchor, int caretIndex, Widget widget);

    public abstract void paintTextCaret(Widget widget, int parentX, int caretIndex, int parentY, byte obfuscationGuard);

    public abstract int getPreferredHeight(Widget widget, int obfuscationGuard);
}
