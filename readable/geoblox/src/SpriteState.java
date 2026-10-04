/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SpriteState extends DualLinkNode {
    int fullWidth;
    int width;
    int height;
    int trimY;
    int fullHeight;
    static long retentionCategoryOneSourceId;
    static TextTemplateArgumentType textTemplateArgumentTypeNine;
    int trimX;
    static String loadingOverlayText;

    final static void loadGameTextResources(boolean preserveTemplateTypeNine, ResourceArchive textArchive) {
        RuntimeException loadFailureBeforeDescription = null;
        StringBuilder loadMessagePrefix = null;
        String archiveDescription = null;
        RuntimeException caughtLoadFailure = null;
        byte[] resourceBytes = null;
        RuntimeException loadFailureForContext = null;
        int clientControlSnapshot = 0;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          LoginPanel.namedRootResourceArchive = textArchive;
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "achievement_names,0");
          if (null != resourceBytes) {
            GameplaySetupSupport.achievementTitles[0] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "achievement_names,1");
          if (resourceBytes != null) {
            GameplaySetupSupport.achievementTitles[1] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "achievement_names,2");
          if (resourceBytes != null) {
            GameplaySetupSupport.achievementTitles[2] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "achievement_names,3");
          if (null != resourceBytes) {
            GameplaySetupSupport.achievementTitles[3] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "achievement_names,4");
          if (null != resourceBytes) {
            GameplaySetupSupport.achievementTitles[4] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "achievement_names,5");
          if (resourceBytes != null) {
            GameplaySetupSupport.achievementTitles[5] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "achievement_names,6");
          if (resourceBytes != null) {
            GameplaySetupSupport.achievementTitles[6] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "achievement_names,7");
          if (null != resourceBytes) {
            GameplaySetupSupport.achievementTitles[7] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(127, "achievement_names,8");
          if (null != resourceBytes) {
            GameplaySetupSupport.achievementTitles[8] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "achievement_names,9");
          if (resourceBytes != null) {
            GameplaySetupSupport.achievementTitles[9] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "achievement_names,10");
          if (null != resourceBytes) {
            GameplaySetupSupport.achievementTitles[10] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "achievement_names,11");
          if (null != resourceBytes) {
            GameplaySetupSupport.achievementTitles[11] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "achievement_names,12");
          if (resourceBytes != null) {
            GameplaySetupSupport.achievementTitles[12] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "achievement_names,13");
          if (null != resourceBytes) {
            GameplaySetupSupport.achievementTitles[13] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "achievement_names,14");
          if (resourceBytes != null) {
            GameplaySetupSupport.achievementTitles[14] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(123, "achievement_names,15");
          if (null != resourceBytes) {
            GameplaySetupSupport.achievementTitles[15] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "achievement_names,16");
          if (resourceBytes != null) {
            GameplaySetupSupport.achievementTitles[16] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "achievement_criteria,0");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[0] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "achievement_criteria,1");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[1] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "achievement_criteria,2");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[2] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "achievement_criteria,3");
          if (resourceBytes != null) {
            LoginProtocolSupport.achievementDescriptions[3] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "achievement_criteria,4");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[4] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "achievement_criteria,5");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[5] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "achievement_criteria,6");
          if (resourceBytes != null) {
            LoginProtocolSupport.achievementDescriptions[6] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "achievement_criteria,7");
          if (resourceBytes != null) {
            LoginProtocolSupport.achievementDescriptions[7] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "achievement_criteria,8");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[8] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "achievement_criteria,9");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[9] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "achievement_criteria,10");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[10] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "achievement_criteria,11");
          if (resourceBytes != null) {
            LoginProtocolSupport.achievementDescriptions[11] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "achievement_criteria,12");
          if (resourceBytes != null) {
            LoginProtocolSupport.achievementDescriptions[12] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(127, "achievement_criteria,13");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[13] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "achievement_criteria,14");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[14] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(127, "achievement_criteria,15");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[15] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "achievement_criteria,16");
          if (null != resourceBytes) {
            LoginProtocolSupport.achievementDescriptions[16] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(127, "starting");
          if (null != resourceBytes) {
            FullscreenFailureReason.startingGameText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "gameName");
          if (resourceBytes != null) {
            LoginMethod.gameNameText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "caption1");
          if (resourceBytes != null) {
            EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(124, "caption2");
          if (null != resourceBytes) {
            EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(123, "caption3");
          if (resourceBytes != null) {
            EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "caption4");
          if (null != resourceBytes) {
            EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(124, "caption5");
          if (null != resourceBytes) {
            EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "youreGreat");
          if (null != resourceBytes) {
            PlayfieldRules.twoThousandBonusText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "bubbleBonus");
          if (resourceBytes != null) {
            SharedBufferPools.bubbleBonusText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "endOfFreeGame");
          if (resourceBytes != null) {
            EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "itsTheBubbleBonus");
          if (resourceBytes != null) {
            ClientFlowState.bubbleBonusAnnouncementText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "countdown");
          if (null != resourceBytes) {
            SessionSocketSupport.countdownLabelText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(124, "levelsLastGeoblox");
          if (null != resourceBytes) {
            LoginUiSupport.lastGeobloxOfLevelText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "clearBonus");
          if (null != resourceBytes) {
            KeyboardInputListener.clearBonusText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "cheat");
          if (!preserveTemplateTypeNine) {
            textTemplateArgumentTypeNine = (TextTemplateArgumentType) null;
          }
          if (resourceBytes != null) {
            EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "bonus");
          if (resourceBytes != null) {
            SessionBootstrapSupport.bonusAmountTemplateText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(123, "fps");
          if (null != resourceBytes) {
            SingleChildWidget.fpsTextTemplate = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(127, "level");
          if (resourceBytes != null) {
            LoginPayloadKind.levelTextTemplate = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(124, "score");
          if (resourceBytes != null) {
            LimitedRandomAccessFile.scoreTextTemplate = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "waitingForPumpkin");
          if (resourceBytes != null) {
            Under13TermsPanel.waitingForPumpkinText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "loadingPumpkin");
          if (resourceBytes != null) {
            FullscreenFailureReason.loadingPumpkinText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "skipText");
          if (resourceBytes != null) {
            CanvasResizeController.tutorialSkipMessage = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "tutorial1");
          if (null != resourceBytes) {
            UsernameSuggestionsPanel.tutorialRotationMessage = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(127, "tutorial2");
          if (resourceBytes != null) {
            ByteArrayPoolSupport.tutorialColourMatchMessage = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "tutorial3");
          if (null != resourceBytes) {
            ReceivedTextRecord.tutorialShapeMatchMessage = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "tutorial4");
          if (resourceBytes != null) {
            ArchiveHandshakeState.tutorialCompleteMessage = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "tutorial5");
          if (null != resourceBytes) {
            AccountCreationForm.tutorialFailedMessage = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(123, "cont");
          if (null != resourceBytes) {
            VisualPropertyOverrides.continueText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(124, "restartTutorial");
          if (resourceBytes != null) {
            AgeValidator.restartTutorialText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "discardResults");
          if (resourceBytes != null) {
            PacketByteCipher.discardResultsText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(124, "replayTutorial");
          if (null != resourceBytes) {
            ArchiveCatalog.replayTutorialText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "subscribe");
          if (null != resourceBytes) {
            EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(124, "createAnAccount");
          if (null != resourceBytes) {
            EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "fetchingHS");
          if (null != resourceBytes) {
            ArchiveLoadSequence.fetchingHighscoresText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "instructionTitles,0");
          if (resourceBytes != null) {
            BoardEntityState.instructionPageTitles[0] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(127, "instructionTitles,1");
          if (resourceBytes != null) {
            BoardEntityState.instructionPageTitles[1] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "instructionTitles,2");
          if (null != resourceBytes) {
            BoardEntityState.instructionPageTitles[2] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "instructionTitles,3");
          if (null != resourceBytes) {
            BoardEntityState.instructionPageTitles[3] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(123, "instructionTitles,4");
          if (resourceBytes != null) {
            BoardEntityState.instructionPageTitles[4] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "instructionTitles,5");
          if (null != resourceBytes) {
            BoardEntityState.instructionPageTitles[5] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(124, "instructionText,0");
          if (null != resourceBytes) {
            MatchScoringSupport.instructionParagraphs[0] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "instructionText,1");
          if (resourceBytes != null) {
            MatchScoringSupport.instructionParagraphs[1] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "instructionText,2");
          if (resourceBytes != null) {
            MatchScoringSupport.instructionParagraphs[2] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(121, "instructionText,3");
          if (resourceBytes != null) {
            MatchScoringSupport.instructionParagraphs[3] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(123, "instructionText,4");
          if (null != resourceBytes) {
            MatchScoringSupport.instructionParagraphs[4] = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(126, "pleaseLogin");
          if (resourceBytes != null) {
            Geoblox.loginMessage = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "youAreNotLoggedIn");
          if (null != resourceBytes) {
            AccountCreationDialog.notLoggedInText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(120, "alternatively");
          if (resourceBytes != null) {
            ProxyAuthenticationRequiredException.discardResultsWarningText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(125, "login");
          if (resourceBytes != null) {
            StrongCacheReference.loginRegisterText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "notAcheived");
          if (null != resourceBytes) {
            DebouncedValidationProvider.notAchievedText = EmailValidator.decodeTextBytes(1, resourceBytes);
          }
          resourceBytes = EntityContactSupport.readNamedRootArchiveFile(122, "keycode_reverseControls");
          if (null != resourceBytes) {
            SocketConnector.swapRotationControlsKeyCode = resourceBytes[0] & 255;
          }
          LoginPanel.namedRootResourceArchive = null;
        } catch (java.lang.RuntimeException loadFailure) {
          caughtLoadFailure = loadFailure;
          loadFailureForContext = caughtLoadFailure;
          loadFailureBeforeDescription = loadFailureForContext;
          loadMessagePrefix = new StringBuilder().append("wh.JA(").append(preserveTemplateTypeNine).append(',');
          if (textArchive == null) {
            archiveDescription = "null";
          } else {
            archiveDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) loadFailureBeforeDescription), ((StringBuilder) (Object) loadMessagePrefix).append(archiveDescription).append(')').toString());
        }
        if (GameApplet.textLoadControlIncrementEnabled) {
          clientControlSnapshot++;
          Geoblox.clientControlFlowFlag = clientControlSnapshot;
        }
    }

    final static byte[] computeWhirlpoolDigest(int length, int sourceOffset, byte[] source, int bitsPerByte) {
        byte[] digestInput = null;
        RuntimeException digestFailureForContext = null;
        int copiedByteIndex = 0;
        WhirlpoolHash hash = null;
        byte[] digest = null;
        int clientControlFlowGuard = 0;
        byte[] digestBeforeReturn = null;
        RuntimeException digestFailureBeforeContext = null;
        StringBuilder digestMessagePrefix = null;
        String sourceDescription = null;
        RuntimeException caughtDigestFailure = null;
        clientControlFlowGuard = Geoblox.clientControlFlowFlag;
        try {
          L0: {
            if (sourceOffset > 0) {
              digestInput = new byte[length];
              copiedByteIndex = 0;
              while (~length < ~copiedByteIndex) {
                digestInput[copiedByteIndex] = source[sourceOffset + copiedByteIndex];
                copiedByteIndex++;
                if (clientControlFlowGuard != 0) {
                  break L0;
                }
                continue;
              }
              if (clientControlFlowGuard == 0) {
                break L0;
              }
            }
            digestInput = source;
          }
          hash = new WhirlpoolHash();
          hash.reset(52);
          hash.updateBits(digestInput, (long)(bitsPerByte * length), 0);
          digest = new byte[64];
          hash.finishDigest(digest, 0, true);
          digestBeforeReturn = digest;
          return digestBeforeReturn;
        } catch (java.lang.RuntimeException digestFailure) {
          caughtDigestFailure = digestFailure;
          digestFailureForContext = caughtDigestFailure;
          digestFailureBeforeContext = digestFailureForContext;
          digestMessagePrefix = new StringBuilder().append("wh.MA(").append(length).append(',').append(sourceOffset).append(',');
          if (source == null) {
            sourceDescription = "null";
          } else {
            sourceDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) digestFailureBeforeContext), ((StringBuilder) (Object) digestMessagePrefix).append(sourceDescription).append(',').append(bitsPerByte).append(')').toString());
        }
    }

    final static void drawSortedHalfBlendRgbTriangle(int bottomGreen, int topRed, int topX, int middleGreen, int bottomY, int bottomBlue, int bottomRed, int middleBlue, int topY, int middleX, int middleRed, int[] destinationPixels, int topGreen, int bottomX, int topBlue, int middleY, int guard) {
        int invertedClipWidthOrLowerRows = 0;
        int invertedSpanStartOrNegativeOne = 0;
        RuntimeException rasterFailureBeforeContext = null;
        StringBuilder rasterMessagePrefix = null;
        String destinationDescription = null;
        RuntimeException caughtRasterFailure = null;
        int leftXQ16 = 0;
        RuntimeException rasterFailure = null;
        int rightXQ16 = 0;
        int leftXStepQ16 = 0;
        int rightXStepQ16 = 0;
        int leftRedQ16 = 0;
        int rightRedQ16 = 0;
        int leftRedStepQ16 = 0;
        int rightRedStepQ16 = 0;
        int leftGreenQ16 = 0;
        int rightGreenQ16 = 0;
        int leftGreenStepQ16 = 0;
        int rightGreenStepQ16 = 0;
        int leftBlueQ16 = 0;
        int rightBlueQ16 = 0;
        int leftBlueStepQ16 = 0;
        int rightBlueStepQ16 = 0;
        int middleVertexOnRight = 0;
        int topToBottomRows = 0;
        int edgeSegmentRowsThenRowBase = 0;
        int edgeSwapOrRowBaseOrLowerRowsThenLeftX = 0;
        int spanStartOrWidthOrBottomXQ16 = 0;
        int spanWidthOrRedStepOrBottomRedQ16 = 0;
        int spanRedStepOrGreenStepOrBottomGreenQ16 = 0;
        int spanGreenStepOrBlueStepOrBottomBlueQ16 = 0;
        int spanBlueStepQ16 = 0;
        int controlFlagSnapshot = 0;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          if ((bottomY >= 0) &&
              (~TriangleRasterState.clipHeight < ~topY)) {
            if ((topX < 0) &&
                (middleX < 0) &&
                (bottomX < 0)) {
              return;
            }
            if ((~TriangleRasterState.clipWidth >= ~topX) &&
                (~TriangleRasterState.clipWidth >= ~middleX) &&
                (bottomX >= TriangleRasterState.clipWidth)) {
              return;
            }
            if (guard != -1275583984) {
              return;
            }
            triangleEdgeInitialization: {
              topToBottomRows = -topY + bottomY;
              if (topY == middleY) {
                flatTopEdgeSelection: {
                  if (~bottomY == ~topY) {
                    leftBlueQ16 = topBlue;
                    leftXQ16 = topX << 16;
                    leftBlueStepQ16 = 0;
                    rightBlueQ16 = middleBlue;
                    leftXStepQ16 = 0;
                    leftRedQ16 = topRed;
                    rightRedStepQ16 = 0;
                    rightBlueStepQ16 = 0;
                    rightXStepQ16 = 0;
                    rightGreenQ16 = middleGreen;
                    leftRedStepQ16 = 0;
                    rightRedQ16 = middleRed;
                    leftGreenStepQ16 = 0;
                    rightGreenStepQ16 = 0;
                    rightXQ16 = middleX << 16;
                    leftGreenQ16 = topGreen;
                    if (controlFlagSnapshot == 0) {
                      break flatTopEdgeSelection;
                    }
                  }
                  edgeSegmentRowsThenRowBase = -middleY + bottomY;
                  if (middleX <= topX) {
                    leftGreenStepQ16 = (bottomGreen - middleGreen << 16) / edgeSegmentRowsThenRowBase;
                    leftBlueQ16 = middleBlue << 16;
                    rightXStepQ16 = (bottomX - topX << 16) / topToBottomRows;
                    rightRedStepQ16 = (bottomRed - topRed << 16) / topToBottomRows;
                    leftXQ16 = middleX << 16;
                    leftRedStepQ16 = (-middleRed + bottomRed << 16) / edgeSegmentRowsThenRowBase;
                    rightXQ16 = topX << 16;
                    leftBlueStepQ16 = (-middleBlue + bottomBlue << 16) / edgeSegmentRowsThenRowBase;
                    rightBlueStepQ16 = (-topBlue + bottomBlue << 16) / topToBottomRows;
                    leftGreenQ16 = middleGreen << 16;
                    rightBlueQ16 = topBlue << 16;
                    rightGreenStepQ16 = (-topGreen + bottomGreen << 16) / topToBottomRows;
                    leftXStepQ16 = (-middleX + bottomX << 16) / edgeSegmentRowsThenRowBase;
                    leftRedQ16 = middleRed << 16;
                    rightRedQ16 = topRed << 16;
                    rightGreenQ16 = topGreen << 16;
                    if (controlFlagSnapshot == 0) {
                      break flatTopEdgeSelection;
                    }
                  }
                  rightGreenStepQ16 = (bottomGreen - middleGreen << 16) / edgeSegmentRowsThenRowBase;
                  leftRedStepQ16 = (bottomRed - topRed << 16) / topToBottomRows;
                  leftXStepQ16 = (bottomX - topX << 16) / topToBottomRows;
                  leftGreenQ16 = topGreen << 16;
                  rightRedQ16 = middleRed << 16;
                  rightBlueStepQ16 = (bottomBlue - middleBlue << 16) / edgeSegmentRowsThenRowBase;
                  rightGreenQ16 = middleGreen << 16;
                  leftXQ16 = topX << 16;
                  rightRedStepQ16 = (-middleRed + bottomRed << 16) / edgeSegmentRowsThenRowBase;
                  leftRedQ16 = topRed << 16;
                  rightBlueQ16 = middleBlue << 16;
                  rightXQ16 = middleX << 16;
                  rightXStepQ16 = (bottomX - middleX << 16) / edgeSegmentRowsThenRowBase;
                  leftBlueStepQ16 = (bottomBlue - topBlue << 16) / topToBottomRows;
                  leftGreenStepQ16 = (bottomGreen - topGreen << 16) / topToBottomRows;
                  leftBlueQ16 = topBlue << 16;
                }
                middleVertexOnRight = 0;
                if (0 <= topY) {
                  break triangleEdgeInitialization;
                }
                topY = Math.min(-topY, middleY - topY);
                rightRedQ16 = rightRedQ16 + rightRedStepQ16 * topY;
                rightBlueQ16 = rightBlueQ16 + topY * rightBlueStepQ16;
                rightXQ16 = rightXQ16 + rightXStepQ16 * topY;
                leftXQ16 = leftXQ16 + leftXStepQ16 * topY;
                leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16 * topY;
                leftRedQ16 = leftRedQ16 + leftRedStepQ16 * topY;
                leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16 * topY;
                rightGreenQ16 = rightGreenQ16 + topY * rightGreenStepQ16;
                topY = 0;
                if (controlFlagSnapshot == 0) {
                  break triangleEdgeInitialization;
                }
              }
              upperEdgeOrientation: {
                rightXQ16 = topX << 16;
                leftXQ16 = topX << 16;
                rightBlueQ16 = topBlue << 16;
                leftBlueQ16 = topBlue << 16;
                rightGreenQ16 = topGreen << 16;
                leftGreenQ16 = topGreen << 16;
                rightRedQ16 = topRed << 16;
                leftRedQ16 = topRed << 16;
                edgeSegmentRowsThenRowBase = middleY - topY;
                rightXStepQ16 = (-topX + bottomX << 16) / topToBottomRows;
                leftXStepQ16 = (middleX - topX << 16) / edgeSegmentRowsThenRowBase;
                if (rightXStepQ16 <= leftXStepQ16) {
                  leftRedStepQ16 = (-topRed + bottomRed << 16) / topToBottomRows;
                  leftGreenStepQ16 = (-topGreen + bottomGreen << 16) / topToBottomRows;
                  leftBlueStepQ16 = (-topBlue + bottomBlue << 16) / topToBottomRows;
                  edgeSwapOrRowBaseOrLowerRowsThenLeftX = leftXStepQ16;
                  leftXStepQ16 = rightXStepQ16;
                  rightXStepQ16 = edgeSwapOrRowBaseOrLowerRowsThenLeftX;
                  rightGreenStepQ16 = (-topGreen + middleGreen << 16) / edgeSegmentRowsThenRowBase;
                  middleVertexOnRight = 1;
                  rightBlueStepQ16 = (-topBlue + middleBlue << 16) / edgeSegmentRowsThenRowBase;
                  rightRedStepQ16 = (-topRed + middleRed << 16) / edgeSegmentRowsThenRowBase;
                  if (controlFlagSnapshot == 0) {
                    break upperEdgeOrientation;
                  }
                }
                rightBlueStepQ16 = (-topBlue + bottomBlue << 16) / topToBottomRows;
                rightGreenStepQ16 = (bottomGreen - topGreen << 16) / topToBottomRows;
                leftRedStepQ16 = (middleRed - topRed << 16) / edgeSegmentRowsThenRowBase;
                rightRedStepQ16 = (-topRed + bottomRed << 16) / topToBottomRows;
                leftBlueStepQ16 = (middleBlue - topBlue << 16) / edgeSegmentRowsThenRowBase;
                leftGreenStepQ16 = (-topGreen + middleGreen << 16) / edgeSegmentRowsThenRowBase;
                middleVertexOnRight = 0;
              }
              upperSegmentCompletion: {
                upperSegmentScan: {
                  upperSegmentTopClip: {
                    if (topY < 0) {
                      if (middleY >= 0) {
                        topY = -topY;
                        rightBlueQ16 = rightBlueQ16 + rightBlueStepQ16 * topY;
                        rightGreenQ16 = rightGreenQ16 + topY * rightGreenStepQ16;
                        leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16 * topY;
                        leftGreenQ16 = leftGreenQ16 + topY * leftGreenStepQ16;
                        leftXQ16 = leftXQ16 + topY * leftXStepQ16;
                        rightXQ16 = rightXQ16 + topY * rightXStepQ16;
                        rightRedQ16 = rightRedQ16 + rightRedStepQ16 * topY;
                        leftRedQ16 = leftRedQ16 + topY * leftRedStepQ16;
                        topY = 0;
                        if (controlFlagSnapshot == 0) {
                          break upperSegmentTopClip;
                        }
                      }
                      topY = middleY - topY;
                      leftRedQ16 = leftRedQ16 + topY * leftRedStepQ16;
                      rightGreenQ16 = rightGreenQ16 + topY * rightGreenStepQ16;
                      leftXQ16 = leftXQ16 + topY * leftXStepQ16;
                      rightXQ16 = rightXQ16 + topY * rightXStepQ16;
                      leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16 * topY;
                      rightBlueQ16 = rightBlueQ16 + rightBlueStepQ16 * topY;
                      rightRedQ16 = rightRedQ16 + topY * rightRedStepQ16;
                      leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16 * topY;
                      topY = middleY;
                      if (controlFlagSnapshot == 0) {
                        break upperSegmentScan;
                      }
                    }
                  }
                  edgeSwapOrRowBaseOrLowerRowsThenLeftX = TriangleRasterState.rowBaseOffsets[topY];
                  while (!(~middleY >= ~topY)) {
                    spanStartOrWidthOrBottomXQ16 = leftXQ16 >> 16;
                    invertedClipWidthOrLowerRows = ~TriangleRasterState.clipWidth;
                    invertedSpanStartOrNegativeOne = ~spanStartOrWidthOrBottomXQ16;
                    if (controlFlagSnapshot != 0) {
                      break upperSegmentCompletion;
                    }
                    if (invertedClipWidthOrLowerRows < invertedSpanStartOrNegativeOne) {
                      spanWidthOrRedStepOrBottomRedQ16 = (rightXQ16 >> 16) - (leftXQ16 >> 16);
                      if (spanWidthOrRedStepOrBottomRedQ16 != 0) {
                        spanRedStepOrGreenStepOrBottomGreenQ16 = (rightRedQ16 - leftRedQ16) / spanWidthOrRedStepOrBottomRedQ16;
                        spanGreenStepOrBlueStepOrBottomBlueQ16 = (-leftGreenQ16 + rightGreenQ16) / spanWidthOrRedStepOrBottomRedQ16;
                        spanBlueStepQ16 = (rightBlueQ16 - leftBlueQ16) / spanWidthOrRedStepOrBottomRedQ16;
                        if (TriangleRasterState.clipWidth <= spanWidthOrRedStepOrBottomRedQ16 + spanStartOrWidthOrBottomXQ16) {
                          spanWidthOrRedStepOrBottomRedQ16 = -1 + (TriangleRasterState.clipWidth - spanStartOrWidthOrBottomXQ16);
                        }
                        if (0 <= spanStartOrWidthOrBottomXQ16) {
                          MultiHandleSliderRenderer.drawHalfBlendRgbGradientSpan(spanStartOrWidthOrBottomXQ16 + edgeSwapOrRowBaseOrLowerRowsThenLeftX, spanRedStepOrGreenStepOrBottomGreenQ16, 33423689, leftRedQ16, spanBlueStepQ16, leftGreenQ16, spanGreenStepOrBlueStepOrBottomBlueQ16, spanWidthOrRedStepOrBottomRedQ16, leftBlueQ16, destinationPixels);
                        } else {
                          MultiHandleSliderRenderer.drawHalfBlendRgbGradientSpan(edgeSwapOrRowBaseOrLowerRowsThenLeftX, spanRedStepOrGreenStepOrBottomGreenQ16, 33423689, -(spanRedStepOrGreenStepOrBottomGreenQ16 * spanStartOrWidthOrBottomXQ16) + leftRedQ16, spanBlueStepQ16, leftGreenQ16 - spanStartOrWidthOrBottomXQ16 * spanGreenStepOrBlueStepOrBottomBlueQ16, spanGreenStepOrBlueStepOrBottomBlueQ16, spanWidthOrRedStepOrBottomRedQ16 + spanStartOrWidthOrBottomXQ16, -(spanBlueStepQ16 * spanStartOrWidthOrBottomXQ16) + leftBlueQ16, destinationPixels);
                        }
                      } else {
                        if ((spanStartOrWidthOrBottomXQ16 >= 0) &&
                            (~spanStartOrWidthOrBottomXQ16 > ~TriangleRasterState.clipWidth)) {
                          MultiHandleSliderRenderer.drawHalfBlendRgbGradientSpan(spanStartOrWidthOrBottomXQ16 + edgeSwapOrRowBaseOrLowerRowsThenLeftX, 0, 33423689, leftRedQ16, 0, leftGreenQ16, 0, spanWidthOrRedStepOrBottomRedQ16, leftBlueQ16, destinationPixels);
                        }
                      }
                    }
                    topY++;
                    if (~topY <= ~TriangleRasterState.clipHeight) {
                      return;
                    }
                    rightXQ16 = rightXQ16 + rightXStepQ16;
                    rightGreenQ16 = rightGreenQ16 + rightGreenStepQ16;
                    rightRedQ16 = rightRedQ16 + rightRedStepQ16;
                    leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16;
                    leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16;
                    rightBlueQ16 = rightBlueQ16 + rightBlueStepQ16;
                    leftXQ16 = leftXQ16 + leftXStepQ16;
                    leftRedQ16 = leftRedQ16 + leftRedStepQ16;
                    edgeSwapOrRowBaseOrLowerRowsThenLeftX = edgeSwapOrRowBaseOrLowerRowsThenLeftX + SoftwareRasterizer.stride;
                    continue;
                  }
                }
                edgeSwapOrRowBaseOrLowerRowsThenLeftX = bottomY - middleY;
                invertedClipWidthOrLowerRows = ~edgeSwapOrRowBaseOrLowerRowsThenLeftX;
                invertedSpanStartOrNegativeOne = -1;
              }
              if (invertedClipWidthOrLowerRows == invertedSpanStartOrNegativeOne) {
                leftRedStepQ16 = 0;
                leftGreenStepQ16 = 0;
                rightXStepQ16 = 0;
                leftXStepQ16 = 0;
                rightRedStepQ16 = 0;
                leftBlueStepQ16 = 0;
                rightGreenStepQ16 = 0;
                rightBlueStepQ16 = 0;
                if (controlFlagSnapshot == 0) {
                  break triangleEdgeInitialization;
                }
              }
              lowerEdgeOriginSelection: {
                spanStartOrWidthOrBottomXQ16 = bottomX << 16;
                spanWidthOrRedStepOrBottomRedQ16 = bottomRed << 16;
                spanRedStepOrGreenStepOrBottomGreenQ16 = bottomGreen << 16;
                spanGreenStepOrBlueStepOrBottomBlueQ16 = bottomBlue << 16;
                if (middleVertexOnRight == 0) {
                  leftXQ16 = middleX << 16;
                  leftBlueQ16 = middleBlue << 16;
                  leftRedQ16 = middleRed << 16;
                  leftGreenQ16 = middleGreen << 16;
                  if (controlFlagSnapshot == 0) {
                    break lowerEdgeOriginSelection;
                  }
                }
                rightRedQ16 = middleRed << 16;
                rightXQ16 = middleX << 16;
                rightGreenQ16 = middleGreen << 16;
                rightBlueQ16 = middleBlue << 16;
              }
              rightGreenStepQ16 = (spanRedStepOrGreenStepOrBottomGreenQ16 - rightGreenQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              leftBlueStepQ16 = (-leftBlueQ16 + spanGreenStepOrBlueStepOrBottomBlueQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              leftXStepQ16 = (spanStartOrWidthOrBottomXQ16 - leftXQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              leftRedStepQ16 = (-leftRedQ16 + spanWidthOrRedStepOrBottomRedQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              leftGreenStepQ16 = (spanRedStepOrGreenStepOrBottomGreenQ16 - leftGreenQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              rightRedStepQ16 = (spanWidthOrRedStepOrBottomRedQ16 - rightRedQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              rightXStepQ16 = (spanStartOrWidthOrBottomXQ16 - rightXQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
              rightBlueStepQ16 = (-rightBlueQ16 + spanGreenStepOrBlueStepOrBottomBlueQ16) / edgeSwapOrRowBaseOrLowerRowsThenLeftX;
            }
            if (topY < 0) {
              topY = -topY;
              rightXQ16 = rightXQ16 + topY * rightXStepQ16;
              leftXQ16 = leftXQ16 + topY * leftXStepQ16;
              rightRedQ16 = rightRedQ16 + rightRedStepQ16 * topY;
              rightBlueQ16 = rightBlueQ16 + topY * rightBlueStepQ16;
              leftRedQ16 = leftRedQ16 + leftRedStepQ16 * topY;
              leftBlueQ16 = leftBlueQ16 + topY * leftBlueStepQ16;
              rightGreenQ16 = rightGreenQ16 + rightGreenStepQ16 * topY;
              leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16 * topY;
              topY = 0;
            }
            edgeSegmentRowsThenRowBase = TriangleRasterState.rowBaseOffsets[topY];
            while (bottomY > topY) {
              edgeSwapOrRowBaseOrLowerRowsThenLeftX = leftXQ16 >> 16;
              if (controlFlagSnapshot != 0) {
                return;
              }
              if (edgeSwapOrRowBaseOrLowerRowsThenLeftX < TriangleRasterState.clipWidth) {
                spanStartOrWidthOrBottomXQ16 = -(leftXQ16 >> 16) + (rightXQ16 >> 16);
                if (spanStartOrWidthOrBottomXQ16 != 0) {
                  spanWidthOrRedStepOrBottomRedQ16 = (rightRedQ16 - leftRedQ16) / spanStartOrWidthOrBottomXQ16;
                  spanRedStepOrGreenStepOrBottomGreenQ16 = (rightGreenQ16 - leftGreenQ16) / spanStartOrWidthOrBottomXQ16;
                  spanGreenStepOrBlueStepOrBottomBlueQ16 = (-leftBlueQ16 + rightBlueQ16) / spanStartOrWidthOrBottomXQ16;
                  if (spanStartOrWidthOrBottomXQ16 + edgeSwapOrRowBaseOrLowerRowsThenLeftX >= TriangleRasterState.clipWidth) {
                    spanStartOrWidthOrBottomXQ16 = TriangleRasterState.clipWidth - edgeSwapOrRowBaseOrLowerRowsThenLeftX - 1;
                  }
                  if (edgeSwapOrRowBaseOrLowerRowsThenLeftX < 0) {
                    MultiHandleSliderRenderer.drawHalfBlendRgbGradientSpan(edgeSegmentRowsThenRowBase, spanWidthOrRedStepOrBottomRedQ16, 33423689, leftRedQ16 - spanWidthOrRedStepOrBottomRedQ16 * edgeSwapOrRowBaseOrLowerRowsThenLeftX, spanGreenStepOrBlueStepOrBottomBlueQ16, leftGreenQ16 - edgeSwapOrRowBaseOrLowerRowsThenLeftX * spanRedStepOrGreenStepOrBottomGreenQ16, spanRedStepOrGreenStepOrBottomGreenQ16, spanStartOrWidthOrBottomXQ16 + edgeSwapOrRowBaseOrLowerRowsThenLeftX, -(edgeSwapOrRowBaseOrLowerRowsThenLeftX * spanGreenStepOrBlueStepOrBottomBlueQ16) + leftBlueQ16, destinationPixels);
                  } else {
                    MultiHandleSliderRenderer.drawHalfBlendRgbGradientSpan(edgeSwapOrRowBaseOrLowerRowsThenLeftX + edgeSegmentRowsThenRowBase, spanWidthOrRedStepOrBottomRedQ16, 33423689, leftRedQ16, spanGreenStepOrBlueStepOrBottomBlueQ16, leftGreenQ16, spanRedStepOrGreenStepOrBottomGreenQ16, spanStartOrWidthOrBottomXQ16, leftBlueQ16, destinationPixels);
                  }
                } else {
                  if ((edgeSwapOrRowBaseOrLowerRowsThenLeftX >= 0) &&
                      (TriangleRasterState.clipWidth > edgeSwapOrRowBaseOrLowerRowsThenLeftX)) {
                    MultiHandleSliderRenderer.drawHalfBlendRgbGradientSpan(edgeSegmentRowsThenRowBase + edgeSwapOrRowBaseOrLowerRowsThenLeftX, 0, 33423689, leftRedQ16, 0, leftGreenQ16, 0, spanStartOrWidthOrBottomXQ16, leftBlueQ16, destinationPixels);
                  }
                }
              }
              topY++;
              if (~TriangleRasterState.clipHeight >= ~topY) {
                return;
              }
              rightXQ16 = rightXQ16 + rightXStepQ16;
              rightRedQ16 = rightRedQ16 + rightRedStepQ16;
              edgeSegmentRowsThenRowBase = edgeSegmentRowsThenRowBase + SoftwareRasterizer.stride;
              leftGreenQ16 = leftGreenQ16 + leftGreenStepQ16;
              rightGreenQ16 = rightGreenQ16 + rightGreenStepQ16;
              leftBlueQ16 = leftBlueQ16 + leftBlueStepQ16;
              leftRedQ16 = leftRedQ16 + leftRedStepQ16;
              leftXQ16 = leftXQ16 + leftXStepQ16;
              rightBlueQ16 = rightBlueQ16 + rightBlueStepQ16;
              continue;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException caughtRasterParameter) {
          caughtRasterFailure = caughtRasterParameter;
          rasterFailure = caughtRasterFailure;
          rasterFailureBeforeContext = rasterFailure;
          rasterMessagePrefix = new StringBuilder().append("wh.KA(").append(bottomGreen).append(',').append(topRed).append(',').append(topX).append(',').append(middleGreen).append(',').append(bottomY).append(',').append(bottomBlue).append(',').append(bottomRed).append(',').append(middleBlue).append(',').append(topY).append(',').append(middleX).append(',').append(middleRed).append(',');
          if (destinationPixels == null) {
            destinationDescription = "null";
          } else {
            destinationDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) rasterFailureBeforeContext), ((StringBuilder) (Object) rasterMessagePrefix).append(destinationDescription).append(',').append(topGreen).append(',').append(bottomX).append(',').append(topBlue).append(',').append(middleY).append(',').append(guard).append(')').toString());
        }
    }

    final static void writeCachedRandomSeedBytes(ByteArrayBuffer outputBuffer, boolean preserveTemplateTypeNine) {
        try {
            RuntimeException seedFailureForContext = null;
            byte[] seedBytes = null;
            int clientControlSnapshot = 0;
            int seedScanComparisonLeft = 0;
            int seedScanComparisonRight = 0;
            RuntimeException seedFailureBeforeDescription = null;
            StringBuilder seedMessagePrefix = null;
            String bufferDescription = null;
            int seedReadContinuation = 0;
            Throwable caughtSeedThrowable = null;
            int seedByteIndex = 0;
            Exception ignoredSeedReadFailure = null;
            int fallbackByteIndex = 0;
            clientControlSnapshot = Geoblox.clientControlFlowFlag;
            try {
              seedPayloadWrite: {
                seedBytes = new byte[24];
                if (null != CacheFileState.randomSeedFile) {
                  try {
                    CacheFileState.randomSeedFile.seek(51, 0L);
                    CacheFileState.randomSeedFile.readAll((byte) -76, seedBytes);
                    seedByteIndex = 0;
                    while (true) {
                      seedByteComparisonOperands: {
                        if (seedByteIndex < 24) {
                          seedScanComparisonLeft = ~seedBytes[seedByteIndex];
                          seedScanComparisonRight = -1;
                          if (clientControlSnapshot != 0) {
                            break seedByteComparisonOperands;
                          }
                          if (((seedScanComparisonLeft == seedScanComparisonRight) ||
                              (clientControlSnapshot != 0))) {
                            seedByteIndex++;
                            continue;
                          }
                        }
                        seedScanComparisonLeft = 24;
                        seedScanComparisonRight = seedByteIndex;
                      }
                      if (seedScanComparisonLeft <= seedScanComparisonRight) {
                        throw new IOException();
                      }
                      seedReadContinuation = 0;
                      break;
                    }
                  } catch (java.lang.Exception seedReadFailure) {
                    caughtSeedThrowable = seedReadFailure;
                    seedReadFailureFallback: {
                      ignoredSeedReadFailure = (Exception) (Object) caughtSeedThrowable;
                      fallbackByteIndex = 0;
                      while (fallbackByteIndex < 24) {
                        seedBytes[fallbackByteIndex] = (byte) -1;
                        fallbackByteIndex++;
                        if (clientControlSnapshot != 0) {
                          seedReadContinuation = 1;
                          break seedReadFailureFallback;
                        }
                        continue;
                      }
                      seedReadContinuation = 0;
                    }
                  }
                  if ((seedReadContinuation != 0)) {
                    break seedPayloadWrite;
                  }
                }
                outputBuffer.writeBytes(24, -97, seedBytes, 0);
              }
              if (!preserveTemplateTypeNine) {
                textTemplateArgumentTypeNine = (TextTemplateArgumentType) null;
              }
              return;
            } catch (java.lang.RuntimeException seedFailure) {
              caughtSeedThrowable = seedFailure;
              seedFailureForContext = (RuntimeException) (Object) caughtSeedThrowable;
              seedFailureBeforeDescription = seedFailureForContext;
              seedMessagePrefix = new StringBuilder().append("wh.IA(");
              if (outputBuffer == null) {
                bufferDescription = "null";
              } else {
                bufferDescription = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) seedFailureBeforeDescription), ((StringBuilder) (Object) seedMessagePrefix).append(bufferDescription).append(',').append(preserveTemplateTypeNine).append(')').toString());
            }
        } catch (RuntimeException | Error uncheckedBoundaryFailure) {
            throw uncheckedBoundaryFailure;
        } catch (Throwable checkedBoundaryFailure) {
            throw new RuntimeException(checkedBoundaryFailure);
        }
    }

    public static void releaseStaticReferences(int methodGuard) {
        RuntimeException caughtCleanupFailure = null;
        RuntimeException cleanupFailureForContext = null;
        try {
          if (methodGuard != 5514) {
            SpriteState.releaseStaticReferences(32);
          }
          loadingOverlayText = null;
          textTemplateArgumentTypeNine = null;
          return;
        } catch (java.lang.RuntimeException cleanupFailure) {
          caughtCleanupFailure = cleanupFailure;
          cleanupFailureForContext = caughtCleanupFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) cleanupFailureForContext), "wh.LA(" + methodGuard + ')');
        }
    }

    final static boolean isReconnectingLoginMode(int methodGuard) {
        RuntimeException queryFailureForContext = null;
        boolean reconnectModeBeforeReturn = false;
        RuntimeException caughtQueryFailure = null;
        try {
          if (methodGuard == 0) {
            reconnectModeBeforeReturn = AgeValidator.reconnectingLoginMode;
            return reconnectModeBeforeReturn;
          }
          return false;
        } catch (java.lang.RuntimeException queryFailure) {
          caughtQueryFailure = queryFailure;
          queryFailureForContext = caughtQueryFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) queryFailureForContext), "wh.NA(" + methodGuard + ')');
        }
    }

    SpriteState() {
    }

    static {
        loadingOverlayText = null;
        textTemplateArgumentTypeNine = new TextTemplateArgumentType(9, 0, 4, 1);
    }
}
