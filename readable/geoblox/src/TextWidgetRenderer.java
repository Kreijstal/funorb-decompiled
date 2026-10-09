/*
 * Decompiled by CFR-JS 0.4.0.
 */
class TextWidgetRenderer implements WidgetRenderer, TextWidgetLayout {
    int horizontalAlignment;
    private boolean multiline;
    BitmapFont font;
    static java.awt.Image loadingProgressImage;
    static String waitingForGraphicsText;
    int paddingLeft;
    int textColor;
    int caretColor;
    private int textShadowColor;
    int lineSpacing;
    int verticalAlignment;
    int paddingTop;
    static boolean suppressReconnectErrorPage;
    int paddingRight;
    int paddingBottom;
    int selectionArgb;
    static String unreadTicketMessage;

    private final int getTextX(UiWidget widget, int parentX, int methodGuard, int extraX) {
        int discardedTextYResult = 0;
        RuntimeException textXFailure = null;
        UiWidget unusedWidget = null;
        int textXBeforeReturn = 0;
        RuntimeException textXFailureForContext = null;
        StringBuilder textXContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtTextXFailure = null;
        try {
          if (methodGuard != 11875) {
            unusedWidget = (UiWidget) null;
            discardedTextYResult = this.getTextY((UiWidget) null, 96, -93, -23);
          }
          textXBeforeReturn = this.paddingLeft + widget.widgetX + parentX + (widget.textOffsetX + extraX);
          return textXBeforeReturn;
        } catch (java.lang.RuntimeException textXException) {
          caughtTextXFailure = textXException;
          textXFailure = caughtTextXFailure;
          textXFailureForContext = textXFailure;
          textXContextBuilder = new StringBuilder().append("ff.F(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textXFailureForContext), ((StringBuilder) (Object) textXContextBuilder).append(widgetDescription).append(',').append(parentX).append(',').append(methodGuard).append(',').append(extraX).append(')').toString());
        }
    }

    private final void drawTextWithinWidget(int parentY, int shadowColor, UiWidget widget, int methodGuard, int extraY, int color, int extraX, int parentX) {
        RuntimeException drawFailureForContext = null;
        StringBuilder drawContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtDrawFailure = null;
        int availableWidth = 0;
        RuntimeException textDrawFailure = null;
        int availableHeight = 0;
        int baselineOffset = 0;
        int verticalAlignmentMode = 0;
        int clientControlFlowSnapshot = 0;
        int horizontalAlignmentMode;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          textDrawingCompletion: {
            PasswordWidgetRenderer.pushWidgetClip(parentY + widget.widgetY, widget.widgetX + parentX, methodGuard - 14045, widget.widgetY + (parentY + widget.widgetHeight), widget.widgetWidth + (parentX + widget.widgetX));
            availableWidth = this.getAvailableTextWidth(widget, methodGuard - 1);
            availableHeight = this.getAvailableTextHeight(289769985, widget);
            if (!this.multiline) {
              verticalAlignmentMode = this.verticalAlignment;
              if (verticalAlignmentMode != 0) {
                if (verticalAlignmentMode != 2) {
                  if (verticalAlignmentMode != 3 &&
                      verticalAlignmentMode != 1) {
                  }
                  baselineOffset = (-this.font.maxAscent + (availableHeight - this.font.maxDescent) >> 1) + this.font.maxAscent;
                } else {
                  baselineOffset = availableHeight - this.font.maxDescent;
                }
              } else {
                baselineOffset = this.font.maxAscent;
              }
              horizontalAlignmentMode = this.horizontalAlignment;
              if (horizontalAlignmentMode != 0 &&
                  horizontalAlignmentMode != 3) {
                if (horizontalAlignmentMode == 1) {
                  this.font.drawCenteredText(this.getDisplayText(125, widget), this.getTextX(widget, parentX, 11875, extraX) + (availableWidth >> 1), this.getTextY(widget, parentY, 1674, extraY) + baselineOffset, color, shadowColor);
                  break textDrawingCompletion;
                }
                if (horizontalAlignmentMode != 2) {
                  break textDrawingCompletion;
                }
                this.font.drawRightAlignedText(this.getDisplayText(112, widget), availableWidth + this.getTextX(widget, parentX, methodGuard + 11875, extraX), baselineOffset + this.getTextY(widget, parentY, 1674, extraY), color, shadowColor);
                break textDrawingCompletion;
              }
              this.font.drawText(this.getDisplayText(121, widget), this.getTextX(widget, parentX, 11875, extraX), this.getTextY(widget, parentY, 1674, extraY) + baselineOffset, color, shadowColor);
            } else {
              this.font.drawParagraph(this.getDisplayText(113, widget), this.getTextX(widget, parentX, 11875, extraX), this.getTextY(widget, parentY, 1674, extraY), availableWidth, availableHeight, color, shadowColor, this.horizontalAlignment, this.verticalAlignment, this.lineSpacing);
            }
          }
          if (methodGuard != 0) {
            this.paddingLeft = -98;
          }
          RasterTargetRestoreSupport.restoreRasterTarget(true);
          return;
        } catch (java.lang.RuntimeException drawFailure) {
          caughtDrawFailure = drawFailure;
          textDrawFailure = caughtDrawFailure;
          drawFailureForContext = textDrawFailure;
          drawContextBuilder = new StringBuilder().append("ff.N(").append(parentY).append(',').append(shadowColor).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawFailureForContext), ((StringBuilder) (Object) drawContextBuilder).append(widgetDescription).append(',').append(methodGuard).append(',').append(extraY).append(',').append(color).append(',').append(extraX).append(',').append(parentX).append(')').toString());
        }
    }

    private final void drawDefaultWidgetText(int parentX, int parentY, UiWidget widget, boolean methodGuard) {
        try {
            this.drawTextWithinWidget(parentY, this.textShadowColor, widget, 0, 0, this.textColor, 0, parentX);
            if (!methodGuard) {
                UiWidget unusedWidget = (UiWidget) null;
                this.updateSingleLineLayout((byte) -108, (UiWidget) null);
            }
        } catch (RuntimeException defaultDrawFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) defaultDrawFailure), "ff.P(" + parentX + ',' + parentY + ',' + (widget != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    private final void updateSingleLineLayout(byte methodGuard, UiWidget widget) {
        RuntimeException layoutFailureForContext = null;
        StringBuilder layoutContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtLayoutFailure = null;
        int availableWidth = 0;
        RuntimeException singleLineLayoutFailure = null;
        int availableHeight = 0;
        int baselineOffset = 0;
        int verticalAlignmentMode = 0;
        int clientControlFlowSnapshot = 0;
        int horizontalAlignmentMode;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (null == widget.textLayout) {
            widget.textLayout = (TextLayout) ((Object) new CachedTextLayout());
          }
          availableWidth = this.getAvailableTextWidth(widget, -1);
          availableHeight = this.getAvailableTextHeight(289769985, widget);
          if (methodGuard != 109) {
            return;
          }
          verticalAlignmentMode = this.verticalAlignment;
          if (verticalAlignmentMode != 0) {
            if (verticalAlignmentMode != 2) {
              if (verticalAlignmentMode != 3 &&
                  verticalAlignmentMode == 1) {
              }
              baselineOffset = (availableHeight - (this.font.maxAscent + this.font.maxDescent) >> 1) + this.font.maxAscent;
            } else {
              baselineOffset = availableHeight - this.font.maxDescent;
            }
          } else {
            baselineOffset = this.font.maxAscent;
          }
          horizontalAlignmentMode = this.horizontalAlignment;
          if (horizontalAlignmentMode != 0 &&
              horizontalAlignmentMode != 3) {
            if (horizontalAlignmentMode == 1) {
              if (!(widget.textLayout instanceof CachedTextLayout)) {
                return;
              }
              ((CachedTextLayout) ((Object) widget.textLayout)).layoutCenteredLine(this.getDisplayText(122, widget), baselineOffset, availableWidth >> 1, (byte) 58, this.font);
              return;
            }
            if (horizontalAlignmentMode != 2) {
              return;
            }
            if (!(widget.textLayout instanceof CachedTextLayout)) {
              return;
            }
            ((CachedTextLayout) ((Object) widget.textLayout)).layoutRightAlignedLine(availableWidth, baselineOffset, (byte) -21, this.font, this.getDisplayText(125, widget));
            return;
          }
          if (widget.textLayout instanceof CachedTextLayout) {
            ((CachedTextLayout) ((Object) widget.textLayout)).layoutLeftAlignedLine(baselineOffset, 0, this.getDisplayText(methodGuard ^ 18, widget), -91, this.font);
            return;
          }
          return;
        } catch (java.lang.RuntimeException layoutFailure) {
          caughtLayoutFailure = layoutFailure;
          singleLineLayoutFailure = caughtLayoutFailure;
          layoutFailureForContext = singleLineLayoutFailure;
          layoutContextBuilder = new StringBuilder().append("ff.H(").append(methodGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) layoutFailureForContext), ((StringBuilder) (Object) layoutContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    public final TextLayout getTextLayout(byte methodGuard, UiWidget widget) {
        RuntimeException layoutFailure = null;
        TextLayout nullLayoutResult = null;
        TextLayout layoutBeforeReturn = null;
        RuntimeException layoutFailureForContext = null;
        StringBuilder layoutContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtLayoutFailure = null;
        try {
          if (widget.textLayout == null) {
            widget.textLayout = (TextLayout) ((Object) new CachedTextLayout());
          }
          if (this.multiline) {
            ((CachedTextLayout) ((Object) widget.textLayout)).layoutParagraph(this.verticalAlignment, 1, this.getDisplayText(116, widget), this.lineSpacing, this.font, this.getAvailableTextWidth(widget, -1), this.horizontalAlignment, this.getAvailableTextHeight(289769985, widget));
          } else {
            this.updateSingleLineLayout((byte) 109, widget);
          }
          if (methodGuard > 110) {
            layoutBeforeReturn = widget.textLayout;
            return layoutBeforeReturn;
          }
          nullLayoutResult = (TextLayout) null;
          return nullLayoutResult;
        } catch (java.lang.RuntimeException layoutException) {
          caughtLayoutFailure = layoutException;
          layoutFailure = caughtLayoutFailure;
          layoutFailureForContext = layoutFailure;
          layoutContextBuilder = new StringBuilder().append("ff.I(").append(methodGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) layoutFailureForContext), ((StringBuilder) (Object) layoutContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    TextWidgetRenderer(BitmapFont font, int horizontalPadding, int verticalPadding, int textColor, int textShadowColor, int horizontalAlignment, int verticalAlignment, int lineSpacing) {
        this(font, horizontalPadding, horizontalPadding, verticalPadding, verticalPadding, textColor, textShadowColor, horizontalAlignment, verticalAlignment, lineSpacing, -1, 2147483647, false);
    }

    public final int hitTestCaretIndex(UiWidget widget, int pointerX, int methodGuard, int parentY, int pointerY, int parentX) {
        RuntimeException hitTestFailure = null;
        UiWidget unusedWidget = null;
        int caretIndexBeforeReturn = 0;
        RuntimeException hitFailureForContext = null;
        StringBuilder hitContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtHitFailure = null;
        try {
          this.getTextLayout((byte) 115, widget);
          if (methodGuard != -15539) {
            unusedWidget = (UiWidget) null;
            this.updateSingleLineLayout((byte) 9, (UiWidget) null);
          }
          caretIndexBeforeReturn = widget.textLayout.hitTestCaretIndex(pointerX - this.getTextOriginX(parentX, widget, (byte) 46), -109, pointerY - this.getTextOriginY(parentY, -2, widget));
          return caretIndexBeforeReturn;
        } catch (java.lang.RuntimeException hitException) {
          caughtHitFailure = hitException;
          hitTestFailure = caughtHitFailure;
          hitFailureForContext = hitTestFailure;
          hitContextBuilder = new StringBuilder().append("ff.V(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) hitFailureForContext), ((StringBuilder) (Object) hitContextBuilder).append(widgetDescription).append(',').append(pointerX).append(',').append(methodGuard).append(',').append(parentY).append(',').append(pointerY).append(',').append(parentX).append(')').toString());
        }
    }

    public final int getMaximumLineEndXWithPadding(UiWidget widget, byte methodGuard) {
        int guardQuotient = 0;
        RuntimeException widthFailure = null;
        int maximumEndXWithPadding = 0;
        RuntimeException widthFailureForContext = null;
        StringBuilder widthContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtWidthFailure = null;
        try {
          this.getTextLayout((byte) 126, widget);
          guardQuotient = 24 / ((methodGuard - 30) / 57);
          maximumEndXWithPadding = widget.textLayout.getMaximumLineEndX(90) - (-this.paddingLeft - this.paddingRight);
          return maximumEndXWithPadding;
        } catch (java.lang.RuntimeException widthException) {
          caughtWidthFailure = widthException;
          widthFailure = caughtWidthFailure;
          widthFailureForContext = widthFailure;
          widthContextBuilder = new StringBuilder().append("ff.AA(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) widthFailureForContext), ((StringBuilder) (Object) widthContextBuilder).append(widgetDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public final int getLayoutHeightWithPadding(int methodGuard, UiWidget widget) {
        int guardQuotient = 0;
        RuntimeException heightFailure = null;
        int heightWithPadding = 0;
        RuntimeException heightFailureForContext = null;
        StringBuilder heightContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtHeightFailure = null;
        try {
          guardQuotient = 46 / ((methodGuard + 58) / 61);
          this.getTextLayout((byte) 127, widget);
          heightWithPadding = widget.textLayout.getLayoutHeight(-3111) + this.paddingTop + this.paddingBottom;
          return heightWithPadding;
        } catch (java.lang.RuntimeException heightException) {
          caughtHeightFailure = heightException;
          heightFailure = caughtHeightFailure;
          heightFailureForContext = heightFailure;
          heightContextBuilder = new StringBuilder().append("ff.G(").append(methodGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) heightFailureForContext), ((StringBuilder) (Object) heightContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(boolean methodGuard) {
        waitingForGraphicsText = null;
        unreadTicketMessage = null;
        loadingProgressImage = null;
        if (!methodGuard) {
            loadingProgressImage = (java.awt.Image) null;
        }
    }

    final void copyStyleTo(TextWidgetRenderer destination, boolean methodGuard) {
        try {
            destination.verticalAlignment = this.verticalAlignment;
            destination.caretColor = this.caretColor;
            destination.paddingTop = this.paddingTop;
            destination.paddingLeft = this.paddingLeft;
            destination.lineSpacing = this.lineSpacing;
            destination.font = this.font;
            if (!methodGuard) {
                this.paddingTop = 34;
            }
            destination.paddingRight = this.paddingRight;
            destination.paddingBottom = this.paddingBottom;
            destination.multiline = this.multiline;
            destination.textColor = this.textColor;
            destination.selectionArgb = this.selectionArgb;
            destination.textShadowColor = this.textShadowColor;
            destination.horizontalAlignment = this.horizontalAlignment;
        } catch (RuntimeException styleCopyFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) styleCopyFailure), "ff.O(" + (destination != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    private final int getTextY(UiWidget widget, int parentY, int methodGuard, int extraY) {
        RuntimeException textYFailure = null;
        UiWidget unusedWidget = null;
        int textYBeforeReturn = 0;
        RuntimeException textYFailureForContext = null;
        StringBuilder textYContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtTextYFailure = null;
        try {
          if (methodGuard != 1674) {
            unusedWidget = (UiWidget) null;
            this.getDisplayText(-123, (UiWidget) null);
          }
          textYBeforeReturn = extraY + widget.textOffsetY + (this.paddingTop + (widget.widgetY + parentY));
          return textYBeforeReturn;
        } catch (java.lang.RuntimeException textYException) {
          caughtTextYFailure = textYException;
          textYFailure = caughtTextYFailure;
          textYFailureForContext = textYFailure;
          textYContextBuilder = new StringBuilder().append("ff.U(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textYFailureForContext), ((StringBuilder) (Object) textYContextBuilder).append(widgetDescription).append(',').append(parentY).append(',').append(methodGuard).append(',').append(extraY).append(')').toString());
        }
    }

    String getDisplayText(int methodGuard, UiWidget widget) {
        RuntimeException displayTextFailure = null;
        String displayTextBeforeReturn = null;
        RuntimeException textFailureForContext = null;
        StringBuilder textContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtTextFailure = null;
        try {
          if (methodGuard < 109) {
            this.verticalAlignment = 23;
          }
          displayTextBeforeReturn = widget.widgetText;
          return displayTextBeforeReturn;
        } catch (java.lang.RuntimeException displayTextException) {
          caughtTextFailure = displayTextException;
          displayTextFailure = caughtTextFailure;
          textFailureForContext = displayTextFailure;
          textContextBuilder = new StringBuilder().append("ff.L(").append(methodGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) textFailureForContext), ((StringBuilder) (Object) textContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    public final int getTextOriginY(int parentY, int methodGuard, UiWidget widget) {
        RuntimeException originYFailure = null;
        int originYBeforeReturn = 0;
        RuntimeException originFailureForContext = null;
        StringBuilder originContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtOriginFailure = null;
        try {
          if (methodGuard != -2) {
            suppressReconnectErrorPage = true;
          }
          originYBeforeReturn = this.getTextY(widget, parentY, methodGuard ^ -1676, 0);
          return originYBeforeReturn;
        } catch (java.lang.RuntimeException originException) {
          caughtOriginFailure = originException;
          originYFailure = caughtOriginFailure;
          originFailureForContext = originYFailure;
          originContextBuilder = new StringBuilder().append("ff.Q(").append(parentY).append(',').append(methodGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) originFailureForContext), ((StringBuilder) (Object) originContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    public final int getTextOriginX(int parentX, UiWidget widget, byte methodGuard) {
        RuntimeException originXFailure = null;
        int invalidGuardResult = 0;
        int originXBeforeReturn = 0;
        RuntimeException originFailureForContext = null;
        StringBuilder originContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtOriginFailure = null;
        try {
          if (methodGuard == 46) {
            originXBeforeReturn = this.getTextX(widget, parentX, methodGuard + 11829, 0);
            return originXBeforeReturn;
          }
          invalidGuardResult = 59;
          return invalidGuardResult;
        } catch (java.lang.RuntimeException originException) {
          caughtOriginFailure = originException;
          originXFailure = caughtOriginFailure;
          originFailureForContext = originXFailure;
          originContextBuilder = new StringBuilder().append("ff.K(").append(parentX).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) originFailureForContext), ((StringBuilder) (Object) originContextBuilder).append(widgetDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public void drawWidget(int parentX, int methodGuard, int parentY, boolean widgetEnabled, UiWidget widget) {
        if (null == this.font) {
            return;
        }
        try {
            this.drawDefaultWidgetText(parentX, parentY, widget, true);
            if (methodGuard >= -5) {
                this.caretColor = -8;
            }
        } catch (RuntimeException widgetDrawFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) widgetDrawFailure), "ff.E(" + parentX + ',' + methodGuard + ',' + parentY + ',' + widgetEnabled + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    public final int getFontHeight(int methodGuard) {
        if (methodGuard != 1) {
            UiWidget unusedWidget = (UiWidget) null;
            this.drawTextWithinWidget(79, -83, (UiWidget) null, -31, 118, 54, 3, -68);
        }
        return this.font.maxAscent + this.font.maxDescent;
    }

    private final int getAvailableTextHeight(int methodGuard, UiWidget widget) {
        RuntimeException availableHeightFailure = null;
        int invalidGuardResult = 0;
        int availableHeightBeforeReturn = 0;
        RuntimeException heightFailureForContext = null;
        StringBuilder heightContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtHeightFailure = null;
        try {
          if (methodGuard == 289769985) {
            availableHeightBeforeReturn = -this.paddingTop + widget.widgetHeight - this.paddingBottom;
            return availableHeightBeforeReturn;
          }
          invalidGuardResult = 90;
          return invalidGuardResult;
        } catch (java.lang.RuntimeException heightException) {
          caughtHeightFailure = heightException;
          availableHeightFailure = caughtHeightFailure;
          heightFailureForContext = availableHeightFailure;
          heightContextBuilder = new StringBuilder().append("ff.T(").append(methodGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) heightFailureForContext), ((StringBuilder) (Object) heightContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    public final void drawCaret(int parentX, int caretIndex, int methodGuard, UiWidget widget, int parentY) {
        int caretLineIndex = 0;
        TextLayoutLine caretLine = null;
        int caretX = 0;
        int screenCaretX = 0;
        int caretTopY = 0;
        int caretBottomY = 0;
        UiWidget unusedWidget = null;
        TextLayout layout = null;
        TextLayout layoutAlias = null;
        int originYBeforeClamp = 0;
        int availableHeightForClamp = 0;
        int lineBottomForClamp = 0;
        int nextTopOrCurrentBottom;
        RuntimeException caretFailureForContext = null;
        StringBuilder caretContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtCaretFailure = null;
        RuntimeException caretDrawFailure = null;
        try {
          if (widget.hasKeyboardFocus((byte) 54)) {
            layout = this.getTextLayout((byte) 121, widget);
            layoutAlias = layout;
            caretLineIndex = layoutAlias.getCaretLineIndex((byte) 24, caretIndex);
            caretLine = layout.lines[caretLineIndex];
            caretX = layoutAlias.getCaretX(caretIndex, 120);
            screenCaretX = this.getTextX(widget, parentX, 11875, caretX);
            caretTopY = this.getTextOriginY(parentY, -2, widget) + Math.max(0, caretLine.topY);
            originYBeforeClamp = this.getTextOriginY(parentY, -2, widget);
            availableHeightForClamp = this.getAvailableTextHeight(289769985, widget);
            lineBottomForClamp = caretLine.bottomY;
            if (caretLineIndex + 1 >= layoutAlias.lines.length) {
              nextTopOrCurrentBottom = caretLine.bottomY;
            } else {
              nextTopOrCurrentBottom = layout.lines[caretLineIndex + 1].topY;
            }
            caretBottomY = originYBeforeClamp + Math.min(availableHeightForClamp, Math.min(lineBottomForClamp, nextTopOrCurrentBottom));
            PasswordWidgetRenderer.pushWidgetClip(parentY + widget.widgetY, parentX + widget.widgetX, -14045, parentY + widget.widgetY + widget.widgetHeight, widget.widgetWidth + parentX + widget.widgetX);
            DialRenderer.accountUiTheme.drawWidgetLine(caretBottomY, screenCaretX, this.caretColor, caretTopY, screenCaretX, 8947848);
            RasterTargetRestoreSupport.restoreRasterTarget(true);
          }
          if (methodGuard != -2) {
            unusedWidget = (UiWidget) null;
            this.getMaximumLineEndXWithPadding((UiWidget) null, (byte) 70);
          }
          return;
        } catch (java.lang.RuntimeException caretException) {
          caughtCaretFailure = caretException;
          caretDrawFailure = caughtCaretFailure;
          caretFailureForContext = caretDrawFailure;
          caretContextBuilder = new StringBuilder().append("ff.S(").append(parentX).append(',').append(caretIndex).append(',').append(methodGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) caretFailureForContext), ((StringBuilder) (Object) caretContextBuilder).append(widgetDescription).append(',').append(parentY).append(')').toString());
        }
    }

    public final int getAvailableTextWidth(UiWidget widget, int methodGuard) {
        RuntimeException availableWidthFailure = null;
        UiWidget unusedWidget = null;
        int availableWidthBeforeReturn = 0;
        RuntimeException widthFailureForContext = null;
        StringBuilder widthContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtWidthFailure = null;
        try {
          if (methodGuard != -1) {
            unusedWidget = (UiWidget) null;
            this.drawCaret(106, 101, 118, (UiWidget) null, -6);
          }
          availableWidthBeforeReturn = -this.paddingRight - this.paddingLeft + widget.widgetWidth;
          return availableWidthBeforeReturn;
        } catch (java.lang.RuntimeException widthException) {
          caughtWidthFailure = widthException;
          availableWidthFailure = caughtWidthFailure;
          widthFailureForContext = availableWidthFailure;
          widthContextBuilder = new StringBuilder().append("ff.R(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) widthFailureForContext), ((StringBuilder) (Object) widthContextBuilder).append(widgetDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    public final void drawSelection(int selectionAnchorIndex, int methodGuard, int parentY, int parentX, int caretIndex, UiWidget widget) {
        int lineIndex = 0;
        int selectionStartXSnapshot = 0;
        int selectionEndXSnapshot = 0;
        RuntimeException selectionFailureForContext = null;
        StringBuilder selectionContextBuilder = null;
        String widgetDescription = null;
        RuntimeException caughtSelectionFailure = null;
        RuntimeException selectionDrawFailure = null;
        int selectionStart = 0;
        int selectionEnd = 0;
        int firstSelectedLine = 0;
        int lastSelectedLine = 0;
        TextLayoutLine selectedLine = null;
        int selectionStartX = 0;
        int selectionEndX = 0;
        int clientControlFlowSnapshot = 0;
        UiWidget unusedWidget = null;
        TextLayout layout = null;
        TextLayout layoutAlias = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (selectionAnchorIndex == caretIndex) {
            return;
          }
          if (methodGuard != 0) {
            unusedWidget = (UiWidget) null;
            this.getTextOriginY(90, -50, (UiWidget) null);
          }
          if (widget.hasKeyboardFocus((byte) 54)) {
            layout = this.getTextLayout((byte) 115, widget);
            layoutAlias = layout;
            if (caretIndex <= selectionAnchorIndex) {
              selectionEnd = selectionAnchorIndex;
              selectionStart = caretIndex;
            } else {
              selectionEnd = caretIndex;
              selectionStart = selectionAnchorIndex;
            }
            firstSelectedLine = layoutAlias.getCaretLineIndex((byte) 24, selectionStart);
            lastSelectedLine = layoutAlias.getCaretLineIndex((byte) 24, selectionEnd);
            PasswordWidgetRenderer.pushWidgetClip(parentY + widget.widgetY, parentX + widget.widgetX, -14045, widget.widgetHeight + (widget.widgetY + parentY), widget.widgetWidth + (parentX + widget.widgetX));
            for (lineIndex = firstSelectedLine; lineIndex <= lastSelectedLine; lineIndex++) {
              selectedLine = layout.lines[lineIndex];
              if (firstSelectedLine != lineIndex) {
                selectionStartXSnapshot = selectedLine.caretX[0];
              } else {
                selectionStartXSnapshot = layoutAlias.getCaretX(selectionStart, 110);
              }
              selectionStartX = selectionStartXSnapshot;
              if (lastSelectedLine != lineIndex) {
                if (selectedLine != null) {
                  selectionEndXSnapshot = selectedLine.caretX[selectedLine.caretX.length - 1];
                } else {
                  selectionEndXSnapshot = 0;
                }
              } else {
                selectionEndXSnapshot = layoutAlias.getCaretX(selectionEnd, 124);
              }
              selectionEndX = selectionEndXSnapshot;
              DialRenderer.accountUiTheme.fillWidgetRectangleAlpha(selectedLine.topY + (parentY + widget.widgetY + this.paddingTop + widget.textOffsetY), selectedLine.bottomY, -selectionStartX + selectionEndX, this.selectionArgb >>> 24, methodGuard ^ 15658734, this.selectionArgb, this.getTextX(widget, parentX, 11875, selectionStartX));
            }
            RasterTargetRestoreSupport.restoreRasterTarget(true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException selectionException) {
          caughtSelectionFailure = selectionException;
          selectionDrawFailure = caughtSelectionFailure;
          selectionFailureForContext = selectionDrawFailure;
          selectionContextBuilder = new StringBuilder().append("ff.W(").append(selectionAnchorIndex).append(',').append(methodGuard).append(',').append(parentY).append(',').append(parentX).append(',').append(caretIndex).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) selectionFailureForContext), ((StringBuilder) (Object) selectionContextBuilder).append(widgetDescription).append(')').toString());
        }
    }

    protected TextWidgetRenderer() {
    }

    TextWidgetRenderer(BitmapFont font, int paddingLeft, int paddingRight, int paddingTop, int paddingBottom, int textColor, int textShadowColor, int horizontalAlignment, int verticalAlignment, int lineSpacing, int caretColor, int selectionArgb, boolean multiline) {
        try {
            this.verticalAlignment = verticalAlignment;
            this.multiline = multiline ? true : false;
            this.paddingRight = paddingRight;
            this.font = font;
            this.selectionArgb = selectionArgb;
            this.textShadowColor = textShadowColor;
            this.lineSpacing = lineSpacing;
            this.textColor = textColor;
            this.paddingLeft = paddingLeft;
            this.paddingBottom = paddingBottom;
            this.paddingTop = paddingTop;
            this.caretColor = caretColor;
            this.horizontalAlignment = horizontalAlignment;
        } catch (RuntimeException rendererConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rendererConstructionFailure), "ff.<init>(" + (font != null ? "{...}" : "null") + ',' + paddingLeft + ',' + paddingRight + ',' + paddingTop + ',' + paddingBottom + ',' + textColor + ',' + textShadowColor + ',' + horizontalAlignment + ',' + verticalAlignment + ',' + lineSpacing + ',' + caretColor + ',' + selectionArgb + ',' + multiline + ')');
        }
    }

    static {
        waitingForGraphicsText = "Waiting for graphics";
        unreadTicketMessage = null;
    }
}
