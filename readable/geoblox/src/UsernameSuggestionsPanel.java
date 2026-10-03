/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameSuggestionsPanel extends WidgetContainer implements ButtonActivationListener {
    private String[] suggestions;
    private ButtonWidget[] suggestionButtons;
    private UsernameSuggestionListener suggestionListener;
    static LoginPayloadKind field_D;
    static Sprite[] avatarMouthFrames;
    static Sprite largeBoxSprite;
    static String tutorialRotationMessage;

    final static IndexedSprite a(int param0, ResourceArchive param1, int param2, boolean param3) {
        RuntimeException var4 = null;
        ResourceArchive var5 = null;
        Object stackIn_2_0 = null;
        IndexedSprite stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!mf.decodeSpritesFromArchive(param0, param2, 123, param1)) {
            stackIn_2_0 = null;
            return (IndexedSprite) (stackIn_2_0);
          }
          if (!param3) {
            var5 = (ResourceArchive) null;
            UsernameSuggestionsPanel.a(110, (ResourceArchive) null, -39, true);
          }
          stackIn_6_0 = EntityMotionSupport.buildFirstIndexedSpriteFromDecodedSheet(104);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("vh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean g(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 > -68) {
          largeBoxSprite = (Sprite) null;
        }
        stackIn_6_0 = (SpriteCheckboxRenderer.field_e != null) && (PacketBuffer.currentProtocolStage.isPostRequestStage(true));
        return stackIn_6_0;
    }

    final static String f(int param0) {
        if (param0 != 100) {
            UsernameSuggestionsPanel.f(29);
        }
        if (kd.field_b == IntrusiveDeque.field_d) {
            return ResourceArchive.field_i;
        }
        if (!EntityContactSupport.activeEmailAvailabilityQuery.isCompleted(-113)) {
            return EntityContactSupport.activeEmailAvailabilityQuery.candidateEmail(param0 + 19391);
        }
        if (WidgetSkinState.field_g == IntrusiveDeque.field_d) {
            return EntityContactSupport.activeEmailAvailabilityQuery.candidateEmail(19491);
        }
        return b.field_a;
    }

    public static void b(boolean param0) {
        avatarMouthFrames = null;
        field_D = null;
        if (!param0) {
            avatarMouthFrames = (Sprite[]) null;
        }
        tutorialRotationMessage = null;
        largeBoxSprite = null;
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        super.renderWidget(parentX, parentY, (byte) 88, renderPass);
        if (!(renderPass == 0)) {
            return;
        }
        BitmapFont var5 = DialogLayer.sharedUiFont;
        int var6 = -69 / ((1 - methodGuard) / 43);
        if (!(this.suggestions == null)) {
            var5.drawParagraph(EntityMotionSupport.createSuggestionsText, this.widgetX + parentX, parentY + this.widgetY, this.widgetWidth, 20, 16777215, -1, 0, 0, var5.maxDescent + var5.maxAscent);
        }
    }

    UsernameSuggestionsPanel(UsernameSuggestionListener suggestionListener) {
        super(0, 0, 0, 0, (WidgetRenderer) null);
        try {
            this.suggestionListener = suggestionListener;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "vh.<init>(" + (suggestionListener != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handleKeyInput(int param0, int param1, char param2, UiWidget param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 13) {
            tutorialRotationMessage = (String) null;
          }
          if (super.handleKeyInput(param0, param1 + 0, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_8_0 = this.a(7305, param3);
            return stackIn_8_0;
          }
          if (99 != param0) {
            return false;
          }
          stackIn_11_0 = this.a(param3, -110);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("vh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void onButtonActivated(int param0, byte param1, int param2, int param3, ButtonWidget param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Geoblox.clientControlFlowFlag;
        try {
          if (param1 != -20) {
            return;
          }
          for (var6_int = 0; this.suggestions.length > var6_int; var6_int++) {
            if (this.suggestionButtons[var6_int] == param4) {
              this.suggestionListener.onSuggestionSelected(this.suggestions[var6_int], 20);
            }
          }
          if (this.suggestionButtons[this.suggestions.length] == param4) {
            this.suggestionListener.onMoreSuggestionsRequested((byte) 83);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("vh.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final void setSuggestions(byte methodGuard, String[] suggestions) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        UnderlinedButtonRenderer var4 = null;
        int var6 = 0;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          this.children.clearNodes((byte) -98);
          if (methodGuard != 126) {
            return;
          }
          if ((suggestions != null) &&
              (suggestions.length != 0)) {
            var3_int = suggestions.length;
            this.suggestions = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.suggestions[var4_int] = AchievementSubmission.a((CharSequence) ((Object) suggestions[var4_int]), methodGuard - 123).replace(' ', ' ');
            }
            var4 = new UnderlinedButtonRenderer(DialogLayer.sharedUiFont, 0, 1);
            this.suggestionButtons = new ButtonWidget[var3_int + 1];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.suggestionButtons[var5] = new ButtonWidget(this.suggestions[var5], (WidgetListener) (this));
              this.suggestionButtons[var5].renderer = (WidgetRenderer) ((Object) var4);
              this.suggestionButtons[var5].hoverText = SpriteButtonRenderer.createSelectAlternativeText;
              this.suggestionButtons[var5].setWidgetBounds(15, 80, (byte) -14, var5 * 16 + 20, 0);
              this.addChild((byte) -126, this.suggestionButtons[var5]);
            }
            this.suggestionButtons[var3_int] = new ButtonWidget(GameGraphicsResources.createMoreSuggestionsText, (WidgetListener) (this));
            this.suggestionButtons[var3_int].renderer = (WidgetRenderer) ((Object) var4);
            this.suggestionButtons[var3_int].setWidgetBounds(15, 100, (byte) -59, 16 + (var3_int * 16 + 20), 0);
            this.addChild((byte) -122, this.suggestionButtons[var3_int]);
            return;
          }
          this.suggestions = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("vh.E(").append(methodGuard).append(',');
          if (suggestions == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_D = new LoginPayloadKind(0);
        tutorialRotationMessage = "Welcome to Geoblox, a game where you earn points for matching geoblox by shape or colour. Just make sure you don't allow your falling geoblox to get out of control and stack outside of the play area!<br><br>To play Geoblox, you need to rotate the play area by pressing and holding the <img=0> or <img=1> arrow keys. Press <img=2> and then experiment with left and right rotation until the next tip comes up. Press <img=2> to continue.";
    }
}
