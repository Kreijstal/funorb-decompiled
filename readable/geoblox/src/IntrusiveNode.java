/*
 * Decompiled by CFR-JS 0.4.0.
 */
class IntrusiveNode {
    long nodeKey;
    IntrusiveNode nextNode;
    static String loginMessage3Text;
    IntrusiveNode previousNode;
    static MusicScore sunMusicTrack;

    final static void selectThemeAudio(int methodGuard, int themeId) {
        int selectedThemeId;
        int clientControlSnapshot;
        clientControlSnapshot = Geoblox.clientControlFlowFlag;
        IntrusiveDeque.prepareThemeMusic(111, themeId);
        PacketBuffer.prepareThemeSoundSamples(-120, themeId);
        LoginMethod.releaseMarkedThemeMusicPreparation((byte) -24);
        if (methodGuard > -90) {
          loginMessage3Text = (String) null;
        }
        selectedThemeId = themeId;
        if (selectedThemeId != 4) {
          if (selectedThemeId != 3) {
            if (selectedThemeId != 1) {
              if (selectedThemeId != 0) {
                if (6 != selectedThemeId) {
                  if (selectedThemeId == 5) {
                    IntrusiveNodeHashTable.selectLoopingBackgroundMusic(0, NodeHashTableIterator.sportMusicTrack);
                  } else {
                    if (selectedThemeId == 2) {
                      IntrusiveNodeHashTable.selectLoopingBackgroundMusic(0, SocialListEntry.sweetsMusicTrack);
                    }
                  }
                } else {
                  IntrusiveNodeHashTable.selectLoopingBackgroundMusic(0, SessionGameApplet.spaceMusicTrack);
                }
              } else {
                IntrusiveNodeHashTable.selectLoopingBackgroundMusic(0, RatingPresentationResources.jewelleryMusicTrack);
              }
            } else {
              IntrusiveNodeHashTable.selectLoopingBackgroundMusic(0, sunMusicTrack);
            }
          } else {
            IntrusiveNodeHashTable.selectLoopingBackgroundMusic(0, GameAudioState.germsMusicTrack);
          }
        } else {
          IntrusiveNodeHashTable.selectLoopingBackgroundMusic(0, DialWidget.bakingMusicTrack);
        }
    }

    final static Object wrapByteStorage(int storageGuard, byte[] sourceBytes, boolean copySmallArrays) {
        DirectByteStorage directStorage = null;
        RuntimeException storageFailure = null;
        Object guardRejectedResult = null;
        Object nullBytesResult = null;
        DirectByteStorage directStorageResult = null;
        byte[] aliasedBytesResult = null;
        byte[] copiedBytesResult = null;
        RuntimeException storageFailureForDiagnostic = null;
        StringBuilder storageFailureDiagnostic = null;
        String sourceDiagnostic = null;
        RuntimeException caughtStorageFailure = null;
        try {
          if (storageGuard > -102) {
            guardRejectedResult = (Object) null;
            return guardRejectedResult;
          }
          if (sourceBytes == null) {
            nullBytesResult = null;
            return nullBytesResult;
          }
          if (sourceBytes.length > 136) {
            directStorage = new DirectByteStorage();
            ((ByteStorage) ((Object) directStorage)).initializeStorage(sourceBytes, true);
            directStorageResult = directStorage;
            return directStorageResult;
          }
          if (copySmallArrays) {
            copiedBytesResult = TextPairLoginPayload.copyBytesWithDestinationOffset(sourceBytes, 0);
            return copiedBytesResult;
          }
          aliasedBytesResult = (byte[]) (sourceBytes);
          return aliasedBytesResult;
        } catch (java.lang.RuntimeException byteStorageFailure) {
          caughtStorageFailure = byteStorageFailure;
          storageFailure = caughtStorageFailure;
          storageFailureForDiagnostic = storageFailure;
          storageFailureDiagnostic = new StringBuilder().append("hf.BA(").append(storageGuard).append(',');
          if (sourceBytes == null) {
            sourceDiagnostic = "null";
          } else {
            sourceDiagnostic = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) storageFailureForDiagnostic), ((StringBuilder) (Object) storageFailureDiagnostic).append(sourceDiagnostic).append(',').append(copySmallArrays).append(')').toString());
        }
    }

    final void unlinkNode(boolean methodGuard) {
        if (methodGuard) {
            return;
        }
        if (null == this.previousNode) {
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
          ClientTimingSupport.decodedSpriteCount = spriteDataBufferAlias.readUnsignedShortBE(readGuard);
          DualLinkNode.decodedSpriteWidths = new int[ClientTimingSupport.decodedSpriteCount];
          ProgressBarWidget.decodedSpriteHeights = new int[ClientTimingSupport.decodedSpriteCount];
          DialogLayer.decodedSpriteHasNonOpaqueAlpha = new boolean[ClientTimingSupport.decodedSpriteCount];
          HotspotTextWidget.decodedSpriteAlpha = new byte[ClientTimingSupport.decodedSpriteCount][];
          GameplaySession.decodedSpriteXOffsets = new int[ClientTimingSupport.decodedSpriteCount];
          TextConcatenationSupport.decodedSpriteIndices = new byte[ClientTimingSupport.decodedSpriteCount][];
          GmtTimestampSupport.decodedSpriteYOffsets = new int[ClientTimingSupport.decodedSpriteCount];
          spriteDataBufferAlias.position = -7 + spriteBytes.length - ClientTimingSupport.decodedSpriteCount * 8;
          GameplaySetupSupport.decodedSpriteCanvasWidth = spriteDataBufferAlias.readUnsignedShortBE(true);
          FadingDialog.decodedSpriteCanvasHeight = spriteDataBufferAlias.readUnsignedShortBE(true);
          paletteSize = (255 & spriteDataBufferAlias.readUnsignedByte((byte) 34)) + 1;
          for (spriteIndex = 0; spriteIndex < ClientTimingSupport.decodedSpriteCount; spriteIndex++) {
            GameplaySession.decodedSpriteXOffsets[spriteIndex] = spriteDataBuffer.readUnsignedShortBE(readGuard);
          }
          for (spriteIndex = 0; spriteIndex < ClientTimingSupport.decodedSpriteCount; spriteIndex++) {
            GmtTimestampSupport.decodedSpriteYOffsets[spriteIndex] = spriteDataBuffer.readUnsignedShortBE(true);
          }
          for (spriteIndex = 0; ClientTimingSupport.decodedSpriteCount > spriteIndex; spriteIndex++) {
            DualLinkNode.decodedSpriteWidths[spriteIndex] = spriteDataBuffer.readUnsignedShortBE(true);
          }
          for (spriteIndex = 0; spriteIndex < ClientTimingSupport.decodedSpriteCount; spriteIndex++) {
            ProgressBarWidget.decodedSpriteHeights[spriteIndex] = spriteDataBuffer.readUnsignedShortBE(true);
          }
          spriteDataBufferAlias.position = -(paletteSize * 3) + 3 - 8 * ClientTimingSupport.decodedSpriteCount - 7 + spriteBytes.length;
          NanoFrameTimer.decodedSpritePalette = new int[paletteSize];
          for (spriteIndex = 1; spriteIndex < paletteSize; spriteIndex++) {
            NanoFrameTimer.decodedSpritePalette[spriteIndex] = spriteDataBuffer.readUnsignedMediumBE(108);
            if (NanoFrameTimer.decodedSpritePalette[spriteIndex] == 0) {
              NanoFrameTimer.decodedSpritePalette[spriteIndex] = 1;
            }
          }
          spriteDataBufferAlias.position = 0;
          for (spriteIndex = 0; spriteIndex < ClientTimingSupport.decodedSpriteCount; spriteIndex++) {
            spriteWidth = DualLinkNode.decodedSpriteWidths[spriteIndex];
            spriteHeight = ProgressBarWidget.decodedSpriteHeights[spriteIndex];
            pixelCount = spriteWidth * spriteHeight;
            allocatedPaletteIndices = new byte[pixelCount];
            paletteIndicesForwarded = allocatedPaletteIndices;
            paletteIndicesForUpdates = paletteIndicesForwarded;
            TextConcatenationSupport.decodedSpriteIndices[spriteIndex] = allocatedPaletteIndices;
            allocatedAlphaPlane = new byte[pixelCount];
            alphaPlaneForwarded = allocatedAlphaPlane;
            alphaPlaneForUpdates = alphaPlaneForwarded;
            HotspotTextWidget.decodedSpriteAlpha[spriteIndex] = allocatedAlphaPlane;
            hasNonOpaqueAlphaFlag = 0;
            storageFlags = spriteDataBufferAlias.readUnsignedByte((byte) 34);
            if ((storageFlags & 1) == 0) {
              for (pixelIndexOrColumn = 0; pixelIndexOrColumn < pixelCount; pixelIndexOrColumn++) {
                paletteIndicesForUpdates[pixelIndexOrColumn] = spriteDataBuffer.readSignedByte((byte) 90);
              }
              if ((storageFlags & 2) != 0) {
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
              if (0 != (2 & storageFlags)) {
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
          decodeFailureBeforeDescription = decodeFailureForContext;
          decodeMessagePrefix = new StringBuilder().append("hf.W(").append(readGuard).append(',');
          if (spriteBytes == null) {
            spriteBytesDescription = "null";
          } else {
            spriteBytesDescription = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) decodeFailureBeforeDescription), ((StringBuilder) (Object) decodeMessagePrefix).append(spriteBytesDescription).append(')').toString());
        }
    }

    public static void releaseNodeResources(byte methodGuard) {
        loginMessage3Text = null;
        int guardResidue = -121 / ((-68 - methodGuard) / 42);
        sunMusicTrack = null;
    }

    final boolean isLinked(int methodGuard) {
        if (null == this.previousNode) {
            return false;
        }
        if (methodGuard < 112) {
            IntrusiveNode.releaseNodeResources((byte) 110);
        }
        return true;
    }

    static {
        loginMessage3Text = "Connection timed out. Please try using a different server.";
    }
}
