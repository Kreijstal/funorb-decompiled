/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends IntrusiveNode {
    boolean field_m;
    static la field_n;
    int[] field_l;
    static int field_k;

    final static void decodeSpriteSheet(byte[] encodedSheet, int obfuscationGuard) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_38_1 = 0;
        int stackIn_49_0 = 0;
        int stackIn_50_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int paletteSize = 0;
        int offsetXIndex = 0;
        int spriteWidth = 0;
        int spriteHeight = 0;
        int pixelCount = 0;
        byte[] indices = null;
        byte[] alphas = null;
        int hasNonOpaqueAlpha = 0;
        int layoutFlags = 0;
        int pixelIndexOrX = 0;
        int alphaOrY = 0;
        int alphaValue = 0;
        int obfuscationControl = 0;
        PacketBuffer packet = null;
        PacketBuffer packetAlias = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int offsetYIndex;
        int widthIndex;
        int heightIndex;
        int paletteIndex;
        int spriteIndex;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          packet = new PacketBuffer(encodedSheet);
          packetAlias = packet;
          packetAlias.position = encodedSheet.length - 2;
          iw.decodedSpriteCount = packetAlias.readUnsignedShort((byte) -104);
          j.decodedSpriteOffsetXs = new int[iw.decodedSpriteCount];
          c.decodedSpriteHeights = new int[iw.decodedSpriteCount];
          CampaignMenuButton.decodedSpriteOffsetYs = new int[iw.decodedSpriteCount];
          MapTile.decodedSpriteHasAlpha = new boolean[iw.decodedSpriteCount];
          ClippedWidgetContainer.decodedSpriteWidths = new int[iw.decodedSpriteCount];
          AnimationPlayer.decodedSpriteIndices = new byte[iw.decodedSpriteCount][];
          CampaignMenuEntry.decodedSpriteAlphas = new byte[iw.decodedSpriteCount][];
          packetAlias.position = -(iw.decodedSpriteCount * 8) - 7 + encodedSheet.length;
          lg.decodedSpriteCanvasWidth = packetAlias.readUnsignedShort((byte) -104);
          BirthDateChatEnableForm.decodedSpriteCanvasHeight = packetAlias.readUnsignedShort((byte) -104);
          paletteSize = 1 + (255 & packetAlias.readUnsignedByte(obfuscationGuard + 1));
          for (offsetXIndex = 0; iw.decodedSpriteCount > offsetXIndex; offsetXIndex++) {
            j.decodedSpriteOffsetXs[offsetXIndex] = packet.readUnsignedShort((byte) -104);
          }
          for (offsetYIndex = 0; offsetYIndex < iw.decodedSpriteCount; offsetYIndex++) {
            CampaignMenuButton.decodedSpriteOffsetYs[offsetYIndex] = packetAlias.readUnsignedShort((byte) -104);
          }
          for (widthIndex = 0; iw.decodedSpriteCount > widthIndex; widthIndex++) {
            ClippedWidgetContainer.decodedSpriteWidths[widthIndex] = packetAlias.readUnsignedShort((byte) -104);
          }
          for (heightIndex = 0; heightIndex < iw.decodedSpriteCount; heightIndex++) {
            c.decodedSpriteHeights[heightIndex] = packetAlias.readUnsignedShort((byte) -104);
          }
          if (obfuscationGuard != -1) {
            field_n = (la) null;
          }
          packetAlias.position = 3 + (-(paletteSize * 3) + (-(8 * iw.decodedSpriteCount) - 7) + encodedSheet.length);
          MovementPresentation.decodedSpritePalette = new int[paletteSize];
          for (paletteIndex = 1; paletteIndex < paletteSize; paletteIndex++) {
            MovementPresentation.decodedSpritePalette[paletteIndex] = packetAlias.readUnsignedMedium((byte) -13);
            if (MovementPresentation.decodedSpritePalette[paletteIndex] == 0) {
              MovementPresentation.decodedSpritePalette[paletteIndex] = 1;
            }
          }
          packetAlias.position = 0;
          for (spriteIndex = 0; spriteIndex < iw.decodedSpriteCount; spriteIndex++) {
            spriteWidth = ClippedWidgetContainer.decodedSpriteWidths[spriteIndex];
            spriteHeight = c.decodedSpriteHeights[spriteIndex];
            pixelCount = spriteHeight * spriteWidth;
            var20 = new byte[pixelCount];
            var18 = var20;
            indices = var18;
            AnimationPlayer.decodedSpriteIndices[spriteIndex] = var20;
            var21 = new byte[pixelCount];
            var19 = var21;
            alphas = var19;
            CampaignMenuEntry.decodedSpriteAlphas[spriteIndex] = var21;
            hasNonOpaqueAlpha = 0;
            layoutFlags = packetAlias.readUnsignedByte(0);
            if ((1 & layoutFlags) == 0) {
              for (pixelIndexOrX = 0; pixelIndexOrX < pixelCount; pixelIndexOrX++) {
                indices[pixelIndexOrX] = packetAlias.readByte((byte) -90);
              }
              if ((layoutFlags & 2) != 0) {
                for (pixelIndexOrX = 0; pixelIndexOrX < pixelCount; pixelIndexOrX++) {
                  dupTemp$0 = packetAlias.readByte((byte) 102);
                  alphas[pixelIndexOrX] = dupTemp$0;
                  alphaOrY = dupTemp$0;
                  stackIn_49_0 = hasNonOpaqueAlpha;
                  if (alphaOrY == -1) {
                    stackIn_50_1 = 0;
                  } else {
                    stackIn_50_1 = 1;
                  }
                  hasNonOpaqueAlpha = stackIn_49_0 | stackIn_50_1;
                }
              }
            } else {
              for (pixelIndexOrX = 0; spriteWidth > pixelIndexOrX; pixelIndexOrX++) {
                for (alphaOrY = 0; spriteHeight > alphaOrY; alphaOrY++) {
                  indices[alphaOrY * spriteWidth + pixelIndexOrX] = packetAlias.readByte((byte) -106);
                }
              }
              if ((2 & layoutFlags) != 0) {
                for (pixelIndexOrX = 0; pixelIndexOrX < spriteWidth; pixelIndexOrX++) {
                  for (alphaOrY = 0; spriteHeight > alphaOrY; alphaOrY++) {
                    dupTemp$1 = packetAlias.readByte((byte) -67);
                    alphas[pixelIndexOrX + spriteWidth * alphaOrY] = dupTemp$1;
                    alphaValue = dupTemp$1;
                    stackIn_37_0 = hasNonOpaqueAlpha;
                    if (alphaValue == -1) {
                      stackIn_38_1 = 0;
                    } else {
                      stackIn_38_1 = 1;
                    }
                    hasNonOpaqueAlpha = stackIn_37_0 | stackIn_38_1;
                  }
                }
              }
            }
            MapTile.decodedSpriteHasAlpha[spriteIndex] = hasNonOpaqueAlpha != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_55_0 = var2;
          stackIn_55_1 = new StringBuilder().append("b.B(");
          if (encodedSheet == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_n = null;
        if (!param0) {
          b.calculateMissionScore(94, 33, -110, (byte) 28, -37);
        }
    }

    final static int calculateMissionScore(int turnTarget, int damageTarget, int damageTaken, byte obfuscationGuard, int turnsTaken) {
        int turnScore;
        int turnBonus;
        int damageBonus;
        int damageScore;
        if (turnTarget == 0) {
          return 1;
        }
        if (damageTarget == 0) {
          return 1;
        }
        if (obfuscationGuard != 25) {
          return -81;
        }
        turnScore = (-turnsTaken + turnTarget * 2) * 500 / turnTarget;
        turnScore = Math.max(0, turnScore);
        if (turnScore > 500) {
          turnBonus = turnScore - 500;
          turnScore = turnBonus / 3 + 500;
          if (turnScore > 1000) {
            turnScore = 1000;
          }
        }
        damageScore = (2 * damageTarget - damageTaken) * 500 / damageTarget;
        damageScore = Math.max(0, damageScore);
        if (damageScore > 500) {
          damageBonus = damageScore - 500;
          damageScore = 500 + damageBonus / 2;
          if (damageScore > 1000) {
            damageScore = 1000;
          }
        }
        return Math.max(100, Math.min(turnScore + damageScore, 2000));
    }

    b() {
        this.field_m = false;
    }

    final static int getUnitUnlockOrdinal(boolean obfuscationGuard, int unitType) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException var2 = null;
        int var4 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard) {
            field_n = (la) null;
          }
          for (var2_int = 0; var2_int < AnimationFrameSet.unitUnlockGroups.length; var2_int++) {
            for (var3 = 0; AnimationFrameSet.unitUnlockGroups[var2_int].length > var3; var3++) {
              if (~AnimationFrameSet.unitUnlockGroups[var2_int][var3] == ~unitType) {
                stackIn_10_0 = var3;
                return stackIn_10_0;
              }
            }
          }
          stackIn_14_0 = 0;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "b.A(" + obfuscationGuard + ',' + unitType + ')');
        }
    }

    static {
    }
}
