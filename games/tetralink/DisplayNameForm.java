/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayNameForm extends UiContainer implements UsernameSuggestionListener, ButtonActionListener {
    static int field_R;
    private TextButton field_T;
    private TextButton field_S;
    static String field_P;
    private ValidatedTextWidget field_N;
    static boolean field_K;
    NameSuggestionsPanel field_L;
    static String field_M;
    static int field_O;
    static int field_Q;

    final static void consumeQueuedRequestReply(int param0) {
        BitPacketBuffer var2 = null;
        PendingReplyNode var1 = (PendingReplyNode) (HighscoreRowName.field_c.first(false));
        if (var1 == null) {
          SocialTabsPanel.closeGameSocket(false);
          return;
        }
        if (param0 == -1) {
          var2 = BackgroundSparkle.field_q;
          var2.readInt(107);
          var2.readInt(40);
          var2.readInt(-110);
          var2.readInt(-119);
          var1.unlink(false);
          return;
        }
    }

    public final void onMoreSuggestionsRequested(boolean param0) {
        if (param0) {
          ((NameAvailabilityValidator) (this.field_N.getValidationSource(-108))).invalidateCachedAvailability((byte) -99);
          return;
        }
        this.field_L = (NameSuggestionsPanel) null;
        ((NameAvailabilityValidator) (this.field_N.getValidationSource(-108))).invalidateCachedAvailability((byte) -99);
    }

    public static void releaseStatics(byte param0) {
        int var1 = 30 / ((param0 + 14) / 54);
        field_M = null;
        field_P = null;
    }

    private final boolean isInputValid(ValidationSource param0, boolean param1) {
        TextValidator var3 = null;
        RuntimeException var3_ref = null;
        ValidationState var4 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param0.getValidationSource(-105);
          if (var3 == null) {
            return true;
          }
          if (!param1) {
            return true;
          }
          var4 = var3.getValidationState(-112);
          stackIn_9_0 = (PlayerContextMenu.field_a == var4);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("fn.A(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    public DisplayNameForm() {
        super(0, 0, 496, 0, (WidgetPainter) null);
        this.field_N = new ValidatedTextWidget("", (WidgetListener) null, 12);
        TextWidgetPainter var1 = new TextWidgetPainter(LruTextureCache.field_d, 0, 0, 0, 0, 16777215, -1, 3, 0, NumericDateInputWidget.field_S.field_N, -1, 2147483647, true);
        UiWidget var2 = new UiWidget(ChatMessage.field_m, var1, (WidgetListener) null);
        this.field_T = new TextButton(TooltipTextGlobals.field_b, (WidgetListener) null);
        this.field_S = new TextButton(FlaggedTextValue.field_c, (WidgetListener) null);
        this.field_N.field_C = SecondaryNodeDequeIterator.field_c;
        this.field_N.setValidationSource((byte) -59, new NameAvailabilityValidator(this.field_N));
        this.field_T.field_K = false;
        this.field_T.field_H = (WidgetPainter) ((Object) new ThreeSliceButtonPainter());
        this.field_S.field_H = (WidgetPainter) ((Object) new LinkTextPainter());
        this.field_N.field_H = (WidgetPainter) ((Object) new InsetTextPainter(10000536));
        int var3 = 20;
        int var4 = 4;
        var2.setBounds(50, var3, -118, 20, 270);
        int var5 = 200;
        this.addChild(var2, 10);
        var3 += 50;
        var3 = var3 + (this.addFieldWithHelpDefaultWidth(170, var3, FullscreenFocusCanvas.field_e, this.field_N, AccountTextGlobals.field_c, (byte) 96) + 5);
        this.field_T.setBounds(40, var3, -112, 496 - var5 >> 1, var5);
        this.field_S.setBounds(40, var3 + 15, -118, 3 + var4, 60);
        this.field_S.field_s = (WidgetListener) (this);
        this.field_T.field_s = (WidgetListener) (this);
        this.addChild(this.field_T, 10);
        this.addChild(this.field_S, 10);
        this.field_L = new NameSuggestionsPanel((UsernameSuggestionListener) (this));
        this.field_L.setBounds(150, 20, 14, this.field_N.field_t - (-this.field_N.field_F - 60), -this.field_N.field_F + (this.field_F - (this.field_N.field_t + 60)));
        this.addChild(this.field_L, 10);
        this.setBounds(var4 + (var3 + 55), 0, -123, 0, 496);
    }

    private final int addFieldWithHelpDefaultWidth(int param0, int param1, String param2, UiWidget param3, String param4, byte param5) {
        RuntimeException var7 = null;
        String var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param5 <= 56) {
            var8 = (String) null;
            DisplayNameForm.formatArchiveProgress(62, (Archive) null, (String) null, (String) null);
          }
          stackIn_3_0 = this.addFieldWithHelp(126, param0, param4, param1, 35, param3, param2);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_6_0 = var7;
          stackIn_6_1 = new StringBuilder().append("fn.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(')').toString());
        }
    }

    public final void onButtonActivated(byte param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param1 == this.field_S) {
            AccountCreationDialog.showLoginPanelWithoutMessage(11);
          } else {
            if (param1 == this.field_T) {
              this.submitName(-7721);
            }
          }
          if (param0 < 0) {
            return;
          }
          this.field_T = (TextButton) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("fn.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final int addFieldWithHelp(int param0, int param1, String param2, int param3, int param4, UiWidget param5, String param6) {
        RuntimeException var8 = null;
        ValidationMessageWidget var9 = null;
        CaptionedContainer var10 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new CaptionedContainer(20, param3, param1 + 120, 25, param5, false, 120, 3, NumericDateInputWidget.field_S, 16777215, param6);
          this.addChild(var10, 10);
          var9 = new ValidationMessageWidget(((ValidationSource) ((Object) param5)).getValidationSource(param0 - 245), param2, param0, var10.field_u + param3, 25 + param1, param4);
          var9.field_s = (WidgetListener) (this);
          this.addChild(var9, 10);
          stackIn_1_0 = var10.field_u + var9.field_u;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = var8;
          stackIn_4_1 = new StringBuilder().append("fn.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void onSuggestionChosen(int param0, String param1) {
        ValidatedTextWidget var4 = null;
        String var5 = null;
        try {
          int var3_int = -104 / ((-9 - param0) / 61);
          var4 = this.field_N;
          var5 = param1;
          ((EditableTextWidget) ((Object) var4)).setText(false, 122, var5);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "fn.N(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void configureSharedUiTheme(int param0, int param1, NineSliceFrame param2, BitmapFont param3, BitmapFont param4, boolean param5, int param6, int param7, NineSliceFrame param8, NineSliceFrame param9, int param10, int param11, int param12, int param13, int param14, int param15, int param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          FontAndFrameStyleHelpers.configureFonts(param6, param4, param3, 2);
          LobbyPlayerEntry.setMenuOptionMetrics(param16, false, param13, param1, param14);
          SecondaryNodeDeque.setPopupMenuAnchor(param0, -33, param11);
          if (!param5) {
            field_O = 3;
          }
          LoadingScreenRenderHelpers.setFrameStyles(-4968, param7, param15, param8, param2, param17);
          LobbyResourceHelpers.setLegacyMenuFrameAndPadding(param10, 1, param18, param9);
          MenuStyleHelpers.setMenuOptionColours(70, param19, param20, param12);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("fn.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param4 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param9 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    final void updatePointer(UiWidget param0, int param1, int param2, boolean param3) {
        try {
          super.updatePointer(param0, param1, param2, param3);
          this.field_T.field_K = this.canSubmit((byte) -33);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "fn.MA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void submitName(int param0) {
        boolean discarded$0 = false;
        if (!this.canSubmit((byte) -33)) {
          return;
        }
        ArchiveRequest.openLoginProgressWithMessage(-3, this.field_N.field_A);
        if (param0 != -7721) {
          ValidationSource var3 = (ValidationSource) null;
          discarded$0 = this.isInputValid((ValidationSource) null, true);
        }
    }

    private final boolean canSubmit(byte param0) {
        if (!this.isInputValid(this.field_N, true)) {
          return false;
        }
        if (param0 != -33) {
          return true;
        }
        return true;
    }

    final boolean handleKey(int param0, char param1, int param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(param0, param1, param2, param3)) {
            return true;
          }
          if (98 == param0) {
            stackIn_6_0 = this.focusPreviousChild(param3, param2 - 123);
            return stackIn_6_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_9_0 = this.focusNextChild(param3, 112);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("fn.DB(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final static String formatArchiveProgress(int param0, Archive param1, String param2, String param3) {
        RuntimeException var4 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            DisplayNameForm.releaseStatics((byte) 47);
          }
          if (!param1.ensureIndexLoaded(105)) {
            stackIn_5_0 = (String) (param2);
            return stackIn_5_0;
          }
          stackIn_7_0 = param3 + " - " + param1.getOverallProgress(22300) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("fn.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_P = "<%0> is offering an unrated rematch.";
        field_M = "Set up new unrated game";
        field_O = 500;
    }
}
