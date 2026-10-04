/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LabeledChildWidget extends SingleChildWidget {
    private int labelWidth;
    private BitmapFont labelFont;
    private String labelText;
    static Sprite sportsForegroundSprite;
    static int[] nineSliceSavedClip;
    private boolean labelAfterChild;
    private int padding;
    static char[] extendedNameCharacters;
    private int labelColor;

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        int var5 = parentX + this.widgetX;
        int var6 = parentY + this.widgetY;
        super.renderWidget(parentX, parentY, (byte) 105, renderPass);
        int var7 = -79 / ((methodGuard - 1) / 43);
        if ((renderPass != 0)) {
            return;
        }
        int var8 = !this.labelAfterChild ? 0 : -this.labelWidth + (this.widgetWidth - this.padding * 2);
        this.labelFont.drawParagraph(this.labelText, this.padding + (var8 + var5), this.padding + var6, -this.padding + this.labelWidth, -(this.padding * 2) + this.widgetHeight, this.labelColor, -1, !this.labelAfterChild ? 2 : 0, 1, this.labelFont.maxAscent);
    }

    public static void releaseStaticReferences(byte methodGuard) {
        sportsForegroundSprite = null;
        if (methodGuard != -52) {
            return;
        }
        extendedNameCharacters = null;
        nineSliceSavedClip = null;
    }

    final static void recordEntityRelease(int param0) {
        if (UiWidget.gameplaySession.tutorialMode) {
          return;
        }
        TextTemplateDefinitionLoader.releasedInDifficultyStep = TextTemplateDefinitionLoader.releasedInDifficultyStep + 1;
        MatchCandidateSupport.releasedInCurrentTheme = MatchCandidateSupport.releasedInCurrentTheme + 1;
        if ((ContextualRuntimeException.releasesPerDifficultyStep == TextTemplateDefinitionLoader.releasedInDifficultyStep) &&
            (DequeCursor.difficultyAdvancesInCurrentTheme < 2)) {
          TextTemplateDefinitionLoader.releasedInDifficultyStep = 0;
          PlayfieldRules.advanceDifficulty(false);
          DequeCursor.difficultyAdvancesInCurrentTheme = DequeCursor.difficultyAdvancesInCurrentTheme + 1;
        }
        if (param0 != 2) {
          nineSliceSavedClip = (int[]) null;
        }
        if (MessageDialogSupport.releasesPerTheme == MatchCandidateSupport.releasedInCurrentTheme) {
          MatchCandidateSupport.releasedInCurrentTheme = 0;
          CacheReference.generatedInCurrentTheme = 0;
          UiWidget.gameplaySession.sessionPhase = 1;
          TextTemplateDefinitionLoader.releasedInDifficultyStep = 0;
          if (DequeCursor.difficultyAdvancesInCurrentTheme < 2) {
            PlayfieldRules.advanceDifficulty(false);
          }
          DequeCursor.difficultyAdvancesInCurrentTheme = 0;
          UiWidget.completedThemeCount = UiWidget.completedThemeCount + 1;
        }
    }

    final String getHoverText(byte methodGuard) {
        int var2 = this.child.pointerInside ? 1 : 0;
        this.child.pointerInside = this.pointerInside;
        String var3 = this.child.getHoverText(methodGuard);
        this.child.pointerInside = var2 != 0 ? true : false;
        return var3;
    }

    LabeledChildWidget(int x, int y, int width, int minimumHeight, UiWidget child, boolean labelAfterChild, int labelWidth, int padding, BitmapFont labelFont, int labelColor, String labelText) {
        super(x, y, width, minimumHeight, (WidgetRenderer) null, (WidgetListener) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.labelColor = labelColor;
          this.child = child;
          this.padding = padding;
          this.labelFont = labelFont;
          if (!labelAfterChild) {
            stackIn_4_1 = false;
          } else {
            stackIn_4_1 = true;
          }
          ((LabeledChildWidget) (this)).labelAfterChild = stackIn_4_1;
          this.labelWidth = labelWidth;
          this.labelText = labelText;
          var12_int = this.labelWidth - this.padding;
          var13 = this.labelFont.measureWrappedHeight(labelText, var12_int, this.labelFont.maxAscent) + 2 * this.padding;
          if (var13 <= minimumHeight) {
            var13 = minimumHeight;
          } else {
            this.setWidgetBounds(var13, width, (byte) -74, y, x);
          }
          if (!this.labelAfterChild) {
            stackIn_10_0 = this.labelWidth + this.padding * 2;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.child.setWidgetBounds(-(2 * this.padding) + minimumHeight, width - this.labelWidth - this.padding * 3, (byte) -105, (-minimumHeight + var13 >> 1) + this.padding, var14);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("hd.<init>(").append(x).append(',').append(y).append(',').append(width).append(',').append(minimumHeight).append(',');
          if (child == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(labelAfterChild).append(',').append(labelWidth).append(',').append(padding).append(',');
          if (labelFont == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(labelColor).append(',');
          if (labelText == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        nineSliceSavedClip = new int[4];
        extendedNameCharacters = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
