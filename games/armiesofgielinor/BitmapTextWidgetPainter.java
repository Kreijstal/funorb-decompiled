/*
 * Decompiled by CFR-JS 0.4.0.
 */
class BitmapTextWidgetPainter implements WidgetPainter, TextWidgetPainter {
    BitmapFont font;
    int paddingBottom;
    int horizontalAlignment;
    int paddingTop;
    static ClientUiComponent field_a;
    static boolean pointerChangedSnapshot;
    private boolean wrapped;
    int textColour;
    static String field_r;
    static int chatHistorySize;
    static int field_p;
    int selectionColour;
    static String field_s;
    int paddingLeft;
    static MusicCrossfadeStream musicCrossfadeStream;
    int lineHeight;
    int caretColour;
    private int shadowColour;
    int paddingRight;
    int verticalAlignment;

    BitmapTextWidgetPainter(BitmapFont font, int horizontalPadding, int verticalPadding, int textColour, int shadowColour, int horizontalAlignment, int verticalAlignment, int lineHeight) {
        this(font, horizontalPadding, horizontalPadding, verticalPadding, verticalPadding, textColour, shadowColour, horizontalAlignment, verticalAlignment, lineHeight, -1, 2147483647, false);
    }

    private final int absoluteTextY(Widget widget, int additionalY, int obfuscationGuard, int originY) {
        RuntimeException failure = null;
        int textTop = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != 0) {
            pointerChangedSnapshot = false;
          }
          textTop = additionalY + this.paddingTop + widget.y + (originY + widget.contentOffsetY);
          return textTop;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.Q(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(additionalY).append(',').append(obfuscationGuard).append(',').append(originY).append(')').toString());
        }
    }

    final void copyStyleTo(BitmapTextWidgetPainter target, int obfuscationGuard) {
        try {
          target.paddingLeft = this.paddingLeft;
          target.paddingTop = this.paddingTop;
          target.caretColour = this.caretColour;
          target.horizontalAlignment = this.horizontalAlignment;
          target.selectionColour = this.selectionColour;
          target.verticalAlignment = this.verticalAlignment;
          target.paddingBottom = this.paddingBottom;
          target.wrapped = this.wrapped;
          target.shadowColour = this.shadowColour;
          target.lineHeight = this.lineHeight;
          target.font = this.font;
          target.textColour = this.textColour;
          target.paddingRight = this.paddingRight;
          if (obfuscationGuard != 24978) {
            Widget guardWidget = (Widget) null;
            this.hitTestCharacter((Widget) null, -24, 63, -48, 119, -128);
          }
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "lk.M(" + (target != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    public final void drawCaret(int originY, int obfuscationGuard, int originX, Widget widget, int characterIndex) {
        RuntimeException failure = null;
        int lineIndex = 0;
        TextLineLayout line = null;
        int caretX = 0;
        int absoluteX = 0;
        int caretTop = 0;
        int caretBottom = 0;
        Widget guardWidget = null;
        TextLayout layout = null;
        TextLayout layoutAlias = null;
        int textTop = 0;
        int contentHeight = 0;
        int lineBottom = 0;
        int nextLineTop;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (widget.isFocused(false)) {
            layout = this.getTextLayout(-75, widget);
            layoutAlias = layout;
            lineIndex = layoutAlias.getLineIndex(obfuscationGuard - 1024, characterIndex);
            line = layout.lines[lineIndex];
            caretX = layoutAlias.getCaretX((byte) -66, characterIndex);
            absoluteX = this.absoluteTextX(originX, widget, caretX, 68);
            caretTop = this.getTextTop(-18033, originY, widget) + Math.max(0, line.top);
            textTop = this.getTextTop(obfuscationGuard ^ -17009, originY, widget);
            contentHeight = this.getContentHeight(-87, widget);
            lineBottom = line.bottom;
            if (layoutAlias.lines.length <= 1 + lineIndex) {
              nextLineTop = line.bottom;
            } else {
              nextLineTop = layout.lines[1 + lineIndex].top;
            }
            caretBottom = textTop + Math.min(contentHeight, Math.min(lineBottom, nextLineTop));
            CampaignUnitOverride.a(originX + widget.x, widget.x + originX + widget.width, widget.height + (widget.y + originY), widget.y + originY, (byte) 100);
            t.field_c.drawLine(this.caretColour, caretBottom, absoluteX, (byte) 101, caretTop, absoluteX);
            QuickChatPhraseRepository.popRasterState(-18862);
          }
          if (obfuscationGuard == 1024) {
            return;
          }
          guardWidget = (Widget) null;
          this.getDisplayText(35, (Widget) null);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.J(").append(originY).append(',').append(obfuscationGuard).append(',').append(originX).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(characterIndex).append(')').toString());
        }
    }

    private final int getContentHeight(int obfuscationGuard, Widget widget) {
        int guardQuotient = 0;
        RuntimeException failure = null;
        int height = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          guardQuotient = 16 / ((-48 - obfuscationGuard) / 33);
          height = -this.paddingBottom + (widget.height - this.paddingTop);
          return height;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.CA(").append(obfuscationGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(')').toString());
        }
    }

    private final void prepareSingleLineLayout(Widget widget, byte obfuscationGuard) {
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        int contentWidth = 0;
        RuntimeException failure = null;
        int guardRemainder = 0;
        int contentHeight = 0;
        int baselineY = 0;
        int verticalAlignment = 0;
        int obfuscationControl = 0;
        int horizontalAlignment;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (widget.textLayout == null) {
            widget.textLayout = (TextLayout) ((Object) new BitmapTextLayout());
          }
          guardRemainder = 78 % ((60 - obfuscationGuard) / 38);
          contentWidth = this.getContentWidth(55, widget);
          contentHeight = this.getContentHeight(83, widget);
          verticalAlignment = this.verticalAlignment;
          if (verticalAlignment == 0) {
            baselineY = this.font.maxAscent;
          } else {
            if (verticalAlignment == 2) {
              baselineY = -this.font.maxDescent + contentHeight;
            } else {
              if (verticalAlignment != 3 &&
                verticalAlignment == 1) {
              }
              baselineY = this.font.maxAscent + (-this.font.maxDescent + (contentHeight - this.font.maxAscent) >> 1);
            }
          }
          horizontalAlignment = this.horizontalAlignment;
          if (horizontalAlignment != 0 &&
            3 != horizontalAlignment) {
            if (horizontalAlignment == 1) {
              if (!(widget.textLayout instanceof BitmapTextLayout)) {
                return;
              }
              ((BitmapTextLayout) (widget.textLayout)).layoutCentered(baselineY, (byte) 117, this.font, this.getDisplayText(0, widget), contentWidth >> 1);
              return;
            }
            if (horizontalAlignment != 2) {
              return;
            }
            if (!(widget.textLayout instanceof BitmapTextLayout)) {
              return;
            }
            ((BitmapTextLayout) (widget.textLayout)).layoutRightAligned(contentWidth, this.getDisplayText(0, widget), this.font, -31932, baselineY);
            return;
          }
          if (widget.textLayout instanceof BitmapTextLayout) {
            ((BitmapTextLayout) (widget.textLayout)).layoutLeftAligned(this.getDisplayText(0, widget), 0, this.font, baselineY, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.L(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final int getPreferredHeight(Widget widget, int obfuscationGuard) {
        RuntimeException failure = null;
        int height = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          this.getTextLayout(-103, widget);
          if (obfuscationGuard != -2) {
            field_r = (String) null;
          }
          height = widget.textLayout.getHeight((byte) 120) - (-this.paddingTop - this.paddingBottom);
          return height;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.F(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final int absoluteTextX(int originX, Widget widget, int additionalX, int obfuscationGuard) {
        int guardQuotient = 0;
        RuntimeException failure = null;
        int textLeft = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          guardQuotient = 42 / ((obfuscationGuard + 63) / 35);
          textLeft = additionalX + widget.contentOffsetX + originX - (-widget.x - this.paddingLeft);
          return textLeft;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.O(").append(originX).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(additionalX).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final int getTextTop(int obfuscationGuard, int originY, Widget widget) {
        RuntimeException failure = null;
        int guardResult = 0;
        int textTop = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard == -18033) {
            textTop = this.absoluteTextY(widget, 0, 0, originY);
            return textTop;
          }
          guardResult = 101;
          return guardResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.T(").append(obfuscationGuard).append(',').append(originY).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(')').toString());
        }
    }

    public final int getTextLeft(Widget widget, int originX, byte obfuscationGuard) {
        RuntimeException failure = null;
        int guardResult = 0;
        int textLeft = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard < -108) {
            textLeft = this.absoluteTextX(originX, widget, 0, -123);
            return textLeft;
          }
          guardResult = 39;
          return guardResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.U(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(originX).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final int getContentWidth(int obfuscationGuard, Widget widget) {
        RuntimeException failure = null;
        int width = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard < 44) {
            field_p = -118;
          }
          width = -this.paddingRight + widget.width - this.paddingLeft;
          return width;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.DA(").append(obfuscationGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(')').toString());
        }
    }

    public final TextLayout getTextLayout(int obfuscationGuard, Widget widget) {
        RuntimeException failure = null;
        TextLayout layout = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (widget.textLayout == null) {
            widget.textLayout = (TextLayout) ((Object) new BitmapTextLayout());
          }
          if (obfuscationGuard >= -36) {
            this.shadowColour = 58;
          }
          if (this.wrapped) {
            ((BitmapTextLayout) (widget.textLayout)).layoutParagraph(this.getDisplayText(0, widget), (byte) 30, this.getContentHeight(-123, widget), this.verticalAlignment, this.lineHeight, this.horizontalAlignment, this.getContentWidth(85, widget), this.font);
          } else {
            this.prepareSingleLineLayout(widget, (byte) 112);
          }
          layout = widget.textLayout;
          return layout;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.P(").append(obfuscationGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(')').toString());
        }
    }

    public void paintWidget(Widget widget, int originX, int obfuscationGuard, boolean renderFlag, int originY) {
        if (this.font == null) {
          return;
        }
        try {
          if (obfuscationGuard >= -79) {
            Widget guardWidget = (Widget) null;
            this.getTextLeft((Widget) null, 119, (byte) 95);
          }
          this.drawDefaultText(originX, -251, originY, widget);
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "lk.C(" + (widget != null ? "{...}" : "null") + ',' + originX + ',' + obfuscationGuard + ',' + renderFlag + ',' + originY + ')');
        }
    }

    String getDisplayText(int obfuscationGuard, Widget widget) {
        RuntimeException failure = null;
        String text = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != 0) {
            this.paddingRight = -81;
          }
          text = widget.text;
          return text;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.AA(").append(obfuscationGuard).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(')').toString());
        }
    }

    public final int hitTestCharacter(Widget widget, int pointerX, int obfuscationGuard, int originY, int pointerY, int originX) {
        RuntimeException failure = null;
        int guardResult = 0;
        int characterIndex = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard < 79) {
            guardResult = -92;
            return guardResult;
          }
          this.getTextLayout(-56, widget);
          characterIndex = widget.textLayout.hitTestCharacter(-this.getTextLeft(widget, originX, (byte) -127) + pointerX, -this.getTextTop(-18033, originY, widget) + pointerY, -1);
          return characterIndex;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.K(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(pointerX).append(',').append(obfuscationGuard).append(',').append(originY).append(',').append(pointerY).append(',').append(originX).append(')').toString());
        }
    }

    public final void drawSelection(int obfuscationGuard, int startIndex, int endIndex, Widget widget, int originY, int originX) {
        int lineIndex = 0;
        int selectionLeft = 0;
        int selectionRight = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int firstIndex = 0;
        int lastIndex = 0;
        int firstLine = 0;
        int lastLine = 0;
        TextLineLayout line = null;
        int left = 0;
        int right = 0;
        int obfuscationControl = 0;
        TextLayout layout = null;
        TextLayout layoutAlias = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -21259) {
            return;
          }
          if (endIndex == startIndex) {
            return;
          }
          if (!widget.isFocused(false)) {
            return;
          }
          layout = this.getTextLayout(-45, widget);
          layoutAlias = layout;
          if (endIndex < startIndex) {
            lastIndex = startIndex;
            firstIndex = endIndex;
          } else {
            firstIndex = startIndex;
            lastIndex = endIndex;
          }
          firstLine = layoutAlias.getLineIndex(obfuscationGuard ^ -21259, firstIndex);
          lastLine = layoutAlias.getLineIndex(obfuscationGuard ^ -21259, lastIndex);
          CampaignUnitOverride.a(originX + widget.x, widget.width + (originX + widget.x), widget.height + (originY + widget.y), widget.y + originY, (byte) 116);
          for (lineIndex = firstLine; lastLine >= lineIndex; lineIndex++) {
            line = layout.lines[lineIndex];
            if (~lineIndex != ~firstLine) {
              selectionLeft = line.caretXs[0];
            } else {
              selectionLeft = layoutAlias.getCaretX((byte) -66, firstIndex);
            }
            left = selectionLeft;
            if (lastLine != lineIndex) {
              if (line == null) {
                selectionRight = 0;
              } else {
                selectionRight = line.caretXs[line.caretXs.length - 1];
              }
            } else {
              selectionRight = layoutAlias.getCaretX((byte) -66, lastIndex);
            }
            right = selectionRight;
            t.field_c.fillRectangle(this.selectionColour >>> 24, this.absoluteTextX(originX, widget, left, -109), this.paddingTop + originY + (widget.y + widget.contentOffsetY) + line.top, true, line.bottom, -left + right, this.selectionColour);
          }
          QuickChatPhraseRepository.popRasterState(obfuscationGuard + 2397);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.V(").append(obfuscationGuard).append(',').append(startIndex).append(',').append(endIndex).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(originY).append(',').append(originX).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_a = null;
        musicCrossfadeStream = null;
        int var1 = -5 / ((-45 - param0) / 50);
        field_s = null;
        field_r = null;
    }

    final static boolean b(boolean param0) {
        if (!param0) {
          return true;
        }
        return PasswordValidator.field_j > 250 ? true : false;
    }

    private final void drawDefaultText(int originX, int obfuscationGuard, int originY, Widget widget) {
        try {
          this.drawText(0, originY, originX, this.textColour, 0, this.shadowColour, widget, 2);
          if (obfuscationGuard != -251) {
            this.paddingBottom = 1;
          }
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "lk.G(" + originX + ',' + obfuscationGuard + ',' + originY + ',' + (widget != null ? "{...}" : "null") + ')');
        }
    }

    private final void drawText(int additionalX, int originY, int originX, int colour, int additionalY, int shadow, Widget widget, int obfuscationGuard) {
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        int contentWidth = 0;
        RuntimeException failure = null;
        int contentHeight = 0;
        int baselineY = 0;
        int verticalAlignment = 0;
        int obfuscationControl = 0;
        int horizontalAlignment;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 2) {
            this.shadowColour = -74;
          }
          boolean drawAsSingleLine = true;
          CampaignUnitOverride.a(widget.x + originX, widget.width + originX + widget.x, widget.height + (widget.y + originY), widget.y + originY, (byte) 91);
          contentWidth = this.getContentWidth(103, widget);
          contentHeight = this.getContentHeight(-99, widget);
          if (!this.wrapped) {
            verticalAlignment = this.verticalAlignment;
            if (0 != verticalAlignment) {
              if (2 != verticalAlignment) {
                if (verticalAlignment != 3 &&
                  verticalAlignment != 1) {
                }
                baselineY = this.font.maxAscent + (-this.font.maxAscent + contentHeight - this.font.maxDescent >> 1);
              } else {
                baselineY = -this.font.maxDescent + contentHeight;
              }
            } else {
              baselineY = this.font.maxAscent;
            }
            horizontalAlignment = this.horizontalAlignment;
            if (0 != horizontalAlignment &&
              horizontalAlignment != 3) {
              if (horizontalAlignment == 1) {
                this.font.drawCentered(this.getDisplayText(obfuscationGuard ^ 2, widget), this.absoluteTextX(originX, widget, additionalX, -13) + (contentWidth >> 1), baselineY + this.absoluteTextY(widget, additionalY, 0, originY), colour, shadow);
              } else {
                if ((horizontalAlignment == 2)) {
                  this.font.drawRightAligned(this.getDisplayText(obfuscationGuard - 2, widget), contentWidth + this.absoluteTextX(originX, widget, additionalX, -114), this.absoluteTextY(widget, additionalY, 0, originY) + baselineY, colour, shadow);
                }
              }
              drawAsSingleLine = false;
            }
            else {
              this.font.drawText(this.getDisplayText(0, widget), this.absoluteTextX(originX, widget, additionalX, obfuscationGuard + 67), baselineY + this.absoluteTextY(widget, additionalY, obfuscationGuard - 2, originY), colour, shadow);
            }
          } else {
            this.font.drawParagraph(this.getDisplayText(obfuscationGuard ^ 2, widget), this.absoluteTextX(originX, widget, additionalX, 66), this.absoluteTextY(widget, additionalY, 0, originY), contentWidth, contentHeight, colour, shadow, this.horizontalAlignment, this.verticalAlignment, this.lineHeight);
          }
          QuickChatPhraseRepository.popRasterState(-18862);
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.H(").append(additionalX).append(',').append(originY).append(',').append(originX).append(',').append(colour).append(',').append(additionalY).append(',').append(shadow).append(',');
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final int getPreferredWidth(Widget widget, byte obfuscationGuard) {
        int guardQuotient = 0;
        RuntimeException failure = null;
        int width = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String widgetDescription = null;
        RuntimeException caughtFailure = null;
        try {
          this.getTextLayout(-51, widget);
          guardQuotient = -62 / ((obfuscationGuard + 20) / 38);
          width = widget.textLayout.getRightExtent(false) - (-this.paddingLeft - this.paddingRight);
          return width;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("lk.I(");
          if (widget == null) {
            widgetDescription = "null";
          } else {
            widgetDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(widgetDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final int getLineInkHeight(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          return -56;
        }
        return this.font.maxDescent + this.font.maxAscent;
    }

    final static void a(int param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 70) {
            return;
          }
          oq.attachKeyboard(27080, (java.awt.Component) ((Object) param1));
          DisplacedUnitMarker.a((java.awt.Component) ((Object) param1), (byte) 74);
          if (CampaignMission.field_I == null) {
            return;
          }
          CampaignMission.field_I.a(0, (java.awt.Component) ((Object) param1));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("lk.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    protected BitmapTextWidgetPainter() {
    }

    final static void a(PlatformTaskService param0, int param1, MusicCrossfadeStream param2, byte param3, boolean param4, java.awt.Component param5) {
        try {
          int var6_int = -98 / ((param3 + 3) / 46);
          TileMetadata.initializeAudioPlayers(param5, 1024, param0, param4, -115, param2, param1, param1);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "lk.W(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    BitmapTextWidgetPainter(BitmapFont font, int paddingLeft, int paddingRight, int paddingTop, int paddingBottom, int textColour, int shadowColour, int horizontalAlignment, int verticalAlignment, int lineHeight, int caretColour, int selectionColour, boolean wrapped) {
        try {
          this.paddingTop = paddingTop;
          this.wrapped = wrapped ? true : false;
          this.textColour = textColour;
          this.paddingBottom = paddingBottom;
          this.selectionColour = selectionColour;
          this.shadowColour = shadowColour;
          this.font = font;
          this.lineHeight = lineHeight;
          this.horizontalAlignment = horizontalAlignment;
          this.verticalAlignment = verticalAlignment;
          this.caretColour = caretColour;
          this.paddingRight = paddingRight;
          this.paddingLeft = paddingLeft;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "lk.<init>(" + (font != null ? "{...}" : "null") + ',' + paddingLeft + ',' + paddingRight + ',' + paddingTop + ',' + paddingBottom + ',' + textColour + ',' + shadowColour + ',' + horizontalAlignment + ',' + verticalAlignment + ',' + lineHeight + ',' + caretColour + ',' + selectionColour + ',' + wrapped + ')');
        }
    }

    static {
        pointerChangedSnapshot = false;
        field_s = "Accept rematch";
    }
}
