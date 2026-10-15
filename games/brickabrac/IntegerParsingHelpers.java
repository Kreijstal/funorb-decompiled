/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntegerParsingHelpers {
    static int[] field_b;
    static String field_a;
    static QuickChatHelpDialog quickChatHelpDialog;

    final static void closeFullscreenFrame(PlatformServices platform, int obfuscationGuard, java.awt.Frame frame) {
        PlatformTask exitTask = null;
        int unusedGameFlag = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String platformSummary = null;
        StringBuilder frameContextBuilder = null;
        String frameSummary = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          while (true) {
            exitTask = platform.a(10, frame);
            while (exitTask.status == 0) {
              BytePayloadRequest.sleepMillis(obfuscationGuard ^ 20898, 10L);
            }
            if (exitTask.status != 1) {
              BytePayloadRequest.sleepMillis(-128, 100L);
              continue;
            }
            break;
          }
          frame.setVisible(false);
          frame.dispose();
          if (obfuscationGuard == -20954) {
            return;
          }
          quickChatHelpDialog = (QuickChatHelpDialog) null;
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("sq.F(");
          if (platform == null) {
            platformSummary = "null";
          } else {
            platformSummary = "{...}";
          }
          frameContextBuilder = ((StringBuilder) (Object) contextBuilder).append(platformSummary).append(',').append(obfuscationGuard).append(',');
          if (frame == null) {
            frameSummary = "null";
          } else {
            frameSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) frameContextBuilder).append(frameSummary).append(')').toString());
        }
    }

    final static int parseAsciiInt(byte obfuscationGuard, int radix, boolean allowLeadingPlus, CharSequence text) {
        int characterIndex = 0;
        int parsedValue = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String textSummary = null;
        RuntimeException caughtFailure = null;
        int negativeFlag = 0;
        RuntimeException failure = null;
        int hasDigitFlag = 0;
        int value = 0;
        int length = 0;
        int digit = 0;
        int nextValue = 0;
        int unusedGameFlag = 0;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          if (radix >= 2 &&
            radix <= 36) {
            negativeFlag = 0;
            if (obfuscationGuard != -32) {
              field_a = (String) null;
            }
            hasDigitFlag = 0;
            value = 0;
            length = text.length();
            for (characterIndex = 0; length > characterIndex; characterIndex++) {
              boolean processDigit = true;
              digit = text.charAt(characterIndex);
              if ((characterIndex == 0) &&
                (digit == 45)) {
                negativeFlag = 1;
                processDigit = false;
              }
              if ((processDigit) && (characterIndex != 0 || (digit != 43 ||
                !allowLeadingPlus))) {
                if (digit >= 48 &&
                  57 >= digit) {
                  digit -= 48;
                } else if (digit >= 65 &&
                  digit <= 90) {
                  digit -= 55;
                } else if (digit >= 97 &&
                  digit <= 122) {
                  digit -= 87;
                } else {
                  throw new NumberFormatException();
                }
                if (radix <= digit) {
                  throw new NumberFormatException();
                }
                if (negativeFlag != 0) {
                  digit = -digit;
                }
                nextValue = value * radix + digit;
                if (value != nextValue / radix) {
                  throw new NumberFormatException();
                }
                hasDigitFlag = 1;
                value = nextValue;
              }
            }
            if (hasDigitFlag == 0) {
              throw new NumberFormatException();
            }
            parsedValue = value;
            return parsedValue;
          }
          throw new IllegalArgumentException("" + radix);
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("sq.B(").append(obfuscationGuard).append(',').append(radix).append(',').append(allowLeadingPlus).append(',');
          if (text == null) {
            textSummary = "null";
          } else {
            textSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(textSummary).append(')').toString());
        }
    }

    final static ConditionalTextValue a(int param0) {
        if (param0 > 31) {
          return new ConditionalTextValue(IndexedSpriteGeometry.a(57), LobbyOverlayHelpers.c(30794));
        }
        quickChatHelpDialog = (QuickChatHelpDialog) null;
        return new ConditionalTextValue(IndexedSpriteGeometry.a(57), LobbyOverlayHelpers.c(30794));
    }

    public static void a(byte param0) {
        if (param0 == -11) {
          field_a = null;
          quickChatHelpDialog = null;
          field_b = null;
          return;
        }
        field_b = (int[]) null;
        field_a = null;
        quickChatHelpDialog = null;
        field_b = null;
    }

    final static void updateSocialListPanels(boolean inputEnabled, int opcode, int obfuscationGuard) {
        ContextActionController contextController = null;
        String actionLabel = null;
        int anchorX = 0;
        int anchorY = 0;
        SocialListEntry pressedFriend = FriendListUi.updateFriendsList(inputEnabled, opcode, -16);
        ContextActionController contextControllerAlias;
        if (pressedFriend != null) {
          GameRenderAudioHelpers.contextActions.addPlayerGameActions(true, false);
          contextController = GameRenderAudioHelpers.contextActions;
          actionLabel = ChocolateBackground.field_y;
          contextController.contextMenu.addAction(actionLabel, 5, (byte) 104);
          contextControllerAlias = GameRenderAudioHelpers.contextActions;
          anchorX = LoadingProgressDialog.pressX;
          anchorY = PlayerNameChooserPanel.pressY;
          contextControllerAlias.contextMenu.layoutAtAnchor(anchorY, -98, 0, 0, anchorX);
        }
        int guardCalculation = -44 % ((-3 - obfuscationGuard) / 50);
        MusicEnvelope.updateIgnoreList(inputEnabled, true, opcode);
    }

    final static void updateDiagnosticOverlay(boolean obfuscationGuard) {
        StringBuilder discardedRateAppendHeapDisabled = null;
        StringBuilder discardedRateAppendAlternateGuard = null;
        StringBuilder discardedUsedHeapAppendAllocationChanged = null;
        StringBuilder discardedAllocatedHeapAppendAllocationChanged = null;
        StringBuilder discardedRateAppendAllocationChanged = null;
        StringBuilder discardedRateAppendAllocationChangedAlternateGuard = null;
        StringBuilder discardedRateAppendHeapUnchanged = null;
        StringBuilder discardedRateAppendHeapUnchangedAlternateGuard = null;
        StringBuilder discardedUsedHeapAppendUsageChanged = null;
        StringBuilder discardedAllocatedHeapAppendUsageChanged = null;
        StringBuilder discardedRateAppendUsageChanged = null;
        StringBuilder discardedRateAppendUsageChangedAlternateGuard = null;
        long allocatedHeapBytesThenKiB;
        long freeHeapBytesThenKiB;
        long usedHeapKiB;
        LoginCredentials.diagnosticLines.clear((byte) -83);
        if (!RadialSelectorRenderer.showHeapDiagnostic) {
          if (!obfuscationGuard) {
            if (GzipInflater.showRenderRateDiagnostic) {
              if (FocusableWidget.recentRenderRate != BoundedFile.lastDiagnosticRenderRate) {
                FullscreenDialogHelpers.renderRateDiagnosticLine.text.setLength(0);
                DelegatingCanvas.appendDiagnosticDecimal(-9, (long)FocusableWidget.recentRenderRate, FullscreenDialogHelpers.renderRateDiagnosticLine.text);
                discardedRateAppendHeapDisabled = FullscreenDialogHelpers.renderRateDiagnosticLine.text.append(" fps");
                BoundedFile.lastDiagnosticRenderRate = FocusableWidget.recentRenderRate;
              }
              LoginCredentials.diagnosticLines.addLast(FullscreenDialogHelpers.renderRateDiagnosticLine, (byte) 3);
            }
          } else {
            IntegerParsingHelpers.a(15);
            if (GzipInflater.showRenderRateDiagnostic) {
              if (FocusableWidget.recentRenderRate != BoundedFile.lastDiagnosticRenderRate) {
                FullscreenDialogHelpers.renderRateDiagnosticLine.text.setLength(0);
                DelegatingCanvas.appendDiagnosticDecimal(-9, (long)FocusableWidget.recentRenderRate, FullscreenDialogHelpers.renderRateDiagnosticLine.text);
                discardedRateAppendAlternateGuard = FullscreenDialogHelpers.renderRateDiagnosticLine.text.append(" fps");
                BoundedFile.lastDiagnosticRenderRate = FocusableWidget.recentRenderRate;
              }
              LoginCredentials.diagnosticLines.addLast(FullscreenDialogHelpers.renderRateDiagnosticLine, (byte) 3);
            }
          }
          return;
        }
        allocatedHeapBytesThenKiB = Runtime.getRuntime().totalMemory();
        freeHeapBytesThenKiB = Runtime.getRuntime().freeMemory();
        usedHeapKiB = (-freeHeapBytesThenKiB + allocatedHeapBytesThenKiB) / 1024L;
        freeHeapBytesThenKiB = freeHeapBytesThenKiB / 1024L;
        allocatedHeapBytesThenKiB = allocatedHeapBytesThenKiB / 1024L;
        if (~RankingsScreen.lastDiagnosticAllocatedHeapKiB != ~allocatedHeapBytesThenKiB) {
          PopupWidgetLayer.heapDiagnosticLine.text.setLength(0);
          DelegatingCanvas.appendDiagnosticDecimal(-9, usedHeapKiB, PopupWidgetLayer.heapDiagnosticLine.text);
          discardedUsedHeapAppendAllocationChanged = PopupWidgetLayer.heapDiagnosticLine.text.append(" kB / ");
          DelegatingCanvas.appendDiagnosticDecimal(-9, allocatedHeapBytesThenKiB, PopupWidgetLayer.heapDiagnosticLine.text);
          discardedAllocatedHeapAppendAllocationChanged = PopupWidgetLayer.heapDiagnosticLine.text.append(" kB");
          SecondaryHashTable.lastDiagnosticUsedHeapKiB = usedHeapKiB;
          RankingsScreen.lastDiagnosticAllocatedHeapKiB = allocatedHeapBytesThenKiB;
          LoginCredentials.diagnosticLines.addLast(PopupWidgetLayer.heapDiagnosticLine, (byte) 3);
          if (!obfuscationGuard) {
            if (GzipInflater.showRenderRateDiagnostic) {
              if (FocusableWidget.recentRenderRate != BoundedFile.lastDiagnosticRenderRate) {
                FullscreenDialogHelpers.renderRateDiagnosticLine.text.setLength(0);
                DelegatingCanvas.appendDiagnosticDecimal(-9, (long)FocusableWidget.recentRenderRate, FullscreenDialogHelpers.renderRateDiagnosticLine.text);
                discardedRateAppendAllocationChanged = FullscreenDialogHelpers.renderRateDiagnosticLine.text.append(" fps");
                BoundedFile.lastDiagnosticRenderRate = FocusableWidget.recentRenderRate;
              }
              LoginCredentials.diagnosticLines.addLast(FullscreenDialogHelpers.renderRateDiagnosticLine, (byte) 3);
            }
          } else {
            IntegerParsingHelpers.a(15);
            if (GzipInflater.showRenderRateDiagnostic) {
              if (FocusableWidget.recentRenderRate != BoundedFile.lastDiagnosticRenderRate) {
                FullscreenDialogHelpers.renderRateDiagnosticLine.text.setLength(0);
                DelegatingCanvas.appendDiagnosticDecimal(-9, (long)FocusableWidget.recentRenderRate, FullscreenDialogHelpers.renderRateDiagnosticLine.text);
                discardedRateAppendAllocationChangedAlternateGuard = FullscreenDialogHelpers.renderRateDiagnosticLine.text.append(" fps");
                BoundedFile.lastDiagnosticRenderRate = FocusableWidget.recentRenderRate;
              }
              LoginCredentials.diagnosticLines.addLast(FullscreenDialogHelpers.renderRateDiagnosticLine, (byte) 3);
            }
          }
          return;
        }
        if (SecondaryHashTable.lastDiagnosticUsedHeapKiB == usedHeapKiB) {
          LoginCredentials.diagnosticLines.addLast(PopupWidgetLayer.heapDiagnosticLine, (byte) 3);
          if (!obfuscationGuard) {
            if (GzipInflater.showRenderRateDiagnostic) {
              if (FocusableWidget.recentRenderRate != BoundedFile.lastDiagnosticRenderRate) {
                FullscreenDialogHelpers.renderRateDiagnosticLine.text.setLength(0);
                DelegatingCanvas.appendDiagnosticDecimal(-9, (long)FocusableWidget.recentRenderRate, FullscreenDialogHelpers.renderRateDiagnosticLine.text);
                discardedRateAppendHeapUnchanged = FullscreenDialogHelpers.renderRateDiagnosticLine.text.append(" fps");
                BoundedFile.lastDiagnosticRenderRate = FocusableWidget.recentRenderRate;
              }
              LoginCredentials.diagnosticLines.addLast(FullscreenDialogHelpers.renderRateDiagnosticLine, (byte) 3);
            }
          } else {
            IntegerParsingHelpers.a(15);
            if (GzipInflater.showRenderRateDiagnostic) {
              if (FocusableWidget.recentRenderRate != BoundedFile.lastDiagnosticRenderRate) {
                FullscreenDialogHelpers.renderRateDiagnosticLine.text.setLength(0);
                DelegatingCanvas.appendDiagnosticDecimal(-9, (long)FocusableWidget.recentRenderRate, FullscreenDialogHelpers.renderRateDiagnosticLine.text);
                discardedRateAppendHeapUnchangedAlternateGuard = FullscreenDialogHelpers.renderRateDiagnosticLine.text.append(" fps");
                BoundedFile.lastDiagnosticRenderRate = FocusableWidget.recentRenderRate;
              }
              LoginCredentials.diagnosticLines.addLast(FullscreenDialogHelpers.renderRateDiagnosticLine, (byte) 3);
            }
          }
          return;
        }
        PopupWidgetLayer.heapDiagnosticLine.text.setLength(0);
        DelegatingCanvas.appendDiagnosticDecimal(-9, usedHeapKiB, PopupWidgetLayer.heapDiagnosticLine.text);
        discardedUsedHeapAppendUsageChanged = PopupWidgetLayer.heapDiagnosticLine.text.append(" kB / ");
        DelegatingCanvas.appendDiagnosticDecimal(-9, allocatedHeapBytesThenKiB, PopupWidgetLayer.heapDiagnosticLine.text);
        discardedAllocatedHeapAppendUsageChanged = PopupWidgetLayer.heapDiagnosticLine.text.append(" kB");
        SecondaryHashTable.lastDiagnosticUsedHeapKiB = usedHeapKiB;
        RankingsScreen.lastDiagnosticAllocatedHeapKiB = allocatedHeapBytesThenKiB;
        LoginCredentials.diagnosticLines.addLast(PopupWidgetLayer.heapDiagnosticLine, (byte) 3);
        if (!obfuscationGuard) {
          if (GzipInflater.showRenderRateDiagnostic) {
            if (FocusableWidget.recentRenderRate != BoundedFile.lastDiagnosticRenderRate) {
              FullscreenDialogHelpers.renderRateDiagnosticLine.text.setLength(0);
              DelegatingCanvas.appendDiagnosticDecimal(-9, (long)FocusableWidget.recentRenderRate, FullscreenDialogHelpers.renderRateDiagnosticLine.text);
              discardedRateAppendUsageChanged = FullscreenDialogHelpers.renderRateDiagnosticLine.text.append(" fps");
              BoundedFile.lastDiagnosticRenderRate = FocusableWidget.recentRenderRate;
            }
            LoginCredentials.diagnosticLines.addLast(FullscreenDialogHelpers.renderRateDiagnosticLine, (byte) 3);
          }
        } else {
          IntegerParsingHelpers.a(15);
          if (GzipInflater.showRenderRateDiagnostic) {
            if (FocusableWidget.recentRenderRate != BoundedFile.lastDiagnosticRenderRate) {
              FullscreenDialogHelpers.renderRateDiagnosticLine.text.setLength(0);
              DelegatingCanvas.appendDiagnosticDecimal(-9, (long)FocusableWidget.recentRenderRate, FullscreenDialogHelpers.renderRateDiagnosticLine.text);
              discardedRateAppendUsageChangedAlternateGuard = FullscreenDialogHelpers.renderRateDiagnosticLine.text.append(" fps");
              BoundedFile.lastDiagnosticRenderRate = FocusableWidget.recentRenderRate;
            }
            LoginCredentials.diagnosticLines.addLast(FullscreenDialogHelpers.renderRateDiagnosticLine, (byte) 3);
          }
        }
        return;
    }

    static {
        int var0 = 0;
        field_b = new int[256];
        for (var0 = 0; var0 < 256; var0++) {
          field_b[var0] = 65793 * var0;
        }
        field_a = "Email: ";
    }
}
