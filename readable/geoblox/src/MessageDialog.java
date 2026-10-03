/*
 * Decompiled by CFR-JS 0.4.0.
 */
class MessageDialog extends ContentTransitionDialog implements ButtonActivationListener {
    private boolean showLoginOnDismiss;
    private boolean errorContentInstallationStarted;
    private boolean showRetryLoginOnDismiss;
    static int loginHeaderInt;
    static gk awaitingLoginLongState;
    static int availableEntityCategoryCount;
    static java.awt.Canvas gameCanvas;
    static String fullscreenTimeoutText;
    private boolean retryButtonAction;
    private BitmapFont messageFont;
    static String[] quickChatShortcutKeys;
    private hl dialogStatusPanel;

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
            eb.a(k.c(111), (byte) 112, "tochangedisplayname.ws");
          } else {
            pc.a(3, false);
            this.dismissDialog((byte) -104);
          }
          return;
        } catch (java.lang.RuntimeException caughtButtonFailure) {
          caughtButtonException = caughtButtonFailure;
          buttonFailure = caughtButtonException;
          buttonFailureBeforeContext = (RuntimeException) (buttonFailure);
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
            ml.field_t = new pf(prefilledUsername, prefilledPassword, false, true, true);
            ButtonWidget.field_C.replaceContent(ml.field_t, -81);
        } catch (RuntimeException loginFormFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loginFormFailure), "f.HA(" + (prefilledUsername != null ? "{...}" : "null") + ',' + (prefilledPassword != null ? "{...}" : "null") + ',' + methodGuard + ')');
        }
    }

    MessageDialog(DialogLayer uiRoot, BitmapFont messageFont, String messageText, boolean showRetryLoginOnDismiss, boolean showLoginOnDismiss) {
        super(uiRoot, new ni((MessageDialog) null, messageFont, messageText), 77, 10, 10);
        try {
            this.showLoginOnDismiss = showLoginOnDismiss ? true : false;
            this.retryButtonAction = false;
            this.errorContentInstallationStarted = false;
            this.messageFont = messageFont;
            this.showRetryLoginOnDismiss = showRetryLoginOnDismiss ? true : false;
            this.dialogStatusPanel = new hl(13, 50, 274, 30, 15, 2113632, 4210752);
            this.dialogStatusPanel.field_C = true;
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
            InstrumentPatch.field_n = od.a(480, 0, 0, -3, MenuScreen.platformTaskDispatcher, 640);
            if (null != InstrumentPatch.field_n) {
                sl.a(InstrumentPatch.field_n, 57);
                return;
            }
            return;
        }
        InstrumentPatch.field_n = od.a(480, 0, 0, -3, MenuScreen.platformTaskDispatcher, 640);
        if (null == InstrumentPatch.field_n) {
            return;
        }
        sl.a(InstrumentPatch.field_n, 57);
    }

    final void dismissDialog(byte methodGuard) {
        if (!(this.dialogVisible)) {
            return;
        }
        this.dialogVisible = false;
        if (methodGuard != -104) {
            this.retryButtonAction = true;
            if (this.showRetryLoginOnDismiss) {
                tj.b((byte) -65);
                return;
            }
            if (this.showLoginOnDismiss) {
                KeyboardInputListener.b(-1);
                return;
            }
            return;
        }
        if (this.showRetryLoginOnDismiss) {
            tj.b((byte) -65);
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
          keyFailureBeforeContext = (RuntimeException) (keyInputFailure);
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
        int frameStepTicksBeforeDecrement = af.avatarFrameStepTicks;
        af.avatarFrameStepTicks = af.avatarFrameStepTicks - 1;
        if (0 <= frameStepTicksBeforeDecrement) {
          LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
          gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
          if (30 > gi.avatarBlinkClockTicks % blinkPeriodTicks) {
            DiskCacheWorker.avatarFeedbackFrameIndex = 0 + MenuScreen.avatarFeedbackFrameBase;
          }
          if ((UiWidget.gameplaySession.sessionEnding) &&
              (gi.avatarBlinkClockTicks % 18 == 0)) {
            if (gg.avatarCryPhase == 0) {
              if (!pf.endingEntityScanClear) {
                g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
                ul.currentAvatarCryFrame = vf.avatarCryBeginFrames[g.avatarCryFrameCursor];
                g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                heldCryBeginShockTicksSnapshot = wa.avatarShockEffectTicks;
                wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                if (heldCryBeginShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                }
                heldCryBeginTintTicksSnapshot = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (heldCryBeginTintTicksSnapshot > 0) {
                  rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              gg.avatarCryPhase = gg.avatarCryPhase + 1;
              g.avatarCryFrameCursor = 0;
              MeshMaterial.a(300, fl.field_c[22], false, j.field_gb);
              g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              heldCryStartShockTicksSnapshot = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (heldCryStartShockTicksSnapshot > 0) {
                IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              }
              heldCryStartTintTicksSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (heldCryStartTintTicksSnapshot > 0) {
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            if (gg.avatarCryPhase == 1) {
              if (ok.avatarCryMiddleFrames.length > g.avatarCryFrameCursor) {
                ul.currentAvatarCryFrame = ok.avatarCryMiddleFrames[g.avatarCryFrameCursor];
                g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                heldCryMiddleShockTicksSnapshot = wa.avatarShockEffectTicks;
                wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                if (heldCryMiddleShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                }
                heldCryMiddleTintTicksSnapshot = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (heldCryMiddleTintTicksSnapshot > 0) {
                  rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              gg.avatarCryPhase = gg.avatarCryPhase + 1;
              LimitedRandomAccessFile.avatarFeedbackHoldTicks = 200;
              g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              heldCryHoldShockTicksSnapshot = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (heldCryHoldShockTicksSnapshot > 0) {
                IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              }
              heldCryHoldTintTicksSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (heldCryHoldTintTicksSnapshot > 0) {
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
            ul.currentAvatarCryFrame = ld.avatarCryEndFrames[g.avatarCryFrameCursor];
            g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
          }
          avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
          heldTailShockTicksSnapshot = wa.avatarShockEffectTicks;
          wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
          if (heldTailShockTicksSnapshot <= 0) {
            heldTailTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
            jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
            if (heldTailTintWithoutShockSnapshot <= 0) {
              return;
            }
            rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
            return;
          }
          IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
          heldTailTintAfterShockSnapshot = jf.avatarTintFadeTicks;
          jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
          if (heldTailTintAfterShockSnapshot > 0) {
            rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
          }
          return;
        }
        af.avatarFrameStepTicks = 20;
        if (DiskCacheWorker.avatarFeedbackFrameIndex == MenuScreen.avatarFeedbackFrameBase + 0) {
          DiskCacheWorker.avatarFeedbackFrameIndex = MenuScreen.avatarFeedbackFrameBase + 3;
        } else {
          avatarFrameOffsetInSegment = -MenuScreen.avatarFeedbackFrameBase + DiskCacheWorker.avatarFeedbackFrameIndex;
          if (1 != jk.avatarSteeringDirectionId) {
            if ((2 == jk.avatarSteeringDirectionId) &&
                (5 > avatarFrameOffsetInSegment)) {
              DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
            } else {
              if (0 == jk.avatarSteeringDirectionId) {
                if (avatarFrameOffsetInSegment < 3) {
                  DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
                } else {
                  if ((0 == jk.avatarSteeringDirectionId) &&
                      (3 < avatarFrameOffsetInSegment)) {
                    DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                  }
                }
              } else {
                if ((0 == jk.avatarSteeringDirectionId) &&
                    (3 < avatarFrameOffsetInSegment)) {
                  DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                }
              }
            }
            LimitedRandomAccessFile.avatarFeedbackHoldTicks = LimitedRandomAccessFile.avatarFeedbackHoldTicks - 1;
            gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
            if (30 > gi.avatarBlinkClockTicks % blinkPeriodTicks) {
              DiskCacheWorker.avatarFeedbackFrameIndex = 0 + MenuScreen.avatarFeedbackFrameBase;
            }
            if ((UiWidget.gameplaySession.sessionEnding) &&
                (gi.avatarBlinkClockTicks % 18 == 0)) {
              if (gg.avatarCryPhase == 0) {
                if (!pf.endingEntityScanClear) {
                  g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
                  ul.currentAvatarCryFrame = vf.avatarCryBeginFrames[g.avatarCryFrameCursor];
                  g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                  avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                  steeredCryBeginShockTicksSnapshot = wa.avatarShockEffectTicks;
                  wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                  if (steeredCryBeginShockTicksSnapshot > 0) {
                    IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                  }
                  steeredCryBeginTintTicksSnapshot = jf.avatarTintFadeTicks;
                  jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                  if (steeredCryBeginTintTicksSnapshot > 0) {
                    rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                  }
                  return;
                }
                gg.avatarCryPhase = gg.avatarCryPhase + 1;
                g.avatarCryFrameCursor = 0;
                MeshMaterial.a(300, fl.field_c[22], false, j.field_gb);
                g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                steeredCryStartShockTicksSnapshot = wa.avatarShockEffectTicks;
                wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                if (steeredCryStartShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                }
                steeredCryStartTintTicksSnapshot = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (steeredCryStartTintTicksSnapshot > 0) {
                  rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              if (gg.avatarCryPhase == 1) {
                if (ok.avatarCryMiddleFrames.length > g.avatarCryFrameCursor) {
                  ul.currentAvatarCryFrame = ok.avatarCryMiddleFrames[g.avatarCryFrameCursor];
                  g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                  avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                  steeredCryMiddleShockTicksSnapshot = wa.avatarShockEffectTicks;
                  wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                  if (steeredCryMiddleShockTicksSnapshot > 0) {
                    IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                  }
                  steeredCryMiddleTintTicksSnapshot = jf.avatarTintFadeTicks;
                  jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                  if (steeredCryMiddleTintTicksSnapshot > 0) {
                    rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                  }
                  return;
                }
                gg.avatarCryPhase = gg.avatarCryPhase + 1;
                LimitedRandomAccessFile.avatarFeedbackHoldTicks = 200;
                g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
                avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
                steeredCryHoldShockTicksSnapshot = wa.avatarShockEffectTicks;
                wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
                if (steeredCryHoldShockTicksSnapshot > 0) {
                  IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
                }
                steeredCryHoldTintTicksSnapshot = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (steeredCryHoldTintTicksSnapshot > 0) {
                  rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                }
                return;
              }
              g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
              ul.currentAvatarCryFrame = ld.avatarCryEndFrames[g.avatarCryFrameCursor];
              g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
            }
            avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
            steeredTailShockTicksSnapshot = wa.avatarShockEffectTicks;
            wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
            if (steeredTailShockTicksSnapshot <= 0) {
              steeredTailTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (steeredTailTintWithoutShockSnapshot <= 0) {
                return;
              }
              rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              return;
            }
            IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
            steeredTailTintAfterShockSnapshot = jf.avatarTintFadeTicks;
            jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
            if (steeredTailTintAfterShockSnapshot > 0) {
              rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
            }
            return;
          }
          if (avatarFrameOffsetInSegment <= 1) {
            if ((2 == jk.avatarSteeringDirectionId) &&
                (5 > avatarFrameOffsetInSegment)) {
              DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
            } else {
              if (0 == jk.avatarSteeringDirectionId) {
                if (avatarFrameOffsetInSegment < 3) {
                  DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex + 1;
                } else {
                  if ((0 == jk.avatarSteeringDirectionId) &&
                      (3 < avatarFrameOffsetInSegment)) {
                    DiskCacheWorker.avatarFeedbackFrameIndex = DiskCacheWorker.avatarFeedbackFrameIndex - 1;
                  }
                }
              } else {
                if ((0 == jk.avatarSteeringDirectionId) &&
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
        gi.avatarBlinkClockTicks = gi.avatarBlinkClockTicks + 1;
        if (30 > gi.avatarBlinkClockTicks % blinkPeriodTicks) {
          DiskCacheWorker.avatarFeedbackFrameIndex = 0 + MenuScreen.avatarFeedbackFrameBase;
        }
        if (!UiWidget.gameplaySession.sessionEnding) {
          avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
          steppedActiveShockTicksSnapshot = wa.avatarShockEffectTicks;
          wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
          if (steppedActiveShockTicksSnapshot <= 0) {
            steppedActiveTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
            jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
            if (steppedActiveTintWithoutShockSnapshot <= 0) {
              return;
            }
            rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
            return;
          }
          IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
          steppedActiveTintAfterShockSnapshot = jf.avatarTintFadeTicks;
          jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
          if (steppedActiveTintAfterShockSnapshot <= 0) {
            return;
          }
          rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
          return;
        }
        if (gi.avatarBlinkClockTicks % 18 == 0) {
          if (gg.avatarCryPhase == 0) {
            if (!pf.endingEntityScanClear) {
              g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
              ul.currentAvatarCryFrame = vf.avatarCryBeginFrames[g.avatarCryFrameCursor];
              g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              steppedCryBeginShockTicksSnapshot = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (steppedCryBeginShockTicksSnapshot <= 0) {
                steppedCryBeginTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
                jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
                if (steppedCryBeginTintWithoutShockSnapshot <= 0) {
                  return;
                }
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
                return;
              }
              IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              steppedCryBeginTintAfterShockSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (steppedCryBeginTintAfterShockSnapshot <= 0) {
                return;
              }
              rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              return;
            }
            gg.avatarCryPhase = gg.avatarCryPhase + 1;
            g.avatarCryFrameCursor = 0;
            MeshMaterial.a(300, fl.field_c[22], false, j.field_gb);
            g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
            avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
            steppedCryStartShockTicksSnapshot = wa.avatarShockEffectTicks;
            wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
            if (steppedCryStartShockTicksSnapshot <= 0) {
              steppedCryStartTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (steppedCryStartTintWithoutShockSnapshot <= 0) {
                return;
              }
              rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              return;
            }
            IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
            steppedCryStartTintAfterShockSnapshot = jf.avatarTintFadeTicks;
            jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
            if (steppedCryStartTintAfterShockSnapshot > 0) {
              rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
            }
            return;
          }
          if (gg.avatarCryPhase == 1) {
            if (ok.avatarCryMiddleFrames.length > g.avatarCryFrameCursor) {
              ul.currentAvatarCryFrame = ok.avatarCryMiddleFrames[g.avatarCryFrameCursor];
              g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
              avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
              steppedCryMiddleShockTicksSnapshot = wa.avatarShockEffectTicks;
              wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
              if (steppedCryMiddleShockTicksSnapshot > 0) {
                IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
              }
              steppedCryMiddleTintTicksSnapshot = jf.avatarTintFadeTicks;
              jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
              if (steppedCryMiddleTintTicksSnapshot > 0) {
                rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
              }
              return;
            }
            gg.avatarCryPhase = gg.avatarCryPhase + 1;
            LimitedRandomAccessFile.avatarFeedbackHoldTicks = 200;
            g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
            avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
            steppedCryHoldShockTicksSnapshot = wa.avatarShockEffectTicks;
            wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
            if (steppedCryHoldShockTicksSnapshot > 0) {
              IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
            }
            steppedCryHoldTintTicksSnapshot = jf.avatarTintFadeTicks;
            jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
            if (steppedCryHoldTintTicksSnapshot <= 0) {
              return;
            }
            rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
            return;
          }
          g.avatarCryFrameCursor = g.avatarCryFrameCursor % 4;
          ul.currentAvatarCryFrame = ld.avatarCryEndFrames[g.avatarCryFrameCursor];
          g.avatarCryFrameCursor = g.avatarCryFrameCursor + 1;
        }
        avatarTintFadeFactor = (float)(50 - jf.avatarTintFadeTicks) * 0.0066999997943639755f;
        steppedTailShockTicksSnapshot = wa.avatarShockEffectTicks;
        wa.avatarShockEffectTicks = wa.avatarShockEffectTicks - 1;
        if (steppedTailShockTicksSnapshot <= 0) {
          steppedTailTintWithoutShockSnapshot = jf.avatarTintFadeTicks;
          jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
          if (steppedTailTintWithoutShockSnapshot <= 0) {
            return;
          }
          rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
          return;
        }
        IndexedSpriteState.avatarShockFrameIndex = wa.avatarShockEffectTicks % 15 % 2;
        steppedTailTintAfterShockSnapshot = jf.avatarTintFadeTicks;
        jf.avatarTintFadeTicks = jf.avatarTintFadeTicks - 1;
        if (steppedTailTintAfterShockSnapshot <= 0) {
          return;
        }
        rj.avatarTintColor = ((int)(md.avatarTintRedDelta * avatarTintFadeFactor) << 16) + (r.avatarTintStartColor + ((int)(avatarTintFadeFactor * GzipInflater.avatarTintGreenDelta) << 8) + (int)(uk.avatarTintBlueDelta * avatarTintFadeFactor));
        return;
    }

    final static wa getSharedUiStyle(int methodGuard) {
        if (null == DiskCacheWorker.field_f) {
            DiskCacheWorker.field_f = new wa();
            DiskCacheWorker.field_f.a(9, DialogLayer.sharedUiFont);
            DiskCacheWorker.field_f.field_h = 14;
            DiskCacheWorker.field_f.field_f = 2763306;
            DiskCacheWorker.field_f.field_d = 6;
            DiskCacheWorker.field_f.field_n = 7697781;
            DiskCacheWorker.field_f.field_e = 5;
            DiskCacheWorker.field_f.field_i = 0;
            DiskCacheWorker.field_f.field_p = 4;
            DiskCacheWorker.field_f.field_m = hh.field_d;
            if (methodGuard >= 71) {
                return DiskCacheWorker.field_f;
            }
            return (wa) null;
        }
        if (methodGuard >= 71) {
            return DiskCacheWorker.field_f;
        }
        return (wa) null;
    }

    final void installErrorContent(int errorKind, int methodGuard, String messageText) {
        boolean retryButtonActionValue = false;
        ni buttonTextContentSnapshot = null;
        String retryOrBackButtonText = null;
        RuntimeException errorContentFailureBeforeContext = null;
        StringBuilder errorContentFailureContextBuilder = null;
        String messageContextDescription = null;
        RuntimeException caughtErrorContentException = null;
        RuntimeException errorContentFailure = null;
        int clientControlFlowSnapshot = 0;
        ni errorTextContent = null;
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
          this.dialogStatusPanel.a(4210752, 8405024, (byte) -103);
          errorTextContent = new ni((MessageDialog) (this), this.messageFont, messageText);
          if (errorKind == 5) {
            errorTextContent.a(TriangleMesh.reloadGameText, 1, 11);
            errorTextContent.a(rj.quitToWebsiteText, 1, 17);
          } else {
            if (errorKind != 256) {
              buttonTextContentSnapshot = (ni) (errorTextContent);
              if (this.showRetryLoginOnDismiss) {
                retryOrBackButtonText = a.retryText;
              } else {
                retryOrBackButtonText = ll.backText;
              }
              ((ni) (Object) buttonTextContentSnapshot).a(retryOrBackButtonText, 1, -1);
            } else {
              errorTextContent.a(-2, a.retryText, (WidgetListener) (this));
            }
          }
          if (errorKind == 3) {
            errorTextContent.a(WidgetContainer.toServerListText, methodGuard ^ 19811, 7);
          } else {
            if (errorKind != 4) {
              if (errorKind == 6) {
                errorTextContent.a(jc.toCustomerSupportText, 1, 9);
              } else {
                if (errorKind != 9) {
                  this.replaceContent(errorTextContent, methodGuard ^ -19736);
                  return;
                }
                errorTextContent.a(-2, fi.changeDisplayNameText, (WidgetListener) (this));
              }
            } else {
              errorTextContent.a(hb.playFreeVersionText, 1, 8);
            }
          }
          this.replaceContent(errorTextContent, methodGuard ^ -19736);
          return;
        } catch (java.lang.RuntimeException caughtErrorContentFailure) {
          caughtErrorContentException = caughtErrorContentFailure;
          errorContentFailure = caughtErrorContentException;
          errorContentFailureBeforeContext = (RuntimeException) (errorContentFailure);
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
          decimalFailureBeforeContext = (RuntimeException) (decimalValidationFailure);
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
        ni restoredTextContent = null;
        this.dialogStatusPanel.a(4210752, 2121792, (byte) -103);
        if (!clearCanvasGuard) {
            restoredTextContent = new ni((MessageDialog) (this), this.messageFont, ResizableDialog.connectionRestoredText);
            restoredTextContent.a(jk.returnToGameText, 1, 15);
            this.replaceContent(restoredTextContent, -23);
            return;
        }
        gameCanvas = (java.awt.Canvas) null;
        restoredTextContent = new ni((MessageDialog) (this), this.messageFont, ResizableDialog.connectionRestoredText);
        restoredTextContent.a(jk.returnToGameText, 1, 15);
        this.replaceContent(restoredTextContent, -23);
    }

    static {
        awaitingLoginLongState = new gk();
        quickChatShortcutKeys = new String[]{"[BACKSPACE]", "[HOME]", "[F9]", "[F10]", "[F11]", "[ESC]"};
        fullscreenTimeoutText = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
    }
}
