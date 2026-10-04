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
        int stackIn_6_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!widget.pointerInside) {
            stackIn_6_0 = (widget.hasKeyboardFocus((byte) 54)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (widget instanceof ButtonWidget) {
            widgetEnabled = widgetEnabled & ((ButtonWidget) ((Object) widget)).enabled;
          }
          if (methodGuard >= -5) {
            SpriteButtonRenderer.getLoginIdentifierWithSessionFallback(-17);
          }
          if (widgetEnabled) {
            if (var6_int == 0) {
              stackIn_16_0 = this.normalColor;
            } else {
              stackIn_16_0 = this.highlightColor;
            }
          } else {
            stackIn_16_0 = this.disabledColor;
          }
          var7 = stackIn_16_0;
          MultiHandleSliderRenderer.drawGrayTintedHorizontalThreePartStrip(this.buttonSprites, var7, parentX + widget.widgetX, widget.widgetWidth, (-this.buttonSprites[0].fullHeight + widget.widgetHeight >> 1) + (parentY + widget.widgetY), -17154);
          stackIn_19_0 = (widgetEnabled) ? 16777215 : 7105644;
          var8 = stackIn_19_0;
          this.font.drawParagraph(widget.widgetText, widget.widgetX + parentX, -2 + parentY + widget.widgetY, widget.widgetWidth, widget.widgetHeight, var8, -1, 1, 1, this.font.maxAscent);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("ml.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
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

    private SpriteButtonRenderer(int param0, int param1, int param2) {
        this.font = UiFontResources.commonUiBoldFont;
        this.normalColor = param0;
        this.disabledColor = param2;
        this.highlightColor = param1;
        this.buttonSprites = MouseWheelInput.commonButtonSprites;
    }

    final static String getLoginIdentifierWithSessionFallback(int methodGuard) {
        String identifierText = null;
        if (methodGuard == 7789) {
            identifierText = "";
            if (!(null == activeLoginPanel)) {
                identifierText = activeLoginPanel.getLoginIdentifierOrEmpty(87);
            }
            if (identifierText.length() == 0) {
                identifierText = DualLinkNode.getSessionTextOrEmpty((byte) -53);
            }
            if (!(identifierText.length() != 0)) {
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
