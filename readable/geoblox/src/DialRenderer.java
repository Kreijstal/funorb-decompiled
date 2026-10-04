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
        int var13 = 0;
        double var9 = 0.0;
        int var11 = 0;
        int var12 = 0;
        DialWidget var14 = widget instanceof DialWidget ? (DialWidget) ((Object) widget) : null;
        SoftwareRasterizer.fillRectangle(parentX + widget.widgetX, widget.widgetY + parentY, widget.widgetWidth, widget.widgetHeight, this.backgroundColor);
        if (var14 != null) {
        }
        int var7 = widget.widgetX + parentX + var14.centerOffsetX;
        int var8 = widget.widgetY + parentY + var14.centerOffsetY;
        SoftwareRasterizer.fillCircle(var7, var8, var14.radius, this.dialColor);
        if (var14.secondaryMarkerStep != -1) {
            var9 = (double)var14.secondaryMarkerStep * 3.141592653589793 * 2.0 / (double)var14.stepCount;
            var11 = (int)(-Math.sin(var9) * (double)var14.radius);
            var12 = (int)(Math.cos(var9) * (double)var14.radius);
            SoftwareRasterizer.fillCircle(var7 + var11, var8 + var12, 1, this.secondaryMarkerColor);
        }
        SoftwareRasterizer.fillCircle(var7, var8, 2, 1);
        var9 = 2.0 * (3.141592653589793 * (double)var14.selectedStep) / (double)var14.stepCount;
        var11 = (int)(-Math.sin(var9) * (double)var14.radius);
        var12 = (int)(Math.cos(var9) * (double)var14.radius);
        if (methodGuard > -5) {
            return;
        }
        try {
            SoftwareRasterizer.drawLine(var7, var8, var11 + var7, var12 + var8, 1);
            if (this.font != null) {
                var13 = this.padding + (var14.centerOffsetX + var14.radius);
                this.font.drawParagraph(widget.widgetText, var13 + (parentX + widget.widgetX), parentY + widget.widgetY + this.textOffsetY, widget.widgetWidth - (this.padding + var13), -(this.padding << 1) + widget.widgetHeight, this.textColor, this.textShadowColor, 1, 1, 0);
            }
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "hb.E(" + parentX + ',' + methodGuard + ',' + parentY + ',' + widgetEnabled + ',' + (widget != null ? "{...}" : "null") + ')');
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

    DialRenderer(BitmapFont param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        try {
            this.dialColor = param5;
            this.backgroundColor = param7;
            this.textColor = param3;
            this.font = param0;
            this.padding = param1;
            this.textShadowColor = param4;
            this.secondaryMarkerColor = param6;
            this.textOffsetY = param2;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "hb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    static {
        byteArrayPool100Count = 0;
        playFreeVersionText = "Play free version";
    }
}
