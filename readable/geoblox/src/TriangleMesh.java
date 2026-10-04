/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleMesh {
    short[] optionalPackedShortStreamOne;
    byte[] facePriorities;
    static int pendingUpdateTicks;
    int[] thirdVertexSourceX;
    int[] firstVertexSourceY;
    short[] normalZ;
    short[] faceVertexB;
    short[] normalX;
    int[] secondVertexSourceX;
    short[] optionalPackedShortStreamTwo;
    byte facePriorityCount;
    int minX;
    int[] secondVertexSourceZ;
    int maxZ;
    int[] thirdVertexSourceY;
    int[] secondVertexSourceY;
    short[] faceNormalC;
    short[] faceNormalB;
    short[] vertexZ;
    short[] vertexX;
    short faceCount;
    static int screenTransitionTick;
    int[] thirdVertexSourceZ;
    private boolean boundsValid;
    int[] firstVertexSourceX;
    short[] faceVertexC;
    short[] faceNormalA;
    short[] faceVertexA;
    int[] firstVertexSourceZ;
    static String reloadGameText;
    short[] optionalPackedShortStreamThree;
    int maxY;
    short[] faceMaterialIndices;
    short normalCount;
    short[] optionalPackedShortStreamFive;
    short[] normalY;
    static IntrusiveDeque pendingScoreSubmissions;
    int minY;
    short[] optionalPackedShortStreamFour;
    int maxX;
    int minZ;
    short[] vertexY;
    short vertexCount;

    final void scaleVertices(int scaleY, int divisor, byte guard, int scaleX, int scaleZ) {
        int vertexIndex = 0;
        int controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        for (vertexIndex = 0; vertexIndex < this.vertexCount; vertexIndex++) {
            this.vertexX[vertexIndex] = (short)(scaleX * this.vertexX[vertexIndex] / divisor);
            this.vertexY[vertexIndex] = (short)(this.vertexY[vertexIndex] * scaleY / divisor);
            this.vertexZ[vertexIndex] = (short)(this.vertexZ[vertexIndex] * scaleZ / divisor);
        }
        if (guard <= 69) {
            TriangleMesh.prepareRankedEntryArrays(-90, 1, 93);
        }
        this.invalidateBounds(-7008);
    }

    final static int chooseSpawnSpriteVariant(byte methodGuard) {
        if (methodGuard >= -55) {
            return 66;
        }
        return AchievementQuery.nextSpriteVariantIndex(EmailValidator.availableSpriteVariantCount, 1);
    }

    public static void releaseStaticReferences(byte methodGuard) {
        pendingScoreSubmissions = null;
        reloadGameText = null;
        if (methodGuard != 115) {
            TriangleMesh.prepareRankedEntryArrays(124, -30, -53);
        }
    }

    final void translateVertices(int deltaX, int deltaY, int guard, int deltaZ) {
        int vertexIndex = 0;
        int controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        for (vertexIndex = 0; this.vertexCount > vertexIndex; vertexIndex++) {
            this.vertexX[vertexIndex] = (short)(this.vertexX[vertexIndex] + deltaX);
            this.vertexY[vertexIndex] = (short)(this.vertexY[vertexIndex] + deltaY);
            this.vertexZ[vertexIndex] = (short)(this.vertexZ[vertexIndex] + deltaZ);
        }
        this.invalidateBounds(-7008);
        if (guard != -9121) {
            this.optionalPackedShortStreamFive = (short[]) null;
        }
    }

    final void refreshBounds(byte guard) {
        int vertexIndex = 0;
        int minimumX;
        int minimumY;
        int minimumZ;
        int maximumX;
        int maximumY;
        int maximumZ;
        int vertexXValue;
        int vertexYValue;
        int vertexZValue;
        int controlFlagSnapshot;
        controlFlagSnapshot = Geoblox.clientControlFlowFlag;
        if (this.boundsValid) {
          return;
        }
        this.boundsValid = true;
        minimumX = 32767;
        minimumY = 32767;
        minimumZ = 32767;
        maximumX = -32768;
        maximumY = -32768;
        maximumZ = -32768;
        for (vertexIndex = 0; this.vertexCount > vertexIndex; vertexIndex++) {
          vertexXValue = this.vertexX[vertexIndex];
          vertexYValue = this.vertexY[vertexIndex];
          if (~vertexYValue > ~minimumY) {
            minimumY = vertexYValue;
          }
          if (maximumY < vertexYValue) {
            maximumY = vertexYValue;
          }
          vertexZValue = this.vertexZ[vertexIndex];
          if (vertexXValue < minimumX) {
            minimumX = vertexXValue;
          }
          if (vertexXValue > maximumX) {
            maximumX = vertexXValue;
          }
          if (vertexZValue > maximumZ) {
            maximumZ = vertexZValue;
          }
          if (minimumZ <= vertexZValue) {
            continue;
          }
          minimumZ = vertexZValue;
        }
        this.maxY = maximumY;
        this.minY = minimumY;
        this.minZ = minimumZ;
        this.maxX = maximumX;
        if (guard != -99) {
          this.vertexZ = (short[]) null;
        }
        this.minX = minimumX;
        this.maxZ = maximumZ;
    }

    final static void prepareRankedEntryArrays(int lowerBoundSeed, int entryLimit, int responseEntryCount) {
        if (((DialRenderer.rankedEntryResponseIndices == null) ||
              (!(DialRenderer.rankedEntryResponseIndices.length >= responseEntryCount)))) {
          DialRenderer.rankedEntryResponseIndices = new int[responseEntryCount * 2];
        }
        if (((null == LoginPasswordSupport.rankedEntryKeyTwo) ||
              (!(responseEntryCount <= LoginPasswordSupport.rankedEntryKeyTwo.length)))) {
          LoginPasswordSupport.rankedEntryKeyTwo = new int[responseEntryCount * 2];
        }
        if (((null == TextHotspotBounds.rankedEntryRatioNumerators) ||
              (!(TextHotspotBounds.rankedEntryRatioNumerators.length >= responseEntryCount)))) {
          TextHotspotBounds.rankedEntryRatioNumerators = new int[responseEntryCount * 2];
        }
        if (((null == NodeHashTableIterator.rankedEntryRatioSecondComponents) ||
              (!(responseEntryCount <= NodeHashTableIterator.rankedEntryRatioSecondComponents.length)))) {
          NodeHashTableIterator.rankedEntryRatioSecondComponents = new int[responseEntryCount * 2];
        }
        if (((null == FrameTimer.rankedEntryRatioThirdComponents) ||
              (!(FrameTimer.rankedEntryRatioThirdComponents.length >= responseEntryCount)))) {
          FrameTimer.rankedEntryRatioThirdComponents = new int[2 * responseEntryCount];
        }
        if (((null == ClientProtocolStage.rankedEntryKeyOne) ||
              (!(ClientProtocolStage.rankedEntryKeyOne.length >= responseEntryCount)))) {
          ClientProtocolStage.rankedEntryKeyOne = new int[responseEntryCount * 2];
        }
        if (((null == AchievementQuery.rankedEntryIndices) ||
              (!(AchievementQuery.rankedEntryIndices.length >= responseEntryCount + entryLimit)))) {
          AchievementQuery.rankedEntryIndices = new int[(responseEntryCount + entryLimit) * 2];
        }
        if (((null == AccountCreationForm.unusedRankedEntryBooleans) ||
              (!(AccountCreationForm.unusedRankedEntryBooleans.length >= responseEntryCount)))) {
          AccountCreationForm.unusedRankedEntryBooleans = new boolean[2 * responseEntryCount];
        }
        GmtTimestampSupport.rankedEntryCount = 0;
        MeshPrioritySupport.rankedSortUpperBoundValue = -2147483648;
        ClientRenderingState.rankedKeyTwoLowerBoundSeed = 2147483647;
        ProxyAuthenticationRequiredException.rankedKeyTwoUpperBoundSeed = -2147483648;
        LoginPayloadKind.rankedSortLowerBoundValue = lowerBoundSeed;
    }

    final static Sprite[] buildRgbSpritesFromDecodedSheet(int methodGuard) {
        int spriteIndex = 0;
        int pixelCount = 0;
        byte[] paletteIndices = null;
        int[] rgbPixels = null;
        int pixelIndex = 0;
        Sprite[] sprites = new Sprite[ClientTimingSupport.decodedSpriteCount];
        for (spriteIndex = 0; ClientTimingSupport.decodedSpriteCount > spriteIndex; spriteIndex++) {
            pixelCount = ProgressBarWidget.decodedSpriteHeights[spriteIndex] * DualLinkNode.decodedSpriteWidths[spriteIndex];
            paletteIndices = TextConcatenationSupport.decodedSpriteIndices[spriteIndex];
            rgbPixels = new int[pixelCount];
            for (pixelIndex = 0; pixelIndex < pixelCount; pixelIndex++) {
                rgbPixels[pixelIndex] = NanoFrameTimer.decodedSpritePalette[ProxySocketConnector.andInt((int) paletteIndices[pixelIndex], 255)];
            }
            sprites[spriteIndex] = new Sprite(GameplaySetupSupport.decodedSpriteCanvasWidth, FadingDialog.decodedSpriteCanvasHeight, GameplaySession.decodedSpriteXOffsets[spriteIndex], GmtTimestampSupport.decodedSpriteYOffsets[spriteIndex], DualLinkNode.decodedSpriteWidths[spriteIndex], ProgressBarWidget.decodedSpriteHeights[spriteIndex], rgbPixels);
        }
        if (methodGuard != 255) {
            screenTransitionTick = 40;
        }
        MidiPcmStream.clearDecodedSpriteWorkingArrays(true);
        return sprites;
    }

    final static boolean readSessionPacketPayload(boolean methodGuard) {
        if (methodGuard) {
            return false;
        }
        if ((AchievementSubmission.sessionPacketPayloadLength == -1)) {
            if (!UiWidget.readSessionBytesIfAvailable(30000, 1)) {
                return false;
            }
            AchievementSubmission.sessionPacketPayloadLength = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
            LogoCompositor.sessionPacketBuffer.position = 0;
        }
        if (AchievementSubmission.sessionPacketPayloadLength == -2) {
            if (!(UiWidget.readSessionBytesIfAvailable(30000, 2))) {
                return false;
            }
            AchievementSubmission.sessionPacketPayloadLength = LogoCompositor.sessionPacketBuffer.readUnsignedShortBE(true);
            LogoCompositor.sessionPacketBuffer.position = 0;
        }
        return UiWidget.readSessionBytesIfAvailable(30000, AchievementSubmission.sessionPacketPayloadLength);
    }

    private final void invalidateBounds(int guard) {
        this.boundsValid = false;
        if (guard != -7008) {
            TriangleMesh.prepareRankedEntryArrays(-110, 99, 92);
        }
    }

    TriangleMesh() {
        this.boundsValid = false;
        this.facePriorityCount = (byte) 0;
    }

    static {
        reloadGameText = "Reload game";
        pendingScoreSubmissions = new IntrusiveDeque();
    }
}
