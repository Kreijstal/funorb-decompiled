/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MessageDialog extends ContentTransitionDialog implements ButtonActivationListener {
    private boolean showLoginOnDismiss;
    private boolean errorContentInstallationStarted;
    private boolean showRetryLoginOnDismiss;
    static int loginHeaderInt;
    static ClientProtocolStage awaitingLoginLongState;
    static int availableEntityCategoryCount;
    static java.awt.Canvas gameCanvas;
    static String fullscreenTimeoutText;
    private boolean retryButtonAction;
    private BitmapFont messageFont;
    static String[] quickChatShortcutKeys;
    private ProgressBarWidget dialogStatusPanel;

    static long xorLong(long left, long right) {
        return left ^ right;
    }

    public void onButtonActivated(int buttonX, byte methodGuard, int buttonY, int pointerButton, ButtonWidget button) {
        CharSequence guardedNullTextSnapshot = null;
        RuntimeException buttonFailureBeforeContext = null;
        StringBuilder buttonFailureContextBuilder = null;
        String buttonContextDescription = null;
        RuntimeException caughtButtonException = null;
        RuntimeException buttonFailure = null;
        try {
          if (methodGuard != -20) {
            guardedNullTextSnapshot = (CharSequence) null;
            MessageDialog.isSignedDecimalInt((byte) -98, (CharSequence) null);
          }
          if (!this.retryButtonAction) {
            ArchiveLoadSequence.a(NodeHashTableIterator.getActiveApplet(111), (byte) 112, "tochangedisplayname.ws");
          } else {
            MidiNote.a(3, false);
            this.dismissDialog((byte) -104);
          }
          return;
        } catch (java.lang.RuntimeException caughtButtonFailure) {
          caughtButtonException = caughtButtonFailure;
          buttonFailure = caughtButtonException;
          buttonFailureBeforeContext = buttonFailure;
          buttonFailureContextBuilder = new StringBuilder().append("f.Q(").append(buttonX).append(',').append(methodGuard).append(',').append(buttonY).append(',').append(pointerButton).append(',');
          if (button == null) {
            buttonContextDescription = "null";
          } else {
            buttonContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) buttonFailureBeforeContext), ((StringBuilder) (Object) buttonFailureContextBuilder).append(buttonContextDescription).append(')').toString());
        }
    }

    final static void showLoginForm(String prefilledUsername, String prefilledPassword, int methodGuard) {
        if (Geoblox.activeMessageDialog != null) {
            Geoblox.activeMessageDialog.dismissDialog((byte) -104);
        }
        if (methodGuard != 7697781) {
            return;
        }
        try {
            SpriteButtonRenderer.field_t = new LoginPanel(prefilledUsername, prefilledPassword, false, true, true);
            ButtonWidget.field_C.replaceContent(SpriteButtonRenderer.field_t, -81);
        } catch (RuntimeException loginFormFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loginFormFailure), "f.HA(" + (prefilledUsername != null ? "{...}" : "null") + ',' + (prefilledPassword != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    MessageDialog(DialogLayer uiRoot, BitmapFont messageFont, String messageText, boolean showRetryLoginOnDismiss, boolean showLoginOnDismiss) {
        super(uiRoot, new MessageDialogContent((MessageDialog) null, messageFont, messageText), 77, 10, 10);
        try {
            this.showLoginOnDismiss = showLoginOnDismiss ? true : false;
            this.retryButtonAction = false;
            this.errorContentInstallationStarted = false;
            this.messageFont = messageFont;
            this.showRetryLoginOnDismiss = showRetryLoginOnDismiss ? true : false;
            this.dialogStatusPanel = new ProgressBarWidget(13, 50, 274, 30, 15, 2113632, 4210752);
            this.dialogStatusPanel.animationEnabled = true;
            this.addChild((byte) -61, (UiWidget) (this.dialogStatusPanel));
        } catch (RuntimeException dialogConstructionFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) dialogConstructionFailure), "f.<init>(" + (uiRoot != null ? "{...}" : "null") + ',' + (messageFont != null ? "{...}" : "null") + ',' + (messageText != null ? "{...}" : "null") + ',' + showRetryLoginOnDismiss + ',' + showLoginOnDismiss + ')');
        }
    }

    final static void requestFullscreen(byte methodGuard) {
        if (!(InstrumentPatch.field_n == null)) {
            return;
        }
        if (methodGuard >= -48) {
            availableEntityCategoryCount = -112;
            InstrumentPatch.field_n = LoginMethod.a(480, 0, 0, -3, MenuScreen.platformTaskDispatcher, 640);
            if (null != InstrumentPatch.field_n) {
                UsernameAvailabilityQuery.a(InstrumentPatch.field_n, 57);
                return;
            }
            return;
        }
        InstrumentPatch.field_n = LoginMethod.a(480, 0, 0, -3, MenuScreen.platformTaskDispatcher, 640);
        if (null == InstrumentPatch.field_n) {
            return;
        }
        UsernameAvailabilityQuery.a(InstrumentPatch.field_n, 57);
    }

    final void dismissDialog(byte methodGuard) {
        if (!(this.dialogVisible)) {
            return;
        }
        this.dialogVisible = false;
        if (methodGuard != -104) {
            this.retryButtonAction = true;
            if (this.showRetryLoginOnDismiss) {
                LoginUiSupport.showLoginPanel((byte) -65);
                return;
            }
            if (this.showLoginOnDismiss) {
                KeyboardInputListener.b(-1);
                return;
            }
            return;
        }
        if (this.showRetryLoginOnDismiss) {
            LoginUiSupport.showLoginPanel((byte) -65);
            return;
        }
        if (!this.showLoginOnDismiss) {
            return;
        }
        KeyboardInputListener.b(-1);
    }

    final boolean handleKeyInput(int keyCode, int methodGuardOrDismissKeyCode, char typedCharacter, UiWidget eventContext) {
        RuntimeException keyInputFailure = null;
        boolean delegatedKeyInputResult = false;
        RuntimeException keyFailureBeforeContext = null;
        StringBuilder keyFailureContextBuilder = null;
        String eventContextDescription = null;
        RuntimeException caughtKeyInputException = null;
        try {
          if (keyCode != methodGuardOrDismissKeyCode) {
            delegatedKeyInputResult = super.handleKeyInput(keyCode, methodGuardOrDismissKeyCode + 0, typedCharacter, eventContext);
            return delegatedKeyInputResult;
          }
          this.dismissDialog((byte) -104);
          return true;
        } catch (java.lang.RuntimeException caughtKeyInputFailure) {
          caughtKeyInputException = caughtKeyInputFailure;
          keyInputFailure = caughtKeyInputException;
          keyFailureBeforeContext = keyInputFailure;
          keyFailureContextBuilder = new StringBuilder().append("f.I(").append(keyCode).append(',').append(methodGuardOrDismissKeyCode).append(',').append(typedCharacter).append(',');
          if (eventContext == null) {
            eventContextDescription = "null";
          } else {
            eventContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) keyFailureBeforeContext), ((StringBuilder) (Object) keyFailureContextBuilder).append(eventContextDescription).append(')').toString());
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        awaitingLoginLongState = null;
        int guardResidue = 44 % ((methodGuard + 23) / 41);
        gameCanvas = null;
        fullscreenTimeoutText = null;
        quickChatShortcutKeys = null;
    }

    final static void advanceGameplayAvatarAnimation(int blinkPeriodTicks) {
        int heldCryBeginShockTicksSnapshot = 0;
        int heldCryBeginTintTicksSnapshot = 0;
        int heldCryStartShockTicksSnapshot = 0;
        int heldCryStartTintTicksSnapshot = 0;
        int heldCryMiddleShockTicksSnapshot = 0;
        int heldCryMiddleTintTicksSnapshot = 0;
        int heldCryHoldShockTicksSnapshot = 0;
        int heldCryHoldTintTicksSnapshot = 0;
        int heldTailShockTicksSnapshot = 0;
        int heldTailTintWithoutShockSnapshot = 0;
        int heldTailTintAfterShockSnapshot = 0;
        int steeredCryBeginShockTicksSnapshot = 0;
        int steeredCryBeginTintTicksSnapshot = 0;
        int steeredCryStartShockTicksSnapshot = 0;
        int steeredCryStartTintTicksSnapshot = 0;
        int steeredCryMiddleShockTicksSnapshot = 0;
        int steeredCryMiddleTintTicksSnapshot = 0;
        int steeredCryHoldShockTicksSnapshot = 0;
        int steeredCryHoldTintTicksSnapshot = 0;
        int steeredTailShockTicksSnapshot = 0;
        int steeredTailTintWithoutShockSnapshot = 0;
        int steeredTailTintAfterShockSnapshot = 0;
        int steppedActiveShockTicksSnapshot = 0;
        int steppedActiveTintWithoutShockSnapshot = 0;
        int steppedActiveTintAfterShockSnapshot = 0;
        int steppedCryBeginShockTicksSnapshot = 0;
        int steppedCryBeginTintWithoutShockSnapshot = 0;
        int steppedCryBeginTintAfterShockSnapshot = 0;
        int steppedCryStartShockTicksSnapshot = 0;
        int steppedCryStartTintWithoutShockSnapshot = 0;
        int steppedCryStartTintAfterShockSnapshot = 0;
        int steppedCryMiddleShockTicksSnapshot = 0;
        int steppedCryMiddleTintTicksSnapshot = 0;
        int steppedCryHoldShockTicksSnapshot = 0;
        int steppedCryHoldTintTicksSnapshot = 0;
        int steppedTailShockTicksSnapshot = 0;
        int steppedTailTintWithoutShockSnapshot = 0;
        int steppedTailTintAfterShockSnapshot = 0;
        float avatarTintFadeFactor;
        int avatarFrameOffsetInSegment;
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        int frameStepTicksBeforeDecrement = CacheFileState.avatarFrameStepTicks;
        CacheFileState.avatarFrameStepTicks = CacheFileState.avatarFrameStepTicks - 1;
        if (0 <= frameStepTicksBeforeDecrement) {
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
          if (30 > IterableNodeHashTable.avatarBlinkClockTicks % blinkPeriodTicks) {
            DiskCacheWorker.avatarFeedbackFrameIndex = 0 + MenuScreen.avatarFeedbackFrameBase;
          }
          if ((UiWidget.gameplaySession.sessionEnding) &&
              (IterableNodeHashTable.avatarBlinkClockTicks % 18 == 0)) {
            if (NameCharacterSupport.avatarCryPhase == 0) {
              if (!LoginPanel.endingEntityScanClear) {
                PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor % 4;
                MatchCandidateSupport.currentAvatarCryFrame = HotspotTextWidget.avatarCryBeginFrames[PasswordValidator.avatarCryFrameCursor];
                PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
                heldCryBeginShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
                WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
                if (heldCryBeginShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
                }
                heldCryBeginTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
                MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
                if (heldCryBeginTintTicksSnapshot > 0) {
                  DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              NameCharacterSupport.avatarCryPhase = NameCharacterSupport.avatarCryPhase + 1;
              PasswordValidator.avatarCryFrameCursor = 0;
              MeshMaterial.a(300, GameSoundResources.gameSoundSamples[22], false, SocialListEntry.soundEffectVolume);
              PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
              heldCryStartShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
              WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
              if (heldCryStartShockTicksSnapshot > 0) {
                IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
              }
              heldCryStartTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
              MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
              if (heldCryStartTintTicksSnapshot > 0) {
                DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            if (NameCharacterSupport.avatarCryPhase == 1) {
              if (ClientRenderingState.avatarCryMiddleFrames.length > PasswordValidator.avatarCryFrameCursor) {
                MatchCandidateSupport.currentAvatarCryFrame = ClientRenderingState.avatarCryMiddleFrames[PasswordValidator.avatarCryFrameCursor];
                PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
                heldCryMiddleShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
                WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
                if (heldCryMiddleShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
                }
                heldCryMiddleTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
                MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
                if (heldCryMiddleTintTicksSnapshot > 0) {
                  DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              NameCharacterSupport.avatarCryPhase = NameCharacterSupport.avatarCryPhase + 1;
              LimitedRandomAccessFile.avatarFeedbackHoldTicks = 200;
              PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
              heldCryHoldShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
              WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
              if (heldCryHoldShockTicksSnapshot > 0) {
                IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
              }
              heldCryHoldTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
              MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
              if (heldCryHoldTintTicksSnapshot > 0) {
                DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor % 4;
            MatchCandidateSupport.currentAvatarCryFrame = PlayfieldRules.avatarCryEndFrames[PasswordValidator.avatarCryFrameCursor];
            PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
          }
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          heldTailShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (heldTailShockTicksSnapshot <= 0) {
            heldTailTintWithoutShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (heldTailTintWithoutShockSnapshot <= 0) {
              return;
            }
            DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
            return;
          }
          IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          heldTailTintAfterShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (heldTailTintAfterShockSnapshot > 0) {
            DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
          }
          return;
        }
        CacheFileState.avatarFrameStepTicks = 20;
        if (DiskCacheWorker.avatarFeedbackFrameIndex == MenuScreen.avatarFeedbackFrameBase + 0) {
          DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 3;
        } else {
          avatarFrameOffsetInSegment = -MenuScreen.avatarFeedbackFrameBase + DiskCacheWorker.avatarFeedbackFrameIndex;
          if (1 != FullscreenSupport.avatarSteeringDirectionId) {
            if ((2 == FullscreenSupport.avatarSteeringDirectionId) &&
                (5 > avatarFrameOffsetInSegment)) {
              DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
            } else {
              if (0 == FullscreenSupport.avatarSteeringDirectionId) {
                if (avatarFrameOffsetInSegment < 3) {
                  DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
                } else {
                  if ((0 == FullscreenSupport.avatarSteeringDirectionId) &&
                      (3 < avatarFrameOffsetInSegment)) {
                    DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                  }
                }
              } else {
                if ((0 == FullscreenSupport.avatarSteeringDirectionId) &&
                    (3 < avatarFrameOffsetInSegment)) {
                  DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                }
              }
            }
            LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
            IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
            if (30 > IterableNodeHashTable.avatarBlinkClockTicks % blinkPeriodTicks) {
              DiskCacheWorker.avatarFeedbackFrameIndex = 0 + MenuScreen.avatarFeedbackFrameBase;
            }
            if ((UiWidget.gameplaySession.sessionEnding) &&
                (IterableNodeHashTable.avatarBlinkClockTicks % 18 == 0)) {
              if (NameCharacterSupport.avatarCryPhase == 0) {
                if (!LoginPanel.endingEntityScanClear) {
                  PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor % 4;
                  MatchCandidateSupport.currentAvatarCryFrame = HotspotTextWidget.avatarCryBeginFrames[PasswordValidator.avatarCryFrameCursor];
                  PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
                  avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
                  steeredCryBeginShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
                  WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
                  if (steeredCryBeginShockTicksSnapshot > 0) {
                    IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
                  }
                  steeredCryBeginTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
                  MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
                  if (steeredCryBeginTintTicksSnapshot > 0) {
                    DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
                  }
                  return;
                }
                NameCharacterSupport.avatarCryPhase = NameCharacterSupport.avatarCryPhase + 1;
                PasswordValidator.avatarCryFrameCursor = 0;
                MeshMaterial.a(300, GameSoundResources.gameSoundSamples[22], false, SocialListEntry.soundEffectVolume);
                PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
                steeredCryStartShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
                WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
                if (steeredCryStartShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
                }
                steeredCryStartTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
                MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
                if (steeredCryStartTintTicksSnapshot > 0) {
                  DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              if (NameCharacterSupport.avatarCryPhase == 1) {
                if (ClientRenderingState.avatarCryMiddleFrames.length > PasswordValidator.avatarCryFrameCursor) {
                  MatchCandidateSupport.currentAvatarCryFrame = ClientRenderingState.avatarCryMiddleFrames[PasswordValidator.avatarCryFrameCursor];
                  PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
                  avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
                  steeredCryMiddleShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
                  WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
                  if (steeredCryMiddleShockTicksSnapshot > 0) {
                    IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
                  }
                  steeredCryMiddleTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
                  MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
                  if (steeredCryMiddleTintTicksSnapshot > 0) {
                    DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
                  }
                  return;
                }
                NameCharacterSupport.avatarCryPhase = NameCharacterSupport.avatarCryPhase + 1;
                LimitedRandomAccessFile.avatarFeedbackHoldTicks = 200;
                PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
                steeredCryHoldShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
                WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
                if (steeredCryHoldShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
                }
                steeredCryHoldTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
                MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
                if (steeredCryHoldTintTicksSnapshot > 0) {
                  DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor % 4;
              MatchCandidateSupport.currentAvatarCryFrame = PlayfieldRules.avatarCryEndFrames[PasswordValidator.avatarCryFrameCursor];
              PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
            }
            avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
            steeredTailShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
            WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
            if (steeredTailShockTicksSnapshot <= 0) {
              steeredTailTintWithoutShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
              MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
              if (steeredTailTintWithoutShockSnapshot <= 0) {
                return;
              }
              DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
              return;
            }
            IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
            steeredTailTintAfterShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (steeredTailTintAfterShockSnapshot > 0) {
              DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
            }
            return;
          }
          if (avatarFrameOffsetInSegment <= 1) {
            if ((2 == FullscreenSupport.avatarSteeringDirectionId) &&
                (5 > avatarFrameOffsetInSegment)) {
              DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
            } else {
              if (0 == FullscreenSupport.avatarSteeringDirectionId) {
                if (avatarFrameOffsetInSegment < 3) {
                  DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
                } else {
                  if ((0 == FullscreenSupport.avatarSteeringDirectionId) &&
                      (3 < avatarFrameOffsetInSegment)) {
                    DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                  }
                }
              } else {
                if ((0 == FullscreenSupport.avatarSteeringDirectionId) &&
                    (3 < avatarFrameOffsetInSegment)) {
                  DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                }
              }
            }
          } else {
            DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
          }
        }
        LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
        IterableNodeHashTable.avatarBlinkClockTicks = IterableNodeHashTable.avatarBlinkClockTicks + 1;
        if (30 > IterableNodeHashTable.avatarBlinkClockTicks % blinkPeriodTicks) {
          DiskCacheWorker.avatarFeedbackFrameIndex = 0 + MenuScreen.avatarFeedbackFrameBase;
        }
        if (!UiWidget.gameplaySession.sessionEnding) {
          avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
          steppedActiveShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
          WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
          if (steppedActiveShockTicksSnapshot <= 0) {
            steppedActiveTintWithoutShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (steppedActiveTintWithoutShockSnapshot <= 0) {
              return;
            }
            DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
            return;
          }
          IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
          steppedActiveTintAfterShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (steppedActiveTintAfterShockSnapshot <= 0) {
            return;
          }
          DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
          return;
        }
        if (IterableNodeHashTable.avatarBlinkClockTicks % 18 == 0) {
          if (NameCharacterSupport.avatarCryPhase == 0) {
            if (!LoginPanel.endingEntityScanClear) {
              PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor % 4;
              MatchCandidateSupport.currentAvatarCryFrame = HotspotTextWidget.avatarCryBeginFrames[PasswordValidator.avatarCryFrameCursor];
              PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
              steppedCryBeginShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
              WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
              if (steppedCryBeginShockTicksSnapshot <= 0) {
                steppedCryBeginTintWithoutShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
                MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
                if (steppedCryBeginTintWithoutShockSnapshot <= 0) {
                  return;
                }
                DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
                return;
              }
              IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
              steppedCryBeginTintAfterShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
              MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
              if (steppedCryBeginTintAfterShockSnapshot <= 0) {
                return;
              }
              DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
              return;
            }
            NameCharacterSupport.avatarCryPhase = NameCharacterSupport.avatarCryPhase + 1;
            PasswordValidator.avatarCryFrameCursor = 0;
            MeshMaterial.a(300, GameSoundResources.gameSoundSamples[22], false, SocialListEntry.soundEffectVolume);
            PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
            avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
            steppedCryStartShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
            WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
            if (steppedCryStartShockTicksSnapshot <= 0) {
              steppedCryStartTintWithoutShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
              MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
              if (steppedCryStartTintWithoutShockSnapshot <= 0) {
                return;
              }
              DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
              return;
            }
            IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
            steppedCryStartTintAfterShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (steppedCryStartTintAfterShockSnapshot > 0) {
              DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
            }
            return;
          }
          if (NameCharacterSupport.avatarCryPhase == 1) {
            if (ClientRenderingState.avatarCryMiddleFrames.length > PasswordValidator.avatarCryFrameCursor) {
              MatchCandidateSupport.currentAvatarCryFrame = ClientRenderingState.avatarCryMiddleFrames[PasswordValidator.avatarCryFrameCursor];
              PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
              steppedCryMiddleShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
              WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
              if (steppedCryMiddleShockTicksSnapshot > 0) {
                IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
              }
              steppedCryMiddleTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
              MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
              if (steppedCryMiddleTintTicksSnapshot > 0) {
                DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            NameCharacterSupport.avatarCryPhase = NameCharacterSupport.avatarCryPhase + 1;
            LimitedRandomAccessFile.avatarFeedbackHoldTicks = 200;
            PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
            avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
            steppedCryHoldShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
            WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
            if (steppedCryHoldShockTicksSnapshot > 0) {
              IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
            }
            steppedCryHoldTintTicksSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
            MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
            if (steppedCryHoldTintTicksSnapshot <= 0) {
              return;
            }
            DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
            return;
          }
          PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor % 4;
          MatchCandidateSupport.currentAvatarCryFrame = PlayfieldRules.avatarCryEndFrames[PasswordValidator.avatarCryFrameCursor];
          PasswordValidator.avatarCryFrameCursor = PasswordValidator.avatarCryFrameCursor + 1;
        }
        avatarTintFadeFactor = (float)(50 - MultiHandleSliderRenderer.avatarTintFadeTicks) * 0.0066999997943639755f;
        steppedTailShockTicksSnapshot = WidgetTheme.avatarShockEffectTicks;
        WidgetTheme.avatarShockEffectTicks = WidgetTheme.avatarShockEffectTicks - 1;
        if (steppedTailShockTicksSnapshot <= 0) {
          steppedTailTintWithoutShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
          MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
          if (steppedTailTintWithoutShockSnapshot <= 0) {
            return;
          }
          DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
          return;
        }
        IndexedSpriteState.avatarShockFrameIndex = WidgetTheme.avatarShockEffectTicks % 15 % 2;
        steppedTailTintAfterShockSnapshot = MultiHandleSliderRenderer.avatarTintFadeTicks;
        MultiHandleSliderRenderer.avatarTintFadeTicks = MultiHandleSliderRenderer.avatarTintFadeTicks - 1;
        if (steppedTailTintAfterShockSnapshot <= 0) {
          return;
        }
        DisplayModeInfo.avatarTintColor = ((int)(GmtTimestampSupport.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (AccountCreationDialog.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(UsernameAvailabilityValidator.avatarTintBlueDelta * avatarTintFadeFactor));
        return;
    }

    final static WidgetTheme getSharedUiStyle(int methodGuard) {
        if (null == DiskCacheWorker.field_f) {
            DiskCacheWorker.field_f = new WidgetTheme();
            DiskCacheWorker.field_f.initializeRenderers(9, DialogLayer.sharedUiFont);
            DiskCacheWorker.field_f.field_h = 14;
            DiskCacheWorker.field_f.tooltipBackgroundColor = 2763306;
            DiskCacheWorker.field_f.field_d = 6;
            DiskCacheWorker.field_f.field_n = 7697781;
            DiskCacheWorker.field_f.field_e = 5;
            DiskCacheWorker.field_f.field_i = 0;
            DiskCacheWorker.field_f.field_p = 4;
            DiskCacheWorker.field_f.tooltipFont = UiFontResources.commonUiSmallFont;
            if (methodGuard >= 71) {
                return DiskCacheWorker.field_f;
            }
            return (WidgetTheme) null;
        }
        if (methodGuard >= 71) {
            return DiskCacheWorker.field_f;
        }
        return (WidgetTheme) null;
    }

    final void installErrorContent(int errorKind, int methodGuard, String messageText) {
        boolean retryButtonActionValue = false;
        MessageDialogContent buttonTextContentSnapshot = null;
        String retryOrBackButtonText = null;
        RuntimeException errorContentFailureBeforeContext = null;
        StringBuilder errorContentFailureContextBuilder = null;
        String messageContextDescription = null;
        RuntimeException caughtErrorContentException = null;
        RuntimeException errorContentFailure = null;
        int clientControlFlowSnapshot = 0;
        MessageDialogContent errorTextContent = null;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if (this.errorContentInstallationStarted) {
            return;
          }
          if (methodGuard != 19810) {
            return;
          }
          if (256 != errorKind) {
            retryButtonActionValue = false;
          } else {
            retryButtonActionValue = true;
          }
          ((MessageDialog) (this)).retryButtonAction = retryButtonActionValue;
          this.errorContentInstallationStarted = true;
          this.dialogStatusPanel.setStripeColors(4210752, 8405024, (byte) -103);
          errorTextContent = new MessageDialogContent((MessageDialog) (this), this.messageFont, messageText);
          if (errorKind == 5) {
            errorTextContent.appendActionButton(TriangleMesh.reloadGameText, 1, 11);
            errorTextContent.appendActionButton(DisplayModeInfo.quitToWebsiteText, 1, 17);
          } else {
            if (errorKind != 256) {
              buttonTextContentSnapshot = errorTextContent;
              if (this.showRetryLoginOnDismiss) {
                retryOrBackButtonText = BoardEntityState.retryText;
              } else {
                retryOrBackButtonText = GameGraphicsResources.backText;
              }
              ((MessageDialogContent) (Object) buttonTextContentSnapshot).appendActionButton(retryOrBackButtonText, 1, -1);
            } else {
              errorTextContent.appendButton(-2, BoardEntityState.retryText, (WidgetListener) (this));
            }
          }
          if (errorKind == 3) {
            errorTextContent.appendActionButton(WidgetContainer.toServerListText, methodGuard ^ 19811, 7);
          } else {
            if (errorKind != 4) {
              if (errorKind == 6) {
                errorTextContent.appendActionButton(AvatarFeedbackSupport.toCustomerSupportText, 1, 9);
              } else {
                if (errorKind != 9) {
                  this.replaceContent(errorTextContent, methodGuard ^ -19736);
                  return;
                }
                errorTextContent.appendButton(-2, IntrusiveNodeHashTable.changeDisplayNameText, (WidgetListener) (this));
              }
            } else {
              errorTextContent.appendActionButton(DialRenderer.playFreeVersionText, 1, 8);
            }
          }
          this.replaceContent(errorTextContent, methodGuard ^ -19736);
          return;
        } catch (java.lang.RuntimeException caughtErrorContentFailure) {
          caughtErrorContentException = caughtErrorContentFailure;
          errorContentFailure = caughtErrorContentException;
          errorContentFailureBeforeContext = errorContentFailure;
          errorContentFailureContextBuilder = new StringBuilder().append("f.KA(").append(errorKind).append(',').append(methodGuard).append(',');
          if (messageText == null) {
            messageContextDescription = "null";
          } else {
            messageContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) errorContentFailureBeforeContext), ((StringBuilder) (Object) errorContentFailureContextBuilder).append(messageContextDescription).append(')').toString());
        }
    }

    final static boolean isSignedDecimalInt(byte methodGuard, CharSequence text) {
        RuntimeException decimalValidationFailure = null;
        boolean decimalValidationResult = false;
        RuntimeException decimalFailureBeforeContext = null;
        StringBuilder decimalFailureContextBuilder = null;
        String textContextDescription = null;
        RuntimeException caughtDecimalValidationException = null;
        try {
          if (methodGuard >= -111) {
            quickChatShortcutKeys = (String[]) null;
          }
          decimalValidationResult = LimitedRandomAccessFile.a(text, true, 10, 87);
          return decimalValidationResult;
        } catch (java.lang.RuntimeException caughtDecimalValidationFailure) {
          caughtDecimalValidationException = caughtDecimalValidationFailure;
          decimalValidationFailure = caughtDecimalValidationException;
          decimalFailureBeforeContext = decimalValidationFailure;
          decimalFailureContextBuilder = new StringBuilder().append("f.JA(").append(methodGuard).append(',');
          if (text == null) {
            textContextDescription = "null";
          } else {
            textContextDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decimalFailureBeforeContext), ((StringBuilder) (Object) decimalFailureContextBuilder).append(textContextDescription).append(')').toString());
        }
    }

    final void showConnectionRestoredContent(boolean clearCanvasGuard) {
        MessageDialogContent restoredTextContent = null;
        this.dialogStatusPanel.setStripeColors(4210752, 2121792, (byte) -103);
        if (!clearCanvasGuard) {
            restoredTextContent = new MessageDialogContent((MessageDialog) (this), this.messageFont, ResizableDialog.connectionRestoredText);
            restoredTextContent.appendActionButton(FullscreenSupport.returnToGameText, 1, 15);
            this.replaceContent(restoredTextContent, -23);
            return;
        }
        gameCanvas = (java.awt.Canvas) null;
        restoredTextContent = new MessageDialogContent((MessageDialog) (this), this.messageFont, ResizableDialog.connectionRestoredText);
        restoredTextContent.appendActionButton(FullscreenSupport.returnToGameText, 1, 15);
        this.replaceContent(restoredTextContent, -23);
    }

    static {
        awaitingLoginLongState = new ClientProtocolStage();
        quickChatShortcutKeys = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        fullscreenTimeoutText = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
