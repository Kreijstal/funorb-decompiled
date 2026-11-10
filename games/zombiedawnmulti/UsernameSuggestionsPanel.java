/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameSuggestionsPanel extends WidgetContainer implements ButtonActivationListener {
    private ButtonWidget[] field_I;
    static String field_K;
    static MenuInputState field_H;
    private String[] field_G;
    static ScrollPaneWithFooter field_L;
    private UsernameSuggestionListener field_J;

    final static void resendPendingRequests(boolean param0, int param1) {
        int var3 = 0;
        RandomHelpers var4 = null;
        PendingIntArrayRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var4 = (RandomHelpers) (JaggrabDownloader.field_l.last(108));
          while (var4 != null) {
            LaboratoryScreen.sendStatSubmission(var4, 58, param1);
            var4 = (RandomHelpers) (JaggrabDownloader.field_l.previous(6));
          }
          if (!param0) {
            UsernameSuggestionsPanel.releaseStatics(false);
          }
          var5 = (PendingIntArrayRequest) (DisplayNamePanel.field_T.last(59));
          while (var5 != null) {
            IsaacRandom.writeResendRequest(var5, param1, -85);
            var5 = (PendingIntArrayRequest) (DisplayNamePanel.field_T.previous(6));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) var2), "gl.D(" + param0 + ',' + param1 + ')');
        }
    }

    UsernameSuggestionsPanel(UsernameSuggestionListener param0) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_J = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "gl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void setSuggestions(byte param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        LinkButtonPainter var4 = null;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 != -112) {
            this.field_G = (String[]) null;
          }
          this.field_B.clear(-30986);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_G = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_G[var4_int] = QuickChatMenu.canonicalizeNameOrEmpty((byte) 0, (CharSequence) ((Object) param1[var4_int])).replace(' ', ' ');
            }
            var4 = new LinkButtonPainter(FontPaletteHelpers.field_h, 0, 1);
            this.field_I = new ButtonWidget[var3_int + 1];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_I[var5] = new ButtonWidget(this.field_G[var5], (WidgetListener) (this));
              this.field_I[var5].painter = (WidgetPainter) ((Object) var4);
              this.field_I[var5].field_x = MessageDialogContent.field_I;
              this.field_I[var5].setWidgetBounds(0, 20 + var5 * 16, 28972, 80, 15);
              this.addChild((byte) 94, this.field_I[var5]);
            }
            this.field_I[var3_int] = new ButtonWidget(ResizableDialog.field_ab, (WidgetListener) (this));
            this.field_I[var3_int].painter = (WidgetPainter) ((Object) var4);
            this.field_I[var3_int].setWidgetBounds(0, 16 * var3_int + 16 + 20, 28972, 100, 15);
            this.addChild((byte) 55, this.field_I[var3_int]);
            return;
          }
          this.field_G = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("gl.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void renderWidget(int param0, int param1, int param2, int param3) {
        super.renderWidget(param0 ^ 0, param1, param2, param3);
        if (0 != param2) {
          return;
        }
        if (param0 != -2) {
          return;
        }
        BitmapFont var5 = FontPaletteHelpers.field_h;
        if (null != this.field_G) {
          var5.drawParagraph(CredentialKind.field_g, param3 + this.field_y, param1 + this.field_i, this.field_n, 20, 16777215, -1, 0, 0, var5.maxDescent + var5.maxAscent);
        }
    }

    final static Sprite buildFirstDecodedSprite(int param0) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        int var1 = ThreeSliceButtonPainter.field_w[0] * AppearanceScreen.field_p[0];
        byte[] var2 = MatchingTextValidator.field_t[0];
        int[] var3 = new int[var1];
        int var4_int = 0;
        if (param0 != 15) {
          field_K = (String) null;
        }
        while (var1 > var4_int) {
          var3[var4_int] = UsernameAvailabilityValidator.field_t[ScrollPane.bitAnd(255, (int) var2[var4_int])];
          var4_int++;
        }
        Sprite var4 = new Sprite(ContentTransitionDialog.field_nb, SpriteDecodeGlobals.field_a, PacketBuffer.field_i[0], PowerupCommand.field_o[0], ThreeSliceButtonPainter.field_w[0], AppearanceScreen.field_p[0], var3);
        PropObject.clearSpriteDecodeBuffers((byte) 126);
        return var4;
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          UsernameSuggestionsPanel.resendPendingRequests(true, -119);
        }
        field_H = null;
        field_L = null;
        field_K = null;
    }

    final boolean handleKeyInput(int param0, char param1, UiWidget param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_7_0 = this.focusPreviousChild((byte) -1, param2);
            return stackIn_7_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild(99, param2);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("gl.CA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, int param1, ButtonWidget param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        UiWidget var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param3 > -83) {
            var8 = (UiWidget) null;
            this.handleKeyInput(-106, '￘', (UiWidget) null, 49);
          }
          for (var6_int = 0; this.field_G.length > var6_int; var6_int++) {
            if (param2 == this.field_I[var6_int]) {
              this.field_J.onSuggestionSelected(this.field_G[var6_int], 1);
            }
          }
          if (this.field_I[this.field_G.length] == param2) {
            this.field_J.onMoreSuggestionsRequested(496);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("gl.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_K = "All players have left <%0>'s game.";
    }
}
