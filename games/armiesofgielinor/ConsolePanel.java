/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ConsolePanel implements ap {
    ScrollContainer outputScroll;
    static ClientUiComponent field_m;
    String prompt;
    static RgbSprite field_k;
    static String field_i;
    static String field_g;
    ClientUiComponent suggestionBackdrop;
    static String field_r;
    private NodeDeque history;
    BitmapFont font;
    private int lineHeight;
    EditableTextField input;
    private ClientUiComponent panel;
    private String[] suggestions;
    private boolean open;
    private int frameTicks;
    private ConsoleTextNode historyCursor;
    private String lastInputText;
    private int openingTicksRemaining;
    private int lastCaretIndex;

    private final void appendOutputLine(int textColour, String text, int obfuscationGuard) {
        int rowY = 0;
        ClientUiComponent line = null;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          this.outputScroll.content.addChild(this.createOutputLine(textColour, text, (byte) -68), obfuscationGuard + 368);
          if (~this.outputScroll.content.children.size(false) < obfuscationGuard) {
            this.outputScroll.content.children.popFirst(0);
          }
          rowY = 5;
          line = (ClientUiComponent) (this.outputScroll.content.children.first((byte) 107));
          while (line != null) {
            line.y = rowY;
            rowY = rowY + this.lineHeight;
            line = (ClientUiComponent) (this.outputScroll.content.children.next((byte) 123));
          }
          this.outputScroll.content.height = rowY;
          this.outputScroll.content.y = this.outputScroll.height - rowY;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "dv.E(" + textColour + ',' + (text != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    abstract boolean evaluateInput(String source, boolean executeExpression);

    final static String replaceText(String text, int obfuscationGuard, String search, String replacement) {
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int matchIndex = text.indexOf(search);
        if (obfuscationGuard > -45) {
          field_g = (String) null;
        }
        while (-1 != matchIndex) {
          text = text.substring(0, matchIndex) + replacement + text.substring(matchIndex + search.length());
          matchIndex = text.indexOf(search, replacement.length() + matchIndex);
        }
        return text;
    }

    void drawConsole(int obfuscationGuard) {
        int suggestionIndex = 0;
        int overlayOpacity = 0;
        int shadowY = 0;
        int shadowLayer = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int guardQuotient;
        int suggestionY;
        int initialSuggestionIndex;
        if (!(this.panel.height + this.panel.y <= 0)) {
          SoftwareRaster.b(this.panel.screenX, this.panel.screenY, this.outputScroll.x, this.panel.height, 5592405, 230);
          SoftwareRaster.b(this.outputScroll.width + this.outputScroll.screenX, this.panel.screenY, this.outputScroll.x, this.panel.height, 5592405, 230);
          SoftwareRaster.b(this.outputScroll.screenX, this.panel.screenY, this.outputScroll.width, this.outputScroll.y, 5592405, 230);
          SoftwareRaster.b(this.outputScroll.screenX, this.outputScroll.height + this.outputScroll.screenY, this.outputScroll.width, this.input.screenY + (-this.outputScroll.screenY - this.outputScroll.height), 5592405, 230);
          SoftwareRaster.b(this.outputScroll.screenX, this.input.height + this.input.screenY, this.outputScroll.width, -this.input.height + this.panel.height - this.input.y, 5592405, 230);
          SoftwareRaster.b(this.outputScroll.screenX, this.outputScroll.screenY, this.outputScroll.width, this.outputScroll.height, 2236962, 240);
          SoftwareRaster.b(this.input.screenX, this.input.screenY, this.input.width, this.input.height, 2236962, 240);
          overlayOpacity = this.panel.y + 256;
          if (overlayOpacity < 0) {
            overlayOpacity = 0;
          }
          SoftwareRaster.b(this.panel.screenX, this.panel.screenY + this.panel.height, this.panel.width, -this.panel.height + (-this.panel.screenY + dt.field_a), 0, overlayOpacity >> 1);
          shadowY = 5 + this.panel.y + this.panel.height;
          for (shadowLayer = 0; shadowLayer < 6; shadowLayer++) {
            SoftwareRaster.e(0, shadowY, bn.field_b, 0, shadowLayer << 5);
            shadowY--;
          }
          this.panel.draw(0 == (8 & this.frameTicks) ? true : false, 20);
        }
        guardQuotient = 126 / ((13 - obfuscationGuard) / 33);
        if (this.suggestions != null &&
          this.open) {
          suggestionY = this.panel.height + this.panel.y;
          this.suggestionBackdrop.y = suggestionY;
          this.suggestionBackdrop.draw(false, 20);
          suggestionY = suggestionY + (this.lineHeight + 5);
          suggestionIndex = 0;
          initialSuggestionIndex = suggestionIndex;
          while (this.suggestions.length > suggestionIndex) {
            this.font.drawText(this.suggestions[suggestionIndex], 10 + this.suggestionBackdrop.screenX, suggestionY, 13421772, -1);
            suggestionY = suggestionY + this.lineHeight;
            suggestionIndex++;
          }
        }
    }

    abstract void completeInput(byte obfuscationGuard);

    private final ClientUiComponent createSelectionStyle(byte obfuscationGuard, int colour) {
        int guardRemainder = -63 % ((obfuscationGuard + 36) / 61);
        ClientUiComponent style = new ClientUiComponent(0L, (ClientUiComponent) null);
        style.skinSprites = ak.b(colour, 5);
        return style;
    }

    public static void c(byte param0) {
        field_k = null;
        field_r = null;
        field_m = null;
        int var1 = -8 % ((-2 - param0) / 34);
        field_g = null;
        field_i = null;
    }

    private final void rememberCommand(String source, int obfuscationGuard) {
        ConsoleTextNode newestEntry = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String sourceDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        try {
          newestEntry = (ConsoleTextNode) (this.history.first((byte) 90));
          if (newestEntry == null ||
            !source.equals(newestEntry.text)) {
            this.history.addFirst(750, new ConsoleTextNode(source));
          }
          if (obfuscationGuard < 37) {
            this.outputScroll = (ScrollContainer) null;
          }
          if (this.history.size(false) > 30) {
            this.history.popLast((byte) -123);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("dv.H(");
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(sourceDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void advanceConsole(byte obfuscationGuard, boolean inputFlag) {
        int suggestionIndex = 0;
        int maximumSuggestionWidth;
        int suggestionWidth;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.open &&
          this.openingTicksRemaining > 0) {
          this.openingTicksRemaining = this.openingTicksRemaining - 1;
          this.panel.y = -200 * (this.openingTicksRemaining * this.openingTicksRemaining) / 225;
        } else {
          if (!this.open &&
            this.panel.y + 200 > 0) {
            this.panel.y = this.panel.y - 28;
          }
        }
        if (!this.input.getText(0).equals(this.lastInputText) ||
          this.input.getCaretIndex(93) != this.lastCaretIndex) {
          this.lastInputText = this.input.getText(0);
          this.lastCaretIndex = this.input.getCaretIndex(-29);
          this.suggestions = this.getSuggestions(true);
          if (null != this.suggestions &&
            this.suggestions.length == 0) {
            this.suggestions = null;
          }
          if (null != this.suggestions) {
            maximumSuggestionWidth = 0;
            for (suggestionIndex = 0; suggestionIndex < this.suggestions.length; suggestionIndex++) {
              suggestionWidth = this.font.textWidth(this.suggestions[suggestionIndex]);
              if (maximumSuggestionWidth < suggestionWidth) {
                maximumSuggestionWidth = suggestionWidth;
              }
            }
            this.suggestionBackdrop.width = maximumSuggestionWidth + 20;
            this.suggestionBackdrop.height = 15 + this.suggestions.length * this.lineHeight;
          }
        }
        this.frameTicks = this.frameTicks + 1;
        if (obfuscationGuard > -58) {
          return;
        }
        this.panel.updateInput(true, inputFlag);
        this.outputScroll.advanceScroll(this.lineHeight, true, el.field_d * (2 * this.lineHeight), false);
        this.input.advanceEditing(0);
    }

    final static void a(boolean param0) {
        int var2;
        var2 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if ((rd.gameplayController.battlefield.field_C & 1 << rd.gameplayController.controlledPlayerId) != 0) {
          DisplacedUnitMarker.field_t[10] = ContextActionMenu.field_Jb;
        } else {
          if ((~rd.gameplayController.battlefield.eliminatedPlayerMask & rd.gameplayController.battlefield.field_C) == 0) {
            DisplacedUnitMarker.field_t[10] = uu.field_c;
          } else {
            DisplacedUnitMarker.field_t[10] = MatchSetupPanel.field_O;
          }
        }
        if (!param0) {
          field_i = (String) null;
        }
    }

    private final void appendWrappedOutput(String text, int textColour, int obfuscationGuard) {
        int lineIndex = 0;
        int maximumWidth = 0;
        String[] lines = null;
        String[] linesAlias = null;
        String lineText = null;
        NodeDeque wrappedLines = null;
        ConsoleTextNode wrappedLine = null;
        int obfuscationControl = 0;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          maximumWidth = -10 + (this.outputScroll.width - 15);
          lines = dj.splitText(-100, '\n', text);
          linesAlias = lines;
          if (obfuscationGuard > -25) {
            return;
          }
          for (lineIndex = 0; linesAlias.length > lineIndex; lineIndex++) {
            lineText = linesAlias[lineIndex];
            if (maximumWidth <= this.font.textWidth(lineText)) {
              wrappedLines = this.wrapOutputLine(lineText, maximumWidth, (byte) -98);
              wrappedLine = (ConsoleTextNode) (wrappedLines.first((byte) 123));
              while (wrappedLine != null) {
                this.appendOutputLine(textColour, wrappedLine.text, -257);
                wrappedLine = (ConsoleTextNode) (wrappedLines.next((byte) 123));
              }
            } else {
              this.appendOutputLine(textColour, lineText, -257);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("dv.B(");
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(textDescription).append(',').append(textColour).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final NodeDeque wrapOutputLine(String remainingText, int maximumWidth, byte obfuscationGuard) {
        int spaceScanIndex = 0;
        int hardSplitScanIndex = 0;
        NodeDeque wrappedResult = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String remainingTextDescription = null;
        RuntimeException caughtFailure = null;
        NodeDeque wrappedLines = null;
        RuntimeException failure = null;
        int remainingWidth = 0;
        String lineText = null;
        int splitIndex = 0;
        int obfuscationControl = 0;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != -98) {
            this.lastInputText = (String) null;
          }
          wrappedLines = new NodeDeque();
          while (remainingText != null) {
            boolean lineFitsWithoutSplit = true;
            remainingWidth = this.font.textWidth(remainingText);
            lineText = remainingText;
            if (maximumWidth < remainingWidth) {
              splitIndex = -1 + remainingText.length();
              while (splitIndex > 0) {
                if (remainingWidth > maximumWidth ||
                  remainingText.charAt(splitIndex) != 32) {
                  spaceScanIndex = splitIndex;
                  splitIndex--;
                  remainingWidth = remainingWidth - this.font.characterWidth(remainingText.charAt(spaceScanIndex));
                  continue;
                }
                break;
              }
              if (splitIndex == 0) {
                remainingWidth = this.font.textWidth(remainingText);
                splitIndex = remainingText.length() - 1;
                while (maximumWidth < remainingWidth) {
                  hardSplitScanIndex = splitIndex;
                  splitIndex--;
                  remainingWidth = remainingWidth - this.font.characterWidth(remainingText.charAt(hardSplitScanIndex));
                }
              }
              lineText = remainingText.substring(0, splitIndex);
              remainingText = remainingText.substring(1 + splitIndex);
              lineFitsWithoutSplit = false;
            }
            else {
              remainingText = null;
            }
            wrappedLines.addLast((byte) -119, (IntrusiveNode) (new ConsoleTextNode(lineText)));
          }
          wrappedResult = wrappedLines;
          return wrappedResult;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("dv.N(");
          if (remainingText == null) {
            remainingTextDescription = "null";
          } else {
            remainingTextDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(remainingTextDescription).append(',').append(maximumWidth).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    private final ClientUiComponent createBorderStyle(int obfuscationGuard, int borderColour, int fillColour) {
        ClientUiComponent style = new ClientUiComponent(0L, (ClientUiComponent) null);
        style.skinSprites = tn.a(true, borderColour, fillColour);
        if (obfuscationGuard != 5592405) {
          this.outputScroll = (ScrollContainer) null;
        }
        return style;
    }

    final void printValue(Object value, int obfuscationGuard) {
        try {
          int guardRemainder = 43 % ((45 - obfuscationGuard) / 56);
          this.printText(-1, value == null ? "null" : value.toString());
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "dv.T(" + (value != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    private final ClientUiComponent createOutputLine(int textColour, String text, byte obfuscationGuard) {
        ClientUiComponent line = null;
        RuntimeException failure = null;
        ClientUiComponent result = null;
        RuntimeException failureForContext = null;
        StringBuilder errorContext = null;
        String textDescription = null;
        RuntimeException caughtFailure = null;
        try {
          if (obfuscationGuard != -68) {
            field_k = (RgbSprite) null;
          }
          line = new ClientUiComponent(0L, (ClientUiComponent) null, text);
          line.textColour = textColour;
          line.font = this.font;
          line.setBounds(this.lineHeight, -20500, this.font.textWidth(line.text), 0, 5);
          result = line;
          return result;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureForContext = failure;
          errorContext = new StringBuilder().append("dv.L(").append(textColour).append(',');
          if (text == null) {
            textDescription = "null";
          } else {
            textDescription = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failureForContext), ((StringBuilder) (Object) errorContext).append(textDescription).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final boolean isOpen(int obfuscationGuard) {
        if (obfuscationGuard != -31501) {
          return false;
        }
        return this.open;
    }

    final void printText(int obfuscationGuard, String text) {
        try {
          this.appendWrappedOutput(text, 13421772, obfuscationGuard ^ 90);
          if (obfuscationGuard != -1) {
            this.lastCaretIndex = 92;
          }
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "dv.A(" + obfuscationGuard + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    abstract String[] getSuggestions(boolean obfuscationGuard);

    private final void toggleOpen(byte obfuscationGuard) {
        boolean nextOpen = false;
        nextOpen = !(this.open);
        this.open = nextOpen;
        if (!this.open) {
          if (null != this.panel) {
            this.panel.setFocusedComponent(3, (ClientUiComponent) null);
          }
        } else {
          this.openingTicksRemaining = 15;
          if (this.panel != null) {
            this.panel.setFocusedComponent(~obfuscationGuard, this.input);
          }
        }
        if (obfuscationGuard != -4) {
          field_r = (String) null;
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param3 != -66) {
          return;
        }
        if (param15 > param0) {
          if (param8 > param15) {
            TelepopEvent.a(SoftwareRaster.pixels, param5, param13, param12, param4, param1, param7, param9, param6, param11, param15, param8, param14, true, param2, param0, param10);
          } else {
            if (param8 > param0) {
              TelepopEvent.a(SoftwareRaster.pixels, param5, param12, param13, param4, param9, param10, param1, param6, param14, param8, param15, param11, true, param2, param0, param7);
            } else {
              TelepopEvent.a(SoftwareRaster.pixels, param1, param4, param13, param12, param9, param6, param5, param10, param14, param0, param15, param2, true, param11, param8, param7);
            }
          }
        } else {
          if (param8 <= param0) {
            if (param8 > param15) {
              TelepopEvent.a(SoftwareRaster.pixels, param9, param12, param4, param13, param5, param10, param1, param7, param2, param8, param0, param11, true, param14, param15, param6);
            } else {
              TelepopEvent.a(SoftwareRaster.pixels, param1, param13, param4, param12, param5, param7, param9, param10, param2, param15, param0, param14, true, param11, param8, param6);
            }
          } else {
            TelepopEvent.a(SoftwareRaster.pixels, param9, param4, param12, param13, param1, param6, param5, param7, param11, param0, param8, param2, true, param14, param15, param10);
          }
        }
    }

    boolean handleKey(int obfuscationGuard, char character, int keyCode) {
        IntrusiveNode historyNode = null;
        ClientUiComponent submittedLine;
        int obfuscationControl;
        String source;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -30847) {
          ConsolePanel.a(false);
        }
        if (96 == character) {
          this.toggleOpen((byte) -4);
          return true;
        }
        if (!this.open) {
          return false;
        }
        if (84 != keyCode) {
          if (98 == keyCode) {
            if (null == this.historyCursor ||
              this.historyCursor.next != this.history.sentinel) {
              if (this.historyCursor == null) {
                historyNode = this.history.first((byte) 119);
              } else {
                historyNode = this.historyCursor.next;
              }
              this.historyCursor = (ConsoleTextNode) (historyNode);
              if (this.historyCursor != null) {
                this.input.setText(this.historyCursor.text, (byte) 45);
              }
            }
          } else {
            if (keyCode == 99) {
              if (this.historyCursor != null &&
                this.history.sentinel != this.historyCursor.previous) {
                this.historyCursor = (ConsoleTextNode) (this.historyCursor.previous);
                this.input.setText(this.historyCursor.text, (byte) 45);
              }
            } else {
              if (80 == keyCode) {
                this.completeInput((byte) 122);
              } else {
                this.input.handleKey(keyCode, obfuscationGuard + 4721, character);
              }
            }
          }
        } else {
          source = this.input.getText(0);
          if (source.length() <= 0) {
            return true;
          }
          this.appendWrappedOutput(this.prompt + source, 5635925, obfuscationGuard + 30734);
          submittedLine = (ClientUiComponent) (this.outputScroll.content.children.last((byte) -81));
          if (!this.evaluateInput(source, true)) {
            submittedLine.textColour = 16733525;
          }
          this.input.clearText(true);
          this.rememberCommand(source, obfuscationGuard + 30943);
          this.historyCursor = null;
        }
        return true;
    }

    private final ClientUiComponent createSolidStyle(boolean obfuscationGuard, int colour) {
        ClientUiComponent style = new ClientUiComponent();
        style.skinSprites = tn.a(obfuscationGuard, 0, colour);
        return style;
    }

    ConsolePanel(BitmapFont font, PlatformTaskService platformService) {
        int inputHeight = 0;
        ClientUiComponent solidStyle = null;
        ClientUiComponent panelStyle = null;
        ClientUiComponent scrollStyle = null;
        ClientUiComponent inputStyle = null;
        ClientUiComponent arrowStyle = null;
        ClientUiComponent trackStyle = null;
        ClientUiComponent thumbStyle = null;
        ClientUiComponent selectionStyle = null;
        ClientUiComponent suggestionStyle = null;
        VerticalScrollbar scrollbar = null;
        ClientUiComponent outputContent = null;
        ClientUiComponent inputTextStyle = null;
        this.prompt = "# ";
        this.history = new NodeDeque();
        this.suggestions = null;
        this.open = false;
        this.frameTicks = 0;
        this.openingTicksRemaining = 0;
        try {
          this.font = font;
          this.lineHeight = this.font.maxAscent + this.font.maxDescent;
          inputHeight = this.lineHeight + 4;
          solidStyle = this.createSolidStyle(true, 65793);
          panelStyle = solidStyle;
          scrollStyle = solidStyle;
          inputStyle = solidStyle;
          arrowStyle = this.createBorderStyle(5592405, 7829367, 2236962);
          trackStyle = this.createBorderStyle(5592405, 65793, 65793);
          thumbStyle = this.createBorderStyle(5592405, 3355443, 65793);
          selectionStyle = this.createSelectionStyle((byte) 71, 2263074);
          suggestionStyle = this.createBorderStyle(5592405, 2236962, 65793);
          this.panel = new ClientUiComponent(0L, panelStyle);
          this.panel.setBounds(200, -20500, bn.field_b, -200, 0);
          scrollbar = new VerticalScrollbar(0L, arrowStyle, arrowStyle, trackStyle, thumbStyle);
          outputContent = new ClientUiComponent();
          outputContent.children = new NodeDeque();
          this.outputScroll = new ScrollContainer(0L, outputContent, scrollStyle, scrollbar);
          this.outputScroll.content.children = new NodeDeque();
          this.outputScroll.setLayout(5, false, this.panel.width - 10, 0, 15, 5, 185 - inputHeight);
          this.panel.addChild(this.outputScroll, 71);
          inputTextStyle = new ClientUiComponent();
          inputTextStyle.font = this.font;
          inputTextStyle.textColour = 13421772;
          inputTextStyle.contentOffsetX = 5;
          inputTextStyle.contentOffsetY = 2;
          this.input = new EditableTextField(0L, inputStyle, selectionStyle, inputTextStyle);
          this.input.setLayout(this.outputScroll.y - (-this.outputScroll.height - 5), 0, this.outputScroll.width, inputHeight, this.outputScroll.x);
          this.input.setPlatformService(platformService, 176);
          this.panel.addChild(this.input, 87);
          this.suggestionBackdrop = new ClientUiComponent(0L, suggestionStyle);
          this.suggestionBackdrop.x = 0;
        } catch (RuntimeException failure) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) failure), "dv.<init>(" + (font != null ? "{...}" : "null") + ',' + (platformService != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_r = "Discard";
        field_i = "Mana";
        field_g = "0.0";
        field_k = null;
    }
}
