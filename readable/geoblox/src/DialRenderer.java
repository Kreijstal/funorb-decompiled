/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DialRenderer implements WidgetRenderer {
    static int[] rankedEntryResponseIndices;
    static int byteArrayPool100Count;
    static ResourceArchive initialButtonAndLogoArchive;
    private int textColor;
    static String playFreeVersionText;
    private int dialColor;
    private BitmapFont font;
    private int textOffsetY;
    private int secondaryMarkerColor;
    private int padding;
    private int backgroundColor;
    private int textShadowColor;
    static WidgetTheme accountUiTheme;
    static Sprite[] silverStarFrames;

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        int textLeftInset = 0;
        double markerAngleRadians = 0.0;
        int markerOffsetX = 0;
        int markerOffsetY = 0;
        DialWidget dialWidgetOrNull = widget instanceof DialWidget ? (DialWidget) ((Object) widget) : null;
        double markerAngleRadiansLiteralPhase1;
        SoftwareRasterizer.fillRectangle(parentX + widget.widgetX, widget.widgetY + parentY, widget.widgetWidth, widget.widgetHeight, this.backgroundColor);
        if (dialWidgetOrNull != null) {
        }
        int dialCenterX = widget.widgetX + parentX + dialWidgetOrNull.centerOffsetX;
        int dialCenterY = widget.widgetY + parentY + dialWidgetOrNull.centerOffsetY;
        SoftwareRasterizer.fillCircle(dialCenterX, dialCenterY, dialWidgetOrNull.radius, this.dialColor);
        if (dialWidgetOrNull.secondaryMarkerStep != -1) {
            markerAngleRadians = (double)dialWidgetOrNull.secondaryMarkerStep * 3.141592653589793 * 2.0 / (double)dialWidgetOrNull.stepCount;
            markerOffsetX = (int)(-Math.sin(markerAngleRadians) * (double)dialWidgetOrNull.radius);
            markerOffsetY = (int)(Math.cos(markerAngleRadians) * (double)dialWidgetOrNull.radius);
            SoftwareRasterizer.fillCircle(dialCenterX + markerOffsetX, dialCenterY + markerOffsetY, 1, this.secondaryMarkerColor);
        }
        SoftwareRasterizer.fillCircle(dialCenterX, dialCenterY, 2, 1);
        markerAngleRadiansLiteralPhase1 = 2.0 * (3.141592653589793 * (double)dialWidgetOrNull.selectedStep) / (double)dialWidgetOrNull.stepCount;
        markerOffsetX = (int)(-Math.sin(markerAngleRadiansLiteralPhase1) * (double)dialWidgetOrNull.radius);
        markerOffsetY = (int)(Math.cos(markerAngleRadiansLiteralPhase1) * (double)dialWidgetOrNull.radius);
        if (methodGuard > -5) {
            return;
        }
        try {
            SoftwareRasterizer.drawLine(dialCenterX, dialCenterY, markerOffsetX + dialCenterX, markerOffsetY + dialCenterY, 1);
            if (this.font != null) {
                textLeftInset = this.padding + (dialWidgetOrNull.centerOffsetX + dialWidgetOrNull.radius);
                this.font.drawParagraph(widget.widgetText, textLeftInset + (parentX + widget.widgetX), parentY + widget.widgetY + this.textOffsetY, widget.widgetWidth - (this.padding + textLeftInset), -(this.padding << 1) + widget.widgetHeight, this.textColor, this.textShadowColor, 1, 1, 0);
            }
        } catch (RuntimeException drawingFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawingFailure), "hb.E(" + parentX + ',' + methodGuard + ',' + parentY + ',' + widgetEnabled + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        initialButtonAndLogoArchive = null;
        playFreeVersionText = null;
        if (methodGuard == 0) {
            rankedEntryResponseIndices = null;
            accountUiTheme = null;
            silverStarFrames = null;
            return;
        }
        playFreeVersionText = (String) null;
        rankedEntryResponseIndices = null;
        accountUiTheme = null;
        silverStarFrames = null;
    }

    DialRenderer(BitmapFont font, int padding, int textOffsetY, int textColor, int textShadowColor, int dialColor, int secondaryMarkerColor, int backgroundColor) {
        try {
            this.dialColor = dialColor;
            this.backgroundColor = backgroundColor;
            this.textColor = textColor;
            this.font = font;
            this.padding = padding;
            this.textShadowColor = textShadowColor;
            this.secondaryMarkerColor = secondaryMarkerColor;
            this.textOffsetY = textOffsetY;
        } catch (RuntimeException rendererInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rendererInitializationFailure), "hb.<init>(" + (font != null ? "{...}" : "null") + ',' + padding + ',' + textOffsetY + ',' + textColor + ',' + textShadowColor + ',' + dialColor + ',' + secondaryMarkerColor + ',' + backgroundColor + ')');
        }
    }

    static {
        byteArrayPool100Count = 0;
        playFreeVersionText = "Play free version";
    }
}
