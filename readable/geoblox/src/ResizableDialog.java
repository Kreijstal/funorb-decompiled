/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ResizableDialog extends FadingDialog {
    static int[] awtKeyCodeToInternalCode;
    private int resizeStartWidth;
    static String connectionRestoredText;
    private int resizeTargetHeight;
    private int resizeDurationTicks;
    private int resizeTargetWidth;
    private int resizeStartHeight;
    static ClientProtocolStage awaitingInitialLoginReplyStage;
    private int resizeTick;
    static int tooltipAgeTicks;
    static boolean legacyJavaCanvasRefreshRequired;

    public static void releaseResizableDialogResources(int methodGuard) {
        awaitingInitialLoginReplyStage = null;
        if (methodGuard != 89) {
            legacyJavaCanvasRefreshRequired = false;
        }
        awtKeyCodeToInternalCode = null;
        connectionRestoredText = null;
    }

    boolean settleDialogAnimation(int methodGuard) {
        this.finishTransition(true);
        if (methodGuard != 229) {
            this.advanceDialogAnimation(45);
        }
        return super.settleDialogAnimation(229);
    }

    final void startResizeTransition(int targetHeight, int targetWidth, int methodGuard, int durationTicks) {
        if ((durationTicks <= 0)) {
            this.resizeAndCenter(targetHeight, methodGuard + 5373, targetWidth);
            return;
        }
        this.resizeStartWidth = this.widgetWidth;
        this.resizeTick = 0;
        if (methodGuard != -5269) {
            this.resizeStartWidth = 59;
        }
        this.resizeTargetHeight = targetHeight;
        this.resizeStartHeight = this.widgetHeight;
        this.resizeTargetWidth = targetWidth;
        this.resizeDurationTicks = durationTicks;
    }

    final static String getAccountNameValidationError(byte methodGuard, CharSequence candidateName) {
        RuntimeException nameValidationFailureForContext = null;
        String guardedNullValidationResult = null;
        String validationErrorBeforeReturn = null;
        RuntimeException nameFailureBeforeContext = null;
        StringBuilder nameMessagePrefix = null;
        String nameDescription = null;
        RuntimeException caughtNameValidationFailure = null;
        try {
          if (methodGuard == 44) {
            validationErrorBeforeReturn = AccountContentDialog.accountNameValidationMessage(false, false, candidateName);
            return validationErrorBeforeReturn;
          }
          guardedNullValidationResult = (String) null;
          return guardedNullValidationResult;
        } catch (java.lang.RuntimeException nameValidationFailure) {
          caughtNameValidationFailure = nameValidationFailure;
          nameValidationFailureForContext = caughtNameValidationFailure;
          nameFailureBeforeContext = nameValidationFailureForContext;
          nameMessagePrefix = new StringBuilder().append("oe.V(").append(methodGuard).append(',');
          if (candidateName == null) {
            nameDescription = "null";
          } else {
            nameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) nameFailureBeforeContext), ((StringBuilder) (Object) nameMessagePrefix).append(nameDescription).append(')').toString());
        }
    }

    void finishTransition(boolean finishResize) {
        if (this.resizeDurationTicks <= 0) {
            return;
        }
        if (!finishResize) {
            return;
        }
        this.resizeAndCenter(this.resizeTargetHeight, 105, this.resizeTargetWidth);
        this.resizeDurationTicks = 0;
        this.onResizeTransitionComplete(-107);
    }

    final static void clearMeshDepthBucketCounts(int startIndex) {
        int[] depthBucketCountsAlias = null;
        int clearIndex = 0;
        int arrayLength = 0;
        int controlFlagSnapshot = 0;
        int[] depthBucketCounts = null;
        RuntimeException caughtFailure = null;
        RuntimeException contextFailure = null;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        try {
          depthBucketCounts = GameApplet.meshFaceCountsByDepthBucket;
          depthBucketCountsAlias = depthBucketCounts;
          clearIndex = startIndex;
          arrayLength = depthBucketCounts.length;
          while (clearIndex < arrayLength) {
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
            depthBucketCounts[clearIndex++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          contextFailure = caughtFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) contextFailure), "oe.N(" + startIndex + ')');
        }
    }

    ResizableDialog(DialogLayer dialogLayer, int initialWidth, int initialHeight) {
        super(dialogLayer, initialWidth, initialHeight);
        this.resizeDurationTicks = 0;
        this.resizeTick = 0;
    }

    void onResizeTransitionComplete(int methodGuard) {
        if (methodGuard > -20) {
            this.resizeTargetWidth = 122;
        }
    }

    final static int computeCrc32(int endPosition, byte[] bytes, int methodGuard, int startPosition) {
        int byteIndex = 0;
        int crcAccumulator = 0;
        RuntimeException checksumFailureForContext = null;
        CharSequence unusedNullTextSnapshot = null;
        int checksumBeforeReturn = 0;
        RuntimeException checksumFailureBeforeDescription = null;
        StringBuilder checksumMessagePrefix = null;
        String bytesDescription = null;
        RuntimeException caughtChecksumFailure = null;
        try {
          if (methodGuard > -27) {
            unusedNullTextSnapshot = (CharSequence) null;
            ResizableDialog.normalizeSessionName((CharSequence) null, -115);
          }
          crcAccumulator = -1;
          for (byteIndex = startPosition; byteIndex < endPosition; byteIndex++) {
            crcAccumulator = ClientTimingSupport.crc32Table[(crcAccumulator ^ bytes[byteIndex]) & 255] ^ crcAccumulator >>> 8;
          }
          crcAccumulator = ~crcAccumulator;
          checksumBeforeReturn = crcAccumulator;
          return checksumBeforeReturn;
        } catch (java.lang.RuntimeException checksumFailure) {
          caughtChecksumFailure = checksumFailure;
          checksumFailureForContext = caughtChecksumFailure;
          checksumFailureBeforeDescription = checksumFailureForContext;
          checksumMessagePrefix = new StringBuilder().append("oe.P(").append(endPosition).append(',');
          if (bytes == null) {
            bytesDescription = "null";
          } else {
            bytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) checksumFailureBeforeDescription), ((StringBuilder) (Object) checksumMessagePrefix).append(bytesDescription).append(',').append(methodGuard).append(',').append(startPosition).append(')').toString());
        }
    }

    boolean advanceDialogAnimation(int methodGuard) {
        int frameWidth = 0;
        int frameHeight = 0;
        int nextResizeTick = 0;
        int durationSquared = 0;
        int easingNumerator = 0;
        if (~this.resizeDurationTicks < methodGuard) {
            frameWidth = this.resizeTargetWidth;
            frameHeight = this.resizeTargetHeight;
            nextResizeTick = this.resizeTick + 1;
            this.resizeTick = this.resizeTick + 1;
            if (nextResizeTick < this.resizeDurationTicks) {
                easingNumerator = (-this.resizeTick + 2 * this.resizeDurationTicks) * this.resizeTick;
                durationSquared = this.resizeDurationTicks * this.resizeDurationTicks;
                frameWidth = this.resizeStartWidth + easingNumerator * (this.resizeTargetWidth - this.resizeStartWidth) / durationSquared;
                frameHeight = easingNumerator * (this.resizeTargetHeight - this.resizeStartHeight) / durationSquared + this.resizeStartHeight;
            } else {
                this.resizeDurationTicks = 0;
                this.onResizeTransitionComplete(-31);
            }
            this.resizeAndCenter(frameHeight, 113, frameWidth);
        }
        return super.advanceDialogAnimation(methodGuard ^ 0);
    }

    final static void setPendingTooltipAnchor(int anchorY, byte methodGuard, int anchorX) {
        NodeHashTableIterator.pendingTooltipAnchorX = anchorX;
        if (methodGuard > -20) {
            return;
        }
        DequeCursor.pendingTooltipAnchorY = anchorY;
    }

    final static String normalizeSessionName(CharSequence nameText, int methodGuard) {
        int characterIndex = 0;
        StringBuilder unusedAppendResult = null;
        Object nullNameResult = null;
        String normalizedNameResult = null;
        RuntimeException normalizationFailureBeforeContext = null;
        StringBuilder normalizationMessagePrefix = null;
        String nameDescription = null;
        RuntimeException caughtNormalizationFailure = null;
        int trimmedStart = 0;
        RuntimeException normalizationFailureForContext = null;
        int trimmedEnd = 0;
        int trimmedLength = 0;
        StringBuilder normalizedNameBuilder = null;
        int sourceCharacter = 0;
        int normalizedCharacter = 0;
        try {
          if (nameText == null) {
            return null;
          }
          trimmedStart = 0;
          trimmedEnd = nameText.length();
          while (trimmedEnd > trimmedStart) {
            if (NameCharacterSupport.isNameSeparator((byte) 125, nameText.charAt(trimmedStart))) {
              trimmedStart++;
              continue;
            }
            break;
          }
          while (trimmedStart < trimmedEnd) {
            if (NameCharacterSupport.isNameSeparator((byte) -47, nameText.charAt(trimmedEnd - 1))) {
              trimmedEnd--;
              continue;
            }
            break;
          }
          trimmedLength = -trimmedStart + trimmedEnd;
          if (1 > trimmedLength) {
            return null;
          }
          if (12 < trimmedLength) {
            return null;
          }
          if (methodGuard != 12) {
            connectionRestoredText = (String) null;
          }
          normalizedNameBuilder = new StringBuilder(trimmedLength);
          for (characterIndex = trimmedStart; characterIndex < trimmedEnd; characterIndex++) {
            sourceCharacter = nameText.charAt(characterIndex);
            if (TextHotspotBounds.isAllowedNameCharacter((char) sourceCharacter, -47)) {
              normalizedCharacter = ValidatedTextInputWidget.normalizeNameCharacter((char) sourceCharacter, methodGuard - 239);
              if (normalizedCharacter != 0) {
                unusedAppendResult = normalizedNameBuilder.append((char) normalizedCharacter);
              }
            }
          }
          if (normalizedNameBuilder.length() != 0) {
            normalizedNameResult = normalizedNameBuilder.toString();
            return normalizedNameResult;
          }
          nullNameResult = null;
          return (String) (nullNameResult);
        } catch (java.lang.RuntimeException normalizationFailure) {
          caughtNormalizationFailure = normalizationFailure;
          normalizationFailureForContext = caughtNormalizationFailure;
          normalizationFailureBeforeContext = normalizationFailureForContext;
          normalizationMessagePrefix = new StringBuilder().append("oe.L(");
          if (nameText == null) {
            nameDescription = "null";
          } else {
            nameDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) normalizationFailureBeforeContext), ((StringBuilder) (Object) normalizationMessagePrefix).append(nameDescription).append(',').append(methodGuard).append(')').toString());
        }
    }

    final static void handleAchievementGridClick(boolean onlyNewAchievements, boolean compactAchievementRows, int methodGuard) {
        int previousAllViewEntryCount = 0;
        int previousNewViewEntryCount = 0;
        int selectedMaskBeforeAssignment = 0;
        RuntimeException caughtAchievementClickFailure = null;
        int iconX = 0;
        RuntimeException achievementClickFailureForContext = null;
        int iconY = 0;
        int selectedAchievementMask = 0;
        int visibleIconCount = 0;
        int missingMaskHorizontalOffset = 0;
        int missingFirstSixteenCount = 0;
        int achievementIndex = 0;
        int clientControlSnapshot = 0;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          iconX = 160;
          iconY = 190;
          if (!compactAchievementRows) {
            iconY -= 10;
          }
          if (onlyNewAchievements) {
            selectedMaskBeforeAssignment = ScorePopupSupport.newAchievementMask;
          } else {
            selectedMaskBeforeAssignment = InstrumentPatch.earnedAchievementMask;
          }
          selectedAchievementMask = selectedMaskBeforeAssignment;
          visibleIconCount = 0;
          if (methodGuard != 160) {
            return;
          }
          missingMaskHorizontalOffset = 0;
          missingFirstSixteenCount = 0;
          if (!onlyNewAchievements) {
            if (missingFirstSixteenCount >= 8) {
              iconX = iconX + (-160 + missingMaskHorizontalOffset);
            }
            for (achievementIndex = 0; GameplaySetupSupport.achievementTitles.length > achievementIndex; achievementIndex++) {
              if ((((1 << achievementIndex & selectedAchievementMask) != 0) ||
                    (!(onlyNewAchievements))) &&
                  ((ClientOptionSupport.isClientOptionEnabled(0, 88)) ||
                    (achievementIndex != 16) ||
                    (AchievementQuery.hasReceivedAchievementSixteen(109)))) {
                if ((AccountCreationSupport.pointerPressXSnapshot >= iconX) &&
                    (AccountCreationSupport.pointerPressXSnapshot <= iconX + 32) &&
                    (iconY <= FullscreenFocusCanvas.pointerPressYSnapshot) &&
                    (FullscreenFocusCanvas.pointerPressYSnapshot <= iconY + 32)) {
                  if (BoardEntityState.selectedAchievementIndex == achievementIndex) {
                    BoardEntityState.selectedAchievementIndex = -1;
                    return;
                  }
                  BoardEntityState.selectedAchievementIndex = achievementIndex;
                  return;
                }
                previousAllViewEntryCount = visibleIconCount;
                visibleIconCount++;
                if (7 != previousAllViewEntryCount) {
                  iconX += 40;
                } else {
                  iconX = 160;
                  iconY += 40;
                  if (!compactAchievementRows) {
                    iconY += 5;
                  }
                  if ((onlyNewAchievements) &&
                      (missingFirstSixteenCount < 8)) {
                    iconX = iconX + missingMaskHorizontalOffset;
                  }
                }
              }
            }
          } else {
            for (achievementIndex = 15; achievementIndex >= 0; achievementIndex--) {
              if ((selectedAchievementMask & 1 << achievementIndex) == 0) {
                missingMaskHorizontalOffset += 20;
                missingFirstSixteenCount++;
              }
            }
            if (missingFirstSixteenCount >= 8) {
              iconX = iconX + (-160 + missingMaskHorizontalOffset);
            }
            for (achievementIndex = 0; GameplaySetupSupport.achievementTitles.length > achievementIndex; achievementIndex++) {
              if ((((1 << achievementIndex & selectedAchievementMask) != 0) ||
                    (!(onlyNewAchievements))) &&
                  ((ClientOptionSupport.isClientOptionEnabled(0, 88)) ||
                    (achievementIndex != 16) ||
                    (AchievementQuery.hasReceivedAchievementSixteen(109)))) {
                if ((AccountCreationSupport.pointerPressXSnapshot >= iconX) &&
                    (AccountCreationSupport.pointerPressXSnapshot <= iconX + 32) &&
                    (iconY <= FullscreenFocusCanvas.pointerPressYSnapshot) &&
                    (FullscreenFocusCanvas.pointerPressYSnapshot <= iconY + 32)) {
                  if (BoardEntityState.selectedAchievementIndex == achievementIndex) {
                    BoardEntityState.selectedAchievementIndex = -1;
                    return;
                  }
                  BoardEntityState.selectedAchievementIndex = achievementIndex;
                  return;
                }
                previousNewViewEntryCount = visibleIconCount;
                visibleIconCount++;
                if (7 != previousNewViewEntryCount) {
                  iconX += 40;
                } else {
                  iconX = 160;
                  iconY += 40;
                  if (!compactAchievementRows) {
                    iconY += 5;
                  }
                  if ((onlyNewAchievements) &&
                      (missingFirstSixteenCount < 8)) {
                    iconX = iconX + missingMaskHorizontalOffset;
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException achievementClickFailure) {
          caughtAchievementClickFailure = achievementClickFailure;
          achievementClickFailureForContext = caughtAchievementClickFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) achievementClickFailureForContext), "oe.R(" + onlyNewAchievements + ',' + compactAchievementRows + ',' + methodGuard + ')');
        }
    }

    void drawDialogFrame(int x, int methodGuard, int y) {
        int bandHeight;
        int bandStartGray;
        int bandEndGray;
        int bandRowIndex;
        int rasterY;
        int rowGrayOrRgb;
        int leftEdgeOffset;
        int rightEdgeOffset;
        int leftCornerDistanceSquaredOrRightEdgeLimit;
        int leftCornerRgbOrRightCornerX;
        int rightCornerDistanceSquared;
        int rightCornerRgb;
        int unusedClientControlSnapshot;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        SoftwareRasterizer.fillVerticalGradient(x + 6, y + 35, -12 + this.widgetWidth, -40 + this.widgetHeight, 2105376, 0);
        bandStartGray = 211;
        bandHeight = 35;
        bandEndGray = 194;
        bandRowIndex = 0;
        rasterY = y;
        while (bandHeight > bandRowIndex) {
          if (~rasterY > ~SoftwareRasterizer.clipTop) {
            rasterY++;
            bandRowIndex++;
            continue;
          }
          if (SoftwareRasterizer.clipBottom <= rasterY) {
            rasterY++;
            bandRowIndex++;
            continue;
          }
          rowGrayOrRgb = (-bandStartGray + bandEndGray) * bandRowIndex / bandHeight + bandStartGray;
          leftEdgeOffset = 0;
          rightEdgeOffset = this.widgetWidth;
          if (bandRowIndex <= 20) {
            while ((leftEdgeOffset <= 20)) {
              leftCornerDistanceSquaredOrRightEdgeLimit = (-bandRowIndex + 20) * (-bandRowIndex + 20) + (-leftEdgeOffset + 20) * (20 - leftEdgeOffset);
              if (leftCornerDistanceSquaredOrRightEdgeLimit > 462) {
                leftEdgeOffset++;
                continue;
              }
              if (leftCornerDistanceSquaredOrRightEdgeLimit < 420) {
                break;
              }
              leftCornerRgbOrRightCornerX = (-leftCornerDistanceSquaredOrRightEdgeLimit + 462) * rowGrayOrRgb / 42;
              leftCornerRgbOrRightCornerX = leftCornerRgbOrRightCornerX | (leftCornerRgbOrRightCornerX << 8 | leftCornerRgbOrRightCornerX << 16);
              SoftwareRasterizer.framebuffer[rasterY * SoftwareRasterizer.stride + x + leftEdgeOffset] = leftCornerRgbOrRightCornerX;
              leftEdgeOffset++;
              continue;
            }
          }
          if (20 >= bandRowIndex) {
            leftCornerDistanceSquaredOrRightEdgeLimit = rightEdgeOffset;
            rightEdgeOffset -= 21;
            for (leftCornerRgbOrRightCornerX = 0; leftCornerRgbOrRightCornerX <= 20; leftCornerRgbOrRightCornerX++) {
              rightCornerDistanceSquared = (-bandRowIndex + 20) * (-bandRowIndex + 20) + leftCornerRgbOrRightCornerX * leftCornerRgbOrRightCornerX;
              if (rightCornerDistanceSquared <= 462) {
                if (rightCornerDistanceSquared < 420) {
                  leftCornerDistanceSquaredOrRightEdgeLimit = rightEdgeOffset + 1;
                  rightEdgeOffset++;
                  continue;
                }
                rightCornerRgb = rowGrayOrRgb * (462 - rightCornerDistanceSquared) / 42;
                rightCornerRgb = rightCornerRgb | (rightCornerRgb << 8 | rightCornerRgb << 16);
                SoftwareRasterizer.framebuffer[rightEdgeOffset + x + SoftwareRasterizer.stride * rasterY] = rightCornerRgb;
                rightEdgeOffset++;
                continue;
              }
              break;
            }
            rightEdgeOffset = leftCornerDistanceSquaredOrRightEdgeLimit;
          }
          rowGrayOrRgb = rowGrayOrRgb | (rowGrayOrRgb << 16 | rowGrayOrRgb << 8);
          SoftwareRasterizer.drawHorizontalLine(leftEdgeOffset + x, rasterY, rightEdgeOffset - leftEdgeOffset, rowGrayOrRgb);
          rasterY++;
          bandRowIndex++;
        }
        bandHeight = 22;
        bandStartGray = 194;
        bandEndGray = 169;
        bandRowIndex = 0;
        rasterY = 35 + y;
        while (bandRowIndex < bandHeight) {
          rowGrayOrRgb = bandStartGray + (-bandStartGray + bandEndGray) * bandRowIndex / bandHeight;
          rowGrayOrRgb = rowGrayOrRgb | (rowGrayOrRgb << 8 | rowGrayOrRgb << 16);
          SoftwareRasterizer.drawHorizontalLine(x, rasterY, 6, rowGrayOrRgb);
          SoftwareRasterizer.drawHorizontalLine(this.widgetWidth + x - 6, rasterY, 6, rowGrayOrRgb);
          bandRowIndex++;
          rasterY++;
        }
        AvatarFeedbackSupport.grayJagexLogoSprite.draw(-90 + this.widgetWidth + x, 10 + y);
        if (methodGuard != 20) {
          this.resizeTargetHeight = -34;
        }
        InstrumentPatch.drawHorizontalThreePartStrip(RasterTargetRestoreSupport.dialogTopFrameSprites, -10 + this.widgetWidth, 35 + y, 5 + x, (byte) 107);
        InstrumentPatch.drawHorizontalThreePartStrip(UnderlinedButtonRenderer.frameBottomSprites, this.widgetWidth, -22 + (this.widgetHeight + y), x, (byte) 107);
        bandHeight = this.widgetHeight - 79;
        bandStartGray = 169;
        bandEndGray = 127;
        bandRowIndex = 0;
        rasterY = y + 57;
        while (bandRowIndex < bandHeight) {
          rowGrayOrRgb = bandRowIndex * (bandEndGray - bandStartGray) / bandHeight + bandStartGray;
          rowGrayOrRgb = rowGrayOrRgb | (rowGrayOrRgb << 16 | rowGrayOrRgb << 8);
          SoftwareRasterizer.drawHorizontalLine(x, rasterY, 6, rowGrayOrRgb);
          SoftwareRasterizer.drawHorizontalLine(-6 + (this.widgetWidth + x), rasterY, 6, rowGrayOrRgb);
          rasterY++;
          bandRowIndex++;
        }
    }

    static {
        awtKeyCodeToInternalCode = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        connectionRestoredText = "Connection restored.";
        awaitingInitialLoginReplyStage = new ClientProtocolStage();
        tooltipAgeTicks = 0;
        legacyJavaCanvasRefreshRequired = false;
    }
}
