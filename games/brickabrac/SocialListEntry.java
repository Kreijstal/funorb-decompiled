/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SocialListEntry extends UiComponent {
    String name;
    UiComponent serverLabel;
    int insertionIndex;
    static String field_Pb;
    UiComponent nameLabel;
    static NodeDeque gamePlayers;
    String serverName;
    String previousName;
    static String[] field_bc;
    String actionName;
    static RgbSprite[] field_Vb;
    static RgbSprite field_Zb;
    UiComponent renameIndicator;

    final static void shadeAndDrawMesh(int highlightZ, int diffuseX, int highlightX, int diffuseZ, Mesh3D mesh, byte obfuscationGuard, int highlightY, int diffuseY) {
        int diffuseResponse = 0;
        int[] highlightTable = null;
        int absoluteHighlightDot = 0;
        int directionAValue = 0;
        int directionBValue = 0;
        int directionCValue = 0;
        MeshAttributeRecord materialValue = null;
        int interpolatedBaseRgb = 0;
        int flatBaseRgb = 0;
        RuntimeException failureContext = null;
        StringBuilder contextBuilder = null;
        String meshSummary = null;
        RuntimeException caughtFailure = null;
        int[] diffuseAlias = null;
        RuntimeException failure = null;
        int direction = 0;
        int diffuseDot = 0;
        int highlightDot = 0;
        int vertexB = 0;
        int vertexC = 0;
        int directionA = 0;
        int directionB = 0;
        int directionC = 0;
        MeshAttributeRecord material = null;
        int xA = 0;
        int yA = 0;
        int xB = 0;
        int yB = 0;
        int xC = 0;
        int yC = 0;
        int gainA = 0;
        int highlightAOrGainB = 0;
        int baseRgbOrGainC = 0;
        int redBlueOrHighlightA = 0;
        int greenOrHighlightB = 0;
        int flatRgbOrHighlightC = 0;
        int baseRgb = 0;
        int baseRedBlue = 0;
        int baseGreen = 0;
        int rgbA = 0;
        int rgbB = 0;
        int rgbC = 0;
        int unusedGameFlag = 0;
        int[] diffuseStorage = null;
        Mesh3D meshAlias = null;
        int[] diffuseValues = null;
        int[] diffuseGains = null;
        byte[] faceGroups = null;
        int[] directionZ = null;
        int[] directionY = null;
        int[] directionX = null;
        int[] highlights = null;
        int sortedFace;
        int face;
        int vertexA;
        int diffuseGain;
        int highlight;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        try {
          meshAlias = mesh;
          if (obfuscationGuard != -105) {
            return;
          }
          if (null != meshAlias.faceGroups &&
            meshAlias.faceGroupCount > 1) {
            faceGroups = meshAlias.faceGroups;
            SingleChildWidget.orderFacesByGroup(0, 0, (byte) 114, faceGroups, AppletGameShell.faceGroupOffsets);
          } else {
            ArchiveNetworkClient.compactFaceBuckets((byte) 94);
          }
          diffuseGains = new int[mesh.directionCount];
          diffuseValues = diffuseGains;
          diffuseStorage = diffuseValues;
          diffuseAlias = diffuseStorage;
          highlights = new int[mesh.directionCount];
          directionX = ValidationIconWidget.worldDirectionX;
          directionY = LoginCredentials.worldDirectionY;
          directionZ = ContextActionController.worldDirectionZ;
          for (direction = 0; mesh.directionCount > direction; direction++) {
            diffuseDot = directionZ[direction] * diffuseZ + diffuseY * directionY[direction] + directionX[direction] * diffuseX >> 8;
            if (0 > diffuseDot) {
              diffuseDot = -diffuseDot;
            }
            if (0 <= diffuseDot) {
              if (diffuseDot < 128) {
                diffuseResponse = 128 + diffuseDot;
              } else {
                diffuseResponse = 256;
              }
            } else {
              diffuseResponse = 128;
            }
            diffuseGain = diffuseResponse;
            highlightDot = directionZ[direction] * highlightZ + (directionY[direction] * highlightY + directionX[direction] * highlightX) >> 8;
            highlightTable = ClientException.meshHighlightTable;
            if (highlightDot >= 0) {
              absoluteHighlightDot = highlightDot;
            } else {
              absoluteHighlightDot = -highlightDot;
            }
            highlight = highlightTable[absoluteHighlightDot];
            diffuseGain = diffuseGain * (-highlight + 256) >>> 8;
            diffuseGains[direction] = diffuseGain;
            highlights[direction] = highlight;
          }
          for (sortedFace = 0; sortedFace < mc.sortedFaceCount; sortedFace++) {
            face = FullscreenFailureDialog.sortedFaceIds[sortedFace];
            vertexA = mesh.faceVertexA[face];
            vertexB = mesh.faceVertexB[face];
            vertexC = mesh.faceVertexC[face];
            if (ValidationIconWidget.worldDirectionX.length <= mesh.faceDirectionA[face]) {
              directionAValue = -1;
            } else {
              directionAValue = mesh.faceDirectionA[face];
            }
            directionA = directionAValue;
            if (ValidationIconWidget.worldDirectionX.length > mesh.faceDirectionB[face]) {
              directionBValue = mesh.faceDirectionB[face];
            } else {
              directionBValue = -1;
            }
            directionB = directionBValue;
            if (ValidationIconWidget.worldDirectionX.length <= mesh.faceDirectionC[face]) {
              directionCValue = -1;
            } else {
              directionCValue = mesh.faceDirectionC[face];
            }
            directionC = directionCValue;
            if (null != TextWidgetRenderer.meshAttributeRecords &&
              mesh.faceMaterialIds != null &&
              face < mesh.faceMaterialIds.length &&
              -1 != mesh.faceMaterialIds[face] &&
              mesh.faceMaterialIds[face] < TextWidgetRenderer.meshAttributeRecords.length) {
              materialValue = TextWidgetRenderer.meshAttributeRecords[mesh.faceMaterialIds[face]];
            } else {
              materialValue = null;
            }
            material = materialValue;
            xA = ArchiveNetworkRequest.projectedVertexX[vertexA];
            yA = ed.projectedVertexY[vertexA];
            xB = ArchiveNetworkRequest.projectedVertexX[vertexB];
            yB = ed.projectedVertexY[vertexB];
            xC = ArchiveNetworkRequest.projectedVertexX[vertexC];
            yC = ed.projectedVertexY[vertexC];
            if (directionB == directionA &&
              directionB == directionC) {
              gainA = diffuseGains[directionA];
              highlightAOrGainB = highlights[directionA];
              if (material != null) {
                flatBaseRgb = material.baseRgb;
              } else {
                flatBaseRgb = 8355711;
              }
              baseRgbOrGainC = flatBaseRgb;
              redBlueOrHighlightA = 16711935 & baseRgbOrGainC;
              greenOrHighlightB = 65280 & baseRgbOrGainC;
              flatRgbOrHighlightC = (gainA * redBlueOrHighlightA & -16711791) >>> 8 | (greenOrHighlightB * gainA & 16711898) >>> 8;
              flatRgbOrHighlightC = flatRgbOrHighlightC + highlightAOrGainB * 65793;
              BackgroundScene.drawFlatMeshTriangle(flatRgbOrHighlightC >> 1 & 8355711, yA, xC, xA, yB, yC, xB, 116);
            } else {
              gainA = diffuseGains[directionA];
              highlightAOrGainB = diffuseGains[directionB];
              baseRgbOrGainC = diffuseGains[directionC];
              redBlueOrHighlightA = highlights[directionA];
              greenOrHighlightB = highlights[directionB];
              flatRgbOrHighlightC = highlights[directionC];
              if (material != null) {
                interpolatedBaseRgb = material.baseRgb;
              } else {
                interpolatedBaseRgb = 8355711;
              }
              baseRgb = interpolatedBaseRgb;
              baseRedBlue = baseRgb & 16711935;
              baseGreen = 65280 & baseRgb;
              rgbA = (baseGreen * gainA & 16711775) >>> 8 | baseRedBlue * gainA >>> 8 & -1895890689;
              rgbB = (-16711863 & highlightAOrGainB * baseRedBlue) >>> 8 | (baseGreen * highlightAOrGainB & 16711854) >>> 8;
              rgbC = (baseRedBlue * baseRgbOrGainC & -16711923) >>> 8 | (16711836 & baseRgbOrGainC * baseGreen) >>> 8;
              rgbB = rgbB + 65793 * greenOrHighlightB;
              rgbA = rgbA + 65793 * redBlueOrHighlightA;
              rgbC = rgbC + 65793 * flatRgbOrHighlightC;
              tq.drawInterpolatedMeshTriangle(rgbC & 255, 255 & rgbA >> 8, xC, (65445 & rgbB) >> 8, xB, rgbB >> 16, yC, rgbC >> 8 & 255, yA, (byte) -55, rgbB & 255, xA, 255 & rgbA, rgbC >> 16, yB, rgbA >> 16);
            }
          }
          return;
        } catch (java.lang.RuntimeException caughtParameter) {
          caughtFailure = caughtParameter;
          failure = caughtFailure;
          failureContext = failure;
          contextBuilder = new StringBuilder().append("mp.A(").append(highlightZ).append(',').append(diffuseX).append(',').append(highlightX).append(',').append(diffuseZ).append(',');
          if (mesh == null) {
            meshSummary = "null";
          } else {
            meshSummary = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) failureContext), ((StringBuilder) (Object) contextBuilder).append(meshSummary).append(',').append(obfuscationGuard).append(',').append(highlightY).append(',').append(diffuseY).append(')').toString());
        }
    }

    public static void h(int param0) {
        gamePlayers = null;
        field_Pb = null;
        field_Zb = null;
        field_Vb = null;
        if (param0 >= -54) {
          return;
        }
        field_bc = null;
    }

    SocialListEntry() {
        super(0L, (UiComponent) null);
    }

    final static void a(int param0, LoginCredentials param1, boolean param2, boolean param3, boolean param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          LevelPackCard.field_a[0] = IterableIntrusiveHashTable.packetDelayRandom.nextInt();
          LevelPackCard.field_a[1] = IterableIntrusiveHashTable.packetDelayRandom.nextInt();
          tq.field_f.position = 0;
          LevelPackCard.field_a[3] = (int)PopupWidgetLayer.field_ab;
          LevelPackCard.field_a[2] = (int)(PopupWidgetLayer.field_ab >> 32);
          tq.field_f.writeInt(LevelPackCard.field_a[0], (byte) -79);
          tq.field_f.writeInt(LevelPackCard.field_a[1], (byte) -79);
          tq.field_f.writeInt(LevelPackCard.field_a[2], (byte) -79);
          tq.field_f.writeInt(LevelPackCard.field_a[3], (byte) -79);
          AccountIntroductionPanel.a(tq.field_f, (byte) -95);
          tq.field_f.writeShort((byte) 113, param0);
          param1.writeCredentials(0, tq.field_f);
          TextFieldValidator.outgoingPackets.position = 0;
          if (!param2) {
            TextFieldValidator.outgoingPackets.writeByte(94, 16);
          } else {
            TextFieldValidator.outgoingPackets.writeByte(-4, 18);
          }
          TextFieldValidator.outgoingPackets.position = TextFieldValidator.outgoingPackets.position + 2;
          var5_int = TextFieldValidator.outgoingPackets.position;
          TextFieldValidator.outgoingPackets.writeInt(MainMenuScreen.field_x, (byte) -79);
          TextFieldValidator.outgoingPackets.writeLong(-23054, LevelSelectScreen.field_E);
          var6 = 0;
          if (FarmBackground.field_u) {
            var6 = var6 | 1;
          }
          if (DialogMessagePanel.field_O) {
            var6 = var6 | 4;
          }
          if (param3) {
            var6 = var6 | 8;
          }
          if (ParisBackground.field_t != null) {
            var6 = var6 | 16;
          }
          if (param4) {
            return;
          }
          TextFieldValidator.outgoingPackets.writeByte(-105, var6);
          var7 = GameClock.a(true, EmailConfirmationValidator.e((byte) -101));
          if (var7 == null) {
            var7 = "";
          }
          TextFieldValidator.outgoingPackets.writeCp1252String(var7, -1);
          if (null != ParisBackground.field_t) {
            TextFieldValidator.outgoingPackets.writePrefixedCp1252String(0, ParisBackground.field_t);
          }
          LevelDecoder.writeEncryptedPacketContents(TextFieldValidator.outgoingPackets, tq.field_f, Ball.field_F, (byte) -72, WeightedLruCache.field_g);
          TextFieldValidator.outgoingPackets.backfillShortLength(TextFieldValidator.outgoingPackets.position - var5_int, 255);
          ActivityIndicatorWidget.flushTransportPackets(-1, 10000);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("mp.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_bc = new String[]{"Destroy <%0> bricks without losing a life.", "Destroy <%0> bricks without losing a life.", "Destroy <%0> bricks without losing a life.", "Complete <%0> levels in one play-through.", "Complete <%0> levels in one play-through.", "Reach level <%0> in either level set.", "Complete all levels in one set.", "Score <%0> points.", "Score <%0> points.", "Bounce any ball <%0> times without it touching the paddle.", "Bounce any ball <%0> times without it touching the paddle.", "Use the Build power-up <%0> times in Rated games.", "Gain Rating in <%0> Rated games in a row.", "Gain Rating in <%0> Rated games in a row.", "Place first <%0> Rated games in a row.", "Place first <%0> Rated games in a row.", "Complete any level after the first with the Halloween background.", "Defeat a FunOrb Moderator or someone who has this Achievement.", "Build up <%0> victories against FunOrb Moderators.", "Complete <%0> levels without losing a life.", "Complete <%0> levels without losing a life.", "Complete <%0> levels without losing a life.", "Destroy one brick for each colour of a rainbow, in order, without using the plasma ball.", "Get <%0> level ahead of the player chasing you, in a Rated game.", "Get <%0> levels ahead of the player chasing you, in a Rated game.", "Get <%0> levels ahead of the player chasing you, in a Rated game.", "Recover from 'Panic!' (flashing red) during a Rated game, then go on to win.", "Win a Rated game using the plasma ball once, and only once, per level.", "Win a Rated game without collecting any power-ups.", "Complete <%0> levels without collecting positive power-ups.", "Collect <%0> negative power-ups in a row.", "Collect <%0> negative power-ups in a row.", "Collect <%0> positive power-ups in a row.", "Collect <%0> positive power-ups in a row.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks in Rated games.", "Destroy <%0> bricks without losing a life.", "Score <%0> points.", "Use the Weak power-up <%0> times in online multiplayer games, in one session during Hallowe'en."};
        field_Pb = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
    }
}
