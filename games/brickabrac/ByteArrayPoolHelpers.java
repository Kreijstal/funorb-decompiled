/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteArrayPoolHelpers {
    static DraggableWidget draggedWidget;
    static String field_e;
    static String field_b;
    static int field_a;
    static String receivedChatText;

    public static void a(boolean param0) {
        field_b = null;
        receivedChatText = null;
        field_e = null;
        if (param0) {
          receivedChatText = (String) null;
          draggedWidget = null;
          return;
        }
        draggedWidget = null;
    }

    final static java.awt.Canvas getActiveCanvas(byte obfuscationGuard) {
        int unusedGuardQuotient = -97 / ((obfuscationGuard - 81) / 36);
        return null == GameplayRenderHelpers.fullscreenCanvas ? CacheIoRequest.windowCanvas : (java.awt.Canvas) ((Object) GameplayRenderHelpers.fullscreenCanvas);
    }

    final synchronized static byte[] acquireByteArray(int length, byte obfuscationGuard) {
        int mediumPoolIndex = 0;
        int customPoolIndex = 0;
        byte[][] customBucket = null;
        int largePoolIndex = 0;
        int customPoolIndexAfterLargeMiss = 0;
        byte[][] customBucketAfterLargeMiss = null;
        int smallPoolIndex = 0;
        int largePoolIndexAfterSmallMiss = 0;
        int customPoolIndexAfterSmallMiss = 0;
        byte[][] customBucketAfterSmallMiss = null;
        int mediumPoolIndexAfterSmallMiss = 0;
        int customPoolIndexAfterMediumMiss = 0;
        byte[][] customBucketAfterMediumMiss = null;
        int largePoolIndexAfterMediumMiss = 0;
        int customPoolIndexAfterLargeFallback = 0;
        byte[][] customBucketAfterLargeFallback = null;
        byte[] mediumBuffer;
        int customSizeIndex;
        byte[] customBuffer;
        int customSizeIndexAfterSmallMiss;
        int customSizeIndexAfterMediumMiss;
        int customSizeIndexAfterLargeFallback;
        int customSizeIndexAfterLargeMiss;
        byte[] smallBuffer;
        byte[] largeBufferAfterSmallMiss;
        byte[] mediumBufferAfterSmallMiss;
        byte[] largeBufferAfterMediumMiss;
        byte[] customBufferAfterSmallMiss;
        byte[] customBufferAfterMediumMiss;
        byte[] customBufferAfterLargeFallback;
        byte[] largeBuffer;
        byte[] customBufferAfterLargeMiss;
        if (100 != length) {
          if (length == 5000 &&
            LevelDecoder.bytePool5000Count > 0) {
            mediumPoolIndex = LevelDecoder.bytePool5000Count - 1;
            LevelDecoder.bytePool5000Count = LevelDecoder.bytePool5000Count - 1;
            mediumBuffer = ArchiveNetworkRequest.bytePool5000[mediumPoolIndex];
            ArchiveNetworkRequest.bytePool5000[LevelDecoder.bytePool5000Count] = null;
            return mediumBuffer;
          }
          if (length != 30000) {
            if (obfuscationGuard < 99) {
              return (byte[]) null;
            }
            if (GameRenderAudioHelpers.customBytePools != null) {
              for (customSizeIndex = 0; MultiplayerExitScreen.customBytePoolSizes.length > customSizeIndex; customSizeIndex++) {
                if (MultiplayerExitScreen.customBytePoolSizes[customSizeIndex] == length &&
                  MusicVoiceMixer.customBytePoolCounts[customSizeIndex] > 0) {
                  customPoolIndex = MusicVoiceMixer.customBytePoolCounts[customSizeIndex] - 1;
                  customBucket = GameRenderAudioHelpers.customBytePools[customSizeIndex];
                  MusicVoiceMixer.customBytePoolCounts[customSizeIndex] = customPoolIndex;
                  customBuffer = customBucket[customPoolIndex];
                  GameRenderAudioHelpers.customBytePools[customSizeIndex][MusicVoiceMixer.customBytePoolCounts[customSizeIndex]] = null;
                  return customBuffer;
                }
              }
            }
            return new byte[length];
          }
          if (EmailAvailabilityRequest.bytePool30000Count > 0) {
            largePoolIndex = EmailAvailabilityRequest.bytePool30000Count - 1;
            EmailAvailabilityRequest.bytePool30000Count = EmailAvailabilityRequest.bytePool30000Count - 1;
            largeBuffer = IntrusiveHashTable.bytePool30000[largePoolIndex];
            IntrusiveHashTable.bytePool30000[EmailAvailabilityRequest.bytePool30000Count] = null;
            return largeBuffer;
          }
          if (obfuscationGuard < 99) {
            return (byte[]) null;
          }
          if (GameRenderAudioHelpers.customBytePools != null) {
            for (customSizeIndexAfterLargeMiss = 0; MultiplayerExitScreen.customBytePoolSizes.length > customSizeIndexAfterLargeMiss; customSizeIndexAfterLargeMiss++) {
              if (MultiplayerExitScreen.customBytePoolSizes[customSizeIndexAfterLargeMiss] == length &&
                MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterLargeMiss] > 0) {
                customPoolIndexAfterLargeMiss = MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterLargeMiss] - 1;
                customBucketAfterLargeMiss = GameRenderAudioHelpers.customBytePools[customSizeIndexAfterLargeMiss];
                MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterLargeMiss] = customPoolIndexAfterLargeMiss;
                customBufferAfterLargeMiss = customBucketAfterLargeMiss[customPoolIndexAfterLargeMiss];
                GameRenderAudioHelpers.customBytePools[customSizeIndexAfterLargeMiss][MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterLargeMiss]] = null;
                return customBufferAfterLargeMiss;
              }
            }
          }
          return new byte[length];
        }
        if (Under13RegistrationNoticePanel.bytePool100Count > 0) {
          smallPoolIndex = Under13RegistrationNoticePanel.bytePool100Count - 1;
          Under13RegistrationNoticePanel.bytePool100Count = Under13RegistrationNoticePanel.bytePool100Count - 1;
          smallBuffer = cf.bytePool100[smallPoolIndex];
          cf.bytePool100[Under13RegistrationNoticePanel.bytePool100Count] = null;
          return smallBuffer;
        }
        if (length != 5000) {
          if (length == 30000 &&
            EmailAvailabilityRequest.bytePool30000Count > 0) {
            largePoolIndexAfterSmallMiss = EmailAvailabilityRequest.bytePool30000Count - 1;
            EmailAvailabilityRequest.bytePool30000Count = EmailAvailabilityRequest.bytePool30000Count - 1;
            largeBufferAfterSmallMiss = IntrusiveHashTable.bytePool30000[largePoolIndexAfterSmallMiss];
            IntrusiveHashTable.bytePool30000[EmailAvailabilityRequest.bytePool30000Count] = null;
            return largeBufferAfterSmallMiss;
          }
          if (obfuscationGuard < 99) {
            return (byte[]) null;
          }
          if (GameRenderAudioHelpers.customBytePools == null) {
            return new byte[length];
          }
          for (customSizeIndexAfterSmallMiss = 0; MultiplayerExitScreen.customBytePoolSizes.length > customSizeIndexAfterSmallMiss; customSizeIndexAfterSmallMiss++) {
            if (MultiplayerExitScreen.customBytePoolSizes[customSizeIndexAfterSmallMiss] == length &&
              MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterSmallMiss] > 0) {
              customPoolIndexAfterSmallMiss = MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterSmallMiss] - 1;
              customBucketAfterSmallMiss = GameRenderAudioHelpers.customBytePools[customSizeIndexAfterSmallMiss];
              MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterSmallMiss] = customPoolIndexAfterSmallMiss;
              customBufferAfterSmallMiss = customBucketAfterSmallMiss[customPoolIndexAfterSmallMiss];
              GameRenderAudioHelpers.customBytePools[customSizeIndexAfterSmallMiss][MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterSmallMiss]] = null;
              return customBufferAfterSmallMiss;
            }
          }
          return new byte[length];
        }
        if (LevelDecoder.bytePool5000Count > 0) {
          mediumPoolIndexAfterSmallMiss = LevelDecoder.bytePool5000Count - 1;
          LevelDecoder.bytePool5000Count = LevelDecoder.bytePool5000Count - 1;
          mediumBufferAfterSmallMiss = ArchiveNetworkRequest.bytePool5000[mediumPoolIndexAfterSmallMiss];
          ArchiveNetworkRequest.bytePool5000[LevelDecoder.bytePool5000Count] = null;
          return mediumBufferAfterSmallMiss;
        }
        if (length != 30000) {
          if (obfuscationGuard < 99) {
            return (byte[]) null;
          }
          if (GameRenderAudioHelpers.customBytePools == null) {
            return new byte[length];
          }
          for (customSizeIndexAfterMediumMiss = 0; MultiplayerExitScreen.customBytePoolSizes.length > customSizeIndexAfterMediumMiss; customSizeIndexAfterMediumMiss++) {
            if (MultiplayerExitScreen.customBytePoolSizes[customSizeIndexAfterMediumMiss] == length &&
              MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterMediumMiss] > 0) {
              customPoolIndexAfterMediumMiss = MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterMediumMiss] - 1;
              customBucketAfterMediumMiss = GameRenderAudioHelpers.customBytePools[customSizeIndexAfterMediumMiss];
              MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterMediumMiss] = customPoolIndexAfterMediumMiss;
              customBufferAfterMediumMiss = customBucketAfterMediumMiss[customPoolIndexAfterMediumMiss];
              GameRenderAudioHelpers.customBytePools[customSizeIndexAfterMediumMiss][MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterMediumMiss]] = null;
              return customBufferAfterMediumMiss;
            }
          }
          return new byte[length];
        }
        if (EmailAvailabilityRequest.bytePool30000Count > 0) {
          largePoolIndexAfterMediumMiss = EmailAvailabilityRequest.bytePool30000Count - 1;
          EmailAvailabilityRequest.bytePool30000Count = EmailAvailabilityRequest.bytePool30000Count - 1;
          largeBufferAfterMediumMiss = IntrusiveHashTable.bytePool30000[largePoolIndexAfterMediumMiss];
          IntrusiveHashTable.bytePool30000[EmailAvailabilityRequest.bytePool30000Count] = null;
          return largeBufferAfterMediumMiss;
        }
        if (obfuscationGuard < 99) {
          return (byte[]) null;
        }
        if (GameRenderAudioHelpers.customBytePools == null) {
          return new byte[length];
        }
        for (customSizeIndexAfterLargeFallback = 0; MultiplayerExitScreen.customBytePoolSizes.length > customSizeIndexAfterLargeFallback; customSizeIndexAfterLargeFallback++) {
          if (MultiplayerExitScreen.customBytePoolSizes[customSizeIndexAfterLargeFallback] == length &&
            MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterLargeFallback] > 0) {
            customPoolIndexAfterLargeFallback = MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterLargeFallback] - 1;
            customBucketAfterLargeFallback = GameRenderAudioHelpers.customBytePools[customSizeIndexAfterLargeFallback];
            MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterLargeFallback] = customPoolIndexAfterLargeFallback;
            customBufferAfterLargeFallback = customBucketAfterLargeFallback[customPoolIndexAfterLargeFallback];
            GameRenderAudioHelpers.customBytePools[customSizeIndexAfterLargeFallback][MusicVoiceMixer.customBytePoolCounts[customSizeIndexAfterLargeFallback]] = null;
            return customBufferAfterLargeFallback;
          }
        }
        return new byte[length];
    }

    static {
        field_e = "Error connecting to server. Please try using a different server.";
    }
}
