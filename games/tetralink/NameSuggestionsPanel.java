/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameSuggestionsPanel extends UiContainer implements ButtonActionListener {
    private UsernameSuggestionListener field_S;
    static int field_M;
    static ChatMessage[] field_L;
    static boolean field_P;
    static Archive field_N;
    static int field_O;
    private String[] field_V;
    static QuickChatCategoryCache field_U;
    private TextButton[] field_T;
    static String field_R;
    static boolean field_Q;

    final static String replaceAll(boolean param0, String param1, String param2, String param3) {
        int var5 = TetraLink.field_J;
        int var4 = param3.indexOf(param1);
        while (-1 != var4) {
          param3 = param3.substring(0, var4) + param2 + param3.substring(var4 + param1.length());
          var4 = param3.indexOf(param1, var4 + param2.length());
        }
        if (!param0) {
          ChatMessage var6 = (ChatMessage) null;
          NameSuggestionsPanel.openChatMessageContextMenu((byte) -53, (ChatMessage) null);
        }
        return param3;
    }

    NameSuggestionsPanel(UsernameSuggestionListener param0) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_S = param0;
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_U = null;
        if (param0 <= 69) {
          ChatMessage var2 = (ChatMessage) null;
          NameSuggestionsPanel.openChatMessageContextMenu((byte) 120, (ChatMessage) null);
        }
        field_R = null;
        field_L = null;
        field_N = null;
    }

    public final void onButtonActivated(byte param0, TextButton param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = TetraLink.field_J;
        try {
          if (param0 >= 0) {
            field_L = (ChatMessage[]) null;
          }
          for (var6_int = 0; var6_int < this.field_V.length; var6_int++) {
            if (param1 == this.field_T[var6_int]) {
              this.field_S.onSuggestionChosen(-118, this.field_V[var6_int]);
            }
          }
          if (this.field_T[this.field_V.length] == param1) {
            this.field_S.onMoreSuggestionsRequested(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("n.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        super.drawLayer(param0, param1, param2, param3);
        if (0 != param3) {
          return;
        }
        BitmapFont var5 = NumericDateInputWidget.field_S;
        if (null != this.field_V) {
          var5.drawParagraph(AudioPumpThread.field_c, param1 + this.field_t, param2 + this.field_w, this.field_F, 20, 16777215, -1, 0, 0, var5.field_K + var5.field_N);
        }
    }

    final void setSuggestions(int param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        LinkTextPainter var4 = null;
        int var6 = 0;
        var6 = TetraLink.field_J;
        try {
          this.field_J.clear(1);
          if (param1 != null &&
            param1.length != 0) {
            var3_int = param1.length;
            this.field_V = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_V[var4_int] = BufferedFile.canonicalizeName((CharSequence) ((Object) param1[var4_int]), (byte) 43).replace(' ', ' ');
            }
            var4 = new LinkTextPainter(NumericDateInputWidget.field_S, param0, 1);
            this.field_T = new TextButton[var3_int + 1];
            for (var5 = 0; var3_int > var5; var5++) {
              this.field_T[var5] = new TextButton(this.field_V[var5], (WidgetListener) (this));
              this.field_T[var5].field_H = (WidgetPainter) ((Object) var4);
              this.field_T[var5].field_C = LoadingResourceHelpers.field_a;
              this.field_T[var5].setBounds(15, 16 * var5 + 20, 80, 0, 80);
              this.addChild(this.field_T[var5], 10);
            }
            this.field_T[var3_int] = new TextButton(FullscreenErrorDialog.field_ab, (WidgetListener) (this));
            this.field_T[var3_int].field_H = (WidgetPainter) ((Object) var4);
            this.field_T[var3_int].setBounds(15, 16 + var3_int * 16 + 20, param0 + 73, 0, 100);
            this.addChild(this.field_T[var3_int], 10);
            return;
          }
          this.field_V = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("n.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_5_0 = this.focusPreviousChild(param3, 54);
            return stackIn_5_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(param3, 108);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("n.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void openChatMessageContextMenu(byte param0, ChatMessage param1) {
        String stackIn_2_0;
        int stackIn_2_1;
        String stackIn_2_2;
        int stackIn_2_3;
        Object stackIn_2_4;
        Object stackIn_2_5;
        long stackIn_2_6;
        UiComponent stackIn_2_7;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        PlayerContextMenu var5 = null;
        String var6 = null;
        PlayerContextMenu var7 = null;
        String var8 = null;
        PlayerContextMenu var9 = null;
        String var10 = null;
        PlayerContextMenu var11 = null;
        String var12 = null;
        PlayerContextMenu var13 = null;
        try {
          stackIn_2_0 = param1.field_n;
          stackIn_2_1 = 255;
          stackIn_2_2 = param1.field_e;
          stackIn_2_3 = param1.field_i;
          stackIn_2_4 = null;
          stackIn_2_5 = null;
          stackIn_2_6 = param1.field_r;
          stackIn_2_7 = param1.field_f;
          if (param1.field_i == 1) {
            stackIn_3_8 = param1.field_j;
          } else {
            stackIn_3_8 = 0;
          }
          LobbyPlayerEntry.openPlayerContextMenu(stackIn_2_0, stackIn_2_1, stackIn_2_2, stackIn_2_3, (ScrollPane) (stackIn_2_4), (int[]) (stackIn_2_5), stackIn_2_6, stackIn_2_7, stackIn_3_8);
          if (param1.field_i == 0 &&
            !QuickChatPhraseCache.isPublicChatInputOpen(113) &&
            null == AccountWelcomePanel.field_N &&
            null == GameKeyHandler.field_a) {
            if (!DisplayNameForm.field_K) {
              var5 = EmailAvailabilityValidator.field_s;
              var6 = ChatLayoutHelpers.field_f;
              var5.field_j.addItem(var6, 1, 14);
            }
            var7 = EmailAvailabilityValidator.field_s;
            var8 = BitPacketBuffer.field_x;
            var7.field_j.addItem(var8, 1, 20);
          }
          if (param1.field_i == 1 &&
            !QuickChatPhraseCache.isPublicChatInputOpen(param0 ^ 0) &&
            null != AccountWelcomePanel.field_N &&
            param1.field_j == AccountWelcomePanel.field_N.getGameId(param0 ^ -7)) {
            if (!DisplayNameForm.field_K) {
              var9 = EmailAvailabilityValidator.field_s;
              var10 = ChatPanelSlideHelpers.field_d;
              var9.field_j.addItem(var10, 1, 14);
            }
            var11 = EmailAvailabilityValidator.field_s;
            var12 = RasterTargetHelpers.field_d;
            var11.field_j.addItem(var12, param0 ^ 110, 20);
          }
          if (param0 != 111) {
            return;
          }
          EmailAvailabilityValidator.field_s.addLobbyGameActions((byte) 79);
          EmailAvailabilityValidator.field_s.addGameSetupMenuItems(param0 - 92, false);
          EmailAvailabilityValidator.field_s.addSocialActions(param1.field_i, param1.field_a, true);
          EmailAvailabilityValidator.field_s.addReportAbuseAction(true);
          EmailAvailabilityValidator.field_s.addChatFilterActions(param1, param0 ^ 99);
          var13 = EmailAvailabilityValidator.field_s;
          var3 = PasswordFieldPainter.field_B;
          var4 = WhirlpoolHasher.field_o;
          var13.field_j.openAt(0, var4, -73, 0, var3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("n.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    static {
    }
}
