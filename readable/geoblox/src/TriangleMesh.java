/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TriangleMesh {
    short[] field_J;
    byte[] facePriorities;
    static int field_w;
    int[] thirdVertexSourceX;
    int[] firstVertexSourceY;
    short[] normalZ;
    short[] faceVertexB;
    short[] normalX;
    int[] secondVertexSourceX;
    short[] field_z;
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
    short[] field_h;
    int maxY;
    short[] faceMaterialIndices;
    short normalCount;
    short[] field_g;
    short[] normalY;
    static IntrusiveDeque pendingScoreSubmissions;
    int minY;
    short[] field_k;
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
            TriangleMesh.a(-90, 1, 93);
        }
        this.invalidateBounds(-7008);
    }

    final static int chooseSpawnSpriteVariant(byte methodGuard) {
        if (methodGuard >= -55) {
            return 66;
        }
        return AchievementQuery.b(EmailValidator.availableSpriteVariantCount, 1);
    }

    public static void b(byte param0) {
        pendingScoreSubmissions = null;
        reloadGameText = null;
        if (param0 != 115) {
            TriangleMesh.a(124, -30, -53);
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
            this.field_g = (short[]) null;
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

    final static void a(int param0, int param1, int param2) {
        if (!((DialRenderer.field_l != null) &&
              (DialRenderer.field_l.length >= param2))) {
          DialRenderer.field_l = new int[param2 * 2];
        }
        if (!((null != hg.rankedEntryKeyTwo) &&
              (param2 <= hg.rankedEntryKeyTwo.length))) {
          hg.rankedEntryKeyTwo = new int[param2 * 2];
        }
        if (!((null != TextHotspotBounds.field_m) &&
              (TextHotspotBounds.field_m.length >= param2))) {
          TextHotspotBounds.field_m = new int[param2 * 2];
        }
        if (!((null != NodeHashTableIterator.field_i) &&
              (param2 <= NodeHashTableIterator.field_i.length))) {
          NodeHashTableIterator.field_i = new int[param2 * 2];
        }
        if (!((null != FrameTimer.field_b) &&
              (FrameTimer.field_b.length >= param2))) {
          FrameTimer.field_b = new int[2 * param2];
        }
        if (!((null != ClientProtocolStage.rankedEntryKeyOne) &&
              (ClientProtocolStage.rankedEntryKeyOne.length >= param2))) {
          ClientProtocolStage.rankedEntryKeyOne = new int[param2 * 2];
        }
        if (!((null != AchievementQuery.field_i) &&
              (AchievementQuery.field_i.length >= param2 + param1))) {
          AchievementQuery.field_i = new int[(param2 + param1) * 2];
        }
        if (!((null != AccountCreationForm.field_C) &&
              (AccountCreationForm.field_C.length >= param2))) {
          AccountCreationForm.field_C = new boolean[2 * param2];
        }
        GmtTimestampSupport.rankedEntryCount = 0;
        MeshPrioritySupport.field_b = -2147483648;
        ok.field_b = 2147483647;
        ProxyAuthenticationRequiredException.field_a = -2147483648;
        LoginPayloadKind.field_a = param0;
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

    final static boolean a(boolean param0) {
        if (param0) {
            return false;
        }
        if (!(AchievementSubmission.field_k != -1)) {
            if (!UiWidget.b(30000, 1)) {
                return false;
            }
            AchievementSubmission.field_k = LogoCompositor.sessionPacketBuffer.readUnsignedByte((byte) 34);
            LogoCompositor.sessionPacketBuffer.position = 0;
        }
        if (AchievementSubmission.field_k == -2) {
            if (!(UiWidget.b(30000, 2))) {
                return false;
            }
            AchievementSubmission.field_k = LogoCompositor.sessionPacketBuffer.readUnsignedShortBE(true);
            LogoCompositor.sessionPacketBuffer.position = 0;
        }
        return UiWidget.b(30000, AchievementSubmission.field_k);
    }

    private final void invalidateBounds(int guard) {
        this.boundsValid = false;
        if (guard != -7008) {
            TriangleMesh.a(-110, 99, 92);
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
