/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class DeveloperConsole implements DeveloperConsoleMarker {
    private int lineHeight;
    String prompt;
    TextInputWidget inputWidget;
    private Widget panel;
    Widget completionBackground;
    BitmapFont font;
    ScrollPaneWidget outputPane;
    private IntrusiveDeque history;
    static QuickChatDynamicCommand field_g;
    static Widget field_q;
    private String[] completionSuggestions;
    private int lastCaretPosition;
    private boolean open;
    private TextNode historyCursor;
    private int openingFramesRemaining;
    private String lastInputText;
    private int frameCounter;

    private final Widget createOutputLineWidget(int param0, int param1, String param2) {
        Widget var4 = null;
        RuntimeException var4_ref = null;
        Widget stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new Widget((long)param1, (Widget) null, param2);
          var4.font = this.font;
          var4.field_Y = param0;
          var4.setBounds(5, param1 + 124, this.font.getStringWidth(var4.text), 0, this.lineHeight);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("qc.U(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final void appendOutputLine(int param0, int param1, String param2) {
        int var4_int = 0;
        Widget var5 = null;
        int var6 = VoidHunters.field_G;
        try {
          this.outputPane.content.addChild(-561, this.createOutputLineWidget(param1, 0, param2));
          if (!(param0 <= ~this.outputPane.content.children.size(3))) {
            this.outputPane.content.children.removeFirst(true);
          }
          var4_int = 5;
          var5 = (Widget) (this.outputPane.content.children.first(0));
          while (var5 != null) {
            var5.y = var4_int;
            var4_int = var4_int + this.lineHeight;
            var5 = (Widget) (this.outputPane.content.children.next((byte) 30));
          }
          this.outputPane.content.height = var4_int;
          this.outputPane.content.y = -var4_int + this.outputPane.height;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "qc.L(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isOpen(int param0) {
        if (param0 != 13462) {
          this.draw((byte) -120);
        }
        return this.open;
    }

    final void printLine(byte param0, String param1) {
        try {
          this.printColored(param1, false, 13421772);
          if (param0 < 65) {
            String var4 = (String) null;
            this.printLine((byte) -84, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "qc.S(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final IntrusiveDeque wrapOutputText(int param0, byte param1, String param2) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        IntrusiveDeque stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        IntrusiveDeque var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = VoidHunters.field_G;
        try {
          var5 = -120 / ((-80 - param1) / 41);
          var4 = new IntrusiveDeque();
          while (param2 != null) {
            boolean decompiledFrameRemainder0 = true;
            var6 = this.font.getStringWidth(param2);
            var7 = param2;
            if (param0 < var6) {
              var8 = -1 + param2.length();
              while (var8 > 0) {
                if (var6 > param0 ||
                  param2.charAt(var8) != 32) {
                  incrementValue$0 = var8;
                  var8--;
                  var6 = var6 - this.font.getCharacterAdvance(param2.charAt(incrementValue$0));
                  continue;
                }
                break;
              }
              if (var8 == 0) {
                var6 = this.font.getStringWidth(param2);
                var8 = param2.length() - 1;
                while (param0 < var6) {
                  incrementValue$1 = var8;
                  var8--;
                  var6 = var6 - this.font.getCharacterAdvance(param2.charAt(incrementValue$1));
                }
              }
              var7 = param2.substring(0, var8);
              param2 = param2.substring(var8 + 1);
              decompiledFrameRemainder0 = false;
            }
            else {
              param2 = null;
            }
            var4.addLast(-10258, new TextNode(var7));
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_23_0 = var4_ref;
          stackIn_23_1 = new StringBuilder().append("qc.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_q = null;
        if (param0 < 16) {
          return;
        }
        field_g = null;
    }

    abstract String[] getCompletionSuggestions(int param0);

    private final void addHistoryEntry(String param0, int param1) {
        TextNode var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (TextNode) (this.history.first(0));
          var4 = -50 / ((74 - param1) / 41);
          if (var3 == null ||
            !param0.equals(var3.text)) {
            this.history.addFirst(new TextNode(param0), (byte) -55);
          }
          if (this.history.size(3) > 30) {
            this.history.removeLast((byte) -115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("qc.O(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    void draw(byte param0) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        int var6 = VoidHunters.field_G;
        int var2 = 59 / ((param0 - 44) / 43);
        int var3Lifetime1;
        int var4Lifetime1;
        if (this.panel.y + this.panel.height > 0) {
          SoftwareRasterizer2D.fillRectangleAlpha(this.panel.screenX, this.panel.screenY, this.outputPane.x, this.panel.height, 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.outputPane.width + this.outputPane.screenX, this.panel.screenY, this.outputPane.x, this.panel.height, 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.outputPane.screenX, this.panel.screenY, this.outputPane.width, this.outputPane.y, 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.outputPane.screenX, this.outputPane.height + this.outputPane.screenY, this.outputPane.width, -this.outputPane.height + this.inputWidget.screenY - this.outputPane.screenY, 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.outputPane.screenX, this.inputWidget.height + this.inputWidget.screenY, this.outputPane.width, -this.inputWidget.height + (this.panel.height - this.inputWidget.y), 5592405, 230);
          SoftwareRasterizer2D.fillRectangleAlpha(this.outputPane.screenX, this.outputPane.screenY, this.outputPane.width, this.outputPane.height, 2236962, 240);
          SoftwareRasterizer2D.fillRectangleAlpha(this.inputWidget.screenX, this.inputWidget.screenY, this.inputWidget.width, this.inputWidget.height, 2236962, 240);
          var3 = this.panel.y + 256;
          if (0 > var3) {
            var3 = 0;
          }
          SoftwareRasterizer2D.fillRectangleAlpha(this.panel.screenX, this.panel.height + this.panel.screenY, this.panel.width, -this.panel.height + SetPointDefenceLaserReload.field_p - this.panel.screenY, 0, var3 >> 1);
          var4 = 5 + (this.panel.height + this.panel.y);
          for (var5 = 0; 6 > var5; var5++) {
            SoftwareRasterizer2D.drawHorizontalLineAlpha(0, var4, GetDebrisSurvives.field_p, 0, var5 << 5);
            var4--;
          }
          this.panel.draw((8 & this.frameCounter) == 0 ? true : false, 111);
        }
        if (this.completionSuggestions != null &&
          this.open) {
          var3Lifetime1 = this.panel.height + this.panel.y;
          this.completionBackground.y = var3Lifetime1;
          this.completionBackground.draw(false, 43);
          var3Lifetime1 = var3Lifetime1 + (this.lineHeight + 5);
          for (var4Lifetime1 = 0; this.completionSuggestions.length > var4Lifetime1; var4Lifetime1++) {
            this.font.draw(this.completionSuggestions[var4Lifetime1], this.completionBackground.screenX + 10, var3Lifetime1, 13421772, -1);
            var3Lifetime1 = var3Lifetime1 + this.lineHeight;
          }
        }
    }

    private final Widget createBorderedBackgroundWidget(byte param0, int param1, int param2) {
        if (param0 > -57) {
          this.completionSuggestions = (String[]) null;
        }
        Widget var4 = new Widget(0L, (Widget) null);
        var4.field_gb = SetBurstFireReload.createBorderedSpriteTiles(-26998, param1, param2);
        return var4;
    }

    abstract boolean executeInput(int param0, String param1);

    abstract void completeInput(int param0);

    final static ResourceArchive getToolkitResourceArchive(int param0) {
        if (param0 != 0) {
          field_q = (Widget) null;
        }
        return SetBoostersCooldown.getOrCreateToolkitResourceArchive((byte) 52, OneShotSound.field_e.id);
    }

    private final Widget createCenterBackgroundWidget(int param0, int param1) {
        if (param0 != 4) {
          return (Widget) null;
        }
        Widget var3 = new Widget(0L, (Widget) null);
        var3.field_gb = GetBurstFireRegenerationRate.createCenterSpriteTile(true, param1);
        return var3;
    }

    final void update(boolean param0, byte param1) {
        int var4 = 0;
        int var3;
        int var5;
        int var6;
        var6 = VoidHunters.field_G;
        if (param1 <= 73) {
          return;
        }
        if (this.open &&
          0 < this.openingFramesRemaining) {
          this.openingFramesRemaining = this.openingFramesRemaining - 1;
          this.panel.y = this.openingFramesRemaining * -200 * this.openingFramesRemaining / 225;
        } else {
          if (!this.open &&
            0 < 200 + this.panel.y) {
            this.panel.y = this.panel.y - 28;
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.inputWidget.getText(-14453).equals(this.lastInputText)) {
          decompiledFrameRemainder0 = (this.inputWidget.getCaretPosition(0) != this.lastCaretPosition);
          if (decompiledFrameRemainder0) {
            this.lastInputText = this.inputWidget.getText(-14453);
            this.lastCaretPosition = this.inputWidget.getCaretPosition(0);
            this.completionSuggestions = this.getCompletionSuggestions(-85);
            if (this.completionSuggestions != null &&
              this.completionSuggestions.length == 0) {
              this.completionSuggestions = null;
            }
          }
        } else {
          this.lastInputText = this.inputWidget.getText(-14453);
          this.lastCaretPosition = this.inputWidget.getCaretPosition(0);
          this.completionSuggestions = this.getCompletionSuggestions(-85);
          if (this.completionSuggestions != null &&
            this.completionSuggestions.length == 0) {
            this.completionSuggestions = null;
          }
        }
        if ((decompiledFrameRemainder0) &&
          (this.completionSuggestions != null)) {
          var3 = 0;
          for (var4 = 0; this.completionSuggestions.length > var4; var4++) {
            var5 = this.font.getStringWidth(this.completionSuggestions[var4]);
            if (var3 < var5) {
              var3 = var5;
            }
          }
          this.completionBackground.width = 20 + var3;
          this.completionBackground.height = 15 + this.lineHeight * this.completionSuggestions.length;
        }
        this.frameCounter = this.frameCounter + 1;
        this.panel.updateInput(param0, 1332);
        this.outputPane.updateScrolling(2 * (this.lineHeight * GetPointDefenceLaserPulsetime.field_o), true, this.lineHeight, 0);
        this.inputWidget.updateInputAndSelection((byte) -6);
    }

    private final void printColored(String param0, boolean param1, int param2) {
        int var7 = 0;
        int var4_int = 0;
        String[] var5 = null;
        String[] var6 = null;
        String var8 = null;
        IntrusiveDeque var9 = null;
        TextNode var10 = null;
        int var11 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var11 = VoidHunters.field_G;
        try {
          var4_int = this.outputPane.width - 25;
          var5 = SetFighterBayAimspeed.a((byte) -67, '\n', param0);
          var6 = var5;
          if (param1) {
            return;
          }
          for (var7 = 0; var6.length > var7; var7++) {
            var8 = var6[var7];
            if (var4_int <= this.font.getStringWidth(var8)) {
              var9 = this.wrapOutputText(var4_int, (byte) -128, var8);
              var10 = (TextNode) (var9.first(0));
              while (var10 != null) {
                this.appendOutputLine(-257, param2, var10.text);
                var10 = (TextNode) (var9.next((byte) 26));
              }
            } else {
              this.appendOutputLine(-257, param2, var8);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("qc.T(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final Widget createBackgroundWidget(int param0, byte param1) {
        int var3 = -103 / ((param1 + 68) / 35);
        Widget var4 = new Widget();
        var4.field_gb = SetBurstFireReload.createBorderedSpriteTiles(-26998, 0, param0);
        return var4;
    }

    private final void toggleOpen(boolean param0) {
        boolean stackIn_3_1 = false;
        stackIn_3_1 = !(this.open);
        this.open = stackIn_3_1;
        if (this.open) {
          this.openingFramesRemaining = 15;
          if (null != this.panel) {
            this.panel.setSelectedWidget(false, this.inputWidget);
          }
        } else {
          if (null != this.panel) {
            this.panel.setSelectedWidget(false, (Widget) null);
          }
        }
        if (!param0) {
          field_g = (QuickChatDynamicCommand) null;
        }
    }

    boolean handleKey(int param0, char param1, int param2) {
        Widget discarded$0 = null;
        IntrusiveNode stackIn_18_1 = null;
        Widget var5;
        int var6;
        String var7;
        var6 = VoidHunters.field_G;
        if (param2 != -40) {
          discarded$0 = this.createBackgroundWidget(77, (byte) 52);
        }
        if (96 == param1) {
          this.toggleOpen(true);
          return true;
        }
        if (!this.open) {
          return false;
        }
        if (param0 != 84) {
          if (param0 != 98) {
            if (99 != param0) {
              if (param0 != 80) {
                this.inputWidget.handleKey(param0, -1, param1);
              } else {
                this.completeInput(-35);
              }
            } else {
              if (null != this.historyCursor &&
                this.history.sentinel != this.historyCursor.previous) {
                this.historyCursor = (TextNode) (this.historyCursor.previous);
                this.inputWidget.setText(this.historyCursor.text, -114);
              }
            }
          } else {
            if (this.historyCursor == null ||
              this.history.sentinel != this.historyCursor.next) {
              if (null != this.historyCursor) {
                stackIn_18_1 = this.historyCursor.next;
              } else {
                stackIn_18_1 = this.history.first(param2 + 40);
              }
              this.historyCursor = (TextNode) (stackIn_18_1);
              if (null != this.historyCursor) {
                this.inputWidget.setText(this.historyCursor.text, -121);
              }
            }
          }
        } else {
          var7 = this.inputWidget.getText(-14453);
          if (var7.length() <= 0) {
            return true;
          }
          this.printColored(this.prompt + var7, false, 5635925);
          var5 = (Widget) (this.outputPane.content.children.last((byte) 127));
          if (!this.executeInput(-10278, var7)) {
            var5.field_Y = 16733525;
          }
          this.inputWidget.clearText(true);
          this.addHistoryEntry(var7, param2 ^ 122);
          this.historyCursor = null;
        }
        return true;
    }

    final void printObject(Object param0, int param1) {
        if (param1 >= -16) {
          return;
        }
        try {
          this.printLine((byte) 115, param0 != null ? param0.toString() : "null");
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "qc.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    DeveloperConsole(BitmapFont param0, PlatformService param1) {
        int var3_int = 0;
        Widget var4 = null;
        Widget var5 = null;
        Widget var6 = null;
        Widget var7 = null;
        Widget var8 = null;
        Widget var9 = null;
        Widget var10 = null;
        Widget var11 = null;
        Widget var12 = null;
        ScrollBarWidget var13 = null;
        Widget var14 = null;
        Widget var15 = null;
        this.prompt = "# ";
        this.history = new IntrusiveDeque();
        this.completionSuggestions = null;
        this.openingFramesRemaining = 0;
        this.open = false;
        this.frameCounter = 0;
        try {
          this.font = param0;
          this.lineHeight = this.font.maxAscent + this.font.maxDescent;
          var3_int = this.lineHeight + 4;
          var4 = this.createBackgroundWidget(65793, (byte) 79);
          var5 = var4;
          var6 = var4;
          var7 = var4;
          var8 = this.createBorderedBackgroundWidget((byte) -59, 7829367, 2236962);
          var9 = this.createBorderedBackgroundWidget((byte) -91, 65793, 65793);
          var10 = this.createBorderedBackgroundWidget((byte) -63, 3355443, 65793);
          var11 = this.createCenterBackgroundWidget(4, 2263074);
          var12 = this.createBorderedBackgroundWidget((byte) -105, 2236962, 65793);
          this.panel = new Widget(0L, var5);
          this.panel.setBounds(0, 16, GetDebrisSurvives.field_p, -200, 200);
          var13 = new ScrollBarWidget(0L, var8, var8, var9, var10);
          var14 = new Widget();
          var14.children = new IntrusiveDeque();
          this.outputPane = new ScrollPaneWidget(0L, var14, var6, var13);
          this.outputPane.content.children = new IntrusiveDeque();
          this.outputPane.setBoundsAndLayout(this.panel.width - 10, 0, -1, -var3_int + 185, 5, 5, 15);
          this.panel.addChild(-561, this.outputPane);
          var15 = new Widget();
          var15.field_Y = 13421772;
          var15.field_t = 5;
          var15.font = this.font;
          var15.field_v = 2;
          this.inputWidget = new TextInputWidget(0L, var7, var11, var15);
          this.inputWidget.setBoundsAndLayout(this.outputPane.width, this.outputPane.x, var3_int, this.outputPane.height + (this.outputPane.y + 5), true);
          this.inputWidget.setClipboardService(-20640, param1);
          this.panel.addChild(-561, this.inputWidget);
          this.completionBackground = new Widget(0L, var12);
          this.completionBackground.x = 0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "qc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_g = new QuickChatDynamicCommand(15, 0, 1, 0);
    }
}
