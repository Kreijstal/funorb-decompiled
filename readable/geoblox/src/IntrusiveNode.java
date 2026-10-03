/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    long field_a;
    IntrusiveNode nextNode;
    static String loginMessage3Text;
    IntrusiveNode previousNode;
    static MusicScore field_d;

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        var3 = Geoblox.clientControlFlowFlag;
        IntrusiveDeque.a(111, param1);
        PacketBuffer.h(-120, param1);
        od.b((byte) -24);
        if (param0 > -90) {
          loginMessage3Text = (String) null;
        }
        var2 = param1;
        if (var2 != 4) {
          if (var2 != 3) {
            if (var2 != 1) {
              if (var2 != 0) {
                if (6 != var2) {
                  if (var2 == 5) {
                    fi.a(0, k.field_f);
                  } else {
                    if (var2 == 2) {
                      fi.a(0, j.field_ib);
                    }
                  }
                } else {
                  fi.a(0, wf.field_o);
                }
              } else {
                fi.a(0, ej.field_d);
              }
            } else {
              fi.a(0, field_d);
            }
          } else {
            fi.a(0, te.field_b);
          }
        } else {
          fi.a(0, qb.field_M);
        }
    }

    final static Object a(int param0, byte[] param1, boolean param2) {
        l var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        l stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -102) {
            stackIn_2_0 = (Object) null;
            return stackIn_2_0;
          }
          if (param1 == null) {
            stackIn_5_0 = null;
            return stackIn_5_0;
          }
          if (param1.length > 136) {
            var3 = new l();
            ((oj) ((Object) var3)).a(param1, true);
            stackIn_8_0 = (l) (var3);
            return stackIn_8_0;
          }
          if (param2) {
            stackIn_13_0 = nk.a(param1, 0);
            return stackIn_13_0;
          }
          stackIn_11_0 = (byte[]) (param1);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var3_ref);
          stackIn_16_1 = new StringBuilder().append("hf.BA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(')').toString());
        }
    }

    final void unlinkNode(boolean param0) {
        if (param0) {
            return;
        }
        if (!(null != this.previousNode)) {
            return;
        }
        this.previousNode.nextNode = this.nextNode;
        this.nextNode.previousNode = this.previousNode;
        this.previousNode = null;
        this.nextNode = null;
    }

    final static void decodeSpriteSheet(boolean readGuard, byte[] spriteBytes) {
        byte rowMajorAlphaByte = 0;
        byte columnMajorAlphaByte = 0;
        int rowMajorOpacityFlagBeforeMerge = 0;
        int rowMajorNonOpaqueFlag = 0;
        int columnMajorOpacityFlagBeforeMerge = 0;
        int columnMajorNonOpaqueFlag = 0;
        RuntimeException decodeFailureBeforeDescription = null;
        StringBuilder decodeMessagePrefix = null;
        String spriteBytesDescription = null;
        RuntimeException caughtDecodeFailure = null;
        RuntimeException decodeFailureForContext = null;
        int paletteSize = 0;
        int spriteIndex = 0;
        int spriteWidth = 0;
        int spriteHeight = 0;
        int pixelCount = 0;
        byte[] paletteIndicesForUpdates = null;
        byte[] alphaPlaneForUpdates = null;
        int hasNonOpaqueAlphaFlag = 0;
        int storageFlags = 0;
        int pixelIndexOrColumn = 0;
        int alphaByteOrRow = 0;
        int columnAlphaValue = 0;
        ByteArrayBuffer spriteDataBuffer = null;
        ByteArrayBuffer spriteDataBufferAlias = null;
        byte[] paletteIndicesForwarded = null;
        byte[] alphaPlaneForwarded = null;
        byte[] allocatedPaletteIndices = null;
        byte[] allocatedAlphaPlane = null;
        try {
          spriteDataBuffer = new ByteArrayBuffer(spriteBytes);
          spriteDataBufferAlias = spriteDataBuffer;
          spriteDataBufferAlias.position = spriteBytes.length - 2;
          sb.decodedSpriteCount = spriteDataBufferAlias.readUnsignedShortBE(readGuard);
          DualLinkNode.decodedSpriteWidths = new int[sb.decodedSpriteCount];
          hl.decodedSpriteHeights = new int[sb.decodedSpriteCount];
          DialogLayer.decodedSpriteHasNonOpaqueAlpha = new boolean[sb.decodedSpriteCount];
          vf.decodedSpriteAlpha = new byte[sb.decodedSpriteCount][];
          GameplaySession.decodedSpriteXOffsets = new int[sb.decodedSpriteCount];
          mj.decodedSpriteIndices = new byte[sb.decodedSpriteCount][];
          md.decodedSpriteYOffsets = new int[sb.decodedSpriteCount];
          spriteDataBufferAlias.position = -7 + spriteBytes.length - sb.decodedSpriteCount * 8;
          pg.decodedSpriteCanvasWidth = spriteDataBufferAlias.readUnsignedShortBE(true);
          FadingDialog.decodedSpriteCanvasHeight = spriteDataBufferAlias.readUnsignedShortBE(true);
          paletteSize = (255 & spriteDataBufferAlias.readUnsignedByte((byte) 34)) + 1;
          for (spriteIndex = 0; spriteIndex < sb.decodedSpriteCount; spriteIndex++) {
            GameplaySession.decodedSpriteXOffsets[spriteIndex] = spriteDataBuffer.readUnsignedShortBE(readGuard);
          }
          for (spriteIndex = 0; spriteIndex < sb.decodedSpriteCount; spriteIndex++) {
            md.decodedSpriteYOffsets[spriteIndex] = spriteDataBuffer.readUnsignedShortBE(true);
          }
          for (spriteIndex = 0; sb.decodedSpriteCount > spriteIndex; spriteIndex++) {
            DualLinkNode.decodedSpriteWidths[spriteIndex] = spriteDataBuffer.readUnsignedShortBE(true);
          }
          for (spriteIndex = 0; spriteIndex < sb.decodedSpriteCount; spriteIndex++) {
            hl.decodedSpriteHeights[spriteIndex] = spriteDataBuffer.readUnsignedShortBE(true);
          }
          spriteDataBufferAlias.position = -(paletteSize * 3) + 3 - 8 * sb.decodedSpriteCount - 7 + spriteBytes.length;
          cm.decodedSpritePalette = new int[paletteSize];
          for (spriteIndex = 1; spriteIndex < paletteSize; spriteIndex++) {
            cm.decodedSpritePalette[spriteIndex] = spriteDataBuffer.readUnsignedMediumBE(108);
            if (cm.decodedSpritePalette[spriteIndex] == 0) {
              cm.decodedSpritePalette[spriteIndex] = 1;
            }
          }
          spriteDataBufferAlias.position = 0;
          for (spriteIndex = 0; spriteIndex < sb.decodedSpriteCount; spriteIndex++) {
            spriteWidth = DualLinkNode.decodedSpriteWidths[spriteIndex];
            spriteHeight = hl.decodedSpriteHeights[spriteIndex];
            pixelCount = spriteWidth * spriteHeight;
            allocatedPaletteIndices = new byte[pixelCount];
            paletteIndicesForwarded = allocatedPaletteIndices;
            paletteIndicesForUpdates = paletteIndicesForwarded;
            mj.decodedSpriteIndices[spriteIndex] = allocatedPaletteIndices;
            allocatedAlphaPlane = new byte[pixelCount];
            alphaPlaneForwarded = allocatedAlphaPlane;
            alphaPlaneForUpdates = alphaPlaneForwarded;
            vf.decodedSpriteAlpha[spriteIndex] = allocatedAlphaPlane;
            hasNonOpaqueAlphaFlag = 0;
            storageFlags = spriteDataBufferAlias.readUnsignedByte((byte) 34);
            if ((storageFlags & 1) == 0) {
              for (pixelIndexOrColumn = 0; pixelIndexOrColumn < pixelCount; pixelIndexOrColumn++) {
                paletteIndicesForUpdates[pixelIndexOrColumn] = spriteDataBuffer.readSignedByte((byte) 90);
              }
              if (!((storageFlags & 2) == 0)) {
                for (pixelIndexOrColumn = 0; pixelCount > pixelIndexOrColumn; pixelIndexOrColumn++) {
                  rowMajorAlphaByte = spriteDataBuffer.readSignedByte((byte) 95);
                  alphaPlaneForUpdates[pixelIndexOrColumn] = rowMajorAlphaByte;
                  alphaByteOrRow = rowMajorAlphaByte;
                  rowMajorOpacityFlagBeforeMerge = hasNonOpaqueAlphaFlag;
                  if (alphaByteOrRow == -1) {
                    rowMajorNonOpaqueFlag = 0;
                  } else {
                    rowMajorNonOpaqueFlag = 1;
                  }
                  hasNonOpaqueAlphaFlag = rowMajorOpacityFlagBeforeMerge | rowMajorNonOpaqueFlag;
                }
              }
            } else {
              for (pixelIndexOrColumn = 0; spriteWidth > pixelIndexOrColumn; pixelIndexOrColumn++) {
                for (alphaByteOrRow = 0; spriteHeight > alphaByteOrRow; alphaByteOrRow++) {
                  paletteIndicesForUpdates[alphaByteOrRow * spriteWidth + pixelIndexOrColumn] = spriteDataBuffer.readSignedByte((byte) 90);
                }
              }
              if (!(0 == (2 & storageFlags))) {
                for (pixelIndexOrColumn = 0; spriteWidth > pixelIndexOrColumn; pixelIndexOrColumn++) {
                  for (alphaByteOrRow = 0; spriteHeight > alphaByteOrRow; alphaByteOrRow++) {
                    columnMajorAlphaByte = spriteDataBuffer.readSignedByte((byte) 78);
                    alphaPlaneForUpdates[pixelIndexOrColumn + spriteWidth * alphaByteOrRow] = columnMajorAlphaByte;
                    columnAlphaValue = columnMajorAlphaByte;
                    columnMajorOpacityFlagBeforeMerge = hasNonOpaqueAlphaFlag;
                    if (columnAlphaValue == -1) {
                      columnMajorNonOpaqueFlag = 0;
                    } else {
                      columnMajorNonOpaqueFlag = 1;
                    }
                    hasNonOpaqueAlphaFlag = columnMajorOpacityFlagBeforeMerge | columnMajorNonOpaqueFlag;
                  }
                }
              }
            }
            DialogLayer.decodedSpriteHasNonOpaqueAlpha[spriteIndex] = hasNonOpaqueAlphaFlag != 0;
          }
          return;
        } catch (java.lang.RuntimeException decodeFailure) {
          caughtDecodeFailure = decodeFailure;
          decodeFailureForContext = caughtDecodeFailure;
          decodeFailureBeforeDescription = (RuntimeException) (decodeFailureForContext);
          decodeMessagePrefix = new StringBuilder().append("hf.W(").append(readGuard).append(',');
          if (spriteBytes == null) {
            spriteBytesDescription = "null";
          } else {
            spriteBytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodeFailureBeforeDescription), ((StringBuilder) (Object) decodeMessagePrefix).append(spriteBytesDescription).append(')').toString());
        }
    }

    public static void b(byte param0) {
        loginMessage3Text = null;
        int var1 = -121 / ((-68 - param0) / 42);
        field_d = null;
    }

    final boolean isLinked(int methodGuard) {
        if (!(null != this.previousNode)) {
            return false;
        }
        if (methodGuard < 112) {
            IntrusiveNode.b((byte) 110);
        }
        return true;
    }

    static {
        loginMessage3Text = "Connection timed out. Please try using a different server.";
    }
}
