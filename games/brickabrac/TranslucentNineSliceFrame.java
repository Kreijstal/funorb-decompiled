/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TranslucentNineSliceFrame extends NineSliceFrame {
    static RgbSprite[] field_l;
    static QuickChatParameterType field_k;
    static RgbSprite[] field_h;
    static RgbSprite[] fullBrickSprites;
    static int[] glowBranchScratch;
    static RgbSprite field_j;
    static int field_n;

    final static void configureFullscreenDialog(int bodyLineHeight, int outerPaddingY, int buttonGapY, TextFont bodyFont, int centerY, int centerX, int maximumWrapWidth, NineSliceFrame outerFrame, int bodyPaint, int selectedPaint, int outerPaddingX, int buttonBaseline, int buttonPaint, NineSliceFrame selectedFrame, int buttonLineHeight, int buttonPaddingY, TextFont buttonFont, NineSliceFrame normalFrame, int bodyBaseline, int buttonPaddingX, int obfuscationGuard) {
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String bodyFontSummary = null;
        StringBuilder outerFrameContextBuilder = null;
        String outerFrameSummary = null;
        StringBuilder selectedFrameContextBuilder = null;
        String selectedFrameSummary = null;
        StringBuilder buttonFontContextBuilder = null;
        String buttonFontSummary = null;
        StringBuilder normalFrameContextBuilder = null;
        String normalFrameSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          Mesh3D.configureFullscreenDialogFonts(maximumWrapWidth, buttonFont, bodyFont, true);
          MusicCrossfadeStream.configureFullscreenDialogMetrics(buttonBaseline, buttonLineHeight, 256, bodyBaseline, bodyLineHeight);
          pp.setFullscreenDialogCenter(centerX, centerY, (byte) 19);
          WidgetLayerStack.configureFullscreenDialogButtons(buttonPaddingY, buttonGapY, selectedFrame, 73, normalFrame, buttonPaddingX);
          hd.configureFullscreenDialogFrame(117, outerFrame, outerPaddingX, outerPaddingY);
          LegacyUtf8Decoder.configureFullscreenDialogPaints(buttonPaint, selectedPaint, false, bodyPaint);
          if (obfuscationGuard != 10) {
            TranslucentNineSliceFrame.a(true);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("pa.D(").append(bodyLineHeight).append(',').append(outerPaddingY).append(',').append(buttonGapY).append(',');
          if (bodyFont == null) {
            bodyFontSummary = "null";
          } else {
            bodyFontSummary = "{...}";
          }
          outerFrameContextBuilder = ((StringBuilder) (Object) contextBuilder).append(bodyFontSummary).append(',').append(centerY).append(',').append(centerX).append(',').append(maximumWrapWidth).append(',');
          if (outerFrame == null) {
            outerFrameSummary = "null";
          } else {
            outerFrameSummary = "{...}";
          }
          selectedFrameContextBuilder = ((StringBuilder) (Object) outerFrameContextBuilder).append(outerFrameSummary).append(',').append(bodyPaint).append(',').append(selectedPaint).append(',').append(outerPaddingX).append(',').append(buttonBaseline).append(',').append(buttonPaint).append(',');
          if (selectedFrame == null) {
            selectedFrameSummary = "null";
          } else {
            selectedFrameSummary = "{...}";
          }
          buttonFontContextBuilder = ((StringBuilder) (Object) selectedFrameContextBuilder).append(selectedFrameSummary).append(',').append(buttonLineHeight).append(',').append(buttonPaddingY).append(',');
          if (buttonFont == null) {
            buttonFontSummary = "null";
          } else {
            buttonFontSummary = "{...}";
          }
          normalFrameContextBuilder = ((StringBuilder) (Object) buttonFontContextBuilder).append(buttonFontSummary).append(',');
          if (normalFrame == null) {
            normalFrameSummary = "null";
          } else {
            normalFrameSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) normalFrameContextBuilder).append(normalFrameSummary).append(',').append(bodyBaseline).append(',').append(buttonPaddingX).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void paintFrame(int width, int height, int x, boolean obfuscationGuard, int y) {
        Rasterizer2D.fillRectangleAlpha(x + 1, 1 + y, width - 2, height - 2, 0, 128);
        super.paintFrame(width, height, x, obfuscationGuard, y);
    }

    final static void a(boolean param0) {
        if (param0) {
          ed.a(0, 0);
          return;
        }
        NineSliceFrame var2 = (NineSliceFrame) null;
        TranslucentNineSliceFrame.configureFullscreenDialog(-2, -34, -105, (TextFont) null, -37, -46, -79, (NineSliceFrame) null, 96, 79, -47, -14, 91, (NineSliceFrame) null, -22, -64, (TextFont) null, (NineSliceFrame) null, 77, -115, -55);
        ed.a(0, 0);
    }

    TranslucentNineSliceFrame(RgbSprite[] sprites) {
        super(sprites);
    }

    public static void c(int param0) {
        fullBrickSprites = null;
        glowBranchScratch = null;
        field_k = null;
        field_h = null;
        field_j = null;
        if (param0 != 5) {
          return;
        }
        field_l = null;
    }

    static {
        glowBranchScratch = new int[1500];
        field_k = new QuickChatParameterType(10, 2, 2, 0);
        field_n = 5;
    }
}
