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
        int widgetScreenX = parentX + this.widgetX;
        int widgetScreenY = parentY + this.widgetY;
        super.renderWidget(parentX, parentY, (byte) 105, renderPass);
        int renderGuardQuotient = -79 / ((methodGuard - 1) / 43);
        if (renderPass != 0) {
            return;
        }
        int labelOffsetX = !this.labelAfterChild ? 0 : -this.labelWidth + (this.widgetWidth - this.padding * 2);
        this.labelFont.drawParagraph(this.labelText, this.padding + (labelOffsetX + widgetScreenX), this.padding + widgetScreenY, -this.padding + this.labelWidth, -(this.padding * 2) + this.widgetHeight, this.labelColor, -1, !this.labelAfterChild ? 2 : 0, 1, this.labelFont.maxAscent);
    }

    public static void releaseStaticReferences(byte methodGuard) {
        sportsForegroundSprite = null;
        if (methodGuard != -52) {
            return;
        }
        extendedNameCharacters = null;
        nineSliceSavedClip = null;
    }

    final static void recordEntityRelease(int methodGuard) {
        if (UiWidget.gameplaySession.tutorialMode) {
          return;
        }
        TextTemplateDefinitionLoader.releasedInDifficultyStep = TextTemplateDefinitionLoader.releasedInDifficultyStep + 1;
        MatchCandidateSupport.releasedInCurrentTheme = MatchCandidateSupport.releasedInCurrentTheme + 1;
        if (ContextualRuntimeException.releasesPerDifficultyStep == TextTemplateDefinitionLoader.releasedInDifficultyStep &&
            DequeCursor.difficultyAdvancesInCurrentTheme < 2) {
          TextTemplateDefinitionLoader.releasedInDifficultyStep = 0;
          PlayfieldRules.advanceDifficulty(false);
          DequeCursor.difficultyAdvancesInCurrentTheme = DequeCursor.difficultyAdvancesInCurrentTheme + 1;
        }
        if (methodGuard != 2) {
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
        int previousChildHoverFlag = this.child.pointerInside ? 1 : 0;
        this.child.pointerInside = this.pointerInside;
        String childHoverText = this.child.getHoverText(methodGuard);
        this.child.pointerInside = previousChildHoverFlag != 0 ? true : false;
        return childHoverText;
    }

    LabeledChildWidget(int x, int y, int width, int minimumHeight, UiWidget child, boolean labelAfterChild, int labelWidth, int padding, BitmapFont labelFont, int labelColor, String labelText) {
        super(x, y, width, minimumHeight, (WidgetRenderer) null, (WidgetListener) null);
        boolean labelPlacementSnapshot = false;
        int selectedChildOffsetX = 0;
        RuntimeException constructionFailureBeforeDescriptions = null;
        StringBuilder constructionMessagePrefix = null;
        String childDescription = null;
        StringBuilder constructionMessageBeforeFont = null;
        String fontDescription = null;
        StringBuilder constructionMessageBeforeText = null;
        String labelTextDescription = null;
        RuntimeException constructionFailure = null;
        int labelTextWidth = 0;
        RuntimeException constructionFailureForContext = null;
        int resolvedContainerHeight = 0;
        int childOffsetX = 0;
        try {
          this.labelColor = labelColor;
          this.child = child;
          this.padding = padding;
          this.labelFont = labelFont;
          labelPlacementSnapshot = !(!labelAfterChild);
          this.labelAfterChild = labelPlacementSnapshot;
          this.labelWidth = labelWidth;
          this.labelText = labelText;
          labelTextWidth = this.labelWidth - this.padding;
          resolvedContainerHeight = this.labelFont.measureWrappedHeight(labelText, labelTextWidth, this.labelFont.maxAscent) + 2 * this.padding;
          if (resolvedContainerHeight <= minimumHeight) {
            resolvedContainerHeight = minimumHeight;
          } else {
            this.setWidgetBounds(resolvedContainerHeight, width, (byte) -74, y, x);
          }
          if (!this.labelAfterChild) {
            selectedChildOffsetX = this.labelWidth + this.padding * 2;
          } else {
            selectedChildOffsetX = 0;
          }
          childOffsetX = selectedChildOffsetX;
          this.child.setWidgetBounds(-(2 * this.padding) + minimumHeight, width - this.labelWidth - this.padding * 3, (byte) -105, (-minimumHeight + resolvedContainerHeight >> 1) + this.padding, childOffsetX);
          return;
        } catch (java.lang.RuntimeException caughtConstructionFailure) {
          constructionFailure = caughtConstructionFailure;
          constructionFailureForContext = constructionFailure;
          constructionFailureBeforeDescriptions = constructionFailureForContext;
          constructionMessagePrefix = new StringBuilder().append("hd.<init>(").append(x).append(',').append(y).append(',').append(width).append(',').append(minimumHeight).append(',');
          if (child == null) {
            childDescription = "null";
          } else {
            childDescription = "{...}";
          }
          constructionMessageBeforeFont = ((StringBuilder) (Object) constructionMessagePrefix).append(childDescription).append(',').append(labelAfterChild).append(',').append(labelWidth).append(',').append(padding).append(',');
          if (labelFont == null) {
            fontDescription = "null";
          } else {
            fontDescription = "{...}";
          }
          constructionMessageBeforeText = ((StringBuilder) (Object) constructionMessageBeforeFont).append(fontDescription).append(',').append(labelColor).append(',');
          if (labelText == null) {
            labelTextDescription = "null";
          } else {
            labelTextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) constructionFailureBeforeDescriptions), ((StringBuilder) (Object) constructionMessageBeforeText).append(labelTextDescription).append(')').toString());
        }
    }

    static {
        nineSliceSavedClip = new int[4];
        extendedNameCharacters = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
