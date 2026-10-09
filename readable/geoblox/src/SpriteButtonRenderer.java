/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpriteButtonRenderer extends TextWidgetRenderer {
    static String createSelectAlternativeText;
    static PlatformTaskDispatcher appletTaskDispatcher;
    static LoginPanel activeLoginPanel;
    static int secondScoreContextAccumulator;
    private int normalColor;
    private int highlightColor;
    private int disabledColor;
    private Sprite[] buttonSprites;

    public SpriteButtonRenderer() {
        this(2188450, 2591221, 9543);
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        int hoverOrFocusFlag = 0;
        int selectedButtonColor = 0;
        int selectedTextColor = 0;
        RuntimeException drawingFailureBeforeDescription = null;
        StringBuilder drawingMessagePrefix = null;
        String widgetDescription = null;
        RuntimeException drawingFailure = null;
        int highlightFlag = 0;
        RuntimeException drawingFailureForContext = null;
        int buttonColor = 0;
        int textColor = 0;
        try {
          if (!widget.pointerInside) {
            hoverOrFocusFlag = (widget.hasKeyboardFocus((byte) 54)) ? 1 : 0;
          } else {
            hoverOrFocusFlag = 1;
          }
          highlightFlag = hoverOrFocusFlag;
          if (widget instanceof ButtonWidget) {
            widgetEnabled = widgetEnabled & ((ButtonWidget) (widget)).enabled;
          }
          if (methodGuard >= -5) {
            SpriteButtonRenderer.getLoginIdentifierWithSessionFallback(-17);
          }
          if (widgetEnabled) {
            if (highlightFlag == 0) {
              selectedButtonColor = this.normalColor;
            } else {
              selectedButtonColor = this.highlightColor;
            }
          } else {
            selectedButtonColor = this.disabledColor;
          }
          buttonColor = selectedButtonColor;
          MultiHandleSliderRenderer.drawGrayTintedHorizontalThreePartStrip(this.buttonSprites, buttonColor, parentX + widget.widgetX, widget.widgetWidth, (-this.buttonSprites[0].fullHeight + widget.widgetHeight >> 1) + (parentY + widget.widgetY), -17154);
          selectedTextColor = (widgetEnabled) ? 16777215 : 7105644;
          textColor = selectedTextColor;
          this.font.drawParagraph(widget.widgetText, widget.widgetX + parentX, -2 + parentY + widget.widgetY, widget.widgetWidth, widget.widgetHeight, textColor, -1, 1, 1, this.font.maxAscent);
          return;
        } catch (java.lang.RuntimeException caughtDrawingFailure) {
          drawingFailure = caughtDrawingFailure;
          drawingFailureForContext = drawingFailure;
          drawingFailureBeforeDescription = drawingFailureForContext;
          drawingMessagePrefix = new StringBuilder().append("ml.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawingFailureBeforeDescription), ((StringBuilder) (Object) drawingMessagePrefix).append(widgetDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard == 16777215) {
            createSelectAlternativeText = null;
            activeLoginPanel = null;
            appletTaskDispatcher = null;
            return;
        }
        SpriteButtonRenderer.releaseStaticReferences(11);
        createSelectAlternativeText = null;
        activeLoginPanel = null;
        appletTaskDispatcher = null;
    }

    private SpriteButtonRenderer(int normalColor, int highlightColor, int disabledColor) {
        this.font = UiFontResources.commonUiBoldFont;
        this.normalColor = normalColor;
        this.disabledColor = disabledColor;
        this.highlightColor = highlightColor;
        this.buttonSprites = MouseWheelInput.commonButtonSprites;
    }

    final static String getLoginIdentifierWithSessionFallback(int methodGuard) {
        String identifierText = null;
        if (methodGuard == 7789) {
            identifierText = "";
            if (null != activeLoginPanel) {
                identifierText = activeLoginPanel.getLoginIdentifierOrEmpty(87);
            }
            if (identifierText.length() == 0) {
                identifierText = DualLinkNode.getSessionTextOrEmpty((byte) -53);
            }
            if (identifierText.length() == 0) {
                identifierText = AlternateLongAndTextLoginPayload.defaultPlayerNameText;
            }
            return identifierText;
        }
        return (String) null;
    }

    static {
        createSelectAlternativeText = "Use this alternative as your account name";
    }
}
