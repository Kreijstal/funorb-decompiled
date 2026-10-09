/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KeyboardInputListener implements java.awt.event.KeyListener, java.awt.event.FocusListener {
    static Sprite entityAndTutorialScratchRaster;
    static String clearBonusText;

    public final synchronized void keyPressed(java.awt.event.KeyEvent event) {
        int internalKeyCode = 0;
        RuntimeException callbackFailureForContext = null;
        int nextEventWriteIndexOrModifiers = 0;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        int eventModifiers;
        try {
          if (TrackedPcmStream.keyboardListener == null) {
            return;
          }
          TextPairLoginPayload.keyboardIdleTicks = 0;
          internalKeyCode = event.getKeyCode();
          if (internalKeyCode >= 0 &&
              ResizableDialog.awtKeyCodeToInternalCode.length > internalKeyCode) {
            internalKeyCode = ResizableDialog.awtKeyCodeToInternalCode[internalKeyCode];
            if ((internalKeyCode & 128) != 0) {
              internalKeyCode = -1;
            }
          } else {
            internalKeyCode = -1;
          }
          if (ArchiveLoadStep.keyStateWriteIndexOrResetSentinel >= 0 &&
              internalKeyCode >= 0) {
            EntityCollisionSupport.queuedKeyStateChanges[ArchiveLoadStep.keyStateWriteIndexOrResetSentinel] = internalKeyCode;
            ArchiveLoadStep.keyStateWriteIndexOrResetSentinel = 127 & 1 + ArchiveLoadStep.keyStateWriteIndexOrResetSentinel;
            if (ClientProtocolStage.keyStateReadIndex == ArchiveLoadStep.keyStateWriteIndexOrResetSentinel) {
              ArchiveLoadStep.keyStateWriteIndexOrResetSentinel = -1;
            }
          }
          if (internalKeyCode >= 0) {
            nextEventWriteIndexOrModifiers = 127 & 1 + BufferedSocket.keyEventWriteIndex;
            if (nextEventWriteIndexOrModifiers != ReceivedTextRecord.keyboardEventReadIndex) {
              MidiPcmStream.queuedKeyboardEventCodes[BufferedSocket.keyEventWriteIndex] = internalKeyCode;
              ScoreSubmission.queuedKeyboardEventCharacters[BufferedSocket.keyEventWriteIndex] = (char)0;
              BufferedSocket.keyEventWriteIndex = nextEventWriteIndexOrModifiers;
            }
          }
          eventModifiers = event.getModifiers();
          if ((eventModifiers & 10) == 0 &&
              85 != internalKeyCode &&
              internalKeyCode != 10) {
            return;
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = callbackFailureForContext;
          callbackMessagePrefix = new StringBuilder().append("wl.keyPressed(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent unusedFocusEvent) {
    }

    public static void releaseStaticReferences(int methodGuard) {
        entityAndTutorialScratchRaster = null;
        if (methodGuard != 31997) {
            return;
        }
        clearBonusText = null;
    }

    public final void keyTyped(java.awt.event.KeyEvent event) {
        int typedCharacterCode = 0;
        int nextEventWriteIndex = 0;
        try {
            if (TrackedPcmStream.keyboardListener != null) {
                typedCharacterCode = event.getKeyChar();
                if (typedCharacterCode != 0 && typedCharacterCode != 65535 && SettingsCookieSupport.isRepresentableTextCharacter((byte) -112, (char) typedCharacterCode)) {
                    nextEventWriteIndex = 1 + BufferedSocket.keyEventWriteIndex & 127;
                    if (nextEventWriteIndex != ReceivedTextRecord.keyboardEventReadIndex) {
                        MidiPcmStream.queuedKeyboardEventCodes[BufferedSocket.keyEventWriteIndex] = -1;
                        ScoreSubmission.queuedKeyboardEventCharacters[BufferedSocket.keyEventWriteIndex] = (char)typedCharacterCode;
                        BufferedSocket.keyEventWriteIndex = nextEventWriteIndex;
                    }
                }
            }
            event.consume();
        } catch (RuntimeException callbackFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailure), "wl.keyTyped(" + (event != null ? "{...}" : "null") + ')');
        }
    }

    public final synchronized void keyReleased(java.awt.event.KeyEvent event) {
        RuntimeException callbackFailureForContext = null;
        int internalKeyCode = 0;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (TrackedPcmStream.keyboardListener != null) {
            TextPairLoginPayload.keyboardIdleTicks = 0;
            internalKeyCode = event.getKeyCode();
            if (internalKeyCode >= 0 &&
                ResizableDialog.awtKeyCodeToInternalCode.length > internalKeyCode) {
              internalKeyCode = ResizableDialog.awtKeyCodeToInternalCode[internalKeyCode] & -129;
            } else {
              internalKeyCode = -1;
            }
            if (ArchiveLoadStep.keyStateWriteIndexOrResetSentinel >= 0 &&
                0 <= internalKeyCode) {
              EntityCollisionSupport.queuedKeyStateChanges[ArchiveLoadStep.keyStateWriteIndexOrResetSentinel] = ~internalKeyCode;
              ArchiveLoadStep.keyStateWriteIndexOrResetSentinel = 1 + ArchiveLoadStep.keyStateWriteIndexOrResetSentinel & 127;
              if (ClientProtocolStage.keyStateReadIndex == ArchiveLoadStep.keyStateWriteIndexOrResetSentinel) {
                ArchiveLoadStep.keyStateWriteIndexOrResetSentinel = -1;
              }
            }
          }
          event.consume();
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = callbackFailureForContext;
          callbackMessagePrefix = new StringBuilder().append("wl.keyReleased(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    final static void showLoginForCreatedAccountEmail(int methodGuard) {
        String unusedNullPasswordSnapshot = (String) null;
        MessageDialog.showLoginForm(ResourceArchive.accountCreationEmail, (String) null, 7697781);
        if (methodGuard != -1) {
            entityAndTutorialScratchRaster = (Sprite) null;
        }
    }

    public final synchronized void focusLost(java.awt.event.FocusEvent event) {
        RuntimeException callbackFailureForContext = null;
        RuntimeException callbackFailureBeforeEventDescription = null;
        StringBuilder callbackMessagePrefix = null;
        String eventArgumentDescription = null;
        RuntimeException caughtCallbackFailure = null;
        try {
          if (null == TrackedPcmStream.keyboardListener) {
            return;
          }
          ArchiveLoadStep.keyStateWriteIndexOrResetSentinel = -1;
          return;
        } catch (java.lang.RuntimeException callbackFailure) {
          caughtCallbackFailure = callbackFailure;
          callbackFailureForContext = caughtCallbackFailure;
          callbackFailureBeforeEventDescription = callbackFailureForContext;
          callbackMessagePrefix = new StringBuilder().append("wl.focusLost(");
          if (event == null) {
            eventArgumentDescription = "null";
          } else {
            eventArgumentDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) callbackFailureBeforeEventDescription), ((StringBuilder) (Object) callbackMessagePrefix).append(eventArgumentDescription).append(')').toString());
        }
    }

    static {
        entityAndTutorialScratchRaster = new Sprite(30, 30);
        clearBonusText = "Clear bonus!";
    }
}
