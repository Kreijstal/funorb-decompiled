/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextWidgetRenderer {
    public abstract TextLayout getTextLayout(UiComponent uiComponentArgument1, byte byteArgument2);

    public abstract int getTextAreaWidth(boolean booleanArgument1, UiComponent uiComponentArgument2);

    public abstract void paintCaret(UiComponent uiComponentArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5);

    public abstract int getPreferredHeight(UiComponent uiComponentArgument1, int integerArgument2);

    public abstract int getTextOriginX(byte byteArgument1, UiComponent uiComponentArgument2, int integerArgument3);

    public abstract int getTextOriginY(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3);

    public abstract int getFontLineHeight(byte byteArgument1);

    public abstract int getPreferredWidth(UiComponent uiComponentArgument1, int integerArgument2);

    public abstract int findTextOffsetAtScreenPosition(int integerArgument1, int integerArgument2, UiComponent uiComponentArgument3, int integerArgument4, int integerArgument5, int integerArgument6);

    public abstract void paintSelection(int integerArgument1, int integerArgument2, int integerArgument3, int integerArgument4, int integerArgument5, UiComponent uiComponentArgument6);
}
