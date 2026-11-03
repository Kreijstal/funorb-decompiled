/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameSuggestionsPanel extends WidgetContainer implements ButtonActivationListener {
    static int[] field_P;
    static String timerSecondsFractions;
    static String field_X;
    private String[] suggestions;
    static IntrusiveDeque field_R;
    static Sprite[] field_N;
    private UsernameSuggestionListener listener;
    static String field_S;
    static int field_V;
    static int field_O;
    private ButtonWidget[] suggestionButtons;
    static int field_W;

    final void renderWidget(int param0, byte param1, int param2, int param3) {
        int var5 = 52 / ((param1 + 42) / 53);
        super.renderWidget(param0, (byte) -102, param2, param3);
        if (param0 != 0) {
          return;
        }
        BitmapFont var6 = ValidationIconWidget.field_O;
        if (this.suggestions != null) {
          var6.drawParagraph(TriangleMesh.createSuggestions, this.widgetX + param2, this.widgetY + param3, this.widgetWidth, 20, 16777215, -1, 0, 0, var6.maxDescent + var6.maxAscent);
        }
    }

    UsernameSuggestionsPanel(UsernameSuggestionListener param0) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.listener = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mp.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void setSuggestions(boolean param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        LinkButtonPainter var4 = null;
        try {
          this.children.clear((byte) 87);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.suggestions = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.suggestions[var4_int] = WidgetContainer.a(false, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new LinkButtonPainter(ValidationIconWidget.field_O, 0, 1);
            this.suggestionButtons = new ButtonWidget[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.suggestionButtons[var5] = new ButtonWidget(this.suggestions[var5], (WidgetListener) (this));
              this.suggestionButtons[var5].renderer = (WidgetPainter) ((Object) var4);
              this.suggestionButtons[var5].hoverText = ab.createSelectAlternative;
              this.suggestionButtons[var5].setWidgetBounds(80, 0, 15, false, 20 + 16 * var5);
              this.addChild(true, this.suggestionButtons[var5]);
            }
            this.suggestionButtons[var3_int] = new ButtonWidget(OptionsScreen.createMoreSuggestions, (WidgetListener) (this));
            this.suggestionButtons[var3_int].renderer = (WidgetPainter) ((Object) var4);
            this.suggestionButtons[var3_int].setWidgetBounds(100, 0, 15, param0, 20 - (-(16 * var3_int) - 16));
            this.addChild(true, this.suggestionButtons[var3_int]);
            return;
          }
          this.suggestions = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("mp.V(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean g(byte param0) {
        if (param0 >= -77) {
          UsernameSuggestionsPanel.releaseStatics(9);
        }
        return !ViewportController.field_y ? true : false;
    }

    final boolean handleKeyInput(char param0, int param1, boolean param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_7_0 = this.requestPreviousChildFocus(param3, 3);
            return stackIn_7_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_11_0 = this.requestNextChildFocus(param3, 0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("mp.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3, boolean param4, int param5, boolean param6, boolean param7, boolean param8, int param9) {
        int var11;
        var11 = Pool.field_O;
        if (param5 != 13375) {
          return;
        }
        if (!param4 && (fr.field_s != SoftwareRasterizer.width ||
          SoftwareRasterizer.height != f.field_h) && (SoftwareRasterizer.height == OpacityWidget.field_P.height &&
          OpacityWidget.field_P.width == SoftwareRasterizer.width)) {
          if (null == HighscoresScreen.field_L) {
            if (tp.field_e == null) {
              f.layoutLobbyPanels(48);
            } else {
              PoolGameModel.a(true, 0);
            }
          } else {
            PoolGameModel.a(false, 0);
          }
        }
        if (!param4) {
          RasterSnapshot.field_u = (fr.field_s - 640) / 2;
        } else {
          RasterSnapshot.field_u = StrongCacheEntry.field_I;
        }
        WidgetStyleLayer.a(param4, param5 ^ -13418);
        if (NodeHashTableIterator.field_a > 0) {
          ie.a(param4, param1, param5 - 13502, param9);
        }
        TextHotspotRegion.field_o.textInset = TimeTrialSelectScreen.field_M.textInset;
        TextHotspotRegion.field_o.horizontalAlignment = 1;
        if (PoolMatchController.field_z > 0) {
          MessageDialogContent.a(param4, param9, param1, 112);
        }
        if (nj.field_b > 0) {
          ButtonWidget.a(param8, param4, param1, -102, param9);
        }
        if (AccountWelcomePanel.field_bb &&
          HighscoresScreen.field_L.field_Nb <= HighscoresScreen.field_L.field_mc) {
          DebugTuningSlider.field_c.viewport.text = ro.gameFull;
          c.field_e.enabled = false;
          AudioService.a(DebugTuningSlider.field_c.content, (byte) 109);
        } else {
          c.field_e.enabled = true;
          DebugTuningSlider.field_c.viewport.text = null;
          HuffmanCodec.a(param7, param0, DebugTuningSlider.field_c, param9, (byte) -83);
        }
        mk.a(param3, 0, param9, param7, param6, param2, param0);
        HuffmanCodec.a(param7, param0, DualLinkDeque.field_f, param9, (byte) -83);
        MultiHandleSliderWidget.field_V = MultiHandleSliderWidget.field_V + 1;
    }

    public static void releaseStatics(int param0) {
        field_N = null;
        timerSecondsFractions = null;
        if (param0 != 160) {
          return;
        }
        field_S = null;
        field_R = null;
        field_X = null;
        field_P = null;
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, ButtonWidget param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Pool.field_O;
        try {
          if (!param0) {
            return;
          }
          for (var6_int = 0; var6_int < this.suggestions.length; var6_int++) {
            if (this.suggestionButtons[var6_int] == param3) {
              this.listener.onSuggestionSelected(this.suggestions[var6_int], 35);
            }
          }
          if (param3 == this.suggestionButtons[this.suggestions.length]) {
            this.listener.onMoreSuggestionsRequested(16777215);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("mp.P(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int param1, NineSliceFrame param2, int param3) {
        try {
          kp.field_d = param1;
          ShotRecord.field_o = param0;
          int var4_int = 87 % ((40 - param3) / 48);
          VerticalScrollbar.field_Vb = param2;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "mp.T(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_P = new int[8192];
        timerSecondsFractions = "ss.ff";
        field_R = null;
        field_X = "EXCLUSIVE";
    }
}
