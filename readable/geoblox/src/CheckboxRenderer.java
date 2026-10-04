/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxRenderer implements WidgetRenderer {
    private int textShadowColor;
    private int checkboxOffsetX;
    private int textOffsetY;
    private int verticalAlignment;
    private int padding;
    private int backgroundColor;
    private BitmapFont font;
    private int textColor;
    private int checkboxOffsetY;
    private int checkboxWidth;
    private int horizontalAlignment;
    static int pointerPressButtonSnapshot;
    private int checkboxHeight;
    static String[] mustLogin3Texts;

    final static boolean isValidAccountName(boolean allowRepeatedSeparators, CharSequence nameText, byte methodGuard) {
        int characterIndex = 0;
        RuntimeException nameValidationFailure = null;
        int clientControlFlowSnapshot = 0;
        RuntimeException nameFailureForContext = null;
        StringBuilder nameContextBuilder = null;
        String nameDescription = null;
        RuntimeException caughtNameFailure = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (!SocketArchiveNetworkClient.hasValidAccountNameStructure(allowRepeatedSeparators, nameText, (byte) 118)) {
            return false;
          }
          if (methodGuard >= -32) {
            return true;
          }
          characterIndex = 0;
          while (true) {
            if (nameText.length() <= characterIndex) {
              return true;
            }
            if (TextInputValidator.isAllowedAccountNameCharacter(nameText.charAt(characterIndex), (byte) 118)) {
              characterIndex++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException nameFailure) {
          caughtNameFailure = nameFailure;
          nameValidationFailure = caughtNameFailure;
          nameFailureForContext = nameValidationFailure;
          nameContextBuilder = new StringBuilder().append("bi.B(").append(allowRepeatedSeparators).append(',');
          if (nameText == null) {
            nameDescription = "null";
          } else {
            nameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) nameFailureForContext), ((StringBuilder) (Object) nameContextBuilder).append(nameDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public final void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        UiWidget checkboxWidgetSnapshot = null;
        RuntimeException drawFailureForContext = null;
        StringBuilder drawContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtDrawFailure = null;
        RuntimeException checkboxDrawFailure = null;
        int checkboxFillColor = 0;
        int checkboxX = 0;
        int checkboxY = 0;
        int textInsetX = 0;
        CheckboxWidget checkboxWidget = null;
        try {
          if (widget instanceof CheckboxWidget) {
            checkboxWidgetSnapshot = (UiWidget) (widget);
          } else {
            checkboxWidgetSnapshot = null;
          }
          checkboxWidget = (CheckboxWidget) ((Object) checkboxWidgetSnapshot);
          if (checkboxWidget != null) {
            widgetEnabled = widgetEnabled & checkboxWidget.enabled;
          }
          if (methodGuard > -5) {
            this.horizontalAlignment = -3;
          }
          checkboxFillColor = 5592405;
          SoftwareRasterizer.fillRectangle(widget.widgetX + parentX, parentY + widget.widgetY, widget.widgetWidth, widget.widgetHeight, this.backgroundColor);
          if (widgetEnabled) {
            checkboxFillColor = 16777215;
          }
          checkboxX = this.checkboxOffsetX + (parentX + widget.widgetX);
          checkboxY = this.checkboxOffsetY + (widget.widgetY + parentY);
          SoftwareRasterizer.drawRectangleDropShadow(checkboxX, checkboxY, this.checkboxWidth, this.checkboxHeight, 5592405);
          SoftwareRasterizer.fillRectangle(checkboxX, checkboxY, this.checkboxWidth, this.checkboxHeight, checkboxFillColor);
          if (checkboxWidget.active) {
            SoftwareRasterizer.drawLine(checkboxX, checkboxY, this.checkboxWidth + checkboxX, checkboxY + this.checkboxHeight, 1);
            SoftwareRasterizer.drawLine(checkboxX + this.checkboxWidth, checkboxY, checkboxX, this.checkboxHeight + checkboxY, 1);
          }
          if (null != this.font) {
            textInsetX = this.padding + this.checkboxWidth + this.checkboxOffsetX;
            this.font.drawParagraph(widget.widgetText, textInsetX + widget.widgetX + parentX, widget.widgetY + parentY + this.textOffsetY, widget.widgetWidth + (-this.padding - textInsetX), -(this.padding << 1) + widget.widgetHeight, this.textColor, this.textShadowColor, this.horizontalAlignment, this.verticalAlignment, 0);
          }
          return;
        } catch (java.lang.RuntimeException drawFailure) {
          caughtDrawFailure = drawFailure;
          checkboxDrawFailure = caughtDrawFailure;
          drawFailureForContext = checkboxDrawFailure;
          drawContextBuilder = new StringBuilder().append("bi.E(").append(parentX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(widgetEnabled).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawFailureForContext), ((StringBuilder) (Object) drawContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        if (methodGuard != 1) {
            return;
        }
        mustLogin3Texts = null;
    }

    CheckboxRenderer(BitmapFont font, int padding, int textOffsetY, int textColor, int textShadowColor, int checkboxOffsetX, int checkboxOffsetY, int checkboxHeight, int checkboxWidth, int backgroundColor) {
        this.horizontalAlignment = 1;
        this.verticalAlignment = 1;
        try {
            this.textShadowColor = textShadowColor;
            this.padding = padding;
            this.font = font;
            this.checkboxWidth = checkboxWidth;
            this.checkboxHeight = checkboxHeight;
            this.textColor = textColor;
            this.textOffsetY = textOffsetY;
            this.checkboxOffsetX = checkboxOffsetX;
            this.backgroundColor = backgroundColor;
            this.checkboxOffsetY = checkboxOffsetY;
        } catch (RuntimeException rendererConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rendererConstructionFailure), "bi.<init>(" + (font != null ? "{...}" : "null") + ',' + padding + ',' + textOffsetY + ',' + textColor + ',' + textShadowColor + ',' + checkboxOffsetX + ',' + checkboxOffsetY + ',' + checkboxHeight + ',' + checkboxWidth + ',' + backgroundColor + ')');
        }
    }

    static {
        pointerPressButtonSnapshot = 0;
        mustLogin3Texts = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
    }
}
