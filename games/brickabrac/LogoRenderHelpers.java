/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LogoRenderHelpers {
    static long lastWallMillis;
    static int field_b;
    static BitPacketBuffer incomingPackets;
    static RgbSprite field_d;
    static int field_a;

    final static void drawLogoPieces(int obfuscationGuard) {
        int drawOrdinal = 0;
        int depthCandidate = 0;
        int centerAxis = 0;
        int pieceCount = 0;
        int[] depthKeysAlias = null;
        int depthPieceIndex = 0;
        Mesh3D depthMesh = null;
        int cameraForwardY = 0;
        int centerX = 0;
        int centerY = 0;
        int centerZ = 0;
        int cameraForwardXQ14 = 0;
        int cameraForwardYQ14 = 0;
        int cameraForwardZQ14 = 0;
        double diffuseNormalizeScale = 0.0;
        int localForwardXQ16 = 0;
        int localForwardYQ16 = 0;
        int localForwardZQ16 = 0;
        int highlightZ = 0;
        int selectedPieceIndex = 0;
        Mesh3D selectedMesh = null;
        int unusedGameFlag = 0;
        int[] depthKeysInitialAlias = null;
        int[] depthKeys = null;
        RuntimeException caughtFailure = null;
        RuntimeException failure = null;
        int cameraForwardX;
        int cameraForwardZ;
        int lightingAngle8192;
        int diffuseX;
        int diffuseY;
        int diffuseZ;
        double highlightNormalizeScale;
        int highlightX;
        int highlightY;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          IndexedSpriteHelpers.logoCameraPose = new int[]{0, 0, -8144, 65536, 0, 0, 0, -65536, 0, 0, 0, 65536};
          pieceCount = TextHotspotRegion.logoMeshes.length;
          depthKeys = new int[pieceCount];
          depthKeysInitialAlias = depthKeys;
          depthKeysAlias = depthKeysInitialAlias;
          for (depthPieceIndex = 0; depthPieceIndex < pieceCount; depthPieceIndex++) {
            depthMesh = TextHotspotRegion.logoMeshes[depthPieceIndex];
            depthMesh.ensureBounds(23);
            HuffmanCodec.updateLogoPiecePose(depthPieceIndex, (byte) 77);
            centerX = depthMesh.minX + depthMesh.maxX >> 1;
            centerY = depthMesh.maxY + depthMesh.minY >> 1;
            centerZ = depthMesh.maxZ + depthMesh.minZ >> 1;
            cameraForwardXQ14 = IndexedSpriteHelpers.logoCameraPose[9] >> 2;
            cameraForwardYQ14 = IndexedSpriteHelpers.logoCameraPose[10] >> 2;
            cameraForwardZQ14 = IndexedSpriteHelpers.logoCameraPose[11] >> 2;
            localForwardXQ16 = cameraForwardZQ14 * MatchResultScreen.logoPiecePose[5] + (MatchResultScreen.logoPiecePose[4] * cameraForwardYQ14 + MatchResultScreen.logoPiecePose[3] * cameraForwardXQ14) >> 14;
            localForwardYQ16 = cameraForwardXQ14 * MatchResultScreen.logoPiecePose[6] + (cameraForwardYQ14 * MatchResultScreen.logoPiecePose[7] + cameraForwardZQ14 * MatchResultScreen.logoPiecePose[8]) >> 14;
            localForwardZQ16 = cameraForwardYQ14 * MatchResultScreen.logoPiecePose[10] + (cameraForwardXQ14 * MatchResultScreen.logoPiecePose[9] + MatchResultScreen.logoPiecePose[11] * cameraForwardZQ14) >> 14;
            depthKeysAlias[depthPieceIndex] = centerZ * localForwardZQ16 + localForwardYQ16 * centerY + centerX * localForwardXQ16 >> 16;
          }
          cameraForwardX = IndexedSpriteHelpers.logoCameraPose[9] >> 8;
          cameraForwardY = IndexedSpriteHelpers.logoCameraPose[10] >> 8;
          cameraForwardZ = IndexedSpriteHelpers.logoCameraPose[11] >> 8;
          lightingAngle8192 = MatchResultScreen.logoAnimationTicks << 4;
          diffuseX = 0;
          diffuseY = InteractiveGameClient.sine8192(lightingAngle8192, -4097) >> 8;
          diffuseZ = BrickABrac.cosine8192(2048, lightingAngle8192) >> 8;
          if (-1 != MusicPatch.pointerX &&
            -1 != ResourcePreparationEntry.pointerY) {
            diffuseY = -ResourcePreparationEntry.pointerY + 240;
            diffuseZ = -128;
            diffuseX = MusicPatch.pointerX - 320;
          }
          diffuseNormalizeScale = 256.0 / Math.sqrt((double)(diffuseZ * diffuseZ + diffuseY * diffuseY + diffuseX * diffuseX));
          diffuseZ = (int)((double)diffuseZ * diffuseNormalizeScale);
          diffuseY = (int)((double)diffuseY * diffuseNormalizeScale);
          diffuseX = (int)((double)diffuseX * diffuseNormalizeScale);
          highlightX = diffuseX - cameraForwardX;
          highlightY = diffuseY - cameraForwardY;
          highlightZ = -cameraForwardZ + diffuseZ;
          highlightNormalizeScale = 256.0 / Math.sqrt((double)(highlightZ * highlightZ + highlightX * highlightX + highlightY * highlightY));
          if (obfuscationGuard >= -114) {
            field_a = -44;
          }
          highlightX = (int)((double)highlightX * highlightNormalizeScale);
          highlightY = (int)((double)highlightY * highlightNormalizeScale);
          highlightZ = (int)((double)highlightZ * highlightNormalizeScale);
          for (drawOrdinal = 0; TextHotspotRegion.logoMeshes.length > drawOrdinal; drawOrdinal++) {
            selectedPieceIndex = 0;
            for (depthCandidate = 1; depthCandidate < TextHotspotRegion.logoMeshes.length; depthCandidate++) {
              if (depthKeys[selectedPieceIndex] < depthKeys[depthCandidate]) {
                selectedPieceIndex = depthCandidate;
              }
            }
            depthKeys[selectedPieceIndex] = -2147483648;
            selectedMesh = TextHotspotRegion.logoMeshes[selectedPieceIndex];
            HuffmanCodec.updateLogoPiecePose(selectedPieceIndex, (byte) 77);
            for (centerAxis = 0; centerAxis < 3; centerAxis++) {
              MatchResultScreen.logoPiecePose[centerAxis] = MatchResultScreen.logoPiecePose[centerAxis] + BoundedFile.logoOriginalCenters[drawOrdinal][centerAxis];
            }
            MusicVoice.transformAndProjectMesh(IndexedSpriteHelpers.logoCameraPose, -16283, MatchResultScreen.logoPiecePose, false, true, selectedMesh, false);
            SocialListEntry.shadeAndDrawMesh(highlightZ, diffuseX, highlightX, diffuseZ, selectedMesh, (byte) -105, highlightY, diffuseY);
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failure), "jl.D(" + obfuscationGuard + ')');
        }
    }

    final static boolean pollKeyEvent(byte obfuscationGuard) {
        Object var1 = null;
        Object keyboardMonitor = null;
        Throwable var2 = null;
        boolean stackIn_8_0 = false;
        Throwable decompiledCaughtException = null;
        keyboardMonitor = DualLinkDeque.keyboardInput;
        synchronized (keyboardMonitor) {
          if (IntrusiveHashTable.keyEventReadIndex == LobbyKeyboardGlobals.keyEventFrameEnd) {
            return false;
          }
          MeshAttributeRecord.currentKeyCode = ProxyAuthenticationRequiredException.keyEventCodes[IntrusiveHashTable.keyEventReadIndex];
          ResourceArchiveFactory.currentKeyCharacter = TimedSplashScreen.keyEventCharacters[IntrusiveHashTable.keyEventReadIndex];
          if (obfuscationGuard != 5) {
            return true;
          }
          IntrusiveHashTable.keyEventReadIndex = IntrusiveHashTable.keyEventReadIndex + 1 & 127;
          stackIn_8_0 = true;
        }
        return stackIn_8_0;
    }

    public static void a(int param0) {
        incomingPackets = null;
        field_d = null;
        if (param0 != 31186) {
          String var2 = (String) null;
          LogoRenderHelpers.requestAddFriend(-88, (String) null, -64);
        }
    }

    final static String requestAddFriend(int obfuscationGuard, String name, int opcode) {
        String stackIn_3_0 = null;
        String stackIn_7_0 = null;
        String stackIn_11_0 = null;
        String stackIn_14_0 = null;
        String stackIn_18_0 = null;
        String stackIn_21_0 = null;
        String stackIn_24_0 = null;
        Object stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int bodyStart = 0;
        BitPacketBuffer packet = null;
        CharSequence nameCharacters = null;
        try {
          nameCharacters = (CharSequence) ((Object) name);
          if (!DualLinkNode.isValidSocialName(nameCharacters, false)) {
            stackIn_3_0 = LobbyGame.field_Xb;
            return stackIn_3_0;
          }
          if (LevelMetadata.field_m != 2) {
            stackIn_7_0 = BackgroundSurfaceHelpers.field_b;
            return stackIn_7_0;
          }
          if (SpaceBackground.isLocalPlayerName(name, -19)) {
            stackIn_11_0 = TextHuffmanHelpers.field_a;
            return stackIn_11_0;
          }
          if (LevelPack.isFriend(0, name)) {
            stackIn_14_0 = GamePresentationHelpers.formatIndexedText(TextChoiceDialogStyles.field_d, new String[]{name}, (byte) 103);
            return stackIn_14_0;
          }
          if (LevelPackSelectScreen.friendCount >= 100 &&
            ResourceArchiveFactory.windowModeCapabilityWord <= 0) {
            stackIn_18_0 = IntegerRemainderHelpers.field_e;
            return stackIn_18_0;
          }
          if (200 <= LevelPackSelectScreen.friendCount) {
            stackIn_21_0 = IntegerRemainderHelpers.field_e;
            return stackIn_21_0;
          }
          if (AchievementBrowserScreen.isIgnoredPlayer(121, name)) {
            stackIn_24_0 = GamePresentationHelpers.formatIndexedText(ConstructionBackground.field_u, new String[]{name}, (byte) 103);
            return stackIn_24_0;
          }
          if (obfuscationGuard != 24943) {
            lastWallMillis = -99L;
          }
          packet = TextFieldValidator.outgoingPackets;
          packet.writeCipheredOpcode(-13413, opcode);
          packet.position = packet.position + 1;
          bodyStart = packet.position;
          packet.writeByte(-107, 0);
          packet.writeCp1252String(name, obfuscationGuard - 24944);
          packet.backfillByteLength((byte) 122, -bodyStart + packet.position);
          stackIn_28_0 = null;
          return (String) (stackIn_28_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("jl.B(").append(obfuscationGuard).append(',');
          if (name == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(opcode).append(')').toString());
        }
    }

    static {
        field_b = 64;
    }
}
