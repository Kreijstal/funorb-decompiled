/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UsernameSuggestionsPanel extends WidgetContainer implements ButtonActivationListener {
    private String[] suggestions;
    private ButtonWidget[] suggestionButtons;
    private UsernameSuggestionListener suggestionListener;
    static LoginPayloadKind alternateLongAndTextPayloadKind;
    static Sprite[] avatarMouthFrames;
    static Sprite largeBoxSprite;
    static String tutorialRotationMessage;

    final static IndexedSprite loadFirstIndexedSprite(int fileId, ResourceArchive graphicsArchive, int groupId, boolean methodGuard) {
        RuntimeException spriteLoadFailureForContext = null;
        ResourceArchive unusedNullGraphicsArchive = null;
        Object missingSpriteResult = null;
        IndexedSprite firstIndexedSpriteBeforeReturn = null;
        RuntimeException spriteFailureBeforeContext = null;
        StringBuilder spriteMessagePrefix = null;
        String archiveDescription = null;
        RuntimeException caughtSpriteLoadFailure = null;
        try {
          if (!SpawnQuotaSupport.decodeSpritesFromArchive(fileId, groupId, 123, graphicsArchive)) {
            missingSpriteResult = null;
            return (IndexedSprite) (missingSpriteResult);
          }
          if (!methodGuard) {
            unusedNullGraphicsArchive = (ResourceArchive) null;
            UsernameSuggestionsPanel.loadFirstIndexedSprite(110, (ResourceArchive) null, -39, true);
          }
          firstIndexedSpriteBeforeReturn = EntityMotionSupport.buildFirstIndexedSpriteFromDecodedSheet(104);
          return firstIndexedSpriteBeforeReturn;
        } catch (java.lang.RuntimeException indexedSpriteLoadFailure) {
          caughtSpriteLoadFailure = indexedSpriteLoadFailure;
          spriteLoadFailureForContext = caughtSpriteLoadFailure;
          spriteFailureBeforeContext = spriteLoadFailureForContext;
          spriteMessagePrefix = new StringBuilder().append("vh.A(").append(fileId).append(',');
          if (graphicsArchive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) spriteFailureBeforeContext), ((StringBuilder) (Object) spriteMessagePrefix).append(archiveDescription).append(',').append(groupId).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static boolean isSessionSocketInPostRequestStage(int methodGuard) {
        boolean postRequestStageResult = false;
        if (methodGuard > -68) {
          largeBoxSprite = (Sprite) null;
        }
        postRequestStageResult = (SpriteCheckboxRenderer.sessionSocket != null) && (PacketBuffer.currentProtocolStage.isPostRequestStage(true));
        return postRequestStageResult;
    }

    final static String getActiveEmailOrLoginIdentifier(int methodGuard) {
        if (methodGuard != 100) {
            UsernameSuggestionsPanel.getActiveEmailOrLoginIdentifier(29);
        }
        if (ClientFlowState.accountCreationFlowState == IntrusiveDeque.pendingClientFlowToken) {
            return ResourceArchive.accountCreationEmail;
        }
        if (!EntityContactSupport.activeEmailAvailabilityQuery.isCompleted(-113)) {
            return EntityContactSupport.activeEmailAvailabilityQuery.candidateEmail(methodGuard + 19391);
        }
        if (WidgetSkinState.usernameQueryFlowState == IntrusiveDeque.pendingClientFlowToken) {
            return EntityContactSupport.activeEmailAvailabilityQuery.candidateEmail(19491);
        }
        return TextTemplateLookupSupport.currentLoginIdentifier;
    }

    public static void releaseUsernameSuggestionSharedResources(boolean methodGuard) {
        avatarMouthFrames = null;
        alternateLongAndTextPayloadKind = null;
        if (!methodGuard) {
            avatarMouthFrames = (Sprite[]) null;
        }
        tutorialRotationMessage = null;
        largeBoxSprite = null;
    }

    final void renderWidget(int parentX, int parentY, byte methodGuard, int renderPass) {
        super.renderWidget(parentX, parentY, (byte) 88, renderPass);
        if (renderPass != 0) {
            return;
        }
        BitmapFont headingFont = DialogLayer.sharedUiFont;
        int guardResidue = -69 / ((1 - methodGuard) / 43);
        if (this.suggestions != null) {
            headingFont.drawParagraph(EntityMotionSupport.createSuggestionsText, this.widgetX + parentX, parentY + this.widgetY, this.widgetWidth, 20, 16777215, -1, 0, 0, headingFont.maxDescent + headingFont.maxAscent);
        }
    }

    UsernameSuggestionsPanel(UsernameSuggestionListener suggestionListener) {
        super(0, 0, 0, 0, (WidgetRenderer) null);
        try {
            this.suggestionListener = suggestionListener;
        } catch (RuntimeException suggestionPanelConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) suggestionPanelConstructionFailure), "vh.<init>(" + (suggestionListener != null ? "{...}" : "null") + ')');
        }
    }

    final boolean handleKeyInput(int keyCode, int methodGuard, char typedCharacter, UiWidget eventContext) {
        RuntimeException keyFailureForContext = null;
        boolean previousFocusResult = false;
        boolean nextFocusResult = false;
        RuntimeException keyFailureBeforeContext = null;
        StringBuilder keyMessagePrefix = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyFailure = null;
        try {
          if (methodGuard != 13) {
            tutorialRotationMessage = (String) null;
          }
          if (super.handleKeyInput(keyCode, methodGuard + 0, typedCharacter, eventContext)) {
            return true;
          }
          if (keyCode == 98) {
            previousFocusResult = this.requestPreviousChildFocus(7305, eventContext);
            return previousFocusResult;
          }
          if (99 != keyCode) {
            return false;
          }
          nextFocusResult = this.requestNextChildFocus(eventContext, -110);
          return nextFocusResult;
        } catch (java.lang.RuntimeException keyInputFailure) {
          caughtKeyFailure = keyInputFailure;
          keyFailureForContext = caughtKeyFailure;
          keyFailureBeforeContext = keyFailureForContext;
          keyMessagePrefix = new StringBuilder().append("vh.I(").append(keyCode).append(',').append(methodGuard).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureBeforeContext), ((StringBuilder) (Object) keyMessagePrefix).append(eventContextDescription).append(')').toString());
        }
    }

    public final void onButtonActivated(int buttonX, byte methodGuard, int buttonY, int pointerButton, ButtonWidget button) {
        int suggestionIndex = 0;
        int unusedClientControlSnapshot = 0;
        RuntimeException buttonFailureBeforeContext = null;
        StringBuilder buttonMessagePrefix = null;
        String buttonDescription = null;
        RuntimeException caughtButtonFailure = null;
        RuntimeException buttonFailureForContext = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (methodGuard != -20) {
            return;
          }
          for (suggestionIndex = 0; this.suggestions.length > suggestionIndex; suggestionIndex++) {
            if (this.suggestionButtons[suggestionIndex] == button) {
              this.suggestionListener.onSuggestionSelected(this.suggestions[suggestionIndex], 20);
            }
          }
          if (this.suggestionButtons[this.suggestions.length] == button) {
            this.suggestionListener.onMoreSuggestionsRequested((byte) 83);
          }
          return;
        } catch (java.lang.RuntimeException buttonActivationFailure) {
          caughtButtonFailure = buttonActivationFailure;
          buttonFailureForContext = caughtButtonFailure;
          buttonFailureBeforeContext = buttonFailureForContext;
          buttonMessagePrefix = new StringBuilder().append("vh.Q(").append(buttonX).append(',').append(methodGuard).append(',').append(buttonY).append(',').append(pointerButton).append(',');
          if (button == null) {
            buttonDescription = "null";
          } else {
            buttonDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) buttonFailureBeforeContext), ((StringBuilder) (Object) buttonMessagePrefix).append(buttonDescription).append(')').toString());
        }
    }

    final void setSuggestions(byte methodGuard, String[] suggestions) {
        int formattedSuggestionIndex = 0;
        int buttonIndex = 0;
        RuntimeException suggestionsFailureBeforeContext = null;
        StringBuilder suggestionsMessagePrefix = null;
        String suggestionsDescription = null;
        RuntimeException caughtSuggestionsFailure = null;
        int suggestionCount = 0;
        RuntimeException suggestionsFailureForContext = null;
        UnderlinedButtonRenderer sharedSuggestionButtonRenderer = null;
        int unusedClientControlSnapshot = 0;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          this.children.clearNodes((byte) -98);
          if (methodGuard != 126) {
            return;
          }
          if (suggestions != null &&
              suggestions.length != 0) {
            suggestionCount = suggestions.length;
            this.suggestions = new String[suggestionCount];
            for (formattedSuggestionIndex = 0; suggestionCount > formattedSuggestionIndex; formattedSuggestionIndex++) {
              this.suggestions[formattedSuggestionIndex] = AchievementSubmission.canonicalizeBase37DisplayNameOrEmpty((CharSequence) ((Object) suggestions[formattedSuggestionIndex]), methodGuard - 123).replace(' ', ' ');
            }
            sharedSuggestionButtonRenderer = new UnderlinedButtonRenderer(DialogLayer.sharedUiFont, 0, 1);
            this.suggestionButtons = new ButtonWidget[suggestionCount + 1];
            for (buttonIndex = 0; buttonIndex < suggestionCount; buttonIndex++) {
              this.suggestionButtons[buttonIndex] = new ButtonWidget(this.suggestions[buttonIndex], (WidgetListener) (this));
              this.suggestionButtons[buttonIndex].renderer = (WidgetRenderer) ((Object) sharedSuggestionButtonRenderer);
              this.suggestionButtons[buttonIndex].hoverText = SpriteButtonRenderer.createSelectAlternativeText;
              this.suggestionButtons[buttonIndex].setWidgetBounds(15, 80, (byte) -14, buttonIndex * 16 + 20, 0);
              this.addChild((byte) -126, this.suggestionButtons[buttonIndex]);
            }
            this.suggestionButtons[suggestionCount] = new ButtonWidget(GameGraphicsResources.createMoreSuggestionsText, (WidgetListener) (this));
            this.suggestionButtons[suggestionCount].renderer = (WidgetRenderer) ((Object) sharedSuggestionButtonRenderer);
            this.suggestionButtons[suggestionCount].setWidgetBounds(15, 100, (byte) -59, 16 + (suggestionCount * 16 + 20), 0);
            this.addChild((byte) -122, this.suggestionButtons[suggestionCount]);
            return;
          }
          this.suggestions = null;
          return;
        } catch (java.lang.RuntimeException suggestionsUpdateFailure) {
          caughtSuggestionsFailure = suggestionsUpdateFailure;
          suggestionsFailureForContext = caughtSuggestionsFailure;
          suggestionsFailureBeforeContext = suggestionsFailureForContext;
          suggestionsMessagePrefix = new StringBuilder().append("vh.E(").append(methodGuard).append(',');
          if (suggestions == null) {
            suggestionsDescription = "null";
          } else {
            suggestionsDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) suggestionsFailureBeforeContext), ((StringBuilder) (Object) suggestionsMessagePrefix).append(suggestionsDescription).append(')').toString());
        }
    }

    static {
        alternateLongAndTextPayloadKind = new LoginPayloadKind(0);
        tutorialRotationMessage = "Welcome to Geoblox, a game where you earn points for matching geoblox by shape or colour. Just make sure you don't allow your falling geoblox to get out of control and stack outside of the play area!<br><br>To play Geoblox, you need to rotate the play area by pressing and holding the <img=0> or <img=1> arrow keys. Press <img=2> and then experiment with left and right rotation until the next tip comes up. Press <img=2> to continue.";
    }
}
